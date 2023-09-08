package te2;

import bp3.C79758p;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.util.Map;
import of3.C100327b;
import of3.C100328c;
import of3.C100329d;
import of3.C100330e;
import of3.C100331f;
import of3.C100332g;
import of3.C100333h;
import of3.C100334i;
import of3.C100335j;
import z04.C112551y;

/* renamed from: te2.g */
public final class C101750g {

    /* renamed from: a */
    public static final C101752b f297828a = new C101752b((C8480h) null);

    /* renamed from: te2.g$a */
    public static final class C101751a {

        /* renamed from: a */
        public long f297829a;

        /* renamed from: b */
        public int f297830b = C79758p.f233760a.mo109883f(new C100331f());

        /* renamed from: c */
        public int f297831c;
    }

    /* renamed from: te2.g$b */
    public static final class C101752b {
        public C101752b(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo141181a(int i, int i2, int i3, int i4) {
            int b = mo141182b(i3, i4);
            if (i2 == 0) {
                return 0;
            }
            if (!(b == 1 || b == 2 || b == 3)) {
                i2 = 0;
            }
            return i2;
        }

        /* renamed from: b */
        public final int mo141182b(int i, int i2) {
            Class cls = C32735h.class;
            if (i == 1) {
                return i2 == 0 ? ((C32735h) C86312j.m106911c(cls)).mo58782dM(new C100334i()) : ((C32735h) C86312j.m106911c(cls)).mo58782dM(new C100329d());
            }
            if (i == 2) {
                return i2 == 0 ? ((C32735h) C86312j.m106911c(cls)).mo58782dM(new C100333h()) : ((C32735h) C86312j.m106911c(cls)).mo58782dM(new C100328c());
            }
            if (i == 3) {
                return i2 == 0 ? ((C32735h) C86312j.m106911c(cls)).mo58782dM(new C100335j()) : ((C32735h) C86312j.m106911c(cls)).mo58782dM(new C100330e());
            }
            if (i != 4) {
                return 0;
            }
            return i2 == 0 ? ((C32735h) C86312j.m106911c(cls)).mo58782dM(new C100332g()) : ((C32735h) C86312j.m106911c(cls)).mo58782dM(new C100327b());
        }

        /* renamed from: c */
        public final int mo141183c(int i, String str) {
            if (str == null) {
                str = "";
            }
            return mo141182b(i, mo141184d(str));
        }

        /* renamed from: d */
        public final int mo141184d(String str) {
            C87412m.m108594g(str, "msgInfoTalker");
            return C112551y.m153808h(str, "@chatroom", false, 2, (Object) null) ? 1 : 0;
        }

        /* renamed from: e */
        public final C101751a mo141185e(String str) {
            Map<String, String> parseXml = XmlParser.parseXml(str, "msgsource", (String) null);
            C101751a aVar = new C101751a();
            if (parseXml != null && parseXml.containsKey(".msgsource.appmsg_pd.$cdnattachurl_pd_pri")) {
                aVar.f297829a = Util.getLong(parseXml.get(".msgsource.appmsg_pd.$cdnattachurl_size"), 0);
                aVar.f297830b = Util.getInt(parseXml.get(".msgsource.appmsg_pd.$cdnattachurl_pd_pri"), 0);
                aVar.f297831c = Util.getInt(parseXml.get(".msgsource.appmsg_pd.$cdnattachurl_pd"), 0);
            }
            return aVar;
        }

        /* renamed from: f */
        public final C101753c mo141186f(String str) {
            Map<String, String> parseXml = XmlParser.parseXml(str, "msgsource", (String) null);
            C101753c cVar = new C101753c();
            if (parseXml != null && parseXml.containsKey(".msgsource.imgmsg_pd.$cdnmidimgurl_pd_pri")) {
                cVar.f297832a = Util.getLong(parseXml.get(".msgsource.imgmsg_pd.$cdnmidimgurl_size"), 0);
                cVar.f297833b = Util.getInt(parseXml.get(".msgsource.imgmsg_pd.$cdnmidimgurl_pd_pri"), 0);
                cVar.f297834c = Util.getInt(parseXml.get(".msgsource.imgmsg_pd.$cdnmidimgurl_pd"), 0);
                cVar.f297835d = Util.getLong(parseXml.get(".msgsource.imgmsg_pd.$cdnbigimgurl_size"), 0);
                cVar.f297836e = Util.getInt(parseXml.get(".msgsource.imgmsg_pd.$cdnbigimgurl_pd_pri"), 0);
                cVar.f297837f = Util.getInt(parseXml.get(".msgsource.imgmsg_pd.$cdnbigimgurl_pd"), 0);
            }
            return cVar;
        }
    }

    /* renamed from: te2.g$c */
    public static final class C101753c {

        /* renamed from: a */
        public long f297832a;

        /* renamed from: b */
        public int f297833b;

        /* renamed from: c */
        public int f297834c;

        /* renamed from: d */
        public long f297835d;

        /* renamed from: e */
        public int f297836e;

        /* renamed from: f */
        public int f297837f;

        public C101753c() {
            C79758p pVar = C79758p.f233760a;
            this.f297833b = pVar.mo109883f(new C100331f());
            this.f297836e = pVar.mo109883f(new C100331f());
        }
    }
}
