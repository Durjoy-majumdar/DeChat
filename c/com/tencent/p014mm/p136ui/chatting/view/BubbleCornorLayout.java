package com.tencent.p014mm.p136ui.chatting.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\n¢\u0006\u0004\b,\u0010-R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010&\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006."}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/view/BubbleCornorLayout;", "Landroid/widget/RelativeLayout;", "", "d", "Ljava/lang/String;", "getBUBBLE_ORIENTATION", "()Ljava/lang/String;", "setBUBBLE_ORIENTATION", "(Ljava/lang/String;)V", "BUBBLE_ORIENTATION", "", "e", "I", "getBUBBLE_RADIUS", "()I", "setBUBBLE_RADIUS", "(I)V", "BUBBLE_RADIUS", "f", "getBUBBLE_OFFSET", "setBUBBLE_OFFSET", "BUBBLE_OFFSET", "g", "getCORNER_RADIUS", "setCORNER_RADIUS", "CORNER_RADIUS", "h", "getEXTRA_PADDING", "setEXTRA_PADDING", "EXTRA_PADDING", "Landroid/graphics/Path;", "i", "Landroid/graphics/Path;", "getMFinalPath", "()Landroid/graphics/Path;", "mFinalPath", "j", "getMBubbleCornerPath", "mBubbleCornerPath", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.view.BubbleCornorLayout */
public final class BubbleCornorLayout extends RelativeLayout {

    /* renamed from: d */
    public String f216790d;

    /* renamed from: e */
    public int f216791e;

    /* renamed from: f */
    public int f216792f;

    /* renamed from: g */
    public int f216793g;

    /* renamed from: h */
    public int f216794h;

    /* renamed from: i */
    public final Path f216795i;

    /* renamed from: j */
    public final Path f216796j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BubbleCornorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final Matrix mo102910a(float f, float f2) {
        int i = this.f216792f;
        Matrix matrix = new Matrix();
        String str = this.f216790d;
        float f3 = 0.0f;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3317767) {
                if (hashCode == 3387192) {
                    str.equals("none");
                } else if (hashCode == 108511772 && str.equals("right")) {
                    f3 = ((float) i) - ((float) 1);
                    matrix.postRotate(180.0f);
                    matrix.postTranslate(f, f3);
                    return matrix;
                }
            } else if (str.equals("left")) {
                matrix.postRotate(0.0f);
                f3 = (float) i;
            }
        }
        f = 0.0f;
        matrix.postTranslate(f, f3);
        return matrix;
    }

    public final int getBUBBLE_OFFSET() {
        return this.f216792f;
    }

    public final String getBUBBLE_ORIENTATION() {
        return this.f216790d;
    }

    public final int getBUBBLE_RADIUS() {
        return this.f216791e;
    }

    public final int getCORNER_RADIUS() {
        return this.f216793g;
    }

    public final int getEXTRA_PADDING() {
        return this.f216794h;
    }

    public final Path getMBubbleCornerPath() {
        return this.f216796j;
    }

    public final Path getMFinalPath() {
        return this.f216795i;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        this.f216795i.rewind();
        float width = (float) canvas.getWidth();
        float height = (float) canvas.getHeight();
        String str = this.f216790d;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3317767) {
                if (hashCode != 3387192) {
                    if (hashCode == 108511772 && str.equals("right")) {
                        this.f216795i.addPath(this.f216796j, mo102910a(width, height));
                        Path path = this.f216795i;
                        RectF rectF = new RectF((float) this.f216794h, -1.0f, (width - ((float) this.f216791e)) + ((float) 1), height);
                        int i = this.f216793g;
                        path.addRoundRect(rectF, (float) i, (float) i, Path.Direction.CW);
                    }
                } else if (str.equals("none")) {
                    Path path2 = this.f216795i;
                    RectF rectF2 = new RectF((float) this.f216794h, 0.0f, width + ((float) 3), height);
                    int i2 = this.f216793g;
                    path2.addRoundRect(rectF2, (float) i2, (float) i2, Path.Direction.CW);
                }
            } else if (str.equals("left")) {
                this.f216795i.addPath(this.f216796j, mo102910a(width, height));
                Path path3 = this.f216795i;
                RectF rectF3 = new RectF((float) this.f216791e, 0.0f, width - ((float) this.f216794h), height);
                int i3 = this.f216793g;
                path3.addRoundRect(rectF3, (float) i3, (float) i3, Path.Direction.CW);
            }
        }
        canvas.clipPath(this.f216795i);
        super.onDraw(canvas);
    }

    public final void setBUBBLE_OFFSET(int i) {
        this.f216792f = i;
    }

    public final void setBUBBLE_ORIENTATION(String str) {
        this.f216790d = str;
    }

    public final void setBUBBLE_RADIUS(int i) {
        this.f216791e = i;
    }

    public final void setCORNER_RADIUS(int i) {
        this.f216793g = i;
    }

    public final void setEXTRA_PADDING(int i) {
        this.f216794h = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0068 A[Catch:{ all -> 0x008f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BubbleCornorLayout(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r5, r0)
            r4.<init>(r5, r6, r7)
            java.lang.String r7 = "none"
            r4.f216790d = r7
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 4
            int r0 = kg3.C76577a.m92151b(r0, r1)
            r4.f216791e = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 15
            int r0 = kg3.C76577a.m92151b(r0, r2)
            r4.f216792f = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r0 = kg3.C76577a.m92151b(r0, r1)
            r4.f216793g = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r4.f216795i = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r4.f216796j = r0
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r4.setLayoutParams(r2)
            r2 = 1
            if (r6 == 0) goto L_0x0094
            int[] r3 = com.tencent.p014mm.C0966R.C0967a.f2317f
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r3)
            java.lang.String r6 = "context.obtainStyledAttr…eable.bubbleCornorLayout)"
            gy3.C87412m.m108593f(r5, r6)
            r6 = 3
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x008f }
            r4.f216790d = r6     // Catch:{ all -> 0x008f }
            r3 = 0
            if (r6 == 0) goto L_0x0065
            int r6 = r6.length()     // Catch:{ all -> 0x008f }
            if (r6 != 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r6 = 0
            goto L_0x0066
        L_0x0065:
            r6 = 1
        L_0x0066:
            if (r6 == 0) goto L_0x006a
            r4.f216790d = r7     // Catch:{ all -> 0x008f }
        L_0x006a:
            int r6 = r4.f216791e     // Catch:{ all -> 0x008f }
            int r6 = r5.getDimensionPixelSize(r1, r6)     // Catch:{ all -> 0x008f }
            r4.f216791e = r6     // Catch:{ all -> 0x008f }
            r6 = 2
            int r7 = r4.f216792f     // Catch:{ all -> 0x008f }
            int r6 = r5.getDimensionPixelSize(r6, r7)     // Catch:{ all -> 0x008f }
            r4.f216792f = r6     // Catch:{ all -> 0x008f }
            int r6 = r4.f216793g     // Catch:{ all -> 0x008f }
            int r6 = r5.getDimensionPixelSize(r3, r6)     // Catch:{ all -> 0x008f }
            r4.f216793g = r6     // Catch:{ all -> 0x008f }
            int r6 = r4.f216794h     // Catch:{ all -> 0x008f }
            int r6 = r5.getDimensionPixelSize(r2, r6)     // Catch:{ all -> 0x008f }
            r4.f216794h = r6     // Catch:{ all -> 0x008f }
            r5.recycle()
            goto L_0x0094
        L_0x008f:
            r6 = move-exception
            r5.recycle()
            throw r6
        L_0x0094:
            r5 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6 = 0
            r0.moveTo(r5, r6)
            int r5 = r4.f216791e
            float r5 = (float) r5
            float r6 = -r5
            float r7 = (float) r2
            float r6 = r6 - r7
            r0.lineTo(r5, r6)
            int r5 = r4.f216791e
            float r5 = (float) r5
            float r7 = r7 + r5
            r0.lineTo(r5, r7)
            r0.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.view.BubbleCornorLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
