package com.tencent.p014mm.plugin.p081mv.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCreateActionStruct;
import gy3.C87412m;
import hb2.C59811e;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.mv.model.MvCreateReportHelper */
public final class MvCreateReportHelper {

    /* renamed from: a */
    public static final MvCreateReportHelper f163005a = new MvCreateReportHelper();

    /* renamed from: b */
    public static MvCreateActionStruct f163006b = new MvCreateActionStruct();

    /* renamed from: c */
    public static int f163007c;

    /* renamed from: d */
    public static int f163008d;

    /* renamed from: e */
    public static final Map<Long, MvCreateActionStruct> f163009e = new LinkedHashMap();

    static {
        new MvCreateReportHelper$finderPostFinishListener$1(C40008f.f107254d).alive();
    }

    /* renamed from: a */
    public final void mo80350a(int i, int i2) {
        MvCreateActionStruct c = mo80352c();
        c.f156552k = 6;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('#');
        sb.append(i2);
        c.f156541E = c.mo86045b("MaterialCount", sb.toString(), true);
        c.mo86054n();
        c.mo86056r();
    }

    /* renamed from: b */
    public final void mo80351b(int i, C59811e eVar) {
        C87412m.m108594g(eVar, "data");
        MvCreateActionStruct c = mo80352c();
        c.f156559r = c.mo86045b("FeedId", eVar.mo84760a(), true);
        c.f156560s = c.mo86045b("FinderUin", eVar.mo84761b(), true);
        int i2 = f163007c;
        if (!(i2 == 1 || i2 == 2)) {
            c.f156563v = (long) f163008d;
        }
        c.f156565x = (long) i;
        c.f156566y = (long) i2;
        c.f156537A = eVar.mo84763f();
        c.f156552k = 2;
        c.f156544H = 1;
        c.mo86054n();
        c.mo86056r();
    }

    /* renamed from: c */
    public final MvCreateActionStruct mo80352c() {
        return new MvCreateActionStruct(f163006b.mo1005p());
    }
}
