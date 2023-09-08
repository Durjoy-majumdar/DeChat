package e91;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import ca1.C113264b;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import oa1.C117731d;
import te3.C118427eg2;

/* renamed from: e91.b */
public final class C116711b {
    /* renamed from: a */
    public static Pair<Integer, Integer> m164576a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return Pair.create(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    /* renamed from: b */
    public static C118427eg2 m164577b(String str) {
        List<C118427eg2> f = C113264b.m155060f(str);
        if (f == null) {
            return null;
        }
        ArrayList arrayList = (ArrayList) f;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C118427eg2) arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: c */
    public static String m164578c() {
        try {
            if (!C86709a0.m107522a()) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getFinderContextId USERINFO_FINDER_CONTEXT_ID_STRING:");
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_CONTEXT_ID_STRING;
            sb.append((String) i.mo119685f(aVar, ""));
            Log.m105924i("HABBYGE-MALI.HellhoundUtil", sb.toString());
            return (String) C86709a0.m107535s().mo121142i().mo119685f(aVar, "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: d */
    public static String m164579d() {
        try {
            return !C86709a0.m107522a() ? "" : (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_ALL_CLICK_TAB_CONTEXT_ID_STRING, "");
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.HellhoundUtil", e, "getFinderCurTabContextId crash: %s", e.getMessage());
            return "";
        }
    }

    /* renamed from: e */
    public static String m164580e() {
        try {
            return !C86709a0.m107522a() ? "" : (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_TAB_CLICK_TAB_CONTEXT_ID_STRING, "");
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.HellhoundUtil", e, "getFinderReportTabContextId crash: %s", e.getMessage());
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getSupportFragmentManager();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.fragment.app.Fragment m164581f(java.lang.String r4) {
        /*
            androidx.fragment.app.FragmentActivity r0 = m164582g()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x000e
        L_0x0008:
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = r1
            goto L_0x0014
        L_0x0010:
            java.util.List r0 = r0.getFragments()
        L_0x0014:
            if (r0 == 0) goto L_0x0038
            java.util.Iterator r0 = r0.iterator()
        L_0x001a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 != 0) goto L_0x0029
            goto L_0x001a
        L_0x0029:
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getSimpleName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x001a
            return r2
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e91.C116711b.m164581f(java.lang.String):androidx.fragment.app.Fragment");
    }

    /* renamed from: g */
    public static FragmentActivity m164582g() {
        Class<LauncherUI> cls = LauncherUI.class;
        try {
            ArrayList<LauncherUI> arrayList = LauncherUI.f214332A;
            Method declaredMethod = cls.getDeclaredMethod("getInstance", new Class[0]);
            declaredMethod.setAccessible(true);
            return (FragmentActivity) declaredMethod.invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static String m164583h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String replace = str.replace("/", ".");
        int lastIndexOf = replace.lastIndexOf(".");
        return (lastIndexOf < 0 || lastIndexOf >= replace.length() + -1) ? replace : replace.substring(lastIndexOf + 1);
    }

    /* renamed from: i */
    public static int m164584i() {
        int h = C117731d.m166007c().mo182446h();
        if (h == 0) {
            return 0;
        }
        return h;
    }

    /* renamed from: j */
    public static Pair<Float, Float> m164585j(View view) {
        int measuredWidth = view.getMeasuredWidth();
        return Pair.create(Float.valueOf(Math.max((float) measuredWidth, (float) view.getWidth())), Float.valueOf(Math.max((float) view.getMeasuredHeight(), (float) view.getHeight())));
    }

    /* renamed from: k */
    public static boolean m164586k(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches("^(AppBrandUI)[0-9]*$", str);
    }

    /* renamed from: l */
    public static boolean m164587l(String str) {
        return "com.tencent.mm.ui.LauncherUI".equals(str);
    }

    /* renamed from: m */
    public static boolean m164588m(String str) {
        if (str == null) {
            return false;
        }
        return str.contains(".") ? "com.tencent.mm.ui.conversation.MainUI".equals(str) || "com.tencent.mm.ui.contact.AddressUI.AddressUIFragment".equals(str) || "com.tencent.mm.ui.contact.address.MvvmAddressUIFragment".equals(str) || "com.tencent.mm.ui.FindMoreFriendsUI".equals(str) || "com.tencent.mm.ui.MoreTabUI".equals(str) || "com.tencent.mm.ui.chatting.ChattingUIFragment".equals(str) : "MainUI".equals(str) || "AddressUIFragment".equals(str) || "MvvmAddressUIFragment".equals(str) || "FindMoreFriendsUI".equals(str) || "MoreTabUI".equals(str) || "ChattingUIFragment".equals(str);
    }

    /* renamed from: n */
    public static boolean m164589n() {
        Context context = MMApplicationContext.getContext();
        String str = C86709a0.m107531m().mo58407a().f124988a;
        if (str == null) {
            return false;
        }
        return context.getPackageName().equals(str);
    }

    /* renamed from: o */
    public static boolean m164590o(String str) {
        if (str == null) {
            return false;
        }
        return str.contains(".") ? "com.tencent.mm.ui.conversation.MainUI".equals(str) || "com.tencent.mm.ui.contact.AddressUI.AddressUIFragment".equals(str) || "com.tencent.mm.ui.contact.address.MvvmAddressUIFragment".equals(str) || "com.tencent.mm.ui.FindMoreFriendsUI".equals(str) || "com.tencent.mm.ui.MoreTabUI".equals(str) : "MainUI".equals(str) || "AddressUIFragment".equals(str) || "MvvmAddressUIFragment".equals(str) || "FindMoreFriendsUI".equals(str) || "MoreTabUI".equals(str);
    }

    /* renamed from: p */
    public static boolean m164591p(String str) {
        return str != null && !"".equals(str.trim()) && str.matches("^[0-9]*$");
    }

    /* renamed from: q */
    public static boolean m164592q(String str) {
        return "com.tencent.mm.app.WeChatSplashActivity".equals(str);
    }

    /* renamed from: r */
    public static String m164593r(long j) {
        return new BigInteger(Long.toBinaryString(j), 2).toString();
    }

    /* renamed from: s */
    public static String m164594s(int i) {
        if (i == -1) {
            return "-1";
        }
        return "0x" + Integer.toHexString(i);
    }

    /* renamed from: t */
    public static String m164595t(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1817116115:
                if (str.equals("com.tencent.mm.plugin.finder.ui.fragment.FinderMachineTabFragment")) {
                    c = 0;
                    break;
                }
                break;
            case -1010168201:
                if (str.equals("com.tencent.mm.plugin.finder.ui.fragment.FinderLbsTabFragment")) {
                    c = 1;
                    break;
                }
                break;
            case -844087327:
                if (str.equals("FinderFriendTabFragment")) {
                    c = 2;
                    break;
                }
                break;
            case -464538386:
                if (str.equals("FinderFollowTabFragment")) {
                    c = 3;
                    break;
                }
                break;
            case 839202232:
                if (str.equals("com.tencent.mm.plugin.finder.ui.fragment.FinderFriendTabFragment")) {
                    c = 4;
                    break;
                }
                break;
            case 1218751173:
                if (str.equals("com.tencent.mm.plugin.finder.ui.fragment.FinderFollowTabFragment")) {
                    c = 5;
                    break;
                }
                break;
            case 1271553262:
                if (str.equals("FinderLbsTabFragment")) {
                    c = 6;
                    break;
                }
                break;
            case 1835482404:
                if (str.equals("FinderMachineTabFragment")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 7:
                return "2";
            case 1:
            case 6:
                return "3";
            case 2:
            case 4:
                return "1";
            case 3:
            case 5:
                return "0";
            default:
                return str;
        }
    }
}
