package com.tencent.p014mm.plugin.finder.live.squarescroll.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B!\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aR*\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/squarescroll/widget/LiveScrollSquareLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "value", "A", "Z", "isTouchEnable", "()Z", "setTouchEnable", "(Z)V", "Lcom/tencent/mm/plugin/finder/live/squarescroll/widget/LiveScrollSquareLayout$a;", "B", "Lcom/tencent/mm/plugin/finder/live/squarescroll/widget/LiveScrollSquareLayout$a;", "getScrollCallbackListener", "()Lcom/tencent/mm/plugin/finder/live/squarescroll/widget/LiveScrollSquareLayout$a;", "setScrollCallbackListener", "(Lcom/tencent/mm/plugin/finder/live/squarescroll/widget/LiveScrollSquareLayout$a;)V", "scrollCallbackListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.squarescroll.widget.LiveScrollSquareLayout */
public final class LiveScrollSquareLayout extends ConstraintLayout {

    /* renamed from: A */
    public boolean f159544A;

    /* renamed from: B */
    public C55965a f159545B;

    /* renamed from: v */
    public float f159546v;

    /* renamed from: w */
    public float f159547w;

    /* renamed from: x */
    public float f159548x;

    /* renamed from: y */
    public final int f159549y = ViewConfiguration.get(getContext()).getScaledTouchSlop();

    /* renamed from: z */
    public int f159550z = C76577a.m92151b(getContext(), 80);

    /* renamed from: com.tencent.mm.plugin.finder.live.squarescroll.widget.LiveScrollSquareLayout$a */
    public interface C55965a {
        /* renamed from: F1 */
        void mo77758F1(boolean z, boolean z2, float f);

        /* renamed from: M2 */
        void mo77759M2(float f);

        /* renamed from: d */
        void mo77760d();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveScrollSquareLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    public final C55965a getScrollCallbackListener() {
        return this.f159545B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r0 != 3) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x009c
            boolean r0 = r7.f159544A
            if (r0 != 0) goto L_0x0008
            goto L_0x009c
        L_0x0008:
            int r0 = r8.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x0088
            if (r0 == r1) goto L_0x0040
            r2 = 2
            if (r0 == r2) goto L_0x0019
            r2 = 3
            if (r0 == r2) goto L_0x0040
            goto L_0x009b
        L_0x0019:
            float r0 = r7.f159548x
            float r2 = r8.getRawY()
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r7.f159549y
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x009b
            float r0 = r8.getRawY()
            float r2 = r7.f159546v
            float r0 = r0 - r2
            float r8 = r8.getRawY()
            r7.f159548x = r8
            com.tencent.mm.plugin.finder.live.squarescroll.widget.LiveScrollSquareLayout$a r8 = r7.f159545B
            if (r8 == 0) goto L_0x009b
            r8.mo77759M2(r0)
            goto L_0x009b
        L_0x0040:
            float r0 = r8.getRawX()
            int r0 = (int) r0
            float r2 = r8.getRawY()
            int r2 = (int) r2
            float r0 = (float) r0
            float r3 = r7.f159547w
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r2 = (float) r2
            float r3 = r7.f159546v
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            int r3 = r7.f159549y
            float r4 = (float) r3
            r5 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0069
            float r3 = (float) r3
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0069
            r3 = 1
            goto L_0x006a
        L_0x0069:
            r3 = 0
        L_0x006a:
            if (r3 != 0) goto L_0x0079
            int r4 = r7.f159550z
            float r6 = (float) r4
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0079
            float r0 = (float) r4
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0079
            r5 = 1
        L_0x0079:
            com.tencent.mm.plugin.finder.live.squarescroll.widget.LiveScrollSquareLayout$a r0 = r7.f159545B
            if (r0 == 0) goto L_0x009b
            float r8 = r8.getRawY()
            float r2 = r7.f159546v
            float r8 = r8 - r2
            r0.mo77758F1(r3, r5, r8)
            goto L_0x009b
        L_0x0088:
            float r0 = r8.getRawY()
            r7.f159546v = r0
            float r8 = r8.getRawX()
            r7.f159547w = r8
            com.tencent.mm.plugin.finder.live.squarescroll.widget.LiveScrollSquareLayout$a r8 = r7.f159545B
            if (r8 == 0) goto L_0x009b
            r8.mo77760d()
        L_0x009b:
            return r1
        L_0x009c:
            boolean r8 = super.onTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.squarescroll.widget.LiveScrollSquareLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setScrollCallbackListener(C55965a aVar) {
        this.f159545B = aVar;
    }

    public final void setTouchEnable(boolean z) {
        Log.m105924i("LiveScrollSquareLayout", "isTouchEnable: " + z);
        this.f159544A = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveScrollSquareLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
