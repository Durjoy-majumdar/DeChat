package com.tencent.p014mm.plugin.emojicapture.p841ui.editor;

import ai2.C92007a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import bi2.C92262a;
import bi2.C92264c;
import bi2.C92266e;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.emoji.view.EmojiStatusView;
import d71.C107004d;
import fi2.C107554b;
import gy3.C87412m;
import kotlin.Metadata;
import qz1.C22180d;
import qz1.C22187h;
import y61.C112394e;
import y61.C112395f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0006\u0010\r\u001a\u00020\f¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/EmojiEditorItemView;", "Lcom/tencent/mm/emoji/view/EmojiStatusView;", "Ly61/f;", "", "editing", "Lrx3/b0;", "setEditing", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer;", "getItemContainer", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "Landroid/graphics/Matrix;", "getTouchMatrix", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView */
public final class EmojiEditorItemView extends EmojiStatusView implements C112395f {

    /* renamed from: r */
    public final C112394e f312515r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiEditorItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f312515r = new C107004d(this);
    }

    /* renamed from: b */
    public void mo137605b(RectF rectF, float f) {
        C87412m.m108594g(rectF, "bounds");
        C107004d dVar = (C107004d) this.f312515r;
        dVar.getClass();
        dVar.f320310c.set(rectF);
        dVar.f320311d.addRoundRect(new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom), f, f, Path.Direction.CW);
        dVar.mo157448a();
    }

    /* renamed from: d */
    public C92007a mo53771d() {
        return null;
    }

    public EditorItemContainer getItemContainer() {
        if (!(getParent().getParent() instanceof EditorItemContainer)) {
            return null;
        }
        ViewParent parent = getParent().getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer");
        return (EditorItemContainer) parent;
    }

    public final Matrix getTouchMatrix() {
        return ((C107004d) this.f312515r).f320309b.f321806g;
    }

    /* renamed from: i */
    public C92262a mo53781i(Matrix matrix) {
        if (getEmojiInfo() == null) {
            return null;
        }
        if (getDrawable() instanceof BitmapDrawable) {
            Drawable drawable = getDrawable();
            C87412m.m108592e(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Matrix matrix2 = new Matrix();
            matrix2.set(((C107004d) this.f312515r).f320309b.f321806g);
            if (matrix != null) {
                matrix2.postConcat(matrix);
            }
            return new C92264c(bitmap, matrix2);
        }
        float f = 1.0f;
        if (getDrawable() instanceof C22180d) {
            Drawable drawable2 = getDrawable();
            C87412m.m108592e(drawable2, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMGIFDrawable");
            f = ((C22180d) drawable2).mo35284e();
        } else if (getDrawable() instanceof C22187h) {
            Drawable drawable3 = getDrawable();
            C87412m.m108592e(drawable3, "null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMWXGFDrawable");
            f = ((C22187h) drawable3).mo35304e();
        }
        Matrix matrix3 = new Matrix();
        matrix3.setScale(f, f);
        matrix3.postConcat(((C107004d) this.f312515r).f320309b.f321806g);
        if (matrix != null) {
            matrix3.postConcat(matrix);
        }
        IEmojiInfo emojiInfo = getEmojiInfo();
        C87412m.m108591d(emojiInfo);
        return new C92266e(emojiInfo, matrix3);
    }

    /* renamed from: n */
    public boolean mo137606n() {
        return false;
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C87412m.m108594g(canvas2, "canvas");
        canvas.save();
        C107004d dVar = (C107004d) this.f312515r;
        dVar.getClass();
        if (dVar.f320315h) {
            canvas2.clipPath(dVar.f320311d);
        }
        canvas2.setMatrix(dVar.f320309b.f321806g);
        if (dVar.f320314g) {
            Rect rect = dVar.f320312e;
            float f = dVar.f320320m;
            float f2 = dVar.f320316i;
            float f3 = f / f2;
            float f4 = ((float) rect.left) - f3;
            float f5 = ((float) rect.top) - f3;
            float f6 = ((float) rect.right) + f3;
            float f7 = ((float) rect.bottom) + f3;
            float f8 = (dVar.f320321n / ((float) 2)) / f2;
            dVar.f320313f.setStrokeWidth(dVar.f320319l / f2);
            float f9 = f4 - f8;
            float f15 = f4 + f8;
            Canvas canvas3 = canvas;
            float f16 = f5 - f8;
            float f17 = f5 + f8;
            canvas3.drawRect(f9, f16, f15, f17, dVar.f320313f);
            float f18 = f6 - f8;
            float f19 = f6 + f8;
            canvas3.drawRect(f18, f16, f19, f17, dVar.f320313f);
            float f25 = f7 - f8;
            float f26 = f8 + f7;
            canvas3.drawRect(f18, f25, f19, f26, dVar.f320313f);
            canvas3.drawRect(f9, f25, f15, f26, dVar.f320313f);
            canvas2.drawLines(new float[]{f4, f5, f6, f5, f6, f5, f6, f7, f6, f7, f4, f7, f4, f7, f4, f5}, dVar.f320313f);
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.draw(canvas2);
        }
        canvas.restore();
        ((C107004d) this.f312515r).getClass();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r12 != 3) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r12, r0)
            y61.e r0 = r11.f312515r
            d71.d r0 = (d71.C107004d) r0
            r0.getClass()
            y61.f r1 = r0.f320308a
            com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer r1 = r1.getItemContainer()
            fi2.b r2 = r0.f320309b
            boolean r2 = r2.mo157997a(r12)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x00da
            if (r1 == 0) goto L_0x0023
            y61.f r2 = r0.f320308a
            r1.mo128120a(r2, r12)
        L_0x0023:
            int r12 = r12.getActionMasked()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.View"
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == 0) goto L_0x00ae
            r5 = 2
            if (r12 == r4) goto L_0x003b
            if (r12 == r5) goto L_0x0037
            r6 = 3
            if (r12 == r6) goto L_0x003b
            goto L_0x00cf
        L_0x0037:
            r0.f320315h = r3
            goto L_0x00cf
        L_0x003b:
            r0.f320315h = r4
            fi2.a r12 = new fi2.a
            r12.<init>()
            float r6 = r0.f320318k
            r12.f321789c = r6
            float r6 = r0.f320317j
            r12.f321790d = r6
            float[] r6 = new float[r5]
            android.graphics.Rect r7 = r0.f320312e
            int r7 = r7.width()
            float r7 = (float) r7
            float r7 = r7 / r2
            r6[r3] = r7
            android.graphics.Rect r7 = r0.f320312e
            int r7 = r7.height()
            float r7 = (float) r7
            float r7 = r7 / r2
            r6[r4] = r7
            r12.f321788b = r6
            android.graphics.RectF r6 = new android.graphics.RectF
            android.graphics.RectF r7 = r0.f320310c
            float r8 = r7.left
            float r9 = r7.top
            float r10 = r7.right
            float r7 = r7.bottom
            r6.<init>(r8, r9, r10, r7)
            r12.f321787a = r6
            float[] r5 = new float[r5]
            fi2.b r6 = r0.f320309b
            int r7 = r6.f321815p
            float r7 = (float) r7
            float r7 = r7 / r2
            r5[r3] = r7
            int r7 = r6.f321814o
            float r7 = (float) r7
            float r7 = r7 / r2
            r5[r4] = r7
            android.graphics.Matrix r2 = r6.f321806g
            r2.mapPoints(r5)
            android.graphics.RectF r2 = r12.f321787a
            r6 = r5[r3]
            r5 = r5[r4]
            boolean r2 = r2.contains(r6, r5)
            if (r2 != 0) goto L_0x00a1
            android.graphics.RectF r2 = new android.graphics.RectF
            float[] r5 = r0.f320322o
            r3 = r5[r3]
            r5 = r5[r4]
            r2.<init>(r3, r5, r3, r5)
            r12.f321787a = r2
        L_0x00a1:
            fi2.b r2 = r0.f320309b
            android.graphics.Matrix r2 = r2.f321806g
            d71.c r3 = new d71.c
            r3.<init>(r0)
            r12.mo157995a(r2, r3)
            goto L_0x00cf
        L_0x00ae:
            r0.f320315h = r4
            y61.f r12 = r0.f320308a
            gy3.C87412m.m108592e(r12, r1)
            android.view.View r12 = (android.view.View) r12
            r12.bringToFront()
            float[] r12 = r0.f320322o
            fi2.b r5 = r0.f320309b
            int r6 = r5.f321815p
            float r6 = (float) r6
            float r6 = r6 / r2
            r12[r3] = r6
            int r3 = r5.f321814o
            float r3 = (float) r3
            float r3 = r3 / r2
            r12[r4] = r3
            android.graphics.Matrix r2 = r5.f321806g
            r2.mapPoints(r12)
        L_0x00cf:
            y61.f r12 = r0.f320308a
            gy3.C87412m.m108592e(r12, r1)
            android.view.View r12 = (android.view.View) r12
            r12.invalidate()
            r3 = 1
        L_0x00da:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emojicapture.p841ui.editor.EmojiEditorItemView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setEditing(boolean z) {
        C107004d dVar = (C107004d) this.f312515r;
        dVar.f320314g = z;
        C112395f fVar = dVar.f320308a;
        C87412m.m108592e(fVar, "null cannot be cast to non-null type android.view.View");
        ((View) fVar).postInvalidate();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null) {
            C112394e eVar = this.f312515r;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            C107004d dVar = (C107004d) eVar;
            C107554b bVar = dVar.f320309b;
            bVar.f321815p = intrinsicWidth;
            bVar.f321814o = intrinsicHeight;
            Rect rect = dVar.f320312e;
            rect.right = intrinsicWidth;
            rect.bottom = intrinsicHeight;
            dVar.mo157448a();
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmojiEditorItemView(Context context) {
        this(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EmojiEditorItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
