package com.zhy.csdndemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter
{

	public static final String[] TITLES = new String[] { "12\n业界", "12\n移动", "9\n研发"};//, "程序员杂志", "云计算" };

	public TabAdapter(FragmentManager fm)
	{
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0)
	{
		MainFragment fragment = new MainFragment(arg0);
		return fragment;
	}

	@Override
	public CharSequence getPageTitle(int position)
	{
		return TITLES[position % TITLES.length];
	}

	@Override
	public int getCount()
	{
		return TITLES.length;
	}

}
