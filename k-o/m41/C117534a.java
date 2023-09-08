package m41;

import a41.C112756b;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import java.lang.ref.WeakReference;
import ky2.C10432i;
import lg3.C76695c;
import u31.C118568a;
import v31.C118643c;

/* renamed from: m41.a */
public class C117534a {
    /* renamed from: a */
    public static Object m165778a(View view, C118643c cVar) {
        WeakReference<View> weakReference;
        View view2 = null;
        if (!(cVar == null || (weakReference = cVar.f355027e) == null)) {
            view2 = weakReference.get();
        }
        return view2 != null ? view2 : view.getParent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r0 = (r0 = ((com.tencent.p014mm.p136ui.vas.VASActivity) r1)._activity).getWindow();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.Window m165779b(java.lang.Object r1) {
        /*
            if (r1 == 0) goto L_0x0020
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 != 0) goto L_0x0007
            goto L_0x0020
        L_0x0007:
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1 instanceof com.tencent.p014mm.p136ui.vas.VASActivity
            if (r0 == 0) goto L_0x001b
            r0 = r1
            com.tencent.mm.ui.vas.VASActivity r0 = (com.tencent.p014mm.p136ui.vas.VASActivity) r0
            android.app.Activity r0 = r0._activity
            if (r0 == 0) goto L_0x001b
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x001b
            return r0
        L_0x001b:
            android.view.Window r1 = r1.getWindow()
            return r1
        L_0x0020:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m41.C117534a.m165779b(java.lang.Object):android.view.Window");
    }

    /* renamed from: c */
    public static C112756b m165780c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof C112756b) {
            return (C112756b) obj;
        }
        if (m165789l(obj) && (obj instanceof View)) {
            Context f = m165783f((View) obj);
            if (f != null) {
                return new C112756b(f);
            }
            return null;
        } else if (m165788k(obj)) {
            return new C112756b(obj);
        } else {
            return null;
        }
    }

    /* renamed from: d */
    public static int m165781d() {
        Class cls = C10432i.class;
        boolean b = C76695c.m92341b();
        if (((C10432i) C86312j.m106911c(cls)).mo10750e()) {
            b |= true;
        }
        if (((C10432i) C86312j.m106911c(cls)).mo10740Mn() == 2) {
            b |= true;
        }
        if (((C10432i) C86312j.m106911c(cls)).mo10740Mn() == 0) {
            b |= true;
        }
        if (((C10432i) C86312j.m106911c(cls)).mo10740Mn() == 1) {
            b |= true;
        }
        if (((C10432i) C86312j.m106911c(cls)).mo10751fd() == 2) {
            b |= true;
        }
        if (((C10432i) C86312j.m106911c(cls)).mo10751fd() == 0) {
            b |= true;
        }
        if (((C10432i) C86312j.m106911c(cls)).mo10751fd() == 1) {
            b |= true;
        }
        if (((C10432i) C86312j.m106911c(cls)).Oh0() == 2) {
            b |= true;
        }
        if (((C10432i) C86312j.m106911c(cls)).Oh0() == 0) {
            b |= true;
        }
        return ((C10432i) C86312j.m106911c(cls)).Oh0() == 1 ? b | true ? 1 : 0 : b ? 1 : 0;
    }

    /* renamed from: e */
    public static String m165782e(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(APLogFileUtil.SEPARATOR_LINE);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append(stackTraceElement.toString());
            sb.append(APLogFileUtil.SEPARATOR_LINE);
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static Context m165783f(View view) {
        Context context;
        Context context2 = null;
        if (view == null) {
            return null;
        }
        int i = 0;
        View view2 = view;
        while (i < 100 && (context = view2.getContext()) != null && (context instanceof Activity)) {
            i++;
            Object a = m165778a(view, C118568a.m167240g(view2, false));
            if (a == null || !(a instanceof View)) {
                return context;
            }
            view2 = (View) a;
            context2 = context;
        }
        return context2;
    }

    /* renamed from: g */
    public static View m165784g(Object obj) {
        Window window;
        Window b;
        Window b2;
        if (obj == null) {
            return null;
        }
        if (obj instanceof View) {
            Context f = m165783f((View) obj);
            if (!(f == null || !(f instanceof Activity) || (b2 = m165779b(f)) == null)) {
                return b2.getDecorView();
            }
        } else if (obj instanceof Activity) {
            Window b3 = m165779b(obj);
            if (b3 != null) {
                return b3.getDecorView();
            }
        } else if (obj instanceof Fragment) {
            Context context = ((Fragment) obj).getContext();
            if (!(context == null || !(context instanceof Activity) || (b = m165779b(context)) == null)) {
                return b.getDecorView();
            }
        } else if ((obj instanceof Dialog) && (window = ((Dialog) obj).getWindow()) != null) {
            return window.getDecorView();
        }
        return null;
    }

    /* renamed from: h */
    public static boolean m165785h(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof C114799u;
    }

    /* renamed from: i */
    public static boolean m165786i() {
        return BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger();
    }

    /* renamed from: j */
    public static boolean m165787j(Object obj) {
        if (obj == null) {
            return false;
        }
        VASActivity vASActivity = null;
        if (obj instanceof View) {
            Context context = ((View) obj).getContext();
            if (context != null && (context instanceof VASActivity)) {
                vASActivity = (VASActivity) context;
            }
        } else if (obj instanceof VASActivity) {
            vASActivity = (VASActivity) obj;
        } else if (obj instanceof VASCommonFragment) {
            vASActivity = ((VASCommonFragment) obj).f348642o;
        }
        if (vASActivity == null) {
            return false;
        }
        Intent intent = vASActivity.getIntent();
        return intent != null ? intent.getBooleanExtra(VASActivity.KEY_IS_FRAGMENT_MODE, false) : false;
    }

    /* renamed from: k */
    public static boolean m165788k(Object obj) {
        if (obj == null) {
            return false;
        }
        return (obj instanceof Activity) || (obj instanceof Fragment) || (obj instanceof C112756b);
    }

    /* renamed from: l */
    public static boolean m165789l(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof View;
    }
}
