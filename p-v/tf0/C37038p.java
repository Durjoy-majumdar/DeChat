package tf0;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import eb0.C31543z5;
import ei3.C86522b;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import o40.C11348f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import ue1.C37424b0;
import ue1.C37449w;
import ue1.C65328r;
import up1.C37521f;
import up1.C37558x0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: tf0.p */
public final class C37038p extends C86301e {

    /* renamed from: d */
    public final C13601g f98191d = C36568h.m40985a(C37039a.f98192d);

    /* renamed from: tf0.p$a */
    public static final class C37039a extends C87413o implements C32224a<C65328r> {

        /* renamed from: d */
        public static final C37039a f98192d = new C37039a();

        public C37039a() {
            super(0);
        }

        public Object invoke() {
            return new C65328r();
        }
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountInitialized(context);
        C65328r rVar = (C65328r) ((C36570n) this.f98191d).getValue();
        rVar.getClass();
        try {
            C37424b0 b0Var = C37424b0.f98925a;
            b0Var.mo61083b(1, C31543z5.m39453c() - 259200000);
            List<C37558x0> c = b0Var.mo61084c(1);
            rVar.f188015e.clear();
            for (C37558x0 v : c) {
                C65328r.C37442c v2 = rVar.mo89444v(v);
                String str = v2.f98954b.get(".sysmsg.content.task_id");
                if (str == null) {
                    str = "";
                }
                int safeParseInt = Util.safeParseInt(v2.f98954b.get(".sysmsg.content.last_deliver_time"));
                long c2 = C31543z5.m39453c();
                if (safeParseInt != 0) {
                    if (c2 / ((long) 1000) > ((long) safeParseInt)) {
                        Log.m105924i("Finder.GlobalPushNewXmlConsumer", "drop item taskId = " + str + " lastDeliverTime = " + safeParseInt + " now = " + c2);
                        C37424b0.f98925a.mo61085d(str);
                    }
                }
                Log.m105924i("Finder.GlobalPushNewXmlConsumer", "add item taskId = " + str + " lastDeliverTime = " + safeParseInt + " now = " + c2);
                rVar.f188015e.add(v2);
            }
            Log.m105924i("Finder.GlobalPushNewXmlConsumer", "loadPendingList from disk, size = " + rVar.f188015e.size());
            C37424b0.f98925a.mo61082a(1);
            rVar.f188020j = true;
            C37521f.f99374d.getClass();
            rVar.mo89428e((long) C37521f.f99302U5.mo60266n().intValue(), C65328r.C37445f.LAUNCH);
        } catch (Throwable th) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            C11348f.C11349a.m11178b(C59319a.f169618b, "finderGlobalPushError", false, (C11348f.C11352b) null, false, false, new C37449w(stringWriter), 28, (Object) null);
        }
    }
}
