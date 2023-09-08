package pf1;

/* renamed from: pf1.v */
public final class C11927v implements C11930y {
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        if ((r1 == null || r1.length() == 0) == false) goto L_0x0081;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public pf1.C11918p mo11778a(com.tencent.p014mm.protocal.protobuf.FinderJumpInfo r7) {
        /*
            r6 = this;
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = r7.ext_info
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "HardAdCacheHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.String r0 = r7.ext_info
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = r7.ext_info
            java.lang.String r1 = "{}"
            boolean r0 = gy3.C87412m.m108589b(r1, r0)
            if (r0 == 0) goto L_0x0024
            goto L_0x0031
        L_0x0024:
            pf1.o r0 = new pf1.o
            c30.g r1 = new c30.g
            java.lang.String r2 = r7.ext_info
            r1.<init>((java.lang.String) r2)
            r0.<init>(r1)
            goto L_0x003b
        L_0x0031:
            pf1.o r0 = new pf1.o
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
            r7.icon_url = r1
        L_0x0051:
            java.lang.String r1 = r7.wording
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
            if (r1 == 0) goto L_0x00ad
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
            if (r1 != 0) goto L_0x00ad
        L_0x0081:
            pf1.d0 r1 = pf1.C62262d0.f176978a
            r1.getClass()
            java.lang.CharSequence r1 = r0.f34818a
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r1)
            java.lang.String r4 = ""
            if (r1 == 0) goto L_0x009c
            android.text.SpannableString r1 = new android.text.SpannableString
            java.lang.CharSequence r5 = r0.f34819b
            if (r5 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r4 = r5
        L_0x0098:
            r1.<init>(r4)
            goto L_0x00a7
        L_0x009c:
            android.text.SpannableString r1 = new android.text.SpannableString
            java.lang.CharSequence r5 = r0.f34818a
            if (r5 != 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r4 = r5
        L_0x00a4:
            r1.<init>(r4)
        L_0x00a7:
            java.lang.String r1 = r1.toString()
            r7.wording = r1
        L_0x00ad:
            java.lang.String r1 = r0.f34784g
            if (r1 == 0) goto L_0x00b7
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00b8
        L_0x00b7:
            r2 = 1
        L_0x00b8:
            if (r2 == 0) goto L_0x00c5
            com.tencent.mm.protocal.protobuf.Html5Info r1 = r7.html5_info
            if (r1 == 0) goto L_0x00c1
            java.lang.String r1 = r1.url
            goto L_0x00c2
        L_0x00c1:
            r1 = 0
        L_0x00c2:
            r0.f34784g = r1
            goto L_0x00e9
        L_0x00c5:
            com.tencent.mm.protocal.protobuf.Html5Info r1 = r7.html5_info
            if (r1 != 0) goto L_0x00d0
            com.tencent.mm.protocal.protobuf.Html5Info r1 = new com.tencent.mm.protocal.protobuf.Html5Info
            r1.<init>()
            r7.html5_info = r1
        L_0x00d0:
            com.tencent.mm.protocal.protobuf.Html5Info r1 = r7.html5_info
            if (r1 == 0) goto L_0x00da
            java.lang.String r2 = r0.f34784g
            r1.url = r2
            r1.style = r3
        L_0x00da:
            com.tencent.mm.protocal.protobuf.NativeInfo r1 = r7.native_info
            if (r1 != 0) goto L_0x00e9
            com.tencent.mm.protocal.protobuf.MiniAppInfo r1 = r7.mini_app_info
            if (r1 != 0) goto L_0x00e9
            te3.ho2 r1 = r7.lite_app_info
            if (r1 != 0) goto L_0x00e9
            r1 = 2
            r7.jumpinfo_type = r1
        L_0x00e9:
            com.tencent.mm.protocal.protobuf.NativeInfo r7 = r7.native_info
            if (r7 == 0) goto L_0x011b
            java.lang.String r7 = r7.necessary_params
            if (r7 == 0) goto L_0x011b
            c30.g r1 = new c30.g     // Catch:{ JSONException -> 0x0111 }
            r1.<init>((java.lang.String) r7)     // Catch:{ JSONException -> 0x0111 }
            java.lang.String r7 = "uxinfo"
            java.lang.String r7 = r1.optString(r7)     // Catch:{ JSONException -> 0x0111 }
            java.lang.String r2 = "params.optString(Constan…r.AdInfoKeys.KEY_UX_INFO)"
            gy3.C87412m.m108593f(r7, r2)     // Catch:{ JSONException -> 0x0111 }
            r0.f34785h = r7     // Catch:{ JSONException -> 0x0111 }
            java.lang.String r7 = "canvas_id"
            java.lang.String r7 = r1.optString(r7)     // Catch:{ JSONException -> 0x0111 }
            long r1 = o40.C61926c.m72671P(r7)     // Catch:{ JSONException -> 0x0111 }
            r0.f34788k = r1     // Catch:{ JSONException -> 0x0111 }
            goto L_0x011b
        L_0x0111:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()
            java.lang.String r1 = "Finder.JumperUtils"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r7)
        L_0x011b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C11927v.mo11778a(com.tencent.mm.protocal.protobuf.FinderJumpInfo):pf1.p");
    }
}
