package com.tencent.p014mm.plugin.game.luggage.p801ui.circle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import hq3.C76239h;
import hq3.C98498a;
import jp3.C9486a;
import jp3.C9487b;
import kotlin.Metadata;
import p008bq.C92291v0;
import p171il.C60338x;
import p171il.C98745v;
import p813fl.C97927q0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u00103\u001a\u00020\u0016¢\u0006\u0004\b4\u00105B\u001b\b\u0016\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b4\u00106R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00067"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/luggage/ui/circle/GameEmojiPanelRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "E1", "F", "getTouchX", "()F", "setTouchX", "(F)V", "touchX", "F1", "getTouchY", "setTouchY", "touchY", "", "I1", "Z", "getEnableLongPress", "()Z", "setEnableLongPress", "(Z)V", "enableLongPress", "", "J1", "I", "getScene", "()I", "setScene", "(I)V", "scene", "Ljp3/b;", "Ljp3/a;", "M1", "Ljp3/b;", "getPanelLifeCycle", "()Ljp3/b;", "setPanelLifeCycle", "(Ljp3/b;)V", "panelLifeCycle", "Lil/x;", "N1", "Lil/x;", "getSizeResolver", "()Lil/x;", "setSizeResolver", "(Lil/x;)V", "sizeResolver", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "luggage-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPanelRecyclerView */
public final class GameEmojiPanelRecyclerView extends RecyclerView {

    /* renamed from: A1 */
    public boolean f271680A1;

    /* renamed from: B1 */
    public boolean f271681B1;

    /* renamed from: C1 */
    public float f271682C1;

    /* renamed from: D1 */
    public float f271683D1;

    /* renamed from: E1 */
    public float f271684E1;

    /* renamed from: F1 */
    public float f271685F1;

    /* renamed from: G1 */
    public final int f271686G1;

    /* renamed from: H1 */
    public final long f271687H1;

    /* renamed from: I1 */
    public boolean f271688I1;

    /* renamed from: J1 */
    public int f271689J1;

    /* renamed from: K1 */
    public final Runnable f271690K1;

    /* renamed from: L1 */
    public C98498a f271691L1;

    /* renamed from: M1 */
    public C9487b<C9486a> f271692M1;

    /* renamed from: N1 */
    public C60338x f271693N1;

    /* renamed from: y1 */
    public boolean f271694y1;

    /* renamed from: z1 */
    public boolean f271695z1;

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPanelRecyclerView$a */
    public static final class C94087a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ GameEmojiPanelRecyclerView f271696d;

        public C94087a(GameEmojiPanelRecyclerView gameEmojiPanelRecyclerView) {
            this.f271696d = gameEmojiPanelRecyclerView;
        }

        public final void run() {
            View D0;
            GameEmojiPanelRecyclerView gameEmojiPanelRecyclerView = this.f271696d;
            if (!gameEmojiPanelRecyclerView.f271695z1) {
                RecyclerView.C16613e adapter = gameEmojiPanelRecyclerView.getAdapter();
                C98745v vVar = adapter instanceof C98745v ? (C98745v) adapter : null;
                if (vVar != null && (D0 = gameEmojiPanelRecyclerView.mo17019D0(gameEmojiPanelRecyclerView.f271684E1, gameEmojiPanelRecyclerView.f271685F1)) != null) {
                    int N0 = gameEmojiPanelRecyclerView.mo17029N0(D0);
                    ((C92291v0) C86312j.m106911c(C92291v0.class)).setIndex(N0);
                    C97927q0 item = vVar.getItem(N0);
                    C98498a aVar = gameEmojiPanelRecyclerView.f271691L1;
                    boolean z = true;
                    if (aVar == null || !aVar.mo106488a(D0, item)) {
                        z = false;
                    }
                    gameEmojiPanelRecyclerView.f271680A1 = z;
                    Log.m105924i("MicroMsg.GameEmojiPanelRecyclerView", "gamelog.inputtool, input tool, long press: " + gameEmojiPanelRecyclerView.f271680A1);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GameEmojiPanelRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f271688I1 = true;
        this.f271690K1 = new C94087a(this);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f271687H1 = (long) ViewConfiguration.getLongPressTimeout();
        this.f271686G1 = viewConfiguration.getScaledTouchSlop();
        this.f271691L1 = new C76239h(context);
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [androidx.recyclerview.widget.RecyclerView$e] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r0 != 3) goto L_0x0094;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r7, r0)
            boolean r0 = r6.f271688I1
            if (r0 != 0) goto L_0x000e
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        L_0x000e:
            int r0 = r7.getActionMasked()
            r1 = 3
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0069
            if (r0 == r3) goto L_0x0064
            r4 = 2
            if (r0 == r4) goto L_0x0020
            if (r0 == r1) goto L_0x0064
            goto L_0x0094
        L_0x0020:
            float r0 = r7.getX()
            r6.f271684E1 = r0
            float r0 = r7.getY()
            r6.f271685F1 = r0
            boolean r0 = r6.f271694y1
            if (r0 == 0) goto L_0x0094
            boolean r0 = r6.f271695z1
            if (r0 != 0) goto L_0x0094
            float r0 = r6.f271682C1
            float r4 = r7.getX()
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r4 = r6.f271686G1
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0058
            float r0 = r6.f271683D1
            float r4 = r7.getY()
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r4 = r6.f271686G1
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0094
        L_0x0058:
            r6.f271695z1 = r3
            boolean r0 = r6.f271680A1
            if (r0 != 0) goto L_0x0094
            java.lang.Runnable r0 = r6.f271690K1
            r6.removeCallbacks(r0)
            goto L_0x0094
        L_0x0064:
            r6.f271694y1 = r2
            r6.f271695z1 = r2
            goto L_0x0094
        L_0x0069:
            r6.f271694y1 = r3
            r6.f271680A1 = r2
            r6.f271695z1 = r2
            r6.f271681B1 = r2
            float r0 = r7.getX()
            r6.f271682C1 = r0
            float r0 = r7.getY()
            r6.f271683D1 = r0
            float r0 = r7.getX()
            r6.f271684E1 = r0
            float r0 = r7.getY()
            r6.f271685F1 = r0
            boolean r0 = r6.f271688I1
            if (r0 == 0) goto L_0x0094
            java.lang.Runnable r0 = r6.f271690K1
            long r4 = r6.f271687H1
            r6.postDelayed(r0, r4)
        L_0x0094:
            boolean r0 = r6.f271680A1
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r6.f271681B1
            if (r0 != 0) goto L_0x00ab
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r7)
            r0.setAction(r1)
            super.dispatchTouchEvent(r0)
            r0.recycle()
            r6.f271681B1 = r3
        L_0x00ab:
            int r0 = r7.getActionMasked()
            r4 = 0
            if (r0 == r1) goto L_0x00b8
            int r0 = r7.getActionMasked()
            if (r0 != r3) goto L_0x00d9
        L_0x00b8:
            java.lang.Runnable r0 = r6.f271690K1
            r6.removeCallbacks(r0)
            r6.f271680A1 = r2
            hq3.a r0 = r6.f271691L1
            if (r0 == 0) goto L_0x00c6
            r0.mo106490c()
        L_0x00c6:
            hq3.a r0 = r6.f271691L1
            boolean r1 = r0 instanceof jp3.C9486a
            if (r1 == 0) goto L_0x00cf
            jp3.a r0 = (jp3.C9486a) r0
            goto L_0x00d0
        L_0x00cf:
            r0 = r4
        L_0x00d0:
            if (r0 == 0) goto L_0x00d9
            jp3.b<jp3.a> r1 = r6.f271692M1
            if (r1 == 0) goto L_0x00d9
            r1.keep(r0)
        L_0x00d9:
            boolean r0 = r6.f271680A1
            if (r0 == 0) goto L_0x0133
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "gamelog.inputtool, input tool, updatePopView: "
            r7.append(r0)
            float r0 = r6.f271684E1
            r7.append(r0)
            java.lang.String r0 = ", "
            r7.append(r0)
            float r0 = r6.f271685F1
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "MicroMsg.GameEmojiPanelRecyclerView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            androidx.recyclerview.widget.RecyclerView$e r7 = r6.getAdapter()
            boolean r0 = r7 instanceof p171il.C98745v
            if (r0 == 0) goto L_0x010a
            r4 = r7
            il.v r4 = (p171il.C98745v) r4
        L_0x010a:
            if (r4 != 0) goto L_0x010d
            goto L_0x0132
        L_0x010d:
            float r7 = r6.f271684E1
            float r0 = r6.f271685F1
            android.view.View r7 = r6.mo17019D0(r7, r0)
            if (r7 != 0) goto L_0x0118
            goto L_0x0132
        L_0x0118:
            int r0 = r6.mo17029N0(r7)
            java.lang.Class<bq.v0> r1 = p008bq.C92291v0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            bq.v0 r1 = (p008bq.C92291v0) r1
            r1.setIndex(r0)
            fl.q0 r0 = r4.getItem(r0)
            hq3.a r1 = r6.f271691L1
            if (r1 == 0) goto L_0x0132
            r1.mo106489b(r7, r0)
        L_0x0132:
            return r3
        L_0x0133:
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.luggage.p801ui.circle.GameEmojiPanelRecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean getEnableLongPress() {
        return this.f271688I1;
    }

    public final C9487b<C9486a> getPanelLifeCycle() {
        return this.f271692M1;
    }

    public final int getScene() {
        return this.f271689J1;
    }

    public final C60338x getSizeResolver() {
        return this.f271693N1;
    }

    public final float getTouchX() {
        return this.f271684E1;
    }

    public final float getTouchY() {
        return this.f271685F1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (this.f271680A1) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onMeasure(int i, int i2) {
        C60338x xVar = this.f271693N1;
        if (xVar != null) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                gridLayoutManager.mo16940i0(xVar.f171991c);
            }
        }
        super.onMeasure(i, i2);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C60338x xVar = this.f271693N1;
        if (xVar != null) {
            xVar.mo85309d(i);
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                gridLayoutManager.mo16940i0(xVar.f171991c);
            }
            setPadding(xVar.f171993e, getPaddingTop(), xVar.f171993e, getPaddingBottom());
        }
    }

    public final void setEnableLongPress(boolean z) {
        this.f271688I1 = z;
    }

    public final void setPanelLifeCycle(C9487b<C9486a> bVar) {
        this.f271692M1 = bVar;
    }

    public final void setScene(int i) {
        this.f271689J1 = i;
    }

    public final void setSizeResolver(C60338x xVar) {
        this.f271693N1 = xVar;
    }

    public final void setTouchX(float f) {
        this.f271684E1 = f;
    }

    public final void setTouchY(float f) {
        this.f271685F1 = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GameEmojiPanelRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
