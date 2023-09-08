package com.tencent.p014mm.modelcdntran;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import i40.C98597b;
import i40.C98598e;
import java.util.HashSet;
import java.util.Random;
import kj2.C117407d;
import ob0.C100322j;
import ob0.C11385n;
import ob0.C117747y;
import org.xwalk.core.XWalkEnvironment;
import p823sg.C90193h;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.modelcdntran.i0 */
public class C92779i0 extends C98598e {

    /* renamed from: i */
    public C92796u f267048i = null;

    /* renamed from: j */
    public volatile boolean f267049j = false;

    /* renamed from: n */
    public CdnTransportService f267050n = null;

    /* renamed from: o */
    public boolean f267051o = false;

    /* renamed from: p */
    public C100322j f267052p;

    /* renamed from: q */
    public long f267053q = 0;

    /* renamed from: r */
    public MMHandler f267054r = new C92780a(Looper.getMainLooper());

    /* renamed from: s */
    public C11385n f267055s = new C92781b();

    /* renamed from: com.tencent.mm.modelcdntran.i0$a */
    public class C92780a extends MMHandler {
        public C92780a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1 && C92779i0.this.f267053q != 0) {
                int i = message.arg1;
                Log.m105925i("MicroMsg.SubCoreCdnTransport", "try get dns again scene[%d] lastGetDnsErrorTime[%d]  diff[%d]", Integer.valueOf(i), Long.valueOf(C92779i0.this.f267053q), Long.valueOf(Util.milliSecondsToNow(C92779i0.this.f267053q)));
                C86709a0.m107524d().mo123460f(new C92753d0(i));
            }
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.i0$b */
    public class C92781b implements C11385n {
        public C92781b() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            int i3 = i;
            String str2 = str;
            C117747y yVar2 = yVar;
            if (!(yVar2 instanceof C92753d0)) {
                Log.m105928w("MicroMsg.SubCoreCdnTransport", "get cdn dns on scene end but is not [NetSceneGetCdnDns]");
                return;
            }
            Log.m105925i("MicroMsg.SubCoreCdnTransport", "%d get cdn dns on scene end errType[%d] errCode[%d] errMsg[%s] lastGetDnsErrorTime[%d]", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2), str2, Long.valueOf(C92779i0.this.f267053q));
            if ("doScene failed".equals(str2)) {
                Log.m105919d("MicroMsg.SubCoreCdnTransport", "%d get cdn dns cache do nothing.", Integer.valueOf(hashCode()));
                return;
            }
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(546, (long) (i3 + 10), 1, true);
            if (i3 == 0) {
                if (C92779i0.this.f267053q > 0) {
                    dVar.idkeyStat(546, 52, 1, true);
                    C92779i0.this.f267053q = 0;
                }
            } else if (i3 != 4) {
                C92779i0 i0Var = C92779i0.this;
                if (i0Var.f267053q == 0) {
                    int i4 = ((C92753d0) yVar2).f266971g;
                    i0Var.f267053q = Util.nowMilliSecond();
                    C92779i0.this.f267054r.removeMessages(1);
                    MMHandler mMHandler = C92779i0.this.f267054r;
                    mMHandler.sendMessageDelayed(mMHandler.obtainMessage(1, i4, 0), 30000);
                    dVar.idkeyStat(546, 50, 1, true);
                    return;
                }
                i0Var.f267053q = 0;
                dVar.idkeyStat(546, 51, 1, true);
            }
        }
    }

    public static C92738a Ax0() {
        if (C86709a0.m107522a()) {
            return (C92738a) C98597b.m128130c3((C98598e) C86312j.m106911c(C92779i0.class), C92738a.class);
        }
        return null;
    }

    public static C92782j Bx0() {
        if (C86709a0.m107522a()) {
            return (C92782j) C98597b.m128130c3((C98598e) C86312j.m106911c(C92779i0.class), C92782j.class);
        }
        return null;
    }

    public static C92779i0 Cx0() {
        return (C92779i0) C86312j.m106911c(C92779i0.class);
    }

    public static C92796u Dx0() {
        C92796u uVar;
        C92779i0 Cx0 = Cx0();
        synchronized (Cx0) {
            if (Cx0.f267048i == null) {
                if (C86709a0.m107523b().mo121115m()) {
                    Cx0.f267048i = new C92796u(C86709a0.m107535s().f251807e, Ex0());
                    Cx0.f267049j = true;
                } else {
                    String str = C72994y1.f212832a + C90193h.m112878f((XWalkEnvironment.MODULE_MM + new Random().nextLong()).getBytes()) + "/";
                    Log.m105925i("MicroMsg.SubCoreCdnTransport", "hy: cdn temp path: %s", str);
                    Cx0.f267048i = new C92796u(str, Ex0());
                    Cx0.f267049j = false;
                }
            }
            uVar = Cx0.f267048i;
        }
        return uVar;
    }

    public static CdnTransportService Ex0() {
        C92779i0 Cx0 = Cx0();
        if (Cx0.f267050n == null) {
            synchronized (Cx0) {
                if (Cx0.f267050n == null) {
                    Cx0.f267050n = new CdnTransportService();
                }
            }
        }
        return Cx0.f267050n;
    }

    public final void Fx0() {
        synchronized (this) {
            C92796u uVar = this.f267048i;
            if (uVar != null) {
                uVar.getClass();
                CdnLogic.UnInitialize();
                uVar.f267125r = null;
                uVar.f267126s = null;
                uVar.f267116f = null;
                C92796u.f267113w = 0;
                C92796u.f267112v = 0;
                uVar.f267128u = null;
                uVar.f267127t = null;
                this.f267049j = false;
                this.f267048i = null;
            }
        }
    }

    public void Gx0(int i) {
        this.f267053q = 0;
        this.f267054r.removeMessages(1);
        C86709a0.m107524d().mo123460f(new C92753d0(i));
    }

    public String vx0() {
        return "MicroMsg.SubCoreCdnTransport";
    }

    public void wx0(HashSet<Class<? extends C98597b>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        hashSet.add(C92738a.class);
        hashSet.add(C92782j.class);
    }

    public void xx0(Context context) {
        synchronized (this) {
            if (!this.f267049j) {
                Fx0();
            }
        }
        if (this.f267050n == null) {
            Ex0();
            Log.m105925i("MicroMsg.SubCoreCdnTransport", "summersafecdn onAccountPostReset new CdnTransportService hash[%s]", Integer.valueOf(this.f267050n.hashCode()));
        }
        C86709a0.m107524d().mo123455a(379, this.f267055s);
        Log.m105924i("MicroMsg.SubCoreCdnTransport", "onAccountPostReset, tryToGetCdnDns");
        Gx0(1);
    }

    public void zx0() {
        this.f267052p = null;
        Fx0();
        synchronized (this) {
            CdnTransportService cdnTransportService = this.f267050n;
            if (cdnTransportService != null) {
                cdnTransportService.mo126956n();
                this.f267050n = null;
            }
        }
        this.f267053q = 0;
        this.f267054r.removeCallbacksAndMessages((Object) null);
        C86709a0.m107524d().mo123470p(379, this.f267055s);
    }
}
