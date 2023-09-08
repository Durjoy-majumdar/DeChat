package com.tencent.p014mm.p136ui.contact.item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.contact.C74500h3;
import com.tencent.p014mm.p136ui.contact.C74504i3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32224a;
import gl3.C75921a;
import gl3.C75922b;
import gl3.C75977x;
import gl3.C75978y;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C60905o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.contact.item.RecentForwardListDataItem */
public final class RecentForwardListDataItem extends C75921a {

    /* renamed from: B */
    public ArrayList<C74500h3> f219065B;

    /* renamed from: C */
    public C74505a f219066C;

    /* renamed from: D */
    public C74507c f219067D;

    /* renamed from: E */
    public C74506b f219068E;

    /* renamed from: F */
    public C78253a f219069F;

    /* renamed from: G */
    public WxRecyclerAdapter<C74500h3> f219070G;

    /* renamed from: H */
    public final C13601g f219071H = C36568h.m40985a(new C74512h(this));

    /* renamed from: I */
    public final C13601g f219072I = C36568h.m40985a(new C74513i(this));

    /* renamed from: com.tencent.mm.ui.contact.item.RecentForwardListDataItem$a */
    public interface C74505a {
    }

    /* renamed from: com.tencent.mm.ui.contact.item.RecentForwardListDataItem$b */
    public interface C74506b {
    }

    /* renamed from: com.tencent.mm.ui.contact.item.RecentForwardListDataItem$c */
    public interface C74507c {
    }

    /* renamed from: com.tencent.mm.ui.contact.item.RecentForwardListDataItem$d */
    public final class C74508d implements C75922b.C75923a {

        /* renamed from: a */
        public LinearLayout f219073a;

        /* renamed from: b */
        public RecyclerView f219074b;

        /* renamed from: c */
        public TextView f219075c;

        public C74508d(RecentForwardListDataItem recentForwardListDataItem) {
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.item.RecentForwardListDataItem$e */
    public final class C74509e implements C75922b.C75924b {
        public C74509e() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            if ((aVar instanceof C74508d) && (bVar instanceof RecentForwardListDataItem)) {
                RecentForwardListDataItem recentForwardListDataItem = RecentForwardListDataItem.this;
                ArrayList<C74500h3> arrayList = recentForwardListDataItem.f219065B;
                boolean z3 = arrayList != null ? !arrayList.isEmpty() : false;
                C74508d dVar = (C74508d) aVar;
                recentForwardListDataItem.getClass();
                int i = z3 ? 0 : 8;
                LinearLayout linearLayout = dVar.f219073a;
                if (linearLayout != null) {
                    linearLayout.setVisibility(i);
                }
                RecyclerView recyclerView = dVar.f219074b;
                if (recyclerView != null) {
                    recyclerView.setVisibility(i);
                }
                TextView textView = dVar.f219075c;
                if (textView != null) {
                    textView.setVisibility(i);
                }
                RecentForwardListDataItem recentForwardListDataItem2 = RecentForwardListDataItem.this;
                boolean z4 = recentForwardListDataItem2.f222608e;
                ArrayList<C74500h3> arrayList2 = recentForwardListDataItem2.f219065B;
                if (arrayList2 != null) {
                    for (C74500h3 h3Var : arrayList2) {
                        C74504i3 i3Var = h3Var.f219053d;
                        i3Var.f219064d = z4;
                        if (!z4) {
                            i3Var.f219063c = false;
                        }
                    }
                }
                RecyclerView recyclerView2 = dVar.f219074b;
                if (recyclerView2 != null) {
                    RecentForwardListDataItem recentForwardListDataItem3 = RecentForwardListDataItem.this;
                    recyclerView2.setLayoutManager(new LinearLayoutManager(context, 0, false));
                    recyclerView2.setHasFixedSize(true);
                    recyclerView2.setAdapter(recentForwardListDataItem3.f219070G);
                }
            }
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f359936bq0, viewGroup, false);
            C74508d dVar = (C74508d) ((C36570n) RecentForwardListDataItem.this.f219071H).getValue();
            C87412m.m108592e(dVar, "null cannot be cast to non-null type com.tencent.mm.ui.contact.item.RecentForwardListDataItem.RecentForwardListViewHolder");
            LinearLayout linearLayout = null;
            RecyclerView recyclerView = inflate != null ? (RecyclerView) inflate.findViewById(C0966R.C0970id.ife) : null;
            C87412m.m108592e(recyclerView, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            dVar.f219074b = recyclerView;
            TextView textView = inflate != null ? (TextView) inflate.findViewById(C0966R.C0970id.eve) : null;
            C87412m.m108592e(textView, "null cannot be cast to non-null type android.widget.TextView");
            dVar.f219075c = textView;
            C85875k4.m106191k0(textView.getPaint());
            if (inflate != null) {
                linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.iwl);
            }
            C87412m.m108592e(linearLayout, "null cannot be cast to non-null type android.widget.LinearLayout");
            dVar.f219073a = linearLayout;
            inflate.setTag(dVar);
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.item.RecentForwardListDataItem$f */
    public static final class C74510f implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ RecentForwardListDataItem f219077d;

        public C74510f(RecentForwardListDataItem recentForwardListDataItem) {
            this.f219077d = recentForwardListDataItem;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0018, code lost:
            r0 = r0.get(r8);
         */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r6, android.view.View r7, int r8, androidx.recyclerview.widget.RecyclerView.C16631z r9) {
            /*
                r5 = this;
                jq3.o r9 = (jq3.C60905o) r9
                java.lang.String r0 = "adapter"
                gy3.C87412m.m108594g(r6, r0)
                java.lang.String r0 = "view"
                gy3.C87412m.m108594g(r7, r0)
                java.lang.String r0 = "holder"
                gy3.C87412m.m108594g(r9, r0)
                com.tencent.mm.ui.contact.item.RecentForwardListDataItem r0 = r5.f219077d
                java.util.ArrayList<com.tencent.mm.ui.contact.h3> r0 = r0.f219065B
                if (r0 == 0) goto L_0x0023
                java.lang.Object r0 = r0.get(r8)
                com.tencent.mm.ui.contact.h3 r0 = (com.tencent.p014mm.p136ui.contact.C74500h3) r0
                if (r0 == 0) goto L_0x0023
                com.tencent.mm.ui.contact.i3 r0 = r0.f219053d
                goto L_0x0024
            L_0x0023:
                r0 = 0
            L_0x0024:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onItemClick() called with: adapter = "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r2 = ", view = "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = ", position = "
                r1.append(r7)
                r1.append(r8)
                java.lang.String r7 = ", holder = "
                r1.append(r7)
                r1.append(r9)
                java.lang.String r7 = r1.toString()
                java.lang.String r9 = "RecentForwardListDataItem"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
                r7 = 1
                if (r0 == 0) goto L_0x00c4
                java.lang.String r9 = r0.f219061a
                if (r9 == 0) goto L_0x00c4
                com.tencent.mm.ui.contact.item.RecentForwardListDataItem r1 = r5.f219077d
                com.tencent.mm.ui.contact.item.RecentForwardListDataItem$a r1 = r1.f219066C
                if (r1 == 0) goto L_0x00c4
                com.tencent.mm.ui.contact.g2 r1 = (com.tencent.p014mm.p136ui.contact.C74494g2) r1
                com.tencent.mm.ui.contact.e2 r1 = r1.f219048a
                com.tencent.mm.ui.contact.e2$b r1 = r1.f219007C
                com.tencent.mm.ui.transmit.SelectConversationUI$f0 r1 = (com.tencent.p014mm.p136ui.transmit.SelectConversationUI.C74884f0) r1
                com.tencent.mm.ui.transmit.SelectConversationUI r2 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                boolean r3 = r2.f220170U0
                if (r3 == 0) goto L_0x00ab
                java.lang.Object[] r2 = new java.lang.Object[r7]
                r3 = 0
                r2[r3] = r9
                java.lang.String r3 = "MicroMsg.SelectConversationUI"
                java.lang.String r4 = "ClickUser=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
                com.tencent.mm.ui.transmit.SelectConversationUI r2 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                java.util.List<java.lang.String> r2 = r2.f220172V0
                boolean r2 = r2.contains(r9)
                if (r2 != 0) goto L_0x0091
                com.tencent.mm.ui.transmit.SelectConversationUI r2 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                boolean r2 = r2.mo104129R8(r7)
                if (r2 == 0) goto L_0x0091
                com.tencent.mm.ui.transmit.SelectConversationUI r9 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                r9.mo103378K7()
                goto L_0x00c4
            L_0x0091:
                com.tencent.mm.ui.transmit.SelectConversationUI r2 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                android.widget.ListView r3 = r2.f218605d
                int r3 = r3.getHeaderViewsCount()
                r2.mo104120I8(r9, r3)
                com.tencent.mm.ui.transmit.SelectConversationUI r9 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                r9.mo104131T8()
                com.tencent.mm.ui.transmit.SelectConversationUI r9 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                com.tencent.mm.ui.contact.i1 r9 = r9.mo103379N7()
                r9.notifyDataSetChanged()
                goto L_0x00b8
            L_0x00ab:
                android.widget.ListView r3 = r2.f218605d
                int r3 = r3.getHeaderViewsCount()
                r2.f220190j1 = r3
                com.tencent.mm.ui.transmit.SelectConversationUI r2 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                r2.mo104140q8(r9)
            L_0x00b8:
                com.tencent.mm.ui.transmit.SelectConversationUI r9 = com.tencent.p014mm.p136ui.transmit.SelectConversationUI.this
                boolean r1 = r9.f220176X0
                if (r1 == 0) goto L_0x00c4
                com.tencent.mm.storage.f4 r9 = r9.f220188h1
                r1 = 4
                com.tencent.p014mm.modelstat.C68144a.m80546b(r9, r1)
            L_0x00c4:
                com.tencent.mm.ui.contact.item.RecentForwardListDataItem r9 = r5.f219077d
                boolean r9 = r9.f222608e
                if (r9 == 0) goto L_0x00d2
                if (r0 != 0) goto L_0x00cd
                goto L_0x00d2
            L_0x00cd:
                boolean r9 = r0.f219063c
                r7 = r7 ^ r9
                r0.f219063c = r7
            L_0x00d2:
                r6.notifyItemChanged(r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.item.RecentForwardListDataItem.C74510f.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.item.RecentForwardListDataItem$g */
    public static final class C74511g implements C60898l.C9503c<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ RecentForwardListDataItem f219078d;

        public C74511g(RecentForwardListDataItem recentForwardListDataItem) {
            this.f219078d = recentForwardListDataItem;
        }

        /* renamed from: n */
        public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            RecentForwardListDataItem recentForwardListDataItem;
            ArrayList<C74500h3> arrayList;
            C74500h3 h3Var;
            C74504i3 i3Var;
            String str;
            C60905o oVar = (C60905o) zVar;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(oVar, "holder");
            Log.m105924i("RecentForwardListDataItem", "onItemLongClick() called with: adapter = " + eVar + ", view = " + view + ", position = " + i + ", holder = " + oVar);
            RecyclerView C = oVar.mo85811C();
            if (!(C == null || (arrayList = recentForwardListDataItem.f219065B) == null || (h3Var = arrayList.get(i)) == null || (i3Var = h3Var.f219053d) == null || (str = i3Var.f219061a) == null)) {
                C78253a aVar = (recentForwardListDataItem = this.f219078d).f219069F;
                if (aVar != null) {
                    aVar.mo108266a();
                }
                RecyclerView.LayoutManager layoutManager = C.getLayoutManager();
                View findViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i) : null;
                if (findViewByPosition != null) {
                    C78253a aVar2 = new C78253a(findViewByPosition.getContext());
                    aVar2.f229225A = true;
                    aVar2.f229227C = new C75977x(recentForwardListDataItem);
                    recentForwardListDataItem.f219069F = aVar2;
                    int[] iArr = {0, 0};
                    findViewByPosition.getLocationInWindow(iArr);
                    C75978y yVar = new C75978y(str, recentForwardListDataItem, C);
                    C78253a aVar3 = recentForwardListDataItem.f219069F;
                    if (aVar3 != null) {
                        int width = (int) (((float) iArr[0]) + (((float) findViewByPosition.getWidth()) / 2.0f));
                        int i2 = iArr[1];
                        aVar3.f229251t = yVar;
                        aVar3.f229240f = findViewByPosition;
                        if (!(findViewByPosition instanceof TextView) && (width == 0 || i2 == 0)) {
                            aVar3.mo108277l();
                        }
                        aVar3.f229254w.clear();
                        aVar3.f229254w.mo107125a(0, C0966R.string.ij4);
                        if (width == 0 && i2 == 0) {
                            aVar3.mo70679m();
                        } else {
                            aVar3.mo71743n(width, i2);
                        }
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.item.RecentForwardListDataItem$h */
    public static final class C74512h extends C87413o implements C32224a<C74508d> {

        /* renamed from: d */
        public final /* synthetic */ RecentForwardListDataItem f219079d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74512h(RecentForwardListDataItem recentForwardListDataItem) {
            super(0);
            this.f219079d = recentForwardListDataItem;
        }

        public Object invoke() {
            return new C74508d(this.f219079d);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.item.RecentForwardListDataItem$i */
    public static final class C74513i extends C87413o implements C32224a<C74509e> {

        /* renamed from: d */
        public final /* synthetic */ RecentForwardListDataItem f219080d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74513i(RecentForwardListDataItem recentForwardListDataItem) {
            super(0);
            this.f219080d = recentForwardListDataItem;
        }

        public Object invoke() {
            return new C74509e();
        }
    }

    public RecentForwardListDataItem(int i) {
        super(9, i);
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
        ArrayList<C74500h3> arrayList = this.f219065B;
        boolean z = true;
        if (arrayList == null || !(!arrayList.isEmpty())) {
            z = false;
        }
        if (z) {
            RecentForwardListDataItem$fillingDataItem$1 recentForwardListDataItem$fillingDataItem$1 = new RecentForwardListDataItem$fillingDataItem$1();
            ArrayList<C74500h3> arrayList2 = this.f219065B;
            C87412m.m108591d(arrayList2);
            WxRecyclerAdapter<C74500h3> wxRecyclerAdapter = new WxRecyclerAdapter<>(recentForwardListDataItem$fillingDataItem$1, arrayList2, false);
            this.f219070G = wxRecyclerAdapter;
            wxRecyclerAdapter.f173488o = new C74510f(this);
            wxRecyclerAdapter.f173487n = new C74511g(this);
        }
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return (C74509e) ((C36570n) this.f219072I).getValue();
    }
}
