package com.tencent.rtmp.p899ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.tencent.rtmp.ui.DashBoard */
public class DashBoard extends LinearLayout {

    /* renamed from: a */
    public final StringBuilder f320085a;

    /* renamed from: b */
    public TextView f320086b;

    /* renamed from: c */
    public TextView f320087c;

    /* renamed from: d */
    private final SimpleDateFormat f320088d;

    /* renamed from: e */
    private ScrollView f320089e;

    /* renamed from: f */
    private int f320090f;

    /* renamed from: g */
    private boolean f320091g;

    public DashBoard(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo155403a(int i, int i2, int i3, int i4) {
        TextView textView = this.f320086b;
        if (textView != null) {
            textView.setPadding(i, i2, i3, 0);
        }
        ScrollView scrollView = this.f320089e;
        if (scrollView != null) {
            scrollView.setPadding(i, 0, i3, i4);
        }
    }

    public void setEventTextSize(float f) {
        TextView textView = this.f320087c;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    public void setMessageMaxLength(int i) {
        this.f320090f = i;
    }

    public void setShowLevel(int i) {
        if (i == 0) {
            TextView textView = this.f320086b;
            if (textView != null) {
                textView.setVisibility(4);
            }
            ScrollView scrollView = this.f320089e;
            if (scrollView != null) {
                scrollView.setVisibility(4);
            }
            setVisibility(4);
        } else if (i != 1) {
            m144629a();
            this.f320086b.setVisibility(0);
            this.f320089e.setVisibility(0);
            setVisibility(0);
        } else {
            m144629a();
            this.f320086b.setVisibility(0);
            this.f320089e.setVisibility(4);
            setVisibility(0);
        }
    }

    public void setStatusText(CharSequence charSequence) {
        TextView textView = this.f320086b;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setStatusTextSize(float f) {
        TextView textView = this.f320086b;
        if (textView != null) {
            textView.setTextSize(f);
        }
    }

    public DashBoard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f320085a = new StringBuilder();
        this.f320088d = new SimpleDateFormat("HH:mm:ss.SSS", Locale.ENGLISH);
        this.f320090f = 3000;
        this.f320091g = false;
        setOrientation(1);
        setVisibility(8);
    }

    /* renamed from: a */
    private void m144629a() {
        if (this.f320086b == null) {
            this.f320086b = new TextView(getContext());
            this.f320087c = new TextView(getContext());
            this.f320089e = new ScrollView(getContext());
            this.f320086b.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f320086b.setTextColor(-49023);
            this.f320086b.setTypeface(Typeface.MONOSPACE);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            this.f320089e.setPadding(0, 10, 0, 0);
            this.f320089e.setLayoutParams(layoutParams);
            this.f320089e.setVerticalScrollBarEnabled(true);
            this.f320089e.setScrollbarFadingEnabled(true);
            this.f320087c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f320087c.setTextColor(-49023);
            this.f320089e.addView(this.f320087c);
            addView(this.f320086b);
            addView(this.f320089e);
            if (this.f320085a.length() <= 0) {
                this.f320085a.append("liteav sdk version:\n");
            }
            this.f320087c.setText(this.f320085a.toString());
        }
    }
}
