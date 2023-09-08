package com.tencent.p014mm.plugin.webview.model;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.plugin.webview.model.C6039j;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.HashSet;
import java.util.Set;
import ke3.C88144b;
import p003ay.C0235b;
import p196ln.C76706g;
import p196ln.C76708i;
import p823sg.C90193h;
import p910lj.C76701a;
import rb0.C47961a;
import rb0.C48009v0;
import vn2.C14913a;
import vn2.C14914d;

/* renamed from: com.tencent.mm.plugin.webview.model.h */
public final class C6034h extends C14913a implements C14914d {

    /* renamed from: d */
    public static String f22306d = "";

    /* renamed from: com.tencent.mm.plugin.webview.model.h$a */
    public class C6035a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f22307d;

        /* renamed from: e */
        public final /* synthetic */ String f22308e;

        public C6035a(C6034h hVar, String str, String str2) {
            this.f22307d = str;
            this.f22308e = str2;
        }

        public void run() {
            C6039j.m5919a(MMApplicationContext.getContext(), this.f22307d, this.f22308e, (C6039j.C6043d) null);
        }
    }

    /* renamed from: q */
    public void mo1972q(Context context, Intent intent) {
        Class cls = C0235b.class;
        String Me = ((C0235b) C86312j.m106911c(cls)).mo262Me(IntentUtil.getStringExtra(intent, "id"));
        String Me2 = ((C0235b) C86312j.m106911c(cls)).mo262Me(IntentUtil.getStringExtra(intent, "ext_info"));
        String stringExtra = IntentUtil.getStringExtra(intent, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        if (TextUtils.isEmpty(Me) || TextUtils.isEmpty(Me2) || TextUtils.isEmpty(stringExtra)) {
            Log.m105920e("MicroMsg.WebViewShortcutEntry", "jump to webview  failed, username or appId or token is null or nil.");
            return;
        }
        if (!stringExtra.equals(C6039j.m5922d(Me2, "" + C86709a0.m107523b().mo121110g()))) {
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("app_brand_global_sp", 0);
            if (sharedPreferences == null) {
                Log.m105928w("MicroMsg.WebViewShortcutEntry", "jump to webview failed, sp is null.");
                return;
            }
            Set<String> stringSet = sharedPreferences.getStringSet("uin_set", new HashSet());
            if (stringSet == null || stringSet.isEmpty()) {
                Log.m105928w("MicroMsg.WebViewShortcutEntry", "jump to webview failed, uin set is null or nil.");
                return;
            }
            HashSet hashSet = new HashSet();
            for (String E7 : stringSet) {
                hashSet.add(((C0235b) C86312j.m106911c(cls)).mo260E7(Me2, E7));
            }
            if (!hashSet.contains(stringExtra)) {
                Log.m105921e("MicroMsg.WebViewShortcutEntry", "jump to webview failed, illegal token(%s).", stringExtra);
                C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.lm_), 1).show();
                return;
            }
        }
        intent.putExtra("type", 0);
        intent.putExtra("id", "");
        String str = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.flk) + "/cgi-bin/h5/static/gameloading/index.html?wegame_ssid=25&appid=" + Me2;
        if (!Util.isNullOrNil(f22306d)) {
            str = str + "&" + f22306d;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("rawUrl", str);
        intent2.putExtra("from_shortcut", true);
        intent2.putExtra("game_hv_menu_appid", Me2);
        intent2.addFlags(67108864);
        intent2.addFlags(268435456);
        C88144b.m109791i(context, "webview", ".ui.tools.game.H5GameWebViewUI", intent2, (Bundle) null);
        C48009v0.wx0().mo72736c(Me, (C47961a.C12965b) null);
        String stringExtra2 = IntentUtil.getStringExtra(intent, "digest");
        if (TextUtils.isEmpty(stringExtra2)) {
            Log.m105924i("MicroMsg.WebViewShortcutEntry", "digest is null");
            return;
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(Me);
        if (z1Var == null || Util.isNullOrNil(z1Var.mo62909j3())) {
            Log.m105924i("MicroMsg.WebViewShortcutEntry", "no need update, displayName is null");
            return;
        }
        String j3 = z1Var.mo62909j3();
        C68097n Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(Me);
        if (Lo == null || Util.isNullOrNil(Lo.mo93597f())) {
            Log.m105924i("MicroMsg.WebViewShortcutEntry", "no need update, imgFlag is null");
            return;
        }
        if (stringExtra2.equals(C90193h.m112878f((j3 + Lo.mo93597f()).getBytes()))) {
            Log.m105924i("MicroMsg.WebViewShortcutEntry", "no need update, digest is same");
            return;
        }
        Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(Me);
        if (N50 == null || N50.isRecycled()) {
            Log.m105924i("MicroMsg.WebViewShortcutEntry", "icon is not downloaded, next time update");
            return;
        }
        Log.m105925i("MicroMsg.WebViewShortcutEntry", "update shortcut, displayName = %s", j3);
        String Me3 = ((C0235b) C86312j.m106911c(cls)).mo262Me(IntentUtil.getStringExtra(intent, "ext_info_1"));
        if (context == null || Util.isNullOrNil(Me3)) {
            Log.m105920e("MicroMsg.WebviewShrotcutManager", "remove failed, invalid params");
        }
        Intent c = C6039j.m5921c(context, Me, Me2, Me3, (Bitmap) null, false);
        if (c == null) {
            Log.m105920e("MicroMsg.WebviewShrotcutManager", "remove failed, intent is null");
        } else {
            ((C0235b) C86312j.m106911c(cls)).mo257AZ(context, c);
        }
        MMHandlerThread.postToMainThreadDelayed(new C6035a(this, Me, Me2), 1000);
    }
}
