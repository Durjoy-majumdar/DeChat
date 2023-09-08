package ha0;

import com.google.protobuf.C23922p0;
import com.google.protobuf.C55062b2;
import com.tencent.maas.MJMaasCore;
import com.tencent.maas.analytics.MJAnalyticsEvent;
import com.tencent.maas.analytics.MJAnalyticsS12;
import com.tencent.p014mm.autogen.mmdata.rpt.MaaSEventReportStruct;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ja0.C108679b;
import ja0.C60781a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C36907w;
import z04.C112551y;

/* renamed from: ha0.y */
public final class C108237y implements MJMaasCore.AnalyticsListener {

    /* renamed from: a */
    public static final C108237y f324093a = new C108237y();

    public final void onEvent(MJAnalyticsEvent mJAnalyticsEvent) {
        ByteBuffer pBData;
        MJAnalyticsS12.MJAnalyticsEvent mJAnalyticsEvent2;
        if (mJAnalyticsEvent != null && (pBData = mJAnalyticsEvent.getPBData()) != null) {
            try {
                mJAnalyticsEvent2 = MJAnalyticsS12.MJAnalyticsEvent.parseFrom(pBData);
            } catch (C23922p0 e) {
                Log.printErrStackTrace("MaasReport24945", e, "pb error", new Object[0]);
                mJAnalyticsEvent2 = null;
            }
            if (mJAnalyticsEvent2 != null) {
                MaaSEventReportStruct maaSEventReportStruct = new MaaSEventReportStruct();
                maaSEventReportStruct.f310187d = maaSEventReportStruct.mo86045b("sessionKey", C60781a.f173118a, true);
                maaSEventReportStruct.f310188e = C60781a.f173119b;
                maaSEventReportStruct.f310189f = mJAnalyticsEvent.getEventType().getValue() + 1;
                maaSEventReportStruct.f310190g = maaSEventReportStruct.mo86045b("maasVersionCode", "1011000", true);
                String name = mJAnalyticsEvent2.getName();
                C87412m.m108593f(name, "it.name");
                maaSEventReportStruct.f310191h = maaSEventReportStruct.mo86045b("maasEventName", C112551y.m153814n(name, ",", ";", false), true);
                String errorCode = mJAnalyticsEvent2.getErrorCode();
                C87412m.m108593f(errorCode, "it.errorCode");
                maaSEventReportStruct.f310192i = maaSEventReportStruct.mo86045b("maasEventCode", C112551y.m153814n(errorCode, ",", ";", false), true);
                String errorMessage = mJAnalyticsEvent2.getErrorMessage();
                C87412m.m108593f(errorMessage, "it.errorMessage");
                maaSEventReportStruct.f310193j = maaSEventReportStruct.mo86045b("maasEventMessage", C112551y.m153814n(errorMessage, ",", ";", false), true);
                C55062b2<String> expandsList = mJAnalyticsEvent2.getExpandsList();
                C87412m.m108593f(expandsList, "it.expandsList");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(expandsList, 10));
                for (String str : expandsList) {
                    C87412m.m108593f(str, LocaleUtil.ITALIAN);
                    arrayList.add(C112551y.m153814n(str, ",", ";", false));
                }
                String str2 = (String) C110818d0.m150917O(arrayList, 0);
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                maaSEventReportStruct.f310194k = maaSEventReportStruct.mo86045b("maasExpand1", str2, true);
                String str4 = (String) C110818d0.m150917O(arrayList, 1);
                if (str4 == null) {
                    str4 = str3;
                }
                maaSEventReportStruct.f310195l = maaSEventReportStruct.mo86045b("maasExpand2", str4, true);
                String str5 = (String) C110818d0.m150917O(arrayList, 2);
                if (str5 == null) {
                    str5 = str3;
                }
                maaSEventReportStruct.f310196m = maaSEventReportStruct.mo86045b("maasExpand3", str5, true);
                String str6 = (String) C110818d0.m150917O(arrayList, 3);
                if (str6 == null) {
                    str6 = str3;
                }
                maaSEventReportStruct.f310197n = maaSEventReportStruct.mo86045b("maasExpand4", str6, true);
                String str7 = (String) C110818d0.m150917O(arrayList, 4);
                if (str7 == null) {
                    str7 = str3;
                }
                maaSEventReportStruct.f310198o = maaSEventReportStruct.mo86045b("maasExpand5", str7, true);
                String str8 = (String) C110818d0.m150917O(arrayList, 5);
                if (str8 == null) {
                    str8 = str3;
                }
                maaSEventReportStruct.f310199p = maaSEventReportStruct.mo86045b("maasExpand6", str8, true);
                String str9 = (String) C110818d0.m150917O(arrayList, 6);
                if (str9 == null) {
                    str9 = str3;
                }
                maaSEventReportStruct.f310200q = maaSEventReportStruct.mo86045b("maasExpand7", str9, true);
                String str10 = (String) C110818d0.m150917O(arrayList, 7);
                if (str10 == null) {
                    str10 = str3;
                }
                maaSEventReportStruct.f310201r = maaSEventReportStruct.mo86045b("maasExpand8", str10, true);
                String str11 = (String) C110818d0.m150917O(arrayList, 8);
                if (str11 == null) {
                    str11 = str3;
                }
                maaSEventReportStruct.f310202s = maaSEventReportStruct.mo86045b("maasExpand9", str11, true);
                String str12 = (String) C110818d0.m150917O(arrayList, 9);
                if (str12 != null) {
                    str3 = str12;
                }
                maaSEventReportStruct.f310203t = maaSEventReportStruct.mo86045b("maasExpand10", str3, true);
                JSONObject jSONObject = new JSONObject();
                C55062b2 keysList = mJAnalyticsEvent2.getKeysList();
                C87412m.m108593f(keysList, "it.keysList");
                C55062b2 valuesList = mJAnalyticsEvent2.getValuesList();
                C87412m.m108593f(valuesList, "it.valuesList");
                Iterator it = ((ArrayList) C110818d0.m150908F0(keysList, valuesList)).iterator();
                while (it.hasNext()) {
                    C13604l lVar = (C13604l) it.next();
                    jSONObject.put((String) lVar.f38555d, lVar.f38556e);
                }
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
                maaSEventReportStruct.f310204u = maaSEventReportStruct.mo86045b("maasNamed", C112551y.m153814n(jSONObject2, ",", ";", false), true);
                maaSEventReportStruct.f310209z = mJAnalyticsEvent2.getTimeStamp();
                long j = C108679b.f325465b;
                C108679b.f325465b = 1 + j;
                maaSEventReportStruct.f310208y = j;
                maaSEventReportStruct.mo86054n();
            }
        }
    }
}
