package dp1;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderChatSendClickStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import kj2.C61103a;
import te3.C49712hj1;
import z04.C112551y;

/* renamed from: dp1.h */
public final class C58363h {

    /* renamed from: a */
    public static final C58363h f167137a = new C58363h();

    /* renamed from: b */
    public static final C45431e2 f167138b = new C45431e2();

    /* renamed from: c */
    public static final C45431e2 f167139c = new C45431e2();

    /* renamed from: d */
    public static final C58367e f167140d = new C58367e();

    /* renamed from: e */
    public static final C58365c f167141e = new C58365c();

    /* renamed from: f */
    public static final C58366d f167142f = new C58366d();

    /* renamed from: g */
    public static final C58364b f167143g = new C58364b();

    /* renamed from: dp1.h$a */
    public static final class C45433a {

        /* renamed from: a */
        public long f122966a;

        /* renamed from: b */
        public String f122967b = "";

        /* renamed from: c */
        public long f122968c;

        /* renamed from: d */
        public long f122969d;

        /* renamed from: e */
        public String f122970e = "";
    }

    /* renamed from: dp1.h$b */
    public static final class C58364b {

        /* renamed from: a */
        public String f167144a = "";

        /* renamed from: b */
        public String f167145b = "";

        /* renamed from: c */
        public String f167146c = "";

        /* renamed from: a */
        public static void m67608a(C58364b bVar, C49712hj1 hj12, long j, long j2, Long l, int i, Object obj) {
            long j3 = 1;
            if ((i & 8) != 0) {
                l = 1L;
            }
            bVar.getClass();
            FinderChatSendClickStruct finderChatSendClickStruct = new FinderChatSendClickStruct();
            finderChatSendClickStruct.f155119d = finderChatSendClickStruct.mo86045b("finderUsername", bVar.f167144a, true);
            finderChatSendClickStruct.f155120e = finderChatSendClickStruct.mo86045b("toUsername", bVar.f167145b, true);
            finderChatSendClickStruct.f155121f = finderChatSendClickStruct.mo86045b("toFinderUsername", bVar.f167146c, true);
            finderChatSendClickStruct.f155122g = 2;
            finderChatSendClickStruct.f155123h = j2;
            finderChatSendClickStruct.f155126k = j;
            String str = "";
            if (hj12 != null) {
                String str2 = hj12.f134670d;
                if (str2 == null) {
                    str2 = str;
                }
                finderChatSendClickStruct.f155124i = finderChatSendClickStruct.mo86045b("sessionid", str2, true);
                String str3 = hj12.f134672f;
                if (str3 == null) {
                    str3 = str;
                }
                finderChatSendClickStruct.f155125j = finderChatSendClickStruct.mo86045b("clicktabcontextid", str3, true);
            }
            String str4 = finderChatSendClickStruct.f155124i;
            if (str4 == null) {
                str4 = str;
            }
            finderChatSendClickStruct.f155124i = finderChatSendClickStruct.mo86045b("sessionid", str4, true);
            String str5 = finderChatSendClickStruct.f155125j;
            if (str5 != null) {
                str = str5;
            }
            finderChatSendClickStruct.f155125j = finderChatSendClickStruct.mo86045b("clicktabcontextid", str, true);
            if (l != null) {
                j3 = l.longValue();
            }
            finderChatSendClickStruct.f155127l = j3;
            finderChatSendClickStruct.mo86054n();
            C58363h.m67607a(C58363h.f167137a, "onClickFinderChat", finderChatSendClickStruct);
        }

        /* renamed from: b */
        public static void m67609b(C58364b bVar, C49712hj1 hj12, long j, Long l, int i, Object obj) {
            long j2 = 1;
            if ((i & 4) != 0) {
                l = 1L;
            }
            bVar.getClass();
            FinderChatSendClickStruct finderChatSendClickStruct = new FinderChatSendClickStruct();
            finderChatSendClickStruct.f155119d = finderChatSendClickStruct.mo86045b("finderUsername", bVar.f167144a, true);
            finderChatSendClickStruct.f155120e = finderChatSendClickStruct.mo86045b("toUsername", bVar.f167145b, true);
            finderChatSendClickStruct.f155121f = finderChatSendClickStruct.mo86045b("toFinderUsername", bVar.f167146c, true);
            finderChatSendClickStruct.f155122g = 1;
            finderChatSendClickStruct.f155123h = 0;
            if (hj12 != null) {
                String str = hj12.f134670d;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                finderChatSendClickStruct.f155124i = finderChatSendClickStruct.mo86045b("sessionid", str, true);
                String str3 = hj12.f134672f;
                if (str3 != null) {
                    str2 = str3;
                }
                finderChatSendClickStruct.f155125j = finderChatSendClickStruct.mo86045b("clicktabcontextid", str2, true);
            }
            finderChatSendClickStruct.f155126k = j;
            if (l != null) {
                j2 = l.longValue();
            }
            finderChatSendClickStruct.f155127l = j2;
            finderChatSendClickStruct.mo86054n();
            C58363h.m67607a(C58363h.f167137a, "onExpose", finderChatSendClickStruct);
        }

        /* renamed from: c */
        public final void mo83123c(String str, String str2, String str3) {
            C87412m.m108594g(str, "finderUserName");
            C87412m.m108594g(str2, "toUserName");
            C87412m.m108594g(str3, "toFinderUserName");
            this.f167144a = str;
            this.f167145b = str2;
            this.f167146c = str3;
        }
    }

    /* renamed from: dp1.h$c */
    public static final class C58365c {
    }

    /* renamed from: dp1.h$d */
    public static final class C58366d {

        /* renamed from: a */
        public final MMHandler f167147a = new MMHandler("RecordFinderChatEnter");

        /* renamed from: b */
        public long f167148b;

        /* renamed from: c */
        public String f167149c = "";

        /* renamed from: d */
        public String f167150d = "";

        /* renamed from: e */
        public String f167151e = "";

        /* renamed from: f */
        public String f167152f = "";

        /* renamed from: g */
        public long f167153g;

        /* renamed from: h */
        public long f167154h;

        /* renamed from: i */
        public long f167155i;
    }

    /* renamed from: dp1.h$e */
    public static final class C58367e {

        /* renamed from: a */
        public long f167156a;

        /* renamed from: b */
        public String f167157b = "";

        /* renamed from: c */
        public String f167158c = "";

        /* renamed from: d */
        public String f167159d = "";

        /* renamed from: e */
        public long f167160e;

        /* renamed from: f */
        public long f167161f;

        /* renamed from: g */
        public long f167162g;

        /* renamed from: h */
        public long f167163h;
    }

    /* renamed from: a */
    public static final void m67607a(C58363h hVar, String str, C61103a aVar) {
        hVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("report");
        sb.append(aVar.mo1004j());
        sb.append(' ');
        String q = aVar.mo1006q();
        C87412m.m108593f(q, "struct.toShowString()");
        sb.append(C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
        Log.m105924i(str, sb.toString());
    }
}
