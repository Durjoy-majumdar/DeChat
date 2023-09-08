package wg1;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import cj1.C54754f;
import cj1.C54768h6;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import d60.C58124b;
import dj1.C45379o0;
import dj1.C45399x0;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import kk1.C46728a;
import nr3.C89059e;
import o40.C61926c;
import qk1.C63232l;
import rx3.C13598b0;
import te3.C49392f81;
import te3.C51922x41;
import te3.C52312zv0;
import zc1.C66785b;

/* renamed from: wg1.u0 */
public final class C66085u0 implements C66075s0 {

    /* renamed from: d */
    public final Context f189975d;

    /* renamed from: e */
    public final C45795b f189976e;

    /* renamed from: f */
    public final C58124b f189977f;

    /* renamed from: g */
    public final String f189978g = "FinderLiveAnchorSearchMusicPresenter";

    /* renamed from: h */
    public C66082t0 f189979h;

    /* renamed from: i */
    public C63232l f189980i;

    /* renamed from: wg1.u0$a */
    public static final class C66086a implements C45399x0.C45400a {

        /* renamed from: a */
        public final /* synthetic */ C66085u0 f189981a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Integer, C13598b0> f189982b;

        /* renamed from: wg1.u0$a$a */
        public static final class C66087a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C66085u0 f189983d;

            /* renamed from: e */
            public final /* synthetic */ C49392f81 f189984e;

            /* renamed from: f */
            public final /* synthetic */ C32226l<Integer, C13598b0> f189985f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66087a(C66085u0 u0Var, C49392f81 f812, C32226l<? super Integer, C13598b0> lVar) {
                super(0);
                this.f189983d = u0Var;
                this.f189984e = f812;
                this.f189985f = lVar;
            }

            public Object invoke() {
                Class cls = C54991o.class;
                ((C54991o) this.f189983d.f189976e.mo71262a(cls)).f154232N2.mo75655l(((C54991o) this.f189983d.f189976e.mo71262a(cls)).f154232N2.f153471h, this.f189984e);
                C32226l<Integer, C13598b0> lVar = this.f189985f;
                LinkedList<C51922x41> linkedList = this.f189984e.f133349d;
                lVar.invoke(Integer.valueOf(linkedList != null ? linkedList.size() : 0));
                return C13598b0.f38549a;
            }
        }

        public C66086a(C66085u0 u0Var, C32226l<? super Integer, C13598b0> lVar) {
            this.f189981a = u0Var;
            this.f189982b = lVar;
        }

        /* renamed from: a */
        public void mo70902a(int i, int i2, String str, C49392f81 f812) {
            C87412m.m108594g(f812, "resp");
            C61926c.m72668M(new C66087a(this.f189981a, f812, this.f189982b));
        }
    }

    public C66085u0(Context context, C45795b bVar, C58124b bVar2) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f189975d = context;
        this.f189976e = bVar;
        this.f189977f = bVar2;
    }

    /* renamed from: P */
    public void mo90113P() {
        ArrayList<C54768h6> arrayList = ((C54991o) this.f189976e.mo71262a(C54991o.class)).f154232N2.f153470g;
        if (arrayList == null || arrayList.isEmpty()) {
            String str = this.f189978g;
            Log.m105924i(str, "updateSearchView, searchData:" + arrayList);
            return;
        }
        C66082t0 t0Var = this.f189979h;
        if (t0Var != null) {
            t0Var.mo90129X(arrayList);
        }
        C63232l lVar = this.f189980i;
        if (lVar != null) {
            C87412m.m108594g(arrayList, "suggests");
            lVar.f179440e.clear();
            lVar.f179440e.addAll(arrayList);
            lVar.notifyDataSetChanged();
        }
    }

    /* renamed from: R */
    public void mo90114R(String str) {
        C87412m.m108594g(str, "content");
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        if (C87412m.m108589b(str, ((C54991o) this.f189976e.mo71262a(cls2)).f154232N2.f153471h)) {
            String str2 = this.f189978g;
            Log.m105924i(str2, "have search content:" + str + '!');
            return;
        }
        ((C54991o) this.f189976e.mo71262a(cls2)).f154232N2.f153473j = 0;
        ((C54991o) this.f189976e.mo71262a(cls2)).f154232N2.f153472i = null;
        C89059e i = new C45399x0(((C55001u) this.f189976e.mo71262a(cls)).f154420q.f182392d, ((C55001u) this.f189976e.mo71262a(cls)).f154417n, C66785b.f191882e.mo90662O5(), ((C55001u) this.f189976e.mo71262a(cls)).f154416j, str, ((C54991o) this.f189976e.mo71262a(cls2)).f154232N2.f153472i, new C66091v0(this, str)).mo9225i();
        Context context = this.f189975d;
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        i.mo11397F((MMActivity) context);
    }

    /* renamed from: U0 */
    public boolean mo90115U0() {
        C54754f fVar = ((C54991o) this.f189976e.mo71262a(C54991o.class)).f154232N2;
        boolean z = fVar.f153468e.size() < fVar.f153464a;
        Log.m105924i("FinderLiveAnchorMusicData", "songId size:" + fVar.f153468e.size() + ", musicList id size:" + fVar.f153469f.size() + ", canAddMusic :" + z);
        return z;
    }

    /* renamed from: Z */
    public void mo90116Z() {
        C58124b.C7172a.m7372a(this.f189977f, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SHOW, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: e */
    public void mo73860e(boolean z, C32226l<? super Integer, C13598b0> lVar) {
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        C87412m.m108594g(lVar, "callback");
        String str = ((C54991o) this.f189976e.mo71262a(cls2)).f154232N2.f153471h;
        if (str == null || str.length() == 0) {
            lVar.invoke(0);
            return;
        }
        ((C54991o) this.f189976e.mo71262a(cls2)).f154232N2.f153473j = 0;
        C89059e i = new C45399x0(((C55001u) this.f189976e.mo71262a(cls)).f154420q.f182392d, ((C55001u) this.f189976e.mo71262a(cls)).f154417n, C66785b.f191882e.mo90662O5(), ((C55001u) this.f189976e.mo71262a(cls)).f154416j, ((C54991o) this.f189976e.mo71262a(cls2)).f154232N2.f153471h, ((C54991o) this.f189976e.mo71262a(cls2)).f154232N2.f153472i, new C66086a(this, lVar)).mo9225i();
        Context context = this.f189975d;
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        i.mo11397F((MMActivity) context);
    }

    public void hide() {
        C58124b.C7172a.m7372a(this.f189977f, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_HIDE, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: j */
    public void mo90137j() {
        C66082t0 t0Var = this.f189979h;
        if (t0Var != null) {
            t0Var.mo90131j();
        }
    }

    /* renamed from: n */
    public boolean mo73861n(int i) {
        return ((C54991o) this.f189976e.mo71262a(C54991o.class)).f154232N2.f153473j > 0;
    }

    public void onAttach(Object obj) {
        C66082t0 t0Var = (C66082t0) obj;
        C87412m.m108594g(t0Var, "callback");
        Log.m105924i(this.f189978g, "onAttach");
        this.f189979h = t0Var;
        t0Var.mo90130a();
        this.f189980i = new C63232l(this);
        C66082t0 t0Var2 = this.f189979h;
        C87412m.m108592e(t0Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorSearchMusicViewCallback");
        WxRecyclerView wxRecyclerView = ((C66098w0) t0Var2).f190013o;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(this.f189980i);
            wxRecyclerView.setLayoutManager(new LinearLayoutManager(wxRecyclerView.getContext()));
        }
    }

    /* renamed from: w */
    public void mo90118w(C54768h6 h6Var) {
        C54768h6 h6Var2 = h6Var;
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        C87412m.m108594g(h6Var2, "musicItem");
        C54754f fVar = ((C54991o) this.f189976e.mo71262a(cls2)).f154232N2;
        fVar.getClass();
        fVar.f153469f.add(h6Var2);
        fVar.f153468e.add(Integer.valueOf(h6Var2.f153498a.f144442d));
        Log.m105924i("FinderLiveAnchorMusicData", "addMusicItem " + h6Var2 + ", songId size:" + fVar.f153468e.size() + ", musicList id size:" + fVar.f153469f.size() + ", curPlayPos:" + fVar.f153467d);
        C58124b bVar = this.f189977f;
        C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_PLAY;
        Bundle bundle = new Bundle();
        bundle.putInt("PARAM_FINDER_LIVE_MUSIC_ID", h6Var2.f153498a.f144442d);
        C13598b0 b0Var = C13598b0.f38549a;
        bVar.statusChange(bVar2, bundle);
        long j = ((C55001u) this.f189976e.mo71262a(cls)).f154420q.f182392d;
        byte[] bArr = ((C55001u) this.f189976e.mo71262a(cls)).f154417n;
        String O5 = C66785b.f191882e.mo90662O5();
        long j2 = ((C55001u) this.f189976e.mo71262a(cls)).f154416j;
        long j3 = j;
        byte[] bArr2 = bArr;
        String str = O5;
        long j4 = j2;
        C52312zv0 e = ((C54991o) this.f189976e.mo71262a(cls2)).f154232N2.mo75648e();
        new C45379o0(j3, bArr2, str, j2, e, 3, new C46728a(j3, bArr2, str, j2, e)).mo9225i();
        C66107x1.f190022a.mo90147a(((C54991o) this.f189976e.mo71262a(cls2)).mo75999e4(), 2, h6Var2.f153498a.f144442d);
    }

    /* renamed from: w0 */
    public void mo90119w0() {
        ArrayList<C54768h6> arrayList;
        Class cls = C54991o.class;
        C58124b.C7172a.m7372a(this.f189977f, C58124b.C58125b.FINDER_LIVE_ANCHOR_SEARCH_MUSIC_HIDE, (Bundle) null, 2, (Object) null);
        ((C54991o) this.f189976e.mo71262a(cls)).f154232N2.f153470g.clear();
        C54754f fVar = ((C54991o) this.f189976e.mo71262a(cls)).f154232N2;
        fVar.getClass();
        fVar.f153471h = "";
        C63232l lVar = this.f189980i;
        if (!(lVar == null || (arrayList = lVar.f179440e) == null)) {
            arrayList.clear();
        }
        C63232l lVar2 = this.f189980i;
        if (lVar2 != null) {
            lVar2.notifyDataSetChanged();
        }
    }
}
