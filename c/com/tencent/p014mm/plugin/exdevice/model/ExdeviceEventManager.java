package com.tencent.p014mm.plugin.exdevice.model;

import a81.C39507g;
import a81.C39509i;
import a81.C39511k;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BackupProcessMgrExitEvent;
import com.tencent.p014mm.autogen.events.ExDeviceBindHardDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceCancelNetworkDeviceTaskEvent;
import com.tencent.p014mm.autogen.events.ExDeviceCheckDeviceHasAbilityEvent;
import com.tencent.p014mm.autogen.events.ExDeviceCheckDeviceIsBoundEvent;
import com.tencent.p014mm.autogen.events.ExDeviceCheckNetworkDeviceUploadCdnEvent;
import com.tencent.p014mm.autogen.events.ExDeviceConnectDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceConnectLanDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceConnectStrategyActionEvent;
import com.tencent.p014mm.autogen.events.ExDeviceGetBoundDevicesEvent;
import com.tencent.p014mm.autogen.events.ExDeviceGetBoundIotDevicesEvent;
import com.tencent.p014mm.autogen.events.ExDeviceGetCurrentSSIDEvent;
import com.tencent.p014mm.autogen.events.ExDeviceGetDeviceInfosEvent;
import com.tencent.p014mm.autogen.events.ExDeviceGetLanDeviceInfosEvent;
import com.tencent.p014mm.autogen.events.ExDeviceGetNetworkDeviceInfoEvent;
import com.tencent.p014mm.autogen.events.ExDeviceGetTicketEvent;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceIBeaconRangingEvent;
import com.tencent.p014mm.autogen.events.ExDeviceLanDeviceConnectStateEvent;
import com.tencent.p014mm.autogen.events.ExDeviceOPFromJSAPIEvent;
import com.tencent.p014mm.autogen.events.ExDeviceOnDeviceBindStateChangeEvent;
import com.tencent.p014mm.autogen.events.ExDeviceOnRecvDataFromDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceOpInChattingUIEvent;
import com.tencent.p014mm.autogen.events.ExDeviceOpenLanDeviceLibEvent;
import com.tencent.p014mm.autogen.events.ExDeviceScanDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSendDataToDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSendDataToLanDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSetSendDataDirectionEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSettingShowEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSimpleBTBindDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSimpleBTConnectDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSimpleBTOnConnectStateEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSimpleBTOnScanResultEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSimpleBTScanDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSimpleBTSendDataToDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSimpleBTUploadDataToServerEvent;
import com.tencent.p014mm.autogen.events.ExDeviceStartScanLanDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceStopScanNetworkDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSupportMsgTypeEvent;
import com.tencent.p014mm.autogen.events.ExDeviceUnBindHardDeviceEvent;
import com.tencent.p014mm.autogen.events.MMSwitchBackgroundPushEvent;
import com.tencent.p014mm.autogen.events.MMSwitchViewPushEvent;
import com.tencent.p014mm.autogen.events.OpFromExDeviceEvent;
import com.tencent.p014mm.autogen.events.StopAllChannelEvent;
import com.tencent.p014mm.autogen.events.StopAllChannelWithParamsEvent;
import com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.p014mm.plugin.exdevice.model.C41125f0;
import com.tencent.p014mm.plugin.exdevice.model.C41154p0;
import com.tencent.p014mm.plugin.exdevice.service.C41178a;
import com.tencent.p014mm.plugin.exdevice.service.C41188e;
import com.tencent.p014mm.plugin.exdevice.service.C41209m;
import com.tencent.p014mm.plugin.exdevice.service.ExDeviceService;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.service.C116024c;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.xweb.WCWebUpdater;
import d81.C45288e;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ke3.C88144b;
import lc3.C10485b;
import n71.C47180k;
import nw0.C47302a;
import nw0.C47303f;
import ob0.C117747y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p227rn.C48053v;
import qe3.C89625d;
import qw0.C47887a;
import te3.C48759at2;
import te3.C49697hf2;
import te3.C50337m12;
import tv2.C52366c;
import y71.C53498h;
import y71.C53499i;
import y71.C53501k;
import y71.C53502m;
import y71.C53503o;
import z71.C39323f;
import z71.C53753b;
import z71.C53754c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager */
public class ExdeviceEventManager {

    /* renamed from: A */
    public IListener f110694A;

    /* renamed from: B */
    public IListener f110695B;

    /* renamed from: C */
    public IListener f110696C;

    /* renamed from: D */
    public IListener f110697D;

    /* renamed from: E */
    public IListener f110698E;

    /* renamed from: F */
    public IListener f110699F;

    /* renamed from: G */
    public IListener f110700G;

    /* renamed from: H */
    public IListener f110701H;

    /* renamed from: I */
    public IListener f110702I;

    /* renamed from: J */
    public IListener f110703J;

    /* renamed from: K */
    public IListener f110704K;

    /* renamed from: L */
    public IListener f110705L;

    /* renamed from: M */
    public IListener f110706M;

    /* renamed from: N */
    public IListener f110707N;

    /* renamed from: O */
    public IListener f110708O;

    /* renamed from: P */
    public IListener f110709P;

    /* renamed from: Q */
    public ExdeviceWCLanSDKUtil f110710Q;

    /* renamed from: R */
    public C93367y f110711R;

    /* renamed from: S */
    public boolean f110712S;

    /* renamed from: T */
    public MMHandler f110713T;

    /* renamed from: U */
    public C41112f f110714U;

    /* renamed from: a */
    public List<C41111e> f110715a;

    /* renamed from: b */
    public Map<String, C41111e> f110716b;

    /* renamed from: c */
    public IListener f110717c;

    /* renamed from: d */
    public IListener f110718d;

    /* renamed from: e */
    public IListener f110719e;

    /* renamed from: f */
    public IListener f110720f;

    /* renamed from: g */
    public IListener f110721g;

    /* renamed from: h */
    public IListener f110722h;

    /* renamed from: i */
    public IListener f110723i;

    /* renamed from: j */
    public IMvvmObserver<Object> f110724j = new C41109c();

    /* renamed from: k */
    public IListener f110725k;

    /* renamed from: l */
    public IListener f110726l;

    /* renamed from: m */
    public IListener f110727m;

    /* renamed from: n */
    public IListener f110728n;

    /* renamed from: o */
    public IListener f110729o;

    /* renamed from: p */
    public IListener f110730p;

    /* renamed from: q */
    public IListener f110731q;

    /* renamed from: r */
    public IListener f110732r;

    /* renamed from: s */
    public IListener f110733s;

    /* renamed from: t */
    public IListener f110734t;

    /* renamed from: u */
    public IListener f110735u;

    /* renamed from: v */
    public IListener f110736v;

    /* renamed from: w */
    public IListener f110737w;

    /* renamed from: x */
    public IListener f110738x;

    /* renamed from: y */
    public IListener f110739y;

    /* renamed from: z */
    public IListener f110740z;

    /* renamed from: com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager$a */
    public class C41107a implements C41125f0.C41127b {
        public C41107a() {
        }

        /* renamed from: a */
        public void mo64186a(long j, int i, int i2, int i3, long j2) {
            LinkedList<C41111e> linkedList;
            Log.m105919d("MicroMsg.exdevice.ExdeviceEventManager", "mac=%d, oldState=%d, newState=%d, errCode=%d, profileType=%d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j2));
            ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
            String f = C45288e.m50135f(j);
            synchronized (exdeviceEventManager.f110715a) {
                linkedList = new LinkedList<>(exdeviceEventManager.f110715a);
            }
            for (C41111e F4 : linkedList) {
                F4.mo64188F4(f, i2, j2);
            }
            linkedList.clear();
            for (C41111e F42 : ((HashMap) exdeviceEventManager.f110716b).values()) {
                F42.mo64188F4(f, i2, j2);
            }
            ExDeviceSimpleBTOnConnectStateEvent exDeviceSimpleBTOnConnectStateEvent = new ExDeviceSimpleBTOnConnectStateEvent();
            ExDeviceSimpleBTOnConnectStateEvent.C40082a aVar = exDeviceSimpleBTOnConnectStateEvent.f107489d;
            aVar.f107490a = f;
            aVar.f107491b = i2;
            aVar.f107492c = j2;
            exDeviceSimpleBTOnConnectStateEvent.asyncPublish(Looper.getMainLooper());
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager$b */
    public class C41108b extends C41209m.C41210a {
        public C41108b() {
        }

        /* renamed from: qV */
        public void mo64187qV(long j, int i, int i2, String str) {
            LinkedList<C41111e> linkedList;
            Object[] objArr = new Object[4];
            objArr[0] = Long.valueOf(j);
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            if (str == null) {
                str = "null";
            }
            objArr[3] = str;
            Log.m105919d("MicroMsg.exdevice.ExdeviceEventManager", "onSendEnd. mac=%d, errType=%d, errCode=%d, errMsg=%s", objArr);
            ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
            String f = C45288e.m50135f(j);
            boolean z = i2 == 0;
            exdeviceEventManager.getClass();
            Log.m105919d("MicroMsg.exdevice.ExdeviceEventManager", "notifySimpleBTOnSend, mac : %s, isSucc : %s", f, Boolean.valueOf(z));
            if (!z) {
                synchronized (exdeviceEventManager.f110715a) {
                    linkedList = new LinkedList<>(exdeviceEventManager.f110715a);
                }
                for (C41111e h1 : linkedList) {
                    h1.mo64189h1(f, (byte[]) null, false);
                }
                linkedList.clear();
                for (C41111e h15 : ((HashMap) exdeviceEventManager.f110716b).values()) {
                    h15.mo64189h1(f, (byte[]) null, false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager$c */
    public class C41109c implements IMvvmObserver<Object> {
        public C41109c() {
        }

        public void onChanged(Object obj) {
            boolean z;
            ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
            exdeviceEventManager.getClass();
            Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "receive SyncExdeviceDataEvent");
            int m = C86709a0.m107529k().f251779b.mo123467m();
            if (m == 4 || m == 6) {
                String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("DeviceAutoSyncClose");
                Log.m105925i("MicroMsg.exdevice.Util", "handleSyncExdeviceDataEvent, auto sync has close : %s", c);
                if (Util.isNullOrNil(c) || !c.equalsIgnoreCase("1")) {
                    z = true;
                } else {
                    Log.m105924i("MicroMsg.exdevice.Util", "auto sync has closed, ignore this sync request");
                    z = false;
                }
                if (!z) {
                    Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "not allowed to sync exdevice data");
                    return;
                }
                C41154p0 p0Var = C41154p0.INSTANCE;
                if (p0Var.mo64216c(false)) {
                    Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "now need to get bound iot harddevices");
                    p0Var.mo64218f();
                }
                if (!C47887a.m53195b(MMApplicationContext.getContext())) {
                    Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "now sdk version not support ble device : %d", Integer.valueOf(Build.VERSION.SDK_INT));
                } else if (!C47887a.m53196c()) {
                    Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "Bluetooth is not open, Just leave");
                } else {
                    C41166r1.xx0().getClass();
                    if (C41140m.f110825g == 1) {
                        Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "it is in brand");
                    } else if (p0Var.mo64215b(false)) {
                        Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "now need to get bound harddevices");
                        p0Var.mo64217e((Context) null, new C41169u(exdeviceEventManager));
                    } else {
                        Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "now do not need to get bound device, do sync directly");
                        exdeviceEventManager.mo64170b();
                    }
                }
            } else {
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "net work state is not connected, now state is %d", Integer.valueOf(m));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager$d */
    public class C41110d implements C41111e {

        /* renamed from: d */
        public String f110769d;

        /* renamed from: e */
        public String f110770e;

        /* renamed from: f */
        public String f110771f;

        /* renamed from: g */
        public String f110772g;

        public C41110d(ExdeviceEventManager exdeviceEventManager, String str, String str2, String str3, String str4) {
            this.f110769d = str;
            this.f110770e = str2;
            this.f110771f = str3;
            this.f110772g = str4;
            Log.m105919d("MicroMsg.exdevice.ExdeviceEventManager", "brandName : %s, mac : %s.", str, str2);
        }

        /* renamed from: F4 */
        public void mo64188F4(String str, int i, long j) {
            String str2 = this.f110770e;
            if (str2 == null || !str2.equals(str)) {
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, mac(%s) is null or not correct.(mac : %s, state : %s, type : %s)", this.f110770e, str, Integer.valueOf(i), Long.valueOf(j));
                return;
            }
            Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "mac(%s), connectState(%s), profileType(%s)", str, Integer.valueOf(i), Long.valueOf(j));
            if (i == 0) {
                ExdeviceEventManager.m44540n(this.f110769d, this.f110771f, 0, this.f110772g);
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device state none.(mac : %s)", str);
            } else if (i == 1) {
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device is connectiong.(mac: %s)", str);
                ExdeviceEventManager.m44540n(this.f110769d, this.f110771f, 1, this.f110772g);
            } else if (i == 2) {
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device connected now start send data to it.(mac : %s)", str);
                ExdeviceEventManager.m44540n(this.f110769d, this.f110771f, 2, this.f110772g);
                C47303f fVar = new C47303f();
                fVar.f126958e = C47303f.f126961o;
                fVar.f126959f = 2;
                C41166r1.yx0().mo64175g(this.f110770e, fVar.mo72344c());
            } else if (i != 4) {
                Log.m105919d("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, out of range(mac : %s, state : %s, type : %s).", str, Integer.valueOf(i), Long.valueOf(j));
                ExdeviceEventManager.m44540n(this.f110769d, this.f110771f, -1, this.f110772g);
            } else {
                ExdeviceEventManager.m44540n(this.f110769d, this.f110771f, 4, this.f110772g);
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device disconnected.(mac : %s)", str);
            }
        }

        /* renamed from: h1 */
        public void mo64189h1(String str, byte[] bArr, boolean z) {
            String str2 = this.f110770e;
            if (str2 == null || !str2.equals(str)) {
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "onRecvFromDevice, mac(%s) is null or not correct.(mac : %s, succ : %s)", this.f110770e, str, Boolean.valueOf(z));
            } else if (z && bArr != null) {
                try {
                    if (!C41166r1.yx0().mo64176h(this.f110770e, this.f110769d, bArr)) {
                        Log.m105928w("MicroMsg.exdevice.ExdeviceEventManager", "The parser isn't a correct type.");
                    }
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "Read data from bytes failed.");
                }
            }
        }

        /* renamed from: v2 */
        public void mo64190v2(String str, String str2, boolean z) {
            String str3 = this.f110770e;
            if (str3 == null || !str3.equals(str2)) {
                Log.m105919d("MicroMsg.exdevice.ExdeviceEventManager", "onScanResult, mac(%s) is null or not correct.(mac : %s, isCompleted : %s)", this.f110770e, str2, Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager$e */
    public interface C41111e {
        /* renamed from: F4 */
        void mo64188F4(String str, int i, long j);

        /* renamed from: h1 */
        void mo64189h1(String str, byte[] bArr, boolean z);

        /* renamed from: v2 */
        void mo64190v2(String str, String str2, boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager$f */
    public class C41112f implements Runnable {

        /* renamed from: d */
        public List<C53753b> f110773d;

        public C41112f(List<C53753b> list) {
            this.f110773d = list;
        }

        public void run() {
            Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "Wifi device heart beat");
            List<C53753b> list = this.f110773d;
            if (list != null && list.size() > 0) {
                for (C53753b next : this.f110773d) {
                    C53502m.m60039c().mo64199b(new C39511k(next.field_brandName, next.field_deviceType, next.field_deviceID, 1));
                }
                ExdeviceEventManager.this.f110713T.postDelayed(this, 300000);
            }
        }
    }

    public ExdeviceEventManager() {
        C40008f fVar = C40008f.f107254d;
        this.f110717c = new IListener<MMSwitchViewPushEvent>(fVar) {
            {
                this.__eventId = -983389737;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:65:0x01cd, code lost:
                if (r10 != 0) goto L_0x01d1;
             */
            /* JADX WARNING: Removed duplicated region for block: B:103:0x02b0  */
            /* JADX WARNING: Removed duplicated region for block: B:72:0x01ff  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r19) {
                /*
                    r18 = this;
                    r0 = r19
                    com.tencent.mm.autogen.events.MMSwitchViewPushEvent r0 = (com.tencent.p014mm.autogen.events.MMSwitchViewPushEvent) r0
                    r1 = r18
                    com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager r2 = com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.this
                    r2.getClass()
                    com.tencent.mm.autogen.events.MMSwitchViewPushEvent$a r3 = r0.f107629d
                    int r4 = r3.f107631b
                    int r5 = r3.f107632c
                    java.lang.String r3 = r3.f107630a
                    java.lang.String r6 = "MicroMsg.exdevice.ExdeviceEventManager"
                    r7 = 3
                    r8 = 1
                    if (r4 != r8) goto L_0x0030
                    java.lang.String r9 = "Just enter, so clear previous state."
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
                    com.tencent.mm.autogen.events.OpFromExDeviceEvent r9 = new com.tencent.mm.autogen.events.OpFromExDeviceEvent
                    r9.<init>()
                    com.tencent.mm.autogen.events.OpFromExDeviceEvent$a r10 = r9.f107677d
                    r10.f107678a = r7
                    com.tencent.mm.autogen.events.MMSwitchViewPushEvent$a r0 = r0.f107629d
                    java.lang.String r0 = r0.f107630a
                    r10.f107680c = r0
                    r9.publish()
                L_0x0030:
                    z71.c r0 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
                    java.util.LinkedList r0 = r0.mo74333Yt(r3)
                    java.lang.Class<rn.v> r9 = p227rn.C48053v.class
                    di3.d r9 = di3.C86312j.m106911c(r9)
                    rn.v r9 = (p227rn.C48053v) r9
                    boolean r9 = r9.mo72613El(r3)
                    r10 = 2
                    r11 = 0
                    if (r9 == 0) goto L_0x00a6
                    z71.c r9 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
                    java.util.LinkedList r9 = r9.mo74339qq()
                    java.lang.String r12 = "Wechat sport biz..."
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r12)
                    int r12 = r9.size()
                    if (r12 == 0) goto L_0x00a6
                    java.util.Iterator r9 = r9.iterator()
                L_0x005f:
                    boolean r12 = r9.hasNext()
                    if (r12 == 0) goto L_0x00a6
                    java.lang.Object r12 = r9.next()
                    z71.b r12 = (z71.C53753b) r12
                    r13 = 0
                    long r7 = r12.f150090G
                    r16 = 1
                    long r7 = r7 & r16
                    int r16 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                    if (r16 == 0) goto L_0x00a2
                    r7 = 5
                    java.lang.Object[] r7 = new java.lang.Object[r7]
                    long r13 = r12.field_mac
                    java.lang.Long r8 = java.lang.Long.valueOf(r13)
                    r7[r11] = r8
                    java.lang.String r8 = r12.field_deviceID
                    r13 = 1
                    r7[r13] = r8
                    java.lang.String r8 = r12.field_deviceType
                    r7[r10] = r8
                    long r13 = r12.f150090G
                    java.lang.Long r8 = java.lang.Long.valueOf(r13)
                    r13 = 3
                    r7[r13] = r8
                    r8 = 4
                    java.lang.String r14 = r12.field_connProto
                    r7[r8] = r14
                    java.lang.String r8 = "BLE connected device info, mac(%s), deviceId(%s), deviceType(%s), SimpleProtol(%d), connProto(%s)"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r7)
                    r0.add(r12)
                    goto L_0x00a3
                L_0x00a2:
                    r13 = 3
                L_0x00a3:
                    r7 = 3
                    r8 = 1
                    goto L_0x005f
                L_0x00a6:
                    if (r0 != 0) goto L_0x00b4
                    r7 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r7]
                    r0[r11] = r3
                    java.lang.String r2 = "get hdinfo by brandName failed : %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
                    goto L_0x021f
                L_0x00b4:
                    r7 = 1
                    int r8 = r0.size()
                    if (r8 != 0) goto L_0x00c7
                    java.lang.Object[] r0 = new java.lang.Object[r7]
                    r0[r11] = r3
                    java.lang.String r2 = "get hdinfo by brandName(%s) result count is 0 "
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
                    r8 = 1
                    goto L_0x02b5
                L_0x00c7:
                    if (r4 != r10) goto L_0x00d5
                    java.lang.String r7 = "exit chattingui, clear observers."
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)
                    java.util.Map<java.lang.String, com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager$e> r7 = r2.f110716b
                    java.util.HashMap r7 = (java.util.HashMap) r7
                    r7.clear()
                L_0x00d5:
                    java.util.LinkedList r7 = new java.util.LinkedList
                    r7.<init>()
                    java.util.Iterator r8 = r0.iterator()
                    r13 = 0
                L_0x00df:
                    boolean r9 = r8.hasNext()
                    if (r9 == 0) goto L_0x0222
                    java.lang.Object r9 = r8.next()
                    z71.b r9 = (z71.C53753b) r9
                    if (r9 == 0) goto L_0x021f
                    java.lang.String r12 = r9.field_brandName
                    boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                    if (r12 == 0) goto L_0x00f7
                    goto L_0x021f
                L_0x00f7:
                    java.lang.String r12 = r9.field_connProto
                    java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
                    java.lang.String r14 = "4"
                    boolean r14 = r12.contains(r14)
                    if (r14 == 0) goto L_0x010f
                    java.lang.String r12 = "Wifi biz."
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r12)
                    r7.add(r9)
                    goto L_0x021b
                L_0x010f:
                    java.lang.String r14 = "1"
                    boolean r14 = r12.contains(r14)
                    if (r14 != 0) goto L_0x012d
                    java.lang.String r14 = "3"
                    boolean r14 = r12.contains(r14)
                    if (r14 != 0) goto L_0x012d
                    java.lang.String r14 = "5"
                    boolean r14 = r12.contains(r14)
                    if (r14 != 0) goto L_0x012d
                    int r12 = r12.length()
                    if (r12 != 0) goto L_0x021b
                L_0x012d:
                    java.lang.String r12 = "BlueTooth biz."
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r12)
                    boolean r12 = qw0.C47887a.m53196c()
                    if (r12 != 0) goto L_0x013f
                    java.lang.String r9 = "System bluetooth is close"
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r9)
                    r13 = 1
                    goto L_0x00df
                L_0x013f:
                    java.lang.String r12 = "handleSwitchViewEvent"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r12)
                    java.lang.String r12 = r9.field_brandName
                    y71.i r13 = y71.C53502m.m60037a()
                    r14 = r12
                    long r11 = r9.field_mac
                    y71.i$a r11 = r13.mo74177d(r11)
                    if (r11 != 0) goto L_0x015a
                    java.lang.String r9 = "can not find the hardevice connect state"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
                    goto L_0x021a
                L_0x015a:
                    int r12 = r11.f150449e
                    if (r12 != r10) goto L_0x0179
                    r12 = 1
                    java.lang.Object[] r13 = new java.lang.Object[r12]
                    r12 = 0
                    r13[r12] = r14
                    java.lang.String r12 = "notify the connect device %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r12, r13)
                    a81.j r12 = new a81.j
                    r13 = r11
                    long r10 = r9.field_mac
                    r12.<init>(r4, r5, r10)
                    com.tencent.mm.plugin.exdevice.model.h r10 = y71.C53502m.m60039c()
                    r10.mo64199b(r12)
                    goto L_0x017a
                L_0x0179:
                    r13 = r11
                L_0x017a:
                    com.tencent.mm.plugin.exdevice.model.m r10 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.xx0()
                    r11 = 1
                    if (r4 != r11) goto L_0x0183
                    r11 = 1
                    goto L_0x0184
                L_0x0183:
                    r11 = 0
                L_0x0184:
                    r10.mo64207e(r11)
                    r10 = 2
                    if (r4 != r10) goto L_0x021a
                    java.lang.String r10 = "now exit chattingui, do not notify change the subtitle"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
                    com.tencent.mm.plugin.exdevice.model.m r10 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.xx0()
                    long r11 = r9.field_mac
                    java.util.HashMap<java.lang.Long, com.tencent.mm.sdk.platformtools.MTimerHandler> r10 = r10.f110828c
                    java.lang.Long r11 = java.lang.Long.valueOf(r11)
                    java.lang.Object r10 = r10.remove(r11)
                    com.tencent.mm.sdk.platformtools.MTimerHandler r10 = (com.tencent.p014mm.sdk.platformtools.MTimerHandler) r10
                    if (r10 == 0) goto L_0x01a6
                    r10.stopTimer()
                L_0x01a6:
                    r10 = 1
                    java.lang.Object[] r11 = new java.lang.Object[r10]
                    int r12 = r9.field_closeStrategy
                    java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                    r15 = 0
                    r11[r15] = r12
                    java.lang.String r12 = "Device close strategy(%d)"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r12, r11)
                    int r11 = r9.field_closeStrategy
                    r11 = r11 & r10
                    if (r11 != 0) goto L_0x01d0
                    y71.i r10 = y71.C53502m.m60037a()
                    long r11 = r13.f150445a
                    boolean r10 = r10.mo74180g(r11)
                    if (r10 == 0) goto L_0x01d0
                    int r10 = r13.f150449e
                    r11 = 2
                    if (r11 == r10) goto L_0x01f9
                    if (r10 == 0) goto L_0x01f9
                    goto L_0x01d1
                L_0x01d0:
                    r11 = 2
                L_0x01d1:
                    java.lang.Object[] r10 = new java.lang.Object[r11]
                    int r11 = r13.f150449e
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                    r12 = 0
                    r10[r12] = r11
                    r11 = 1
                    r10[r11] = r14
                    java.lang.String r11 = "now the device is not auth or not connect  or closeStrategy is to close after exit, try to stop connetct, connet state is %d, device is %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r10)
                    com.tencent.mm.plugin.exdevice.model.h r10 = y71.C53502m.m60039c()
                    y71.k r10 = r10.f110806a
                    if (r10 == 0) goto L_0x01f9
                    com.tencent.mm.plugin.exdevice.model.h r10 = y71.C53502m.m60039c()
                    y71.k r10 = r10.f110806a
                    long r11 = r13.f150445a
                    y71.o r10 = (y71.C53503o) r10
                    r10.mo74187e(r11)
                L_0x01f9:
                    boolean r10 = com.tencent.p014mm.plugin.exdevice.model.C41175x.m44616b(r9)
                    if (r10 == 0) goto L_0x021a
                    r10 = 1
                    java.lang.Object[] r11 = new java.lang.Object[r10]
                    long r12 = r9.field_mac
                    java.lang.Long r10 = java.lang.Long.valueOf(r12)
                    r12 = 0
                    r11[r12] = r10
                    java.lang.String r10 = "try to disconnect simpleBTDevice(%s)."
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r11)
                    long r9 = r9.field_mac
                    java.lang.String r9 = d81.C45288e.m50135f(r9)
                    r2.mo64173e(r9)
                L_0x021a:
                    r13 = 0
                L_0x021b:
                    r10 = 2
                    r11 = 0
                    goto L_0x00df
                L_0x021f:
                    r6 = 0
                    goto L_0x02b4
                L_0x0222:
                    int r5 = r7.size()
                    r12 = -1
                    if (r5 <= 0) goto L_0x02ad
                    java.lang.String r8 = "handleWifiDeviceSwitchViewEvent"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
                    int r8 = r7.size()
                    if (r8 != 0) goto L_0x023a
                    java.lang.String r4 = "HardDeviceInfo is null or nil."
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
                    goto L_0x0294
                L_0x023a:
                    r6 = 1
                    if (r4 == r6) goto L_0x0252
                    r6 = 2
                    if (r4 == r6) goto L_0x0242
                    r10 = -1
                    goto L_0x0271
                L_0x0242:
                    boolean r4 = r2.f110712S
                    if (r4 == 0) goto L_0x0250
                    com.tencent.mm.sdk.platformtools.MMHandler r4 = r2.f110713T
                    com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager$f r6 = r2.f110714U
                    r4.removeCallbacks(r6)
                    r4 = 0
                    r2.f110712S = r4
                L_0x0250:
                    r10 = 0
                    goto L_0x0271
                L_0x0252:
                    r6 = 2
                    boolean r4 = r2.f110712S
                    if (r4 == 0) goto L_0x025e
                    com.tencent.mm.sdk.platformtools.MMHandler r4 = r2.f110713T
                    com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager$f r8 = r2.f110714U
                    r4.removeCallbacks(r8)
                L_0x025e:
                    com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager$f r4 = new com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager$f
                    r4.<init>(r7)
                    r2.f110714U = r4
                    com.tencent.mm.sdk.platformtools.MMHandler r8 = r2.f110713T
                    r9 = 300000(0x493e0, double:1.482197E-318)
                    r8.postDelayed(r4, r9)
                    r4 = 1
                    r2.f110712S = r4
                    r10 = 2
                L_0x0271:
                    java.util.Iterator r4 = r7.iterator()
                L_0x0275:
                    boolean r6 = r4.hasNext()
                    if (r6 == 0) goto L_0x0294
                    java.lang.Object r6 = r4.next()
                    z71.b r6 = (z71.C53753b) r6
                    a81.k r8 = new a81.k
                    java.lang.String r9 = r6.field_brandName
                    java.lang.String r11 = r6.field_deviceType
                    java.lang.String r6 = r6.field_deviceID
                    r8.<init>(r9, r11, r6, r10)
                    com.tencent.mm.plugin.exdevice.model.h r6 = y71.C53502m.m60039c()
                    r6.mo64199b(r8)
                    goto L_0x0275
                L_0x0294:
                    int r4 = r5 + -1
                    java.lang.Object r4 = r7.get(r4)
                    z71.b r4 = (z71.C53753b) r4
                    int r0 = r0.size()
                    if (r5 != r0) goto L_0x02ad
                    java.lang.String r0 = r4.field_brandName
                    java.lang.String r5 = r4.field_url
                    java.lang.String r4 = r4.field_deviceID
                    r6 = 0
                    com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.m44540n(r0, r5, r6, r4)
                    goto L_0x02ae
                L_0x02ad:
                    r6 = 0
                L_0x02ae:
                    if (r13 == 0) goto L_0x02b1
                    r12 = 0
                L_0x02b1:
                    r2.mo64181m(r3, r12)
                L_0x02b4:
                    r8 = 0
                L_0x02b5:
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.C410821.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f110718d = new IListener<MMSwitchBackgroundPushEvent>(fVar) {
            {
                this.__eventId = -1526700946;
            }

            public boolean callback(IEvent iEvent) {
                ExdeviceEventManager.this.getClass();
                ((MMSwitchBackgroundPushEvent) iEvent).f78866d.getClass();
                C53502m.m60039c().mo64199b(new C39509i(0));
                return true;
            }
        };
        this.f110719e = new IListener<ExDeviceOpInChattingUIEvent>(fVar) {
            {
                this.__eventId = 1724825537;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceOpInChattingUIEvent exDeviceOpInChattingUIEvent = (ExDeviceOpInChattingUIEvent) iEvent;
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "handleOpInChattingUIEvent");
                if (Util.isNullOrNil(exDeviceOpInChattingUIEvent.f107475d.f107477b)) {
                    Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "ExDeviceOpInChattingUIEventListener, userName is null");
                    return false;
                }
                Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "This biz is binded a device, notify chatting view to dimiss connect fail tips");
                exdeviceEventManager.mo64181m(exDeviceOpInChattingUIEvent.f107475d.f107477b, -1);
                int i = exDeviceOpInChattingUIEvent.f107475d.f107476a;
                if (i == 0 || i == 3) {
                    C41154p0 p0Var = C41154p0.INSTANCE;
                    if (p0Var.mo64215b(false)) {
                        p0Var.mo64217e(exDeviceOpInChattingUIEvent.f107475d.f107478c, new C41172v(exdeviceEventManager, exDeviceOpInChattingUIEvent));
                        return true;
                    }
                }
                ExDeviceOpInChattingUIEvent.C40076a aVar = exDeviceOpInChattingUIEvent.f107475d;
                return exdeviceEventManager.mo64177i(aVar.f107476a, aVar.f107477b);
            }
        };
        this.f110720f = new IListener<ExDeviceBindHardDeviceEvent>(fVar) {
            {
                this.__eventId = 672409123;
            }

            public boolean callback(IEvent iEvent) {
                C117747y yVar;
                ExDeviceBindHardDeviceEvent exDeviceBindHardDeviceEvent = (ExDeviceBindHardDeviceEvent) iEvent;
                ExdeviceEventManager.this.getClass();
                Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "receive ExDeviceBindHardDeviceEvent");
                ExDeviceBindHardDeviceEvent.C40057a aVar = exDeviceBindHardDeviceEvent.f107424d;
                int i = aVar.f107428c;
                int i2 = aVar.f107427b;
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "now optype is %d, subscribeFlag is %d", Integer.valueOf(i), Integer.valueOf(i2));
                if (i == 1) {
                    C41170u0 u0Var = new C41170u0(exDeviceBindHardDeviceEvent.f107424d.f107426a, i2);
                    C86709a0.m107529k().f251779b.mo123460f(u0Var);
                    exDeviceBindHardDeviceEvent.f107425e.f107430a = u0Var;
                } else if (i == 2 && (yVar = exDeviceBindHardDeviceEvent.f107424d.f107429d) != null) {
                    C86709a0.m107529k().f251779b.mo123458d((C41170u0) yVar);
                }
                return true;
            }
        };
        this.f110721g = new IListener<ExDeviceUnBindHardDeviceEvent>(fVar) {
            {
                this.__eventId = 1139134730;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceUnBindHardDeviceEvent exDeviceUnBindHardDeviceEvent = (ExDeviceUnBindHardDeviceEvent) iEvent;
                ExdeviceEventManager.this.getClass();
                Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "receive ExDeviceUnBindHardDeviceEvent");
                C41166r1.xx0().mo64207e(0);
                if (Util.isNullOrNil(exDeviceUnBindHardDeviceEvent.f107512d.f107513a)) {
                    Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "brandName is null, can not unbind device");
                    return false;
                }
                C49697hf2 hf22 = new C49697hf2();
                hf22.f134597e = "";
                hf22.f134596d = exDeviceUnBindHardDeviceEvent.f107512d.f107513a;
                C86709a0.m107529k().f251779b.mo123460f(new C41135i1(hf22, 1));
                return true;
            }
        };
        this.f110722h = new IListener<StopAllChannelEvent>(fVar) {
            {
                this.__eventId = -1986067706;
            }

            public boolean callback(IEvent iEvent) {
                StopAllChannelEvent stopAllChannelEvent = (StopAllChannelEvent) iEvent;
                ExdeviceEventManager.this.getClass();
                Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "receive StopAllChannelEvent");
                C41166r1.xx0().mo64208f(false);
                C41140m xx02 = C41166r1.xx0();
                C41178a aVar = xx02.f110826a;
                if (aVar != null && aVar.f110939e) {
                    try {
                        C116024c.m163166f(xx02.f110826a, "exdevice", true, C88144b.m109786e("exdevice"));
                    } catch (Exception unused) {
                    }
                }
                return true;
            }
        };
        this.f110723i = new IListener<StopAllChannelWithParamsEvent>(fVar) {
            {
                this.__eventId = 1874814330;
            }

            public boolean callback(IEvent iEvent) {
                ExdeviceEventManager.this.getClass();
                Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "receive StopAllChannelWithParamsEvent");
                C41140m xx02 = C41166r1.xx0();
                ((StopAllChannelWithParamsEvent) iEvent).f107782d.getClass();
                xx02.mo64208f(true);
                return true;
            }
        };
        this.f110725k = new IListener<ExDeviceGetBoundDevicesEvent>(fVar) {
            {
                this.__eventId = 897978462;
            }

            public boolean callback(IEvent iEvent) {
                ExdeviceEventManager.m44539a(ExdeviceEventManager.this, ((ExDeviceGetBoundDevicesEvent) iEvent).f107445d.f107446a, false);
                return true;
            }
        };
        this.f110726l = new IListener<ExDeviceGetBoundIotDevicesEvent>(fVar) {
            {
                this.__eventId = -1926883670;
            }

            public boolean callback(IEvent iEvent) {
                ExdeviceEventManager.m44539a(ExdeviceEventManager.this, ((ExDeviceGetBoundIotDevicesEvent) iEvent).f107447d.f107448a, true);
                return true;
            }
        };
        this.f110727m = new IListener<ExDeviceIBeaconRangingEvent>(fVar) {
            {
                this.__eventId = -128356652;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceIBeaconRangingEvent exDeviceIBeaconRangingEvent = (ExDeviceIBeaconRangingEvent) iEvent;
                ExdeviceEventManager.this.getClass();
                if (exDeviceIBeaconRangingEvent != null) {
                    ExDeviceIBeaconRangingEvent.C40069a aVar = exDeviceIBeaconRangingEvent.f107450d;
                    String str = aVar.f107452a;
                    boolean z = aVar.f107453b;
                    C41140m xx02 = C41166r1.xx0();
                    xx02.getClass();
                    Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "ranging, uuid = %s, op = %s", str, String.valueOf(z));
                    ((C119157j) C119157j.f356862d).mo183876g(new C41148n(xx02, str, z), "MicroMsg.exdevice.ExdeviceConnectManager|ranging");
                }
                return true;
            }
        };
        this.f110728n = new IListener<ExDeviceScanDeviceEvent>(fVar) {
            {
                this.__eventId = 874941134;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceScanDeviceEvent exDeviceScanDeviceEvent = (ExDeviceScanDeviceEvent) iEvent;
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                ExDeviceScanDeviceEvent.C1022a aVar = exDeviceScanDeviceEvent.f9114d;
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "handleScanDeviceEvent: brandName=%s, op=%s, btVersion=%s", aVar.f9116a, Boolean.valueOf(aVar.f9117b), Integer.valueOf(exDeviceScanDeviceEvent.f9114d.f9118c));
                int i = exDeviceScanDeviceEvent.f9114d.f9118c;
                if (!(i == 0 || i == 1)) {
                    if (C47887a.m53195b(MMApplicationContext.getContext())) {
                        Log.m105929w("MicroMsg.exdevice.ExdeviceEventManager", "invalid btVersion %s, use defalut BLE", Integer.valueOf(i));
                        i = 0;
                    } else {
                        Log.m105921e("MicroMsg.exdevice.ExdeviceEventManager", "invalid btVersion %s, return fail", Integer.valueOf(i));
                        exDeviceScanDeviceEvent.f9115e.f9119a = false;
                        return false;
                    }
                }
                if (exDeviceScanDeviceEvent.f9114d.f9117b) {
                    C41145m1 e = C41145m1.m44587e();
                    String str = exDeviceScanDeviceEvent.f9114d.f9116a;
                    C41167t tVar = new C41167t(exdeviceEventManager);
                    e.getClass();
                    Log.m105925i("MicroMsg.exdevice.ScanDeviceLogic", "startScanDevice, brandName=%s", str);
                    if (Util.isNullOrNil(str)) {
                        Log.m105924i("MicroMsg.exdevice.ScanDeviceLogic", "brand name is null");
                    } else {
                        e.f110849f = str;
                        e.f110848e = tVar;
                        e.f110851h.clear();
                        Iterator<C117747y> it = e.f110852i.iterator();
                        while (it.hasNext()) {
                            C117747y next = it.next();
                            if (next != null) {
                                C86709a0.m107529k().f251779b.mo123458d(next);
                            }
                        }
                        e.f110852i.clear();
                        synchronized (C41145m1.f110845p) {
                            C41145m1.f110846q.clear();
                        }
                        if (!e.f110850g) {
                            e.f110850g = true;
                            C86709a0.m107529k().f251779b.mo123455a(542, e);
                            C41166r1.xx0().mo64206d(i, e);
                            Log.m105924i("MicroMsg.exdevice.ScanDeviceLogic", "should start scan, startTimer");
                            e.f110853j.startTimer(12000);
                        } else {
                            Log.m105928w("MicroMsg.exdevice.ScanDeviceLogic", "still scanning. just change brand name and callback");
                        }
                    }
                } else {
                    C41145m1.m44587e().mo64210g(i);
                }
                exDeviceScanDeviceEvent.f9115e.f9119a = true;
                return true;
            }
        };
        this.f110729o = new IListener<ExDeviceGetTicketEvent>(fVar) {
            {
                this.__eventId = 1053529393;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceGetTicketEvent exDeviceGetTicketEvent = (ExDeviceGetTicketEvent) iEvent;
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                ExDeviceGetTicketEvent.C1016a aVar = exDeviceGetTicketEvent.f9095d;
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "handleGetTicketEvent: brandName=%s, deviceId=%s, type=%d", aVar.f9097a, aVar.f9098b, Integer.valueOf(aVar.f9099c));
                C50337m12 m122 = new C50337m12();
                m122.f137747d = exDeviceGetTicketEvent.f9095d.f9099c;
                m122.f137748e = 0;
                C49697hf2 hf22 = new C49697hf2();
                m122.f137749f = hf22;
                ExDeviceGetTicketEvent.C1016a aVar2 = exDeviceGetTicketEvent.f9095d;
                hf22.f134597e = aVar2.f9098b;
                hf22.f134596d = aVar2.f9097a;
                LinkedList linkedList = new LinkedList();
                linkedList.add(m122);
                C2241s sVar = new C2241s(exdeviceEventManager, exDeviceGetTicketEvent);
                ExDeviceGetTicketEvent.C1016a aVar3 = exDeviceGetTicketEvent.f9095d;
                C2239k1 k1Var = new C2239k1(linkedList, aVar3.f9097a, aVar3.f9100d);
                C86709a0.m107529k().f251779b.mo123455a(543, sVar);
                if (C86709a0.m107529k().f251779b.mo123461g(k1Var, 0)) {
                    return false;
                }
                Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "network().getNetSceneQueue().doScene failed!!!");
                C86709a0.m107529k().f251779b.mo123470p(543, sVar);
                ExDeviceGetTicketEvent.C1017b bVar = exDeviceGetTicketEvent.f9096e;
                bVar.f9101a = true;
                bVar.f9102b = null;
                Runnable runnable = exDeviceGetTicketEvent.callback;
                if (runnable != null) {
                    runnable.run();
                }
                return true;
            }
        };
        this.f110730p = new IListener<ExDeviceConnectDeviceEvent>(fVar) {
            {
                this.__eventId = -570028653;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceConnectDeviceEvent exDeviceConnectDeviceEvent = (ExDeviceConnectDeviceEvent) iEvent;
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                ExDeviceConnectDeviceEvent.C1006a aVar = exDeviceConnectDeviceEvent.f9066d;
                boolean z = false;
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "handleConnectDeviceEvent: brandName=%s, deviceId=%s, type=%b", aVar.f9068a, aVar.f9069b, Boolean.valueOf(aVar.f9070c));
                ExDeviceConnectDeviceEvent.C1006a aVar2 = exDeviceConnectDeviceEvent.f9066d;
                String str = aVar2.f9068a;
                String str2 = aVar2.f9069b;
                boolean z2 = aVar2.f9070c;
                if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
                    Log.m105921e("MicroMsg.exdevice.ExdeviceEventManager", "connectBluetoothDevice %s, %s, %s", str, str2, Boolean.valueOf(z2));
                } else {
                    C53753b bD = C41166r1.Bx0().mo74334bD(str2);
                    if (bD == null) {
                        Log.m105921e("MicroMsg.exdevice.ExdeviceEventManager", "hdInfo null, %s", str2);
                    } else if (!bD.field_brandName.equals(str)) {
                        Log.m105921e("MicroMsg.exdevice.ExdeviceEventManager", "brand name not match. %s != %s", bD.field_brandName, str);
                    } else if (Util.nullAsNil(bD.field_connProto).contains(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL)) {
                        ExdeviceEventManager.m44540n(str, bD.field_url, -1, bD.field_deviceType);
                        exdeviceEventManager.mo64181m(str, -1);
                        Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "Wifi biz, Just leave");
                    } else if (!C47887a.m53196c()) {
                        Log.m105928w("MicroMsg.exdevice.ExdeviceEventManager", "System bluetooth is close");
                        exdeviceEventManager.mo64181m(str, 0);
                    } else {
                        exdeviceEventManager.mo64181m(str, -1);
                        int c = exdeviceEventManager.mo64171c(bD);
                        if (c == 1) {
                            boolean z3 = BluetoothAdapter.getDefaultAdapter() != null;
                            Log.m105925i("MicroMsg.exdevice.BluetoothSDKUtil", "isSupportBC: %b", Boolean.valueOf(z3));
                            if (!z3) {
                                Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "device is BC, but you phone not support BC.");
                            }
                        } else if (c == 0 && !C47887a.m53195b(MMApplicationContext.getContext())) {
                            exdeviceEventManager.mo64181m(str, 1);
                            Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "device is BLE, but you phone not support BLE.");
                        }
                        if (z2) {
                            if (C41145m1.m44587e().f110850g) {
                                C41145m1.m44587e().mo64210g(c);
                            }
                            C41140m xx02 = C41166r1.xx0();
                            HashMap<Long, Integer> hashMap = xx02.f110830e;
                            if (!(hashMap == null || hashMap.size() == 0)) {
                                xx02.f110830e.clear();
                            }
                            C41166r1.xx0().mo64203a(bD.field_brandName, bD.field_mac, c, false);
                        } else {
                            C41166r1.xx0().mo64204b(bD.field_mac);
                        }
                        z = true;
                    }
                }
                exDeviceConnectDeviceEvent.f9067e.f9071a = z;
                return z;
            }
        };
        this.f110731q = new IListener<ExDeviceConnectStrategyActionEvent>(fVar) {
            {
                this.__eventId = -286594752;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceConnectStrategyActionEvent exDeviceConnectStrategyActionEvent = (ExDeviceConnectStrategyActionEvent) iEvent;
                ExdeviceEventManager.this.getClass();
                C53754c Bx0 = C41166r1.Bx0();
                ExDeviceConnectStrategyActionEvent.C40064a aVar = exDeviceConnectStrategyActionEvent.f107440d;
                C53753b TE = Bx0.mo74332TE(aVar.f107442a, aVar.f107443b);
                if (TE == null || (TE.field_connStrategy & 16) != 0) {
                    exDeviceConnectStrategyActionEvent.f107441e.f107444a = false;
                } else {
                    ExDeviceConnectStrategyActionEvent.C40064a aVar2 = exDeviceConnectStrategyActionEvent.f107440d;
                    Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "CONNECT_STRATEGY_IGNORE_ON_CHAT disable, (%s) do not disconnect ble device(%s)", aVar2.f107442a, aVar2.f107443b);
                    exDeviceConnectStrategyActionEvent.f107441e.f107444a = true;
                }
                return true;
            }
        };
        this.f110732r = new IListener<ExDeviceSendDataToDeviceEvent>(fVar) {
            {
                this.__eventId = 2061259934;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceSendDataToDeviceEvent exDeviceSendDataToDeviceEvent = (ExDeviceSendDataToDeviceEvent) iEvent;
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                ExDeviceSendDataToDeviceEvent.C1024a aVar = exDeviceSendDataToDeviceEvent.f9120d;
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "handleSendDataToDeviceEvent: brandName=%s, deviceId=%s", aVar.f9122a, aVar.f9123b);
                if (Util.isNullOrNil(exDeviceSendDataToDeviceEvent.f9120d.f9124c)) {
                    exDeviceSendDataToDeviceEvent.f9121e.f9125a = false;
                    return false;
                }
                C53753b bD = C41166r1.Bx0().mo74334bD(exDeviceSendDataToDeviceEvent.f9120d.f9123b);
                if (bD == null) {
                    Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "hdInfo error");
                    exDeviceSendDataToDeviceEvent.f9121e.f9125a = false;
                    return false;
                }
                if (!(C53502m.m60037a().mo74176c(bD.field_mac) == 2)) {
                    Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "haven't connect");
                    exDeviceSendDataToDeviceEvent.f9121e.f9125a = false;
                    return false;
                } else if (!C53502m.m60037a().mo74180g(bD.field_mac)) {
                    Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "haven't authed");
                    exDeviceSendDataToDeviceEvent.f9121e.f9125a = false;
                    return false;
                } else {
                    if (C41145m1.m44587e().f110850g) {
                        C41145m1.m44587e().mo64210g(exdeviceEventManager.mo64171c(bD));
                    }
                    C53502m.m60039c().mo64199b(new C39507g(exDeviceSendDataToDeviceEvent.f9120d.f9124c, 10001, bD.field_mac));
                    exDeviceSendDataToDeviceEvent.f9121e.f9125a = true;
                    return true;
                }
            }
        };
        this.f110733s = new IListener<ExDeviceOPFromJSAPIEvent>(fVar) {
            {
                this.__eventId = 530273677;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
                r6 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.xx0();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r6) {
                /*
                    r5 = this;
                    com.tencent.mm.autogen.events.ExDeviceOPFromJSAPIEvent r6 = (com.tencent.p014mm.autogen.events.ExDeviceOPFromJSAPIEvent) r6
                    com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager r0 = com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.this
                    r0.getClass()
                    r0 = 1
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    com.tencent.mm.autogen.events.ExDeviceOPFromJSAPIEvent$a r2 = r6.f9110d
                    int r2 = r2.f9111a
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 0
                    r1[r3] = r2
                    java.lang.String r2 = "MicroMsg.exdevice.ExdeviceEventManager"
                    java.lang.String r4 = "handleDeviceOPFromJSAPIEvent: %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
                    com.tencent.mm.autogen.events.ExDeviceOPFromJSAPIEvent$a r6 = r6.f9110d
                    int r6 = r6.f9111a
                    if (r6 != r0) goto L_0x0049
                    com.tencent.mm.plugin.exdevice.model.m r6 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.xx0()
                    com.tencent.mm.plugin.exdevice.service.a r1 = r6.f110826a
                    if (r1 == 0) goto L_0x002e
                    boolean r1 = r1.f110939e
                    if (r1 != 0) goto L_0x0049
                L_0x002e:
                    com.tencent.mm.plugin.exdevice.service.a r1 = r6.f110826a
                    if (r1 != 0) goto L_0x0039
                    com.tencent.mm.plugin.exdevice.service.a r1 = new com.tencent.mm.plugin.exdevice.service.a
                    r1.<init>()
                    r6.f110826a = r1
                L_0x0039:
                    com.tencent.mm.plugin.exdevice.service.a r1 = r6.f110826a
                    com.tencent.mm.plugin.exdevice.model.r r2 = new com.tencent.mm.plugin.exdevice.model.r
                    r2.<init>(r6, r3)
                    r1.f110938d = r2
                    android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    r1.mo64230a(r6)
                L_0x0049:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.C4108917.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f110734t = new IListener<ExDeviceGetDeviceInfosEvent>(fVar) {
            {
                this.__eventId = 1224343208;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceGetDeviceInfosEvent exDeviceGetDeviceInfosEvent = (ExDeviceGetDeviceInfosEvent) iEvent;
                ExdeviceEventManager.this.getClass();
                ExDeviceGetDeviceInfosEvent.C1012a aVar = exDeviceGetDeviceInfosEvent.f9083d;
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "handleGetDeviceInfosEvent: brandName=%s, context=%s", aVar.f9086b, aVar.f9085a);
                LinkedList<C53753b> Yt = C41166r1.Bx0().mo74333Yt(exDeviceGetDeviceInfosEvent.f9083d.f9086b);
                JSONArray jSONArray = new JSONArray();
                try {
                    Iterator<C53753b> it = Yt.iterator();
                    while (it.hasNext()) {
                        C53753b next = it.next();
                        if (!Yt.isEmpty()) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("deviceId", next.field_deviceID);
                            if (C53502m.m60037a().mo74176c(next.field_mac) == 2) {
                                jSONObject.put("state", "connected");
                            } else {
                                jSONObject.put("state", "disconnected");
                            }
                            jSONArray.put(jSONObject);
                        }
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.exdevice.ExdeviceEventManager", "Ex in handleGetDeviceInfosEvent, %s", e.getMessage());
                }
                ExDeviceGetDeviceInfosEvent.C1013b bVar = exDeviceGetDeviceInfosEvent.f9084e;
                bVar.f9088b = jSONArray;
                bVar.f9087a = true;
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "GetDeviceInfos: %s", jSONArray.toString());
                return true;
            }
        };
        this.f110735u = new IListener<ExDeviceSetSendDataDirectionEvent>(fVar) {
            {
                this.__eventId = 1654375478;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceSetSendDataDirectionEvent exDeviceSetSendDataDirectionEvent = (ExDeviceSetSendDataDirectionEvent) iEvent;
                ExdeviceEventManager.this.getClass();
                ExDeviceSetSendDataDirectionEvent.C1028a aVar = exDeviceSetSendDataDirectionEvent.f9132d;
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "handleSetSendDataDirectionEvent: %s, %s, %s", aVar.f9134a, Integer.valueOf(aVar.f9135b), Boolean.valueOf(exDeviceSetSendDataDirectionEvent.f9132d.f9136c));
                ExDeviceSetSendDataDirectionEvent.C1028a aVar2 = exDeviceSetSendDataDirectionEvent.f9132d;
                if (aVar2.f9136c) {
                    C47180k.m52466a().f126729f.clear();
                    exDeviceSetSendDataDirectionEvent.f9133e.f9137a = true;
                } else if (!Util.isNullOrNil(aVar2.f9134a)) {
                    C47180k a = C47180k.m52466a();
                    ExDeviceSetSendDataDirectionEvent.C1028a aVar3 = exDeviceSetSendDataDirectionEvent.f9132d;
                    String str = aVar3.f9134a;
                    int i = aVar3.f9135b;
                    a.getClass();
                    if (!Util.isNullOrNil(str)) {
                        a.f126729f.put(str, Integer.valueOf(i));
                    }
                    exDeviceSetSendDataDirectionEvent.f9133e.f9137a = true;
                } else {
                    exDeviceSetSendDataDirectionEvent.f9133e.f9137a = false;
                }
                return true;
            }
        };
        this.f110736v = new IListener<ExDeviceSimpleBTScanDeviceEvent>(fVar) {
            {
                this.__eventId = 1180032426;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceSimpleBTScanDeviceEvent exDeviceSimpleBTScanDeviceEvent = (ExDeviceSimpleBTScanDeviceEvent) iEvent;
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                if (exDeviceSimpleBTScanDeviceEvent != null) {
                    if (exdeviceEventManager.mo64174f()) {
                        exDeviceSimpleBTScanDeviceEvent.f107501e.f107502a = true;
                    } else {
                        exDeviceSimpleBTScanDeviceEvent.f107501e.f107502a = false;
                    }
                    return true;
                }
                Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "event is not instanceof ExDeviceSimpleBTScanDeviceEvent");
                return false;
            }
        };
        this.f110737w = new IListener<ExDeviceSimpleBTConnectDeviceEvent>(fVar) {
            {
                this.__eventId = 253852983;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceSimpleBTConnectDeviceEvent exDeviceSimpleBTConnectDeviceEvent = (ExDeviceSimpleBTConnectDeviceEvent) iEvent;
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                if (exDeviceSimpleBTConnectDeviceEvent != null) {
                    ExDeviceSimpleBTConnectDeviceEvent.C40080a aVar = exDeviceSimpleBTConnectDeviceEvent.f107484d;
                    if (aVar.f107487b ? exdeviceEventManager.mo64172d(aVar.f107486a) : exdeviceEventManager.mo64173e(aVar.f107486a)) {
                        exDeviceSimpleBTConnectDeviceEvent.f107485e.f107488a = true;
                    } else {
                        exDeviceSimpleBTConnectDeviceEvent.f107485e.f107488a = false;
                    }
                    return true;
                }
                Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "event is not instanceof ExDeviceSimpleBTConnectDeviceEvent");
                return false;
            }
        };
        this.f110738x = new IListener<ExDeviceSimpleBTSendDataToDeviceEvent>(fVar) {
            {
                this.__eventId = 580981370;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceSimpleBTSendDataToDeviceEvent exDeviceSimpleBTSendDataToDeviceEvent = (ExDeviceSimpleBTSendDataToDeviceEvent) iEvent;
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                if (exDeviceSimpleBTSendDataToDeviceEvent != null) {
                    exDeviceSimpleBTSendDataToDeviceEvent.f107503d.getClass();
                    exDeviceSimpleBTSendDataToDeviceEvent.f107503d.getClass();
                    if (exdeviceEventManager.mo64175g((String) null, (byte[]) null)) {
                        exDeviceSimpleBTSendDataToDeviceEvent.f107504e.f107505a = true;
                    } else {
                        exDeviceSimpleBTSendDataToDeviceEvent.f107504e.f107505a = false;
                    }
                    return true;
                }
                Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "event is not instanceof ExDeviceSimpleBTSendDataToDeviceEvent");
                return false;
            }
        };
        this.f110739y = new IListener<ExDeviceSimpleBTBindDeviceEvent>(fVar) {
            {
                this.__eventId = 1772972010;
            }

            /* JADX WARNING: Removed duplicated region for block: B:19:0x00a6  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x00ab  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r13) {
                /*
                    r12 = this;
                    com.tencent.mm.autogen.events.ExDeviceSimpleBTBindDeviceEvent r13 = (com.tencent.p014mm.autogen.events.ExDeviceSimpleBTBindDeviceEvent) r13
                    com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager r0 = com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.this
                    r0.getClass()
                    java.lang.String r0 = "MicroMsg.exdevice.ExdeviceEventManager"
                    r1 = 1
                    r2 = 0
                    if (r13 == 0) goto L_0x00b0
                    com.tencent.mm.autogen.events.ExDeviceSimpleBTBindDeviceEvent$a r3 = r13.f107481d
                    r3.getClass()
                    r3 = 0
                    long r4 = d81.C45288e.m50137h(r3)
                    z71.c r6 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
                    z71.b r4 = r6.mo74337kD(r4)
                    if (r4 == 0) goto L_0x0031
                    com.tencent.mm.autogen.events.ExDeviceSimpleBTBindDeviceEvent$a r2 = r13.f107481d
                    r2.getClass()
                    java.lang.String r2 = "device(null) has been binded"
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)
                    com.tencent.mm.autogen.events.ExDeviceSimpleBTBindDeviceEvent$b r13 = r13.f107482e
                    r13.f107483a = r1
                    goto L_0x00b6
                L_0x0031:
                    com.tencent.mm.autogen.events.ExDeviceSimpleBTBindDeviceEvent$a r4 = r13.f107481d
                    r4.getClass()
                    com.tencent.mm.autogen.events.ExDeviceSimpleBTBindDeviceEvent$a r4 = r13.f107481d
                    r4.getClass()
                    com.tencent.mm.autogen.events.ExDeviceSimpleBTBindDeviceEvent$a r4 = r13.f107481d
                    r4.getClass()
                    r4 = 0
                    boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                    if (r6 == 0) goto L_0x004e
                    java.lang.String r3 = "mac is null or nil"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
                    goto L_0x00a1
                L_0x004e:
                    r6 = 3
                    java.lang.Object[] r6 = new java.lang.Object[r6]
                    r6[r2] = r3
                    java.lang.String r7 = "null"
                    r6[r1] = r7
                    r7 = 2
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r6[r7] = r4
                    java.lang.String r4 = "handleExDeviceSimpleBTBindDevice. mac = %s, broadcastName = %s, profileType = %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r4, r6)
                    f40.g r4 = f40.C86709a0.m107529k()
                    ob0.b0 r4 = r4.f251779b
                    int r4 = r4.mo123467m()
                    r5 = 4
                    if (r4 == r5) goto L_0x0081
                    r5 = 6
                    if (r4 == r5) goto L_0x0081
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r3[r2] = r4
                    java.lang.String r4 = "net work state is not connected, current state is %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r4, r3)
                    goto L_0x00a1
                L_0x0081:
                    com.tencent.mm.plugin.exdevice.model.v0 r4 = new com.tencent.mm.plugin.exdevice.model.v0
                    long r6 = d81.C45288e.m50137h(r3)
                    r8 = 0
                    r10 = 0
                    java.lang.String r9 = "3"
                    r5 = r4
                    r5.<init>(r6, r8, r9, r10)
                    f40.g r3 = f40.C86709a0.m107529k()
                    ob0.b0 r3 = r3.f251779b
                    boolean r3 = r3.mo123461g(r4, r2)
                    if (r3 != 0) goto L_0x00a3
                    java.lang.String r3 = "do NetSceneBindUnauthDevice fail"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
                L_0x00a1:
                    r0 = 0
                    goto L_0x00a4
                L_0x00a3:
                    r0 = 1
                L_0x00a4:
                    if (r0 == 0) goto L_0x00ab
                    com.tencent.mm.autogen.events.ExDeviceSimpleBTBindDeviceEvent$b r13 = r13.f107482e
                    r13.f107483a = r1
                    goto L_0x00b6
                L_0x00ab:
                    com.tencent.mm.autogen.events.ExDeviceSimpleBTBindDeviceEvent$b r13 = r13.f107482e
                    r13.f107483a = r2
                    goto L_0x00b6
                L_0x00b0:
                    java.lang.String r13 = "event is not instanceof ExDeviceSimpleBTBindDeviceEvent"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r13)
                    r1 = 0
                L_0x00b6:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.C4109423.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        new IListener<ExDeviceSimpleBTUploadDataToServerEvent>(fVar) {
            {
                this.__eventId = -1008604268;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceSimpleBTUploadDataToServerEvent exDeviceSimpleBTUploadDataToServerEvent = (ExDeviceSimpleBTUploadDataToServerEvent) iEvent;
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                if (exDeviceSimpleBTUploadDataToServerEvent != null) {
                    exDeviceSimpleBTUploadDataToServerEvent.f107506d.getClass();
                    exDeviceSimpleBTUploadDataToServerEvent.f107506d.getClass();
                    exDeviceSimpleBTUploadDataToServerEvent.f107506d.getClass();
                    if (exdeviceEventManager.mo64176h((String) null, (String) null, (byte[]) null)) {
                        exDeviceSimpleBTUploadDataToServerEvent.f107507e.f107508a = true;
                    } else {
                        exDeviceSimpleBTUploadDataToServerEvent.f107507e.f107508a = false;
                    }
                    return true;
                }
                Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "event is not instanceof ExDeviceSimpleBTUploadDataToServerEvent");
                return false;
            }
        };
        this.f110740z = new IListener<ExDeviceCheckDeviceIsBoundEvent>(fVar) {
            {
                this.__eventId = 669171147;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceCheckDeviceIsBoundEvent exDeviceCheckDeviceIsBoundEvent = (ExDeviceCheckDeviceIsBoundEvent) iEvent;
                ExdeviceEventManager.this.getClass();
                ExDeviceCheckDeviceIsBoundEvent.C40062a aVar = exDeviceCheckDeviceIsBoundEvent.f107435d;
                boolean z = false;
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceCheckDeviceIsBoundEvent: deviceType(%s), deviceId(%s)", aVar.f107437a, aVar.f107438b);
                ExDeviceCheckDeviceIsBoundEvent.C40062a aVar2 = exDeviceCheckDeviceIsBoundEvent.f107435d;
                if (aVar2.f107437a == null || aVar2.f107438b == null) {
                    exDeviceCheckDeviceIsBoundEvent.f107436e.f107439a = false;
                } else {
                    C53754c Bx0 = C41166r1.Bx0();
                    ExDeviceCheckDeviceIsBoundEvent.C40062a aVar3 = exDeviceCheckDeviceIsBoundEvent.f107435d;
                    C53753b Ow = Bx0.mo74330Ow(aVar3.f107438b, aVar3.f107437a);
                    ExDeviceCheckDeviceIsBoundEvent.C40063b bVar = exDeviceCheckDeviceIsBoundEvent.f107436e;
                    if (Ow != null) {
                        z = true;
                    }
                    bVar.f107439a = z;
                }
                return true;
            }
        };
        this.f110694A = new IListener<ExDeviceCheckDeviceHasAbilityEvent>(fVar) {
            {
                this.__eventId = -1236022299;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceCheckDeviceHasAbilityEvent exDeviceCheckDeviceHasAbilityEvent = (ExDeviceCheckDeviceHasAbilityEvent) iEvent;
                ExdeviceEventManager.this.getClass();
                exDeviceCheckDeviceHasAbilityEvent.f107433d.getClass();
                exDeviceCheckDeviceHasAbilityEvent.f107433d.getClass();
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceCheckDeviceHasAbilityEvent: deviceType(%s), deviceId(%s)", null, null);
                exDeviceCheckDeviceHasAbilityEvent.f107433d.getClass();
                exDeviceCheckDeviceHasAbilityEvent.f107434e.getClass();
                return true;
            }
        };
        this.f110695B = new IListener<ExDeviceGetCurrentSSIDEvent>(fVar) {
            {
                this.__eventId = -1330130397;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceGetCurrentSSIDEvent exDeviceGetCurrentSSIDEvent = (ExDeviceGetCurrentSSIDEvent) iEvent;
                ExdeviceEventManager.this.getClass();
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceGetCurrentSSIDEvent: opCode = %b", Boolean.valueOf(exDeviceGetCurrentSSIDEvent.f9078d.f9080a));
                if (exDeviceGetCurrentSSIDEvent.f9078d.f9080a) {
                    String formattedWiFiSsid = ConnectivityCompat.Companion.getFormattedWiFiSsid();
                    if (Util.isNullOrNil(formattedWiFiSsid)) {
                        ExDeviceGetCurrentSSIDEvent.C1011b bVar = exDeviceGetCurrentSSIDEvent.f9079e;
                        bVar.f9081a = false;
                        bVar.f9082b = null;
                    } else {
                        ExDeviceGetCurrentSSIDEvent.C1011b bVar2 = exDeviceGetCurrentSSIDEvent.f9079e;
                        bVar2.f9081a = true;
                        bVar2.f9082b = formattedWiFiSsid.replaceAll(FastJsonResponse.QUOTE, "");
                    }
                } else {
                    ExDeviceGetCurrentSSIDEvent.C1011b bVar3 = exDeviceGetCurrentSSIDEvent.f9079e;
                    bVar3.f9081a = false;
                    bVar3.f9082b = null;
                }
                return true;
            }
        };
        this.f110696C = new IListener<BackupProcessMgrExitEvent>(fVar) {
            {
                this.__eventId = 176812961;
            }

            public boolean callback(IEvent iEvent) {
                BackupProcessMgrExitEvent backupProcessMgrExitEvent = (BackupProcessMgrExitEvent) iEvent;
                ExdeviceEventManager.this.getClass();
                Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "Wechat exit, stop ExDeviceService.");
                Context context = MMApplicationContext.getContext();
                if (!WeChatProcess.isExdeviceAlive()) {
                    Log.m105924i("MicroMsg.exdevice.ExDeviceServiceHelper", "exdevice is not alive");
                } else {
                    try {
                        C41140m xx02 = C41166r1.xx0();
                        C41178a aVar = xx02.f110826a;
                        if (aVar != null && aVar.f110939e) {
                            try {
                                C116024c.m163166f(xx02.f110826a, "exdevice", true, C88144b.m109786e("exdevice"));
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception e) {
                        Log.m105929w("MicroMsg.exdevice.ExDeviceServiceHelper", "unbindService() Service is not start by bindService.%s", e.getMessage());
                        Log.printErrStackTrace("MicroMsg.exdevice.ExDeviceServiceHelper", e, "", new Object[0]);
                    }
                    C116024c.m163165e(new Intent(context, ExDeviceService.class), "exdevice", true, C88144b.m109786e("exdevice"));
                }
                return true;
            }
        };
        this.f110697D = new IListener<ExDeviceHaveBindNetworkDeviceEvent>(fVar) {
            {
                this.__eventId = -1795454092;
            }

            /* JADX WARNING: Removed duplicated region for block: B:108:0x01d3  */
            /* JADX WARNING: Removed duplicated region for block: B:153:0x02a4  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r19) {
                /*
                    r18 = this;
                    r0 = r19
                    com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent r0 = (com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent) r0
                    r1 = r18
                    com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager r2 = com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.this
                    r2.getClass()
                    com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$a r3 = r0.f236178d
                    long r4 = r3.f236180a
                    java.lang.String r3 = r3.f236181b
                    z71.c r6 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
                    java.util.List r6 = r6.mo74329Lo()
                    z71.g r7 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Ex0()
                    java.util.List r7 = r7.mo62019jo()
                    r8 = -1
                    java.lang.String r10 = "wxmsg_music"
                    java.lang.String r11 = "wxmsg_video"
                    r12 = 3
                    java.lang.String r13 = "wxmsg_image"
                    java.lang.String r14 = "MicroMsg.exdevice.ExdeviceEventManager"
                    int r16 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                    if (r16 == 0) goto L_0x01ce
                    r8 = -9223372036854775808
                    int r16 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                    if (r16 != 0) goto L_0x003b
                    goto L_0x01ce
                L_0x003b:
                    java.lang.Class<f62.k0> r8 = f62.C75700k0.class
                    k40.a r8 = f40.C86709a0.m107533q(r8)
                    f62.k0 r8 = (f62.C75700k0) r8
                    g62.l r8 = r8.mo96095LE()
                    com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
                    com.tencent.mm.storage.f4 r4 = r8.b00(r4)
                    long r8 = r4.getMsgId()
                    r16 = 0
                    int r5 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
                    if (r5 != 0) goto L_0x0059
                    goto L_0x01ce
                L_0x0059:
                    int r5 = r4.getType()
                    java.lang.String r8 = r4.getContent()
                    boolean r4 = r4.mo101020w3()
                    r9 = 6
                    if (r4 == 0) goto L_0x012e
                    r4 = 0
                    com.tencent.mm.message.l$b r4 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r8, r4)
                    if (r4 != 0) goto L_0x0076
                    java.lang.String r4 = "get content is null"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r4)
                    goto L_0x01ce
                L_0x0076:
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r15 = "type:"
                    r8.append(r15)
                    int r15 = r4.f195582i
                    r8.append(r15)
                    java.lang.String r8 = r8.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r8)
                    int r8 = r4.f195582i
                    if (r8 == r12) goto L_0x0106
                    r15 = 76
                    if (r8 != r15) goto L_0x0097
                    goto L_0x0106
                L_0x0097:
                    r15 = 4
                    if (r8 != r15) goto L_0x009c
                    goto L_0x01af
                L_0x009c:
                    if (r8 != r9) goto L_0x00c9
                    java.util.Iterator r4 = r6.iterator()
                L_0x00a2:
                    boolean r8 = r4.hasNext()
                    if (r8 == 0) goto L_0x00bd
                    java.lang.Object r8 = r4.next()
                    z71.b r8 = (z71.C53753b) r8
                    java.lang.String r8 = r8.f150091H
                    if (r8 == 0) goto L_0x00a2
                    java.lang.String r9 = "wxmsg_file"
                    boolean r8 = r8.contains(r9)
                    if (r8 == 0) goto L_0x00a2
                    r4 = 1
                    goto L_0x00be
                L_0x00bd:
                    r4 = 0
                L_0x00be:
                    if (r4 != 0) goto L_0x01b0
                    if (r3 != 0) goto L_0x01b0
                    r8 = 4
                    boolean r4 = r2.mo64180l(r7, r8)
                    goto L_0x01b0
                L_0x00c9:
                    r9 = 5
                    if (r8 != r9) goto L_0x00dc
                    java.lang.String r4 = r4.f195586j
                    boolean r4 = r2.mo64179k(r4, r6)
                    if (r4 != 0) goto L_0x01b0
                    if (r3 != 0) goto L_0x01b0
                    boolean r4 = r2.mo64180l(r7, r9)
                    goto L_0x01b0
                L_0x00dc:
                    r4 = 2
                    if (r8 != r4) goto L_0x01af
                    java.util.Iterator r4 = r6.iterator()
                L_0x00e3:
                    boolean r8 = r4.hasNext()
                    if (r8 == 0) goto L_0x00fb
                    java.lang.Object r8 = r4.next()
                    z71.b r8 = (z71.C53753b) r8
                    java.lang.String r8 = r8.f150091H
                    if (r8 == 0) goto L_0x00e3
                    boolean r8 = r8.contains(r13)
                    if (r8 == 0) goto L_0x00e3
                    r4 = 1
                    goto L_0x00fc
                L_0x00fb:
                    r4 = 0
                L_0x00fc:
                    if (r4 != 0) goto L_0x01b0
                    if (r3 != 0) goto L_0x01b0
                    boolean r4 = r2.mo64180l(r7, r12)
                    goto L_0x01b0
                L_0x0106:
                    java.util.Iterator r4 = r6.iterator()
                L_0x010a:
                    boolean r8 = r4.hasNext()
                    if (r8 == 0) goto L_0x0122
                    java.lang.Object r8 = r4.next()
                    z71.b r8 = (z71.C53753b) r8
                    java.lang.String r8 = r8.f150091H
                    if (r8 == 0) goto L_0x010a
                    boolean r8 = r8.contains(r10)
                    if (r8 == 0) goto L_0x010a
                    r4 = 1
                    goto L_0x0123
                L_0x0122:
                    r4 = 0
                L_0x0123:
                    if (r4 != 0) goto L_0x01b0
                    if (r3 != 0) goto L_0x01b0
                    r8 = 1
                    boolean r4 = r2.mo64180l(r7, r8)
                    goto L_0x01b0
                L_0x012e:
                    if (r5 != r12) goto L_0x0156
                    java.util.Iterator r4 = r6.iterator()
                L_0x0134:
                    boolean r8 = r4.hasNext()
                    if (r8 == 0) goto L_0x014c
                    java.lang.Object r8 = r4.next()
                    z71.b r8 = (z71.C53753b) r8
                    java.lang.String r8 = r8.f150091H
                    if (r8 == 0) goto L_0x0134
                    boolean r8 = r8.contains(r13)
                    if (r8 == 0) goto L_0x0134
                    r4 = 1
                    goto L_0x014d
                L_0x014c:
                    r4 = 0
                L_0x014d:
                    if (r4 != 0) goto L_0x01b0
                    if (r3 != 0) goto L_0x01b0
                    boolean r4 = r2.mo64180l(r7, r12)
                    goto L_0x01b0
                L_0x0156:
                    r4 = 48
                    if (r5 != r4) goto L_0x0184
                    java.util.Iterator r4 = r6.iterator()
                L_0x015e:
                    boolean r8 = r4.hasNext()
                    if (r8 == 0) goto L_0x0179
                    java.lang.Object r8 = r4.next()
                    z71.b r8 = (z71.C53753b) r8
                    java.lang.String r8 = r8.f150091H
                    if (r8 == 0) goto L_0x015e
                    java.lang.String r9 = "wxmsg_poi"
                    boolean r8 = r8.contains(r9)
                    if (r8 == 0) goto L_0x015e
                    r4 = 1
                    goto L_0x017a
                L_0x0179:
                    r4 = 0
                L_0x017a:
                    if (r4 != 0) goto L_0x01b0
                    if (r3 != 0) goto L_0x01b0
                    r8 = 2
                    boolean r4 = r2.mo64180l(r7, r8)
                    goto L_0x01b0
                L_0x0184:
                    r4 = 62
                    if (r5 != r4) goto L_0x01a4
                    java.util.Iterator r4 = r6.iterator()
                L_0x018c:
                    boolean r8 = r4.hasNext()
                    if (r8 == 0) goto L_0x01af
                    java.lang.Object r8 = r4.next()
                    z71.b r8 = (z71.C53753b) r8
                    java.lang.String r8 = r8.f150091H
                    if (r8 == 0) goto L_0x018c
                    boolean r8 = r8.contains(r11)
                    if (r8 == 0) goto L_0x018c
                    r4 = 1
                    goto L_0x01b0
                L_0x01a4:
                    r4 = 43
                    if (r5 != r4) goto L_0x01af
                    if (r3 != 0) goto L_0x01af
                    boolean r4 = r2.mo64180l(r7, r9)
                    goto L_0x01b0
                L_0x01af:
                    r4 = 0
                L_0x01b0:
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r9 = "isSupportsMsgType = "
                    r8.append(r9)
                    r8.append(r4)
                    java.lang.String r9 = ", msgType = "
                    r8.append(r9)
                    r8.append(r5)
                    java.lang.String r5 = r8.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)
                    goto L_0x01cf
                L_0x01ce:
                    r4 = 0
                L_0x01cf:
                    java.lang.String r5 = ""
                    if (r4 != 0) goto L_0x02bd
                    if (r3 == 0) goto L_0x02a0
                    com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent r4 = new com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent
                    r4.<init>()
                    com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent$a r8 = r4.f264897d
                    r8.f264899a = r3
                    r4.publish()
                    com.tencent.mm.autogen.events.GetSnsTimeLineObjectEvent$b r4 = r4.f264898e
                    com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r4.f264900a
                    if (r4 == 0) goto L_0x0294
                    te3.j00 r4 = r4.ContentObj
                    if (r4 != 0) goto L_0x01ed
                    goto L_0x0294
                L_0x01ed:
                    int r8 = r4.f298424e
                    r9 = 1
                    if (r8 != r9) goto L_0x0213
                    java.lang.String r2 = "is photo..."
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
                    java.util.Iterator r2 = r6.iterator()
                L_0x01fc:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x0275
                    java.lang.Object r4 = r2.next()
                    z71.b r4 = (z71.C53753b) r4
                    java.lang.String r4 = r4.f150091H
                    if (r4 == 0) goto L_0x01fc
                    boolean r4 = r4.contains(r13)
                    if (r4 == 0) goto L_0x01fc
                    goto L_0x0273
                L_0x0213:
                    r9 = 4
                    if (r8 == r9) goto L_0x0253
                    r9 = 42
                    if (r8 != r9) goto L_0x021b
                    goto L_0x0253
                L_0x021b:
                    r9 = 15
                    if (r8 != r9) goto L_0x0240
                    java.lang.String r2 = "is sight..."
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
                    java.util.Iterator r2 = r6.iterator()
                L_0x0229:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x0275
                    java.lang.Object r4 = r2.next()
                    z71.b r4 = (z71.C53753b) r4
                    java.lang.String r4 = r4.f150091H
                    if (r4 == 0) goto L_0x0229
                    boolean r4 = r4.contains(r11)
                    if (r4 == 0) goto L_0x0229
                    goto L_0x0273
                L_0x0240:
                    if (r8 != r12) goto L_0x0249
                    java.lang.String r4 = r4.f298426g
                    boolean r2 = r2.mo64179k(r4, r6)
                    goto L_0x0276
                L_0x0249:
                    r9 = 5
                    if (r8 != r9) goto L_0x0275
                    java.lang.String r4 = r4.f298426g
                    boolean r2 = r2.mo64179k(r4, r6)
                    goto L_0x0276
                L_0x0253:
                    java.lang.String r2 = "is music..."
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
                    java.util.Iterator r2 = r6.iterator()
                L_0x025d:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x0275
                    java.lang.Object r4 = r2.next()
                    z71.b r4 = (z71.C53753b) r4
                    java.lang.String r4 = r4.f150091H
                    if (r4 == 0) goto L_0x025d
                    boolean r4 = r4.contains(r10)
                    if (r4 == 0) goto L_0x025d
                L_0x0273:
                    r2 = 1
                    goto L_0x0276
                L_0x0275:
                    r2 = 0
                L_0x0276:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r6 = "isSupportsSnsInfo = "
                    r4.append(r6)
                    r4.append(r2)
                    java.lang.String r6 = ", snsLocalId = "
                    r4.append(r6)
                    r4.append(r3)
                    java.lang.String r3 = r4.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
                    goto L_0x02a1
                L_0x0294:
                    r2 = 1
                    java.lang.Object[] r4 = new java.lang.Object[r2]
                    r2 = 0
                    r4[r2] = r3
                    java.lang.String r2 = "isSupportsSnsInfo error,snsLocalId:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r2, r4)
                L_0x02a0:
                    r2 = 0
                L_0x02a1:
                    if (r2 == 0) goto L_0x02a4
                    goto L_0x02bd
                L_0x02a4:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r5)
                    r2.append(r7)
                    java.lang.String r2 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105926v(r14, r2)
                    com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$b r0 = r0.f236179e
                    r2 = 0
                    r0.f236182a = r2
                    r2 = 1
                    goto L_0x02d4
                L_0x02bd:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r5)
                    r2.append(r7)
                    java.lang.String r2 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105926v(r14, r2)
                    com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$b r0 = r0.f236179e
                    r2 = 1
                    r0.f236182a = r2
                L_0x02d4:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.C4111329.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f110698E = new IListener<ExDeviceSupportMsgTypeEvent>(fVar) {
            {
                this.__eventId = -757470571;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
                if (r3 != 2) goto L_0x0074;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
                if (r4 != 43) goto L_0x0074;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r12) {
                /*
                    r11 = this;
                    com.tencent.mm.autogen.events.ExDeviceSupportMsgTypeEvent r12 = (com.tencent.p014mm.autogen.events.ExDeviceSupportMsgTypeEvent) r12
                    com.tencent.mm.autogen.events.ExDeviceSupportMsgTypeEvent$b r0 = r12.f107510e
                    com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager r1 = com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.this
                    com.tencent.mm.autogen.events.ExDeviceSupportMsgTypeEvent$a r2 = r12.f107509d
                    r2.getClass()
                    com.tencent.mm.autogen.events.ExDeviceSupportMsgTypeEvent$a r12 = r12.f107509d
                    r12.getClass()
                    r1.getClass()
                    r12 = 5
                    r1 = 4
                    r2 = 3
                    java.lang.Class<f62.k0> r3 = f62.C75700k0.class
                    k40.a r3 = f40.C86709a0.m107533q(r3)
                    f62.k0 r3 = (f62.C75700k0) r3
                    g62.l r3 = r3.mo96095LE()
                    com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
                    r4 = 0
                    com.tencent.mm.storage.f4 r3 = r3.b00(r4)
                    long r6 = r3.getMsgId()
                    r8 = 0
                    r9 = 1
                    int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                    if (r10 != 0) goto L_0x0035
                    goto L_0x0074
                L_0x0035:
                    int r4 = r3.getType()
                    java.lang.String r5 = r3.getContent()
                    boolean r3 = r3.mo101020w3()
                    if (r3 == 0) goto L_0x0065
                    r3 = 0
                    com.tencent.mm.message.l$b r3 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r5, r3)
                    if (r3 != 0) goto L_0x0052
                    java.lang.String r12 = "MicroMsg.exdevice.ExdeviceEventManager"
                    java.lang.String r1 = "get content is null"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r1)
                    goto L_0x0074
                L_0x0052:
                    int r3 = r3.f195582i
                    if (r3 == r2) goto L_0x0073
                    r2 = 76
                    if (r3 == r2) goto L_0x0073
                    if (r3 == r1) goto L_0x0073
                    r1 = 6
                    if (r3 == r1) goto L_0x0073
                    if (r3 == r12) goto L_0x0073
                    r12 = 2
                    if (r3 != r12) goto L_0x0074
                    goto L_0x0073
                L_0x0065:
                    if (r4 == r2) goto L_0x0073
                    r12 = 48
                    if (r4 == r12) goto L_0x0073
                    r12 = 62
                    if (r4 == r12) goto L_0x0073
                    r12 = 43
                    if (r4 != r12) goto L_0x0074
                L_0x0073:
                    r8 = 1
                L_0x0074:
                    r0.f107511a = r8
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.C4110030.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f110699F = new IListener<ExDeviceGetNetworkDeviceInfoEvent>(fVar) {
            {
                this.__eventId = 2118494885;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceGetNetworkDeviceInfoEvent exDeviceGetNetworkDeviceInfoEvent = (ExDeviceGetNetworkDeviceInfoEvent) iEvent;
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                C93367y yVar = new C93367y(exDeviceGetNetworkDeviceInfoEvent.f264711d.f264713a);
                exdeviceEventManager.f110711R = yVar;
                Log.m105924i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "startScanWCLanDevice...");
                Java2CExDevice.startScanWCLanDevice(new byte[0], 1000);
                yVar.f269448d = false;
                new MTimerHandler(new C93362d0(yVar), false).startTimer(3000);
                C93367y yVar2 = exdeviceEventManager.f110711R;
                ExDeviceGetNetworkDeviceInfoEvent.C92481a aVar = exDeviceGetNetworkDeviceInfoEvent.f264711d;
                long j = aVar.f264713a;
                String str = aVar.f264714b;
                String str2 = aVar.f264715c;
                String str3 = aVar.f264716d;
                yVar2.getClass();
                ArrayList arrayList = new ArrayList();
                yVar2.f269452h = j;
                yVar2.f269453i = str;
                yVar2.f269454j = str2;
                yVar2.f269455n = str3;
                int size = ((ArrayList) yVar2.f269464w).size();
                for (int i = 0; i < size; i++) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("deviceType", ((C53753b) ((ArrayList) yVar2.f269464w).get(i)).field_deviceType);
                    hashMap.put("deviceID", ((C53753b) ((ArrayList) yVar2.f269464w).get(i)).field_deviceID);
                    hashMap.put("displayName", C93365i.m117886c((C53753b) ((ArrayList) yVar2.f269464w).get(i)));
                    hashMap.put("iconUrl", ((C53753b) ((ArrayList) yVar2.f269464w).get(i)).f150114z);
                    hashMap.put("ability", ((C53753b) ((ArrayList) yVar2.f269464w).get(i)).f150091H);
                    hashMap.put("abilityInf", ((C53753b) ((ArrayList) yVar2.f269464w).get(i)).f150092I);
                    arrayList.add(hashMap);
                }
                C93367y yVar3 = exdeviceEventManager.f110711R;
                ExDeviceGetNetworkDeviceInfoEvent.C92481a aVar2 = exDeviceGetNetworkDeviceInfoEvent.f264711d;
                long j2 = aVar2.f264713a;
                String str4 = aVar2.f264714b;
                String str5 = aVar2.f264715c;
                String str6 = aVar2.f264716d;
                yVar3.f269452h = j2;
                yVar3.f269453i = str4;
                yVar3.f269454j = str5;
                yVar3.f269455n = str6;
                List<C48759at2> list = yVar3.f269465x;
                if (arrayList.size() > 0 || (list != null && ((ArrayList) list).size() > 0)) {
                    ExDeviceGetNetworkDeviceInfoEvent.C92482b bVar = exDeviceGetNetworkDeviceInfoEvent.f264712e;
                    bVar.f264717a = arrayList;
                    bVar.f264718b = list;
                    bVar.f264719c = true;
                } else {
                    exDeviceGetNetworkDeviceInfoEvent.f264712e.f264719c = false;
                }
                return true;
            }
        };
        this.f110700G = new IListener<ExDeviceSendDataToNetworkDeviceEvent>(fVar) {
            {
                this.__eventId = -1115513124;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:144:0x0575, code lost:
                if (r10 != 5) goto L_0x0717;
             */
            /* JADX WARNING: Removed duplicated region for block: B:115:0x0501  */
            /* JADX WARNING: Removed duplicated region for block: B:116:0x0508  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r26) {
                /*
                    r25 = this;
                    r0 = r26
                    com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent r0 = (com.tencent.p014mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent) r0
                    r1 = r25
                    com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager r2 = com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.this
                    r2.getClass()
                    com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent$a r3 = r0.f264724d
                    java.lang.String r3 = r3.f264727b
                    boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                    r4 = 0
                    r5 = 1
                    if (r3 == 0) goto L_0x001d
                    com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent$a r3 = r0.f264724d
                    int r3 = r3.f264734i
                    if (r3 == 0) goto L_0x0027
                L_0x001d:
                    com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent$a r3 = r0.f264724d
                    java.lang.String r3 = r3.f264726a
                    boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                    if (r3 == 0) goto L_0x002d
                L_0x0027:
                    com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent$b r0 = r0.f264725e
                    r0.f264736a = r4
                    goto L_0x072d
                L_0x002d:
                    com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent$a r3 = r0.f264724d
                    boolean r6 = r3.f264733h
                    java.lang.String r7 = "MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice"
                    r8 = 2
                    if (r6 == 0) goto L_0x006d
                    com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent$b r0 = r0.f264725e
                    com.tencent.mm.plugin.exdevice.model.y r2 = r2.f110711R
                    int r6 = r3.f264734i
                    java.lang.String r3 = r3.f264726a
                    r2.getClass()
                    java.lang.Object[] r8 = new java.lang.Object[r8]
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
                    r8[r4] = r9
                    r8[r5] = r3
                    java.lang.String r4 = "send iot deviceType: %d, deviceId: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r8)
                    com.tencent.mm.plugin.exdevice.model.d r2 = r2.f269439F
                    r2.getClass()
                    java.lang.String r4 = "deviceId"
                    gy3.C87412m.m108594g(r3, r4)
                    zt3.t r4 = zt3.C119157j.f356862d
                    com.tencent.mm.plugin.exdevice.model.f r7 = new com.tencent.mm.plugin.exdevice.model.f
                    r7.<init>(r2, r3, r6)
                    zt3.j r4 = (zt3.C119157j) r4
                    java.lang.String r2 = "ExDeviceSendIotLogic"
                    r4.mo183876g(r7, r2)
                    r0.f264736a = r5
                    goto L_0x072d
                L_0x006d:
                    com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceEvent$b r0 = r0.f264725e
                    com.tencent.mm.plugin.exdevice.model.y r2 = r2.f110711R
                    java.lang.String r6 = r3.f264727b
                    java.lang.String r9 = r3.f264726a
                    java.lang.String r10 = r3.f264728c
                    long r11 = r3.f264730e
                    java.lang.String r13 = r3.f264731f
                    boolean r3 = r3.f264732g
                    java.lang.Class<f62.k0> r14 = f62.C75700k0.class
                    r2.f269452h = r11
                    r2.f269449e = r4
                    r2.f269450f = r3
                    java.lang.Object[] r15 = new java.lang.Object[r8]
                    r15[r4] = r6
                    r15[r5] = r9
                    java.lang.String r8 = "send deviceType: %s, deviceId: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r15)
                    java.lang.String r8 = "send_data_failed"
                    r15 = 3
                    if (r10 == 0) goto L_0x00aa
                    java.lang.String r5 = "wechat_to_device"
                    boolean r5 = r10.contains(r5)
                    if (r5 == 0) goto L_0x00aa
                    java.util.HashMap<java.lang.String, java.lang.String> r5 = r2.f269466y
                    java.lang.Object r5 = r5.get(r9)
                    if (r5 == 0) goto L_0x00aa
                    goto L_0x0511
                L_0x00aa:
                    if (r10 == 0) goto L_0x0511
                    java.lang.String r5 = "internet_to_device"
                    boolean r5 = r10.contains(r5)
                    if (r5 == 0) goto L_0x0511
                    if (r3 != 0) goto L_0x050f
                    k40.a r5 = f40.C86709a0.m107533q(r14)
                    f62.k0 r5 = (f62.C75700k0) r5
                    g62.l r5 = r5.mo96095LE()
                    com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
                    com.tencent.mm.storage.f4 r5 = r5.b00(r11)
                    java.lang.Boolean r17 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117890g(r5)
                    boolean r17 = r17.booleanValue()
                    if (r17 != 0) goto L_0x00ee
                    java.lang.Boolean r17 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117889f(r5)
                    boolean r17 = r17.booleanValue()
                    if (r17 != 0) goto L_0x00ee
                    java.lang.Boolean r17 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117891h(r5)
                    boolean r17 = r17.booleanValue()
                    if (r17 != 0) goto L_0x00ee
                    java.lang.Boolean r5 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117888e(r5)
                    boolean r5 = r5.booleanValue()
                    if (r5 == 0) goto L_0x050f
                L_0x00ee:
                    java.lang.Object[] r3 = new java.lang.Object[r15]
                    te3.ct2 r5 = r2.f269459r
                    if (r5 != 0) goto L_0x00f6
                    r5 = 1
                    goto L_0x00f7
                L_0x00f6:
                    r5 = 0
                L_0x00f7:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r3[r4] = r5
                    r5 = 1
                    r3[r5] = r9
                    r13 = 2
                    r3[r13] = r6
                    java.lang.String r13 = "mDeviceMsgForUseCdn %s deviceId %s deviceType %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r13, r3)
                    te3.ct2 r3 = r2.f269459r
                    if (r3 == 0) goto L_0x011d
                    com.tencent.mm.plugin.exdevice.model.w0 r2 = new com.tencent.mm.plugin.exdevice.model.w0
                    r2.<init>(r3, r6, r9, r5)
                    f40.g r3 = f40.C86709a0.m107529k()
                    ob0.b0 r3 = r3.f251779b
                    r3.mo123460f(r2)
                    goto L_0x050b
                L_0x011d:
                    com.tencent.mm.plugin.exdevice.model.l1 r3 = new com.tencent.mm.plugin.exdevice.model.l1
                    r3.<init>()
                    r3.f269431n = r4
                    r3.f269424d = r9
                    r3.f269425e = r6
                    r3.f269428h = r10
                    java.util.HashMap<java.lang.String, com.tencent.mm.plugin.exdevice.model.l1> r5 = r2.f269458q
                    r5.put(r9, r3)
                    boolean r3 = r2.f269457p
                    if (r3 != 0) goto L_0x050b
                    java.lang.Class<rz.s> r3 = p682rz.C101488s.class
                    java.lang.Class<gt.k> r5 = p158gt.C98201k.class
                    java.lang.Class<qo.l> r6 = p663qo.C101213l.class
                    r10 = 1
                    r2.f269456o = r10
                    java.lang.String r10 = "img upload"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
                    k40.a r10 = f40.C86709a0.m107533q(r14)
                    f62.k0 r10 = (f62.C75700k0) r10
                    g62.l r10 = r10.mo96095LE()
                    com.tencent.mm.storage.g4 r10 = (com.tencent.p014mm.storage.C72972g4) r10
                    com.tencent.mm.storage.f4 r10 = r10.b00(r11)
                    java.lang.Boolean r11 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117890g(r10)
                    boolean r11 = r11.booleanValue()
                    java.lang.String r12 = ""
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
                    if (r11 == 0) goto L_0x024a
                    di3.d r3 = di3.C86312j.m106911c(r5)
                    gt.k r3 = (p158gt.C98201k) r3
                    gt.m r3 = r3.mo137277xi()
                    com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
                    com.tencent.mm.modelimage.k r3 = r3.mo127198uP(r10)
                    di3.d r11 = di3.C86312j.m106911c(r5)
                    gt.k r11 = (p158gt.C98201k) r11
                    gt.m r11 = r11.mo137277xi()
                    java.lang.String r14 = r3.f267378e
                    com.tencent.mm.modelimage.m r11 = (com.tencent.p014mm.modelimage.C92839m) r11
                    r15 = 1
                    java.lang.String r11 = r11.mo127174TY(r14, r12, r12, r15)
                    di3.d r5 = di3.C86312j.m106911c(r5)
                    gt.k r5 = (p158gt.C98201k) r5
                    gt.m r5 = r5.mo137277xi()
                    java.lang.String r14 = r3.f267380g
                    com.tencent.mm.modelimage.m r5 = (com.tencent.p014mm.modelimage.C92839m) r5
                    java.lang.String r5 = r5.mo127174TY(r14, r12, r12, r15)
                    r18 = r5
                    long r4 = r3.f267374a
                    r2.f269461t = r4
                    java.lang.String r4 = r2.f269460s
                    boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                    if (r4 == 0) goto L_0x0210
                    r4 = 5
                    java.lang.Object[] r4 = new java.lang.Object[r4]
                    long r19 = r10.getCreateTime()
                    java.lang.Long r5 = java.lang.Long.valueOf(r19)
                    r14 = 0
                    r4[r14] = r5
                    java.lang.String r5 = r10.mo108768t()
                    r4[r15] = r5
                    long r15 = r10.getMsgId()
                    java.lang.Long r5 = java.lang.Long.valueOf(r15)
                    r15 = 2
                    r4[r15] = r5
                    long r14 = r2.f269461t
                    java.lang.Long r14 = java.lang.Long.valueOf(r14)
                    r15 = 3
                    r4[r15] = r14
                    r14 = 4
                    r4[r14] = r13
                    java.lang.String r13 = "createMediaId time:%d talker:%s msg:%d img:%d compressType:%d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r13, r4)
                    long r13 = r10.getCreateTime()
                    java.lang.String r4 = r10.mo108768t()
                    java.lang.StringBuilder r15 = new java.lang.StringBuilder
                    r15.<init>()
                    r15.append(r12)
                    r19 = r6
                    long r5 = r10.getMsgId()
                    r15.append(r5)
                    java.lang.String r5 = "_"
                    r15.append(r5)
                    r20 = r13
                    long r13 = r2.f269461t
                    r15.append(r13)
                    r15.append(r5)
                    r5 = 0
                    r15.append(r5)
                    r5 = r20
                    java.lang.String r13 = r15.toString()
                    java.lang.String r15 = "upimg"
                    java.lang.String r4 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r15, r5, r4, r13)
                    r2.f269460s = r4
                    goto L_0x0212
                L_0x0210:
                    r19 = r6
                L_0x0212:
                    di3.d r4 = di3.C86312j.m106911c(r19)
                    qo.l r4 = (p663qo.C101213l) r4
                    r5 = 1
                    boolean r4 = r4.dm0(r5)
                    if (r4 != 0) goto L_0x0246
                    java.lang.String r4 = r3.f267393t
                    boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                    if (r4 == 0) goto L_0x0246
                    r4 = 2
                    java.lang.Object[] r4 = new java.lang.Object[r4]
                    di3.d r6 = di3.C86312j.m106911c(r19)
                    qo.l r6 = (p663qo.C101213l) r6
                    boolean r6 = r6.dm0(r5)
                    java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                    r10 = 0
                    r4[r10] = r6
                    java.lang.String r3 = r3.f267393t
                    r4[r5] = r3
                    java.lang.String r3 = "cdntra not use cdn flag:%b getCdnInfo:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r3, r4)
                    goto L_0x04fe
                L_0x0246:
                    r5 = r18
                    goto L_0x040d
                L_0x024a:
                    r19 = r6
                    java.lang.Boolean r4 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117889f(r10)
                    boolean r4 = r4.booleanValue()
                    java.lang.String r6 = "cdntra not use cdn flag:%b getCdnInfo:%d"
                    if (r4 != 0) goto L_0x0328
                    java.lang.Boolean r4 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117888e(r10)
                    boolean r4 = r4.booleanValue()
                    if (r4 == 0) goto L_0x0264
                    goto L_0x0328
                L_0x0264:
                    java.lang.Boolean r4 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117891h(r10)
                    boolean r4 = r4.booleanValue()
                    if (r4 == 0) goto L_0x0324
                    di3.d r4 = di3.C86312j.m106911c(r3)
                    rz.s r4 = (p682rz.C101488s) r4
                    rz.t r4 = r4.Kj0()
                    java.lang.String r5 = r10.mo108765s2()
                    hd0.o0 r4 = (hd0.C98410o0) r4
                    hd0.n0 r4 = r4.mo137720f(r5)
                    if (r4 != 0) goto L_0x029e
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "Get info Failed file:"
                    r3.append(r4)
                    java.lang.String r4 = r10.mo108765s2()
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r3)
                    goto L_0x04fe
                L_0x029e:
                    di3.d r5 = di3.C86312j.m106911c(r19)
                    qo.l r5 = (p663qo.C101213l) r5
                    r11 = 2
                    boolean r5 = r5.dm0(r11)
                    if (r5 != 0) goto L_0x02d0
                    int r5 = r4.f288573t
                    r13 = 1
                    if (r5 == r13) goto L_0x02d0
                    java.lang.Object[] r3 = new java.lang.Object[r11]
                    di3.d r5 = di3.C86312j.m106911c(r19)
                    qo.l r5 = (p663qo.C101213l) r5
                    boolean r5 = r5.dm0(r11)
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r10 = 0
                    r3[r10] = r5
                    int r4 = r4.f288573t
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r3[r13] = r4
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r6, r3)
                    goto L_0x04fe
                L_0x02d0:
                    long r5 = r4.f288563j
                    java.lang.String r11 = r4.mo137707k()
                    java.lang.String r13 = r4.mo137700d()
                    java.lang.String r15 = "upvideo"
                    java.lang.String r5 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r15, r5, r11, r13)
                    r2.f269460s = r5
                    boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                    if (r5 == 0) goto L_0x02fa
                    r5 = 1
                    java.lang.Object[] r3 = new java.lang.Object[r5]
                    java.lang.String r4 = r4.mo137700d()
                    r5 = 0
                    r3[r5] = r4
                    java.lang.String r4 = "cdntra genClientId failed not use cdn file:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r4, r3)
                    goto L_0x04fe
                L_0x02fa:
                    di3.d r4 = di3.C86312j.m106911c(r3)
                    rz.s r4 = (p682rz.C101488s) r4
                    rz.t r4 = r4.Kj0()
                    java.lang.String r5 = r10.mo108765s2()
                    hd0.o0 r4 = (hd0.C98410o0) r4
                    java.lang.String r5 = r4.mo137729r(r5)
                    di3.d r3 = di3.C86312j.m106911c(r3)
                    rz.s r3 = (p682rz.C101488s) r3
                    rz.t r3 = r3.Kj0()
                    java.lang.String r4 = r10.mo108765s2()
                    hd0.o0 r3 = (hd0.C98410o0) r3
                    java.lang.String r11 = r3.mo137728q(r4)
                    goto L_0x040d
                L_0x0324:
                    r5 = r12
                    r11 = r5
                    goto L_0x040d
                L_0x0328:
                    java.lang.String r3 = r10.getContent()
                    r4 = 0
                    com.tencent.mm.message.l$b r3 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r3, r4)
                    java.lang.Class<ym.s> r4 = p763ym.C53543s.class
                    di3.d r4 = di3.C86312j.m106911c(r4)
                    ym.s r4 = (p763ym.C53543s) r4
                    ym.i r4 = r4.mo74024KZ()
                    java.lang.String r3 = r3.f195606o
                    com.tencent.mm.pluginsdk.model.app.e r4 = (com.tencent.p014mm.pluginsdk.model.app.C72684e) r4
                    com.tencent.mm.pluginsdk.model.app.d r3 = r4.mo100154qq(r3)
                    if (r3 == 0) goto L_0x04f9
                    java.lang.String r11 = r3.field_fileFullPath
                    di3.d r4 = di3.C86312j.m106911c(r19)
                    qo.l r4 = (p663qo.C101213l) r4
                    r15 = 4
                    boolean r4 = r4.dm0(r15)
                    if (r4 != 0) goto L_0x037c
                    int r4 = r3.field_isUseCdn
                    r14 = 1
                    if (r4 == r14) goto L_0x037c
                    r4 = 2
                    java.lang.Object[] r4 = new java.lang.Object[r4]
                    di3.d r5 = di3.C86312j.m106911c(r19)
                    qo.l r5 = (p663qo.C101213l) r5
                    boolean r5 = r5.dm0(r15)
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r10 = 0
                    r4[r10] = r5
                    int r3 = r3.field_isUseCdn
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r4[r14] = r3
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r6, r4)
                    goto L_0x04fe
                L_0x037c:
                    java.lang.String r4 = r10.mo108765s2()
                    boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                    if (r4 != 0) goto L_0x039c
                    di3.d r4 = di3.C86312j.m106911c(r5)
                    gt.k r4 = (p158gt.C98201k) r4
                    gt.m r4 = r4.mo137277xi()
                    java.lang.String r5 = r10.mo108765s2()
                    com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
                    java.lang.String r4 = r4.mo127161CZ(r5)
                    r5 = r4
                    goto L_0x039d
                L_0x039c:
                    r5 = r12
                L_0x039d:
                    long r20 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
                    java.lang.String r4 = r3.field_fileFullPath
                    long r22 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
                    r4 = 5242880(0x500000, float:7.34684E-39)
                    long r14 = (long) r4
                    int r4 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
                    if (r4 < 0) goto L_0x03c2
                    r4 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r4]
                    r4 = 0
                    r3[r4] = r5
                    java.lang.Long r4 = java.lang.Long.valueOf(r20)
                    r5 = 1
                    r3[r5] = r4
                    java.lang.String r4 = "cdntra thumb[%s][%d] Too Big Not Use CDN TRANS"
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r4, r3)
                    goto L_0x04fe
                L_0x03c2:
                    long r14 = r3.field_createTime
                    java.lang.String r6 = r10.mo108768t()
                    java.lang.String r4 = "upattach"
                    java.lang.String r1 = "0"
                    java.lang.String r1 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r4, r14, r6, r1)
                    r2.f269460s = r1
                    boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                    if (r1 == 0) goto L_0x03e6
                    r1 = 1
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    r4 = 0
                    r3[r4] = r13
                    java.lang.String r5 = "cdntra genClientId failed not use cdn compressType:%d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r5, r3)
                    goto L_0x04ff
                L_0x03e6:
                    r1 = 1
                    r4 = 0
                    r6 = 5
                    java.lang.Object[] r6 = new java.lang.Object[r6]
                    long r13 = r3.field_msgInfoId
                    java.lang.Long r13 = java.lang.Long.valueOf(r13)
                    r6[r4] = r13
                    java.lang.String r3 = r3.field_fileFullPath
                    r6[r1] = r3
                    java.lang.Long r1 = java.lang.Long.valueOf(r22)
                    r3 = 2
                    r6[r3] = r1
                    r1 = 3
                    r6[r1] = r5
                    java.lang.Long r1 = java.lang.Long.valueOf(r20)
                    r3 = 4
                    r6[r3] = r1
                    java.lang.String r1 = "cdntra checkUseCdn id:%d file[%s][%d] thumb[%s][%d]"
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r1, r6)
                L_0x040d:
                    if (r11 == 0) goto L_0x04fe
                    android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)
                    java.lang.String r3 = r1.getPath()
                    if (r3 == 0) goto L_0x0434
                    r4 = 0
                    java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r4, r4)
                    java.lang.String r4 = r1.getPath()
                    boolean r4 = r4.equals(r3)
                    if (r4 != 0) goto L_0x0434
                    android.net.Uri$Builder r1 = r1.buildUpon()
                    android.net.Uri$Builder r1 = r1.path(r3)
                    android.net.Uri r1 = r1.build()
                L_0x0434:
                    com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                    r4 = 0
                    com.tencent.mm.vfs.f0$h r1 = r3.mo177799l(r1, r4)
                    boolean r3 = r1.mo177810a()
                    if (r3 != 0) goto L_0x0443
                    r1 = 0
                    goto L_0x044b
                L_0x0443:
                    com.tencent.mm.vfs.FileSystem$c r3 = r1.f348991a
                    java.lang.String r1 = r1.f348992b
                    boolean r1 = r3.mo119948x(r1)
                L_0x044b:
                    if (r1 != 0) goto L_0x044f
                    goto L_0x04fe
                L_0x044f:
                    java.lang.Boolean r1 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117890g(r10)
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L_0x0463
                    java.lang.Boolean r1 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117888e(r10)
                    boolean r1 = r1.booleanValue()
                    if (r1 == 0) goto L_0x0478
                L_0x0463:
                    java.util.Random r1 = new java.util.Random
                    r1.<init>()
                    long r3 = r1.nextLong()
                    r2.f269462u = r3
                    java.lang.String r11 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117884a(r11, r3)
                    long r3 = r2.f269462u
                    java.lang.String r5 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117884a(r5, r3)
                L_0x0478:
                    r1 = 1
                    r2.f269451g = r1
                    gi.g r1 = new gi.g
                    r1.<init>()
                    java.lang.String r3 = "task_ExdeviceSendDataToNetworkDevice"
                    r1.f287660d = r3
                    gi.g$a r3 = r2.f269446M
                    r1.f287662f = r3
                    java.lang.String r3 = r2.f269460s
                    r1.field_mediaId = r3
                    r1.field_fullpath = r11
                    r1.field_thumbpath = r5
                    r3 = 20303(0x4f4f, float:2.845E-41)
                    r1.field_fileType = r3
                    java.lang.String r4 = r10.mo108768t()
                    r1.field_talker = r4
                    r4 = 1
                    r1.field_priority = r4
                    r4 = 0
                    r1.field_needStorage = r4
                    r1.field_isStreamMedia = r4
                    r4 = 202(0xca, float:2.83E-43)
                    r1.field_appType = r4
                    r5 = 2
                    r1.field_bzScene = r5
                    java.lang.Boolean r5 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117889f(r10)
                    boolean r5 = r5.booleanValue()
                    if (r5 == 0) goto L_0x04b9
                    r1.field_fileType = r3
                    r1.field_appType = r4
                    goto L_0x04ce
                L_0x04b9:
                    java.lang.Boolean r3 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117891h(r10)
                    boolean r3 = r3.booleanValue()
                    if (r3 == 0) goto L_0x04ce
                    r3 = 102(0x66, float:1.43E-43)
                    r1.field_appType = r3
                    r3 = 20202(0x4eea, float:2.8309E-41)
                    r1.field_fileType = r3
                    r3 = 1
                    r1.field_bzScene = r3
                L_0x04ce:
                    di3.d r3 = di3.C86312j.m106911c(r19)
                    qo.l r3 = (p663qo.C101213l) r3
                    boolean r1 = r3.if0(r1)
                    if (r1 != 0) goto L_0x04f7
                    com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r18 = 111(0x6f, double:5.5E-322)
                    r20 = 205(0xcd, double:1.013E-321)
                    r22 = 1
                    r24 = 0
                    r17.idkeyStat(r18, r20, r22, r24)
                    r1 = 1
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    java.lang.String r1 = r2.f269460s
                    r4 = 0
                    r3[r4] = r1
                    java.lang.String r1 = "cdntra addSendTask failed. clientid:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r1, r3)
                    r2.f269460s = r12
                    goto L_0x04fe
                L_0x04f7:
                    r4 = 1
                    goto L_0x04ff
                L_0x04f9:
                    java.lang.String r1 = "getFilePath attInfo is null"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
                L_0x04fe:
                    r4 = 0
                L_0x04ff:
                    if (r4 != 0) goto L_0x0508
                    com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r9, r8)
                    r1 = 0
                    r2.f269457p = r1
                    goto L_0x050b
                L_0x0508:
                    r1 = 1
                    r2.f269457p = r1
                L_0x050b:
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    goto L_0x0727
                L_0x050f:
                    r5 = 1
                    goto L_0x0512
                L_0x0511:
                    r5 = 0
                L_0x0512:
                    te3.ct2 r1 = new te3.ct2
                    r1.<init>()
                    if (r3 == 0) goto L_0x0712
                    com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r2.mo128156e()
                    te3.j00 r3 = r3.ContentObj
                    int r3 = r3.f298424e
                    java.lang.String r4 = "mediaObjImage is null"
                    r10 = 1
                    if (r3 != r10) goto L_0x0557
                    if (r5 != 0) goto L_0x0557
                    java.lang.String r3 = r2.f269454j
                    if (r3 != 0) goto L_0x0557
                    r2.f269442I = r1
                    r2.f269443J = r6
                    r2.f269444K = r9
                    r2.f269445L = r5
                    com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r2.mo128156e()
                    java.lang.String r3 = r2.f269455n
                    te3.kv2 r1 = r2.mo128154c(r1, r3)
                    if (r1 != 0) goto L_0x0548
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r4)
                    com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r9, r8)
                    goto L_0x0553
                L_0x0548:
                    java.lang.String r1 = r1.f298692g
                    r2.f269441H = r1
                    java.lang.Runnable r1 = r2.f269440G
                    java.lang.String r2 = "ExdeviceDownloadImage"
                    com.tencent.p014mm.sdk.thread.ThreadPool.post(r1, r2)
                L_0x0553:
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    goto L_0x0727
                L_0x0557:
                    if (r13 != 0) goto L_0x055b
                    goto L_0x0717
                L_0x055b:
                    com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r2.mo128156e()
                    te3.j00 r8 = r3.ContentObj
                    int r10 = r8.f298424e
                    r11 = 1
                    if (r10 == r11) goto L_0x0628
                    r4 = 15
                    if (r10 == r4) goto L_0x05ef
                    r4 = 42
                    if (r10 == r4) goto L_0x05a9
                    r4 = 3
                    if (r10 == r4) goto L_0x0579
                    r4 = 4
                    if (r10 == r4) goto L_0x05a9
                    r4 = 5
                    if (r10 == r4) goto L_0x0579
                    goto L_0x0717
                L_0x0579:
                    java.util.LinkedList<te3.kv2> r4 = r8.f298427h
                    r8 = 0
                    java.lang.Object r4 = r4.get(r8)
                    te3.kv2 r4 = (te3.C101804kv2) r4
                    if (r4 != 0) goto L_0x058c
                    java.lang.String r2 = "mediaObUrl is null"
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r2)
                    goto L_0x0717
                L_0x058c:
                    r4 = 1
                    r2.f269449e = r4
                    te3.gt2 r2 = new te3.gt2
                    r2.<init>()
                    te3.j00 r3 = r3.ContentObj
                    java.lang.String r4 = r3.f298426g
                    r2.f298304d = r4
                    java.lang.String r4 = r3.f298425f
                    r2.f298305e = r4
                    java.lang.String r3 = r3.f298423d
                    r2.f298306f = r3
                    r1.f298054i = r2
                    r2 = 5
                    r1.f298049d = r2
                    goto L_0x0717
                L_0x05a9:
                    java.lang.String r4 = "is sns music!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
                    te3.j00 r4 = r3.ContentObj
                    java.util.LinkedList<te3.kv2> r4 = r4.f298427h
                    r8 = 0
                    java.lang.Object r4 = r4.get(r8)
                    te3.kv2 r4 = (te3.C101804kv2) r4
                    if (r4 != 0) goto L_0x05c4
                    java.lang.String r2 = "mediaObj is null"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r2)
                    goto L_0x0717
                L_0x05c4:
                    r7 = 1
                    r2.f269449e = r7
                    te3.ft2 r2 = new te3.ft2
                    r2.<init>()
                    java.lang.String r7 = r4.f298697o
                    r2.f298260d = r7
                    java.lang.String r7 = r4.f298691f
                    r2.f298261e = r7
                    te3.j00 r7 = r3.ContentObj
                    java.lang.String r7 = r7.f298426g
                    r2.f298263g = r7
                    java.lang.String r7 = r4.f298692g
                    r2.f298265i = r7
                    java.lang.String r4 = r4.f298699q
                    r2.f298266j = r4
                    te3.r5 r3 = r3.AppInfo
                    java.lang.String r3 = r3.f299238f
                    r2.f298267n = r3
                    r1.f298050e = r2
                    r2 = 1
                    r1.f298049d = r2
                    goto L_0x0717
                L_0x05ef:
                    java.lang.String r4 = "is sns sight!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
                    te3.j00 r3 = r3.ContentObj
                    java.util.LinkedList<te3.kv2> r3 = r3.f298427h
                    r4 = 0
                    java.lang.Object r3 = r3.get(r4)
                    te3.kv2 r3 = (te3.C101804kv2) r3
                    if (r3 != 0) goto L_0x060a
                    java.lang.String r2 = "mediaObjSight is null"
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r2)
                    goto L_0x0717
                L_0x060a:
                    r4 = 1
                    r2.f269449e = r4
                    te3.ht2 r2 = new te3.ht2
                    r2.<init>()
                    java.lang.String r3 = r3.f298692g
                    r2.f298357g = r3
                    java.lang.Object[] r8 = new java.lang.Object[r4]
                    r4 = 0
                    r8[r4] = r3
                    java.lang.String r3 = "videoMsg.url = %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r3, r8)
                    r1.f298055j = r2
                    r2 = 6
                    r1.f298049d = r2
                    goto L_0x0717
                L_0x0628:
                    java.lang.String r8 = "is sns photo!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                    r8 = -1
                    java.lang.String r10 = r2.f269454j
                    if (r10 == 0) goto L_0x06ba
                    int r11 = r10.length()
                    if (r11 <= 0) goto L_0x06ba
                    android.net.Uri r8 = com.tencent.p014mm.vfs.C116299g2.m163858n(r10)
                    java.lang.String r11 = r8.getPath()
                    if (r11 == 0) goto L_0x065e
                    r12 = 0
                    java.lang.String r11 = com.tencent.p014mm.vfs.C116299g2.m163855k(r11, r12, r12)
                    java.lang.String r12 = r8.getPath()
                    boolean r12 = r12.equals(r11)
                    if (r12 != 0) goto L_0x065e
                    android.net.Uri$Builder r8 = r8.buildUpon()
                    android.net.Uri$Builder r8 = r8.path(r11)
                    android.net.Uri r8 = r8.build()
                L_0x065e:
                    java.lang.String r11 = r8.getPath()
                    java.lang.String r12 = "/"
                    int r12 = r11.lastIndexOf(r12)
                    if (r12 >= 0) goto L_0x066b
                    goto L_0x0671
                L_0x066b:
                    r13 = 1
                    int r12 = r12 + r13
                    java.lang.String r11 = r11.substring(r12)
                L_0x0671:
                    com.tencent.mm.vfs.f0 r12 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                    r13 = 0
                    com.tencent.mm.vfs.f0$h r8 = r12.mo177799l(r8, r13)
                    boolean r12 = r8.mo177810a()
                    r15 = 0
                    if (r12 != 0) goto L_0x0681
                    goto L_0x068b
                L_0x0681:
                    com.tencent.mm.vfs.FileSystem$c r12 = r8.f348991a
                    java.lang.String r8 = r8.f348992b
                    com.tencent.mm.vfs.b0 r8 = r12.mo119945q(r8)
                    if (r8 != 0) goto L_0x068d
                L_0x068b:
                    r12 = r15
                    goto L_0x068f
                L_0x068d:
                    long r12 = r8.f250473c
                L_0x068f:
                    int r8 = (int) r12
                    java.lang.String r12 = "."
                    int r12 = r11.lastIndexOf(r12)
                    r13 = 1
                    int r12 = r12 + r13
                    int r15 = r11.length()
                    java.lang.String r15 = r11.substring(r12, r15)
                    java.lang.String r12 = com.tencent.p014mm.vfs.C86013q1.m106456q(r10)
                    r14 = 3
                    java.lang.Object[] r13 = new java.lang.Object[r14]
                    r14 = 0
                    r13[r14] = r10
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
                    r14 = 1
                    r13[r14] = r10
                    r10 = 2
                    r13[r10] = r12
                    java.lang.String r10 = "dataSnsInit filePath %s, fileSize %s, fileMd5 %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r13)
                    goto L_0x06be
                L_0x06ba:
                    r13 = 0
                    r11 = r13
                    r12 = r11
                    r15 = r12
                L_0x06be:
                    te3.dt2 r10 = new te3.dt2
                    r10.<init>()
                    r10.f298128d = r15
                    r10.f298129e = r11
                    r10.f298130f = r8
                    r10.f298131g = r12
                    r8 = 1
                    if (r5 != r8) goto L_0x070c
                    java.lang.String r8 = r2.f269455n
                    te3.kv2 r2 = r2.mo128154c(r3, r8)
                    if (r2 != 0) goto L_0x06da
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r4)
                    goto L_0x0717
                L_0x06da:
                    java.lang.String r3 = r2.f298692g
                    r10.f298134j = r3
                    java.lang.String r3 = r2.f298676I
                    r10.f298135n = r3
                    boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                    if (r3 != 0) goto L_0x070c
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = r10.f298134j
                    r3.append(r4)
                    java.lang.String r4 = "?idx="
                    r3.append(r4)
                    int r4 = r2.f298675H
                    r3.append(r4)
                    java.lang.String r4 = "&token="
                    r3.append(r4)
                    java.lang.String r2 = r2.f298674G
                    r3.append(r2)
                    java.lang.String r2 = r3.toString()
                    r10.f298134j = r2
                L_0x070c:
                    r1.f298052g = r10
                    r2 = 3
                    r1.f298049d = r2
                    goto L_0x0717
                L_0x0712:
                    long r3 = r2.f269452h
                    r2.mo128153b(r1, r3)
                L_0x0717:
                    com.tencent.mm.plugin.exdevice.model.w0 r2 = new com.tencent.mm.plugin.exdevice.model.w0
                    r2.<init>(r1, r6, r9, r5)
                    f40.g r1 = f40.C86709a0.m107529k()
                    ob0.b0 r1 = r1.f251779b
                    r1.mo123460f(r2)
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                L_0x0727:
                    boolean r1 = r1.booleanValue()
                    r0.f264736a = r1
                L_0x072d:
                    r0 = 1
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.C4111532.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f110701H = new IListener<ExDeviceStopScanNetworkDeviceEvent>(fVar) {
            {
                this.__eventId = -1380313906;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceStopScanNetworkDeviceEvent exDeviceStopScanNetworkDeviceEvent = (ExDeviceStopScanNetworkDeviceEvent) iEvent;
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                C93367y yVar = exdeviceEventManager.f110711R;
                if (!yVar.f269448d) {
                    Log.m105924i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "stopScanNetworkDevice...");
                    Java2CExDevice.stopScanWCLanDevice();
                    yVar.f269448d = true;
                }
                C93356d dVar = yVar.f269439F;
                if (dVar != null) {
                    dVar.f269408i = true;
                    dVar.f269405f.clear();
                }
                C86709a0.m107525e().postToWorker(new C2235e0(yVar));
                C86709a0.m107529k().f251779b.mo123470p(1717, yVar);
                C86709a0.m107529k().f251779b.mo123470p(6844, yVar);
                C2242s0.m2051a().mo2133d(14, yVar.f269435B);
                C2242s0.m2051a().mo2133d(12, yVar.f269436C);
                C2242s0.m2051a().mo2133d(13, yVar.f269437D);
                C2242s0.m2051a().mo2133d(15, yVar.f269438E);
                exDeviceStopScanNetworkDeviceEvent.f264744d.f264745a = true;
                return true;
            }
        };
        this.f110702I = new IListener<ExDeviceCheckNetworkDeviceUploadCdnEvent>(fVar) {
            {
                this.__eventId = 168329187;
            }

            public boolean callback(IEvent iEvent) {
                boolean z;
                ExDeviceCheckNetworkDeviceUploadCdnEvent exDeviceCheckNetworkDeviceUploadCdnEvent = (ExDeviceCheckNetworkDeviceUploadCdnEvent) iEvent;
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                ExDeviceCheckNetworkDeviceUploadCdnEvent.C92480b bVar = exDeviceCheckNetworkDeviceUploadCdnEvent.f264706e;
                C93367y yVar = exdeviceEventManager.f110711R;
                ExDeviceCheckNetworkDeviceUploadCdnEvent.C92479a aVar = exDeviceCheckNetworkDeviceUploadCdnEvent.f264705d;
                long j = aVar.f264707a;
                if (aVar.f264709c) {
                    C93356d dVar = yVar.f269439F;
                    z = dVar != null && dVar.f269400a == j && dVar.f269407h;
                } else {
                    z = yVar.f269451g;
                }
                bVar.f264710a = z;
                return true;
            }
        };
        this.f110703J = new IListener<ExDeviceSettingShowEvent>(fVar) {
            {
                this.__eventId = 343760486;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceSettingShowEvent exDeviceSettingShowEvent = (ExDeviceSettingShowEvent) iEvent;
                ExdeviceEventManager.this.getClass();
                List<C53753b> bF = C41166r1.Bx0().mo74335bF();
                C86709a0.m107528h();
                boolean z = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_EXDEVICE_BIND_IOT_DEVICE_COUNT_INT_SYNC, 0) > 0;
                if (((LinkedList) bF).size() > 0 || z) {
                    exDeviceSettingShowEvent.f107479d.f107480a = true;
                } else {
                    exDeviceSettingShowEvent.f107479d.f107480a = false;
                }
                return true;
            }
        };
        this.f110704K = new IListener<ExDeviceCancelNetworkDeviceTaskEvent>(fVar) {
            {
                this.__eventId = 1915961636;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceCancelNetworkDeviceTaskEvent exDeviceCancelNetworkDeviceTaskEvent = (ExDeviceCancelNetworkDeviceTaskEvent) iEvent;
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                String str = exDeviceCancelNetworkDeviceTaskEvent.f264701d.f264703a;
                ExDeviceCancelNetworkDeviceTaskEvent.C92478b bVar = exDeviceCancelNetworkDeviceTaskEvent.f264702e;
                C93367y yVar = exdeviceEventManager.f110711R;
                yVar.f269458q.remove(str);
                if (yVar.f269467z.get(str) != null) {
                    Log.m105924i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "cancelWCLanDeviceTask cmdId: " + yVar.f269467z.get(str));
                    Java2CExDevice.cancelWCLanDeviceTask(yVar.f269467z.get(str).intValue());
                }
                bVar.f264704a = true;
                return true;
            }
        };
        this.f110705L = new IListener<ExDeviceOpenLanDeviceLibEvent>(fVar) {
            {
                this.__eventId = -948960575;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceOpenLanDeviceLibEvent exDeviceOpenLanDeviceLibEvent = (ExDeviceOpenLanDeviceLibEvent) iEvent;
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                if (exdeviceEventManager.f110710Q == null) {
                    exdeviceEventManager.f110710Q = new ExdeviceWCLanSDKUtil();
                }
                ExdeviceWCLanSDKUtil exdeviceWCLanSDKUtil = exdeviceEventManager.f110710Q;
                boolean z = exDeviceOpenLanDeviceLibEvent.f9112d.f9113a;
                exdeviceWCLanSDKUtil.getClass();
                if (z) {
                    Log.m105924i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "initWCLanDeviceLib...");
                    Java2CExDevice.initWCLanDeviceLib();
                    C2242s0.m2051a().mo2132c(14, exdeviceWCLanSDKUtil.f12290f);
                    C2242s0.m2051a().mo2132c(10, exdeviceWCLanSDKUtil.f12287c);
                    C2242s0.m2051a().mo2132c(13, exdeviceWCLanSDKUtil.f12288d);
                    C2242s0.m2051a().mo2132c(16, exdeviceWCLanSDKUtil.f12289e);
                    return true;
                }
                C86709a0.m107525e().postToWorker(new C2240l0(exdeviceWCLanSDKUtil));
                Log.m105918d("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "unregisterReceiver...");
                BroadcastReceiver broadcastReceiver = exdeviceWCLanSDKUtil.f12295k;
                if (broadcastReceiver != null) {
                    exdeviceWCLanSDKUtil.f12294j.unregisterReceiver(broadcastReceiver);
                    exdeviceWCLanSDKUtil.f12295k = null;
                }
                C2242s0.m2051a().mo2133d(14, exdeviceWCLanSDKUtil.f12290f);
                C2242s0.m2051a().mo2133d(10, exdeviceWCLanSDKUtil.f12287c);
                C2242s0.m2051a().mo2133d(13, exdeviceWCLanSDKUtil.f12288d);
                C2242s0.m2051a().mo2133d(16, exdeviceWCLanSDKUtil.f12289e);
                return true;
            }
        };
        this.f110706M = new IListener<ExDeviceStartScanLanDeviceEvent>(fVar) {
            {
                this.__eventId = -356307183;
            }

            public boolean callback(IEvent iEvent) {
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                ExdeviceWCLanSDKUtil exdeviceWCLanSDKUtil = exdeviceEventManager.f110710Q;
                boolean z = ((ExDeviceStartScanLanDeviceEvent) iEvent).f9138d.f9139a;
                exdeviceWCLanSDKUtil.getClass();
                if (z) {
                    Log.m105924i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "startScanWCLanDevice...");
                    Java2CExDevice.startScanWCLanDevice(new byte[0], 1000);
                    return true;
                }
                Log.m105924i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "stopScanWCLanDevice...");
                Java2CExDevice.stopScanWCLanDevice();
                return true;
            }
        };
        this.f110707N = new IListener<ExDeviceConnectLanDeviceEvent>(fVar) {
            {
                this.__eventId = 572502140;
            }

            public boolean callback(IEvent iEvent) {
                ExDeviceConnectLanDeviceEvent exDeviceConnectLanDeviceEvent = (ExDeviceConnectLanDeviceEvent) iEvent;
                ExdeviceEventManager exdeviceEventManager = ExdeviceEventManager.this;
                exdeviceEventManager.getClass();
                ExDeviceConnectLanDeviceEvent.C1008a aVar = exDeviceConnectLanDeviceEvent.f9072d;
                boolean z = false;
                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "ExDeviceConnectLanDeviceEvent: brandName=%s, deviceId=%s, type=%b", aVar.f9075b, aVar.f9074a, Boolean.valueOf(aVar.f9076c));
                if (!((C48053v) C86312j.m106911c(C48053v.class)).mo72615Pd(exDeviceConnectLanDeviceEvent.f9072d.f9075b)) {
                    exDeviceConnectLanDeviceEvent.f9073e.f9077a = false;
                } else {
                    C53753b bD = C41166r1.Bx0().mo74334bD(exDeviceConnectLanDeviceEvent.f9072d.f9074a);
                    if (bD == null) {
                        exDeviceConnectLanDeviceEvent.f9073e.f9077a = false;
                        Log.m105921e("MicroMsg.exdevice.ExdeviceEventManager", "hdInfo null, %s", exDeviceConnectLanDeviceEvent.f9072d.f9074a);
                    } else if (!bD.field_brandName.equals(exDeviceConnectLanDeviceEvent.f9072d.f9075b)) {
                        exDeviceConnectLanDeviceEvent.f9073e.f9077a = false;
                        Log.m105921e("MicroMsg.exdevice.ExdeviceEventManager", "brand name not match. %s != %s", bD.field_brandName, exDeviceConnectLanDeviceEvent.f9072d.f9075b);
                    } else {
                        ExdeviceWCLanSDKUtil exdeviceWCLanSDKUtil = exdeviceEventManager.f110710Q;
                        ExDeviceConnectLanDeviceEvent.C1008a aVar2 = exDeviceConnectLanDeviceEvent.f9072d;
                        String str = aVar2.f9074a;
                        boolean z2 = aVar2.f9076c;
                        if (str == null) {
                            exdeviceWCLanSDKUtil.getClass();
                        } else if (exdeviceWCLanSDKUtil.f12291g.containsKey(str)) {
                            byte[] bArr = exdeviceWCLanSDKUtil.f12291g.get(str);
                            exdeviceWCLanSDKUtil.f12298n = true;
                            if (z2) {
                                try {
                                    String string = new JSONObject(new String(bArr)).getString("deviceType");
                                    Log.m105924i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "connectWCLanDevice deviceId: " + str);
                                    if (Java2CExDevice.connectWCLanDevice(bArr, false) != 0) {
                                        Log.m105920e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "connectWCLanDevice error!");
                                        exDeviceConnectLanDeviceEvent.f9073e.f9077a = z;
                                    } else {
                                        ExDeviceLanDeviceConnectStateEvent exDeviceLanDeviceConnectStateEvent = new ExDeviceLanDeviceConnectStateEvent();
                                        ExDeviceLanDeviceConnectStateEvent.C1018a aVar3 = exDeviceLanDeviceConnectStateEvent.f9103d;
                                        aVar3.f9104a = str;
                                        aVar3.f9105b = 1;
                                        aVar3.f9106c = string;
                                        exDeviceLanDeviceConnectStateEvent.publish();
                                    }
                                } catch (Exception e) {
                                    Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", e, "", new Object[0]);
                                    Log.m105920e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON decode failed in connectWCLanDevice!");
                                }
                            } else {
                                exdeviceWCLanSDKUtil.mo2126a(false, str);
                                Log.m105924i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "disconnectWCLanDevice...");
                                Java2CExDevice.disconnectWCLanDevice(bArr);
                            }
                            z = true;
                            exDeviceConnectLanDeviceEvent.f9073e.f9077a = z;
                        }
                        Log.m105920e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "mDevClassInfo is null in connectWCLanDevice");
                        exDeviceConnectLanDeviceEvent.f9073e.f9077a = z;
                    }
                }
                return z;
            }
        };
        this.f110708O = new IListener<ExDeviceSendDataToLanDeviceEvent>(fVar) {
            {
                this.__eventId = 1842678161;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x007d  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0097  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r9) {
                /*
                    r8 = this;
                    com.tencent.mm.autogen.events.ExDeviceSendDataToLanDeviceEvent r9 = (com.tencent.p014mm.autogen.events.ExDeviceSendDataToLanDeviceEvent) r9
                    com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager r0 = com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.this
                    r0.getClass()
                    r1 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    com.tencent.mm.autogen.events.ExDeviceSendDataToLanDeviceEvent$a r2 = r9.f9126d
                    java.lang.String r3 = r2.f9128a
                    r4 = 0
                    r1[r4] = r3
                    java.lang.String r2 = r2.f9129b
                    r3 = 1
                    r1[r3] = r2
                    java.lang.String r2 = "MicroMsg.exdevice.ExdeviceEventManager"
                    java.lang.String r5 = "ExDeviceSendDataToLanDeviceEvent: brandName=%s, deviceId=%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
                    com.tencent.mm.autogen.events.ExDeviceSendDataToLanDeviceEvent$a r1 = r9.f9126d
                    java.lang.String r1 = r1.f9128a
                    java.lang.Class<rn.v> r5 = p227rn.C48053v.class
                    di3.d r5 = di3.C86312j.m106911c(r5)
                    rn.v r5 = (p227rn.C48053v) r5
                    boolean r1 = r5.mo72615Pd(r1)
                    if (r1 == 0) goto L_0x0111
                    com.tencent.mm.autogen.events.ExDeviceSendDataToLanDeviceEvent$a r1 = r9.f9126d
                    java.lang.String r1 = r1.f9130c
                    boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                    if (r1 == 0) goto L_0x003b
                    goto L_0x0111
                L_0x003b:
                    z71.c r1 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
                    com.tencent.mm.autogen.events.ExDeviceSendDataToLanDeviceEvent$a r5 = r9.f9126d
                    java.lang.String r5 = r5.f9129b
                    z71.b r1 = r1.mo74334bD(r5)
                    if (r1 != 0) goto L_0x0054
                    java.lang.String r0 = "hdInfo error"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
                    com.tencent.mm.autogen.events.ExDeviceSendDataToLanDeviceEvent$b r9 = r9.f9127e
                    r9.f9131a = r4
                    goto L_0x0115
                L_0x0054:
                    com.tencent.mm.autogen.events.ExDeviceSendDataToLanDeviceEvent$b r1 = r9.f9127e
                    com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil r0 = r0.f110710Q
                    com.tencent.mm.autogen.events.ExDeviceSendDataToLanDeviceEvent$a r9 = r9.f9126d
                    java.lang.String r2 = r9.f9129b
                    java.lang.String r9 = r9.f9130c
                    if (r2 == 0) goto L_0x0075
                    java.util.HashMap<java.lang.String, java.lang.Boolean> r5 = r0.f12292h
                    boolean r5 = r5.containsKey(r2)
                    if (r5 == 0) goto L_0x0078
                    java.util.HashMap<java.lang.String, java.lang.Boolean> r5 = r0.f12292h
                    java.lang.Object r5 = r5.get(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    boolean r5 = r5.booleanValue()
                    goto L_0x0079
                L_0x0075:
                    r0.getClass()
                L_0x0078:
                    r5 = 0
                L_0x0079:
                    java.lang.String r6 = "MicroMsg.exdevice.ExdeviceWCLanSDKUtil"
                    if (r5 != 0) goto L_0x0097
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    r9.<init>()
                    java.lang.String r0 = "deviceId "
                    r9.append(r0)
                    r9.append(r2)
                    java.lang.String r0 = " not connected!"
                    r9.append(r0)
                    java.lang.String r9 = r9.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r9)
                    goto L_0x010d
                L_0x0097:
                    if (r2 == 0) goto L_0x0108
                    java.util.HashMap<java.lang.String, byte[]> r5 = r0.f12291g
                    boolean r5 = r5.containsKey(r2)
                    if (r5 == 0) goto L_0x0108
                    java.util.HashMap<java.lang.String, byte[]> r5 = r0.f12291g
                    java.lang.Object r2 = r5.get(r2)
                    byte[] r2 = (byte[]) r2
                    r0.f12285a = r4
                    org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00fa }
                    r5.<init>()     // Catch:{ Exception -> 0x00fa }
                    java.lang.String r7 = "data"
                    r5.put(r7, r9)     // Catch:{ Exception -> 0x00fa }
                    org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x00fa }
                    r9.<init>()     // Catch:{ Exception -> 0x00fa }
                    java.lang.String r7 = "wxmsg_jsapi"
                    r9.put(r7, r5)     // Catch:{ Exception -> 0x00fa }
                    org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00fa }
                    r5.<init>()     // Catch:{ Exception -> 0x00fa }
                    java.lang.String r7 = "services"
                    r5.put(r7, r9)     // Catch:{ Exception -> 0x00fa }
                    java.lang.String r9 = r5.toString()
                    byte[] r9 = r9.getBytes()
                    int r9 = com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice.useWCLanDeviceService(r2, r9)
                    r0.f12285a = r9
                    if (r9 == 0) goto L_0x00f3
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    r9.<init>()
                    java.lang.String r2 = "get useWCLanDeviceService mCallBackCmdId ="
                    r9.append(r2)
                    int r0 = r0.f12285a
                    r9.append(r0)
                    java.lang.String r9 = r9.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r9)
                    r4 = 1
                    goto L_0x010d
                L_0x00f3:
                    java.lang.String r9 = "useWCLanDeviceService error!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r9)
                    goto L_0x010d
                L_0x00fa:
                    r9 = move-exception
                    java.lang.Object[] r0 = new java.lang.Object[r4]
                    java.lang.String r2 = ""
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r9, r2, r0)
                    java.lang.String r9 = "JSON encode failed in useWCLanDeviceService"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r9)
                    goto L_0x010d
                L_0x0108:
                    java.lang.String r9 = "mDevClassInfo is null in useWCLanDeviceService"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r9)
                L_0x010d:
                    r1.f9131a = r4
                    r4 = 1
                    goto L_0x0115
                L_0x0111:
                    com.tencent.mm.autogen.events.ExDeviceSendDataToLanDeviceEvent$b r9 = r9.f9127e
                    r9.f9131a = r4
                L_0x0115:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.C223140.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f110709P = new IListener<ExDeviceGetLanDeviceInfosEvent>(fVar) {
            {
                this.__eventId = 289348103;
            }

            /* JADX WARNING: Removed duplicated region for block: B:22:0x009e  */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x00a4 A[Catch:{ Exception -> 0x00ad }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r12) {
                /*
                    r11 = this;
                    com.tencent.mm.autogen.events.ExDeviceGetLanDeviceInfosEvent r12 = (com.tencent.p014mm.autogen.events.ExDeviceGetLanDeviceInfosEvent) r12
                    com.tencent.mm.plugin.exdevice.model.ExdeviceEventManager r0 = com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.this
                    r0.getClass()
                    r1 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    com.tencent.mm.autogen.events.ExDeviceGetLanDeviceInfosEvent$a r2 = r12.f9089d
                    java.lang.String r3 = r2.f9092b
                    r4 = 0
                    r1[r4] = r3
                    android.content.Context r2 = r2.f9091a
                    r3 = 1
                    r1[r3] = r2
                    java.lang.String r2 = "MicroMsg.exdevice.ExdeviceEventManager"
                    java.lang.String r5 = "ExDeviceGetLanDeviceInfosEvent: brandName=%s, context=%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
                    com.tencent.mm.autogen.events.ExDeviceGetLanDeviceInfosEvent$a r1 = r12.f9089d
                    java.lang.String r1 = r1.f9092b
                    java.lang.Class<rn.v> r5 = p227rn.C48053v.class
                    di3.d r5 = di3.C86312j.m106911c(r5)
                    rn.v r5 = (p227rn.C48053v) r5
                    boolean r1 = r5.mo72615Pd(r1)
                    if (r1 != 0) goto L_0x0038
                    com.tencent.mm.autogen.events.ExDeviceGetLanDeviceInfosEvent$b r12 = r12.f9090e
                    r0 = 0
                    r12.f9094b = r0
                    r12.f9093a = r4
                    goto L_0x00ce
                L_0x0038:
                    z71.c r1 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Bx0()
                    com.tencent.mm.autogen.events.ExDeviceGetLanDeviceInfosEvent$a r5 = r12.f9089d
                    java.lang.String r5 = r5.f9092b
                    java.util.LinkedList r1 = r1.mo74333Yt(r5)
                    org.json.JSONArray r5 = new org.json.JSONArray
                    r5.<init>()
                    java.util.Iterator r6 = r1.iterator()     // Catch:{ Exception -> 0x00ad }
                L_0x004d:
                    boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x00ad }
                    if (r7 == 0) goto L_0x00bb
                    java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x00ad }
                    z71.b r7 = (z71.C53753b) r7     // Catch:{ Exception -> 0x00ad }
                    boolean r8 = r1.isEmpty()     // Catch:{ Exception -> 0x00ad }
                    if (r8 == 0) goto L_0x0060
                    goto L_0x004d
                L_0x0060:
                    java.lang.String r8 = r7.field_connProto     // Catch:{ Exception -> 0x00ad }
                    java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)     // Catch:{ Exception -> 0x00ad }
                    java.lang.String r9 = "4"
                    boolean r8 = r8.contains(r9)     // Catch:{ Exception -> 0x00ad }
                    if (r8 == 0) goto L_0x004d
                    org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ad }
                    r8.<init>()     // Catch:{ Exception -> 0x00ad }
                    java.lang.String r9 = "deviceId"
                    java.lang.String r10 = r7.field_deviceID     // Catch:{ Exception -> 0x00ad }
                    r8.put(r9, r10)     // Catch:{ Exception -> 0x00ad }
                    com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil r9 = r0.f110710Q     // Catch:{ Exception -> 0x00ad }
                    java.lang.String r7 = r7.field_deviceID     // Catch:{ Exception -> 0x00ad }
                    if (r7 == 0) goto L_0x0095
                    java.util.HashMap<java.lang.String, java.lang.Boolean> r10 = r9.f12292h     // Catch:{ Exception -> 0x00ad }
                    boolean r10 = r10.containsKey(r7)     // Catch:{ Exception -> 0x00ad }
                    if (r10 == 0) goto L_0x0098
                    java.util.HashMap<java.lang.String, java.lang.Boolean> r9 = r9.f12292h     // Catch:{ Exception -> 0x00ad }
                    java.lang.Object r7 = r9.get(r7)     // Catch:{ Exception -> 0x00ad }
                    java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Exception -> 0x00ad }
                    boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x00ad }
                    goto L_0x0099
                L_0x0095:
                    r9.getClass()     // Catch:{ Exception -> 0x00ad }
                L_0x0098:
                    r7 = 0
                L_0x0099:
                    java.lang.String r9 = "state"
                    if (r7 == 0) goto L_0x00a4
                    java.lang.String r7 = "connected"
                    r8.put(r9, r7)     // Catch:{ Exception -> 0x00ad }
                    goto L_0x00a9
                L_0x00a4:
                    java.lang.String r7 = "disconnected"
                    r8.put(r9, r7)     // Catch:{ Exception -> 0x00ad }
                L_0x00a9:
                    r5.put(r8)     // Catch:{ Exception -> 0x00ad }
                    goto L_0x004d
                L_0x00ad:
                    r0 = move-exception
                    java.lang.Object[] r1 = new java.lang.Object[r3]
                    java.lang.String r0 = r0.getMessage()
                    r1[r4] = r0
                    java.lang.String r0 = "Ex in handleGetDeviceInfosEvent, %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r1)
                L_0x00bb:
                    com.tencent.mm.autogen.events.ExDeviceGetLanDeviceInfosEvent$b r12 = r12.f9090e
                    r12.f9094b = r5
                    r12.f9093a = r3
                    java.lang.Object[] r12 = new java.lang.Object[r3]
                    java.lang.String r0 = r5.toString()
                    r12[r4] = r0
                    java.lang.String r0 = "GetDeviceInfos: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r12)
                L_0x00ce:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.ExdeviceEventManager.C223241.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f110712S = false;
        this.f110715a = new LinkedList();
        this.f110716b = new HashMap();
        this.f110713T = new MMHandler("wifi_device_heart_beat");
    }

    /* renamed from: a */
    public static boolean m44539a(ExdeviceEventManager exdeviceEventManager, boolean z, boolean z2) {
        exdeviceEventManager.getClass();
        Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "------handleGetBoundDeviceEvent------ check if need to get bound device after auth");
        if (z2) {
            C41154p0 p0Var = C41154p0.INSTANCE;
            if (!p0Var.mo64216c(z)) {
                return true;
            }
            p0Var.mo64218f();
            return true;
        }
        C41154p0 p0Var2 = C41154p0.INSTANCE;
        if (!p0Var2.mo64215b(z)) {
            return true;
        }
        Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "do get bound device");
        p0Var2.mo64217e((Context) null, (C41154p0.C41156b) null);
        return true;
    }

    /* renamed from: n */
    public static void m44540n(String str, String str2, int i, String str3) {
        OpFromExDeviceEvent opFromExDeviceEvent = new OpFromExDeviceEvent();
        OpFromExDeviceEvent.C40149a aVar = opFromExDeviceEvent.f107677d;
        aVar.f107678a = 2;
        aVar.f107680c = str;
        aVar.f107682e = i;
        aVar.f107681d = str2;
        aVar.f107679b = str3;
        opFromExDeviceEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: b */
    public final boolean mo64170b() {
        LinkedList<C53753b> qq = C41166r1.Bx0().mo74339qq();
        if (qq.isEmpty()) {
            Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "get harddevice info is null or empty");
            return false;
        }
        C41166r1.xx0().mo64207e(2);
        Iterator<C53753b> it = qq.iterator();
        while (it.hasNext()) {
            C53753b next = it.next();
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(next.field_brandName);
            if (z1Var == null || !z1Var.mo62927s3()) {
                Log.m105921e("MicroMsg.exdevice.ExdeviceEventManager", "%s is not my contact now, may be has been deleted", next.field_brandName);
            } else {
                int i = next.field_connStrategy;
                if ((i & 4) == 0) {
                    Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "Connect Strategy is %d, no need to sync in main ui", Integer.valueOf(i));
                } else {
                    Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "now try to connect %s", next.field_brandName);
                    C41166r1.xx0().mo64203a(next.field_brandName, next.field_mac, 0, true);
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public final int mo64171c(C53753b bVar) {
        if (Util.nullAsNil(bVar.field_connProto).contains("1")) {
            return 1;
        }
        return Util.nullAsNil(bVar.field_connProto).contains("3") ? 0 : -1;
    }

    /* renamed from: d */
    public boolean mo64172d(String str) {
        Log.m105918d("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceSimpleBTConnectDevice");
        boolean z = false;
        if (!mo64178j()) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "isBTOpenAndBLESupported return false");
            return false;
        } else if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "mac is null or nil");
            return false;
        } else {
            C41125f0 zx02 = C41166r1.zx0();
            long h = C45288e.m50137h(str);
            C41107a aVar = new C41107a();
            C53499i.C53500a e = zx02.f110794f.mo74178e(h);
            if (e == null || 2 != e.f150449e) {
                C41140m xx02 = C41166r1.xx0();
                C41130g0 g0Var = new C41130g0(zx02, aVar);
                xx02.getClass();
                Log.m105918d("MicroMsg.exdevice.ExdeviceConnectManager", "simpleBTConnect");
                C41178a aVar2 = xx02.f110826a;
                if (aVar2 == null || !aVar2.f110939e) {
                    if (xx02.f110826a == null) {
                        xx02.f110826a = new C41178a();
                    }
                    C41178a aVar3 = xx02.f110826a;
                    aVar3.f110938d = new C41138k(xx02, 0, h, g0Var);
                    aVar3.mo64230a(MMApplicationContext.getContext());
                    return true;
                }
                Log.m105924i("MicroMsg.exdevice.ExdeviceConnectManager", "try start connect");
                C53501k kVar = C53502m.m60039c().f110806a;
                if (kVar != null) {
                    try {
                        z = ((C53503o) kVar).f150455a.Pr0(h, 0, g0Var);
                    } catch (RemoteException e2) {
                        Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e2, "", new Object[0]);
                    }
                    if (z) {
                        return true;
                    }
                }
                Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "connect failed!!!");
                return true;
            }
            String str2 = C41125f0.f110792h;
            Log.m105918d(str2, "device(" + h + ") has been connected");
            aVar.mo64186a(h, 2, 2, 0, e.f150451g);
            return true;
        }
    }

    /* renamed from: e */
    public boolean mo64173e(String str) {
        boolean z = false;
        Log.m105919d("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceSimpleBTDisconnectDevice, mac(%s).", str);
        if (!mo64178j()) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "isBTOpenAndBLESupported return false");
            return false;
        } else if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "mac is null or nil");
            return false;
        } else {
            C41125f0 zx02 = C41166r1.zx0();
            long h = C45288e.m50137h(str);
            zx02.getClass();
            C41140m xx02 = C41166r1.xx0();
            xx02.getClass();
            Log.m105918d("MicroMsg.exdevice.ExdeviceConnectManager", "simpleBTDisconnect");
            if (xx02.f110826a == null) {
                Log.m105924i("MicroMsg.exdevice.ExdeviceConnectManager", "exdevice process is dead, just leave");
            } else if (C53502m.m60039c().f110806a == null) {
                Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
            } else {
                C53503o oVar = (C53503o) C53502m.m60039c().f110806a;
                oVar.getClass();
                try {
                    z = oVar.f150455a.pq0(h);
                } catch (RemoteException e) {
                    Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e, "", new Object[0]);
                }
                if (!z) {
                    Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "simpleBluetoothDisconnect failed!!!");
                }
            }
            return true;
        }
    }

    /* renamed from: f */
    public boolean mo64174f() {
        Log.m105918d("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceSimpleBTScanDevice");
        boolean z = false;
        if (!mo64178j()) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "isBTOpenAndBLESupported return false");
            return false;
        }
        C41125f0 zx02 = C41166r1.zx0();
        if (zx02.f110793e) {
            Log.m105918d(C41125f0.f110792h, "still scanning. return");
        } else {
            C41140m xx02 = C41166r1.xx0();
            C41188e.C41189a aVar = zx02.f110795g;
            xx02.getClass();
            Log.m105918d("MicroMsg.exdevice.ExdeviceConnectManager", "simpleBTScan");
            C41178a aVar2 = xx02.f110826a;
            if (aVar2 == null || !aVar2.f110939e) {
                if (xx02.f110826a == null) {
                    xx02.f110826a = new C41178a();
                }
                C41178a aVar3 = xx02.f110826a;
                aVar3.f110938d = new C41136j(xx02, 0, aVar);
                aVar3.mo64230a(MMApplicationContext.getContext());
            } else if (C53502m.m60039c().f110806a == null) {
                Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
            } else {
                Log.m105924i("MicroMsg.exdevice.ExdeviceConnectManager", "try start scan");
                C53503o oVar = (C53503o) C53502m.m60039c().f110806a;
                oVar.getClass();
                try {
                    z = oVar.f150455a.Ks0(0, aVar);
                } catch (RemoteException e) {
                    Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e, "", new Object[0]);
                }
                if (!z) {
                    Log.m105920e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
                }
            }
            zx02.f110793e = true;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo64175g(String str, byte[] bArr) {
        String str2 = "null";
        boolean z = false;
        if (Util.isNullOrNil(str) || Util.isNullOrNil(bArr)) {
            Object[] objArr = new Object[2];
            if (!Util.isNullOrNil(str)) {
                str2 = TPDownloadProxyEnum.USER_MAC;
            }
            objArr[0] = str2;
            objArr[1] = Integer.valueOf(Util.isNullOrNil(bArr) ? 0 : bArr.length);
            Log.m105921e("MicroMsg.exdevice.ExdeviceEventManager", "input error. mac = %s, dataLen = %d", objArr);
            return false;
        }
        Object[] objArr2 = new Object[2];
        if (!Util.isNullOrNil(str)) {
            str2 = str;
        }
        objArr2[0] = str2;
        objArr2[1] = Integer.valueOf(Util.isNullOrNil(bArr) ? 0 : bArr.length);
        Log.m105921e("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceSimpleBTSendDataToDevice. mac = %s, dataLen = %d", objArr2);
        long h = C45288e.m50137h(str);
        C53499i.C53500a e = C41166r1.zx0().f110794f.mo74178e(h);
        if (e == null) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "can not find the hardevice connect state");
            return false;
        } else if (e.f150449e != 2) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "device is not connected.");
            return false;
        } else {
            C41125f0 zx02 = C41166r1.zx0();
            C41108b bVar = new C41108b();
            zx02.getClass();
            if (bArr == null || bArr.length <= 0) {
                Log.m105920e(C41125f0.f110792h, "no data for transmit");
            } else if (C53502m.m60039c().f110806a == null) {
                Log.m105920e(C41125f0.f110792h, "can not send data");
            } else {
                C53503o oVar = (C53503o) C53502m.m60039c().f110806a;
                oVar.getClass();
                try {
                    z = oVar.f150455a.mo23547bO(h, bArr, bVar);
                } catch (RemoteException e2) {
                    Log.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", e2, "", new Object[0]);
                }
                if (!z) {
                    Log.m105920e(C41125f0.f110792h, "simpleBluetoothSendData error");
                }
            }
            return z;
        }
    }

    /* renamed from: h */
    public boolean mo64176h(String str, String str2, byte[] bArr) {
        byte[] bArr2 = bArr;
        String str3 = "null";
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2) || Util.isNullOrNil(bArr)) {
            Object[] objArr = new Object[3];
            objArr[0] = Util.isNullOrNil(str) ? str3 : str;
            if (!Util.isNullOrNil(str2)) {
                str3 = str2;
            }
            objArr[1] = str3;
            objArr[2] = Integer.valueOf(Util.isNullOrNil(bArr) ? 0 : bArr2.length);
            Log.m105921e("MicroMsg.exdevice.ExdeviceEventManager", "input error. mac = %s, brandName = %s, dataLen = %d", objArr);
            return false;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = Util.isNullOrNil(str) ? str3 : str;
        if (!Util.isNullOrNil(str2)) {
            str3 = str2;
        }
        objArr2[1] = str3;
        objArr2[2] = Integer.valueOf(Util.isNullOrNil(bArr) ? 0 : bArr2.length);
        Log.m105919d("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceSimpleBTUploadDataToServer. mac = %s, brandName = %s, dataLen = %d", objArr2);
        C53753b kD = C41166r1.Bx0().mo74337kD(C45288e.m50137h(str));
        if (kD == null) {
            Log.m105921e("MicroMsg.exdevice.ExdeviceEventManager", "device(mac=%s) not found in brand(brandName=%s)", str, str2);
            return false;
        }
        C47302a b = C47302a.m52606b(bArr);
        if (1 != b.f126957d) {
            Log.m105921e("MicroMsg.exdevice.ExdeviceEventManager", "not step profile type %d != %d", 1L, Long.valueOf(b.f126957d));
            return false;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        ((C52366c) C86312j.m106911c(C52366c.class)).b50(kD.field_deviceID, kD.field_deviceType, (int) (instance.getTimeInMillis() / 1000), (int) (System.currentTimeMillis() / 1000), ((C47303f) b).f126963h, "", 1);
        return true;
    }

    /* renamed from: i */
    public final boolean mo64177i(int i, String str) {
        int i2;
        int i3;
        int i4;
        int i5 = i;
        String str2 = str;
        Class cls = C48053v.class;
        Log.m105926v("MicroMsg.exdevice.ExdeviceEventManager", "handleInChattingUI.");
        if (!((C48053v) C86312j.m106911c(cls)).mo72615Pd(str2)) {
            Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "It's not hardware biz");
            return false;
        }
        LinkedList<C53753b> Yt = C41166r1.Bx0().mo74333Yt(str2);
        int i6 = 3;
        int i7 = 1;
        if (((C48053v) C86312j.m106911c(cls)).mo72613El(str2)) {
            LinkedList<C53753b> qq = C41166r1.Bx0().mo74339qq();
            if (qq.size() != 0) {
                for (C53753b next : qq) {
                    Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "BLE hard device info, mac(%s), deviceId(%s), deviceType(%s), SimpleProtol(%d)", Long.valueOf(next.field_mac), next.field_deviceID, next.field_deviceType, Long.valueOf(next.f150090G));
                    if (0 != (next.f150090G & 1)) {
                        Yt.add(next);
                    }
                }
            }
        }
        if (Yt == null) {
            Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "handleInChattingUI, hdInfo is null.");
            return false;
        } else if (Yt.size() == 0) {
            Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "handleInChattingUI, hdInfo size is 0.");
            return true;
        } else {
            int i8 = 0;
            int i9 = 0;
            for (C53753b next2 : Yt) {
                if (next2 == null) {
                    Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "hdInfo error");
                } else if (Util.nullAsNil(next2.field_connProto).contains(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL)) {
                    Object[] objArr = new Object[i7];
                    objArr[0] = next2.field_brandName;
                    Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "%s, Wifi biz, continue.", objArr);
                } else {
                    int i15 = next2.field_connStrategy;
                    if ((i15 & 16) != 0) {
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = next2.field_brandName;
                        objArr2[i7] = Integer.valueOf(i15);
                        Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "%s, Connect stragegy(%d) ignore connection on chat, continue!!!", objArr2);
                    } else {
                        if (Util.nullAsNil(next2.field_connProto).contains("1")) {
                            i8++;
                            boolean z = BluetoothAdapter.getDefaultAdapter() != null;
                            Object[] objArr3 = new Object[i7];
                            objArr3[0] = Boolean.valueOf(z);
                            Log.m105925i("MicroMsg.exdevice.BluetoothSDKUtil", "isSupportBC: %b", objArr3);
                            if (!z) {
                                Object[] objArr4 = new Object[i7];
                                objArr4[0] = next2.field_brandName;
                                Log.m105921e("MicroMsg.exdevice.ExdeviceEventManager", "%s, device is BC, but you phone not support BC.", objArr4);
                            } else {
                                i3 = i8;
                                i2 = i9;
                                i4 = 1;
                            }
                        } else if (Util.nullAsNil(next2.field_connProto).contains("3")) {
                            i9++;
                            if (!C47887a.m53195b(MMApplicationContext.getContext())) {
                                Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "device is BLE, but you phone not support BLE.");
                            } else {
                                i3 = i8;
                                i2 = i9;
                                i4 = 0;
                            }
                        } else {
                            i3 = i8;
                            i2 = i9;
                            i4 = -1;
                        }
                        Object[] objArr5 = new Object[i6];
                        objArr5[0] = Integer.valueOf(i);
                        objArr5[i7] = next2.field_brandName;
                        objArr5[2] = next2.field_connProto;
                        Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "receive ExDeviceOpInChattingUIEventListener, op(%d), brandName(%s), connProto(%s),", objArr5);
                        if (i5 == 0) {
                            C41140m xx02 = C41166r1.xx0();
                            long j = next2.field_mac;
                            xx02.getClass();
                            Object[] objArr6 = new Object[i7];
                            objArr6[0] = Long.valueOf(j);
                            Log.m105925i("MicroMsg.exdevice.ExdeviceConnectManager", "StopSyncTimer, device Id = %d", objArr6);
                            if (xx02.f110829d.containsKey(Long.valueOf(j))) {
                                Log.m105924i("MicroMsg.exdevice.ExdeviceConnectManager", "Switch from main view to chatting view before exdevice sync timeout, just stop MTimerHandler");
                                MTimerHandler remove = xx02.f110829d.remove(Long.valueOf(j));
                                if (remove != null) {
                                    remove.stopTimer();
                                } else {
                                    Object[] objArr7 = new Object[i7];
                                    objArr7[0] = Long.valueOf(j);
                                    Log.m105921e("MicroMsg.exdevice.ExdeviceConnectManager", "Remove deviceId(%d) from syncTimeOutMap failed!!!", objArr7);
                                }
                            }
                            if (C53502m.m60037a().mo74176c(next2.field_mac) == 2) {
                                Object[] objArr8 = new Object[2];
                                objArr8[0] = next2.field_brandName;
                                objArr8[i7] = Long.valueOf(next2.field_mac);
                                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "Enter chatting ui, find this deivce has been connected aready, device name = %s, device id = %d", objArr8);
                                if (C53502m.m60037a().mo74180g(next2.field_mac)) {
                                    Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "This device is auth aready");
                                    m44540n(next2.field_brandName, next2.field_url, 2, next2.field_deviceID);
                                } else {
                                    Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "This device has been connected but not auth yet.");
                                }
                            } else if ((((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_exdevice_pss_opt, 0) == i7 || C89625d.f257845k) && !C47887a.m53196c()) {
                                Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "System bluetooth is close!!!");
                            } else if (!C53498h.m60027a(MMApplicationContext.getContext())) {
                                Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "service not running");
                            } else if (C41175x.m44616b(next2)) {
                                Object[] objArr9 = new Object[2];
                                objArr9[0] = C45288e.m50135f(next2.field_mac);
                                objArr9[i7] = next2.field_brandName;
                                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "Connect simple device, mac(%s), brandName(%s)", objArr9);
                                C41110d dVar = r1;
                                C41110d dVar2 = new C41110d(this, next2.field_brandName, C45288e.m50135f(next2.field_mac), next2.field_url, next2.field_deviceID);
                                C41111e eVar = (C41111e) ((HashMap) this.f110716b).put(next2.field_brandName + next2.field_mac, dVar);
                                mo64172d(C45288e.m50135f(next2.field_mac));
                            } else {
                                Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "Connect AirSync device, mac(%s), brandName(%s)", C45288e.m50135f(next2.field_mac), next2.field_brandName);
                                C41166r1.xx0().mo64207e(1);
                                C41140m xx03 = C41166r1.xx0();
                                Long valueOf = Long.valueOf(next2.field_mac);
                                int i16 = next2.field_connStrategy;
                                synchronized (xx03) {
                                    xx03.f110830e.put(valueOf, Integer.valueOf(i16));
                                }
                                C41166r1.xx0().mo64203a(next2.field_brandName, next2.field_mac, i4, false);
                            }
                        } else if (i5 == 1) {
                            if (C41175x.m44616b(next2)) {
                                C41111e eVar2 = (C41111e) ((HashMap) this.f110716b).put(next2.field_brandName + next2.field_mac, new C41110d(this, next2.field_brandName, C45288e.m50135f(next2.field_mac), next2.field_url, next2.field_deviceID));
                                mo64172d(C45288e.m50135f(next2.field_mac));
                            } else {
                                C41140m xx04 = C41166r1.xx0();
                                Long valueOf2 = Long.valueOf(next2.field_mac);
                                int i17 = next2.field_connStrategy;
                                synchronized (xx04) {
                                    xx04.f110830e.put(valueOf2, Integer.valueOf(i17));
                                }
                                C41166r1.xx0().mo64203a(next2.field_brandName, next2.field_mac, i4, false);
                            }
                        } else if (i5 == 2) {
                            if (C41175x.m44616b(next2)) {
                                mo64173e(C45288e.m50135f(next2.field_mac));
                            } else {
                                C41166r1.xx0().mo64204b(next2.field_mac);
                            }
                        }
                        i8 = i3;
                        i9 = i2;
                        i6 = 3;
                        i7 = 1;
                    }
                }
            }
            if (i8 + i9 > 0) {
                if (!C47887a.m53196c()) {
                    Log.m105928w("MicroMsg.exdevice.ExdeviceEventManager", "System bluetooth is close");
                    mo64181m(str2, 0);
                } else if (i9 > 0 && i8 == 0 && !C47887a.m53195b(MMApplicationContext.getContext())) {
                    mo64181m(str2, 1);
                    return true;
                }
                return true;
            }
            mo64181m(str2, -1);
            return true;
        }
    }

    /* renamed from: j */
    public final boolean mo64178j() {
        if (!C47887a.m53195b(MMApplicationContext.getContext())) {
            Log.m105921e("MicroMsg.exdevice.ExdeviceEventManager", "now sdk version not support ble device : %d", Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        } else if (C47887a.m53196c()) {
            return true;
        } else {
            Log.m105920e("MicroMsg.exdevice.ExdeviceEventManager", "Bluetooth is not open, Just leave");
            return false;
        }
    }

    /* renamed from: k */
    public final boolean mo64179k(String str, List<C53753b> list) {
        String host = Uri.parse(str).getHost();
        Log.m105924i("MicroMsg.exdevice.ExdeviceEventManager", "is url...");
        JSONArray jSONArray = null;
        boolean z = false;
        for (C53753b next : list) {
            String str2 = next.f150091H;
            String str3 = next.f150092I;
            if (str3 != null && str3.length() > 0 && str2 != null && str2.contains("wxmsg_url")) {
                try {
                    jSONArray = new JSONObject(str3).getJSONArray("wxmsg_url");
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceEventManager", e, "", new Object[0]);
                }
                int length = jSONArray.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    try {
                        if (jSONArray.getString(i).equals(host)) {
                            z = true;
                            break;
                        }
                        i++;
                    } catch (JSONException e2) {
                        Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceEventManager", e2, "", new Object[0]);
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    /* renamed from: l */
    public final boolean mo64180l(List<C39323f> list, int i) {
        for (C39323f fVar : list) {
            LinkedList<Integer> i2 = C45288e.m50138i(fVar.field_supportMsgTypeList);
            if (i2 != null) {
                Iterator<Integer> it = i2.iterator();
                while (it.hasNext()) {
                    if (it.next().intValue() == i) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* renamed from: m */
    public void mo64181m(String str, int i) {
        OpFromExDeviceEvent opFromExDeviceEvent = new OpFromExDeviceEvent();
        OpFromExDeviceEvent.C40149a aVar = opFromExDeviceEvent.f107677d;
        aVar.f107678a = 1;
        aVar.f107680c = str;
        aVar.f107683f = i;
        opFromExDeviceEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: o */
    public void mo64182o(String str, boolean z) {
        Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnDeviceBindStateChange. deviceId=%s, isBound=%s", str, Boolean.valueOf(z));
        ExDeviceOnDeviceBindStateChangeEvent exDeviceOnDeviceBindStateChangeEvent = new ExDeviceOnDeviceBindStateChangeEvent();
        ExDeviceOnDeviceBindStateChangeEvent.C40073a aVar = exDeviceOnDeviceBindStateChangeEvent.f107464d;
        aVar.f107465a = str;
        aVar.f107466b = z;
        exDeviceOnDeviceBindStateChangeEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: p */
    public void mo64183p(String str, String str2, byte[] bArr) {
        Log.m105925i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnRecvDataFromDevice. deviceId=%s, brandName=%s", str, str2);
        ExDeviceOnRecvDataFromDeviceEvent exDeviceOnRecvDataFromDeviceEvent = new ExDeviceOnRecvDataFromDeviceEvent();
        ExDeviceOnRecvDataFromDeviceEvent.C40074a aVar = exDeviceOnRecvDataFromDeviceEvent.f107467d;
        aVar.f107469b = str;
        aVar.f107468a = str2;
        aVar.f107470c = bArr;
        exDeviceOnRecvDataFromDeviceEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: q */
    public void mo64184q(String str, String str2, boolean z) {
        LinkedList<C41111e> linkedList;
        synchronized (this.f110715a) {
            linkedList = new LinkedList<>(this.f110715a);
        }
        for (C41111e v2 : linkedList) {
            v2.mo64190v2(str, str2, z);
        }
        linkedList.clear();
        for (C41111e v25 : ((HashMap) this.f110716b).values()) {
            v25.mo64190v2(str, str2, z);
        }
        Log.m105918d("MicroMsg.exdevice.ExdeviceEventManager", "simple BT on scan result: broadcastName=" + str + ", mac=" + str2 + ", isCompleted=" + z);
        ExDeviceSimpleBTOnScanResultEvent exDeviceSimpleBTOnScanResultEvent = new ExDeviceSimpleBTOnScanResultEvent();
        ExDeviceSimpleBTOnScanResultEvent.C40084a aVar = exDeviceSimpleBTOnScanResultEvent.f107496d;
        aVar.f107497a = str;
        aVar.f107498b = str2;
        aVar.f107499c = z;
        exDeviceSimpleBTOnScanResultEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: r */
    public boolean mo64185r(C41111e eVar) {
        if (eVar == null || ((LinkedList) this.f110715a).contains(eVar)) {
            return false;
        }
        return ((LinkedList) this.f110715a).add(eVar);
    }
}
