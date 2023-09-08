package com.tencent.matrix.resource;

import fy3.C32229r;
import gy3.C24565l;
import gy3.C87412m;

/* renamed from: com.tencent.matrix.resource.c */
public final /* synthetic */ class C80525c extends C24565l implements C32229r<String, String, String, Long, Integer> {
    public C80525c(MemoryUtil memoryUtil) {
        super(4, memoryUtil, MemoryUtil.class, "forkAnalyze", "forkAnalyze(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)I", 0);
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        long longValue = ((Number) obj4).longValue();
        C87412m.m108594g(str, "p1");
        C87412m.m108594g(str2, "p2");
        C87412m.m108594g(str3, "p3");
        return Integer.valueOf(((MemoryUtil) this.receiver).forkAnalyze(str, str2, str3, longValue));
    }
}
