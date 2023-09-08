package ii1;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gi1.C59463a;
import gi1.C59464c;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import li1.C61289a;
import rx3.C13598b0;

/* renamed from: ii1.b */
public final class C60288b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60291e f171908d;

    /* renamed from: e */
    public final /* synthetic */ C59464c f171909e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60288b(C60291e eVar, C59464c cVar) {
        super(0);
        this.f171908d = eVar;
        this.f171909e = cVar;
    }

    public Object invoke() {
        this.f171908d.mo10792g(this.f171909e.f169896a.size() > 1 ? 0 : 8);
        ViewGroup viewGroup = this.f171908d.f171915q;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        C61289a Z0 = this.f171908d.mo85276Z0();
        C59464c cVar = this.f171909e;
        LinkedList<C59463a> linkedList = cVar.f169896a;
        Rect rect = cVar.f169897b;
        C87412m.m108594g(linkedList, "data");
        C87412m.m108594g(rect, "viewRect");
        String m = Z0.mo86273m();
        Log.m105924i(m, "updateData data: " + linkedList);
        if (linkedList.size() <= 1) {
            Z0.f174401f.clear();
            Log.m105924i(Z0.mo86273m(), "updateData clear cache");
            Z0.f174400e.clear();
            Z0.mo85556d().removeAllViews();
        } else {
            Z0.f174402g = rect;
            Z0.f174401f.clear();
            Z0.f174401f.addAll(linkedList);
            Z0.mo85559g();
        }
        return C13598b0.f38549a;
    }
}
