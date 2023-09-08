package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import java.util.Arrays;

/* renamed from: com.tencent.mapsdk.internal.ed */
public final class C113665ed extends JsonComposer {
    @Json(name = "layerid")

    /* renamed from: a */
    public String f340082a;
    @Json(name = "type")

    /* renamed from: b */
    public int f340083b;
    @Json(name = "local_data_ver")

    /* renamed from: c */
    public int f340084c;
    @Json(name = "local_cfg_ver")

    /* renamed from: d */
    public int f340085d;
    @Json(ignore = true)

    /* renamed from: e */
    public String f340086e;
    @Json(name = "data_ver")

    /* renamed from: f */
    private String f340087f;
    @Json(name = "cfg_ver")

    /* renamed from: g */
    private String f340088g;
    @Json(name = "params")

    /* renamed from: h */
    private String[] f340089h;
    @Json(name = "url")

    /* renamed from: i */
    private String f340090i;

    /* renamed from: a */
    private void m156663a(int i) {
        if (i != this.f340084c) {
            this.f340086e = null;
        }
        this.f340084c = i;
    }

    /* renamed from: b */
    private String m156664b() {
        return this.f340082a;
    }

    /* renamed from: c */
    private String m156666c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f340084c);
        return sb.toString();
    }

    /* renamed from: d */
    private String m156667d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f340085d);
        return sb.toString();
    }

    /* renamed from: e */
    private boolean m156668e() {
        String str = this.f340087f;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f340084c);
        if (!str.equals(sb.toString())) {
            return true;
        }
        String str2 = this.f340088g;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f340085d);
        return !str2.equals(sb4.toString());
    }

    /* renamed from: f */
    private C113646dz m156669f() {
        return C113646dz.m156618a(this.f340083b);
    }

    public final String toString() {
        return "DataLayer{layerId='" + this.f340082a + '\'' + ", layerType='" + this.f340083b + '\'' + ", remoteDataVersion='" + this.f340087f + '\'' + ", dataVersion=" + this.f340084c + ", remoteStyleVersion='" + this.f340088g + '\'' + ", styleVersion=" + this.f340085d + ", params=" + Arrays.toString(this.f340089h) + ", dataUrl='" + this.f340090i + '\'' + ", decodeDataUrl='" + this.f340086e + '\'' + '}';
    }

    /* renamed from: b */
    private void m156665b(int i) {
        if (i != this.f340085d) {
            this.f340086e = null;
        }
        this.f340085d = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0033  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo171992a() {
        /*
            r8 = this;
            java.lang.String r0 = r8.f340087f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r8.f340084c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r8.f340088g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r8.f340085d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r0 = 0
            goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            if (r0 == 0) goto L_0x0056
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r8.f340085d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r8.f340088g = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r8.f340084c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r8.f340087f = r0
            r0 = 0
            r8.f340086e = r0
        L_0x0056:
            java.lang.String[] r0 = r8.f340089h
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = r8.f340086e
            if (r0 != 0) goto L_0x0099
            java.lang.String r0 = r8.f340090i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0099
            java.lang.String r0 = r8.f340090i
            r8.f340086e = r0
            java.lang.String[] r0 = r8.f340089h
            int r2 = r0.length
        L_0x006d:
            if (r1 >= r2) goto L_0x0099
            r3 = r0[r1]
            java.lang.Object r4 = r8.getFieldValueByJsonName(r3)     // Catch:{ IllegalAccessException -> 0x0096 }
            boolean r5 = r4 instanceof java.lang.String     // Catch:{ IllegalAccessException -> 0x0096 }
            if (r5 == 0) goto L_0x0096
            java.lang.String r5 = r8.f340086e     // Catch:{ IllegalAccessException -> 0x0096 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IllegalAccessException -> 0x0096 }
            java.lang.String r7 = "\\{"
            r6.<init>(r7)     // Catch:{ IllegalAccessException -> 0x0096 }
            r6.append(r3)     // Catch:{ IllegalAccessException -> 0x0096 }
            java.lang.String r3 = "\\}"
            r6.append(r3)     // Catch:{ IllegalAccessException -> 0x0096 }
            java.lang.String r3 = r6.toString()     // Catch:{ IllegalAccessException -> 0x0096 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IllegalAccessException -> 0x0096 }
            java.lang.String r3 = r5.replaceAll(r3, r4)     // Catch:{ IllegalAccessException -> 0x0096 }
            r8.f340086e = r3     // Catch:{ IllegalAccessException -> 0x0096 }
        L_0x0096:
            int r1 = r1 + 1
            goto L_0x006d
        L_0x0099:
            java.lang.String r0 = r8.f340086e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113665ed.mo171992a():java.lang.String");
    }
}
