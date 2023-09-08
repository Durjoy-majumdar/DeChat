package com.tencent.p014mm.p136ui.tools;

import android.content.BroadcastReceiver;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C106592i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import iq0.C98783b;
import kr0.C109033l0;
import xv0.C112181e;

/* renamed from: com.tencent.mm.ui.tools.QbCallBackBroadcast */
public class QbCallBackBroadcast extends BroadcastReceiver {

    /* renamed from: a */
    public static Runnable f319095a = new C106735a();

    /* renamed from: com.tencent.mm.ui.tools.QbCallBackBroadcast$a */
    public class C106735a implements Runnable {
        public void run() {
            if (C106592i0.f318506r != null) {
                Log.m105924i("MicroMsg.FilesFloatBall.QbCallBackBroadcast", "foregroundRunnable, onEnterPage");
                C106592i0.f318506r.mo64003o();
                C112181e eVar = C106592i0.f318506r.f311729g;
                if (eVar != null) {
                    eVar.mo149105X(true);
                }
                C106592i0.f318506r.mo90536d(true);
                return;
            }
            Log.m105924i("MicroMsg.FilesFloatBall.QbCallBackBroadcast", "foregroundRunnable, FilesFloatBallHelper is null");
        }
    }

    /* renamed from: a */
    public final void mo153825a(MaterialModel materialModel) {
        Log.m105924i("MicroMsg.FilesFloatBall.QbCallBackBroadcast", "reportBottomSheetShown, materialModel: " + materialModel);
        C109033l0 l0Var = (C109033l0) C86312j.m106911c(C109033l0.class);
        if (l0Var == null) {
            Log.m105928w("MicroMsg.FilesFloatBall.QbCallBackBroadcast", "reportBottomSheetShown, openMaterialService is null");
            return;
        }
        C98783b bVar = C98783b.ATTACH;
        if (!l0Var.mo158318GO(bVar, materialModel, l0Var.Dl0(bVar, l0Var.mo158326lf(materialModel)))) {
            Log.m105928w("MicroMsg.FilesFloatBall.QbCallBackBroadcast", "reportBottomSheetShown, saveOpenMaterialReporter fail");
        }
    }

    /* renamed from: b */
    public final void mo153826b(MaterialModel materialModel) {
        Log.m105924i("MicroMsg.FilesFloatBall.QbCallBackBroadcast", "reportOpenMaterialEntranceExposure, materialModel: " + materialModel);
        C109033l0 l0Var = (C109033l0) C86312j.m106911c(C109033l0.class);
        if (l0Var == null) {
            Log.m105928w("MicroMsg.FilesFloatBall.QbCallBackBroadcast", "reportOpenMaterialEntranceExposure, openMaterialService is null");
        } else {
            l0Var.z70(C98783b.ATTACH, materialModel, l0Var.mo158326lf(materialModel), false).mo158307e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r28, android.content.Intent r29) {
        /*
            r27 = this;
            r1 = r27
            r2 = r29
            java.lang.Class<c02.c> r3 = c02.C92331c.class
            java.lang.String r4 = "MicroMsg.FilesFloatBall.QbCallBackBroadcast"
            if (r2 != 0) goto L_0x0010
            java.lang.String r0 = "onReceive() intent == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            return
        L_0x0010:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.IntentUtil.checkIntentSafe(r29)
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "checkIntentSafe error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            return
        L_0x001c:
            f40.C86709a0.m107528h()
            f40.e r0 = f40.C86709a0.m107523b()
            boolean r0 = r0.mo121114l()
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = "account not init."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            return
        L_0x002f:
            r5 = 2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r6 = 0
            r0[r6] = r2
            android.os.Bundle r7 = r29.getExtras()
            r8 = 1
            r0[r8] = r7
            java.lang.String r7 = "onReceive() %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r0)
            java.lang.String r0 = "thirdCtx"
            boolean r7 = r2.hasExtra(r0)
            java.lang.String r9 = "sence"
            java.lang.String r10 = "fileExt"
            java.lang.String r11 = "filePath"
            java.lang.String r12 = ""
            r13 = 4
            r14 = 3
            if (r7 == 0) goto L_0x00b5
            java.lang.String r0 = r2.getStringExtra(r0)
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x007f }
            r7.<init>(r0)     // Catch:{ Exception -> 0x007f }
            java.lang.String r0 = "type"
            java.lang.String r15 = r7.getString(r0)     // Catch:{ Exception -> 0x007f }
            java.lang.String r16 = r7.getString(r11)     // Catch:{ Exception -> 0x007d }
            java.lang.String r17 = r7.getString(r10)     // Catch:{ Exception -> 0x0079 }
            int r18 = r7.getInt(r9)     // Catch:{ Exception -> 0x0077 }
            java.lang.String r0 = "verify"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ Exception -> 0x0075 }
            goto L_0x009f
        L_0x0075:
            r0 = move-exception
            goto L_0x0087
        L_0x0077:
            r0 = move-exception
            goto L_0x0085
        L_0x0079:
            r0 = move-exception
            r17 = r12
            goto L_0x0085
        L_0x007d:
            r0 = move-exception
            goto L_0x0081
        L_0x007f:
            r0 = move-exception
            r15 = r12
        L_0x0081:
            r16 = r12
            r17 = r16
        L_0x0085:
            r18 = 0
        L_0x0087:
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Class r19 = r0.getClass()
            java.lang.String r19 = r19.getSimpleName()
            r7[r6] = r19
            java.lang.String r0 = r0.getMessage()
            r7[r8] = r0
            java.lang.String r0 = "onReceive() thirdCtx Exception:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r7)
            r0 = r12
        L_0x009f:
            java.lang.Object[] r7 = new java.lang.Object[r13]
            r7[r6] = r15
            r7[r8] = r16
            r7[r5] = r17
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)
            r7[r14] = r18
            java.lang.String r13 = "onReceive() type:%s filePath:%s fileExt:%s sence:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r13, r7)
            r7 = r17
            goto L_0x00ba
        L_0x00b5:
            r0 = r12
            r7 = r0
            r15 = r7
            r16 = r15
        L_0x00ba:
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FLOAT_BALL_FILES_QB_VERIFY_STRING_SYNC
            java.lang.Object r13 = r13.mo119685f(r14, r12)
            java.lang.String r13 = (java.lang.String) r13
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r14 != 0) goto L_0x00e7
            java.lang.String r14 = ","
            java.lang.String[] r14 = r13.split(r14)
            int r8 = r14.length
        L_0x00d7:
            if (r6 >= r8) goto L_0x00e7
            r5 = r14[r6]
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r0)
            if (r5 == 0) goto L_0x00e3
            r5 = 1
            goto L_0x00e8
        L_0x00e3:
            int r6 = r6 + 1
            r5 = 2
            goto L_0x00d7
        L_0x00e7:
            r5 = 0
        L_0x00e8:
            if (r5 != 0) goto L_0x00f9
            r5 = 2
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r5 = 0
            r2[r5] = r13
            r3 = 1
            r2[r3] = r0
            java.lang.String r0 = "onReceive() originVerify:%s verifyKey:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r2)
            return
        L_0x00f9:
            r5 = 0
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FLOAT_BALL_FILES_QB_VERIFY_USE_FREQUENCY_INT_SYNC
            int r0 = r0.mo119689j(r6, r5)
            java.lang.Class<h81.h> r8 = h81.C32735h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            h81.h r8 = (h81.C32735h) r8
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_qb_verify_use_frequency_sw
            int r8 = r8.mo58779Qe(r13, r5)
            r13 = 1
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r8, (int) r13)
            if (r14 == 0) goto L_0x013f
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)
            r14[r5] = r18
            java.lang.String r5 = "qb verify frequency use %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r14)
            r5 = 50
            if (r8 < r5) goto L_0x012f
            return
        L_0x012f:
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            int r0 = r0 + r13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.mo119677K(r6, r0)
        L_0x013f:
            java.lang.String r0 = "change_file"
            boolean r5 = r2.hasExtra(r0)
            if (r5 == 0) goto L_0x014c
            java.lang.String r0 = r2.getStringExtra(r0)
            goto L_0x014d
        L_0x014c:
            r0 = r12
        L_0x014d:
            java.lang.String r5 = "menuId"
            boolean r6 = r2.hasExtra(r5)
            r8 = -1
            if (r6 == 0) goto L_0x015b
            int r5 = r2.getIntExtra(r5, r8)
            goto L_0x015c
        L_0x015b:
            r5 = -1
        L_0x015c:
            r6 = 11
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r5, (int) r6)
            if (r6 == 0) goto L_0x0165
            goto L_0x0167
        L_0x0165:
            r0 = r16
        L_0x0167:
            java.util.Set<java.lang.String> r6 = ek3.C97668a.f286473u
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r13 = r6.getPath()
            if (r13 == 0) goto L_0x018e
            r14 = 0
            java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r14, r14)
            java.lang.String r14 = r6.getPath()
            boolean r14 = r14.equals(r13)
            if (r14 != 0) goto L_0x018e
            android.net.Uri$Builder r6 = r6.buildUpon()
            android.net.Uri$Builder r6 = r6.path(r13)
            android.net.Uri r6 = r6.build()
        L_0x018e:
            com.tencent.mm.vfs.f0 r13 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r14 = 0
            com.tencent.mm.vfs.f0$h r6 = r13.mo177799l(r6, r14)
            boolean r13 = r6.mo177810a()
            if (r13 != 0) goto L_0x019d
            r6 = 0
            goto L_0x01a5
        L_0x019d:
            com.tencent.mm.vfs.FileSystem$c r13 = r6.f348991a
            java.lang.String r6 = r6.f348992b
            boolean r6 = r13.mo119948x(r6)
        L_0x01a5:
            if (r6 != 0) goto L_0x01b3
            r6 = 1
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "onReceive() filePath(%s) not exitst"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r2)
            return
        L_0x01b3:
            java.lang.String r6 = "activity_status"
            boolean r13 = r2.hasExtra(r6)
            if (r13 == 0) goto L_0x01c0
            java.lang.String r6 = r2.getStringExtra(r6)
            goto L_0x01c1
        L_0x01c0:
            r6 = r12
        L_0x01c1:
            java.lang.String r13 = "readProgress"
            boolean r20 = r2.hasExtra(r13)
            if (r20 == 0) goto L_0x01ce
            java.lang.String r13 = r2.getStringExtra(r13)
            goto L_0x01cf
        L_0x01ce:
            r13 = r12
        L_0x01cf:
            java.lang.String r14 = "exposeMenuId"
            boolean r21 = r2.hasExtra(r14)
            java.lang.String r8 = "0"
            if (r21 == 0) goto L_0x01de
            java.lang.String r2 = r2.getStringExtra(r14)
            goto L_0x01df
        L_0x01de:
            r2 = r8
        L_0x01df:
            java.lang.String r14 = "qb"
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r15, (java.lang.String) r14)
            if (r14 == 0) goto L_0x0512
            com.tencent.mm.pluginsdk.ui.tools.i0 r14 = com.tencent.p014mm.pluginsdk.p133ui.tools.C106592i0.f318506r
            com.tencent.mm.pluginsdk.ui.tools.j0 r15 = com.tencent.p014mm.pluginsdk.p133ui.tools.C106593j0.f318511z
            r21 = r3
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r23 = java.lang.Integer.valueOf(r5)
            r19 = 0
            r3[r19] = r23
            boolean r23 = r15.mo160080e()
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r23)
            r26 = r9
            r9 = 1
            r3[r9] = r23
            r18 = 2
            r3[r18] = r6
            r9 = 3
            r3[r9] = r0
            r9 = 4
            r3[r9] = r13
            r9 = 5
            r3[r9] = r2
            java.lang.String r9 = "id:%s hasCurrentBall:%s activityStatus:%s  curFilePath:%s readState:%s, menuIdStr:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r3)
            r3 = 1
            if (r5 == r3) goto L_0x04f3
            r3 = 3
            if (r5 == r3) goto L_0x04d6
            r3 = 4
            if (r5 == r3) goto L_0x04b4
            java.lang.String r3 = "1"
            java.lang.String r9 = "MicroMsg.FilesFloatBall.FilesFloatBallHelper"
            switch(r5) {
                case 10: goto L_0x03b2;
                case 11: goto L_0x02a7;
                case 12: goto L_0x025c;
                case 13: goto L_0x0229;
                default: goto L_0x0227;
            }
        L_0x0227:
            goto L_0x051d
        L_0x0229:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0245 }
            r3 = -1
            if (r3 != r2) goto L_0x0239
            com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel r0 = com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel.m117225b(r0, r7)     // Catch:{ Exception -> 0x0245 }
            r1.mo153825a(r0)     // Catch:{ Exception -> 0x0245 }
            goto L_0x051d
        L_0x0239:
            r3 = 5
            if (r3 != r2) goto L_0x051d
            com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel r0 = com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel.m117225b(r0, r7)     // Catch:{ Exception -> 0x0245 }
            r1.mo153826b(r0)     // Catch:{ Exception -> 0x0245 }
            goto L_0x051d
        L_0x0245:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onReceive, fail since "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x051d
        L_0x025c:
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r2 = 0
            r0[r2] = r13
            java.lang.String r2 = "readState:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x026f
            goto L_0x051d
        L_0x026f:
            boolean r0 = r13.equals(r8)
            java.lang.String r2 = "MicroMsg.FilesFloatBall.FilesMultiTaskHelper"
            if (r0 == 0) goto L_0x028d
            d92.a r0 = r15.f326423e
            if (r0 == 0) goto L_0x0280
            android.graphics.Bitmap r14 = r0.getBitmap()
            goto L_0x0281
        L_0x0280:
            r14 = 0
        L_0x0281:
            android.graphics.Bitmap r0 = r15.mo160089o(r14)
            r15.mo74195s(r0)
            java.lang.String r0 = "setStart"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x028d:
            boolean r0 = r13.equals(r3)
            if (r0 == 0) goto L_0x051d
            r3 = 1
            r15.f318516y = r3
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = "setEnded mEnded:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
            r15.mo160072I()
            goto L_0x051d
        L_0x02a7:
            java.lang.String r2 = r15.f318512u
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r2)
            if (r2 != 0) goto L_0x051d
            java.lang.String r2 = com.tencent.p014mm.pluginsdk.p133ui.tools.C106593j0.m143936Z(r0)
            java.lang.String r22 = com.tencent.p014mm.vfs.C86013q1.m106454o(r2)
            int r2 = r15.f318515x
            te3.ry r3 = r15.f326419b
            java.lang.String r23 = ""
            r20 = r15
            r21 = r0
            r24 = r2
            r25 = r3
            r20.mo153319a0(r21, r22, r23, r24, r25)
            xv0.e r2 = r14.f311729g
            if (r2 == 0) goto L_0x02d1
            com.tencent.mm.plugin.ball.model.BallInfo r3 = r14.f311726d
            r2.mo149119f(r3)
        L_0x02d1:
            java.lang.String r2 = com.tencent.p014mm.pluginsdk.p133ui.tools.C106593j0.m143936Z(r0)
            java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106454o(r2)
            int r3 = r14.f318510q
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r0
            r6 = 1
            r5[r6] = r2
            r6 = 2
            r5[r6] = r12
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r7 = 3
            r5[r7] = r6
            java.lang.String r6 = "onCreate, filePath:%s fileExt:%s fileName:%s sence:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r6, r5)
            java.lang.String r5 = aw0.C79635e.m96715c(r0)
            r14.mo35648A(r4, r5)
            r14.f318507n = r0
            r14.f318508o = r2
            r14.f318509p = r12
            r14.f318510q = r3
            com.tencent.mm.plugin.ball.model.BallReportInfo r5 = r14.getReportInfo()
            r5.f311717f = r4
            com.tencent.mm.plugin.ball.model.BallReportInfo r4 = r14.getReportInfo()
            int r5 = r14.f318510q
            r4.f311716e = r5
            r14.mo68414O()
            com.tencent.mm.plugin.ball.model.BallInfo r4 = r14.f311726d
            android.os.Bundle r4 = r4.f311678C
            if (r4 == 0) goto L_0x0341
            java.lang.String r5 = "ifAppAttachDownloadUI"
            r6 = 0
            r4.putBoolean(r5, r6)
            com.tencent.mm.plugin.ball.model.BallInfo r4 = r14.f311726d
            android.os.Bundle r4 = r4.f311678C
            r4.putString(r11, r0)
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r14.f311726d
            android.os.Bundle r0 = r0.f311678C
            r0.putString(r10, r2)
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r14.f311726d
            android.os.Bundle r0 = r0.f311678C
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            int r2 = r2.intValue()
            r3 = r26
            r0.putInt(r3, r2)
            r14.mo68414O()
        L_0x0341:
            java.lang.String r0 = r14.f318508o
            java.lang.Boolean r2 = aw0.C103925l.f307288a
            java.lang.Integer r0 = aw0.C92162m.m115833a(r0)
            if (r0 != 0) goto L_0x0351
            java.lang.String r0 = "unknown"
            java.lang.Integer r0 = aw0.C92162m.m115833a(r0)
        L_0x0351:
            com.tencent.mm.plugin.ball.model.BallInfo r2 = r14.f311726d
            int r0 = r0.intValue()
            r2.f311698s = r0
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r14.f311726d
            java.lang.String r0 = r0.f311699t
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x03ad
            java.lang.String r0 = r14.f318509p
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x03a7
            java.lang.String r0 = r14.f318507n
            r2 = 47
            int r2 = r0.lastIndexOf(r2)     // Catch:{ Exception -> 0x038a }
            r3 = 1
            int r2 = r2 + r3
            if (r2 < 0) goto L_0x0380
            int r3 = r0.length()     // Catch:{ Exception -> 0x038a }
            if (r2 != r3) goto L_0x037e
            goto L_0x0380
        L_0x037e:
            r6 = r2
            goto L_0x0381
        L_0x0380:
            r6 = 0
        L_0x0381:
            int r2 = r0.length()     // Catch:{ Exception -> 0x038a }
            java.lang.String r0 = r0.substring(r6, r2)     // Catch:{ Exception -> 0x038a }
            goto L_0x03a5
        L_0x038a:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "get file name error "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            java.lang.String r0 = " "
        L_0x03a5:
            r14.f318509p = r0
        L_0x03a7:
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r14.f311726d
            java.lang.String r2 = r14.f318509p
            r0.f311699t = r2
        L_0x03ad:
            r14.mo68414O()
            goto L_0x051d
        L_0x03b2:
            java.lang.String r2 = r15.f318512u
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r2)
            if (r0 == 0) goto L_0x051d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r6, (java.lang.String) r8)
            if (r0 == 0) goto L_0x0487
            java.lang.String r0 = "QBonBackground"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            java.lang.Runnable r0 = f319095a
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r0)
            r14.mo64001C()
            r15.mo74189F()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MULTITASK_LAST_SHOW_ID_AND_TIME_STRING_SYNC
            r0.mo119677K(r2, r12)
            xv0.e r0 = r14.f311729g
            if (r0 == 0) goto L_0x0462
            com.tencent.mm.plugin.ball.model.BallInfo r2 = r14.f311726d
            if (r2 == 0) goto L_0x0462
            int r2 = r2.f311687e
            r3 = 4
            if (r2 != r3) goto L_0x0462
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            boolean r0 = r0.mo149090H()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 0
            r3[r2] = r0
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r14.f311726d
            int r0 = r0.f311687e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            r3[r2] = r0
            java.lang.String r0 = "alvinluo checkAndAddMessageBall qbFileViewPage: %b, contentType: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r3)
            xv0.e r0 = r14.f311729g
            long r2 = r0.mo149133m()
            long r4 = java.lang.System.currentTimeMillis()
            xv0.e r0 = r14.f311729g
            r6 = 0
            r0.mo149099R(r6)
            boolean r0 = r14.mo149066Q()
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            r11 = 0
            r8[r11] = r10
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            r11 = 1
            r8[r11] = r10
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10 = 2
            r8[r10] = r0
            java.lang.String r0 = "alvinluo checkAndAddMessageBall enterChatting: %d, now: %d, canAddMessageBall: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r8)
            java.lang.Boolean r0 = aw0.C103925l.f307288a
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x044d
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x044d
            long r4 = r4 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x044d
            r0 = 1
            goto L_0x044e
        L_0x044d:
            r0 = 0
        L_0x044e:
            if (r0 == 0) goto L_0x0462
            boolean r0 = r14.mo149066Q()
            if (r0 == 0) goto L_0x0462
            xv0.e r0 = r14.f311729g
            if (r0 == 0) goto L_0x0462
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 0
            r0.mo149127j(r2, r4)
        L_0x0462:
            xv0.e r0 = r14.f311729g
            if (r0 == 0) goto L_0x046a
            r2 = 0
            r0.mo149105X(r2)
        L_0x046a:
            com.tencent.mm.app.AppForegroundDelegate r0 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            boolean r0 = r0.f343454n
            if (r0 != 0) goto L_0x0474
            r2 = 1
            r14.mo90535c(r2)
        L_0x0474:
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r0 = r15.f326418a
            com.tencent.mm.plugin.handoff.model.HandOffFile r0 = com.tencent.p014mm.plugin.handoff.model.HandOffFile.fromMultiTask(r0)
            if (r0 == 0) goto L_0x051d
            di3.d r2 = di3.C86312j.m106911c(r21)
            c02.c r2 = (c02.C92331c) r2
            r2.I10(r0)
            goto L_0x051d
        L_0x0487:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r6, (java.lang.String) r3)
            if (r0 == 0) goto L_0x051d
            java.lang.String r0 = "QBonForeground"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            java.lang.Runnable r0 = f319095a
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r0 = r15.f326418a
            com.tencent.mm.plugin.handoff.model.HandOffFile r0 = com.tencent.p014mm.plugin.handoff.model.HandOffFile.fromMultiTask(r0)
            if (r0 == 0) goto L_0x051d
            r2 = 1
            r0.setHandOffType(r2)
            java.lang.String r2 = com.tencent.p014mm.plugin.handoff.model.HandOff.generateKey(r2, r2)
            r0.setKey(r2)
            di3.d r2 = di3.C86312j.m106911c(r21)
            c02.c r2 = (c02.C92331c) r2
            r2.mo58355Hk(r0)
            goto L_0x051d
        L_0x04b4:
            java.lang.String r2 = r15.f318512u
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r2)
            if (r0 == 0) goto L_0x051d
            r2 = 1
            r15.mo124068H(r2, r2)
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r3 = 0
            r0[r3] = r16
            boolean r3 = r15.mo160080e()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "onReceive() filePath:%s hasCurrentBall:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r0)
            goto L_0x051d
        L_0x04d6:
            r2 = 1
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r0 = r15.f326418a
            com.tencent.mm.plugin.handoff.model.HandOffFile r0 = com.tencent.p014mm.plugin.handoff.model.HandOffFile.fromMultiTask(r0)
            if (r0 == 0) goto L_0x051d
            r0.setHandOffType(r2)
            java.lang.String r2 = com.tencent.p014mm.plugin.handoff.model.HandOff.generateKey(r2, r2)
            r0.setKey(r2)
            di3.d r2 = di3.C86312j.m106911c(r21)
            c02.c r2 = (c02.C92331c) r2
            r2.k00(r0)
            goto L_0x051d
        L_0x04f3:
            java.lang.String r2 = r15.f318512u
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r2)
            if (r0 == 0) goto L_0x051d
            boolean r0 = r15.mo160080e()
            if (r0 != 0) goto L_0x0506
            r2 = 1
            r15.mo124068H(r2, r2)
            goto L_0x051d
        L_0x0506:
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r3 = 0
            r0[r3] = r16
            java.lang.String r2 = "onReceive() filePath:%s hasCurrentBall() == true"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r0)
            goto L_0x051d
        L_0x0512:
            r2 = 1
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r15
            java.lang.String r2 = "onReceive() unknow source(type:%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r0)
        L_0x051d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.QbCallBackBroadcast.onReceive(android.content.Context, android.content.Intent):void");
    }
}
