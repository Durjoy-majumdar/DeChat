package ho1;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32226l;
import gy3.C87412m;
import hp1.C8703w0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import te3.C49982je3;
import te3.C50951qe3;
import te3.C51692vg1;
import te3.z74;

/* renamed from: ho1.m */
public final class C8637m implements FTSEditTextView.C45051l {

    /* renamed from: d */
    public Context f27771d;

    /* renamed from: e */
    public RefreshLoadMoreLayout f27772e;

    /* renamed from: f */
    public RecyclerView f27773f;

    /* renamed from: g */
    public MMProcessBar f27774g;

    /* renamed from: h */
    public final LinkedList<C51692vg1> f27775h = new LinkedList<>();

    /* renamed from: i */
    public final LinkedList<C51692vg1> f27776i = new LinkedList<>();

    /* renamed from: j */
    public C8639b f27777j;

    /* renamed from: n */
    public C32226l<? super C49982je3, C13598b0> f27778n;

    /* renamed from: o */
    public View f27779o;

    /* renamed from: p */
    public FTSSearchView f27780p;

    /* renamed from: q */
    public String f27781q;

    /* renamed from: r */
    public C8626e f27782r;

    /* renamed from: s */
    public long f27783s;

    /* renamed from: ho1.m$a */
    public static final class C8638a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f27784A;

        /* renamed from: B */
        public final View f27785B;

        /* renamed from: C */
        public final TextView f27786C;

        /* renamed from: z */
        public final TextView f27787z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8638a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.hyn);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.id.poi_name)");
            this.f27787z = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.hyd);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.poi_distance)");
            this.f27784A = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.c7p);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.divider)");
            this.f27785B = findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.hyb);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.id.poi_address)");
            this.f27786C = (TextView) findViewById4;
        }
    }

    /* renamed from: ho1.m$b */
    public final class C8639b extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: ho1.m$b$a */
        public static final class C8640a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C8637m f27789d;

            /* renamed from: e */
            public final /* synthetic */ C49982je3 f27790e;

            public C8640a(C8637m mVar, C49982je3 je32) {
                this.f27789d = mVar;
                this.f27790e = je32;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C32226l<? super C49982je3, C13598b0> lVar = this.f27789d.f27778n;
                if (lVar != null) {
                    lVar.invoke(this.f27790e);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C8639b() {
        }

        public int getItemCount() {
            return C8637m.this.f27775h.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C13598b0 b0Var;
            C50951qe3 qe32;
            C49982je3 je32;
            RecyclerView.C16631z zVar2 = zVar;
            C87412m.m108594g(zVar2, "holder");
            if (zVar2 instanceof C8638a) {
                C51692vg1 vg12 = C8637m.this.f27775h.get(i);
                C87412m.m108593f(vg12, "poiList[position]");
                C51692vg1 vg13 = vg12;
                z74 z74 = vg13.f143476d;
                if (z74 == null || (qe32 = z74.f145743d) == null || (je32 = qe32.f140264d) == null) {
                    b0Var = null;
                } else {
                    C8637m mVar = C8637m.this;
                    String str = vg13.f143477e;
                    boolean z = true;
                    if (str == null || str.length() == 0) {
                        ((C8638a) zVar2).f27787z.setText(je32.f136053e);
                    } else {
                        TextView textView = ((C8638a) zVar2).f27787z;
                        C8703w0 w0Var = C8703w0.f27927a;
                        String str2 = vg13.f143477e;
                        if (str2 == null) {
                            str2 = je32.f136053e;
                        }
                        C87412m.m108593f(str2, "finderPoiInfo.highlight_name ?: brief.Name");
                        textView.setText(w0Var.mo9552c(str2, ""));
                    }
                    String str3 = vg13.f143478f;
                    if (!(str3 == null || str3.length() == 0)) {
                        z = false;
                    }
                    if (z) {
                        ((C8638a) zVar2).f27786C.setText(je32.f136063r);
                    } else {
                        TextView textView2 = ((C8638a) zVar2).f27786C;
                        C8703w0 w0Var2 = C8703w0.f27927a;
                        String str4 = vg13.f143477e;
                        if (str4 == null) {
                            str4 = je32.f136063r;
                        }
                        C87412m.m108593f(str4, "finderPoiInfo.highlight_name ?: brief.FullAddress");
                        textView2.setText(w0Var2.mo9552c(str4, ""));
                    }
                    C8638a aVar = (C8638a) zVar2;
                    aVar.f27784A.setText(je32.f136067v);
                    View view = aVar.f27785B;
                    int i2 = (Util.isNullOrNil(je32.f136067v) || Util.isNullOrNil(aVar.f27786C.getText().toString())) ? 8 : 0;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(Integer.valueOf(i2));
                    View view2 = view;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    zVar2.f44854d.setOnClickListener(new C8640a(mVar, je32));
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    C8638a aVar3 = (C8638a) zVar2;
                    aVar3.f27787z.setVisibility(8);
                    aVar3.f27784A.setVisibility(8);
                    aVar3.f27786C.setVisibility(8);
                    View view3 = aVar3.f27785B;
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiListView$PoiListAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = C85868k2.m106137b(C8637m.this.f27771d).inflate(C0966R.C0971layout.anz, viewGroup, false);
            C87412m.m108593f(inflate, "getInflater(context).inf…list_item, parent, false)");
            return new C8638a(inflate);
        }
    }

    public C8637m(Context context) {
        C87412m.m108594g(context, "context");
        this.f27771d = context;
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
    }

    /* renamed from: a */
    public final void mo9507a() {
        this.f27783s = System.currentTimeMillis();
        Log.m105924i("Finder.FinderProfilePoiListView", "[clearSearch] lastQueryTime=" + this.f27783s);
        this.f27775h.clear();
        this.f27775h.addAll(this.f27776i);
        LinkedList<C51692vg1> linkedList = this.f27775h;
        C87412m.m108594g(linkedList, "list");
        mo9509c(linkedList.size());
        C8639b bVar = this.f27777j;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        } else {
            C87412m.m108603p("adapter");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = (r0 = r0.getFtsEditText()).getEditText();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9508b() {
        /*
            r8 = this;
            com.tencent.mm.ui.search.FTSSearchView r0 = r8.f27780p
            if (r0 == 0) goto L_0x0015
            com.tencent.mm.ui.search.FTSEditTextView r0 = r0.getFtsEditText()
            if (r0 == 0) goto L_0x0015
            android.widget.EditText r0 = r0.getEditText()
            if (r0 == 0) goto L_0x0015
            android.text.Editable r0 = r0.getText()
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            ho1.e r4 = r8.f27782r
            if (r4 == 0) goto L_0x005b
            java.lang.String r3 = r8.f27781q
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[requestPoiSearch] query="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", finderUsername="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " queryTime="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.UserPoiHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 0
            r4.mo9500f(r0)
            com.tencent.mm.plugin.finder.profile.FinderProfilePoiDrawer r0 = r4.f27746g
            if (r0 == 0) goto L_0x005b
            ho1.k r7 = new ho1.k
            r1 = r7
            r1.<init>(r2, r3, r4, r5)
            r0.post(r7)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ho1.C8637m.mo9508b():void");
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        if (str == null || str.length() == 0) {
            mo9507a();
        } else {
            mo9508b();
        }
    }

    /* renamed from: c */
    public final void mo9509c(int i) {
        TextView textView;
        String str;
        View view = this.f27779o;
        if (view != null && (textView = (TextView) view.findViewById(C0966R.C0970id.f357887ca2)) != null) {
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            Resources resources = textView.getContext().getResources();
            if (resources != null) {
                str = resources.getString(C0966R.string.ehn, new Object[]{Integer.valueOf(i)});
            } else {
                str = null;
            }
            textView.setText(str);
        }
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    public void onClickClearTextBtn(View view) {
        mo9507a();
    }

    /* renamed from: y */
    public boolean mo3009y() {
        FTSEditTextView ftsEditText;
        mo9508b();
        FTSSearchView fTSSearchView = this.f27780p;
        if (fTSSearchView == null || (ftsEditText = fTSSearchView.getFtsEditText()) == null) {
            return true;
        }
        ftsEditText.mo70339g();
        return true;
    }
}
