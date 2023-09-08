package f02;

import android.os.Looper;
import android.os.Message;
import com.tencent.p014mm.modelsimple.C40359h0;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d02.C31041c;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import g02.C98064a;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p156gj.C87203t;
import pe3.C47465a;
import sx3.C110818d0;
import te3.eb4;
import te3.fb4;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: f02.q */
public final class C31867q implements C11385n {

    /* renamed from: d */
    public boolean f84915d;

    /* renamed from: e */
    public final ConcurrentLinkedQueue<String> f84916e = new ConcurrentLinkedQueue<>();

    /* renamed from: f */
    public boolean f84917f = true;

    /* renamed from: g */
    public String f84918g = "4G";

    /* renamed from: h */
    public int f84919h;

    /* renamed from: i */
    public final int f84920i = 3;

    /* renamed from: j */
    public final Map<String, HandOff> f84921j = new LinkedHashMap();

    /* renamed from: n */
    public final Map<String, HandOff> f84922n = new LinkedHashMap();

    /* renamed from: o */
    public final Map<String, HandOff> f84923o = new LinkedHashMap();

    /* renamed from: p */
    public final Map<String, Boolean> f84924p = new LinkedHashMap();

    /* renamed from: q */
    public final Map<String, String> f84925q = new LinkedHashMap();

    /* renamed from: r */
    public Collection<? extends HandOff> f84926r;

    /* renamed from: s */
    public long f84927s;

    /* renamed from: t */
    public long f84928t;

    /* renamed from: u */
    public final C31868a f84929u;

    /* renamed from: f02.q$a */
    public static final class C31868a extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ C31867q f84930a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31868a(Looper looper, C31867q qVar) {
            super(looper);
            this.f84930a = qVar;
        }

        public void handleMessage(Message message) {
            String str;
            Message message2 = message;
            C87412m.m108594g(message2, "msg");
            int i = message2.what;
            if (i == 1) {
                Log.m105924i("HandOff.StatusManager", "handle commit message");
                C31867q qVar = this.f84930a;
                qVar.getClass();
                try {
                    String i2 = C87203t.m108273i();
                    String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
                    int a = C98064a.m126668a();
                    Collection<? extends HandOff> collection = qVar.f84926r;
                    qVar.f84926r = null;
                    if (collection != null) {
                        C31041c cVar = r8;
                        str = "deviceId";
                        C31041c cVar2 = new C31041c(4, collection, 0, 4, (C8480h) null);
                        C87412m.m108593f(i2, str);
                        C87412m.m108593f(formatedNetType, "networkStatus");
                        String a2 = cVar.mo57941a(i2, formatedNetType, a);
                        if (a2.length() > 0) {
                            qVar.f84916e.add(a2);
                            qVar.mo58395f();
                        }
                    } else {
                        str = "deviceId";
                    }
                    String str2 = "";
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : ((LinkedHashMap) qVar.f84924p).entrySet()) {
                        String str3 = (String) entry.getKey();
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            if (qVar.f84921j.containsKey(str3)) {
                                Object obj = ((LinkedHashMap) qVar.f84921j).get(str3);
                                C87412m.m108591d(obj);
                                Object obj2 = ((LinkedHashMap) qVar.f84925q).get(str3);
                                C87412m.m108591d(obj2);
                                ((HandOff) obj).setId((String) obj2);
                                arrayList2.add(obj);
                            } else if (qVar.f84922n.containsKey(str3)) {
                                Object obj3 = ((LinkedHashMap) qVar.f84922n).get(str3);
                                C87412m.m108591d(obj3);
                                Object obj4 = ((LinkedHashMap) qVar.f84925q).get(str3);
                                C87412m.m108591d(obj4);
                                ((HandOff) obj3).setId((String) obj4);
                                arrayList2.add(obj3);
                            } else if (qVar.f84923o.containsKey(str3)) {
                                Object obj5 = ((LinkedHashMap) qVar.f84923o).get(str3);
                                C87412m.m108591d(obj5);
                                Object obj6 = ((LinkedHashMap) qVar.f84925q).get(str3);
                                C87412m.m108591d(obj6);
                                ((HandOff) obj5).setId((String) obj6);
                                arrayList3.add(obj5);
                            }
                        } else if (qVar.f84921j.containsKey(str3)) {
                            Object obj7 = ((LinkedHashMap) qVar.f84921j).get(str3);
                            C87412m.m108591d(obj7);
                            arrayList.add(obj7);
                        } else if (qVar.f84922n.containsKey(str3)) {
                            Object obj8 = ((LinkedHashMap) qVar.f84922n).get(str3);
                            C87412m.m108591d(obj8);
                            arrayList.add(obj8);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        C31041c cVar3 = new C31041c(2, arrayList3, 0, 4, (C8480h) null);
                        C87412m.m108593f(i2, str);
                        C87412m.m108593f(formatedNetType, "networkStatus");
                        sb.append(cVar3.mo57941a(i2, formatedNetType, a));
                        str2 = sb.toString();
                    }
                    if (!arrayList2.isEmpty()) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str2);
                        C31041c cVar4 = new C31041c(3, arrayList2, 0, 4, (C8480h) null);
                        C87412m.m108593f(i2, str);
                        C87412m.m108593f(formatedNetType, "networkStatus");
                        sb4.append(cVar4.mo57941a(i2, formatedNetType, a));
                        str2 = sb4.toString();
                    }
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str2);
                        C31041c cVar5 = new C31041c(1, arrayList, 0, 4, (C8480h) null);
                        C87412m.m108593f(i2, str);
                        C87412m.m108593f(formatedNetType, "networkStatus");
                        sb5.append(cVar5.mo57941a(i2, formatedNetType, a));
                        str2 = sb5.toString();
                    }
                    if (str2.length() > 0) {
                        qVar.f84916e.add(str2);
                        qVar.mo58395f();
                    }
                    qVar.mo58392c();
                } catch (Exception e) {
                    Log.m105921e("HandOff.StatusManager", "commit fail:", e);
                }
            } else if (i == 2) {
                Log.m105924i("HandOff.StatusManager", "handle retry message");
                this.f84930a.mo58396g();
            }
        }
    }

    public C31867q(Looper looper) {
        C87412m.m108594g(looper, "looper");
        this.f84929u = new C31868a(looper, this);
    }

    /* renamed from: a */
    public final void mo58390a() {
        if (!this.f84929u.hasMessages(1)) {
            Log.m105918d("HandOff.StatusManager", "plan commit task");
            this.f84929u.sendEmptyMessageDelayed(1, 3000);
        }
    }

    /* renamed from: b */
    public final void mo58391b() {
        if (this.f84916e.isEmpty()) {
            Log.m105924i("HandOff.StatusManager", "message queue is empty, set queueWorking = false");
            this.f84915d = false;
            return;
        }
        try {
            String str = (String) C110818d0.m150913K(this.f84916e);
            C87412m.m108593f(str, "msg");
            mo58398i(str);
        } catch (Exception e) {
            Log.printErrStackTrace("HandOff.StatusManager", e, "", new Object[0]);
            this.f84915d = false;
        }
    }

    /* renamed from: c */
    public final void mo58392c() {
        ((LinkedHashMap) this.f84921j).clear();
        ((LinkedHashMap) this.f84922n).clear();
        ((LinkedHashMap) this.f84923o).clear();
        ((LinkedHashMap) this.f84924p).clear();
        ((LinkedHashMap) this.f84925q).clear();
    }

    /* renamed from: d */
    public final void mo58393d(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        Log.m105924i("HandOff.StatusManager", "del " + handOff.getId());
        if (!this.f84924p.containsKey(handOff.getKey())) {
            this.f84924p.put(handOff.getKey(), Boolean.TRUE);
            this.f84925q.put(handOff.getKey(), handOff.getId());
        }
        this.f84921j.remove(handOff.getKey());
        this.f84922n.remove(handOff.getKey());
        this.f84923o.put(handOff.getKey(), handOff);
        mo58390a();
    }

    /* renamed from: e */
    public final void mo58394e(Collection<? extends HandOff> collection) {
        C87412m.m108594g(collection, "handOffList");
        try {
            String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
            C87412m.m108593f(formatedNetType, "getFormatedNetType(getContext())");
            this.f84918g = formatedNetType;
            this.f84927s = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_HANDOFF_SEQ_LONG_SYNC, 0);
        } catch (Exception e) {
            Log.printErrStackTrace("HandOff.StatusManager", e, "restoreFromBallInfoList fail, exp:%s", e);
            this.f84927s = 0;
        }
        C86709a0.m107529k().f251779b.mo123470p(251, this);
        C86709a0.m107529k().f251779b.mo123455a(251, this);
        C31790e.f84852d.m50();
    }

    /* renamed from: f */
    public final void mo58395f() {
        if (!this.f84915d) {
            Log.m105924i("HandOff.StatusManager", "launch queue, set queueWorking = true");
            this.f84915d = true;
            mo58391b();
        }
    }

    /* renamed from: g */
    public final void mo58396g() {
        boolean z = true;
        int i = this.f84919h + 1;
        this.f84919h = i;
        if (i >= this.f84920i) {
            this.f84916e.poll();
            this.f84919h = 0;
        }
        Log.m105924i("HandOff.StatusManager", "send handoff failed, retry: " + this.f84919h);
        int m = C86709a0.m107524d().mo123467m();
        if (!(m == 4 || m == 6)) {
            z = false;
        }
        if (!z) {
            Log.m105924i("HandOff.StatusManager", "network unavailable, clear message queue and retry after 30s");
            this.f84916e.clear();
            this.f84929u.sendEmptyMessageDelayed(2, 30000);
        } else {
            if (!this.f84917f) {
                Log.m105924i("HandOff.StatusManager", "network become available, send all list");
                String formatedNetType = NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext());
                C87412m.m108593f(formatedNetType, "getFormatedNetType(getContext())");
                this.f84918g = formatedNetType;
                C31790e.f84852d.m50();
            }
            mo58391b();
        }
        this.f84917f = z;
    }

    /* renamed from: h */
    public final void mo58397h(int i, Collection<? extends HandOff> collection) {
        C31041c cVar = new C31041c(i, collection, 0, 4, (C8480h) null);
        String i2 = C87203t.m108273i();
        C87412m.m108593f(i2, "getMMDeviceId()");
        this.f84916e.add(cVar.mo57941a(i2, this.f84918g, C98064a.m126668a()));
        mo58395f();
    }

    /* renamed from: i */
    public final void mo58398i(String str) {
        Class cls = C32735h.class;
        if (!C75592q0.m90795y()) {
            boolean z = false;
            if (!WeChatEnvironment.hasDebugger()) {
                C32735h.C32737c cVar = C32735h.C32737c.clicfg_handoff_enable;
                if (!((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, false)) {
                    Log.m105924i("HandOff.StatusManager", "debugger: " + WeChatEnvironment.hasDebugger() + ", handoff enabled: " + ((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, false) + ", don't send handoff: " + str);
                    this.f84916e.poll();
                    mo58391b();
                    return;
                }
            }
            this.f84928t = this.f84927s;
            while (C112550d0.m153803w(str, "<![CSEQ]>", false, 2, (Object) null)) {
                str = C112551y.m153817q(str, "<![CSEQ]>", String.valueOf(this.f84928t), false);
                if (this.f84928t == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                    this.f84928t = 0;
                }
                this.f84928t++;
            }
            Log.m105924i("HandOff.StatusManager", "send handoff: " + str);
            HashSet<Long> hashSet = C40359h0.f108457g;
            if (!C86709a0.m107523b().mo121114l()) {
                Log.m105920e("MicroMsg.NetSceneStatusNotify", "sendHandOffSyncCmd fail due to account has not initialized");
            } else if (!Util.isNullOrNil(str)) {
                if (C40359h0.m43528j1()) {
                    C86709a0.m107529k().f251779b.mo123460f(new C40359h0(C75592q0.m90789s(), 11, "HandOffMaster", str));
                }
                z = true;
            }
            if (!z) {
                mo58396g();
                return;
            }
            return;
        }
        Log.m105924i("HandOff.StatusManager", "device is ex device, don't send handoff: " + str);
        this.f84916e.poll();
        mo58391b();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (yVar.getReqResp() instanceof C47350c) {
            C114799u reqResp = yVar.getReqResp();
            C87412m.m108592e(reqResp, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
            if (((C47350c) reqResp).f127055a.f127080a instanceof fb4) {
                C114799u reqResp2 = yVar.getReqResp();
                C87412m.m108592e(reqResp2, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
                C47465a aVar = ((C47350c) reqResp2).f127055a.f127080a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StatusNotifyRequest");
                eb4 eb4 = ((fb4) aVar).f133404j;
                if (eb4 != null && C87412m.m108589b(eb4.f132839d, "HandOffMaster")) {
                    if (i == 0 && i2 == 0) {
                        this.f84916e.poll();
                        this.f84919h = 0;
                        this.f84927s = this.f84928t;
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_HANDOFF_SEQ_LONG_SYNC, Long.valueOf(this.f84927s));
                        Log.m105924i("HandOff.StatusManager", "send handoff succeed, check next message");
                        mo58391b();
                        return;
                    }
                    Log.m105920e("HandOff.StatusManager", "send handoff fail, errType:" + i + ", errCode:" + i2);
                    mo58396g();
                }
            }
        }
    }
}
