package com.tencent.mapsdk.internal;

import android.location.Location;
import com.tencent.tencentmap.mapsdk.maps.LocationSource;
import com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle;

/* renamed from: com.tencent.mapsdk.internal.ac */
public final class C113502ac {

    /* renamed from: a */
    public C113515ai f339642a;

    public C113502ac(C113515ai aiVar) {
        this.f339642a = aiVar;
    }

    /* renamed from: a */
    private void m155532a() {
        if (this.f339642a != null) {
            this.f339642a = null;
        }
    }

    /* renamed from: b */
    private Location m155535b() {
        C113515ai aiVar = this.f339642a;
        if (aiVar != null) {
            return aiVar.mo171273e();
        }
        return null;
    }

    /* renamed from: c */
    private void m155536c() {
        C113515ai aiVar = this.f339642a;
        if (aiVar != null) {
            aiVar.mo171267a();
        }
    }

    /* renamed from: d */
    private void m155537d() {
        C113515ai aiVar = this.f339642a;
        if (aiVar != null) {
            aiVar.mo171270b();
        }
    }

    /* renamed from: e */
    private void m155538e() {
        C113515ai aiVar = this.f339642a;
        if (aiVar != null) {
            aiVar.mo171271c();
        }
    }

    /* renamed from: f */
    private boolean m155539f() {
        C113515ai aiVar = this.f339642a;
        if (aiVar != null) {
            return aiVar.mo171272d();
        }
        return false;
    }

    /* renamed from: a */
    private void m155533a(LocationSource locationSource) {
        C113515ai aiVar = this.f339642a;
        if (aiVar != null) {
            aiVar.mo171268a(locationSource);
        }
    }

    /* renamed from: a */
    private void m155534a(MyLocationStyle myLocationStyle) {
        C113515ai aiVar = this.f339642a;
        if (aiVar != null) {
            aiVar.mo171269a(myLocationStyle);
        }
    }
}
