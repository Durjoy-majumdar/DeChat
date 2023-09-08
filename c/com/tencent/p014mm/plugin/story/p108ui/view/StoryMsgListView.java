package com.tencent.p014mm.plugin.story.p108ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import ew2.C97757a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kw2.C99268i;
import lw2.C99698j;
import lw2.C99706q;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010!\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#B\u001b\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010$R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\nR*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012¨\u0006%"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryMsgListView;", "Landroid/widget/RelativeLayout;", "Lkotlin/Function1;", "Lew2/a;", "Lrx3/b0;", "h", "Lfy3/l;", "getOnCommentItemClick", "()Lfy3/l;", "setOnCommentItemClick", "(Lfy3/l;)V", "onCommentItemClick", "Lkotlin/Function0;", "i", "Lfy3/a;", "getOnBlankClick", "()Lfy3/a;", "setOnBlankClick", "(Lfy3/a;)V", "onBlankClick", "", "j", "getOnContentTopOverScroll", "setOnContentTopOverScroll", "onContentTopOverScroll", "n", "getOnContentTopOverScrollStop", "setOnContentTopOverScrollStop", "onContentTopOverScrollStop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgListView */
public final class StoryMsgListView extends RelativeLayout {

    /* renamed from: o */
    public static final /* synthetic */ int f281952o = 0;

    /* renamed from: d */
    public final RecyclerView f281953d;

    /* renamed from: e */
    public final TextView f281954e;

    /* renamed from: f */
    public int f281955f;

    /* renamed from: g */
    public int f281956g;

    /* renamed from: h */
    public C32226l<? super C97757a, C13598b0> f281957h;

    /* renamed from: i */
    public C32224a<C13598b0> f281958i;

    /* renamed from: j */
    public C32226l<? super Integer, C13598b0> f281959j;

    /* renamed from: n */
    public C32224a<C13598b0> f281960n;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgListView$a */
    public static final class C71273a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgListView f206324d;

        public C71273a(StoryMsgListView storyMsgListView) {
            this.f206324d = storyMsgListView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/StoryMsgListView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> onBlankClick = this.f206324d.getOnBlankClick();
            if (onBlankClick != null) {
                onBlankClick.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/StoryMsgListView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgListView$b */
    public static final class C71274b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgListView f206325d;

        public C71274b(StoryMsgListView storyMsgListView) {
            this.f206325d = storyMsgListView;
        }

        public final void run() {
            RecyclerView.LayoutManager layoutManager;
            RecyclerView.C16613e adapter = this.f206325d.f281953d.getAdapter();
            if (adapter != null && (layoutManager = this.f206325d.f281953d.getLayoutManager()) != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(adapter.getItemCount() - 1));
                RecyclerView.LayoutManager layoutManager2 = layoutManager;
                C117292a.m165358d(layoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryMsgListView$setup$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                layoutManager.scrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(layoutManager2, "com/tencent/mm/plugin/story/ui/view/StoryMsgListView$setup$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgListView$c */
    public static final class C71275c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgListView f206326d;

        /* renamed from: e */
        public final /* synthetic */ List<C97757a> f206327e;

        public C71275c(StoryMsgListView storyMsgListView, List<C97757a> list) {
            this.f206326d = storyMsgListView;
            this.f206327e = list;
        }

        public final void run() {
            RecyclerView.LayoutManager layoutManager = this.f206326d.f281953d.getLayoutManager();
            if (layoutManager != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(this.f206327e.size() - 1));
                C117292a.m165358d(layoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryMsgListView$updateMsgList$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                layoutManager.scrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(layoutManager, "com/tencent/mm/plugin/story/ui/view/StoryMsgListView$updateMsgList$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgListView$d */
    public static final class C71276d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StoryMsgListView f206328d;

        /* renamed from: e */
        public final /* synthetic */ List<C97757a> f206329e;

        public C71276d(StoryMsgListView storyMsgListView, List<C97757a> list) {
            this.f206328d = storyMsgListView;
            this.f206329e = list;
        }

        public final void run() {
            RecyclerView.LayoutManager layoutManager = this.f206328d.f281953d.getLayoutManager();
            if (layoutManager != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(this.f206329e.size() - 1));
                C117292a.m165358d(layoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/StoryMsgListView$updateMsgList$2$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                layoutManager.scrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(layoutManager, "com/tencent/mm/plugin/story/ui/view/StoryMsgListView$updateMsgList$2$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryMsgListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f281955f = -1;
        View.inflate(context, C0966R.C0971layout.c78, this);
        View findViewById = findViewById(C0966R.C0970id.k8e);
        C87412m.m108593f(findViewById, "findViewById(R.id.story_msg_recycler_view)");
        this.f281953d = (RecyclerView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.k8b);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_msg_empty_tip_tv)");
        this.f281954e = (TextView) findViewById2;
        C87412m.m108593f(ViewConfiguration.get(context), "get(context)");
        setOnClickListener(new C71273a(this));
    }

    /* renamed from: a */
    public final ArrayList<C97757a> mo134290a(List<C97757a> list) {
        ArrayList<C97757a> arrayList = new ArrayList<>();
        for (C97757a aVar : list) {
            C87412m.m108594g(aVar, "storyCommentItem");
            C97757a aVar2 = new C97757a();
            aVar2.f286808a = aVar.f286808a;
            aVar2.f286809b = aVar.f286809b;
            aVar2.f286810c = aVar.f286810c;
            aVar2.f286811d = aVar.f286811d;
            aVar2.f286812e = aVar.f286812e;
            aVar2.f286813f = aVar.f286813f;
            aVar2.f286814g = aVar.f286814g;
            aVar2.f286815h = aVar.f286815h;
            aVar2.f286816i = aVar.f286816i;
            aVar2.f286817j = aVar.f286817j;
            aVar2.f286818k = aVar.f286818k;
            aVar2.f286819l = aVar.f286819l;
            arrayList.add(aVar2);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo134291b(int i, ArrayList<C97757a> arrayList, ArrayList<C97757a> arrayList2, C99268i iVar) {
        C87412m.m108594g(arrayList, "comments");
        C87412m.m108594g(arrayList2, "bubbles");
        this.f281955f = i;
        if (i == 0) {
            C99706q qVar = new C99706q(mo134290a(arrayList2));
            this.f281953d.setLayoutManager(new GridLayoutManager(getContext(), 4));
            this.f281953d.setAdapter(qVar);
            ViewGroup.LayoutParams layoutParams = this.f281953d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(C74942w4.m89784a(getContext(), 40));
            ViewGroup.LayoutParams layoutParams2 = this.f281953d.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(C74942w4.m89784a(getContext(), 40));
            this.f281954e.setText(getContext().getResources().getString(C0966R.string.jqi));
            if (arrayList2.isEmpty()) {
                this.f281954e.setVisibility(0);
                this.f281953d.setVisibility(8);
            } else {
                this.f281954e.setVisibility(8);
                this.f281953d.setVisibility(0);
            }
        } else if (i == 1) {
            C99698j jVar = new C99698j(mo134290a(arrayList));
            jVar.f292205g = iVar;
            jVar.f292206h = this.f281957h;
            this.f281953d.setLayoutManager(new LinearLayoutManager(getContext()));
            this.f281953d.setAdapter(jVar);
            this.f281954e.setText(getContext().getResources().getString(C0966R.string.jql));
            if (arrayList.isEmpty()) {
                this.f281954e.setVisibility(0);
                this.f281953d.setVisibility(8);
            } else {
                this.f281954e.setVisibility(8);
                this.f281953d.setVisibility(0);
            }
        }
        this.f281953d.post(new C71274b(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098 A[EDGE_INSN: B:28:0x0098->B:20:0x0098 ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo134292c(java.util.List<ew2.C97757a> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "datas"
            gy3.C87412m.m108594g(r10, r0)
            boolean r0 = r10.isEmpty()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x0019
            android.widget.TextView r10 = r9.f281954e
            r10.setVisibility(r2)
            androidx.recyclerview.widget.RecyclerView r10 = r9.f281953d
            r10.setVisibility(r1)
            return
        L_0x0019:
            android.widget.TextView r0 = r9.f281954e
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r9.f281953d
            r0.setVisibility(r2)
            int r0 = r9.f281955f
            r1 = 1
            if (r0 != 0) goto L_0x00c4
            androidx.recyclerview.widget.RecyclerView r0 = r9.f281953d
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x00e1
            lw2.q r0 = (lw2.C99706q) r0
            java.util.ArrayList r3 = r9.mo134290a(r10)
            java.lang.String r4 = r0.f292239e
            java.lang.String r5 = "updateBubbles"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r4 = r0.f292240f
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0048:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0097
            java.lang.Object r5 = r4.next()
            java.lang.String r6 = "it.next()"
            gy3.C87412m.m108593f(r5, r6)
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            com.tencent.mm.plugin.story.model.StoryCore$h r6 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            java.lang.String r7 = r6.mo134187e()
            java.lang.Object r8 = r5.getKey()
            java.lang.String r8 = (java.lang.String) r8
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r8)
            if (r7 != 0) goto L_0x0087
            kw2.f r6 = r6.mo134189g()
            java.lang.Object r7 = r5.getKey()
            java.lang.String r8 = "entry.key"
            gy3.C87412m.m108593f(r7, r8)
            java.lang.String r7 = (java.lang.String) r7
            kw2.e r6 = r6.mo138644bD(r7)
            boolean r6 = r6.mo138638l2()
            if (r6 == 0) goto L_0x0087
            r6 = 1
            goto L_0x0088
        L_0x0087:
            r6 = 0
        L_0x0088:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = gy3.C87412m.m108589b(r6, r5)
            if (r5 != 0) goto L_0x0048
            goto L_0x0098
        L_0x0097:
            r1 = 0
        L_0x0098:
            if (r1 == 0) goto L_0x00a8
            java.util.ArrayList<ew2.a> r1 = r0.f292238d
            r1.clear()
            java.util.ArrayList<ew2.a> r1 = r0.f292238d
            r1.addAll(r3)
            r0.notifyDataSetChanged()
            goto L_0x00b9
        L_0x00a8:
            lw2.s r1 = new lw2.s
            r1.<init>(r0, r3)
            androidx.recyclerview.widget.l$c r1 = androidx.recyclerview.widget.C54248l.m60949a(r1, r2)
            lw2.r r2 = new lw2.r
            r2.<init>(r0, r3)
            r1.mo75045a(r2)
        L_0x00b9:
            androidx.recyclerview.widget.RecyclerView r0 = r9.f281953d
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView$c r1 = new com.tencent.mm.plugin.story.ui.view.StoryMsgListView$c
            r1.<init>(r9, r10)
            r0.post(r1)
            goto L_0x00e1
        L_0x00c4:
            if (r0 != r1) goto L_0x00e1
            androidx.recyclerview.widget.RecyclerView r0 = r9.f281953d
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x00e1
            lw2.j r0 = (lw2.C99698j) r0
            java.util.ArrayList r1 = r9.mo134290a(r10)
            r0.mo139065F4(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r9.f281953d
            com.tencent.mm.plugin.story.ui.view.StoryMsgListView$d r1 = new com.tencent.mm.plugin.story.ui.view.StoryMsgListView$d
            r1.<init>(r9, r10)
            r0.post(r1)
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.p108ui.view.StoryMsgListView.mo134292c(java.util.List):void");
    }

    public final C32224a<C13598b0> getOnBlankClick() {
        return this.f281958i;
    }

    public final C32226l<C97757a, C13598b0> getOnCommentItemClick() {
        return this.f281957h;
    }

    public final C32226l<Integer, C13598b0> getOnContentTopOverScroll() {
        return this.f281959j;
    }

    public final C32224a<C13598b0> getOnContentTopOverScrollStop() {
        return this.f281960n;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3;
        RecyclerView.LayoutManager layoutManager = this.f281953d.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            RecyclerView.LayoutManager layoutManager2 = this.f281953d.getLayoutManager();
            C87412m.m108592e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            i3 = ((GridLayoutManager) layoutManager2).mo17004z();
        } else if (layoutManager instanceof LinearLayoutManager) {
            RecyclerView.LayoutManager layoutManager3 = this.f281953d.getLayoutManager();
            C87412m.m108592e(layoutManager3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            i3 = ((LinearLayoutManager) layoutManager3).mo17004z();
        } else {
            i3 = -1;
        }
        if (i2 > 0) {
            int i4 = this.f281956g;
            if (i4 != 0) {
                this.f281956g = i4 + i2;
                C32226l<? super Integer, C13598b0> lVar = this.f281959j;
                if (lVar != null) {
                    lVar.invoke(Integer.valueOf(i2));
                }
                if (iArr != null) {
                    iArr[0] = i;
                }
                if (iArr != null) {
                    iArr[1] = i2;
                }
            }
        } else if (i2 < 0 && i3 == 0) {
            this.f281956g += i2;
            C32226l<? super Integer, C13598b0> lVar2 = this.f281959j;
            if (lVar2 != null) {
                lVar2.invoke(Integer.valueOf(i2));
            }
            if (iArr != null) {
                iArr[0] = i;
            }
            if (iArr != null) {
                iArr[1] = i2;
            }
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f281956g = 0;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        int i;
        C32224a<C13598b0> aVar;
        RecyclerView.LayoutManager layoutManager = this.f281953d.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            RecyclerView.LayoutManager layoutManager2 = this.f281953d.getLayoutManager();
            C87412m.m108592e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            i = ((GridLayoutManager) layoutManager2).mo17004z();
        } else if (layoutManager instanceof LinearLayoutManager) {
            RecyclerView.LayoutManager layoutManager3 = this.f281953d.getLayoutManager();
            C87412m.m108592e(layoutManager3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            i = ((LinearLayoutManager) layoutManager3).mo17004z();
        } else {
            i = -1;
        }
        if (i == 0 && (aVar = this.f281960n) != null) {
            aVar.invoke();
        }
    }

    public final void setOnBlankClick(C32224a<C13598b0> aVar) {
        this.f281958i = aVar;
    }

    public final void setOnCommentItemClick(C32226l<? super C97757a, C13598b0> lVar) {
        this.f281957h = lVar;
    }

    public final void setOnContentTopOverScroll(C32226l<? super Integer, C13598b0> lVar) {
        this.f281959j = lVar;
    }

    public final void setOnContentTopOverScrollStop(C32224a<C13598b0> aVar) {
        this.f281960n = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryMsgListView(Context context) {
        this(context, (AttributeSet) null, 0);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryMsgListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
