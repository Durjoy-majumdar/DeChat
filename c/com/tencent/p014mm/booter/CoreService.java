package com.tencent.p014mm.booter;

import a30.C112744a;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.mars.Mars;
import com.tencent.mars.comm.Alarm;
import com.tencent.mars.comm.PlatformComm;
import com.tencent.mars.comm.WakerLock;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import com.tencent.p014mm.app.C80600i0;
import com.tencent.p014mm.booter.NotifyReceiver;
import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.network.C114792p;
import com.tencent.p014mm.network.C114803y;
import com.tencent.p014mm.network.C81044x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.service.C116024c;
import com.tencent.p014mm.service.ProcessService$MMProcessService;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import di3.C86312j;
import eb0.C31543z5;
import f40.C75681p0;
import f40.C86739i0;
import j20.C117292a;
import java.util.ArrayList;
import jc3.C87948i;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import org.xwalk.core.XWalkEnvironment;
import p285zh.C119114c;
import sf0.C118282y;
import yb0.C118950a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.booter.CoreService */
public class CoreService extends Service implements C114792p, C114781l0.C114782a, PlatformComm.IResetProcess, PlatformComm.IReportCrash {

    /* renamed from: t */
    public static C80801f f343882t;

    /* renamed from: d */
    public C114803y f343883d;

    /* renamed from: e */
    public C114715k f343884e = new C114715k();

    /* renamed from: f */
    public boolean f343885f = true;

    /* renamed from: g */
    public C114706e f343886g = null;

    /* renamed from: h */
    public final MAlarmHandler.IBumper f343887h = new C114702a();

    /* renamed from: i */
    public int f343888i = -1;

    /* renamed from: j */
    public int f343889j = -1;

    /* renamed from: n */
    public long f343890n = 0;

    /* renamed from: o */
    public long f343891o = 0;

    /* renamed from: p */
    public long f343892p = 0;

    /* renamed from: q */
    public WakerLock f343893q = null;

    /* renamed from: r */
    public C118282y f343894r = new C118282y(ApkDownloadManager.INTERVAL, 3);

    /* renamed from: s */
    public MTimerHandler f343895s = new MTimerHandler(new C114704d(), false);

    /* renamed from: com.tencent.mm.booter.CoreService$InnerService */
    public static class InnerService extends Service {
        public IBinder onBind(Intent intent) {
            return null;
        }

        public void onCreate() {
            super.onCreate();
            try {
                startForeground(-1213, new Notification());
            } catch (NullPointerException e) {
                Log.m105921e("MicroMsg.CoreService", "set service for push exception:%s.", e);
            }
            stopSelf();
        }

        public void onDestroy() {
            stopForeground(true);
            super.onDestroy();
        }
    }

    /* renamed from: com.tencent.mm.booter.CoreService$c */
    public class C80800c implements Runnable {
        public C80800c() {
        }

        public void run() {
            CoreService coreService = CoreService.this;
            C80801f fVar = CoreService.f343882t;
            coreService.getClass();
            Log.m105924i("MicroMsg.CoreService", "initOther");
            C80801f fVar2 = CoreService.f343882t;
            if (fVar2 != null) {
                ((C80600i0) fVar2).mo112318c(MMApplicationContext.getContext());
                C80600i0 i0Var = (C80600i0) CoreService.f343882t;
                i0Var.f235808f.postDelayed(i0Var.f235809g, 3600000);
            }
        }
    }

    /* renamed from: com.tencent.mm.booter.CoreService$f */
    public interface C80801f {
    }

    /* renamed from: com.tencent.mm.booter.CoreService$a */
    public class C114702a implements MAlarmHandler.IBumper {
        public C114702a() {
        }

        public void cancel() {
            MMReceivers$AlarmReceiver.m161349c(CoreService.this.getApplicationContext());
        }

        public void prepare() {
            MMReceivers$AlarmReceiver.m161347a(CoreService.this.getApplicationContext());
        }
    }

    /* renamed from: com.tencent.mm.booter.CoreService$b */
    public class C114703b implements Runnable {
        public C114703b(CoreService coreService) {
        }

        public void run() {
            if (Build.VERSION.SDK_INT > 23) {
                Log.m105925i("MicroMsg.CoreService", "KeepAliveService.scheduleKeepAliveJob() flag:%s", Boolean.valueOf(KeepAliveService.m161346a()));
            }
        }
    }

    /* renamed from: com.tencent.mm.booter.CoreService$d */
    public class C114704d implements MTimerHandler.CallBack {

        /* renamed from: com.tencent.mm.booter.CoreService$d$a */
        public class C114705a implements MTimerHandler.CallBack {
            public C114705a() {
            }

            public boolean onTimerExpired() {
                CoreService.this.f343893q.unLock();
                return false;
            }
        }

        public C114704d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0060  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTimerExpired() {
            /*
                r9 = this;
                com.tencent.mm.booter.CoreService r0 = com.tencent.p014mm.booter.CoreService.this
                sf0.y r0 = r0.f343894r
                long r1 = r0.f353524a
                long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)
                r3 = 1
                r4 = 0
                r5 = 180000(0x2bf20, double:8.8932E-319)
                r7 = 3
                int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r8 >= 0) goto L_0x004c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "frequency limited, last="
                r1.append(r2)
                long r5 = r0.f353524a
                r1.append(r5)
                java.lang.String r2 = ", cur="
                r1.append(r2)
                long r5 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                r1.append(r5)
                java.lang.String r2 = ", retries="
                r1.append(r2)
                int r2 = r0.f353525b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "MicroMsg.FrequncyLimiter"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                int r1 = r0.f353525b
                if (r1 > 0) goto L_0x0048
                r0 = 0
                goto L_0x0055
            L_0x0048:
                int r1 = r1 - r3
                r0.f353525b = r1
                goto L_0x004e
            L_0x004c:
                r0.f353525b = r7
            L_0x004e:
                long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                r0.f353524a = r1
                r0 = 1
            L_0x0055:
                java.lang.String r1 = "MicroMsg.CoreService"
                r2 = 2
                if (r0 != 0) goto L_0x0060
                java.lang.String r0 = "setNetworkAvailable checker frequency limited"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
                goto L_0x00be
            L_0x0060:
                com.tencent.mm.booter.CoreService r0 = com.tencent.p014mm.booter.CoreService.this
                com.tencent.mm.network.y r0 = r0.f343883d
                com.tencent.mm.network.a r0 = r0.f344208n
                boolean r0 = r0.mo54108G3()
                com.tencent.mm.network.y r5 = com.tencent.p014mm.network.C114781l0.m161554a()
                com.tencent.mm.network.x r5 = r5.f344216v
                if (r5 != 0) goto L_0x0074
            L_0x0072:
                r5 = 0
                goto L_0x0078
            L_0x0074:
                boolean r5 = r5.mo112343iD()     // Catch:{ Exception -> 0x0072 }
            L_0x0078:
                java.lang.Object[] r6 = new java.lang.Object[r2]
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
                r6[r4] = r8
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
                r6[r3] = r8
                java.lang.String r8 = "setNetworkAvailable  deal with Sync Check isSessionKeyNull:%b, isLogin:%b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r8, r6)
                if (r0 == 0) goto L_0x00bb
                if (r5 != 0) goto L_0x00bb
                com.tencent.mm.booter.CoreService r0 = com.tencent.p014mm.booter.CoreService.this
                com.tencent.mm.network.y r0 = r0.f343883d
                com.tencent.mm.network.a r0 = r0.f344208n
                r0.mo54112S(r3)
                com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                r0[r4] = r5
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r0[r3] = r4
                java.lang.String r4 = "MicroMsg.NotifySyncMgr"
                java.lang.String r5 = "dealWithNotify Here, MM should NOT bOotEd , opType:%d respType:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r0)
                r4 = 2
                com.tencent.p014mm.booter.C114716m.m161362c(r4, r2)
                java.lang.String r0 = "setNetworkAvailable deal with notify sync in push"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                return r3
            L_0x00bb:
                com.tencent.p014mm.booter.CoreService.m161342e()
            L_0x00be:
                java.lang.Object[] r0 = new java.lang.Object[r7]
                com.tencent.mm.booter.CoreService r5 = com.tencent.p014mm.booter.CoreService.this
                long r5 = r5.f343890n
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r0[r4] = r5
                com.tencent.mm.booter.CoreService r5 = com.tencent.p014mm.booter.CoreService.this
                long r5 = r5.f343892p
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r0[r3] = r5
                long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                com.tencent.mm.booter.CoreService r7 = com.tencent.p014mm.booter.CoreService.this
                long r7 = r7.f343891o
                long r5 = r5 - r7
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r0[r2] = r5
                java.lang.String r2 = "setNetworkAvailable finish lockCount:%d delayCount:%d delayDur:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
                com.tencent.mm.booter.CoreService r0 = com.tencent.p014mm.booter.CoreService.this
                r1 = 0
                r0.f343890n = r1
                r0.f343892p = r1
                r0.f343891o = r1
                com.tencent.mm.sdk.platformtools.MTimerHandler r0 = new com.tencent.mm.sdk.platformtools.MTimerHandler
                com.tencent.mm.booter.CoreService$d$a r1 = new com.tencent.mm.booter.CoreService$d$a
                r1.<init>()
                r0.<init>(r1, r4)
                r1 = 500(0x1f4, double:2.47E-321)
                r0.startTimer(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.booter.CoreService.C114704d.onTimerExpired():boolean");
        }
    }

    /* renamed from: com.tencent.mm.booter.CoreService$e */
    public interface C114706e {
        void registerBroadcasts();

        void unRegisterBroadcasts();
    }

    /* renamed from: c */
    public static IDKey m161341c(int i, int i2) {
        Log.m105925i("MicroMsg.CoreService", "idkeyPushSetupTimeReport %s %s", Integer.valueOf(i), Integer.valueOf(i2));
        IDKey iDKey = new IDKey();
        iDKey.SetID(1391);
        iDKey.SetKey(i);
        iDKey.SetValue((long) i2);
        return iDKey;
    }

    /* renamed from: e */
    public static void m161342e() {
        Intent intent = new Intent(C114781l0.m161555b(), NotifyReceiver.class);
        intent.putExtra("notify_option_type", 1);
        intent.putExtra("notify_uin", C114781l0.m161554a().f344208n.f344122j);
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("msg_receive_number");
        long j = mmkv.getLong("send_num", 0) + 1;
        mmkv.edit().putLong("send_num", j);
        intent.putExtra("notfiy_sync_num", j);
        try {
            C114781l0.m161555b().sendBroadcast(intent);
            Log.m105925i("MicroMsg.CoreService", "sendBorastToNotifyReceiver syncNum:%s", Long.valueOf(j));
            intent.setClass(C114781l0.m161555b(), NotifyReceiver.NotifyReceiverService.class);
            intent.putExtra("notfiy_recv_time", Util.nowMilliSecond());
            C116024c.m163164d(intent, XWalkEnvironment.MODULE_MM, true, new Intent(MMApplicationContext.getContext(), ProcessService$MMProcessService.class));
            C117407d.INSTANCE.idkeyStat(1042, 62, 1, false);
        } catch (Exception e) {
            Log.m105923f("MicroMsg.CoreService", "checker frequency limited hasDestroyed %s", e.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01cc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo174259a(android.content.Context r18, boolean r19, java.lang.String r20, java.lang.String r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = -1
            r2 = 0
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "MicroMsg.CoreService"
            if (r19 != 0) goto L_0x0035
            java.lang.String r6 = "[NETWORK LOST]"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r6)
            com.tencent.mm.network.m0 r5 = com.tencent.p014mm.network.C114781l0.m161558e()
            r5.f344174b = r4
            com.tencent.mm.network.n0 r5 = com.tencent.p014mm.network.C114781l0.m161560g()
            r5.mo174443c(r4)
            boolean r5 = r1.f343885f
            if (r5 == 0) goto L_0x0032
            com.tencent.mm.network.y r5 = com.tencent.p014mm.network.C114781l0.m161554a()
            r5.mo174493j()
            com.tencent.mm.booter.k r5 = r1.f343884e
            r5.f343907a = r2
            r5.f343909c = r3
            r5.f343908b = r3
            r5.f343910d = r0
        L_0x0032:
            r1.f343885f = r4
            return
        L_0x0035:
            java.lang.String r6 = "[NETWORK CONNECTED]"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r6)
            com.tencent.mm.network.m0 r6 = com.tencent.p014mm.network.C114781l0.m161558e()
            r7 = 1
            r6.f344174b = r7
            com.tencent.mm.booter.k r6 = r1.f343884e
            r6.getClass()
            java.lang.String r8 = "MicroMsg.NetworkChangeMgr"
            r9 = 3
            r10 = 2
            android.content.Context r11 = com.tencent.p014mm.network.C114781l0.m161555b()     // Catch:{ Exception -> 0x0162 }
            java.lang.String r12 = "connectivity"
            java.lang.Object r11 = r11.getSystemService(r12)     // Catch:{ Exception -> 0x0162 }
            android.net.ConnectivityManager r11 = (android.net.ConnectivityManager) r11     // Catch:{ Exception -> 0x0162 }
            if (r11 != 0) goto L_0x0062
            java.lang.String r0 = "can't get ConnectivityManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)     // Catch:{ Exception -> 0x0162 }
            r6.f343907a = r2     // Catch:{ Exception -> 0x0162 }
        L_0x005f:
            r0 = 0
            goto L_0x0169
        L_0x0062:
            android.net.NetworkInfo r11 = r11.getActiveNetworkInfo()     // Catch:{ Exception -> 0x0067 }
            goto L_0x006d
        L_0x0067:
            java.lang.String r11 = "getActiveNetworkInfo failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r11)     // Catch:{ Exception -> 0x0162 }
            r11 = r2
        L_0x006d:
            if (r11 != 0) goto L_0x0077
            java.lang.String r0 = "ActiveNetwork is null, has no network"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)     // Catch:{ Exception -> 0x0162 }
            r6.f343907a = r2     // Catch:{ Exception -> 0x0162 }
            goto L_0x005f
        L_0x0077:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.net.NetworkInfo) r11)     // Catch:{ Exception -> 0x0162 }
            if (r2 == 0) goto L_0x00d4
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r12 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion     // Catch:{ Exception -> 0x0162 }
            java.lang.String r13 = r12.getWiFiBssid()     // Catch:{ Exception -> 0x0162 }
            java.lang.String r14 = r12.getWiFiSsid()     // Catch:{ Exception -> 0x0162 }
            int r12 = r12.getNetworkId()     // Catch:{ Exception -> 0x0162 }
            java.lang.String r15 = "New Wifi Info:[%s][%s][%s]"
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0162 }
            r0[r4] = r13     // Catch:{ Exception -> 0x0162 }
            r0[r7] = r14     // Catch:{ Exception -> 0x0162 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x0162 }
            r0[r10] = r16     // Catch:{ Exception -> 0x0162 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r15, r0)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r0 = "OldWifi Info:[%s][%s][%s]"
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0162 }
            java.lang.String r9 = r6.f343909c     // Catch:{ Exception -> 0x0162 }
            r15[r4] = r9     // Catch:{ Exception -> 0x0162 }
            java.lang.String r9 = r6.f343908b     // Catch:{ Exception -> 0x0162 }
            r15[r7] = r9     // Catch:{ Exception -> 0x0162 }
            int r9 = r6.f343910d     // Catch:{ Exception -> 0x0162 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0162 }
            r15[r10] = r9     // Catch:{ Exception -> 0x0162 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r0, r15)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r0 = r6.f343909c     // Catch:{ Exception -> 0x0162 }
            boolean r0 = r0.equals(r13)     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = r6.f343908b     // Catch:{ Exception -> 0x0162 }
            boolean r0 = r0.equals(r14)     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x00cd
            int r0 = r6.f343910d     // Catch:{ Exception -> 0x0162 }
            if (r0 != r12) goto L_0x00cd
            java.lang.String r0 = "Same Wifi, do not NetworkChanged"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)     // Catch:{ Exception -> 0x0162 }
            goto L_0x005f
        L_0x00cd:
            r6.f343909c = r13     // Catch:{ Exception -> 0x0162 }
            r6.f343908b = r14     // Catch:{ Exception -> 0x0162 }
            r6.f343910d = r12     // Catch:{ Exception -> 0x0162 }
            goto L_0x0140
        L_0x00d4:
            android.net.NetworkInfo r0 = r6.f343907a     // Catch:{ Exception -> 0x0162 }
            java.lang.String r9 = "Same Network, do not NetworkChanged"
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = r0.getExtraInfo()     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = r11.getExtraInfo()     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x0113
            android.net.NetworkInfo r0 = r6.f343907a     // Catch:{ Exception -> 0x0162 }
            java.lang.String r0 = r0.getExtraInfo()     // Catch:{ Exception -> 0x0162 }
            java.lang.String r12 = r11.getExtraInfo()     // Catch:{ Exception -> 0x0162 }
            boolean r0 = r0.equals(r12)     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x0113
            android.net.NetworkInfo r0 = r6.f343907a     // Catch:{ Exception -> 0x0162 }
            int r0 = r0.getSubtype()     // Catch:{ Exception -> 0x0162 }
            int r12 = r11.getSubtype()     // Catch:{ Exception -> 0x0162 }
            if (r0 != r12) goto L_0x0113
            android.net.NetworkInfo r0 = r6.f343907a     // Catch:{ Exception -> 0x0162 }
            int r0 = r0.getType()     // Catch:{ Exception -> 0x0162 }
            int r12 = r11.getType()     // Catch:{ Exception -> 0x0162 }
            if (r0 != r12) goto L_0x0113
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r9)     // Catch:{ Exception -> 0x0162 }
            goto L_0x005f
        L_0x0113:
            android.net.NetworkInfo r0 = r6.f343907a     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = r0.getExtraInfo()     // Catch:{ Exception -> 0x0162 }
            if (r0 != 0) goto L_0x0140
            java.lang.String r0 = r11.getExtraInfo()     // Catch:{ Exception -> 0x0162 }
            if (r0 != 0) goto L_0x0140
            android.net.NetworkInfo r0 = r6.f343907a     // Catch:{ Exception -> 0x0162 }
            int r0 = r0.getSubtype()     // Catch:{ Exception -> 0x0162 }
            int r12 = r11.getSubtype()     // Catch:{ Exception -> 0x0162 }
            if (r0 != r12) goto L_0x0140
            android.net.NetworkInfo r0 = r6.f343907a     // Catch:{ Exception -> 0x0162 }
            int r0 = r0.getType()     // Catch:{ Exception -> 0x0162 }
            int r12 = r11.getType()     // Catch:{ Exception -> 0x0162 }
            if (r0 != r12) goto L_0x0140
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r9)     // Catch:{ Exception -> 0x0162 }
            goto L_0x005f
        L_0x0140:
            if (r2 != 0) goto L_0x015f
            java.lang.String r0 = "New NetworkInfo:%s"
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0162 }
            r2[r4] = r11     // Catch:{ Exception -> 0x0162 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r0, r2)     // Catch:{ Exception -> 0x0162 }
            android.net.NetworkInfo r0 = r6.f343907a     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x0158
            java.lang.String r2 = "Old NetworkInfo:%s"
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0162 }
            r9[r4] = r0     // Catch:{ Exception -> 0x0162 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r2, r9)     // Catch:{ Exception -> 0x0162 }
        L_0x0158:
            r6.f343909c = r3     // Catch:{ Exception -> 0x0162 }
            r6.f343908b = r3     // Catch:{ Exception -> 0x0162 }
            r0 = -1
            r6.f343910d = r0     // Catch:{ Exception -> 0x0162 }
        L_0x015f:
            r6.f343907a = r11     // Catch:{ Exception -> 0x0162 }
            goto L_0x0168
        L_0x0162:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r3, r2)
        L_0x0168:
            r0 = 1
        L_0x0169:
            java.lang.Object[] r2 = new java.lang.Object[r10]
            boolean r3 = r1.f343885f
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r4] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r2[r7] = r3
            java.lang.String r3 = "lastConnected %s, isNetWorkChange %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
            boolean r2 = r1.f343885f
            if (r2 == 0) goto L_0x018a
            if (r0 != 0) goto L_0x018a
            java.lang.String r0 = "network not change or can't get network info"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            return
        L_0x018a:
            if (r0 == 0) goto L_0x0193
            com.tencent.mm.network.y r0 = com.tencent.p014mm.network.C114781l0.m161554a()
            r0.mo174493j()
        L_0x0193:
            r1.f343885f = r7
            com.tencent.mm.network.n0 r0 = com.tencent.p014mm.network.C114781l0.m161560g()
            r2 = 6
            r0.mo174443c(r2)
            com.tencent.mars.comm.WakerLock r0 = r1.f343893q
            if (r0 != 0) goto L_0x01ac
            com.tencent.mars.comm.WakerLock r0 = new com.tencent.mars.comm.WakerLock
            android.content.Context r2 = r17.getApplicationContext()
            r0.<init>(r2, r5)
            r1.f343893q = r0
        L_0x01ac:
            com.tencent.mars.comm.WakerLock r0 = r1.f343893q
            boolean r0 = r0.isLocking()
            r2 = 1
            if (r0 != 0) goto L_0x01c4
            com.tencent.mars.comm.WakerLock r0 = r1.f343893q
            r8 = 6000(0x1770, double:2.9644E-320)
            java.lang.String r6 = "CoreService.setNetworkAvailable"
            r0.lock(r8, r6)
            long r8 = r1.f343890n
            long r8 = r8 + r2
            r1.f343890n = r8
        L_0x01c4:
            r8 = 0
            long r11 = r1.f343892p
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x01d2
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r1.f343891o = r8
        L_0x01d2:
            long r8 = r1.f343892p
            long r8 = r8 + r2
            r1.f343892p = r8
            r2 = 3
            java.lang.Object[] r0 = new java.lang.Object[r2]
            long r2 = r1.f343890n
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r4] = r2
            long r2 = r1.f343892p
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r7] = r2
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r6 = r1.f343891o
            long r2 = r2 - r6
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r10] = r2
            java.lang.String r2 = "setNetworkAvailable start lockCount:%d delayCount:%d delayDur:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r1.f343895s
            r2 = 3000(0xbb8, double:1.482E-320)
            r0.startTimer(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.booter.CoreService.mo174259a(android.content.Context, boolean, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public void mo174260b() {
        Log.m105928w("MicroMsg.CoreService", "[COMPLETE EXIT]");
        C114781l0.m161559f().mo174426b(3, 10000, "");
        Mars.onDestroy();
        try {
            MMReceivers$AlarmReceiver.m161348b(getApplicationContext());
            MMReceivers$AlarmReceiver.m161349c(getApplicationContext());
            Alarm.resetAlarm(getApplicationContext());
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.CoreService", e, "", new Object[0]);
        }
        Log.appenderClose();
        int myPid = Process.myPid();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(myPid));
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/booter/CoreService", "doExit", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(obj, "com/tencent/mm/booter/CoreService", "doExit", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }

    /* renamed from: d */
    public boolean mo174261d(int i, int i2, String str, int i3, byte[] bArr) {
        boolean z;
        byte[] bArr2 = bArr;
        if (C75681p0.m90936c(this)) {
            Log.m105924i("MicroMsg.CoreService", "fully exited, no need to notify worker");
            return false;
        }
        int i4 = i3;
        int i5 = i4 == -255 ? 138 : i4;
        boolean z2 = C119114c.f356684a;
        Log.m105924i("MicroMsg.NotifyPowerInspector", "pushNotify: func=" + i5);
        if (AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            C119114c.f356701r.accept(Integer.valueOf(i5));
        }
        boolean z3 = C114781l0.m161561h().getBoolean("is_in_notify_mode", false);
        boolean G3 = this.f343883d.f344208n.mo54108G3();
        C81044x xVar = C114781l0.m161554a().f344216v;
        if (xVar != null) {
            try {
                z = xVar.mo112343iD();
            } catch (Exception unused) {
            }
            if (z3 || !G3 || z) {
                Log.m105925i("MicroMsg.CoreService", "deal with notify sync to mm by broast, isLogin:%b, isMMProcessExist:%b, isInNotifyMode:%b", Boolean.valueOf(G3), Boolean.valueOf(z), Boolean.valueOf(z3));
                Intent intent = new Intent(this, NotifyReceiver.class);
                intent.putExtra("notify_option_type", 2);
                intent.putExtra("notify_uin", this.f343883d.f344208n.f344122j);
                intent.putExtra("notify_respType", i5);
                intent.putExtra("notify_respBuf", bArr2);
                intent.putExtra("notify_skey", this.f343883d.f344208n.mo54112S(1));
                intent.putExtra("notfiy_recv_time", Util.nowMilliSecond());
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("msg_receive_number");
                long j = mmkv.getLong("send_num", 0) + 1;
                mmkv.edit().putLong("send_num", j);
                Log.m105925i("MicroMsg.CoreService", "notify broadcast action:%s, type:%d, bufLen:%d, syncNum:%d", intent.getAction(), Integer.valueOf(i5), Integer.valueOf(Util.nullAs(bArr2, new byte[0]).length), Long.valueOf(j));
                intent.putExtra("notfiy_sync_num", j);
                sendBroadcast(intent);
                C117407d dVar = C117407d.INSTANCE;
                dVar.idkeyStat(1042, 60, 1, false);
                C118950a.m167704a(i5, j);
                intent.setClass(this, NotifyReceiver.NotifyReceiverService.class);
                C116024c.m163164d(intent, XWalkEnvironment.MODULE_MM, true, new Intent(MMApplicationContext.getContext(), ProcessService$MMProcessService.class));
                dVar.idkeyStat(1042, 62, 1, false);
                return true;
            }
            Log.m105924i("MicroMsg.CoreService", "deal with notify sync in push");
            return true;
        }
        z = false;
        if (z3) {
        }
        Log.m105925i("MicroMsg.CoreService", "deal with notify sync to mm by broast, isLogin:%b, isMMProcessExist:%b, isInNotifyMode:%b", Boolean.valueOf(G3), Boolean.valueOf(z), Boolean.valueOf(z3));
        Intent intent2 = new Intent(this, NotifyReceiver.class);
        intent2.putExtra("notify_option_type", 2);
        intent2.putExtra("notify_uin", this.f343883d.f344208n.f344122j);
        intent2.putExtra("notify_respType", i5);
        intent2.putExtra("notify_respBuf", bArr2);
        intent2.putExtra("notify_skey", this.f343883d.f344208n.mo54112S(1));
        intent2.putExtra("notfiy_recv_time", Util.nowMilliSecond());
        try {
            MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("msg_receive_number");
            long j2 = mmkv2.getLong("send_num", 0) + 1;
            mmkv2.edit().putLong("send_num", j2);
            Log.m105925i("MicroMsg.CoreService", "notify broadcast action:%s, type:%d, bufLen:%d, syncNum:%d", intent2.getAction(), Integer.valueOf(i5), Integer.valueOf(Util.nullAs(bArr2, new byte[0]).length), Long.valueOf(j2));
            intent2.putExtra("notfiy_sync_num", j2);
            sendBroadcast(intent2);
            C117407d dVar2 = C117407d.INSTANCE;
            dVar2.idkeyStat(1042, 60, 1, false);
            C118950a.m167704a(i5, j2);
            intent2.setClass(this, NotifyReceiver.NotifyReceiverService.class);
            C116024c.m163164d(intent2, XWalkEnvironment.MODULE_MM, true, new Intent(MMApplicationContext.getContext(), ProcessService$MMProcessService.class));
            dVar2.idkeyStat(1042, 62, 1, false);
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.CoreService", "dknot sendBroadcast  failed:%s", Util.stackTraceToString(th));
        }
        return true;
    }

    public IBinder onBind(Intent intent) {
        int myPid = Process.myPid();
        Log.m105919d("MicroMsg.CoreService", "onBind~~~ lastpid:%d  pid:%d threadID:" + Thread.currentThread(), Integer.valueOf(this.f343889j), Integer.valueOf(myPid));
        if (myPid != this.f343889j) {
            this.f343889j = myPid;
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(99, 147, 1, false);
            if (intent != null && "auto".equals(intent.getStringExtra("START_TYPE"))) {
                dVar.idkeyStat(99, 146, 1, false);
            }
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - C86739i0.f251798a);
            ArrayList arrayList = new ArrayList();
            arrayList.add(m161341c(5, elapsedRealtime));
            long j = (long) elapsedRealtime;
            arrayList.add(m161341c(j <= 1000 ? 10 : j <= 2000 ? 11 : j <= 3000 ? 12 : j <= 4000 ? 13 : j <= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION ? 14 : j <= 7000 ? 15 : j <= 10000 ? 16 : j <= 15000 ? 17 : j <= 20000 ? 18 : j <= 30000 ? 19 : j <= 40000 ? 20 : j <= 50000 ? 21 : j <= 60000 ? 22 : j <= 120000 ? 23 : j <= ApkDownloadManager.INTERVAL ? 24 : j <= 300000 ? 25 : j <= 420000 ? 26 : j <= 600000 ? 27 : 28, 1));
            arrayList.add(m161341c(0, 1));
            dVar.mo160124a(arrayList, false);
            ((C119157j) C119157j.f356862d).mo183878i(new C80800c(), 3000);
        }
        return this.f343883d;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:53|(2:55|56)|57|58) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x014c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x018c */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x034e  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:47:0x014c=Splitter:B:47:0x014c, B:57:0x018c=Splitter:B:57:0x018c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r0 = "MicroMsg.CoreService"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onCreate~~~threadID:"
            r2.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
            super.onCreate()
            r2 = 1
            r3 = 0
            java.lang.Class<com.tencent.mm.platformtools.BroadcastHelper> r0 = com.tencent.p014mm.platformtools.BroadcastHelper.class
            int r4 = com.tencent.p014mm.platformtools.BroadcastHelper.f310937a     // Catch:{ Exception -> 0x003e }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ Exception -> 0x003e }
            com.tencent.mm.booter.CoreService$e r0 = (com.tencent.p014mm.booter.CoreService.C114706e) r0     // Catch:{ Exception -> 0x003e }
            r1.f343886g = r0     // Catch:{ Exception -> 0x003e }
            java.lang.String r4 = "MicroMsg.CoreService"
            java.lang.String r5 = "broadcastRegisterHelper = %s"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x003e }
            r6[r3] = r0     // Catch:{ Exception -> 0x003e }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r6)     // Catch:{ Exception -> 0x003e }
            com.tencent.mm.booter.CoreService$e r0 = r1.f343886g     // Catch:{ Exception -> 0x003e }
            r0.registerBroadcasts()     // Catch:{ Exception -> 0x003e }
            goto L_0x004e
        L_0x003e:
            r0 = move-exception
            java.lang.String r4 = "MicroMsg.CoreService"
            java.lang.String r5 = "onCreate Class.forName(com.tencent.mm.platformtools.BroadcastHelper) Exception = %s "
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r6[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r6)
        L_0x004e:
            r0 = 26
            boolean r0 = p206nj.C11171e.m11044a(r0)
            r4 = 4
            if (r0 == 0) goto L_0x008e
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r0 < r5) goto L_0x005e
            goto L_0x008e
        L_0x005e:
            boolean r0 = p206nj.C88956h.m111063d()
            if (r0 == 0) goto L_0x0065
            goto L_0x008e
        L_0x0065:
            java.lang.String r0 = "system_config_prefs"
            android.content.SharedPreferences r0 = r1.getSharedPreferences(r0, r4)
            java.lang.String r5 = "set_service"
            boolean r0 = r0.getBoolean(r5, r3)
            if (r0 == 0) goto L_0x008e
            r0 = -1213(0xfffffffffffffb43, float:NaN)
            android.app.Notification r5 = new android.app.Notification
            r5.<init>()
            r1.startForeground(r0, r5)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.booter.CoreService$InnerService> r5 = com.tencent.p014mm.booter.CoreService.InnerService.class
            r0.<init>(r1, r5)
            r1.startService(r0)
            java.lang.String r0 = "MicroMsg.CoreService"
            java.lang.String r5 = "set service for push."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
        L_0x008e:
            com.tencent.mm.sdk.platformtools.MMHandler r5 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r5.<init>((android.os.Looper) r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mars.Mars.init(r0, r5)
            com.tencent.mm.network.r0 r0 = new com.tencent.mm.network.r0
            r0.<init>()
            com.tencent.mars.stn.StnLogic.setCallBack(r0)
            com.tencent.mm.network.t r0 = new com.tencent.mm.network.t
            r0.<init>()
            com.tencent.mars.magicbox.IPxxLogic.setCallBack(r0)
            android.util.SparseArray<a30.a$b> r0 = a30.C112744a.f337600a
            int r0 = a30.C112744a.C112748c.f337609a
            r6 = 0
            if (r0 != 0) goto L_0x0190
            int r0 = android.os.Process.myPid()
            a30.C112744a.C112748c.f337609a = r0
            a30.b r0 = new a30.b
            r0.<init>()
            a30.C112744a.C112748c.f337614f = r0
            byte[] r7 = a30.C112744a.C112748c.f337613e
            monitor-enter(r7)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0133 }
            java.io.File r0 = r0.getCacheDir()     // Catch:{ all -> 0x0133 }
            java.lang.String r8 = "wakelock/wakelock_stats.bin"
            if (r0 != 0) goto L_0x00d3
            r0 = r6
            goto L_0x00db
        L_0x00d3:
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0133 }
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)     // Catch:{ all -> 0x0133 }
        L_0x00db:
            if (r0 != 0) goto L_0x00e7
            android.net.Uri$Builder r0 = new android.net.Uri$Builder     // Catch:{ all -> 0x0133 }
            r0.<init>()     // Catch:{ all -> 0x0133 }
            android.net.Uri$Builder r0 = r0.path(r8)     // Catch:{ all -> 0x0133 }
            goto L_0x00ee
        L_0x00e7:
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ all -> 0x0133 }
            r0.appendPath(r8)     // Catch:{ all -> 0x0133 }
        L_0x00ee:
            android.net.Uri r8 = r0.build()     // Catch:{ all -> 0x0133 }
            java.lang.String r9 = r8.getPath()     // Catch:{ all -> 0x0133 }
            if (r9 == 0) goto L_0x010e
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r3, r3)     // Catch:{ all -> 0x0133 }
            java.lang.String r10 = r8.getPath()     // Catch:{ all -> 0x0133 }
            boolean r10 = r10.equals(r9)     // Catch:{ all -> 0x0133 }
            if (r10 != 0) goto L_0x010e
            android.net.Uri$Builder r0 = r0.path(r9)     // Catch:{ all -> 0x0133 }
            android.net.Uri r8 = r0.build()     // Catch:{ all -> 0x0133 }
        L_0x010e:
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0133 }
            com.tencent.mm.vfs.f0 r9 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x0133 }
            com.tencent.mm.vfs.f0$h r9 = r9.mo177799l(r8, r6)     // Catch:{ all -> 0x0133 }
            java.io.InputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106421C(r8, r9)     // Catch:{ all -> 0x0133 }
            r0.<init>(r8)     // Catch:{ all -> 0x0133 }
            long r8 = r0.readLong()     // Catch:{ all -> 0x0131 }
            a30.C112744a.C112748c.f337610b = r8     // Catch:{ all -> 0x0131 }
            java.lang.Object r8 = r0.readObject()     // Catch:{ all -> 0x0131 }
            java.util.HashMap r8 = (java.util.HashMap) r8     // Catch:{ all -> 0x0131 }
            if (r8 == 0) goto L_0x0149
            java.util.HashMap<java.lang.String, a30.a$c$a> r9 = a30.C112744a.C112748c.f337612d     // Catch:{ all -> 0x0131 }
            r9.putAll(r8)     // Catch:{ all -> 0x0131 }
            goto L_0x0149
        L_0x0131:
            r8 = r0
            goto L_0x0134
        L_0x0133:
            r8 = r6
        L_0x0134:
            java.lang.String r0 = "MicroMsg.WakeLockStatsManager"
            java.lang.String r9 = "failed to load stats from storage, use default value for last stats info."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r9)     // Catch:{ all -> 0x0186 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0186 }
            a30.C112744a.C112748c.f337610b = r9     // Catch:{ all -> 0x0186 }
            java.util.HashMap<java.lang.String, a30.a$c$a> r0 = a30.C112744a.C112748c.f337612d     // Catch:{ all -> 0x0186 }
            r0.clear()     // Catch:{ all -> 0x0186 }
            if (r8 == 0) goto L_0x014c
            r0 = r8
        L_0x0149:
            r0.close()     // Catch:{ Exception -> 0x014c }
        L_0x014c:
            monitor-exit(r7)     // Catch:{ all -> 0x018d }
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ all -> 0x0179 }
            r0.<init>()     // Catch:{ all -> 0x0179 }
            java.lang.String r7 = "com.tencent.mm.ACTION.note_tracemsg_lock"
            r0.addAction(r7)     // Catch:{ all -> 0x0179 }
            java.lang.String r7 = "com.tencent.mm.ACTION.note_tracemsg_unlock"
            r0.addAction(r7)     // Catch:{ all -> 0x0179 }
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0179 }
            android.content.BroadcastReceiver r8 = a30.C112744a.C112748c.f337614f     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.WeChatPermissions.PERMISSION_MM_MESSAGE()     // Catch:{ all -> 0x0179 }
            r7.registerReceiver(r8, r0, r9, r6)     // Catch:{ all -> 0x0179 }
            java.lang.String r0 = "MicroMsg.WakeLockStatsManager"
            java.lang.String r7 = "WakeLockStatsManager is attached to process [%s]"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x0179 }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()     // Catch:{ all -> 0x0179 }
            r8[r3] = r9     // Catch:{ all -> 0x0179 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r7, r8)     // Catch:{ all -> 0x0179 }
            goto L_0x0190
        L_0x0179:
            r0 = move-exception
            java.lang.String r7 = "MicroMsg.WakeLockStatsManager"
            java.lang.String r8 = "[-] Fail to register reciever, statistics will be done in each process separately."
            java.lang.Object[] r9 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r8, r9)
            a30.C112744a.C112748c.f337609a = r3
            goto L_0x0190
        L_0x0186:
            r0 = move-exception
            if (r8 == 0) goto L_0x018c
            r8.close()     // Catch:{ Exception -> 0x018c }
        L_0x018c:
            throw r0     // Catch:{ all -> 0x018d }
        L_0x018d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x018d }
            throw r0
        L_0x0190:
            com.tencent.mm.booter.CoreService$3 r0 = new com.tencent.mm.booter.CoreService$3
            com.tencent.mm.app.f r7 = com.tencent.p014mm.app.C40008f.f107254d
            r0.<init>(r1, r7)
            r0.alive()
            boolean r0 = com.tencent.p014mm.network.C114781l0.f344161k
            if (r0 != 0) goto L_0x0241
            android.content.SharedPreferences r0 = com.tencent.p014mm.network.C114781l0.m161561h()
            java.lang.String r7 = "wakeup_alarm_last_tick"
            r8 = 0
            long r10 = r0.getLong(r7, r8)
            java.lang.String r12 = "wakeup_alarm_last_cnt"
            int r13 = r0.getInt(r12, r3)
            java.lang.String r14 = "MicroMsg.MMPushCore"
            int r15 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r15 == 0) goto L_0x0219
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            int r15 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r15 <= 0) goto L_0x01bf
            goto L_0x0219
        L_0x01bf:
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r10)
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x01ff
            android.content.SharedPreferences$Editor r8 = r0.edit()
            java.lang.String r9 = "wakeup_alarm_launch_cnt"
            android.content.SharedPreferences$Editor r8 = r8.putInt(r9, r13)
            r8.commit()
            android.content.SharedPreferences$Editor r8 = r0.edit()
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            android.content.SharedPreferences$Editor r7 = r8.putLong(r7, r9)
            r7.commit()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r12, r2)
            r0.commit()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r0[r3] = r7
            java.lang.String r7 = "dealWithOnCreate, statistics cycle expire, thisCnt:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r7, r0)
            goto L_0x0241
        L_0x01ff:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            int r13 = r13 + r2
            android.content.SharedPreferences$Editor r0 = r0.putInt(r12, r13)
            r0.commit()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r0[r3] = r7
            java.lang.String r7 = "dealWithOnCreate, add up launch count to:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r7, r0)
            goto L_0x0241
        L_0x0219:
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r8[r3] = r9
            java.lang.String r9 = "dealWithOnCreate, invalid time, thisCnt:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r9, r8)
            android.content.SharedPreferences$Editor r8 = r0.edit()
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            android.content.SharedPreferences$Editor r7 = r8.putLong(r7, r9)
            r7.commit()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r12, r2)
            r0.commit()
            goto L_0x0243
        L_0x0241:
            com.tencent.p014mm.network.C114781l0.f344161k = r2
        L_0x0243:
            com.tencent.mm.sdk.platformtools.MAlarmHandler$IBumper r0 = r1.f343887h
            com.tencent.p014mm.sdk.platformtools.MAlarmHandler.initAlarmBumper(r0)
            com.tencent.mars.comm.PlatformComm$IResetProcess r0 = com.tencent.mars.comm.PlatformComm.resetprocessimp
            if (r0 != 0) goto L_0x024e
            com.tencent.mars.comm.PlatformComm.resetprocessimp = r1
        L_0x024e:
            com.tencent.mars.comm.PlatformComm$IReportCrash r0 = com.tencent.mars.comm.PlatformComm.reportCrashImp
            if (r0 != 0) goto L_0x0254
            com.tencent.mars.comm.PlatformComm.reportCrashImp = r1
        L_0x0254:
            com.tencent.mm.network.l0 r0 = com.tencent.p014mm.network.C114781l0.m161562i()
            r0.f344165d = r5
            android.content.Context r0 = r17.getApplicationContext()
            com.tencent.mm.network.l0 r5 = com.tencent.p014mm.network.C114781l0.m161562i()
            r5.f344164c = r0
            com.tencent.mm.network.m0 r0 = new com.tencent.mm.network.m0
            r0.<init>()
            com.tencent.mm.network.l0 r5 = com.tencent.p014mm.network.C114781l0.m161562i()
            r5.f344162a = r0
            com.tencent.mm.network.n0 r0 = new com.tencent.mm.network.n0
            r0.<init>()
            com.tencent.mm.network.l0 r5 = com.tencent.p014mm.network.C114781l0.m161562i()
            r5.f344163b = r0
            com.tencent.mm.network.l0 r0 = com.tencent.p014mm.network.C114781l0.m161562i()
            java.util.List<com.tencent.mm.network.l0$a> r0 = r0.f344166e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0293
            com.tencent.mm.network.l0 r0 = com.tencent.p014mm.network.C114781l0.m161562i()
            java.util.List<com.tencent.mm.network.l0$a> r0 = r0.f344166e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r1)
        L_0x0293:
            com.tencent.mm.network.f0 r0 = new com.tencent.mm.network.f0
            r0.<init>()
            com.tencent.mm.network.l0 r5 = com.tencent.p014mm.network.C114781l0.m161562i()
            r5.f344170i = r0
            com.tencent.mm.network.y r0 = com.tencent.p014mm.network.C114781l0.m161554a()
            r1.f343883d = r0
            if (r0 != 0) goto L_0x02bf
            java.lang.String r0 = "MicroMsg.CoreService"
            java.lang.String r5 = "autoAuth is null and new one"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            com.tencent.mm.network.y r0 = new com.tencent.mm.network.y
            com.tencent.mm.sdk.platformtools.MMHandler r5 = com.tencent.p014mm.network.C114781l0.m161556c()
            r0.<init>(r5)
            r1.f343883d = r0
            com.tencent.mm.network.l0 r5 = com.tencent.p014mm.network.C114781l0.m161562i()
            r5.f344167f = r0
            goto L_0x02cb
        L_0x02bf:
            java.lang.String r0 = "MicroMsg.CoreService"
            java.lang.String r5 = "autoAuth is not null and reset"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r5)
            com.tencent.mm.network.y r0 = r1.f343883d
            r0.reset()
        L_0x02cb:
            com.tencent.mars.Mars.onCreate(r2)
            com.tencent.mm.network.i0 r0 = com.tencent.p014mm.network.C114781l0.m161559f()
            if (r0 != 0) goto L_0x02e7
            java.lang.String r0 = "MicroMsg.CoreService"
            java.lang.String r5 = "NetTaskAdapter is null and new one"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            com.tencent.mm.network.i0 r0 = new com.tencent.mm.network.i0
            r0.<init>()
            com.tencent.mm.network.l0 r5 = com.tencent.p014mm.network.C114781l0.m161562i()
            r5.f344168g = r0
            goto L_0x02f5
        L_0x02e7:
            java.lang.String r0 = "MicroMsg.CoreService"
            java.lang.String r5 = "NetTaskAdapter is not null and reset"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r5)
            com.tencent.mm.network.i0 r0 = com.tencent.p014mm.network.C114781l0.m161559f()
            r0.mo174434i()
        L_0x02f5:
            com.tencent.mm.network.g0 r0 = com.tencent.p014mm.network.C114781l0.m161557d()
            if (r0 != 0) goto L_0x0313
            java.lang.String r0 = "MicroMsg.CoreService"
            java.lang.String r5 = "NetNotifyAdapter is null and new one"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            com.tencent.mm.network.g0 r0 = new com.tencent.mm.network.g0
            r0.<init>()
            com.tencent.mm.network.l0 r5 = com.tencent.p014mm.network.C114781l0.m161562i()
            r5.f344169h = r0
            com.tencent.mm.network.g0 r0 = com.tencent.p014mm.network.C114781l0.m161557d()
            r0.f344146a = r1
        L_0x0313:
            f40.j r0 = f40.C86709a0.m107531m()
            j40.a r0 = r0.mo58407a()
            j40.b r0 = (j40.C87829b) r0
            com.tencent.mm.booter.d r0 = r0.f254268g
            if (r0 != 0) goto L_0x034c
            f40.j r0 = f40.C86709a0.m107531m()
            j40.a r0 = r0.mo58407a()
            j40.b r0 = (j40.C87829b) r0
            android.content.Context r5 = r17.getApplicationContext()
            com.tencent.mm.booter.d r5 = com.tencent.p014mm.booter.C80814d.m98665b(r5)
            r0.f254268g = r5
            f40.j r0 = f40.C86709a0.m107531m()
            j40.a r0 = r0.mo58407a()
            j40.b r0 = (j40.C87829b) r0
            com.tencent.mm.booter.d r0 = r0.f254268g
            java.lang.String r5 = "MicroMsg.CoreService"
            java.lang.String r7 = "summerauths init debug here[%s]"
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r8)
        L_0x034c:
            if (r0 == 0) goto L_0x03ae
            java.lang.String r5 = ".com.tencent.mm.debug.server.host.http"
            java.lang.String r5 = r0.mo112569d(r5)
            java.lang.String r7 = ".com.tencent.mm.debug.server.ports.http"
            java.lang.String r7 = r0.mo112569d(r7)
            java.lang.String r8 = ".com.tencent.mm.debug.server.host.socket"
            java.lang.String r8 = r0.mo112569d(r8)
            java.lang.String r9 = ".com.tencent.mm.debug.server.ports.socket"
            java.lang.String r9 = r0.mo112569d(r9)
            com.tencent.mm.network.y r10 = r1.f343883d
            r10.mo174502u(r5, r7, r8, r9)
            java.lang.String r5 = ".com.tencent.mm.debug.server.wallet.host"
            java.lang.String r5 = r0.mo112569d(r5)
            java.lang.String r7 = ".com.tencent.mm.debug.server.wallet.host.multi"
            java.lang.String r7 = r0.mo112569d(r7)
            java.lang.String r8 = ".com.tencent.mm.debug.server.wallet.ip"
            java.lang.String r8 = r0.mo112569d(r8)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r9 != 0) goto L_0x03a9
            java.lang.String r9 = "|"
            boolean r9 = r7.contains(r9)
            if (r9 == 0) goto L_0x03a9
            java.lang.String r5 = "\\|"
            java.lang.String[] r5 = r7.split(r5)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r5)
            if (r7 != 0) goto L_0x03ae
            int r7 = r5.length
            if (r7 <= 0) goto L_0x03ae
            int r7 = r5.length
            r9 = 0
        L_0x039d:
            if (r9 >= r7) goto L_0x03ae
            r10 = r5[r9]
            com.tencent.mm.network.y r11 = r1.f343883d
            r11.mo174501t(r10, r8)
            int r9 = r9 + 1
            goto L_0x039d
        L_0x03a9:
            com.tencent.mm.network.y r7 = r1.f343883d
            r7.mo174501t(r5, r8)
        L_0x03ae:
            if (r0 != 0) goto L_0x03b2
            r0 = r6
            goto L_0x03b8
        L_0x03b2:
            java.lang.String r5 = ".com.tencent.mm.debug.server.host.newdns"
            java.lang.String r0 = r0.mo112569d(r5)
        L_0x03b8:
            if (r0 == 0) goto L_0x03d2
            java.lang.String r5 = "@"
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L_0x03d2
            java.lang.String r5 = "@"
            java.lang.String[] r0 = r0.split(r5)
            r5 = r0[r3]
            r0 = r0[r2]
        L_0x03cc:
            r16 = r5
            r5 = r0
            r0 = r16
            goto L_0x03e8
        L_0x03d2:
            if (r0 == 0) goto L_0x03e7
            java.lang.String r5 = ":"
            boolean r5 = r0.contains(r5)
            if (r5 == 0) goto L_0x03e7
            java.lang.String r5 = ":"
            java.lang.String[] r0 = r0.split(r5)
            r5 = r0[r3]
            r0 = r0[r2]
            goto L_0x03cc
        L_0x03e7:
            r5 = r6
        L_0x03e8:
            com.tencent.mm.network.y r7 = r1.f343883d
            r7.mo174504w(r0, r5)
            android.content.Context r0 = r17.getApplicationContext()
            com.tencent.p014mm.booter.MMReceivers$AlarmReceiver.m161348b(r0)
            android.content.Context r7 = r17.getApplicationContext()
            java.lang.String r0 = "MicroMsg.AlarmReceiver"
            java.lang.String r5 = "keep awaker"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r5)
            eb0.i3 r0 = eb0.C7624i3.f25910c
            java.lang.String r5 = "login_user_name"
            java.lang.String r8 = ""
            java.lang.String r0 = r0.mo19a(r5, r8)
            if (r0 == 0) goto L_0x0417
            java.lang.String r5 = "[/\\\\]"
            java.lang.String r8 = "#"
            java.lang.String r0 = r0.replaceAll(r5, r8)
            java.lang.String r0 = r0.trim()
        L_0x0417:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "notify_key_pref"
            r8.append(r9)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            android.content.SharedPreferences r0 = r5.getSharedPreferences(r0, r4)
            java.lang.String r4 = "wakeup_alarm_launch_cnt"
            int r4 = r0.getInt(r4, r3)
            java.lang.String r5 = "wakeup_alarm_last_cnt"
            int r0 = r0.getInt(r5, r3)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r5[r3] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r5[r2] = r8
            java.lang.String r8 = "MicroMsg.MMPushCore"
            java.lang.String r9 = "isFrequentlyLaunch cnt:%d, thisCnt:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r5)
            r5 = 10
            if (r4 <= r5) goto L_0x0458
            r4 = 1
            goto L_0x0459
        L_0x0458:
            r4 = 0
        L_0x0459:
            if (r0 <= r5) goto L_0x045d
            r0 = 1
            goto L_0x045e
        L_0x045d:
            r0 = 0
        L_0x045e:
            r0 = r0 | r4
            if (r0 == 0) goto L_0x0465
            r0 = 300000(0x493e0, float:4.2039E-40)
            goto L_0x0468
        L_0x0465:
            r0 = 900000(0xdbba0, float:1.261169E-39)
        L_0x0468:
            r8 = 110(0x6e, float:1.54E-43)
            r9 = 0
            long r4 = java.lang.System.currentTimeMillis()
            long r12 = (long) r0
            long r10 = r4 + r12
            android.content.Intent r14 = new android.content.Intent
            java.lang.Class<com.tencent.mm.booter.MMReceivers$AlarmReceiver> r0 = com.tencent.p014mm.booter.MMReceivers$AlarmReceiver.class
            r14.<init>(r7, r0)
            r15 = 268435456(0x10000000, float:2.5243549E-29)
            p970gg.C87186a.m108242e(r7, r8, r9, r10, r12, r14, r15)
            android.content.Context r0 = r17.getApplicationContext()
            java.lang.String r4 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r4)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r6 = r0.getActiveNetworkInfo()     // Catch:{ Exception -> 0x048f }
            goto L_0x04a9
        L_0x048f:
            r0 = move-exception
            r4 = r0
            java.lang.String r0 = "MicroMsg.CoreService"
            java.lang.String r5 = ""
            java.lang.Object[] r7 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r4, r5, r7)
            java.lang.String r0 = "MicroMsg.CoreService"
            java.lang.String r5 = "getActiveNetworkInfo failed. %s"
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r4 = r4.getMessage()
            r7[r3] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r7)
        L_0x04a9:
            if (r6 == 0) goto L_0x04c3
            android.net.NetworkInfo$State r0 = r6.getState()
            android.net.NetworkInfo$State r4 = android.net.NetworkInfo.State.CONNECTED
            if (r0 == r4) goto L_0x04b4
            goto L_0x04c3
        L_0x04b4:
            com.tencent.mm.network.m0 r0 = com.tencent.p014mm.network.C114781l0.m161558e()
            r0.f344174b = r2
            com.tencent.mm.network.n0 r0 = com.tencent.p014mm.network.C114781l0.m161560g()
            r2 = 6
            r0.mo174443c(r2)
            goto L_0x04e4
        L_0x04c3:
            java.lang.String r0 = "MicroMsg.CoreService"
            java.lang.String r4 = "networkInfo.state: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            if (r6 != 0) goto L_0x04ce
            java.lang.String r5 = "null"
            goto L_0x04d2
        L_0x04ce:
            android.net.NetworkInfo$State r5 = r6.getState()
        L_0x04d2:
            r2[r3] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r4, r2)
            com.tencent.mm.network.m0 r0 = com.tencent.p014mm.network.C114781l0.m161558e()
            r0.f344174b = r3
            com.tencent.mm.network.n0 r0 = com.tencent.p014mm.network.C114781l0.m161560g()
            r0.mo174443c(r3)
        L_0x04e4:
            java.lang.Class<jc3.i> r0 = jc3.C87948i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            jc3.i r0 = (jc3.C87948i) r0
            com.tencent.mm.plugin.zero.u$c r0 = r0.mo119066fT()
            r0.mo119072i(r1)
            com.tencent.mm.booter.CoreService$b r0 = new com.tencent.mm.booter.CoreService$b
            r0.<init>(r1)
            r2 = 1000(0x3e8, double:4.94E-321)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r2)
            java.lang.String r0 = "MicroMsg.CoreService"
            java.lang.String r2 = "CoreService OnCreate "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.booter.CoreService.onCreate():void");
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.CoreService", "onDestroy~~~ threadID:" + Thread.currentThread());
        try {
            ((C87948i) C86312j.m106911c(C87948i.class)).mo119066fT().mo119071b(this);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.CoreService", "onDestroy onDestroy() mCoreServiceLifecycleCallbacks Exception: %s", e.getMessage());
        }
        SparseArray<C112744a.C112746b> sparseArray = C112744a.f337600a;
        if (C112744a.C112748c.f337609a > 0) {
            MMApplicationContext.getContext().unregisterReceiver(C112744a.C112748c.f337614f);
            C112744a.C112748c.m154188d();
            C112744a.C112748c.f337609a = 0;
            Log.m105925i("MicroMsg.WakeLockStatsManager", "WakeLockStatsManager is detached from process [%s]", MMApplicationContext.getProcessName());
        }
        super.onDestroy();
        mo174260b();
        C114706e eVar = this.f343886g;
        if (eVar != null) {
            try {
                eVar.unRegisterBroadcasts();
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.CoreService", "onDestroy unRegisterBroadcasts() Exception = %s ", e2.getMessage());
            }
        }
    }

    public void onRebind(Intent intent) {
        Log.m105918d("MicroMsg.CoreService", "onRebind~~~ threadID:" + Thread.currentThread());
        super.onRebind(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int myPid = Process.myPid();
        Log.m105925i("MicroMsg.CoreService", "onStartCommand lastpid:%d  pid:%d flags:%d startId:%d", Integer.valueOf(this.f343888i), Integer.valueOf(myPid), Integer.valueOf(i), Integer.valueOf(i2));
        if (myPid != this.f343888i) {
            this.f343888i = myPid;
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(99, 141, 1, false);
            if (intent != null && "auto".equals(intent.getStringExtra("START_TYPE"))) {
                dVar.idkeyStat(99, 140, 1, false);
            }
        }
        return 1;
    }

    public boolean onUnbind(Intent intent) {
        Log.m105918d("MicroMsg.CoreService", "onUnbind~~~ threadID:" + Thread.currentThread());
        C114781l0.m161558e().f344173a = null;
        C114781l0.m161562i().f344170i.getClass();
        return super.onUnbind(intent);
    }

    public void reportIdkey() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("alarm_crash");
        if (C31543z5.m39451a() - mmkv.getLong("report_time", 0) > 86400000) {
            mmkv.edit().putLong("report_time", C31543z5.m39451a());
            C117407d.INSTANCE.idkeyStat(1204, 0, 1, false);
        }
    }

    public void restartProcess() {
        Log.m105928w("MicroMsg.CoreService", "restartProcess");
        mo174260b();
    }
}
