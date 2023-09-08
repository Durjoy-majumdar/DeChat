package com.tencent.p014mm.plugin.appbrand;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.CollectAppBrandDesktopShortcutInfoEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.C83714o2;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import f40.C86709a0;
import kb0.C9576e;
import kr0.C76629w0;
import p003ay.C0235b;
import p823sg.C90193h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.appbrand.t4 */
public final class C84263t4 extends C2054w4 {

    /* renamed from: com.tencent.mm.plugin.appbrand.t4$a */
    public class C84264a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WxaAttributes f246119d;

        /* renamed from: e */
        public final /* synthetic */ Context f246120e;

        /* renamed from: f */
        public final /* synthetic */ int f246121f;

        /* renamed from: g */
        public final /* synthetic */ boolean f246122g;

        public C84264a(C84263t4 t4Var, WxaAttributes wxaAttributes, Context context, int i, boolean z) {
            this.f246119d = wxaAttributes;
            this.f246120e = context;
            this.f246121f = i;
            this.f246122g = z;
        }

        public void run() {
            int g = C86709a0.m107523b().mo121110g();
            WxaAttributes wxaAttributes = this.f246119d;
            C83714o2.m102751a(this.f246120e, new C83714o2.C83715a(g, new String[]{wxaAttributes.field_roundedSquareIconURL, wxaAttributes.field_brandIconURL, wxaAttributes.field_bigHeadURL}, wxaAttributes.field_nickname, wxaAttributes.field_appId, wxaAttributes.field_username), this.f246121f, this.f246122g);
        }
    }

    /* renamed from: O */
    public int mo1873O(Intent intent) {
        return 1023;
    }

    /* renamed from: Q */
    public void mo1971Q(Context context, Intent intent, boolean z) {
        Context context2 = context;
        Intent intent2 = intent;
        Class cls = C0235b.class;
        super.mo1971Q(context, intent, z);
        String iH = z ? ((C0235b) C86312j.m106911c(cls)).mo265iH(IntentUtil.getStringExtra(intent2, "id")) : ((C0235b) C86312j.m106911c(cls)).mo262Me(IntentUtil.getStringExtra(intent2, "id"));
        int intExtra = IntentUtil.getIntExtra(intent2, "ext_info_1", 0);
        String stringExtra = IntentUtil.getStringExtra(intent2, "digest");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(iH);
                if (N2 == null) {
                    Log.m105921e("MiroMsg.WxaLauncherShortcutEntry", "no such WeApp(%s)", iH);
                    return;
                }
                String str = N2.field_nickname;
                if (!stringExtra.equals(C90193h.m112878f(("" + str + N2.field_roundedSquareIconURL + N2.field_brandIconURL + N2.field_bigHeadURL).getBytes()))) {
                    Log.m105925i("MiroMsg.WxaLauncherShortcutEntry", "update shortcut for wxa(%s)", iH);
                    if (context2 == null) {
                        Log.m105920e("MicroMsg.AppBrandShortcutManager", "remove fail, context or username is null.");
                    } else if (intent2 == null) {
                        Log.m105920e("MicroMsg.AppBrandShortcutManager", "remove fail, intent is null");
                    } else {
                        CollectAppBrandDesktopShortcutInfoEvent collectAppBrandDesktopShortcutInfoEvent = new CollectAppBrandDesktopShortcutInfoEvent();
                        collectAppBrandDesktopShortcutInfoEvent.f236167d.f236169a = iH;
                        collectAppBrandDesktopShortcutInfoEvent.publish();
                        CollectAppBrandDesktopShortcutInfoEvent.C80711b bVar = collectAppBrandDesktopShortcutInfoEvent.f236168e;
                        if (bVar.f236172c == null) {
                            Log.m105921e("MicroMsg.AppBrandShortcutManager", "no such WeApp(%s)", iH);
                        } else {
                            String str2 = TextUtils.isEmpty(bVar.f236171b) ? iH : collectAppBrandDesktopShortcutInfoEvent.f236168e.f236171b;
                            Intent intent3 = new Intent("com.android.launcher.action.UNINSTALL_SHORTCUT");
                            intent3.putExtra("android.intent.extra.shortcut.NAME", str2);
                            intent3.putExtra("duplicate", false);
                            intent3.putExtra("android.intent.extra.shortcut.INTENT", intent2);
                            ((C0235b) C86312j.m106911c(cls)).mo257AZ(context2, intent3);
                            Log.m105925i("MicroMsg.AppBrandShortcutManager", "remove shortcut %s", iH);
                        }
                    }
                    MMHandlerThread.postToMainThreadDelayed(new C84264a(this, N2, context, intExtra, z), 1000);
                }
            } catch (NullPointerException e) {
                Log.m105921e("MiroMsg.WxaLauncherShortcutEntry", "query attrs with username[%s], e=%s", iH, e);
                return;
            }
        }
        intent2.putExtra("type", 0);
        intent2.putExtra("id", "");
    }

    /* renamed from: S */
    public void mo1874S(Context context, Intent intent, boolean z) {
        Class cls = C0235b.class;
        if (!z) {
            C115669n.INSTANCE.idkeyStat(443, 3, 1, false);
            if (Build.VERSION.SDK_INT >= 26) {
                String iH = ((C0235b) C86312j.m106911c(cls)).mo265iH(IntentUtil.getStringExtra(intent, "id"));
                if (!C9576e.m9260a(iH)) {
                    Log.m105921e("MiroMsg.WxaLauncherShortcutEntry", "jump to Wxa with androidId decode failed, username %s invalid , try to decode with imei", iH);
                    if (C9576e.m9260a(((C0235b) C86312j.m106911c(cls)).mo262Me(IntentUtil.getStringExtra(intent, "id")))) {
                        mo1971Q(context, intent, false);
                    } else {
                        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.lmz), 1).show();
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public void mo1972q(Context context, Intent intent) {
        C115669n.INSTANCE.idkeyStat(443, 2, 1, false);
        if (context instanceof MMActivity) {
            ((MMActivity) context).setNavigationbarColor(0);
        }
        super.mo1972q(context, intent);
    }
}
