package hg2;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.xweb.util.FrequentLimiter;
import di3.C86301e;
import di3.C86312j;
import eb0.C75584h4;
import eb0.C75586j4;
import ei3.C86522b;
import f12.C7970a;
import f40.C86709a0;
import f62.C75700k0;
import java.util.List;
import p243tn.C14050a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: hg2.l */
public class C76193l extends C86301e {

    /* renamed from: d */
    public C75586j4 f223228d;

    /* renamed from: hg2.l$a */
    public class C76194a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C76196c f223229d;

        public C76194a(C76196c cVar) {
            this.f223229d = cVar;
        }

        public void run() {
            C76196c cVar = this.f223229d;
            if (cVar != null) {
                cVar.mo106457a();
            }
        }
    }

    /* renamed from: hg2.l$b */
    public class C76195b implements Runnable {
        public C76195b(C76193l lVar) {
        }

        public void run() {
            if (C86709a0.m107522a()) {
                Util.deleteOutOfDateFile(C7970a.m8127a(), "ReaderApp_", FrequentLimiter.WEEK_MILLS);
            }
        }

        public String toString() {
            return super.toString() + "|onAccountPostReset";
        }
    }

    /* renamed from: hg2.l$c */
    public interface C76196c {
        /* renamed from: a */
        void mo106457a();

        /* renamed from: b */
        boolean mo106458b();
    }

    public static void vx0(C76196c cVar) {
        yx0().mo105932jo(20);
        ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69763f("newsapp");
        if (!C86709a0.m107522a()) {
            wx0(cVar);
        } else {
            C86709a0.m107525e().postToWorker(new C76197m(cVar, 20));
        }
    }

    public static void wx0(C76196c cVar) {
        MMHandlerThread.postToMainThread(new C76194a(cVar));
    }

    public static void xx0(List<C75584h4> list, int i) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                Util.deleteFile(C14050a.m13405b(list.get(i2).mo105922c()));
            }
        }
    }

    public static C75586j4 yx0() {
        Class cls = C76193l.class;
        C86709a0.m107523b().mo121108c();
        if (((C76193l) C86312j.m106911c(cls)).f223228d == null) {
            ((C76193l) C86312j.m106911c(cls)).f223228d = new C75586j4(C86709a0.m107535s().f251811i);
        }
        return ((C76193l) C86312j.m106911c(cls)).f223228d;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C86709a0.m107525e().postToWorker(new C76195b(this));
    }
}
