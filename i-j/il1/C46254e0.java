package il1;

import android.content.Context;
import cj1.C54795n5;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveAnchorGameTogetherWidget;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;
import te3.C49218e20;
import te3.C50868ps1;
import te3.C51560uk2;
import te3.C51613uy0;
import te3.C51868wr1;

/* renamed from: il1.e0 */
public final class C46254e0 extends C87413o implements C32227p<C51560uk2, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorGameTogetherWidget f124690d;

    /* renamed from: e */
    public final /* synthetic */ C51613uy0 f124691e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46254e0(FinderLiveAnchorGameTogetherWidget finderLiveAnchorGameTogetherWidget, C51613uy0 uy02) {
        super(2);
        this.f124690d = finderLiveAnchorGameTogetherWidget;
        this.f124691e = uy02;
    }

    public Object invoke(Object obj, Object obj2) {
        C51560uk2 uk22 = (C51560uk2) obj;
        int intValue = ((Number) obj2).intValue();
        Class cls = C55001u.class;
        C87412m.m108594g(uk22, LocaleUtil.ITALIAN);
        String str = this.f124690d.f160039d;
        StringBuilder sb = new StringBuilder();
        sb.append("gamteam select value:");
        sb.append(uk22.f142914e);
        sb.append(", tip:");
        sb.append(uk22.f142913d);
        sb.append(", expose:");
        String str2 = uk22.f142913d;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        Log.m105924i(str, sb.toString());
        C51613uy0 uy02 = this.f124691e;
        LinkedList<C49218e20> linkedList = null;
        Integer valueOf = uy02 != null ? Integer.valueOf(uy02.f143181e) : null;
        C51868wr1 wr12 = new C51868wr1();
        wr12.f144237d = uk22.f142914e;
        C50868ps1 ps12 = new C50868ps1();
        C50868ps1 ps13 = uk22.f142915f;
        ps12.f139935d = ps13 != null ? ps13.f139935d : 0;
        if (ps13 != null) {
            linkedList = ps13.f139937f;
        }
        ps12.f139937f = linkedList;
        ps12.f139936e = intValue;
        wr12.f144238e = ps12;
        FinderLiveService.f159376d.getClass();
        C54795n5 n5Var = FinderLiveService.f159396y;
        if (n5Var != null) {
            Context context = this.f124690d.f160036a.getContext();
            C87412m.m108593f(context, "root.context");
            n5Var.mo75719W(context, ((C55001u) this.f124690d.f160038c.mo87684A0().mo71262a(cls)).f154420q.f182392d, ((C55001u) this.f124690d.f160038c.mo87684A0().mo71262a(cls)).f154416j, wr12, new C46252d0(this.f124690d, uk22, this.f124691e, intValue, valueOf));
        }
        return C13598b0.f38549a;
    }
}
