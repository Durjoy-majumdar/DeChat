package com.tencent.p014mm.plugin.location.p069ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import lg3.C76695c;
import x22.C102550b;

/* renamed from: com.tencent.mm.plugin.location.ui.LoaddingView */
public class LoaddingView extends LinearLayout implements C102550b {

    /* renamed from: d */
    public TextView f19870d;

    /* renamed from: e */
    public ProgressBar f19871e;

    /* renamed from: f */
    public Animation f19872f;

    /* renamed from: g */
    public ImageView f19873g;

    /* renamed from: h */
    public boolean f19874h = false;

    /* renamed from: i */
    public String f19875i = "";

    public LoaddingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo5705a(context);
    }

    /* renamed from: a */
    public final void mo5705a(Context context) {
        this.f19872f = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2526ff);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b87, this, true);
        this.f19871e = (ProgressBar) inflate.findViewById(C0966R.C0970id.g4e);
        this.f19870d = (TextView) inflate.findViewById(C0966R.C0970id.g4v);
        this.f19873g = (ImageView) inflate.findViewById(C0966R.C0970id.g46);
        if (C76695c.m92341b()) {
            this.f19873g.setImageResource(C0966R.C0969drawable.c56);
        }
        this.f19870d.setText("");
        this.f19870d.setVisibility(0);
        this.f19871e.setVisibility(0);
    }

    public String getPreText() {
        return this.f19875i;
    }

    public void setPreText(String str) {
        if (!Util.isNullOrNil(str)) {
            this.f19875i = str + "\n";
        }
    }

    public void setProgressAlwaysGone(boolean z) {
        this.f19874h = z;
        this.f19871e.setVisibility(8);
        this.f19870d.setVisibility(8);
    }

    public void setText(String str) {
        if (this.f19870d != null && this.f19871e != null && !this.f19874h) {
            if (!Util.isNullOrNil(str)) {
                TextView textView = this.f19870d;
                textView.setText(str + "");
                this.f19871e.setVisibility(8);
                this.f19870d.setVisibility(0);
                return;
            }
            this.f19870d.setText("");
            this.f19870d.setVisibility(0);
            this.f19871e.setVisibility(0);
        }
    }

    public LoaddingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo5705a(context);
    }
}
