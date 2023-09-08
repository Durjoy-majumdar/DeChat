package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C29452i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.p */
public class C18034p implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ int f49838d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandAuthorizeUI f49839e;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.p$a */
    public class C18035a implements AppBrandAuthorizeUI$$p {

        /* renamed from: a */
        public final /* synthetic */ int f49840a;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.p$a$a */
        public class C18036a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f49842d;

            public C18036a(boolean z) {
                this.f49842d = z;
            }

            public void run() {
                if (this.f49842d) {
                    C18035a aVar = C18035a.this;
                    AppBrandAuthorizeUI.m18564K7(C18034p.this.f49839e, aVar.f49840a);
                } else {
                    C18034p pVar = C18034p.this;
                    AppBrandAuthorizeUI.m18564K7(pVar.f49839e, pVar.f49838d);
                }
                C18034p.this.f49839e.mo22481c8();
                C18034p.this.f49839e.f49761j.notifyDataSetChanged();
            }
        }

        public C18035a(int i) {
            this.f49840a = i;
        }

        /* renamed from: a */
        public void mo22488a(boolean z) {
            MMHandlerThread.postToMainThread(new C18036a(z));
        }
    }

    public C18034p(AppBrandAuthorizeUI appBrandAuthorizeUI, int i) {
        this.f49839e = appBrandAuthorizeUI;
        this.f49838d = i;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        int intExtra;
        if (i == 1 && i2 == -1 && intent != null && intent.hasExtra("key_result_state") && (intExtra = intent.getIntExtra("key_result_state", this.f49838d)) != this.f49838d) {
            this.f49839e.f49773y = true;
            Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "onClickLocationPreference, change location state to:%s", Integer.valueOf(intExtra));
            AppBrandAuthorizeUI.m18564K7(this.f49839e, intExtra);
            if (intExtra == 2) {
                AppBrandAuthorizeUI appBrandAuthorizeUI = this.f49839e;
                appBrandAuthorizeUI.getClass();
                Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "report click location background auth state");
                C29452i.m38741a(appBrandAuthorizeUI.f49757f, appBrandAuthorizeUI.f49758g, System.currentTimeMillis(), 3, "", 0);
            }
            ArrayList arrayList = new ArrayList(2);
            arrayList.add("scope.userLocation");
            arrayList.add("scope.userLocationBackground");
            this.f49839e.mo22476X7(arrayList, new C18035a(intExtra));
        }
    }
}
