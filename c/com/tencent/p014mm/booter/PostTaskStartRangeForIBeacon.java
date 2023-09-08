package com.tencent.p014mm.booter;

import android.bluetooth.BluetoothAdapter;
import android.os.Looper;
import cc0.C92411b;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExDeviceIBeaconPushRefreshUIEvent;
import com.tencent.p014mm.autogen.events.ExDeviceIBeaconRangingEvent;
import com.tencent.p014mm.autogen.events.ExDeviceIBeaconRangingResultEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import lc3.C10485b;
import ob0.C11385n;
import ob0.C117747y;
import p702ts.C78085c;
import pc0.C47456m;
import te3.C49423fh2;
import te3.C49561gh2;
import te3.C49846ih2;
import te3.C51453tv1;

/* renamed from: com.tencent.mm.booter.PostTaskStartRangeForIBeacon */
public class PostTaskStartRangeForIBeacon {

    /* renamed from: a */
    public static C92411b f108039a = null;

    /* renamed from: b */
    public static float f108040b = -85.0f;

    /* renamed from: c */
    public static float f108041c = -1000.0f;

    /* renamed from: d */
    public static boolean f108042d;

    /* renamed from: e */
    public static Map<String, C49423fh2> f108043e = new ConcurrentHashMap();

    /* renamed from: f */
    public static List<C49423fh2> f108044f = new CopyOnWriteArrayList();

    /* renamed from: g */
    public static Boolean f108045g = Boolean.FALSE;

    /* renamed from: h */
    public static C92411b.C92412a f108046h = new C40191a();

    /* renamed from: i */
    public static MTimerHandler f108047i = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C40192b(), true);

    /* renamed from: j */
    public static IListener f108048j = new IListener<ExDeviceIBeaconRangingResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1172394697;
        }

        public boolean callback(IEvent iEvent) {
            ExDeviceIBeaconRangingResultEvent exDeviceIBeaconRangingResultEvent = (ExDeviceIBeaconRangingResultEvent) iEvent;
            if (exDeviceIBeaconRangingResultEvent != null) {
                ExDeviceIBeaconRangingResultEvent.C40071a aVar = exDeviceIBeaconRangingResultEvent.f107454d;
                String str = aVar.f107455a;
                int i = aVar.f107456b;
                int i2 = aVar.f107457c;
                Map<String, C49423fh2> map = PostTaskStartRangeForIBeacon.f108043e;
                if (!((ConcurrentHashMap) map).containsKey(str + "," + i + "," + i2)) {
                    C49423fh2 fh22 = new C49423fh2();
                    fh22.f133496d = str;
                    fh22.f133497e = i;
                    fh22.f133498f = 65535 & i2;
                    fh22.f133499g = exDeviceIBeaconRangingResultEvent.f107454d.f107458d;
                    Map<String, C49423fh2> map2 = PostTaskStartRangeForIBeacon.f108043e;
                    ((ConcurrentHashMap) map2).put(str + "," + i + "," + i2, fh22);
                    if (exDeviceIBeaconRangingResultEvent.f107454d.f107458d >= 0.0d && ((CopyOnWriteArrayList) PostTaskStartRangeForIBeacon.f108044f).size() >= 1) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= ((CopyOnWriteArrayList) PostTaskStartRangeForIBeacon.f108044f).size()) {
                                break;
                            }
                            C49423fh2 fh23 = (C49423fh2) ((CopyOnWriteArrayList) PostTaskStartRangeForIBeacon.f108044f).get(i3);
                            if (exDeviceIBeaconRangingResultEvent.f107454d.f107458d >= fh23.f133499g) {
                                if (i3 == ((CopyOnWriteArrayList) PostTaskStartRangeForIBeacon.f108044f).size() - 1 && exDeviceIBeaconRangingResultEvent.f107454d.f107458d > fh23.f133499g) {
                                    ((CopyOnWriteArrayList) PostTaskStartRangeForIBeacon.f108044f).add(fh22);
                                    break;
                                }
                                i3++;
                            } else {
                                ((CopyOnWriteArrayList) PostTaskStartRangeForIBeacon.f108044f).add(i3, fh22);
                                break;
                            }
                        }
                    } else {
                        ((CopyOnWriteArrayList) PostTaskStartRangeForIBeacon.f108044f).add(fh22);
                    }
                }
                Log.m105925i("MicroMsg.PostTaskStartRangeForIBeacon", "[shakezb]result iBeacon = %s,beaconMap.size:%d", str + "," + i + "," + i2, Integer.valueOf(((ConcurrentHashMap) PostTaskStartRangeForIBeacon.f108043e).size()));
            }
            return false;
        }
    };

    /* renamed from: com.tencent.mm.booter.PostTaskStartRangeForIBeacon$a */
    public class C40191a implements C92411b.C92412a {
        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            if (z) {
                Log.m105918d("MicroMsg.PostTaskStartRangeForIBeacon", "on location get ok");
                PostTaskStartRangeForIBeacon.f108040b = f2;
                PostTaskStartRangeForIBeacon.f108041c = f;
                PostTaskStartRangeForIBeacon.f108042d = true;
                C92411b bVar = PostTaskStartRangeForIBeacon.f108039a;
                if (bVar != null) {
                    bVar.mo126408b(PostTaskStartRangeForIBeacon.f108046h);
                    PostTaskStartRangeForIBeacon.f108042d = false;
                }
            } else {
                Log.m105928w("MicroMsg.PostTaskStartRangeForIBeacon", "getLocation fail");
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.booter.PostTaskStartRangeForIBeacon$b */
    public class C40192b implements MTimerHandler.CallBack {

        /* renamed from: com.tencent.mm.booter.PostTaskStartRangeForIBeacon$b$a */
        public class C40193a implements C11385n {

            /* renamed from: d */
            public final /* synthetic */ C47456m f108049d;

            public C40193a(C40192b bVar, C47456m mVar) {
                this.f108049d = mVar;
            }

            public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_IBEACON_PUSH_BEACONINFO_STRING;
                if (i == 0 && i2 == 0) {
                    C51453tv1 tv12 = (C51453tv1) this.f108049d.f127284e.f127056b.f127083a;
                    if (tv12.f142441g == 0) {
                        C49846ih2 ih22 = tv12.f142438d;
                        C49423fh2 fh22 = tv12.f142440f;
                        String str2 = ih22.f135344d + "," + ih22.f135345e + "," + ih22.f135346f + "," + ih22.f135347g + "," + fh22.f133496d + "," + fh22.f133497e + "," + fh22.f133498f;
                        String[] split = Util.nullAs((String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IBEACON_PUSH_LAST_BEACONINFO_STRING, (Object) null), "").split(",");
                        Boolean bool = Boolean.FALSE;
                        for (String equals : split) {
                            if (equals.equals(fh22.f133496d + fh22.f133497e + fh22.f133498f)) {
                                bool = Boolean.TRUE;
                            }
                        }
                        if (!bool.booleanValue()) {
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.mo160131h(12653, 1, 1);
                            nVar.mo160131h(12653, 2, 1);
                            C97625j3.m125812b().mo105906u().mo119677K(aVar, str2);
                        } else {
                            C97625j3.m125812b().mo105906u().mo119677K(aVar, "");
                        }
                    } else {
                        C97625j3.m125812b().mo105906u().mo119677K(aVar, "");
                    }
                } else {
                    C97625j3.m125812b().mo105906u().mo119677K(aVar, "");
                }
                C97625j3.m125812b().getClass();
                C86709a0.m107528h();
                C86709a0.m107523b().mo121122w();
                new ExDeviceIBeaconPushRefreshUIEvent().publish();
                PostTaskStartRangeForIBeacon.f108045g = Boolean.FALSE;
                C97625j3.m125815e().mo123470p(1708, this);
            }
        }

        public boolean onTimerExpired() {
            try {
                Boolean valueOf = Boolean.valueOf(Util.nullAs((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IBEACON_PUSH_IS_IN_SHAKEUI_BOOLEAN, (Object) null), false));
                List<String> d = ((C10485b) C86709a0.m107533q(C10485b.class)).g50().mo72511d();
                if (d != null) {
                    for (String next : d) {
                        Log.m105925i("MicroMsg.PostTaskStartRangeForIBeacon", "op=false,isInShakeUI:" + valueOf + ",iBeacon = %s", next);
                        ExDeviceIBeaconRangingEvent exDeviceIBeaconRangingEvent = new ExDeviceIBeaconRangingEvent();
                        ExDeviceIBeaconRangingEvent.C40069a aVar = exDeviceIBeaconRangingEvent.f107450d;
                        aVar.f107452a = next;
                        aVar.f107453b = false;
                        if (!valueOf.booleanValue()) {
                            exDeviceIBeaconRangingEvent.publish();
                        }
                    }
                    C49561gh2 gh22 = new C49561gh2();
                    gh22.f134050d = (double) PostTaskStartRangeForIBeacon.f108040b;
                    gh22.f134051e = (double) PostTaskStartRangeForIBeacon.f108041c;
                    long nullAs = Util.nullAs((Long) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IBEACON_PUSH_SHOP_ID_LONG, (Object) null), 0);
                    if (((ConcurrentHashMap) PostTaskStartRangeForIBeacon.f108043e).size() <= 0 || PostTaskStartRangeForIBeacon.f108045g.booleanValue() || ((CopyOnWriteArrayList) PostTaskStartRangeForIBeacon.f108044f).size() <= 0) {
                        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IBEACON_PUSH_BEACONINFO_STRING, "");
                    } else {
                        PostTaskStartRangeForIBeacon.f108045g = Boolean.TRUE;
                        C47456m mVar = new C47456m(PostTaskStartRangeForIBeacon.f108044f, nullAs, gh22);
                        Log.m105918d("MicroMsg.PostTaskStartRangeForIBeacon", "[shakezb]PostTaskStartRangeForIBeacon[kevinkma] shopId " + nullAs + ",beaconInfos size " + ((CopyOnWriteArrayList) PostTaskStartRangeForIBeacon.f108044f).size() + ",info:" + PostTaskStartRangeForIBeacon.f108044f.toString());
                        C97625j3.m125815e().mo123455a(1708, new C40193a(this, mVar));
                        C97625j3.m125815e().mo123460f(mVar);
                    }
                    ((ConcurrentHashMap) PostTaskStartRangeForIBeacon.f108043e).clear();
                    ((CopyOnWriteArrayList) PostTaskStartRangeForIBeacon.f108044f).clear();
                    PostTaskStartRangeForIBeacon.f108048j.dead();
                }
                return false;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.PostTaskStartRangeForIBeacon", e.getMessage());
                return false;
            }
        }
    }

    /* renamed from: a */
    public static void m43223a() {
        C92411b bVar;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_IBEACON_PUSH_BEACONINFO_STRING;
        if (C97625j3.m125811a() && !C86718e.m107551r()) {
            C85801v1 u = C97625j3.m125812b().mo105906u();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_IBEACON_PUSH_IS_OPEN_BOOLEAN;
            Boolean valueOf = Boolean.valueOf(Util.nullAs((Boolean) u.mo119685f(aVar2, (Object) null), false));
            Log.m105924i("MicroMsg.PostTaskStartRangeForIBeacon", "the range road status is " + valueOf);
            if (valueOf.booleanValue()) {
                if (Util.nowSecond() - Util.nullAs((Long) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IBEACON_PUSH_OPEN_TIEMSTAMP_LONG, (Object) null), 0) > Util.nullAs((Long) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IBEACON_PUSH_CHANNEL_OPEN_TIME_LONG, (Object) null), 0)) {
                    C97625j3.m125812b().mo105906u().mo119677K(aVar2, Boolean.FALSE);
                    C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IBEACON_PUSH_LAST_BEACONINFO_STRING, "");
                    C97625j3.m125812b().mo105906u().mo119677K(aVar, "");
                    C97625j3.m125812b().getClass();
                    C86709a0.m107528h();
                    C86709a0.m107523b().mo121122w();
                    return;
                }
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter == null || defaultAdapter.getState() != 12) {
                    C97625j3.m125812b().mo105906u().mo119677K(aVar, "");
                    return;
                }
                List<String> d = ((C10485b) C86709a0.m107533q(C10485b.class)).g50().mo72511d();
                if (d != null) {
                    for (String next : d) {
                        Log.m105925i("MicroMsg.PostTaskStartRangeForIBeacon", "op=true,iBeacon = %s", next);
                        ExDeviceIBeaconRangingEvent exDeviceIBeaconRangingEvent = new ExDeviceIBeaconRangingEvent();
                        ExDeviceIBeaconRangingEvent.C40069a aVar3 = exDeviceIBeaconRangingEvent.f107450d;
                        aVar3.f107452a = next;
                        aVar3.f107453b = true;
                        exDeviceIBeaconRangingEvent.publish();
                    }
                    f108039a = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
                    if (f108047i.stopped()) {
                        f108047i.startTimer(3000);
                    }
                    if (!f108042d && (bVar = f108039a) != null) {
                        bVar.mo126409c(f108046h, true, false);
                    }
                    f108048j.alive();
                }
            }
        }
    }
}
