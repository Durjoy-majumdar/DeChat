package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.C112919c0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.replay.fragment.FinderLiveReplayFragment;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60172g4;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C88989a;
import o31.C11345b;
import o31.C76986a;
import sx3.C22415w0;
import zk1.C66877n0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveReplayUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveReplayUI */
public final class FinderLiveReplayUI extends MMFinderUI {

    /* renamed from: o */
    public int f159011o;

    /* renamed from: p */
    public FinderLiveReplayFragment f159012p;

    /* renamed from: q */
    public int f159013q = -1;

    /* renamed from: N7 */
    public final void mo77434N7() {
        FinderLiveReplayFragment finderLiveReplayFragment = new FinderLiveReplayFragment();
        this.f159012p = finderLiveReplayFragment;
        C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
        C87412m.m108593f(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.mo165200l(C0966R.C0970id.eek, finderLiveReplayFragment);
        beginTransaction.mo165164f();
    }

    public boolean convertActivityFromTranslucent() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f3 A[SYNTHETIC, Splitter:B:35:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0112 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finish() {
        /*
            r10 = this;
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r0 = r0.mo62444c(r10)
            java.lang.Class<zk1.n0> r1 = zk1.C66877n0.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            zk1.n0 r0 = (zk1.C66877n0) r0
            boolean r1 = r10.isSwiping()
            java.lang.String r2 = r0.f192116d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkIsNeedInterceptExit isForceFinish: "
            r3.append(r4)
            boolean r4 = r0.f192117e
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            boolean r2 = r0.f192117e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0032
            goto L_0x010f
        L_0x0032:
            ph1.a r2 = ph1.C62287a.f177060a
            long r5 = r0.f192118f
            ph1.m r5 = r2.mo87354b(r5)
            if (r5 == 0) goto L_0x0061
            boolean r6 = r5.mo84320e()
            java.lang.String r7 = r0.f192116d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "isNeedIntercept hasDetach : "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            boolean r6 = r5.mo84320e()
            if (r6 != 0) goto L_0x0061
            r5.mo84322g()
            goto L_0x00f0
        L_0x0061:
            boolean r5 = r0.f192121i
            if (r5 == 0) goto L_0x00e9
            if (r1 == 0) goto L_0x0069
            goto L_0x00e9
        L_0x0069:
            androidx.appcompat.app.AppCompatActivity r1 = r0.getActivity()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r5 = 2
            if (r1 != r5) goto L_0x007c
            r1 = 1
            goto L_0x007d
        L_0x007c:
            r1 = 0
        L_0x007d:
            java.lang.String r5 = r0.f192116d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "isNeedInterceptdestory isForceFinish = "
            r6.append(r7)
            boolean r7 = r0.f192117e
            r6.append(r7)
            java.lang.String r7 = " isLandscape: "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = " isEventIntercept: "
            r6.append(r7)
            r6.append(r4)
            r7 = 32
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            up1.f r5 = up1.C37521f.f99374d
            r5.getClass()
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99135B6
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != r3) goto L_0x00de
            pe1.c<java.lang.Integer> r5 = up1.C37521f.f99578z6
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != r3) goto L_0x00d9
            boolean r5 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r5 != 0) goto L_0x00d9
            boolean r5 = com.tencent.p014mm.p136ui.C85875k4.m106167X()
            if (r5 != 0) goto L_0x00d9
            r5 = 1
            goto L_0x00da
        L_0x00d9:
            r5 = 0
        L_0x00da:
            if (r5 == 0) goto L_0x00de
            r5 = 1
            goto L_0x00df
        L_0x00de:
            r5 = 0
        L_0x00df:
            if (r5 == 0) goto L_0x00f0
            boolean r5 = r0.f192117e
            if (r5 != 0) goto L_0x00f0
            if (r1 != 0) goto L_0x00f0
            r1 = 1
            goto L_0x00f1
        L_0x00e9:
            java.lang.String r1 = r0.f192116d
            java.lang.String r5 = "isNeedIntercept isUserClose = false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
        L_0x00f0:
            r1 = 0
        L_0x00f1:
            if (r1 == 0) goto L_0x010a
            r0.mo90869d3()     // Catch:{ all -> 0x00f7 }
            goto L_0x0110
        L_0x00f7:
            r1 = move-exception
            java.lang.String r2 = r0.f192116d
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r1
            java.lang.String r1 = "startExitAnimate exception"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r5)
            java.lang.String r1 = "exception"
            r0.mo90868c3(r1)
            goto L_0x0110
        L_0x010a:
            long r0 = r0.f192118f
            r2.mo87353a(r0)
        L_0x010f:
            r3 = 0
        L_0x0110:
            if (r3 == 0) goto L_0x0113
            return
        L_0x0113:
            r0 = -1
            r10.setResult(r0)
            super.finish()
            com.tencent.mm.plugin.finder.replay.fragment.FinderLiveReplayFragment r0 = r10.f159012p
            if (r0 == 0) goto L_0x0138
            java.util.HashSet<com.tencent.mm.ui.component.UIComponent> r0 = r0.f165434e
            java.util.Iterator r0 = r0.iterator()
        L_0x0124:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0138
            java.lang.Object r1 = r0.next()
            com.tencent.mm.ui.component.UIComponent r1 = (com.tencent.p014mm.p136ui.component.UIComponent) r1
            android.content.Intent r2 = r10.getIntent()
            r1.onBeforeFinish(r2)
            goto L_0x0124
        L_0x0138:
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r1 = "LAUNCH_WITH_ANIM"
            boolean r0 = r0.getBooleanExtra(r1, r4)
            if (r0 == 0) goto L_0x0148
            r0 = 2130771984(0x7f010010, float:1.7147074E38)
            goto L_0x014b
        L_0x0148:
            r0 = 2130772172(0x7f0100cc, float:1.7147455E38)
        L_0x014b:
            r1 = 2130771992(0x7f010018, float:1.714709E38)
            r10.overridePendingTransition(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveReplayUI.finish():void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ajj;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C66877n0.class);
    }

    public void initActivityCloseAnimation() {
        if (!getIntent().getBooleanExtra("LAUNCH_WITH_ANIM", false)) {
            super.initActivityCloseAnimation();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Log.m105924i("FinderLiveReplayUI", "[onConfigurationChanged] lastOrientation：" + this.f159013q + ",newConfig.orientation:" + configuration.orientation);
        int i = this.f159013q;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.f159013q = i2;
            getIntent().putExtra("KEY_PARAMS_RESET_REPLAY", true);
            FinderLiveReplayFragment finderLiveReplayFragment = this.f159012p;
            if (finderLiveReplayFragment != null) {
                C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
                C87412m.m108593f(beginTransaction, "supportFragmentManager.beginTransaction()");
                beginTransaction.mo165169k(finderLiveReplayFragment);
                beginTransaction.mo165164f();
            }
            mo77434N7();
        }
        LocaleUtil.initLanguage(MMApplicationContext.getContext());
    }

    public void onCreate(Bundle bundle) {
        Window window;
        View decorView;
        Class cls = C60172g4.class;
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderLiveReplayUI).mo86179qs(this, C76986a.Finder);
        this.f159011o = getIntent().getIntExtra("KEY_PARAMS_SOURCE_TYPE", 0);
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("key_context_id");
        String stringExtra2 = getIntent().getStringExtra("key_click_tab_context_id");
        String stringExtra3 = getIntent().getStringExtra("key_click_sub_tab_context_id");
        String stringExtra4 = getIntent().getStringExtra("key_chnl_extra");
        if (!TextUtils.isEmpty(stringExtra)) {
            ((C60172g4) C39818r.f106831a.mo62444c(this).mo62447c(cls)).mo12862r3(stringExtra);
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            ((C60172g4) C39818r.f106831a.mo62444c(this).mo62447c(cls)).mo12863s3(stringExtra2);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            ((C60172g4) C39818r.f106831a.mo62444c(this).mo62447c(cls)).mo12836B3(stringExtra3);
        }
        if (!TextUtils.isEmpty(stringExtra4)) {
            ((C60172g4) C39818r.f106831a.mo62444c(this).mo62447c(cls)).mo12865u3(stringExtra4);
        }
        getIntent().putExtra("KEY_PARAMS_RESET_REPLAY", false);
        mo77434N7();
        if (!(getIntent().getBooleanExtra("LAUNCH_WITH_ANIM", false) || (window = getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            decorView.setBackgroundColor(-16777216);
        }
        Log.m105924i("FinderLiveReplayUI", "[onCreate]");
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        if (!getIntent().getBooleanExtra("LAUNCH_WITH_ANIM", false)) {
            return;
        }
        if (C85875k4.m106211z()) {
            setTheme(C0966R.style.f8621p2);
        } else {
            setTheme(C0966R.style.f8621p2);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("FinderLiveReplayUI", "[onDestroy]");
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("FinderLiveReplayUI", "[onPause]");
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("FinderLiveReplayUI", "[onResume]");
    }

    public void onStart() {
        super.onStart();
        Log.m105924i("FinderLiveReplayUI", "[onStart]");
    }

    public void onStop() {
        super.onStop();
        Log.m105924i("FinderLiveReplayUI", "[onStop]");
    }
}
