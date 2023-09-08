package com.tencent.p014mm.plugin.appbrand.p026ui.privacy;

import com.tencent.p014mm.p136ui.MMActivity;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/privacy/AppBrandPrivacyPageContainerUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.privacy.AppBrandPrivacyPageContainerUI */
public final class AppBrandPrivacyPageContainerUI extends MMActivity {
    public int getLayoutId() {
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            android.content.Intent r5 = r4.getIntent()
            if (r5 == 0) goto L_0x0075
            java.lang.String r0 = "MMFragment_ClassName"
            java.lang.String r5 = r5.getStringExtra(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getMMFragment, className: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AppBrand.Privacy.MMFragmentExt"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 0
            if (r5 != 0) goto L_0x0029
            goto L_0x004d
        L_0x0029:
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ Exception -> 0x0038 }
            java.lang.Object r5 = r5.newInstance()     // Catch:{ Exception -> 0x0038 }
            boolean r2 = r5 instanceof com.tencent.p014mm.p136ui.MMFragment     // Catch:{ Exception -> 0x0038 }
            if (r2 == 0) goto L_0x004d
            com.tencent.mm.ui.MMFragment r5 = (com.tencent.p014mm.p136ui.MMFragment) r5     // Catch:{ Exception -> 0x0038 }
            goto L_0x004e
        L_0x0038:
            r5 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getMMFragment, newInstance fail since "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r5)
        L_0x004d:
            r5 = r0
        L_0x004e:
            if (r5 != 0) goto L_0x0051
            goto L_0x0075
        L_0x0051:
            androidx.fragment.app.FragmentManager r1 = r4.getSupportFragmentManager()
            androidx.fragment.app.c0 r1 = r1.beginTransaction()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.content.Intent r3 = r4.getIntent()
            if (r3 == 0) goto L_0x0067
            android.os.Bundle r3 = r3.getExtras()
            goto L_0x0068
        L_0x0067:
            r3 = r0
        L_0x0068:
            r5.setArguments(r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r3 = 1
            r1.mo165167i(r2, r5, r0, r3)
            r1.mo165162d()
            return
        L_0x0075:
            java.lang.String r5 = "MicroMsg.AppBrandPrivacyPageContainerUI"
            java.lang.String r0 = "onCreate, fragment is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            r4.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.privacy.AppBrandPrivacyPageContainerUI.onCreate(android.os.Bundle):void");
    }
}
