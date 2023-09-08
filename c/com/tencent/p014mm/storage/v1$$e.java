package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.storage.v1$$e */
public class v1$$e {

    /* renamed from: a */
    public final int f249905a;

    /* renamed from: b */
    public final String f249906b;

    public v1$$e(int i, String str) {
        this.f249905a = i;
        this.f249906b = str;
    }

    /* renamed from: a */
    public static v1$$e m106018a(Object obj) {
        int i;
        if (obj instanceof Integer) {
            i = 1;
        } else if (obj instanceof Long) {
            i = 2;
        } else if (obj instanceof String) {
            i = 3;
        } else if (obj instanceof Boolean) {
            i = 4;
        } else if (obj instanceof Float) {
            i = 5;
        } else if (obj instanceof Double) {
            i = 6;
        } else {
            Log.m105920e("MicroMsg.ConfigStorage", "unresolve failed, unknown type=" + obj.getClass().toString());
            return null;
        }
        return new v1$$e(i, obj.toString());
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof v1$$e)) {
            return false;
        }
        v1$$e v1__e = (v1$$e) obj;
        if (this.f249905a != v1__e.f249905a) {
            return false;
        }
        String str = this.f249906b;
        return str == null ? v1__e.f249906b == null : str.equals(v1__e.f249906b);
    }
}
