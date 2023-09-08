package rs1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import zc1.C66785b;

@C113200q(initialMode = 2)
/* renamed from: rs1.b1 */
public final class C63545b1 extends UIComponent {

    /* renamed from: d */
    public C56597e1 f180225d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63545b1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C56597e1 e1Var = this.f180225d;
        if (e1Var != null) {
            e1Var.mo79925c(i, i2, intent);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onBackPressed() {
        /*
            r4 = this;
            com.tencent.mm.plugin.finder.view.e1 r0 = r4.f180225d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.mo79924b()
            if (r0 != r2) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            if (r0 == 0) goto L_0x0046
            bl3.r r0 = bl3.C39818r.f106831a
            android.app.Activity r3 = r4.getContext()
            bl3.r$a r0 = r0.mo62443b(r3)
            java.lang.Class<rs1.q4> r3 = rs1.C48085q4.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r3)
            rs1.q4 r0 = (rs1.C48085q4) r0
            com.tencent.mm.plugin.finder.webview.FinderWebViewScrollViewWrapper r0 = r0.f128939d
            if (r0 == 0) goto L_0x003b
            zs1.h r3 = r0.f111984b
            boolean r3 = r3.isAttachedToWindow()
            if (r3 != 0) goto L_0x0036
            boolean r0 = r0.f111987e
            if (r0 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r0 = 0
            goto L_0x0037
        L_0x0036:
            r0 = 1
        L_0x0037:
            if (r0 != r2) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            if (r0 != 0) goto L_0x0046
            com.tencent.mm.plugin.finder.view.e1 r0 = r4.f180225d
            if (r0 == 0) goto L_0x0045
            r0.mo79923a()
        L_0x0045:
            return r2
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63545b1.onBackPressed():boolean");
    }

    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("finder_username");
        boolean z = false;
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        if ((stringExtra != null ? stringExtra.equals(C66785b.f191882e.mo90662O5()) : false) && booleanExtra) {
            z = true;
        }
        C56597e1.C56598a aVar = C56597e1.f162252i;
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        MMFragmentActivity mMFragmentActivity = (MMFragmentActivity) activity;
        View decorView = getActivity().getWindow().getDecorView();
        C87412m.m108593f(decorView, "activity.window.decorView");
        this.f180225d = aVar.mo79927b(mMFragmentActivity, decorView, z ? 1 : 2, false, 58);
    }

    public void onDestroy() {
        FinderCommentDrawer finderCommentDrawer;
        C56597e1 e1Var = this.f180225d;
        if (e1Var != null && (finderCommentDrawer = e1Var.f162255a) != null) {
            finderCommentDrawer.mo9498f();
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        FinderCommentDrawer finderCommentDrawer;
        super.onResume();
        C56597e1 e1Var = this.f180225d;
        if (e1Var != null && (finderCommentDrawer = e1Var.f162255a) != null) {
            finderCommentDrawer.mo79716n(false);
        }
    }
}
