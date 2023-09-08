package p420ur;

import com.tencent.p014mm.autogen.mmdata.rpt.SearchStaytimeReportStruct;
import u73.C22613h1;

/* renamed from: ur.n$$a */
public final /* synthetic */ class n$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f73543d;

    /* renamed from: e */
    public final /* synthetic */ String f73544e;

    /* renamed from: f */
    public final /* synthetic */ String f73545f;

    /* renamed from: g */
    public final /* synthetic */ int f73546g;

    /* renamed from: h */
    public final /* synthetic */ String f73547h;

    /* renamed from: i */
    public final /* synthetic */ String f73548i;

    /* renamed from: j */
    public final /* synthetic */ long f73549j;

    /* renamed from: n */
    public final /* synthetic */ int f73550n;

    /* renamed from: o */
    public final /* synthetic */ String f73551o;

    /* renamed from: p */
    public final /* synthetic */ long f73552p;

    public /* synthetic */ n$$a(String str, String str2, String str3, int i, String str4, String str5, long j, int i2, String str6, long j2) {
        this.f73543d = str;
        this.f73544e = str2;
        this.f73545f = str3;
        this.f73546g = i;
        this.f73547h = str4;
        this.f73548i = str5;
        this.f73549j = j;
        this.f73550n = i2;
        this.f73551o = str6;
        this.f73552p = j2;
    }

    public final void run() {
        String str = this.f73543d;
        String str2 = this.f73544e;
        String str3 = this.f73545f;
        int i = this.f73546g;
        String str4 = this.f73547h;
        String str5 = this.f73548i;
        long j = this.f73549j;
        int i2 = this.f73550n;
        String str6 = this.f73551o;
        long j2 = this.f73552p;
        SearchStaytimeReportStruct searchStaytimeReportStruct = new SearchStaytimeReportStruct();
        searchStaytimeReportStruct.f69596d = searchStaytimeReportStruct.mo86045b("Query", str, true);
        searchStaytimeReportStruct.f69605m = searchStaytimeReportStruct.mo86045b("SessionID", str2, true);
        searchStaytimeReportStruct.f69597e = searchStaytimeReportStruct.mo86045b("SearchId", str3, true);
        searchStaytimeReportStruct.f69598f = (long) i;
        searchStaytimeReportStruct.f69599g = searchStaytimeReportStruct.mo86045b("ParentSearchId", str4, true);
        searchStaytimeReportStruct.f69606n = searchStaytimeReportStruct.mo86045b("RequestId", str5, true);
        searchStaytimeReportStruct.f69600h = j;
        searchStaytimeReportStruct.f69601i = (long) i2;
        searchStaytimeReportStruct.f69602j = System.currentTimeMillis();
        searchStaytimeReportStruct.f69603k = searchStaytimeReportStruct.mo86045b("ExtInfo", str6, true);
        searchStaytimeReportStruct.f69604l = j2;
        searchStaytimeReportStruct.mo86054n();
        C22613h1.m26490p(searchStaytimeReportStruct);
    }
}
