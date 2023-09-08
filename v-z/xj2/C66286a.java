package xj2;

import com.tencent.p014mm.autogen.mmdata.rpt.RingToneHomePageActionReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.RingToneSetSceneReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.RingtoneEntranceExposureReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.ring_history_logStruct;
import gy3.C87412m;

/* renamed from: xj2.a */
public final class C66286a {
    /* renamed from: a */
    public static final void m78214a(long j, String str, long j2) {
        C87412m.m108594g(str, "feedId");
        ring_history_logStruct ring_history_logstruct = new ring_history_logStruct();
        ring_history_logstruct.f156980d = j;
        ring_history_logstruct.f156981e = ring_history_logstruct.mo86045b("feedid", str, true);
        ring_history_logstruct.f156982f = j2;
        ring_history_logstruct.mo86054n();
    }

    /* renamed from: b */
    public static final void m78215b(long j, String str, int i, String str2, boolean z, boolean z2) {
        C87412m.m108594g(str, "feedId");
        RingToneHomePageActionReportStruct ringToneHomePageActionReportStruct = new RingToneHomePageActionReportStruct();
        ringToneHomePageActionReportStruct.f156790d = j;
        ringToneHomePageActionReportStruct.f156791e = ringToneHomePageActionReportStruct.mo86045b("feedid", str, true);
        ringToneHomePageActionReportStruct.f156792f = (long) i;
        ringToneHomePageActionReportStruct.f156793g = ringToneHomePageActionReportStruct.mo86045b("tousername", str2, true);
        long j2 = 1;
        ringToneHomePageActionReportStruct.f156795i = z ? 1 : 2;
        if (!z2) {
            j2 = 2;
        }
        ringToneHomePageActionReportStruct.f156796j = j2;
        ringToneHomePageActionReportStruct.mo86054n();
    }

    /* renamed from: c */
    public static /* synthetic */ void m78216c(long j, String str, int i, String str2, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        m78215b(j, str, i, str2, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2);
    }

    /* renamed from: d */
    public static final void m78217d(String str, long j, long j2, long j3, int i, String str2, boolean z, boolean z2, String str3, boolean z3, boolean z4, String str4, boolean z5) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        C87412m.m108594g(str, "feedId");
        C87412m.m108594g(str6, "username");
        C87412m.m108594g(str7, "toUserName");
        C87412m.m108594g(str8, "recRequestId");
        RingToneSetSceneReportStruct ringToneSetSceneReportStruct = new RingToneSetSceneReportStruct();
        ringToneSetSceneReportStruct.f156797d = ringToneSetSceneReportStruct.mo86045b("feedid", str, true);
        ringToneSetSceneReportStruct.f156798e = j;
        ringToneSetSceneReportStruct.f156799f = j2;
        ringToneSetSceneReportStruct.f156800g = j3;
        ringToneSetSceneReportStruct.f156801h = ringToneSetSceneReportStruct.mo86045b("username", str6, true);
        ringToneSetSceneReportStruct.f156802i = (long) i;
        long j4 = 1;
        ringToneSetSceneReportStruct.f156803j = z ? 1 : 2;
        ringToneSetSceneReportStruct.f156804k = z2 ? 1 : 2;
        ringToneSetSceneReportStruct.f156805l = ringToneSetSceneReportStruct.mo86045b("toUserName", str7, true);
        ringToneSetSceneReportStruct.f156806m = !z3 ? 1 : 2;
        ringToneSetSceneReportStruct.f156807n = z4 ? 1 : 2;
        ringToneSetSceneReportStruct.f156808o = ringToneSetSceneReportStruct.mo86045b("rec_request_id", str8, true);
        if (z5) {
            j4 = 2;
        }
        ringToneSetSceneReportStruct.f156809p = j4;
        ringToneSetSceneReportStruct.mo86054n();
    }

    /* renamed from: e */
    public static /* synthetic */ void m78218e(String str, long j, long j2, long j3, int i, String str2, boolean z, boolean z2, String str3, boolean z3, boolean z4, String str4, boolean z5, int i2, Object obj) {
        int i3 = i2;
        m78217d(str, j, j2, j3, i, (i3 & 32) != 0 ? "" : str2, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? false : z2, (i3 & 256) != 0 ? "" : str3, (i3 & 512) != 0 ? false : z3, (i3 & 1024) != 0 ? false : z4, (i3 & 2048) != 0 ? "" : str4, (i3 & 4096) != 0 ? false : z5);
    }

    /* renamed from: f */
    public static final void m78219f(int i, int i2, String str, String str2, String str3) {
        C87412m.m108594g(str, "wording");
        C87412m.m108594g(str2, "username");
        C87412m.m108594g(str3, "feedId");
        RingtoneEntranceExposureReportStruct ringtoneEntranceExposureReportStruct = new RingtoneEntranceExposureReportStruct();
        ringtoneEntranceExposureReportStruct.f156811e = (long) i2;
        ringtoneEntranceExposureReportStruct.f156812f = ringtoneEntranceExposureReportStruct.mo86045b("wording", str, true);
        ringtoneEntranceExposureReportStruct.f156810d = (long) i;
        ringtoneEntranceExposureReportStruct.f156814h = ringtoneEntranceExposureReportStruct.mo86045b("UserName", str2, true);
        ringtoneEntranceExposureReportStruct.f156813g = ringtoneEntranceExposureReportStruct.mo86045b("feedid", str3, true);
        ringtoneEntranceExposureReportStruct.mo86054n();
    }
}
