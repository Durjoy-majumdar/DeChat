package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Bundle;
import com.tencent.tencentmap.mapsdk.maps.TencentMapComponent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.bn */
public abstract class C113564bn implements TencentMapComponent.Component {

    /* renamed from: a */
    private final List<C113565bo> f339851a = new ArrayList();

    /* renamed from: b */
    private volatile int f339852b;

    /* renamed from: a */
    public void mo171779a(Context context) {
    }

    /* renamed from: a */
    public synchronized void mo171780a(C113565bo boVar) {
        if (boVar != null) {
            this.f339851a.add(boVar);
        }
    }

    /* renamed from: b */
    public synchronized void mo171783b(C113565bo boVar) {
        if (boVar != null) {
            this.f339851a.remove(boVar);
        }
        if (this.f339851a.size() == 0) {
            mo171784b_();
        } else {
            this.f339852b = this.f339851a.size() - 1;
        }
    }

    /* renamed from: b_ */
    public synchronized void mo171784b_() {
        this.f339851a.clear();
        this.f339852b = 0;
    }

    /* renamed from: c_ */
    public final synchronized C113565bo mo171785c_() {
        if (this.f339852b < 0 || this.f339852b >= this.f339851a.size()) {
            return null;
        }
        return this.f339851a.get(this.f339852b);
    }

    /* renamed from: a */
    public synchronized void mo171781a(C113565bo boVar, Bundle bundle) {
        if (this.f339851a.size() != 0) {
            this.f339852b = this.f339851a.indexOf(boVar);
        }
    }

    /* renamed from: b */
    public final Context mo171782b() {
        C113565bo c_ = mo171785c_();
        if (c_ != null) {
            return c_.getContext();
        }
        return null;
    }
}
