package ve1;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.C54219z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0735h;
import cm1.C0737h2;
import cm1.C0755n0;
import cm1.C55014f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView;
import com.tencent.p014mm.protocal.protobuf.FinderTipsShowEntranceExtInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import jq3.C60896i;
import jq3.C60905o;
import o40.C61926c;
import org.json.JSONObject;
import pe3.C89349b;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64186f0;
import te3.C64586nn1;
import te3.C64858yi1;
import zp3.C79406f;

/* renamed from: ve1.n2 */
public final class C14576n2 extends C60896i<C0755n0> {

    /* renamed from: e */
    public final FinderTimelinePresenter f40379e;

    /* renamed from: f */
    public final C14706z2 f40380f = new C14706z2();

    /* renamed from: g */
    public final C14710z6 f40381g = new C14710z6();

    /* renamed from: h */
    public final C14670w f40382h = new C14670w();

    /* renamed from: i */
    public C60905o f40383i;

    /* renamed from: j */
    public C60905o f40384j;

    /* renamed from: n */
    public Runnable f40385n;

    /* renamed from: o */
    public final MMHandler f40386o = new MMHandler(Looper.getMainLooper());

    /* renamed from: p */
    public FinderHomeTabRedDotTipsBubbleView f40387p;

    /* renamed from: ve1.n2$a */
    public static final class C14577a extends RecyclerView.C0130p {

        /* renamed from: d */
        public final LinearLayoutManager f40388d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f40389e;

        /* renamed from: f */
        public final /* synthetic */ C14576n2 f40390f;

        public C14577a(RecyclerView recyclerView, C60905o oVar, C14576n2 n2Var) {
            this.f40389e = oVar;
            this.f40390f = n2Var;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            this.f40388d = (LinearLayoutManager) layoutManager;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$onCreateViewHolder$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C0755n0 n0Var = (C0755n0) this.f40389e.f173503E;
                int i2 = n0Var.f1779g.f1760b;
                if (!(i2 == -1 || i2 == this.f40388d.mo16957C())) {
                    n0Var.f1779g.f1759a = -1;
                    FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView = this.f40390f.f40387p;
                    if (finderHomeTabRedDotTipsBubbleView != null) {
                        boolean z = FinderHomeTabRedDotTipsBubbleView.f17793h;
                        finderHomeTabRedDotTipsBubbleView.mo4563a(true);
                    }
                }
            } else if (i == 1) {
                C0737h2 h2Var = ((C0755n0) this.f40389e.f173503E).f1779g;
                if (h2Var.f1760b == -1 && h2Var.f1759a == 1) {
                    h2Var.f1760b = this.f40388d.mo16957C();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$onCreateViewHolder$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$onCreateViewHolder$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullMergedHeaderConvert$onCreateViewHolder$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C14576n2(FinderTimelinePresenter finderTimelinePresenter) {
        C87412m.m108594g(finderTimelinePresenter, "presenter");
        this.f40379e = finderTimelinePresenter;
    }

    /* renamed from: j */
    public static final JSONObject m13888j(C14576n2 n2Var, String str) {
        String str2;
        Object obj;
        C64858yi1 yi12;
        n2Var.getClass();
        JSONObject jSONObject = new JSONObject();
        C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77227G5(str);
        byte[] bArr = null;
        C64586nn1 o2 = G5 != null ? G5.mo77308o2(str) : null;
        String str3 = "";
        if (o2 == null || (str2 = o2.f184504f) == null) {
            str2 = str3;
        }
        jSONObject.put("wording", str2);
        String str4 = G5 != null ? G5.field_tipsId : null;
        if (str4 != null) {
            str3 = str4;
        }
        jSONObject.put("tipsid", str3);
        if (!(G5 == null || (yi12 = G5.f158585F) == null)) {
            jSONObject.put("feedid", C61926c.m72691p(yi12.f186549g));
        }
        if ((o2 != null ? o2.f184510o : null) != null && o2.f184509n == 1) {
            FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = new FinderTipsShowEntranceExtInfo();
            C89349b bVar = o2.f184510o;
            if (bVar != null) {
                bArr = bVar.mo123703f();
            }
            finderTipsShowEntranceExtInfo.parseFrom(bArr);
            String str5 = finderTipsShowEntranceExtInfo.username;
            if (str5 == null || str5.length() == 0) {
                LinkedList<String> linkedList = finderTipsShowEntranceExtInfo.multi_username;
                C87412m.m108593f(linkedList, "ext.multi_username");
                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (String str6 : linkedList) {
                    arrayList.add(str6 + '|');
                }
                if (!arrayList.isEmpty()) {
                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (!C87412m.m108589b((String) listIterator.previous(), "|")) {
                                obj = C110818d0.m150947s0(arrayList, listIterator.nextIndex() + 1);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                obj = C64186f0.f181907d;
                jSONObject.put("friendusername", obj);
            } else {
                jSONObject.put("friendusername", String.valueOf(finderTipsShowEntranceExtInfo.username));
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6242g;
    }

    /* renamed from: d */
    public void mo2292d(RecyclerView recyclerView, WxRecyclerAdapter<?> wxRecyclerAdapter) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(wxRecyclerAdapter, "adapter");
        super.mo2292d(recyclerView, wxRecyclerAdapter);
        this.f40381g.mo2292d(recyclerView, wxRecyclerAdapter);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        int a = C79406f.m96347a(recyclerView.getContext(), 6.0f);
        LayoutInflater b = C85868k2.m106137b(oVar.f173499A);
        this.f40380f.getClass();
        View view = oVar.f44854d;
        C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        View inflate = b.inflate(C0966R.C0971layout.f6244i, (ViewGroup) view, false);
        LayoutInflater b2 = C85868k2.m106137b(oVar.f173499A);
        this.f40381g.getClass();
        View view2 = oVar.f44854d;
        C87412m.m108592e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        View inflate2 = b2.inflate(C0966R.C0971layout.f6245j, (ViewGroup) view2, false);
        View findViewById = inflate.findViewById(C0966R.C0970id.f358781h20);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = a;
            layoutParams2.bottomMargin = a;
            findViewById.setBackgroundResource(C0966R.C0969drawable.f5002tn);
        }
        View findViewById2 = inflate2.findViewById(C0966R.C0970id.f358781h20);
        if (findViewById2 != null) {
            ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.topMargin = a;
            layoutParams4.bottomMargin = a;
            findViewById2.setBackgroundResource(C0966R.C0969drawable.f5002tn);
        }
        View view3 = oVar.f44854d;
        C87412m.m108592e(view3, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view3).addView(inflate);
        View view4 = oVar.f44854d;
        C87412m.m108592e(view4, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view4).addView(inflate2);
        if (this.f40379e.f13272p == 4) {
            Context context = oVar.f173499A;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            MMActivity mMActivity = (MMActivity) context;
            if (this.f40387p == null) {
                ViewParent parent = mMActivity.findViewById(C0966R.C0970id.l89).getParent();
                FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
                if (frameLayout != null) {
                    C8477a0 a0Var = new C8477a0();
                    C8479f0 f0Var = new C8479f0();
                    C54219z<C2479n0.C2480a> zVar = C2479n0.f12969o;
                    Context context2 = oVar.f173499A;
                    C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    C61926c.m72695t(zVar, (MMActivity) context2, new C14541i2(a0Var, mMActivity, f0Var, this));
                    C8477a0 a0Var2 = new C8477a0();
                    C8479f0 f0Var2 = new C8479f0();
                    C54219z<C2479n0.C2480a> zVar2 = C2479n0.f12968n;
                    Context context3 = oVar.f173499A;
                    C87412m.m108592e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    C61926c.m72695t(zVar2, (MMActivity) context3, new C14547j2(a0Var2, mMActivity, f0Var2, this));
                    FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView = new FinderHomeTabRedDotTipsBubbleView(mMActivity);
                    finderHomeTabRedDotTipsBubbleView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    frameLayout.addView(finderHomeTabRedDotTipsBubbleView);
                    finderHomeTabRedDotTipsBubbleView.setVisibilityListener(new C14556k2(finderHomeTabRedDotTipsBubbleView, this, oVar));
                    finderHomeTabRedDotTipsBubbleView.mo4563a(false);
                    mo13819l(oVar, false, false);
                    this.f40387p = finderHomeTabRedDotTipsBubbleView;
                }
            }
            recyclerView.mo17043c(new C14577a(recyclerView, oVar, this));
        }
        C60905o oVar2 = new C60905o(inflate);
        oVar2.f173504F = recyclerView;
        this.f40383i = oVar2;
        C60905o oVar3 = new C60905o(inflate2);
        oVar3.f173504F = recyclerView;
        this.f40384j = oVar3;
        C14706z2 z2Var = this.f40380f;
        C60905o oVar4 = this.f40383i;
        if (oVar4 != null) {
            z2Var.mo45f(recyclerView, oVar4, -5);
            C14710z6 z6Var = this.f40381g;
            C60905o oVar5 = this.f40384j;
            if (oVar5 != null) {
                z6Var.mo45f(recyclerView, oVar5, -6);
            } else {
                C87412m.m108603p("privateMsgNotifyHolder");
                throw null;
            }
        } else {
            C87412m.m108603p("feedMsgNotifyHolder");
            throw null;
        }
    }

    /* renamed from: g */
    public void mo2296g(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        this.f173479d = false;
        this.f40386o.removeCallbacksAndMessages((Object) null);
        C14710z6 z6Var = this.f40381g;
        z6Var.getClass();
        z6Var.f173479d = false;
    }

    /* renamed from: k */
    public void mo44e(C60905o oVar, C0755n0 n0Var, int i, int i2, boolean z, List<Object> list) {
        C60905o oVar2 = oVar;
        C0755n0 n0Var2 = n0Var;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(n0Var2, "item");
        C60905o oVar3 = this.f40383i;
        if (oVar3 != null) {
            C0735h hVar = n0Var2.f1776d;
            oVar3.f173503E = hVar;
            C60905o oVar4 = this.f40384j;
            if (oVar4 != null) {
                oVar4.f173503E = n0Var2.f1777e;
                this.f40380f.mo44e(oVar3, hVar, i, -5, z, list);
                C14710z6 z6Var = this.f40381g;
                C60905o oVar5 = this.f40384j;
                if (oVar5 != null) {
                    z6Var.mo44e(oVar5, n0Var2.f1777e, i, -6, z, list);
                    View view = oVar2.f44854d;
                    C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) view;
                    HashSet hashSet = new HashSet();
                    int childCount = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        if (childAt.getId() == C0966R.C0970id.bjm) {
                            hashSet.add(childAt);
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        viewGroup.removeView((View) it.next());
                    }
                    int a = C79406f.m96347a(viewGroup.getContext(), 6.0f);
                    for (C55014f fVar : n0Var2.f1778f) {
                        if (fVar.f154477f != 1) {
                            LayoutInflater b = C85868k2.m106137b(oVar2.f173499A);
                            this.f40382h.getClass();
                            View inflate = b.inflate(C0966R.C0971layout.f6243h, viewGroup, false);
                            View findViewById = inflate.findViewById(C0966R.C0970id.f358781h20);
                            if (findViewById != null) {
                                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                layoutParams2.topMargin = a;
                                layoutParams2.bottomMargin = a;
                                findViewById.setBackgroundResource(C0966R.C0969drawable.f5002tn);
                            }
                            View view2 = oVar2.f44854d;
                            C87412m.m108592e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
                            ((ViewGroup) view2).addView(inflate);
                            C60905o oVar6 = new C60905o(inflate);
                            oVar6.f173504F = oVar.mo85811C();
                            oVar6.f173503E = fVar;
                            C14670w wVar = this.f40382h;
                            RecyclerView C = oVar6.mo85811C();
                            C87412m.m108593f(C, "h.recyclerView");
                            wVar.mo45f(C, oVar6, -4);
                            this.f40382h.mo44e(oVar6, fVar, i, -4, z, list);
                        }
                    }
                    int i4 = n0Var2.f1779g.f1759a;
                    if (i4 == 1) {
                        FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView = this.f40387p;
                        if (finderHomeTabRedDotTipsBubbleView != null) {
                            finderHomeTabRedDotTipsBubbleView.setVisibility(4);
                            finderHomeTabRedDotTipsBubbleView.mo4566d(n0Var2.f1779g.f1761c);
                            C61926c.m72676a(finderHomeTabRedDotTipsBubbleView, new C14566m2(this, finderHomeTabRedDotTipsBubbleView, n0Var2));
                        }
                    } else if (i4 == -1) {
                        FinderHomeTabRedDotTipsBubbleView finderHomeTabRedDotTipsBubbleView2 = this.f40387p;
                        if (finderHomeTabRedDotTipsBubbleView2 != null) {
                            boolean z2 = FinderHomeTabRedDotTipsBubbleView.f17793h;
                            finderHomeTabRedDotTipsBubbleView2.mo4563a(true);
                        }
                        mo13819l(oVar2, true, true);
                    } else if (i4 == -100) {
                        mo13819l(oVar2, true, true);
                    } else if (i4 == -200) {
                        mo13819l(oVar2, false, false);
                    }
                    View view3 = oVar2.f44854d;
                    C87412m.m108592e(view3, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup2 = (ViewGroup) view3;
                    int childCount2 = viewGroup2.getChildCount();
                    for (int i5 = 0; i5 < childCount2; i5++) {
                        View childAt2 = viewGroup2.getChildAt(i5);
                        View childAt3 = viewGroup2.getChildAt(i5);
                        if (childAt3 != null && childAt3.getVisibility() == 0) {
                            View findViewById2 = childAt2 != null ? childAt2.findViewById(C0966R.C0970id.f358781h20) : null;
                            if (findViewById2 != null && findViewById2.getVisibility() == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                C87412m.m108603p("privateMsgNotifyHolder");
                throw null;
            }
            C87412m.m108603p("privateMsgNotifyHolder");
            throw null;
        }
        C87412m.m108603p("feedMsgNotifyHolder");
        throw null;
    }

    /* renamed from: l */
    public final void mo13819l(C60905o oVar, boolean z, boolean z2) {
        Log.m105918d("Finder.FeedFullMergedHeaderConvert", "[setVisibleOtherBubble] isShow=" + z + " withAnim=" + z2);
        View view = oVar.f44854d;
        C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).animate().cancel();
            if (z2) {
                if (!z) {
                    viewGroup.animate().alpha(0.0f).setDuration(260).start();
                } else if (viewGroup.getAlpha() < 1.0f) {
                    viewGroup.animate().alpha(1.0f).setDuration(260).start();
                }
            } else if (z) {
                viewGroup.setAlpha(1.0f);
            } else {
                viewGroup.setAlpha(0.0f);
            }
        }
    }
}
