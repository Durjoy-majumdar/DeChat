package sx2;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.C92614a;
import com.tencent.p014mm.plugin.talkroom.component.C115781a;
import com.tencent.p014mm.plugin.talkroom.component.C115784b;
import com.tencent.p014mm.plugin.talkroom.component.C115787c;
import com.tencent.p014mm.plugin.talkroom.component.C115790d;
import com.tencent.p014mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL;
import com.tencent.p014mm.plugin.talkroom.component.TalkRoomService;
import com.tencent.p014mm.plugin.talkroom.model.TalkRoomReceiver;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import d62.C75339i;
import dd0.C116607d;
import dd0.C45322a;
import dd0.C75345c;
import di3.C86312j;
import eb0.C97625j3;
import eb0.C97628l2;
import ed0.C75610d;
import g62.C45881a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import t22.C77833z;
import te3.C51163rv3;
import te3.ff4;
import te3.gf4;
import te3.hf4;
import tx2.C52382a;
import tx2.C52383b;
import tx2.C52384c;
import tx2.C52385d;
import tx2.C52386e;
import tx2.C52387f;
import tx2.C52388g;

/* renamed from: sx2.m */
public class C118325m implements C11385n, C45322a, C97628l2, C75345c {

    /* renamed from: d */
    public int f353645d = 0;

    /* renamed from: e */
    public int f353646e = 0;

    /* renamed from: f */
    public int f353647f = 0;

    /* renamed from: g */
    public boolean f353648g = false;

    /* renamed from: h */
    public String f353649h;

    /* renamed from: i */
    public int f353650i;

    /* renamed from: j */
    public long f353651j;

    /* renamed from: n */
    public int f353652n;

    /* renamed from: o */
    public int f353653o;

    /* renamed from: p */
    public int f353654p;

    /* renamed from: q */
    public LinkedList<ff4> f353655q = new LinkedList<>();

    /* renamed from: r */
    public C115781a f353656r;

    /* renamed from: s */
    public ILiveConEngineCallback_AIDL f353657s;

    /* renamed from: t */
    public C115790d f353658t;

    /* renamed from: u */
    public C115787c f353659u;

    /* renamed from: v */
    public MAlarmHandler f353660v;

    /* renamed from: w */
    public MTimerHandler f353661w;

    /* renamed from: x */
    public C118339u f353662x = new C118339u();

    /* renamed from: y */
    public final ServiceConnection f353663y = new C118326a();

    /* renamed from: z */
    public boolean f353664z = false;

    /* renamed from: sx2.m$a */
    public class C118326a implements ServiceConnection {

        /* renamed from: sx2.m$a$a */
        public class C118327a implements Runnable {
            public C118327a() {
            }

            public void run() {
                C118325m.this.mo183123p(true);
            }
        }

        public C118326a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.m105924i("MicroMsg.TalkRoomServer", "onServiceConnected ");
            if (iBinder == null) {
                C118325m.this.f353662x.mo183140b("enterTalkRoom bindServie or protocalInit failed", 3, -1);
                return;
            }
            C118325m mVar = C118325m.this;
            int i = C115781a.C115782a.f347356d;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
            mVar.f353656r = (queryLocalInterface == null || !(queryLocalInterface instanceof C115781a)) ? new C115781a.C115782a.C115783a(iBinder) : (C115781a) queryLocalInterface;
            if (C118325m.this.f353647f >= 2) {
                new MMHandler(Looper.getMainLooper()).post(new C118327a());
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Log.m105924i("MicroMsg.TalkRoomServer", "onServiceDisconnected ");
        }
    }

    /* renamed from: sx2.m$b */
    public class C118328b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f353667d;

        public C118328b(int i) {
            this.f353667d = i;
        }

        public void run() {
            C118325m.this.mo183113f(this.f353667d - 1);
        }
    }

    /* renamed from: sx2.m$c */
    public class C118329c implements MAlarmHandler.CallBack {
        public C118329c() {
        }

        public boolean onTimerExpired() {
            C118325m mVar = C118325m.this;
            if (mVar.f353650i == 0 || Util.isNullOrNil(mVar.f353649h)) {
                Log.m105929w("MicroMsg.TalkRoomServer", "talkNoopTimer error: roomId %d, talkUsername %s", Integer.valueOf(C118325m.this.f353650i), C118325m.this.f353649h);
                C118325m.this.f353660v = null;
                return false;
            }
            C118325m mVar2 = C118325m.this;
            String str = mVar2.f353649h;
            C97625j3.m125815e().mo123460f(new C52386e(str, mVar2.f353650i, mVar2.f353651j, mVar2.mo183119l(str)));
            return true;
        }
    }

    /* renamed from: sx2.m$d */
    public class C118330d extends C115784b.C115785a {
        public C118330d() {
        }

        /* renamed from: IV */
        public void mo176152IV(int i, int i2, boolean z) {
            if (z) {
                C118325m mVar = C118325m.this;
                mVar.f353654p = 0;
                mVar.f353662x.mo183139a("");
                return;
            }
            C118325m mVar2 = C118325m.this;
            if (i2 > mVar2.f353652n) {
                mVar2.f353652n = i2;
                if (mVar2.f353647f >= 3) {
                    mVar2.f353662x.mo183142d(311);
                }
                mVar2.mo183114g();
            }
            C118325m mVar3 = C118325m.this;
            if (mVar3.f353654p != i) {
                mVar3.f353654p = i;
                String j = mVar3.mo183117j();
                C118325m mVar4 = C118325m.this;
                if (!mVar4.f353648g && j == null) {
                    mVar4.f353648g = true;
                    int i3 = mVar4.f353650i;
                    long j2 = mVar4.f353651j;
                    String str = mVar4.f353649h;
                    C97625j3.m125815e().mo123460f(new C52384c(i3, j2, str, mVar4.mo183119l(str)));
                    C118318d.xx0().f353628j++;
                    C118318d.xx0().f353629k++;
                }
                C118325m.this.f353662x.mo183139a(j);
                PlaySound.play(MMApplicationContext.getContext(), C0966R.string.jv8);
            }
        }
    }

    public C118325m() {
        int i = TalkRoomReceiver.f347406a;
        MAlarmHandler.initAlarmBumper(new C118323k());
    }

    /* renamed from: a */
    public void mo183110a(C116607d dVar) {
        C118339u uVar = this.f353662x;
        uVar.getClass();
        synchronized (dVar) {
            if (!((LinkedList) uVar.f353679a).contains(dVar)) {
                ((LinkedList) uVar.f353679a).add(dVar);
            }
        }
        this.f353662x.mo183139a(mo183117j());
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo183111b() {
        /*
            r18 = this;
            r1 = r18
            java.util.LinkedList<te3.ff4> r0 = r1.f353655q
            int r0 = r0.size()
            r2 = 3
            java.lang.String r3 = "MicroMsg.TalkRoomServer"
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "engine. talk relay addr list is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            sx2.u r0 = r1.f353662x
            r3 = -1
            java.lang.String r4 = "engine.talk relay addr list empty"
            r0.mo183141c(r2, r3, r4)
            return
        L_0x001b:
            java.util.LinkedList<te3.ff4> r0 = r1.f353655q
            int r0 = r0.size()
            int[] r11 = new int[r0]
            java.util.LinkedList<te3.ff4> r0 = r1.f353655q
            int r0 = r0.size()
            int[] r12 = new int[r0]
            java.util.LinkedList<te3.ff4> r0 = r1.f353655q
            int r0 = r0.size()
            java.lang.String[] r14 = new java.lang.String[r0]
            r15 = 1
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.util.LinkedList<te3.ff4> r4 = r1.f353655q
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13 = 0
            r0[r13] = r4
            java.lang.String r4 = "talk relay addr cnt %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
            r4 = 0
        L_0x0049:
            java.util.LinkedList<te3.ff4> r0 = r1.f353655q
            int r0 = r0.size()
            java.lang.String r9 = ""
            r5 = 2
            if (r4 >= r0) goto L_0x00d8
            java.util.LinkedList<te3.ff4> r0 = r1.f353655q
            java.lang.Object r0 = r0.get(r4)
            te3.ff4 r0 = (te3.ff4) r0
            int r0 = r0.f133483d
            r11[r4] = r0
            java.util.LinkedList<te3.ff4> r0 = r1.f353655q
            java.lang.Object r0 = r0.get(r4)
            te3.ff4 r0 = (te3.ff4) r0
            int r0 = r0.f133484e
            r12[r4] = r0
            java.util.LinkedList<te3.ff4> r0 = r1.f353655q
            java.lang.Object r0 = r0.get(r4)
            te3.ff4 r0 = (te3.ff4) r0
            java.lang.String r0 = r0.f133485f
            r14[r4] = r0
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.util.LinkedList<te3.ff4> r0 = r1.f353655q
            java.lang.Object r0 = r0.get(r4)
            te3.ff4 r0 = (te3.ff4) r0
            int r0 = r0.f133483d
            r7 = 4
            byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x00aa }
            int r8 = r0 >>> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x00aa }
            r7[r13] = r8     // Catch:{ Exception -> 0x00aa }
            int r8 = r0 >>> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x00aa }
            r7[r15] = r8     // Catch:{ Exception -> 0x00aa }
            int r8 = r0 >>> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x00aa }
            r7[r5] = r8     // Catch:{ Exception -> 0x00aa }
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0     // Catch:{ Exception -> 0x00aa }
            r7[r2] = r0     // Catch:{ Exception -> 0x00aa }
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r7)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ Exception -> 0x00aa }
            goto L_0x00b1
        L_0x00aa:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r13]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r9, r7)
            r0 = 0
        L_0x00b1:
            r6[r13] = r0
            java.util.LinkedList<te3.ff4> r0 = r1.f353655q
            java.lang.Object r0 = r0.get(r4)
            te3.ff4 r0 = (te3.ff4) r0
            java.lang.String r0 = r0.f133485f
            r6[r15] = r0
            java.util.LinkedList<te3.ff4> r0 = r1.f353655q
            java.lang.Object r0 = r0.get(r4)
            te3.ff4 r0 = (te3.ff4) r0
            int r0 = r0.f133484e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r5] = r0
            java.lang.String r0 = "add talk relay addr [%s][%s][%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r6)
            int r4 = r4 + 1
            goto L_0x0049
        L_0x00d8:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r4 = r1.f353653o
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r13] = r4
            int r4 = r1.f353650i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r15] = r4
            long r6 = r1.f353651j
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r0[r5] = r4
            java.lang.String r4 = "engine.Open myRoomMemId %d, roomId %d, roomKey %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
            r16 = -99999(0xfffffffffffe7961, float:NaN)
            com.tencent.mm.plugin.talkroom.component.a r4 = r1.f353656r     // Catch:{ RemoteException -> 0x0120 }
            com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL r5 = r1.f353657s     // Catch:{ RemoteException -> 0x0120 }
            eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ RemoteException -> 0x0120 }
            int r6 = r0.mo105881G()     // Catch:{ RemoteException -> 0x0120 }
            int r7 = r1.f353653o     // Catch:{ RemoteException -> 0x0120 }
            int r8 = r1.f353650i     // Catch:{ RemoteException -> 0x0120 }
            r17 = r3
            long r2 = r1.f353651j     // Catch:{ RemoteException -> 0x011e }
            r0 = 0
            r15 = r9
            r9 = r2
            r2 = 0
            r13 = r0
            int r16 = r4.mo176145kg(r5, r6, r7, r8, r9, r11, r12, r13, r14)     // Catch:{ RemoteException -> 0x011c }
            r0 = r16
            r4 = r17
            goto L_0x012f
        L_0x011c:
            r0 = move-exception
            goto L_0x0125
        L_0x011e:
            r0 = move-exception
            goto L_0x0123
        L_0x0120:
            r0 = move-exception
            r17 = r3
        L_0x0123:
            r15 = r9
            r2 = 0
        L_0x0125:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = r17
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r15, r3)
            r0 = -99999(0xfffffffffffe7961, float:NaN)
        L_0x012f:
            if (r0 >= 0) goto L_0x014a
            r3 = -3
            if (r0 == r3) goto L_0x014a
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r3[r2] = r5
            java.lang.String r2 = "engine.Open error %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r3)
            sx2.u r2 = r1.f353662x
            java.lang.String r3 = "engine.Open error"
            r4 = 3
            r2.mo183141c(r4, r0, r3)
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sx2.C118325m.mo183111b():void");
    }

    /* renamed from: c */
    public void mo102000c() {
        Log.m105926v("MicroMsg.TalkRoomServer", "yy talkroom onResume");
        if (Util.isNullOrNil(this.f353649h)) {
            Log.m105918d("MicroMsg.TalkRoomServer", "pause");
        } else {
            mo183114g();
        }
        this.f353664z = false;
        C118339u uVar = this.f353662x;
        uVar.getClass();
        C118336r rVar = new C118336r(uVar);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            rVar.run();
        } else {
            uVar.f353680b.post(rVar);
        }
    }

    /* renamed from: d */
    public void mo102001d() {
        Log.m105926v("MicroMsg.TalkRoomServer", "yy talkroom onPause");
        try {
            if (Util.isNullOrNil(this.f353649h)) {
                Log.m105918d("MicroMsg.TalkRoomServer", "pause");
            } else {
                C115787c cVar = this.f353659u;
                if (cVar != null) {
                    cVar.al0();
                }
                C115790d dVar = this.f353658t;
                if (dVar != null) {
                    dVar.mo176165W();
                }
                this.f353647f = 2;
            }
        } catch (RemoteException e) {
            Log.printErrStackTrace("MicroMsg.TalkRoomServer", e, "", new Object[0]);
        }
        this.f353664z = true;
        C118339u uVar = this.f353662x;
        uVar.getClass();
        C118335q qVar = new C118335q(uVar);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            qVar.run();
        } else {
            uVar.f353680b.post(qVar);
        }
    }

    /* renamed from: e */
    public final void mo183112e() {
        this.f353647f = 1;
        this.f353648g = false;
        if (mo183120m()) {
            mo183124q();
            mo183111b();
            mo183121n();
            if (this.f353660v != null) {
                Log.m105928w("MicroMsg.TalkRoomServer", "enter talkroom not first time");
                return;
            }
            MAlarmHandler mAlarmHandler = new MAlarmHandler(new C118329c(), true);
            this.f353660v = mAlarmHandler;
            mAlarmHandler.startTimer(50000);
        }
    }

    /* renamed from: f */
    public final void mo183113f(int i) {
        if (this.f353656r != null) {
            try {
                mo183112e();
            } catch (RemoteException e) {
                Log.printErrStackTrace("MicroMsg.TalkRoomServer", e, "", new Object[0]);
            }
        } else if (i == 0) {
            this.f353662x.mo183140b("bind talkroomService timeout", 3, -1);
        } else {
            new MMHandler().postDelayed(new C118328b(i), 50);
        }
    }

    /* renamed from: g */
    public final void mo183114g() {
        try {
            C118318d.xx0().mo183108a();
            C115787c cVar = this.f353659u;
            if (cVar != null) {
                cVar.al0();
            }
            C115790d dVar = this.f353658t;
            if (dVar != null) {
                dVar.mo176166Z();
            }
            this.f353647f = 2;
        } catch (RemoteException e) {
            Log.printErrStackTrace("MicroMsg.TalkRoomServer", e, "", new Object[0]);
        }
    }

    /* renamed from: h */
    public void mo183115h(String str, int i) {
        Log.m105925i("MicroMsg.TalkRoomServer", "enterTalkRoom %s scene %d", str, Integer.valueOf(i));
        this.f353645d = i;
        if (mo183119l(str) == 1) {
            mo183125r(C118318d.wx0());
        } else {
            mo183110a(C118318d.wx0());
        }
        if (this.f353646e > 0) {
            Log.m105924i("MicroMsg.TalkRoomServer", "addListener has init before");
        } else {
            C97625j3.m125815e().mo123455a(332, this);
            C97625j3.m125815e().mo123455a(334, this);
            C97625j3.m125815e().mo123455a(336, this);
            C97625j3.m125815e().mo123455a(335, this);
            C118318d.zx0().mo73127a(this);
            C92614a aVar = (C92614a) C97625j3.m125813c();
            aVar.getClass();
            Log.m105919d("MicroMsg.BackgroundPlayer", "add callback : %s", toString());
            ((ArrayList) aVar.f266568b).add(this);
            this.f353646e = 1;
            C115781a aVar2 = this.f353656r;
            if (aVar2 != null) {
                try {
                    aVar2.xs0();
                    this.f353656r.B60();
                } catch (RemoteException e) {
                    Log.printErrStackTrace("MicroMsg.TalkRoomServer", e, "", new Object[0]);
                }
            }
            MMApplicationContext.getContext().bindService(new Intent(MMApplicationContext.getContext(), TalkRoomService.class), this.f353663y, 1);
            this.f353657s = new C118331n(this);
        }
        if (str.equals(this.f353649h)) {
            Log.m105919d("MicroMsg.TalkRoomServer", "enterTalkRoom %s has enter the talkroom", str);
            if (this.f353647f == 2) {
                C118339u uVar = this.f353662x;
                uVar.getClass();
                C118338t tVar = new C118338t(uVar);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    tVar.run();
                } else {
                    uVar.f353680b.post(tVar);
                }
            }
        } else {
            Log.m105919d("MicroMsg.TalkRoomServer", "%s enter the talkroom", str);
            this.f353649h = str;
            C97625j3.m125815e().mo123460f(new C52382a(str, mo183119l(str)));
            C118318d.vx0().f353603g = new C118324l();
            C118324l xx02 = C118318d.xx0();
            xx02.getClass();
            xx02.f353613A = Util.currentTicks();
            C118318d.xx0().f353640v = str;
            if (mo183119l(str) == 0) {
                C118318d.wx0().f353608e = true;
            }
            C118339u uVar2 = this.f353662x;
            uVar2.getClass();
            C118346x xVar = new C118346x(uVar2, str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                xVar.run();
            } else {
                uVar2.f353680b.post(xVar);
            }
        }
    }

    /* renamed from: i */
    public void mo183116i() {
        int i;
        int i2;
        Log.m105924i("MicroMsg.TalkRoomServer", "exitTalkRoom");
        mo183128u(false);
        if (Util.isNullOrNil(this.f353649h)) {
            Log.m105924i("MicroMsg.TalkRoomServer", "exitTalkRoom: has exited");
            return;
        }
        C118324l xx02 = C118318d.xx0();
        long j = xx02.f353613A;
        if (j != 0) {
            xx02.f353623e = (int) (Util.ticksToNow(j) / 1000);
        }
        this.f353647f = 0;
        this.f353648g = false;
        int i3 = this.f353650i;
        C97625j3.m125815e().mo123460f(new C52383b(i3, this.f353651j, i3 != 0 ? this.f353649h : "", mo183119l(this.f353649h)));
        C115781a aVar = this.f353656r;
        int i4 = -99999;
        if (aVar != null) {
            try {
                i = aVar.xs0();
            } catch (RemoteException e) {
                Log.printErrStackTrace("MicroMsg.TalkRoomServer", e, "", new Object[0]);
                i = -99999;
            }
            if (i < 0) {
                Log.m105921e("MicroMsg.TalkRoomServer", "engine.Close error %d", Integer.valueOf(i));
            }
            PByteArray pByteArray = new PByteArray();
            String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f353649h);
            C115781a aVar2 = this.f353656r;
            if (aVar2 != null) {
                int[] iArr = new int[1];
                try {
                    pByteArray.value = aVar2.mo176143OO(iArr, displayName);
                } catch (RemoteException e2) {
                    iArr[0] = -99999;
                    Log.printErrStackTrace("MicroMsg.TalkRoomServer", e2, "", new Object[0]);
                }
                i2 = iArr[0];
            } else {
                i2 = -99;
            }
            if (i2 == 0) {
                String str = new String(pByteArray.value);
                Log.m105925i("MicroMsg.TalkRoomServer", "getStatis==> pba.len %d, info: %s", Integer.valueOf(pByteArray.value.length), str);
                LinkedList linkedList = new LinkedList();
                hf4 hf4 = new hf4();
                hf4.f134600d = 10402;
                C51163rv3 rv32 = new C51163rv3();
                rv32.f141175d = str;
                rv32.f141176e = true;
                hf4.f134601e = rv32;
                hf4 hf42 = new hf4();
                hf42.f134600d = 10404;
                C51163rv3 rv33 = new C51163rv3();
                rv33.f141175d = C118318d.xx0().toString();
                rv33.f141176e = true;
                hf42.f134601e = rv33;
                linkedList.add(hf4);
                linkedList.add(hf42);
                C97625j3.m125815e().mo123460f(new C52388g(linkedList, mo183119l(this.f353649h)));
            }
        }
        this.f353649h = "";
        this.f353650i = 0;
        this.f353651j = 0;
        this.f353652n = 0;
        this.f353653o = 0;
        this.f353654p = 0;
        this.f353655q.clear();
        mo183124q();
        C118339u uVar = this.f353662x;
        uVar.getClass();
        C118347y yVar = new C118347y(uVar);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            yVar.run();
        } else {
            uVar.f353680b.post(yVar);
        }
        C118322g wx02 = C118318d.wx0();
        wx02.f353610g.post(new C118321f(wx02));
        this.f353646e = 0;
        C97625j3.m125815e().mo123470p(332, this);
        C97625j3.m125815e().mo123470p(334, this);
        C97625j3.m125815e().mo123470p(336, this);
        C97625j3.m125815e().mo123470p(335, this);
        C118318d.zx0().mo73132f(this);
        ((ArrayList) ((C92614a) C97625j3.m125813c()).f266568b).remove(this);
        mo183125r(C118318d.wx0());
        C115781a aVar3 = this.f353656r;
        if (aVar3 != null) {
            try {
                i4 = aVar3.B60();
            } catch (RemoteException e3) {
                Log.printErrStackTrace("MicroMsg.TalkRoomServer", e3, "", new Object[0]);
            }
        }
        MMApplicationContext.getContext().unbindService(this.f353663y);
        MMApplicationContext.getContext().stopService(new Intent(MMApplicationContext.getContext(), TalkRoomService.class));
        this.f353656r = null;
        if (i4 < 0) {
            Log.m105921e("MicroMsg.TalkRoomServer", "engine.uninitLive error %d", Integer.valueOf(i4));
        }
    }

    /* renamed from: j */
    public String mo183117j() {
        Iterator<gf4> it = C118318d.zx0().mo73130d(this.f353649h).iterator();
        while (it.hasNext()) {
            gf4 next = it.next();
            if (next.f134026d == this.f353654p) {
                return next.f134027e;
            }
        }
        return null;
    }

    /* renamed from: k */
    public List mo183118k() {
        return C118318d.zx0().mo73130d(this.f353649h);
    }

    /* renamed from: l */
    public int mo183119l(String str) {
        if (this.f353645d == 1) {
            return 1;
        }
        if (C75610d.m90859a() != null) {
            if (((C77833z) C75610d.m90859a()).mo107954g(this.f353649h)) {
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: m */
    public final boolean mo183120m() {
        int i;
        try {
            i = this.f353656r.mo176146pl();
        } catch (RemoteException e) {
            Log.printErrStackTrace("MicroMsg.TalkRoomServer", e, "", new Object[0]);
            i = -99999;
        }
        Log.m105924i("MicroMsg.TalkRoomServer", "engine.protocalInit");
        if (i >= 0 || i == -3) {
            return true;
        }
        this.f353656r = null;
        Log.m105923f("MicroMsg.TalkRoomServer", "engine.protocalInit error %d", Integer.valueOf(i));
        this.f353662x.mo183140b("enterTalkRoom protocalInit failed", 3, -1);
        return false;
    }

    /* renamed from: n */
    public final void mo183121n() {
        C115781a aVar = this.f353656r;
        if (aVar == null) {
            Log.m105920e("MicroMsg.TalkRoomServer", "the engine should not be null.");
            return;
        }
        C115790d Ab0 = aVar.Ab0(new C118330d());
        this.f353658t = Ab0;
        Ab0.start();
        C115787c Ud = this.f353656r.mo176144Ud();
        this.f353659u = Ud;
        Ud.start();
    }

    /* renamed from: o */
    public void mo183122o() {
        Log.m105924i("MicroMsg.TalkRoomServer", "putAwayMic");
        C118324l xx02 = C118318d.xx0();
        if (xx02.f353618F && !xx02.f353617E) {
            xx02.f353644z++;
        }
        xx02.f353617E = false;
        xx02.f353618F = false;
        if (this.f353647f < 3) {
            Log.m105928w("MicroMsg.TalkRoomServer", "putAwayMic  err, isnot getting or has not got mic");
            return;
        }
        MTimerHandler mTimerHandler = this.f353661w;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f353661w = null;
        }
        mo183114g();
        int i = this.f353650i;
        long j = this.f353651j;
        String str = this.f353649h;
        C97625j3.m125815e().mo123460f(new C52385d(i, j, 2, str, mo183119l(str)));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        Log.m105925i("MicroMsg.TalkRoomServer", "type:%d  errType:%d  errCode:%d", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2));
        C52387f fVar = (C52387f) yVar;
        if (fVar.mo73384j1() == null || !fVar.mo73384j1().equals(this.f353649h)) {
            Log.m105929w("MicroMsg.TalkRoomServer", "%s, now :%s this is the old sceneEnd, abandon it!!", fVar.mo73384j1(), this.f353649h);
            return;
        }
        if (!(i3 == 0 && i4 == 0)) {
            if (yVar.getType() == 332) {
                C118324l xx02 = C118318d.xx0();
                long j = xx02.f353613A;
                if (j != 0) {
                    xx02.f353619a = 2;
                    xx02.f353620b = Util.ticksToNow(j);
                }
                if (i3 == 4) {
                    C118318d.xx0().f353643y = i4;
                }
                this.f353662x.mo183140b("cgi enter failed : errType:" + i3 + " errCode:" + i4, i3, i4);
                mo183116i();
                return;
            } else if (yVar.getType() == 334) {
                if (((C52385d) yVar).f146436g == 1) {
                    C118324l xx03 = C118318d.xx0();
                    xx03.f353626h++;
                    xx03.f353615C = 0;
                    mo183114g();
                    Log.m105928w("MicroMsg.TalkRoomServer", "onSceneEnd SeizeMicFailed");
                    if (i3 == 4 && (i4 == 311 || i4 == 340)) {
                        this.f353662x.mo183142d(i4);
                        return;
                    } else {
                        this.f353662x.mo183141c(i3, i4, "TalkMicAction failed!!");
                        return;
                    }
                } else {
                    return;
                }
            } else if (yVar.getType() == 336) {
                this.f353648g = false;
                this.f353662x.mo183141c(i3, i4, "TalkGetMember failed!!");
                mo183116i();
                return;
            } else if (yVar.getType() == 335) {
                this.f353662x.mo183141c(i3, i4, "TalkNoop failed!!");
                mo183116i();
                return;
            }
        }
        if (yVar.getType() == 332) {
            C118324l xx04 = C118318d.xx0();
            long j2 = xx04.f353613A;
            if (j2 != 0) {
                xx04.f353619a = 1;
                xx04.f353620b = Util.ticksToNow(j2);
            }
            C52382a aVar = (C52382a) yVar;
            this.f353650i = aVar.f146417g;
            this.f353651j = aVar.f146418h;
            this.f353652n = aVar.f146419i;
            this.f353653o = aVar.f146420j;
            this.f353655q = aVar.f146422o;
            C118324l xx05 = C118318d.xx0();
            int i5 = this.f353650i;
            long j3 = this.f353651j;
            xx05.f353641w = i5;
            xx05.f353642x = j3;
            C118318d.zx0().mo73133g(this.f353649h, aVar.f146421n, (String) null, (String) null, fVar.mo73385k1());
            mo183113f(100);
        } else if (yVar.getType() == 334) {
            C52385d dVar = (C52385d) yVar;
            if (dVar.f146436g == 1) {
                C118324l xx06 = C118318d.xx0();
                long j4 = xx06.f353615C;
                if (j4 != 0) {
                    long ticksToNow = Util.ticksToNow(j4);
                    long j5 = xx06.f353624f;
                    int i6 = xx06.f353614B;
                    int i7 = i6 + 1;
                    xx06.f353624f = ((j5 * ((long) i6)) + ticksToNow) / ((long) i7);
                    xx06.f353614B = i7;
                    xx06.f353625g++;
                    xx06.f353615C = 0;
                }
                Log.m105924i("MicroMsg.TalkRoomServer", "dealWithSeizeMic seize Mic successFul");
                int i8 = dVar.f146437h;
                if (i8 < this.f353652n) {
                    Log.m105929w("MicroMsg.TalkRoomServer", "micSeq is smaller seizeSeq %d, now %d", Integer.valueOf(i8), Integer.valueOf(this.f353652n));
                    mo183114g();
                    this.f353662x.mo183142d(311);
                    return;
                }
                this.f353652n = i8;
                int i9 = -99999;
                try {
                    i9 = this.f353656r.ss0(i8);
                } catch (RemoteException e) {
                    Log.printErrStackTrace("MicroMsg.TalkRoomServer", e, "", new Object[0]);
                }
                if (this.f353647f != 3) {
                    Log.m105924i("MicroMsg.TalkRoomServer", "dealWithSeizeMic not in getting mic state");
                    return;
                }
                C118339u uVar = this.f353662x;
                uVar.getClass();
                C118344v vVar = new C118344v(uVar);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    vVar.run();
                } else {
                    uVar.f353680b.post(vVar);
                }
                this.f353647f = 4;
                if (i9 < 0) {
                    Log.m105921e("MicroMsg.TalkRoomServer", "SetCurrentMicId err: %d ", Integer.valueOf(i9));
                }
                if (this.f353661w == null) {
                    MTimerHandler mTimerHandler = new MTimerHandler(new C118334o(this), true);
                    this.f353661w = mTimerHandler;
                    mTimerHandler.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.TalkRoomServer", "putaway Mic successFul");
        } else {
            if (yVar.getType() == 336) {
                C52384c cVar = (C52384c) yVar;
                C118318d.zx0().mo73133g(this.f353649h, cVar.f146431h, (String) null, (String) null, fVar.mo73385k1());
                int i15 = cVar.f146430g;
                if (i15 > this.f353652n) {
                    this.f353652n = i15;
                    if (this.f353647f >= 3) {
                        this.f353662x.mo183142d(311);
                    }
                    mo183114g();
                }
                this.f353648g = false;
                this.f353662x.mo183139a(mo183117j());
            }
            if (yVar.getType() == 335 && this.f353647f == 0) {
                this.f353662x.mo183141c(3, -1, "talknoop success but in outside room state");
            }
        }
    }

    /* renamed from: p */
    public void mo183123p(boolean z) {
        Log.m105925i("MicroMsg.TalkRoomServer", "reConnect talkRoomUsername: %s", this.f353649h);
        if (!Util.isNullOrNil(this.f353649h) && this.f353647f >= 2) {
            C118318d.xx0().f353627i++;
            if (z) {
                if (mo183120m()) {
                    try {
                        mo183121n();
                    } catch (RemoteException e) {
                        Log.m105920e("MicroMsg.TalkRoomServer", e.toString());
                        Log.printErrStackTrace("MicroMsg.TalkRoomServer", e, "", new Object[0]);
                    }
                } else {
                    return;
                }
            }
            mo183114g();
            this.f353647f = 1;
            try {
                C115781a aVar = this.f353656r;
                if (aVar != null) {
                    aVar.xs0();
                }
            } catch (RemoteException e2) {
                Log.printErrStackTrace("MicroMsg.TalkRoomServer", e2, "", new Object[0]);
            }
            if (this.f353650i != 0) {
                mo183111b();
            }
            if (!z) {
                C118339u uVar = this.f353662x;
                uVar.getClass();
                C118337s sVar = new C118337s(uVar);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    sVar.run();
                } else {
                    uVar.f353680b.post(sVar);
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo183124q() {
        C115790d dVar = this.f353658t;
        if (dVar != null) {
            try {
                dVar.release();
            } catch (RemoteException e) {
                Log.printErrStackTrace("MicroMsg.TalkRoomServer", e, "", new Object[0]);
            }
            this.f353658t = null;
        }
        C115787c cVar = this.f353659u;
        if (cVar != null) {
            try {
                cVar.release();
            } catch (RemoteException e2) {
                Log.printErrStackTrace("MicroMsg.TalkRoomServer", e2, "", new Object[0]);
            }
            this.f353659u = null;
        }
        MAlarmHandler mAlarmHandler = this.f353660v;
        if (mAlarmHandler != null) {
            mAlarmHandler.stopTimer();
            this.f353660v = null;
        }
        MTimerHandler mTimerHandler = this.f353661w;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f353661w = null;
        }
    }

    /* renamed from: r */
    public void mo183125r(C116607d dVar) {
        C118339u uVar = this.f353662x;
        uVar.getClass();
        synchronized (dVar) {
            ((LinkedList) uVar.f353679a).remove(dVar);
        }
    }

    /* renamed from: s */
    public void mo183126s() {
        Log.m105925i("MicroMsg.TalkRoomServer", "resumeRecord in state %d", Integer.valueOf(this.f353647f));
        if (this.f353647f == 4) {
            C118324l xx02 = C118318d.xx0();
            xx02.f353617E = true;
            xx02.f353616D = Util.currentTicks();
            try {
                this.f353659u.mo176157YC();
            } catch (RemoteException e) {
                Log.printErrStackTrace("MicroMsg.TalkRoomServer", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: t */
    public boolean mo183127t() {
        Log.m105924i("MicroMsg.TalkRoomServer", "seizeMic");
        if (this.f353647f != 2) {
            Log.m105924i("MicroMsg.TalkRoomServer", "seizeMic  not int the appropriate state");
            if (this.f353647f == 0) {
                this.f353662x.mo183141c(3, -1, "seizeMic in outside room state");
            }
            return false;
        }
        C115790d dVar = this.f353658t;
        if (dVar != null) {
            try {
                dVar.mo176165W();
            } catch (RemoteException e) {
                Log.printErrStackTrace("MicroMsg.TalkRoomServer", e, "", new Object[0]);
            }
        }
        this.f353647f = 3;
        int i = this.f353650i;
        long j = this.f353651j;
        String str = this.f353649h;
        C97625j3.m125815e().mo123460f(new C52385d(i, j, 1, str, mo183119l(str)));
        C118324l xx02 = C118318d.xx0();
        xx02.getClass();
        xx02.f353615C = Util.currentTicks();
        C118318d.xx0().f353618F = true;
        return true;
    }

    /* renamed from: u */
    public final void mo183128u(boolean z) {
        C72976h2 j;
        if (!Util.isNullOrNil(this.f353649h) && (j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(this.f353649h)) != null) {
            j.mo101161T2(C45881a.m51165b(j, z ? 5 : 6, j.mo108821o2()));
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69773k0(j, this.f353649h);
        }
    }

    /* renamed from: y1 */
    public void mo69890y1(String str, String str2, String str3) {
        if (str.equals(this.f353649h)) {
            C118339u uVar = this.f353662x;
            uVar.getClass();
            C118345w wVar = new C118345w(uVar, str2, str3);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                wVar.run();
            } else {
                uVar.f353680b.post(wVar);
            }
        }
    }
}
