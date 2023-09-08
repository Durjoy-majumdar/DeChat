package com.tencent.p014mm.plugin.facedetect.model;

import com.tencent.p014mm.autogen.events.RequestStartFaceDetectEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: com.tencent.mm.plugin.facedetect.model.l */
public class C115425l extends IStaticListener<RequestStartFaceDetectEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r21) {
        /*
            r20 = this;
            r0 = r21
            com.tencent.mm.autogen.events.RequestStartFaceDetectEvent r0 = (com.tencent.p014mm.autogen.events.RequestStartFaceDetectEvent) r0
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000a
            goto L_0x01cb
        L_0x000a:
            com.tencent.mm.autogen.events.RequestStartFaceDetectEvent$b r3 = r0.f9452e
            com.tencent.mm.plugin.facedetect.model.i r4 = com.tencent.p014mm.plugin.facedetect.model.C105227i.INSTANCE
            com.tencent.mm.autogen.events.RequestStartFaceDetectEvent$a r5 = r0.f9451d
            android.content.Context r6 = r5.f9453a
            android.os.Bundle r7 = r5.f9454b
            int r5 = r5.f9455c
            java.lang.String r8 = "face_permission_check"
            java.lang.String r9 = "MicroMsg.FaceDetectManager"
            if (r7 == 0) goto L_0x0036
            java.lang.String r10 = "key_is_need_confirm_page"
            boolean r10 = r7.getBoolean(r10, r2)
            if (r10 != 0) goto L_0x0036
            java.lang.String r4 = "start wx internal face verify"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            if (r6 == 0) goto L_0x01a4
            int r1 = com.tencent.p014mm.plugin.flash.permission.FaceFlashPermissionUI.f19047i
            r7.putBoolean(r8, r2)
            com.tencent.p014mm.plugin.flash.permission.FaceFlashPermissionUI.m4573I7(r6, r7, r5)
            goto L_0x019d
        L_0x0036:
            java.lang.String r10 = "start face detect process"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            com.tencent.mm.plugin.facedetect.model.FaceDetectReporter r10 = com.tencent.p014mm.plugin.facedetect.model.FaceDetectReporter.m162242a()
            r10.getClass()
            java.lang.String r11 = "MicroMsg.FaceDetectReporter"
            java.lang.String r12 = "create report session"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r11, r12)
            com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo r12 = r10.f345962f
            if (r12 != 0) goto L_0x0055
            com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo r12 = new com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo
            r12.<init>()
            r10.f345962f = r12
        L_0x0055:
            com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo r12 = r10.f345962f
            r13 = 0
            r12.f345939d = r13
            r12.f345941f = r1
            r12.f345942g = r1
            r12.f345943h = r1
            r12.f345940e = r1
            r12.f345944i = r1
            r12.f345945j = r1
            r12.f345946n = r1
            r12.f345947o = r1
            r12.f345948p = r1
            r12.f345949q = r1
            r12.f345950r = r1
            r12.f345951s = r1
            r12.f345952t = r1
            r12.f345955w = r1
            r12.f345956x = r1
            r12.f345957y = r1
            r12.f345958z = r1
            java.util.HashMap<java.lang.Integer, java.lang.Long> r13 = r12.f345937A
            r13.clear()
            java.util.HashMap<java.lang.Integer, java.lang.Long> r12 = r12.f345938B
            r12.clear()
            r10.f345961e = r1
            long r12 = java.lang.System.currentTimeMillis()
            r10.f345960d = r12
            com.tencent.mm.plugin.facedetect.model.FaceDetectReportInfo r10 = r10.f345962f
            r10.f345939d = r12
            com.tencent.mm.plugin.facedetect.model.FaceDetectReporter r10 = com.tencent.p014mm.plugin.facedetect.model.FaceDetectReporter.m162242a()
            r10.getClass()
            java.lang.String r12 = "create interface called session"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r11, r12)
            long r12 = java.lang.System.currentTimeMillis()
            r10.f345967n = r12
            r10.f345970q = r1
            r10.f345971r = r1
            r12 = -1
            r10.f345968o = r12
            r10.f345969p = r12
            com.tencent.mm.plugin.facedetect.model.FaceDetectReporter r10 = com.tencent.p014mm.plugin.facedetect.model.FaceDetectReporter.m162242a()
            long r12 = java.lang.System.currentTimeMillis()
            r10.f345968o = r12
            if (r6 != 0) goto L_0x00bd
            goto L_0x01a4
        L_0x00bd:
            if (r7 == 0) goto L_0x019f
            java.lang.String r10 = "scene"
            r12 = 2
            int r10 = r7.getInt(r10, r12)
            java.lang.String r13 = "appId"
            java.lang.String r14 = ""
            java.lang.String r13 = r7.getString(r13, r14)
            com.tencent.mm.plugin.facedetect.model.FaceDetectReporter r14 = com.tencent.p014mm.plugin.facedetect.model.FaceDetectReporter.m162242a()
            r14.f345963g = r13
            java.lang.String r13 = "is_check_dyncfg"
            boolean r13 = r7.getBoolean(r13, r1)
            boolean r4 = r4.mo149595b(r13)
            r13 = 5
            if (r4 != 0) goto L_0x0157
            java.lang.String r4 = "alvinluo: not support face detect"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r4)
            com.tencent.mm.plugin.facedetect.model.FaceDetectReporter r14 = com.tencent.p014mm.plugin.facedetect.model.FaceDetectReporter.m162242a()
            r14.getClass()
            r5 = 4
            r6 = 3
            if (r10 == 0) goto L_0x0104
            if (r10 == r2) goto L_0x0102
            if (r10 == r12) goto L_0x0100
            if (r10 == r6) goto L_0x0104
            if (r10 == r5) goto L_0x0102
            if (r10 == r13) goto L_0x00fe
            r7 = -1
            goto L_0x0105
        L_0x00fe:
            r7 = 4
            goto L_0x0105
        L_0x0100:
            r7 = 1
            goto L_0x0105
        L_0x0102:
            r7 = 3
            goto L_0x0105
        L_0x0104:
            r7 = 2
        L_0x0105:
            java.lang.Object[] r8 = new java.lang.Object[r12]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r8[r1] = r9
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8[r2] = r9
            java.lang.String r9 = "reportStartFaceDetect businessType: %d, isRetry: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r11, r9, r8)
            kj2.d r8 = kj2.C117407d.INSTANCE
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9[r1] = r7
            long r4 = r14.f345960d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r9[r2] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r9[r12] = r4
            r4 = 14005(0x36b5, float:1.9625E-41)
            r8.mo160131h(r4, r9)
            if (r10 == 0) goto L_0x0149
            if (r10 == r2) goto L_0x0147
            if (r10 == r12) goto L_0x0145
            if (r10 == r6) goto L_0x0149
            r4 = 4
            if (r10 == r4) goto L_0x0147
            if (r10 == r13) goto L_0x0143
            r15 = -1
            goto L_0x014a
        L_0x0143:
            r15 = 4
            goto L_0x014a
        L_0x0145:
            r15 = 1
            goto L_0x014a
        L_0x0147:
            r15 = 3
            goto L_0x014a
        L_0x0149:
            r15 = 2
        L_0x014a:
            r16 = 0
            r17 = 3
            r18 = 4
            r19 = 90001(0x15f91, float:1.26118E-40)
            r14.mo175299c(r15, r16, r17, r18, r19)
            goto L_0x01a4
        L_0x0157:
            if (r10 == r12) goto L_0x0165
            if (r10 != r13) goto L_0x015c
            goto L_0x0165
        L_0x015c:
            int r1 = com.tencent.p014mm.plugin.flash.permission.FaceFlashPermissionUI.f19047i
            r7.putBoolean(r8, r2)
            com.tencent.p014mm.plugin.flash.permission.FaceFlashPermissionUI.m4573I7(r6, r7, r5)
            goto L_0x019d
        L_0x0165:
            java.lang.String r1 = "carson: serverScene == FACE_DETECT_SERVER_SCENE_MP | FACE_DETECT_SERVER_SCENE_SUBAPP"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI> r4 = com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectConfirmUI.class
            r1.<init>(r6, r4)
            r1.putExtras(r7)
            r8 = r6
            android.app.Activity r8 = (android.app.Activity) r8
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r5)
            r4.mo10233c(r1)
            java.lang.Object[] r9 = r4.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/facedetect/model/FaceDetectManager"
            java.lang.String r11 = "startFaceDetectProcess"
            java.lang.String r12 = "(Landroid/content/Context;Landroid/os/Bundle;I)Z"
            java.lang.String r13 = "android/app/Activity"
            java.lang.String r14 = "startActivityForResult"
            java.lang.String r15 = "(Landroid/content/Intent;I)V"
            j20.C117292a.m165364j(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x019d:
            r1 = 1
            goto L_0x01a4
        L_0x019f:
            java.lang.String r4 = "hy: extras is null! should not happen"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r4)
        L_0x01a4:
            r3.f9456a = r1
            com.tencent.mm.autogen.events.RequestStartFaceDetectEvent$b r1 = r0.f9452e
            boolean r3 = r1.f9456a
            if (r3 != 0) goto L_0x01ca
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r1.f9457b = r3
            com.tencent.mm.autogen.events.RequestStartFaceDetectEvent$b r1 = r0.f9452e
            android.os.Bundle r1 = r1.f9457b
            r3 = 90001(0x15f91, float:1.26118E-40)
            java.lang.String r4 = "err_code"
            r1.putInt(r4, r3)
            com.tencent.mm.autogen.events.RequestStartFaceDetectEvent$b r0 = r0.f9452e
            android.os.Bundle r0 = r0.f9457b
            java.lang.String r1 = "err_msg"
            java.lang.String r3 = "face detect not support"
            r0.putString(r1, r3)
        L_0x01ca:
            r1 = 1
        L_0x01cb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.facedetect.model.C115425l.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
