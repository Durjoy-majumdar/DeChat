package pm0;

import android.content.Intent;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.appbrand.app.C81192y0;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import java.io.IOException;
import java.util.Date;
import kr0.C88267e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p225rc.g$$f;
import p625nu.C100196e;
import pm0.C89377c;
import xj0.C91216b0;
import xj0.C91221g;
import xj0.C91237o;
import xj0.C91256y;

/* renamed from: pm0.a */
public class C89369a extends C89377c {
    public static final int CTRL_INDEX = 705;
    public static final String NAME = "openVideoEditor";

    /* renamed from: pm0.a$a */
    public class C89370a implements C91216b0<JSONObject> {

        /* renamed from: a */
        public final /* synthetic */ C88267e f257350a;

        /* renamed from: b */
        public final /* synthetic */ int f257351b;

        public C89370a(C88267e eVar, int i) {
            this.f257350a = eVar;
            this.f257351b = i;
        }

        /* renamed from: a */
        public void mo123718a(int i, int i2, String str, Object obj) {
            JSONObject jSONObject = new JSONObject();
            C89369a.m111700B(C89369a.this, this.f257350a, i, i2, str, (JSONObject) obj, jSONObject);
            Log.m105925i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "editFormatResult result, %s", jSONObject.toString());
            this.f257350a.mo109647a(this.f257351b, jSONObject.toString());
        }
    }

    /* renamed from: pm0.a$b */
    public class C89371b implements C91216b0<JSONObject> {

        /* renamed from: a */
        public final /* synthetic */ C88267e f257353a;

        /* renamed from: b */
        public final /* synthetic */ int f257354b;

        public C89371b(C88267e eVar, int i) {
            this.f257353a = eVar;
            this.f257354b = i;
        }

        /* renamed from: a */
        public void mo123718a(int i, int i2, String str, Object obj) {
            JSONObject jSONObject = new JSONObject();
            C89369a.m111700B(C89369a.this, this.f257353a, i, i2, str, (JSONObject) obj, jSONObject);
            Log.m105925i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "editFormatResult result, %s", jSONObject.toString());
            this.f257353a.mo109647a(this.f257354b, jSONObject.toString());
        }
    }

    /* renamed from: pm0.a$c */
    public class C89372c implements C91216b0<JSONObject> {

        /* renamed from: a */
        public final /* synthetic */ C88267e f257356a;

        /* renamed from: b */
        public final /* synthetic */ int f257357b;

        /* renamed from: c */
        public final /* synthetic */ JSONObject f257358c;

        public C89372c(C88267e eVar, int i, JSONObject jSONObject) {
            this.f257356a = eVar;
            this.f257357b = i;
            this.f257358c = jSONObject;
        }

        /* renamed from: a */
        public void mo123718a(int i, int i2, String str, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            if (i2 != 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("errCode", i2);
                    jSONObject2.put("errMsg", C89369a.this.mo114779e() + ":fail:" + str);
                    Log.m105925i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "editForMediaSdk result, %s", jSONObject2.toString());
                    this.f257356a.mo109647a(this.f257357b, jSONObject2.toString());
                } catch (JSONException e) {
                    this.f257356a.mo109647a(this.f257357b, C89369a.this.mo115109j(String.format("fail: editForMediaSdk format result failed, %s", new Object[]{e.getMessage()})));
                }
            } else {
                this.f257358c.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, jSONObject.optString("wxaFilePath", ""));
                C89369a.this.mo123716D(this.f257356a, this.f257358c, new C89376b(this));
            }
        }
    }

    /* renamed from: pm0.a$d */
    public class C89373d implements C91216b0<JSONObject> {

        /* renamed from: a */
        public final /* synthetic */ C89377c.C89379b f257360a;

        /* renamed from: b */
        public final /* synthetic */ C91216b0 f257361b;

        public C89373d(C89369a aVar, C89377c.C89379b bVar, C91216b0 b0Var) {
            this.f257360a = bVar;
            this.f257361b = b0Var;
        }

        /* renamed from: a */
        public void mo123718a(int i, int i2, String str, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            if (i2 == 0) {
                try {
                    jSONObject.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.f257360a.f257371a);
                    jSONObject.put("wxaFilePath", this.f257360a.f257372b);
                } catch (JSONException e) {
                    str = e.getMessage();
                    i = 1;
                    i2 = -1;
                }
            }
            this.f257361b.mo123718a(i, i2, str, jSONObject);
        }
    }

    /* renamed from: pm0.a$e */
    public class C89374e implements g$$f {

        /* renamed from: a */
        public final /* synthetic */ int f257362a;

        /* renamed from: b */
        public final /* synthetic */ C91216b0 f257363b;

        /* renamed from: c */
        public final /* synthetic */ C88267e f257364c;

        /* renamed from: pm0.a$e$a */
        public class C89375a implements C91216b0<C91237o.C91239b> {

            /* renamed from: a */
            public final /* synthetic */ String f257366a;

            /* renamed from: b */
            public final /* synthetic */ String f257367b;

            /* renamed from: c */
            public final /* synthetic */ int f257368c;

            public C89375a(String str, String str2, int i) {
                this.f257366a = str;
                this.f257367b = str2;
                this.f257368c = i;
            }

            /* renamed from: a */
            public void mo123718a(int i, int i2, String str, Object obj) {
                C91237o.C91239b bVar = (C91237o.C91239b) obj;
                if (i2 != 0) {
                    try {
                        C89374e.this.f257363b.mo123718a(i, i2, str, new JSONObject());
                    } catch (JSONException e) {
                        C89374e.this.f257363b.mo123718a(1, -1, e.getMessage(), new JSONObject());
                    }
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.f257366a);
                    jSONObject.put("thumbPath", this.f257367b);
                    jSONObject.put("chosenId", this.f257368c);
                    jSONObject.put("duration", bVar.f261814a);
                    jSONObject.put("size", bVar.f261815b);
                    C89374e.this.f257363b.mo123718a(0, 0, "ok", jSONObject);
                }
            }
        }

        public C89374e(int i, C91216b0 b0Var, C88267e eVar) {
            this.f257362a = i;
            this.f257363b = b0Var;
            this.f257364c = eVar;
        }

        /* renamed from: b */
        public boolean mo1596b(int i, int i2, Intent intent) {
            if (i != this.f257362a) {
                return false;
            }
            Log.m105925i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: on result callback, result code: %d", Integer.valueOf(i2));
            if (i2 == 0 || i2 == 3001) {
                Log.m105924i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: user cancelled share!");
                this.f257363b.mo123718a(3, 803, "user cancelled", new JSONObject());
            } else if (i2 != -1 || intent == null || !intent.hasExtra("key_req_result")) {
                this.f257363b.mo123718a(1, 804, "edit file failed", new JSONObject());
            } else {
                SightCaptureResult sightCaptureResult = (SightCaptureResult) intent.getParcelableExtra("key_req_result");
                int intExtra = intent.getIntExtra("key_selected_item", 0);
                Log.m105925i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: is video: %b, video path %s, thumb path: %s, md5: %s, selectedItem: %d", Boolean.valueOf(sightCaptureResult.f201514d), sightCaptureResult.f201517g, sightCaptureResult.f201518h, sightCaptureResult.f201520j, Integer.valueOf(intExtra));
                if (!sightCaptureResult.f201514d) {
                    this.f257363b.mo123718a(3, 804, "not a video", new JSONObject());
                } else if (Util.isNullOrNil(sightCaptureResult.f201519i) || Util.isNullOrNil(sightCaptureResult.f201520j)) {
                    this.f257363b.mo123718a(1, 804, "edit failed", new JSONObject());
                } else {
                    String str = sightCaptureResult.f201517g;
                    String str2 = sightCaptureResult.f201518h;
                    Bitmap rk = ((C100196e) C86312j.m106911c(C100196e.class)).mo139319rk(str);
                    if (rk != null) {
                        try {
                            BitmapUtil.saveBitmapToImage(rk, 100, Bitmap.CompressFormat.JPEG, str2, true);
                        } catch (IOException e) {
                            Log.printErrStackTrace("MicroMsg.GameRecord.JsApiOpenVideoEditor", e, "hy: exception when convert bitmap", new Object[0]);
                        }
                    } else {
                        Log.m105924i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: generated thumb path is null!");
                    }
                    C91237o y = C89369a.this.mo123722y(this.f257364c);
                    y.f261806a.postToWorker(new C91256y(y, str, new C89375a(str, str2, intExtra)));
                }
            }
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0117 A[Catch:{ JSONException -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0139 A[Catch:{ JSONException -> 0x01aa }] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m111700B(pm0.C89369a r25, kr0.C88267e r26, int r27, int r28, java.lang.String r29, org.json.JSONObject r30, org.json.JSONObject r31) {
        /*
            r0 = r28
            r1 = r30
            r2 = r31
            r25.getClass()
            java.lang.String r3 = "size"
            java.lang.String r4 = "duration"
            java.lang.String r5 = "chosenId"
            java.lang.String r6 = ""
            java.lang.String r7 = "errMsg"
            java.lang.String r8 = "MicroMsg.GameRecord.JsApiOpenVideoEditor"
            java.lang.String r9 = "errCode"
            r10 = 0
            if (r0 == 0) goto L_0x003d
            r2.put(r9, r0)     // Catch:{ JSONException -> 0x01aa }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01aa }
            r0.<init>()     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r1 = r25.mo114779e()     // Catch:{ JSONException -> 0x01aa }
            r0.append(r1)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r1 = ":fail:"
            r0.append(r1)     // Catch:{ JSONException -> 0x01aa }
            r1 = r29
            r0.append(r1)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x01aa }
            r2.put(r7, r0)     // Catch:{ JSONException -> 0x01aa }
            goto L_0x01b3
        L_0x003d:
            java.lang.String r0 = "filePath"
            java.lang.String r13 = r1.optString(r0, r6)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r0 = "thumbPath"
            java.lang.String r6 = r1.optString(r0, r6)     // Catch:{ JSONException -> 0x01aa }
            int r15 = r1.optInt(r5, r10)     // Catch:{ JSONException -> 0x01aa }
            r11 = 0
            r27 = r15
            long r14 = r1.optLong(r4, r11)     // Catch:{ JSONException -> 0x01aa }
            long r11 = r1.optLong(r3, r11)     // Catch:{ JSONException -> 0x01aa }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)     // Catch:{ JSONException -> 0x01aa }
            if (r0 == 0) goto L_0x007e
            r0 = -1
            r2.put(r9, r0)     // Catch:{ JSONException -> 0x01aa }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01aa }
            r0.<init>()     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r1 = r25.mo114779e()     // Catch:{ JSONException -> 0x01aa }
            r0.append(r1)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r1 = ":fail:parmas error"
            r0.append(r1)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x01aa }
            r2.put(r7, r0)     // Catch:{ JSONException -> 0x01aa }
            goto L_0x01b3
        L_0x007e:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ JSONException -> 0x01aa }
            if (r0 == 0) goto L_0x00c4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b8 }
            r0.<init>()     // Catch:{ IOException -> 0x00b8 }
            r0.append(r13)     // Catch:{ IOException -> 0x00b8 }
            java.lang.String r1 = ".jpg"
            r0.append(r1)     // Catch:{ IOException -> 0x00b8 }
            java.lang.String r6 = r0.toString()     // Catch:{ IOException -> 0x00b8 }
            java.lang.Class<nu.e> r0 = p625nu.C100196e.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ IOException -> 0x00b8 }
            nu.e r0 = (p625nu.C100196e) r0     // Catch:{ IOException -> 0x00b8 }
            android.graphics.Bitmap r0 = r0.mo139319rk(r13)     // Catch:{ IOException -> 0x00b8 }
            if (r0 == 0) goto L_0x00ae
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x00b8 }
            r10 = 1
            r28 = r11
            r11 = 100
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r11, r1, r6, r10)     // Catch:{ IOException -> 0x00b6 }
            goto L_0x00c6
        L_0x00ae:
            r28 = r11
            java.lang.String r0 = "hy: generated thumb path is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ IOException -> 0x00b6 }
            goto L_0x00c6
        L_0x00b6:
            r0 = move-exception
            goto L_0x00bb
        L_0x00b8:
            r0 = move-exception
            r28 = r11
        L_0x00bb:
            java.lang.String r1 = "hy: exception when convert bitmap"
            r10 = 0
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ JSONException -> 0x01aa }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r1, r11)     // Catch:{ JSONException -> 0x01aa }
            goto L_0x00c6
        L_0x00c4:
            r28 = r11
        L_0x00c6:
            r19 = r6
            java.util.Date r0 = new java.util.Date     // Catch:{ JSONException -> 0x01aa }
            r0.<init>()     // Catch:{ JSONException -> 0x01aa }
            long r0 = r0.getTime()     // Catch:{ JSONException -> 0x01aa }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01aa }
            r6.<init>()     // Catch:{ JSONException -> 0x01aa }
            r6.append(r0)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r10 = ".open_editor_video.mp4"
            r6.append(r10)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x01aa }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01aa }
            r10.<init>()     // Catch:{ JSONException -> 0x01aa }
            r10.append(r0)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r0 = ".open_editor_thumb.jpg"
            r10.append(r0)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r20 = r10.toString()     // Catch:{ JSONException -> 0x01aa }
            r0 = 1
            r16 = 1
            r23 = r28
            r11 = r25
            r12 = r26
            r1 = r3
            r10 = r4
            r3 = r14
            r14 = r6
            r6 = r27
            r15 = r0
            pm0.c$b r0 = r11.mo123719A(r12, r13, r14, r15, r16)     // Catch:{ JSONException -> 0x01aa }
            r21 = 1
            r22 = 1
            r17 = r25
            r18 = r26
            pm0.c$b r11 = r17.mo123719A(r18, r19, r20, r21, r22)     // Catch:{ JSONException -> 0x01aa }
            r12 = 804(0x324, float:1.127E-42)
            if (r0 != 0) goto L_0x0139
            java.lang.String r0 = "hy: save video temp file failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)     // Catch:{ JSONException -> 0x01aa }
            r2.put(r9, r12)     // Catch:{ JSONException -> 0x01aa }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01aa }
            r0.<init>()     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r1 = r25.mo114779e()     // Catch:{ JSONException -> 0x01aa }
            r0.append(r1)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r1 = ":fail:video file save to file system failed"
            r0.append(r1)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x01aa }
            r2.put(r7, r0)     // Catch:{ JSONException -> 0x01aa }
            goto L_0x01b3
        L_0x0139:
            if (r11 != 0) goto L_0x015c
            java.lang.String r0 = "hy: save thumb temp file failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)     // Catch:{ JSONException -> 0x01aa }
            r2.put(r9, r12)     // Catch:{ JSONException -> 0x01aa }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01aa }
            r0.<init>()     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r1 = r25.mo114779e()     // Catch:{ JSONException -> 0x01aa }
            r0.append(r1)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r1 = ":fail:video thumb save to file system failed"
            r0.append(r1)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x01aa }
            r2.put(r7, r0)     // Catch:{ JSONException -> 0x01aa }
            goto L_0x01b3
        L_0x015c:
            r12 = 0
            r2.put(r9, r12)     // Catch:{ JSONException -> 0x01aa }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01aa }
            r9.<init>()     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r12 = r25.mo114779e()     // Catch:{ JSONException -> 0x01aa }
            r9.append(r12)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r12 = ":ok"
            r9.append(r12)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r9 = r9.toString()     // Catch:{ JSONException -> 0x01aa }
            r2.put(r7, r9)     // Catch:{ JSONException -> 0x01aa }
            r2.put(r5, r6)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r5 = "tempFilePath"
            java.lang.String r0 = r0.f257372b     // Catch:{ JSONException -> 0x01aa }
            r2.put(r5, r0)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r0 = "tempThumbPath"
            java.lang.String r5 = r11.f257372b     // Catch:{ JSONException -> 0x01aa }
            r2.put(r0, r5)     // Catch:{ JSONException -> 0x01aa }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r14 = r3 * r5
            r7 = r10
            r2.put(r7, r14)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r0 = "durationUs"
            r2.put(r0, r14)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r0 = "durationMs"
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x01aa }
            java.lang.String r0 = "durationS"
            long r14 = r3 / r5
            r2.put(r0, r14)     // Catch:{ JSONException -> 0x01aa }
            r3 = r23
            r2.put(r1, r3)     // Catch:{ JSONException -> 0x01aa }
            goto L_0x01b3
        L_0x01aa:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "hy: exception when format edit result"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r2, r1)
        L_0x01b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pm0.C89369a.m111700B(pm0.a, kr0.e, int, int, java.lang.String, org.json.JSONObject, org.json.JSONObject):void");
    }

    /* renamed from: C */
    public final void mo123715C(C88267e eVar, JSONObject jSONObject, C91216b0<JSONObject> b0Var) {
        try {
            Log.m105925i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: editForMediaSdk %s %s", NAME, jSONObject.toString());
            JSONObject jSONObject2 = new JSONObject();
            String optString = jSONObject.optString("videoSrc", "");
            if (Util.isNullOrNil(optString)) {
                b0Var.mo123718a(2, -3, "sdkParmas videoSrc not set", new JSONObject());
                return;
            }
            jSONObject2.put("videoPath", ((C82419d1) eVar.getRuntime().f238163z).getAbsoluteFile(optString, false).mo119971i());
            String optString2 = jSONObject.optString("bgmSrc", "");
            if (!Util.isNullOrNil(optString2)) {
                jSONObject2.put("audioPath", ((C82419d1) eVar.getRuntime().f238163z).getAbsoluteFile(optString2, false).mo119971i());
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("timeRange");
            if (optJSONArray != null) {
                jSONObject2.put("videoSlices", optJSONArray);
            }
            jSONObject2.put("audioVolume", jSONObject.optDouble("volume", 1.0d));
            jSONObject2.put("atempo", jSONObject.optDouble("atempo", 1.0d));
            jSONObject2.put("mix", jSONObject.optBoolean("audioMix"));
            C89377c.C89379b w = mo123720w(eVar, new Date().getTime() + ".mp4", true);
            if (w != null && !Util.isNullOrNil(w.f257371a)) {
                if (!Util.isNullOrNil(w.f257372b)) {
                    jSONObject2.put(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, w.f257371a);
                    C91237o y = mo123722y(eVar);
                    y.f261806a.postToWorker(new C91221g(y, jSONObject2, new C89373d(this, w, b0Var)));
                    return;
                }
            }
            b0Var.mo123718a(1, -1, "create file failed", new JSONObject());
        } catch (JSONException e) {
            b0Var.mo123718a(2, -1, String.format("editForMediaSdk error: " + e.getMessage(), new Object[0]), new JSONObject());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0129 A[SYNTHETIC, Splitter:B:30:0x0129] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x017a  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123716D(kr0.C88267e r18, org.json.JSONObject r19, xj0.C91216b0<org.json.JSONObject> r20) {
        /*
            r17 = this;
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "openVideoEditor"
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = r19.toString()
            r6 = 1
            r3[r6] = r4
            java.lang.String r4 = "MicroMsg.GameRecord.JsApiOpenVideoEditor"
            java.lang.String r7 = "hy: editForNativeView %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r3)
            int r13 = p170ic.C87687a.m109085a(r17)
            android.content.Context r3 = r18.getContext()
            rc.g r3 = p225rc.C89916g.m112446a(r3)
            pm0.a$e r7 = new pm0.a$e
            r15 = r17
            r8 = r18
            r7.<init>(r13, r1, r8)
            r3.mo124232f(r7)
            java.lang.String r3 = "filePath"
            java.lang.String r7 = ""
            java.lang.String r3 = r0.optString(r3, r7)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r9 == 0) goto L_0x004d
            r0 = -3
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "editorParmas filePath not set"
            r1.mo123718a(r2, r0, r4, r3)
            return
        L_0x004d:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r18.getRuntime()
            com.tencent.mm.plugin.appbrand.appstorage.h0 r1 = r1.f238163z
            com.tencent.mm.plugin.appbrand.jsapi.file.d1 r1 = (com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1) r1
            com.tencent.mm.vfs.m1 r1 = r1.getAbsoluteFile(r3, r5)
            java.lang.String r12 = r1.mo119971i()
            java.lang.String r1 = "title"
            java.lang.String r1 = r0.optString(r1, r7)
            java.lang.String r2 = "buttonOptions"
            org.json.JSONArray r2 = r0.optJSONArray(r2)
            java.lang.String r3 = "toolBars"
            org.json.JSONArray r3 = r0.optJSONArray(r3)
            java.lang.String r9 = "minDuration"
            r10 = -1
            int r11 = r0.optInt(r9, r10)
            java.lang.String r14 = "maxDuration"
            int r10 = r0.optInt(r14, r10)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r0 = "k_ext_editor_from"
            r5.putInt(r0, r6)
            java.lang.String r0 = "k_ext_wording"
            r5.putString(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
            if (r2 == 0) goto L_0x00f8
            int r0 = r2.length()
            if (r0 > 0) goto L_0x009b
            goto L_0x00f8
        L_0x009b:
            r0 = 0
        L_0x009c:
            int r6 = r2.length()
            if (r0 >= r6) goto L_0x00f4
            org.json.JSONObject r6 = r2.getJSONObject(r0)     // Catch:{ JSONException -> 0x00d2 }
            r20 = r2
            java.lang.String r2 = "id"
            int r2 = r6.getInt(r2)     // Catch:{ JSONException -> 0x00d2 }
            r16 = r7
            java.lang.String r7 = "name"
            java.lang.String r7 = r6.getString(r7)     // Catch:{ JSONException -> 0x00d0 }
            java.lang.String r8 = "needExtUrl"
            r15 = 0
            boolean r6 = r6.optBoolean(r8, r15)     // Catch:{ JSONException -> 0x00d0 }
            com.tencent.mm.plugin.game.api.GameShareOption r8 = new com.tencent.mm.plugin.game.api.GameShareOption     // Catch:{ JSONException -> 0x00d0 }
            r8.<init>(r2, r7, r6)     // Catch:{ JSONException -> 0x00d0 }
            r1.add(r8)     // Catch:{ JSONException -> 0x00d0 }
            int r0 = r0 + 1
            r15 = r17
            r8 = r18
            r2 = r20
            r7 = r16
            goto L_0x009c
        L_0x00d0:
            r0 = move-exception
            goto L_0x00d5
        L_0x00d2:
            r0 = move-exception
            r16 = r7
        L_0x00d5:
            r2 = 0
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r7 = "hy: json exception!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r7, r6)
            r1.clear()
            com.tencent.mm.plugin.game.api.GameShareOption r0 = new com.tencent.mm.plugin.game.api.GameShareOption
            android.content.Context r6 = r18.getContext()
            r7 = 2131821833(0x7f110509, float:1.927642E38)
            java.lang.String r6 = r6.getString(r7)
            r0.<init>(r2, r6, r2)
            r1.add(r0)
            goto L_0x010e
        L_0x00f4:
            r16 = r7
            r2 = 0
            goto L_0x010e
        L_0x00f8:
            r16 = r7
            r2 = 0
            r7 = 2131821833(0x7f110509, float:1.927642E38)
            com.tencent.mm.plugin.game.api.GameShareOption r0 = new com.tencent.mm.plugin.game.api.GameShareOption
            android.content.Context r6 = r18.getContext()
            java.lang.String r6 = r6.getString(r7)
            r0.<init>(r2, r6, r2)
            r1.add(r0)
        L_0x010e:
            java.lang.String r0 = "k_ext_share_options"
            r5.putParcelableArrayList(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 1
            r1.<init>(r2)
            if (r3 == 0) goto L_0x014f
            int r0 = r3.length()
            if (r0 > 0) goto L_0x0122
            goto L_0x014f
        L_0x0122:
            r15 = 0
        L_0x0123:
            int r0 = r3.length()
            if (r15 >= r0) goto L_0x014f
            java.lang.String r0 = r3.getString(r15)     // Catch:{ JSONException -> 0x0133 }
            r1.add(r0)     // Catch:{ JSONException -> 0x0133 }
            int r15 = r15 + 1
            goto L_0x0123
        L_0x0133:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "hy: convertToolBars json exception! "
            r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r2, r3)
        L_0x014f:
            java.lang.String r0 = "k_ext_tool_bars"
            r5.putStringArrayList(r0, r1)
            if (r11 <= 0) goto L_0x0159
            r5.putInt(r9, r11)
        L_0x0159:
            if (r10 <= 0) goto L_0x015e
            r5.putInt(r14, r10)
        L_0x015e:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r18.getRuntime()
            if (r0 == 0) goto L_0x017a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r18.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r0 = r0.mo113213o1()
            if (r0 == 0) goto L_0x017a
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r18.getRuntime()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r0 = r0.mo113213o1()
            java.lang.String r0 = r0.f261061d
            r11 = r0
            goto L_0x017c
        L_0x017a:
            r11 = r16
        L_0x017c:
            java.lang.Class<sw1.s> r0 = sw1.C101703s.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r8 = r0
            sw1.s r8 = (sw1.C101703s) r8
            android.content.Context r9 = r18.getContext()
            java.lang.String r10 = r18.getAppId()
            r14 = r5
            r8.mo10940uc(r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pm0.C89369a.mo123716D(kr0.e, org.json.JSONObject, xj0.b0):void");
    }

    /* renamed from: z */
    public void mo123717z(C88267e eVar, JSONObject jSONObject, int i) {
        Log.m105925i("MicroMsg.GameRecord.JsApiOpenVideoEditor", "hy: %s %s", NAME, jSONObject.toString());
        if (eVar.mo114344o0() == null) {
            eVar.mo109647a(i, mo115109j("fail:internal error invalid android context"));
            return;
        }
        C81192y0.m99475a();
        int optInt = jSONObject.optInt("editType");
        JSONObject optJSONObject = jSONObject.optJSONObject("sdkParmas");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("editorParmas");
        if (optInt == 1) {
            if (optJSONObject == null) {
                eVar.mo109647a(i, mo115109j(String.format("fail: sdkParmas get failed", new Object[0])));
            } else {
                mo123715C(eVar, optJSONObject, new C89370a(eVar, i));
            }
        } else if (optInt == 2) {
            if (optJSONObject2 == null) {
                eVar.mo109647a(i, mo115109j(String.format("fail: editorParmas get failed", new Object[0])));
            } else {
                mo123716D(eVar, optJSONObject2, new C89371b(eVar, i));
            }
        } else if (optJSONObject == null || optJSONObject2 == null) {
            eVar.mo109647a(i, mo115109j(String.format("fail: sdkParmas or editorParmas get failed", new Object[0])));
        } else {
            mo123715C(eVar, optJSONObject, new C89372c(eVar, i, optJSONObject2));
        }
    }
}
