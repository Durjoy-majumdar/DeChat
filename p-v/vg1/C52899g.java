package vg1;

import android.content.Context;
import androidx.lifecycle.C39622i0;
import bl1.C39775b;
import bl1.C39786k;
import cl1.C39975j;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin;
import com.tencent.p014mm.plugin.finder.view.C41573e3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import er1.C58739j4;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ok1.C62042e;
import rx3.C36570n;

/* renamed from: vg1.g */
public final class C52899g implements C39786k.C39787a {

    /* renamed from: a */
    public final Context f147728a;

    /* renamed from: b */
    public final FinderLiveBoxCommentPlugin f147729b;

    /* renamed from: c */
    public long f147730c;

    /* renamed from: vg1.g$a */
    public static final class C52900a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C52899g f147731d;

        public C52900a(C52899g gVar) {
            this.f147731d = gVar;
        }

        public final void run() {
            this.f147731d.mo73679f(Boolean.TRUE);
            C41573e3.f111902a.mo64658a();
            ((C39975j) this.f147731d.mo73678e(C39975j.class)).mo62585m3(0);
        }
    }

    public C52899g(Context context, int i, FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(finderLiveBoxCommentPlugin, "plugin");
        this.f147728a = context;
        this.f147729b = finderLiveBoxCommentPlugin;
    }

    /* renamed from: a */
    public void mo62417a(C39786k.C39790d dVar) {
        C87412m.m108594g(dVar, "notifyMsg");
        Log.m105924i("BoxCommentListPresenter", "notifyRemove commentListVisible:" + this.f147729b.f111634s + " size:" + this.f147729b.mo64544b1() + ' ' + dVar);
        this.f147729b.mo64547e1("notifyRemoveInfo", dVar);
        if (this.f147729b.f111634s) {
            boolean h = mo73681h();
            if (!h) {
                mo73682i(dVar, true);
            }
            long b1 = ((long) this.f147729b.mo64544b1()) - this.f147730c;
            WxRecyclerAdapter<C39775b> wxRecyclerAdapter = this.f147729b.f111638w;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyItemRangeRemoved(dVar.f106774a, dVar.f106775b);
            }
            mo73677d(h, b1);
        }
    }

    /* renamed from: b */
    public void mo62418b(C39786k.C39790d dVar) {
        C87412m.m108594g(dVar, "notifyMsg");
        Log.m105924i("BoxCommentListPresenter", "boxCommentLikeTrack notifyUpdate commentListVisible:" + this.f147729b.f111634s + " notifyUpdate size:" + this.f147729b.mo64544b1() + ' ' + dVar);
        this.f147729b.mo64547e1("notifyUpdateInfo", dVar);
        if (this.f147729b.f111634s) {
            C62042e eVar = C62042e.f176370a;
            eVar.mo86998D1("BoxCommentListPresenter", "boxCommentLikeTrack notifyUpdate size:" + this.f147729b.mo64544b1() + ' ' + dVar);
            boolean h = mo73681h();
            long b1 = ((long) this.f147729b.mo64544b1()) - this.f147730c;
            WxRecyclerAdapter<C39775b> wxRecyclerAdapter = this.f147729b.f111638w;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyItemRangeChanged(dVar.f106774a, dVar.f106775b, dVar.f106776c);
            }
            mo73677d(h, b1);
        }
    }

    /* renamed from: c */
    public void mo62419c(C39786k.C39790d dVar) {
        boolean z;
        C87412m.m108594g(dVar, "notifyMsg");
        Log.m105924i("BoxCommentListPresenter", "notifyAdd commentListVisible:" + this.f147729b.f111634s + " size:" + this.f147729b.mo64544b1() + ' ' + dVar);
        this.f147729b.mo64547e1("notifyAddInfo", dVar);
        if (this.f147729b.f111634s) {
            boolean z2 = true;
            if (!mo73681h()) {
                FinderLiveBoxCommentPlugin finderLiveBoxCommentPlugin = this.f147729b;
                if (finderLiveBoxCommentPlugin.f111633r) {
                    finderLiveBoxCommentPlugin.mo64550h1(false);
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = false;
                }
            }
            if (!z2) {
                mo73682i(dVar, false);
            }
            long b1 = ((long) this.f147729b.mo64544b1()) - this.f147730c;
            WxRecyclerAdapter<C39775b> wxRecyclerAdapter = this.f147729b.f111638w;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyItemRangeInserted(dVar.f106774a, dVar.f106775b);
            }
            mo73677d(z2, b1);
        }
    }

    /* renamed from: d */
    public final void mo73677d(boolean z, long j) {
        if (this.f147729b.mo64544b1() <= 0) {
            return;
        }
        if (z) {
            this.f147729b.mo64542Z0().post(new C52900a(this));
        } else if (j > 0) {
            ((C52903i) ((C36570n) this.f147729b.f111641z).getValue()).mo73687b(j);
        }
    }

    /* renamed from: e */
    public final <T extends C39622i0> T mo73678e(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        return this.f147729b.mo87684A0().mo71262a(cls);
    }

    /* renamed from: f */
    public final void mo73679f(Boolean bool) {
        mo73680g(this.f147729b.mo64544b1() - 1, bool);
        this.f147730c = (long) this.f147729b.mo64544b1();
        ((C39975j) mo73678e(C39975j.class)).mo62585m3(0);
    }

    /* renamed from: g */
    public final void mo73680g(int i, Boolean bool) {
        if (C87412m.m108589b(bool, Boolean.TRUE)) {
            WxRecyclerView Z0 = this.f147729b.mo64542Z0();
            int b1 = this.f147729b.mo64544b1() - 1;
            if (i > b1) {
                i = b1;
            }
            if (i < 0) {
                i = 0;
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            WxRecyclerView wxRecyclerView = Z0;
            C117292a.m165358d(wxRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter", "commentScrollToPos", "(ILjava/lang/Boolean;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            Z0.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(wxRecyclerView, "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter", "commentScrollToPos", "(ILjava/lang/Boolean;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            return;
        }
        WxRecyclerView Z02 = this.f147729b.mo64542Z0();
        int b15 = this.f147729b.mo64544b1() - 1;
        if (i > b15) {
            i = b15;
        }
        if (i < 0) {
            i = 0;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i));
        WxRecyclerView wxRecyclerView2 = Z02;
        C117292a.m165358d(wxRecyclerView2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter", "commentScrollToPos", "(ILjava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
        Z02.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(wxRecyclerView2, "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter", "commentScrollToPos", "(ILjava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
    }

    /* renamed from: h */
    public final boolean mo73681h() {
        return ((C39975j) mo73678e(C39975j.class)).f107173p && !C41573e3.f111902a.mo64659b();
    }

    /* renamed from: i */
    public final void mo73682i(C39786k.C39790d dVar, boolean z) {
        List<C39775b> data;
        Class cls = C39975j.class;
        WxRecyclerAdapter<C39775b> wxRecyclerAdapter = this.f147729b.f111638w;
        if (wxRecyclerAdapter != null && (data = wxRecyclerAdapter.getData()) != null) {
            try {
                int i = dVar.f106774a;
                int i2 = dVar.f106775b + i;
                if (z) {
                    int i3 = ((C39975j) mo73678e(cls)).f107175r;
                    if (i <= i3 && i3 < i2) {
                        ((C39975j) mo73678e(cls)).mo62585m3(0);
                    }
                } else if (((C39975j) mo73678e(cls)).f107175r <= 0) {
                    int b1 = this.f147729b.mo64544b1();
                    if (i2 > b1) {
                        i2 = b1;
                    }
                    for (int i4 = dVar.f106774a; i4 < i2; i4++) {
                        if (C62042e.f176370a.mo87105p(data.get(i4))) {
                            ((C39975j) mo73678e(cls)).mo62585m3(i4);
                            return;
                        }
                    }
                }
            } catch (Exception e) {
                C58739j4.f168176a.mo83712h0(e, "updateAtMeMsg");
            }
        }
    }
}
