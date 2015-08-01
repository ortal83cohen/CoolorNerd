package com.cohen.ortal.liedetector;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;


public class AppBar extends Toolbar {

    public AppBar(Context context) {
        this(context, null);
    }

    public AppBar(Context context, AttributeSet attrs) {
        this(context, attrs, android.support.v7.appcompat.R.attr.toolbarStyle);
    }

    public AppBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public void setTitle(int resId) {
        super.setTitle(resId);
    }

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }
}
