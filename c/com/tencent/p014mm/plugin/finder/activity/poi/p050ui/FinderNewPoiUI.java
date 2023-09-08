package com.tencent.p014mm.plugin.finder.activity.poi.p050ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.activity.base.p048ui.BaseProfileUI;
import di3.C86312j;
import ht1.C98522w3;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import sx3.C110826x0;
import te3.C48713ah1;
import vo3.C90852c;
import xd1.C15642a;
import xd1.C15643b;
import xd1.C15644c;
import xd1.C15669q;
import xd1.C15671r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/activity/poi/ui/FinderNewPoiUI;", "Lcom/tencent/mm/plugin/finder/activity/base/ui/BaseProfileUI;", "Lte3/ah1;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.activity.poi.ui.FinderNewPoiUI */
public class FinderNewPoiUI extends BaseProfileUI<C48713ah1> {
    /* renamed from: I7 */
    public int mo2194I7() {
        Intent intent = getIntent();
        C98522w3.C8810a aVar = null;
        Object serializableExtra = intent != null ? intent.getSerializableExtra("key_from_type") : null;
        if (serializableExtra instanceof C98522w3.C8810a) {
            aVar = (C98522w3.C8810a) serializableExtra;
        }
        return aVar == C98522w3.C8810a.FINDER_POI_FROM_TYPE_SNS ? 81 : 26;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C15669q.class, C15642a.class, C15644c.class, C15643b.class, C15671r.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FinderPoiFeedUI).mo86179qs(this, C76986a.Finder);
    }

    /* renamed from: z5 */
    public int mo2197z5() {
        return C0966R.C0971layout.ctg;
    }
}
