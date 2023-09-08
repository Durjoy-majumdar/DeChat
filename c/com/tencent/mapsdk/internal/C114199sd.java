package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;

/* renamed from: com.tencent.mapsdk.internal.sd */
public final class C114199sd extends JsonComposer {
    @Json(name = "name")

    /* renamed from: a */
    public String f341919a;
    @Json(name = "style")

    /* renamed from: b */
    public int f341920b;
    @Json(name = "scene")

    /* renamed from: c */
    public int f341921c;
    @Json(name = "version")

    /* renamed from: d */
    public int f341922d;
    @Json(name = "url")

    /* renamed from: e */
    public String f341923e;
    @Json(name = "range")

    /* renamed from: f */
    public int[] f341924f;

    /* renamed from: a */
    private String m159615a() {
        return this.f341919a;
    }

    /* renamed from: b */
    private int m159620b() {
        return this.f341920b;
    }

    /* renamed from: c */
    private int m159623c() {
        return this.f341921c;
    }

    /* renamed from: d */
    private int m159625d() {
        return this.f341922d;
    }

    /* renamed from: e */
    private String m159626e() {
        return this.f341923e;
    }

    /* renamed from: f */
    private int[] m159627f() {
        return this.f341924f;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("WorldMapTileSrc{");
        stringBuffer.append("mName='");
        stringBuffer.append(this.f341919a);
        stringBuffer.append('\'');
        stringBuffer.append(", mStyle=");
        stringBuffer.append(this.f341920b);
        stringBuffer.append(", mScene=");
        stringBuffer.append(this.f341921c);
        stringBuffer.append(", mVersion=");
        stringBuffer.append(this.f341922d);
        stringBuffer.append(", mUrl='");
        stringBuffer.append(this.f341923e);
        stringBuffer.append('\'');
        stringBuffer.append(", mRanges=");
        if (this.f341924f == null) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append('[');
            int i = 0;
            while (i < this.f341924f.length) {
                stringBuffer.append(i == 0 ? "" : ", ");
                stringBuffer.append(this.f341924f[i]);
                i++;
            }
            stringBuffer.append(']');
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private void m159618a(String str) {
        this.f341919a = str;
    }

    /* renamed from: b */
    private void m159621b(int i) {
        this.f341921c = i;
    }

    /* renamed from: c */
    private void m159624c(int i) {
        this.f341922d = i;
    }

    /* renamed from: a */
    private void m159617a(int i) {
        this.f341920b = i;
    }

    /* renamed from: b */
    private void m159622b(String str) {
        this.f341923e = str;
    }

    /* renamed from: a */
    private void m159619a(int[] iArr) {
        this.f341924f = iArr;
    }

    /* renamed from: a */
    private String m159616a(int i, int i2, int i3, String str) {
        String str2;
        String str3 = this.f341923e;
        int[] iArr = this.f341924f;
        if (iArr.length == 0) {
            str2 = str3.replaceFirst("\\{range\\}", "");
        } else {
            str2 = str3.replaceFirst("\\{range\\}", Integer.toString(m159614a(i + i2, iArr.length)));
        }
        return str2.replaceFirst("\\{z\\}", Integer.toString(i3)).replaceFirst("\\{x\\}", Integer.toString(i)).replaceFirst("\\{y\\}", Integer.toString(i2)).replaceFirst("\\{style\\}", Integer.toString(this.f341920b)).replaceFirst("\\{scene\\}", Integer.toString(this.f341921c)).replaceFirst("\\{version\\}", Integer.toString(this.f341922d)).replaceFirst("\\{ch\\}", str);
    }

    /* renamed from: a */
    public static int m159614a(int i, int i2) {
        int i3 = i % i2;
        return i3 * i2 < 0 ? i3 + i2 : i3;
    }
}
