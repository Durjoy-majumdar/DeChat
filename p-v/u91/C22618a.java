package u91;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderUITimeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WaterFallFlowRptStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e91.C116711b;
import gy3.C87412m;
import java.util.Arrays;
import ky2.C10432i;
import lg3.C76695c;
import org.json.JSONObject;
import p217oq.C11716d;
import rx3.C13598b0;
import t91.C64208c;
import v91.C22730d;
import v91.C22733i;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: u91.a */
public final class C22618a {

    /* renamed from: a */
    public static final C22619a f65058a = new C22619a();

    /* renamed from: u91.a$a */
    public static final class C22619a {

        /* renamed from: u91.a$a$a */
        public static final class C22620a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ FinderUITimeStruct f65059d;

            public C22620a(FinderUITimeStruct finderUITimeStruct) {
                this.f65059d = finderUITimeStruct;
            }

            public final void run() {
                this.f65059d.mo86054n();
                Log.m105924i("HABBYGE-MALI.HellFinderReport", "report[19943]: sessionId=" + this.f65059d.f48482d + ", page=" + this.f65059d.f48483e + ", enterTimeMs=" + this.f65059d.f48485g + ", exitTimeMs=" + this.f65059d.f48486h + ", stayTimeMs=" + this.f65059d.f48484f + ", sid=" + this.f65059d.f48488j + ", reportType=" + this.f65059d.f48489k + ", contextId=" + this.f65059d.f48487i + ", finderContextId=" + this.f65059d.f48490l + ", extraInfo=" + this.f65059d.f48491m + ",  enterSourceInfo=" + this.f65059d.f48492n);
            }
        }

        /* renamed from: u91.a$a$b */
        public static final class C22621b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ WaterFallFlowRptStruct f65060d;

            /* renamed from: e */
            public final /* synthetic */ C22733i f65061e;

            public C22621b(WaterFallFlowRptStruct waterFallFlowRptStruct, C22733i iVar) {
                this.f65060d = waterFallFlowRptStruct;
                this.f65061e = iVar;
            }

            public final void run() {
                this.f65060d.mo86055o();
                Log.m105924i("HABBYGE-MALI.HellFinderReport", "report[19944]:\nsessionId=" + this.f65060d.f48660d + "\nfeedId=" + this.f65060d.f48661e + "\nname=" + this.f65061e.f65401v + "\nstartExposureMs=" + this.f65060d.f48662f + "\nendExposureMs=" + this.f65060d.f48663g + "\nitemExposureTimeMs=" + this.f65060d.f48670n + "\nscreenExposureAreaWeigth=" + this.f65060d.f48666j + "\ndisAppearType=" + this.f65060d.f48664h + "\ncontextId=" + this.f65060d.f48667k + "\nscene=" + this.f65060d.f48668l + "\nupdataTimeMs=" + this.f65060d.f48669m + "\nitemPos=" + this.f65060d.f48671o + "\nitemArrayIndex=" + this.f65060d.f48673q + "\nitemBufffer=" + this.f65060d.f48672p + "\nitemExposureAreaWeigth=" + this.f65060d.f48665i);
            }
        }

        /* renamed from: a */
        public final String mo35740a(String str) {
            JSONObject jSONObject;
            try {
                String str2 = C22730d.f65375d;
                if (TextUtils.isEmpty(str2)) {
                    return str;
                }
                if (str != null) {
                    if (str.length() > 0) {
                        jSONObject = new JSONObject(str);
                        jSONObject.put("bell_info", str2);
                        return jSONObject.toString();
                    }
                }
                jSONObject = new JSONObject();
                jSONObject.put("bell_info", str2);
                return jSONObject.toString();
            } catch (Exception unused) {
                return str;
            }
        }

        /* renamed from: b */
        public final void mo35741b(C22623c cVar) {
            C13598b0 b0Var;
            C87412m.m108594g(cVar, "statistics");
            FinderUITimeStruct finderUITimeStruct = new FinderUITimeStruct();
            finderUITimeStruct.f48482d = finderUITimeStruct.mo86045b("SessionId", cVar.f65064a, true);
            finderUITimeStruct.f48483e = finderUITimeStruct.mo86045b("PageName", C116711b.m164595t(cVar.f65065b), true);
            long j = cVar.f65067d;
            finderUITimeStruct.f48485g = j;
            finderUITimeStruct.mo86046c("EnterTimeMs", j);
            long j2 = cVar.f65068e;
            finderUITimeStruct.f48486h = j2;
            finderUITimeStruct.mo86046c("ExitTimeMs", j2);
            long j3 = cVar.f65066c;
            finderUITimeStruct.f48484f = j3;
            finderUITimeStruct.mo86046c("StayTimeMs", j3);
            finderUITimeStruct.f48487i = finderUITimeStruct.mo86045b("ClickTabContextId", cVar.f65069f, true);
            finderUITimeStruct.f48490l = finderUITimeStruct.mo86045b("FinderContextID", C116711b.m164578c(), true);
            String str = "";
            if (C87412m.m108589b(finderUITimeStruct.f48483e, "FinderTopicFeedUI")) {
                StringBuilder sb = new StringBuilder();
                sb.append(finderUITimeStruct.f48483e);
                sb.append(cVar.f65072i ? "_POI" : str);
                finderUITimeStruct.f48483e = finderUITimeStruct.mo86045b("PageName", sb.toString(), true);
            }
            finderUITimeStruct.f48488j = finderUITimeStruct.mo86045b("Sid", cVar.f65070g, true);
            finderUITimeStruct.f48489k = (long) cVar.f65071h;
            String str2 = cVar.f65073j;
            String str3 = null;
            if (str2 != null) {
                String a = C22618a.f65058a.mo35740a(str2);
                finderUITimeStruct.f48491m = finderUITimeStruct.mo86045b("ExtraInfo", a != null ? C112551y.m153814n(a, ",", ";", false) : null, true);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                String a2 = mo35740a(C11716d.f34294a);
                if (a2 != null) {
                    str3 = C112551y.m153814n(a2, ",", ";", false);
                }
                finderUITimeStruct.f48491m = finderUITimeStruct.mo86045b("ExtraInfo", str3, true);
            }
            String str4 = cVar.f65074k;
            if (str4 != null) {
                str = C112551y.m153814n(str4, ",", ";", false);
            }
            finderUITimeStruct.f48492n = finderUITimeStruct.mo86045b("enterSourceInfo", str, true);
            Class cls = C10432i.class;
            long j4 = C76695c.m92341b() ? 1 : 0;
            if (((C10432i) C86312j.m106911c(cls)).mo10750e()) {
                j4 |= 2;
            }
            if (((C10432i) C86312j.m106911c(cls)).mo10740Mn() == 2) {
                j4 |= 4;
            }
            if (((C10432i) C86312j.m106911c(cls)).mo10740Mn() == 0) {
                j4 |= 8;
            }
            if (((C10432i) C86312j.m106911c(cls)).mo10740Mn() == 1) {
                j4 |= 16;
            }
            if (((C10432i) C86312j.m106911c(cls)).mo10751fd() == 2) {
                j4 |= 32;
            }
            if (((C10432i) C86312j.m106911c(cls)).mo10751fd() == 0) {
                j4 |= 64;
            }
            if (((C10432i) C86312j.m106911c(cls)).mo10751fd() == 1) {
                j4 |= 128;
            }
            if (((C10432i) C86312j.m106911c(cls)).Oh0() == 2) {
                j4 |= 256;
            }
            if (((C10432i) C86312j.m106911c(cls)).Oh0() == 0) {
                j4 |= 512;
            }
            if (((C10432i) C86312j.m106911c(cls)).Oh0() == 1) {
                j4 |= 1024;
            }
            finderUITimeStruct.f48493o = j4;
            ((C119157j) C119157j.f356862d).mo183884o(new C22620a(finderUITimeStruct));
        }

        /* renamed from: c */
        public final void mo35742c(C22733i iVar) {
            C87412m.m108594g(iVar, "feed");
            WaterFallFlowRptStruct waterFallFlowRptStruct = new WaterFallFlowRptStruct();
            waterFallFlowRptStruct.f48660d = waterFallFlowRptStruct.mo86045b("SessionId", iVar.f65380a, true);
            waterFallFlowRptStruct.f48661e = waterFallFlowRptStruct.mo86045b("FeedId", iVar.f65399t, true);
            waterFallFlowRptStruct.f48662f = iVar.f65381b;
            waterFallFlowRptStruct.f48663g = iVar.f65382c;
            waterFallFlowRptStruct.f48664h = iVar.f65383d;
            float f = iVar.f65384e;
            if (f <= 0.0f) {
                f = 100.0f;
            }
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f / 100.0f)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            waterFallFlowRptStruct.f48665i = waterFallFlowRptStruct.mo86045b("ItemExposureAreaWeigth", format, true);
            if (waterFallFlowRptStruct.f48664h == -1) {
                waterFallFlowRptStruct.f48664h = 0;
            }
            float f2 = iVar.f65385f;
            if (f2 <= 0.0f) {
                C64208c.C64209a aVar = C64208c.f181951a;
                f2 = ((iVar.f65394o * iVar.f65393n) * 100.0f) / C64208c.f181974x;
            }
            String format2 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f2 / 100.0f)}, 1));
            C87412m.m108593f(format2, "format(format, *args)");
            waterFallFlowRptStruct.f48666j = waterFallFlowRptStruct.mo86045b("ScreenExposureAreaWeigth", format2, true);
            waterFallFlowRptStruct.f48667k = waterFallFlowRptStruct.mo86045b("ContextId", iVar.f65386g, true);
            waterFallFlowRptStruct.f48668l = iVar.f65387h;
            long j = iVar.f65388i;
            waterFallFlowRptStruct.f48669m = j;
            waterFallFlowRptStruct.mo86046c("UpdataTimeMs", j);
            long j2 = iVar.f65389j;
            waterFallFlowRptStruct.f48670n = j2;
            waterFallFlowRptStruct.mo86046c("ItemExposureTimeMs", j2);
            waterFallFlowRptStruct.f48671o = iVar.f65397r;
            waterFallFlowRptStruct.f48673q = iVar.f65396q;
            waterFallFlowRptStruct.f48672p = waterFallFlowRptStruct.mo86045b("ItemBufffer", iVar.f65404y, true);
            ((C119157j) C119157j.f356862d).mo183884o(new C22621b(waterFallFlowRptStruct, iVar));
        }
    }
}
