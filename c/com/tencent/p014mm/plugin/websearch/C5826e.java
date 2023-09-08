package com.tencent.p014mm.plugin.websearch;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e00.C7575o0;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C50053jy3;

/* renamed from: com.tencent.mm.plugin.websearch.e */
public class C5826e implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ int f21982d;

    /* renamed from: e */
    public final /* synthetic */ String f21983e;

    /* renamed from: f */
    public final /* synthetic */ String f21984f;

    public C5826e(C96598h hVar, int i, String str, String str2) {
        this.f21982d = i;
        this.f21983e = str;
        this.f21984f = str2;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        if (yVar.getType() != 2608) {
            return 0;
        }
        if (i == 0 && i2 == 0) {
            if (cVar != null) {
                ((C7575o0) C86312j.m106911c(C7575o0.class)).Si0(this.f21982d, this.f21983e, this.f21984f, ((C50053jy3) cVar.f127056b.f127083a).f136467d);
            }
            return 0;
        }
        Log.m105920e("MicroMsg.WebSearch.FTSWebSearchLogic", "getPoiInfo onSceneEnd errType:" + i + " errCode:" + i2 + " will retry");
        return 0;
    }
}
