package com.tencent.p014mm.vfs;

import gy3.C87412m;
import java.util.List;
import java.util.Map;
import rx3.C13604l;

/* renamed from: com.tencent.mm.vfs.c */
public final class C116270c {

    /* renamed from: a */
    public final List<C13604l<String, String>> f348903a;

    /* renamed from: b */
    public final Map<String, String> f348904b;

    public C116270c(List<C13604l<String, String>> list, Map<String, String> map, String str, String str2) {
        C87412m.m108594g(list, "accountPaths");
        C87412m.m108594g(map, "mainMountPoints");
        C87412m.m108594g(str, "myAccount");
        C87412m.m108594g(str2, "myAccountSalt");
        this.f348903a = list;
        this.f348904b = map;
    }
}
