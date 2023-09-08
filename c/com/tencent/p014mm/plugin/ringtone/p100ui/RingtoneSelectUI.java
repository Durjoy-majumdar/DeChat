package com.tencent.p014mm.plugin.ringtone.p100ui;

import android.os.Bundle;
import android.view.MenuItem;
import ck2.C54873a;
import ck2.C54883d0;
import ck2.C54891f0;
import ck2.C54898h0;
import ck2.C54913i0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.ringtone.uic.BaseRingtoneUI;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C45628s0;
import h81.C32735h;
import java.util.Set;
import kotlin.Metadata;
import sx3.C110826x0;
import sx3.C48501y0;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ringtone/ui/RingtoneSelectUI;", "Lcom/tencent/mm/plugin/ringtone/uic/BaseRingtoneUI;", "<init>", "()V", "plugin-ringtone_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI */
public final class RingtoneSelectUI extends BaseRingtoneUI {

    /* renamed from: d */
    public static final /* synthetic */ int f164065d = 0;

    /* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI$a */
    public static final class C57282a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RingtoneSelectUI f164066d;

        public C57282a(RingtoneSelectUI ringtoneSelectUI) {
            this.f164066d = ringtoneSelectUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.RingtoneSelectUI", "backBtn");
            RingtoneSelectUI ringtoneSelectUI = this.f164066d;
            ringtoneSelectUI.setResult(-2);
            ringtoneSelectUI.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneSelectUI$b */
    public static final class C57283b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RingtoneSelectUI f164067d;

        public C57283b(RingtoneSelectUI ringtoneSelectUI) {
            this.f164067d = ringtoneSelectUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            int i = RingtoneSelectUI.f164065d;
            this.f164067d.startActivity(RingtonePrivacyUI.class);
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.btn;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        return C48501y0.m53872g(importUIComponents, C110826x0.m151017e(C54883d0.class, RingtoneDataUIC.class, C54898h0.class, C54891f0.class, C54873a.class, C54913i0.class));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getIntExtra("ringtone_caller", 1) == 1) {
            setMMTitle((int) C0966R.string.i56);
        } else {
            String stringExtra = getIntent().getStringExtra("exclusvie_name");
            if (stringExtra != null) {
                if (C45628s0.m50782k(stringExtra).f149500H == 2) {
                    setMMTitle((int) C0966R.string.i58);
                } else {
                    setMMTitle((int) C0966R.string.i57);
                }
            }
        }
        setBackBtn(new C57282a(this));
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_ringtone_privacy_switch, true)) {
            addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C57283b(this));
        }
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2927a));
        setBackGroundColorResource(C0966R.color.f2927a);
    }
}
