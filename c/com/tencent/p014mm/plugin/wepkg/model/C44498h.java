package com.tencent.p014mm.plugin.wepkg.model;

import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.wepkg.model.h */
public class C44498h {
    /* renamed from: a */
    public static String m48863a(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        return m48865c() + str + "/";
    }

    /* renamed from: b */
    public static String m48864b(String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return "";
        }
        return m48863a(str) + str2;
    }

    /* renamed from: c */
    public static String m48865c() {
        return C41872f.m45394d() + "wepkg" + "/";
    }
}
