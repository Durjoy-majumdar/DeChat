package qk1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54785k6;
import cl1.C54994o1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.LinkedList;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import p629ny.C76979h;
import rx3.C13598b0;

/* renamed from: qk1.v2 */
public final class C63267v2 extends RecyclerView.C16613e<C63268a> {

    /* renamed from: d */
    public final C45795b f179549d;

    /* renamed from: e */
    public final String f179550e = "finder_live_sing_song_play.pag";

    /* renamed from: f */
    public LinkedList<C54785k6> f179551f = new LinkedList<>();

    /* renamed from: g */
    public final boolean f179552g = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76821Vb();

    /* renamed from: h */
    public final int f179553h = 1;

    /* renamed from: i */
    public final int f179554i = 8;

    /* renamed from: j */
    public C32226l<? super C54785k6, C13598b0> f179555j;

    /* renamed from: n */
    public C32226l<? super Integer, C13598b0> f179556n;

    /* renamed from: o */
    public int f179557o;

    /* renamed from: qk1.v2$a */
    public final class C63268a extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f179558A;

        /* renamed from: B */
        public TextView f179559B;

        /* renamed from: C */
        public TextView f179560C;

        /* renamed from: D */
        public TextView f179561D;

        /* renamed from: E */
        public ConstraintLayout f179562E;

        /* renamed from: z */
        public PAGView f179563z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63268a(C63267v2 v2Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f179563z = (PAGView) view.findViewById(C0966R.C0970id.f359213mw3);
            this.f179558A = (TextView) view.findViewById(C0966R.C0970id.f359211mw1);
            this.f179559B = (TextView) view.findViewById(C0966R.C0970id.f359210mw0);
            this.f179560C = (TextView) view.findViewById(C0966R.C0970id.mwa);
            this.f179561D = (TextView) view.findViewById(C0966R.C0970id.mvs);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C0966R.C0970id.mvp);
            this.f179562E = (ConstraintLayout) view.findViewById(C0966R.C0970id.mvv);
            PAGView pAGView = this.f179563z;
            if (pAGView != null) {
                pAGView.setComposition(PAGFile.Load(pAGView.getContext().getAssets(), v2Var.f179550e));
            }
            PAGView pAGView2 = this.f179563z;
            if (pAGView2 != null) {
                pAGView2.setRepeatCount(0);
            }
        }
    }

    public C63267v2(C45795b bVar) {
        C87412m.m108594g(bVar, "liveData");
        this.f179549d = bVar;
        C58739j4.f168176a.mo83714i0("FinderLiveAnchorSingSongListAdapter");
        this.f179551f.addAll(((C54994o1) bVar.mo71262a(C54994o1.class)).f154399f.f153479b);
    }

    public int getItemCount() {
        return this.f179551f.size();
    }

    public int getItemViewType(int i) {
        return this.f179551f.get(i).f153568c;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C63268a aVar = (C63268a) zVar;
        C87412m.m108594g(aVar, "holder");
        Class cls = C76979h.class;
        C54785k6 k6Var = this.f179551f.get(i);
        C87412m.m108593f(k6Var, "dataList[position]");
        C54785k6 k6Var2 = k6Var;
        aVar.f179559B.setText(((C76979h) C86312j.m106911c(cls)).yp0(MMApplicationContext.getContext(), k6Var2.f153566a, aVar.f179559B.getTextSize()));
        if (k6Var2.f153567b > 0) {
            aVar.f179561D.setText(((C76979h) C86312j.m106911c(cls)).yp0(MMApplicationContext.getContext(), String.valueOf(k6Var2.f153567b), aVar.f179561D.getTextSize()));
            aVar.f179561D.setVisibility(0);
        } else {
            aVar.f179561D.setVisibility(8);
        }
        aVar.f179560C.setText(((C76979h) C86312j.m106911c(cls)).yp0(MMApplicationContext.getContext(), k6Var2.f153573h, aVar.f179560C.getTextSize()));
        PAGView pAGView = aVar.f179563z;
        C87412m.m108593f(pAGView, "holder.singSongIcon");
        if (k6Var2.f153568c != 4) {
            if (this.f179552g) {
                pAGView.stop();
            }
            pAGView.setVisibility(8);
        } else if (this.f179552g) {
            pAGView.setVisibility(0);
            if (!pAGView.isPlaying()) {
                pAGView.play();
            }
        } else {
            pAGView.setVisibility(8);
        }
        if (k6Var2.f153568c != 2) {
            int i2 = (i + 1) - this.f179557o;
            int i3 = this.f179553h;
            if (i2 == i3) {
                aVar.f179558A.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3406rr));
                aVar.f179558A.setTextSize(1, 22.0f);
            } else if (i2 == i3 + 1) {
                aVar.f179558A.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3408rt));
                aVar.f179558A.setTextSize(1, 22.0f);
            } else if (i2 == i3 + 2) {
                aVar.f179558A.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3407rs));
                aVar.f179558A.setTextSize(1, 22.0f);
            } else {
                aVar.f179558A.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_6));
                aVar.f179558A.setTextSize(1, 15.0f);
            }
            aVar.f179558A.setText(String.valueOf(i2));
        }
        if (k6Var2.f153568c == 4) {
            aVar.f179563z.setVisibility(0);
            aVar.f179558A.setVisibility(8);
            aVar.f179559B.setTextColor(aVar.f44854d.getResources().getColor(C0966R.color.f2939n));
            aVar.f179560C.setTextColor(aVar.f44854d.getResources().getColor(C0966R.color.Brand_Alpha_0_5));
        } else {
            aVar.f179563z.setVisibility(8);
            aVar.f179558A.setVisibility(0);
            aVar.f179559B.setTextColor(aVar.f44854d.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            aVar.f179560C.setTextColor(aVar.f44854d.getResources().getColor(C0966R.color.f3553xj));
        }
        CharSequence text = aVar.f179560C.getText();
        if (!(text == null || text.length() == 0)) {
            aVar.f179560C.setVisibility(0);
        } else {
            aVar.f179560C.setVisibility(8);
        }
        aVar.f44854d.setOnClickListener(new C63272w2(this, k6Var2));
        if (i < this.f179554i || i != this.f179551f.size() - 1) {
            aVar.f179562E.setVisibility(8);
        } else {
            aVar.f179562E.setVisibility(0);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.cte, (ViewGroup) null);
        C87412m.m108593f(inflate, "itemView");
        return new C63268a(this, inflate);
    }
}
