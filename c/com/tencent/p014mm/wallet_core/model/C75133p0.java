package com.tencent.p014mm.wallet_core.model;

import java.util.UUID;

/* renamed from: com.tencent.mm.wallet_core.model.p0 */
public class C75133p0 {

    /* renamed from: a */
    public static boolean f221064a = false;

    /* renamed from: b */
    public static int f221065b = -1;

    /* renamed from: c */
    public static String f221066c = "";

    /* renamed from: a */
    public static void m90117a() {
        f221064a = false;
        f221065b = -1;
        f221066c = "";
    }

    /* renamed from: b */
    public static void m90118b(int i) {
        if (!f221064a) {
            f221064a = true;
            f221065b = i;
            f221066c = UUID.randomUUID().toString();
        }
    }
}
