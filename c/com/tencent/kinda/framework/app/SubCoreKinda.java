package com.tencent.kinda.framework.app;

import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import di3.C86312j;
import eb0.C86484b;
import ei3.C86522b;
import f40.C86709a0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
public class SubCoreKinda extends C86301e {
    public static final String TAG = "MicroMsg.SubCoreKinda";
    private KindaCacheStg cacheStg;
    private KindaConfigCacheStg configCacheStg;

    public static SubCoreKinda getCore() {
        return (SubCoreKinda) C86312j.m106911c(SubCoreKinda.class);
    }

    public KindaCacheStg getCacheStg() {
        if (C86709a0.m107522a()) {
            if (getCore().cacheStg == null) {
                getCore().cacheStg = new KindaCacheStg(C86709a0.m107535s().f251811i);
            }
            return getCore().cacheStg;
        }
        throw new C86484b();
    }

    public KindaConfigCacheStg getConfigCacheStg() {
        if (C86709a0.m107522a()) {
            if (getCore().configCacheStg == null) {
                getCore().configCacheStg = new KindaConfigCacheStg(C86709a0.m107535s().f251811i);
            }
            return getCore().configCacheStg;
        }
        throw new C86484b();
    }
}
