package p498dv;

import aa2.C67022b;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.multitask.p079ui.p888bg.DynamicBgContainer;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import di3.C86301e;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import q92.C47789a;

@C86522b
/* renamed from: dv.d */
public final class C75458d extends C86301e implements C75457c {
    /* renamed from: RJ */
    public Class<? extends UIComponent> mo105800RJ() {
        return C47789a.class;
    }

    /* renamed from: Rv */
    public C67022b mo105801Rv(Context context) {
        C87412m.m108594g(context, "context");
        C39622i0 a = C39818r.f106831a.mo62443b(context).mo75002a(MultiTaskUIC.class);
        C87412m.m108593f(a, "UICProvider.of(context).…MultiTaskUIC::class.java)");
        return (C67022b) a;
    }

    public boolean V10(Context context) {
        C87412m.m108594g(context, "context");
        return ((MultiTaskUIC) C39818r.f106831a.mo62443b(context).mo75002a(MultiTaskUIC.class)).mo90994b0();
    }

    /* renamed from: ak */
    public FrameLayout mo105803ak(Context context) {
        C87412m.m108594g(context, "context");
        return new DynamicBgContainer(context, (AttributeSet) null, 0, 6, (C8480h) null);
    }

    /* renamed from: on */
    public void mo105804on(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        MultiTaskUIC multiTaskUIC = (MultiTaskUIC) C39818r.f106831a.mo62443b(context).mo62449e(MultiTaskUIC.class);
        if (multiTaskUIC != null) {
            multiTaskUIC.mo175709e3(z);
        }
    }

    /* renamed from: sx */
    public Class<? extends UIComponent> mo105805sx() {
        return MultiTaskUIC.class;
    }
}
