package vn3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import bo3.C113202f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.p136ui.vas.VASCommonActivity;
import com.tencent.p014mm.p136ui.vas.VASCommonForPadActivity;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import java.util.HashSet;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: vn3.m */
public final class C118694m {
    /* renamed from: a */
    public static final VASCommonFragment m167383a(Class<?> cls, Intent intent, boolean z, boolean z2, boolean z3) {
        C87412m.m108594g(cls, "uiCls");
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra(VASActivity.KEY_CLS, cls);
        intent.putExtra(VASActivity.KEY_DISABLE_COMMON_AREA_CONTROL, z);
        intent.putExtra(VASActivity.KEY_IS_FRAGMENT_MODE, z);
        intent.putExtra(VASActivity.KEY_DISABLE_ACTIVITY_SWIPE_BACK, z2);
        intent.putExtra(VASActivity.KEY_VAS_LAUNCHER_ENTER_PAGE, z3);
        if (intent.getComponent() == null) {
            intent.setClass(MMApplicationContext.getContext(), cls);
        }
        return VASCommonFragment.f348630K.mo177567a(intent);
    }

    /* renamed from: b */
    public static VASCommonFragment m167384b(String str, Intent intent, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            intent = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        C87412m.m108594g(str, "uiCls");
        return m167383a(Class.forName(str), intent, z, false, false);
    }

    /* renamed from: c */
    public static final Class<?> m167385c(Context context, Class<?> cls) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cls, "uiCls");
        C74783i3.m89537a(context);
        C74783i3.C6978a a = C74783i3.m89537a(context);
        if (!(Math.min(a.f24704a, a.f24705b) > C76577a.m92151b(context, 600))) {
            return VASCommonActivity.class;
        }
        HashSet<String> hashSet = C37789h.f100098a;
        return C37789h.f100098a.contains(cls.getName()) ? VASCommonForPadActivity.class : VASCommonActivity.class;
    }

    /* renamed from: d */
    public static final void m167386d(Context context, Intent intent, Bundle bundle) {
        C87412m.m108594g(context, "<this>");
        ComponentName component = (intent == null ? new Intent() : intent).getComponent();
        C87412m.m108591d(component);
        Class<?> cls = Class.forName(component.getClassName());
        if (context instanceof Activity) {
            m167387e((Activity) context, cls, intent, bundle, -1);
            return;
        }
        if (intent == null) {
            intent = new Intent();
        }
        intent.setClass(context, m167385c(context, cls));
        intent.putExtra(VASActivity.KEY_CLS, cls);
        intent.addFlags(268435456);
        C9556a aVar = new C9556a();
        aVar.mo10233c(bundle);
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/vas/VasNavigatorKt", "startVASActivity", "(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        context.startActivity((Intent) aVar.mo10231a(0), (Bundle) aVar.mo10231a(1));
        C117292a.m165359e(context, "com/tencent/mm/ui/vas/VasNavigatorKt", "startVASActivity", "(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
    }

    /* renamed from: e */
    public static final void m167387e(Activity activity, Class<?> cls, Intent intent, Bundle bundle, int i) {
        C87412m.m108594g(activity, "<this>");
        C87412m.m108594g(cls, "uiCls");
        if (intent == null) {
            intent = new Intent();
        }
        intent.setClass(activity, m167385c(activity, cls));
        intent.putExtra(VASActivity.KEY_CLS, cls);
        activity.startActivityForResult(intent, i, bundle);
    }

    /* renamed from: f */
    public static final void m167388f(VASActivity vASActivity, Class<?> cls, Intent intent, Bundle bundle, int i) {
        int i2;
        boolean z;
        VASCommonFragment vASCommonFragment;
        VASActivity vASActivity2;
        Bundle bundle2;
        C87412m.m108594g(vASActivity, "<this>");
        C87412m.m108594g(cls, "uiCls");
        Log.m105918d("MicroMsg.VAS.VasNavigator", "startVASActivityForResult() called with: uiCls = " + cls + ", intent = " + intent + ", options = " + bundle + ", requestCode = " + i);
        MMFragmentActivity.aReporter.mo146069a(intent, vASActivity, true);
        FragmentManager fragmentManager = vASActivity.get_parentFragmentManager();
        if (fragmentManager != null) {
            int intExtra = intent != null ? intent.getIntExtra(VASActivity.KEY_LAUNCH_MODE, 0) : 0;
            int flags = intent != null ? intent.getFlags() : 0;
            if (intExtra == 0 && (536870912 & flags) != 0) {
                intExtra = 1;
            }
            if (intExtra == 2) {
                flags &= 67108864;
            }
            if ((flags & 67108864) != 0) {
                int backStackEntryCount = fragmentManager.getBackStackEntryCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= backStackEntryCount) {
                        break;
                    }
                    FragmentManager.C112900k backStackEntryAt = fragmentManager.getBackStackEntryAt(i3);
                    C87412m.m108593f(backStackEntryAt, "it.getBackStackEntryAt(i)");
                    if (C87412m.m108589b(backStackEntryAt.getName(), cls.getName())) {
                        fragmentManager.popBackStackImmediate(backStackEntryAt.getName(), intExtra == 0 ? 1 : 0);
                    } else {
                        i3++;
                    }
                }
            }
            if (intExtra == 1 || intExtra == 2) {
                Fragment fragment = fragmentManager.getFragments().size() > 0 ? fragmentManager.getFragments().get(0) : null;
                if (!(fragment instanceof VASCommonFragment) || (vASActivity2 = vASCommonFragment.f348642o) == null || !C87412m.m108589b(vASActivity2.getClass(), cls)) {
                    z = false;
                } else {
                    Bundle arguments = (vASCommonFragment = (VASCommonFragment) fragment).getArguments();
                    if (arguments != null) {
                        arguments.clear();
                    }
                    if (intent == null || (bundle2 = intent.getExtras()) == null) {
                        bundle2 = new Bundle();
                    }
                    Bundle arguments2 = vASCommonFragment.getArguments();
                    if (arguments2 != null) {
                        arguments2.putAll(bundle2);
                    }
                    VASActivity vASActivity3 = vASCommonFragment.f348642o;
                    if (vASActivity3 != null) {
                        vASActivity3.onNewBundle(bundle2);
                    }
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            VASCommonFragment a = m167383a(cls, intent, false, false, false);
            if (!vASActivity.get_fragment().isRemoving()) {
                a.setTargetFragment(vASActivity.get_fragment(), i);
            }
            if (vASActivity.isTabMode()) {
                HashSet<String> hashSet = C37789h.f100098a;
                i2 = C37789h.f100098a.contains(cls.getName()) ? C0966R.C0970id.flg : C0966R.C0970id.flh;
            } else {
                i2 = C0966R.C0970id.flf;
            }
            VASCommonFragment vASCommonFragment2 = vASActivity.get_fragment();
            C87412m.m108592e(vASCommonFragment2, "null cannot be cast to non-null type com.tencent.mm.ui.vas.VASCommonFragment");
            VASActivity.C116164b tempPageAnim = vASActivity.getTempPageAnim();
            C87412m.m108594g(tempPageAnim, "tempAnim");
            C113202f fVar = tempPageAnim.f348619b;
            if (fVar != null) {
                vASCommonFragment2.f348632B = fVar;
            }
            C113202f fVar2 = tempPageAnim.f348620c;
            if (fVar2 != null) {
                vASCommonFragment2.f348633C = fVar2;
            }
            VASActivity.C116164b tempPageAnim2 = vASActivity.getTempPageAnim();
            C87412m.m108594g(tempPageAnim2, "tempAnim");
            C113202f fVar3 = tempPageAnim2.f348618a;
            if (fVar3 != null) {
                a.f348631A = fVar3;
            }
            C113202f fVar4 = tempPageAnim2.f348621d;
            if (fVar4 != null) {
                a.f348634D = fVar4;
            }
            C112919c0 beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.mo165201m(C0966R.C0968anim.f2535fn, C0966R.C0968anim.f2536fo, C0966R.C0968anim.f2537fp, C0966R.C0968anim.f2538fq);
            beginTransaction.mo165200l(i2, a);
            beginTransaction.mo165199c(cls.getName());
            beginTransaction.f338041p = true;
            beginTransaction.mo165163e();
            a.f348643p = vASActivity.get_fragment();
        }
    }
}
