package com.tencent.p014mm.plugin.finder.feed.p052ui;

import ak1.C54116w;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.C112919c0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.fragment.FinderLiveAnchorFragment;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C88989a;
import nj3.C88995f1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorSecondaryDeviceUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88995f1
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorSecondaryDeviceUI */
public class FinderLiveAnchorSecondaryDeviceUI extends MMFinderUI {

    /* renamed from: o */
    public final String f158946o = "FinderLiveAnchorSecondaryDeviceUI";

    /* renamed from: p */
    public FinderLiveAnchorFragment f158947p;

    /* renamed from: q */
    public int f158948q = -1;

    /* renamed from: J7 */
    public String mo2994J7() {
        return this.f158946o;
    }

    /* renamed from: N7 */
    public final void mo77419N7() {
        FinderLiveAnchorFragment finderLiveAnchorFragment = new FinderLiveAnchorFragment();
        this.f158947p = finderLiveAnchorFragment;
        finderLiveAnchorFragment.f159299j = true;
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        C87412m.m108593f(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.mo165200l(C0966R.C0970id.eek, finderLiveAnchorFragment);
        beginTransaction.mo165164f();
    }

    public void finish() {
        FinderLiveAnchorFragment finderLiveAnchorFragment = this.f158947p;
        if (finderLiveAnchorFragment != null) {
            for (UIComponent onBeforeFinish : finderLiveAnchorFragment.f165434e) {
                onBeforeFinish.onBeforeFinish(getIntent());
            }
        }
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2493eh);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.akp;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        String str = this.f158946o;
        Log.m105924i(str, "[onConfigurationChanged] lastOrientation：" + this.f158948q + ",newConfig.orientation:" + configuration.orientation);
        int i = this.f158948q;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.f158948q = i2;
            Intent intent = getIntent();
            String stringExtra = getIntent().getStringExtra("KEY_PARAMS_CONFIG_KEY");
            if (stringExtra == null) {
                stringExtra = "";
            }
            intent.putExtra("KEY_PARAMS_CONFIG_KEY", stringExtra);
            getIntent().putExtra("KEY_PARAMS_RESET_LIVE", true);
            mo77419N7();
            ((C54116w) C86312j.m106911c(C54116w.class)).Ay0(true, configuration.orientation);
        }
        LocaleUtil.initLanguage(MMApplicationContext.getContext());
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        FinderLiveService.f159376d.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        if (bVar != null) {
            bVar.checkFinishWhenDiffTask(this);
        }
        super.onCreate(bundle);
        getIntent().putExtra("KEY_PARAMS_RESET_LIVE", false);
        mo77419N7();
        Log.m105924i(this.f158946o, "[onCreate]");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i(this.f158946o, "[onDestroy]");
    }

    public void onPause() {
        super.onPause();
        Log.m105924i(this.f158946o, "[onPause]");
    }

    public void onResume() {
        super.onResume();
        Log.m105924i(this.f158946o, "[onResume]");
    }

    public void onStart() {
        super.onStart();
        Log.m105924i(this.f158946o, "[onStart]");
    }

    public void onStop() {
        super.onStop();
        Log.m105924i(this.f158946o, "[onStop]");
    }

    public void onSwipeBack() {
        super.onSwipeBack();
    }
}
