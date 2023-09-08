package wg1;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import cj1.C54758g;
import cj1.C54785k6;
import cj1.C54795n5;
import cl1.C0673n1;
import cl1.C54991o;
import cl1.C54994o1;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import d60.C58124b;
import dj1.C45362g1;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import jp3.C9487b;
import kk1.C10288d;
import kk1.C46729b;
import nj3.C76912y0;
import nr3.C89059e;
import o40.C61926c;
import ok1.C62042e;
import qg1.C47826f;
import qj1.C62660c;
import qk1.C63205e0;
import rx3.C13598b0;
import zc1.C66785b;

/* renamed from: wg1.g0 */
public final class C66010g0 implements C66109y0 {

    /* renamed from: d */
    public final Context f189770d;

    /* renamed from: e */
    public final C45795b f189771e;

    /* renamed from: f */
    public final C58124b f189772f;

    /* renamed from: g */
    public final C62660c f189773g;

    /* renamed from: h */
    public C66112z0 f189774h;

    /* renamed from: i */
    public C63205e0 f189775i;

    /* renamed from: wg1.g0$a */
    public static final class C66011a extends C87413o implements C32227p<Integer, LinkedList<String>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63205e0 f189776d;

        /* renamed from: e */
        public final /* synthetic */ int f189777e;

        /* renamed from: f */
        public final /* synthetic */ C66010g0 f189778f;

        /* renamed from: g */
        public final /* synthetic */ String f189779g;

        /* renamed from: h */
        public final /* synthetic */ String f189780h;

        /* renamed from: i */
        public final /* synthetic */ Integer f189781i;

        /* renamed from: j */
        public final /* synthetic */ C54785k6 f189782j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66011a(C63205e0 e0Var, int i, C66010g0 g0Var, String str, String str2, Integer num, C54785k6 k6Var) {
            super(2);
            this.f189776d = e0Var;
            this.f189777e = i;
            this.f189778f = g0Var;
            this.f189779g = str;
            this.f189780h = str2;
            this.f189781i = num;
            this.f189782j = k6Var;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            LinkedList linkedList = (LinkedList) obj2;
            Class cls = C55001u.class;
            Class cls2 = C54994o1.class;
            C87412m.m108594g(linkedList, "unComplianceList");
            if (intValue == 0) {
                C63205e0 e0Var = this.f189776d;
                e0Var.f179340h.remove(this.f189777e);
                e0Var.notifyDataSetChanged();
                C66010g0 g0Var = this.f189778f;
                int itemCount = this.f189776d.getItemCount();
                C66112z0 z0Var = g0Var.f189774h;
                if (z0Var != null) {
                    z0Var.mo90086r(itemCount);
                }
                if (C87412m.m108589b(this.f189779g, this.f189780h)) {
                    int i = this.f189777e;
                    Integer num = this.f189781i;
                    if (num != null && i == num.intValue()) {
                        C10288d dVar = C10288d.f31346a;
                        C66010g0 g0Var2 = this.f189778f;
                        C10288d.m10244a(dVar, g0Var2.f189770d, this.f189779g, 2, ((C55001u) g0Var2.f189771e.mo71262a(cls)).f154416j, ((C55001u) this.f189778f.f189771e.mo71262a(cls)).f154420q.f182392d, ((C54991o) this.f189778f.f189771e.mo71262a(C54991o.class)).f154345o, (C32226l) null, 64, (Object) null);
                    }
                }
                if (!linkedList.isEmpty()) {
                    C54994o1 o1Var = (C54994o1) this.f189778f.f189771e.mo71262a(cls2);
                    o1Var.f154404n.clear();
                    o1Var.f154404n.addAll(linkedList);
                    Context context = this.f189778f.f189770d;
                    C76912y0.m92767f(context, context.getResources().getString(C0966R.string.mc7));
                }
                C54758g gVar = ((C54994o1) this.f189778f.f189771e.mo71262a(cls2)).f154399f;
                C54785k6 k6Var = this.f189782j;
                int i2 = this.f189777e;
                gVar.getClass();
                C87412m.m108594g(k6Var, "item");
                try {
                    C54785k6 k6Var2 = gVar.f153479b.get(i2);
                    C87412m.m108593f(k6Var2, "songList[index]");
                    C54785k6 k6Var3 = k6Var2;
                    if (C87412m.m108589b(k6Var.f153566a, k6Var3.f153566a)) {
                        Integer value = gVar.f153478a.getValue();
                        int i3 = -1;
                        if (value == null) {
                            value = -1;
                        }
                        int intValue2 = value.intValue();
                        gVar.f153479b.remove(i2);
                        if (intValue2 > i2 && intValue2 != -1) {
                            i3 = intValue2 - 1;
                        } else if (intValue2 != i2) {
                            i3 = intValue2;
                        }
                        gVar.f153478a.postValue(Integer.valueOf(i3));
                    }
                    Log.m105924i("FinderLiveAnchorMusicData", "deletesongItem item:" + k6Var + " songList size:" + gVar.f153479b.size() + ", locsongItem:" + k6Var3 + " , curPlayPos:" + gVar.f153478a);
                } catch (Exception e) {
                    C58739j4.f168176a.mo83712h0(e, "FinderLiveAnchorMusicData deletesongItem");
                }
                String str = this.f189782j.f153566a;
                C87412m.m108594g(str, "songName");
                C61926c.m72675T(((C54994o1) this.f189778f.f189771e.mo71262a(cls2)).f154404n, new C0673n1(str));
                ArrayList<C54785k6> arrayList = ((C54994o1) this.f189778f.f189771e.mo71262a(cls2)).f154399f.f153479b;
                if (arrayList == null || arrayList.isEmpty()) {
                    C66112z0 z0Var2 = this.f189778f.f189774h;
                    if (z0Var2 != null) {
                        z0Var2.mo90080h(false);
                    }
                } else {
                    this.f189776d.mo88120u5(false);
                }
            } else {
                Context context2 = this.f189778f.f189770d;
                C76912y0.m92767f(context2, context2.getResources().getString(C0966R.string.mbt));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.g0$b */
    public static final class C66012b extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66010g0 f189783d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66012b(C66010g0 g0Var) {
            super(1);
            this.f189783d = g0Var;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            Log.m105920e("FinderLiveAnchorMusicSingSongPresenter", "showMusic loadMoreData incrementNum:" + intValue + '!');
            if (intValue <= 0) {
                C66112z0 z0Var = this.f189783d.f189774h;
                if (z0Var != null) {
                    z0Var.mo90080h(true);
                }
            } else {
                if (!this.f189783d.mo90049e()) {
                    C66112z0 z0Var2 = this.f189783d.f189774h;
                    if (z0Var2 != null) {
                        z0Var2.mo90081l0();
                    }
                } else {
                    C66112z0 z0Var3 = this.f189783d.f189774h;
                    if (z0Var3 != null) {
                        z0Var3.mo90087s();
                    }
                }
                C66010g0 g0Var = this.f189783d;
                C66112z0 z0Var4 = g0Var.f189774h;
                if (z0Var4 != null) {
                    z0Var4.mo90078f(((C54994o1) g0Var.f189771e.mo71262a(C54994o1.class)).f154399f.f153479b);
                }
                C63205e0 e0Var = this.f189783d.f189775i;
                if (e0Var != null) {
                    e0Var.mo88120u5(true);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C66010g0(Context context, C45795b bVar, C58124b bVar2, C62660c cVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(bVar2, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f189770d = context;
        this.f189771e = bVar;
        this.f189772f = bVar2;
        this.f189773g = cVar;
    }

    /* renamed from: A */
    public void mo90045A(C54785k6 k6Var) {
        C54785k6 k6Var2 = k6Var;
        Class cls = C55001u.class;
        C87412m.m108594g(k6Var2, "musicItem");
        C54758g gVar = ((C54994o1) this.f189771e.mo71262a(C54994o1.class)).f154399f;
        gVar.getClass();
        try {
            if (k6Var2.f153568c != 3) {
                k6Var2.f153568c = 3;
                k6Var2.f153571f = true;
                k6Var2.f153573h = "";
                gVar.f153478a.postValue(-1);
            }
        } catch (Exception e) {
            C58739j4.f168176a.mo83712h0(e, "FinderLiveAnchorMusicData playsongItem");
        }
        Log.m105924i("FinderLiveAnchorMusicData", "resumesongItem " + k6Var2 + " songId size:" + gVar.f153479b.size() + ", curPlayPos:" + gVar.f153478a);
        C10288d.m10244a(C10288d.f31346a, this.f189770d, k6Var2.f153566a, 2, ((C55001u) this.f189771e.mo71262a(cls)).f154416j, ((C55001u) this.f189771e.mo71262a(cls)).f154420q.f182392d, ((C54991o) this.f189771e.mo71262a(C54991o.class)).f154345o, (C32226l) null, 64, (Object) null);
    }

    /* renamed from: I0 */
    public void mo90046I0(boolean z) {
        C63205e0 e0Var = this.f189775i;
        if (e0Var != null) {
            e0Var.mo88119g5(z);
        }
    }

    /* renamed from: P0 */
    public void mo90047P0(boolean z) {
        C54795n5 D0;
        Class cls = C54994o1.class;
        C66112z0 z0Var = this.f189774h;
        if (z0Var != null) {
            z0Var.mo90079g(true);
        }
        if (!z) {
            C66012b bVar = new C66012b(this);
            if (this.f189773g.mo14476D0() == null) {
                bVar.invoke(0);
                return;
            }
            C62660c cVar = this.f189773g;
            if (cVar != null && (D0 = cVar.mo14476D0()) != null) {
                D0.mo75701E(C66785b.f191882e.mo90662O5(), ((C55001u) this.f189771e.mo71262a(C55001u.class)).f154416j, new C66014h0(this, bVar));
            }
        } else if (((C54994o1) this.f189771e.mo71262a(cls)).f154399f.f153479b.size() <= 0) {
            C66112z0 z0Var2 = this.f189774h;
            if (z0Var2 != null) {
                z0Var2.mo90080h(true);
            }
        } else {
            if (!mo90049e()) {
                C66112z0 z0Var3 = this.f189774h;
                if (z0Var3 != null) {
                    z0Var3.mo90081l0();
                }
            } else {
                C66112z0 z0Var4 = this.f189774h;
                if (z0Var4 != null) {
                    z0Var4.mo90087s();
                }
            }
            C66112z0 z0Var5 = this.f189774h;
            if (z0Var5 != null) {
                z0Var5.mo90078f(((C54994o1) this.f189771e.mo71262a(cls)).f154399f.f153479b);
            }
            C63205e0 e0Var = this.f189775i;
            if (e0Var != null) {
                e0Var.mo88120u5(true);
            }
        }
    }

    /* renamed from: T */
    public void mo90048T(boolean z, C47826f.C47827a aVar) {
        Class cls = C55001u.class;
        if (mo90049e()) {
            FinderLiveService.f159376d.getClass();
            C54795n5 n5Var = FinderLiveService.f159396y;
            if (n5Var != null) {
                n5Var.mo75706J(((C55001u) this.f189771e.mo71262a(cls)).f154420q.f182392d, ((C55001u) this.f189771e.mo71262a(cls)).f154416j, ((C54991o) this.f189771e.mo71262a(C54991o.class)).f154354q, 1, aVar);
                return;
            }
            return;
        }
        ((C54994o1) this.f189771e.mo71262a(C54994o1.class)).f154402i.postValue(Boolean.valueOf(z));
        mo90054q1(z);
    }

    /* renamed from: e */
    public final boolean mo90049e() {
        return ((C54991o) this.f189771e.mo71262a(C54991o.class)).mo75999e4();
    }

    /* renamed from: g1 */
    public void mo90050g1(C54785k6 k6Var, int i) {
        C54785k6 k6Var2 = k6Var;
        Class cls = C55001u.class;
        Class cls2 = C54994o1.class;
        C87412m.m108594g(k6Var2, "musicItem");
        C54785k6 a = ((C54994o1) this.f189771e.mo71262a(cls2)).f154399f.mo75658a();
        String str = a != null ? a.f153566a : null;
        Integer value = ((C54994o1) this.f189771e.mo71262a(cls2)).f154399f.f153478a.getValue();
        String str2 = k6Var2.f153566a;
        C63205e0 e0Var = this.f189775i;
        if (e0Var != null) {
            Context context = this.f189770d;
            ArrayList arrayList = new ArrayList();
            Iterator<C54785k6> it = e0Var.f179340h.iterator();
            while (it.hasNext()) {
                C54785k6 next = it.next();
                if ((next.f153566a.length() > 0) && !C87412m.m108589b(str2, next.f153566a)) {
                    arrayList.add(next.f153566a);
                }
            }
            long j = ((C55001u) this.f189771e.mo71262a(cls)).f154416j;
            long j2 = ((C55001u) this.f189771e.mo71262a(cls)).f154420q.f182392d;
            String str3 = ((C54991o) this.f189771e.mo71262a(C54991o.class)).f154345o;
            C66011a aVar = r0;
            C66011a aVar2 = new C66011a(e0Var, i, this, str, str2, value, k6Var);
            C87412m.m108594g(context, "context");
            C87412m.m108594g(str3, "userName");
            C89059e i2 = new C45362g1(arrayList, System.currentTimeMillis(), j, j2, str3, (C45362g1.C45363a) null, 32, (C8480h) null).mo9225i();
            i2.mo123420E(new C46729b(aVar));
            if (context instanceof MMActivity) {
                i2.mo11397F((C9487b) context);
            }
        }
        Log.m105924i("FinderLiveAnchorMusicSingSongPresenter", "deleteMusic bgMusicId:" + str + ", songPlayId:" + str2);
    }

    public void hide() {
        C58124b.C7172a.m7372a(this.f189772f, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SING_SONG_LIST_HIDE, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: l */
    public void mo90052l() {
        C66112z0 z0Var = this.f189774h;
        if (z0Var != null) {
            z0Var.mo90079g(false);
        }
    }

    /* renamed from: n */
    public void mo90053n(C54785k6 k6Var, int i, boolean z) {
        C54785k6 k6Var2 = k6Var;
        int i2 = i;
        Class cls = C55001u.class;
        C87412m.m108594g(k6Var2, "musicItem");
        C54758g gVar = ((C54994o1) this.f189771e.mo71262a(C54994o1.class)).f154399f;
        gVar.getClass();
        try {
            C54785k6 a = gVar.mo75658a();
            C54785k6 k6Var3 = gVar.f153479b.get(i2);
            C87412m.m108593f(k6Var3, "songList[pos]");
            C54785k6 k6Var4 = k6Var3;
            if (C87412m.m108589b(k6Var4.f153566a, k6Var2.f153566a)) {
                k6Var4.f153568c = 4;
                k6Var4.f153567b = 0;
                if (a != null) {
                    a.f153568c = 3;
                }
                if (a != null) {
                    a.f153571f = true;
                }
                Log.m105924i("FinderLiveAnchorMusicData", k6Var4.f153566a + ", MUSIC_PLAY}");
                gVar.f153478a.postValue(Integer.valueOf(i));
            }
            Log.m105924i("FinderLiveAnchorMusicData", "playsongItem item:" + k6Var2 + " songList size:" + gVar.f153479b.size() + ", pos:" + i2 + ", newsongItem:" + k6Var4 + ", curPlayPos:" + gVar.f153478a);
        } catch (Exception e) {
            C58739j4.f168176a.mo83712h0(e, "FinderLiveAnchorMusicData playsongItem");
        }
        C10288d.m10244a(C10288d.f31346a, this.f189770d, k6Var2.f153566a, 1, ((C55001u) this.f189771e.mo71262a(cls)).f154416j, ((C55001u) this.f189771e.mo71262a(cls)).f154420q.f182392d, ((C54991o) this.f189771e.mo71262a(C54991o.class)).f154345o, (C32226l) null, 64, (Object) null);
        Log.m105924i("FinderLiveAnchorMusicSingSongPresenter", "playMusic " + k6Var2 + ", forcePlay:" + z + ", stack:" + Util.getStack());
    }

    public void onAttach(Object obj) {
        C66112z0 z0Var;
        C66112z0 z0Var2 = (C66112z0) obj;
        C87412m.m108594g(z0Var2, "callback");
        Log.m105924i("FinderLiveAnchorMusicSingSongPresenter", "onAttach");
        this.f189774h = z0Var2;
        z0Var2.mo90077a();
        if (!mo90049e() && (z0Var = this.f189774h) != null) {
            z0Var.mo90081l0();
        }
        C63205e0 e0Var = new C63205e0(this.f189771e, this.f189770d);
        this.f189775i = e0Var;
        e0Var.f179343n = new C66017i0(this, e0Var);
        e0Var.f179341i = new C66033j0(this, e0Var);
        e0Var.f179342j = new C66035k0(this);
        e0Var.f179344o = new C66042l0(this);
        C66112z0 z0Var3 = this.f189774h;
        C87412m.m108592e(z0Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorMusicSingSongViewCallback");
        WxRecyclerView wxRecyclerView = ((C66045m0) z0Var3).f189874G;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(this.f189775i);
            wxRecyclerView.setLayoutManager(new LinearLayoutManager(wxRecyclerView.getContext()));
        }
    }

    /* renamed from: q1 */
    public void mo90054q1(boolean z) {
        Class cls = C54991o.class;
        if (z) {
            C62042e eVar = C62042e.f176370a;
            C45795b bVar = this.f189771e;
            eVar.getClass();
            if (bVar != null) {
                ((C54991o) bVar.mo71262a(cls)).f154354q |= 32768;
            }
        } else {
            C62042e eVar2 = C62042e.f176370a;
            C45795b bVar2 = this.f189771e;
            eVar2.getClass();
            if (bVar2 != null) {
                ((C54991o) bVar2.mo71262a(cls)).f154354q &= -32769;
            }
        }
        mo90046I0(z);
    }
}
