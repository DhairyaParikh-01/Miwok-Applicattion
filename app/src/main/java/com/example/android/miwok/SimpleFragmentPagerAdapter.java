package com.example.android.miwok;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public  class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

   private  Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm)
    {
       super(fm);
       mContext  = context;
    }

    public Fragment getItem(int position)
    {
          if (position == 0)
          {
              return new NumberFragment();
          }
          else  if (position == 1)
          {
              return new FamilyMembersFragment();
          }
          else if(position == 2)
          {
              return new ColorFragment();
          }
          else
          {
              return new PhrasesFragment();
          }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
        {
            return mContext.getString(R.string.category_numbers);
        }
        else if (position == 1)
        {
            return mContext.getString(R.string.category_family);
        }
        else if (position == 2)
        {
            return mContext.getString(R.string.category_colors);
        }
        else
        {
            return mContext.getString(R.string.category_phrases);
        }
     }
  }
