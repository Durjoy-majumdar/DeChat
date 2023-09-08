package il1;

import androidx.lifecycle.C54219z;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C50169kr1;
import te3.C51560uk2;

/* renamed from: il1.c0 */
public final class C46250c0 extends C87413o implements C32227p<C51560uk2, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorGameTogetherWidget f124672d;

    /* renamed from: e */
    public final /* synthetic */ C50169kr1 f124673e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46250c0(FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget, C50169kr1 kr12) {
        super(2);
        this.f124672d = finderLiveAnchorGameTogetherWidget;
        this.f124673e = kr12;
    }

    public Object invoke(Object obj, Object obj2) {
        C51560uk2 uk22 = (C51560uk2) obj;
        ((Number) obj2).intValue();
        C87412m.m108594g(uk22, LocaleUtil.ITALIAN);
        String str = this.f124672d.f160039d;
        Log.m105924i(str, "select value:" + uk22.f142914e + ", tip:" + uk22.f142913d);
        C54219z<String> zVar = ((C54991o) this.f124672d.f160038c.mo87696x0(C54991o.class)).f154302c4;
        String str2 = uk22.f142913d;
        if (str2 == null) {
            str2 = "";
        }
        zVar.postValue(str2);
        C50169kr1 kr12 = this.f124673e;
        if (kr12 != null) {
            kr12.f137013s = uk22.f142914e;
        }
        return C13598b0.f38549a;
    }
}
