package wg1;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import cj1.C54795n5;
import cl1.C54991o;
import cl1.C54994o1;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import d60.C58124b;
import dj1.C45377n;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import o40.C61926c;
import qj1.C62660c;
import qk1.C63267v2;
import rx3.C13598b0;
import te3.C50708oo0;
import te3.t94;

/* renamed from: wg1.b3 */
public final class C65982b3 implements C65997e4 {

    /* renamed from: d */
    public final Context f189708d;

    /* renamed from: e */
    public final C45795b f189709e;

    /* renamed from: f */
    public final C58124b f189710f;

    /* renamed from: g */
    public final C62660c f189711g;

    /* renamed from: h */
    public C66009f4 f189712h;

    /* renamed from: i */
    public C63267v2 f189713i;

    /* renamed from: wg1.b3$a */
    public static final class C65983a implements C45377n.C45378a {

        /* renamed from: a */
        public final /* synthetic */ C65982b3 f189714a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Integer, C13598b0> f189715b;

        /* renamed from: wg1.b3$a$a */
        public static final class C65984a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ int f189716d;

            /* renamed from: e */
            public final /* synthetic */ int f189717e;

            /* renamed from: f */
            public final /* synthetic */ C65982b3 f189718f;

            /* renamed from: g */
            public final /* synthetic */ C50708oo0 f189719g;

            /* renamed from: h */
            public final /* synthetic */ C32226l<Integer, C13598b0> f189720h;

            /* renamed from: i */
            public final /* synthetic */ String f189721i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C65984a(int i, int i2, C65982b3 b3Var, C50708oo0 oo02, C32226l<? super Integer, C13598b0> lVar, String str) {
                super(0);
                this.f189716d = i;
                this.f189717e = i2;
                this.f189718f = b3Var;
                this.f189719g = oo02;
                this.f189720h = lVar;
                this.f189721i = str;
            }

            public Object invoke() {
                int i = 0;
                if (this.f189716d == 0 && this.f189717e == 0) {
                    ((C54994o1) this.f189718f.f189709e.mo71262a(C54994o1.class)).f154399f.mo75661d(this.f189719g, this.f189718f.f189708d);
                    C32226l<Integer, C13598b0> lVar = this.f189720h;
                    if (lVar != null) {
                        LinkedList<t94> linkedList = this.f189719g.f139275d;
                        if (linkedList != null) {
                            i = linkedList.size();
                        }
                        lVar.invoke(Integer.valueOf(i));
                    }
                } else {
                    Log.m105924i("FinderLiveVisitorMusicSingSongPresenter", "cgi getSingSongList failed errType: " + this.f189716d + ", errCode: " + this.f189717e + ", errMsg: " + this.f189721i);
                    this.f189720h.invoke(0);
                }
                return C13598b0.f38549a;
            }
        }

        public C65983a(C65982b3 b3Var, C32226l<? super Integer, C13598b0> lVar) {
            this.f189714a = b3Var;
            this.f189715b = lVar;
        }

        /* renamed from: a */
        public void mo70893a(int i, int i2, String str, C50708oo0 oo02) {
            C87412m.m108594g(oo02, "resp");
            C61926c.m72668M(new C65984a(i, i2, this.f189714a, oo02, this.f189715b, str));
        }
    }

    public C65982b3(Context context, C45795b bVar, C58124b bVar2, C62660c cVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(bVar2, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f189708d = context;
        this.f189709e = bVar;
        this.f189710f = bVar2;
        this.f189711g = cVar;
    }

    /* renamed from: e */
    public void mo73860e(boolean z, C32226l<? super Integer, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        if (this.f189711g.mo14476D0() == null) {
            lVar.invoke(0);
            return;
        }
        C54795n5 D0 = this.f189711g.mo14476D0();
        if (D0 != null) {
            D0.mo75701E(((C54991o) this.f189709e.mo71262a(C54991o.class)).f154345o, ((C55001u) this.f189709e.mo71262a(C55001u.class)).f154416j, new C65983a(this, lVar));
        }
    }

    public void hide() {
        C58124b.C7172a.m7372a(this.f189710f, C58124b.C58125b.FINDER_LIVE_VISITOR_MUSIC_SING_SONG_LIST_HIDE, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: n */
    public boolean mo73861n(int i) {
        return false;
    }

    public void onAttach(Object obj) {
        C66009f4 f4Var = (C66009f4) obj;
        C87412m.m108594g(f4Var, "callback");
        Log.m105924i("FinderLiveVisitorMusicSingSongPresenter", "onAttach");
        this.f189712h = f4Var;
        f4Var.mo90036a();
        C63267v2 v2Var = new C63267v2(this.f189709e);
        this.f189713i = v2Var;
        v2Var.f179555j = new C65987c3(this);
        v2Var.f179556n = new C65990d3(this);
        C66009f4 f4Var2 = this.f189712h;
        C87412m.m108592e(f4Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.component.FinderLiveVisitorMusicSingSongViewCallback");
        WxRecyclerView wxRecyclerView = ((C66002f3) f4Var2).f189763s;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(this.f189713i);
            wxRecyclerView.setLayoutManager(new LinearLayoutManager(wxRecyclerView.getContext()));
        }
    }
}
