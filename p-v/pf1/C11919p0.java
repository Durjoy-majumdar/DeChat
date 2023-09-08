package pf1;

/* renamed from: pf1.p0 */
public final class C11919p0 extends C11928w {
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r8 == null) goto L_0x0016;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo11791o(pf1.C11920q r8) {
        /*
            r7 = this;
            java.lang.String r0 = "infoEx"
            gy3.C87412m.m108594g(r8, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r8 = r8.f34827a     // Catch:{ JSONException -> 0x004a }
            com.tencent.mm.protocal.protobuf.NativeInfo r8 = r8.native_info     // Catch:{ JSONException -> 0x004a }
            java.lang.String r1 = ""
            if (r8 == 0) goto L_0x0016
            java.lang.String r8 = r8.necessary_params     // Catch:{ JSONException -> 0x004a }
            if (r8 != 0) goto L_0x0017
        L_0x0016:
            r8 = r1
        L_0x0017:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004a }
            r2.<init>(r8)     // Catch:{ JSONException -> 0x004a }
            java.lang.String r8 = "topic_id"
            r3 = 0
            r4 = 0
            r5 = 1
            boolean r6 = r2.has(r8)     // Catch:{ Exception -> 0x0032 }
            if (r6 != r5) goto L_0x002a
            r6 = 1
            goto L_0x002b
        L_0x002a:
            r6 = 0
        L_0x002b:
            if (r6 == 0) goto L_0x003d
            java.lang.String r3 = r2.getString(r8)     // Catch:{ Exception -> 0x0032 }
            goto L_0x003d
        L_0x0032:
            r8 = move-exception
            java.lang.String r2 = "safeGetString"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ JSONException -> 0x004a }
            r5[r4] = r8     // Catch:{ JSONException -> 0x004a }
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r2, r1, r5)     // Catch:{ JSONException -> 0x004a }
        L_0x003d:
            if (r3 != 0) goto L_0x0045
            r1 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch:{ JSONException -> 0x004a }
        L_0x0045:
            java.lang.String r8 = "music_profile_id"
            r0.put(r8, r3)     // Catch:{ JSONException -> 0x004a }
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pf1.C11919p0.mo11791o(pf1.q):org.json.JSONObject");
    }

    /* renamed from: p */
    public String mo11792p() {
        return "link_music_profile";
    }
}
