package rb0;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WebViewUtilities;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C75604z3;
import eb0.z3$$h;
import gw0.C76073b;
import gy3.C87412m;
import java.util.List;
import p823sg.C101611g;
import p823sg.C101614i;
import s90.C77627f;

/* renamed from: rb0.c */
public final class C77495c {

    /* renamed from: a */
    public static final C77495c f225960a = new C77495c();

    /* renamed from: b */
    public static final C101611g<Long, Long> f225961b = new C101614i(20);

    /* renamed from: rb0.c$a */
    public static final class C77496a {

        /* renamed from: a */
        public int f225962a;

        /* renamed from: b */
        public int f225963b;

        /* renamed from: c */
        public String f225964c = "";

        /* renamed from: d */
        public String f225965d = "";

        /* renamed from: e */
        public int f225966e;

        /* renamed from: f */
        public String f225967f = "";
    }

    /* renamed from: a */
    public final void mo107659a(C72963f4 f4Var, C77496a aVar) {
        if (Util.isNullOrNil(f4Var.f230724G)) {
            Log.m105924i("MicroMsg.BizChattingItemReportHelper", "fillReportMsgSendType msg source null");
            return;
        }
        if (f4Var.getType() == 318767153) {
            aVar.f225963b = 2;
        }
        z3$$h w = C75604z3.m90851w(f4Var.f230724G);
        if (w == null) {
            Log.m105924i("MicroMsg.BizChattingItemReportHelper", "fillReportMsgSendType msg source value null");
            return;
        }
        if (w.f222095b == 3) {
            aVar.f225963b = 1;
        }
        int i = w.f222104k;
        if (i >= 4 && i <= 6) {
            aVar.f225963b = 5;
        }
        if (C47987l.m53344l2(f4Var)) {
            aVar.f225963b = 4;
        }
        if (!Util.isNullOrNil(f4Var.f230732P)) {
            aVar.f225963b = 3;
        }
    }

    /* renamed from: b */
    public final void mo107660b(C72963f4 f4Var, C77496a aVar) {
        C68070l.C68072b u;
        aVar.f225966e = f4Var.f230739W;
        String str = f4Var.f230732P;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        aVar.f225967f = str;
        boolean z = false;
        if (f4Var.mo100993e4()) {
            aVar.f225962a = 1;
        } else if (f4Var.mo100995g4()) {
            aVar.f225962a = 9;
        } else if (f4Var.mo100979R3()) {
            aVar.f225962a = 2;
        } else if (f4Var.mo100994f4()) {
            aVar.f225962a = 5;
        } else if (f4Var.getType() == 452984881 || f4Var.getType() == 520093745) {
            aVar.f225962a = 6;
        } else if (f4Var.mo100967F3()) {
            aVar.f225962a = 3;
            C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(f4Var.getMsgId(), f4Var.getContent());
            if (JZ != null && !Util.isNullOrNil((List) JZ.f226295i)) {
                String str3 = JZ.f226295i.get(0).f226326e;
                if (str3 != null) {
                    str2 = str3;
                }
                aVar.f225964c = str2;
            }
        } else if (!(!f4Var.mo101020w3() || f4Var.getContent() == null || (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) == null)) {
            int i = u.f195582i;
            if (i == 33 || i == 36) {
                aVar.f225962a = 4;
                String str4 = u.f195586j;
                if (str4 == null) {
                    str4 = str2;
                }
                aVar.f225964c = str4;
                String str5 = u.f195577g2;
                if (str5 != null) {
                    str2 = str5;
                }
                aVar.f225965d = str2;
            } else if (i == 5) {
                aVar.f225962a = 7;
            } else if (i == 3) {
                aVar.f225962a = 8;
            }
        }
        if (aVar.f225964c.length() > 0) {
            z = true;
        }
        if (z) {
            String doUrlEncode = WebViewUtilities.doUrlEncode(aVar.f225964c);
            C87412m.m108593f(doUrlEncode, "doUrlEncode(reportInfo.url)");
            aVar.f225964c = doUrlEncode;
        }
    }
}
