package com.tencent.p014mm.p136ui.vas.launcher;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import ao3.C113067b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import go3.C76019y;
import gy3.C87412m;
import in3.C87771d;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import vn3.C111562e;
import vn3.C118694m;
import z04.C66713a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/vas/launcher/VASLauncher;", "Lcom/tencent/mm/ui/MMFragmentActivity;", "<init>", "()V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.vas.launcher.VASLauncher */
public class VASLauncher extends MMFragmentActivity {

    /* renamed from: i */
    public static final /* synthetic */ int f348660i = 0;

    /* renamed from: d */
    public int f348661d;

    /* renamed from: e */
    public int f348662e;

    /* renamed from: f */
    public int f348663f;

    /* renamed from: g */
    public int f348664g;

    /* renamed from: h */
    public boolean f348665h;

    /* renamed from: H7 */
    public boolean mo101368H7() {
        return false;
    }

    /* renamed from: I7 */
    public void mo101369I7() {
        Log.m105918d("MicroMsg.VAS.VASLauncher", "onExitVasLauncherEnterPageAnimStart");
        C87771d c = C87771d.m109204c(this);
        if (c != null) {
            c.mo122179a();
        }
        if (c != null) {
            c.mo122181e();
        }
    }

    /* renamed from: J7 */
    public void mo101370J7() {
    }

    /* renamed from: K7 */
    public void mo101371K7() {
        Log.m105918d("MicroMsg.VAS.VASLauncher", "onVASBegin() called");
    }

    /* renamed from: L7 */
    public void mo101372L7() {
        Log.m105918d("MicroMsg.VAS.VASLauncher", "onVASEnd() called");
    }

    public void onBackPressed() {
        VASCommonFragment vASCommonFragment;
        boolean z;
        if (!mo101368H7()) {
            super.onBackPressed();
            return;
        }
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        C87412m.m108593f(fragments, "supportFragmentManager.fragments");
        Iterator<T> it = fragments.iterator();
        while (true) {
            if (!it.hasNext()) {
                vASCommonFragment = null;
                break;
            }
            Fragment fragment = (Fragment) it.next();
            if (fragment instanceof VASCommonFragment) {
                vASCommonFragment = (VASCommonFragment) fragment;
                break;
            }
        }
        boolean z2 = false;
        if (vASCommonFragment != null) {
            VASActivity vASActivity = vASCommonFragment.f348642o;
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

    public void onNewIntent(Intent intent) {
        if (mo101368H7()) {
            if (((intent != null ? intent.getFlags() : 0) & 67108864) != 0) {
                Log.m105918d("MicroMsg.VAS.VASLauncher", "handleVASOnNewIntent() called with: intent = " + intent);
                try {
                    View findViewById = findViewById(C0966R.C0970id.mfj);
                    if (findViewById != null && findViewById.getVisibility() == 0) {
                        while (getSupportFragmentManager().getBackStackEntryCount() > 0) {
                            getSupportFragmentManager().popBackStackImmediate();
                        }
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.VAS.VASLauncher", th, "handleVASOnNewIntent err", new Object[0]);
                }
            }
        }
        super.onNewIntent(intent);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        String str;
        ComponentName component;
        if (!mo101368H7()) {
            super.startActivityForResult(intent, i, bundle);
            return;
        }
        View findViewById = findViewById(C0966R.C0970id.mfj);
        if (findViewById != null) {
            if (intent != null && C111562e.m152092b(intent, 2)) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/vas/launcher/VASLauncher", "startActivityForResult", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/vas/launcher/VASLauncher", "startActivityForResult", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (intent == null || (component = intent.getComponent()) == null || (str = component.getClassName()) == null) {
                    str = "";
                }
                Class<?> cls = Class.forName(str);
                VASCommonFragment a = C118694m.m167383a(cls, intent, false, true, true);
                a.setTargetFragment((Fragment) null, i);
                this.f348661d = getWindow().getDecorView().getSystemUiVisibility();
                this.f348662e = getWindow().getAttributes().flags;
                this.f348663f = getWindow().getStatusBarColor();
                this.f348664g = getWindow().getNavigationBarColor();
                StringBuilder sb = new StringBuilder();
                sb.append("startActivityForResult lastSystemUIVisibility:");
                int i2 = this.f348661d;
                C66713a.m78712a(16);
                String num = Integer.toString(i2, 16);
                C87412m.m108593f(num, "toString(this, checkRadix(radix))");
                sb.append(num);
                sb.append(",lastWindowFlags:");
                int i3 = this.f348662e;
                C66713a.m78712a(16);
                String num2 = Integer.toString(i3, 16);
                C87412m.m108593f(num2, "toString(this, checkRadix(radix))");
                sb.append(num2);
                sb.append(",lastStatusColor:");
                sb.append(getWindow().getStatusBarColor());
                Log.m105924i("MicroMsg.VAS.VASLauncher", sb.toString());
                C112919c0 beginTransaction = getSupportFragmentManager().beginTransaction();
                beginTransaction.mo165201m(C0966R.C0968anim.f2535fn, C0966R.C0968anim.f2536fo, C0966R.C0968anim.f2537fp, C0966R.C0968anim.f2538fq);
                beginTransaction.mo165167i(C0966R.C0970id.flf, a, (String) null, 1);
                beginTransaction.mo165199c(cls.getName());
                beginTransaction.f338041p = true;
                beginTransaction.mo165163e();
                C76019y.m91316d(this);
                new WeakReference(a);
                C113067b bVar = C113067b.f338452d;
                bVar.r50(this, intent);
                bVar.mo33186bF(this);
                mo101371K7();
                this.f348665h = true;
                return;
            }
            super.startActivityForResult(intent, i, bundle);
            return;
        }
        super.startActivityForResult(intent, i, bundle);
    }
}
