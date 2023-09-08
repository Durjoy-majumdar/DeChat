package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.q */
public class C18037q implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ int f49844d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandAuthorizeUI f49845e;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.q$a */
    public class C18038a implements AppBrandAuthorizeUI$$p {

        /* renamed from: a */
        public final /* synthetic */ int f49846a;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.q$a$a */
        public class C18039a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f49848d;

            public C18039a(boolean z) {
                this.f49848d = z;
            }

            public void run() {
                if (this.f49848d) {
                    C18038a aVar = C18038a.this;
                    AppBrandAuthorizeUI.m18565L7(C18037q.this.f49845e, aVar.f49846a);
                } else {
                    C18037q qVar = C18037q.this;
                    AppBrandAuthorizeUI.m18565L7(qVar.f49845e, qVar.f49844d);
                }
                AppBrandAuthorizeUI appBrandAuthorizeUI = C18037q.this.f49845e;
                Preference preference = appBrandAuthorizeUI.f49763o;
                if (preference != null) {
                    if (appBrandAuthorizeUI.f49768t.f143898f != 1) {
                        preference.mo7740D(C0966R.string.f7621lp);
                    } else {
                        preference.mo7740D(C0966R.string.f7620lo);
                    }
                }
                C18037q.this.f49845e.f49761j.notifyDataSetChanged();
            }
        }

        public C18038a(int i) {
            this.f49846a = i;
        }

        /* renamed from: a */
        public void mo22488a(boolean z) {
            MMHandlerThread.postToMainThread(new C18039a(z));
        }
    }

    public C18037q(AppBrandAuthorizeUI appBrandAuthorizeUI, int i) {
        this.f49845e = appBrandAuthorizeUI;
        this.f49844d = i;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        int intExtra;
        if (i == 5 && i2 == -1 && intent != null && intent.hasExtra("key_result_state") && (intExtra = intent.getIntExtra("key_result_state", this.f49844d)) != this.f49844d) {
            this.f49845e.f49773y = true;
            Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "onClickLocationPreference, change location state to:%s", Integer.valueOf(intExtra));
            AppBrandAuthorizeUI.m18565L7(this.f49845e, intExtra);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add("scope.userFuzzyLocation");
            this.f49845e.mo22476X7(arrayList, new C18038a(intExtra));
        }
    }
}
