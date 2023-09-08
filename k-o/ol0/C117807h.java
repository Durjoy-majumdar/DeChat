package ol0;

import pl0.C118080q;

/* renamed from: ol0.h */
public class C117807h extends C117793b {
    public static final int CTRL_INDEX = 134;
    public static final String NAME = "addMapLines";

    /* renamed from: ol0.h$a */
    public class C117808a extends C118080q.C118093j {
        public C117808a(C117807h hVar, double d, double d2) {
            super(d, d2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:89|90|91|92|93|94|95|96|97|98) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:41|42|43|44|45|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0246, code lost:
        r7 = r31;
        r2 = r32;
        r3 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0245, code lost:
        r0 = e;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x010a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0225 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x0238 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r32, org.json.JSONObject r33, int r34) {
        /*
            r31 = this;
            r7 = r31
            r8 = r32
            r0 = r33
            r9 = r34
            java.lang.Class<zi0.b> r10 = zi0.C91759b.class
            java.lang.String r11 = "segmentTexts"
            java.lang.String r12 = "colorList"
            java.lang.String r1 = "lines"
            java.lang.String r13 = ""
            super.mo1505u(r32, r33, r34)
            java.lang.String r14 = "MicroMsg.JsApiAddMapLines"
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            java.lang.String r0 = "fail:invalid data"
            java.lang.String r0 = r7.mo115109j(r0)
            r8.mo109647a(r9, r0)
            return
        L_0x0028:
            r15 = 1
            java.lang.Object[] r2 = new java.lang.Object[r15]
            r5 = 0
            r2[r5] = r0
            java.lang.String r3 = "data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r2)
            pl0.q r6 = r31.mo182577y(r32, r33)
            if (r6 != 0) goto L_0x0048
            java.lang.String r0 = "mapView is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            java.lang.String r0 = "fail:mapview is null"
            java.lang.String r0 = r7.mo115109j(r0)
            r8.mo109647a(r9, r0)
            return
        L_0x0048:
            boolean r2 = r0.has(r1)     // Catch:{ Exception -> 0x03a4 }
            if (r2 == 0) goto L_0x0376
            java.lang.String r2 = "clear"
            boolean r2 = r0.optBoolean(r2, r15)     // Catch:{ Exception -> 0x036d }
            if (r2 == 0) goto L_0x0059
            r6.mo182867p()     // Catch:{ Exception -> 0x03a4 }
        L_0x0059:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x036d }
            java.lang.String r0 = r0.optString(r1)     // Catch:{ Exception -> 0x036d }
            r3.<init>(r0)     // Catch:{ Exception -> 0x036d }
            r0 = 0
        L_0x0063:
            int r1 = r3.length()     // Catch:{ Exception -> 0x036d }
            if (r0 >= r1) goto L_0x036a
            java.lang.Object r1 = r3.get(r0)     // Catch:{ Exception -> 0x036d }
            r4 = r1
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ Exception -> 0x036d }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x036d }
            r2.<init>()     // Catch:{ Exception -> 0x036d }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x036d }
            java.lang.String r5 = "points"
            java.lang.String r5 = r4.optString(r5)     // Catch:{ Exception -> 0x036d }
            r1.<init>(r5)     // Catch:{ Exception -> 0x036d }
            r5 = 0
        L_0x0081:
            int r15 = r1.length()     // Catch:{ Exception -> 0x036d }
            if (r5 >= r15) goto L_0x00da
            org.json.JSONObject r15 = r1.getJSONObject(r5)     // Catch:{ Exception -> 0x00d2 }
            r33 = r1
            java.lang.String r1 = "latitude"
            java.lang.String r1 = r15.optString(r1)     // Catch:{ Exception -> 0x00d2 }
            r18 = r2
            r17 = r3
            r2 = 0
            double r19 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r1, r2)     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r1 = "longitude"
            java.lang.String r1 = r15.optString(r1)     // Catch:{ Exception -> 0x00d2 }
            double r21 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r1, r2)     // Catch:{ Exception -> 0x00d2 }
            ol0.h$a r15 = new ol0.h$a     // Catch:{ Exception -> 0x00d2 }
            r23 = r33
            r1 = r15
            r3 = r18
            r2 = r31
            r7 = r3
            r9 = r4
            r3 = r19
            r16 = r5
            r24 = r6
            r8 = 0
            r5 = r21
            r1.<init>(r2, r3, r5)     // Catch:{ Exception -> 0x018d }
            r7.add(r15)     // Catch:{ Exception -> 0x018d }
            int r5 = r16 + 1
            r8 = r32
            r2 = r7
            r4 = r9
            r3 = r17
            r1 = r23
            r6 = r24
            r7 = r31
            r9 = r34
            goto L_0x0081
        L_0x00d2:
            r0 = move-exception
            r7 = r31
            r2 = r32
            r4 = r6
            goto L_0x03a7
        L_0x00da:
            r7 = r2
            r17 = r3
            r9 = r4
            r24 = r6
            r8 = 0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0364 }
            r1.<init>()     // Catch:{ Exception -> 0x0364 }
            boolean r2 = r9.has(r12)     // Catch:{ Exception -> 0x0364 }
            java.lang.String r3 = "#000000"
            if (r2 == 0) goto L_0x0197
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x018d }
            java.lang.String r4 = r9.optString(r12)     // Catch:{ Exception -> 0x018d }
            r2.<init>(r4)     // Catch:{ Exception -> 0x018d }
            r5 = 0
        L_0x00f8:
            int r4 = r2.length()     // Catch:{ Exception -> 0x018d }
            if (r5 >= r4) goto L_0x0114
            java.lang.String r4 = r2.getString(r5)     // Catch:{ Exception -> 0x018d }
            int r6 = android.graphics.Color.parseColor(r3)     // Catch:{ Exception -> 0x018d }
            int r6 = js0.C88020k.m109562m(r4)     // Catch:{ Exception -> 0x010a }
        L_0x010a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x018d }
            r1.add(r4)     // Catch:{ Exception -> 0x018d }
            int r5 = r5 + 1
            goto L_0x00f8
        L_0x0114:
            int r2 = r1.size()     // Catch:{ Exception -> 0x018d }
            if (r2 <= 0) goto L_0x0156
            int r2 = r1.size()     // Catch:{ Exception -> 0x018d }
            int r4 = r7.size()     // Catch:{ Exception -> 0x018d }
            r5 = 1
            int r4 = r4 - r5
            if (r2 >= r4) goto L_0x0156
            int r2 = r1.size()     // Catch:{ Exception -> 0x014b }
            int r2 = r2 - r5
            java.lang.Object r2 = r1.get(r2)     // Catch:{ Exception -> 0x018d }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x018d }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x018d }
            int r4 = r1.size()     // Catch:{ Exception -> 0x018d }
        L_0x0139:
            int r5 = r7.size()     // Catch:{ Exception -> 0x018d }
            r6 = 1
            int r5 = r5 - r6
            if (r4 >= r5) goto L_0x017a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x018d }
            r1.add(r5)     // Catch:{ Exception -> 0x018d }
            int r4 = r4 + 1
            goto L_0x0139
        L_0x014b:
            r0 = move-exception
            r7 = r31
            r2 = r32
            r3 = r14
            r4 = r24
            r1 = 0
            goto L_0x03aa
        L_0x0156:
            int r2 = r1.size()     // Catch:{ Exception -> 0x018d }
            int r4 = r7.size()     // Catch:{ Exception -> 0x018d }
            if (r2 <= r4) goto L_0x017a
            int r2 = r7.size()     // Catch:{ Exception -> 0x018d }
            if (r2 <= 0) goto L_0x017a
            int r2 = r1.size()     // Catch:{ Exception -> 0x018d }
            r4 = 1
            int r2 = r2 - r4
        L_0x016c:
            int r5 = r7.size()     // Catch:{ Exception -> 0x018d }
            int r5 = r5 - r4
            if (r2 <= r5) goto L_0x017a
            r1.remove(r2)     // Catch:{ Exception -> 0x018d }
            int r2 = r2 + -1
            r4 = 1
            goto L_0x016c
        L_0x017a:
            java.lang.String r2 = "colorList size:%d "
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x018d }
            int r4 = r1.size()     // Catch:{ Exception -> 0x018d }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x018d }
            r5[r8] = r4     // Catch:{ Exception -> 0x018d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r2, r5)     // Catch:{ Exception -> 0x018d }
            goto L_0x0197
        L_0x018d:
            r0 = move-exception
            r7 = r31
            r2 = r32
            r3 = r14
        L_0x0193:
            r4 = r24
            goto L_0x03a8
        L_0x0197:
            java.lang.String r2 = "id"
            java.lang.String r2 = r9.optString(r2)     // Catch:{ Exception -> 0x0364 }
            java.lang.String r4 = "color"
            java.lang.String r4 = r9.optString(r4, r13)     // Catch:{ Exception -> 0x0364 }
            int r5 = android.graphics.Color.parseColor(r3)     // Catch:{ Exception -> 0x0364 }
            int r5 = js0.C88020k.m109562m(r4)     // Catch:{ Exception -> 0x01ab }
        L_0x01ab:
            java.lang.String r4 = "style"
            r6 = -1
            int r4 = r9.optInt(r4, r6)     // Catch:{ Exception -> 0x0364 }
            java.lang.String r6 = "width"
            int r6 = js0.C88020k.m109560k(r9, r6, r8)     // Catch:{ Exception -> 0x0364 }
            java.lang.String r15 = "dottedLine"
            boolean r15 = r9.optBoolean(r15, r8)     // Catch:{ Exception -> 0x0364 }
            java.lang.String r8 = "borderColor"
            java.lang.String r8 = r9.optString(r8, r13)     // Catch:{ Exception -> 0x0364 }
            int r18 = android.graphics.Color.parseColor(r3)     // Catch:{ Exception -> 0x0364 }
            int r18 = js0.C88020k.m109562m(r8)     // Catch:{ Exception -> 0x01ce }
        L_0x01ce:
            r8 = r18
            r18 = r12
            java.lang.String r12 = "borderWidth"
            r19 = r14
            r14 = 0
            int r12 = js0.C88020k.m109560k(r9, r12, r14)     // Catch:{ Exception -> 0x0358 }
            r20 = r0
            java.lang.String r0 = "arrowLine"
            boolean r0 = r9.optBoolean(r0, r14)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r14 = "arrowIconPath"
            java.lang.String r14 = r9.optString(r14, r13)     // Catch:{ Exception -> 0x0358 }
            r33 = r14
            java.lang.String r14 = "revisedArrowIconPath"
            java.lang.String r14 = r9.optString(r14, r13)     // Catch:{ Exception -> 0x0358 }
            r21 = r14
            java.lang.String r14 = "arrowGap"
            r22 = r10
            r10 = 0
            int r14 = js0.C88020k.m109560k(r9, r14, r10)     // Catch:{ Exception -> 0x0358 }
            java.lang.String r10 = "level"
            java.lang.String r10 = r9.optString(r10)     // Catch:{ Exception -> 0x0358 }
            r23 = 0
            r25 = r10
            java.lang.String r10 = "textStyle"
            boolean r10 = r9.has(r10)     // Catch:{ Exception -> 0x0358 }
            if (r10 == 0) goto L_0x024e
            pl0.q$l$b r10 = new pl0.q$l$b     // Catch:{ Exception -> 0x0245 }
            r10.<init>()     // Catch:{ Exception -> 0x0245 }
            r26 = r14
            java.lang.String r14 = "textColor"
            java.lang.String r14 = r9.optString(r14, r13)     // Catch:{ Exception -> 0x0245 }
            int r3 = android.graphics.Color.parseColor(r3)     // Catch:{ Exception -> 0x0245 }
            int r3 = js0.C88020k.m109562m(r14)     // Catch:{ Exception -> 0x0225 }
        L_0x0225:
            r10.f353048a = r3     // Catch:{ Exception -> 0x0245 }
            java.lang.String r3 = "strokeColor"
            java.lang.String r3 = r9.optString(r3, r13)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r14 = "#FFFFFF"
            int r14 = android.graphics.Color.parseColor(r14)     // Catch:{ Exception -> 0x0245 }
            int r14 = js0.C88020k.m109562m(r3)     // Catch:{ Exception -> 0x0238 }
        L_0x0238:
            r10.f353049b = r14     // Catch:{ Exception -> 0x0245 }
            java.lang.String r3 = "fontSize"
            r14 = 14
            int r3 = r9.optInt(r3, r14)     // Catch:{ Exception -> 0x0245 }
            r10.f353050c = r3     // Catch:{ Exception -> 0x0245 }
            goto L_0x0252
        L_0x0245:
            r0 = move-exception
            r7 = r31
            r2 = r32
            r3 = r19
            goto L_0x0193
        L_0x024e:
            r26 = r14
            r10 = r23
        L_0x0252:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0358 }
            r3.<init>()     // Catch:{ Exception -> 0x0358 }
            boolean r14 = r9.has(r11)     // Catch:{ Exception -> 0x0358 }
            if (r14 == 0) goto L_0x02ab
            org.json.JSONArray r14 = new org.json.JSONArray     // Catch:{ Exception -> 0x0245 }
            r23 = r13
            java.lang.String r13 = r9.optString(r11)     // Catch:{ Exception -> 0x0245 }
            r14.<init>(r13)     // Catch:{ Exception -> 0x0245 }
            r27 = r11
            r13 = 0
        L_0x026b:
            int r11 = r14.length()     // Catch:{ Exception -> 0x0245 }
            if (r13 >= r11) goto L_0x02a6
            org.json.JSONObject r11 = r14.getJSONObject(r13)     // Catch:{ Exception -> 0x0245 }
            r28 = r14
            pl0.q$l$a r14 = new pl0.q$l$a     // Catch:{ Exception -> 0x0245 }
            r14.<init>()     // Catch:{ Exception -> 0x0245 }
            r29 = r10
            java.lang.String r10 = "name"
            java.lang.String r10 = r11.optString(r10)     // Catch:{ Exception -> 0x0245 }
            r14.f353045a = r10     // Catch:{ Exception -> 0x0245 }
            java.lang.String r10 = "startIndex"
            r30 = r12
            r12 = 0
            int r10 = r11.optInt(r10, r12)     // Catch:{ Exception -> 0x0245 }
            r14.f353046b = r10     // Catch:{ Exception -> 0x0245 }
            java.lang.String r10 = "endIndex"
            int r10 = r11.optInt(r10, r12)     // Catch:{ Exception -> 0x0245 }
            r14.f353047c = r10     // Catch:{ Exception -> 0x0245 }
            r3.add(r14)     // Catch:{ Exception -> 0x0245 }
            int r13 = r13 + 1
            r14 = r28
            r10 = r29
            r12 = r30
            goto L_0x026b
        L_0x02a6:
            r29 = r10
            r30 = r12
            goto L_0x02b3
        L_0x02ab:
            r29 = r10
            r27 = r11
            r30 = r12
            r23 = r13
        L_0x02b3:
            pl0.q$l r10 = new pl0.q$l     // Catch:{ Exception -> 0x0358 }
            r10.<init>()     // Catch:{ Exception -> 0x0358 }
            r10.f353026a = r2     // Catch:{ Exception -> 0x0358 }
            r10.f353038m = r4     // Catch:{ Exception -> 0x0358 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0358 }
            r2.<init>()     // Catch:{ Exception -> 0x0358 }
            r10.f353027b = r2     // Catch:{ Exception -> 0x0358 }
            r2.addAll(r7)     // Catch:{ Exception -> 0x0358 }
            r10.f353040o = r1     // Catch:{ Exception -> 0x0358 }
            java.lang.String r1 = "enableGradient"
            r2 = 0
            boolean r1 = r9.optBoolean(r1, r2)     // Catch:{ Exception -> 0x0358 }
            r10.f353042q = r1     // Catch:{ Exception -> 0x0358 }
            r10.f353028c = r5     // Catch:{ Exception -> 0x0358 }
            r10.f353029d = r6     // Catch:{ Exception -> 0x0358 }
            r10.f353030e = r15     // Catch:{ Exception -> 0x0358 }
            r10.f353031f = r8     // Catch:{ Exception -> 0x0358 }
            r1 = r30
            r10.f353032g = r1     // Catch:{ Exception -> 0x0358 }
            r10.f353033h = r0     // Catch:{ Exception -> 0x0358 }
            r1 = r26
            r10.f353039n = r1     // Catch:{ Exception -> 0x0358 }
            r2 = r32
            if (r0 == 0) goto L_0x0310
            r0 = r22
            r1 = 0
            ra.b r4 = r2.mo109668l(r0)     // Catch:{ Exception -> 0x0307 }
            zi0.b r4 = (zi0.C91759b) r4     // Catch:{ Exception -> 0x0307 }
            r5 = r33
            java.lang.String r4 = r4.mo115838nO(r2, r5)     // Catch:{ Exception -> 0x0307 }
            r10.f353034i = r4     // Catch:{ Exception -> 0x0307 }
            ra.b r4 = r2.mo109668l(r0)     // Catch:{ Exception -> 0x0307 }
            zi0.b r4 = (zi0.C91759b) r4     // Catch:{ Exception -> 0x0307 }
            r5 = r21
            java.lang.String r4 = r4.mo115838nO(r2, r5)     // Catch:{ Exception -> 0x0307 }
            r10.f353035j = r4     // Catch:{ Exception -> 0x0307 }
            goto L_0x0313
        L_0x0307:
            r0 = move-exception
            r7 = r31
            r3 = r19
            r4 = r24
            goto L_0x03a9
        L_0x0310:
            r0 = r22
            r1 = 0
        L_0x0313:
            java.lang.String r4 = "buildingId"
            java.lang.String r4 = r9.optString(r4)     // Catch:{ Exception -> 0x0354 }
            java.lang.String r5 = "floorName"
            java.lang.String r5 = r9.optString(r5)     // Catch:{ Exception -> 0x0354 }
            r10.f353036k = r4     // Catch:{ Exception -> 0x0354 }
            r10.f353037l = r5     // Catch:{ Exception -> 0x0354 }
            r4 = r25
            r10.f353041p = r4     // Catch:{ Exception -> 0x0354 }
            r4 = r29
            r10.f353043r = r4     // Catch:{ Exception -> 0x0354 }
            r10.f353044s = r3     // Catch:{ Exception -> 0x0354 }
            java.lang.Class<zi0.a> r3 = zi0.C91755a.class
            ra.b r3 = r2.mo109668l(r3)     // Catch:{ Exception -> 0x0354 }
            zi0.a r3 = (zi0.C91755a) r3     // Catch:{ Exception -> 0x0354 }
            r4 = r24
            r4.mo182886w(r10, r3)     // Catch:{ Exception -> 0x0352 }
            int r3 = r20 + 1
            r7 = r31
            r9 = r34
            r10 = r0
            r8 = r2
            r0 = r3
            r6 = r4
            r3 = r17
            r12 = r18
            r14 = r19
            r13 = r23
            r11 = r27
            r5 = 0
            r15 = 1
            goto L_0x0063
        L_0x0352:
            r0 = move-exception
            goto L_0x035e
        L_0x0354:
            r0 = move-exception
            r4 = r24
            goto L_0x035e
        L_0x0358:
            r0 = move-exception
            r2 = r32
            r4 = r24
            r1 = 0
        L_0x035e:
            r5 = 1
            r7 = r31
            r3 = r19
            goto L_0x03aa
        L_0x0364:
            r0 = move-exception
            r2 = r32
            r4 = r24
            goto L_0x0370
        L_0x036a:
            r4 = r6
            r2 = r8
            goto L_0x0382
        L_0x036d:
            r0 = move-exception
            r4 = r6
            r2 = r8
        L_0x0370:
            r1 = 0
            r5 = 1
            r7 = r31
            r3 = r14
            goto L_0x03aa
        L_0x0376:
            r4 = r6
            r2 = r8
            r19 = r14
            r1 = 0
            java.lang.String r0 = "data has not lines info"
            r3 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ Exception -> 0x039a }
        L_0x0382:
            java.lang.String r0 = "ok"
            r7 = r31
            java.lang.String r0 = r7.mo115109j(r0)
            r5 = 1
            boolean r6 = r4.mo182849h()
            r1 = r31
            r2 = r32
            r3 = r34
            r4 = r0
            r1.mo182575w(r2, r3, r4, r5, r6)
            return
        L_0x039a:
            r0 = move-exception
            r7 = r31
            goto L_0x03a9
        L_0x039e:
            r0 = move-exception
            r7 = r31
            r3 = r19
            goto L_0x03a9
        L_0x03a4:
            r0 = move-exception
            r4 = r6
            r2 = r8
        L_0x03a7:
            r3 = r14
        L_0x03a8:
            r1 = 0
        L_0x03a9:
            r5 = 1
        L_0x03aa:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r0
            java.lang.String r0 = "parse lines error, exception : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r5)
            java.lang.String r0 = "fail:internal error"
            java.lang.String r0 = r7.mo115109j(r0)
            r5 = 0
            boolean r6 = r4.mo182849h()
            r1 = r31
            r2 = r32
            r3 = r34
            r4 = r0
            r1.mo182575w(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ol0.C117807h.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
