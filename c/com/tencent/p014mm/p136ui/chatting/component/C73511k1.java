package com.tencent.p014mm.p136ui.chatting.component;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.Closeable;
import o40.C61926c;
import p270xi.C53356d;
import p270xi.C91212b;
import rx3.C13598b0;

@C91212b
/* renamed from: com.tencent.mm.ui.chatting.component.k1 */
public final class C73511k1 extends C73412a implements C53356d {

    /* renamed from: e */
    public final String f215952e = "MicroMsg.ChattingVoipComponent";

    /* renamed from: com.tencent.mm.ui.chatting.component.k1$a */
    public static final class C73512a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C73511k1 f215953d;

        /* renamed from: e */
        public final /* synthetic */ String f215954e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73512a(C73511k1 k1Var, String str) {
            super(0);
            this.f215953d = k1Var;
            this.f215954e = str;
        }

        public Object invoke() {
            C73511k1 k1Var = this.f215953d;
            String str = this.f215954e;
            C87412m.m108593f(str, "talkerUsername");
            Class cls = C75700k0.class;
            Log.m105924i(k1Var.f215952e, "clearVoipReadMsg");
            Cursor cursor = null;
            try {
                cursor = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).ay0(str, 50, 10);
                while (cursor.moveToNext()) {
                    C72963f4 f4Var = new C72963f4();
                    f4Var.convertFrom(cursor);
                    f4Var.mo100991d(6);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(f4Var.getMsgId(), f4Var);
                    String str2 = k1Var.f215952e;
                    Log.m105924i(str2, "do update msg " + f4Var.getMsgId() + " status");
                }
            } catch (Exception e) {
                Log.printErrStackTrace(k1Var.f215952e, e, "clearVoipReadMsg error", new Object[0]);
            } catch (Throwable th) {
                Util.qualityClose((Closeable) null);
                throw th;
            }
            Util.qualityClose(cursor);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        String r = this.f215752d.mo91577r();
        String str = this.f215952e;
        Log.m105924i(str, "onChattingPause, talker:" + r);
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        String r = this.f215752d.mo91577r();
        String str = this.f215952e;
        Log.m105924i(str, "onChattingExitAnimEnd, talker:" + r);
        if (!(r == null || r.length() == 0)) {
            C61926c.m72656A((String) null, new C73512a(this, r));
        }
    }
}
