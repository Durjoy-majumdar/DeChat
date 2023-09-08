package tm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;

/* renamed from: tm0.d0 */
public class C78044d0<C extends C82381f> extends C82268c<C> {
    public static final int CTRL_INDEX = 230;
    public static final String NAME = "vibrateShort";

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(C r13, org.json.JSONObject r14, int r15) {
        /*
            r12 = this;
            java.lang.String r0 = "MicroMsg.JsApiVibrateShort"
            java.lang.String r1 = "JsApiVibrateShort services!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            li0.b r1 = r13.getAppState()
            li0.b r2 = li0.C88508b.FOREGROUND
            if (r1 == r2) goto L_0x0019
            java.lang.String r14 = "fail:not allowed in background"
            java.lang.String r14 = r12.mo115109j(r14)
            r13.mo109647a(r15, r14)
            return
        L_0x0019:
            r1 = 3
            r2 = 0
            r3 = -2
            r4 = 2
            r5 = 1
            r6 = -1
            if (r14 != 0) goto L_0x0023
        L_0x0021:
            r14 = -1
            goto L_0x006e
        L_0x0023:
            java.lang.String r7 = "style"
            boolean r8 = r14.has(r7)
            if (r8 != 0) goto L_0x002d
            goto L_0x0021
        L_0x002d:
            java.lang.String r14 = r14.optString(r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r7 == 0) goto L_0x0039
        L_0x0037:
            r14 = -2
            goto L_0x006e
        L_0x0039:
            r14.getClass()
            int r7 = r14.hashCode()
            switch(r7) {
                case -1078030475: goto L_0x005b;
                case 99152071: goto L_0x0050;
                case 102970646: goto L_0x0045;
                default: goto L_0x0043;
            }
        L_0x0043:
            r14 = -1
            goto L_0x0065
        L_0x0045:
            java.lang.String r7 = "light"
            boolean r14 = r14.equals(r7)
            if (r14 != 0) goto L_0x004e
            goto L_0x0043
        L_0x004e:
            r14 = 2
            goto L_0x0065
        L_0x0050:
            java.lang.String r7 = "heavy"
            boolean r14 = r14.equals(r7)
            if (r14 != 0) goto L_0x0059
            goto L_0x0043
        L_0x0059:
            r14 = 1
            goto L_0x0065
        L_0x005b:
            java.lang.String r7 = "medium"
            boolean r14 = r14.equals(r7)
            if (r14 != 0) goto L_0x0064
            goto L_0x0043
        L_0x0064:
            r14 = 0
        L_0x0065:
            switch(r14) {
                case 0: goto L_0x006d;
                case 1: goto L_0x006b;
                case 2: goto L_0x0069;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x0037
        L_0x0069:
            r14 = 1
            goto L_0x006e
        L_0x006b:
            r14 = 3
            goto L_0x006e
        L_0x006d:
            r14 = 2
        L_0x006e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "vibrationIntensity: "
            r7.append(r8)
            r7.append(r14)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r7)
            android.content.Context r7 = r13.getContext()     // Catch:{ Exception -> 0x00ec }
            java.lang.String r8 = "vibrator"
            java.lang.Object r7 = r7.getSystemService(r8)     // Catch:{ Exception -> 0x00ec }
            android.os.Vibrator r7 = (android.os.Vibrator) r7     // Catch:{ Exception -> 0x00ec }
            if (r7 != 0) goto L_0x009c
            java.lang.String r14 = "fail: vibrate is not support"
            java.lang.String r14 = r12.mo115109j(r14)     // Catch:{ Exception -> 0x00ec }
            r13.mo109647a(r15, r14)     // Catch:{ Exception -> 0x00ec }
            return
        L_0x009c:
            r8 = 15
            if (r3 != r14) goto L_0x00a6
            r7.vibrate(r8)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r14 = "fail: style is illegal"
            goto L_0x00e4
        L_0x00a6:
            java.lang.String r3 = "ok"
            if (r6 != r14) goto L_0x00af
            r7.vibrate(r8)     // Catch:{ Exception -> 0x00ec }
        L_0x00ad:
            r14 = r3
            goto L_0x00e4
        L_0x00af:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00ec }
            r11 = 26
            if (r10 < r11) goto L_0x00df
            boolean r10 = r7.hasAmplitudeControl()     // Catch:{ Exception -> 0x00ec }
            if (r10 == 0) goto L_0x00df
            java.lang.String r10 = "vibrateSupportAmplitude"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r10)     // Catch:{ Exception -> 0x00ec }
            if (r14 == r5) goto L_0x00cf
            if (r14 == r4) goto L_0x00cc
            if (r14 == r1) goto L_0x00c9
            r14 = -1
            goto L_0x00d1
        L_0x00c9:
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x00d1
        L_0x00cc:
            r14 = 192(0xc0, float:2.69E-43)
            goto L_0x00d1
        L_0x00cf:
            r14 = 128(0x80, float:1.794E-43)
        L_0x00d1:
            if (r6 != r14) goto L_0x00d7
            r7.vibrate(r8)     // Catch:{ Exception -> 0x00ec }
            goto L_0x00ad
        L_0x00d7:
            android.os.VibrationEffect r14 = android.os.VibrationEffect.createOneShot(r8, r14)     // Catch:{ Exception -> 0x00ec }
            r7.vibrate(r14)     // Catch:{ Exception -> 0x00ec }
            goto L_0x00ad
        L_0x00df:
            r7.vibrate(r8)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r14 = "fail: style is not support"
        L_0x00e4:
            java.lang.String r14 = r12.mo115109j(r14)     // Catch:{ Exception -> 0x00ec }
            r13.mo109647a(r15, r14)     // Catch:{ Exception -> 0x00ec }
            goto L_0x0104
        L_0x00ec:
            r14 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r14 = r14.getMessage()
            r1[r2] = r14
            java.lang.String r14 = "vibrateShort exception %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r14, r1)
            java.lang.String r14 = "fail: system internal error"
            java.lang.String r14 = r12.mo115109j(r14)
            r13.mo109647a(r15, r14)
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tm0.C78044d0.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
