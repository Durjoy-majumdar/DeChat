package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

import android.app.Activity;
import android.text.TextUtils;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.OperateRecordEvent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener;
import com.tencent.p014mm.plugin.appbrand.media.record.C83626f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Vector;
import js0.C9514m;
import org.json.JSONException;
import org.json.JSONObject;
import p225rc.C89922k;
import qq0.C89790a;
import qq0.C89816t;
import wq0.C91085v;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder */
public class JsApiOperateRecorder extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 295;
    public static final String NAME = "operateRecorder";

    /* renamed from: n */
    public static Vector<String> f240564n = new Vector<>();

    /* renamed from: g */
    public OperateRecordTask f240565g;

    /* renamed from: h */
    public C83780d1 f240566h;

    /* renamed from: i */
    public C83231l.C83234d f240567i;

    /* renamed from: j */
    public C89816t.C89818b f240568j;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder$OperateRecordTask */
    public static class OperateRecordTask extends C82073a {

        /* renamed from: A */
        public boolean f240569A;

        /* renamed from: B */
        public final IListener<OperateRecordEvent> f240570B = new IListener<OperateRecordEvent>(C40008f.f107254d) {
            {
                this.__eventId = -1109317931;
            }

            public boolean callback(IEvent iEvent) {
                OperateRecordEvent operateRecordEvent = (OperateRecordEvent) iEvent;
                Log.m105925i("MicroMsg.Record.JsApiOperateRecorder", "mListener callback action : %d", Integer.valueOf(operateRecordEvent.f236248d.f236249a));
                if (!OperateRecordTask.this.f240577j.equalsIgnoreCase(operateRecordEvent.f236248d.f236258j)) {
                    Log.m105920e("MicroMsg.Record.JsApiOperateRecorder", "appId is diff, don't send event");
                    return false;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("state", operateRecordEvent.f236248d.f236251c);
                OperateRecordTask operateRecordTask = OperateRecordTask.this;
                OperateRecordEvent.C80732a aVar = operateRecordEvent.f236248d;
                operateRecordTask.f240586v = aVar.f236251c;
                if (aVar.f236249a == 2) {
                    operateRecordTask.f240583s = aVar.f236252d;
                    operateRecordTask.f240585u = aVar.f236250b;
                    operateRecordTask.f240584t = aVar.f236253e;
                    String str = operateRecordTask.f240577j;
                    if (!((HashMap) C83626f.f244216a).containsKey(str)) {
                        Log.m105921e("MicroMsg.Record.AppBrandRecordClientService", "appId:%s not exist the appId for listener", str);
                    } else {
                        Log.m105925i("MicroMsg.Record.AppBrandRecordClientService", "removeRecordListener,appId:%s", str);
                        C83626f.f244217b.remove(str);
                        IListener iListener = (IListener) ((HashMap) C83626f.f244216a).remove(str);
                        if (iListener != null) {
                            iListener.dead();
                        }
                    }
                }
                OperateRecordEvent.C80732a aVar2 = operateRecordEvent.f236248d;
                if (aVar2.f236249a == 4) {
                    hashMap.put("errCode", Integer.valueOf(aVar2.f236256h));
                    hashMap.put("errMsg", !TextUtils.isEmpty(operateRecordEvent.f236248d.f236257i) ? operateRecordEvent.f236248d.f236257i : "");
                }
                OperateRecordEvent.C80732a aVar3 = operateRecordEvent.f236248d;
                if (aVar3.f236249a == 5) {
                    byte[] bArr = aVar3.f236254f;
                    if (bArr == null || bArr.length <= 819200) {
                        OperateRecordTask.this.f240589y = bArr;
                    } else {
                        OperateRecordTask operateRecordTask2 = OperateRecordTask.this;
                        operateRecordTask2.getClass();
                        long nanoTime = System.nanoTime();
                        OutputStream outputStream = null;
                        try {
                            C86009m1 m1Var = new C86009m1(operateRecordTask2.f240588x);
                            Log.m105919d("MicroMsg.Record.JsApiOperateRecorder", "frameBufferPath:%s", operateRecordTask2.f240588x);
                            if (!m1Var.mo119967g()) {
                                m1Var.mo119964e();
                            }
                            OutputStream H = C86013q1.m106426H(m1Var);
                            H.write(operateRecordEvent.f236248d.f236254f);
                            H.close();
                            try {
                                H.close();
                            } catch (IOException e) {
                                Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e, "", new Object[0]);
                            }
                        } catch (FileNotFoundException e2) {
                            Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e2, "", new Object[0]);
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e3) {
                                    Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e3, "", new Object[0]);
                                }
                            }
                        } catch (IOException e4) {
                            Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e4, "", new Object[0]);
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e5) {
                                    Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e5, "", new Object[0]);
                                }
                            }
                        } catch (Throwable th) {
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e6) {
                                    Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e6, "", new Object[0]);
                                }
                            }
                            throw th;
                        }
                        Log.m105919d("MicroMsg.Record.JsApiOperateRecorder", "time:%d", Long.valueOf(System.nanoTime() - nanoTime));
                    }
                    OperateRecordTask operateRecordTask3 = OperateRecordTask.this;
                    OperateRecordEvent.C80732a aVar4 = operateRecordEvent.f236248d;
                    byte[] bArr2 = aVar4.f236254f;
                    int length = bArr2 != null ? bArr2.length : 0;
                    operateRecordTask3.f240590z = length;
                    operateRecordTask3.f240569A = aVar4.f236255g;
                    Log.m105925i("MicroMsg.Record.JsApiOperateRecorder", "frameBufferSize:%d", Integer.valueOf(length));
                }
                OperateRecordTask.this.f240581q = new JSONObject(hashMap).toString();
                OperateRecordTask operateRecordTask4 = OperateRecordTask.this;
                operateRecordTask4.f240582r = operateRecordEvent.f236248d.f236249a;
                operateRecordTask4.mo114502b();
                return true;
            }
        };

        /* renamed from: d */
        public C83231l.C83234d f240571d;

        /* renamed from: e */
        public AudioRecordVoIPInterruptListener f240572e;

        /* renamed from: f */
        public JsApiOperateRecorder f240573f;

        /* renamed from: g */
        public C81925i2 f240574g;

        /* renamed from: h */
        public int f240575h;

        /* renamed from: i */
        public String f240576i = "";

        /* renamed from: j */
        public String f240577j;

        /* renamed from: n */
        public String f240578n;

        /* renamed from: o */
        public boolean f240579o = false;

        /* renamed from: p */
        public String f240580p = "";

        /* renamed from: q */
        public String f240581q;

        /* renamed from: r */
        public int f240582r;

        /* renamed from: s */
        public String f240583s = "";

        /* renamed from: t */
        public int f240584t = 0;

        /* renamed from: u */
        public int f240585u = 0;

        /* renamed from: v */
        public String f240586v = "";

        /* renamed from: w */
        public String f240587w = "";

        /* renamed from: x */
        public String f240588x;

        /* renamed from: y */
        public byte[] f240589y;

        /* renamed from: z */
        public int f240590z;

        public OperateRecordTask(JsApiOperateRecorder jsApiOperateRecorder, C81925i2 i2Var, int i) {
            this.f240573f = jsApiOperateRecorder;
            this.f240574g = i2Var;
            this.f240575h = i;
            C9514m mVar = new C9514m();
            if (i2Var.getFileSystem().getTempDirectory(mVar) == C81410b0.OK) {
                this.f240588x = new C86009m1((String) mVar.f29691a, "frameBuffer").mo119971i();
                return;
            }
            File cacheDir = i2Var.getContext().getCacheDir();
            this.f240588x = new C86009m1(cacheDir, "frameBuffer_" + i2Var.getAppId()).mo119971i();
        }

        /* JADX WARNING: Removed duplicated region for block: B:114:0x02d3  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x02de  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x026e  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0279  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo114501a() {
            /*
                r20 = this;
                r1 = r20
                com.tencent.mm.plugin.appbrand.media.record.l$h r0 = com.tencent.p014mm.plugin.appbrand.media.record.C83631l.C83639h.PAUSE
                java.lang.String r2 = "MicroMsg.Record.JsApiOperateRecorder"
                r3 = -1
                r4 = 1
                r5 = 0
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03b3 }
                java.lang.String r7 = r1.f240578n     // Catch:{ JSONException -> 0x03b3 }
                r6.<init>(r7)     // Catch:{ JSONException -> 0x03b3 }
                java.lang.String r7 = "operationType"
                java.lang.String r7 = r6.optString(r7)
                boolean r8 = android.text.TextUtils.isEmpty(r7)
                if (r8 == 0) goto L_0x002d
                java.lang.String r0 = "operationType is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
                r1.f240579o = r4
                r1.f240582r = r3
                r1.f240580p = r0
                r20.mo114502b()
                return
            L_0x002d:
                java.lang.Object[] r8 = new java.lang.Object[r4]
                r8[r5] = r7
                java.lang.String r9 = "operationType;%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r8)
                r1.f240579o = r5
                r1.f240582r = r3
                com.tencent.p014mm.plugin.appbrand.app.C81192y0.m99475a()
                java.lang.String r8 = "start"
                boolean r8 = r7.equals(r8)
                java.lang.String r9 = "MicroMsg.Record.AudioRecordMgr"
                if (r8 == 0) goto L_0x0294
                java.lang.String r7 = "duration"
                r8 = 60000(0xea60, float:8.4078E-41)
                int r7 = r6.optInt(r7, r8)
                r10 = 44100(0xac44, float:6.1797E-41)
                java.lang.String r11 = "sampleRate"
                int r10 = r6.optInt(r11, r10)
                java.lang.String r11 = "numberOfChannels"
                r12 = 2
                int r11 = r6.optInt(r11, r12)
                r13 = 128000(0x1f400, float:1.79366E-40)
                java.lang.String r14 = "encodeBitRate"
                int r13 = r6.optInt(r14, r13)
                java.lang.String r14 = "format"
                java.lang.String r14 = r6.optString(r14)
                r15 = r9
                r8 = 0
                java.lang.String r3 = "frameSize"
                double r8 = r6.optDouble(r3, r8)
                java.lang.String r3 = "audioSource"
                java.lang.String r3 = r6.optString(r3)
                java.lang.String r3 = r3.toUpperCase()
                com.tencent.mm.plugin.appbrand.media.record.d r6 = com.tencent.p014mm.plugin.appbrand.media.record.C83624d.MIC
                if (r3 == 0) goto L_0x009c
                int r17 = r3.length()
                if (r17 > 0) goto L_0x0090
                goto L_0x009c
            L_0x0090:
                r17 = 0
                com.tencent.mm.plugin.appbrand.media.record.d r17 = com.tencent.p014mm.plugin.appbrand.media.record.C83624d.valueOf(r3)     // Catch:{ Exception -> 0x0097 }
                goto L_0x0098
            L_0x0097:
            L_0x0098:
                if (r17 == 0) goto L_0x009c
                r6 = r17
            L_0x009c:
                java.lang.String r3 = r1.f240577j
                com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OperateRecordEvent> r12 = r1.f240570B
                java.util.Map<java.lang.String, com.tencent.mm.sdk.event.IListener> r18 = com.tencent.p014mm.plugin.appbrand.media.record.C83626f.f244216a
                r5 = r18
                java.util.HashMap r5 = (java.util.HashMap) r5
                boolean r5 = r5.containsKey(r3)
                r18 = r15
                java.lang.String r15 = "MicroMsg.Record.AppBrandRecordClientService"
                if (r5 == 0) goto L_0x00bc
                java.lang.Object[] r5 = new java.lang.Object[r4]
                r19 = 0
                r5[r19] = r3
                java.lang.String r3 = "appId:%s has add listener"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r3, r5)
                goto L_0x00e6
            L_0x00bc:
                r19 = 0
                if (r12 != 0) goto L_0x00c6
                java.lang.String r3 = "listener is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r3)
                goto L_0x00e6
            L_0x00c6:
                java.lang.Object[] r5 = new java.lang.Object[r4]
                r5[r19] = r3
                java.lang.String r4 = "addRecordListener,appId:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r4, r5)
                java.util.Map<java.lang.String, com.tencent.mm.sdk.event.IListener> r4 = com.tencent.p014mm.plugin.appbrand.media.record.C83626f.f244216a
                java.util.HashMap r4 = (java.util.HashMap) r4
                r4.put(r3, r12)
                java.util.ArrayList<java.lang.String> r4 = com.tencent.p014mm.plugin.appbrand.media.record.C83626f.f244217b
                boolean r4 = r4.contains(r3)
                if (r4 != 0) goto L_0x00e3
                java.util.ArrayList<java.lang.String> r4 = com.tencent.p014mm.plugin.appbrand.media.record.C83626f.f244217b
                r4.add(r3)
            L_0x00e3:
                r12.alive()
            L_0x00e6:
                com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam r3 = new com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam
                r3.<init>()
                r3.f244261d = r7
                r3.f244262e = r10
                r3.f244263f = r11
                r3.f244264g = r13
                r3.f244265h = r14
                r4 = 8
                r3.f244267j = r4
                r3.f244268n = r8
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = ""
                r4.append(r5)
                long r7 = java.lang.System.currentTimeMillis()
                r4.append(r7)
                java.lang.String r4 = r4.toString()
                r3.f244266i = r4
                java.lang.String r4 = r1.f240576i
                r3.f244269o = r4
                java.lang.String r4 = r1.f240577j
                r3.f244270p = r4
                r3.f244271q = r6
                com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener r4 = r1.f240572e
                if (r4 != 0) goto L_0x0127
                com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener r4 = new com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener
                r4.<init>()
                r1.f240572e = r4
            L_0x0127:
                com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener r4 = r1.f240572e
                r3.f244272r = r4
                r1.f240587w = r14
                boolean r4 = com.tencent.p014mm.plugin.appbrand.media.record.C83626f.f244218c
                if (r4 == 0) goto L_0x0138
                java.lang.String r4 = "update device info done!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r4)
                goto L_0x0143
            L_0x0138:
                com.tencent.mm.plugin.appbrand.media.record.e r4 = new com.tencent.mm.plugin.appbrand.media.record.e
                r4.<init>()
                java.lang.String r6 = "record_update_device_info"
                com.tencent.p014mm.sdk.thread.ThreadPool.post(r4, r6)
            L_0x0143:
                com.tencent.mm.plugin.appbrand.media.record.l r4 = com.tencent.p014mm.plugin.appbrand.media.record.C83631l.m102667g()
                r4.getClass()
                java.lang.String r6 = "startRecord"
                r8 = r18
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
                com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam r6 = r4.f244225d
                if (r6 == 0) goto L_0x016b
                java.lang.String r7 = r3.f244270p
                if (r7 == 0) goto L_0x016b
                java.lang.String r6 = r6.f244270p
                boolean r6 = r7.equalsIgnoreCase(r6)
                if (r6 != 0) goto L_0x016b
                java.lang.String r0 = "appId is diff, must stop record first"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                r4.mo115950n()
                goto L_0x0186
            L_0x016b:
                boolean r6 = r4.f244223b
                if (r6 == 0) goto L_0x0176
                java.lang.String r0 = "startRecord fail, is recording"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                goto L_0x01cb
            L_0x0176:
                com.tencent.mm.plugin.appbrand.media.record.l$h r6 = r4.f244226e
                if (r6 != r0) goto L_0x017c
                r0 = 1
                goto L_0x017d
            L_0x017c:
                r0 = 0
            L_0x017d:
                if (r0 == 0) goto L_0x0186
                java.lang.String r0 = "startRecord fail, is pause"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                goto L_0x01cb
            L_0x0186:
                java.lang.String r0 = r3.f244265h
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x01a1
                int r0 = r3.f244261d
                if (r0 < 0) goto L_0x01a1
                int r0 = r3.f244264g
                if (r0 <= 0) goto L_0x01a1
                int r0 = r3.f244262e
                if (r0 <= 0) goto L_0x01a1
                int r0 = r3.f244263f
                if (r0 > 0) goto L_0x019f
                goto L_0x01a1
            L_0x019f:
                r0 = 1
                goto L_0x01a2
            L_0x01a1:
                r0 = 0
            L_0x01a2:
                if (r0 != 0) goto L_0x01b0
                java.lang.String r0 = "startRecord fail, param is invalid"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                r0 = 15
                com.tencent.p014mm.plugin.appbrand.media.record.C83646t.m102682a(r0)
                goto L_0x01cb
            L_0x01b0:
                java.lang.String r0 = r3.f244265h
                boolean r0 = com.tencent.p014mm.plugin.appbrand.media.record.C29597r.m38828a(r0)
                if (r0 != 0) goto L_0x01ce
                r6 = 1
                java.lang.Object[] r0 = new java.lang.Object[r6]
                java.lang.String r3 = r3.f244265h
                r4 = 0
                r0[r4] = r3
                java.lang.String r3 = "startRecord fail, encode format %s is not support!"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r3, r0)
                r0 = 16
                com.tencent.p014mm.plugin.appbrand.media.record.C83646t.m102682a(r0)
            L_0x01cb:
                r5 = 0
                goto L_0x026c
            L_0x01ce:
                java.lang.String r0 = r3.f244266i
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x01eb
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r5)
                long r5 = java.lang.System.currentTimeMillis()
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                r3.f244266i = r0
            L_0x01eb:
                com.tencent.mm.plugin.appbrand.media.record.t$b r5 = com.tencent.p014mm.plugin.appbrand.media.record.C83646t.f244273a
                r6 = 689(0x2b1, double:3.404E-321)
                r8 = 0
                r10 = 1
                r12 = 1
                r5.idkeyStat(r6, r8, r10, r12)
                r0 = 4
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r5 = r3.f244261d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 0
                r0[r6] = r5
                int r5 = r3.f244263f
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 1
                r0[r6] = r5
                int r5 = r3.f244262e
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 2
                r0[r6] = r5
                int r5 = r3.f244264g
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 3
                r0[r6] = r5
                java.lang.String r5 = "MicroMsg.Record.RecordParamCompatibility"
                java.lang.String r6 = "recordParam duration:%d, numberOfChannels:%d, sampleRate:%d, encodeBitRate:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r0)
                int r0 = r3.f244261d
                if (r0 > 0) goto L_0x0230
                r5 = 60000(0xea60, float:8.4078E-41)
                r3.f244261d = r5
                goto L_0x0237
            L_0x0230:
                r5 = 600000(0x927c0, float:8.40779E-40)
                if (r0 < r5) goto L_0x0237
                r3.f244261d = r5
            L_0x0237:
                int r0 = r3.f244263f
                r5 = 1
                if (r0 >= r5) goto L_0x0241
                r5 = 2
                if (r0 <= r5) goto L_0x0241
                r3.f244263f = r5
            L_0x0241:
                int r0 = r3.f244262e
                r5 = 48000(0xbb80, float:6.7262E-41)
                if (r0 <= r5) goto L_0x024b
                r3.f244262e = r5
                goto L_0x0251
            L_0x024b:
                r5 = 8000(0x1f40, float:1.121E-41)
                if (r0 >= r5) goto L_0x0251
                r3.f244262e = r5
            L_0x0251:
                int r0 = r3.f244264g
                r5 = 320000(0x4e200, float:4.48416E-40)
                if (r0 <= r5) goto L_0x025b
                r3.f244264g = r5
                goto L_0x0261
            L_0x025b:
                r5 = 16000(0x3e80, float:2.2421E-41)
                if (r0 >= r5) goto L_0x0261
                r3.f244264g = r5
            L_0x0261:
                com.tencent.mm.plugin.appbrand.media.record.n r0 = new com.tencent.mm.plugin.appbrand.media.record.n
                r0.<init>(r4, r3)
                java.lang.String r3 = "app_brand_start_record"
                com.tencent.p014mm.sdk.thread.ThreadPool.post(r0, r3)
                r5 = 1
            L_0x026c:
                if (r5 == 0) goto L_0x0279
                java.lang.String r0 = "star record ok"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                r3 = -1
                r1.f240582r = r3
                goto L_0x03a6
            L_0x0279:
                com.tencent.mm.plugin.appbrand.media.record.l r0 = com.tencent.p014mm.plugin.appbrand.media.record.C83631l.m102667g()
                boolean r0 = r0.f244223b
                if (r0 == 0) goto L_0x028a
                r3 = 1
                r1.f240579o = r3
                java.lang.String r0 = "audio is recording, don't start record again"
                r1.f240580p = r0
                goto L_0x03a6
            L_0x028a:
                r3 = 1
                r1.f240579o = r3
                java.lang.String r0 = "start record fail"
                r1.f240580p = r0
                goto L_0x03a6
            L_0x0294:
                r8 = r9
                java.lang.String r3 = "resume"
                boolean r3 = r7.equals(r3)
                if (r3 == 0) goto L_0x02f9
                com.tencent.mm.plugin.appbrand.media.record.l r0 = com.tencent.p014mm.plugin.appbrand.media.record.C83631l.m102667g()
                boolean r3 = r0.f244223b
                if (r3 == 0) goto L_0x02ad
                java.lang.String r0 = "resumeRecord fail, is recording"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
                goto L_0x02b7
            L_0x02ad:
                com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam r3 = r0.f244225d
                if (r3 != 0) goto L_0x02b9
                java.lang.String r0 = "resumeRecord fail, mRecordParam is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            L_0x02b7:
                r5 = 0
                goto L_0x02d1
            L_0x02b9:
                com.tencent.mm.plugin.appbrand.media.record.t$b r9 = com.tencent.p014mm.plugin.appbrand.media.record.C83646t.f244273a
                r10 = 689(0x2b1, double:3.404E-321)
                r12 = 0
                r14 = 1
                r16 = 1
                r9.idkeyStat(r10, r12, r14, r16)
                com.tencent.mm.plugin.appbrand.media.record.o r3 = new com.tencent.mm.plugin.appbrand.media.record.o
                r3.<init>(r0)
                java.lang.String r0 = "app_brand_resume_record"
                com.tencent.p014mm.sdk.thread.ThreadPool.post(r3, r0)
                r5 = 1
            L_0x02d1:
                if (r5 == 0) goto L_0x02de
                r3 = -1
                r1.f240582r = r3
                java.lang.String r0 = "resume record ok"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                goto L_0x03a6
            L_0x02de:
                com.tencent.mm.plugin.appbrand.media.record.l r0 = com.tencent.p014mm.plugin.appbrand.media.record.C83631l.m102667g()
                boolean r0 = r0.f244223b
                if (r0 == 0) goto L_0x02ef
                r3 = 1
                r1.f240579o = r3
                java.lang.String r0 = "audio is recording, don't resume record again"
                r1.f240580p = r0
                goto L_0x03a6
            L_0x02ef:
                r3 = 1
                r1.f240579o = r3
                java.lang.String r0 = "resume record fail"
                r1.f240580p = r0
                goto L_0x03a6
            L_0x02f9:
                java.lang.String r3 = "pause"
                boolean r3 = r7.equals(r3)
                if (r3 == 0) goto L_0x035e
                com.tencent.mm.plugin.appbrand.media.record.l r3 = com.tencent.p014mm.plugin.appbrand.media.record.C83631l.m102667g()
                r3.getClass()
                java.lang.String r4 = "pauseRecord"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
                jp0.a r4 = r3.f244222a
                if (r4 != 0) goto L_0x031a
                java.lang.String r3 = "mRecord is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r3)
                r3 = 0
                goto L_0x0334
            L_0x031a:
                com.tencent.mm.plugin.appbrand.media.record.l$h r4 = r3.f244226e
                if (r4 != r0) goto L_0x0320
                r4 = 1
                goto L_0x0321
            L_0x0320:
                r4 = 0
            L_0x0321:
                if (r4 == 0) goto L_0x0329
                java.lang.String r3 = "is paused, don't pause again"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r3)
                goto L_0x0333
            L_0x0329:
                com.tencent.mm.plugin.appbrand.media.record.p r4 = new com.tencent.mm.plugin.appbrand.media.record.p
                r4.<init>(r3)
                java.lang.String r3 = "app_brand_pause_record"
                com.tencent.p014mm.sdk.thread.ThreadPool.post(r4, r3)
            L_0x0333:
                r3 = 1
            L_0x0334:
                if (r3 == 0) goto L_0x0340
                r3 = -1
                r1.f240582r = r3
                java.lang.String r0 = "pause record ok"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                goto L_0x03a6
            L_0x0340:
                com.tencent.mm.plugin.appbrand.media.record.l r3 = com.tencent.p014mm.plugin.appbrand.media.record.C83631l.m102667g()
                com.tencent.mm.plugin.appbrand.media.record.l$h r3 = r3.f244226e
                if (r3 != r0) goto L_0x034a
                r5 = 1
                goto L_0x034b
            L_0x034a:
                r5 = 0
            L_0x034b:
                if (r5 == 0) goto L_0x0355
                r3 = 1
                r1.f240579o = r3
                java.lang.String r0 = "audio is pause, don't pause record again"
                r1.f240580p = r0
                goto L_0x03a6
            L_0x0355:
                r3 = 1
                r1.f240579o = r3
                java.lang.String r0 = "pause record fail"
                r1.f240580p = r0
                goto L_0x03a6
            L_0x035e:
                java.lang.String r0 = "stop"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L_0x039b
                com.tencent.mm.plugin.appbrand.media.record.l r0 = com.tencent.p014mm.plugin.appbrand.media.record.C83631l.m102667g()
                boolean r0 = r0.mo115950n()
                if (r0 == 0) goto L_0x037b
                r3 = -1
                r1.f240582r = r3
                java.lang.String r0 = "stop record ok"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                goto L_0x03a6
            L_0x037b:
                com.tencent.mm.plugin.appbrand.media.record.l r0 = com.tencent.p014mm.plugin.appbrand.media.record.C83631l.m102667g()
                com.tencent.mm.plugin.appbrand.media.record.l$h r0 = r0.f244226e
                com.tencent.mm.plugin.appbrand.media.record.l$h r3 = com.tencent.p014mm.plugin.appbrand.media.record.C83631l.C83639h.STOP
                if (r0 != r3) goto L_0x0387
                r5 = 1
                goto L_0x0388
            L_0x0387:
                r5 = 0
            L_0x0388:
                if (r5 == 0) goto L_0x0392
                r3 = 1
                r1.f240579o = r3
                java.lang.String r0 = "audio is stop, don't stop record again"
                r1.f240580p = r0
                goto L_0x03a6
            L_0x0392:
                r3 = 1
                r1.f240579o = r3
                java.lang.String r0 = "stop record fail"
                r1.f240580p = r0
                goto L_0x03a6
            L_0x039b:
                r3 = 1
                java.lang.String r0 = "operationType is invalid"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
                r1.f240579o = r3
                r1.f240580p = r0
            L_0x03a6:
                boolean r0 = r1.f240579o
                if (r0 == 0) goto L_0x03af
                java.lang.String r0 = r1.f240580p
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            L_0x03af:
                r20.mo114502b()
                return
            L_0x03b3:
                r0 = move-exception
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.String r5 = r1.f240578n
                r6 = 0
                r4[r6] = r5
                java.lang.String r5 = "new json exists exception, data is invalid, dataStr:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r5, r4)
                r1.f240579o = r3
                r3 = -1
                r1.f240582r = r3
                java.lang.String r3 = "parser data fail, data is invalid"
                r1.f240580p = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "exception:%s"
                r3.append(r4)
                java.lang.String r0 = r0.getMessage()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
                r20.mo114502b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder.OperateRecordTask.mo114501a():void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: com.tencent.mm.vfs.m1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: com.tencent.mm.vfs.m1} */
        /* JADX WARNING: type inference failed for: r11v0, types: [com.tencent.mm.vfs.m1] */
        /* JADX WARNING: type inference failed for: r11v3, types: [com.tencent.mm.vfs.m1] */
        /* JADX WARNING: type inference failed for: r11v5 */
        /* JADX WARNING: type inference failed for: r11v6, types: [com.tencent.mm.vfs.m1] */
        /* JADX WARNING: type inference failed for: r11v8 */
        /* JADX WARNING: type inference failed for: r11v9 */
        /* JADX WARNING: type inference failed for: r11v19 */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0110, code lost:
            if (r12.equalsIgnoreCase(r11) != false) goto L_0x00fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a0, code lost:
            if (r7 != false) goto L_0x01f8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d9, code lost:
            if (r7 != false) goto L_0x01f8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f6, code lost:
            if (r7 != false) goto L_0x01f8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f8, code lost:
            r11.mo119966f();
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x0216 A[SYNTHETIC, Splitter:B:102:0x0216] */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x0228  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x022c  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x0234  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x023e  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x025b  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0267  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0124  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01c9 A[SYNTHETIC, Splitter:B:78:0x01c9] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01d5  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x01e6 A[SYNTHETIC, Splitter:B:90:0x01e6] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01f2  */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:75:0x01c2=Splitter:B:75:0x01c2, B:87:0x01df=Splitter:B:87:0x01df} */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo114502b() {
            /*
                r14 = this;
                super.mo114502b()
                com.tencent.mm.plugin.appbrand.i2 r0 = r14.f240574g
                java.lang.String r1 = "MicroMsg.Record.JsApiOperateRecorder"
                if (r0 != 0) goto L_0x0010
                java.lang.String r0 = "service is null, don't callback"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
                return
            L_0x0010:
                int r0 = r14.f240582r
                r2 = -1
                r3 = 0
                r4 = 1
                if (r0 != r2) goto L_0x0060
                boolean r0 = r14.f240579o
                if (r0 != 0) goto L_0x0032
                java.lang.String r0 = "operateRecorder ok"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                com.tencent.mm.plugin.appbrand.i2 r0 = r14.f240574g
                int r1 = r14.f240575h
                com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder r2 = r14.f240573f
                java.lang.String r3 = "ok"
                java.lang.String r2 = r2.mo115109j(r3)
                r0.mo109647a(r1, r2)
                goto L_0x0293
            L_0x0032:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                java.lang.String r2 = r14.f240580p
                r0[r3] = r2
                java.lang.String r2 = "operateRecorder fail:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r0)
                com.tencent.mm.plugin.appbrand.i2 r0 = r14.f240574g
                int r1 = r14.f240575h
                com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder r2 = r14.f240573f
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "fail:"
                r3.append(r4)
                java.lang.String r4 = r14.f240580p
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r2 = r2.mo115109j(r3)
                r0.mo109647a(r1, r2)
                goto L_0x0293
            L_0x0060:
                com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder$b r0 = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder$b
                r0.<init>()
                int r2 = r14.f240582r
                r5 = 2
                if (r2 == 0) goto L_0x008f
                if (r2 == r4) goto L_0x008f
                r6 = 4
                if (r2 == r5) goto L_0x0075
                r7 = 3
                if (r2 == r7) goto L_0x0075
                if (r2 == r6) goto L_0x0075
                goto L_0x00ac
            L_0x0075:
                com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder r2 = r14.f240573f
                com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder.m100744w(r2, r3)
                int r2 = r14.f240582r
                if (r2 == r5) goto L_0x0080
                if (r2 != r6) goto L_0x00ac
            L_0x0080:
                java.lang.String r2 = r14.f240577j
                com.tencent.mm.plugin.appbrand.l$d r6 = r14.f240571d
                com.tencent.p014mm.plugin.appbrand.C83231l.m102144e(r2, r6)
                java.util.Vector<java.lang.String> r2 = com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder.f240564n
                java.lang.String r6 = r14.f240577j
                r2.remove(r6)
                goto L_0x00ac
            L_0x008f:
                com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder r2 = r14.f240573f
                com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder.m100744w(r2, r4)
                java.util.Vector<java.lang.String> r2 = com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder.f240564n
                java.lang.String r6 = r14.f240577j
                boolean r2 = r2.contains(r6)
                if (r2 != 0) goto L_0x00ac
                java.lang.String r2 = r14.f240577j
                com.tencent.mm.plugin.appbrand.l$d r6 = r14.f240571d
                com.tencent.p014mm.plugin.appbrand.C83231l.m102140a(r2, r6)
                java.util.Vector<java.lang.String> r2 = com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder.f240564n
                java.lang.String r6 = r14.f240577j
                r2.add(r6)
            L_0x00ac:
                int r2 = r14.f240582r
                java.lang.String r6 = "state"
                java.lang.String r7 = ""
                if (r2 != r5) goto L_0x014d
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                java.lang.String r8 = r14.f240586v
                r2.put(r6, r8)
                java.lang.Object[] r8 = new java.lang.Object[r5]
                java.lang.String r9 = r14.f240583s
                r8[r3] = r9
                java.lang.String r9 = r14.f240587w
                r8[r4] = r9
                java.lang.String r9 = "filePath:%s, encodeFormat:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r8)
                js0.m r8 = new js0.m
                r8.<init>()
                com.tencent.mm.plugin.appbrand.i2 r9 = r14.f240574g
                com.tencent.mm.plugin.appbrand.appstorage.h0 r9 = r9.getFileSystem()
                com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1
                java.lang.String r11 = r14.f240583s
                r10.<init>((java.lang.String) r11)
                java.lang.String r11 = r14.f240587w
                boolean r12 = android.text.TextUtils.isEmpty(r11)
                if (r12 == 0) goto L_0x00ea
            L_0x00e8:
                r11 = r7
                goto L_0x0113
            L_0x00ea:
                java.lang.String r12 = "aac"
                boolean r12 = r12.equalsIgnoreCase(r11)
                if (r12 == 0) goto L_0x00f5
                java.lang.String r11 = "m4a"
                goto L_0x0113
            L_0x00f5:
                java.lang.String r12 = "mp3"
                boolean r13 = r12.equalsIgnoreCase(r11)
                if (r13 == 0) goto L_0x00ff
            L_0x00fd:
                r11 = r12
                goto L_0x0113
            L_0x00ff:
                java.lang.String r12 = "wav"
                boolean r13 = r12.equalsIgnoreCase(r11)
                if (r13 == 0) goto L_0x0109
                goto L_0x00fd
            L_0x0109:
                java.lang.String r12 = "pcm"
                boolean r11 = r12.equalsIgnoreCase(r11)
                if (r11 == 0) goto L_0x00e8
                goto L_0x00fd
            L_0x0113:
                com.tencent.mm.plugin.appbrand.appstorage.b0 r9 = r9.createTempFileFrom(r10, r11, r4, r8)
                com.tencent.mm.plugin.appbrand.appstorage.b0 r10 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.OK
                java.lang.String r11 = "tempFilePath"
                if (r9 != r10) goto L_0x0124
                T r8 = r8.f29691a
                r2.put(r11, r8)
                goto L_0x012c
            L_0x0124:
                java.lang.String r8 = "AppBrandLocalMediaObject obj is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)
                r2.put(r11, r7)
            L_0x012c:
                int r8 = r14.f240585u
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.String r9 = "duration"
                r2.put(r9, r8)
                int r8 = r14.f240584t
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.String r9 = "fileSize"
                r2.put(r9, r8)
                org.json.JSONObject r8 = new org.json.JSONObject
                r8.<init>(r2)
                java.lang.String r2 = r8.toString()
                r14.f240581q = r2
            L_0x014d:
                int r2 = r14.f240582r
                r8 = 5
                if (r2 != r8) goto L_0x0273
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                java.lang.String r8 = r14.f240586v
                r2.put(r6, r8)
                boolean r6 = r14.f240569A
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                java.lang.String r8 = "isLastFrame"
                r2.put(r8, r6)
                int r6 = r14.f240590z
                r8 = 819200(0xc8000, float:1.147944E-39)
                if (r6 <= r8) goto L_0x0230
                java.lang.String r6 = "frameBufferFile is not exist, delete error"
                long r8 = java.lang.System.nanoTime()
                r10 = 0
                com.tencent.mm.vfs.m1 r11 = new com.tencent.mm.vfs.m1     // Catch:{ FileNotFoundException -> 0x01dc, IOException -> 0x01bf, all -> 0x01bc }
                java.lang.String r12 = r14.f240588x     // Catch:{ FileNotFoundException -> 0x01dc, IOException -> 0x01bf, all -> 0x01bc }
                r11.<init>((java.lang.String) r12)     // Catch:{ FileNotFoundException -> 0x01dc, IOException -> 0x01bf, all -> 0x01bc }
                boolean r12 = r11.mo119967g()     // Catch:{ FileNotFoundException -> 0x01ba, IOException -> 0x01b8 }
                if (r12 == 0) goto L_0x01a3
                java.io.InputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106422D(r11)     // Catch:{ FileNotFoundException -> 0x01ba, IOException -> 0x01b8 }
                int r12 = r14.f240590z     // Catch:{ FileNotFoundException -> 0x01ba, IOException -> 0x01b8 }
                byte[] r12 = new byte[r12]     // Catch:{ FileNotFoundException -> 0x01ba, IOException -> 0x01b8 }
                r14.f240589y = r12     // Catch:{ FileNotFoundException -> 0x01ba, IOException -> 0x01b8 }
                r10.read(r12)     // Catch:{ FileNotFoundException -> 0x01ba, IOException -> 0x01b8 }
                r10.close()     // Catch:{ FileNotFoundException -> 0x01ba, IOException -> 0x01b8 }
                r10.close()     // Catch:{ IOException -> 0x0196 }
                goto L_0x019c
            L_0x0196:
                r10 = move-exception
                java.lang.Object[] r12 = new java.lang.Object[r3]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r7, r12)
            L_0x019c:
                boolean r7 = r11.mo119967g()
                if (r7 == 0) goto L_0x01fc
                goto L_0x01f8
            L_0x01a3:
                java.lang.String r12 = "frameBufferFile is not exist, return"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r12)     // Catch:{ FileNotFoundException -> 0x01ba, IOException -> 0x01b8 }
                boolean r7 = r11.mo119967g()
                if (r7 == 0) goto L_0x01b3
                r11.mo119966f()
                goto L_0x0230
            L_0x01b3:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
                goto L_0x0230
            L_0x01b8:
                r12 = move-exception
                goto L_0x01c2
            L_0x01ba:
                r12 = move-exception
                goto L_0x01df
            L_0x01bc:
                r0 = move-exception
                r11 = r10
                goto L_0x0214
            L_0x01bf:
                r11 = move-exception
                r12 = r11
                r11 = r10
            L_0x01c2:
                java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x0213 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r12, r7, r13)     // Catch:{ all -> 0x0213 }
                if (r10 == 0) goto L_0x01d3
                r10.close()     // Catch:{ IOException -> 0x01cd }
                goto L_0x01d3
            L_0x01cd:
                r10 = move-exception
                java.lang.Object[] r12 = new java.lang.Object[r3]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r7, r12)
            L_0x01d3:
                if (r11 == 0) goto L_0x01fc
                boolean r7 = r11.mo119967g()
                if (r7 == 0) goto L_0x01fc
                goto L_0x01f8
            L_0x01dc:
                r11 = move-exception
                r12 = r11
                r11 = r10
            L_0x01df:
                java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x0213 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r12, r7, r13)     // Catch:{ all -> 0x0213 }
                if (r10 == 0) goto L_0x01f0
                r10.close()     // Catch:{ IOException -> 0x01ea }
                goto L_0x01f0
            L_0x01ea:
                r10 = move-exception
                java.lang.Object[] r12 = new java.lang.Object[r3]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r7, r12)
            L_0x01f0:
                if (r11 == 0) goto L_0x01fc
                boolean r7 = r11.mo119967g()
                if (r7 == 0) goto L_0x01fc
            L_0x01f8:
                r11.mo119966f()
                goto L_0x01ff
            L_0x01fc:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            L_0x01ff:
                long r6 = java.lang.System.nanoTime()
                java.lang.Object[] r10 = new java.lang.Object[r4]
                long r6 = r6 - r8
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r10[r3] = r6
                java.lang.String r6 = "time:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r6, r10)
                goto L_0x0230
            L_0x0213:
                r0 = move-exception
            L_0x0214:
                if (r10 == 0) goto L_0x0220
                r10.close()     // Catch:{ IOException -> 0x021a }
                goto L_0x0220
            L_0x021a:
                r2 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r3]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r7, r3)
            L_0x0220:
                if (r11 == 0) goto L_0x022c
                boolean r2 = r11.mo119967g()
                if (r2 == 0) goto L_0x022c
                r11.mo119966f()
                goto L_0x022f
            L_0x022c:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            L_0x022f:
                throw r0
            L_0x0230:
                byte[] r6 = r14.f240589y
                if (r6 == 0) goto L_0x023e
                java.nio.ByteBuffer r6 = com.tencent.p014mm.plugin.appbrand.utils.C84782s1.m104464e(r6)
                java.lang.String r7 = "frameBuffer"
                r2.put(r7, r6)
                goto L_0x0243
            L_0x023e:
                java.lang.String r6 = "framBuffer is null, error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            L_0x0243:
                com.tencent.mm.plugin.appbrand.i2 r6 = r14.f240574g
                com.tencent.mm.plugin.appbrand.jsruntime.i r6 = r6.getJsRuntime()
                com.tencent.mm.plugin.appbrand.i2 r7 = r14.f240574g
                java.lang.Class<com.tencent.mm.plugin.appbrand.utils.s1$a> r8 = com.tencent.p014mm.plugin.appbrand.utils.C84782s1.C84783a.class
                com.tencent.mm.plugin.appbrand.jsapi.m r7 = r7.mo109671p(r8)
                com.tencent.mm.plugin.appbrand.utils.s1$a r7 = (com.tencent.p014mm.plugin.appbrand.utils.C84782s1.C84783a) r7
                com.tencent.mm.plugin.appbrand.utils.s1$b r6 = com.tencent.p014mm.plugin.appbrand.utils.C84782s1.m104463d(r6, r2, r7)
                com.tencent.mm.plugin.appbrand.utils.s1$b r7 = com.tencent.p014mm.plugin.appbrand.utils.C84782s1.C84784b.OK
                if (r6 != r7) goto L_0x0267
                org.json.JSONObject r6 = new org.json.JSONObject
                r6.<init>(r2)
                java.lang.String r2 = r6.toString()
                r14.f240581q = r2
                goto L_0x0273
            L_0x0267:
                com.tencent.mm.plugin.appbrand.utils.s1$b r2 = com.tencent.p014mm.plugin.appbrand.utils.C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT
                if (r6 != r2) goto L_0x0273
                com.tencent.mm.plugin.appbrand.i2 r0 = r14.f240574g
                java.lang.String r1 = "onRecorderStateChange"
                com.tencent.p014mm.plugin.appbrand.utils.C84782s1.m104461b(r0, r1)
                return
            L_0x0273:
                java.lang.Object[] r2 = new java.lang.Object[r5]
                int r5 = r14.f240582r
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r2[r3] = r5
                java.lang.String r3 = r14.f240581q
                r2[r4] = r3
                java.lang.String r3 = "operateRecorder onRecorderStateChange callback action:%d, jsonResult:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
                com.tencent.mm.plugin.appbrand.i2 r1 = r14.f240574g
                r0.mo115194p(r1)
                java.lang.String r1 = r14.f240581q
                r0.f242407f = r1
                r0.mo115158h()
            L_0x0293:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder.OperateRecordTask.mo114502b():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder$a */
    public class C82045a extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ String f240592d;

        /* renamed from: e */
        public final /* synthetic */ C81925i2 f240593e;

        /* renamed from: f */
        public final /* synthetic */ int f240594f;

        public C82045a(String str, C81925i2 i2Var, int i) {
            this.f240592d = str;
            this.f240593e = i2Var;
            this.f240594f = i;
        }

        /* renamed from: c */
        public void mo109497c() {
            Log.m105925i("MicroMsg.Record.JsApiOperateRecorder", "onDestroy, appId:%s", this.f240592d);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("operationType", "stop");
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e, "", new Object[0]);
            }
            JsApiOperateRecorder jsApiOperateRecorder = JsApiOperateRecorder.this;
            if (jsApiOperateRecorder.f240565g == null) {
                jsApiOperateRecorder.f240565g = new OperateRecordTask(jsApiOperateRecorder, this.f240593e, this.f240594f);
            }
            JsApiOperateRecorder.this.f240565g.f240578n = jSONObject.toString();
            OperateRecordTask operateRecordTask = JsApiOperateRecorder.this.f240565g;
            operateRecordTask.f240577j = this.f240592d;
            operateRecordTask.f240582r = -1;
            System.currentTimeMillis();
            operateRecordTask.mo114501a();
            C83231l.m102144e(this.f240592d, this);
            JsApiOperateRecorder.f240564n.remove(this.f240592d);
        }

        /* renamed from: e */
        public void mo74049e(C83231l.C83235e eVar) {
            Log.m105925i("MicroMsg.Record.JsApiOperateRecorder", "onPause, appId:%s", this.f240592d);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("operationType", "pause");
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e, "", new Object[0]);
            }
            JsApiOperateRecorder jsApiOperateRecorder = JsApiOperateRecorder.this;
            if (jsApiOperateRecorder.f240565g == null) {
                jsApiOperateRecorder.f240565g = new OperateRecordTask(jsApiOperateRecorder, this.f240593e, this.f240594f);
            }
            JsApiOperateRecorder.this.f240565g.f240578n = jSONObject.toString();
            OperateRecordTask operateRecordTask = JsApiOperateRecorder.this.f240565g;
            operateRecordTask.f240577j = this.f240592d;
            operateRecordTask.f240582r = -1;
            operateRecordTask.mo114528c();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder$b */
    public static final class C82046b extends C82926s {
        private static final int CTRL_INDEX = 296;
        private static final String NAME = "onRecorderStateChange";
    }

    /* renamed from: w */
    public static void m100744w(JsApiOperateRecorder jsApiOperateRecorder, boolean z) {
        jsApiOperateRecorder.getClass();
        if (!MMHandlerThread.isMainThread()) {
            MMHandlerThread.postToMainThread(new C82097r(jsApiOperateRecorder, z));
            return;
        }
        C83780d1 d1Var = jsApiOperateRecorder.f240566h;
        if (d1Var != null && d1Var.getRuntime() != null) {
            if (z) {
                jsApiOperateRecorder.f240568j = C89790a.C89791a.m112271a(jsApiOperateRecorder.f240566h.getRuntime()).mo124076f(C89790a.C89793b.VOICE);
                return;
            }
            C89816t.C89818b bVar = jsApiOperateRecorder.f240568j;
            if (bVar != null) {
                bVar.dismiss();
                jsApiOperateRecorder.f240568j = null;
            }
        }
    }

    /* renamed from: x */
    public void mo1505u(C81925i2 i2Var, JSONObject jSONObject, int i) {
        boolean z;
        C91085v.m114266a(i2Var.getAppId(), new C82098s(this, i2Var, jSONObject, i));
        Activity activity = i2Var.getContext() instanceof Activity ? (Activity) i2Var.getContext() : null;
        if (activity == null) {
            Log.m105920e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder, pageContext is null");
            i2Var.mo109647a(i, mo115109j("fail"));
            z = false;
        } else {
            z = C89922k.m112464a(activity, i2Var, "android.permission.RECORD_AUDIO", 116, "", "");
            if (z) {
                C91085v.m114268c(i2Var.getAppId());
            }
        }
        if (!z) {
            Log.m105920e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder, requestPermission fail");
            i2Var.mo109647a(i, mo115109j("fail:system permission denied"));
            return;
        }
        C83849m0 Z = i2Var.getRuntime().mo113042Z();
        if (Z.getCurrentPage() == null || Z.getCurrentPage().getCurrentPageView() == null) {
            i2Var.mo109647a(i, mo115109j("fail"));
            return;
        }
        this.f240566h = Z.getCurrentPage().getCurrentPageView();
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder, data is null");
            i2Var.mo109647a(i, mo115109j("fail:data is null"));
            return;
        }
        String appId = i2Var.getAppId();
        Log.m105925i("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder appId:%s, data:%s", appId, jSONObject.toString());
        if (this.f240565g == null) {
            this.f240565g = new OperateRecordTask(this, i2Var, i);
        }
        OperateRecordTask operateRecordTask = this.f240565g;
        operateRecordTask.f240575h = i;
        operateRecordTask.f240577j = appId;
        operateRecordTask.f240578n = jSONObject.toString();
        this.f240565g.f240576i = MMApplicationContext.getProcessName();
        if (this.f240567i == null) {
            this.f240567i = new C82045a(appId, i2Var, i);
        }
        OperateRecordTask operateRecordTask2 = this.f240565g;
        operateRecordTask2.f240571d = this.f240567i;
        operateRecordTask2.mo114528c();
    }
}
