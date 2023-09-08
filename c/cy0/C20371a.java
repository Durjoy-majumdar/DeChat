package cy0;

import com.tencent.p014mm.autogen.mmdata.rpt.BizTLVideoAutoPlayReportStruct;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import java.util.Map;
import p167hz.C8835h;

/* renamed from: cy0.a */
public final class C20371a {

    /* renamed from: a */
    public C19623o0 f57075a;

    /* renamed from: b */
    public long f57076b;

    /* renamed from: c */
    public String f57077c = "";

    /* renamed from: d */
    public String f57078d = "";

    /* renamed from: e */
    public long f57079e;

    /* renamed from: f */
    public long f57080f;

    /* renamed from: g */
    public long f57081g;

    /* renamed from: h */
    public long f57082h;

    /* renamed from: i */
    public long f57083i;

    /* renamed from: j */
    public long f57084j;

    /* renamed from: k */
    public long f57085k;

    /* renamed from: a */
    public final void mo31866a(int i) {
        int i2 = 5;
        int i3 = 0;
        if (i == 1) {
            this.f57080f = this.f57083i - this.f57082h;
        } else if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    this.f57080f = this.f57085k - this.f57084j;
                }
            } else if (this.f57083i != 0) {
                this.f57079e = System.currentTimeMillis() - this.f57083i;
                Map<Long, Integer> map = C20372d.f57086a;
                C20372d.f57087b.put("".length() == 0 ? this.f57078d : "", Long.valueOf(this.f57079e));
            }
        } else if (this.f57083i != 0) {
            this.f57079e = System.currentTimeMillis() - this.f57083i;
            Map<Long, Integer> map2 = C20372d.f57086a;
            C20372d.f57087b.put("".length() == 0 ? this.f57078d : "", Long.valueOf(this.f57079e));
        }
        BizTLVideoAutoPlayReportStruct bizTLVideoAutoPlayReportStruct = new BizTLVideoAutoPlayReportStruct();
        bizTLVideoAutoPlayReportStruct.f48195d = 0;
        bizTLVideoAutoPlayReportStruct.f48196e = bizTLVideoAutoPlayReportStruct.mo86045b("Vid", "", true);
        bizTLVideoAutoPlayReportStruct.f48197f = 0;
        bizTLVideoAutoPlayReportStruct.f48198g = 0;
        bizTLVideoAutoPlayReportStruct.f48208q = bizTLVideoAutoPlayReportStruct.mo86045b("FinderId", this.f57077c, true);
        bizTLVideoAutoPlayReportStruct.f48209r = bizTLVideoAutoPlayReportStruct.mo86045b("FeedId", this.f57078d, true);
        bizTLVideoAutoPlayReportStruct.f48199h = 0;
        Map<Long, Integer> map3 = C20372d.f57086a;
        bizTLVideoAutoPlayReportStruct.f48200i = C20372d.f57089d;
        bizTLVideoAutoPlayReportStruct.f48201j = this.f57076b;
        bizTLVideoAutoPlayReportStruct.f48203l = this.f57079e;
        bizTLVideoAutoPlayReportStruct.f48204m = this.f57081g;
        bizTLVideoAutoPlayReportStruct.f48205n = this.f57080f;
        C19623o0 o0Var = this.f57075a;
        if (o0Var != null && o0Var.field_type == 620757041) {
            i3 = 1;
        }
        bizTLVideoAutoPlayReportStruct.f48207p = i3;
        if (!NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            if (!NetStatusUtil.is2G(MMApplicationContext.getContext())) {
                if (NetStatusUtil.is3G(MMApplicationContext.getContext())) {
                    i2 = 4;
                } else if (NetStatusUtil.is4G(MMApplicationContext.getContext())) {
                    i2 = 3;
                } else if (NetStatusUtil.is5G(MMApplicationContext.getContext())) {
                    i2 = 6;
                } else if (((C8835h) C86312j.m106911c(C8835h.class)).mo9678GQ()) {
                    i2 = 1;
                }
            }
            bizTLVideoAutoPlayReportStruct.f48206o = i2;
            bizTLVideoAutoPlayReportStruct.f48202k = i;
            bizTLVideoAutoPlayReportStruct.mo86054n();
        }
        i2 = 2;
        bizTLVideoAutoPlayReportStruct.f48206o = i2;
        bizTLVideoAutoPlayReportStruct.f48202k = i;
        bizTLVideoAutoPlayReportStruct.mo86054n();
    }
}
