package com.tencent.p014mm.plugin.emojicapture.p841ui.editor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import i71.C108371a;
import i71.C108374c;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B\u001d\b\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/FontTextView;", "Landroid/view/View;", "", "width", "Lrx3/b0;", "setMaxWidth", "Landroid/graphics/Typeface;", "typeface", "setTypeface", "Li71/c;", "s", "Li71/c;", "getTextDrawer", "()Li71/c;", "setTextDrawer", "(Li71/c;)V", "textDrawer", "", "t", "Z", "getDrawStroke", "()Z", "setDrawStroke", "(Z)V", "drawStroke", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.FontTextView */
public final class FontTextView extends View {

    /* renamed from: d */
    public String f312516d;

    /* renamed from: e */
    public final Layout.Alignment f312517e;

    /* renamed from: f */
    public final float f312518f;

    /* renamed from: g */
    public TextPaint f312519g;

    /* renamed from: h */
    public TextPaint f312520h;

    /* renamed from: i */
    public StaticLayout f312521i;

    /* renamed from: j */
    public CharSequence f312522j;

    /* renamed from: n */
    public final int f312523n;

    /* renamed from: o */
    public float f312524o;

    /* renamed from: p */
    public float f312525p;

    /* renamed from: q */
    public float f312526q;

    /* renamed from: r */
    public float f312527r;

    /* renamed from: s */
    public C108374c f312528s;

    /* renamed from: t */
    public boolean f312529t;

    public FontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.f312517e = alignment;
        this.f312518f = 1.0f;
        this.f312519g = new TextPaint();
        this.f312520h = new TextPaint();
        this.f312522j = "";
        C87412m.m108591d(context);
        float dimension = context.getResources().getDimension(C0966R.dimen.f357020a31);
        this.f312526q = context.getResources().getDimension(C0966R.dimen.f357022a33);
        this.f312527r = context.getResources().getDimension(C0966R.dimen.f357023a34);
        String string = context.getResources().getString(C0966R.string.av4);
        C87412m.m108593f(string, "context.resources.getStr…pture_emoji_text_default)");
        this.f312516d = string;
        this.f312523n = C76577a.m92151b(context, 2);
        this.f312519g.setAntiAlias(true);
        this.f312519g.setTextSize(dimension);
        this.f312519g.setColor(Integer.MAX_VALUE);
        float b = (float) C76577a.m92151b(context, 1);
        this.f312519g.setShadowLayer(b, 0.0f, b, -16777216);
        this.f312520h.setStrokeWidth(context.getResources().getDimension(C0966R.dimen.a35));
        this.f312520h.setAntiAlias(true);
        this.f312520h.setTextSize(this.f312519g.getTextSize());
        this.f312520h.setStyle(Paint.Style.STROKE);
        this.f312521i = new StaticLayout(this.f312522j, this.f312519g, getWidth(), alignment, 1.0f, 0.0f, false);
        C108371a aVar = new C108371a();
        this.f312528s = aVar;
        String str = this.f312516d;
        this.f312522j = str;
        aVar.setText(str);
    }

    /* renamed from: a */
    public final void mo149546a(Canvas canvas, int i, float f) {
        C108374c cVar;
        if (i >= 0 && i < this.f312521i.getLineCount()) {
            float lineLeft = this.f312521i.getLineLeft(i) + ((float) getPaddingLeft());
            float paddingTop = ((float) getPaddingTop()) + ((float) this.f312521i.getLineBaseline(i)) + f;
            boolean z = this.f312521i.getEllipsisCount(i) > 0;
            StaticLayout staticLayout = this.f312521i;
            int lineStart = z ? staticLayout.getLineStart(i) + this.f312521i.getEllipsisStart(i) : staticLayout.getLineEnd(i);
            if (this.f312529t && (cVar = this.f312528s) != null) {
                cVar.mo158887c(canvas, this.f312521i.getLineStart(i), lineStart, lineLeft, paddingTop, this.f312520h, z);
            }
            C108374c cVar2 = this.f312528s;
            if (cVar2 != null) {
                cVar2.mo158887c(canvas, this.f312521i.getLineStart(i), lineStart, lineLeft, paddingTop, this.f312519g, z);
            }
        }
    }

    /* renamed from: b */
    public final void mo149547b(CharSequence charSequence, int i, int i2, boolean z) {
        if (z) {
            if (charSequence == null || charSequence.length() == 0) {
                this.f312529t = false;
                this.f312522j = this.f312516d;
                this.f312519g.setColor(Integer.MAX_VALUE);
                float b = (float) C76577a.m92151b(getContext(), 1);
                this.f312519g.setShadowLayer(b, 0.0f, b, -16777216);
            } else {
                this.f312529t = true;
                C87412m.m108591d(charSequence);
                this.f312522j = charSequence;
                this.f312519g.setColor(i);
                this.f312519g.clearShadowLayer();
            }
            this.f312520h.setColor(i2);
            C108374c cVar = this.f312528s;
            if (cVar != null) {
                cVar.setText(this.f312522j);
            }
            C108374c cVar2 = this.f312528s;
            if (cVar2 != null) {
                cVar2.mo158885a();
            }
        }
    }

    public final boolean getDrawStroke() {
        return this.f312529t;
    }

    public final C108374c getTextDrawer() {
        return this.f312528s;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        canvas.save();
        canvas.translate(-this.f312524o, 0.0f);
        mo149546a(canvas, 0, 0.0f);
        mo149546a(canvas, 1, this.f312527r);
        canvas.restore();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        float f = this.f312525p;
        if (((float) size) > f) {
            size = (int) f;
        }
        int i3 = size - (this.f312523n * 2);
        StaticLayout staticLayout = this.f312521i;
        if (i3 >= 0) {
            C108374c cVar = this.f312528s;
            if (cVar != null) {
                cVar.mo158885a();
            }
            if (Build.VERSION.SDK_INT >= 23) {
                CharSequence charSequence = this.f312522j;
                staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f312519g, i3).setAlignment(this.f312517e).setIncludePad(false).setMaxLines(2).setLineSpacing(0.0f, this.f312518f).setEllipsize(TextUtils.TruncateAt.END).build();
                C87412m.m108593f(staticLayout, "obtain(text, 0, text.len…                 .build()");
            } else {
                staticLayout = new StaticLayout(this.f312522j, this.f312519g, i3, this.f312517e, this.f312518f, 0.0f, false);
            }
        }
        this.f312521i = staticLayout;
        float lineBottom = (float) (staticLayout.getLineBottom(0) - this.f312521i.getLineTop(0));
        if (lineBottom > this.f312526q) {
            this.f312526q = lineBottom;
        }
        int paddingBottom = ((int) (this.f312521i.getLineCount() <= 1 ? this.f312526q : (((float) 2) * this.f312526q) + this.f312527r)) + getPaddingBottom() + getPaddingTop();
        float lineLeft = this.f312521i.getLineLeft(0);
        float lineRight = this.f312521i.getLineRight(0);
        if (this.f312521i.getLineCount() > 1) {
            if (lineLeft > this.f312521i.getLineLeft(1)) {
                lineLeft = this.f312521i.getLineLeft(1);
            }
            if (lineRight < this.f312521i.getLineRight(1)) {
                lineRight = this.f312521i.getLineRight(1);
            }
        }
        int i4 = this.f312523n;
        this.f312524o = lineLeft - ((float) i4);
        setMeasuredDimension((int) ((lineRight - lineLeft) + ((float) (i4 * 2))), paddingBottom);
    }

    public final void setDrawStroke(boolean z) {
        this.f312529t = z;
    }

    public final void setMaxWidth(float f) {
        this.f312525p = f;
    }

    public final void setTextDrawer(C108374c cVar) {
        this.f312528s = cVar;
    }

    public final void setTypeface(Typeface typeface) {
        this.f312519g.setTypeface(typeface);
        this.f312520h.setTypeface(typeface);
    }

    public FontTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
