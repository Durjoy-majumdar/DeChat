package com.tencent.p014mm.plugin.ringtone.p100ui;

import android.os.Bundle;
import ck2.C54873a;
import ck2.C54883d0;
import ck2.C54913i0;
import ck2.C54917o;
import ck2.C54920q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.ringtone.uic.BaseRingtoneUI;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import eb0.C45628s0;
import java.util.Set;
import kotlin.Metadata;
import sx3.C110826x0;
import sx3.C48501y0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ringtone/ui/RingtoneOccupyUI1;", "Lcom/tencent/mm/plugin/ringtone/uic/BaseRingtoneUI;", "<init>", "()V", "plugin-ringtone_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtoneOccupyUI1 */
public final class RingtoneOccupyUI1 extends BaseRingtoneUI {
    public int getLayoutId() {
        return C0966R.C0971layout.f359953cq1;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        return C48501y0.m53872g(importUIComponents, C110826x0.m151017e(C54883d0.class, RingtoneDataUIC.class, C54920q.class, C54917o.class, C54873a.class, C54913i0.class));
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
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
    }
}
