package nk2;

import a70.C112760b;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.p014mm.booter.C80814d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.rtos.bluetooth.RtosBCChannel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.wechat.rtos.WeChatApi;
import fy3.C32224a;
import g02.C32291d;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ik2.C21096a;
import ik2.C21104d;
import java.io.File;
import jk2.C33588s;
import jk2.C33590x;
import jk2.C46559b;
import kk2.C21341d;
import l71.C117461a;
import mk2.C34582d;
import mk2.C34585h;
import p156gj.C87203t;
import p206nj.C88957l;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110821n;
import tc2.C118418g;
import z04.C119027c;

/* renamed from: nk2.f */
public final class C21641f {

    /* renamed from: l */
    public static final C21643b f61259l = new C21643b((C8480h) null);

    /* renamed from: m */
    public static final C13601g<C21641f> f61260m = C36568h.m40985a(C21642a.f61272d);

    /* renamed from: a */
    public C21096a f61261a;

    /* renamed from: b */
    public WeChatApi f61262b;

    /* renamed from: c */
    public MTimerHandler f61263c;

    /* renamed from: d */
    public boolean f61264d;

    /* renamed from: e */
    public boolean f61265e;

    /* renamed from: f */
    public C21644c f61266f;

    /* renamed from: g */
    public C21645d f61267g;

    /* renamed from: h */
    public C21646e f61268h;

    /* renamed from: i */
    public C21648g f61269i;

    /* renamed from: j */
    public String f61270j = "";

    /* renamed from: k */
    public boolean f61271k;

    /* renamed from: nk2.f$a */
    public static final class C21642a extends C87413o implements C32224a<C21641f> {

        /* renamed from: d */
        public static final C21642a f61272d = new C21642a();

        public C21642a() {
            super(0);
        }

        public Object invoke() {
            return new C21641f();
        }
    }

    /* renamed from: nk2.f$b */
    public static final class C21643b {
        public C21643b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C21641f mo33911a() {
            return (C21641f) ((C36570n) C21641f.f61260m).getValue();
        }
    }

    /* renamed from: nk2.f$c */
    public interface C21644c {
        /* renamed from: a */
        void mo33912a(boolean z, String str);
    }

    /* renamed from: nk2.f$d */
    public interface C21645d {
        /* renamed from: a */
        void mo10152a(String str, String str2);
    }

    /* renamed from: nk2.f$e */
    public interface C21646e {
        /* renamed from: a */
        void mo33913a(String str);

        /* renamed from: b */
        void mo33914b();
    }

    /* renamed from: nk2.f$f */
    public interface C21647f {
        /* renamed from: a */
        void mo33234a(int i);
    }

    /* renamed from: nk2.f$g */
    public static final class C21648g {

        /* renamed from: a */
        public String f61273a;

        /* renamed from: b */
        public String f61274b;

        /* renamed from: c */
        public C21647f f61275c;

        public C21648g(String str, String str2, C21647f fVar) {
            this.f61273a = str;
            this.f61274b = str2;
            this.f61275c = fVar;
        }

        /* renamed from: a */
        public final void mo33915a() {
            C21643b bVar = C21641f.f61259l;
            boolean z = false;
            if (!bVar.mo33911a().f61264d) {
                Log.m105928w("MicroMsg.Rtos.RtosWatchService", "WaitScanTask but not init");
                C21647f fVar = this.f61275c;
                if (fVar != null) {
                    fVar.mo33234a(0);
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "WaitScanTask " + this.f61273a);
            C21096a aVar = bVar.mo33911a().f61261a;
            if (aVar != null && !aVar.mo24191i()) {
                C21647f fVar2 = this.f61275c;
                if (fVar2 != null) {
                    fVar2.mo33234a(13);
                    return;
                }
                return;
            }
            C21096a aVar2 = bVar.mo33911a().f61261a;
            String f = aVar2 != null ? aVar2.mo24188f(this.f61273a) : null;
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "WaitScanTask watch mac is " + f + ", avatar is " + this.f61274b);
            bVar.mo33911a().f61270j = this.f61274b;
            bVar.mo33911a().f61271k = false;
            C21096a aVar3 = bVar.mo33911a().f61261a;
            if (aVar3 != null) {
                C87412m.m108591d(f);
                if (aVar3.mo24185d(f)) {
                    z = true;
                }
            }
            if (z) {
                C21096a aVar4 = bVar.mo33911a().f61261a;
                if (aVar4 != null) {
                    C87412m.m108591d(f);
                    aVar4.init(f);
                }
                C21647f fVar3 = this.f61275c;
                if (fVar3 != null) {
                    fVar3.mo33234a(12);
                    return;
                }
                return;
            }
            C21647f fVar4 = this.f61275c;
            if (fVar4 != null) {
                fVar4.mo33234a(9);
            }
        }
    }

    /* renamed from: nk2.f$h */
    public static final class C21649h implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C21641f f61276d;

        public C21649h(C21641f fVar) {
            this.f61276d = fVar;
        }

        public final boolean onTimerExpired() {
            Log.m105928w("MicroMsg.Rtos.RtosWatchService", "require login but expire time");
            C21645d dVar = this.f61276d.f61267g;
            if (dVar == null) {
                return false;
            }
            dVar.mo10152a("", "");
            return false;
        }
    }

    /* renamed from: nk2.f$i */
    public static final class C21650i implements WeChatApi.Callback {

        /* renamed from: a */
        public final /* synthetic */ C21641f f61277a;

        /* renamed from: nk2.f$i$a */
        public static final class C21651a<T> implements C1256g {

            /* renamed from: d */
            public final /* synthetic */ C21641f f61278d;

            public C21651a(C21641f fVar) {
                this.f61278d = fVar;
            }

            /* renamed from: a */
            public void mo894a(Object obj) {
                Bundle bundle = (Bundle) obj;
                int i = bundle.getInt("code");
                if (i != 0) {
                    Log.m105928w("MicroMsg.Rtos.RtosWatchService", "handshake cgi failed " + i);
                    C21644c cVar = this.f61278d.f61266f;
                    if (cVar != null) {
                        cVar.mo33912a(false, "");
                    }
                    this.f61278d.f61266f = null;
                }
                WeChatApi weChatApi = this.f61278d.f61262b;
                if (weChatApi != null) {
                    weChatApi.cloudHandShakeEnd(i, bundle.getInt("taskid"), bundle.getString("handshke"));
                }
            }
        }

        public C21650i(C21641f fVar) {
            this.f61277a = fVar;
        }

        public void onCancelLoginEvent() {
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "receive watch cancel login");
            C21096a aVar = this.f61277a.f61261a;
            if (aVar != null) {
                ((RtosBCChannel) aVar).mo24196l();
            }
            C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCVoid(), C33590x.class);
        }

        public void onCannotLoginEvent() {
            Log.m105928w("MicroMsg.Rtos.RtosWatchService", "onCannotLoginEvent");
            C21645d dVar = this.f61277a.f61267g;
            if (dVar != null) {
                dVar.mo10152a("", "");
            }
        }

        public void onChannelHandshakeSuccessEvent() {
            String str;
            String str2;
            WeChatApi weChatApi;
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "onChannelHandshakeSuccessEvent");
            C21641f fVar = this.f61277a;
            if (fVar.f61271k && (weChatApi = fVar.f61262b) != null) {
                weChatApi.notifyUnbindWechat();
            }
            C21641f fVar2 = this.f61277a;
            fVar2.f61265e = true;
            WeChatApi weChatApi2 = fVar2.f61262b;
            if (weChatApi2 != null) {
                C21096a aVar = fVar2.f61261a;
                if (aVar == null || (str2 = ((RtosBCChannel) aVar).mo24198n()) == null) {
                    str2 = "RtosWatch";
                }
                weChatApi2.updateDeviceName(str2);
            }
            C21641f fVar3 = this.f61277a;
            C21644c cVar = fVar3.f61266f;
            if (cVar != null) {
                boolean z = fVar3.f61265e;
                C21096a aVar2 = fVar3.f61261a;
                if (aVar2 == null || (str = ((RtosBCChannel) aVar2).mo24198n()) == null) {
                    str = "";
                }
                cVar.mo33912a(z, str);
            }
            this.f61277a.f61266f = null;
        }

        public void onCloseChannelEvent(long j) {
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "onCloseChannelEvent " + j);
            C21096a aVar = this.f61277a.f61261a;
            if (aVar != null) {
                aVar.disconnect();
            }
        }

        public void onCloudHandShakeEvent(int i, String str) {
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "begin handShake cgi " + str);
            Bundle bundle = new Bundle();
            C32291d.m39670c(bundle, "taskid", i);
            if (str == null) {
                str = "";
            }
            C32291d.m39671d(bundle, "handshke", str);
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C46559b.class, new C21651a(this.f61277a));
        }

        public String onGetExtSpamInfoEvent(int i) {
            byte[] Va = C118418g.INSTANCE.mo175803Va(16);
            if (Va == null) {
                return "";
            }
            if (!(!(Va.length == 0))) {
                return "";
            }
            String str = new String(Va, C119027c.f356488a);
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "spamInfo size in java = " + str.length());
            return str;
        }

        public int onGetLicenseEvent(String str, String str2) {
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "onGetLicense " + str2 + ' ' + str);
            MTimerHandler mTimerHandler = this.f61277a.f61263c;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            boolean z = true;
            if (str2 == null || !str2.equals("TEST")) {
                z = false;
            }
            if (z) {
                C21645d dVar = this.f61277a.f61267g;
                if (dVar != null) {
                    dVar.mo10152a(str, "{\n    \"product_id\": 3682,\n    \"key_version\": 1,\n    \"device_sn\": \"66:66:88:11:12:05\",\n    \"device_signature\": \"MEQCIDh9+NQL09DDOm0ks/HqliGigkom/NYQsLGWQqWgeV0HAiBNhDZiDHyTgCwrtZdKa0PPC0B0fBaP5G6u4yZcTPiTdQ==\"\n}");
                }
            } else {
                C21645d dVar2 = this.f61277a.f61267g;
                if (dVar2 != null) {
                    dVar2.mo10152a(str, str2);
                }
            }
            return 0;
        }

        public String onGetLoginAvatarEvent() {
            String str = this.f61277a.f61270j;
            return str == null ? "" : str;
        }

        public boolean onIsForegroundEvent() {
            return true;
        }

        public boolean onIsPhysicalLinkConnectedEvent() {
            return true;
        }

        public void onListenServiceEvent(String str) {
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_SERVICE_NAME);
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "onListenServiceEvent " + str);
            C21096a aVar = this.f61277a.f61261a;
            if (aVar != null) {
                ((RtosBCChannel) aVar).mo24197m();
            }
        }

        public void onLoginResultEvent(int i) {
            if (i == 0) {
                C21646e eVar = this.f61277a.f61268h;
                if (eVar != null) {
                    eVar.mo33914b();
                }
                this.f61277a.f61268h = null;
                return;
            }
            C21646e eVar2 = this.f61277a.f61268h;
            if (eVar2 != null) {
                eVar2.mo33913a("error_code " + i);
            }
            this.f61277a.f61268h = null;
        }

        public void onLogoutEvent() {
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "onLogoutEvent");
            C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCVoid(), C33588s.class);
            C21641f fVar = this.f61277a;
            C21648g gVar = fVar.f61269i;
            if (gVar != null) {
                C87412m.m108591d(gVar);
                gVar.mo33915a();
                this.f61277a.f61269i = null;
                return;
            }
            fVar.mo33907a();
        }

        public boolean onRequestUseCloudHandShakeEvent() {
            return true;
        }

        public void onWriteChannelDataEvent(long j, byte[] bArr) {
            C21096a aVar;
            if (bArr != null && (aVar = this.f61277a.f61261a) != null) {
                aVar.mo24189g(bArr);
            }
        }

        public boolean onisNetworkConnectedEvent() {
            this.f61277a.getClass();
            return NetStatusUtil.isConnected(MMApplicationContext.getContext());
        }
    }

    /* renamed from: nk2.f$j */
    public static final class C21652j implements C21104d {

        /* renamed from: a */
        public final /* synthetic */ C21641f f61279a;

        public C21652j(C21641f fVar) {
            this.f61279a = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a2, code lost:
            if ((r1.length() == 0) != false) goto L_0x00a4;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo32871a() {
            /*
                r6 = this;
                java.lang.String r0 = "MicroMsg.Rtos.RtosWatchService"
                java.lang.String r1 = "onBluetoothOn"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
                com.tencent.mm.ipcinvoker.type.IPCVoid r2 = new com.tencent.mm.ipcinvoker.type.IPCVoid
                r2.<init>()
                java.lang.Class<jk2.t> r3 = jk2.C33589t.class
                android.os.Parcelable r1 = com.tencent.p014mm.ipcinvoker.C80907o.m98783f(r1, r2, r3)
                android.os.Bundle r1 = (android.os.Bundle) r1
                java.lang.String r2 = ""
                r3 = 0
                if (r1 == 0) goto L_0x0024
                java.lang.String r4 = "mac"
                java.lang.String r4 = r1.getString(r4, r2)
                goto L_0x0025
            L_0x0024:
                r4 = r3
            L_0x0025:
                if (r1 == 0) goto L_0x002f
                java.lang.String r5 = "username"
                java.lang.String r1 = r1.getString(r5, r2)
                goto L_0x0030
            L_0x002f:
                r1 = r3
            L_0x0030:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "onBluetoothOn storeMac:"
                r2.append(r5)
                r2.append(r4)
                java.lang.String r5 = ", storeUsername:"
                r2.append(r5)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                r0 = 0
                r2 = 1
                if (r4 == 0) goto L_0x005a
                int r5 = r4.length()
                if (r5 != 0) goto L_0x0058
                goto L_0x005a
            L_0x0058:
                r5 = 0
                goto L_0x005b
            L_0x005a:
                r5 = 1
            L_0x005b:
                if (r5 != 0) goto L_0x00a7
                nk2.f r5 = r6.f61279a
                ik2.a r5 = r5.f61261a
                if (r5 == 0) goto L_0x0069
                com.tencent.mm.plugin.rtos.bluetooth.RtosBCChannel r5 = (com.tencent.p014mm.plugin.rtos.bluetooth.RtosBCChannel) r5
                java.lang.String r3 = r5.mo24188f(r4)
            L_0x0069:
                nk2.f r4 = r6.f61279a
                ik2.a r4 = r4.f61261a
                if (r4 == 0) goto L_0x0077
                gy3.C87412m.m108591d(r3)
                com.tencent.mm.plugin.rtos.bluetooth.RtosBCChannel r4 = (com.tencent.p014mm.plugin.rtos.bluetooth.RtosBCChannel) r4
                r4.init(r3)
            L_0x0077:
                nk2.f r3 = r6.f61279a
                ik2.a r3 = r3.f61261a
                if (r3 == 0) goto L_0x0087
                com.tencent.mm.plugin.rtos.bluetooth.RtosBCChannel r3 = (com.tencent.p014mm.plugin.rtos.bluetooth.RtosBCChannel) r3
                boolean r3 = r3.mo24199o()
                if (r3 != r2) goto L_0x0087
                r3 = 1
                goto L_0x0088
            L_0x0087:
                r3 = 0
            L_0x0088:
                if (r3 == 0) goto L_0x0095
                nk2.f r3 = r6.f61279a
                ik2.a r3 = r3.f61261a
                if (r3 == 0) goto L_0x0095
                com.tencent.mm.plugin.rtos.bluetooth.RtosBCChannel r3 = (com.tencent.p014mm.plugin.rtos.bluetooth.RtosBCChannel) r3
                r3.mo24197m()
            L_0x0095:
                nk2.f r3 = r6.f61279a
                if (r1 == 0) goto L_0x00a4
                int r1 = r1.length()
                if (r1 != 0) goto L_0x00a1
                r1 = 1
                goto L_0x00a2
            L_0x00a1:
                r1 = 0
            L_0x00a2:
                if (r1 == 0) goto L_0x00a5
            L_0x00a4:
                r0 = 1
            L_0x00a5:
                r3.f61271k = r0
            L_0x00a7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nk2.C21641f.C21652j.mo32871a():void");
        }

        /* renamed from: b */
        public void mo32872b() {
            C21641f fVar = this.f61279a;
            C21096a aVar = fVar.f61261a;
            if (aVar != null) {
                long j = ((RtosBCChannel) aVar).f53335f;
                WeChatApi weChatApi = fVar.f61262b;
                if (weChatApi != null) {
                    weChatApi.notifyChannelDisconnected(j);
                }
            }
            this.f61279a.f61265e = false;
        }

        /* renamed from: c */
        public void mo32873c(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            if (bArr != null) {
                C110821n.m150960g(bArr, bArr2, 0, 0, i);
            }
            C21641f fVar = this.f61279a;
            C21096a aVar = fVar.f61261a;
            if (aVar != null) {
                long j = ((RtosBCChannel) aVar).f53335f;
                WeChatApi weChatApi = fVar.f61262b;
                if (weChatApi != null) {
                    weChatApi.notifyChannelData(j, bArr2);
                }
            }
        }

        /* renamed from: d */
        public void mo32874d(boolean z) {
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "onIsDeviceBonded ..." + z);
            if (!z) {
                Log.m105928w("MicroMsg.Rtos.RtosWatchService", "bt is unbond! clear and close everything");
                WeChatApi weChatApi = this.f61279a.f61262b;
                if (weChatApi != null) {
                    weChatApi.logout();
                }
                C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCVoid(), C33588s.class);
                this.f61279a.mo33907a();
            }
        }

        /* renamed from: e */
        public void mo32875e() {
            C21641f fVar = this.f61279a;
            C21096a aVar = fVar.f61261a;
            if (aVar != null) {
                long j = ((RtosBCChannel) aVar).f53335f;
                WeChatApi weChatApi = fVar.f61262b;
                if (weChatApi != null) {
                    weChatApi.notifyNewChannelConnected(j, 512);
                }
            }
        }

        /* renamed from: f */
        public void mo32876f() {
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "onBluetoothOff");
        }
    }

    public C21641f() {
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "init service");
        String valueOf = String.valueOf(MultiProcessMMKV.getDefault().getString("patch_id", ""));
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "load so patchId" + valueOf);
        C34585h hVar = C34585h.f93003a;
        String str = C34582d.f92998a;
        C88957l.m111067c(hVar.mo59646b("wechat_rtos_service", valueOf));
        C88957l.m111078n("wechat_rtos_service");
        C88957l.m111078n("png2tga");
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "finish load so");
    }

    /* renamed from: a */
    public final synchronized void mo33907a() {
        if (!this.f61264d) {
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "already close");
            return;
        }
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "onClose");
        MTimerHandler mTimerHandler = this.f61263c;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        this.f61263c = null;
        C21096a aVar = this.f61261a;
        if (aVar != null) {
            aVar.close();
        }
        C21096a aVar2 = this.f61261a;
        if (aVar2 != null) {
            aVar2.mo24182b();
        }
        this.f61261a = null;
        this.f61266f = null;
        this.f61267g = null;
        this.f61268h = null;
        this.f61264d = false;
        this.f61265e = false;
        this.f61271k = false;
        C117461a.m165683c(C117461a.C117463b.RTOS_SERVICE_DESTROY);
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "onClose end");
    }

    /* renamed from: b */
    public final synchronized void mo33908b() {
        if (this.f61264d) {
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "already init");
            return;
        }
        this.f61264d = true;
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "onInit");
        mo33910d();
        mo33909c();
        this.f61263c = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C21649h(this), false);
        C117461a.m165683c(C117461a.C117463b.RTOS_SERVICE_CREATE);
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "init done");
    }

    /* renamed from: c */
    public final void mo33909c() {
        if (this.f61262b == null) {
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "initAlita");
            WeChatApi weChatApi = new WeChatApi();
            this.f61262b = weChatApi;
            weChatApi.setCallback(new C21650i(this));
            String str = "RTOS_" + C87203t.m108273i();
            String mD5String = MD5Util.getMD5String(str);
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "rtosDeviceId = " + str + " hw_device_id = " + mD5String);
            C80814d b = C80814d.m98665b(MMApplicationContext.getContext());
            boolean z = Util.isNullOrNil(b.mo112569d(".com.tencent.mm.debug.log.mmlog")) && Util.nullAs(b.mo112567a(".com.tencent.mm.debug.test.uploadLog"), false);
            C21341d dVar = new C21341d();
            dVar.f60333e = MMApplicationContext.getContext().getCacheDir().getAbsolutePath();
            dVar.f60332d = MMApplicationContext.getContext().getFilesDir().getAbsolutePath();
            File externalFilesDir = MMApplicationContext.getContext().getExternalFilesDir("");
            C87412m.m108591d(externalFilesDir);
            dVar.f60343r = externalFilesDir.getAbsolutePath();
            File externalCacheDir = MMApplicationContext.getContext().getExternalCacheDir();
            C87412m.m108591d(externalCacheDir);
            dVar.f60344s = externalCacheDir.getAbsolutePath();
            dVar.f60345t = C112760b.m154234h0();
            dVar.f60334f = mD5String;
            dVar.f60335g = "RtosWatch";
            dVar.f60336h = Build.BRAND;
            dVar.f60337i = C87203t.m108275k();
            dVar.f60338j = Build.VERSION.RELEASE;
            dVar.f60339n = 0;
            dVar.f60340o = z;
            dVar.f60341p = true;
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "begin start alita, isLogcatOpen " + z);
            WeChatApi weChatApi2 = this.f61262b;
            if (weChatApi2 != null) {
                weChatApi2.start(dVar.toByteArray());
            }
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "initAlita end");
        }
    }

    /* renamed from: d */
    public final void mo33910d() {
        if (this.f61261a == null) {
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "initChannel");
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            RtosBCChannel rtosBCChannel = new RtosBCChannel(context);
            this.f61261a = rtosBCChannel;
            rtosBCChannel.mo24194j(new C21652j(this));
            Log.m105924i("MicroMsg.Rtos.RtosWatchService", "initChannel end");
        }
    }
}
