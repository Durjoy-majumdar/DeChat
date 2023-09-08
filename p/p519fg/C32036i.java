package p519fg;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import f62.C75699i1;
import p285zh.C119114c;
import ry0.C36584h;
import ry0.C48097a;
import te3.C77949j3;

/* renamed from: fg.i */
public final class C32036i extends C48097a implements C36584h {

    /* renamed from: f */
    public final String f85271f = "MagicAdMsgSyncHandler";

    /* renamed from: fg.i$a */
    public static final class C32037a implements C75699i1 {

        /* renamed from: a */
        public final /* synthetic */ C32036i f85272a;

        public C32037a(C32036i iVar) {
            this.f85272a = iVar;
        }

        /* renamed from: a */
        public void mo58465a() {
            Log.m105924i(this.f85272a.f85271f, "flushNotifyAllMsg");
        }

        /* renamed from: b */
        public void mo58466b(C72963f4 f4Var, C77949j3 j3Var) {
            String str = this.f85272a.f85271f;
            Log.m105924i(str, "[notifyNewMsg] msg=" + f4Var + " addMsg=" + j3Var);
            C119114c.m167921f("newMsgMagic");
        }
    }

    /* renamed from: D */
    public int mo55695D() {
        return 8;
    }

    /* renamed from: O */
    public int mo55698O() {
        return 7;
    }

    /* renamed from: Q */
    public C75699i1 mo58464Q() {
        return new C32037a(this);
    }
}
