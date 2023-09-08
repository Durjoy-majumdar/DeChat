package com.tencent.p014mm.plugin.appbrand.jsapi.nfc;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.JsApiAppBrandNFCBase;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.hce.HCEService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;
import wl0.C91028g;
import xl0.C91282c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE */
public class JsApiNFCStartHCE extends JsApiAppBrandNFCBase {
    public static final int CTRL_INDEX = 352;
    public static final String NAME = "startHCE";

    /* renamed from: h */
    public final Class<?> f242272h;

    /* renamed from: i */
    public Activity f242273i = null;

    /* renamed from: j */
    public Application.ActivityLifecycleCallbacks f242274j = null;

    /* renamed from: n */
    public C82381f f242275n = null;

    /* renamed from: o */
    public int f242276o = -1;

    /* renamed from: p */
    public JSONObject f242277p;

    /* renamed from: q */
    public int f242278q;

    /* renamed from: r */
    public long f242279r = -1;

    /* renamed from: s */
    public Future<?> f242280s;

    /* renamed from: t */
    public final Object f242281t = new Object();

    /* renamed from: u */
    public boolean f242282u = false;

    /* renamed from: v */
    public ResultReceiver f242283v = new ResultReceiver(MMHandler.createFreeHandler(Looper.getMainLooper())) {
        public void onReceiveResult(int i, Bundle bundle) {
            boolean z;
            boolean z2;
            Class<HCEEventLogic> cls = HCEEventLogic.class;
            Log.m105925i("MicroMsg.JsApiNFCStartHCE", "alvinluo mHCEServiceResultReceiver resultCode: %d", Integer.valueOf(i));
            if (bundle != null && i == 10002) {
                int i2 = bundle.getInt("key_event_type", -1);
                String string = bundle.getString("key_appid");
                int i3 = bundle.getInt("errCode", -1);
                String string2 = bundle.getString("errMsg");
                Log.m105925i("MicroMsg.JsApiNFCStartHCE", "alvinluo mHCEServiceResultReceiver onReceiveResult eventType: %d, appId: %s", Integer.valueOf(i2), string);
                if (i2 == 12) {
                    JsApiNFCStartHCE jsApiNFCStartHCE = JsApiNFCStartHCE.this;
                    synchronized (jsApiNFCStartHCE.f242281t) {
                        z = jsApiNFCStartHCE.f242282u;
                        if (!z) {
                            jsApiNFCStartHCE.f242282u = true;
                        }
                    }
                    if (z) {
                        Log.m105924i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE onStartHCEFinish has finished, return");
                        return;
                    }
                    String str = HCEEventLogic.f242261a;
                    synchronized (cls) {
                        z2 = HCEEventLogic.f242262b;
                    }
                    if (z2) {
                        Log.m105924i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE onStartHCEOvertime has stop, return");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    int currentTimeMillis = (int) (System.currentTimeMillis() - jsApiNFCStartHCE.f242279r);
                    if (jsApiNFCStartHCE.f242280s != null) {
                        Log.m105918d("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE timer cancel");
                        jsApiNFCStartHCE.f242280s.cancel(false);
                        jsApiNFCStartHCE.f242280s = null;
                    }
                    if (string == null || string.equals(jsApiNFCStartHCE.f242275n.getAppId())) {
                        Log.m105925i("MicroMsg.JsApiNFCStartHCE", "alvinluo HCE start HCEService callback onRefreshed errCode: %d, errMsg: %s", Integer.valueOf(i3), string2);
                        if (i3 == 0) {
                            String appId = jsApiNFCStartHCE.f242275n.getAppId();
                            String str2 = HCEEventLogic.f242261a;
                            if (!(str2 == null || HCEEventLogic.f242263c == null)) {
                                Log.m105925i("MicroMsg.HCEEventLogic", "alvinluo remove HCELifeCycleListener before add, appId: %s", str2);
                                C83231l.m102144e(HCEEventLogic.f242261a, HCEEventLogic.f242263c);
                            }
                            HCEEventLogic.f242261a = appId;
                            C83231l.m102140a(appId, HCEEventLogic.f242263c);
                            hashMap.put("errCode", Integer.valueOf(i3));
                            jsApiNFCStartHCE.mo115072x(C82863k.m101618a(jsApiNFCStartHCE, i3, "ok", hashMap));
                        } else {
                            hashMap.put("errCode", Integer.valueOf(i3));
                            jsApiNFCStartHCE.mo115072x(C82863k.m101618a(jsApiNFCStartHCE, i3, "fail: " + string2, hashMap));
                        }
                        C91282c.m114510a(jsApiNFCStartHCE.f242275n.getAppId(), i3, currentTimeMillis);
                        synchronized (cls) {
                            HCEEventLogic.f242262b = true;
                        }
                        return;
                    }
                    Log.m105921e("MicroMsg.JsApiNFCStartHCE", "alvinluo start HCESevice callback appId invalid, appId: %s", string);
                    hashMap.put("errCode", 13010);
                    C91282c.m114510a(jsApiNFCStartHCE.f242275n.getAppId(), 13010, currentTimeMillis);
                    jsApiNFCStartHCE.mo115072x(C82863k.m101618a(jsApiNFCStartHCE, 13010, "fail: unknown error", hashMap));
                } else if (i2 == 31 || i2 == 41) {
                    C82381f fVar = JsApiNFCStartHCE.this.f242275n;
                    C82851a aVar = C82851a.f242287i;
                    synchronized (C82851a.class) {
                        Log.m105925i("MicroMsg.EventOnHCEMessageReceived", "alvinluo EventOnHCEMessageReceived dispatch appId: %s, eventType: %d", fVar.getAppId(), Integer.valueOf(i2));
                        if (i2 == 31) {
                            String string3 = bundle.getString("key_apdu_command");
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("messageType", 1);
                            hashMap2.put("data", string3);
                            C82851a aVar2 = C82851a.f242287i;
                            aVar2.mo115161k(fVar);
                            aVar2.mo115165o(hashMap2);
                            aVar2.mo115158h();
                        } else if (i2 == 41) {
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("messageType", 2);
                            hashMap3.put(TPReportKeys.PlayerStep.PLAYER_REASON, Integer.valueOf(bundle.getInt("key_on_deactivated_reason")));
                            C82851a aVar3 = C82851a.f242287i;
                            aVar3.mo115161k(fVar);
                            aVar3.mo115165o(hashMap3);
                            aVar3.mo115158h();
                        }
                    }
                }
            }
        }
    };

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE$a */
    public class C82850a implements JsApiAppBrandNFCBase.C82847a {
        public C82850a() {
        }

        /* renamed from: a */
        public void mo115071a(int i, String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("errCode", Integer.valueOf(i));
            if (i == 0) {
                JsApiNFCStartHCE jsApiNFCStartHCE = JsApiNFCStartHCE.this;
                if (!(jsApiNFCStartHCE.f242275n.getContext() instanceof Activity)) {
                    jsApiNFCStartHCE.mo115072x(jsApiNFCStartHCE.mo115109j("fail: unknown error"));
                    return;
                }
                Activity activity = (Activity) jsApiNFCStartHCE.f242275n.getContext();
                jsApiNFCStartHCE.f242273i = activity;
                jsApiNFCStartHCE.f242274j = new C82857f(jsApiNFCStartHCE);
                activity.getApplication().registerActivityLifecycleCallbacks(jsApiNFCStartHCE.f242274j);
                C828483 r6 = new ResultReceiver(MMHandler.createFreeHandler(Looper.getMainLooper())) {
                    public void onReceiveResult(int i, Bundle bundle) {
                        Log.m105925i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCEUI ResultReceiver resultCode: %d", Integer.valueOf(i));
                        if (bundle != null && i == 10001) {
                            int i2 = bundle.getInt("errCode", -1);
                            String string = bundle.getString("errMsg");
                            JsApiNFCStartHCE jsApiNFCStartHCE = JsApiNFCStartHCE.this;
                            jsApiNFCStartHCE.getClass();
                            Log.m105925i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCEUI onResult errCode: %d, errMsg: %s", Integer.valueOf(i2), string);
                            HashMap hashMap = new HashMap();
                            hashMap.put("errCode", Integer.valueOf(i2));
                            if (i2 == 0) {
                                HashMap hashMap2 = new HashMap();
                                ArrayList arrayList = new ArrayList();
                                try {
                                    JSONArray jSONArray = jsApiNFCStartHCE.f242277p.getJSONArray("aid_list");
                                    int length = jSONArray.length();
                                    Log.m105925i("MicroMsg.JsApiNFCStartHCE", "alvinluo mData: %s, aidList: %s, length: %d", jsApiNFCStartHCE.f242277p.toString(), jSONArray.toString(), Integer.valueOf(length));
                                    for (int i3 = 0; i3 < length; i3++) {
                                        arrayList.add(jSONArray.get(i3).toString());
                                    }
                                    C83231l.m102140a(jsApiNFCStartHCE.f242275n.getAppId(), new C82858g(jsApiNFCStartHCE));
                                    Intent intent = new Intent(jsApiNFCStartHCE.f242273i, jsApiNFCStartHCE.f242272h);
                                    intent.putExtra("HCE_Result_Receiver", jsApiNFCStartHCE.f242283v);
                                    intent.putExtra("key_appid", jsApiNFCStartHCE.f242275n.getAppId());
                                    intent.putExtra("key_time_limit", jsApiNFCStartHCE.f242278q);
                                    intent.putStringArrayListExtra("key_aid_list", arrayList);
                                    String str = HCEEventLogic.f242261a;
                                    synchronized (HCEEventLogic.class) {
                                        HCEEventLogic.f242262b = false;
                                    }
                                    jsApiNFCStartHCE.f242273i.startService(intent);
                                    jsApiNFCStartHCE.f242279r = System.currentTimeMillis();
                                    jsApiNFCStartHCE.f242280s = ((C119157j) C119157j.f356862d).mo183878i(new C82859h(jsApiNFCStartHCE), 10000);
                                } catch (Exception unused) {
                                    hashMap2.put("errCode", 13003);
                                    jsApiNFCStartHCE.mo115072x(C82863k.m101618a(jsApiNFCStartHCE, 13003, "fail: aid_list invalid", hashMap2));
                                    C91282c.m114510a(jsApiNFCStartHCE.f242275n.getAppId(), 13003, -1);
                                }
                            } else {
                                C91282c.m114510a(jsApiNFCStartHCE.f242275n.getAppId(), i2, -1);
                                jsApiNFCStartHCE.mo115072x(C82863k.m101618a(jsApiNFCStartHCE, i2, "fail: " + string, hashMap));
                            }
                        }
                    }
                };
                C91028g gVar = C91028g.f261152l;
                Activity activity2 = jsApiNFCStartHCE.f242273i;
                gVar.getClass();
                Log.m105924i("MicroMsg.HCEActivityMgr", "alvinluo setHceActivity");
                if (activity2 == null) {
                    Log.m105920e("MicroMsg.HCEActivityMgr", "alvinluo setHceActivity hceActivity is null, or resultReceiver is null");
                }
                gVar.f261159g = activity2;
                gVar.f261160h = r6;
                C91028g gVar2 = C91028g.f261152l;
                gVar2.f261155c = false;
                gVar2.f261156d = false;
                gVar2.f261154b = false;
                ComponentName componentName = new ComponentName(jsApiNFCStartHCE.f242273i, HCEService.class.getCanonicalName());
                C91028g gVar3 = C91028g.f261152l;
                gVar3.getClass();
                Log.m105924i("MicroMsg.HCEActivityMgr", "alvinluo setPaymentServiceComponent");
                gVar3.f261158f = componentName;
                C91028g.f261152l.mo125076a();
                return;
            }
            C91282c.m114510a(JsApiNFCStartHCE.this.f242275n.getAppId(), i, -1);
            JsApiNFCStartHCE jsApiNFCStartHCE2 = JsApiNFCStartHCE.this;
            jsApiNFCStartHCE2.mo115072x(C82863k.m101618a(jsApiNFCStartHCE2, i, "fail: " + str, hashMap));
        }
    }

    public JsApiNFCStartHCE(Class<?> cls) {
        if (cls == null) {
            this.f242272h = HCEService.class;
        } else {
            this.f242272h = cls;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Log.m105925i("MicroMsg.JsApiNFCStartHCE", "alvinluo appbrand start HCE, data: %s", jSONObject.toString());
        this.f242275n = fVar;
        this.f242276o = i;
        this.f242277p = jSONObject;
        synchronized (this.f242281t) {
            this.f242282u = false;
        }
        this.f242278q = this.f242277p.optInt("time_limit", 1500);
        mo115068w(new C82850a(), false);
    }

    /* renamed from: x */
    public final void mo115072x(String str) {
        Log.m105925i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE callback result: %s", str);
        C82381f fVar = this.f242275n;
        if (fVar != null) {
            fVar.mo109647a(this.f242276o, str);
        }
        if (this.f242273i != null && this.f242274j != null) {
            Log.m105924i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE callback unregister lifecycle callback");
            this.f242273i.getApplication().unregisterActivityLifecycleCallbacks(this.f242274j);
        }
    }
}
