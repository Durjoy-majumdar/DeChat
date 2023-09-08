package mw2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bw2.C92326a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import kw2.C99266g;
import rx3.C13598b0;

/* renamed from: mw2.a */
public final class C100007a extends RecyclerView.C16613e<C100012d> {

    /* renamed from: d */
    public final String f293005d = "loadingMore";

    /* renamed from: e */
    public final String f293006e = "favorite";

    /* renamed from: f */
    public final int f293007f = 1;

    /* renamed from: g */
    public final int f293008g = 2;

    /* renamed from: h */
    public ArrayList<C100013c> f293009h = new ArrayList<>();

    /* renamed from: i */
    public final int f293010i;

    /* renamed from: j */
    public boolean f293011j;

    /* renamed from: n */
    public int f293012n;

    /* renamed from: o */
    public C32226l<? super C99266g, C13598b0> f293013o;

    /* renamed from: p */
    public C32224a<C13598b0> f293014p;

    /* renamed from: mw2.a$a */
    public final class C100008a extends C100012d {

        /* renamed from: z */
        public final /* synthetic */ C100007a f293015z;

        /* renamed from: mw2.a$a$a */
        public static final class C100009a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C100007a f293016d;

            public C100009a(C100007a aVar) {
                this.f293016d = aVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/story/ui/album/StoryAlbumAdapter$StoryAlbumFavHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C32224a<C13598b0> aVar = this.f293016d.f293014p;
                if (aVar != null) {
                    aVar.invoke();
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/album/StoryAlbumAdapter$StoryAlbumFavHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100008a(C100007a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "view");
            this.f293015z = aVar;
        }

        /* renamed from: y */
        public void mo139350y(int i) {
            this.f44854d.setOnClickListener(new C100009a(this.f293015z));
        }
    }

    /* renamed from: mw2.a$b */
    public final class C100010b extends C100012d {

        /* renamed from: A */
        public ImageView f293017A;

        /* renamed from: B */
        public final /* synthetic */ C100007a f293018B;

        /* renamed from: z */
        public ViewGroup f293019z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100010b(C100007a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "view");
            this.f293018B = aVar;
            View findViewById = view.findViewById(C0966R.C0970id.g3g);
            C87412m.m108593f(findViewById, "view.findViewById(R.id.loading_more_state)");
            this.f293019z = (ViewGroup) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.f5729n1);
            C87412m.m108593f(findViewById2, "view.findViewById(R.id.album_is_all_view)");
            this.f293017A = (ImageView) findViewById2;
        }

        /* renamed from: y */
        public void mo139350y(int i) {
            C100007a aVar = this.f293018B;
            if (aVar.f293011j) {
                this.f293019z.setVisibility(8);
                this.f293017A.setVisibility(0);
                return;
            }
            int i2 = aVar.f293012n;
            StoryCore.f281736t.mo134192j();
            if (i2 > MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getInt("story_respone_count", 20)) {
                this.f293019z.setVisibility(0);
                this.f293017A.setVisibility(8);
                return;
            }
            this.f293019z.setVisibility(0);
            this.f293017A.setVisibility(8);
        }
    }

    /* renamed from: mw2.a$c */
    public final class C100011c extends C100012d {

        /* renamed from: A */
        public TextView f293020A;

        /* renamed from: B */
        public RecyclerView f293021B;

        /* renamed from: C */
        public C100014d f293022C = new C100014d();

        /* renamed from: D */
        public GridLayoutManager f293023D;

        /* renamed from: E */
        public final /* synthetic */ C100007a f293024E;

        /* renamed from: z */
        public TextView f293025z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100011c(C100007a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "view");
            this.f293024E = aVar;
            View findViewById = view.findViewById(C0966R.C0970id.f5759nv);
            C87412m.m108593f(findViewById, "view.findViewById(R.id.a…_item_decoration_year_tv)");
            this.f293025z = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.f5758nu);
            C87412m.m108593f(findViewById2, "view.findViewById(R.id.a…item_decoration_month_tv)");
            this.f293020A = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.f5756ns);
            C87412m.m108593f(findViewById3, "view.findViewById(R.id.a…tem_decoration_grid_view)");
            this.f293021B = (RecyclerView) findViewById3;
            this.f293023D = new GridLayoutManager(view.getContext(), 4);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0053  */
        /* renamed from: y */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo139350y(int r12) {
            /*
                r11 = this;
                mw2.a r0 = r11.f293024E
                java.util.ArrayList<mw2.c> r0 = r0.f293009h
                java.lang.Object r0 = r0.get(r12)
                java.lang.String r1 = "mItemList[position]"
                gy3.C87412m.m108593f(r0, r1)
                mw2.c r0 = (mw2.C100013c) r0
                r1 = 1
                if (r12 <= 0) goto L_0x0035
                mw2.a r2 = r11.f293024E
                java.util.ArrayList<mw2.c> r2 = r2.f293009h
                int r12 = r12 - r1
                java.lang.Object r2 = r2.get(r12)
                mw2.c r2 = (mw2.C100013c) r2
                java.lang.String r2 = r2.f293026a
                mw2.a r3 = r11.f293024E
                java.lang.String r3 = r3.f293006e
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r3)
                if (r2 != 0) goto L_0x0035
                mw2.a r2 = r11.f293024E
                java.util.ArrayList<mw2.c> r2 = r2.f293009h
                java.lang.Object r12 = r2.get(r12)
                mw2.c r12 = (mw2.C100013c) r12
                goto L_0x0036
            L_0x0035:
                r12 = 0
            L_0x0036:
                mw2.a r2 = r11.f293024E
                r2.getClass()
                android.widget.TextView r2 = r11.f293020A
                r3 = 0
                r2.setVisibility(r3)
                java.lang.String r2 = r0.f293026a
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                java.lang.String r5 = ":"
                r4 = r2
                int r4 = z04.C112550d0.m153769E(r4, r5, r6, r7, r8, r9)
                r5 = -1
                r10 = 8
                if (r4 == r5) goto L_0x00c0
                java.lang.String r4 = ":"
                java.lang.String[] r5 = new java.lang.String[]{r4}
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                r4 = r2
                java.util.List r2 = z04.C112550d0.m153785U(r4, r5, r6, r7, r8, r9)
                int r4 = r2.size()
                r5 = 2
                if (r4 != r5) goto L_0x00ca
                android.widget.TextView r4 = r11.f293020A
                java.lang.Object r1 = r2.get(r1)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r4.setText(r1)
                if (r12 == 0) goto L_0x008c
                java.util.List<kw2.g> r1 = r12.f293027b
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x007f
                goto L_0x008c
            L_0x007f:
                java.util.List<kw2.g> r12 = r12.f293027b
                java.lang.Object r12 = r12.get(r3)
                kw2.g r12 = (kw2.C99266g) r12
                kw2.i r12 = r12.f291069p
                int r12 = r12.f291078L
                goto L_0x008d
            L_0x008c:
                r12 = 0
            L_0x008d:
                java.util.List<kw2.g> r1 = r0.f293027b
                java.lang.Object r1 = r1.get(r3)
                kw2.g r1 = (kw2.C99266g) r1
                kw2.i r1 = r1.f291069p
                int r1 = r1.f291078L
                java.lang.Object r2 = r2.get(r3)
                java.lang.String r2 = (java.lang.String) r2
                int r12 = r12 / 10000
                int r1 = r1 / 10000
                if (r12 != 0) goto L_0x00ab
                mw2.a r4 = r11.f293024E
                int r4 = r4.f293010i
                if (r1 != r4) goto L_0x00af
            L_0x00ab:
                if (r12 == 0) goto L_0x00ba
                if (r1 == r12) goto L_0x00ba
            L_0x00af:
                android.widget.TextView r12 = r11.f293025z
                r12.setVisibility(r3)
                android.widget.TextView r12 = r11.f293025z
                r12.setText(r2)
                goto L_0x00ca
            L_0x00ba:
                android.widget.TextView r12 = r11.f293025z
                r12.setVisibility(r10)
                goto L_0x00ca
            L_0x00c0:
                android.widget.TextView r12 = r11.f293020A
                r12.setText(r2)
                android.widget.TextView r12 = r11.f293025z
                r12.setVisibility(r10)
            L_0x00ca:
                androidx.recyclerview.widget.RecyclerView r12 = r11.f293021B
                androidx.recyclerview.widget.GridLayoutManager r1 = r11.f293023D
                r12.setLayoutManager(r1)
                androidx.recyclerview.widget.RecyclerView r12 = r11.f293021B
                mw2.d r1 = r11.f293022C
                r12.setAdapter(r1)
                mw2.d r12 = r11.f293022C
                mw2.a r1 = r11.f293024E
                fy3.l<? super kw2.g, rx3.b0> r1 = r1.f293013o
                r12.f293029e = r1
                java.util.List<kw2.g> r0 = r0.f293027b
                java.lang.String r1 = "datas"
                gy3.C87412m.m108594g(r0, r1)
                java.util.ArrayList<kw2.g> r1 = r12.f293028d
                r1.clear()
                java.util.ArrayList<kw2.g> r1 = r12.f293028d
                r1.addAll(r0)
                r12.notifyDataSetChanged()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mw2.C100007a.C100011c.mo139350y(int):void");
        }
    }

    /* renamed from: mw2.a$d */
    public abstract class C100012d extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100012d(C100007a aVar, View view) {
            super(view);
            C87412m.m108594g(view, "view");
        }

        /* renamed from: y */
        public abstract void mo139350y(int i);
    }

    public C100007a() {
        new ArrayList();
        C92326a.C92327a aVar = C92326a.f264186a;
        this.f293010i = new GregorianCalendar().get(1);
    }

    public int getItemCount() {
        return this.f293009h.size();
    }

    public int getItemViewType(int i) {
        if (Util.isEqual(this.f293009h.get(i).f293026a, this.f293005d)) {
            return this.f293007f;
        }
        if (Util.isEqual(this.f293009h.get(i).f293026a, this.f293006e)) {
            return this.f293008g;
        }
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C100012d dVar = (C100012d) zVar;
        C87412m.m108594g(dVar, "holder");
        Log.m105918d("MicroMsg.StoryAlbumAdapter", "onBindViewHolder " + i);
        dVar.mo139350y(i);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.C16631z zVar;
        C87412m.m108594g(viewGroup, "parent");
        Log.m105918d("MicroMsg.StoryAlbumAdapter", "onCreateViewHolder");
        if (i == this.f293007f) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f360022c62, viewGroup, false);
            C87412m.m108593f(inflate, "from(parent.context).inf…ng_layout, parent, false)");
            zVar = new C100010b(this, inflate);
        } else if (i == this.f293008g) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f360020c60, viewGroup, false);
            C87412m.m108593f(inflate2, "from(parent.context).inf…ce_layout, parent, false)");
            zVar = new C100008a(this, inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f360021c61, viewGroup, false);
            C87412m.m108593f(inflate3, "from(parent.context).inf…em_layout, parent, false)");
            zVar = new C100011c(this, inflate3);
        }
        if (zVar instanceof C100011c) {
            ((C100011c) zVar).f293021B.mo17085h0(new C11092b());
        }
        return zVar;
    }
}
