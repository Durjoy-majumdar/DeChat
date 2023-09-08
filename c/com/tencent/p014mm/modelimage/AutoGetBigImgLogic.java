package com.tencent.p014mm.modelimage;

import android.net.TrafficStats;
import android.os.Process;
import android.text.format.DateFormat;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AutoGetBigImgOccChangedEvent;
import com.tencent.p014mm.autogen.events.PauseAutoGetBigImgEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import i21.C98591h;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Stack;
import ob0.C117747y;
import p158gt.C76051j;
import p182kk.C61104a;
import xb0.C38474f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.modelimage.AutoGetBigImgLogic */
public class AutoGetBigImgLogic implements C76051j.C76052a {

    /* renamed from: d */
    public Stack<Long> f267186d;

    /* renamed from: e */
    public long f267187e = 0;

    /* renamed from: f */
    public int f267188f = 0;

    /* renamed from: g */
    public boolean f267189g = false;

    /* renamed from: h */
    public long f267190h = 0;

    /* renamed from: i */
    public int f267191i = 0;

    /* renamed from: j */
    public boolean f267192j = false;

    /* renamed from: n */
    public long f267193n = 0;

    /* renamed from: o */
    public long f267194o = 0;

    /* renamed from: p */
    public int f267195p;

    /* renamed from: q */
    public int f267196q;

    /* renamed from: r */
    public MTimerHandler f267197r = new MTimerHandler(new C92803a(), false);

    /* renamed from: s */
    public IListener f267198s;

    /* renamed from: t */
    public IListener f267199t;

    /* renamed from: com.tencent.mm.modelimage.AutoGetBigImgLogic$a */
    public class C92803a implements MTimerHandler.CallBack {
        public C92803a() {
        }

        public boolean onTimerExpired() {
            long uidRxBytes = TrafficStats.getUidRxBytes(AutoGetBigImgLogic.this.f267195p);
            long uidTxBytes = TrafficStats.getUidTxBytes(AutoGetBigImgLogic.this.f267195p);
            AutoGetBigImgLogic autoGetBigImgLogic = AutoGetBigImgLogic.this;
            long j = (uidRxBytes - autoGetBigImgLogic.f267193n) + (uidTxBytes - autoGetBigImgLogic.f267194o);
            Log.m105918d("MicroMsg.AutoGetBigImgLogic", "delta of data: " + (j / 1024));
            if (j <= 20480) {
                AutoGetBigImgLogic autoGetBigImgLogic2 = AutoGetBigImgLogic.this;
                autoGetBigImgLogic2.f267192j = false;
                ((C119157j) C119157j.f356862d).mo183876g(new C92804b(autoGetBigImgLogic2), "AutoGetBigImgLogic.Task");
                return true;
            }
            AutoGetBigImgLogic autoGetBigImgLogic3 = AutoGetBigImgLogic.this;
            autoGetBigImgLogic3.f267193n = uidRxBytes;
            autoGetBigImgLogic3.f267194o = uidTxBytes;
            autoGetBigImgLogic3.f267197r.startTimer(1000);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.modelimage.AutoGetBigImgLogic$b */
    public static class C92804b implements Runnable {

        /* renamed from: d */
        public final WeakReference<AutoGetBigImgLogic> f267202d;

        public C92804b(AutoGetBigImgLogic autoGetBigImgLogic) {
            this.f267202d = new WeakReference<>(autoGetBigImgLogic);
        }

        public void run() {
            AutoGetBigImgLogic autoGetBigImgLogic = this.f267202d.get();
            if (autoGetBigImgLogic != null) {
                boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_pause_other_preload_android, false);
                VoipEvent voipEvent = new VoipEvent();
                voipEvent.f194019d.f194022b = 2;
                voipEvent.publish();
                if ((!voipEvent.f194020e.f194028b && !C61104a.m71644D()) || !wf) {
                    if (!autoGetBigImgLogic.f267189g && System.currentTimeMillis() - autoGetBigImgLogic.f267190h > 1200000) {
                        Log.m105924i("MicroMsg.AutoGetBigImgLogic", "running to long in blackground");
                    } else if (autoGetBigImgLogic.f267187e != 0 || autoGetBigImgLogic.f267186d.size() <= 0 || autoGetBigImgLogic.f267191i != 0 || autoGetBigImgLogic.f267192j) {
                        Log.m105924i("MicroMsg.AutoGetBigImgLogic", "curMsgId: " + autoGetBigImgLogic.f267187e + " size: " + autoGetBigImgLogic.f267186d.size() + " cnt: " + autoGetBigImgLogic.f267191i + " pauseOnMonitor: " + autoGetBigImgLogic.f267192j);
                    } else {
                        synchronized (autoGetBigImgLogic.f267186d) {
                            autoGetBigImgLogic.f267187e = autoGetBigImgLogic.f267186d.pop().longValue();
                        }
                        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(autoGetBigImgLogic.f267187e);
                        C92836k NQ = C92837k0.Bx0().mo127168NQ(b002.mo108768t(), b002.mo108774y2());
                        if (NQ.f267392s == 1) {
                            Log.m105924i("MicroMsg.AutoGetBigImgLogic", autoGetBigImgLogic.f267187e + " already has hd thumb");
                            autoGetBigImgLogic.f267187e = 0;
                            ((C119157j) C119157j.f356862d).mo183876g(new C92804b(autoGetBigImgLogic), "AutoGetBigImgLogic.Task");
                            return;
                        }
                        Log.m105924i("MicroMsg.AutoGetBigImgLogic", "start download cdnautostart " + autoGetBigImgLogic.f267187e + "  image_" + b002.getMsgId());
                        HashSet<String> hashSet = C92779i0.Ex0().f266896t;
                        StringBuilder sb = new StringBuilder();
                        sb.append("image_");
                        sb.append(b002.getMsgId());
                        hashSet.add(sb.toString());
                        C92822e yx02 = C92837k0.yx0();
                        long j = NQ.f267374a;
                        yx02.mo127101c(j, b002.getMsgId(), 0, Long.valueOf(autoGetBigImgLogic.f267187e), autoGetBigImgLogic.f267188f, autoGetBigImgLogic);
                    }
                }
            }
        }
    }

    public AutoGetBigImgLogic() {
        C40008f fVar = C40008f.f107254d;
        this.f267198s = new IListener<PauseAutoGetBigImgEvent>(fVar) {
            {
                this.__eventId = -27874186;
            }

            public boolean callback(IEvent iEvent) {
                PauseAutoGetBigImgEvent pauseAutoGetBigImgEvent = (PauseAutoGetBigImgEvent) iEvent;
                AutoGetBigImgLogic autoGetBigImgLogic = AutoGetBigImgLogic.this;
                int i = autoGetBigImgLogic.f267191i + (pauseAutoGetBigImgEvent.f264980d.f264981a ? 1 : -1);
                autoGetBigImgLogic.f267191i = i;
                if (i < 0) {
                    autoGetBigImgLogic.f267191i = 0;
                    Log.m105920e("MicroMsg.AutoGetBigImgLogic", "mPauseCnt < 0");
                }
                Log.m105924i("MicroMsg.AutoGetBigImgLogic", "req pause: " + pauseAutoGetBigImgEvent.f264980d.f264981a + " count:" + AutoGetBigImgLogic.this.f267191i);
                AutoGetBigImgLogic autoGetBigImgLogic2 = AutoGetBigImgLogic.this;
                autoGetBigImgLogic2.getClass();
                ((C119157j) C119157j.f356862d).mo183876g(new C92804b(autoGetBigImgLogic2), "AutoGetBigImgLogic.Task");
                return false;
            }
        };
        this.f267199t = new IListener<AutoGetBigImgOccChangedEvent>(fVar) {
            {
                this.__eventId = 180423451;
            }

            public boolean callback(IEvent iEvent) {
                AutoGetBigImgLogic autoGetBigImgLogic = AutoGetBigImgLogic.this;
                ((AutoGetBigImgOccChangedEvent) iEvent).f78721d.getClass();
                autoGetBigImgLogic.f267196q = 0;
                Log.m105918d("MicroMsg.AutoGetBigImgLogic", "mode = " + AutoGetBigImgLogic.this.f267196q);
                if (!C38474f.wx0().xx0()) {
                    synchronized (AutoGetBigImgLogic.this.f267186d) {
                        AutoGetBigImgLogic.this.f267186d.clear();
                    }
                }
                return false;
            }
        };
        this.f267186d = new Stack<>();
        this.f267195p = Process.myUid();
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(327681, (Object) null);
        this.f267196q = (num == null || 3 == num.intValue()) ? 1 : num.intValue();
        this.f267198s.alive();
        this.f267199t.alive();
    }

    /* renamed from: T2 */
    public void mo102581T2(long j, long j2, int i, int i2, Object obj, int i3, int i4, String str, C117747y yVar) {
        long j3 = j;
        long j4 = j2;
        Class cls = C98591h.class;
        if (i3 == 0 && i4 == 0) {
            if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                Log.m105926v("MicroMsg.AutoGetBigImgLogic", "is wifi pass count");
            } else {
                C85801v1 i5 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_AUTOGETBIG_IMG_CURRENT_LONG;
                long nullAs = Util.nullAs((Long) i5.mo119685f(aVar, (Object) null), 0);
                long safeParseLong = Util.safeParseLong((String) DateFormat.format("M", System.currentTimeMillis()));
                long j5 = nullAs + 1;
                Log.m105919d("MicroMsg.AutoGetBigImgLogic", "img " + j3 + " msgLocalId: " + j4 + " has been downloaded current %d month %d", Long.valueOf(j5), Long.valueOf(safeParseLong));
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(j5));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_AUTOGETBIG_IMG_CURRENT_DATE_LONG, Long.valueOf(safeParseLong));
            }
            ((C98591h) C86312j.m106911c(cls)).mo137965Ez(j4, true, false);
        } else {
            Log.m105920e("MicroMsg.AutoGetBigImgLogic", "img " + j3 + "msgLocalId " + j4 + " download failed");
            ((C98591h) C86312j.m106911c(cls)).mo137965Ez(j4, false, false);
        }
        this.f267187e = 0;
        if (!C38474f.wx0().xx0()) {
            Log.m105924i("MicroMsg.AutoGetBigImgLogic", "don't allow auto download, clear task list");
            synchronized (this.f267186d) {
                this.f267186d.clear();
            }
            return;
        }
        this.f267193n = TrafficStats.getUidRxBytes(this.f267195p);
        this.f267194o = TrafficStats.getUidTxBytes(this.f267195p);
        this.f267197r.startTimer(1000);
    }

    /* renamed from: a */
    public void mo127060a(boolean z) {
        Log.m105918d("MicroMsg.AutoGetBigImgLogic", "is foreground: " + z);
        this.f267189g = z;
        this.f267190h = System.currentTimeMillis();
    }

    /* renamed from: f0 */
    public void mo102582f0(long j, long j2, int i, int i2, Object obj, int i3, int i4, C117747y yVar) {
    }

    /* renamed from: x4 */
    public void mo102583x4(long j, long j2, int i, int i2, Object obj) {
        Log.m105924i("MicroMsg.AutoGetBigImgLogic", "img " + j + " has been canceled");
        ((C98591h) C86312j.m106911c(C98591h.class)).mo137965Ez(j2, false, true);
    }
}
