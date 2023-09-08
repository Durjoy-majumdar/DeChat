package com.tencent.p014mm.plugin.ringtone.p100ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.C0120a0;
import bl3.C39818r;
import ck2.C54873a;
import ck2.C54883d0;
import ck2.C54885e0;
import ck2.C54913i0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.ringtone.uic.BaseRingtoneUI;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C45628s0;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import sx3.C110826x0;
import sx3.C48501y0;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ringtone/ui/RingtoneSearchUI;", "Lcom/tencent/mm/plugin/ringtone/uic/BaseRingtoneUI;", "<init>", "()V", "plugin-ringtone_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneSearchUI */
public final class RingtoneSearchUI extends BaseRingtoneUI {

    /* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneSearchUI$a */
    public static final class C57280a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RingtoneSearchUI f164063d;

        public C57280a(RingtoneSearchUI ringtoneSearchUI) {
            this.f164063d = ringtoneSearchUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105924i("MicroMsg.RingtoneSearchUI", "backBtn");
            RingtoneSearchUI ringtoneSearchUI = this.f164063d;
            ringtoneSearchUI.setResult(-2);
            ringtoneSearchUI.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneSearchUI$b */
    public static final class C57281b<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ RingtoneSearchUI f164064d;

        public C57281b(RingtoneSearchUI ringtoneSearchUI) {
            this.f164064d = ringtoneSearchUI;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            this.f164064d.hideVKB();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.btl;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        return C48501y0.m53872g(importUIComponents, C110826x0.m151017e(C54883d0.class, RingtoneDataUIC.class, C54885e0.class, C54873a.class, C54913i0.class));
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
        setBackBtn(new C57280a(this), C0966R.raw.arrow_left);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2927a));
        setBackGroundColorResource(C0966R.color.f2927a);
        ((RingtoneDataUIC) C39818r.f106831a.mo62444c(this).mo75002a(RingtoneDataUIC.class)).f164075h.observe(this, new C57281b(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C87412m.m108594g(menu, "menu");
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C87412m.m108594g(menu, "menu");
        return true;
    }
}
