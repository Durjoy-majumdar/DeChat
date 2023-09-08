package pr1;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
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

/* renamed from: pr1.b */
public final class C100837b extends RecyclerView.C16613e<C100838a> {

    /* renamed from: d */
    public final ArrayList<C101380d> f295346d = new ArrayList<>();

    /* renamed from: e */
    public int f295347e;

    /* renamed from: f */
    public String f295348f;

    /* renamed from: g */
    public boolean f295349g;

    /* renamed from: h */
    public C32227p<? super Integer, ? super C101380d, C13598b0> f295350h;

    /* renamed from: i */
    public C32226l<? super Integer, C13598b0> f295351i;

    /* renamed from: pr1.b$a */
    public abstract class C100838a extends RecyclerView.C16631z {

        /* renamed from: z */
        public final /* synthetic */ C100837b f295352z;

        /* renamed from: pr1.b$a$a */
        public static final class C100839a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C100838a f295353d;

            /* renamed from: e */
            public final /* synthetic */ C100837b f295354e;

            public C100839a(C100838a aVar, C100837b bVar) {
                this.f295353d = aVar;
                this.f295354e = bVar;
            }

            public final void onClick(View view) {
                C32227p<? super Integer, ? super C101380d, C13598b0> pVar;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                int j = this.f295353d.mo17363j();
                C101380d dVar = (C101380d) C110818d0.m150917O(this.f295354e.f295346d, j);
                if (!(dVar == null || (pVar = this.f295354e.f295350h) == null)) {
                    pVar.invoke(Integer.valueOf(j), dVar);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100838a(C100837b bVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f295352z = bVar;
            view.setOnClickListener(new C100839a(this, bVar));
        }

        /* renamed from: y */
        public void mo140312y(int i, C101814mn2 mn22) {
            C87412m.m108594g(mn22, "info");
            this.f44854d.setSelected(i == this.f295352z.f295347e);
        }
    }

    /* renamed from: pr1.b$b */
    public final class C100840b extends C100838a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100840b(C100837b bVar, View view) {
            super(bVar, view);
            C87412m.m108594g(view, "itemView");
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.d8b);
        }
    }

    /* renamed from: pr1.b$c */
    public final class C100841c extends C100838a {

        /* renamed from: A */
        public final ImageView f295355A;

        /* renamed from: B */
        public final View f295356B;

        /* renamed from: C */
        public final View f295357C;

        /* renamed from: D */
        public final /* synthetic */ C100837b f295358D;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100841c(C100837b bVar, View view) {
            super(bVar, view);
            C87412m.m108594g(view, "itemView");
            this.f295358D = bVar;
            this.f295355A = (ImageView) view.findViewById(C0966R.C0970id.d8b);
            this.f295356B = view.findViewById(C0966R.C0970id.d8c);
            this.f295357C = view.findViewById(C0966R.C0970id.d8d);
        }

        /* renamed from: y */
        public void mo140312y(int i, C101814mn2 mn22) {
            C101814mn2 mn23 = mn22;
            C87412m.m108594g(mn23, "info");
            super.mo140312y(i, mn22);
            C60979d<C101619a> dVar = C101631k.f297497a;
            C99344b<C101619a, Bitmap> a = C101631k.f297497a.mo85955a(new C101619a(mn23));
            ImageView imageView = this.f295355A;
            C87412m.m108593f(imageView, "icon");
            ((C99342a) a).mo85954d(imageView);
            C100837b bVar = this.f295358D;
            if (i != bVar.f295347e || !bVar.f295349g) {
                View view = this.f295356B;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = this.f295357C;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view5 = this.f295356B;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f295357C;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/video/sticker/StickerEffectAdapter$StickerViewHolder", "update", "(ILcom/tencent/mm/protocal/protobuf/LensInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public int getItemCount() {
        return this.f295346d.size();
    }

    public int getItemViewType(int i) {
        return C87412m.m108589b((C101380d) C110818d0.m150917O(this.f295346d, i), C100842c.f295359a) ? 1 : 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C100838a aVar = (C100838a) zVar;
        C87412m.m108594g(aVar, "holder");
        C101380d dVar = (C101380d) C110818d0.m150917O(this.f295346d, i);
        C87412m.m108591d(dVar);
        aVar.mo140312y(i, dVar.f296960a);
        C32226l<? super Integer, C13598b0> lVar = this.f295351i;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.a_c, viewGroup, false);
            C87412m.m108593f(inflate, "from(parent.context).inf…tem_empty, parent, false)");
            return new C100840b(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.a_b, viewGroup, false);
        C87412m.m108593f(inflate2, "from(parent.context).inf…cker_item, parent, false)");
        return new C100841c(this, inflate2);
    }
}
