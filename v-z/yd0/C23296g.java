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

/* renamed from: yd0.g */
public final class C23296g extends C23283a {

    /* renamed from: e */
    public C23073a f66957e;

    /* renamed from: f */
    public List<SubscribeMsgTmpItem> f66958f;

    /* renamed from: g */
    public boolean f66959g;

    /* renamed from: h */
    public boolean f66960h;

    /* renamed from: i */
    public boolean f66961i;

    /* renamed from: yd0.g$a */
    public static final class C23297a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f66962d;

        public C23297a(C32224a<C13598b0> aVar) {
            this.f66962d = aVar;
        }

        public final void run() {
            this.f66962d.invoke();
        }
    }

    /* renamed from: yd0.g$b */
    public static final class C23298b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C23296g f66963d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23298b(C23296g gVar) {
            super(0);
            this.f66963d = gVar;
        }

        public Object invoke() {
            C23296g gVar = this.f66963d;
            C23073a aVar = gVar.f66957e;
            if (aVar != null) {
                aVar.mo36475q2(gVar.f66921a, gVar.f66958f, gVar.f66959g, gVar.f66960h, gVar.f66961i);
            }
            C23084k.f66311a.mo36491a(this.f66963d);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23296g(String str, List list, boolean z, boolean z2, boolean z3, C23073a aVar, C22226d dVar, int i, C8480h hVar) {
        super(str);
        aVar = (i & 32) != 0 ? null : aVar;
        C87412m.m108594g(str, "username");
        C87412m.m108594g(list, "toSaveList");
        ArrayList arrayList = new ArrayList();
        this.f66958f = arrayList;
        this.f66957e = aVar;
        arrayList.addAll(list);
        this.f66959g = z;
        this.f66960h = z2;
        this.f66961i = z3;
    }

    public void run() {
        C23298b bVar = new C23298b(this);
        if (MMHandlerThread.isMainThread()) {
            bVar.invoke();
        } else {
            MMHandlerThread.postToMainThread(new C23297a(bVar));
        }
    }
}
