package com.tencent.p014mm.plugin.finder.live.view;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import al1.C54130j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54795n5;
import cl1.C54963d0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import il1.C60394f1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import o40.C61926c;
import org.json.JSONObject;
import qk1.C63203e;
import rx3.C13598b0;
import zp3.C23555k;
import zp3.C23564m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019B!\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView;", "Lcom/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkView;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "v", "Lrx3/b0;", "onClick", "Lcom/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView$c;", "value", "p", "Lcom/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView$c;", "getOnAnchorApplyListListener", "()Lcom/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView$c;", "setOnAnchorApplyListListener", "(Lcom/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView$c;)V", "onAnchorApplyListListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "c", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveApplyLinkAnchorView */
public final class FinderLiveApplyLinkAnchorView extends FinderLiveApplyLinkView implements View.OnClickListener {

    /* renamed from: r */
    public static final /* synthetic */ int f159572r = 0;

    /* renamed from: e */
    public final View f159573e;

    /* renamed from: f */
    public final View f159574f;

    /* renamed from: g */
    public final RecyclerView f159575g;

    /* renamed from: h */
    public final View f159576h;

    /* renamed from: i */
    public final View f159577i;

    /* renamed from: j */
    public final View f159578j;

    /* renamed from: n */
    public final C63203e f159579n;

    /* renamed from: o */
    public final ArrayList<C54130j> f159580o;

    /* renamed from: p */
    public C55975c f159581p;

    /* renamed from: q */
    public final C60394f1 f159582q;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveApplyLinkAnchorView$a */
    public static final class C55973a extends C87413o implements C32226l<C54130j, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveApplyLinkAnchorView f159583d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55973a(FinderLiveApplyLinkAnchorView finderLiveApplyLinkAnchorView) {
            super(1);
            this.f159583d = finderLiveApplyLinkAnchorView;
        }

        public Object invoke(Object obj) {
            C54130j jVar = (C54130j) obj;
            C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
            C55975c onAnchorApplyListListener = this.f159583d.getOnAnchorApplyListListener();
            if (onAnchorApplyListListener != null) {
                onAnchorApplyListListener.mo77781a(jVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveApplyLinkAnchorView$b */
    public static final class C55974b extends C23555k.C23562d {
        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (z) {
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C54067f0 f0Var = C54108o.f151869h;
                ((C54108o) c).Kx0(11, (String) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveApplyLinkAnchorView$c */
    public interface C55975c {
        /* renamed from: a */
        void mo77781a(C54130j jVar);

        /* renamed from: b */
        void mo77782b();

        /* renamed from: c */
        void mo77783c();

        /* renamed from: d */
        void mo77784d();

        /* renamed from: e */
        void mo77785e();

        /* renamed from: f */
        void mo77786f();

        /* renamed from: g */
        void mo77787g();

        /* renamed from: h */
        void mo77788h();
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveApplyLinkAnchorView$d */
    public static final class C55976d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C45795b f159584d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveApplyLinkAnchorView f159585e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55976d(C45795b bVar, FinderLiveApplyLinkAnchorView finderLiveApplyLinkAnchorView) {
            super(0);
            this.f159584d = bVar;
            this.f159585e = finderLiveApplyLinkAnchorView;
        }

        public Object invoke() {
            ArrayList arrayList;
            Class cls = C54963d0.class;
            int i = FinderLiveApplyLinkAnchorView.f159572r;
            StringBuilder sb = new StringBuilder();
            sb.append("onTimerUpdateData linkMicVisitorUserList:");
            C45795b bVar = this.f159584d;
            sb.append(bVar != null ? ((C54963d0) bVar.mo71262a(cls)).f154071n : null);
            Log.m105924i("Finder.FinderLiveApplyLinkAnchorView", sb.toString());
            C45795b bVar2 = this.f159584d;
            if (bVar2 != null) {
                FinderLiveApplyLinkAnchorView finderLiveApplyLinkAnchorView = this.f159585e;
                if (((C54963d0) bVar2.mo71262a(cls)).f154073p != null) {
                    finderLiveApplyLinkAnchorView.mo77778m();
                } else {
                    View view = finderLiveApplyLinkAnchorView.f159577i;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView", "hideBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView", "hideBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderLiveApplyLinkAnchorView.f159582q.f172199a.setVisibility(8);
                    finderLiveApplyLinkAnchorView.f159580o.clear();
                    ArrayList<C54130j> arrayList2 = finderLiveApplyLinkAnchorView.f159580o;
                    List<C54130j> list = ((C54963d0) bVar2.mo71262a(cls)).f154071n;
                    C87412m.m108593f(list, "liveData.business(LiveLi…ass.java).linkMicUserList");
                    synchronized (list) {
                        arrayList = new ArrayList();
                        for (T next : list) {
                            if (((C54130j) next).f152004h) {
                                arrayList.add(next);
                            }
                        }
                    }
                    arrayList2.addAll(arrayList);
                    ArrayList<C54130j> arrayList3 = finderLiveApplyLinkAnchorView.f159580o;
                    if (arrayList3 == null || arrayList3.isEmpty()) {
                        View view2 = finderLiveApplyLinkAnchorView.f159576h;
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(0);
                        View view3 = view2;
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView$onTimerUpdateData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView$onTimerUpdateData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        finderLiveApplyLinkAnchorView.f159575g.setVisibility(8);
                        View view4 = finderLiveApplyLinkAnchorView.f159578j;
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(8);
                        View view5 = view4;
                        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView$onTimerUpdateData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView$onTimerUpdateData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        finderLiveApplyLinkAnchorView.f159575g.setVisibility(0);
                        View view6 = finderLiveApplyLinkAnchorView.f159576h;
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(8);
                        View view7 = view6;
                        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView$onTimerUpdateData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView$onTimerUpdateData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view8 = finderLiveApplyLinkAnchorView.f159578j;
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(0);
                        View view9 = view8;
                        C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView$onTimerUpdateData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView$onTimerUpdateData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        finderLiveApplyLinkAnchorView.f159579n.mo88115c(finderLiveApplyLinkAnchorView.f159580o);
                        finderLiveApplyLinkAnchorView.f159579n.notifyDataSetChanged();
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveApplyLinkAnchorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C63203e eVar = new C63203e();
        this.f159579n = eVar;
        this.f159580o = new ArrayList<>();
        View.inflate(context, C0966R.C0971layout.adz, this);
        View findViewById = findViewById(C0966R.C0970id.n6f);
        C87412m.m108593f(findViewById, "findViewById(R.id.cell_bg)");
        this.f159578j = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.dc9);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder…_link_list_search_layout)");
        this.f159573e = findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.dc7);
        C87412m.m108593f(findViewById3, "findViewById(R.id.finder…_link_list_random_layout)");
        this.f159574f = findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.dbd);
        C87412m.m108593f(findViewById4, "findViewById(R.id.finder…list_anchor_content_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById4;
        this.f159575g = recyclerView;
        View findViewById5 = findViewById(C0966R.C0970id.dbi);
        C87412m.m108593f(findViewById5, "findViewById(R.id.finder…k_list_anchor_empty_view)");
        TextView textView = (TextView) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.dbh);
        C87412m.m108593f(findViewById6, "findViewById(R.id.finder…_list_anchor_empty_group)");
        this.f159576h = findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.dbp);
        C87412m.m108593f(findViewById7, "findViewById(R.id.finder…_link_list_content_group)");
        this.f159577i = findViewById7;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(eVar);
        eVar.f179329f = new C55973a(this);
        findViewById2.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        C23564m.m28138h(findViewById3, new C55974b());
        View findViewById8 = findViewById(C0966R.C0970id.f358102df1);
        C87412m.m108593f(findViewById8, "findViewById(R.id.finder…ive_battle_panel_ui_root)");
        this.f159582q = new C60394f1((ViewGroup) findViewById8);
    }

    /* renamed from: b */
    public void mo77768b() {
        if (this.f159582q.f172199a.getVisibility() == 0) {
            this.f159582q.mo85371c();
        }
    }

    /* renamed from: c */
    public void mo77769c(int i) {
        C60394f1 f1Var = this.f159582q;
        f1Var.f172207i.setVisibility(8);
        if (f1Var.f172199a.getVisibility() == 0) {
            f1Var.mo85370b();
        }
    }

    /* renamed from: d */
    public void mo77770d(int i) {
        mo77778m();
        C60394f1 f1Var = this.f159582q;
        f1Var.f172207i.setVisibility(8);
        if (f1Var.f172199a.getVisibility() == 0) {
            f1Var.mo85370b();
        }
    }

    /* renamed from: e */
    public void mo77771e(C45795b bVar, C54795n5 n5Var) {
        ArrayList arrayList;
        C45795b bVar2 = bVar;
        Class cls = C54963d0.class;
        StringBuilder sb = new StringBuilder();
        sb.append("onBind anchorLinkMicUserList:");
        sb.append(bVar2 != null ? ((C54963d0) bVar2.mo71262a(cls)).f154071n : null);
        Log.m105924i("Finder.FinderLiveApplyLinkAnchorView", sb.toString());
        this.f159579n.f179330g = bVar2;
        this.f159582q.f172208j = bVar2;
        if (bVar2 != null) {
            this.f159580o.clear();
            ArrayList<C54130j> arrayList2 = this.f159580o;
            List<C54130j> list = ((C54963d0) bVar2.mo71262a(cls)).f154071n;
            C87412m.m108593f(list, "liveData.business(LiveLi…ass.java).linkMicUserList");
            synchronized (list) {
                arrayList = new ArrayList();
                for (T next : list) {
                    if (((C54130j) next).f152004h) {
                        arrayList.add(next);
                    }
                }
            }
            arrayList2.addAll(arrayList);
            ArrayList<C54130j> arrayList3 = this.f159580o;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                View view = this.f159576h;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView", "onBind", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveAssistant;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView", "onBind", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveAssistant;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f159575g.setVisibility(8);
                View view2 = this.f159578j;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView", "onBind", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveAssistant;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView", "onBind", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveAssistant;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            this.f159575g.setVisibility(0);
            View view4 = this.f159576h;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView", "onBind", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveAssistant;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView", "onBind", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveAssistant;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view6 = this.f159578j;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView", "onBind", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveAssistant;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView", "onBind", "(Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveAssistant;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f159579n.mo88115c(this.f159580o);
            this.f159579n.notifyDataSetChanged();
        }
    }

    /* renamed from: g */
    public void mo77772g(boolean z, int i) {
    }

    public final C55975c getOnAnchorApplyListListener() {
        return this.f159581p;
    }

    /* renamed from: h */
    public void mo77774h(long j) {
    }

    /* renamed from: j */
    public void mo77775j() {
    }

    /* renamed from: k */
    public void mo77776k(boolean z, C54130j jVar) {
    }

    /* renamed from: l */
    public void mo77777l(C45795b bVar) {
        C61926c.m72668M(new C55976d(bVar, this));
    }

    /* renamed from: m */
    public void mo77778m() {
        View view = this.f159577i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView", "showBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView", "showBattlePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C60394f1 f1Var = this.f159582q;
        f1Var.f172199a.setVisibility(0);
        f1Var.mo85370b();
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C0073g0 g0Var = C0073g0.ANCHOR_BATTLE;
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("type", 1);
        C13598b0 b0Var = C13598b0.f38549a;
        C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
    }

    public void onClick(View view) {
        C55975c cVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dc9) {
            C55975c cVar2 = this.f159581p;
            if (cVar2 != null) {
                cVar2.mo77784d();
            }
        } else if (!(valueOf == null || valueOf.intValue() != C0966R.C0970id.dc7 || (cVar = this.f159581p) == null)) {
            cVar.mo77788h();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkAnchorView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setOnAnchorApplyListListener(C55975c cVar) {
        this.f159582q.f172209k = cVar;
        this.f159581p = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveApplyLinkAnchorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
