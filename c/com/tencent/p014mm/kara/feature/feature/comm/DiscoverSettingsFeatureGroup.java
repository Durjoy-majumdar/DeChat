package com.tencent.p014mm.kara.feature.feature.comm;

import f30.C86704a;
import o30.C89112b;
import q30.C22065c;
import q30.C22066d;
import q30.C22067e;
import q30.C22068f;
import q30.C22069g;
import q30.C22070h;
import q30.C22071i;
import q30.C22072j;
import q30.C22073k;

/* renamed from: com.tencent.mm.kara.feature.feature.comm.DiscoverSettingsFeatureGroup */
public class DiscoverSettingsFeatureGroup extends C89112b {
    @C86704a
    public int channels;
    @C86704a
    public int games;
    @C86704a
    public int miniPrograms;
    @C86704a
    public int moments;
    @C86704a
    public int nearby;
    @C86704a
    public int scan;
    @C86704a
    public int search;
    @C86704a
    public int shake;
    @C86704a
    public int shopping;
    @C86704a
    public int topStories;

    public void build() {
        super.build();
        C22073k kVar = C22073k.f62453e;
        this.channels = ((Boolean) kVar.mo138469a("getFinder", new C22065c(kVar))).booleanValue() ? 1 : 0;
        this.games = ((Boolean) kVar.mo138469a("getGame", new C22066d(kVar))).booleanValue() ? 1 : 0;
        this.miniPrograms = ((Boolean) kVar.mo138469a("getAppbrand", new C22067e(kVar))).booleanValue() ? 1 : 0;
        this.moments = ((Boolean) kVar.mo138469a("getSns", new C22068f(kVar))).booleanValue() ? 1 : 0;
        this.nearby = 0;
        this.scan = ((Boolean) kVar.mo138469a("getScan", new C22069g(kVar))).booleanValue() ? 1 : 0;
        this.search = ((Boolean) kVar.mo138469a("getSearch", new C22070h(kVar))).booleanValue() ? 1 : 0;
        this.shake = ((Boolean) kVar.mo138469a("getShake", new C22071i(kVar))).booleanValue() ? 1 : 0;
        this.shopping = ((Boolean) kVar.mo138469a("getShopping", new C22072j(kVar))).booleanValue() ? 1 : 0;
        this.topStories = 1;
    }

    public String getName() {
        return "myself_discover";
    }
}
