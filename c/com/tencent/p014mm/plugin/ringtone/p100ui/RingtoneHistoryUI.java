package com.tencent.p014mm.plugin.ringtone.p100ui;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import bk2.C54489a;
import bk2.C54490b;
import ck2.C54883d0;
import ck2.C54913i0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.ringtone.uic.BaseRingtoneUI;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Set;
import kotlin.Metadata;
import qo3.C77407n;
import sx3.C110826x0;
import sx3.C48501y0;
import tj2.C13962j;
import tj2.C52348b;
import tj2.C64948e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ringtone/ui/RingtoneHistoryUI;", "Lcom/tencent/mm/plugin/ringtone/uic/BaseRingtoneUI;", "<init>", "()V", "plugin-ringtone_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI */
public final class RingtoneHistoryUI extends BaseRingtoneUI {

    /* renamed from: d */
    public static final /* synthetic */ int f164060d = 0;

    /* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI$a */
    public static final class C57278a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RingtoneHistoryUI f164061d;

        public C57278a(RingtoneHistoryUI ringtoneHistoryUI) {
            this.f164061d = ringtoneHistoryUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.RingtoneHistoryUI", "backBtn");
            this.f164061d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI$b */
    public static final class C57279b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RingtoneHistoryUI f164062d;

        public C57279b(RingtoneHistoryUI ringtoneHistoryUI) {
            this.f164062d = ringtoneHistoryUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            RingtoneHistoryUI ringtoneHistoryUI = this.f164062d;
            int i = RingtoneHistoryUI.f164060d;
            C77407n nVar = new C77407n((Context) ringtoneHistoryUI.getContext(), 1, true);
            nVar.f225771i = new C54489a(ringtoneHistoryUI);
            nVar.f225782p = new C54490b(ringtoneHistoryUI, nVar);
            nVar.mo107570o(false);
            nVar.mo107559d(false);
            nVar.mo107573q();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359955cp3;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        return C48501y0.m53872g(importUIComponents, C110826x0.m151017e(RingtoneDataUIC.class, C52348b.class, C13962j.class, C64948e.class, C54883d0.class, C54913i0.class));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.m4x);
        setBackBtn(new C57278a(this));
        addTextOptionMenu(0, getString(C0966R.string.m4w), new C57279b(this));
    }
}
