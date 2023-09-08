package com.tencent.tmsqmsp.oaid2;

import android.text.TextUtils;

/* renamed from: com.tencent.tmsqmsp.oaid2.d */
public enum C24302d {
    UNSUPPORT(-1, "unsupport"),
    HUA_WEI(0, "HUAWEI"),
    XIAOMI(1, "Xiaomi"),
    VIVO(2, "vivo"),
    OPPO(3, "oppo"),
    MOTO(4, "motorola"),
    LENOVO(5, "lenovo"),
    ASUS(6, "asus"),
    SAMSUNG(7, "samsung"),
    MEIZU(8, "meizu"),
    ALPS(9, "alps"),
    NUBIA(10, "nubia"),
    ZTE(11, "ZTE"),
    ONEPLUS(12, "OnePlus"),
    BLACKSHARK(13, "blackshark"),
    FREEMEOS(14, "freemeos"),
    SSUIOS(15, "ssui");
    

    /* renamed from: a */
    public String f69805a;

    /* access modifiers changed from: public */
    C24302d(int i, String str) {
        this.f69805a = str;
    }

    /* renamed from: a */
    public static C24302d m30435a(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNSUPPORT;
        }
        for (C24302d dVar : values()) {
            if (dVar.f69805a.equalsIgnoreCase(str)) {
                return dVar;
            }
        }
        return UNSUPPORT;
    }
}
