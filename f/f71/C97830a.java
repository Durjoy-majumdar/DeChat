package f71;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b71.C92200j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emojicapture.p841ui.capture.StickerSelectFrame;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k60.C60979d;
import l60.C99342a;
import l60.C99344b;
import rh3.C101380d;
import rx3.C13598b0;
import sh3.C101619a;
import sh3.C101631k;
import sx3.C110818d0;
import te3.C101814mn2;

/* renamed from: f71.a */
public final class C97830a extends RecyclerView.C16613e<C97831a> {

    /* renamed from: d */
    public final ArrayList<C101380d> f286975d = new ArrayList<>();

    /* renamed from: e */
    public int f286976e = -1;

    /* renamed from: f */
    public C32227p<? super Integer, ? super C101380d, C13598b0> f286977f;

    /* renamed from: g */
    public C32226l<? super Integer, C13598b0> f286978g;

    /* renamed from: f71.a$a */
    public abstract class C97831a extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97831a(C97830a aVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }

        /* renamed from: y */
        public abstract void mo137165y(int i, C101814mn2 mn22);
    }

    /* renamed from: f71.a$b */
    public final class C97832b extends C97831a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97832b(C97830a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
        }

        /* renamed from: y */
        public void mo137165y(int i, C101814mn2 mn22) {
            C87412m.m108594g(mn22, "info");
        }
    }

    /* renamed from: f71.a$c */
    public final class C97833c extends C97831a {

        /* renamed from: A */
        public final TextView f286979A;

        /* renamed from: B */
        public final StickerSelectFrame f286980B;

        /* renamed from: z */
        public final ImageView f286981z;

        /* renamed from: f71.a$c$a */
        public static final class C97834a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C97833c f286982d;

            /* renamed from: e */
            public final /* synthetic */ C97830a f286983e;

            public C97834a(C97833c cVar, C97830a aVar) {
                this.f286982d = cVar;
                this.f286983e = aVar;
            }

            public final void onClick(View view) {
                C32227p<? super Integer, ? super C101380d, C13598b0> pVar;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/adapter/MoreStickerAdapter$StickerViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                int j = this.f286982d.mo17363j();
                C101380d dVar = (C101380d) C110818d0.m150917O(this.f286983e.f286975d, j);
                if (!(dVar == null || (pVar = this.f286983e.f286977f) == null)) {
                    pVar.invoke(Integer.valueOf(j), dVar);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/adapter/MoreStickerAdapter$StickerViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97833c(C97830a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
            this.f286981z = (ImageView) view.findViewById(C0966R.C0970id.cep);
            this.f286979A = (TextView) view.findViewById(C0966R.C0970id.ceq);
            this.f286980B = (StickerSelectFrame) view.findViewById(C0966R.C0970id.cev);
            view.setOnClickListener(new C97834a(this, aVar));
        }

        /* renamed from: y */
        public void mo137165y(int i, C101814mn2 mn22) {
            C87412m.m108594g(mn22, "info");
            C60979d<C101619a> dVar = C101631k.f297497a;
            C99344b<C101619a, Bitmap> a = C101631k.f297497a.mo85955a(new C101619a(mn22));
            ImageView imageView = this.f286981z;
            C87412m.m108593f(imageView, "icon");
            ((C99342a) a).mo85954d(imageView);
            this.f286979A.setText(mn22.f298864f);
            this.f286980B.mo128089a(mn22.f298862d);
        }
    }

    /* renamed from: f71.a$d */
    public final class C97835d extends C97831a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97835d(C97830a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
        }

        /* renamed from: y */
        public void mo137165y(int i, C101814mn2 mn22) {
            C87412m.m108594g(mn22, "info");
            TextView textView = (TextView) this.f44854d.findViewById(C0966R.C0970id.ceq);
            C92200j.C92201a aVar = C92200j.f263887p;
            if (C87412m.m108589b(mn22, C92200j.f263891t)) {
                textView.setText(C0966R.string.c55);
            } else if (C87412m.m108589b(mn22, C92200j.f263893v)) {
                textView.setText(C0966R.string.c58);
            }
        }
    }

    public int getItemCount() {
        return this.f286975d.size();
    }

    public int getItemViewType(int i) {
        C101380d dVar = (C101380d) C110818d0.m150917O(this.f286975d, i);
        C101814mn2 mn22 = dVar != null ? dVar.f296960a : null;
        if (C87412m.m108589b(mn22, C92200j.f263891t) ? true : C87412m.m108589b(mn22, C92200j.f263893v)) {
            return 1;
        }
        return C87412m.m108589b(mn22, C92200j.f263892u) ? 2 : 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C97831a aVar = (C97831a) zVar;
        C87412m.m108594g(aVar, "holder");
        C101380d dVar = (C101380d) C110818d0.m150917O(this.f286975d, i);
        if (dVar != null) {
            aVar.mo137165y(i, dVar.f296960a);
        }
        aVar.f44854d.setSelected(i == this.f286976e);
        C32226l<? super Integer, C13598b0> lVar = this.f286978g;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.a1_, viewGroup, false);
            C87412m.m108593f(inflate, "from(parent.context).inf…tem_title, parent, false)");
            return new C97835d(this, inflate);
        } else if (i != 2) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.a1c, viewGroup, false);
            C87412m.m108593f(inflate2, "from(parent.context).inf…anel_item, parent, false)");
            return new C97833c(this, inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.a18, viewGroup, false);
            C87412m.m108593f(inflate3, "from(parent.context).inf…_item_end, parent, false)");
            return new C97832b(this, inflate3);
        }
    }
}
