package i93;

import android.net.Uri;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.internal.ConstValue;
import ea3.C45604u;
import ex0.C45700h;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import p206nj.C117627q;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112551y;

/* renamed from: i93.e */
public final class C46206e {

    /* renamed from: a */
    public static final C13601g f124554a = C36568h.m40985a(C46208b.f124560d);

    /* renamed from: i93.e$a */
    public enum C46207a {
        None(0),
        ColdBoot(1),
        WarmBoot(2);
        

        /* renamed from: d */
        public final int f124559d;

        /* access modifiers changed from: public */
        C46207a(int i) {
            this.f124559d = i;
        }
    }

    /* renamed from: i93.e$b */
    public static final class C46208b extends C87413o implements C32224a<C45700h> {

        /* renamed from: d */
        public static final C46208b f124560d = new C46208b();

        public C46208b() {
            super(0);
        }

        public Object invoke() {
            return (C45700h) C86709a0.m107533q(C45700h.class);
        }
    }

    /* renamed from: i93.e$c */
    public static final class C46209c {

        /* renamed from: a */
        public final ArrayList<C46210a> f124561a = new ArrayList<>();

        /* renamed from: i93.e$c$a */
        public static class C46210a {

            /* renamed from: a */
            public final String f124562a;

            /* renamed from: b */
            public final long f124563b;

            /* renamed from: c */
            public final String f124564c;

            /* renamed from: d */
            public long f124565d;

            public C46210a(String str, long j, String str2) {
                C87412m.m108594g(str, "url");
                C87412m.m108594g(str2, "pageTitle");
                this.f124562a = str;
                this.f124563b = j;
                this.f124564c = str2;
            }
        }

        /* renamed from: a */
        public final void mo71629a(C46210a aVar) {
            C87412m.m108594g(aVar, "info");
            if (this.f124561a.size() > 0) {
                long j = aVar.f124563b;
                ArrayList<C46210a> arrayList = this.f124561a;
                aVar.f124565d = j - arrayList.get(arrayList.size() - 1).f124563b;
            }
            this.f124561a.add(aVar);
        }
    }

    /* renamed from: i93.e$d */
    public enum C46211d {
        Unknown(-1),
        Main(1),
        Tools(2);
        

        /* renamed from: d */
        public final int f124570d;

        /* access modifiers changed from: public */
        C46211d(int i) {
            this.f124570d = i;
        }
    }

    /* renamed from: a */
    public static final long m51494a(String str, C45604u uVar, long j) {
        long b = uVar.mo73830b(str, j) - j;
        if (b > 0) {
            return b;
        }
        return 0;
    }

    /* renamed from: b */
    public static final C46211d m51495b() {
        if (MMApplicationContext.isMainProcess()) {
            return C46211d.Main;
        }
        String processName = MMApplicationContext.getProcessName();
        if (!(processName == null || processName.length() == 0)) {
            C87412m.m108593f(processName, ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
            if (C112551y.m153808h(processName, ":tools", false, 2, (Object) null)) {
                return C46211d.Tools;
            }
        }
        return C46211d.Unknown;
    }

    /* renamed from: c */
    public static final void m51496c(long j, long j2, int i) {
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1281, j, j2);
        nVar.mo175913w(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 1287 : 1286 : 1285 : 1284 : 1282 : 1283, j, j2);
        Log.m105926v("MicroMsg.WebViewPerformanceReporter", "reportByScene scene = " + i + ", key = " + j + ", value = " + j2);
    }

    /* renamed from: d */
    public static final String m51497d(String str, C45604u uVar, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(uVar.mo73830b(str, j) - j);
        sb.append(',');
        return sb.toString();
    }

    /* renamed from: e */
    public static final void m51498e(int i, int i2) {
        m51496c(0, (long) i, i2);
    }

    /* renamed from: f */
    public static final void m51499f(int i, int i2) {
        m51496c(6, (long) i, i2);
    }

    /* renamed from: g */
    public static final void m51500g(int i) {
        C115669n.INSTANCE.mo175913w(1200, 0, (long) i);
    }

    /* renamed from: h */
    public static final void m51501h(int i, int i2) {
        m51496c(2, (long) i, i2);
    }

    /* renamed from: i */
    public static final void m51502i(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C87412m.m108594g(str, "url");
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(",");
        sb.append(C117627q.m165909b(str, "utf-8"));
        sb.append(",");
        String q3 = ((C45700h) ((C36570n) f124554a).getValue()).mo71041q3(str);
        if (q3 == null) {
            q3 = "";
        }
        sb.append(q3);
        sb.append(",");
        sb.append(z ? 1 : 0);
        sb.append(",");
        sb.append(z2 ? 1 : 0);
        sb.append(",");
        sb.append(Uri.parse(str).getHost());
        sb.append(",");
        sb.append(z3 ? 1 : 0);
        sb.append(",");
        sb.append(z4 ? 1 : 0);
        sb.append(",");
        sb.append(z5 ? 1 : 0);
        sb.append(",");
        sb.append(z6 ? 1 : 0);
        String sb4 = sb.toString();
        C115669n.INSTANCE.kvStat(18919, sb4);
        Log.m105926v("ReportWebPrefetchCTR", sb4);
    }

    /* renamed from: j */
    public static /* synthetic */ void m51503j(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, Object obj) {
        int i3 = i2;
        boolean z7 = false;
        boolean z8 = (i3 & 4) != 0 ? false : z;
        boolean z9 = (i3 & 8) != 0 ? false : z2;
        boolean z15 = (i3 & 16) != 0 ? false : z3;
        boolean z16 = (i3 & 32) != 0 ? false : z4;
        boolean z17 = (i3 & 64) != 0 ? false : z5;
        if ((i3 & 128) == 0) {
            z7 = z6;
        }
        m51502i(i, str, z8, z9, z15, z16, z17, z7);
    }
}
