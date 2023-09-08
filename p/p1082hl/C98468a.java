package p1082hl;

import ah3.C92001a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.emoji.panel.EmojiPanelRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p171il.C98713d0;
import p813fl.C97904g;
import p813fl.C97927q0;
import zg3.C103031b;
import zt3.C119157j;

/* renamed from: hl.a */
public final class C98468a extends RecyclerView.C0130p {

    /* renamed from: d */
    public final /* synthetic */ EmojiPanelRecyclerView f288811d;

    /* renamed from: hl.a$a */
    public static final class C98469a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98713d0 f288812d;

        public C98469a(C98713d0 d0Var) {
            this.f288812d = d0Var;
        }

        public final void run() {
            String md5;
            C98713d0 d0Var = this.f288812d;
            d0Var.getClass();
            Log.m105924i("MicroMsg.SimilarEmoji", "loadGif");
            C97904g gVar = (C97904g) d0Var.f289539A;
            if (gVar != null) {
                IEmojiInfo emojiInfo = d0Var.f289460C.getEmojiInfo();
                boolean z = true;
                if (emojiInfo == null || (md5 = emojiInfo.getMd5()) == null || !md5.equals(gVar.f287200b.getMd5())) {
                    z = false;
                }
                if (!z) {
                    d0Var.f289460C.setEmojiInfo(gVar.f287200b);
                } else if (!d0Var.f289460C.mo129223q()) {
                    d0Var.f289460C.resume();
                }
            }
        }
    }

    public C98468a(EmojiPanelRecyclerView emojiPanelRecyclerView) {
        this.f288811d = emojiPanelRecyclerView;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        RecyclerView recyclerView2 = recyclerView;
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView2);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/emoji/panel/EmojiPanelRecyclerView$gifPerformanceMode$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView2, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i2 == 0) {
            if (this.f288811d.getAdapter() instanceof C92001a) {
                RecyclerView.C16613e adapter = this.f288811d.getAdapter();
                C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.search.ui.SimilarEmojiAdapter");
                ((C92001a) adapter).f263382h = true;
            }
            RecyclerView.LayoutManager layoutManager = this.f288811d.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            int C = ((GridLayoutManager) layoutManager).mo16957C();
            RecyclerView.LayoutManager layoutManager2 = this.f288811d.getLayoutManager();
            C87412m.m108592e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            int E = ((GridLayoutManager) layoutManager2).mo16959E();
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            for (int i4 = C; i4 <= E; i4++) {
                if (i4 >= 1 && (this.f288811d.getAdapter() instanceof C92001a)) {
                    RecyclerView.C16613e adapter2 = this.f288811d.getAdapter();
                    C87412m.m108592e(adapter2, "null cannot be cast to non-null type com.tencent.mm.search.ui.SimilarEmojiAdapter");
                    if (((C92001a) adapter2).getItem(i4) instanceof C97904g) {
                        RecyclerView.C16613e adapter3 = this.f288811d.getAdapter();
                        C87412m.m108592e(adapter3, "null cannot be cast to non-null type com.tencent.mm.search.ui.SimilarEmojiAdapter");
                        C97927q0 item = ((C92001a) adapter3).getItem(i4);
                        C87412m.m108592e(item, "null cannot be cast to non-null type com.tencent.mm.emoji.model.panel.EmojiItem");
                        arrayList2.add(((C97904g) item).f287200b);
                    }
                }
                if (this.f288811d.mo17023I0(i4) instanceof C98713d0) {
                    i3++;
                    RecyclerView.C16631z I0 = this.f288811d.mo17023I0(i4);
                    C87412m.m108592e(I0, "null cannot be cast to non-null type com.tencent.mm.emoji.panel.adapter.SimilarEmojiNormalViewHolder");
                    C119157j jVar = (C119157j) C119157j.f356862d;
                    jVar.getClass();
                    jVar.mo183892w(new C98469a((C98713d0) I0), ((long) i3) / 2, false);
                }
            }
            if (this.f288811d.getScene() == 1) {
                if (C != 0) {
                    C--;
                }
                ((C119157j) C119157j.f356862d).mo183875f(new C103031b((long) (C + arrayList2.size()), arrayList2));
            }
        } else if ((i2 == 1 || i2 == 2) && (this.f288811d.getAdapter() instanceof C92001a)) {
            RecyclerView.C16613e adapter4 = this.f288811d.getAdapter();
            C87412m.m108592e(adapter4, "null cannot be cast to non-null type com.tencent.mm.search.ui.SimilarEmojiAdapter");
            if (((C92001a) adapter4).f263382h) {
                RecyclerView.C16613e adapter5 = this.f288811d.getAdapter();
                C87412m.m108592e(adapter5, "null cannot be cast to non-null type com.tencent.mm.search.ui.SimilarEmojiAdapter");
                ((C92001a) adapter5).f263382h = false;
                RecyclerView.LayoutManager layoutManager3 = this.f288811d.getLayoutManager();
                C87412m.m108592e(layoutManager3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                RecyclerView.LayoutManager layoutManager4 = this.f288811d.getLayoutManager();
                C87412m.m108592e(layoutManager4, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                int E2 = ((GridLayoutManager) layoutManager4).mo16959E();
                for (int C2 = ((GridLayoutManager) layoutManager3).mo16957C(); C2 <= E2; C2++) {
                    if (this.f288811d.mo17023I0(C2) instanceof C98713d0) {
                        RecyclerView.C16631z I02 = this.f288811d.mo17023I0(C2);
                        C87412m.m108592e(I02, "null cannot be cast to non-null type com.tencent.mm.emoji.panel.adapter.SimilarEmojiNormalViewHolder");
                        ((C98713d0) I02).f289460C.pause();
                    }
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/emoji/panel/EmojiPanelRecyclerView$gifPerformanceMode$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/emoji/panel/EmojiPanelRecyclerView$gifPerformanceMode$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/emoji/panel/EmojiPanelRecyclerView$gifPerformanceMode$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
