package com.tencent.p014mm.plugin.finder.live.view;

import al1.C27915k;
import al1.C54130j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54795n5;
import cl1.C54949c0;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import qk1.C63248p2;
import rx3.C13598b0;
import sx3.C36907w;
import sx3.C64197v;
import te3.C51887ww2;
import te3.C64273c21;

/* renamed from: com.tencent.mm.plugin.finder.live.view.l */
public final class C56081l extends FinderLiveApplyLinkView implements View.OnClickListener {

    /* renamed from: F */
    public static final /* synthetic */ int f159917F = 0;

    /* renamed from: A */
    public final C63248p2 f159918A;

    /* renamed from: B */
    public final C63248p2 f159919B;

    /* renamed from: C */
    public C45795b f159920C;

    /* renamed from: D */
    public C54795n5 f159921D;

    /* renamed from: E */
    public C56084d f159922E;

    /* renamed from: e */
    public final int f159923e = 100;

    /* renamed from: f */
    public final View f159924f;

    /* renamed from: g */
    public final EditText f159925g;

    /* renamed from: h */
    public final View f159926h;

    /* renamed from: i */
    public final View f159927i;

    /* renamed from: j */
    public final View f159928j;

    /* renamed from: n */
    public final WeImageView f159929n;

    /* renamed from: o */
    public final TextView f159930o;

    /* renamed from: p */
    public final RecyclerView f159931p;

    /* renamed from: q */
    public final RecyclerView f159932q;

    /* renamed from: r */
    public final TextView f159933r;

    /* renamed from: s */
    public final View f159934s;

    /* renamed from: t */
    public final View f159935t;

    /* renamed from: u */
    public final TextView f159936u;

    /* renamed from: v */
    public final View f159937v;

    /* renamed from: w */
    public final TextView f159938w;

    /* renamed from: x */
    public final TextView f159939x;

    /* renamed from: y */
    public final ArrayList<C54130j> f159940y = new ArrayList<>();

    /* renamed from: z */
    public final HashMap<String, C27915k> f159941z;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.l$c */
    public static final class C41469c implements View.OnClickListener {

        /* renamed from: d */
        public static final C41469c f111684d = new C41469c();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.l$e */
    public static final class C41470e extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C56081l f111685d;

        /* renamed from: e */
        public final /* synthetic */ float f111686e;

        public C41470e(C56081l lVar, float f) {
            this.f111685d = lVar;
            this.f111686e = f;
        }

        public void onAnimationCancel(Animator animator) {
            this.f111685d.f159924f.setTranslationX(this.f111686e);
            View view = this.f111685d.f159924f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView$hideSearchPanel$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView$hideSearchPanel$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationEnd(Animator animator) {
            this.f111685d.f159924f.setTranslationX(this.f111686e);
            View view = this.f111685d.f159924f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView$hideSearchPanel$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView$hideSearchPanel$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.l$h */
    public static final class C41471h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C56081l f111687d;

        public C41471h(C56081l lVar) {
            this.f111687d = lVar;
        }

        public final void run() {
            this.f111687d.f159925g.requestFocus();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.l$a */
    public static final class C56082a extends C87413o implements C32226l<C54130j, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56081l f159942d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56082a(C56081l lVar) {
            super(1);
            this.f159942d = lVar;
        }

        public Object invoke(Object obj) {
            C54130j jVar = (C54130j) obj;
            C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
            if (C56081l.m64025o(this.f159942d)) {
                C56081l lVar = this.f159942d;
                C56081l.m64024n(lVar, lVar.f159918A.mo88149F4(jVar), this.f159942d.f159918A, jVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.l$b */
    public static final class C56083b extends C87413o implements C32226l<C54130j, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56081l f159943d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56083b(C56081l lVar) {
            super(1);
            this.f159943d = lVar;
        }

        public Object invoke(Object obj) {
            C54130j jVar = (C54130j) obj;
            C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
            int F4 = this.f159943d.f159918A.mo88149F4(jVar);
            if (F4 != -1 && F4 < this.f159943d.f159918A.getItemCount()) {
                jVar.mo74949p();
                C45795b bVar = this.f159943d.f159920C;
                if (bVar != null) {
                    ((C54963d0) bVar.mo71262a(C54963d0.class)).mo75917Y3(jVar);
                }
                C56084d onVisitorApplyListListener = this.f159943d.getOnVisitorApplyListListener();
                if (onVisitorApplyListListener != null) {
                    onVisitorApplyListListener.mo78178c(jVar);
                }
                this.f159943d.f159918A.notifyItemChanged(F4);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.l$d */
    public interface C56084d {
        /* renamed from: a */
        void mo78176a(C54130j jVar);

        /* renamed from: b */
        void mo78177b();

        /* renamed from: c */
        void mo78178c(C54130j jVar);

        /* renamed from: d */
        void mo78179d();

        /* renamed from: e */
        void mo78180e();

        /* renamed from: f */
        void mo78181f(C54130j jVar);
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.l$f */
    public static final class C56085f extends C87413o implements C32226l<C54130j, Boolean> {

        /* renamed from: d */
        public static final C56085f f159944d = new C56085f();

        public C56085f() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
            if ((r6 == 3 || r6 == 4) == false) goto L_0x0027;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                al1.j r6 = (al1.C54130j) r6
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r6, r0)
                boolean r0 = r6.f152004h
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0026
                long r3 = r6.f152013q
                int r0 = (int) r3
                r3 = 2
                boolean r0 = o40.C61926c.m72696u(r0, r3)
                if (r0 != 0) goto L_0x0026
                int r6 = r6.f152008l
                r0 = 3
                if (r6 == r0) goto L_0x0022
                r0 = 4
                if (r6 != r0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r6 = 0
                goto L_0x0023
            L_0x0022:
                r6 = 1
            L_0x0023:
                if (r6 != 0) goto L_0x0026
                goto L_0x0027
            L_0x0026:
                r1 = 0
            L_0x0027:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56081l.C56085f.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.l$g */
    public static final class C56086g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56081l f159945d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56086g(C56081l lVar) {
            super(0);
            this.f159945d = lVar;
        }

        public Object invoke() {
            C61926c.m72668M(new C56102u(this.f159945d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.l$i */
    public static final class C56087i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C45795b f159946d;

        /* renamed from: e */
        public final /* synthetic */ C56081l f159947e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56087i(C45795b bVar, C56081l lVar) {
            super(0);
            this.f159946d = bVar;
            this.f159947e = lVar;
        }

        public Object invoke() {
            Class cls = C54963d0.class;
            int i = C56081l.f159917F;
            StringBuilder sb = new StringBuilder();
            sb.append("onTimerUpdateData linkMicVisitorUserList:");
            C45795b bVar = this.f159946d;
            sb.append(bVar != null ? ((C54963d0) bVar.mo71262a(cls)).f154071n : null);
            Log.m105924i("Finder.FinderLiveApplyLinkVisitorView", sb.toString());
            C45795b bVar2 = this.f159946d;
            if (bVar2 != null) {
                C54991o oVar = (C54991o) bVar2.mo71262a(C54991o.class);
                this.f159947e.mo78174v(((C54963d0) this.f159946d.mo71262a(cls)).f154048B.f144323d);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C56081l(android.view.View r8) {
        /*
            r7 = this;
            java.lang.String r0 = "root"
            gy3.C87412m.m108594g(r8, r0)
            android.content.Context r0 = r8.getContext()
            java.lang.String r1 = "root.context"
            gy3.C87412m.m108593f(r0, r1)
            r1 = 0
            r2 = 0
            r7.<init>(r0, r1, r2)
            r0 = 100
            r7.f159923e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.f159940y = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r7.f159941z = r0
            qk1.p2 r1 = new qk1.p2
            r1.<init>(r0, r2)
            r7.f159918A = r1
            qk1.p2 r2 = new qk1.p2
            r3 = 1
            r2.<init>(r0, r3)
            r7.f159919B = r2
            android.content.Context r0 = r7.getContext()
            r3 = 2131494760(0x7f0c0768, float:1.8613037E38)
            android.view.View.inflate(r0, r3, r7)
            r0 = 2131303026(0x7f091a72, float:1.8224155E38)
            android.view.View r0 = r7.findViewById(r0)
            java.lang.String r3 = "findViewById(R.id.finder…r_link_list_content_list)"
            gy3.C87412m.m108593f(r0, r3)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r7.f159932q = r0
            r3 = 2131303038(0x7f091a7e, float:1.822418E38)
            android.view.View r3 = r7.findViewById(r3)
            java.lang.String r4 = "findViewById(R.id.finder…nchor_link_list_empty_tv)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r7.f159933r = r3
            r3 = 2131312935(0x7f094127, float:1.8244253E38)
            android.view.View r3 = r7.findViewById(r3)
            java.lang.String r4 = "findViewById(R.id.search_layout)"
            gy3.C87412m.m108593f(r3, r4)
            r7.f159934s = r3
            r3 = 2131309228(0x7f0932ac, float:1.8236734E38)
            android.view.View r3 = r7.findViewById(r3)
            java.lang.String r4 = "findViewById(R.id.mic_search_right_icon)"
            gy3.C87412m.m108593f(r3, r4)
            r7.f159935t = r3
            r4 = 2131309230(0x7f0932ae, float:1.8236738E38)
            android.view.View r4 = r7.findViewById(r4)
            java.lang.String r5 = "findViewById(R.id.mic_total_nums)"
            gy3.C87412m.m108593f(r4, r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r7.f159936u = r4
            r4 = 2131303047(0x7f091a87, float:1.8224197E38)
            android.view.View r4 = r7.findViewById(r4)
            java.lang.String r5 = "findViewById(R.id.finder…_anchor_link_more_layout)"
            gy3.C87412m.m108593f(r4, r5)
            r7.f159937v = r4
            r5 = 2131307333(0x7f092b45, float:1.823289E38)
            android.view.View r5 = r7.findViewById(r5)
            java.lang.String r6 = "findViewById(R.id.link_mode_text)"
            gy3.C87412m.m108593f(r5, r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r7.f159938w = r5
            r5 = 2131307334(0x7f092b46, float:1.8232892E38)
            android.view.View r5 = r7.findViewById(r5)
            java.lang.String r6 = "findViewById(R.id.link_mode_text_tips)"
            gy3.C87412m.m108593f(r5, r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r7.f159939x = r5
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r6 = r7.getContext()
            r5.<init>(r6)
            r0.setLayoutManager(r5)
            r0.setAdapter(r1)
            com.tencent.mm.plugin.finder.live.view.l$a r0 = new com.tencent.mm.plugin.finder.live.view.l$a
            r0.<init>(r7)
            r1.f179476i = r0
            com.tencent.mm.plugin.finder.live.view.l$b r0 = new com.tencent.mm.plugin.finder.live.view.l$b
            r0.<init>(r7)
            r1.f179477j = r0
            r4.setOnClickListener(r7)
            r3.setOnClickListener(r7)
            r0 = 2131304249(0x7f091f39, float:1.8226635E38)
            android.view.View r0 = r8.findViewById(r0)
            java.lang.String r1 = "root.findViewById(R.id.f…rch_visitor_link_ui_root)"
            gy3.C87412m.m108593f(r0, r1)
            r7.f159924f = r0
            android.content.Context r1 = r8.getContext()
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r1)
            int r1 = r1.x
            float r1 = (float) r1
            r0.setTranslationX(r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.content.Context r8 = r8.getContext()
            android.graphics.Point r8 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r8)
            int r8 = r8.y
            int r8 = r8 * 2
            int r8 = r8 / 3
            r1.height = r8
            com.tencent.mm.plugin.finder.live.view.l$c r8 = com.tencent.p014mm.plugin.finder.live.view.C56081l.C41469c.f111684d
            r0.setOnClickListener(r8)
            r8 = 2131303032(0x7f091a78, float:1.8224167E38)
            android.view.View r8 = r0.findViewById(r8)
            java.lang.String r1 = "searchWidgetRoot.findVie…list_content_search_edit)"
            gy3.C87412m.m108593f(r8, r1)
            android.widget.EditText r8 = (android.widget.EditText) r8
            r7.f159925g = r8
            r1 = 2131303695(0x7f091d0f, float:1.8225512E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r3 = "searchWidgetRoot.findVie…te_anchor_link_close_btn)"
            gy3.C87412m.m108593f(r1, r3)
            r7.f159926h = r1
            r3 = 2131303034(0x7f091a7a, float:1.822417E38)
            android.view.View r3 = r0.findViewById(r3)
            java.lang.String r4 = "searchWidgetRoot.findVie…ontent_search_group_root)"
            gy3.C87412m.m108593f(r3, r4)
            r7.f159927i = r3
            r3 = 2131303033(0x7f091a79, float:1.8224169E38)
            android.view.View r3 = r0.findViewById(r3)
            java.lang.String r4 = "searchWidgetRoot.findVie…ist_content_search_group)"
            gy3.C87412m.m108593f(r3, r4)
            r7.f159928j = r3
            r3 = 2131303024(0x7f091a70, float:1.822415E38)
            android.view.View r3 = r0.findViewById(r3)
            java.lang.String r4 = "searchWidgetRoot.findVie…_list_content_clear_icon)"
            gy3.C87412m.m108593f(r3, r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r3
            r7.f159929n = r3
            r4 = 2131303031(0x7f091a77, float:1.8224165E38)
            android.view.View r4 = r0.findViewById(r4)
            java.lang.String r5 = "searchWidgetRoot.findVie…content_search_cancel_tv)"
            gy3.C87412m.m108593f(r4, r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r7.f159930o = r4
            r5 = 2131304417(0x7f091fe1, float:1.8226976E38)
            android.view.View r0 = r0.findViewById(r5)
            java.lang.String r5 = "searchWidgetRoot.findVie…live_visitor_search_list)"
            gy3.C87412m.m108593f(r0, r5)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r7.f159931p = r0
            com.tencent.mm.plugin.finder.live.view.n r0 = new com.tencent.mm.plugin.finder.live.view.n
            r0.<init>(r7)
            r4.setOnClickListener(r0)
            com.tencent.mm.plugin.finder.live.view.o r0 = new com.tencent.mm.plugin.finder.live.view.o
            r0.<init>(r7)
            r1.setOnClickListener(r0)
            com.tencent.mm.plugin.finder.live.view.p r0 = new com.tencent.mm.plugin.finder.live.view.p
            r0.<init>(r7)
            r3.setOnClickListener(r0)
            com.tencent.mm.plugin.finder.live.view.q r0 = new com.tencent.mm.plugin.finder.live.view.q
            r0.<init>(r7)
            r8.addTextChangedListener(r0)
            com.tencent.mm.plugin.finder.live.view.r r8 = new com.tencent.mm.plugin.finder.live.view.r
            r8.<init>(r7)
            r2.f179476i = r8
            com.tencent.mm.plugin.finder.live.view.s r8 = new com.tencent.mm.plugin.finder.live.view.s
            r8.<init>(r7)
            r2.f179477j = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56081l.<init>(android.view.View):void");
    }

    /* renamed from: n */
    public static final void m64024n(C56081l lVar, int i, RecyclerView.C16613e eVar, C54130j jVar) {
        lVar.getClass();
        if (i != -1 && i < eVar.getItemCount()) {
            jVar.mo74949p();
            C45795b bVar = lVar.f159920C;
            if (bVar != null) {
                ((C54963d0) bVar.mo71262a(C54963d0.class)).mo75917Y3(jVar);
            }
            C56084d dVar = lVar.f159922E;
            if (dVar != null) {
                dVar.mo78176a(jVar);
            }
            eVar.notifyItemChanged(i);
        }
    }

    /* renamed from: o */
    public static final boolean m64025o(C56081l lVar) {
        Class cls = C54949c0.class;
        C45795b bVar = lVar.f159920C;
        if (bVar != null) {
            if (!((C54949c0) bVar.mo71262a(cls)).mo75862c3(true)) {
                return false;
            }
            if ((((C54949c0) bVar.mo71262a(cls)).mo75865f3()) && ((C54963d0) bVar.mo71262a(C54963d0.class)).mo75906M3() >= 2) {
                C76912y0.makeText(lVar.getContext(), (CharSequence) lVar.getContext().getResources().getString(C0966R.string.ds7), 0).show();
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo77789a(int i) {
    }

    /* renamed from: e */
    public void mo77771e(C45795b bVar, C54795n5 n5Var) {
        ArrayList arrayList;
        boolean z;
        C64273c21 c212;
        C45795b bVar2 = bVar;
        Class cls = C54963d0.class;
        StringBuilder sb = new StringBuilder();
        sb.append("onBind linkMicUserList:");
        byte[] bArr = null;
        sb.append(bVar2 != null ? ((C54963d0) bVar2.mo71262a(cls)).f154071n : null);
        sb.append(' ');
        Log.m105924i("Finder.FinderLiveApplyLinkVisitorView", sb.toString());
        this.f159920C = bVar2;
        this.f159918A.f179478n = bVar2;
        this.f159919B.f179478n = bVar2;
        this.f159921D = n5Var;
        if (bVar2 != null) {
            C54991o oVar = (C54991o) bVar2.mo71262a(C54991o.class);
            mo78174v(((C54963d0) bVar2.mo71262a(cls)).f154048B.f144323d);
            this.f159940y.clear();
            ArrayList<C54130j> arrayList2 = this.f159940y;
            List<C54130j> list = ((C54963d0) bVar2.mo71262a(cls)).f154071n;
            C87412m.m108593f(list, "liveData.business(LiveLi…ass.java).linkMicUserList");
            synchronized (list) {
                arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (true ^ ((C54130j) next).f152004h) {
                        arrayList.add(next);
                    }
                }
            }
            arrayList2.addAll(arrayList);
            ArrayList<C54130j> arrayList3 = this.f159940y;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                z = false;
            }
            if (z) {
                mo78170r();
                return;
            }
            mo78169q();
            this.f159918A.mo88152c(this.f159940y);
            this.f159918A.notifyDataSetChanged();
            LinkedList linkedList = new LinkedList();
            ArrayList<C54130j> arrayList4 = this.f159940y;
            ArrayList arrayList5 = new ArrayList(C36907w.m41090l(arrayList4, 10));
            for (C54130j jVar : arrayList4) {
                String str = jVar.f151999c;
                if (str == null) {
                    str = "";
                }
                arrayList5.add(str);
            }
            linkedList.addAll(arrayList5);
            C56086g gVar = new C56086g(this);
            Class cls2 = C55001u.class;
            Log.m105924i("Finder.FinderLiveApplyLinkVisitorView", "loadApplyUserDescInfo usernameSize:" + linkedList.size());
            C54795n5 n5Var2 = this.f159921D;
            if (n5Var2 != null) {
                C45795b bVar3 = this.f159920C;
                long j = 0;
                long j2 = (bVar3 == null || (c212 = ((C55001u) bVar3.mo71262a(cls2)).f154420q) == null) ? 0 : c212.f182392d;
                C45795b bVar4 = this.f159920C;
                if (bVar4 != null) {
                    j = ((C55001u) bVar4.mo71262a(cls2)).f154416j;
                }
                long j3 = j;
                C45795b bVar5 = this.f159920C;
                String str2 = bVar5 != null ? ((C55001u) bVar5.mo71262a(cls2)).f154423t : null;
                C45795b bVar6 = this.f159920C;
                if (bVar6 != null) {
                    bArr = ((C55001u) bVar6.mo71262a(cls2)).f154417n;
                }
                n5Var2.mo75702F(j2, j3, str2, bArr, 1, linkedList, new C41477t(this, gVar));
            }
        }
    }

    /* renamed from: f */
    public void mo77790f() {
        this.f159932q.setAdapter(this.f159918A);
        this.f159918A.mo88152c(this.f159940y);
        this.f159918A.notifyDataSetChanged();
        ArrayList<C54130j> arrayList = this.f159940y;
        if (arrayList == null || arrayList.isEmpty()) {
            mo78170r();
        } else {
            mo78169q();
        }
    }

    /* renamed from: g */
    public void mo77772g(boolean z, int i) {
        Log.m105924i("Finder.FinderLiveApplyLinkVisitorView", "keyboardChange show:" + z + " height:" + i);
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.f159928j.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            int measuredWidth = this.f159930o.getMeasuredWidth();
            ViewGroup.LayoutParams layoutParams2 = this.f159930o.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd(), measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart()});
            ofInt.setDuration(300);
            ofInt.addUpdateListener(new C56104v(this));
            ofInt.addListener(new C56106w(this));
            ofInt.start();
            postDelayed(new C41471h(this), 100);
        }
    }

    public final C56084d getOnVisitorApplyListListener() {
        return this.f159922E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r2 = ((cl1.C54963d0) r2.mo71262a(r0)).f154048B;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo77774h(long r7) {
        /*
            r6 = this;
            java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onMicSettingChanged micSetting:["
            r1.append(r2)
            fj1.b r2 = r6.f159920C
            r3 = 0
            if (r2 == 0) goto L_0x0022
            androidx.lifecycle.i0 r2 = r2.mo71262a(r0)
            cl1.d0 r2 = (cl1.C54963d0) r2
            te3.ww2 r2 = r2.f154048B
            if (r2 == 0) goto L_0x0022
            long r4 = r2.f144323d
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto L_0x0023
        L_0x0022:
            r2 = r3
        L_0x0023:
            r1.append(r2)
            r2 = 58
            r1.append(r2)
            fj1.b r2 = r6.f159920C
            if (r2 == 0) goto L_0x003f
            androidx.lifecycle.i0 r0 = r2.mo71262a(r0)
            cl1.d0 r0 = (cl1.C54963d0) r0
            te3.ww2 r0 = r0.f154048B
            if (r0 == 0) goto L_0x003f
            long r2 = r0.f144324e
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
        L_0x003f:
            r1.append(r3)
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Finder.FinderLiveApplyLinkVisitorView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r6.mo78174v(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56081l.mo77774h(long):void");
    }

    /* renamed from: i */
    public void mo77792i(C45795b bVar) {
    }

    /* renamed from: j */
    public void mo77775j() {
        ArrayList arrayList;
        if (mo78173t()) {
            this.f159919B.notifyDataSetChanged();
            return;
        }
        C45795b bVar = this.f159920C;
        if (bVar != null) {
            this.f159940y.clear();
            ArrayList<C54130j> arrayList2 = this.f159940y;
            List<C54130j> list = ((C54963d0) bVar.mo71262a(C54963d0.class)).f154071n;
            C87412m.m108593f(list, "it.business(LiveLinkMicS…ass.java).linkMicUserList");
            synchronized (list) {
                arrayList = new ArrayList();
                for (T next : list) {
                    if (!((C54130j) next).f152004h) {
                        arrayList.add(next);
                    }
                }
            }
            arrayList2.addAll(arrayList);
            this.f159918A.mo88152c(this.f159940y);
        }
        this.f159918A.notifyDataSetChanged();
    }

    /* renamed from: k */
    public void mo77776k(boolean z, C54130j jVar) {
        if (jVar != null) {
            T t = null;
            if (z) {
                if (mo78173t()) {
                    ArrayList<C54130j> arrayList = this.f159919B.f179473f;
                    synchronized (arrayList) {
                        Iterator<T> it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (Util.isEqual(((C54130j) next).f151997a, jVar.f151997a)) {
                                t = next;
                                break;
                            }
                        }
                    }
                    C54130j jVar2 = (C54130j) t;
                    if (jVar2 != null) {
                        jVar2.f152008l = 0;
                    }
                    this.f159919B.mo88150G4(jVar);
                } else {
                    ArrayList<C54130j> arrayList2 = this.f159918A.f179473f;
                    synchronized (arrayList2) {
                        Iterator<T> it4 = arrayList2.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            T next2 = it4.next();
                            if (Util.isEqual(((C54130j) next2).f151997a, jVar.f151997a)) {
                                t = next2;
                                break;
                            }
                        }
                    }
                    C54130j jVar3 = (C54130j) t;
                    if (jVar3 != null) {
                        jVar3.f152008l = 0;
                    }
                    this.f159918A.mo88150G4(jVar);
                }
            } else if (mo78173t()) {
                int F4 = this.f159919B.mo88149F4(jVar);
                if (F4 != -1 && F4 < this.f159919B.getItemCount()) {
                    ArrayList<C54130j> arrayList3 = this.f159919B.f179473f;
                    synchronized (arrayList3) {
                        Iterator<T> it5 = arrayList3.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            T next3 = it5.next();
                            if (Util.isEqual(((C54130j) next3).f151997a, jVar.f151997a)) {
                                t = next3;
                                break;
                            }
                        }
                    }
                    C54130j jVar4 = (C54130j) t;
                    if (jVar4 != null) {
                        jVar4.mo74948o();
                    }
                    this.f159919B.notifyItemChanged(F4);
                }
            } else {
                int F42 = this.f159918A.mo88149F4(jVar);
                if (F42 != -1 && F42 < this.f159918A.getItemCount()) {
                    ArrayList<C54130j> arrayList4 = this.f159918A.f179473f;
                    synchronized (arrayList4) {
                        Iterator<T> it6 = arrayList4.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            T next4 = it6.next();
                            if (Util.isEqual(((C54130j) next4).f151997a, jVar.f151997a)) {
                                t = next4;
                                break;
                            }
                        }
                    }
                    C54130j jVar5 = (C54130j) t;
                    if (jVar5 != null) {
                        jVar5.mo74948o();
                    }
                    this.f159918A.notifyItemChanged(F42);
                }
            }
            C45795b bVar = this.f159920C;
            if (bVar != null) {
                ((C54963d0) bVar.mo71262a(C54963d0.class)).mo75917Y3(jVar);
            }
        }
    }

    /* renamed from: l */
    public void mo77777l(C45795b bVar) {
        C61926c.m72668M(new C56087i(bVar, this));
    }

    public void onClick(View view) {
        C56084d dVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.ok4) {
            C56084d dVar2 = this.f159922E;
            if (dVar2 != null) {
                dVar2.mo78180e();
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.omw) {
            this.f159931p.setLayoutManager(new LinearLayoutManager(getContext()));
            this.f159931p.setAdapter(this.f159919B);
            this.f159919B.notifyDataSetChanged();
            this.f159925g.postDelayed(new C41478x(this), 200);
            View view2 = this.f159924f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView", "showSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView", "showSearchPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f159924f.animate().translationX(0.0f).setListener((Animator.AnimatorListener) null).setDuration(200).start();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.ok5) {
            C56084d dVar3 = this.f159922E;
            if (dVar3 != null) {
                dVar3.mo78179d();
            }
        } else if (!(valueOf == null || valueOf.intValue() != C0966R.C0970id.ok6 || (dVar = this.f159922E) == null)) {
            dVar.mo78177b();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: p */
    public final void mo78168p(ArrayList<C54130j> arrayList) {
        List<C54130j> list;
        Log.m105924i("Finder.FinderLiveApplyLinkVisitorView", "closeInvalidMicApply");
        int i = 0;
        for (T next : arrayList) {
            int i2 = i + 1;
            T t = null;
            if (i >= 0) {
                C54130j jVar = (C54130j) next;
                if (i >= this.f159923e) {
                    Log.m105924i("Finder.FinderLiveApplyLinkVisitorView", "skip closeInvalidMicApply, too many wait user:" + arrayList.size());
                } else {
                    C45795b bVar = this.f159920C;
                    if (!(bVar == null || (list = ((C54963d0) bVar.mo71262a(C54963d0.class)).f154074q) == null)) {
                        synchronized (list) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                T next2 = it.next();
                                if (Util.isEqual(((C54130j) next2).f151999c, jVar.f151999c)) {
                                    t = next2;
                                    break;
                                }
                            }
                        }
                        t = (C54130j) t;
                    }
                    if (t == null) {
                        C56084d dVar = this.f159922E;
                        if (dVar != null) {
                            dVar.mo78181f(jVar);
                        }
                    } else {
                        Log.m105924i("Finder.FinderLiveApplyLinkVisitorView", "skip closeInvalidMicApply, " + jVar.f152000d + " is linking mic");
                    }
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* renamed from: q */
    public final void mo78169q() {
        this.f159932q.setVisibility(0);
        this.f159933r.setVisibility(8);
        View view = this.f159934s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView", "emptyViewHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f159936u.setText(getContext().getResources().getString(C0966R.string.f8120lt, new Object[]{Integer.valueOf(this.f159940y.size())}));
    }

    /* renamed from: r */
    public final void mo78170r() {
        this.f159932q.setVisibility(8);
        this.f159933r.setVisibility(0);
        View view = this.f159934s;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView", "emptyViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: s */
    public final void mo78171s() {
        this.f159919B.mo88151O4(new ArrayList(), "");
        this.f159925g.setText("");
        this.f159925g.clearFocus();
        Util.hideVKB(this.f159925g);
        Util.hideVKB(this.f159925g);
        float f = (float) C75044y4.m89990b(this.f159924f.getContext()).x;
        this.f159924f.animate().translationX(f).setListener(new C41470e(this, f)).setDuration(200).start();
    }

    public final void setOnVisitorApplyListListener(C56084d dVar) {
        this.f159922E = dVar;
    }

    /* renamed from: t */
    public final boolean mo78173t() {
        return this.f159924f.getVisibility() == 0;
    }

    /* renamed from: v */
    public final void mo78174v(long j) {
        ArrayList arrayList;
        C51887ww2 ww22;
        List<C54130j> list;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C51887ww2 ww23;
        Class cls = C54963d0.class;
        StringBuilder sb = new StringBuilder();
        sb.append("notifyPanelUpdate applyList:");
        C45795b bVar = this.f159920C;
        Long l = null;
        sb.append(bVar != null ? ((C54963d0) bVar.mo71262a(cls)).f154071n : null);
        sb.append(" micSettingSwitchFlag:");
        C45795b bVar2 = this.f159920C;
        if (!(bVar2 == null || (ww23 = ((C54963d0) bVar2.mo71262a(cls)).f154048B) == null)) {
            l = Long.valueOf(ww23.f144324e);
        }
        sb.append(l);
        sb.append(" micSetting:");
        sb.append(j);
        Log.m105924i("Finder.FinderLiveApplyLinkVisitorView", sb.toString());
        C45795b bVar3 = this.f159920C;
        if (bVar3 != null) {
            C54963d0 d0Var = (C54963d0) bVar3.mo71262a(cls);
            int i = (int) j;
            mo78175w(i, d0Var.f154048B);
            ArrayList arrayList5 = new ArrayList();
            C56085f fVar = C56085f.f159944d;
            C62042e.f176370a.getClass();
            boolean z = true;
            if (C61926c.m72696u(i, 2)) {
                List<C54130j> list2 = d0Var.f154071n;
                if (list2 != null) {
                    synchronized (list2) {
                        arrayList4 = new ArrayList();
                        for (T next : list2) {
                            if (((Boolean) fVar.invoke(next)).booleanValue()) {
                                arrayList4.add(next);
                            }
                        }
                    }
                    arrayList5.addAll(arrayList4);
                    List<C54130j> list3 = d0Var.f154071n;
                    if (list3 != null) {
                        list3.removeAll(arrayList4);
                    }
                    List<C54130j> list4 = d0Var.f154072o;
                    if (list4 != null) {
                        list4.removeAll(arrayList4);
                    }
                }
            } else if (C61926c.m72696u(i, 1)) {
                List<C54130j> list5 = d0Var.f154071n;
                if (list5 != null) {
                    synchronized (list5) {
                        arrayList3 = new ArrayList();
                        for (T next2 : list5) {
                            if (((Boolean) fVar.invoke(next2)).booleanValue()) {
                                arrayList3.add(next2);
                            }
                        }
                    }
                    arrayList5.addAll(arrayList3);
                    List<C54130j> list6 = d0Var.f154071n;
                    if (list6 != null) {
                        list6.removeAll(arrayList3);
                    }
                    List<C54130j> list7 = d0Var.f154072o;
                    if (list7 != null) {
                        list7.removeAll(arrayList3);
                    }
                }
            } else if (C61926c.m72696u(i, 4) && (list = d0Var.f154071n) != null) {
                synchronized (list) {
                    arrayList2 = new ArrayList();
                    for (T next3 : list) {
                        if (((Boolean) fVar.invoke(next3)).booleanValue()) {
                            arrayList2.add(next3);
                        }
                    }
                }
                arrayList5.addAll(arrayList2);
                List<C54130j> list8 = d0Var.f154071n;
                if (list8 != null) {
                    list8.removeAll(arrayList2);
                }
                List<C54130j> list9 = d0Var.f154072o;
                if (list9 != null) {
                    list9.removeAll(arrayList2);
                }
            }
            View view = this.f159937v;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView", "checkMicModeShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveApplyLinkNewVisitorView", "checkMicModeShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C45795b bVar4 = this.f159920C;
            if (!(bVar4 == null || (ww22 = ((C54963d0) bVar4.mo71262a(cls)).f154048B) == null)) {
                mo78175w((int) ww22.f144323d, ww22);
            }
            mo78168p(arrayList5);
            this.f159940y.clear();
            ArrayList<C54130j> arrayList6 = this.f159940y;
            List<C54130j> list10 = d0Var.f154071n;
            C87412m.m108593f(list10, "roomData.linkMicUserList");
            synchronized (list10) {
                arrayList = new ArrayList();
                for (T next4 : list10) {
                    if (!((C54130j) next4).f152004h) {
                        arrayList.add(next4);
                    }
                }
            }
            arrayList6.addAll(arrayList);
            ArrayList<C54130j> arrayList7 = this.f159940y;
            if (arrayList7 != null && !arrayList7.isEmpty()) {
                z = false;
            }
            if (z) {
                mo78170r();
                return;
            }
            mo78169q();
            this.f159918A.mo88152c(this.f159940y);
            this.f159918A.notifyDataSetChanged();
        }
    }

    /* renamed from: w */
    public final void mo78175w(int i, C51887ww2 ww22) {
        Class cls = C54949c0.class;
        if (C61926c.m72696u(i, 64) || C61926c.m72696u(i, 32)) {
            C45795b bVar = this.f159920C;
            if (bVar != null) {
                C54949c0 c0Var = (C54949c0) bVar.mo71262a(cls);
            }
            String string = getContext().getResources().getString(C0966R.string.f8114l0);
            this.f159938w.setText(getContext().getResources().getString(C0966R.string.f8113kz));
            this.f159939x.setText(string);
            return;
        }
        C45795b bVar2 = this.f159920C;
        if (bVar2 != null) {
            C54949c0 c0Var2 = (C54949c0) bVar2.mo71262a(cls);
        }
        String string2 = getContext().getResources().getString(C0966R.string.f8117l6);
        this.f159938w.setText(getContext().getResources().getString(C0966R.string.f8116l5));
        this.f159939x.setText(string2);
    }
}
