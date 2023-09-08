package com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi;

import jk0.C87981f;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.e */
public class C83053e extends C87981f {
    private static final int CTRL_INDEX = 114;
    public static final String NAME = "operateVideoPlayer";

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.optInt("videoPlayerId");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo22381E(com.tencent.p014mm.plugin.appbrand.jsapi.C82520h r11, int r12, android.view.View r13, org.json.JSONObject r14) {
        /*
            r10 = this;
            r11 = 1
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "MicroMsg.JsApiOperateVideoPlayer"
            java.lang.String r3 = "onOperateView videoPlayerId=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            boolean r0 = r13 instanceof com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer
            if (r0 != 0) goto L_0x0024
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r2] = r12
            java.lang.String r12 = "view(%s) is not a instance of CoverViewContainer"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r12, r11)
            return r2
        L_0x0024:
            com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer r13 = (com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) r13
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView> r12 = com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView.class
            java.lang.Object r12 = r13.mo114736d(r12)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r12 = (com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView) r12
            if (r12 != 0) goto L_0x0037
            java.lang.String r11 = "view not AppBrandVideoView"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r11)
            return r2
        L_0x0037:
            java.lang.String r13 = "type"
            java.lang.String r13 = r14.optString(r13)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r2] = r13
            java.lang.String r3 = "onOperateView operateType=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            r13.getClass()
            int r0 = r13.hashCode()
            r3 = -1
            switch(r0) {
                case -802181223: goto L_0x00a9;
                case 1222225: goto L_0x009d;
                case 3443508: goto L_0x0091;
                case 3526264: goto L_0x0085;
                case 3540994: goto L_0x0079;
                case 106440182: goto L_0x006d;
                case 458133450: goto L_0x0061;
                case 1355420059: goto L_0x0055;
                default: goto L_0x0052;
            }
        L_0x0052:
            r0 = -1
            goto L_0x00b3
        L_0x0055:
            java.lang.String r0 = "playbackRate"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x005f
            goto L_0x0052
        L_0x005f:
            r0 = 7
            goto L_0x00b3
        L_0x0061:
            java.lang.String r0 = "requestFullScreen"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x006b
            goto L_0x0052
        L_0x006b:
            r0 = 6
            goto L_0x00b3
        L_0x006d:
            java.lang.String r0 = "pause"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0077
            goto L_0x0052
        L_0x0077:
            r0 = 5
            goto L_0x00b3
        L_0x0079:
            java.lang.String r0 = "stop"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0083
            goto L_0x0052
        L_0x0083:
            r0 = 4
            goto L_0x00b3
        L_0x0085:
            java.lang.String r0 = "seek"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x008f
            goto L_0x0052
        L_0x008f:
            r0 = 3
            goto L_0x00b3
        L_0x0091:
            java.lang.String r0 = "play"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x009b
            goto L_0x0052
        L_0x009b:
            r0 = 2
            goto L_0x00b3
        L_0x009d:
            java.lang.String r0 = "sendDanmu"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x00a7
            goto L_0x0052
        L_0x00a7:
            r0 = 1
            goto L_0x00b3
        L_0x00a9:
            java.lang.String r0 = "exitFullScreen"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x00b2
            goto L_0x0052
        L_0x00b2:
            r0 = 0
        L_0x00b3:
            r4 = 0
            r6 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r8 = "onOperateView dataArr nil"
            java.lang.String r9 = "data"
            switch(r0) {
                case 0: goto L_0x0189;
                case 1: goto L_0x015c;
                case 2: goto L_0x0158;
                case 3: goto L_0x012c;
                case 4: goto L_0x0128;
                case 5: goto L_0x0124;
                case 6: goto L_0x0108;
                case 7: goto L_0x00c8;
                default: goto L_0x00be;
            }
        L_0x00be:
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r2] = r13
            java.lang.String r12 = "onOperateView operateType not supported: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r12, r11)
            return r2
        L_0x00c8:
            org.json.JSONArray r13 = r14.optJSONArray(r9)
            if (r13 == 0) goto L_0x0104
            int r14 = r13.length()
            if (r14 != 0) goto L_0x00d5
            goto L_0x0104
        L_0x00d5:
            double r13 = r13.optDouble(r2, r6)
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ec
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Double r12 = java.lang.Double.valueOf(r13)
            r11[r2] = r12
            java.lang.String r12 = "rate invalid %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r12, r11)
            return r2
        L_0x00ec:
            float r13 = (float) r13
            java.lang.Object[] r14 = new java.lang.Object[r11]
            java.lang.Float r0 = java.lang.Float.valueOf(r13)
            r14[r2] = r0
            java.lang.String r0 = "MicroMsg.Video.AppBrandVideoView"
            java.lang.String r1 = "setPlaybackRate %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r14)
            com.tencent.mm.plugin.appbrand.jsapi.video.c r12 = r12.f49521f
            r12.setPlayRate(r13)
            goto L_0x018c
        L_0x0104:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r8)
            return r2
        L_0x0108:
            org.json.JSONArray r13 = r14.optJSONArray(r9)
            if (r13 == 0) goto L_0x011a
            int r14 = r13.length()
            if (r14 != 0) goto L_0x0115
            goto L_0x011a
        L_0x0115:
            int r3 = r13.optInt(r2, r3)
            goto L_0x011f
        L_0x011a:
            java.lang.String r13 = "onOperateView directionArr nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r13)
        L_0x011f:
            r12.mo22237q(r11, r3)
            goto L_0x018c
        L_0x0124:
            r12.mo22238r()
            goto L_0x018c
        L_0x0128:
            r12.mo22278x()
            goto L_0x018c
        L_0x012c:
            org.json.JSONArray r13 = r14.optJSONArray(r9)
            if (r13 == 0) goto L_0x0154
            int r14 = r13.length()
            if (r14 != 0) goto L_0x0139
            goto L_0x0154
        L_0x0139:
            double r13 = r13.optDouble(r2, r6)
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0150
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Double r12 = java.lang.Double.valueOf(r13)
            r11[r2] = r12
            java.lang.String r12 = "pos invalid %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r12, r11)
            return r2
        L_0x0150:
            r12.mo22239s(r13, r2)
            goto L_0x018c
        L_0x0154:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r8)
            return r2
        L_0x0158:
            r12.mo22277w()
            goto L_0x018c
        L_0x015c:
            org.json.JSONArray r13 = r14.optJSONArray(r9)
            if (r13 == 0) goto L_0x0185
            int r14 = r13.length()
            if (r14 != 0) goto L_0x0169
            goto L_0x0185
        L_0x0169:
            int r14 = r13.length()
            java.lang.String r0 = ""
            if (r14 != r11) goto L_0x0179
            java.lang.String r13 = r13.optString(r2, r0)
            r12.mo22215b(r13, r0)
            goto L_0x018c
        L_0x0179:
            java.lang.String r14 = r13.optString(r2, r0)
            java.lang.String r13 = r13.optString(r11, r0)
            r12.mo22215b(r14, r13)
            goto L_0x018c
        L_0x0185:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r8)
            return r2
        L_0x0189:
            r12.mo22237q(r2, r3)
        L_0x018c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.video.jsapi.C83053e.mo22381E(com.tencent.mm.plugin.appbrand.jsapi.h, int, android.view.View, org.json.JSONObject):boolean");
    }
}
