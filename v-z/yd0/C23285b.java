package yd0;

import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import java.util.ArrayList;
import rd0.C22226d;
import sd0.C22357b;
import xd0.C23073a;

/* renamed from: yd0.b */
public final class C23285b extends C23283a {

    /* renamed from: e */
    public C22226d f66927e;

    /* renamed from: f */
    public C23073a f66928f;

    /* renamed from: yd0.b$a */
    public static final class C23286a implements C22357b.C22358b {

        /* renamed from: d */
        public final /* synthetic */ C23285b f66929d;

        /* renamed from: yd0.b$a$a */
        public static final class C23287a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f66930d;

            /* renamed from: e */
            public final /* synthetic */ int f66931e;

            /* renamed from: f */
            public final /* synthetic */ C23285b f66932f;

            /* renamed from: g */
            public final /* synthetic */ SubscribeMsgRequestResult f66933g;

            /* renamed from: h */
            public final /* synthetic */ String f66934h;

            public C23287a(int i, int i2, C23285b bVar, SubscribeMsgRequestResult subscribeMsgRequestResult, String str) {
                this.f66930d = i;
                this.f66931e = i2;
                this.f66932f = bVar;
                this.f66933g = subscribeMsgRequestResult;
                this.f66934h = str;
            }

            public final void run() {
                int i = this.f66930d;
                if (i == 0 && this.f66931e == 0) {
                    C23285b bVar = this.f66932f;
                    C22226d dVar = bVar.f66927e;
                    if (dVar != null) {
                        String str = bVar.f66921a;
                        SubscribeMsgRequestResult subscribeMsgRequestResult = this.f66933g;
                        C87412m.m108591d(subscribeMsgRequestResult);
                        dVar.mo26257a(str, subscribeMsgRequestResult);
                        return;
                    }
                    return;
                }
                C22226d dVar2 = this.f66932f.f66927e;
                if (dVar2 != null) {
                    dVar2.mo26258e(i, this.f66931e, this.f66934h);
                }
            }
        }

        public C23286a(C23285b bVar) {
            this.f66929d = bVar;
        }

        /* renamed from: a */
        public void mo17818a(int i, int i2, String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
            C87412m.m108594g(str, "errMsg");
            Log.m105925i("MicroMsg.GetAllSubscribeListTask", "alvinluo getSubscribeMsgListByUsername end errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                if ((subscribeMsgRequestResult != null ? subscribeMsgRequestResult.f49004h : null) != null) {
                    C23285b bVar = this.f66929d;
                    ArrayList<SubscribeMsgTmpItem> arrayList = subscribeMsgRequestResult.f49004h;
                    bVar.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    for (SubscribeMsgTmpItem subscribeMsgTmpItem : arrayList) {
                        subscribeMsgTmpItem.f49027o = currentTimeMillis;
                    }
                    C23285b bVar2 = this.f66929d;
                    C23073a aVar = bVar2.f66928f;
                    if (aVar != null) {
                        aVar.mo36473o2(1, bVar2.f66921a, subscribeMsgRequestResult.f49004h, subscribeMsgRequestResult.f49008o);
                    }
                }
            }
            MMHandlerThread.postToMainThread(new C23287a(i, i2, this.f66929d, subscribeMsgRequestResult, str));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23285b(String str, C23073a aVar, C22226d dVar) {
        super(str);
        C87412m.m108594g(str, "username");
        C87412m.m108594g(aVar, "storageManager");
        this.f66928f = aVar;
        this.f66927e = dVar;
    }

    public void run() {
        Log.m105924i("MicroMsg.GetAllSubscribeListTask", "alvinluo getAllSubscribeStatus run");
        String str = this.f66921a;
        C23286a aVar = new C23286a(this);
        C87412m.m108594g(str, "username");
        C22357b bVar = new C22357b(str, 3);
        bVar.f63381f = aVar;
        mo36764c(bVar);
    }
}
