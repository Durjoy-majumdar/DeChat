package com.tencent.p014mm.plugin.webview.model;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.luggage.menu.C6009e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: com.tencent.mm.plugin.webview.model.v1 */
public class C6062v1 {

    /* renamed from: com.tencent.mm.plugin.webview.model.v1$a */
    public interface C6063a {
    }

    /* renamed from: a */
    public static Intent m5940a(Bitmap bitmap, String str, String str2, boolean z) {
        Log.m105925i("MicroMsg.WebViewShortcutManager", "buildIntent, install = %b", Boolean.valueOf(z));
        if (bitmap != null || !z) {
            Intent intent = new Intent(z ? "com.android.launcher.action.INSTALL_SHORTCUT" : "com.android.launcher.action.UNINSTALL_SHORTCUT");
            intent.putExtra("android.intent.extra.shortcut.NAME", str2);
            intent.putExtra("duplicate", false);
            Intent intent2 = new Intent("com.tencent.mm.action.WX_SHORTCUT");
            intent2.putExtra("type", 4);
            try {
                intent2.putExtra("ext_info", URLEncoder.encode(str, "utf-8"));
            } catch (UnsupportedEncodingException unused) {
            }
            intent2.setPackage(MMApplicationContext.getPackageName());
            intent2.addFlags(67108864);
            intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
            if (bitmap != null) {
                intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
                intent.putExtra("shortcut_is_adaptive_icon", true);
            }
            return intent;
        }
        Log.m105920e("MicroMsg.WebViewShortcutManager", "no bmp");
        return null;
    }

    /* renamed from: b */
    public static void m5941b(C6063a aVar, boolean z) {
        if (aVar != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("success", z);
            ((C6009e) aVar).f22255a.mo894a(bundle);
        }
    }
}
