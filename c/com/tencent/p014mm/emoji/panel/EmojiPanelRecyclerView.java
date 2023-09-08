package com.tencent.p014mm.emoji.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hq3.C98498a;
import hq3.C98499b;
import jp3.C9486a;
import jp3.C9487b;
import kotlin.Metadata;
import p171il.C60338x;
import p171il.C98734m;
import p585kl.C99148f;
import p813fl.C97927q0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u00103\u001a\u000202\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\u0006\u00106\u001a\u00020\u0002¢\u0006\u0004\b7\u00108B\u001b\b\u0016\u0012\u0006\u00103\u001a\u000202\u0012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b7\u00109J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\"\u0010\u0019\u001a\u00020\u00128\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010)\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006:"}, mo182094d2 = {"Lcom/tencent/mm/emoji/panel/EmojiPanelRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "type", "Lrx3/b0;", "setEmojiPopupType", "", "F1", "F", "getTouchX", "()F", "setTouchX", "(F)V", "touchX", "G1", "getTouchY", "setTouchY", "touchY", "", "J1", "Z", "getEnableLongPress", "()Z", "setEnableLongPress", "(Z)V", "enableLongPress", "K1", "I", "getScene", "()I", "setScene", "(I)V", "scene", "Ljp3/b;", "Ljp3/a;", "O1", "Ljp3/b;", "getPanelLifeCycle", "()Ljp3/b;", "setPanelLifeCycle", "(Ljp3/b;)V", "panelLifeCycle", "Lil/x;", "P1", "Lil/x;", "getSizeResolver", "()Lil/x;", "setSizeResolver", "(Lil/x;)V", "sizeResolver", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.emoji.panel.EmojiPanelRecyclerView */
public class EmojiPanelRecyclerView extends RecyclerView {

    /* renamed from: A1 */
    public boolean f266649A1;

    /* renamed from: B1 */
    public boolean f266650B1;

    /* renamed from: C1 */
    public boolean f266651C1;

    /* renamed from: D1 */
    public float f266652D1;

    /* renamed from: E1 */
    public float f266653E1;

    /* renamed from: F1 */
    public float f266654F1;

    /* renamed from: G1 */
    public float f266655G1;

    /* renamed from: H1 */
    public final int f266656H1;

    /* renamed from: I1 */
    public final long f266657I1;

    /* renamed from: J1 */
    public boolean f266658J1;

    /* renamed from: K1 */
    public int f266659K1;

    /* renamed from: L1 */
    public final Runnable f266660L1;

    /* renamed from: M1 */
    public EmojiPanelGroupView f266661M1;

    /* renamed from: N1 */
    public C98498a f266662N1;

    /* renamed from: O1 */
    public C9487b<C9486a> f266663O1;

    /* renamed from: P1 */
    public C60338x f266664P1;

    /* renamed from: y1 */
    public final String f266665y1;

    /* renamed from: z1 */
    public boolean f266666z1;

    /* renamed from: com.tencent.mm.emoji.panel.EmojiPanelRecyclerView$a */
    public static final class C92658a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EmojiPanelRecyclerView f266667d;

        public C92658a(EmojiPanelRecyclerView emojiPanelRecyclerView) {
            this.f266667d = emojiPanelRecyclerView;
        }

        public final void run() {
            View D0;
            EmojiPanelGroupView emojiPanelGroupView;
            EmojiPanelRecyclerView emojiPanelRecyclerView = this.f266667d;
            if (!emojiPanelRecyclerView.f266649A1) {
                RecyclerView.C16613e adapter = emojiPanelRecyclerView.getAdapter();
                C98734m mVar = adapter instanceof C98734m ? (C98734m) adapter : null;
                if (mVar != null && (D0 = emojiPanelRecyclerView.mo17019D0(emojiPanelRecyclerView.f266654F1, emojiPanelRecyclerView.f266655G1)) != null) {
                    int N0 = emojiPanelRecyclerView.mo17029N0(D0);
                    C99148f.f290705b.f265462h = N0;
                    C97927q0 item = mVar.getItem(N0);
                    C98498a aVar = emojiPanelRecyclerView.f266662N1;
                    boolean z = true;
                    if (aVar == null || !aVar.mo106488a(D0, item)) {
                        z = false;
                    }
                    emojiPanelRecyclerView.f266650B1 = z;
                    if (z && (emojiPanelGroupView = emojiPanelRecyclerView.f266661M1) != null) {
                        emojiPanelGroupView.setScrollEnable(false);
                    }
                    String str = emojiPanelRecyclerView.f266665y1;
                    Log.m105924i(str, "long press: " + emojiPanelRecyclerView.f266650B1);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiPanelRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f266665y1 = "MicroMsg.EmojiPanelRecyclerView";
        this.f266658J1 = true;
        this.f266660L1 = new C92658a(this);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f266657I1 = (long) ViewConfiguration.getLongPressTimeout();
        this.f266656H1 = viewConfiguration.getScaledTouchSlop();
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
            boolean r0 = r6.f266658J1
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
            r6.f266654F1 = r0
            float r0 = r7.getY()
            r6.f266655G1 = r0
            boolean r0 = r6.f266666z1
            if (r0 == 0) goto L_0x0094
            boolean r0 = r6.f266649A1
            if (r0 != 0) goto L_0x0094
            float r0 = r6.f266652D1
            float r4 = r7.getX()
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r4 = r6.f266656H1
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0058
            float r0 = r6.f266653E1
            float r4 = r7.getY()
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r4 = r6.f266656H1
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0094
        L_0x0058:
            r6.f266649A1 = r3
            boolean r0 = r6.f266650B1
            if (r0 != 0) goto L_0x0094
            java.lang.Runnable r0 = r6.f266660L1
            r6.removeCallbacks(r0)
            goto L_0x0094
        L_0x0064:
            r6.f266666z1 = r2
            r6.f266649A1 = r2
            goto L_0x0094
        L_0x0069:
            r6.f266666z1 = r3
            r6.f266650B1 = r2
            r6.f266649A1 = r2
            r6.f266651C1 = r2
            float r0 = r7.getX()
            r6.f266652D1 = r0
            float r0 = r7.getY()
            r6.f266653E1 = r0
            float r0 = r7.getX()
            r6.f266654F1 = r0
            float r0 = r7.getY()
            r6.f266655G1 = r0
            boolean r0 = r6.f266658J1
            if (r0 == 0) goto L_0x0094
            java.lang.Runnable r0 = r6.f266660L1
            long r4 = r6.f266657I1
            r6.postDelayed(r0, r4)
        L_0x0094:
            boolean r0 = r6.f266650B1
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r6.f266651C1
            if (r0 != 0) goto L_0x00ab
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r7)
            r0.setAction(r1)
            super.dispatchTouchEvent(r0)
            r0.recycle()
            r6.f266651C1 = r3
        L_0x00ab:
            int r0 = r7.getActionMasked()
            r4 = 0
            if (r0 == r1) goto L_0x00b8
            int r0 = r7.getActionMasked()
            if (r0 != r3) goto L_0x00e0
        L_0x00b8:
            java.lang.Runnable r0 = r6.f266660L1
            r6.removeCallbacks(r0)
            r6.f266650B1 = r2
            com.tencent.mm.emoji.panel.EmojiPanelGroupView r0 = r6.f266661M1
            if (r0 == 0) goto L_0x00c6
            r0.setScrollEnable(r3)
        L_0x00c6:
            hq3.a r0 = r6.f266662N1
            if (r0 == 0) goto L_0x00cd
            r0.mo106490c()
        L_0x00cd:
            hq3.a r0 = r6.f266662N1
            boolean r1 = r0 instanceof jp3.C9486a
            if (r1 == 0) goto L_0x00d6
            jp3.a r0 = (jp3.C9486a) r0
            goto L_0x00d7
        L_0x00d6:
            r0 = r4
        L_0x00d7:
            if (r0 == 0) goto L_0x00e0
            jp3.b<jp3.a> r1 = r6.f266663O1
            if (r1 == 0) goto L_0x00e0
            r1.keep(r0)
        L_0x00e0:
            boolean r0 = r6.f266650B1
            if (r0 == 0) goto L_0x013b
            java.lang.String r7 = r6.f266665y1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updatePopView: "
            r0.append(r1)
            float r1 = r6.f266654F1
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r1 = r6.f266655G1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            com.tencent.mm.emoji.panel.EmojiPanelGroupView r7 = r6.f266661M1
            if (r7 == 0) goto L_0x010e
            r7.setScrollEnable(r2)
        L_0x010e:
            androidx.recyclerview.widget.RecyclerView$e r7 = r6.getAdapter()
            boolean r0 = r7 instanceof p171il.C98734m
            if (r0 == 0) goto L_0x0119
            r4 = r7
            il.m r4 = (p171il.C98734m) r4
        L_0x0119:
            if (r4 != 0) goto L_0x011c
            goto L_0x013a
        L_0x011c:
            float r7 = r6.f266654F1
            float r0 = r6.f266655G1
            android.view.View r7 = r6.mo17019D0(r7, r0)
            if (r7 != 0) goto L_0x0127
            goto L_0x013a
        L_0x0127:
            int r0 = r6.mo17029N0(r7)
            com.tencent.mm.autogen.mmdata.rpt.EmoticonFastManagementStruct r1 = p585kl.C99148f.f290705b
            r1.f265462h = r0
            fl.q0 r0 = r4.getItem(r0)
            hq3.a r1 = r6.f266662N1
            if (r1 == 0) goto L_0x013a
            r1.mo106489b(r7, r0)
        L_0x013a:
            return r3
        L_0x013b:
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.emoji.panel.EmojiPanelRecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean getEnableLongPress() {
        return this.f266658J1;
    }

    public final C9487b<C9486a> getPanelLifeCycle() {
        return this.f266663O1;
    }

    public final int getScene() {
        return this.f266659K1;
    }

    public final C60338x getSizeResolver() {
        return this.f266664P1;
    }

    public final float getTouchX() {
        return this.f266654F1;
    }

    public final float getTouchY() {
        return this.f266655G1;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof EmojiPanelGroupView) {
                this.f266661M1 = (EmojiPanelGroupView) parent;
                return;
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (this.f266650B1) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onMeasure(int i, int i2) {
        C60338x xVar = this.f266664P1;
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
        C60338x xVar = this.f266664P1;
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

    public final void setEmojiPopupType(int i) {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        this.f266662N1 = new C98499b(context, i);
    }

    public final void setEnableLongPress(boolean z) {
        this.f266658J1 = z;
    }

    public final void setPanelLifeCycle(C9487b<C9486a> bVar) {
        this.f266663O1 = bVar;
    }

    public final void setScene(int i) {
        this.f266659K1 = i;
    }

    public final void setSizeResolver(C60338x xVar) {
        this.f266664P1 = xVar;
    }

    public final void setTouchX(float f) {
        this.f266654F1 = f;
    }

    public final void setTouchY(float f) {
        this.f266655G1 = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmojiPanelRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
