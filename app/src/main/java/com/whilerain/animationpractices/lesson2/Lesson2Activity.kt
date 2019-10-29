package com.whilerain.animationpractices.lesson2import android.os.Bundleimport android.support.v4.app.Fragmentimport android.support.v4.app.FragmentManagerimport android.support.v4.app.FragmentStatePagerAdapterimport android.support.v4.view.ViewPagerimport android.support.v7.app.AppCompatActivityimport com.whilerain.animationpractices.Rimport java.util.ArrayListclass Lesson2Activity : AppCompatActivity() {    internal var pager: ViewPager? = null    override fun onCreate(savedInstanceState: Bundle?) {        super.onCreate(savedInstanceState)        setContentView(R.layout.activity_lesson2)        pager = findViewById(R.id.pager)        pager?.adapter = IntroSlidePagerAdapter(supportFragmentManager)        pager?.setPageTransformer(false, MyPageTransormer())    }    /**     * Adapter for the view pager     */    private inner class IntroSlidePagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {        internal var intros: MutableList<Fragment> = ArrayList()        init {            intros.add(Intro1Fragment())            intros.add(Intro2Fragment())            intros.add(Intro3Fragment())            intros.add(Intro4Fragment())            intros.add(GrantGpsFragment())        }        override fun getItem(i: Int): Fragment {            return intros[i]        }        override fun getCount(): Int {            return intros.size        }    }}