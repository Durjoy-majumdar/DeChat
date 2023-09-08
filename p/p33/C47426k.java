package p33;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import p206nj.C11171e;
import qo3.C101218e0;

/* renamed from: p33.k */
public final class C47426k implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ VoipFloatCardPermissionDialog f127223a;

    /* renamed from: b */
    public final /* synthetic */ C101218e0 f127224b;

    public C47426k(VoipFloatCardPermissionDialog voipFloatCardPermissionDialog, C101218e0 e0Var) {
        this.f127223a = voipFloatCardPermissionDialog;
        this.f127224b = e0Var;
    }

    /* renamed from: a */
    public final void mo2001a() {
        if (C11171e.m11046c(23)) {
            try {
                Object obj = Settings.class.getField("ACTION_MANAGE_OVERLAY_PERMISSION").get(Settings.class);
                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
                if (!Util.isNullOrNil((String) obj)) {
                    VoipFloatCardPermissionDialog voipFloatCardPermissionDialog = this.f127223a;
                    Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + MMApplicationContext.getPackageName()));
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(voipFloatCardPermissionDialog, aVar.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardPermissionDialog$showDialog$dialog$1$2", "onClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    voipFloatCardPermissionDialog.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(voipFloatCardPermissionDialog, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardPermissionDialog$showDialog$dialog$1$2", "onClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    this.f127224b.mo140680z();
                    this.f127223a.finish();
                    return;
                }
            } catch (Exception e) {
                Log.m105921e("VoipFloatCardPermission", "getField:ACTION_MANAGE_OVERLAY_PERMISSION! Error:%s, etype:%s", e.getMessage(), e.getClass().getCanonicalName());
            }
        }
        String string = this.f127223a.getString(C0966R.string.evx);
        C87412m.m108593f(string, "getString(com.tencent.mm…ng_window_permission_url)");
        Intent intent2 = new Intent();
        intent2.putExtra("rawUrl", string);
        intent2.putExtra("useJs", true);
        intent2.putExtra("vertical_scroll", true);
        C88144b.m109791i(this.f127223a, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
        this.f127224b.mo140680z();
        this.f127223a.finish();
    }
}
