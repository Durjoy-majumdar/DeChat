package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.p014mm.p136ui.chatting.view.C73885f;
import com.tencent.p014mm.p136ui.chatting.view.MMChattingListView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u001d\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006#"}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/ScrollControlRecyclerView;", "Lcom/tencent/mm/pluginsdk/ui/tools/ChattingRecyclerView;", "Lcom/tencent/mm/pluginsdk/ui/tools/q0;", "", "getExtraScrollDistance", "extraScrollDistance", "Lrx3/b0;", "setExtraScrollDistance", "", "result", "setHasControlMoveDown", "getHasControlMoveDown", "Lcom/tencent/mm/pluginsdk/ui/tools/ScrollControlRecyclerView$a;", "A1", "Lcom/tencent/mm/pluginsdk/ui/tools/ScrollControlRecyclerView$a;", "getOnDrawListener", "()Lcom/tencent/mm/pluginsdk/ui/tools/ScrollControlRecyclerView$a;", "setOnDrawListener", "(Lcom/tencent/mm/pluginsdk/ui/tools/ScrollControlRecyclerView$a;)V", "onDrawListener", "", "D1", "F", "getMFirstY", "()F", "setMFirstY", "(F)V", "mFirstY", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.ScrollControlRecyclerView */
public class ScrollControlRecyclerView extends ChattingRecyclerView implements C72923q0 {

    /* renamed from: A1 */
    public C72914a f212507A1;

    /* renamed from: B1 */
    public int f212508B1;

    /* renamed from: C1 */
    public boolean f212509C1;

    /* renamed from: D1 */
    public float f212510D1;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.ScrollControlRecyclerView$a */
    public interface C72914a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollControlRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: d1 */
    public void mo17052d1(int i, int i2) {
        if (i2 < 0) {
            this.f212509C1 = true;
        }
    }

    public int getExtraScrollDistance() {
        return this.f212508B1;
    }

    public boolean getHasControlMoveDown() {
        return this.f212509C1;
    }

    public final float getMFirstY() {
        return this.f212510D1;
    }

    public final C72914a getOnDrawListener() {
        return this.f212507A1;
    }

    public void onDraw(Canvas canvas) {
        C72914a aVar = this.f212507A1;
        if (aVar != null) {
            MMChattingListView.m87563h(((C73885f) aVar).f216833a, canvas);
        }
        super.onDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f212510D1 = motionEvent.getY();
        } else if (action == 2 && motionEvent.getY() - this.f212510D1 > 0.0f) {
            this.f212509C1 = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExtraScrollDistance(int i) {
        this.f212508B1 = i;
    }

    public void setHasControlMoveDown(boolean z) {
        this.f212509C1 = z;
    }

    public final void setMFirstY(float f) {
        this.f212510D1 = f;
    }

    public final void setOnDrawListener(C72914a aVar) {
        this.f212507A1 = aVar;
    }
}
