package com.tencent.p014mm.plugin.lite.p068ui;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import kotlin.Metadata;
import nj3.C88989a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/lite/ui/WxaLiteAppProxyUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "luggage-lite-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(2)
/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppProxyUI */
public final class WxaLiteAppProxyUI extends MMActivity {

    /* renamed from: d */
    public int f346343d = 4;

    /* renamed from: e */
    public int f346344e = 5;

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00df A[LOOP:0: B:35:0x00d9->B:37:0x00df, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018b A[EDGE_INSN: B:100:0x018b->B:60:0x018b ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x028b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            java.lang.Class<tt.e> r0 = p244tt.C14088e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tt.e r0 = (p244tt.C14088e) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.mo13514aF(r1)
            super.onCreate(r15)
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r0 = "report"
            boolean r15 = r15.hasExtra(r0)
            if (r15 == 0) goto L_0x002a
            android.content.Intent r15 = r14.getIntent()
            android.os.Parcelable r15 = r15.getParcelableExtra(r0)
            gy3.C87412m.m108591d(r15)
            com.tencent.liteapp.report.WxaLiteAppStartReport r15 = (com.tencent.liteapp.report.WxaLiteAppStartReport) r15
            goto L_0x002f
        L_0x002a:
            com.tencent.liteapp.report.WxaLiteAppStartReport r15 = new com.tencent.liteapp.report.WxaLiteAppStartReport
            r15.<init>()
        L_0x002f:
            r1 = 0
            r14.setActionbarColor(r1)
            r14.setNavigationbarColor(r1)
            com.tencent.mm.plugin.lite.a$a r2 = com.tencent.p014mm.plugin.lite.C115472a.f346202a
            r2.mo175446b(r1, r15)
            boolean r2 = r15.f339265h
            r3 = 1404(0x57c, float:1.967E-42)
            if (r2 == 0) goto L_0x0049
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            int r4 = r14.f346344e
            r2.mo175911u(r3, r4)
            goto L_0x0050
        L_0x0049:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            int r4 = r14.f346343d
            r2.mo175911u(r3, r4)
        L_0x0050:
            android.content.Intent r2 = r14.getIntent()
            java.lang.String r3 = "WxaLiteAppLaunchInfo"
            android.os.Parcelable r2 = r2.getParcelableExtra(r3)
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.lite.launch.WxaLiteAppLaunchInfo"
            gy3.C87412m.m108592e(r2, r3)
            com.tencent.mm.plugin.lite.launch.WxaLiteAppLaunchInfo r2 = (com.tencent.p014mm.plugin.lite.launch.WxaLiteAppLaunchInfo) r2
            tw3.d r3 = tw3.C118552d.m167207g()
            io.flutter.embedding.engine.FlutterEngine r3 = r3.f354799c
            r4 = 1
            if (r3 == 0) goto L_0x006c
            r3 = 1
            goto L_0x006d
        L_0x006c:
            r3 = 0
        L_0x006d:
            if (r3 == 0) goto L_0x0072
            r15.f339274t = r4
            goto L_0x007a
        L_0x0072:
            r15.f339274t = r1
            long r5 = java.lang.System.currentTimeMillis()
            r15.f339275u = r5
        L_0x007a:
            tw3.d r5 = tw3.C118552d.m167207g()
            r5.mo183269i()
            if (r3 != 0) goto L_0x008c
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r15.f339275u
            long r5 = r5 - r7
            r15.f339276v = r5
        L_0x008c:
            java.lang.String r3 = r2.f346218h
            r15.f339262e = r3
            java.lang.String r3 = r2.f346217g
            if (r3 == 0) goto L_0x00a3
            int r5 = r3.length()
            if (r5 != 0) goto L_0x009c
            r5 = 1
            goto L_0x009d
        L_0x009c:
            r5 = 0
        L_0x009d:
            if (r5 == 0) goto L_0x00a0
            goto L_0x00a3
        L_0x00a0:
            r15.f339263f = r3
            goto L_0x00a7
        L_0x00a3:
            java.lang.String r3 = "index"
            r15.f339263f = r3
        L_0x00a7:
            boolean r3 = com.tencent.p014mm.plugin.lite.LiteAppCenter.fontScaleFollowSystem
            if (r3 != 0) goto L_0x00b5
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r3 = kg3.C76577a.m92165p(r3)
            com.tencent.p014mm.plugin.lite.LiteAppCenter.fontScale = r3
        L_0x00b5:
            java.lang.String r5 = r2.f346219i
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r5 == 0) goto L_0x0100
            java.lang.String r6 = ""
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x00c7
            goto L_0x0100
        L_0x00c7:
            java.lang.String r6 = "&"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r5 = z04.C112550d0.m153785U(r5, r6, r7, r8, r9, r10)
            java.util.Iterator r5 = r5.iterator()
        L_0x00d9:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0100
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r6 = "="
            java.lang.String[] r8 = new java.lang.String[]{r6}
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            java.util.List r6 = z04.C112550d0.m153785U(r7, r8, r9, r10, r11, r12)
            java.lang.Object r7 = r6.get(r1)
            java.lang.Object r6 = r6.get(r4)
            r3.put(r7, r6)
            goto L_0x00d9
        L_0x0100:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r6 = 0
            java.lang.String r7 = "1"
            java.lang.String r8 = "debug"
            r9 = 2
            if (r5 != 0) goto L_0x0154
            boolean r5 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.isCoolassistEnv()
            if (r5 != 0) goto L_0x0154
            java.lang.Object r5 = r3.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = z04.C112551y.m153810j(r5, r7, r1, r9, r6)
            if (r5 == 0) goto L_0x0154
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Set r10 = r3.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0129:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0153
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r11.getValue()
            java.lang.String r11 = (java.lang.String) r11
            boolean r13 = r3.equals(r8)
            if (r13 != 0) goto L_0x0129
            java.lang.String r13 = "debugSvr"
            boolean r13 = r3.equals(r13)
            if (r13 != 0) goto L_0x0129
            r5.put(r12, r11)
            goto L_0x0129
        L_0x0153:
            r3 = r5
        L_0x0154:
            java.util.Map<java.lang.String, java.lang.String> r5 = com.tencent.p014mm.plugin.lite.C115472a.f346205d
            int r10 = r3.size()
            int r11 = r5.size()
            if (r10 == r11) goto L_0x0161
            goto L_0x018b
        L_0x0161:
            java.util.Set r10 = r3.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0169:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x018d
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r11.getValue()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r5.get(r12)
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0169
        L_0x018b:
            r5 = 0
            goto L_0x018e
        L_0x018d:
            r5 = 1
        L_0x018e:
            if (r5 == 0) goto L_0x019c
            java.lang.Object r5 = r3.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = z04.C112551y.m153810j(r5, r7, r1, r9, r6)
            if (r5 == 0) goto L_0x01a7
        L_0x019c:
            com.tencent.p014mm.plugin.lite.C115472a.f346205d = r3
            java.lang.String r5 = com.tencent.p014mm.plugin.lite.LiteAppCenter.getLastPath()
            java.lang.String r6 = "Vue"
            com.tencent.p014mm.plugin.lite.LiteAppCenter.setPath((java.lang.String) r5, (java.util.Map<java.lang.String, java.lang.String>) r3, (java.lang.String) r6)
        L_0x01a7:
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI> r5 = com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppLiteUI.class
            r3.<init>(r14, r5)
            java.lang.String r5 = "main"
            java.lang.String r6 = "liteApp"
            r3.putExtra(r5, r6)
            java.lang.String r5 = "transparent"
            java.lang.String r6 = "background_mode"
            r3.putExtra(r6, r5)
            r3.putExtra(r0, r15)
            com.tencent.liteapp.storage.WxaLiteAppInfo r15 = new com.tencent.liteapp.storage.WxaLiteAppInfo
            r15.<init>()
            java.lang.String r0 = r2.f346214d
            r15.f339290d = r0
            java.lang.String r0 = r2.f346215e
            r15.f339295i = r0
            java.lang.String r0 = r2.f346216f
            r15.f339294h = r0
            java.lang.String r0 = r2.f346218h
            java.lang.String r6 = "query"
            r3.putExtra(r6, r0)
            java.lang.String r0 = r2.f346217g
            java.lang.String r2 = "page"
            r3.putExtra(r2, r0)
            java.lang.String r0 = "LiteApp"
            r3.putExtra(r0, r15)
            android.content.Intent r15 = r14.getIntent()
            r0 = -1
            java.lang.String r2 = "dataUuid"
            int r15 = r15.getIntExtra(r2, r0)
            if (r15 <= 0) goto L_0x01f3
            r3.putExtra(r2, r15)
        L_0x01f3:
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r0 = "extraData"
            boolean r15 = r15.hasExtra(r0)
            if (r15 == 0) goto L_0x020a
            android.content.Intent r15 = r14.getIntent()
            android.os.Bundle r15 = r15.getBundleExtra(r0)
            r3.putExtra(r0, r15)
        L_0x020a:
            android.content.Intent r15 = r14.getIntent()
            java.lang.String r0 = "bundle"
            android.os.Bundle r15 = r15.getBundleExtra(r0)
            r3.putExtra(r0, r15)
            if (r15 == 0) goto L_0x024d
            java.lang.String r0 = "requestCode"
            boolean r2 = r15.containsKey(r0)
            if (r2 == 0) goto L_0x0226
            int r0 = r15.getInt(r0)
            goto L_0x0227
        L_0x0226:
            r0 = 0
        L_0x0227:
            java.lang.String r2 = "isHalfScreen"
            boolean r6 = r15.containsKey(r2)
            if (r6 == 0) goto L_0x023b
            boolean r2 = r15.getBoolean(r2)
            if (r2 != r4) goto L_0x023b
            java.lang.Class<com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetBGUI> r15 = com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppSheetBGUI.class
            r3.setClass(r14, r15)
            goto L_0x024e
        L_0x023b:
            boolean r2 = r15.containsKey(r5)
            if (r2 == 0) goto L_0x024e
            boolean r15 = r15.getBoolean(r5)
            if (r15 == 0) goto L_0x024e
            java.lang.Class<com.tencent.mm.plugin.lite.ui.WxaLiteAppTransparentLiteUI> r15 = com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppTransparentLiteUI.class
            r3.setClass(r14, r15)
            goto L_0x024e
        L_0x024d:
            r0 = 0
        L_0x024e:
            if (r0 <= 0) goto L_0x0254
            r14.startActivityForResult((android.content.Intent) r3, (int) r0)
            goto L_0x0289
        L_0x0254:
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r3)
            java.lang.Object[] r5 = r15.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/lite/ui/WxaLiteAppProxyUI"
            java.lang.String r7 = "onCreate"
            java.lang.String r8 = "(Landroid/os/Bundle;)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r4 = r14
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r15 = r15.mo10231a(r1)
            android.content.Intent r15 = (android.content.Intent) r15
            r14.startActivity(r15)
            java.lang.String r2 = "com/tencent/mm/plugin/lite/ui/WxaLiteAppProxyUI"
            java.lang.String r3 = "onCreate"
            java.lang.String r4 = "(Landroid/os/Bundle;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r14
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x0289:
            if (r0 > 0) goto L_0x028e
            r14.finish()
        L_0x028e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.lite.p068ui.WxaLiteAppProxyUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
