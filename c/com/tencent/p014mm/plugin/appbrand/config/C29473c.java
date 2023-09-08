package com.tencent.p014mm.plugin.appbrand.config;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import fy3.C32226l;
import java.util.LinkedList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.config.c */
public class C29473c implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f80326d;

    public C29473c(AppBrandGlobalSystemConfig.C81613a aVar, LinkedList linkedList) {
        this.f80326d = linkedList;
    }

    public Object invoke(Object obj) {
        this.f80326d.add((String) obj);
        return C13598b0.f38549a;
    }
}
