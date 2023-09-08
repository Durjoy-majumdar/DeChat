package cw0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke3.C88144b;
import org.xwalk.core.XWalkEnvironment;
import p003ay.C0235b;
import p206nj.C11171e;
import qo3.C77426q;
import wn2.C111818f;

/* renamed from: cw0.c */
public final class C116542c {
    /* renamed from: a */
    public static void m164364a(Context context, boolean z, int i, String str, boolean z2) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", z2 ? context.getResources().getString(C0966R.string.a8w) : context.getResources().getString(C0966R.string.j7l));
        intent.putExtra("showShare", false);
        intent.putExtra("extra_app_id", str);
        intent.putExtra("extra_permission_and_jump_status", i);
        C88144b.m109791i(context, XWalkEnvironment.MODULE_APPBRAND, ".ui.ShortCutPermissionDetailUI", intent, (Bundle) null);
        if (!z2) {
            return;
        }
        if (z) {
            C115669n.INSTANCE.mo160131h(15785, Integer.valueOf(i), 0, str);
        } else {
            C115669n.INSTANCE.mo160131h(15784, Integer.valueOf(i), 0, str);
        }
    }

    /* renamed from: b */
    public static void m164365b(C77426q qVar, int i, String str, boolean z) {
        qVar.f225839c.dismiss();
        if (z) {
            C115669n.INSTANCE.mo160131h(15790, Integer.valueOf(i), 0, str);
        }
    }

    /* renamed from: c */
    public static void m164366c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ShortcutInfo.Builder(MMApplicationContext.getContext(), "launch_type_scan_qrcode").setShortLabel(MMApplicationContext.getContext().getString(C0966R.string.cw5)).setLongLabel(MMApplicationContext.getContext().getString(C0966R.string.cw5)).setIcon(Icon.createWithResource(MMApplicationContext.getContext(), C0966R.C0969drawable.cc9)).setIntent(new Intent("com.tencent.mm.ui.ShortCutDispatchAction").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_scan_qrcode")).build());
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, -1)).intValue();
        Log.m105925i("MicroMsg.ShortcutUtil", "offline shorcut walletRegion : %s", Integer.valueOf(intValue));
        if (intValue == 0 || intValue == 1 || intValue == 8) {
            arrayList.add(new ShortcutInfo.Builder(MMApplicationContext.getContext(), "launch_type_offline_wallet").setShortLabel(MMApplicationContext.getContext().getString(C0966R.string.j7d)).setLongLabel(MMApplicationContext.getContext().getString(C0966R.string.j7d)).setIcon(Icon.createWithResource(MMApplicationContext.getContext(), C0966R.C0969drawable.cc8)).setIntent(new Intent("com.tencent.mm.ui.ShortCutDispatchAction").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_offline_wallet")).build());
        }
        arrayList.add(new ShortcutInfo.Builder(MMApplicationContext.getContext(), "launch_type_my_qrcode").setShortLabel(MMApplicationContext.getContext().getString(C0966R.string.j7c)).setLongLabel(MMApplicationContext.getContext().getString(C0966R.string.j7c)).setIcon(Icon.createWithResource(MMApplicationContext.getContext(), C0966R.C0969drawable.cc7)).setIntent(new Intent("com.tencent.mm.ui.ShortCutDispatchAction").putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_my_qrcode")).build());
        try {
            ShortcutManager shortcutManager = (ShortcutManager) MMApplicationContext.getContext().getSystemService(ShortcutManager.class);
            List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
            if (pinnedShortcuts != null && pinnedShortcuts.size() != 0) {
                Iterator<ShortcutInfo> it = pinnedShortcuts.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ShortcutInfo next = it.next();
                    Log.m105924i("MicroMsg.ShortcutUtil", "pinnedShortcut id :" + next.getId());
                    if (next.getId().equals(MMApplicationContext.getContext().getString(C0966R.string.cw5))) {
                        C116541b.m164351a(MMApplicationContext.getContext(), m164368e(MMApplicationContext.getContext(), true), (String) null, (String) null, false);
                        break;
                    }
                }
            }
            shortcutManager.removeDynamicShortcuts(Util.stringsToList(new String[]{"launch_type_scan_qrcode", "launch_type_offline_wallet", "launch_type_my_qrcode"}));
            shortcutManager.addDynamicShortcuts(arrayList);
        } catch (Exception e) {
            Log.m105925i("MicroMsg.ShortcutUtil", "remove error : %s", e.getMessage());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        r0 = r3.substring(9);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m164367d(java.lang.String r3, java.lang.String r4) {
        /*
            if (r3 == 0) goto L_0x0054
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0054
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 == 0) goto L_0x000f
            goto L_0x0054
        L_0x000f:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r1 = android.os.Process.myPid()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.getProcessNameByPid(r0, r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "MicroMsg.ShortcutUtil"
            java.lang.String r2 = "process name: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r1)
            r0 = 9
            java.lang.String r1 = "shortcut_"
            boolean r1 = r3.startsWith(r1)
            if (r1 == 0) goto L_0x0053
            int r1 = r3.length()
            if (r1 <= r0) goto L_0x0053
            java.lang.String r0 = r3.substring(r0)
            if (r0 == 0) goto L_0x0053
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0053
            java.lang.String r3 = new java.lang.String
            byte[] r0 = cw0.C116541b.m164362l(r0)
            r3.<init>(r0)
            java.lang.String r3 = cw0.C116541b.m164357g(r3, r4)
        L_0x0053:
            return r3
        L_0x0054:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cw0.C116542c.m164367d(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: e */
    public static Intent m164368e(Context context, boolean z) {
        Intent intent = new Intent(z ? "com.android.launcher.action.INSTALL_SHORTCUT" : "com.android.launcher.action.UNINSTALL_SHORTCUT");
        intent.putExtra("android.intent.extra.shortcut.NAME", context.getString(C0966R.string.cw5));
        intent.putExtra("duplicate", false);
        Intent intent2 = new Intent("com.tencent.mm.ui.ShortCutDispatchAction");
        intent2.putExtra("LauncherUI.From.Scaner.Shortcut", true);
        intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
        intent.putExtra("shortcut_is_adaptive_icon", true);
        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context, C0966R.C0969drawable.scan_shortcut_icon));
        intent.putExtra("shortcut_icon_resource_id", C0966R.C0969drawable.scan_shortcut_icon);
        return intent;
    }

    /* renamed from: f */
    public static void m164369f() {
        if (C11171e.m11046c(25)) {
            C79758p pVar = C79758p.f233760a;
            if (C79758p.f233763d.get()) {
                Log.m105924i("MicroMsg.ShortcutUtil", "need addShortCuts");
                m164366c();
                return;
            }
            pVar.mo109886i(new c$$a());
        }
    }

    /* renamed from: g */
    public static void m164370g(Context context, int i, int i2, boolean z, String str, boolean z2) {
        Resources resources = context.getResources();
        if (i == 0) {
            C75026b.m89951a((Activity) context, resources.getString(C0966R.string.j7m));
            if (z2) {
                C115669n.INSTANCE.mo160131h(15787, Integer.valueOf(i2), 0, str);
            }
        } else if (!z) {
        } else {
            if (i2 == 2 || i2 == 4) {
                Resources resources2 = context.getResources();
                C75026b.m89953c((Activity) context, resources2.getString(C0966R.string.j7m), resources2.getString(C0966R.string.j7f), new c$$d(context, i2, str, z2));
                if (z2) {
                    C115669n.INSTANCE.mo160131h(15787, Integer.valueOf(i2), 0, str);
                }
            }
        }
    }

    /* renamed from: h */
    public static Pair<Integer, Integer> m164371h(Context context, String str, boolean z, boolean z2, C0235b.C0236a aVar) {
        int i;
        Context context2 = context;
        String str2 = str;
        boolean z3 = z2;
        C111818f fVar = new C111818f();
        int c = fVar.mo163520c();
        boolean b = fVar.mo163519b();
        C77426q qVar = new C77426q(context2);
        Resources resources = context.getResources();
        int i2 = -1;
        if (c == -1) {
            qVar.f225837a.f225714b.f225648e = resources.getString(C0966R.string.j7i);
            String string = resources.getString(C0966R.string.j7k);
            String string2 = resources.getString(C0966R.string.j7h);
            qVar.mo107606r(string);
            if (b) {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(C0966R.C0971layout.f6359co, (ViewGroup) null);
                TextView textView = (TextView) linearLayout.findViewById(C0966R.C0970id.fgh);
                ((TextView) linearLayout.findViewById(C0966R.C0970id.f5780of)).setText(string2);
                textView.setText(C0966R.string.j7f);
                qVar.mo107592d(linearLayout);
                qVar.mo107601m(C0966R.string.j7e);
                qVar.mo107598j(resources.getString(C0966R.string.f7574k3));
                textView.setOnClickListener(new c$$e(context2, 2, str2, z3));
                qVar.mo107607s(new c$$f(fVar, context, z2, 2, str, qVar, aVar));
                i = 3;
                i2 = 2;
            } else {
                qVar.mo107595g(string2);
                qVar.mo107601m(C0966R.string.j7f);
                qVar.mo107598j(resources.getString(C0966R.string.f7574k3));
                qVar.mo107607s(new c$$g(context, 4, str, z2, qVar, aVar));
                i = 3;
                i2 = 4;
            }
        } else if (c == 1) {
            String string3 = resources.getString(C0966R.string.j7j);
            String string4 = resources.getString(C0966R.string.j7g);
            qVar.mo107598j(resources.getString(C0966R.string.f7926wf));
            qVar.mo107606r(string3);
            if (b) {
                LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(context).inflate(C0966R.C0971layout.f6359co, (ViewGroup) null);
                TextView textView2 = (TextView) linearLayout2.findViewById(C0966R.C0970id.fgh);
                ((TextView) linearLayout2.findViewById(C0966R.C0970id.f5780of)).setText(string4);
                textView2.setText(C0966R.string.j7f);
                qVar.mo107592d(linearLayout2);
                qVar.mo107601m(C0966R.string.j7e);
                textView2.setOnClickListener(new c$$h(context2, 1, str2, z3));
                qVar.mo107591c(new c$$i(qVar, 1, str2, z3), new c$$j(fVar, context, z2, 1, str));
                i = 3;
                i2 = 1;
            } else {
                qVar.mo107595g(string4);
                qVar.mo107601m(C0966R.string.j7f);
                qVar.mo107598j(resources.getString(C0966R.string.f7926wf));
                i = 3;
                qVar.mo107591c(new c$$b(qVar, 3, str2, z3), new c$$c(context2, 3, str2, z3));
                i2 = 3;
            }
        } else {
            i = 3;
        }
        if (c == 0 || z) {
            return new Pair<>(Integer.valueOf(c), Integer.valueOf(i2));
        }
        qVar.mo107603o();
        if (z3) {
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[i];
            objArr[0] = Integer.valueOf(i2);
            objArr[1] = 0;
            objArr[2] = str2;
            nVar.mo160131h(15788, objArr);
        }
        Log.m105924i("MicroMsg.ShortcutUtil", "permissionJumpStatus = " + i2);
        return new Pair<>(Integer.valueOf(c), Integer.valueOf(i2));
    }
}
