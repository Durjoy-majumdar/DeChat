package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB#\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010 R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCommentRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "", "E1", "I", "getCropTopLength", "()I", "setCropTopLength", "(I)V", "cropTopLength", "F1", "getFadeLength", "setFadeLength", "fadeLength", "Landroid/graphics/Paint;", "G1", "Lrx3/g;", "getPaint", "()Landroid/graphics/Paint;", "paint", "Landroid/graphics/Rect;", "H1", "getGradientRectTop", "()Landroid/graphics/Rect;", "gradientRectTop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCommentRecyclerView */
public final class FinderLiveCommentRecyclerView extends WxRecyclerView {
    @Deprecated

    /* renamed from: I1 */
    public static final int[] f15219I1 = {0, -16777216};

    /* renamed from: E1 */
    public int f15220E1 = -1;

    /* renamed from: F1 */
    public int f15221F1 = -1;

    /* renamed from: G1 */
    public final C13601g f15222G1 = C36568h.m40985a(C3218h0.f15339d);

    /* renamed from: H1 */
    public final C13601g f15223H1 = C36568h.m40985a(C3217g0.f15338d);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveCommentRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    private final Rect getGradientRectTop() {
        return (Rect) this.f15223H1.getValue();
    }

    private final Paint getPaint() {
        return (Paint) this.f15222G1.getValue();
    }

    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (canvas2 == null) {
            super.dispatchDraw(canvas);
        } else if (this.f15220E1 <= 0 || this.f15221F1 <= 0) {
            super.dispatchDraw(canvas);
        } else {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop() + this.f15220E1;
            int width = getWidth() - getPaddingRight();
            int i = this.f15221F1 + paddingTop;
            getGradientRectTop().set(paddingLeft, paddingTop, width, i);
            float f = (float) paddingLeft;
            getPaint().setShader(new LinearGradient(f, (float) paddingTop, f, (float) i, f15219I1, (float[]) null, Shader.TileMode.CLAMP));
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), (Paint) null, 31);
            super.dispatchDraw(canvas);
            canvas2.drawRect(getGradientRectTop(), getPaint());
            canvas2.restoreToCount(saveLayer);
        }
    }

    public final int getCropTopLength() {
        return this.f15220E1;
    }

    public final int getFadeLength() {
        return this.f15221F1;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f15220E1 > 0 && canvas != null) {
            canvas.clipRect(new Rect(0, this.f15220E1, getWidth(), getHeight()));
        }
    }

    public final void setCropTopLength(int i) {
        this.f15220E1 = i;
    }

    public final void setFadeLength(int i) {
        this.f15221F1 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveCommentRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
