package com.tencent.p014mm.plugin.emojicapture.p841ui.capture;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b71.C92191c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f71.C97830a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import rh3.C101380d;
import rx3.C13598b0;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-B\u001b\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b,\u0010.R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR2\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 ¨\u0006/"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/capture/MoreStickerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "D", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "getReporter", "()Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "setReporter", "(Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;)V", "reporter", "Lb71/c;", "E", "Lb71/c;", "getDataCallback", "()Lb71/c;", "dataCallback", "Lkotlin/Function1;", "Lrh3/d;", "Lrx3/b0;", "F", "Lfy3/l;", "getSelectionCallback", "()Lfy3/l;", "setSelectionCallback", "(Lfy3/l;)V", "selectionCallback", "Lkotlin/Function0;", "G", "Lfy3/a;", "getCloseCallback", "()Lfy3/a;", "setCloseCallback", "(Lfy3/a;)V", "closeCallback", "H", "getLoadMoreCallback", "setLoadMoreCallback", "loadMoreCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView */
public final class MoreStickerView extends ConstraintLayout {

    /* renamed from: I */
    public static final /* synthetic */ int f269291I = 0;

    /* renamed from: A */
    public int f269292A;

    /* renamed from: B */
    public String f269293B;

    /* renamed from: C */
    public boolean f269294C;

    /* renamed from: D */
    public EmojiCaptureReporter f269295D;

    /* renamed from: E */
    public final C92191c f269296E;

    /* renamed from: F */
    public C32226l<? super C101380d, C13598b0> f269297F;

    /* renamed from: G */
    public C32224a<C13598b0> f269298G;

    /* renamed from: H */
    public C32224a<C13598b0> f269299H;

    /* renamed from: v */
    public final View f269300v;

    /* renamed from: w */
    public final RecyclerView f269301w;

    /* renamed from: x */
    public final GridLayoutManager f269302x;

    /* renamed from: y */
    public final C97830a f269303y;

    /* renamed from: z */
    public final int f269304z;

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView$a */
    public static final class C93322a extends GridLayoutManager.C0127b {

        /* renamed from: b */
        public final /* synthetic */ MoreStickerView f269305b;

        public C93322a(MoreStickerView moreStickerView) {
            this.f269305b = moreStickerView;
        }

        /* renamed from: c */
        public int mo118c(int i) {
            if (this.f269305b.f269303y.getItemViewType(i) == 0) {
                return 1;
            }
            return this.f269305b.f269292A;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView$b */
    public static final class C93323b extends C87413o implements C32227p<Integer, C101380d, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MoreStickerView f269306d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93323b(MoreStickerView moreStickerView) {
            super(2);
            this.f269306d = moreStickerView;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            C101380d dVar = (C101380d) obj2;
            C87412m.m108594g(dVar, "info");
            C97830a aVar = this.f269306d.f269303y;
            int i = aVar.f286976e;
            if (i != intValue) {
                aVar.notifyItemChanged(i);
                aVar.f286976e = intValue;
                aVar.notifyItemChanged(intValue);
            }
            C32226l<C101380d, C13598b0> selectionCallback = this.f269306d.getSelectionCallback();
            if (selectionCallback != null) {
                selectionCallback.invoke(dVar);
            }
            this.f269306d.f269293B = dVar.f296960a.f298862d;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView$c */
    public static final class C93324c extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MoreStickerView f269307d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93324c(MoreStickerView moreStickerView) {
            super(1);
            this.f269307d = moreStickerView;
        }

        public Object invoke(Object obj) {
            C32224a<C13598b0> loadMoreCallback;
            int intValue = ((Number) obj).intValue();
            int itemCount = this.f269307d.f269303y.getItemCount();
            MoreStickerView moreStickerView = this.f269307d;
            if (intValue >= itemCount - moreStickerView.f269292A && (loadMoreCallback = moreStickerView.getLoadMoreCallback()) != null) {
                loadMoreCallback.invoke();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView$d */
    public static final class C93325d implements C92191c {

        /* renamed from: a */
        public final /* synthetic */ MoreStickerView f269308a;

        /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView$d$a */
        public static final class C93326a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MoreStickerView f269309d;

            public C93326a(MoreStickerView moreStickerView) {
                this.f269309d = moreStickerView;
            }

            public final void run() {
                MoreStickerView moreStickerView = this.f269309d;
                int i = MoreStickerView.f269291I;
                moreStickerView.mo128082r();
            }
        }

        public C93325d(MoreStickerView moreStickerView) {
            this.f269308a = moreStickerView;
        }

        /* renamed from: c */
        public void mo126157c(List<C101380d> list) {
            C87412m.m108594g(list, "lensList");
            C97830a aVar = this.f269308a.f269303y;
            aVar.getClass();
            Log.m105924i("MicroMsg.MoreStickerAdapter", "update: " + list.size());
            aVar.f286975d.clear();
            aVar.f286975d.addAll(list);
            MoreStickerView moreStickerView = this.f269308a;
            if (moreStickerView.f269294C) {
                moreStickerView.f269301w.postDelayed(new C93326a(moreStickerView), 300);
                this.f269308a.f269294C = false;
            }
        }

        /* renamed from: d */
        public void mo126158d(int i, int i2) {
            this.f269308a.f269303y.notifyItemRangeChanged(i, i2);
        }

        /* renamed from: e */
        public void mo126159e(int i, int i2) {
            this.f269308a.f269303y.notifyItemRangeInserted(i, i2);
        }

        /* renamed from: f */
        public void mo126160f(int i, int i2) {
            this.f269308a.f269303y.notifyItemRangeRemoved(i, i2);
        }

        public void onMove(int i, int i2) {
            this.f269308a.f269303y.notifyItemMoved(i, i2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView$e */
    public static final class C93327e extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ MoreStickerView f269310d;

        public C93327e(MoreStickerView moreStickerView) {
            this.f269310d = moreStickerView;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/capture/MoreStickerView$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            if (i == 0) {
                MoreStickerView moreStickerView = this.f269310d;
                int i2 = MoreStickerView.f269291I;
                moreStickerView.mo128082r();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/capture/MoreStickerView$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/capture/MoreStickerView$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/capture/MoreStickerView$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.MoreStickerView$f */
    public static final class C93328f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MoreStickerView f269311d;

        public C93328f(MoreStickerView moreStickerView) {
            this.f269311d = moreStickerView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/capture/MoreStickerView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> closeCallback = this.f269311d.getCloseCallback();
            if (closeCallback != null) {
                closeCallback.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/capture/MoreStickerView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoreStickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f269292A = 5;
        this.f269294C = true;
        View.inflate(context, C0966R.C0971layout.a1a, this);
        View findViewById = findViewById(C0966R.C0970id.cet);
        C87412m.m108593f(findViewById, "findViewById(R.id.emoji_…ture_sticker_panel_close)");
        this.f269300v = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.cer);
        C87412m.m108593f(findViewById2, "findViewById(R.id.emoji_…re_sticker_more_recycler)");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f269301w = recyclerView;
        this.f269304z = context.getResources().getDimensionPixelSize(C0966R.dimen.f3763dc);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, this.f269292A);
        this.f269302x = gridLayoutManager;
        C97830a aVar = new C97830a();
        this.f269303y = aVar;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(aVar);
        recyclerView.setItemAnimator((RecyclerView.C16616j) null);
        gridLayoutManager.f44666B = new C93322a(this);
        aVar.f286977f = new C93323b(this);
        aVar.f286978g = new C93324c(this);
        this.f269296E = new C93325d(this);
        recyclerView.mo17043c(new C93327e(this));
        findViewById.setOnClickListener(new C93328f(this));
    }

    public final C32224a<C13598b0> getCloseCallback() {
        return this.f269298G;
    }

    public final C92191c getDataCallback() {
        return this.f269296E;
    }

    public final C32224a<C13598b0> getLoadMoreCallback() {
        return this.f269299H;
    }

    public final EmojiCaptureReporter getReporter() {
        return this.f269295D;
    }

    public final C32226l<C101380d, C13598b0> getSelectionCallback() {
        return this.f269297F;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredWidth() > this.f269304z) {
            int measuredWidth = getMeasuredWidth() / this.f269304z;
            this.f269292A = measuredWidth;
            this.f269302x.mo16940i0(measuredWidth);
        }
    }

    /* renamed from: r */
    public final void mo128082r() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        if (this.f269301w.getChildCount() > 0) {
            int childCount = this.f269301w.getChildCount();
            boolean z = true;
            for (int i = 0; i < childCount; i++) {
                C101380d dVar = (C101380d) C110818d0.m150917O(this.f269303y.f286975d, this.f269301w.mo17029N0(this.f269301w.getChildAt(i)));
                if (dVar != null && !Util.isNullOrNil(dVar.f296960a.f298862d)) {
                    if (!z) {
                        sb.append("#");
                        sb4.append("#");
                    }
                    sb.append(dVar.f296960a.f298862d);
                    sb4.append(dVar.f296960a.f298864f);
                    z = false;
                }
            }
            EmojiCaptureReporter emojiCaptureReporter = this.f269295D;
            if (emojiCaptureReporter != null) {
                emojiCaptureReporter.mo127933a(sb.toString(), sb4.toString());
            }
        }
    }

    public final void setCloseCallback(C32224a<C13598b0> aVar) {
        this.f269298G = aVar;
    }

    public final void setLoadMoreCallback(C32224a<C13598b0> aVar) {
        this.f269299H = aVar;
    }

    public final void setReporter(EmojiCaptureReporter emojiCaptureReporter) {
        this.f269295D = emojiCaptureReporter;
    }

    public final void setSelectionCallback(C32226l<? super C101380d, C13598b0> lVar) {
        this.f269297F = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MoreStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
