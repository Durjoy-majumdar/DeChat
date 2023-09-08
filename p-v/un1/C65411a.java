package un1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderFeedDataStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveAudienceCommodityLogStruct;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import te3.C64388g93;
import z04.C112551y;

/* renamed from: un1.a */
public final class C65411a extends UIComponent {

    /* renamed from: d */
    public final String f188248d = "Finder.FinderLiveOrderReportUIC";

    /* renamed from: e */
    public C64388g93 f188249e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65411a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c3 */
    public final void mo89492c3(String str, Map<String, String> map) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10 = "";
        C87412m.m108594g(str, "event");
        C87412m.m108594g(map, "map");
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str11 : map.keySet()) {
                String str12 = map.get(str11);
                if (str12 == null) {
                    str12 = str10;
                }
                jSONObject.put(str11, str12);
            }
        } catch (Throwable unused) {
        }
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        LiveAudienceCommodityLogStruct liveAudienceCommodityLogStruct = new LiveAudienceCommodityLogStruct();
        C64388g93 g932 = this.f188249e;
        if (g932 == null || (str2 = g932.f183282d) == null) {
            str2 = str10;
        }
        boolean z = true;
        liveAudienceCommodityLogStruct.f156354d = liveAudienceCommodityLogStruct.mo86045b("LiveID", str2, true);
        C64388g93 g933 = this.f188249e;
        if (g933 == null || (str3 = g933.f183283e) == null) {
            str3 = str10;
        }
        liveAudienceCommodityLogStruct.f156355e = liveAudienceCommodityLogStruct.mo86045b("FeedID", str3, true);
        C64388g93 g934 = this.f188249e;
        if (g934 == null || (str4 = g934.f183284f) == null) {
            str4 = str10;
        }
        liveAudienceCommodityLogStruct.f156356f = liveAudienceCommodityLogStruct.mo86045b("UserName", str4, true);
        C64388g93 g935 = this.f188249e;
        if (g935 == null || (str5 = g935.f183285g) == null) {
            str5 = str10;
        }
        liveAudienceCommodityLogStruct.f156357g = liveAudienceCommodityLogStruct.mo86045b("SessionID", str5, true);
        C64388g93 g936 = this.f188249e;
        if (g936 == null || (str6 = g936.f183286h) == null) {
            str6 = str10;
        }
        liveAudienceCommodityLogStruct.f156358h = liveAudienceCommodityLogStruct.mo86045b("CommentScene", str6, true);
        C64388g93 g937 = this.f188249e;
        if (g937 == null || (str7 = g937.f183287i) == null) {
            str7 = str10;
        }
        liveAudienceCommodityLogStruct.f156359i = liveAudienceCommodityLogStruct.mo86045b("ContextId", str7, true);
        C64388g93 g938 = this.f188249e;
        if (g938 == null || (str8 = g938.f183288j) == null) {
            str8 = str10;
        }
        liveAudienceCommodityLogStruct.f156360j = liveAudienceCommodityLogStruct.mo86045b("SessionBuffer", str8, true);
        C64388g93 g939 = this.f188249e;
        liveAudienceCommodityLogStruct.f156361k = g939 != null ? g939.f183289n : 0;
        if (!(g939 == null || (str9 = g939.f183290o) == null)) {
            str10 = str9;
        }
        liveAudienceCommodityLogStruct.f156362l = liveAudienceCommodityLogStruct.mo86045b("chnl_extra", str10, true);
        liveAudienceCommodityLogStruct.mo76270s(str);
        liveAudienceCommodityLogStruct.mo76271t(C112551y.m153814n(jSONObject2, ",", ";", false));
        liveAudienceCommodityLogStruct.mo86054n();
        if (liveAudienceCommodityLogStruct instanceof FinderFeedDataStruct) {
            FinderFeedDataStruct finderFeedDataStruct = (FinderFeedDataStruct) liveAudienceCommodityLogStruct;
            String str13 = finderFeedDataStruct.f155238k;
            try {
                FinderFeedDataStruct finderFeedDataStruct2 = (FinderFeedDataStruct) liveAudienceCommodityLogStruct;
                String str14 = ((FinderFeedDataStruct) liveAudienceCommodityLogStruct).f155238k;
                if (str14 != null) {
                    if (str14.length() != 0) {
                        z = false;
                    }
                }
                finderFeedDataStruct2.mo76252s(!z ? "..." : str13);
                String str15 = this.f188248d;
                StringBuilder sb = new StringBuilder();
                sb.append("report");
                FinderFeedDataStruct finderFeedDataStruct3 = (FinderFeedDataStruct) liveAudienceCommodityLogStruct;
                sb.append(18054);
                sb.append(' ');
                String q = liveAudienceCommodityLogStruct.mo1006q();
                C87412m.m108593f(q, "struct.toShowString()");
                sb.append(C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
                Log.m105924i(str15, sb.toString());
                finderFeedDataStruct.mo76252s(str13);
            } catch (Throwable th) {
                finderFeedDataStruct.mo76252s(str13);
                throw th;
            }
        } else {
            String str16 = this.f188248d;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("report");
            sb4.append(23782);
            sb4.append(' ');
            String q2 = liveAudienceCommodityLogStruct.mo1006q();
            C87412m.m108593f(q2, "struct.toShowString()");
            sb4.append(C112551y.m153814n(q2, APLogFileUtil.SEPARATOR_LINE, " ", false));
            Log.m105924i(str16, sb4.toString());
        }
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        C64388g93 g932 = new C64388g93();
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("ORDER_REPORT_STRUCT");
        if (byteArrayExtra != null) {
            try {
                g932.parseFrom(byteArrayExtra);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
            }
            this.f188249e = g932;
        }
        g932 = null;
        this.f188249e = g932;
    }
}
