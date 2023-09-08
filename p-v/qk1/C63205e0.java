package qk1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54785k6;
import cl1.C54991o;
import cl1.C54994o1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import nj3.C76912y0;
import ok1.C62042e;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import p629ny.C76979h;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;

/* renamed from: qk1.e0 */
public final class C63205e0 extends RecyclerView.C16613e<C63206a> {

    /* renamed from: d */
    public final C45795b f179336d;

    /* renamed from: e */
    public final Context f179337e;

    /* renamed from: f */
    public final String f179338f = "FinderLiveAnchorSingSongListAdapter";

    /* renamed from: g */
    public final String f179339g = "finder_live_sing_song_play.pag";

    /* renamed from: h */
    public ArrayList<C54785k6> f179340h = new ArrayList<>();

    /* renamed from: i */
    public C32227p<? super Integer, ? super C54785k6, C13598b0> f179341i;

    /* renamed from: j */
    public C32228q<? super View, ? super Integer, ? super C54785k6, C13598b0> f179342j;

    /* renamed from: n */
    public C32227p<? super Integer, ? super C54785k6, C13598b0> f179343n;

    /* renamed from: o */
    public C32226l<? super Integer, C13598b0> f179344o;

    /* renamed from: p */
    public final boolean f179345p = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76821Vb();

    /* renamed from: q */
    public final String f179346q = "-";

    /* renamed from: r */
    public final int f179347r = 1;

    /* renamed from: s */
    public int f179348s;

    /* renamed from: t */
    public final int f179349t = 8;

    /* renamed from: qk1.e0$a */
    public final class C63206a extends RecyclerView.C16631z {

        /* renamed from: A */
        public PAGView f179350A;

        /* renamed from: B */
        public TextView f179351B;

        /* renamed from: C */
        public TextView f179352C;

        /* renamed from: D */
        public TextView f179353D;

        /* renamed from: E */
        public TextView f179354E;

        /* renamed from: F */
        public ConstraintLayout f179355F;

        /* renamed from: G */
        public RelativeLayout f179356G;

        /* renamed from: H */
        public TextView f179357H;

        /* renamed from: z */
        public FrameLayout f179358z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63206a(C63205e0 e0Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f179358z = (FrameLayout) view.findViewById(C0966R.C0970id.mvw);
            this.f179350A = (PAGView) view.findViewById(C0966R.C0970id.f359213mw3);
            this.f179351B = (TextView) view.findViewById(C0966R.C0970id.f359211mw1);
            this.f179352C = (TextView) view.findViewById(C0966R.C0970id.f359210mw0);
            this.f179353D = (TextView) view.findViewById(C0966R.C0970id.mwa);
            this.f179354E = (TextView) view.findViewById(C0966R.C0970id.mv8);
            this.f179355F = (ConstraintLayout) view.findViewById(C0966R.C0970id.mvv);
            this.f179356G = (RelativeLayout) view.findViewById(C0966R.C0970id.mv_);
            this.f179357H = (TextView) view.findViewById(C0966R.C0970id.mvs);
            PAGView pAGView = this.f179350A;
            if (pAGView != null) {
                pAGView.setComposition(PAGFile.Load(pAGView.getContext().getAssets(), e0Var.f179339g));
            }
            PAGView pAGView2 = this.f179350A;
            if (pAGView2 != null) {
                pAGView2.setRepeatCount(0);
            }
        }
    }

    /* renamed from: qk1.e0$b */
    public static final class C63207b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C54785k6 f179359d;

        /* renamed from: e */
        public final /* synthetic */ C63205e0 f179360e;

        /* renamed from: f */
        public final /* synthetic */ int f179361f;

        public C63207b(C54785k6 k6Var, C63205e0 e0Var, int i) {
            this.f179359d = k6Var;
            this.f179360e = e0Var;
            this.f179361f = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C54785k6 k6Var = this.f179359d;
            if (k6Var.f153568c == 4) {
                this.f179360e.mo88118O4(this.f179361f, k6Var);
            } else {
                C63205e0 e0Var = this.f179360e;
                int i = this.f179361f;
                e0Var.getClass();
                C87412m.m108594g(k6Var, "songItem");
                String str = e0Var.f179338f;
                Log.m105924i(str, k6Var.f153566a + ", MUSIC_PLAY}");
                C32227p<? super Integer, ? super C54785k6, C13598b0> pVar = e0Var.f179341i;
                if (pVar != null) {
                    pVar.invoke(Integer.valueOf(i), k6Var);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qk1.e0$c */
    public static final class C63208c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63205e0 f179362d;

        /* renamed from: e */
        public final /* synthetic */ C54785k6 f179363e;

        /* renamed from: f */
        public final /* synthetic */ int f179364f;

        public C63208c(C63205e0 e0Var, C54785k6 k6Var, int i) {
            this.f179362d = e0Var;
            this.f179363e = k6Var;
            this.f179364f = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Boolean value = ((C54994o1) this.f179362d.f179336d.mo71262a(C54994o1.class)).f154402i.getValue();
            if (value == null) {
                value = Boolean.FALSE;
            }
            if (!value.booleanValue()) {
                Context context = this.f179362d.f179337e;
                C76912y0.m92767f(context, context.getResources().getString(C0966R.string.ma_));
            } else if (this.f179363e.f153570e) {
                C63205e0 e0Var = this.f179362d;
                ArrayList<C54785k6> arrayList2 = e0Var.f179340h;
                int i = this.f179364f;
                int i2 = 0;
                for (T next : arrayList2) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C54785k6 k6Var = (C54785k6) next;
                        if (i2 == i) {
                            e0Var.notifyItemChanged(i2, Boolean.TRUE);
                        } else {
                            e0Var.notifyItemChanged(i2, Boolean.FALSE);
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            } else {
                Context context2 = this.f179362d.f179337e;
                C76912y0.m92767f(context2, context2.getResources().getString(C0966R.string.mbf));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qk1.e0$d */
    public static final class C63209d implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C63205e0 f179365d;

        /* renamed from: e */
        public final /* synthetic */ int f179366e;

        /* renamed from: f */
        public final /* synthetic */ C54785k6 f179367f;

        public C63209d(C63205e0 e0Var, int i, C54785k6 k6Var) {
            this.f179365d = e0Var;
            this.f179366e = i;
            this.f179367f = k6Var;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            String str = this.f179365d.f179338f;
            Log.m105924i(str, "onLongClickListener position:" + this.f179366e + ",dataList.size:" + this.f179365d.f179340h.size());
            C32228q<? super View, ? super Integer, ? super C54785k6, C13598b0> qVar = this.f179365d.f179342j;
            if (qVar != null) {
                C87412m.m108593f(view, LocaleUtil.ITALIAN);
                qVar.invoke(view, Integer.valueOf(this.f179366e), this.f179367f);
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    public C63205e0(C45795b bVar, Context context) {
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(context, "context");
        this.f179336d = bVar;
        this.f179337e = context;
        C58739j4.f168176a.mo83714i0("FinderLiveAnchorSingSongListAdapter");
        this.f179340h.addAll(((C54994o1) bVar.mo71262a(C54994o1.class)).f154399f.f153479b);
    }

    /* renamed from: F4 */
    public final void mo88116F4(C63206a aVar, boolean z) {
        C87412m.m108594g(aVar, "holder");
        if (z) {
            aVar.f179354E.setText(this.f179337e.getResources().getString(C0966R.string.mbr));
            TextView textView = aVar.f179354E;
            textView.setBackground(textView.getContext().getResources().getDrawable(C0966R.C0969drawable.b8p));
            return;
        }
        aVar.f179354E.setText(this.f179337e.getResources().getString(C0966R.string.mbz));
        TextView textView2 = aVar.f179354E;
        textView2.setBackground(textView2.getContext().getResources().getDrawable(C0966R.C0969drawable.b8q));
    }

    /* renamed from: G4 */
    public final void mo88117G4(C63206a aVar, int i) {
        C63206a aVar2 = aVar;
        int i2 = i;
        Class cls = C76979h.class;
        C54785k6 k6Var = this.f179340h.get(i2);
        C87412m.m108593f(k6Var, "dataList[position]");
        C54785k6 k6Var2 = k6Var;
        boolean z = this.f179340h.get(i2).f153570e;
        C87412m.m108594g(aVar2, "holder");
        if (z) {
            aVar2.f179351B.setAlpha(1.0f);
            aVar2.f179352C.setAlpha(1.0f);
            aVar2.f179353D.setAlpha(1.0f);
            aVar2.f179357H.setAlpha(1.0f);
        } else {
            aVar2.f179351B.setAlpha(0.3f);
            aVar2.f179352C.setAlpha(0.3f);
            aVar2.f179353D.setAlpha(0.3f);
            aVar2.f179357H.setAlpha(0.3f);
        }
        aVar2.f179352C.setText(((C76979h) C86312j.m106911c(cls)).yp0(MMApplicationContext.getContext(), k6Var2.f153566a, aVar2.f179352C.getTextSize()));
        aVar2.f179357H.setText(k6Var2.f153567b > 0 ? ((C76979h) C86312j.m106911c(cls)).yp0(MMApplicationContext.getContext(), String.valueOf(k6Var2.f153567b), aVar2.f179357H.getTextSize()) : this.f179346q);
        String str = k6Var2.f153573h;
        if (!(str == null || str.length() == 0)) {
            aVar2.f179353D.setText(((C76979h) C86312j.m106911c(cls)).yp0(MMApplicationContext.getContext(), k6Var2.f153573h, aVar2.f179353D.getTextSize()));
            aVar2.f179353D.setVisibility(0);
        } else {
            aVar2.f179353D.setVisibility(8);
        }
        if (((C54991o) this.f179336d.mo71262a(C54991o.class)).mo75999e4()) {
            aVar2.f179358z.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = aVar2.f179356G.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = C76577a.m92151b(aVar2.f44854d.getContext(), 8);
            if (aVar2.f179354E.getVisibility() == 8) {
                aVar2.f179357H.setVisibility(0);
            }
            PAGView pAGView = aVar2.f179350A;
            C87412m.m108593f(pAGView, "holder.singSongIcon");
            if (k6Var2.f153568c != 4) {
                if (this.f179345p) {
                    pAGView.stop();
                }
                pAGView.setVisibility(8);
            } else if (this.f179345p) {
                pAGView.setVisibility(0);
                if (!pAGView.isPlaying()) {
                    pAGView.play();
                }
            } else {
                pAGView.setVisibility(8);
            }
            int i3 = (i2 + 1) - this.f179348s;
            int i4 = this.f179347r;
            if (i3 == i4) {
                aVar2.f179351B.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3406rr));
                aVar2.f179351B.setTextSize(1, 22.0f);
            } else if (i3 == i4 + 1) {
                aVar2.f179351B.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3408rt));
                aVar2.f179351B.setTextSize(1, 22.0f);
            } else if (i3 == i4 + 2) {
                aVar2.f179351B.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3407rs));
                aVar2.f179351B.setTextSize(1, 22.0f);
            } else {
                aVar2.f179351B.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_6));
                aVar2.f179351B.setTextSize(1, 15.0f);
            }
            aVar2.f179351B.setText(String.valueOf(i3));
            if (this.f179340h.get(i2).f153568c == 4) {
                mo88116F4(aVar2, false);
            } else {
                mo88116F4(aVar2, true);
            }
            if (k6Var2.f153568c == 4) {
                aVar2.f179350A.setVisibility(0);
                aVar2.f179351B.setVisibility(8);
                aVar2.f179357H.setVisibility(8);
                aVar2.f179354E.setVisibility(0);
                aVar2.f179352C.setTextColor(aVar2.f44854d.getResources().getColor(C0966R.color.f2939n));
                aVar2.f179353D.setTextColor(aVar2.f44854d.getResources().getColor(C0966R.color.Brand_Alpha_0_5));
            } else {
                aVar2.f179350A.setVisibility(8);
                aVar2.f179351B.setVisibility(0);
                aVar2.f179357H.setVisibility(0);
                aVar2.f179354E.setVisibility(8);
                aVar2.f179352C.setTextColor(aVar2.f44854d.getResources().getColor(C0966R.color.FG_0));
                aVar2.f179353D.setTextColor(aVar2.f44854d.getResources().getColor(C0966R.color.f3553xj));
            }
            if (k6Var2.f153571f) {
                aVar2.f179351B.setText(this.f179346q);
                aVar2.f179351B.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_6));
                aVar2.f179351B.setTextSize(1, 22.0f);
            }
            C62042e eVar = C62042e.f176370a;
            TextView textView = aVar2.f179354E;
            C87412m.m108593f(textView, "holder.singSongClickBtn");
            C62042e.m72803Q1(eVar, textView, 0, 0, 6, (Object) null);
            aVar2.f179354E.setOnClickListener(new C63207b(k6Var2, this, i2));
            aVar2.f44854d.setOnClickListener(new C63208c(this, k6Var2, i2));
        } else {
            ViewGroup.LayoutParams layoutParams2 = aVar2.f179356G.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = C76577a.m92151b(aVar2.f44854d.getContext(), 16);
            aVar2.f179358z.setVisibility(8);
            aVar2.f179353D.setVisibility(8);
            aVar2.f179357H.setVisibility(8);
        }
        if (i2 < this.f179349t || i2 != this.f179340h.size() - 1) {
            aVar2.f179355F.setVisibility(8);
        } else {
            aVar2.f179355F.setVisibility(0);
        }
        aVar2.f44854d.setOnLongClickListener(new C63209d(this, i2, k6Var2));
    }

    /* renamed from: O4 */
    public final void mo88118O4(int i, C54785k6 k6Var) {
        C87412m.m108594g(k6Var, "songItem");
        String str = this.f179338f;
        Log.m105924i(str, this.f179340h.get(i).f153566a + ", MUSIC_DEFAULT}");
        C32227p<? super Integer, ? super C54785k6, C13598b0> pVar = this.f179343n;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(i), k6Var);
        }
    }

    /* renamed from: g5 */
    public final void mo88119g5(boolean z) {
        if (z) {
            LinkedList<String> linkedList = ((C54994o1) this.f179336d.mo71262a(C54994o1.class)).f154404n;
            for (C54785k6 k6Var : this.f179340h) {
                if (!linkedList.contains(k6Var.f153566a)) {
                    k6Var.f153570e = true;
                }
            }
        } else {
            int i = 0;
            for (T next : this.f179340h) {
                int i2 = i + 1;
                if (i >= 0) {
                    C54785k6 k6Var2 = (C54785k6) next;
                    k6Var2.f153570e = false;
                    k6Var2.f153567b = 0;
                    k6Var2.f153573h = "";
                    if (k6Var2.f153568c == 4) {
                        mo88118O4(i, k6Var2);
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f179340h.size();
    }

    public int getItemViewType(int i) {
        return this.f179340h.get(i).f153568c;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C63206a aVar = (C63206a) zVar;
        C87412m.m108594g(aVar, "holder");
        mo88117G4(aVar, i);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.csq, (ViewGroup) null);
        C87412m.m108593f(inflate, "itemView");
        return new C63206a(this, inflate);
    }

    /* renamed from: u5 */
    public final void mo88120u5(boolean z) {
        C32226l<? super Integer, C13598b0> lVar;
        Class cls = C54994o1.class;
        this.f179340h.clear();
        this.f179340h.addAll(((C54994o1) this.f179336d.mo71262a(cls)).f154399f.f153479b);
        if (z) {
            for (C54785k6 k6Var : this.f179340h) {
                k6Var.f153571f = false;
            }
        }
        CharSequence value = ((C54994o1) this.f179336d.mo71262a(cls)).f154401h.getValue();
        if (!(value == null || value.length() == 0)) {
            String value2 = ((C54994o1) this.f179336d.mo71262a(cls)).f154401h.getValue();
            if (value2 == null) {
                value2 = "";
            }
            int i = 0;
            for (T next : this.f179340h) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (C87412m.m108589b(((C54785k6) next).f153566a, value2) && (lVar = this.f179344o) != null) {
                        lVar.invoke(Integer.valueOf(i));
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        Boolean value3 = ((C54994o1) this.f179336d.mo71262a(cls)).f154402i.getValue();
        mo88119g5(value3 != null ? value3.booleanValue() : false);
        LinkedList<String> linkedList = ((C54994o1) this.f179336d.mo71262a(cls)).f154404n;
        Iterator<C54785k6> it = this.f179340h.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            C54785k6 next2 = it.next();
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C54785k6 k6Var2 = next2;
                if (linkedList.contains(k6Var2.f153566a)) {
                    k6Var2.f153570e = false;
                    k6Var2.f153567b = 0;
                    k6Var2.f153573h = "";
                    if (k6Var2.f153568c == 4) {
                        mo88118O4(i3, k6Var2);
                    }
                }
                i3 = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        notifyDataSetChanged();
        C54785k6 k6Var3 = (C54785k6) C110818d0.m150916N(this.f179340h);
        if (k6Var3 != null && k6Var3.f153568c == 4) {
            this.f179348s = 1;
        } else {
            this.f179348s = 0;
        }
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C63206a aVar = (C63206a) zVar;
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(list, "payloads");
        if (list.isEmpty()) {
            mo88117G4(aVar, i);
        } else if (this.f179340h.get(i).f153568c != 4) {
            for (Object next : list) {
                boolean z = next instanceof Boolean;
                if (z && C87412m.m108589b(next, Boolean.TRUE)) {
                    aVar.f179354E.setVisibility(0);
                    aVar.f179357H.setVisibility(8);
                } else if (z && C87412m.m108589b(next, Boolean.FALSE)) {
                    aVar.f179354E.setVisibility(8);
                    aVar.f179357H.setVisibility(0);
                }
            }
        }
    }
}
