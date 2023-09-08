package b00;

import android.view.View;
import c00.C92329m;
import com.tencent.p014mm.autogen.mmdata.rpt.WCFeedTopicActionReportStruct;
import di3.C86301e;
import ei3.C86522b;
import u73.C22613h1;

@C86522b
/* renamed from: b00.i */
public class C23640i extends C86301e implements C92329m {
    /* renamed from: PZ */
    public void mo37190PZ(View view, int i, int i2, String str, String str2, int i3, String str3, String str4, int i4, String str5, long j) {
        WCFeedTopicActionReportStruct wCFeedTopicActionReportStruct = new WCFeedTopicActionReportStruct();
        wCFeedTopicActionReportStruct.f69632d = (long) i;
        wCFeedTopicActionReportStruct.f69633e = (long) i2;
        wCFeedTopicActionReportStruct.f69634f = wCFeedTopicActionReportStruct.mo86045b("FeedAuthorUsername", str, true);
        wCFeedTopicActionReportStruct.f69635g = wCFeedTopicActionReportStruct.mo86045b("FeedID", str2, true);
        wCFeedTopicActionReportStruct.f69636h = (long) i3;
        wCFeedTopicActionReportStruct.f69637i = wCFeedTopicActionReportStruct.mo86045b("CreatedCommentID", str3, true);
        wCFeedTopicActionReportStruct.f69638j = wCFeedTopicActionReportStruct.mo86045b("SessionID", str4, true);
        wCFeedTopicActionReportStruct.f69639k = (long) i4;
        wCFeedTopicActionReportStruct.f69640l = wCFeedTopicActionReportStruct.mo86045b("QueryKey", str5, true);
        wCFeedTopicActionReportStruct.f69641m = j;
        wCFeedTopicActionReportStruct.mo86054n();
        C22613h1.m26490p(wCFeedTopicActionReportStruct);
    }
}
