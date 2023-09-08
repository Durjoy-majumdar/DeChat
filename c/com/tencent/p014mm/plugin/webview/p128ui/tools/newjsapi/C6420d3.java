package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C17928i;
import com.tencent.xweb.util.WXWebReporter;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.d3 */
public final class C6420d3 extends C15053a {

    /* renamed from: d */
    public static final C6420d3 f23418d = new C6420d3();

    /* renamed from: e */
    public static final String f23419e = "MicroMsg.JsApiShowDatePickerView";

    /* renamed from: f */
    public static final int f23420f = WXWebReporter.KEY_TRY_FIX_DEX_FAILED;

    /* renamed from: g */
    public static final String f23421g = C17928i.NAME;

    /* JADX WARNING: Removed duplicated region for block: B:102:0x046b A[Catch:{ Exception -> 0x0502 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0496 A[Catch:{ Exception -> 0x0502 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0499 A[Catch:{ Exception -> 0x0502 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x04b5 A[Catch:{ Exception -> 0x0502 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x04dc A[Catch:{ Exception -> 0x0502 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0404 A[Catch:{ Exception -> 0x0502 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x042e A[Catch:{ Exception -> 0x0502 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r26, t83.C13851h1 r27) {
        /*
            r25 = this;
            r1 = r26
            r2 = r27
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r3 = "mode"
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = "time"
            boolean r0 = gy3.C87412m.m108589b(r3, r0)
            r11 = 1
            r12 = 0
            java.lang.String r13 = "from(context).inflate(R.…cker_header_layout, null)"
            r14 = 2131496078(0x7f0c0c8e, float:1.861571E38)
            java.lang.String r15 = "headerText"
            java.lang.String r7 = ":fail, context error"
            java.lang.String r8 = "context error!"
            java.lang.String r5 = "end"
            java.lang.String r3 = "start"
            java.lang.String r9 = "range"
            java.lang.String r4 = "current"
            if (r0 == 0) goto L_0x0353
            java.lang.String r0 = f23419e
            java.lang.String r6 = "doShowTimePicker"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r6)
            java.util.Map<java.lang.String, java.lang.Object> r6 = r2.f38983a
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r6 = r6.get(r9)
            java.lang.String r6 = (java.lang.String) r6
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r16 = 2147483647(0x7fffffff, float:NaN)
            if (r9 != 0) goto L_0x007b
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>(r6)
            java.lang.String r3 = r9.optString(r3)
            java.lang.String r5 = r9.optString(r5)
            int[] r3 = vt0.C15009n.m14190b(r3)
            if (r3 == 0) goto L_0x006b
            r6 = r3[r12]
            r3 = r3[r11]
            goto L_0x006d
        L_0x006b:
            r3 = -1
            r6 = -1
        L_0x006d:
            int[] r5 = vt0.C15009n.m14190b(r5)
            if (r5 == 0) goto L_0x007d
            r16 = r5[r12]
            r5 = r5[r11]
            r9 = r5
            r5 = r16
            goto L_0x0083
        L_0x007b:
            r3 = -1
            r6 = -1
        L_0x007d:
            r5 = 2147483647(0x7fffffff, float:NaN)
            r9 = 2147483647(0x7fffffff, float:NaN)
        L_0x0083:
            if (r6 >= 0) goto L_0x0086
            r6 = 0
        L_0x0086:
            if (r3 >= 0) goto L_0x0089
            r3 = 0
        L_0x0089:
            r10 = 23
            if (r5 <= r10) goto L_0x008f
            r5 = 23
        L_0x008f:
            r10 = 59
            if (r9 <= r10) goto L_0x0095
            r9 = 59
        L_0x0095:
            java.util.Map<java.lang.String, java.lang.Object> r10 = r2.f38983a
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.Object r4 = r10.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            int[] r4 = vt0.C15009n.m14190b(r4)
            if (r4 == 0) goto L_0x00aa
            r10 = r4[r12]
            r4 = r4[r11]
            goto L_0x00ac
        L_0x00aa:
            r4 = -1
            r10 = -1
        L_0x00ac:
            android.content.Context r11 = r1.f38998a
            if (r11 == 0) goto L_0x0335
            boolean r12 = r11 instanceof android.app.Activity
            if (r12 != 0) goto L_0x00b6
            goto L_0x0335
        L_0x00b6:
            com.tencent.mm.ui.widget.picker.n r0 = new com.tencent.mm.ui.widget.picker.n
            r0.<init>(r11)
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.c3 r7 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.c3
            r7.<init>(r0, r1, r2)
            r0.f24895o = r7
            com.tencent.mm.ui.widget.picker.CustomTimePickerNew r1 = r0.f24894n
            if (r1 == 0) goto L_0x00ca
            r1.f24848n = r10
            r1.f24849o = r4
        L_0x00ca:
            if (r1 == 0) goto L_0x00d0
            r1.f24846i = r5
            r1.f24847j = r9
        L_0x00d0:
            if (r1 == 0) goto L_0x00d6
            r1.f24844g = r6
            r1.f24845h = r3
        L_0x00d6:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.f38983a
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r15)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x00e5
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00e6
        L_0x00e5:
            r1 = 0
        L_0x00e6:
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r11)
            r3 = 0
            android.view.View r2 = r2.inflate(r14, r3)
            gy3.C87412m.m108593f(r2, r13)
            r3 = 2131306847(0x7f09295f, float:1.8231905E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r4 != 0) goto L_0x0128
            r4 = 0
            r3.setVisibility(r4)
            r3.setText(r1)
            android.widget.LinearLayout r1 = r0.f24893j
            if (r1 == 0) goto L_0x012d
            r1.setVisibility(r4)
            android.widget.LinearLayout r1 = r0.f24893j
            r1.removeAllViews()
            android.widget.LinearLayout r1 = r0.f24893j
            r3 = 17
            r1.setGravity(r3)
            android.widget.LinearLayout r1 = r0.f24893j
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r5 = -1
            r3.<init>(r5, r4)
            r1.addView(r2, r3)
            goto L_0x012d
        L_0x0128:
            r1 = 8
            r3.setVisibility(r1)
        L_0x012d:
            com.google.android.material.bottomsheet.a r1 = r0.f24887d
            if (r1 == 0) goto L_0x052f
            com.tencent.mm.ui.widget.picker.CustomTimePickerNew r1 = r0.f24894n
            if (r1 == 0) goto L_0x032e
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            int r3 = r1.f24848n
            r4 = 11
            r2.set(r4, r3)
            int r3 = r1.f24849o
            r5 = 12
            r2.set(r5, r3)
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            int r6 = r1.f24844g
            r3.set(r4, r6)
            int r6 = r1.f24845h
            r3.set(r5, r6)
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            int r7 = r1.f24846i
            r6.set(r4, r7)
            int r4 = r1.f24847j
            r6.set(r5, r4)
            of0.b r4 = new of0.b
            android.content.Context r5 = r1.f24843f
            com.tencent.mm.ui.widget.picker.c r7 = new com.tencent.mm.ui.widget.picker.c
            r7.<init>(r1)
            r4.<init>(r5, r7)
            r5 = 6
            boolean[] r5 = new boolean[r5]
            r5 = {0, 0, 0, 1, 1, 0} // fill-array
            pf0.a r7 = r4.f61767a
            r7.f62190g = r5
            r7.f62191h = r2
            r7.f62192i = r3
            r7.f62193j = r6
            r2 = 0
            r7.f62189f = r2
            android.content.Context r2 = r1.f24843f
            r3 = 2131099659(0x7f06000b, float:1.7811677E38)
            int r2 = p385u2.C111105a.m151500b(r2, r3)
            pf0.a r3 = r4.f61767a
            r3.f62195l = r2
            rf0.d r2 = r1.f24842e
            r4.mo34202a(r2)
            rf0.d r2 = r1.f24842e
            android.content.Context r3 = r1.f24843f
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131166019(0x7f070343, float:1.7946272E38)
            int r3 = r3.getDimensionPixelSize(r4)
            float r3 = (float) r3
            r2.mo35392h(r3)
            rf0.d r2 = r1.f24842e
            android.content.Context r3 = r1.f24843f
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165337(0x7f070099, float:1.7944888E38)
            r3.getDimensionPixelSize(r4)
            rf0.j r2 = r2.f62981p
            r2.getClass()
            rf0.d r2 = r1.f24842e
            android.content.Context r3 = r1.f24843f
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r3 = r3.getDimensionPixelSize(r4)
            android.content.Context r5 = r1.f24843f
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelSize(r4)
            r6 = 0
            r2.mo35393i(r6, r3, r6, r5)
            rf0.d r2 = r1.f24842e
            java.util.List r2 = r2.mo35390f()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x01e3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0217
            java.lang.Object r3 = r2.next()
            com.tencent.mm.picker.base.view.WheelView r3 = (com.tencent.p014mm.picker.base.view.WheelView) r3
            android.content.Context r5 = r1.f24843f
            r6 = 2131099682(0x7f060022, float:1.7811724E38)
            int r5 = p385u2.C111105a.m151500b(r5, r6)
            r3.mo22032e(r5)
            android.content.Context r5 = r1.f24843f
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelSize(r4)
            r3.f49141d = r5
            r3.invalidate()
            android.content.Context r5 = r1.f24843f
            r6 = 2131099654(0x7f060006, float:1.7811667E38)
            int r5 = p385u2.C111105a.m151500b(r5, r6)
            r3.setBackgroundColor(r5)
            goto L_0x01e3
        L_0x0217:
            rf0.d r2 = r1.f24842e
            java.util.List r2 = r2.mo35390f()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r5 = 1
            if (r3 != r5) goto L_0x0246
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.tencent.mm.picker.base.view.WheelView r2 = (com.tencent.p014mm.picker.base.view.WheelView) r2
            android.content.Context r5 = r1.f24843f
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelSize(r4)
            android.content.Context r1 = r1.f24843f
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getDimensionPixelSize(r4)
            r2.setPadding(r3, r5, r3, r1)
            goto L_0x032e
        L_0x0246:
            r3 = 0
            int r5 = r2.size()
            r6 = 2
            if (r5 != r6) goto L_0x02a0
            java.lang.Object r5 = r2.get(r3)
            com.tencent.mm.picker.base.view.WheelView r5 = (com.tencent.p014mm.picker.base.view.WheelView) r5
            android.content.Context r6 = r1.f24843f
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getDimensionPixelSize(r4)
            android.content.Context r7 = r1.f24843f
            android.content.res.Resources r7 = r7.getResources()
            int r7 = r7.getDimensionPixelSize(r4)
            android.content.Context r8 = r1.f24843f
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getDimensionPixelSize(r4)
            r5.setPadding(r3, r6, r7, r8)
            r3 = 1
            java.lang.Object r2 = r2.get(r3)
            com.tencent.mm.picker.base.view.WheelView r2 = (com.tencent.p014mm.picker.base.view.WheelView) r2
            android.content.Context r3 = r1.f24843f
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getDimensionPixelSize(r4)
            android.content.Context r5 = r1.f24843f
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelSize(r4)
            android.content.Context r1 = r1.f24843f
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getDimensionPixelSize(r4)
            r6 = 0
            r2.setPadding(r3, r5, r6, r1)
            goto L_0x032e
        L_0x02a0:
            r6 = 0
            int r3 = r2.size()
            r5 = 3
            if (r3 != r5) goto L_0x032e
            java.lang.Object r3 = r2.get(r6)
            com.tencent.mm.picker.base.view.WheelView r3 = (com.tencent.p014mm.picker.base.view.WheelView) r3
            android.content.Context r5 = r1.f24843f
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelSize(r4)
            android.content.Context r6 = r1.f24843f
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131165281(0x7f070061, float:1.7944775E38)
            int r6 = r6.getDimensionPixelSize(r7)
            android.content.Context r8 = r1.f24843f
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getDimensionPixelSize(r4)
            r9 = 0
            r3.setPadding(r9, r5, r6, r8)
            r3 = 1
            java.lang.Object r5 = r2.get(r3)
            com.tencent.mm.picker.base.view.WheelView r5 = (com.tencent.p014mm.picker.base.view.WheelView) r5
            android.content.Context r3 = r1.f24843f
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getDimensionPixelSize(r7)
            android.content.Context r6 = r1.f24843f
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getDimensionPixelSize(r4)
            android.content.Context r8 = r1.f24843f
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getDimensionPixelSize(r7)
            android.content.Context r9 = r1.f24843f
            android.content.res.Resources r9 = r9.getResources()
            int r9 = r9.getDimensionPixelSize(r4)
            r5.setPadding(r3, r6, r8, r9)
            r3 = 2
            java.lang.Object r2 = r2.get(r3)
            com.tencent.mm.picker.base.view.WheelView r2 = (com.tencent.p014mm.picker.base.view.WheelView) r2
            android.content.Context r3 = r1.f24843f
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getDimensionPixelSize(r7)
            android.content.Context r5 = r1.f24843f
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelSize(r4)
            android.content.Context r1 = r1.f24843f
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getDimensionPixelSize(r4)
            r4 = 0
            r2.setPadding(r3, r5, r4, r1)
        L_0x032e:
            com.google.android.material.bottomsheet.a r0 = r0.f24887d
            r0.show()
            goto L_0x052f
        L_0x0335:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r8)
            t83.g r0 = r1.f39001d
            java.lang.String r1 = r2.f38990c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.f38996i
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
            r3 = 0
            r0.mo10774a(r1, r2, r3)
            goto L_0x052f
        L_0x0353:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            java.lang.String r6 = "-"
            java.lang.String r10 = f23419e
            java.lang.String r11 = "doShowDatePicker"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r11)
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            java.lang.String r12 = "yyyy-MM-dd"
            r11.<init>(r12)
            java.util.Map<java.lang.String, java.lang.Object> r12 = r2.f38983a     // Catch:{ Exception -> 0x0502 }
            java.util.HashMap r12 = (java.util.HashMap) r12     // Catch:{ Exception -> 0x0502 }
            java.lang.Object r4 = r12.get(r4)     // Catch:{ Exception -> 0x0502 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0502 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x0502 }
            if (r12 == 0) goto L_0x0382
            long r18 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0502 }
            java.lang.Long r4 = java.lang.Long.valueOf(r18)     // Catch:{ Exception -> 0x0502 }
            java.lang.String r4 = r11.format(r4)     // Catch:{ Exception -> 0x0502 }
        L_0x0382:
            java.util.Map<java.lang.String, java.lang.Object> r12 = r2.f38983a     // Catch:{ Exception -> 0x0502 }
            java.util.HashMap r12 = (java.util.HashMap) r12     // Catch:{ Exception -> 0x0502 }
            java.lang.Object r9 = r12.get(r9)     // Catch:{ Exception -> 0x0502 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0502 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ Exception -> 0x0502 }
            if (r12 != 0) goto L_0x03a4
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ Exception -> 0x0502 }
            r12.<init>(r9)     // Catch:{ Exception -> 0x0502 }
            java.lang.String r9 = "2013-01-01"
            java.lang.String r3 = r12.optString(r3, r9)     // Catch:{ Exception -> 0x0502 }
            java.lang.String r5 = r12.optString(r5, r4)     // Catch:{ Exception -> 0x0502 }
            r18 = r3
            goto L_0x03a7
        L_0x03a4:
            r5 = 0
            r18 = 0
        L_0x03a7:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.f38983a     // Catch:{ Exception -> 0x0502 }
            java.lang.String r9 = "fields"
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ Exception -> 0x0502 }
            java.lang.Object r3 = r3.get(r9)     // Catch:{ Exception -> 0x0502 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0502 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x0502 }
            java.lang.String r12 = "month"
            if (r9 == 0) goto L_0x03bc
            r3 = r12
        L_0x03bc:
            java.util.Calendar r9 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0502 }
            java.util.Date r4 = r11.parse(r4)     // Catch:{ Exception -> 0x0502 }
            r9.setTime(r4)     // Catch:{ Exception -> 0x0502 }
            android.content.Context r4 = r1.f38998a     // Catch:{ Exception -> 0x0502 }
            if (r4 == 0) goto L_0x04e5
            boolean r11 = r4 instanceof android.app.Activity     // Catch:{ Exception -> 0x0502 }
            if (r11 != 0) goto L_0x03d1
            goto L_0x04e5
        L_0x03d1:
            com.tencent.mm.ui.widget.picker.i r7 = new com.tencent.mm.ui.widget.picker.i     // Catch:{ Exception -> 0x0502 }
            r7.<init>(r4)     // Catch:{ Exception -> 0x0502 }
            r8 = 1
            int r10 = r9.get(r8)     // Catch:{ Exception -> 0x0502 }
            r11 = 2
            int r17 = r9.get(r11)     // Catch:{ Exception -> 0x0502 }
            int r11 = r17 + 1
            r8 = 5
            int r8 = r9.get(r8)     // Catch:{ Exception -> 0x0502 }
            r7.mo26533c(r10, r11, r8)     // Catch:{ Exception -> 0x0502 }
            java.lang.String r8 = "year"
            boolean r8 = gy3.C87412m.m108589b(r3, r8)     // Catch:{ Exception -> 0x0502 }
            if (r8 == 0) goto L_0x03f5
            r3 = 0
            goto L_0x03fc
        L_0x03f5:
            boolean r3 = gy3.C87412m.m108589b(r3, r12)     // Catch:{ Exception -> 0x0502 }
            if (r3 == 0) goto L_0x03fe
            r3 = 1
        L_0x03fc:
            r8 = 0
            goto L_0x0400
        L_0x03fe:
            r3 = 1
            r8 = 1
        L_0x0400:
            com.tencent.mm.ui.widget.picker.CustomDatePickerNew r9 = r7.f56637n     // Catch:{ Exception -> 0x0502 }
            if (r9 == 0) goto L_0x040b
            r9.f56579o = r8     // Catch:{ Exception -> 0x0502 }
            r9.f56580p = r3     // Catch:{ Exception -> 0x0502 }
            r3 = 1
            r9.f56581q = r3     // Catch:{ Exception -> 0x0502 }
        L_0x040b:
            gy3.C87412m.m108591d(r18)     // Catch:{ Exception -> 0x0502 }
            java.lang.String[] r19 = new java.lang.String[]{r6}     // Catch:{ Exception -> 0x0502 }
            r20 = 0
            r21 = 0
            r22 = 6
            r23 = 0
            java.util.List r3 = z04.C112550d0.m153785U(r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0502 }
            r8 = 0
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ Exception -> 0x0502 }
            java.lang.Object[] r3 = r3.toArray(r9)     // Catch:{ Exception -> 0x0502 }
            gy3.C87412m.m108592e(r3, r0)     // Catch:{ Exception -> 0x0502 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ Exception -> 0x0502 }
            int r8 = r3.length     // Catch:{ Exception -> 0x0502 }
            r9 = 3
            if (r8 < r9) goto L_0x0446
            r8 = 0
            r9 = r3[r8]     // Catch:{ Exception -> 0x0502 }
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r9)     // Catch:{ Exception -> 0x0502 }
            r9 = 1
            r10 = r3[r9]     // Catch:{ Exception -> 0x0502 }
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r10)     // Catch:{ Exception -> 0x0502 }
            r10 = 2
            r3 = r3[r10]     // Catch:{ Exception -> 0x0502 }
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)     // Catch:{ Exception -> 0x0502 }
            r7.mo26535e(r8, r9, r3)     // Catch:{ Exception -> 0x0502 }
        L_0x0446:
            gy3.C87412m.m108591d(r5)     // Catch:{ Exception -> 0x0502 }
            java.lang.String[] r20 = new java.lang.String[]{r6}     // Catch:{ Exception -> 0x0502 }
            r21 = 0
            r22 = 0
            r23 = 6
            r24 = 0
            r19 = r5
            java.util.List r3 = z04.C112550d0.m153785U(r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0502 }
            r5 = 0
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ Exception -> 0x0502 }
            java.lang.Object[] r3 = r3.toArray(r6)     // Catch:{ Exception -> 0x0502 }
            gy3.C87412m.m108592e(r3, r0)     // Catch:{ Exception -> 0x0502 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ Exception -> 0x0502 }
            int r0 = r3.length     // Catch:{ Exception -> 0x0502 }
            r5 = 3
            if (r0 < r5) goto L_0x0483
            r5 = 0
            r0 = r3[r5]     // Catch:{ Exception -> 0x0502 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)     // Catch:{ Exception -> 0x0502 }
            r5 = 1
            r6 = r3[r5]     // Catch:{ Exception -> 0x0502 }
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r6)     // Catch:{ Exception -> 0x0502 }
            r6 = 2
            r3 = r3[r6]     // Catch:{ Exception -> 0x0502 }
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)     // Catch:{ Exception -> 0x0502 }
            r7.mo26534d(r0, r5, r3)     // Catch:{ Exception -> 0x0502 }
        L_0x0483:
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.b3 r0 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.b3     // Catch:{ Exception -> 0x0502 }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x0502 }
            r7.f56638o = r0     // Catch:{ Exception -> 0x0502 }
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f38983a     // Catch:{ Exception -> 0x0502 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x0502 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x0502 }
            boolean r3 = r0 instanceof java.lang.String     // Catch:{ Exception -> 0x0502 }
            if (r3 == 0) goto L_0x0499
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0502 }
            goto L_0x049a
        L_0x0499:
            r0 = 0
        L_0x049a:
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r4)     // Catch:{ Exception -> 0x0502 }
            r4 = 0
            android.view.View r3 = r3.inflate(r14, r4)     // Catch:{ Exception -> 0x0502 }
            gy3.C87412m.m108593f(r3, r13)     // Catch:{ Exception -> 0x0502 }
            r4 = 2131306847(0x7f09295f, float:1.8231905E38)
            android.view.View r4 = r3.findViewById(r4)     // Catch:{ Exception -> 0x0502 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0502 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0502 }
            if (r5 != 0) goto L_0x04dc
            r5 = 0
            r4.setVisibility(r5)     // Catch:{ Exception -> 0x0502 }
            r4.setText(r0)     // Catch:{ Exception -> 0x0502 }
            android.widget.LinearLayout r0 = r7.f56636j     // Catch:{ Exception -> 0x0502 }
            if (r0 == 0) goto L_0x04e1
            r0.setVisibility(r5)     // Catch:{ Exception -> 0x0502 }
            android.widget.LinearLayout r0 = r7.f56636j     // Catch:{ Exception -> 0x0502 }
            r0.removeAllViews()     // Catch:{ Exception -> 0x0502 }
            android.widget.LinearLayout r0 = r7.f56636j     // Catch:{ Exception -> 0x0502 }
            r4 = 17
            r0.setGravity(r4)     // Catch:{ Exception -> 0x0502 }
            android.widget.LinearLayout r0 = r7.f56636j     // Catch:{ Exception -> 0x0502 }
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams     // Catch:{ Exception -> 0x0502 }
            r5 = -2
            r6 = -1
            r4.<init>(r6, r5)     // Catch:{ Exception -> 0x0502 }
            r0.addView(r3, r4)     // Catch:{ Exception -> 0x0502 }
            goto L_0x04e1
        L_0x04dc:
            r0 = 8
            r4.setVisibility(r0)     // Catch:{ Exception -> 0x0502 }
        L_0x04e1:
            r7.mo26536f()     // Catch:{ Exception -> 0x0502 }
            goto L_0x052f
        L_0x04e5:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r8)     // Catch:{ Exception -> 0x0502 }
            t83.g r0 = r1.f39001d     // Catch:{ Exception -> 0x0502 }
            java.lang.String r3 = r2.f38990c     // Catch:{ Exception -> 0x0502 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0502 }
            r4.<init>()     // Catch:{ Exception -> 0x0502 }
            java.lang.String r5 = r2.f38996i     // Catch:{ Exception -> 0x0502 }
            r4.append(r5)     // Catch:{ Exception -> 0x0502 }
            r4.append(r7)     // Catch:{ Exception -> 0x0502 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0502 }
            r5 = 0
            r0.mo10774a(r3, r4, r5)     // Catch:{ Exception -> 0x0502 }
            goto L_0x052f
        L_0x0502:
            r0 = move-exception
            java.lang.String r3 = f23419e
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r4 = 0
            r5[r4] = r0
            java.lang.String r0 = "doShowDatePicker ex: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r5)
            t83.g r0 = r1.f39001d
            java.lang.String r1 = r2.f38990c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r2.f38996i
            r3.append(r2)
            java.lang.String r2 = ":fail"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 0
            r0.mo10774a(r1, r2, r3)
        L_0x052f:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C6420d3.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23420f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23421g;
    }
}
