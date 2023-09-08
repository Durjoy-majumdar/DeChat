package com.tencent.p014mm.plugin.wear.model;

import android.os.Looper;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WearHardDeviceEvent;
import com.tencent.p014mm.pluginsdk.model.C44590b1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45628s0;
import eb0.C97625j3;
import fk0.C86908a;
import java.util.LinkedList;
import m73.C46949a;
import o73.C47336d;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C76708i;
import p248ug.C52558c;
import p910lj.C76701a;
import rb0.C47984k;
import rb0.C48009v0;
import te3.t05;

/* renamed from: com.tencent.mm.plugin.wear.model.WearBizLogic */
public class WearBizLogic implements C11385n {

    /* renamed from: d */
    public boolean f117426d;

    /* renamed from: e */
    public IListener f117427e = new IListener<WearHardDeviceEvent>(C40008f.f107254d) {
        {
            this.__eventId = -251498934;
        }

        public boolean callback(IEvent iEvent) {
            WearHardDeviceEvent wearHardDeviceEvent = (WearHardDeviceEvent) iEvent;
            if (wearHardDeviceEvent instanceof WearHardDeviceEvent) {
                WearHardDeviceEvent.C40185a aVar = wearHardDeviceEvent.f107826d;
                int i = aVar.f107827a;
                if (i == 2) {
                    Log.m105925i("MicroMsg.Wear.WearBizLogic", "receive register response, deviceId=%s | isSuccess=%b", aVar.f107829c, Boolean.valueOf(aVar.f107828b));
                    if (wearHardDeviceEvent.f107826d.f107828b) {
                        WearBizLogic.this.mo67616a();
                    }
                } else if (i == 5) {
                    Log.m105925i("MicroMsg.Wear.WearBizLogic", "receive send response, deviceId=%s | isSuccess=%b", aVar.f107829c, Boolean.valueOf(aVar.f107828b));
                } else if (i == 6) {
                    t05 t05 = C43457b.xx0().f347577c.f126742a;
                    if (t05 == null || !t05.f141886d.equals(wearHardDeviceEvent.f107826d.f107829c)) {
                        Log.m105924i("MicroMsg.Wear.WearBizLogic", "request is null or request.LocalNodeId is not same!");
                    } else {
                        Log.m105925i("MicroMsg.Wear.WearBizLogic", "request step count deviceId=%s", wearHardDeviceEvent.f107826d.f107829c);
                        WearBizLogic wearBizLogic = WearBizLogic.this;
                        boolean c = wearBizLogic.mo67618c(wearHardDeviceEvent.f107826d.f107829c);
                        boolean b = wearBizLogic.mo67617b();
                        if (!c || !wearBizLogic.f117426d || !b) {
                            Log.m105925i("MicroMsg.Wear.WearBizLogic", "isRegister=%b | isFocus=%b | isAuth=%b", Boolean.valueOf(c), Boolean.valueOf(b), Boolean.valueOf(wearBizLogic.f117426d));
                        } else {
                            C43457b.Ax0().mo67630a(new C43460d(wearBizLogic));
                        }
                    }
                } else if (i == 8) {
                    Log.m105925i("MicroMsg.Wear.WearBizLogic", "receive auth response, deviceId=%s | isSuccess=%b", aVar.f107829c, Boolean.valueOf(aVar.f107828b));
                    WearBizLogic wearBizLogic2 = WearBizLogic.this;
                    boolean z = wearHardDeviceEvent.f107826d.f107828b;
                    wearBizLogic2.f117426d = z;
                    if (z) {
                        wearBizLogic2.mo67616a();
                    }
                } else if (i == 9) {
                    WearBizLogic.this.mo67616a();
                }
            }
            return false;
        }
    };

    /* renamed from: f */
    public MStorageEx.IOnStorageChange f117428f = new C43437a();

    /* renamed from: g */
    public MTimerHandler f117429g = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C43438b(), true);

    /* renamed from: com.tencent.mm.plugin.wear.model.WearBizLogic$a */
    public class C43437a implements MStorageEx.IOnStorageChange {
        public C43437a() {
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            if (obj == null || !(obj instanceof String)) {
                Log.m105919d("MicroMsg.Wear.WearBizLogic", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            } else if (((String) obj).equals("gh_43f2581f6fd6")) {
                if (!WearBizLogic.this.mo67617b()) {
                    WearBizLogic wearBizLogic = WearBizLogic.this;
                    if (wearBizLogic.f117426d) {
                        wearBizLogic.f117426d = false;
                        return;
                    }
                }
                if (WearBizLogic.this.mo67617b()) {
                    WearBizLogic wearBizLogic2 = WearBizLogic.this;
                    if (!wearBizLogic2.f117426d) {
                        wearBizLogic2.mo67616a();
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wear.model.WearBizLogic$b */
    public class C43438b implements MTimerHandler.CallBack {
        public C43438b() {
        }

        public boolean onTimerExpired() {
            WearBizLogic.this.mo67619d(C43457b.xx0().f347577c.f126742a);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wear.model.WearBizLogic$c */
    public class C43439c extends C47336d {
        public C43439c(C434361 r2) {
        }

        /* renamed from: a */
        public void mo67620a() {
            C97625j3.m125815e().mo123455a(30, WearBizLogic.this);
            LinkedList linkedList = new LinkedList();
            linkedList.add("gh_43f2581f6fd6");
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(1);
            C97625j3.m125815e().mo123460f(new C44590b1(1, linkedList, linkedList2, "", ""));
        }

        /* renamed from: b */
        public String mo67621b() {
            return "AddContactTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.wear.model.WearBizLogic$d */
    public class C43440d extends C47336d {

        /* renamed from: d */
        public t05 f117434d;

        public C43440d(t05 t05) {
            this.f117434d = t05;
        }

        /* renamed from: a */
        public void mo67620a() {
            C97625j3.m125815e().mo123455a(C86908a.CTRL_INDEX, WearBizLogic.this);
            C97625j3.m125815e().mo123460f(new C46949a(this.f117434d.f141886d, "gh_43f2581f6fd6"));
        }

        /* renamed from: b */
        public String mo67621b() {
            return "RegisterDeviceTask";
        }
    }

    public WearBizLogic() {
        this.f117427e.alive();
        C97625j3.m125812b().mo105907v().add(this.f117428f);
    }

    /* renamed from: a */
    public void mo67616a() {
        t05 t05 = C43457b.xx0().f347577c.f126742a;
        if (t05 == null) {
            Log.m105920e("MicroMsg.Wear.WearBizLogic", "get connect wear data error");
        } else if (!mo67617b()) {
            boolean booleanValue = ((Boolean) C97625j3.m125812b().mo105906u().mo119684e(327825, Boolean.FALSE)).booleanValue();
            Log.m105925i("MicroMsg.Wear.WearBizLogic", "auto focus biz contact %b", Boolean.valueOf(booleanValue));
            if (booleanValue) {
                return;
            }
            if (Util.isOverseasUser(MMApplicationContext.getContext())) {
                Log.m105924i("MicroMsg.Wear.WearBizLogic", "oversea user, forbid biz auto focus logic");
                return;
            }
            C43457b.Ax0().mo67630a(new C43439c((C434361) null));
            C43457b.Ax0().mo67630a(new C43440d(t05));
        } else if (!mo67618c(t05.f141886d)) {
            Log.m105925i("MicroMsg.Wear.WearBizLogic", "start to register device %s", t05.f141886d);
            C43457b.Ax0().mo67630a(new C43440d(t05));
        } else if (!this.f117426d) {
            Log.m105925i("MicroMsg.Wear.WearBizLogic", "start to auth device %s", t05.f141886d);
            String str = t05.f141886d;
            if (!this.f117426d && mo67618c(str)) {
                Log.m105925i("MicroMsg.Wear.WearBizLogic", "auth device, deviceId=%s | deviceType=%s", str, "gh_43f2581f6fd6");
                WearHardDeviceEvent wearHardDeviceEvent = new WearHardDeviceEvent();
                WearHardDeviceEvent.C40185a aVar = wearHardDeviceEvent.f107826d;
                aVar.f107827a = 7;
                aVar.f107829c = str;
                aVar.f107830d = "gh_43f2581f6fd6";
                wearHardDeviceEvent.publish();
            }
        } else {
            if (this.f117429g.stopped()) {
                Log.m105924i("MicroMsg.Wear.WearBizLogic", "start step count timer");
                this.f117429g.startTimer(3600000);
            } else {
                Log.m105924i("MicroMsg.Wear.WearBizLogic", "stop timer and restart step count timer");
                this.f117429g.stopTimer();
                this.f117429g.startTimer(3600000);
            }
            mo67619d(t05);
        }
    }

    /* renamed from: b */
    public final boolean mo67617b() {
        return C97625j3.m125812b().mo105907v().get("gh_43f2581f6fd6").mo62927s3();
    }

    /* renamed from: c */
    public final boolean mo67618c(String str) {
        WearHardDeviceEvent wearHardDeviceEvent = new WearHardDeviceEvent();
        WearHardDeviceEvent.C40185a aVar = wearHardDeviceEvent.f107826d;
        aVar.f107827a = 3;
        aVar.f107829c = str;
        aVar.f107830d = "gh_43f2581f6fd6";
        wearHardDeviceEvent.publish();
        Log.m105925i("MicroMsg.Wear.WearBizLogic", "isRegister: %b", Boolean.valueOf(wearHardDeviceEvent.f107826d.f107828b));
        return wearHardDeviceEvent.f107826d.f107828b;
    }

    /* renamed from: d */
    public void mo67619d(t05 t05) {
        if (t05 != null) {
            WearHardDeviceEvent wearHardDeviceEvent = new WearHardDeviceEvent();
            WearHardDeviceEvent.C40185a aVar = wearHardDeviceEvent.f107826d;
            aVar.f107827a = 6;
            aVar.f107829c = t05.f141886d;
            wearHardDeviceEvent.publish();
            return;
        }
        Log.m105924i("MicroMsg.Wear.WearBizLogic", "request is null");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C46949a) {
            C97625j3.m125815e().mo123470p(C86908a.CTRL_INDEX, this);
            if (i == 0 && i2 == 0) {
                C46949a aVar = (C46949a) yVar;
                String str2 = aVar.f126233f;
                String str3 = aVar.f126234g;
                WearHardDeviceEvent wearHardDeviceEvent = new WearHardDeviceEvent();
                WearHardDeviceEvent.C40185a aVar2 = wearHardDeviceEvent.f107826d;
                aVar2.f107827a = 1;
                aVar2.f107829c = str2;
                aVar2.f107830d = str3;
                wearHardDeviceEvent.publish();
                return;
            }
            Log.m105921e("MicroMsg.Wear.WearBizLogic", "errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        } else if (yVar instanceof C44590b1) {
            C97625j3.m125815e().mo123470p(30, this);
            if (i == 0 && i2 == 0) {
                String T0 = ((C44590b1) yVar).mo56091T0();
                Log.m105925i("MicroMsg.Wear.WearBizLogic", "bind fitness contact %s success", T0);
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get("gh_43f2581f6fd6");
                if (z1Var == null || Util.isNullOrNil(T0)) {
                    Log.m105920e("MicroMsg.Wear.WearBizLogic", "respUsername == " + T0 + ", contact = " + z1Var);
                } else {
                    C52558c cVar = null;
                    if (C72996z1.m85796D5(z1Var.getUsername())) {
                        String nullAsNil = Util.nullAsNil(z1Var.getUsername());
                        C52558c b = C47984k.m53328b(nullAsNil);
                        if (b != null) {
                            b.field_username = T0;
                        }
                        C48009v0.Fx0().mo72764c(nullAsNil);
                        z1Var.mo62874S2(nullAsNil);
                        cVar = b;
                    }
                    z1Var.setUsername(T0);
                    if (((int) z1Var.f108320R1) == 0) {
                        C97625j3.m125812b().mo105907v().mo69707j3(z1Var);
                    }
                    if (((int) z1Var.f108320R1) <= 0) {
                        Log.m105920e("MicroMsg.Wear.WearBizLogic", "addContact : insert contact failed");
                    } else {
                        C45628s0.m50775g0(z1Var);
                        C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(z1Var.getUsername());
                        if (cVar != null) {
                            C48009v0.Fx0().insert(cVar);
                        } else {
                            Class cls = C76708i.class;
                            C52558c b2 = C47984k.m53328b(z1Var2.getUsername());
                            if (b2 == null || b2.mo72809G1()) {
                                Log.m105918d("MicroMsg.Wear.WearBizLogic", "shouldUpdate");
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls)).mo106823Jc(z1Var2.getUsername());
                            } else if (z1Var2.mo101231Y5()) {
                                Log.m105919d("MicroMsg.Wear.WearBizLogic", "update contact, last check time=%d", Integer.valueOf(z1Var2.f149509Q0));
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls)).mo106823Jc(z1Var2.getUsername());
                            }
                        }
                    }
                }
                C48009v0.Fx0().replace(C48009v0.Fx0().mo72757SE(z1Var.getUsername()));
                C97625j3.m125812b().mo105906u().mo119676J(327825, Boolean.TRUE);
                mo67616a();
                return;
            }
            Log.m105921e("MicroMsg.Wear.WearBizLogic", "errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 4 && i2 == -24 && !Util.isNullOrNil(str)) {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) str, 1).show();
            }
        }
    }
}
