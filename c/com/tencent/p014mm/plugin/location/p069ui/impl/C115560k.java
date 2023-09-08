package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.mapsdk.raster.model.LatLng;
import y22.C118910b;
import y22.C118913e;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.k */
public abstract class C115560k extends C118910b {

    /* renamed from: d */
    public Activity f346582d;

    /* renamed from: e */
    public C118913e f346583e;

    /* renamed from: f */
    public int f346584f = 0;

    /* renamed from: g */
    public float f346585g = 0.0f;

    /* renamed from: h */
    public float f346586h = 0.0f;

    public C115560k(Activity activity) {
        this.f346582d = activity;
    }

    /* renamed from: b */
    public boolean mo129376b(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: d */
    public void mo129356d() {
    }

    /* renamed from: g */
    public boolean mo129380g(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: j */
    public View mo175603j(int i) {
        return this.f346582d.findViewById(i);
    }

    /* renamed from: k */
    public Intent mo175604k() {
        return this.f346582d.getIntent();
    }

    /* renamed from: l */
    public abstract void mo175573l(LatLng latLng);

    /* renamed from: m */
    public abstract void mo175574m();
}
