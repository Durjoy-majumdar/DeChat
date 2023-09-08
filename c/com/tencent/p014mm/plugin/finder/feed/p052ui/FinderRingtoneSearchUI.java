package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.ringtone.uic.BaseRingtoneUI;
import di3.C86312j;
import eb0.C45628s0;
import java.util.Set;
import kotlin.Metadata;
import p145dx.C58458y;
import rs1.C63625rb;
import sx3.C110826x0;
import sx3.C48501y0;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderRingtoneSearchUI;", "Lcom/tencent/mm/plugin/ringtone/uic/BaseRingtoneUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneSearchUI */
public final class FinderRingtoneSearchUI extends BaseRingtoneUI {
    public int getLayoutId() {
        return C0966R.C0971layout.btm;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        C58458y yVar = (C58458y) C86312j.m106911c(C58458y.class);
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        return C48501y0.m53872g(importUIComponents, C110826x0.m151017e(yVar.T30(), yVar.tk0(), C63625rb.class, yVar.id0(), yVar.mo82783xJ(), yVar.Sp0()));
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
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91114y(((C63625rb) C39818r.f106831a.mo62444c(this).mo75002a(C63625rb.class)).mo88468f3());
        }
    }
}
