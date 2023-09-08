package od3;

import android.content.Context;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.ForwardHalfPanelReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import p640ox.C77049b;
import te3.C64291co3;
import z04.C112551y;

/* renamed from: od3.a */
public final class C62001a {

    /* renamed from: a */
    public static final C62001a f176265a = new C62001a();

    /* renamed from: a */
    public final void mo86878a(Context context) {
        C87412m.m108594g(context, "context");
        C64291co3 co32 = (C64291co3) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(context, 14, C64291co3.class);
        if (co32 != null) {
            ForwardHalfPanelReportStruct forwardHalfPanelReportStruct = new ForwardHalfPanelReportStruct();
            forwardHalfPanelReportStruct.f156263d = (long) co32.f182539d;
            forwardHalfPanelReportStruct.f156264e = (long) co32.f182540e;
            forwardHalfPanelReportStruct.f156265f = forwardHalfPanelReportStruct.mo86045b("Del_list", co32.f182541f, true);
            forwardHalfPanelReportStruct.f156266g = (long) co32.f182542g;
            forwardHalfPanelReportStruct.f156267h = (long) co32.f182543h;
            forwardHalfPanelReportStruct.f156268i = (long) co32.f182544i;
            forwardHalfPanelReportStruct.f156269j = forwardHalfPanelReportStruct.mo86045b("MsgType", co32.f182545j, true);
            forwardHalfPanelReportStruct.f156270k = forwardHalfPanelReportStruct.mo86045b("InnerAppMsgType", co32.f182546n, true);
            forwardHalfPanelReportStruct.f156271l = (long) co32.f182547o;
            forwardHalfPanelReportStruct.f156272m = (long) co32.f182548p;
            forwardHalfPanelReportStruct.f156273n = forwardHalfPanelReportStruct.mo86045b("ToUser", co32.f182549q, true);
            forwardHalfPanelReportStruct.mo86054n();
            String q = forwardHalfPanelReportStruct.mo1006q();
            C87412m.m108593f(q, "struct.toShowString()");
            Log.m105925i("MircoMsg.ForwardHalfPanelReporter", "report%s %s", Integer.valueOf(forwardHalfPanelReportStruct.mo1004j()), C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
        }
    }
}
