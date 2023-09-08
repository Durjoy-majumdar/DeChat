package bs0;

import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.manage.AppBrandPrivacyManagePage;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;

/* renamed from: bs0.d */
public final class C79788d implements MRecyclerView.C40583d {

    /* renamed from: a */
    public final /* synthetic */ C79798p f233817a;

    /* renamed from: b */
    public final /* synthetic */ AppBrandPrivacyManagePage f233818b;

    public C79788d(C79798p pVar, AppBrandPrivacyManagePage appBrandPrivacyManagePage) {
        this.f233817a = pVar;
        this.f233818b = appBrandPrivacyManagePage;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r9 = r9.f233864a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23073a(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, int r11, long r12) {
        /*
            r8 = this;
            bs0.p r9 = r8.f233817a
            java.util.ArrayList<bs0.r> r9 = r9.f233860d
            java.lang.Object r9 = sx3.C110818d0.m150917O(r9, r11)
            bs0.r r9 = (bs0.C79800r) r9
            if (r9 == 0) goto L_0x0013
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r9 = r9.f233864a
            if (r9 == 0) goto L_0x0013
            java.lang.String r9 = r9.field_username
            goto L_0x0014
        L_0x0013:
            r9 = 0
        L_0x0014:
            r10 = 0
            if (r9 == 0) goto L_0x0020
            int r12 = r9.length()
            if (r12 != 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r12 = 0
            goto L_0x0021
        L_0x0020:
            r12 = 1
        L_0x0021:
            java.lang.String r13 = "MicroMsg.AppBrandPrivacyManagePage"
            if (r12 == 0) goto L_0x003f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "onItemClick, position: "
            r9.append(r10)
            r9.append(r11)
            java.lang.String r10 = ", username is empty"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r9)
            return
        L_0x003f:
            com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage r11 = r8.f233818b
            com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage$a r12 = com.tencent.p014mm.plugin.appbrand.p026ui.privacy.manage.AppBrandPrivacyManagePage.f246784e
            r11.getClass()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "openSetting, username: "
            r12.append(r0)
            r12.append(r9)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r12)
            android.content.Intent r12 = new android.content.Intent
            android.content.Context r13 = as0.C39635c.m42240d(r11)
            java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI> r0 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthorizeUI.class
            r12.<init>(r13, r0)
            java.lang.String r13 = "key_username"
            r12.putExtra(r13, r9)
            java.lang.String r9 = "key_app_authorize_jsapi"
            r12.putExtra(r9, r10)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r12)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage"
            java.lang.String r3 = "openSetting"
            java.lang.String r4 = "(Ljava/lang/String;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r11
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r9 = r9.mo10231a(r10)
            android.content.Intent r9 = (android.content.Intent) r9
            r11.startActivity(r9)
            java.lang.String r1 = "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage"
            java.lang.String r2 = "openSetting"
            java.lang.String r3 = "(Ljava/lang/String;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bs0.C79788d.mo23073a(androidx.recyclerview.widget.RecyclerView, android.view.View, int, long):void");
    }
}
