package com.tencent.p014mm.plugin.finder.feed.p052ui;

import ak1.C54116w;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.C112919c0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.fragment.FinderLiveWeCoinHotFragment;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C88989a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveWeCoinHotIncomeUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveWeCoinHotIncomeUI */
public final class FinderLiveWeCoinHotIncomeUI extends MMFinderUI {

    /* renamed from: o */
    public final String f159026o = "FinderLiveWeCoinHotIncomeUI";

    /* renamed from: p */
    public FinderLiveWeCoinHotFragment f159027p;

    /* renamed from: q */
    public int f159028q = -1;

    /* renamed from: J7 */
    public String mo2994J7() {
        return this.f159026o;
    }

    /* renamed from: N7 */
    public final void mo77437N7() {
        FinderLiveWeCoinHotFragment finderLiveWeCoinHotFragment = new FinderLiveWeCoinHotFragment();
        this.f159027p = finderLiveWeCoinHotFragment;
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        C87412m.m108593f(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.mo165200l(C0966R.C0970id.eek, finderLiveWeCoinHotFragment);
        beginTransaction.mo165164f();
    }

    public void finish() {
        FinderLiveWeCoinHotFragment finderLiveWeCoinHotFragment = this.f159027p;
        if (finderLiveWeCoinHotFragment != null) {
            for (UIComponent onBeforeFinish : finderLiveWeCoinHotFragment.f165434e) {
                onBeforeFinish.onBeforeFinish(getIntent());
            }
        }
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.akp;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        String str = this.f159026o;
        Log.m105924i(str, "[onConfigurationChanged] lastOrientation：" + this.f159028q + ",newConfig.orientation:" + configuration.orientation);
        int i = this.f159028q;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.f159028q = i2;
            Intent intent = getIntent();
            String stringExtra = getIntent().getStringExtra("KEY_PARAMS_CONFIG_KEY");
            if (stringExtra == null) {
                stringExtra = "";
            }
            intent.putExtra("KEY_PARAMS_CONFIG_KEY", stringExtra);
            getIntent().putExtra("KEY_PARAMS_RESET_LIVE", true);
            mo77437N7();
            ((C54116w) C86312j.m106911c(C54116w.class)).Ay0(true, configuration.orientation);
        }
        LocaleUtil.initLanguage(MMApplicationContext.getContext());
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        getIntent().putExtra("KEY_PARAMS_RESET_LIVE", false);
        mo77437N7();
        Log.m105924i(this.f159026o, "[onCreate]");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i(this.f159026o, "[onDestroy]");
    }

    public void onPause() {
        super.onPause();
        Log.m105924i(this.f159026o, "[onPause]");
    }

    public void onResume() {
        super.onResume();
        Log.m105924i(this.f159026o, "[onResume]");
    }

    public void onStart() {
        super.onStart();
        Log.m105924i(this.f159026o, "[onStart]");
    }

    public void onStop() {
        super.onStop();
        Log.m105924i(this.f159026o, "[onStop]");
    }
}
