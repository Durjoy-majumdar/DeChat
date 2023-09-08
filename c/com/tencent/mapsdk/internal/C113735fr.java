package com.tencent.mapsdk.internal;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.tencent.mapsdk.internal.fr */
public final class C113735fr {

    /* renamed from: a */
    public static final int f340238a = 0;

    /* renamed from: b */
    public static final int f340239b = 1;

    /* renamed from: c */
    public int f340240c;

    /* renamed from: d */
    public int f340241d;

    /* renamed from: e */
    public JSONArray f340242e;

    /* renamed from: f */
    public String[] f340243f = new String[0];

    public C113735fr() {
    }

    /* renamed from: c */
    private int m156850c() {
        return this.f340240c;
    }

    /* renamed from: d */
    private int m156851d() {
        return this.f340241d;
    }

    /* renamed from: e */
    private JSONArray m156852e() {
        return this.f340242e;
    }

    /* renamed from: f */
    private String[] m156853f() {
        return this.f340243f;
    }

    /* renamed from: a */
    public final boolean mo172096a() {
        return this.f340240c == 1;
    }

    /* renamed from: b */
    public final boolean mo172097b() {
        return this.f340241d == 1;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("IndoorAuth{");
        stringBuffer.append("mEnabled=");
        stringBuffer.append(this.f340240c);
        stringBuffer.append(", mType=");
        stringBuffer.append(this.f340241d);
        stringBuffer.append(", mBuildingJsonArray=");
        stringBuffer.append(this.f340242e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public C113735fr(int i, int i2, JSONArray jSONArray) {
        int i3 = 0;
        this.f340240c = i;
        this.f340241d = i2;
        this.f340242e = jSONArray;
        if (jSONArray == null) {
            this.f340243f = null;
            return;
        }
        int length = jSONArray.length();
        this.f340243f = new String[length];
        while (i3 < length) {
            try {
                this.f340243f[i3] = this.f340242e.getString(i3);
                i3++;
            } catch (JSONException e) {
                this.f340243f = null;
                C113889km.m157549c(Log.getStackTraceString(e));
                return;
            }
        }
    }
}
