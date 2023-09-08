package com.tencent.p014mm.plugin.emoji.p040ui.p319v3.widget.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import hq3.C98498a;
import hq3.C98506g;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/widget/preview/PreviewRelativeEmotionRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.widget.preview.PreviewRelativeEmotionRecyclerView */
public final class PreviewRelativeEmotionRecyclerView extends RecyclerView {

    /* renamed from: A1 */
    public boolean f269090A1;

    /* renamed from: B1 */
    public boolean f269091B1;

    /* renamed from: C1 */
    public boolean f269092C1;

    /* renamed from: D1 */
    public boolean f269093D1;

    /* renamed from: E1 */
    public float f269094E1;

    /* renamed from: F1 */
    public float f269095F1;

    /* renamed from: G1 */
    public float f269096G1;

    /* renamed from: H1 */
    public float f269097H1;

    /* renamed from: I1 */
    public final int f269098I1;

    /* renamed from: J1 */
    public final long f269099J1;

    /* renamed from: K1 */
    public boolean f269100K1;

    /* renamed from: L1 */
    public final Runnable f269101L1;

    /* renamed from: y1 */
    public final String f269102y1;

    /* renamed from: z1 */
    public C98498a f269103z1;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.widget.preview.PreviewRelativeEmotionRecyclerView$a */
    public static final class C93272a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ PreviewRelativeEmotionRecyclerView f269104d;

        public C93272a(PreviewRelativeEmotionRecyclerView previewRelativeEmotionRecyclerView) {
            this.f269104d = previewRelativeEmotionRecyclerView;
        }

        /* JADX WARNING: type inference failed for: r1v5, types: [s61.c] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                com.tencent.mm.plugin.emoji.ui.v3.widget.preview.PreviewRelativeEmotionRecyclerView r0 = r6.f269104d
                boolean r1 = r0.f269091B1
                if (r1 != 0) goto L_0x006c
                androidx.recyclerview.widget.RecyclerView$e r1 = r0.getAdapter()
                boolean r2 = r1 instanceof s61.C101551k
                r3 = 0
                if (r2 == 0) goto L_0x0012
                s61.k r1 = (s61.C101551k) r1
                goto L_0x0013
            L_0x0012:
                r1 = r3
            L_0x0013:
                if (r1 != 0) goto L_0x0016
                goto L_0x006c
            L_0x0016:
                float r2 = r0.f269096G1
                float r4 = r0.f269097H1
                android.view.View r2 = r0.mo17019D0(r2, r4)
                if (r2 != 0) goto L_0x0021
                goto L_0x006c
            L_0x0021:
                int r4 = r0.mo17029N0(r2)
                com.tencent.mm.autogen.mmdata.rpt.EmoticonFastManagementStruct r5 = p585kl.C99148f.f290705b
                r5.f265462h = r4
                java.util.ArrayList<s61.c> r1 = r1.f297294f
                java.lang.Object r1 = r1.get(r4)
                java.lang.String r4 = "itemList[pos]"
                gy3.C87412m.m108593f(r1, r4)
                s61.c r1 = (s61.C101543c) r1
                boolean r4 = r1 instanceof s61.C101552m
                if (r4 == 0) goto L_0x003e
                r3 = r1
                s61.m r3 = (s61.C101552m) r3
            L_0x003e:
                if (r3 == 0) goto L_0x0053
                com.tencent.mm.storage.emotion.EmojiInfo r1 = r3.f297296a
                if (r1 == 0) goto L_0x0053
                hq3.a r3 = r0.f269103z1
                r4 = 1
                if (r3 == 0) goto L_0x0050
                boolean r1 = r3.mo106488a(r2, r1)
                if (r1 != r4) goto L_0x0050
                goto L_0x0051
            L_0x0050:
                r4 = 0
            L_0x0051:
                r0.f269092C1 = r4
            L_0x0053:
                java.lang.String r1 = r0.f269102y1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "long press: "
                r2.append(r3)
                boolean r0 = r0.f269092C1
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.p319v3.widget.preview.PreviewRelativeEmotionRecyclerView.C93272a.run():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PreviewRelativeEmotionRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [s61.c] */
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
            boolean r0 = r6.f269100K1
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
            r6.f269096G1 = r0
            float r0 = r7.getY()
            r6.f269097H1 = r0
            boolean r0 = r6.f269090A1
            if (r0 == 0) goto L_0x0094
            boolean r0 = r6.f269091B1
            if (r0 != 0) goto L_0x0094
            float r0 = r6.f269094E1
            float r4 = r7.getX()
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r4 = r6.f269098I1
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0058
            float r0 = r6.f269095F1
            float r4 = r7.getY()
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r4 = r6.f269098I1
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0094
        L_0x0058:
            r6.f269091B1 = r3
            boolean r0 = r6.f269092C1
            if (r0 != 0) goto L_0x0094
            java.lang.Runnable r0 = r6.f269101L1
            r6.removeCallbacks(r0)
            goto L_0x0094
        L_0x0064:
            r6.f269090A1 = r2
            r6.f269091B1 = r2
            goto L_0x0094
        L_0x0069:
            r6.f269090A1 = r3
            r6.f269092C1 = r2
            r6.f269091B1 = r2
            r6.f269093D1 = r2
            float r0 = r7.getX()
            r6.f269094E1 = r0
            float r0 = r7.getY()
            r6.f269095F1 = r0
            float r0 = r7.getX()
            r6.f269096G1 = r0
            float r0 = r7.getY()
            r6.f269097H1 = r0
            boolean r0 = r6.f269100K1
            if (r0 == 0) goto L_0x0094
            java.lang.Runnable r0 = r6.f269101L1
            long r4 = r6.f269099J1
            r6.postDelayed(r0, r4)
        L_0x0094:
            boolean r0 = r6.f269092C1
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r6.f269093D1
            if (r0 != 0) goto L_0x00ab
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r7)
            r0.setAction(r1)
            super.dispatchTouchEvent(r0)
            r0.recycle()
            r6.f269093D1 = r3
        L_0x00ab:
            int r0 = r7.getActionMasked()
            if (r0 == r1) goto L_0x00b7
            int r0 = r7.getActionMasked()
            if (r0 != r3) goto L_0x00c5
        L_0x00b7:
            java.lang.Runnable r0 = r6.f269101L1
            r6.removeCallbacks(r0)
            r6.f269092C1 = r2
            hq3.a r0 = r6.f269103z1
            if (r0 == 0) goto L_0x00c5
            r0.mo106490c()
        L_0x00c5:
            boolean r0 = r6.f269092C1
            if (r0 == 0) goto L_0x0132
            java.lang.String r7 = r6.f269102y1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updatePopView: "
            r0.append(r1)
            float r1 = r6.f269096G1
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r1 = r6.f269097H1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            androidx.recyclerview.widget.RecyclerView$e r7 = r6.getAdapter()
            boolean r0 = r7 instanceof s61.C101551k
            r1 = 0
            if (r0 == 0) goto L_0x00f8
            s61.k r7 = (s61.C101551k) r7
            goto L_0x00f9
        L_0x00f8:
            r7 = r1
        L_0x00f9:
            if (r7 != 0) goto L_0x00fc
            goto L_0x0131
        L_0x00fc:
            float r0 = r6.f269096G1
            float r2 = r6.f269097H1
            android.view.View r0 = r6.mo17019D0(r0, r2)
            if (r0 != 0) goto L_0x0107
            goto L_0x0131
        L_0x0107:
            int r2 = r6.mo17029N0(r0)
            com.tencent.mm.autogen.mmdata.rpt.EmoticonFastManagementStruct r4 = p585kl.C99148f.f290705b
            r4.f265462h = r2
            java.util.ArrayList<s61.c> r7 = r7.f297294f
            java.lang.Object r7 = r7.get(r2)
            java.lang.String r2 = "itemList[pos]"
            gy3.C87412m.m108593f(r7, r2)
            s61.c r7 = (s61.C101543c) r7
            boolean r2 = r7 instanceof s61.C101552m
            if (r2 == 0) goto L_0x0124
            r1 = r7
            s61.m r1 = (s61.C101552m) r1
        L_0x0124:
            if (r1 == 0) goto L_0x0131
            com.tencent.mm.storage.emotion.EmojiInfo r7 = r1.f297296a
            if (r7 == 0) goto L_0x0131
            hq3.a r1 = r6.f269103z1
            if (r1 == 0) goto L_0x0131
            r1.mo106489b(r0, r7)
        L_0x0131:
            return r3
        L_0x0132:
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.p319v3.widget.preview.PreviewRelativeEmotionRecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (this.f269092C1) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewRelativeEmotionRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f269102y1 = "MicroMsg.PreviewRelativeEmotionRecyclerView";
        this.f269100K1 = true;
        this.f269101L1 = new C93272a(this);
        this.f269103z1 = new C98506g(context, -1);
        this.f269099J1 = (long) ViewConfiguration.getLongPressTimeout();
        this.f269098I1 = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
