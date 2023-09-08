package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;

/* renamed from: com.tencent.mapsdk.internal.rz */
public final class C114194rz extends JsonComposer {

    /* renamed from: i */
    private static final String f341893i = "default";

    /* renamed from: k */
    private static final int f341894k = 0;

    /* renamed from: l */
    private static final int f341895l = 1;
    @Json(name = "rule")

    /* renamed from: a */
    public int f341896a = 0;
    @Json(name = "frontier")

    /* renamed from: b */
    public String f341897b = "default";
    @Json(name = "logo_name")

    /* renamed from: c */
    public String f341898c = "";
    @Json(name = "logo")

    /* renamed from: d */
    public String f341899d = "";
    @Json(name = "logo_night")

    /* renamed from: e */
    public String f341900e;
    @Json(ignore = true)

    /* renamed from: f */
    public Bitmap f341901f;
    @Json(ignore = true)

    /* renamed from: g */
    public Bitmap f341902g;

    /* renamed from: h */
    public boolean f341903h;
    @Json(name = "priority")

    /* renamed from: j */
    private int f341904j = 0;

    /* renamed from: b */
    private boolean m159585b() {
        return this.f341903h;
    }

    /* renamed from: c */
    private void m159587c() {
        this.f341903h = true;
    }

    /* renamed from: d */
    private void m159590d() {
        this.f341896a = 1;
    }

    /* renamed from: e */
    private String m159592e() {
        return this.f341898c;
    }

    /* renamed from: f */
    private String m159593f() {
        return this.f341899d;
    }

    /* renamed from: g */
    private String m159594g() {
        return this.f341900e;
    }

    /* renamed from: a */
    public final int mo172842a() {
        return (this.f341896a * 10) + this.f341904j;
    }

    /* renamed from: b */
    private void m159584b(String str) {
        this.f341898c = str;
    }

    /* renamed from: c */
    private void m159588c(String str) {
        this.f341899d = str;
    }

    /* renamed from: d */
    private void m159591d(String str) {
        this.f341900e = str;
    }

    /* renamed from: a */
    public final boolean mo172844a(C113740fv fvVar) {
        boolean z;
        int i = this.f341896a;
        if (i == 0) {
            z = m159586b(fvVar);
        } else if (i != 1) {
            z = false;
        } else {
            z = m159589c(fvVar);
        }
        if (this.f341903h) {
            return !z;
        }
        return z;
    }

    /* renamed from: b */
    private void m159583b(Bitmap bitmap) {
        this.f341902g = bitmap;
    }

    /* renamed from: c */
    private boolean m159589c(C113740fv fvVar) {
        if ("default".equals(this.f341897b)) {
            return true;
        }
        if (fvVar == null) {
            return false;
        }
        C114181rs.m159508a();
        C113741fw[] c = C114181rs.m159515c(this.f341897b);
        C113741fw[] fwVarArr = fvVar.f340303b;
        if (fwVarArr == null || c == null) {
            return true;
        }
        return C114181rs.m159512a(fwVarArr, c);
    }

    /* renamed from: b */
    private boolean m159586b(C113740fv fvVar) {
        if ("default".equals(this.f341897b)) {
            return true;
        }
        if (fvVar == null) {
            return false;
        }
        C113741fw fwVar = fvVar.f340302a;
        C114181rs.m159508a();
        return C114181rs.m159509a(fwVar, C114181rs.m159515c(this.f341897b));
    }

    /* renamed from: a */
    private void m159580a(int i) {
        this.f341904j = i;
    }

    /* renamed from: a */
    private void m159582a(String str) {
        this.f341897b = str;
    }

    /* renamed from: a */
    public final Bitmap mo172843a(boolean z) {
        return z ? this.f341902g : this.f341901f;
    }

    /* renamed from: a */
    private void m159581a(Bitmap bitmap) {
        this.f341901f = bitmap;
    }
}
