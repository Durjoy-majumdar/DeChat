package il1;

import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveVisitorGameTogetherWidget;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32226l;
import gy3.C87413o;
import ob0.C89132b;
import rx3.C13598b0;
import sk1.C63953g;
import te3.C48933c01;
import te3.C64247az0;

/* renamed from: il1.f8 */
public final class C60397f8 extends C87413o implements C32226l<C89132b.C89134c<C48933c01>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveVisitorGameTogetherWidget f172212d;

    /* renamed from: e */
    public final /* synthetic */ C63953g f172213e;

    /* renamed from: f */
    public final /* synthetic */ int f172214f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60397f8(FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget, C63953g gVar, int i) {
        super(1);
        this.f172212d = finderLiveVisitorGameTogetherWidget;
        this.f172213e = gVar;
        this.f172214f = i;
    }

    public Object invoke(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Class cls = C54991o.class;
        boolean z = false;
        if (cVar != null && cVar.f256793a == 0) {
            z = true;
        }
        if (!z || cVar.f256794b != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("refresh gameteam fail: ");
            Integer num = null;
            sb.append(cVar != null ? Integer.valueOf(cVar.f256793a) : null);
            sb.append(' ');
            if (cVar != null) {
                num = Integer.valueOf(cVar.f256794b);
            }
            sb.append(num);
            Log.m105928w("Finder.FinderLiveVisitorGameTeamWidget", sb.toString());
        } else {
            C64247az0 az02 = ((C48933c01) cVar.f256796d).f131419d;
            if (az02 != null) {
                FinderLiveVisitorGameTogetherWidget finderLiveVisitorGameTogetherWidget = this.f172212d;
                C63953g gVar = this.f172213e;
                int i = this.f172214f;
                ((C54991o) finderLiveVisitorGameTogetherWidget.f160109c.mo87696x0(cls)).mo76024u4(az02);
                ((C54991o) finderLiveVisitorGameTogetherWidget.f160109c.mo87696x0(cls)).mo75957E4(((C48933c01) cVar.f256796d).f131421f);
                gVar.f181283h = az02;
                WxRecyclerAdapter<C63953g> wxRecyclerAdapter = finderLiveVisitorGameTogetherWidget.f160119m;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyItemChanged(i);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
