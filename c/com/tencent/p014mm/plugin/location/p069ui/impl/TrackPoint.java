package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.location_soso.ViewManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.TrackPoint */
public class TrackPoint extends LinearLayout {

    /* renamed from: d */
    public Context f346476d;

    /* renamed from: e */
    public FrameLayout f346477e;

    /* renamed from: f */
    public ImageView f346478f;

    /* renamed from: g */
    public double f346479g = 0.0d;

    /* renamed from: h */
    public String f346480h;

    /* renamed from: i */
    public double f346481i = -1.0d;

    /* renamed from: j */
    public double f346482j = -1.0d;

    /* renamed from: n */
    public double f346483n = -1.0d;

    /* renamed from: o */
    public double f346484o = -1.0d;

    /* renamed from: p */
    public ViewManager f346485p;

    public TrackPoint(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f346476d = context;
        mo175554b(0);
    }

    /* renamed from: a */
    public void mo175553a() {
        this.f346477e.setVisibility(4);
        ViewManager viewManager = this.f346485p;
        if (viewManager != null) {
            viewManager.toggleViewVisible(this.f346477e);
        }
    }

    /* renamed from: b */
    public final void mo175554b(int i) {
        this.f346477e = (FrameLayout) View.inflate(this.f346476d, C0966R.C0971layout.cap, (ViewGroup) null);
        ImageView imageView = new ImageView(this.f346476d);
        this.f346478f = imageView;
        if (i > 0) {
            imageView.setImageResource(i);
        } else {
            imageView.setImageResource(C0966R.C0969drawable.chv);
        }
        this.f346478f.setBackgroundResource(C0966R.C0969drawable.ags);
        this.f346478f.setFocusable(true);
        this.f346478f.setFocusableInTouchMode(true);
    }

    /* renamed from: c */
    public void mo175555c() {
        ViewManager viewManager = this.f346485p;
        if (viewManager != null) {
            viewManager.setMarker2Top(this.f346477e);
            this.f346485p.setMarker2Top(this.f346478f);
        }
    }

    public double getHeading() {
        return this.f346479g;
    }

    public double getLatOffest() {
        return this.f346481i - this.f346483n;
    }

    public double getLongOffset() {
        return this.f346482j - this.f346484o;
    }

    public void setAvatar(String str) {
        if (str.equals(this.f346480h)) {
            Log.m105924i("MicroMsg.TrackPoint", "skip this set avatar");
            return;
        }
        this.f346480h = str;
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5((ImageView) this.f346477e.findViewById(C0966R.C0970id.f5840q2), str);
        ViewManager viewManager = this.f346485p;
        if (viewManager != null) {
            viewManager.updateMarkerView(this.f346477e);
        }
    }

    public void setHeading(double d) {
        this.f346479g = d;
    }

    public void setOnAvatarOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnLocationOnClickListener(View.OnClickListener onClickListener) {
    }

    public TrackPoint(Context context, ViewManager viewManager) {
        super(context);
        this.f346476d = context;
        this.f346485p = viewManager;
        mo175554b(0);
    }

    public TrackPoint(Context context, ViewManager viewManager, int i) {
        super(context);
        this.f346476d = context;
        this.f346485p = viewManager;
        mo175554b(i);
    }
}
