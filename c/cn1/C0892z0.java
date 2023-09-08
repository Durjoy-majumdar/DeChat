package cn1;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import an1.C0094g;
import an1.C0095h;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import gy3.C87412m;
import jq3.C60905o;
import nj3.C11184p0;
import te3.C64273c21;
import wx3.C15601d;

/* renamed from: cn1.z0 */
public final class C0892z0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ int f2106d;

    /* renamed from: e */
    public final /* synthetic */ C0095h f2107e;

    /* renamed from: f */
    public final /* synthetic */ C0870s0 f2108f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView.C16613e<C60905o> f2109g;

    public C0892z0(int i, C0095h hVar, C0870s0 s0Var, RecyclerView.C16613e<C60905o> eVar) {
        this.f2106d = i;
        this.f2107e = hVar;
        this.f2108f = s0Var;
        this.f2109g = eVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        FinderItem o;
        C64273c21 liveInfo;
        int i2 = this.f2106d;
        if (i2 != -1) {
            C0740i2 remove = this.f2107e.f533e.remove(i2);
            C87412m.m108593f(remove, "feedData.feedDataList.removeAt(position)");
            C0740i2 i2Var = remove;
            C0870s0 s0Var = this.f2108f;
            C0094g gVar = i2Var instanceof C0094g ? (C0094g) i2Var : null;
            s0Var.mo775k(5, (gVar == null || (o = gVar.mo3513o()) == null || (liveInfo = o.getLiveInfo()) == null) ? 0 : liveInfo.f182392d);
            this.f2109g.notifyItemRemoved(this.f2106d);
            C0870s0 s0Var2 = this.f2108f;
            long itemId = i2Var.getItemId();
            s0Var2.getClass();
            C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C0888y0(itemId, (C15601d<? super C0888y0>) null), 2, (Object) null);
        }
    }
}
