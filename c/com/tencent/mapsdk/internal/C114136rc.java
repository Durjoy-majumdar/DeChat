package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.CameraPosition;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.rc */
public final class C114136rc implements C113726fk, TencentMap.OnCameraChangeListener {

    /* renamed from: a */
    public C113961mq f341647a;

    /* renamed from: b */
    public C114133rb f341648b = null;

    /* renamed from: c */
    public C113932lh f341649c;

    public C114136rc(C113961mq mqVar, C113932lh lhVar) {
        this.f341647a = mqVar;
        this.f341649c = lhVar;
    }

    /* renamed from: d */
    private void m159283d() {
        C113961mq mqVar = this.f341647a;
        if (mqVar != null) {
            mqVar.f340901i.mo171215a((C113726fk) this);
            if (this.f341648b == null) {
                this.f341648b = new C114133rb(this.f341647a, this.f341649c);
            }
            try {
                this.f341648b.start();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    private void m159284e() {
        mo172758c();
    }

    /* renamed from: a */
    public final void mo172756a() {
        C114133rb rbVar = this.f341648b;
        if (rbVar != null) {
            rbVar.mo172752a();
        }
    }

    /* renamed from: b */
    public final void mo172757b() {
        C114133rb rbVar = this.f341648b;
        if (rbVar != null) {
            rbVar.mo172753b();
            mo171258u();
        }
    }

    /* renamed from: c */
    public final void mo172758c() {
        C113961mq mqVar = this.f341647a;
        if (mqVar != null) {
            mqVar.f340901i.mo171231b((C113726fk) this);
            C114133rb rbVar = this.f341648b;
            if (rbVar != null) {
                rbVar.mo172754c();
                this.f341648b = null;
            }
        }
    }

    public final void onCameraChange(CameraPosition cameraPosition) {
        C114133rb rbVar = this.f341648b;
        if (rbVar != null) {
            synchronized (rbVar) {
                this.f341648b.notify();
            }
        }
    }

    public final void onCameraChangeFinished(CameraPosition cameraPosition) {
    }

    /* renamed from: u */
    public final void mo171258u() {
        C114133rb rbVar = this.f341648b;
        if (rbVar != null) {
            synchronized (rbVar) {
                this.f341648b.notify();
            }
        }
    }

    /* renamed from: a */
    private void m159281a(C114131qz qzVar) {
        List<C114131qz> list;
        C114133rb rbVar = this.f341648b;
        if (rbVar != null && qzVar != null && (list = rbVar.f341638a) != null) {
            list.add(qzVar);
        }
    }

    /* renamed from: b */
    private void m159282b(C114131qz qzVar) {
        List<C114131qz> list;
        C114133rb rbVar = this.f341648b;
        if (rbVar != null && qzVar != null && (list = rbVar.f341638a) != null) {
            list.remove(qzVar);
        }
    }
}
