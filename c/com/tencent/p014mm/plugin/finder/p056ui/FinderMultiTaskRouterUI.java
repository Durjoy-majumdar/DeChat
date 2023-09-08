package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import in3.C87773e;
import kotlin.Metadata;
import nj3.C88989a;
import o40.C61926c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderMultiTaskRouterUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderMultiTaskRouterUI */
public final class FinderMultiTaskRouterUI extends MMFinderUI {

    /* renamed from: o */
    public static final /* synthetic */ int f161069o = 0;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderMultiTaskRouterUI$a */
    public static final class C56348a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderMultiTaskRouterUI f161070d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56348a(FinderMultiTaskRouterUI finderMultiTaskRouterUI) {
            super(0);
            this.f161070d = finderMultiTaskRouterUI;
        }

        public Object invoke() {
            FinderMultiTaskRouterUI finderMultiTaskRouterUI = this.f161070d;
            int i = FinderMultiTaskRouterUI.f161069o;
            finderMultiTaskRouterUI.finish();
            finderMultiTaskRouterUI.overridePendingTransition(0, 0);
            return C13598b0.f38549a;
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        setTheme(C0966R.style.f8621p2);
        C87773e.m109211d(getWindow());
        super.onCreate(bundle);
        if (!getIntent().getBooleanExtra("KEY_NEED_ANIM", false)) {
            finish();
            overridePendingTransition(0, 0);
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (getIntent().getBooleanExtra("KEY_NEED_ANIM", false)) {
            C61926c.m72666K(0, new C56348a(this));
        }
    }

    public void onStop() {
        super.onStop();
        if (!isFinishing()) {
            finish();
        }
    }
}
