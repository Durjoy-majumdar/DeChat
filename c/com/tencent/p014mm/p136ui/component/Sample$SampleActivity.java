package com.tencent.p014mm.p136ui.component;

import android.os.Bundle;
import bl3.C0318h;
import bl3.C0319i;
import bl3.C0320j;
import bl3.C0321k;
import bl3.C0322l;
import bl3.C0323m;
import bl3.C0324s;
import bl3.C39818r;
import java.util.Set;
import kotlin.Metadata;
import sx3.C110826x0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/ui/component/Sample$SampleActivity", "Lcom/tencent/mm/ui/component/UIComponentActivity;", "<init>", "()V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.component.Sample$SampleActivity */
public final class Sample$SampleActivity extends UIComponentActivity {
    public Set<Class<? extends UIComponent>> importUIComponents() {
        Class<C0320j> cls = C0320j.class;
        C0324s.m266b(cls, C0318h.class);
        return C110826x0.m151017e(cls, C0321k.class, C0323m.class, C0322l.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0324s.m266b(C0321k.class, C0319i.class);
    }

    public void onResume() {
        super.onResume();
        C39818r rVar = C39818r.f106831a;
        ((C0318h) rVar.mo62444c(this).mo62447c(C0318h.class)).mo369I0();
        ((C0319i) rVar.mo62444c(this).mo62447c(C0319i.class)).mo370S1();
    }
}
