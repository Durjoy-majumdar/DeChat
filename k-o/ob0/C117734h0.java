package ob0;

import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114789o;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C114800v;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import p910lj.C76701a;
import sf0.C90188n0;
import zt3.C119157j;

/* renamed from: ob0.h0 */
public class C117734h0 extends C114789o.C114790a {

    /* renamed from: e */
    public C114799u f352072e;

    /* renamed from: f */
    public C1311n f352073f;

    /* renamed from: g */
    public final MMHandler f352074g;

    /* renamed from: h */
    public boolean f352075h = false;

    /* renamed from: i */
    public final C117747y f352076i;

    /* renamed from: j */
    public final C11385n f352077j;

    /* renamed from: n */
    public final C114770g f352078n;

    /* renamed from: o */
    public boolean f352079o = false;

    /* renamed from: p */
    public Runnable f352080p = new C117735a();

    /* renamed from: ob0.h0$a */
    public class C117735a implements Runnable {

        /* renamed from: ob0.h0$a$a */
        public class C117736a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f352082d;

            /* renamed from: e */
            public final /* synthetic */ boolean f352083e;

            public C117736a(boolean z, boolean z2) {
                this.f352082d = z;
                this.f352083e = z2;
            }

            public void run() {
                C114770g gVar = C117734h0.this.f352078n;
                gVar.mo55491t0("push process's network haven't callback in 5.5min!!!! cancelStatus:" + this.f352082d + " hasCallbackStatus:" + this.f352083e);
                Object[] objArr = new Object[2];
                C117747y yVar = C117734h0.this.f352076i;
                int i = 0;
                objArr[0] = Integer.valueOf(yVar == null ? 0 : yVar.hashCode());
                C117747y yVar2 = C117734h0.this.f352076i;
                if (yVar2 != null) {
                    i = yVar2.getType();
                }
                objArr[1] = Integer.valueOf(i);
                Log.m105929w("MicroMsg.RemoteOnGYNetEnd", "time exceed, force to callback . kill push fin. hash:%d type:%d", objArr);
            }
        }

        public C117735a() {
        }

        public void run() {
            boolean z;
            C117734h0 h0Var = C117734h0.this;
            boolean z2 = h0Var.f352075h;
            int i = 0;
            if (z2 || (z = h0Var.f352079o)) {
                Object[] objArr = new Object[2];
                C117747y yVar = h0Var.f352076i;
                objArr[0] = Integer.valueOf(yVar == null ? 0 : yVar.hashCode());
                C117747y yVar2 = C117734h0.this.f352076i;
                if (yVar2 != null) {
                    i = yVar2.getType();
                }
                objArr[1] = Integer.valueOf(i);
                Log.m105921e("MicroMsg.RemoteOnGYNetEnd", "time exceed But removeCallbacks failed hash:%d type:%d", objArr);
                return;
            }
            Object[] objArr2 = new Object[2];
            C117747y yVar3 = h0Var.f352076i;
            objArr2[0] = Integer.valueOf(yVar3 == null ? 0 : yVar3.hashCode());
            C117747y yVar4 = C117734h0.this.f352076i;
            if (yVar4 != null) {
                i = yVar4.getType();
            }
            objArr2[1] = Integer.valueOf(i);
            Log.m105929w("MicroMsg.RemoteOnGYNetEnd", "time exceed, force to callback hash:%d type:%d", objArr2);
            C117734h0.this.f352075h = true;
            ThreadPool.post(new C117736a(z2, z), "RemoteOnGYNetEnd_killPush");
            C117734h0 h0Var2 = C117734h0.this;
            h0Var2.f352073f.onGYNetEnd(-1, 3, -1, "time exceed, force to callback", h0Var2.f352072e, (byte[]) null);
        }
    }

    /* renamed from: ob0.h0$b */
    public class C117737b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f352085d;

        /* renamed from: e */
        public final /* synthetic */ int f352086e;

        /* renamed from: f */
        public final /* synthetic */ int f352087f;

        /* renamed from: g */
        public final /* synthetic */ String f352088g;

        /* renamed from: h */
        public final /* synthetic */ byte[] f352089h;

        /* renamed from: ob0.h0$b$a */
        public class C117738a implements Runnable {
            public C117738a() {
            }

            public void run() {
                Context context = MMApplicationContext.getContext();
                C76701a.makeText(context, (CharSequence) "the netscene hasn't call callback to onSceneEnd, type:" + C117734h0.this.f352076i.getType(), 1).show();
            }
        }

        public C117737b(int i, int i2, int i3, String str, byte[] bArr) {
            this.f352085d = i;
            this.f352086e = i2;
            this.f352087f = i3;
            this.f352088g = str;
            this.f352089h = bArr;
        }

        public void run() {
            if (C117734h0.this.f352075h) {
                Log.m105929w("MicroMsg.RemoteOnGYNetEnd", "netId:%d has been canceled", Integer.valueOf(this.f352085d));
                return;
            }
            int i = this.f352086e;
            int i2 = this.f352087f;
            if (10016 == C90188n0.f258950r && !Util.isNullOrNil(C90188n0.f258952t)) {
                Log.m105925i("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd DK TEST SET : %s ", C90188n0.f258952t);
                String[] split = C90188n0.f258952t.split(",");
                if (split != null && split.length == 3 && Util.getInt(split[0], -1) == C117734h0.this.f352076i.getType()) {
                    i = Util.getInt(split[1], 0);
                    i2 = Util.getInt(split[2], 0);
                    if (i == 999) {
                        Log.m105929w("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd DK TEST SET syncservice : %s  NOT  CALLBACK !!!", C90188n0.f258952t);
                        return;
                    }
                }
            }
            int i3 = i;
            int i4 = i2;
            Log.m105925i("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd after post to worker netId:%d, errType:%d, errCode:%d, isCancel:%b, hashcode:%d", Integer.valueOf(this.f352085d), Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(C117734h0.this.f352075h), Integer.valueOf(C117734h0.this.f352076i.hashCode()));
            C117734h0 h0Var = C117734h0.this;
            C1311n nVar = h0Var.f352073f;
            nVar.onGYNetEnd(this.f352085d, i3, i4, this.f352088g, h0Var.f352072e, this.f352089h);
            if (C117734h0.this.f352076i.needCheckCallback() && !C117734h0.this.f352076i.hasCallBackToQueue()) {
                Log.m105921e("MicroMsg.RemoteOnGYNetEnd", "the netscene hasn't call callback to onSceneEnd, type:%d", Integer.valueOf(C117734h0.this.f352076i.getType()));
                Log.appenderFlush();
                if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C117738a());
                }
            }
        }
    }

    public C117734h0(C114799u uVar, C1311n nVar, C117747y yVar, C11385n nVar2, C114770g gVar) {
        this.f352072e = uVar;
        this.f352073f = nVar;
        this.f352076i = yVar;
        this.f352077j = nVar2;
        this.f352074g = Looper.myLooper() == null ? new MMHandler(Looper.getMainLooper()) : new MMHandler();
        this.f352078n = gVar;
    }

    /* renamed from: Rb */
    public void mo174444Rb(int i, int i2, int i3, String str, C114800v vVar, byte[] bArr) {
        Log.m105925i("MicroMsg.RemoteOnGYNetEnd", "onGYNetEnd netId:%d, errType:%d, errCode:%d, isCancel:%b, hash[%d,%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(this.f352075h), Integer.valueOf(this.f352076i.hashCode()), Integer.valueOf(this.f352072e.hashCode()));
        this.f352076i.updateDispatchIdNew(-1);
        if (!this.f352075h && !this.f352079o) {
            this.f352079o = true;
            this.f352074g.removeCallbacks(this.f352080p);
            this.f352074g.post(new C117737b(i, i2, i3, str, bArr));
        }
    }

    public void cancel() {
        this.f352075h = true;
        this.f352074g.removeCallbacks(this.f352080p);
    }

    /* renamed from: e */
    public void mo182448e() {
        this.f352074g.postDelayed(this.f352080p, 330000);
    }
}
