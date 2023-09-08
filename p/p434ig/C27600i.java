package p434ig;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sm2.C101656f;
import z04.C112551y;

/* renamed from: ig.i */
public final class C27600i extends C98674g {

    /* renamed from: l */
    public final C98674g f76445l = new C98674g();

    /* renamed from: m */
    public C101656f f76446m;

    /* renamed from: n */
    public String f76447n;

    /* renamed from: o */
    public C101656f.C101657a f76448o;

    /* renamed from: p */
    public final C13601g f76449p;

    /* renamed from: q */
    public final C13601g f76450q;

    /* renamed from: r */
    public final C13601g f76451r;

    /* renamed from: s */
    public final C13601g f76452s;

    /* renamed from: t */
    public final C13601g f76453t;

    /* renamed from: u */
    public final C13601g f76454u;

    /* renamed from: ig.i$a */
    public static final class C27601a extends C87413o implements C32224a<List<C98672d>> {

        /* renamed from: d */
        public final /* synthetic */ C27600i f76455d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27601a(C27600i iVar) {
            super(0);
            this.f76455d = iVar;
        }

        public Object invoke() {
            String N = C27600i.m37671N(this.f76455d, "datalist");
            C27600i.m37670M(this.f76455d, N, C101656f.C101658b.End);
            ArrayList arrayList = new ArrayList();
            Class<C98672d> cls = C98672d.class;
            C27600i iVar = this.f76455d;
            C101656f fVar = iVar.f76446m;
            if (fVar != null) {
                iVar.mo141107o(arrayList, cls, fVar.mo141123b(), N, "dataitem");
                return arrayList.size() > 0 ? arrayList : this.f76455d.f76445l.f289364h;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ig.i$b */
    public static final class C27602b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27600i f76456d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27602b(C27600i iVar) {
            super(0);
            this.f76456d = iVar;
        }

        public Object invoke() {
            String N = C27600i.m37671N(this.f76456d, "desc");
            C27600i.m37670M(this.f76456d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f76456d.f76446m;
            if (fVar != null) {
                C27600i iVar = this.f76456d;
                String y = iVar.mo141117y(fVar.mo141123b().get(N), iVar.f76445l.f289363g);
                return y != null ? y : this.f76456d.f76445l.f289363g;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ig.i$c */
    public static final class C27603c extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C27600i f76457d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27603c(C27600i iVar) {
            super(0);
            this.f76457d = iVar;
        }

        public Object invoke() {
            String N = C27600i.m37671N(this.f76457d, "edittime");
            C27600i.m37670M(this.f76457d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f76457d.f76446m;
            if (fVar != null) {
                C27600i iVar = this.f76457d;
                Long x = iVar.mo141116x(fVar.mo141123b().get(N), Long.valueOf(iVar.f76445l.f289365i));
                return Long.valueOf(x != null ? x.longValue() : this.f76457d.f76445l.f289365i);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ig.i$d */
    public static final class C27604d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27600i f76458d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27604d(C27600i iVar) {
            super(0);
            this.f76458d = iVar;
        }

        public Object invoke() {
            String N = C27600i.m37671N(this.f76458d, "editusr");
            C27600i.m37670M(this.f76458d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f76458d.f76446m;
            if (fVar != null) {
                C27600i iVar = this.f76458d;
                String y = iVar.mo141117y(fVar.mo141123b().get(N), iVar.f76445l.f289366j);
                return y != null ? y : this.f76458d.f76445l.f289366j;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ig.i$e */
    public static final class C27605e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C27600i f76459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27605e(C27600i iVar) {
            super(0);
            this.f76459d = iVar;
        }

        public Object invoke() {
            String N = C27600i.m37671N(this.f76459d, "isChatRoom");
            C27600i.m37670M(this.f76459d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f76459d.f76446m;
            if (fVar != null) {
                C27600i iVar = this.f76459d;
                Integer w = iVar.mo141115w(fVar.mo141123b().get(N), Integer.valueOf(iVar.f76445l.f289367k));
                return Integer.valueOf(w != null ? w.intValue() : this.f76459d.f76445l.f289367k);
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    /* renamed from: ig.i$f */
    public static final class C27606f extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C27600i f76460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27606f(C27600i iVar) {
            super(0);
            this.f76460d = iVar;
        }

        public Object invoke() {
            String N = C27600i.m37671N(this.f76460d, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C27600i.m37670M(this.f76460d, N, C101656f.C101658b.Text);
            C101656f fVar = this.f76460d.f76446m;
            if (fVar != null) {
                C27600i iVar = this.f76460d;
                String y = iVar.mo141117y(fVar.mo141123b().get(N), iVar.f76445l.f289362f);
                return y != null ? y : this.f76460d.f76445l.f289362f;
            }
            C87412m.m108603p("__xmlParser__");
            throw null;
        }
    }

    public C27600i(C101656f fVar, String str) {
        C87412m.m108594g(fVar, "__xmlParser__");
        C87412m.m108594g(str, "__xmlPrefixTag__");
        C13602i iVar = C13602i.SYNCHRONIZED;
        this.f76449p = C36568h.m40986b(iVar, new C27606f(this));
        this.f76450q = C36568h.m40986b(iVar, new C27602b(this));
        this.f76451r = C36568h.m40986b(iVar, new C27601a(this));
        this.f76452s = C36568h.m40986b(iVar, new C27603c(this));
        this.f76453t = C36568h.m40986b(iVar, new C27604d(this));
        this.f76454u = C36568h.m40986b(iVar, new C27605e(this));
        this.f76446m = fVar;
        this.f76447n = str;
    }

    /* renamed from: M */
    public static final void m37670M(C27600i iVar, String str, C101656f.C101658b bVar) {
        C101656f fVar = iVar.f76446m;
        if (fVar == null) {
            C87412m.m108603p("__xmlParser__");
            throw null;
        } else if (!fVar.mo141123b().containsKey(str) && iVar.f76448o != C101656f.C101657a.ParseEnd) {
            C101656f fVar2 = iVar.f76446m;
            if (fVar2 != null) {
                iVar.f76448o = fVar2.mo141125d(str, bVar);
            } else {
                C87412m.m108603p("__xmlParser__");
                throw null;
            }
        }
    }

    /* renamed from: N */
    public static final String m37671N(C27600i iVar, String str) {
        String str2;
        iVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('.');
        String str3 = iVar.f76447n;
        if (str3 != null) {
            if (!C112551y.m153811k(str3)) {
                StringBuilder sb4 = new StringBuilder();
                String str4 = iVar.f76447n;
                if (str4 != null) {
                    sb4.append(str4);
                    sb4.append('.');
                    sb4.append(str);
                    str2 = sb4.toString();
                } else {
                    C87412m.m108603p("__xmlPrefixTag__");
                    throw null;
                }
            } else {
                str2 = String.valueOf(str);
            }
            sb.append(str2);
            return sb.toString();
        }
        C87412m.m108603p("__xmlPrefixTag__");
        throw null;
    }

    /* renamed from: A */
    public List<C98672d> mo55348A() {
        return (List) this.f76451r.getValue();
    }

    /* renamed from: B */
    public String mo55349B() {
        return (String) this.f76450q.getValue();
    }

    /* renamed from: C */
    public long mo55350C() {
        return ((Number) this.f76452s.getValue()).longValue();
    }

    /* renamed from: D */
    public String mo55351D() {
        return (String) this.f76453t.getValue();
    }

    /* renamed from: E */
    public String mo55352E() {
        return (String) this.f76449p.getValue();
    }

    /* renamed from: F */
    public int mo55353F() {
        return ((Number) this.f76454u.getValue()).intValue();
    }

    /* renamed from: G */
    public void mo55354G(int i) {
    }

    /* renamed from: H */
    public void mo55355H(List<C98672d> list) {
        C87412m.m108594g(list, "value");
    }

    /* renamed from: I */
    public void mo55356I(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: J */
    public void mo55357J(long j) {
    }

    /* renamed from: K */
    public void mo55358K(String str) {
        C87412m.m108594g(str, "value");
    }

    /* renamed from: L */
    public void mo55359L(String str) {
        C87412m.m108594g(str, "value");
    }
}
