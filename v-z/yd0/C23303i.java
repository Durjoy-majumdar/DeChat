package yd0;

import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import rd0.C22226d;
import rx3.C13598b0;
import xd0.C23073a;
import xd0.C23084k;
import zt3.C119157j;

/* renamed from: yd0.i */
public final class C23303i extends C23283a {

    /* renamed from: e */
    public C23073a f66985e;

    /* renamed from: f */
    public List<SubscribeMsgTmpItem> f66986f;

    /* renamed from: yd0.i$a */
    public static final class C23304a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f66987d;

        public C23304a(C32224a<C13598b0> aVar) {
            this.f66987d = aVar;
        }

        public final void run() {
            this.f66987d.invoke();
        }
    }

    /* renamed from: yd0.i$b */
    public static final class C23305b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C23303i f66988d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23305b(C23303i iVar) {
            super(0);
            this.f66988d = iVar;
        }

        public Object invoke() {
            C23303i iVar = this.f66988d;
            C23073a aVar = iVar.f66985e;
            if (aVar != null) {
                aVar.mo36477s2(iVar.f66921a, iVar.f66986f);
            }
            C23084k.f66311a.mo36491a(this.f66988d);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23303i(String str, List list, C23073a aVar, C22226d dVar, int i, C8480h hVar) {
        super(str);
        aVar = (i & 4) != 0 ? null : aVar;
        C87412m.m108594g(str, "username");
        C87412m.m108594g(list, "templateList");
        ArrayList arrayList = new ArrayList();
        this.f66986f = arrayList;
        this.f66985e = aVar;
        arrayList.addAll(list);
    }

    public void run() {
        C23305b bVar = new C23305b(this);
        if (MMHandlerThread.isMainThread()) {
            bVar.invoke();
            return;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C23304a(bVar));
    }
}
