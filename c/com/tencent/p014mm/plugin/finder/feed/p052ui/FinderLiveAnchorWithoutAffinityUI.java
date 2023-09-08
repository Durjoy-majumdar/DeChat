package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import androidx.fragment.app.C112919c0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.fragment.FinderLiveAnchorFragment;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C88989a;
import nj3.C88995f1;
import o31.C11345b;
import o31.C76986a;
import sx3.C110826x0;
import vo3.C90852c;
import wc1.C15085j;
import wc1.C78523i;
import xk1.C15715a2;
import xk1.C15717b2;
import xk1.C15718c2;
import xk1.C15743j1;
import xk1.C15775s1;
import xk1.C15794y1;
import xk1.C15798z1;
import xk1.C66297d2;

@C88995f1
@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorWithoutAffinityUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorWithoutAffinityUI */
public class FinderLiveAnchorWithoutAffinityUI extends MMFinderUI {

    /* renamed from: o */
    public final String f158956o = "FinderLiveAnchorWithoutAffinityUI";

    /* renamed from: p */
    public FinderLiveAnchorFragment f158957p;

    public void finish() {
        FinderLiveAnchorFragment finderLiveAnchorFragment = this.f158957p;
        if (finderLiveAnchorFragment != null) {
            for (UIComponent onBeforeFinish : finderLiveAnchorFragment.f165434e) {
                onBeforeFinish.onBeforeFinish(getIntent());
            }
        }
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2493eh);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.adx;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C66297d2.class, C15085j.class, C78523i.class, C15715a2.class, C15798z1.class, C15717b2.class, C15775s1.class, C15794y1.class, C15743j1.class, C15718c2.class);
    }

    public void onBusinessPermissionDenied(String str) {
        C87412m.m108594g(str, "permission");
        if (C87412m.m108589b(str, "camera")) {
            finish();
        } else {
            C87412m.m108589b(str, "microphone");
        }
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [j50.a] */
    /* JADX WARNING: type inference failed for: r0v5, types: [j50.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBusinessPermissionGranted(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "permission"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "camera"
            boolean r0 = gy3.C87412m.m108589b(r4, r0)
            r1 = 0
            if (r0 == 0) goto L_0x002c
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r4.getClass()
            j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            boolean r2 = r0 instanceof c50.C54655b
            if (r2 == 0) goto L_0x001c
            r1 = r0
            c50.b r1 = (c50.C54655b) r1
        L_0x001c:
            if (r1 == 0) goto L_0x0048
            r4.getClass()
            s50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159390t
            r4.getClass()
            s50.b r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159393w
            r1.mo75578J0(r0, r4)
            goto L_0x0048
        L_0x002c:
            java.lang.String r0 = "microphone"
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x0048
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r4.getClass()
            j50.a r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            boolean r0 = r4 instanceof c50.C54655b
            if (r0 == 0) goto L_0x0042
            r1 = r4
            c50.b r1 = (c50.C54655b) r1
        L_0x0042:
            if (r1 == 0) goto L_0x0048
            r4 = 1
            r1.mo85699r0(r4)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveAnchorWithoutAffinityUI.onBusinessPermissionGranted(java.lang.String):void");
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
        FinderLiveAnchorFragment finderLiveAnchorFragment = new FinderLiveAnchorFragment();
        this.f158957p = finderLiveAnchorFragment;
        finderLiveAnchorFragment.f159299j = false;
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        C87412m.m108593f(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.mo165200l(C0966R.C0970id.eek, finderLiveAnchorFragment);
        beginTransaction.mo165164f();
        Log.m105924i(this.f158956o, "[onCreate]");
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderLiveAnchorWithoutAffinityUI).mo86179qs(this, C76986a.FinderLive).mo86148No(this, 40, 25388);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i(this.f158956o, "[onDestroy]");
    }

    public void onPause() {
        super.onPause();
        Log.m105924i(this.f158956o, "[onPause]");
    }

    public void onResume() {
        super.onResume();
        Log.m105924i(this.f158956o, "[onResume]");
    }

    public void onStart() {
        super.onStart();
        Log.m105924i(this.f158956o, "[onStart]");
    }

    public void onStop() {
        super.onStop();
        Log.m105924i(this.f158956o, "[onStop]");
    }

    public void onSwipeBack() {
        super.onSwipeBack();
    }
}
