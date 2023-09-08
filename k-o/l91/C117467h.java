package l91;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: l91.h */
public final class C117467h {
    /* renamed from: a */
    public static Fragment m165686a(int i, List<Fragment> list, FragmentActivity fragmentActivity) {
        Fragment fragment = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int size = list.size();
        if (i < 0 || i >= size) {
            return null;
        }
        if (i == 0) {
            fragment = m165687b("com.tencent.mm.ui.conversation.MainUI", list);
        } else if (i == 1) {
            fragment = m165687b("com.tencent.mm.ui.contact.address.MvvmAddressUIFragment", list);
            if (fragment == null) {
                fragment = m165687b("com.tencent.mm.ui.contact.AddressUI.AddressUIFragment", list);
            }
        } else if (i == 2) {
            fragment = m165687b("com.tencent.mm.ui.FindMoreFriendsUI", list);
        } else if (i == 3) {
            fragment = m165687b("com.tencent.mm.ui.MoreTabUI", list);
        } else if (i == 4) {
            fragment = m165687b("com.tencent.mm.ui.chatting.ChattingUIFragment", list);
        }
        if (fragment == null) {
            try {
                Fragment fragment2 = list.get(i);
                Log.m105925i("HABBYGE-MALI.FragmentUtil", "getCurFragmentOfLauncherUI-1: %s", fragment2.getClass().getCanonicalName());
                return fragment2;
            } catch (Exception unused) {
                Fragment c = m165688c(fragmentActivity);
                Log.m105925i("HABBYGE-MALI.FragmentUtil", "getCurFragmentOfLauncherUI-2: %s", c.getClass().getCanonicalName());
                return c;
            }
        } else {
            Log.m105925i("HABBYGE-MALI.FragmentUtil", "_getFragmentByIndex: %s", fragment.getClass().getCanonicalName());
            return fragment;
        }
    }

    /* renamed from: b */
    public static Fragment m165687b(String str, List<Fragment> list) {
        for (Fragment next : list) {
            if (next != null && str.equals(next.getClass().getCanonicalName())) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static Fragment m165688c(FragmentActivity fragmentActivity) {
        Fragment fragment;
        Boolean bool;
        Fragment fragment2 = null;
        if (fragmentActivity == null) {
            return null;
        }
        try {
            Method declaredMethod = fragmentActivity.getClass().getDeclaredMethod("getCurrentFragmet", new Class[0]);
            declaredMethod.setAccessible(true);
            fragment = (Fragment) declaredMethod.invoke(fragmentActivity, new Object[0]);
            Log.m105925i("HABBYGE-MALI.FragmentUtil", "getCurFragment, 1: %s", fragment.getClass().getCanonicalName());
        } catch (Exception unused) {
            fragment = null;
        }
        if (fragment != null) {
            return fragment;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        if (supportFragmentManager == null) {
            Log.m105920e("HABBYGE-MALI.FragmentUtil", "getCurFragment, FragmentManager: NULL");
            return null;
        }
        List<Fragment> fragments = supportFragmentManager.getFragments();
        if (fragments == null) {
            Log.m105920e("HABBYGE-MALI.FragmentUtil", "_getCurrentFragmentFromSystem, fragmentList NULL");
        } else {
            Log.m105925i("HABBYGE-MALI.FragmentUtil", "_getCurrentFragmentFromSystem, fragmentList: %d", Integer.valueOf(fragments.size()));
            Iterator<Fragment> it = fragments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Fragment next = it.next();
                if (next != null && next.isAdded()) {
                    try {
                        Method declaredMethod2 = Fragment.class.getDeclaredMethod("isMenuVisible", new Class[0]);
                        declaredMethod2.setAccessible(true);
                        bool = (Boolean) declaredMethod2.invoke(next, new Object[0]);
                    } catch (Throwable th) {
                        Log.printErrStackTrace("HABBYGE-MALI.FragmentUtil", th, "isMenuVisible", new Object[0]);
                        bool = Boolean.FALSE;
                    }
                    if (bool.booleanValue()) {
                        Log.m105925i("HABBYGE-MALI.FragmentUtil", "_getCurrentFragmentFromSystem: %s", next.getClass().getCanonicalName());
                        fragment2 = next;
                        break;
                    }
                }
            }
        }
        return fragment2;
    }

    /* renamed from: d */
    public static Fragment m165689d(Activity activity) {
        if (activity == null) {
            return null;
        }
        return m165690e(activity.getClass().getCanonicalName());
    }

    /* renamed from: e */
    public static Fragment m165690e(String str) {
        if (str == null || !C116711b.m164587l(str)) {
            return null;
        }
        Class<LauncherUI> cls = LauncherUI.class;
        try {
            ArrayList<LauncherUI> arrayList = LauncherUI.f214332A;
            Method declaredMethod = cls.getDeclaredMethod("getCurrentTabIndex", new Class[0]);
            declaredMethod.setAccessible(true);
            int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[0])).intValue();
            Log.m105925i("HABBYGE-MALI.FragmentUtil", "getCurFragmentOfLauncherUI, index: %d", Integer.valueOf(intValue));
            FragmentActivity g = C116711b.m164582g();
            if (g == null) {
                return null;
            }
            if (intValue <= 0) {
                return m165688c(g);
            }
            List<Fragment> fragments = g.getSupportFragmentManager().getFragments();
            if (fragments != null) {
                return m165686a(intValue, fragments, g);
            }
            Log.m105920e("HABBYGE-MALI.FragmentUtil", "getCurFragmentOfLauncherUI, fragmentList NULL");
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static Fragment m165691f(FragmentActivity fragmentActivity, String str) {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        if (fragmentActivity == null || str == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (fragments = supportFragmentManager.getFragments()) == null) {
            return null;
        }
        for (Fragment next : fragments) {
            if (next != null && str.equals(next.getClass().getCanonicalName())) {
                return next;
            }
        }
        return null;
    }
}
