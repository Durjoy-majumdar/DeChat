package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/AppBrandOpenMaterialUI;", "Lcom/tencent/mm/pluginsdk/ui/AutoLoginActivity;", "<init>", "()V", "ui-appchooser_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppBrandOpenMaterialUI */
public final class AppBrandOpenMaterialUI extends AutoLoginActivity {
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94557J7(com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity.C72717a r12, android.content.Intent r13) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "postLogin, loginResult: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", intent: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = ", extras: "
            r0.append(r1)
            r1 = 0
            if (r13 == 0) goto L_0x0023
            android.os.Bundle r2 = r13.getExtras()
            goto L_0x0024
        L_0x0023:
            r2 = r1
        L_0x0024:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.AppBrandOpenMaterialUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            if (r12 == 0) goto L_0x0189
            com.tencent.mm.pluginsdk.ui.AutoLoginActivity$a r0 = com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity.C72717a.LOGIN_OK
            if (r0 != r12) goto L_0x0189
            if (r13 != 0) goto L_0x003a
            goto L_0x0189
        L_0x003a:
            r12 = -1
            java.lang.String r0 = "menuId"
            int r12 = r13.getIntExtra(r0, r12)
            r0 = 5
            r3 = 1
            r4 = 0
            if (r0 == r12) goto L_0x004e
            java.lang.String r12 = "parseFileInfo, id is not match"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)
            goto L_0x010e
        L_0x004e:
            java.lang.String r12 = "thirdCtx"
            java.lang.String r12 = r13.getStringExtra(r12)
            if (r12 == 0) goto L_0x0060
            int r13 = r12.length()
            if (r13 != 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r13 = 0
            goto L_0x0061
        L_0x0060:
            r13 = 1
        L_0x0061:
            if (r13 == 0) goto L_0x006b
            java.lang.String r12 = "parseFileInfo, thirdContextJsonStr is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)
            goto L_0x010e
        L_0x006b:
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x00f8 }
            r13.<init>(r12)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r12 = "qb"
            java.lang.String r0 = "type"
            java.lang.String r0 = r13.getString(r0)     // Catch:{ Exception -> 0x00f8 }
            boolean r12 = gy3.C87412m.m108589b(r12, r0)     // Catch:{ Exception -> 0x00f8 }
            if (r12 != 0) goto L_0x0088
            java.lang.String r12 = "parseFileInfo, type is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x010e
        L_0x0088:
            java.lang.String r12 = "verify"
            java.lang.String r12 = r13.getString(r12)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r0 = "verifyKey"
            gy3.C87412m.m108593f(r12, r0)     // Catch:{ Exception -> 0x00f8 }
            boolean r12 = r11.mo153301L7(r12)     // Catch:{ Exception -> 0x00f8 }
            if (r12 != 0) goto L_0x00a2
            java.lang.String r12 = "parseFileInfo, verify caller failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x010e
        L_0x00a2:
            java.lang.String r12 = "filePath"
            java.lang.String r12 = r13.getString(r12)     // Catch:{ Exception -> 0x00f8 }
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r12)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r5 = r0.getPath()     // Catch:{ Exception -> 0x00f8 }
            if (r5 == 0) goto L_0x00cc
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r4, r4)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r6 = r0.getPath()     // Catch:{ Exception -> 0x00f8 }
            boolean r6 = r6.equals(r5)     // Catch:{ Exception -> 0x00f8 }
            if (r6 != 0) goto L_0x00cc
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ Exception -> 0x00f8 }
            android.net.Uri$Builder r0 = r0.path(r5)     // Catch:{ Exception -> 0x00f8 }
            android.net.Uri r0 = r0.build()     // Catch:{ Exception -> 0x00f8 }
        L_0x00cc:
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x00f8 }
            com.tencent.mm.vfs.f0$h r0 = r5.mo177799l(r0, r1)     // Catch:{ Exception -> 0x00f8 }
            boolean r5 = r0.mo177810a()     // Catch:{ Exception -> 0x00f8 }
            if (r5 != 0) goto L_0x00da
            r0 = 0
            goto L_0x00e2
        L_0x00da:
            com.tencent.mm.vfs.FileSystem$c r5 = r0.f348991a     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r0 = r0.f348992b     // Catch:{ Exception -> 0x00f8 }
            boolean r0 = r5.mo119948x(r0)     // Catch:{ Exception -> 0x00f8 }
        L_0x00e2:
            if (r0 != 0) goto L_0x00eb
            java.lang.String r12 = "parseFileInfo filePath not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)     // Catch:{ Exception -> 0x00f8 }
            goto L_0x010e
        L_0x00eb:
            java.lang.String r0 = "fileExt"
            java.lang.String r13 = r13.getString(r0)     // Catch:{ Exception -> 0x00f8 }
            rx3.l r0 = new rx3.l     // Catch:{ Exception -> 0x00f8 }
            r0.<init>(r12, r13)     // Catch:{ Exception -> 0x00f8 }
            r1 = r0
            goto L_0x010e
        L_0x00f8:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "parseFileInfo, fail since "
            r13.append(r0)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)
        L_0x010e:
            if (r1 != 0) goto L_0x0119
            java.lang.String r12 = "onCreate, fileInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)
            r11.finish()
            return
        L_0x0119:
            A r12 = r1.f38555d
            java.lang.String r12 = (java.lang.String) r12
            B r13 = r1.f38556e
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Class<kr0.l0> r0 = kr0.C109033l0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kr0.l0 r0 = (kr0.C109033l0) r0
            if (r0 != 0) goto L_0x0133
            java.lang.String r12 = "tryShowOpenMaterial, openMaterialService is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)
        L_0x0131:
            r3 = 0
            goto L_0x017e
        L_0x0133:
            com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel r12 = com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel.m117225b(r12, r13)
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection r8 = r0.mo158326lf(r12)
            java.lang.String r13 = "openMaterialService.rest…Collection(materialModel)"
            gy3.C87412m.m108593f(r8, r13)
            gq0.e0$b r13 = r0.mo158327vX()
            boolean r13 = r13.mo158297c(r8)
            if (r13 != 0) goto L_0x0152
            java.lang.String r12 = "tryShowOpenMaterial, can not create"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)
            goto L_0x0131
        L_0x0152:
            iq0.b r13 = iq0.C98783b.ATTACH
            gq0.f0 r10 = r0.z70(r13, r12, r8, r3)
            java.lang.String r12 = "openMaterialService.rest…MaterialCollection, true)"
            gy3.C87412m.m108593f(r10, r12)
            gq0.e0$b r12 = r0.mo158327vX()
            gq0.e0$b r5 = r12.mo158295a(r13)
            r7 = 0
            r9 = 0
            r6 = r11
            gq0.e0 r12 = r5.mo158296b(r6, r7, r8, r9, r10)
            java.lang.String r13 = "openMaterialService.open…    openMaterialReporter)"
            gy3.C87412m.m108593f(r12, r13)
            com.tencent.mm.pluginsdk.ui.tools.b r13 = new com.tencent.mm.pluginsdk.ui.tools.b
            r13.<init>(r11)
            r12.mo158290G(r13)
            r12.show()
        L_0x017e:
            if (r3 != 0) goto L_0x0188
            java.lang.String r12 = "onCreate, try show open material fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r12)
            r11.finish()
        L_0x0188:
            return
        L_0x0189:
            r11.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.AppBrandOpenMaterialUI.mo94557J7(com.tencent.mm.pluginsdk.ui.AutoLoginActivity$a, android.content.Intent):void");
    }

    /* renamed from: K7 */
    public boolean mo94558K7(Intent intent) {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo153301L7(java.lang.String r11) {
        /*
            r10 = this;
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FLOAT_BALL_FILES_QB_VERIFY_STRING_SYNC
            r2 = 0
            java.lang.Object r0 = r0.mo119685f(r1, r2)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0016
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0016:
            r0 = 1
            r1 = 0
            if (r2 == 0) goto L_0x0023
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r3 = 0
            goto L_0x0024
        L_0x0023:
            r3 = 1
        L_0x0024:
            java.lang.String r9 = "MicroMsg.AppBrand.AppBrandOpenMaterialUI"
            if (r3 == 0) goto L_0x002f
            java.lang.String r11 = "verifyCaller, originVerifyKeys is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r11)
            return r1
        L_0x002f:
            java.lang.String r3 = ","
            java.lang.String[] r4 = new java.lang.String[]{r3}
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r2
            java.util.List r3 = z04.C112550d0.m153785U(r3, r4, r5, r6, r7, r8)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0046
        L_0x0044:
            r3 = 0
            goto L_0x005d
        L_0x0046:
            java.util.Iterator r3 = r3.iterator()
        L_0x004a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r11)
            if (r4 == 0) goto L_0x004a
            r3 = 1
        L_0x005d:
            if (r3 != 0) goto L_0x007d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "verifyCaller, verify fail, verifyKey: "
            r0.append(r3)
            r0.append(r11)
            java.lang.String r11 = ", originVerifyKeys: "
            r0.append(r11)
            r0.append(r2)
            java.lang.String r11 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r11)
            return r1
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.AppBrandOpenMaterialUI.mo153301L7(java.lang.String):boolean");
    }

    public void initActivityCloseAnimation() {
        overridePendingTransition(0, 0);
    }

    public void initActivityOpenAnimation(Intent intent) {
        overridePendingTransition(0, 0);
    }

    public void onCreate(Bundle bundle) {
        setTheme(C0966R.style.f8648pu);
        super.onCreate(bundle);
        C85875k4.m106177d0(getWindow());
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }
}
