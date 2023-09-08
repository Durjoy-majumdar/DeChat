package p61;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gc0.C20828a;
import gy3.C8480h;
import gy3.C87412m;
import i61.C98601f;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import my3.C61594j;
import p207nl.C89008j;
import p441aq.C92054g;
import q61.C101047d;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C101800k70;
import u61.C101964h;

/* renamed from: p61.s */
public final class C100674s extends RecyclerView.C16613e<C100657j<?>> {

    /* renamed from: d */
    public final Context f294956d;

    /* renamed from: e */
    public final List<C100684y> f294957e;

    /* renamed from: f */
    public final String f294958f = "MicroMsg.EmojiStoreV3SingleProductAdapter";

    /* renamed from: g */
    public C100685z f294959g;

    /* renamed from: h */
    public C32224a<C13598b0> f294960h;

    /* renamed from: i */
    public C32226l<? super Boolean, C13598b0> f294961i;

    /* renamed from: j */
    public int f294962j;

    /* renamed from: n */
    public int f294963n;

    /* renamed from: o */
    public final C100644e0 f294964o;

    /* renamed from: p */
    public int f294965p;

    /* renamed from: q */
    public C32226l<? super C101047d, C13598b0> f294966q;

    /* renamed from: r */
    public boolean f294967r;

    /* renamed from: p61.s$d */
    public static final class C77059d extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C100674s f225103d;

        public C77059d(C100674s sVar) {
            this.f225103d = sVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3SingleProductAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            this.f225103d.f294963n = i;
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C100674s sVar = this.f225103d;
                if (sVar.f294967r) {
                    sVar.f294967r = false;
                    if (sVar.f294966q != null) {
                        sVar.mo140112F4(recyclerView.getLayoutManager());
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3SingleProductAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C32226l<? super Boolean, C13598b0> lVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3SingleProductAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (i2 != 0) {
                String str = this.f225103d.f294958f;
                Log.m105918d(str, "onScrolled dx:" + i + " dy:" + i2);
                boolean z = true;
                this.f225103d.f294967r = true;
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if ((layoutManager instanceof GridLayoutManager) && (lVar = this.f225103d.f294961i) != null) {
                    if (((GridLayoutManager) layoutManager).mo16957C() != 0) {
                        z = false;
                    }
                    lVar.invoke(Boolean.valueOf(z));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3SingleProductAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: p61.s$a */
    public static final class C100675a extends C100657j<C100645f0> {

        /* renamed from: B */
        public final TextView f294968B;

        /* renamed from: C */
        public final TextView f294969C;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100675a(View view) {
            super(view, (C100685z) null);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.m6z);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…oduct_album_header_title)");
            this.f294968B = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.m6y);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…roduct_album_header_desc)");
            this.f294969C = (TextView) findViewById2;
        }

        /* renamed from: y */
        public void mo140091y(C100684y yVar, List<Object> list) {
            C87412m.m108594g(yVar, "item");
            C87412m.m108594g(list, "payloads");
            super.mo140091y(yVar, list);
            String str = null;
            C100645f0 f0Var = yVar instanceof C100645f0 ? (C100645f0) yVar : null;
            C85875k4.m106191k0(this.f294968B.getPaint());
            this.f294968B.setText(f0Var != null ? f0Var.f294842a : null);
            this.f294969C.setText(f0Var != null ? f0Var.f294843b : null);
            if (f0Var != null) {
                str = f0Var.f294843b;
            }
            if (C87412m.m108589b(str, "")) {
                this.f294969C.setVisibility(8);
            }
        }
    }

    /* renamed from: p61.s$b */
    public static final class C100676b extends C100657j<C100644e0> {

        /* renamed from: B */
        public final TextView f294970B;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100676b(View view) {
            super(view, (C100685z) null);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.m3m);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.load_more_footer_tv)");
            this.f294970B = (TextView) findViewById;
        }

        /* renamed from: y */
        public void mo140091y(C100684y yVar, List<Object> list) {
            C87412m.m108594g(yVar, "item");
            C87412m.m108594g(list, "payloads");
            super.mo140091y(yVar, list);
            if (!list.isEmpty()) {
                View view = this.f44854d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3SingleProductAdapter$EmojiStoreV3SingleProductBottomLoadingViewHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3SingleProductAdapter$EmojiStoreV3SingleProductBottomLoadingViewHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f294970B.setVisibility(8);
                return;
            }
            String str = null;
            C100644e0 e0Var = yVar instanceof C100644e0 ? (C100644e0) yVar : null;
            this.f294970B.setVisibility(0);
            TextView textView = this.f294970B;
            if (e0Var != null) {
                str = e0Var.f294841a;
            }
            textView.setText(str);
        }
    }

    /* renamed from: p61.s$c */
    public static final class C100677c extends C100657j<C100659j0> {

        /* renamed from: B */
        public C32224a<C13598b0> f294971B;

        /* renamed from: C */
        public final String f294972C;

        /* renamed from: D */
        public final ImageView f294973D;

        /* renamed from: E */
        public final TextView f294974E;

        /* renamed from: F */
        public final int f294975F;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C100677c(android.content.Context r2, android.view.View r3, p61.C100685z r4, fy3.C32224a<rx3.C13598b0> r5, int r6, gy3.C8480h r7) {
            /*
                r1 = this;
                r7 = r6 & 4
                r0 = 0
                if (r7 == 0) goto L_0x0006
                r4 = r0
            L_0x0006:
                r6 = r6 & 8
                if (r6 == 0) goto L_0x000b
                r5 = r0
            L_0x000b:
                java.lang.String r6 = "context"
                gy3.C87412m.m108594g(r2, r6)
                java.lang.String r6 = "itemView"
                gy3.C87412m.m108594g(r3, r6)
                r1.<init>(r3, r4)
                r1.f294971B = r5
                java.lang.String r4 = "MicroMsg.EmojiStoreV3SingleProductHolder"
                r1.f294972C = r4
                r4 = 2131306615(0x7f092877, float:1.8231434E38)
                android.view.View r4 = r3.findViewById(r4)
                android.widget.ImageView r4 = (android.widget.ImageView) r4
                r1.f294973D = r4
                r4 = 2131306649(0x7f092899, float:1.8231503E38)
                android.view.View r3 = r3.findViewById(r4)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r1.f294974E = r3
                r3 = 2131166382(0x7f0704ae, float:1.7947008E38)
                int r2 = kg3.C76577a.m92157h(r2, r3)
                r1.f294975F = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p61.C100674s.C100677c.<init>(android.content.Context, android.view.View, p61.z, fy3.a, int, gy3.h):void");
        }

        /* renamed from: y */
        public void mo140091y(C100684y yVar, List<Object> list) {
            C87412m.m108594g(yVar, "dataItem");
            C87412m.m108594g(list, "payloads");
            super.mo140091y(yVar, list);
            C101800k70 k702 = null;
            C100659j0 j0Var = yVar instanceof C100659j0 ? (C100659j0) yVar : null;
            if (j0Var != null) {
                k702 = j0Var.f294877a;
            }
            if (k702 == null) {
                Log.m105924i(this.f294972C, "onBind Failed, EmojiInfo null");
                return;
            }
            this.f294974E.setText(k702.f298601v);
            this.f294973D.setImageResource(C0966R.C0969drawable.emoji_download_icon);
            if (!Util.isNullOrNil(k702.f298588f)) {
                String e = C89008j.f256613a.mo123386e(k702.f298586d);
                C20828a b = C20828a.m22825b();
                String str = k702.f298588f;
                b.mo32519h(str, this.f294973D, C98601f.m128136a(str, e, this.f294975F, new Object[0]));
                this.f294973D.setImportantForAccessibility(1);
                this.f294973D.setContentDescription(MMApplicationContext.getString(C0966R.string.c5v));
            } else if (!Util.isNullOrNil(k702.f298587e)) {
                String q = EmojiLogic.m117486q(C101964h.m134224f(), "", k702.f298586d);
                C20828a Nr = ((C92054g) C86312j.m106911c(C92054g.class)).mo62466Nr();
                String str2 = k702.f298587e;
                Nr.mo32519h(str2, this.f294973D, C98601f.m128136a(str2, q, this.f294975F, new Object[0]));
                this.f294973D.setImportantForAccessibility(1);
                this.f294973D.setContentDescription(MMApplicationContext.getString(C0966R.string.c5v));
            } else {
                this.f294973D.setImportantForAccessibility(4);
                Log.m105928w(this.f294972C, "this emoji has no thumb url and url. download faild");
            }
        }
    }

    public C100674s(Context context, List<C100684y> list) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(list, "itemListData");
        this.f294956d = context;
        this.f294957e = list;
        String string = context.getString(C0966R.string.c8r);
        C87412m.m108593f(string, "context.getString(com.te…ng.emoji_store_load_more)");
        this.f294964o = new C100644e0(string);
    }

    /* renamed from: F4 */
    public final void mo140112F4(RecyclerView.LayoutManager layoutManager) {
        C32226l<? super C101047d, C13598b0> lVar;
        if (layoutManager == null) {
            Log.m105924i(this.f294958f, "reportExposeData failed, recyclerview layoutManager null");
        } else if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int C = linearLayoutManager.mo16957C();
            int E = linearLayoutManager.mo16959E();
            if (E - C > 0) {
                String str = this.f294958f;
                Log.m105918d(str, "visible firstPos:" + C + " lastPos:" + E);
                C61594j jVar = new C61594j(C, E);
                int i = this.f294965p;
                C101047d dVar = new C101047d(0, (String) null, 0, 0, (StringBuilder) null, (StringBuilder) null, 63, (C8480h) null);
                int i2 = jVar.f175175e;
                if (C <= i2) {
                    boolean z = true;
                    while (true) {
                        C100684y yVar = this.f294957e.get(C);
                        if (yVar instanceof C100659j0) {
                            if (!z) {
                                dVar.f295839c.append("#");
                                dVar.f295840d.append("#");
                            }
                            z = false;
                            StringBuilder sb = dVar.f295839c;
                            C101800k70 k702 = ((C100659j0) yVar).f294877a;
                            sb.append(k702 != null ? k702.f298586d : null);
                            dVar.f295840d.append((C + 1) - i);
                        }
                        if (C == i2) {
                            break;
                        }
                        C++;
                    }
                }
                if ((!Util.isNullOrNil(dVar.f295839c.toString()) || !Util.isNullOrNil(dVar.f295840d.toString())) && (lVar = this.f294966q) != null) {
                    lVar.invoke(dVar);
                }
            }
        }
    }

    public int getItemCount() {
        return this.f294957e.size();
    }

    public int getItemViewType(int i) {
        C100684y yVar = (C100684y) C110818d0.m150917O(this.f294957e, i);
        if (yVar != null) {
            return yVar.getType();
        }
        return 0;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.mo17043c(new C77059d(this));
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C32224a<C13598b0> aVar;
        C100657j jVar = (C100657j) zVar;
        C87412m.m108594g(jVar, "holder");
        jVar.mo140091y(this.f294957e.get(i), new ArrayList());
        if (this.f294960h != null) {
            int itemCount = (getItemCount() - 1) - this.f294962j;
            if (itemCount < 0) {
                itemCount = 0;
            }
            if (i == itemCount && this.f294963n != 0 && (aVar = this.f294960h) != null) {
                aVar.invoke();
            }
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 4) {
            View inflate = from.inflate(C0966R.C0971layout.cko, viewGroup, false);
            Context context = this.f294956d;
            C87412m.m108593f(inflate, "itemView");
            return new C100677c(context, inflate, this.f294959g, (C32224a) null, 8, (C8480h) null);
        } else if (i != 8) {
            View inflate2 = from.inflate(C0966R.C0971layout.ckn, viewGroup, false);
            this.f294965p++;
            C87412m.m108593f(inflate2, "itemView");
            return new C100675a(inflate2);
        } else {
            View inflate3 = from.inflate(C0966R.C0971layout.ckj, viewGroup, false);
            C87412m.m108593f(inflate3, "itemView");
            return new C100676b(inflate3);
        }
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C100657j jVar = (C100657j) zVar;
        C87412m.m108594g(jVar, "holder");
        C87412m.m108594g(list, "payloads");
        if (!list.isEmpty()) {
            jVar.mo140091y(this.f294957e.get(i), list);
        } else {
            super.onBindViewHolder(jVar, i, list);
        }
    }
}
