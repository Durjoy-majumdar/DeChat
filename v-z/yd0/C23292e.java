package yd0;

import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rd0.C22226d;
import sd0.C22357b;
import te3.hd4;
import xd0.C23073a;

/* renamed from: yd0.e */
public final class C23292e extends C23283a {

    /* renamed from: e */
    public C22226d f66949e;

    /* renamed from: f */
    public List<String> f66950f;

    /* renamed from: yd0.e$a */
    public static final class C23293a implements C22357b.C22358b {

        /* renamed from: d */
        public final /* synthetic */ C23292e f66951d;

        /* renamed from: yd0.e$a$a */
        public static final class C23294a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f66952d;

            /* renamed from: e */
            public final /* synthetic */ int f66953e;

            /* renamed from: f */
            public final /* synthetic */ C23292e f66954f;

            /* renamed from: g */
            public final /* synthetic */ SubscribeMsgRequestResult f66955g;

            /* renamed from: h */
            public final /* synthetic */ String f66956h;

            public C23294a(int i, int i2, C23292e eVar, SubscribeMsgRequestResult subscribeMsgRequestResult, String str) {
                this.f66952d = i;
                this.f66953e = i2;
                this.f66954f = eVar;
                this.f66955g = subscribeMsgRequestResult;
                this.f66956h = str;
            }

            public final void run() {
                int i = this.f66952d;
                if (i == 0 && this.f66953e == 0) {
                    C23292e eVar = this.f66954f;
                    C22226d dVar = eVar.f66949e;
                    if (dVar != null) {
                        String str = eVar.f66921a;
                        SubscribeMsgRequestResult subscribeMsgRequestResult = this.f66955g;
                        C87412m.m108591d(subscribeMsgRequestResult);
                        dVar.mo26257a(str, subscribeMsgRequestResult);
                        return;
                    }
                    return;
                }
                C22226d dVar2 = this.f66954f.f66949e;
                if (dVar2 != null) {
                    dVar2.mo26258e(i, this.f66953e, this.f66956h);
                }
            }
        }

        public C23293a(C23292e eVar) {
            this.f66951d = eVar;
        }

        /* renamed from: a */
        public void mo17818a(int i, int i2, String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
            C87412m.m108594g(str, "errMsg");
            Log.m105925i("MicroMsg.GetSubscribeMsgUIStatusTask", "alvinluo getSubscribeStatus end errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            MMHandlerThread.postToMainThread(new C23294a(i, i2, this.f66951d, subscribeMsgRequestResult, str));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23292e(String str, List<String> list, C23073a aVar, C22226d dVar) {
        super(str);
        C87412m.m108594g(str, "username");
        C87412m.m108594g(list, "templateIds");
        ArrayList arrayList = new ArrayList();
        this.f66950f = arrayList;
        this.f66949e = dVar;
        arrayList.addAll(list);
    }

    public void run() {
        String str = this.f66921a;
        List<String> list = this.f66950f;
        C23293a aVar = new C23293a(this);
        C87412m.m108594g(str, "username");
        C87412m.m108594g(list, "templateIds");
        C22357b bVar = new C22357b(str, 5);
        bVar.f63381f = aVar;
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            List<hd4> list2 = bVar.f63379d;
            hd4 hd4 = new hd4();
            hd4.f63922o = str;
            hd4.f63914d = (String) it.next();
            ((ArrayList) list2).add(hd4);
        }
        mo36764c(bVar);
    }
}
