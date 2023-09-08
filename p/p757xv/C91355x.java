package p757xv;

import android.app.ActivityManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: xv.x */
public class C91355x {

    /* renamed from: A */
    public int f261988A;

    /* renamed from: B */
    public int f261989B;

    /* renamed from: C */
    public C91355x[] f261990C = new C91355x[0];

    /* renamed from: D */
    public List<Map.Entry<String, Long>> f261991D = new ArrayList();

    /* renamed from: E */
    public String f261992E;

    /* renamed from: F */
    public String f261993F;

    /* renamed from: G */
    public String f261994G;

    /* renamed from: H */
    public String f261995H;

    /* renamed from: I */
    public String f261996I;

    /* renamed from: J */
    public int f261997J;

    /* renamed from: K */
    public int f261998K;

    /* renamed from: a */
    public int f261999a;

    /* renamed from: b */
    public String f262000b = "current";

    /* renamed from: c */
    public Map<String, String> f262001c;

    /* renamed from: d */
    public Map<String, String> f262002d;

    /* renamed from: e */
    public int f262003e;

    /* renamed from: f */
    public int f262004f = 0;

    /* renamed from: g */
    public String f262005g = "default";

    /* renamed from: h */
    public boolean f262006h;

    /* renamed from: i */
    public boolean f262007i;

    /* renamed from: j */
    public List<String> f262008j = new ArrayList();

    /* renamed from: k */
    public boolean f262009k = m114610b();

    /* renamed from: l */
    public boolean f262010l;

    /* renamed from: m */
    public long f262011m;

    /* renamed from: n */
    public long f262012n;

    /* renamed from: o */
    public long f262013o;

    /* renamed from: p */
    public long f262014p;

    /* renamed from: q */
    public long f262015q;

    /* renamed from: r */
    public long f262016r;

    /* renamed from: s */
    public long f262017s;

    /* renamed from: t */
    public long f262018t;

    /* renamed from: u */
    public long f262019u;

    /* renamed from: v */
    public long f262020v = Thread.currentThread().getId();

    /* renamed from: w */
    public long f262021w = -1;

    /* renamed from: x */
    public ActivityManager.MemoryInfo f262022x;

    /* renamed from: y */
    public int f262023y;

    /* renamed from: z */
    public int f262024z;

    /* renamed from: b */
    public static boolean m114610b() {
        return MMApplicationContext.isAppBrandProcess() || MMApplicationContext.isToolsProcess();
    }

    /* renamed from: a */
    public final String mo125331a(Map<String, String> map) {
        if (map == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            if (!((String) next.getKey()).equals("java-heap") && !((String) next.getKey()).equals("native-heap")) {
                sb.append(((String) next.getKey()).replaceFirst("summary.", ""));
                sb.append("=");
                sb.append((String) next.getValue());
                sb.append(", ");
            }
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(" \n");
        sb.append(String.format(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> MemoryInfo(tid=%s) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<", new Object[]{Long.valueOf(this.f262020v)}));
        sb.append("\n");
        sb.append("| Activity:\t");
        sb.append(this.f262005g);
        sb.append("\tAppForeground:");
        sb.append(this.f262006h);
        sb.append("\tProcessForeground:");
        sb.append(this.f262007i);
        Object obj = "";
        sb.append(m114610b() ? "\thasActivity:" : obj);
        Object obj2 = obj;
        if (m114610b()) {
            obj2 = Boolean.valueOf(this.f262010l);
        }
        sb.append(obj2);
        sb.append("\toom_adj:");
        sb.append(this.f261997J);
        sb.append("\toom_score_adj:");
        sb.append(this.f261998K);
        sb.append("\n");
        sb.append("| Source:\t ");
        sb.append(this.f262004f);
        sb.append("\n");
        sb.append("| VmSize:\t ");
        sb.append(this.f262003e);
        sb.append("kB\n");
        sb.append("| SystemMemoryInfo:\t ");
        sb.append("totalMem=");
        sb.append(this.f262022x.totalMem);
        sb.append(", availMem=");
        sb.append(this.f262022x.availMem);
        sb.append(", lowMemory=");
        sb.append(this.f262022x.lowMemory);
        sb.append(", threshold=");
        sb.append(this.f262022x.threshold);
        sb.append("\n");
        sb.append("| Dalvik:\t ");
        sb.append("memClass=");
        sb.append(this.f262017s);
        sb.append(", memLargeClass=");
        sb.append(this.f262018t);
        sb.append(" B, UsedMemory=");
        sb.append(this.f262014p);
        sb.append(" B, RecycledMemory=");
        sb.append(this.f262015q);
        sb.append(" B, MaxMemory=");
        sb.append(this.f262016r);
        sb.append(" B\n");
        sb.append("| NATIVE:\t ");
        sb.append("HeapSize=");
        sb.append(this.f262011m);
        sb.append(" B, ");
        sb.append("AllocatedSize=");
        sb.append(this.f262012n);
        sb.append(" B, ");
        sb.append("RecycledSize=");
        sb.append(this.f262013o);
        sb.append(" B\n");
        sb.append("| Stats:\t ");
        sb.append("pss-sum:");
        sb.append(this.f261988A);
        sb.append(" KB, ");
        sb.append(mo125331a(this.f262001c));
        sb.append("\n");
        sb.append("| AMSStats:\t ");
        sb.append(mo125331a(this.f262002d));
        sb.append("\n");
        sb.append("| FgService:\t");
        sb.append(Arrays.toString(((ArrayList) this.f262008j).toArray()));
        sb.append("\n");
        sb.append(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> END(cost:");
        sb.append(this.f262019u);
        sb.append("ms) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        sb.append("\n");
        C91355x[] xVarArr = this.f261990C;
        if (xVarArr != null) {
            for (C91355x xVar : xVarArr) {
                sb.append("| Process: ");
                sb.append(xVar.f262000b);
                sb.append(", pid: ");
                sb.append(xVar.f261999a);
                sb.append(", totalPss: ");
                sb.append(xVar.f262023y);
                sb.append("\n");
            }
            if (this.f261989B != 0) {
                sb.append("| Process: ");
                sb.append("IsolatedXWeb");
                sb.append(", pid: ?");
                sb.append(", totalPss: ");
                sb.append(this.f261989B);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
