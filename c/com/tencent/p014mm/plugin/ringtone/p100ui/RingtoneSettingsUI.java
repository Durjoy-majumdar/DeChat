package com.tencent.p014mm.plugin.ringtone.p100ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import ck2.C54883d0;
import ck2.C54897h;
import ck2.C54925s;
import ck2.C54933y;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.ringtone.uic.BaseRingtoneUI;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import j20.C117292a;
import java.util.Set;
import k20.C9556a;
import kotlin.Metadata;
import nj2.C61759g;
import p385u2.C111105a;
import qo3.C101218e0;
import sx3.C110826x0;
import sx3.C48501y0;
import wj2.C66132f;
import xj2.C66286a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ringtone/ui/RingtoneSettingsUI;", "Lcom/tencent/mm/plugin/ringtone/uic/BaseRingtoneUI;", "<init>", "()V", "plugin-ringtone_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneSettingsUI */
public final class RingtoneSettingsUI extends BaseRingtoneUI {

    /* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneSettingsUI$a */
    public static final class C57284a implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f164068a;

        public C57284a(C101218e0 e0Var) {
            this.f164068a = e0Var;
        }

        /* renamed from: a */
        public final void mo2001a() {
            this.f164068a.mo140680z();
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("mmkv_ringtone_info");
            C87412m.m108593f(mmkv, "getMMKV(KV_NAME)");
            mmkv.putBoolean("ringtone_exclusive_has_been_educated", true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneSettingsUI$b */
    public static final class C57285b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RingtoneSettingsUI f164069d;

        public C57285b(RingtoneSettingsUI ringtoneSettingsUI) {
            this.f164069d = ringtoneSettingsUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.SettingsNewRingtoneUI", "backBtn");
            this.f164069d.mo80824H7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneSettingsUI$c */
    public static final class C57286c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RingtoneSettingsUI f164070d;

        public C57286c(RingtoneSettingsUI ringtoneSettingsUI) {
            this.f164070d = ringtoneSettingsUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            AppCompatActivity context = this.f164070d.getContext();
            C87412m.m108593f(context, "context");
            int i = ((RingtoneDataUIC) C39818r.f106831a.mo62444c(this.f164070d).mo75002a(RingtoneDataUIC.class)).f164072e;
            C66286a.m78214a(1, "", 0);
            Intent intent = new Intent();
            intent.putExtra("ringtone_channel", i);
            intent.setClass(context, RingtoneHistoryUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion", "enterRingtoneHistoryUI", "(Landroid/app/Activity;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion", "enterRingtoneHistoryUI", "(Landroid/app/Activity;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo80824H7() {
        super.finish();
    }

    public void finish() {
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxo;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        return C48501y0.m53872g(importUIComponents, C110826x0.m151017e(C54883d0.class, RingtoneDataUIC.class, RingtoneExclusiveMainUIC.class, C54897h.class, C54925s.class, C54933y.class));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i != 5) {
            if (i == 8 && i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("Select_Contact");
                if (!(stringExtra == null || stringExtra.length() == 0)) {
                    z = false;
                }
                if (z) {
                    Log.m105928w("MicroMsg.SettingsNewRingtoneUI", "empty or null contact: " + stringExtra);
                    return;
                }
                C61759g.C61760a.m72462b(C61759g.f175551f, this, 2, stringExtra, ((RingtoneDataUIC) C39818r.f106831a.mo62444c(this).mo75002a(RingtoneDataUIC.class)).f164072e, false, (C66132f) null, 48, (Object) null);
            }
        } else if (i2 == 6) {
            String stringExtra2 = intent != null ? intent.getStringExtra("exclusvie_name") : null;
            if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                z = false;
            }
            if (!z) {
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("mmkv_ringtone_info");
                C87412m.m108593f(mmkv, "getMMKV(KV_NAME)");
                if (!mmkv.getBoolean("ringtone_exclusive_has_been_educated", false)) {
                    C101218e0 e0Var = new C101218e0(this, 2, 3, false);
                    e0Var.mo140677w(getResources().getText(C0966R.string.f361208i50));
                    e0Var.mo140662i(C0966R.C0971layout.btg);
                    e0Var.f296375F = new C57284a(e0Var);
                    e0Var.mo140655A();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.ixw);
        setBackBtn(new C57285b(this));
        addTextOptionMenu(0, "历史记录", new C57286c(this));
        setBackGroundColorResource(C0966R.color.f2927a);
        setActionbarColor(C111105a.m151500b(getContext(), C0966R.color.f2927a));
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
