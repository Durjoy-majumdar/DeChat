package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.l */
public final class C40461l extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 1230;
    public static final String NAME = "getWeAppProfileInfo";

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: pe3.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r7, org.json.JSONObject r8, int r9) {
        /*
            r6 = this;
            com.tencent.mm.plugin.appbrand.i2 r7 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r7
            if (r7 != 0) goto L_0x0006
            goto L_0x0089
        L_0x0006:
            if (r8 != 0) goto L_0x000a
            goto L_0x0089
        L_0x000a:
            java.lang.String r0 = "username"
            java.lang.String r8 = r8.optString(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "appbrand_profile_info_mmkv_name"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r8 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r8)
            java.lang.String r0 = "getMMKV(ConstantsAppBran…NFO_MMKV_NAME + username)"
            gy3.C87412m.m108593f(r8, r0)
            java.lang.String r0 = "appbrand_profile_info_key"
            boolean r1 = r8.containsKey(r0)
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x005e
            byte[] r8 = r8.decodeBytes(r0)
            if (r8 == 0) goto L_0x005e
            int r0 = r8.length
            if (r0 != 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            r0 = r0 ^ r4
            if (r0 == 0) goto L_0x005e
            java.lang.Class<com.tencent.mm.protocal.protobuf.GetProfileInfoResponse> r0 = com.tencent.p014mm.protocal.protobuf.GetProfileInfoResponse.class
            java.lang.Object r0 = r0.newInstance()     // Catch:{ Exception -> 0x0054 }
            r1 = r0
            pe3.a r1 = (pe3.C47465a) r1     // Catch:{ Exception -> 0x0054 }
            r1.parseFrom(r8)     // Catch:{ Exception -> 0x0054 }
            pe3.a r0 = (pe3.C47465a) r0     // Catch:{ Exception -> 0x0054 }
            goto L_0x005f
        L_0x0054:
            r8 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "MultiProcessMMKV.decodeProtoBuffer"
            java.lang.String r5 = "decode ProtoBuffer"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r8, r5, r0)
        L_0x005e:
            r0 = r2
        L_0x005f:
            r8 = r0
            com.tencent.mm.protocal.protobuf.GetProfileInfoResponse r8 = (com.tencent.p014mm.protocal.protobuf.GetProfileInfoResponse) r8
            if (r8 == 0) goto L_0x0065
            r3 = 1
        L_0x0065:
            if (r3 == 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r0 = r2
        L_0x0069:
            com.tencent.mm.protocal.protobuf.GetProfileInfoResponse r0 = (com.tencent.p014mm.protocal.protobuf.GetProfileInfoResponse) r0
            if (r0 == 0) goto L_0x0082
            java.util.Map r8 = com.tencent.p014mm.plugin.appbrand.utils.C84789u1.m104469a(r4, r0)
            p225rc.C48016e.m53378d(r8)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            java.lang.String r8 = r0.toString()
            r7.mo109647a(r9, r8)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0082:
            if (r2 != 0) goto L_0x0089
            java.lang.String r8 = ""
            r7.mo109647a(r9, r8)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.contact.C40461l.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
