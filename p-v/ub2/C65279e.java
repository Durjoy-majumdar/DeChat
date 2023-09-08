package ub2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvAlbumPreviewUI;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C59826g;
import hb2.C59828h;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import rx3.C13598b0;
import te3.C64525lh3;

/* renamed from: ub2.e */
public final class C65279e implements MusicMvTabFragment.C57115a {

    /* renamed from: a */
    public final /* synthetic */ MusicMVCardChooseView f187930a;

    /* renamed from: ub2.e$a */
    public static final class C65280a extends C87413o implements C32226l<Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8478d0 f187931d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f187932e;

        /* renamed from: f */
        public final /* synthetic */ RecyclerView f187933f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65280a(C8478d0 d0Var, C8478d0 d0Var2, RecyclerView recyclerView) {
            super(1);
            this.f187931d = d0Var;
            this.f187932e = d0Var2;
            this.f187933f = recyclerView;
        }

        public Object invoke(Object obj) {
            int floatValue = (int) (((float) this.f187931d.f27483d) * ((Number) obj).floatValue());
            C8478d0 d0Var = this.f187932e;
            int i = floatValue - d0Var.f27483d;
            d0Var.f27483d = floatValue;
            this.f187933f.scrollBy(0, i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ub2.e$b */
    public static final class C65281b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ View f187934d;

        /* renamed from: e */
        public final /* synthetic */ MusicMVCardChooseView f187935e;

        /* renamed from: f */
        public final /* synthetic */ MusicMvTabFragment.C57119e f187936f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65281b(View view, MusicMVCardChooseView musicMVCardChooseView, MusicMvTabFragment.C57119e eVar) {
            super(0);
            this.f187934d = view;
            this.f187935e = musicMVCardChooseView;
            this.f187936f = eVar;
        }

        public Object invoke() {
            C59826g gVar;
            try {
                ImageView imageView = (ImageView) this.f187934d.findViewById(C0966R.C0970id.l7m);
                C87412m.m108593f(imageView, "thumbIv");
                gVar = C59828h.m69722a(imageView);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Mv.MusicMVCardChooseView", "generate animation info fail:" + e.getLocalizedMessage());
                gVar = null;
            }
            MusicMVCardChooseView.C57080a aVar = this.f187935e.f163463G;
            if (aVar != null) {
                aVar.mo80364M1(this.f187936f, gVar);
            }
            return C13598b0.f38549a;
        }
    }

    public C65279e(MusicMVCardChooseView musicMVCardChooseView) {
        this.f187930a = musicMVCardChooseView;
    }

    /* renamed from: a */
    public void mo80633a(int i, MusicMvTabFragment.C57119e eVar, int i2, View view, RecyclerView recyclerView, int i3) {
        C87412m.m108594g(eVar, "data");
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(recyclerView, "recyclerView");
        MusicMVCardChooseView musicMVCardChooseView = this.f187930a;
        int i4 = MusicMVCardChooseView.f163455X0;
        if (!musicMVCardChooseView.mo80518h()) {
            boolean z = this.f187930a.f163481U0;
            C8478d0 d0Var = new C8478d0();
            C8478d0 d0Var2 = new C8478d0();
            if (!z) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                C87412m.m108591d(layoutManager);
                int decoratedTop = layoutManager.getDecoratedTop(view);
                int paddingTop = layoutManager.getPaddingTop();
                int i5 = decoratedTop - paddingTop;
                Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "[debugScroll] viewTop: " + decoratedTop + ", boxTop:" + paddingTop + ", offsetOfMoveToFirstRow:" + i5);
                int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int height = recyclerView.getHeight();
                int height2 = view.getHeight();
                MusicMVCardChooseView musicMVCardChooseView2 = this.f187930a;
                int i6 = ((computeVerticalScrollRange - computeVerticalScrollOffset) - height) + (musicMVCardChooseView2.f163477S0 - musicMVCardChooseView2.f163475R0);
                Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "[debugScroll] totalHeight: " + computeVerticalScrollRange + ", scrollY:" + computeVerticalScrollOffset + ", albumRvHeight:" + height + ", itemHeight:" + height2 + ", availableSpace:" + i6);
                d0Var.f27483d = Math.max(0, Math.min(i5, i6));
            }
            this.f187930a.mo80519i(true, new C65280a(d0Var, d0Var2, recyclerView), new C65281b(view, this.f187930a, eVar));
            return;
        }
        C64525lh3 lh32 = MusicMvAlbumPreviewUI.f163015d;
        MusicMvAlbumPreviewUI.f163015d = this.f187930a.mo80516f(C61926c.m72691p(eVar.f163648a), String.valueOf(i3));
        Intent intent = new Intent(this.f187930a.getContext(), MusicMvAlbumPreviewUI.class);
        if (this.f187930a.getContext() instanceof Activity) {
            Context context = this.f187930a.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(10041);
            aVar.mo10233c(intent);
            C117292a.m165364j((Activity) context, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$fragmentItemClickedListener$1", "onItemClicked", "(ILcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment$MusicFeedsItemData;ILandroid/view/View;Landroidx/recyclerview/widget/RecyclerView;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }

    /* renamed from: b */
    public boolean mo80634b(boolean z, MusicMvTabFragment.C57119e eVar, int i) {
        C87412m.m108594g(eVar, "data");
        MusicMVCardChooseView musicMVCardChooseView = this.f187930a;
        int i2 = MusicMVCardChooseView.f163455X0;
        if (!musicMVCardChooseView.mo80518h()) {
            Log.m105920e("MicroMsg.Mv.MusicMVCardChooseView", "onItemChecked, but not on flex mode");
            return true;
        }
        MusicMVCardChooseView.C57080a aVar = this.f187930a.f163463G;
        if (aVar != null) {
            return aVar.mo80372v0(z, eVar, i);
        }
        return false;
    }
}
