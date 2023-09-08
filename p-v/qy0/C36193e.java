package qy0;

import android.os.Message;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38172g;
import rx3.C13598b0;
import ry0.C36583g;
import ry0.C36584h;
import sy0.C36909f;
import te3.C50974ql;
import u60.C14121l;
import u60.C65233m;

/* renamed from: qy0.e */
public final class C36193e {

    /* renamed from: a */
    public final ConcurrentHashMap<Integer, C36583g> f96397a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final C65233m f96398b;

    /* renamed from: c */
    public final MMHandler f96399c;

    /* renamed from: qy0.e$a */
    public enum C36194a {
        AUTO_AUTH(1),
        NEW_SYNC(2),
        NOTIFY(3),
        CONTINUE(4),
        RETRY(5),
        CONFIG_DELAY(6);
        

        /* renamed from: d */
        public final int f96407d;

        /* access modifiers changed from: public */
        C36194a(int i) {
            this.f96407d = i;
        }
    }

    /* renamed from: qy0.e$b */
    public static final class C36195b implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ C36193e f96408d;

        /* renamed from: qy0.e$b$a */
        public static final class C36196a<T extends C15510f> implements C38172g {

            /* renamed from: a */
            public final /* synthetic */ Map.Entry<Integer, LinkedList<C50974ql>> f96409a;

            /* renamed from: b */
            public final /* synthetic */ Message f96410b;

            public C36196a(Map.Entry<Integer, ? extends LinkedList<C50974ql>> entry, Message message) {
                this.f96409a = entry;
                this.f96410b = message;
            }

            public boolean invoke(C15510f fVar) {
                C36584h hVar = (C36584h) fVar;
                LinkedList value = this.f96409a.getValue();
                boolean z = true;
                if (this.f96410b.arg1 != 1) {
                    z = false;
                }
                hVar.mo60727Z2(value, z);
                return false;
            }
        }

        public C36195b(C36193e eVar) {
            this.f96408d = eVar;
        }

        public boolean handleMessage(Message message) {
            C87412m.m108594g(message, "msg");
            if (message.what != 1) {
                return false;
            }
            Object obj = message.obj;
            C87412m.m108592e(obj, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.protocal.protobuf.BypSyncItem>");
            LinkedList<C50974ql> linkedList = (LinkedList) obj;
            Log.m105924i("Byp.BypSyncCore", "[WHAT_DISPATCH_SYNC_RESULT] list=" + linkedList.size());
            HashMap hashMap = new HashMap();
            for (C50974ql qlVar : linkedList) {
                LinkedList linkedList2 = (LinkedList) hashMap.get(Integer.valueOf(qlVar.f140370d));
                if (linkedList2 == null) {
                    linkedList2 = new LinkedList();
                    hashMap.put(Integer.valueOf(qlVar.f140370d), linkedList2);
                }
                linkedList2.add(qlVar);
            }
            C36193e eVar = this.f96408d;
            for (Map.Entry entry : hashMap.entrySet()) {
                C36583g gVar = eVar.f96397a.get(entry.getKey());
                if (gVar != null) {
                    gVar.mo60726Z2((LinkedList) entry.getValue(), message.arg1 == 1);
                }
                C38166b.m41756c(C36584h.class, entry.getKey(), new C36196a(entry, message));
            }
            return true;
        }
    }

    /* renamed from: qy0.e$c */
    public static final class C36197c extends C87413o implements C32226l<C14121l, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<Integer> f96411d;

        /* renamed from: e */
        public final /* synthetic */ C36194a f96412e;

        /* renamed from: f */
        public final /* synthetic */ C36193e f96413f;

        /* renamed from: g */
        public final /* synthetic */ int f96414g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36197c(List<Integer> list, C36194a aVar, C36193e eVar, int i) {
            super(1);
            this.f96411d = list;
            this.f96412e = aVar;
            this.f96413f = eVar;
            this.f96414g = i;
        }

        public Object invoke(Object obj) {
            C14121l lVar = (C14121l) obj;
            C87412m.m108594g(lVar, "singleTask");
            new C36909f(this.f96411d, this.f96412e).mo9225i().mo123419C(new C36198f(this.f96413f, this.f96411d, this.f96414g, lVar));
            return C13598b0.f38549a;
        }
    }

    public C36193e() {
        C65233m mVar = new C65233m("BypSyncExecutor");
        mVar.mo89361d();
        this.f96398b = mVar;
        this.f96399c = new MMHandler("BypDispatcher", (MMHandler.Callback) new C36195b(this));
    }

    /* renamed from: b */
    public static /* synthetic */ void m40919b(C36193e eVar, List list, C36194a aVar, boolean z, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        eVar.mo60565a(list, aVar, z, i);
    }

    /* renamed from: a */
    public final void mo60565a(List<Integer> list, C36194a aVar, boolean z, int i) {
        C87412m.m108594g(list, "selector");
        C87412m.m108594g(aVar, FirebaseAnalytics.C113379b.SOURCE);
        Log.m105924i("Byp.BypSyncCore", "[doSync] selector=" + list + " source=" + aVar + " isContinue=" + z + " retryCount=" + i);
        if (i >= 3) {
            Log.m105920e("Byp.BypSyncCore", "[doSync] over limit retry count[" + i + "] limit=3");
            C115669n.INSTANCE.mo175913w(1465, 130, 1);
            return;
        }
        C14121l lVar = new C14121l(new C36197c(list, aVar, this, i), (String) null, 2, (C8480h) null);
        C65233m mVar = this.f96398b;
        if (z) {
            mVar.getClass();
            Log.m105924i("Loader.SingleTaskExecutor", "[postTask] name=" + mVar.f187768a + " isRunningTask=" + mVar.f187771d + " task=" + lVar);
            lVar.f39521h = mVar.f187773f;
            mVar.f187770c.addFirst(lVar);
            mVar.mo89359b();
            return;
        }
        mVar.mo11856a(lVar);
    }
}
