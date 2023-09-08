package com.tencent.p014mm.plugin.voip.floatcard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import kotlin.Metadata;
import p206nj.C11171e;
import p33.C47425j;
import p33.C47426k;
import p447aw.C103918d;
import qo3.C101218e0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/voip/floatcard/VoipFloatCardPermissionDialog;", "Lcom/tencent/mm/ui/MMBaseActivity;", "<init>", "()V", "a", "plugin-voip_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog */
public final class VoipFloatCardPermissionDialog extends MMBaseActivity {

    /* renamed from: e */
    public static final C30531a f117099e = new C30531a((C8480h) null);

    /* renamed from: com.tencent.mm.plugin.voip.floatcard.VoipFloatCardPermissionDialog$a */
    public static final class C30531a {
        public C30531a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo57461a(Context context) {
            C87412m.m108594g(context, "context");
            Intent intent = new Intent(context, VoipFloatCardPermissionDialog.class);
            intent.addFlags(805306368);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardPermissionDialog$Companion", "showDialog", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardPermissionDialog$Companion", "showDialog", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("VoipFloatCardPermission", "showDialog: ");
        if (((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(this)) {
            finish();
            Log.m105924i("VoipFloatCardPermission", "showDialog: has permission");
            return;
        }
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("voip_float_card_config");
        if (!(mmkv != null && mmkv.getBoolean("has_showed_dialog", false))) {
            C101218e0 e0Var = new C101218e0(this, 2, 1);
            e0Var.mo140676v(0);
            e0Var.mo140677w(C11171e.m11046c(23) ? getText(C0966R.string.kgn) : getText(C0966R.string.kgo));
            e0Var.mo140662i(C0966R.C0971layout.ccy);
            e0Var.mo140665l(new C47425j(this));
            e0Var.f296375F = new C47426k(this, e0Var);
            e0Var.mo140655A();
            Log.m105924i("VoipFloatCardPermission", "showDialog: show");
            mmkv.putBoolean("has_showed_dialog", true);
            return;
        }
        Log.m105924i("VoipFloatCardPermission", "showDialog: finish");
        finish();
    }
}
