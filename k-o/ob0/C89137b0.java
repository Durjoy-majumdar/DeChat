package ob0;

import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.autogen.events.AccountExpiredEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.observer.MvvmObserverOwner;
import com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import qb0.C47798b;
import qb0.C77306a;
import qb0.C77307c;
import qb0.C77308f;
import qb0.C89587e;
import sf0.C36667o0;

/* renamed from: ob0.b0 */
public final class C89137b0 implements C11385n, C114668z {

    /* renamed from: w */
    public static C89137b0 f256807w = null;

    /* renamed from: x */
    public static int f256808x = 1;

    /* renamed from: d */
    public C114770g f256809d;

    /* renamed from: e */
    public MMHandlerThread f256810e = null;

    /* renamed from: f */
    public Vector<C117747y> f256811f = new Vector<>();

    /* renamed from: g */
    public Vector<C117747y> f256812g = new Vector<>();

    /* renamed from: h */
    public final Map<Integer, Set<C11385n>> f256813h = new HashMap();

    /* renamed from: i */
    public final MMHandler f256814i = new b0$$c(this, Looper.getMainLooper());

    /* renamed from: j */
    public boolean f256815j = false;

    /* renamed from: n */
    public Boolean f256816n = null;

    /* renamed from: o */
    public final Object f256817o = new Object();

    /* renamed from: p */
    public final C89587e f256818p = new C89587e();

    /* renamed from: q */
    public final C36667o0 f256819q = new C36667o0("clicfg_netscenequeue_threadpool_enable");

    /* renamed from: r */
    public final Set f256820r = new HashSet(Arrays.asList(new Integer[]{522, Integer.valueOf(WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO), 110, 149, 6828, 127}));

    /* renamed from: s */
    public final b0$$h f256821s;

    /* renamed from: t */
    public long f256822t = 21600000;

    /* renamed from: u */
    public boolean f256823u = false;

    /* renamed from: v */
    public MTimerHandler f256824v = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new b0$$b(this), true);

    public C89137b0(b0$$h b0__h) {
        this.f256821s = b0__h;
        AppForegroundDelegate.INSTANCE.mo174208a(this);
    }

    /* renamed from: a */
    public void mo123455a(int i, C11385n nVar) {
        synchronized (this.f256813h) {
            Set set = (Set) ((HashMap) this.f256813h).get(Integer.valueOf(i));
            if (set == null) {
                set = new HashSet(16);
                ((HashMap) this.f256813h).put(Integer.valueOf(i), set);
            }
            synchronized (set) {
                if (set.add(nVar)) {
                    ListenerInstanceMonitor.markInstanceRegistered(nVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo123456b(int i, int i2, String str, C117747y yVar) {
        MMApplicationContext.getContext();
        int i3 = i;
        int i4 = i2;
        this.f256814i.post(new b0$$g(this, yVar, i3, i4, str));
        this.f256818p.notify(Integer.valueOf(yVar.getType()), new C77307c(C47798b.OnEnd, i3, i4, Util.nullAs(str, ""), yVar), false);
    }

    /* renamed from: c */
    public void mo123457c(int i) {
        Log.printInfoStack("MicroMsg.NetSceneQueue", "cancel sceneHashCode:%d", Integer.valueOf(i));
        C36667o0 o0Var = this.f256819q;
        b0$$e b0__e = new b0$$e(this, i);
        o0Var.getClass();
        o0Var.mo60790a(b0__e, 0, true);
    }

    /* renamed from: d */
    public void mo123458d(C117747y yVar) {
        if (yVar != null) {
            Log.printInfoStack("MicroMsg.NetSceneQueue", "cancel sceneHashCode:%d", Integer.valueOf(yVar.hashCode()));
            yVar.cancel();
            synchronized (this.f256817o) {
                this.f256812g.remove(yVar);
                this.f256811f.remove(yVar);
            }
        }
    }

    /* renamed from: e */
    public void mo123459e() {
        synchronized (this.f256817o) {
            Vector<C117747y> vector = this.f256811f;
            this.f256811f = new Vector<>();
            for (C117747y next : vector) {
                Log.m105924i("MicroMsg.NetSceneQueue", "reset::cancel scene " + next.getType());
                next.cancel();
                mo123456b(3, -1, "doScene failed clearRunningQueue", next);
            }
            vector.clear();
        }
    }

    /* renamed from: f */
    public boolean mo123460f(C117747y yVar) {
        return mo123461g(yVar, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x01eb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ec  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo123461g(ob0.C117747y r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            if (r8 != 0) goto L_0x0009
            if (r9 < 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            r2 = 0
            goto L_0x000a
        L_0x0009:
            r2 = 1
        L_0x000a:
            junit.framework.Assert.assertTrue(r2)
            java.lang.String r2 = "worker thread has not been set"
            com.tencent.mm.sdk.platformtools.MMHandlerThread r3 = r7.f256810e
            if (r3 == 0) goto L_0x0016
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            junit.framework.Assert.assertTrue(r2, r3)
            int r2 = r8.getType()
            boolean r3 = r8.uniqueInNetsceneQueue()
            if (r3 == 0) goto L_0x01e8
            java.lang.Object r3 = r7.f256817o
            monitor-enter(r3)
            java.util.Vector<ob0.y> r4 = r7.f256811f     // Catch:{ all -> 0x01e5 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x01e5 }
        L_0x002d:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x01e5 }
            if (r5 == 0) goto L_0x0122
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x01e5 }
            ob0.y r5 = (ob0.C117747y) r5     // Catch:{ all -> 0x01e5 }
            int r6 = r5.getType()     // Catch:{ all -> 0x01e5 }
            if (r6 != r2) goto L_0x002d
            java.lang.String r2 = "MicroMsg.NetSceneQueue"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e5 }
            r4.<init>()     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = "forbid in running: type="
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            int r6 = r8.getType()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = " id="
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            int r6 = r8.hashCode()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = " cur_running_cnt="
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.util.Vector<ob0.y> r6 = r7.f256811f     // Catch:{ all -> 0x01e5 }
            int r6 = r6.size()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01e5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ all -> 0x01e5 }
            boolean r2 = r8.acceptConcurrent(r5)     // Catch:{ all -> 0x01e5 }
            if (r2 == 0) goto L_0x007c
            monitor-exit(r3)     // Catch:{ all -> 0x01e5 }
            goto L_0x01e8
        L_0x007c:
            boolean r2 = r8.accept(r5)     // Catch:{ all -> 0x01e5 }
            if (r2 == 0) goto L_0x011e
            java.lang.String r2 = "MicroMsg.NetSceneQueue"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e5 }
            r4.<init>()     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = "forbid in running diagnostic: type="
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            int r6 = r8.getType()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = " id="
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            int r6 = r8.hashCode()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = " cur_running_cnt="
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.util.Vector<ob0.y> r6 = r7.f256811f     // Catch:{ all -> 0x01e5 }
            int r6 = r6.size()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = " ---"
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            int r6 = r5.hashCode()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01e5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)     // Catch:{ all -> 0x01e5 }
            boolean r2 = r7.f256815j     // Catch:{ all -> 0x01e5 }
            if (r2 != 0) goto L_0x0118
            java.lang.String r2 = "MicroMsg.NetSceneQueue"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e5 }
            r4.<init>()     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = "forbid in running diagnostic: type="
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            int r6 = r8.getType()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = "acinfo["
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = r5.getInfo()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = "] scinfo["
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = r8.getInfo()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = "]"
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01e5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)     // Catch:{ all -> 0x01e5 }
            com.tencent.p014mm.sdk.platformtools.Log.appenderFlush()     // Catch:{ all -> 0x01e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e5 }
            r2.<init>()     // Catch:{ all -> 0x01e5 }
            java.lang.String r4 = "NetsceneQueue forbid in running diagnostic: type="
            r2.append(r4)     // Catch:{ all -> 0x01e5 }
            int r4 = r8.getType()     // Catch:{ all -> 0x01e5 }
            r2.append(r4)     // Catch:{ all -> 0x01e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01e5 }
            junit.framework.Assert.assertTrue(r2, r0)     // Catch:{ all -> 0x01e5 }
        L_0x0118:
            r7.mo123458d(r5)     // Catch:{ all -> 0x01e5 }
            monitor-exit(r3)     // Catch:{ all -> 0x01e5 }
            goto L_0x01e8
        L_0x011e:
            monitor-exit(r3)     // Catch:{ all -> 0x01e5 }
        L_0x011f:
            r2 = 0
            goto L_0x01e9
        L_0x0122:
            java.util.Vector<ob0.y> r4 = r7.f256812g     // Catch:{ all -> 0x01e5 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x01e5 }
        L_0x0128:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x01e5 }
            if (r5 == 0) goto L_0x01e3
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x01e5 }
            ob0.y r5 = (ob0.C117747y) r5     // Catch:{ all -> 0x01e5 }
            int r6 = r5.getType()     // Catch:{ all -> 0x01e5 }
            if (r6 != r2) goto L_0x0128
            java.lang.String r2 = "MicroMsg.NetSceneQueue"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e5 }
            r4.<init>()     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = "forbid in waiting: type="
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            int r6 = r8.getType()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = " id="
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            int r6 = r8.hashCode()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = " cur_waiting_cnt="
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.util.Vector<ob0.y> r6 = r7.f256812g     // Catch:{ all -> 0x01e5 }
            int r6 = r6.size()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01e5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ all -> 0x01e5 }
            boolean r2 = r8.acceptConcurrent(r5)     // Catch:{ all -> 0x01e5 }
            if (r2 == 0) goto L_0x0176
            monitor-exit(r3)     // Catch:{ all -> 0x01e5 }
            goto L_0x01e8
        L_0x0176:
            boolean r2 = r8.accept(r5)     // Catch:{ all -> 0x01e5 }
            if (r2 == 0) goto L_0x01e0
            java.lang.String r2 = "MicroMsg.NetSceneQueue"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e5 }
            r4.<init>()     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = "forbid in waiting diagnostic: type="
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            int r6 = r8.getType()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = " id="
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            int r6 = r8.hashCode()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = " cur_waiting_cnt="
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.util.Vector<ob0.y> r6 = r7.f256812g     // Catch:{ all -> 0x01e5 }
            int r6 = r6.size()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r6 = " ---"
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            int r6 = r5.hashCode()     // Catch:{ all -> 0x01e5 }
            r4.append(r6)     // Catch:{ all -> 0x01e5 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01e5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)     // Catch:{ all -> 0x01e5 }
            boolean r2 = r7.f256815j     // Catch:{ all -> 0x01e5 }
            if (r2 != 0) goto L_0x01db
            com.tencent.p014mm.sdk.platformtools.Log.appenderFlush()     // Catch:{ all -> 0x01e5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e5 }
            r2.<init>()     // Catch:{ all -> 0x01e5 }
            java.lang.String r4 = "NetsceneQueue forbid in waiting diagnostic: type="
            r2.append(r4)     // Catch:{ all -> 0x01e5 }
            int r4 = r8.getType()     // Catch:{ all -> 0x01e5 }
            r2.append(r4)     // Catch:{ all -> 0x01e5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01e5 }
            junit.framework.Assert.assertTrue(r2, r0)     // Catch:{ all -> 0x01e5 }
        L_0x01db:
            r7.mo123458d(r5)     // Catch:{ all -> 0x01e5 }
            monitor-exit(r3)     // Catch:{ all -> 0x01e5 }
            goto L_0x01e8
        L_0x01e0:
            monitor-exit(r3)     // Catch:{ all -> 0x01e5 }
            goto L_0x011f
        L_0x01e3:
            monitor-exit(r3)     // Catch:{ all -> 0x01e5 }
            goto L_0x01e8
        L_0x01e5:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01e5 }
            throw r8
        L_0x01e8:
            r2 = 1
        L_0x01e9:
            if (r2 != 0) goto L_0x01ec
            return r0
        L_0x01ec:
            r7.mo123462h(r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ob0.C89137b0.mo123461g(ob0.y, int):boolean");
    }

    /* renamed from: h */
    public final void mo123462h(C117747y yVar, int i) {
        boolean z = this.f256811f.size() < 50;
        int size = this.f256811f.size();
        Object[] objArr = new Object[8];
        objArr[0] = Integer.valueOf(yVar.getType());
        objArr[1] = Integer.valueOf(yVar.hashCode());
        objArr[2] = Integer.valueOf(yVar.getMMReqRespHash());
        objArr[3] = Integer.valueOf(size);
        objArr[4] = Integer.valueOf(this.f256812g.size());
        objArr[5] = Integer.valueOf(i);
        objArr[6] = Boolean.valueOf(z);
        C114770g gVar = this.f256809d;
        objArr[7] = Integer.valueOf(gVar == null ? 0 : gVar.hashCode());
        Log.m105925i("MicroMsg.NetSceneQueue", "doSceneImp start: mmcgi type:%d hash[%d,%d] run:%d wait:%d afterSec:%d canDo:%b autoauth:%d", objArr);
        if (i == 0 && z && this.f256809d != null) {
            synchronized (this.f256817o) {
                this.f256811f.add(yVar);
                if (size == this.f256811f.size()) {
                    Log.m105929w("MicroMsg.NetSceneQueue", "doSceneImp mmcgi  Add to runningQueue wrong  type:%d hash:%d run:[%d ,%d] wait:%d ", Integer.valueOf(yVar.getType()), Integer.valueOf(yVar.hashCode()), Integer.valueOf(size), Integer.valueOf(this.f256811f.size()), Integer.valueOf(this.f256812g.size()));
                }
            }
            C36667o0 o0Var = this.f256819q;
            b0$$f b0__f = new b0$$f(this, yVar);
            boolean contains = ((HashSet) this.f256820r).contains(Integer.valueOf(yVar.getType()));
            o0Var.getClass();
            o0Var.mo60790a(b0__f, 0, contains);
        } else if (i > 0) {
            Message obtain = Message.obtain();
            obtain.obj = yVar;
            this.f256814i.sendMessageDelayed(obtain, (long) i);
            Log.m105924i("MicroMsg.NetSceneQueue", "timed: type=" + yVar.getType() + " id=" + yVar.hashCode() + " cur_after_sec=" + i);
        } else {
            Log.m105924i("MicroMsg.NetSceneQueue", "waited: type=" + yVar.getType() + " id=" + yVar.hashCode() + " cur_waiting_cnt=" + this.f256812g.size());
            synchronized (this.f256817o) {
                this.f256812g.add(yVar);
            }
            Log.m105924i("MicroMsg.NetSceneQueue", "waitingQueue_size = " + this.f256812g.size());
        }
        if (this.f256809d == null) {
            b0$$h b0__h = this.f256821s;
            if (b0__h == null) {
                Log.m105921e("MicroMsg.NetSceneQueue", "prepare dispatcher failed, queue idle:%s", b0__h);
                return;
            }
            b0__h.mo72833k(this);
            new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C89141e0(this), true).startTimer((long) (f256808x * 100));
            int i2 = f256808x;
            if (i2 < 512) {
                f256808x = i2 * 2;
                return;
            }
            return;
        }
        f256808x = 1;
    }

    /* renamed from: i */
    public void mo123463i() {
        C114770g gVar = this.f256809d;
        if (gVar == null) {
            Log.m105920e("MicroMsg.NetSceneQueue", "flushPushLog autoAuth  == null");
        } else {
            gVar.mo55450I4();
        }
    }

    /* renamed from: j */
    public C114770g mo123464j() {
        return this.f256809d;
    }

    /* renamed from: k */
    public String mo123465k() {
        C114770g gVar = this.f256809d;
        return gVar != null ? gVar.mo55459S4() : "unknown";
    }

    /* renamed from: l */
    public boolean mo123466l() {
        C114770g gVar = this.f256809d;
        if (gVar != null) {
            return gVar.mo55476h1();
        }
        return true;
    }

    /* renamed from: m */
    public int mo123467m() {
        try {
            C114770g gVar = this.f256809d;
            if (gVar != null && gVar.mo55465Z5() != null) {
                return this.f256809d.mo55465Z5().mo112946wL();
            }
            Log.m105920e("MicroMsg.NetSceneQueue", "[arthurdan.getNetworkStatus] Notice!!! autoAuth and autoAuth.getNetworkEvent() is null!!!!");
            return NetStatusUtil.isConnected(MMApplicationContext.getContext()) ? 6 : 0;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NetSceneQueue", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: n */
    public void mo123468n(int i, C0125s sVar, C77306a aVar) {
        if (i != -1) {
            this.f256818p.mo123895a(i, sVar, MvvmObserverOwner.MainThread, aVar);
            return;
        }
        throw new IllegalArgumentException("BROADCAST TYPE Not support, use add addSceneEndListener");
    }

    /* renamed from: o */
    public void mo123469o(int i, C11385n nVar) {
        if (i != -1) {
            this.f256818p.removeObserver(Integer.valueOf(i), new C77308f(nVar));
            return;
        }
        throw new IllegalArgumentException("BROADCAST TYPE Not support, use add removeSceneEndListener");
    }

    public void onAppBackground(String str) {
        Log.m105924i("MicroMsg.NetSceneQueue", "onAppBackground");
        this.f256815j = false;
        this.f256816n = Boolean.FALSE;
        CrashReportFactory.setForeground(false);
        C114770g gVar = this.f256809d;
        if (gVar == null) {
            Log.m105920e("MicroMsg.NetSceneQueue", "setForeground autoAuth  == null");
        } else {
            gVar.mo55460T0(false);
        }
    }

    public void onAppForeground(String str) {
        Log.m105924i("MicroMsg.NetSceneQueue", "onAppForeground");
        this.f256815j = true;
        this.f256816n = Boolean.TRUE;
        CrashReportFactory.setForeground(true);
        C114770g gVar = this.f256809d;
        if (gVar == null) {
            Log.m105920e("MicroMsg.NetSceneQueue", "setForeground autoAuth  == null");
        } else {
            gVar.mo55460T0(true);
        }
        mo123474t(false);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        yVar.setHasCallbackToQueue(true);
        synchronized (this.f256817o) {
            this.f256811f.remove(yVar);
        }
        Object[] objArr = new Object[9];
        int i3 = 0;
        objArr[0] = Integer.valueOf(yVar.getType());
        objArr[1] = Integer.valueOf(yVar.hashCode());
        objArr[2] = Integer.valueOf(yVar.getMMReqRespHash());
        objArr[3] = Integer.valueOf(this.f256811f.size());
        objArr[4] = Integer.valueOf(this.f256812g.size());
        C114770g gVar = this.f256809d;
        if (gVar != null) {
            i3 = gVar.hashCode();
        }
        objArr[5] = Integer.valueOf(i3);
        objArr[6] = Integer.valueOf(i);
        objArr[7] = Integer.valueOf(i2);
        objArr[8] = str;
        Log.m105925i("MicroMsg.NetSceneQueue", "onSceneEnd mmcgi type:%d hash[%d,%d] run:%d wait:%d autoauth:%d [%d,%d,%s]", objArr);
        if (i == 4 && (i2 == -100 || i2 == -2023)) {
            AccountExpiredEvent accountExpiredEvent = new AccountExpiredEvent();
            AccountExpiredEvent.C28699a aVar = accountExpiredEvent.f78702d;
            aVar.f78703a = i;
            aVar.f78704b = i2;
            aVar.f78705c = str;
            accountExpiredEvent.publish();
        }
        mo123475u();
        mo123456b(i, i2, str, yVar);
        if (this.f256823u && this.f256811f.isEmpty() && this.f256812g.isEmpty()) {
            this.f256824v.startTimer(this.f256822t);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: p */
    public void mo123470p(int r3, ob0.C11385n r4) {
        /*
            r2 = this;
            java.util.Map<java.lang.Integer, java.util.Set<ob0.n>> r0 = r2.f256813h
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, java.util.Set<ob0.n>> r1 = r2.f256813h     // Catch:{ Exception -> 0x0024 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0024 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x0024 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ Exception -> 0x0024 }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ Exception -> 0x0024 }
            if (r3 == 0) goto L_0x0024
            monitor-enter(r3)     // Catch:{ Exception -> 0x0024 }
            boolean r1 = r3.remove(r4)     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001d
            com.tencent.p014mm.sdk.platformtools.ListenerInstanceMonitor.markInstanceUnregistered(r4)     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r3)     // Catch:{ all -> 0x001f }
            goto L_0x0024
        L_0x001f:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x001f }
            throw r4     // Catch:{ Exception -> 0x0024 }
        L_0x0022:
            r3 = move-exception
            goto L_0x0026
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ob0.C89137b0.mo123470p(int, ob0.n):void");
    }

    /* renamed from: q */
    public void mo123471q() {
        Log.m105924i("MicroMsg.NetSceneQueue", "reset");
        C114770g gVar = this.f256809d;
        if (gVar != null) {
            gVar.reset();
        }
        mo123459e();
        synchronized (this.f256817o) {
            Vector<C117747y> vector = this.f256812g;
            this.f256812g = new Vector<>();
            Iterator<C117747y> it = vector.iterator();
            while (it.hasNext()) {
                C117747y next = it.next();
                Log.m105924i("MicroMsg.NetSceneQueue", "reset::cancel scene " + next.getType());
                next.cancel();
                mo123456b(3, -1, "doScene failed clearWaitingQueue", next);
            }
            vector.clear();
        }
        this.f256818p.reset();
    }

    /* renamed from: r */
    public void mo123472r() {
        Log.m105924i("MicroMsg.NetSceneQueue", "resetDispatcher");
        C114770g gVar = this.f256809d;
        if (gVar != null) {
            gVar.reset();
            this.f256809d = null;
        }
    }

    /* renamed from: s */
    public void mo123473s(C114770g gVar) {
        this.f256809d = gVar;
        gVar.mo55461T2(new b0$$d(this));
        gVar.mo55460T0(this.f256815j);
        mo123475u();
    }

    /* renamed from: t */
    public void mo123474t(boolean z) {
        this.f256823u = z;
        if (!z) {
            this.f256824v.stopTimer();
            return;
        }
        Log.m105920e("MicroMsg.NetSceneQueue", "the working process is ready to be killed");
        this.f256824v.startTimer(this.f256822t);
    }

    /* renamed from: u */
    public final void mo123475u() {
        synchronized (this.f256817o) {
            if (this.f256812g.size() > 0) {
                C117747y yVar = this.f256812g.get(0);
                int priority = yVar.getPriority();
                for (int i = 1; i < this.f256812g.size(); i++) {
                    if (this.f256812g.get(i).getPriority() > priority) {
                        C117747y yVar2 = this.f256812g.get(i);
                        if (this.f256811f.size() < 50) {
                            yVar = this.f256812g.get(i);
                            priority = yVar.getPriority();
                        }
                    }
                }
                this.f256812g.remove(yVar);
                Log.m105924i("MicroMsg.NetSceneQueue", "waiting2running waitingQueue_size = " + this.f256812g.size());
                mo123462h(yVar, 0);
            }
        }
    }
}
