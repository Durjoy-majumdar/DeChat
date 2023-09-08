package com.tencent.p014mm.plugin.ipcall.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.ArrayList;
import java.util.Map;
import s12.C110715e;
import s12.C110716f;

/* renamed from: com.tencent.mm.plugin.ipcall.model.IPCallFeedbackConfigUpdater */
public class IPCallFeedbackConfigUpdater {

    /* renamed from: c */
    public static IPCallFeedbackConfigUpdater f313240c;

    /* renamed from: a */
    public ArrayList<C110716f> f313241a = null;

    /* renamed from: b */
    public IListener f313242b = new IListener<CheckResUpdateCacheFileEvent>(C40008f.f107254d) {
        {
            this.__eventId = 905296653;
        }

        public boolean callback(IEvent iEvent) {
            CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
            if (checkResUpdateCacheFileEvent.f78743d.f78744a == 39) {
                Log.m105924i("MicroMsg.IPCallFeedbackConfigUpdater", "checkResUpdateListener callback");
                byte[] O = C86013q1.m106433O(checkResUpdateCacheFileEvent.f78743d.f78746c, 0, -1);
                if (O != null) {
                    IPCallFeedbackConfigUpdater.this.mo150082a(O);
                } else {
                    Log.m105920e("MicroMsg.IPCallFeedbackConfigUpdater", "checkResUpdateListener file not exist");
                }
            }
            return false;
        }
    };

    /* renamed from: a */
    public boolean mo150082a(byte[] bArr) {
        try {
            try {
                Map<String, String> parseXml = XmlParser.parseXml(new String(bArr), "feedbackconfig", (String) null);
                if (parseXml != null) {
                    ArrayList<C110716f> arrayList = new ArrayList<>();
                    int i = 0;
                    while (true) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(".feedbackconfig.resourceslist.resources");
                        sb.append(i == 0 ? "" : Integer.valueOf(i));
                        String sb4 = sb.toString();
                        String str = parseXml.get(sb4 + ".$langid");
                        if (str == null) {
                            Log.m105925i("MicroMsg.IPCallFeedbackConfigUpdater", "feedbackResource parse finished count:%d", Integer.valueOf(arrayList.size()));
                            this.f313241a = arrayList;
                            return true;
                        }
                        i++;
                        C110716f fVar = new C110716f();
                        fVar.f331176a = str;
                        fVar.f331177b = new ArrayList<>();
                        String str2 = sb4 + ".string";
                        int i2 = 0;
                        while (true) {
                            C110715e eVar = new C110715e();
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str2);
                            sb5.append(i2 == 0 ? "" : Integer.valueOf(i2));
                            String sb6 = sb5.toString();
                            String str3 = parseXml.get(sb6);
                            if (str3 == null) {
                                break;
                            }
                            String str4 = parseXml.get(sb6 + ".$id");
                            if (str4 == null) {
                                break;
                            }
                            i2++;
                            eVar.f331174a = str4;
                            eVar.f331175b = str3;
                            fVar.f331177b.add(eVar);
                        }
                        Log.m105919d("MicroMsg.IPCallFeedbackConfigUpdater", "feedbackResource parse id:%s,wording count:%d", fVar.f331176a, Integer.valueOf(fVar.f331177b.size()));
                        arrayList.add(fVar);
                    }
                } else {
                    Log.m105920e("MicroMsg.IPCallFeedbackConfigUpdater", "parse xml feedbackconfig error");
                    return false;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.IPCallFeedbackConfigUpdater", e, "", new Object[0]);
                Log.m105921e("MicroMsg.IPCallFeedbackConfigUpdater", "parse ipcall feedback config error: %s", e.getMessage());
                return false;
            }
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.IPCallFeedbackConfigUpdater", e2, "", new Object[0]);
            Log.m105921e("MicroMsg.IPCallFeedbackConfigUpdater", "parse ipcall feedback config new string error: %s", e2.getMessage());
            return false;
        }
    }
}
