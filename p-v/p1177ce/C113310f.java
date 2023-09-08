package p1177ce;

import android.os.HandlerThread;
import com.tencent.matrix.batterycanary.monitor.feature.C114433x13061b85;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.matrix.batterycanary.stats.C114559a;
import com.tencent.matrix.batterycanary.stats.C114570h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import p1177ce.C113291d;
import p329d3.C58104c;
import p981ie.C117164j;
import p981ie.C87704h;

/* renamed from: ce.f */
public class C113310f {

    /* renamed from: A */
    public C87704h f339026A;

    /* renamed from: B */
    public C117164j<C58104c<Integer, String>, C114433x13061b85> f339027B;

    /* renamed from: C */
    public C117164j<C58104c<Integer, String>, CpuStatFeature.UidCpuStateSnapshot.IpcCpuStat.RemoteStat> f339028C;

    /* renamed from: D */
    public boolean f339029D = false;

    /* renamed from: a */
    public HandlerThread f339030a = null;

    /* renamed from: b */
    public C113291d f339031b = new C113291d.C113292a();

    /* renamed from: c */
    public Callable<String> f339032c;

    /* renamed from: d */
    public long f339033d = 120000;

    /* renamed from: e */
    public long f339034e = 30000;

    /* renamed from: f */
    public long f339035f = 1200000;

    /* renamed from: g */
    public long f339036g = 600000;

    /* renamed from: h */
    public int f339037h = 200;

    /* renamed from: i */
    public int f339038i = 100;

    /* renamed from: j */
    public int f339039j = 10000;

    /* renamed from: k */
    public int f339040k = 5000;

    /* renamed from: l */
    public boolean f339041l = true;

    /* renamed from: m */
    public boolean f339042m = false;

    /* renamed from: n */
    public boolean f339043n = true;

    /* renamed from: o */
    public boolean f339044o = false;

    /* renamed from: p */
    public boolean f339045p = false;

    /* renamed from: q */
    public boolean f339046q = false;

    /* renamed from: r */
    public int f339047r = 0;

    /* renamed from: s */
    public boolean f339048s = false;

    /* renamed from: t */
    public List<String> f339049t = Collections.emptyList();

    /* renamed from: u */
    public List<String> f339050u = Collections.emptyList();

    /* renamed from: v */
    public List<String> f339051v = Collections.emptyList();

    /* renamed from: w */
    public List<String> f339052w = Collections.emptyList();

    /* renamed from: x */
    public final List<C114490k0> f339053x = new ArrayList(3);

    /* renamed from: y */
    public C114559a f339054y;

    /* renamed from: z */
    public C114570h f339055z;

    /* renamed from: ce.f$b */
    public static class C113312b {

        /* renamed from: a */
        public final C113310f f339056a = new C113310f((C113311a) null);

        /* renamed from: ce.f$b$a */
        public class C113313a implements Comparator<C114490k0> {
            public C113313a(C113312b bVar) {
            }

            public int compare(Object obj, Object obj2) {
                return Integer.compare(((C114490k0) obj2).mo111818d(), ((C114490k0) obj).mo111818d());
            }
        }

        /* renamed from: a */
        public C113312b mo165873a(String str) {
            C113310f fVar = this.f339056a;
            if (fVar.f339052w == Collections.EMPTY_LIST) {
                fVar.f339052w = new ArrayList();
            }
            this.f339056a.f339052w.add(str);
            return this;
        }

        /* renamed from: b */
        public C113310f mo165874b() {
            Collections.sort(this.f339056a.f339053x, new C113313a(this));
            C113310f fVar = this.f339056a;
            if (fVar.f339055z == null) {
                fVar.f339055z = new C114570h.C114571a();
            }
            if (fVar.f339026A == null) {
                fVar.f339026A = new C87704h();
            }
            return fVar;
        }

        /* renamed from: c */
        public C113312b mo165875c(Class<? extends C114490k0> cls) {
            try {
                ((ArrayList) this.f339056a.f339053x).add(cls.newInstance());
            } catch (Exception unused) {
            }
            return this;
        }

        /* renamed from: d */
        public C113312b mo165876d(boolean z) {
            this.f339056a.f339029D = z;
            return this;
        }

        /* renamed from: e */
        public C113312b mo165877e(C87704h hVar) {
            this.f339056a.f339026A = hVar;
            return this;
        }
    }

    public C113310f(C113311a aVar) {
    }

    public String toString() {
        return "BatteryMonitorConfig{features=" + this.f339053x + '}';
    }
}
