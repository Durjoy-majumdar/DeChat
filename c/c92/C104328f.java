package c92;

import com.tencent.p014mm.autogen.mmdata.rpt.MultitalkScreenFunctionStruct;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64197v;

/* renamed from: c92.f */
public final class C104328f {

    /* renamed from: a */
    public static final C104328f f308805a = new C104328f();

    /* renamed from: b */
    public static long f308806b = 0;

    /* renamed from: c */
    public static long f308807c = 0;

    /* renamed from: d */
    public static long f308808d = 0;

    /* renamed from: e */
    public static long f308809e = 0;

    /* renamed from: f */
    public static long f308810f = 0;

    /* renamed from: g */
    public static boolean f308811g = false;

    /* renamed from: h */
    public static String f308812h = "";

    /* renamed from: i */
    public static boolean f308813i = false;

    /* renamed from: j */
    public static int f308814j = -1;

    /* renamed from: k */
    public static int f308815k;

    /* renamed from: l */
    public static int f308816l;

    /* renamed from: m */
    public static final HashSet<String> f308817m = new HashSet<>();

    /* renamed from: n */
    public static int f308818n;

    /* renamed from: o */
    public static int f308819o;

    /* renamed from: p */
    public static int f308820p;

    /* renamed from: q */
    public static boolean f308821q;

    /* renamed from: r */
    public static boolean f308822r;

    /* renamed from: s */
    public static int f308823s;

    /* renamed from: t */
    public static final C0438a f308824t = new C0438a();

    /* renamed from: u */
    public static final C0438a f308825u = new C0438a();

    /* renamed from: v */
    public static final C0438a f308826v = new C0438a();

    /* renamed from: w */
    public static final C0438a f308827w = new C0438a();

    /* renamed from: x */
    public static final ArrayList<Long> f308828x = new ArrayList<>();

    /* renamed from: c92.f$a */
    public static final class C0438a {

        /* renamed from: a */
        public final List<C13604l<Long, Long>> f1062a = new ArrayList();

        /* renamed from: c92.f$a$a */
        public static final class C0439a extends C87413o implements C32226l<C13604l<? extends Long, ? extends Long>, CharSequence> {

            /* renamed from: d */
            public static final C0439a f1063d = new C0439a();

            public C0439a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C13604l lVar = (C13604l) obj;
                C87412m.m108594g(lVar, LocaleUtil.ITALIAN);
                StringBuilder sb = new StringBuilder();
                sb.append('(');
                sb.append(((Number) lVar.f38555d).longValue());
                sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                sb.append(((Number) lVar.f38556e).longValue());
                sb.append(')');
                return sb.toString();
            }
        }

        /* renamed from: a */
        public final void mo478a() {
            C13604l lVar = (C13604l) C110818d0.m150925W(this.f1062a);
            if (lVar != null) {
                List<C13604l<Long, Long>> list = this.f1062a;
                C13604l lVar2 = (C13604l) ((ArrayList) list).set(C64197v.m75536e(list), new C13604l(lVar.f38555d, Long.valueOf(System.currentTimeMillis())));
            }
        }

        /* renamed from: b */
        public final void mo479b() {
            ((ArrayList) this.f1062a).add(new C13604l(Long.valueOf(System.currentTimeMillis()), 0L));
        }

        /* renamed from: c */
        public final void mo480c() {
            C13604l lVar = (C13604l) C110818d0.m150925W(this.f1062a);
            boolean z = false;
            if (lVar != null && ((Number) lVar.f38556e).longValue() == 0) {
                z = true;
            }
            if (z) {
                mo478a();
            }
        }

        /* renamed from: d */
        public final String mo481d() {
            return C110818d0.m150921S(this.f1062a, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C0439a.f1063d, 30, (Object) null);
        }

        /* renamed from: e */
        public final long mo482e() {
            long j = 0;
            for (C13604l lVar : this.f1062a) {
                j += ((Number) lVar.f38556e).longValue() > ((Number) lVar.f38555d).longValue() ? ((Number) lVar.f38556e).longValue() - ((Number) lVar.f38555d).longValue() : 0;
            }
            return j / ((long) 1000);
        }
    }

    /* renamed from: a */
    public final void mo146024a(boolean z) {
        if (f308813i) {
            Log.m105920e("MultitalkFeatureReportH", "now is talking");
        }
        f308821q = false;
        f308811g = false;
        f308822r = false;
        f308819o = 0;
        f308818n = 0;
        f308823s = 0;
        f308815k = 0;
        f308816l = 0;
        f308817m.clear();
        f308828x.clear();
        ((ArrayList) f308824t.f1062a).clear();
        ((ArrayList) f308825u.f1062a).clear();
        ((ArrayList) f308826v.f1062a).clear();
        ((ArrayList) f308827w.f1062a).clear();
        f308813i = true;
        f308809e = System.currentTimeMillis();
        f308811g = z;
    }

    /* renamed from: b */
    public final void mo146025b(int i, int i2) {
        if (i == 1) {
            f308822r = true;
            f308828x.add(Long.valueOf(System.currentTimeMillis()));
        } else if (i == 2) {
            f308825u.mo479b();
        } else if (i == 8) {
            f308825u.mo478a();
        }
        MultitalkScreenFunctionStruct multitalkScreenFunctionStruct = new MultitalkScreenFunctionStruct();
        if (f308811g) {
            multitalkScreenFunctionStruct.f310266i = f308806b;
        } else {
            multitalkScreenFunctionStruct.f310267j = f308807c;
        }
        multitalkScreenFunctionStruct.f310262e = 1;
        multitalkScreenFunctionStruct.f310264g = (long) i2;
        multitalkScreenFunctionStruct.f310265h = f308808d;
        multitalkScreenFunctionStruct.f310261d = multitalkScreenFunctionStruct.mo86045b("MultitalkGroupId", f308812h, true);
        multitalkScreenFunctionStruct.f310263f = (long) i;
        multitalkScreenFunctionStruct.mo86054n();
    }

    /* renamed from: c */
    public final void mo146026c(List<? extends MultiTalkGroupMember> list) {
        C87412m.m108594g(list, "memberList");
        for (MultiTalkGroupMember multiTalkGroupMember : list) {
            f308817m.add(multiTalkGroupMember.f320048d);
        }
        f308819o = Math.max(f308819o, list.size());
    }
}
