package com.tencent.mapsdk.internal;

import android.content.Context;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;

/* renamed from: com.tencent.mapsdk.internal.td */
public final class C114336td implements C114009oc {

    /* renamed from: a */
    private Context f342639a;

    /* renamed from: b */
    private final C113959ml f342640b;

    /* renamed from: c */
    private String f342641c;

    public C114336td(Context context, String str) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            this.f342639a = applicationContext;
            this.f342640b = C113959ml.m157965a(applicationContext, (TencentMapOptions) null);
            this.f342641c = str;
            return;
        }
        this.f342640b = null;
    }

    /* renamed from: a */
    public final String mo172564a() {
        C113959ml mlVar = this.f342640b;
        if (mlVar != null) {
            return mlVar.mo172407d();
        }
        return null;
    }

    /* renamed from: b */
    public final String mo172565b() {
        C113959ml mlVar = this.f342640b;
        if (mlVar == null) {
            return null;
        }
        C113886kg.m157518a(mlVar.f340849b);
        return mlVar.f340849b;
    }

    /* renamed from: c */
    public final String mo172566c() {
        C113959ml mlVar = this.f342640b;
        if (mlVar != null) {
            return mlVar.mo172402a(this.f342641c);
        }
        return null;
    }

    /* renamed from: d */
    public final String mo172567d() {
        C113959ml mlVar = this.f342640b;
        if (mlVar != null) {
            return mlVar.mo172406c(this.f342641c);
        }
        return null;
    }

    /* renamed from: e */
    public final String mo172568e() {
        C113959ml mlVar = this.f342640b;
        if (mlVar != null) {
            return mlVar.mo172404b(this.f342641c);
        }
        return null;
    }

    /* renamed from: f */
    public final String mo172569f() {
        return null;
    }

    /* renamed from: g */
    public final String mo172570g() {
        return null;
    }

    /* renamed from: h */
    public final String mo172571h() {
        return null;
    }

    /* renamed from: i */
    public final String mo172572i() {
        C113959ml mlVar = this.f342640b;
        if (mlVar == null) {
            return null;
        }
        C113886kg.m157518a(mlVar.f340850c);
        return mlVar.f340850c;
    }

    /* renamed from: j */
    public final String mo172573j() {
        return null;
    }
}
