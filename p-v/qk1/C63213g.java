package qk1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54768h6;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.ArrayList;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import p629ny.C76979h;
import rx3.C13598b0;
import te3.C51922x41;

/* renamed from: qk1.g */
public final class C63213g extends RecyclerView.C16613e<C63214a> {

    /* renamed from: d */
    public final C45795b f179374d;

    /* renamed from: e */
    public final String f179375e = "FinderLiveAnchorMusicAdapter";

    /* renamed from: f */
    public final String f179376f = "finder_live_music_play.pag";

    /* renamed from: g */
    public ArrayList<C54768h6> f179377g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<C54768h6> f179378h = new ArrayList<>();

    /* renamed from: i */
    public C54768h6 f179379i = new C54768h6(new C51922x41(), 0, 0, 1, false, 16, (C8480h) null);

    /* renamed from: j */
    public ArrayList<C54768h6> f179380j = new ArrayList<>();

    /* renamed from: n */
    public C32228q<? super View, ? super Integer, ? super C54768h6, C13598b0> f179381n;

    /* renamed from: o */
    public C32228q<? super View, ? super Integer, ? super C54768h6, C13598b0> f179382o;

    /* renamed from: p */
    public final boolean f179383p = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76821Vb();

    /* renamed from: qk1.g$a */
    public class C63214a extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63214a(C63213g gVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: qk1.g$b */
    public final class C63215b extends C63214a {

        /* renamed from: z */
        public TextView f179384z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63215b(C63213g gVar, View view) {
            super(gVar, view);
            C87412m.m108594g(view, "itemView");
            this.f179384z = (TextView) view.findViewById(C0966R.C0970id.h5w);
        }
    }

    /* renamed from: qk1.g$c */
    public final class C63216c extends C63214a {

        /* renamed from: A */
        public TextView f179385A;

        /* renamed from: B */
        public TextView f179386B;

        /* renamed from: C */
        public WeImageView f179387C;

        /* renamed from: z */
        public PAGView f179388z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63216c(C63213g gVar, View view) {
            super(gVar, view);
            C87412m.m108594g(view, "itemView");
            this.f179388z = (PAGView) view.findViewById(C0966R.C0970id.h6h);
            this.f179385A = (TextView) view.findViewById(C0966R.C0970id.h6u);
            this.f179386B = (TextView) view.findViewById(C0966R.C0970id.jll);
            this.f179387C = (WeImageView) view.findViewById(C0966R.C0970id.f358928hx1);
            PAGView pAGView = this.f179388z;
            if (pAGView != null) {
                pAGView.setComposition(PAGFile.Load(pAGView.getContext().getAssets(), gVar.f179376f));
            }
            PAGView pAGView2 = this.f179388z;
            if (pAGView2 != null) {
                pAGView2.setRepeatCount(0);
            }
        }
    }

    public C63213g(C45795b bVar) {
        C87412m.m108594g(bVar, "liveData");
        this.f179374d = bVar;
        C58739j4.f168176a.mo83714i0("FinderLiveAnchorMusicAdapter");
        this.f179378h.add(this.f179379i);
        this.f179380j.addAll(((C54991o) bVar.mo71262a(C54991o.class)).f154232N2.f153469f);
        this.f179377g.addAll(this.f179378h);
        this.f179377g.addAll(this.f179380j);
    }

    /* renamed from: F4 */
    public static void m74556F4(C63213g gVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        gVar.f179378h.clear();
        gVar.f179378h.add(gVar.f179379i);
        gVar.f179380j.clear();
        gVar.f179380j.addAll(((C54991o) gVar.f179374d.mo71262a(C54991o.class)).f154232N2.f153469f);
        gVar.f179377g.clear();
        gVar.f179377g.addAll(gVar.f179378h);
        gVar.f179377g.addAll(gVar.f179380j);
        if (z) {
            gVar.notifyDataSetChanged();
        }
    }

    public int getItemCount() {
        return this.f179377g.size();
    }

    public int getItemViewType(int i) {
        return this.f179377g.get(i).f153501d;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C63214a aVar = (C63214a) zVar;
        C87412m.m108594g(aVar, "holder");
        if (aVar instanceof C63216c) {
            C63216c cVar = (C63216c) aVar;
            Class cls = C76979h.class;
            C54768h6 h6Var = this.f179377g.get(i);
            C87412m.m108593f(h6Var, "dataList[position]");
            C54768h6 h6Var2 = h6Var;
            cVar.f179385A.setText(((C76979h) C86312j.m106911c(cls)).yp0(MMApplicationContext.getContext(), h6Var2.f153498a.f144443e, cVar.f179385A.getTextSize()));
            cVar.f179386B.setText(((C76979h) C86312j.m106911c(cls)).yp0(MMApplicationContext.getContext(), h6Var2.f153498a.f144444f, cVar.f179386B.getTextSize()));
            PAGView pAGView = cVar.f179388z;
            C87412m.m108593f(pAGView, "holder.musicIcon");
            int i2 = h6Var2.f153499b;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (this.f179383p) {
                        pAGView.stop();
                    }
                    pAGView.setVisibility(8);
                } else if (this.f179383p) {
                    pAGView.stop();
                    pAGView.setProgress(0.0d);
                    pAGView.setVisibility(0);
                } else {
                    pAGView.setVisibility(8);
                }
            } else if (this.f179383p) {
                pAGView.setVisibility(0);
                if (!pAGView.isPlaying()) {
                    pAGView.play();
                }
            } else {
                pAGView.setVisibility(8);
            }
            int i3 = h6Var2.f153499b;
            if (i3 == 1) {
                cVar.f179387C.setVisibility(0);
                cVar.f179387C.setImageResource(C0966R.raw.icons_filled_pause);
                cVar.f179385A.setTextColor(cVar.f44854d.getResources().getColor(C0966R.color.f3424sc));
                cVar.f179386B.setTextColor(cVar.f44854d.getResources().getColor(C0966R.color.f3425se));
            } else if (i3 != 2) {
                cVar.f179387C.setVisibility(8);
                cVar.f179385A.setTextColor(cVar.f44854d.getResources().getColor(C0966R.color.FG_0_CARE));
                cVar.f179386B.setTextColor(cVar.f44854d.getResources().getColor(C0966R.color.BW_0_Alpha_0_5));
            } else {
                cVar.f179387C.setVisibility(0);
                cVar.f179387C.setImageResource(C0966R.raw.icons_filled_play);
                cVar.f179385A.setTextColor(cVar.f44854d.getResources().getColor(C0966R.color.f3424sc));
                cVar.f179386B.setTextColor(cVar.f44854d.getResources().getColor(C0966R.color.f3425se));
            }
            cVar.f44854d.setOnClickListener(new C63217h(this, i, h6Var2));
            cVar.f44854d.setOnLongClickListener(new C63220i(this, i, h6Var2));
        } else if (aVar instanceof C63215b) {
            int size = this.f179380j.size();
            ((C63215b) aVar).f179384z.setText(MMApplicationContext.getContext().getResources().getString(C0966R.string.dfq, new Object[]{Integer.valueOf(size)}));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.ae8, viewGroup, false);
            C87412m.m108593f(inflate, "itemView");
            return new C63215b(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.aef, viewGroup, false);
        C87412m.m108593f(inflate2, "itemView");
        return new C63216c(this, inflate2);
    }
}
