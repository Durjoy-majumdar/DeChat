package com.tencent.p014mm.plugin.emoji.p040ui.p319v3;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import p61.C100668o;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aB\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3SingleProductRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lp61/o;", "z1", "Lp61/o;", "getSizeResolver", "()Lp61/o;", "setSizeResolver", "(Lp61/o;)V", "sizeResolver", "Lkotlin/Function1;", "", "Lrx3/b0;", "A1", "Lfy3/l;", "getOnSizeChangedCallback", "()Lfy3/l;", "setOnSizeChangedCallback", "(Lfy3/l;)V", "onSizeChangedCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductRecyclerView */
public final class EmojiStoreV3SingleProductRecyclerView extends RecyclerView {

    /* renamed from: A1 */
    public C32226l<? super Integer, C13598b0> f269043A1;

    /* renamed from: y1 */
    public final String f269044y1;

    /* renamed from: z1 */
    public C100668o f269045z1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiStoreV3SingleProductRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f269044y1 = "MicroMsg.EmojiStoreV3SingleProductRecyclerView";
    }

    public final C32226l<Integer, C13598b0> getOnSizeChangedCallback() {
        return this.f269043A1;
    }

    public final C100668o getSizeResolver() {
        return this.f269045z1;
    }

    public void onMeasure(int i, int i2) {
        if (this.f269045z1 != null) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                C100668o oVar = this.f269045z1;
                gridLayoutManager.mo16940i0(oVar != null ? oVar.f294934c : 0);
            }
        }
        super.onMeasure(i, i2);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        String str = this.f269044y1;
        Log.m105924i(str, "onSizeChanged w:" + i + ", h:" + i2 + ", oldw::" + i3 + ", oldH:" + i4);
        C100668o oVar = this.f269045z1;
        if (oVar != null) {
            oVar.mo140107d(i);
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                gridLayoutManager.mo16940i0(oVar.f294934c);
            }
            C32226l<? super Integer, C13598b0> lVar = this.f269043A1;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(oVar.f294934c));
            }
        }
        if (getItemDecorationCount() > 0) {
            mo17035V0();
        }
    }

    public final void setOnSizeChangedCallback(C32226l<? super Integer, C13598b0> lVar) {
        this.f269043A1 = lVar;
    }

    public final void setSizeResolver(C100668o oVar) {
        this.f269045z1 = oVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmojiStoreV3SingleProductRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
