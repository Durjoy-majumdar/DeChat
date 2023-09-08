package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import androidx.fragment.app.C112919c0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.fragment.FinderLiveTagFragment;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C88989a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveTagUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveTagUI */
public final class FinderLiveTagUI extends MMFinderUI {

    /* renamed from: o */
    public final String f159017o = "Finder.FinderLiveTagUI";

    /* renamed from: p */
    public FinderLiveTagFragment f159018p;

    /* renamed from: J7 */
    public String mo2994J7() {
        return this.f159017o;
    }

    public void finish() {
        FinderLiveTagFragment finderLiveTagFragment = this.f159018p;
        if (finderLiveTagFragment != null) {
            for (UIComponent onBeforeFinish : finderLiveTagFragment.f165434e) {
                onBeforeFinish.onBeforeFinish(getIntent());
            }
        }
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.akp;
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        getIntent().putExtra("KEY_PARAMS_RESET_LIVE", false);
        FinderLiveTagFragment finderLiveTagFragment = new FinderLiveTagFragment();
        this.f159018p = finderLiveTagFragment;
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        C87412m.m108593f(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.mo165200l(C0966R.C0970id.eek, finderLiveTagFragment);
        beginTransaction.mo165164f();
        Log.m105924i(this.f159017o, "[onCreate]");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i(this.f159017o, "[onDestroy]");
    }

    public void onPause() {
        super.onPause();
        Log.m105924i(this.f159017o, "[onPause]");
    }

    public void onResume() {
        super.onResume();
        Log.m105924i(this.f159017o, "[onResume]");
    }

    public void onStart() {
        super.onStart();
        Log.m105924i(this.f159017o, "[onStart]");
    }

    public void onStop() {
        super.onStop();
        Log.m105924i(this.f159017o, "[onStop]");
    }
}
