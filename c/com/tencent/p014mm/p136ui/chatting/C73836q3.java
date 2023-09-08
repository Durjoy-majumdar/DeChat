package com.tencent.p014mm.p136ui.chatting;

import android.os.Looper;
import com.tencent.p014mm.modelcdntran.C55385t;
import com.tencent.p014mm.modelcdntran.C92795s;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import ub1.C78142a;

/* renamed from: com.tencent.mm.ui.chatting.q3 */
public class C73836q3 implements C92795s {

    /* renamed from: d */
    public final /* synthetic */ Object f216668d;

    /* renamed from: e */
    public final /* synthetic */ C78142a f216669e;

    /* renamed from: f */
    public final /* synthetic */ C73764n3 f216670f;

    /* renamed from: com.tencent.mm.ui.chatting.q3$a */
    public class C73837a implements Runnable {
        public C73837a() {
        }

        public void run() {
            C73836q3 q3Var = C73836q3.this;
            q3Var.f216670f.mo102816d(q3Var.f216668d, q3Var.f216669e);
        }
    }

    public C73836q3(C73764n3 n3Var, Object obj, C78142a aVar) {
        this.f216670f = n3Var;
        this.f216668d = obj;
        this.f216669e = aVar;
    }

    /* renamed from: o2 */
    public void mo76200o2(int i, C55385t tVar) {
        if (i != 4) {
            new MMHandler(Looper.getMainLooper()).post(new C73837a());
        }
    }
}
