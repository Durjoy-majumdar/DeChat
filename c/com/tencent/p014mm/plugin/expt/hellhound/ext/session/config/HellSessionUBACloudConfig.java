package com.tencent.p014mm.plugin.expt.hellhound.ext.session.config;

import ba1.C113155g;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SessionUBAConfigChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C118438ja3;
import te3.C64220a24;
import te3.C64250b24;

/* renamed from: com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionUBACloudConfig */
public final class HellSessionUBACloudConfig {

    /* renamed from: b */
    public static HellSessionUBACloudConfig f345919b;

    /* renamed from: a */
    public final IListener f345920a = new IListener<SessionUBAConfigChangeEvent>(C40008f.f107254d) {
        {
            this.__eventId = -2095890790;
        }

        public boolean callback(IEvent iEvent) {
            int length;
            JSONArray jSONArray;
            int length2;
            JSONArray jSONArray2;
            SessionUBAConfigChangeEvent sessionUBAConfigChangeEvent = (SessionUBAConfigChangeEvent) iEvent;
            boolean z = false;
            if (sessionUBAConfigChangeEvent != null) {
                SessionUBAConfigChangeEvent.C114693a aVar = sessionUBAConfigChangeEvent.f343615d;
                Log.m105925i("HABBYGE-MALI.HellSessionUBACloudConfig", "mSessionUBAListener: %b, %s", aVar.f343617b, aVar.f343616a);
                if (sessionUBAConfigChangeEvent.f343615d.f343617b.booleanValue()) {
                    C64220a24 a = C113155g.m154832a();
                    if (a == null) {
                        a = new C64220a24();
                    }
                    a.f182010d = true;
                    try {
                        C116850b.m164834d("mkv_k_hellsubascld", a.toByteArray());
                    } catch (Exception e) {
                        Log.printErrStackTrace("HABBYGE-MALI.HellSessionUBACloudConfigDao", e, "HellSessionUBACloudConfigDao writeBack", new Object[0]);
                    }
                } else {
                    C64220a24 a242 = new C64220a24();
                    a242.f182010d = false;
                    String str = sessionUBAConfigChangeEvent.f343615d.f343616a;
                    if (str != null && !str.isEmpty()) {
                        HellSessionUBACloudConfig hellSessionUBACloudConfig = HellSessionUBACloudConfig.this;
                        String str2 = sessionUBAConfigChangeEvent.f343615d.f343616a;
                        hellSessionUBACloudConfig.getClass();
                        ArrayList arrayList = null;
                        try {
                            JSONArray optJSONArray = new JSONObject(str2).optJSONArray("sessionUBAConfigs");
                            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                                arrayList = new ArrayList();
                                int i = 0;
                                while (i < length) {
                                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                                    if (optJSONObject == null) {
                                        jSONArray = optJSONArray;
                                    } else {
                                        C64250b24 b242 = new C64250b24();
                                        b242.f182207d = optJSONObject.optString("pageName");
                                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("businessParams");
                                        if (optJSONArray2 != null && (length2 = optJSONArray2.length()) > 0) {
                                            int i2 = 0;
                                            while (i2 < length2) {
                                                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                                                if (optJSONObject2 == null) {
                                                    jSONArray2 = optJSONArray;
                                                } else {
                                                    C118438ja3 ja32 = new C118438ja3();
                                                    jSONArray2 = optJSONArray;
                                                    ja32.f354059d = optJSONObject2.optString("className");
                                                    ja32.f354060e = optJSONObject2.optString("dataPath");
                                                    ja32.f354061f = optJSONObject2.optString("action");
                                                    b242.f182208e.add(ja32);
                                                }
                                                i2++;
                                                optJSONArray = jSONArray2;
                                            }
                                        }
                                        jSONArray = optJSONArray;
                                        arrayList.add(b242);
                                    }
                                    i++;
                                    optJSONArray = jSONArray;
                                }
                            }
                        } catch (JSONException e2) {
                            Log.printErrStackTrace("HABBYGE-MALI.HellSessionUBACloudConfig", e2, "HellSessionUBACloudConfig parse crash", new Object[0]);
                        }
                        if (arrayList != null && !arrayList.isEmpty()) {
                            a242.f182011e.addAll(arrayList);
                        }
                    }
                    try {
                        C116850b.m164834d("mkv_k_hellsubascld", a242.toByteArray());
                        z = false;
                    } catch (Exception e3) {
                        z = false;
                        Log.printErrStackTrace("HABBYGE-MALI.HellSessionUBACloudConfigDao", e3, "HellSessionUBACloudConfigDao writeBack", new Object[0]);
                    }
                    Log.m105924i("HABBYGE-MALI.HellSessionUBACloudConfig", "mSessionUBAListener callback: END");
                    return z;
                }
            }
            return z;
        }
    };

    /* renamed from: a */
    public static HellSessionUBACloudConfig m162216a() {
        if (f345919b == null) {
            synchronized (HellSessionUBACloudConfig.class) {
                if (f345919b == null) {
                    f345919b = new HellSessionUBACloudConfig();
                }
            }
        }
        return f345919b;
    }
}
