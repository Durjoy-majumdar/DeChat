package com.tencent.p014mm.plugin.magicbrush;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82366d;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import e42.C7594e;
import gy3.C87412m;
import java.util.HashSet;

/* renamed from: com.tencent.mm.plugin.magicbrush.q0 */
public final class C85280q0 {
    /* renamed from: a */
    public static final <T extends C7594e> MBBuildConfig<T> m105250a(MBBuildConfig<T> mBBuildConfig, String str) {
        C87412m.m108594g(mBBuildConfig, "<this>");
        C87412m.m108594g(str, "clsName");
        if (BuildInfo.DEBUG) {
            mBBuildConfig.f248369e.contains(str);
            Object newInstance = Class.forName(str).newInstance();
            if (!(newInstance instanceof C82016a0) && !(newInstance instanceof C82268c)) {
                boolean z = newInstance instanceof C82366d;
            }
        }
        mBBuildConfig.f248369e.add(str);
        return mBBuildConfig;
    }

    /* renamed from: b */
    public static final <T extends C7594e> MBBuildConfig<T> m105251b(MBBuildConfig<T> mBBuildConfig, HashSet<String> hashSet) {
        C87412m.m108594g(mBBuildConfig, "<this>");
        C87412m.m108594g(hashSet, "clsNames");
        if (BuildInfo.DEBUG) {
            for (String a : hashSet) {
                m105250a(mBBuildConfig, a);
            }
            return mBBuildConfig;
        }
        mBBuildConfig.f248369e.addAll(hashSet);
        return mBBuildConfig;
    }
}
