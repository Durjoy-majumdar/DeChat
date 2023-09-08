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
import e71.C97607d;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import l60.C99342a;
import l60.C99344b;
import rh3.C101380d;
import rx3.C13598b0;
import sh3.C101619a;
import sh3.C101631k;
import sx3.C110818d0;
import te3.C101814mn2;

/* renamed from: f71.b */
public final class C97836b extends RecyclerView.C16613e<C97837a> {

    /* renamed from: d */
    public final ArrayList<C101380d> f286984d = new ArrayList<>();

    /* renamed from: e */
    public C32227p<? super Integer, ? super C101380d, C13598b0> f286985e;

    /* renamed from: f71.b$a */
    public abstract class C97837a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f286986A;

        /* renamed from: z */
        public final ImageView f286987z;

        /* renamed from: f71.b$a$a */
        public static final class C97838a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C97837a f286988d;

            /* renamed from: e */
            public final /* synthetic */ C97836b f286989e;

            /* renamed from: f */
            public final /* synthetic */ View f286990f;

            public C97838a(C97837a aVar, C97836b bVar, View view) {
                this.f286988d = aVar;
                this.f286989e = bVar;
                this.f286990f = view;
            }

            public final void onClick(View view) {
                C32227p<? super Integer, ? super C101380d, C13598b0> pVar;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                int j = this.f286988d.mo17363j();
                C101380d F4 = this.f286989e.mo137167F4(j);
                if (!(F4 == null || (pVar = this.f286989e.f286985e) == null)) {
                    pVar.invoke(Integer.valueOf(j), F4);
                }
                this.f286990f.requestFocus();
                C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97837a(C97836b bVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f286987z = (ImageView) view.findViewById(C0966R.C0970id.cep);
            this.f286986A = (TextView) view.findViewById(C0966R.C0970id.ceq);
            view.setOnClickListener(new C97838a(this, bVar, view));
        }

        /* renamed from: y */
        public abstract void mo137168y(int i, C101814mn2 mn22);
    }

    /* renamed from: f71.b$b */
    public final class C97839b extends C97837a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97839b(C97836b bVar, View view) {
            super(bVar, view);
            C87412m.m108594g(view, "itemView");
        }

        /* renamed from: y */
        public void mo137168y(int i, C101814mn2 mn22) {
            C87412m.m108594g(mn22, "info");
            ImageView imageView = this.f286987z;
            C87412m.m108593f(imageView, "icon");
            C97607d.m125784d(imageView, C0966R.raw.icons_outlined_no_effect, this.f286987z.getContext().getResources().getColor(C0966R.color.FG_0));
            this.f286986A.setText(C0966R.string.c57);
        }
    }

    /* renamed from: f71.b$c */
    public final class C97840c extends C97837a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97840c(C97836b bVar, View view) {
            super(bVar, view);
            C87412m.m108594g(view, "itemView");
        }

        /* renamed from: y */
        public void mo137168y(int i, C101814mn2 mn22) {
            C101814mn2 mn23 = mn22;
            C87412m.m108594g(mn23, "info");
            C92200j.C92201a aVar = C92200j.f263887p;
            if (C87412m.m108589b(mn23, C92200j.f263890s)) {
                View view = this.f44854d;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$MoreStickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$MoreStickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = this.f44854d;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$MoreStickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/emojicapture/ui/adapter/StickerAdapter$MoreStickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ImageView imageView = this.f286987z;
            C87412m.m108593f(imageView, "icon");
            C97607d.m125784d(imageView, C0966R.raw.icons_filled_more, this.f286987z.getContext().getResources().getColor(C0966R.color.FG_0));
            this.f286986A.setText(C0966R.string.c56);
        }
    }

    /* renamed from: f71.b$d */
    public final class C97841d extends C97837a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97841d(C97836b bVar, View view) {
            super(bVar, view);
            C87412m.m108594g(view, "itemView");
        }

        /* renamed from: y */
        public void mo137168y(int i, C101814mn2 mn22) {
            C87412m.m108594g(mn22, "info");
            C60979d<C101619a> dVar = C101631k.f297497a;
            C99344b<C101619a, Bitmap> a = C101631k.f297497a.mo85955a(new C101619a(mn22));
            ImageView imageView = this.f286987z;
            C87412m.m108593f(imageView, "icon");
            ((C99342a) a).mo85954d(imageView);
            this.f286986A.setText(mn22.f298864f);
        }
    }

    /* renamed from: F4 */
    public final C101380d mo137167F4(int i) {
        return (C101380d) C110818d0.m150917O(this.f286984d, i);
    }

    public int getItemCount() {
        return this.f286984d.size();
    }

    public int getItemViewType(int i) {
        C101380d F4 = mo137167F4(i);
        C101814mn2 mn22 = F4 != null ? F4.f296960a : null;
        C92200j.C92201a aVar = C92200j.f263887p;
        boolean z = true;
        if (C87412m.m108589b(mn22, C92200j.f263888q)) {
            return 1;
        }
        if (!C87412m.m108589b(mn22, C92200j.f263890s)) {
            z = C87412m.m108589b(mn22, C92200j.f263889r);
        }
        return z ? 2 : 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C97837a aVar = (C97837a) zVar;
        C87412m.m108594g(aVar, "holder");
        C101380d F4 = mo137167F4(i);
        if (F4 != null) {
            aVar.mo137168y(i, F4.f296960a);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.a17, viewGroup, false);
            C87412m.m108593f(inflate, "from(parent.context).inf…tem_empty, parent, false)");
            return new C97839b(this, inflate);
        } else if (i != 2) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.a16, viewGroup, false);
            C87412m.m108593f(inflate2, "from(parent.context).inf…cker_item, parent, false)");
            return new C97841d(this, inflate2);
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.a19, viewGroup, false);
            C87412m.m108593f(inflate3, "from(parent.context).inf…item_more, parent, false)");
            return new C97840c(this, inflate3);
        }
    }
}
