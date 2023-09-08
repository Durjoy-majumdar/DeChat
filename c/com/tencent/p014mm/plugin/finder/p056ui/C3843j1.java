package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.coroutines.SafeResume;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.finder.ui.j1 */
public final class C3843j1 implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ SafeResume<String> f17381d;

    public C3843j1(SafeResume<String> safeResume) {
        this.f17381d = safeResume;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("Finder.FinderLivePostHelperUI", "[checkRealName] requestCode:" + i + ", resultCode:" + i2);
        if (i == 40001) {
            if (i2 == -1) {
                String stringExtra = intent != null ? intent.getStringExtra("intent_auth_token") : null;
                Log.m105924i("Finder.FinderLivePostHelperUI", "checkPwdToken:" + stringExtra);
                this.f17381d.resume(stringExtra);
            }
            this.f17381d.resume("");
        }
    }
}
