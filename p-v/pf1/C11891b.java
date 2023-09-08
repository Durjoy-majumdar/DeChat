package pf1;

/* renamed from: pf1.b */
public final class C11891b implements C11930y {
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        if ((r1 == null || r1.length() == 0) == false) goto L_0x0081;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public pf1.C11918p mo11778a(com.tencent.p014mm.protocal.protobuf.FinderJumpInfo r8) {
        /*
            r7 = this;
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = r8.ext_info
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "AdMutualCacheHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.String r0 = r8.ext_info
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = r8.ext_info
            java.lang.String r1 = "{}"
            boolean r0 = gy3.C87412m.m108589b(r1, r0)
            if (r0 == 0) goto L_0x0024
            goto L_0x0031
        L_0x0024:
            pf1.s r0 = new pf1.s
            c30.g r1 = new c30.g
            java.lang.String r2 = r8.ext_info
            r1.<init>((java.lang.String) r2)
            r0.<init>(r1)
            goto L_0x003b
        L_0x0031:
            pf1.s r0 = new pf1.s
            c30.g r1 = new c30.g
            r1.<init>()
            r0.<init>(r1)
        L_0x003b:
            java.lang.String r1 = r0.f34820c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x004a
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r1 = 0
            goto L_0x004b
        L_0x004a:
            r1 = 1
        L_0x004b:
            if (r1 != 0) goto L_0x0051
            java.lang.String r1 = r0.f34820c
            r8.icon_url = r1
        L_0x0051:
            java.lang.String r1 = r8.wording
            if (r1 == 0) goto L_0x005e
            int r1 = r1.length()
            if (r1 != 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r1 = 0
            goto L_0x005f
        L_0x005e:
            r1 = 1
        L_0x005f:
            if (r1 == 0) goto L_0x00d7
            java.lang.CharSequence r1 = r0.f34818a
            if (r1 == 0) goto L_0x006e
            int r1 = r1.length()
            if (r1 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r1 = 0
            goto L_0x006f
        L_0x006e:
            r1 = 1
        L_0x006f:
            if (r1 == 0) goto L_0x0081
            java.lang.CharSequence r1 = r0.f34819b
            if (r1 == 0) goto L_0x007e
            int r1 = r1.length()
            if (r1 != 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r1 = 0
            goto L_0x007f
        L_0x007e:
            r1 = 1
        L_0x007f:
            if (r1 != 0) goto L_0x00d7
        L_0x0081:
            pf1.d0 r1 = pf1.C62262d0.f176978a
            r1.getClass()
            java.lang.CharSequence r1 = r0.f34819b
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r1)
            java.lang.String r4 = ""
            if (r1 == 0) goto L_0x009c
            android.text.SpannableString r1 = new android.text.SpannableString
            java.lang.CharSequence r5 = r0.f34818a
            if (r5 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r4 = r5
        L_0x0098:
            r1.<init>(r4)
            goto L_0x00d1
        L_0x009c:
            java.lang.CharSequence r1 = r0.f34818a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r1)
            if (r1 == 0) goto L_0x00b0
            android.text.SpannableString r1 = new android.text.SpannableString
            java.lang.CharSequence r5 = r0.f34819b
            if (r5 != 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r4 = r5
        L_0x00ac:
            r1.<init>(r4)
            goto L_0x00d1
        L_0x00b0:
            android.text.SpannableString r1 = new android.text.SpannableString
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.CharSequence r6 = r0.f34818a
            r5.append(r6)
            java.lang.String r6 = ": "
            r5.append(r6)
            java.lang.CharSequence r6 = r0.f34819b
            if (r6 != 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r4 = r6
        L_0x00c7:
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.<init>(r4)
        L_0x00d1:
            java.lang.String r1 = r1.toString()
            r8.wording = r1
        L_0x00d7:
            java.lang.String r1 = r0.f34784g
            if (r1 == 0) goto L_0x00e4
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00e2
            goto L_0x00e4
        L_0x00e2:
            r1 = 0
            goto L_0x00e5
        L_0x00e4:
            r1 = 1
        L_0x00e5:
            if (r1 == 0) goto L_0x00f2
            com.tencent.mm.protocal.protobuf.Html5Info r1 = r8.html5_info
            if (r1 == 0) goto L_0x00ee
            java.lang.String r1 = r1.url
            goto L_0x00ef
        L_0x00ee:
            r1 = 0
        L_0x00ef:
            r0.f34784g = r1
            goto L_0x0121
        L_0x00f2:
            com.tencent.mm.protocal.protobuf.Html5Info r1 = r8.html5_info
            if (r1 != 0) goto L_0x00fd
            com.tencent.mm.protocal.protobuf.Html5Info r1 = new com.tencent.mm.protocal.protobuf.Html5Info
            r1.<init>()
            r8.html5_info = r1
        L_0x00fd:
            com.tencent.mm.protocal.protobuf.Html5Info r1 = r8.html5_info
            if (r1 == 0) goto L_0x0112
            java.lang.String r4 = r1.url
            if (r4 == 0) goto L_0x010b
            int r4 = r4.length()
            if (r4 != 0) goto L_0x010c
        L_0x010b:
            r2 = 1
        L_0x010c:
            if (r2 == 0) goto L_0x0112
            java.lang.String r2 = r0.f34784g
            r1.url = r2
        L_0x0112:
            com.tencent.mm.protocal.protobuf.NativeInfo r1 = r8.native_info
            if (r1 != 0) goto L_0x0121
            com.tencent.mm.protocal.protobuf.MiniAppInfo r1 = r8.mini_app_info
            if (r1 != 0) goto L_0x0121
            te3.ho2 r1 = r8.lite_app_info
            if (r1 != 0) goto L_0x0121
            r1 = 2
            r8.jumpinfo_type = r1
        L_0x0121:
            com.tencent.mm.protocal.protobuf.NativeInfo r8 = r8.native_info
            if (r8 == 0) goto L_0x0153
            java.lang.String r8 = r8.necessary_params
            if (r8 == 0) goto L_0x0153
            c30.g r1 = new c30.g     // Catch:{ JSONException -> 0x0149 }
            r1.<init>((java.lang.String) r8)     // Catch:{ JSONException -> 0x0149 }
            java.lang.String r8 = "uxinfo"
            java.lang.String r8 = r1.optString(r8)     // Catch:{ JSONException -> 0x0149 }
            java.lang.String r2 = "params.optString(Constan…r.AdInfoKeys.KEY_UX_INFO)"
            gy3.C87412m.m108593f(r8, r2)     // Catch:{ JSONException -> 0x0149 }
            r0.f34785h = r8     // Catch:{ JSONException -> 0x0149 }
            java.lang.String r8 = "canvas_id"
            java.lang.String r8 = r1.optString(r8)     // Catch:{ JSONException -> 0x0149 }
            long r1 = o40.C61926c.m72671P(r8)     // Catch:{ JSONException -> 0x0149 }
            r0.f34788k = r1     // Catch:{ JSONException -> 0x0149 }
            goto L_0x0153
        L_0x0149:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.String r1 = "Finder.JumperUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r8)
        L_0x0153:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C11891b.mo11778a(com.tencent.mm.protocal.protobuf.FinderJumpInfo):pf1.p");
    }
}
