package com.tencent.p014mm.plugin.appbrand.outerwidget.entry;

import com.tencent.p014mm.p136ui.MMActivity;

/* renamed from: com.tencent.mm.plugin.appbrand.outerwidget.entry.WidgetEntryActivity */
public class WidgetEntryActivity extends MMActivity {
    public int getLayoutId() {
        return -1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            super.onCreate(r18)
            android.content.Intent r0 = r17.getIntent()
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "MicroMsg.AppBrandOuterWidget"
            java.lang.String r1 = "intent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            r17.finish()
            return
        L_0x0014:
            oq0.b r1 = oq0.C11720b.INSTANCE
            java.lang.String r2 = "extra_action"
            java.lang.String r2 = r0.getStringExtra(r2)
            if (r2 != 0) goto L_0x0020
            goto L_0x0130
        L_0x0020:
            int r3 = r2.hashCode()
            r4 = 1
            r5 = 0
            r6 = -1
            r7 = 3
            r8 = 2
            switch(r3) {
                case -2016297581: goto L_0x004e;
                case -1277381344: goto L_0x0043;
                case -220619501: goto L_0x0038;
                case 1648930373: goto L_0x002d;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0059
        L_0x002d:
            java.lang.String r3 = "action_click_bg"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0036
            goto L_0x0059
        L_0x0036:
            r2 = 3
            goto L_0x005a
        L_0x0038:
            java.lang.String r3 = "action_click_item"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0041
            goto L_0x0059
        L_0x0041:
            r2 = 2
            goto L_0x005a
        L_0x0043:
            java.lang.String r3 = "action_authorize"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004c
            goto L_0x0059
        L_0x004c:
            r2 = 1
            goto L_0x005a
        L_0x004e:
            java.lang.String r3 = "action_go_to_login"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r2 = 0
            goto L_0x005a
        L_0x0059:
            r2 = -1
        L_0x005a:
            if (r2 == 0) goto L_0x00ef
            if (r2 == r4) goto L_0x00c9
            if (r2 == r8) goto L_0x00bc
            if (r2 == r7) goto L_0x0064
            goto L_0x0103
        L_0x0064:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI> r2 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherFolderUI.class
            r1.<init>(r0, r2)
            r2 = 335544320(0x14000000, float:6.4623485E-27)
            r1.addFlags(r2)
            r2 = 1223(0x4c7, float:1.714E-42)
            java.lang.String r3 = "extra_enter_scene"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "KEY_MODE"
            r1.putExtra(r2, r8)
            java.lang.String r2 = "extra_is_from_widget"
            r1.putExtra(r2, r4)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r1)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/appbrand/outerwidget/entry/WidgetEntryManager"
            java.lang.String r12 = "jumpToCollectionList"
            java.lang.String r13 = "(Landroid/content/Context;)V"
            java.lang.String r14 = "Undefined"
            java.lang.String r15 = "startActivity"
            java.lang.String r16 = "(Landroid/content/Intent;)V"
            r9 = r0
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r2.mo10231a(r5)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.startActivity(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/appbrand/outerwidget/entry/WidgetEntryManager"
            java.lang.String r11 = "jumpToCollectionList"
            java.lang.String r12 = "(Landroid/content/Context;)V"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "startActivity"
            java.lang.String r15 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0103
        L_0x00bc:
            zt3.t r2 = zt3.C119157j.f356862d
            oq0.a r3 = new oq0.a
            r3.<init>(r1, r0)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183875f(r3)
            goto L_0x0103
        L_0x00c9:
            com.tencent.mm.plugin.appbrand.app.o r0 = com.tencent.p014mm.plugin.appbrand.app.C1510o.f10864a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.mo1516a()
            java.lang.String r1 = "check_authorization_key"
            r0.putBoolean(r1, r4)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.appwidget.AppWidgetManager r1 = android.appwidget.AppWidgetManager.getInstance(r0)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.Class<com.tencent.mm.plugin.appbrand.outerwidget.AppBrandOuterWidget> r4 = com.tencent.p014mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.class
            r3.<init>(r0, r4)
            int[] r0 = r1.getAppWidgetIds(r3)
            com.tencent.p014mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.m102762c(r2, r1, r0)
            goto L_0x0103
        L_0x00ef:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r1)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 0
            java.lang.String r3 = "com.tencent.mm.ui.LauncherUI"
            ke3.C88144b.m109801s(r1, r3, r0, r2)
        L_0x0103:
            r0 = 1001(0x3e9, double:4.946E-321)
            java.lang.Class<com.tencent.mm.plugin.appbrand.appusage.h1> r2 = com.tencent.p014mm.plugin.appbrand.appusage.C68585h1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            com.tencent.mm.plugin.appbrand.appusage.h1 r2 = (com.tencent.p014mm.plugin.appbrand.appusage.C68585h1) r2
            if (r2 != 0) goto L_0x0110
            goto L_0x0120
        L_0x0110:
            r3 = 2147483647(0x7fffffff, float:NaN)
            com.tencent.mm.plugin.appbrand.appusage.h1$a r4 = com.tencent.p014mm.plugin.appbrand.appusage.C68585h1.C68586a.DESC
            java.util.List r2 = r2.mo94245pM(r3, r4)
            if (r2 != 0) goto L_0x011c
            goto L_0x0120
        L_0x011c:
            int r6 = r2.size()
        L_0x0120:
            com.tencent.mm.sdk.storage.MStorage$IOnStorageChange r2 = com.tencent.p014mm.plugin.appbrand.outerwidget.AppBrandOuterWidget.f244363a
            com.tencent.mm.autogen.mmdata.rpt.AppBrandWidgetReportStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.AppBrandWidgetReportStruct
            r2.<init>()
            r2.f236362d = r0
            r2.f236363e = r8
            r2.f236364f = r6
            r2.mo86054n()
        L_0x0130:
            r17.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.outerwidget.entry.WidgetEntryActivity.onCreate(android.os.Bundle):void");
    }
}
