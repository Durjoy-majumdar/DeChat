package il1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import cj1.C54795n5;
import cl1.C0654b;
import cl1.C0696x;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.service.C3601l1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import fe1.C58961d;
import fe1.C58969q;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60172g4;
import ht1.C8794p5;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import ok1.C62042e;
import p629ny.C76979h;
import qj1.C12677tg;
import qj1.C62660c;
import qo3.C12925w;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C50326ly0;
import te3.C51376tc1;
import te3.C64273c21;
import te3.C64414h71;
import tf0.C64916p1;
import wx3.C15601d;
import wx3.C66212f;
import zc1.C66785b;

/* renamed from: il1.t2 */
public final class C9114t2 extends C9120u0 implements View.OnClickListener {

    /* renamed from: D */
    public static final /* synthetic */ int f28705D = 0;

    /* renamed from: A */
    public boolean f28706A;

    /* renamed from: B */
    public boolean f28707B;

    /* renamed from: C */
    public C8794p5<C51376tc1> f28708C;

    /* renamed from: h */
    public final View f28709h;

    /* renamed from: i */
    public final View f28710i;

    /* renamed from: j */
    public final View f28711j;

    /* renamed from: n */
    public final TextView f28712n;

    /* renamed from: o */
    public final View f28713o;

    /* renamed from: p */
    public final TextView f28714p;

    /* renamed from: q */
    public final TextView f28715q;

    /* renamed from: r */
    public C12925w f28716r;

    /* renamed from: s */
    public C0000n0 f28717s = C53930o0.m60555b();

    /* renamed from: t */
    public C32226l<? super C12677tg.C12678a, C13598b0> f28718t;

    /* renamed from: u */
    public C32226l<? super Boolean, C13598b0> f28719u;

    /* renamed from: v */
    public C32224a<C13598b0> f28720v;

    /* renamed from: w */
    public C45795b f28721w;

    /* renamed from: x */
    public boolean f28722x;

    /* renamed from: y */
    public boolean f28723y;

    /* renamed from: z */
    public C12677tg.C12678a f28724z = C12677tg.C12678a.DEFAULT;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9114t2(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f359719ag2, this, false);
        this.f28709h = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.csn);
        this.f28710i = findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.csl);
        this.f28711j = findViewById2;
        this.f28712n = (TextView) inflate.findViewById(C0966R.C0970id.csp);
        this.f28713o = inflate.findViewById(C0966R.C0970id.hsd);
        this.f28714p = (TextView) inflate.findViewById(C0966R.C0970id.ctd);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.fec);
        this.f28715q = textView;
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        textView.setOnClickListener(this);
        C87412m.m108593f(textView, "joinBtn");
        setTextBold(textView);
    }

    /* renamed from: b */
    public final void mo9908b() {
        if (this.f28722x) {
            mo9909c();
            C32226l<? super C12677tg.C12678a, C13598b0> lVar = this.f28718t;
            if (lVar != null) {
                lVar.invoke(this.f28724z);
                return;
            }
            return;
        }
        C53895h.m60466d(this.f28717s, (C66212f) null, (C53934p0) null, new C9087p2(this, (C15601d<? super C9087p2>) null), 3, (Object) null);
    }

    /* renamed from: c */
    public final void mo9909c() {
        C12925w wVar = this.f28716r;
        if (wVar != null) {
            wVar.mo5085n();
        }
        this.f28716r = null;
        this.f28707B = false;
    }

    /* renamed from: d */
    public final void mo9910d(C45795b bVar, boolean z, C12677tg.C12678a aVar) {
        String str;
        C45795b bVar2 = bVar;
        boolean z2 = z;
        C12677tg.C12678a aVar2 = aVar;
        C87412m.m108594g(bVar2, "business");
        C87412m.m108594g(aVar2, "fromScene");
        this.f28721w = bVar2;
        this.f28722x = z2;
        this.f28723y = aVar2 == C12677tg.C12678a.GIFT_PANEL;
        this.f28724z = aVar2;
        Class cls = C54116w.class;
        Class cls2 = C0696x.class;
        C58969q b = C58961d.f168673a.mo84155b(((C54991o) bVar2.mo71262a(C54991o.class)).f154345o);
        TextView textView = this.f28712n;
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = this.f28709h.getContext();
        Context context2 = this.f28709h.getContext();
        Object[] objArr = new Object[2];
        String str2 = "";
        objArr[0] = b != null ? b.getNickname() : str2;
        C50326ly0 ly02 = ((C0696x) bVar2.mo71262a(cls2)).f1644g;
        if (!(ly02 == null || (str = ly02.f137706d) == null)) {
            str2 = str;
        }
        objArr[1] = str2;
        textView.setText(hVar.yp0(context, context2.getString(C0966R.string.dlj, objArr), this.f28712n.getTextSize()));
        TextView textView2 = this.f28714p;
        Context context3 = this.f28709h.getContext();
        Object[] objArr2 = new Object[1];
        C50326ly0 ly03 = ((C0696x) bVar2.mo71262a(cls2)).f1644g;
        objArr2[0] = Integer.valueOf(ly03 != null ? ly03.f137708f : 0);
        textView2.setText(context3.getString(C0966R.string.dlq, objArr2));
        C62042e eVar = C62042e.f176370a;
        boolean K0 = eVar.mo87018K0(bVar2);
        this.f28706A = K0;
        if (K0) {
            if (z2) {
                View view = this.f28713o;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view3 = this.f28713o;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f28715q.setText(getContext().getString(C0966R.string.f360568dm3));
            ((C54116w) C86312j.m106911c(cls)).Xx0(C54067f0.C0069t0.JOIN_PANEL_EXP, Boolean.valueOf(z), this.f28724z);
        } else {
            if (z2) {
                View view5 = this.f28713o;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view7 = this.f28713o;
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar6.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "setContent", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f28715q.setText(getContext().getString(C0966R.string.f360567dm2));
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.Yx0((C54116w) c, C54067f0.C0069t0.FOLLOW_JOIN_EXP, (Boolean) null, this.f28724z, 2, (Object) null);
        }
        C12925w wVar = new C12925w(getContext());
        View view9 = this.f28709h;
        C87412m.m108593f(view9, "root");
        eVar.mo87010H1(view9);
        wVar.mo12471k(this.f28709h);
        wVar.f36921B.setBackgroundResource(C0966R.C0969drawable.az7);
        wVar.mo5086o();
        this.f28716r = wVar;
    }

    public final C45795b getBuContext() {
        return this.f28721w;
    }

    public final C32226l<Boolean, C13598b0> getDirectJoinListener() {
        return this.f28719u;
    }

    public final boolean getFollow() {
        return this.f28706A;
    }

    public final boolean getFromGiftPanel() {
        return this.f28723y;
    }

    public final C12677tg.C12678a getFromScene() {
        return this.f28724z;
    }

    public final C32224a<C13598b0> getHelpClickListener() {
        return this.f28720v;
    }

    public final C32226l<C12677tg.C12678a, C13598b0> getJoinClickListener() {
        return this.f28718t;
    }

    public final boolean getNeedPurcahse() {
        return this.f28722x;
    }

    public final boolean getTryFollowing() {
        return this.f28707B;
    }

    public void onClick(View view) {
        C13598b0 b0Var;
        String str;
        boolean z;
        C64414h71 h712;
        C54795n5 D0;
        long j;
        C64273c21 c212;
        View view2 = view;
        Class cls = C54116w.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view2 != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.csn) {
            mo9909c();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.csl) {
            C32224a<C13598b0> aVar = this.f28720v;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.fec) {
            C58739j4 j4Var = C58739j4.f168176a;
            if (j4Var.mo83683L()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (this.f28706A) {
                ((C54116w) C86312j.m106911c(cls)).Xx0(C54067f0.C0069t0.JOIN_PANEL_CLICK, Boolean.valueOf(this.f28722x), this.f28724z);
                mo9908b();
            } else {
                ((C54116w) C86312j.m106911c(cls)).Xx0(C54067f0.C0069t0.FOLLOW_JOIN_CLICK, Boolean.valueOf(this.f28722x), this.f28724z);
                Class cls2 = C55001u.class;
                C45795b bVar = this.f28721w;
                if (bVar != null && ((C0654b) bVar.mo71262a(C0654b.class)).f1544f) {
                    C45795b bVar2 = this.f28721w;
                    if (bVar2 != null) {
                        C62042e eVar = C62042e.f176370a;
                        Context context = getContext();
                        C87412m.m108593f(context, "context");
                        eVar.mo87002F(context, bVar2, C9102r2.f28684d);
                    }
                } else {
                    C58961d.C58963b bVar3 = C58961d.f168673a;
                    C45795b bVar4 = this.f28721w;
                    C58969q b = bVar3.mo84155b(bVar4 != null ? ((C54991o) bVar4.mo71262a(C54991o.class)).f154345o : null);
                    if (b != null) {
                        boolean Q = j4Var.mo83688Q(b);
                        boolean I = j4Var.mo83680I(b);
                        String O5 = C66785b.f191882e.mo90662O5();
                        C45795b bVar5 = this.f28721w;
                        long j2 = bVar5 != null ? ((C55001u) bVar5.mo71262a(cls2)).f154416j : 0;
                        Log.m105924i("FinderLiveFansClubDescWidget", "doFollowLogic, nickName:" + b.getNickname() + ", objectId:" + j2 + ", participantFinderUsername:" + O5 + ", isPrivate:" + Q + " , isBlock" + I);
                        C7335d c = C86312j.m106911c(C64916p1.class);
                        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                        C64916p1 p1Var = (C64916p1) c;
                        C39818r rVar = C39818r.f106831a;
                        Context context2 = this.f28709h.getContext();
                        long j3 = j2;
                        C87412m.m108593f(context2, "root.context");
                        C49712hj1 q3 = ((C60172g4) rVar.mo62443b(context2).mo62447c(C60172g4.class)).mo12861q3();
                        String username = b.getUsername();
                        C62660c basePlugin = getBasePlugin();
                        if (basePlugin == null || (D0 = basePlugin.mo14476D0()) == null) {
                            str = O5;
                            z = Q;
                            h712 = null;
                        } else {
                            C45795b bVar6 = this.f28721w;
                            if (bVar6 == null || (c212 = ((C55001u) bVar6.mo71262a(cls2)).f154420q) == null) {
                                str = O5;
                                z = Q;
                                j = 0;
                            } else {
                                str = O5;
                                z = Q;
                                j = c212.f182392d;
                            }
                            h712 = D0.mo75732e0(j);
                        }
                        C64916p1.C64917a.m76440g(p1Var, q3, username, 1, j3, z, str, h712, (Integer) null, (Integer) null, 384, (Object) null);
                        if (I) {
                            String username2 = b.getUsername();
                            Log.m105924i("FinderLiveFansClubDescWidget", "[doBlockOpLog] ");
                            this.f28708C = new C9095q2();
                            ((C3601l1) C86312j.m106911c(C3601l1.class)).Hu0(username2, false, this.f28708C);
                        }
                        this.f28707B = true;
                        b0Var = C13598b0.f38549a;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var == null) {
                        Log.m105924i("FinderLiveFansClubDescWidget", "doFollowLogic anchorContact is null!");
                        C76912y0.m92767f(getContext(), getContext().getString(C0966R.string.dlb));
                        this.f28707B = false;
                    }
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubDescWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setBuContext(C45795b bVar) {
        this.f28721w = bVar;
    }

    public final void setDirectJoinListener(C32226l<? super Boolean, C13598b0> lVar) {
        this.f28719u = lVar;
    }

    public final void setFollow(boolean z) {
        this.f28706A = z;
    }

    public final void setFromGiftPanel(boolean z) {
        this.f28723y = z;
    }

    public final void setFromScene(C12677tg.C12678a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f28724z = aVar;
    }

    public final void setHelpClickListener(C32224a<C13598b0> aVar) {
        this.f28720v = aVar;
    }

    public final void setJoinClickListener(C32226l<? super C12677tg.C12678a, C13598b0> lVar) {
        this.f28718t = lVar;
    }

    public final void setNeedPurcahse(boolean z) {
        this.f28722x = z;
    }

    public final void setTryFollowing(boolean z) {
        this.f28707B = z;
    }
}
