package p1029rf;

import android.os.Handler;
import android.os.Process;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p014mm.matrix.C80993l;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.HashMap;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;
import p1002lf.C88491b;
import p1008mf.C88729a;
import p1013nf.C88933a;
import p1035sf.C90179b;
import p1035sf.C90183c;
import p221qf.C89642e;
import p269xe.C91185g;
import p723vf.C118672d;
import p723vf.C90773a;
import p723vf.C90778c;
import p761yd.C91440a;
import p761yd.C91441c;
import p995kf.C88146a;
import ur3.C90728a;

/* renamed from: rf.b */
public class C89938b extends C89960g implements C89642e {

    /* renamed from: e */
    public AppMethodBeat.C80541e f258439e;

    /* renamed from: f */
    public long f258440f;

    /* renamed from: g */
    public final boolean f258441g;

    /* renamed from: rf.b$a */
    public static class C89939a implements Runnable {

        /* renamed from: d */
        public long[] f258442d;

        /* renamed from: e */
        public long f258443e;

        /* renamed from: f */
        public long f258444f;

        /* renamed from: g */
        public String f258445g;

        /* renamed from: h */
        public boolean f258446h;

        public C89939a(boolean z, String str, long[] jArr, long j, long j2) {
            this.f258446h = z;
            this.f258445g = str;
            this.f258443e = j;
            this.f258442d = jArr;
            this.f258444f = j2;
        }

        public void run() {
            int[] c = C90183c.m112855c(Process.myPid());
            LinkedList linkedList = new LinkedList();
            long[] jArr = this.f258442d;
            if (jArr.length > 0) {
                C90179b.m112847d(jArr, linkedList, true, this.f258444f);
                C90179b.m112849f(linkedList, 30, new C89937a(this));
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            long max = Math.max(this.f258443e, C90179b.m112846c(linkedList, sb, sb4));
            String b = C90179b.m112845b(linkedList, max);
            Object[] objArr = new Object[1];
            String str = this.f258445g;
            boolean z = this.f258446h;
            long size = (long) linkedList.size();
            long j = this.f258443e;
            StringBuilder sb5 = new StringBuilder();
            StringBuilder sb6 = sb;
            sb5.append(String.format("-\n>>>>>>>>>>>>>>>>>>>>> maybe happens Jankiness!(%sms) <<<<<<<<<<<<<<<<<<<<<\n", new Object[]{Long.valueOf(j)}));
            sb5.append("|* [Status]");
            sb5.append("\n");
            sb5.append("|*\t\tScene: ");
            sb5.append(str);
            sb5.append("\n");
            sb5.append("|*\t\tForeground: ");
            sb5.append(z);
            sb5.append("\n");
            sb5.append("|*\t\tPriority: ");
            sb5.append(c[0]);
            sb5.append("\tNice: ");
            sb5.append(c[1]);
            sb5.append("\n");
            sb5.append("|*\t\tis64BitRuntime: ");
            sb5.append(C90773a.m113842h());
            sb5.append("\n");
            if (size > 0) {
                sb5.append("|*\t\tStackKey: ");
                sb5.append(b);
                sb5.append("\n");
                sb5.append(sb4.toString());
            } else {
                sb5.append(String.format("AppMethodBeat is close[%s].", new Object[]{Boolean.valueOf(AppMethodBeat.getInstance().isAlive())}));
                sb5.append("\n");
            }
            sb5.append("=========================================================================");
            objArr[0] = sb5.toString();
            C118672d.m167356f("Matrix.EvilMethodTracer", "%s", objArr);
            try {
                C88146a aVar = (C88146a) C91441c.m114730d().mo125377a(C88146a.class);
                if (aVar != null) {
                    JSONObject jSONObject = new JSONObject();
                    C90773a.m113838d(jSONObject, C91441c.m114730d().f262168b);
                    jSONObject.put("detail", C88729a.NORMAL);
                    jSONObject.put("cost", max);
                    jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f258445g);
                    jSONObject.put("stack", sb6.toString());
                    jSONObject.put("stackKey", b);
                    C91185g gVar = new C91185g();
                    gVar.f261444b = "Trace_EvilMethod";
                    gVar.f261446d = jSONObject;
                    aVar.onDetectIssue(gVar);
                }
            } catch (JSONException e) {
                C118672d.m167352b("Matrix.EvilMethodTracer", "[JSONException error: %s", e);
            }
        }
    }

    public C89938b(C88491b bVar) {
        C90728a aVar = bVar.f255596a;
        this.f258440f = (long) (aVar != null ? ((C80993l) aVar).mo112814a("clicfg_matrix_trace_evil_method_threshold", 700) : 700);
        this.f258441g = bVar.f255598c;
    }

    /* renamed from: b */
    public void mo112114b(String str) {
        this.f258439e = AppMethodBeat.getInstance().maskIndex("EvilMethodTracer#dispatchBegin");
    }

    /* renamed from: e */
    public void mo112115e(String str, long j, long j2) {
        long j3 = (j2 - j) / TimeUtil.SECOND_TO_US;
        try {
            if (j3 >= this.f258440f) {
                long[] copyData = AppMethodBeat.getInstance().copyData(this.f258439e);
                String a = C91440a.INSTANCE.mo125374a();
                Handler a2 = C90778c.m113843a();
                ProcessUILifecycleOwner.f235399x.getClass();
                a2.post(new C89939a(ProcessUILifecycleOwner.f235396u, a, copyData, j3, j2));
            }
        } finally {
            this.f258439e.mo112120a();
        }
    }

    /* renamed from: f */
    public void mo112123f() {
        super.mo112123f();
        if (this.f258441g) {
            C88933a aVar = C88933a.f256476q;
            synchronized (aVar.f256483i) {
                ((HashMap) aVar.f256483i).put(this, new C88933a.C88934a(this));
            }
        }
    }

    /* renamed from: h */
    public void mo112124h() {
        super.mo112124h();
        if (this.f258441g) {
            C88933a.m111028d(this);
        }
    }

    public boolean isValid() {
        return true;
    }
}
