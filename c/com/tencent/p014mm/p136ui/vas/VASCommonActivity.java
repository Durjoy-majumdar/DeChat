package com.tencent.p014mm.p136ui.vas;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import in3.C87763b;
import in3.C87773e;
import java.util.List;
import kotlin.Metadata;
import nj3.C88989a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vn3.C118687b;
import vn3.C118694m;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/vas/VASCommonActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
@C90852c(0)
/* renamed from: com.tencent.mm.ui.vas.VASCommonActivity */
public class VASCommonActivity extends MMActivity {

    /* renamed from: d */
    public final String f348624d = ("MicroMsg.VAS.VASCommonActivity@" + hashCode());

    /* renamed from: e */
    public final C13601g f348625e;

    /* renamed from: f */
    public final C13601g f348626f;

    /* renamed from: com.tencent.mm.ui.vas.VASCommonActivity$a */
    public static final class C116167a extends C87413o implements C32224a<C116173b> {

        /* renamed from: d */
        public final /* synthetic */ VASCommonActivity f348627d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C116167a(VASCommonActivity vASCommonActivity) {
            super(0);
            this.f348627d = vASCommonActivity;
        }

        public Object invoke() {
            return new C116173b(this.f348627d);
        }
    }

    /* renamed from: com.tencent.mm.ui.vas.VASCommonActivity$b */
    public static final class C116168b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ VASCommonActivity f348628d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C116168b(VASCommonActivity vASCommonActivity) {
            super(0);
            this.f348628d = vASCommonActivity;
        }

        public Object invoke() {
            return this.f348628d.findViewById(C0966R.C0970id.fke);
        }
    }

    /* renamed from: com.tencent.mm.ui.vas.VASCommonActivity$c */
    public static final class C116169c extends C87413o implements C32224a<ConstraintLayout> {

        /* renamed from: d */
        public final /* synthetic */ VASCommonActivity f348629d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C116169c(VASCommonActivity vASCommonActivity) {
            super(0);
            this.f348629d = vASCommonActivity;
        }

        public Object invoke() {
            return (ConstraintLayout) this.f348629d.findViewById(C0966R.C0970id.mfj);
        }
    }

    public VASCommonActivity() {
        C36568h.m40985a(new C116169c(this));
        this.f348625e = C36568h.m40985a(new C116168b(this));
        this.f348626f = C36568h.m40985a(new C116167a(this));
    }

    /* renamed from: H7 */
    public int mo177558H7() {
        return C0966R.C0970id.flf;
    }

    /* renamed from: I7 */
    public final View mo177559I7() {
        Object value = ((C36570n) this.f348625e).getValue();
        C87412m.m108593f(value, "<get-layoutCommonActionBarWrapper>(...)");
        return (View) value;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f348642o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finish() {
        /*
            r5 = this;
            com.tencent.mm.ui.vas.VASCommonFragment r0 = r5.getFirstFragment()
            if (r0 == 0) goto L_0x000f
            com.tencent.mm.ui.vas.VASActivity r0 = r0.f348642o
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.get_isFinishing()
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            if (r0 == 0) goto L_0x004b
            boolean r0 = do3.C75441a.f221748d
            r1 = 0
            if (r0 != 0) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            rx3.o r0 = new rx3.o
            int r2 = do3.C75441a.f221745a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.content.Intent r3 = do3.C75441a.f221746b
            int r4 = do3.C75441a.f221747c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.<init>(r2, r3, r4)
            r2 = 0
            do3.C75441a.f221745a = r2
            do3.C75441a.f221746b = r1
            r1 = -1
            do3.C75441a.f221747c = r1
            do3.C75441a.f221748d = r2
            r1 = r0
        L_0x0036:
            if (r1 == 0) goto L_0x0047
            A r0 = r1.f38557d
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            B r1 = r1.f38558e
            android.content.Intent r1 = (android.content.Intent) r1
            r5.setResult(r0, r1)
        L_0x0047:
            super.finish()
            goto L_0x0058
        L_0x004b:
            com.tencent.mm.ui.vas.VASCommonFragment r0 = r5.getFirstFragment()
            if (r0 == 0) goto L_0x0058
            com.tencent.mm.ui.vas.VASActivity r0 = r0.f348642o
            if (r0 == 0) goto L_0x0058
            r0.finishWithNoAnim()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.vas.VASCommonActivity.finish():void");
    }

    public final VASCommonFragment getFirstFragment() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        C87412m.m108593f(fragments, "supportFragmentManager.fragments");
        for (Fragment fragment : fragments) {
            if (fragment instanceof VASCommonFragment) {
                return (VASCommonFragment) fragment;
            }
        }
        return null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6317bl;
    }

    public boolean isCallSuperOnSaveInstanceState() {
        return true;
    }

    public boolean isForceFixStatusBar() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        String str = this.f348624d;
        Log.m105918d(str, "onActivityResult() called with: requestCode = " + i + ", resultCode = " + i2 + ", data = " + intent);
    }

    public void onBackPressed() {
        boolean z;
        VASCommonFragment firstFragment = getFirstFragment();
        boolean z2 = false;
        if (firstFragment != null) {
            VASActivity vASActivity = firstFragment.f348642o;
            if (vASActivity != null) {
                vASActivity.onBackPressed();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (!z2) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        String str = this.f348624d;
        Log.m105918d(str, "onCreate() called with: savedInstanceState = " + bundle);
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        Log.m105918d(this.f348624d, "onCreate() after called");
        setActionbarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        C87773e.m109211d(getWindow());
        setNavigationbarColor(getResources().getColor(C0966R.color.ahf));
        hideActionbarLine();
        hideActionBarOperationArea();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        boolean z = this.mWrappingFrame instanceof C87763b;
        if (bundle == null) {
            VASCommonFragment.C116170a aVar = VASCommonFragment.f348630K;
            Intent intent = getIntent();
            C87412m.m108593f(intent, "intent");
            VASCommonFragment a = aVar.mo177567a(intent);
            C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.mo165167i(mo177558H7(), a, (String) null, 1);
            beginTransaction.mo165162d();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105918d(this.f348624d, "onDestroy() called");
    }

    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        MMFragmentActivity.aReporter.mo146071c(getIntent(), System.currentTimeMillis() - ((long) 300));
        MMFragmentActivity.aReporter.mo146070b(getIntent());
    }

    public void onPause() {
        super.onPause();
        Log.m105918d(this.f348624d, "onPause() called");
    }

    public void onResume() {
        super.onResume();
        Log.m105918d(this.f348624d, "onResume() called");
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (fragments.size() > 0) {
            Fragment fragment = fragments.get(fragments.size() - 1);
            if (fragment instanceof C118687b) {
                ((C118687b) fragment).onWindowFocusChanged(z);
            }
        }
    }

    public void startActivity(Intent intent) {
        String str;
        ComponentName component;
        if (MMFragmentActivity.isVASActivity(intent)) {
            VASCommonFragment firstFragment = getFirstFragment();
            if (firstFragment != null) {
                if (intent == null || (component = intent.getComponent()) == null || (str = component.getClassName()) == null) {
                    str = "";
                }
                Class<?> cls = Class.forName(str);
                VASActivity vASActivity = firstFragment.f348642o;
                if (vASActivity != null) {
                    C118694m.m167388f(vASActivity, cls, intent, (Bundle) null, -1);
                    return;
                }
                return;
            }
            return;
        }
        super.startActivity(intent);
    }
}
