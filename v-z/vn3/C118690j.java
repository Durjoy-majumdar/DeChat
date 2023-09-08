package vn3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import co3.C113370c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.base.preference.MMPreferenceFragment;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: vn3.j */
public final class C118690j extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ int f355159d;

    /* renamed from: e */
    public final /* synthetic */ VASCommonFragment f355160e;

    /* renamed from: f */
    public final /* synthetic */ Animator f355161f;

    public C118690j(int i, VASCommonFragment vASCommonFragment, Animator animator) {
        this.f355159d = i;
        this.f355160e = vASCommonFragment;
        this.f355161f = animator;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        String str = this.f355160e.f348641n;
        Log.m105918d(str, "onAnimationEnd() called with: animation = " + animator);
        int i = this.f355159d;
        if (i == C0966R.C0968anim.f2535fn) {
            C113370c cVar = MMFragmentActivity.aReporter;
            VASActivity vASActivity = this.f355160e.f348642o;
            cVar.mo146070b(vASActivity != null ? vASActivity.getIntent() : null);
            VASCommonFragment vASCommonFragment = this.f355160e;
            if (vASCommonFragment.f348653z.getBooleanExtra(VASActivity.KEY_VAS_LAUNCHER_ENTER_PAGE, false)) {
                MMPreferenceFragment.m86269K();
            }
            VASActivity vASActivity2 = vASCommonFragment.f348642o;
            if (vASActivity2 != null) {
                vASActivity2.onPageEnterAnimEnd();
            }
        } else if (i == C0966R.C0968anim.f2538fq) {
            VASCommonFragment vASCommonFragment2 = this.f355160e;
            if (vASCommonFragment2.f348653z.getBooleanExtra(VASActivity.KEY_VAS_LAUNCHER_ENTER_PAGE, false)) {
                Log.m105918d(vASCommonFragment2.f348641n, "finishVASLauncherEnterPage");
                VASActivity vASActivity3 = vASCommonFragment2.f348642o;
                if (vASActivity3 != null) {
                    vASActivity3.finish();
                }
            }
            vASCommonFragment2.f348635E = true;
        }
        ((ValueAnimator) this.f355161f).removeListener(this);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationStart(android.animation.Animator r7) {
        /*
            r6 = this;
            super.onAnimationStart(r7)
            int r7 = r6.f355159d
            java.lang.String r0 = "KEY_VAS_LAUNCHER_ENTER_PAGE"
            r1 = 0
            r2 = 2130772220(0x7f0100fc, float:1.7147552E38)
            if (r7 != r2) goto L_0x0045
            co3.c r7 = com.tencent.p014mm.p136ui.MMFragmentActivity.aReporter
            com.tencent.mm.ui.vas.VASCommonFragment r2 = r6.f355160e
            com.tencent.mm.ui.vas.VASActivity r2 = r2.f348642o
            r3 = 0
            if (r2 == 0) goto L_0x001b
            android.content.Intent r2 = r2.getIntent()
            goto L_0x001c
        L_0x001b:
            r2 = r3
        L_0x001c:
            long r4 = java.lang.System.currentTimeMillis()
            r7.mo146071c(r2, r4)
            com.tencent.mm.ui.vas.VASCommonFragment r7 = r6.f355160e
            android.content.Intent r2 = r7.f348653z
            boolean r0 = r2.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x003d
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.vas.launcher.VASLauncher
            if (r1 == 0) goto L_0x0038
            r3 = r0
            com.tencent.mm.ui.vas.launcher.VASLauncher r3 = (com.tencent.p014mm.p136ui.vas.launcher.VASLauncher) r3
        L_0x0038:
            if (r3 == 0) goto L_0x003d
            r3.mo101370J7()
        L_0x003d:
            com.tencent.mm.ui.vas.VASActivity r7 = r7.f348642o
            if (r7 == 0) goto L_0x0068
            r7.onPageEnterAnimStart()
            goto L_0x0068
        L_0x0045:
            r2 = 2130772223(0x7f0100ff, float:1.7147558E38)
            if (r7 != r2) goto L_0x0068
            com.tencent.mm.ui.vas.VASCommonFragment r7 = r6.f355160e
            android.content.Intent r2 = r7.f348653z
            boolean r0 = r2.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = r7.f348641n
            java.lang.String r1 = "checkFinishVASLauncherEnterPageAnimStart"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            androidx.fragment.app.FragmentActivity r7 = r7.getActivity()
            boolean r0 = r7 instanceof com.tencent.p014mm.p136ui.vas.launcher.VASLauncher
            if (r0 == 0) goto L_0x0068
            com.tencent.mm.ui.vas.launcher.VASLauncher r7 = (com.tencent.p014mm.p136ui.vas.launcher.VASLauncher) r7
            r7.mo101369I7()
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vn3.C118690j.onAnimationStart(android.animation.Animator):void");
    }
}
