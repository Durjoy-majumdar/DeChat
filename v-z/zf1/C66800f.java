package zf1;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPickerDataReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C87412m;
import kj2.C61103a;
import o40.C61926c;
import z04.C112551y;

/* renamed from: zf1.f */
public final class C66800f {

    /* renamed from: a */
    public static final C66800f f191913a = new C66800f();

    /* renamed from: b */
    public static String f191914b = "";

    /* renamed from: c */
    public static long f191915c = 0;

    /* renamed from: d */
    public static long f191916d = 0;

    /* renamed from: e */
    public static String f191917e = "";

    /* renamed from: a */
    public final String mo90793a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 10000 ? "" : "search_icon" : "post_tab" : "like_tab" : "fav_tab" : "rec_tab" : "follow_tab";
    }

    /* renamed from: b */
    public final long mo90794b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 4;
        }
        if (i != 5) {
            return i != 10000 ? 0 : 6;
        }
        return 5;
    }

    /* renamed from: c */
    public final void mo90795c(long j) {
        FinderPickerDataReportStruct finderPickerDataReportStruct = new FinderPickerDataReportStruct();
        finderPickerDataReportStruct.mo76266t(f191914b);
        finderPickerDataReportStruct.f155760e = f191915c;
        finderPickerDataReportStruct.f155761f = 2;
        finderPickerDataReportStruct.mo76265s("prev_done");
        finderPickerDataReportStruct.f155763h = f191916d;
        finderPickerDataReportStruct.mo76268v("{\"feedid\":\"" + C61926c.m72691p(j) + "\"}");
        finderPickerDataReportStruct.mo76267u(String.valueOf(C31543z5.m39453c()));
        finderPickerDataReportStruct.mo86054n();
        mo90800h(finderPickerDataReportStruct);
    }

    /* renamed from: d */
    public final void mo90796d(long j, int i, int i2, String str) {
        C87412m.m108594g(str, "keyword");
        FinderPickerDataReportStruct finderPickerDataReportStruct = new FinderPickerDataReportStruct();
        finderPickerDataReportStruct.mo76266t(f191914b);
        finderPickerDataReportStruct.f155760e = f191915c;
        finderPickerDataReportStruct.f155761f = 4;
        finderPickerDataReportStruct.mo76265s("feed_exposure");
        finderPickerDataReportStruct.f155763h = mo90794b(i);
        if (i2 > 0) {
            finderPickerDataReportStruct.mo76268v("{\"feedid\":\"" + C61926c.m72691p(j) + "\";\"feed_position\":\"" + i2 + "\";\"keyword\":\"" + str + "\"}");
        } else {
            finderPickerDataReportStruct.mo76268v("{\"feedid\":\"" + C61926c.m72691p(j) + "\"}");
        }
        finderPickerDataReportStruct.mo76267u(String.valueOf(C31543z5.m39453c()));
        finderPickerDataReportStruct.mo86054n();
        mo90800h(finderPickerDataReportStruct);
    }

    /* renamed from: e */
    public final void mo90797e(long j) {
        FinderPickerDataReportStruct finderPickerDataReportStruct = new FinderPickerDataReportStruct();
        finderPickerDataReportStruct.mo76266t(f191914b);
        finderPickerDataReportStruct.f155760e = f191915c;
        finderPickerDataReportStruct.f155761f = 2;
        finderPickerDataReportStruct.mo76265s("prev_return");
        finderPickerDataReportStruct.f155763h = f191916d;
        finderPickerDataReportStruct.mo76268v("{\"feedid\":\"" + C61926c.m72691p(j) + "\"}");
        finderPickerDataReportStruct.mo76267u(String.valueOf(C31543z5.m39453c()));
        finderPickerDataReportStruct.mo86054n();
        mo90800h(finderPickerDataReportStruct);
    }

    /* renamed from: f */
    public final void mo90798f(long j) {
        FinderPickerDataReportStruct finderPickerDataReportStruct = new FinderPickerDataReportStruct();
        finderPickerDataReportStruct.mo76266t(f191914b);
        finderPickerDataReportStruct.f155760e = f191915c;
        finderPickerDataReportStruct.f155761f = 2;
        finderPickerDataReportStruct.mo76265s("prev_done");
        finderPickerDataReportStruct.f155763h = 6;
        finderPickerDataReportStruct.mo76268v("{\"feedid\":\"" + C61926c.m72691p(j) + "\";\"keyword\":\"" + f191917e + "\"}");
        finderPickerDataReportStruct.mo76267u(String.valueOf(C31543z5.m39453c()));
        finderPickerDataReportStruct.mo86054n();
        mo90800h(finderPickerDataReportStruct);
    }

    /* renamed from: g */
    public final void mo90799g(long j) {
        FinderPickerDataReportStruct finderPickerDataReportStruct = new FinderPickerDataReportStruct();
        finderPickerDataReportStruct.mo76266t(f191914b);
        finderPickerDataReportStruct.f155760e = f191915c;
        finderPickerDataReportStruct.f155761f = 2;
        finderPickerDataReportStruct.mo76265s("prev_return");
        finderPickerDataReportStruct.f155763h = 6;
        finderPickerDataReportStruct.mo76268v("{\"feedid\":\"" + C61926c.m72691p(j) + "\";\"keyword\":\"" + f191917e + "\"}");
        finderPickerDataReportStruct.mo76267u(String.valueOf(C31543z5.m39453c()));
        finderPickerDataReportStruct.mo86054n();
        mo90800h(finderPickerDataReportStruct);
    }

    /* renamed from: h */
    public final void mo90800h(C61103a aVar) {
        C87412m.m108594g(aVar, "struct");
        StringBuilder sb = new StringBuilder();
        sb.append("report");
        sb.append(aVar.mo1004j());
        sb.append(' ');
        String q = aVar.mo1006q();
        C87412m.m108593f(q, "struct.toShowString()");
        sb.append(C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
        Log.m105924i("FinderGalleryReportLogic", sb.toString());
    }
}
