package com.tencent.p014mm.vfs;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import gy3.C87412m;
import java.util.HashMap;

/* renamed from: com.tencent.mm.vfs.y1 */
public final class C116343y1 implements C75061i {

    /* renamed from: a */
    public static final C116343y1 f349133a = new C116343y1();

    /* renamed from: b */
    public static final boolean f349134b = MMApplicationContext.isMainProcess();

    /* renamed from: c */
    public static final HashMap<String, C116339x> f349135c = new HashMap<>();

    /* renamed from: d */
    public static String[] f349136d = new String[0];

    /* renamed from: a */
    public final String mo177858a(String str) {
        C87412m.m108594g(str, "fsName");
        C116339x xVar = f349135c.get(str);
        if (xVar == null) {
            return null;
        }
        if (xVar.f349121b == null) {
            xVar.f349121b = xVar.f349120a.mo177821a(C116281f0.C116289i.f348994a.mo177791d());
        }
        return xVar.f349121b;
    }
}
