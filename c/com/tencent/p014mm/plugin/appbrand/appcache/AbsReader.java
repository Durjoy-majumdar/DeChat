package com.tencent.p014mm.plugin.appbrand.appcache;

import android.text.TextUtils;
import c30.C104289g;
import c30.C79923f;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import java.io.InputStream;
import java.util.Objects;
import js0.C88016e;
import p252vb.C14423a;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.AbsReader */
public abstract class AbsReader implements ICommLibReader {

    /* renamed from: d */
    public volatile String f238546d;

    /* renamed from: e */
    public volatile String f238547e;

    /* renamed from: f */
    public volatile String f238548f;

    /* renamed from: g */
    public volatile C104289g f238549g;

    /* renamed from: h */
    public volatile C14423a f238550h;

    /* renamed from: M */
    public final String mo113367M() {
        mo113377i();
        return Util.nullAsNil(this.f238548f);
    }

    /* renamed from: S */
    public final int compareTo(ICommLibReader iCommLibReader) {
        if (iCommLibReader == null) {
            return -1;
        }
        if (iCommLibReader.getClass() == getClass() && iCommLibReader.mo113371a() > 0 && iCommLibReader.mo113371a() == mo113371a()) {
            return 0;
        }
        return mo113367M().compareTo(iCommLibReader.mo113367M());
    }

    public final String Yk0(String str) {
        C104289g m;
        if (!TextUtils.isEmpty(str) && (m = mo113375f0().optJSONObject("features")) != null) {
            return m.optString(str, (String) null);
        }
        return null;
    }

    /* renamed from: Z */
    public final synchronized C14423a mo113370Z() {
        if (this.f238550h == null) {
            this.f238550h = C14423a.C14425b.m13714a(Yk0("expt"));
            if (this.f238550h == null) {
                this.f238550h = new C14423a((C8480h) null);
            }
        }
        return this.f238550h;
    }

    /* renamed from: a */
    public final int mo113371a() {
        return mo113379c().pkgVersion();
    }

    /* renamed from: b */
    public final String mo113372b(String str) {
        InputStream openRead = openRead(str);
        if (openRead == null) {
            return null;
        }
        long currentTicks = Util.currentTicks();
        String d = C88016e.m109547d(openRead);
        Util.qualityClose(openRead);
        Log.m105927v("MicroMsg.AppBrand.AbsReader", "readAsString(%s), cost %dms", str, Long.valueOf(Util.currentTicks() - currentTicks));
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && compareTo((ICommLibReader) obj) == 0;
    }

    /* renamed from: f0 */
    public final C104289g mo113375f0() {
        if (this.f238549g == null) {
            synchronized (this) {
                if (this.f238549g == null) {
                    String b = mo113372b("WAVersion.json");
                    if (TextUtils.isEmpty(b)) {
                        Log.m105921e("MicroMsg.AppBrand.AbsReader", "getVersionMetaJson EMPTY WAVersion.json, info=%s", mo113379c());
                    }
                    try {
                        this.f238549g = TextUtils.isEmpty(b) ? new C104289g() : new C104289g(b);
                    } catch (C79923f e) {
                        Log.printErrStackTrace("MicroMsg.AppBrand.AbsReader", e, "parse WAVersion.json[%s] ", b);
                        return new C104289g();
                    }
                }
            }
        }
        return this.f238549g;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(mo113371a()), mo113367M()});
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo113377i() {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.AppBrand.AbsReader"
            java.lang.String r1 = ""
            java.lang.String r2 = r10.f238546d
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0058
            r2 = 1
            r3 = 2
            r4 = 0
            c30.g r5 = r10.mo113375f0()     // Catch:{ Exception -> 0x0032 }
            java.lang.String r6 = "version"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r7 = "updateTime"
            java.lang.String r5 = r5.getString(r7)     // Catch:{ Exception -> 0x002f }
            java.lang.String r7 = "AbsReader version parsed wx.version[%s | %s]"
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x002d }
            r8[r4] = r6     // Catch:{ Exception -> 0x002d }
            r8[r2] = r5     // Catch:{ Exception -> 0x002d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r7, r8)     // Catch:{ Exception -> 0x002d }
            goto L_0x003c
        L_0x002d:
            r7 = move-exception
            goto L_0x0035
        L_0x002f:
            r7 = move-exception
            r5 = r1
            goto L_0x0035
        L_0x0032:
            r7 = move-exception
            r5 = r1
            r6 = r5
        L_0x0035:
            java.lang.Object[] r8 = new java.lang.Object[r4]
            java.lang.String r9 = "get WAVersion.json failed."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r7, r9, r8)
        L_0x003c:
            if (r6 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = r6
        L_0x0040:
            r10.f238546d = r1
            r10.f238547e = r5
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r3 = r10.f238546d
            r1[r4] = r3
            java.lang.String r3 = r10.f238547e
            r1[r2] = r3
            java.lang.String r2 = "%s (%s)"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            r10.f238548f = r0
        L_0x0058:
            java.lang.String r0 = r10.f238546d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appcache.AbsReader.mo113377i():java.lang.String");
    }

    /* renamed from: ld */
    public final String mo113378ld() {
        mo113377i();
        return this.f238547e;
    }
}
