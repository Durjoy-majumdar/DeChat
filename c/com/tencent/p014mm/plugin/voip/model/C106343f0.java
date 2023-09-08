package com.tencent.p014mm.plugin.voip.model;

import android.os.Looper;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import l33.C109247e;

/* renamed from: com.tencent.mm.plugin.voip.model.f0 */
public class C106343f0 {

    /* renamed from: l */
    public static C106343f0 f317299l;

    /* renamed from: a */
    public int f317300a = 0;

    /* renamed from: b */
    public v2protocal f317301b = new v2protocal(new MMHandler(Looper.getMainLooper()));

    /* renamed from: c */
    public boolean f317302c = false;

    /* renamed from: d */
    public boolean f317303d = false;

    /* renamed from: e */
    public long f317304e = -1;

    /* renamed from: f */
    public WeakReference<C106347d> f317305f;

    /* renamed from: g */
    public boolean f317306g = false;

    /* renamed from: h */
    public int f317307h = 0;

    /* renamed from: i */
    public int f317308i;

    /* renamed from: j */
    public int f317309j;

    /* renamed from: k */
    public MTimerHandler f317310k = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C106344a(), true);

    /* renamed from: com.tencent.mm.plugin.voip.model.f0$a */
    public class C106344a implements MTimerHandler.CallBack {
        public C106344a() {
        }

        public boolean onTimerExpired() {
            C106347d dVar;
            C106347d dVar2;
            C106347d dVar3;
            C106343f0 f0Var = C106343f0.this;
            if (!f0Var.f317306g) {
                return false;
            }
            byte[] bArr = new byte[4];
            f0Var.f317301b.setAppCmd(54, bArr, 1);
            if (bArr[0] == 1) {
                C106343f0 f0Var2 = C106343f0.this;
                if (f0Var2.f317300a != 1) {
                    v2protocal.f317537X1++;
                }
                v2protocal.f317539Z1++;
                if (!f0Var2.f317303d && C109247e.zx0()) {
                    f0Var2.f317303d = true;
                    Log.m105924i("MicroMsg.VoipNetStatusChecker", "onNetWorkChangeToMobileNet");
                    WeakReference<C106347d> weakReference = f0Var2.f317305f;
                    if (!(weakReference == null || (dVar3 = weakReference.get()) == null)) {
                        dVar3.mo150073w();
                    }
                }
                C106343f0 f0Var3 = C106343f0.this;
                f0Var3.getClass();
                if (C109247e.zx0()) {
                    f0Var3.f317303d = true;
                    Log.m105924i("MicroMsg.VoipNetStatusChecker", "onNetWorkCostMax");
                    WeakReference<C106347d> weakReference2 = f0Var3.f317305f;
                    if (!(weakReference2 == null || (dVar2 = weakReference2.get()) == null)) {
                        dVar2.mo150072r();
                    }
                }
            }
            C106343f0 f0Var4 = C106343f0.this;
            f0Var4.f317300a = bArr[0];
            byte[] bArr2 = new byte[4];
            int[] iArr = {-1, -1};
            if (f0Var4.f317301b.setAppCmd(10, bArr2, 4) < 0) {
                Log.m105918d("MicroMsg.VoipNetStatusChecker", "get netStatus failed");
            } else {
                int byteArrayToInt = Util.byteArrayToInt(bArr2);
                iArr[0] = byteArrayToInt;
                if (byteArrayToInt >= 0 && byteArrayToInt < 5) {
                    iArr[1] = f0Var4.f317301b.GetNetBottleneckSide();
                    Log.m105925i("MicroMsg.VoipNetStatusChecker", "netStatus: %d net_bottleneck_side %d", Integer.valueOf(byteArrayToInt), Integer.valueOf(iArr[1]));
                }
            }
            int i = iArr[0];
            if (i != -1) {
                C106343f0 f0Var5 = C106343f0.this;
                f0Var5.getClass();
                f0Var5.f317308i += i;
                f0Var5.f317309j++;
                int i2 = iArr[1];
                if (i < 5) {
                    if (i2 != -1) {
                        if (i2 == 0) {
                            f0Var5.mo152576c(true);
                        }
                        if (i2 == 1) {
                            f0Var5.mo152576c(false);
                        }
                    }
                } else if (f0Var5.f317302c) {
                    if (f0Var5.f317307h < 1) {
                        Log.m105918d("MicroMsg.VoipNetStatusChecker", "ignore this good net status");
                        f0Var5.f317307h++;
                    } else {
                        f0Var5.f317302c = false;
                        Log.m105918d("MicroMsg.VoipNetStatusChecker", "go to good net status");
                        WeakReference<C106347d> weakReference3 = f0Var5.f317305f;
                        if (!(weakReference3 == null || (dVar = weakReference3.get()) == null)) {
                            dVar.mo150059b();
                        }
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.f0$b */
    public class C106345b implements Runnable {
        public C106345b() {
        }

        public void run() {
            C106343f0.this.f317310k.startTimer(2000);
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.f0$c */
    public class C106346c implements Runnable {
        public C106346c() {
        }

        public void run() {
            C106343f0.this.f317310k.stopTimer();
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.model.f0$d */
    public interface C106347d {
        /* renamed from: H */
        void mo150057H(boolean z);

        /* renamed from: b */
        void mo150059b();

        /* renamed from: r */
        void mo150072r();

        /* renamed from: w */
        void mo150073w();
    }

    /* renamed from: a */
    public static C106343f0 m143231a() {
        if (f317299l == null) {
            f317299l = new C106343f0();
        }
        return f317299l;
    }

    /* renamed from: b */
    public void mo152575b(C106347d dVar) {
        this.f317305f = new WeakReference<>(dVar);
    }

    /* renamed from: c */
    public void mo152576c(boolean z) {
        C106347d dVar;
        if (z) {
            v2protocal.f317540a2++;
            Log.m105924i("MicroMsg.VoipNetStatusChecker", "my network bad");
        } else {
            v2protocal.f317541b2++;
            Log.m105924i("MicroMsg.VoipNetStatusChecker", "otherside network bad");
        }
        this.f317307h = 0;
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f317302c) {
            long j = this.f317304e;
            if (j == -1 || currentTimeMillis - j >= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                this.f317302c = true;
                this.f317304e = currentTimeMillis;
                Log.m105918d("MicroMsg.VoipNetStatusChecker", "go to bad net status");
                WeakReference<C106347d> weakReference = this.f317305f;
                if (weakReference != null && (dVar = weakReference.get()) != null) {
                    dVar.mo150057H(z);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo152577d() {
        Log.m105918d("MicroMsg.VoipNetStatusChecker", "startNetStatusCheck");
        this.f317304e = -1;
        this.f317306g = true;
        this.f317309j = 0;
        this.f317308i = 0;
        this.f317300a = 0;
        MMHandlerThread.postToMainThreadDelayed(new C106345b(), 3000);
    }

    /* renamed from: e */
    public void mo152578e() {
        Log.m105918d("MicroMsg.VoipNetStatusChecker", "stopNetStatusCheck");
        this.f317304e = -1;
        this.f317302c = false;
        this.f317303d = false;
        this.f317306g = false;
        this.f317309j = 0;
        this.f317308i = 0;
        MMHandlerThread.postToMainThread(new C106346c());
    }
}
