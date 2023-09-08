package dn2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hh2.C8532a;
import java.util.HashMap;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: dn2.k */
public final class C7393k extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7373a f25532d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7393k(C7373a aVar) {
        super(1);
        this.f25532d = aVar;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        RecordConfigProvider b = RecordConfigProvider.m119432b(str, "");
        UICustomParam uICustomParam = new UICustomParam();
        Map<String, Boolean> map = uICustomParam.f266575h;
        Boolean bool = Boolean.TRUE;
        ((HashMap) map).put("plugin_filter", bool);
        ((HashMap) uICustomParam.f266575h).put("plugin_poi", bool);
        ((HashMap) uICustomParam.f266575h).put("plugin_tip", bool);
        ((HashMap) uICustomParam.f266575h).put("plugin_menu", bool);
        b.f272927o = uICustomParam;
        C8532a.f27585a.mo9446e(this.f25532d.f25505a, 0, C0966R.C0968anim.f2492eg, -1, b, 1, 2);
        return C13598b0.f38549a;
    }
}
