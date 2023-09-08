package ai2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.PhotoEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import gi2.C98129b;
import gy3.C87412m;
import o40.C61926c;
import zg2.C103020m;

/* renamed from: ai2.u */
public final class C92027u extends C92008b {

    /* renamed from: C */
    public final String f263535C = "MicroMsg.TipItemView";

    /* renamed from: D */
    public final int f263536D;

    /* renamed from: E */
    public final Matrix f263537E;

    /* renamed from: F */
    public C92025s f263538F;

    public C92027u(Context context) {
        super(context);
        this.f263536D = C74942w4.m89784a(context, 32);
        this.f263537E = new Matrix();
        setTextSize(getResources().getDimension(C0966R.dimen.a36));
    }

    /* renamed from: c */
    public final Bitmap mo126007c(C92025s sVar) {
        C87412m.m108594g(sVar, "item");
        setSourceDataType(C92011d.TIP);
        Context context = getContext();
        C87412m.m108593f(context, "context");
        PhotoEditText photoEditText = new PhotoEditText(context);
        photoEditText.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingLeft(), getPaddingTop());
        photoEditText.setTextColor(sVar.f263527h);
        photoEditText.setTextBackground(sVar.f263528i);
        photoEditText.setTextSize(0, getTextSize());
        photoEditText.setText(sVar.f263526g);
        photoEditText.setSingleLine(false);
        photoEditText.setTypeface(photoEditText.getTypeface(), 1);
        if (sVar.f263528i == 0 && sVar.f263527h != -16777216) {
            C61926c.m72678c(photoEditText);
        }
        int i = this.f263536D;
        C103020m mVar = C103020m.f303985a;
        Rect rect = C103020m.f303987c;
        photoEditText.setMaxWidth(i >= rect.left ? rect.width() - ((this.f263536D - C103020m.f303987c.left) * 2) : rect.width());
        photoEditText.measure(0, 0);
        int width = (photoEditText.getMeasuredWidth() <= 0 || photoEditText.getMeasuredWidth() > C103020m.f303987c.width()) ? C103020m.f303987c.width() : photoEditText.getMeasuredWidth();
        int height = (photoEditText.getMeasuredHeight() <= 0 || photoEditText.getMeasuredHeight() > C103020m.f303987c.height()) ? C103020m.f303987c.height() : photoEditText.getMeasuredHeight();
        String str = this.f263535C;
        Log.m105924i(str, "measuredWidth:" + photoEditText.getMeasuredWidth() + " , measuredHeight:" + photoEditText.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        photoEditText.draw(canvas);
        canvas.save();
        canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        photoEditText.getLayout().draw(canvas);
        canvas.restore();
        C87412m.m108593f(createBitmap, "bitmap");
        return createBitmap;
    }

    /* renamed from: d */
    public C92007a mo53771d() {
        C92007a d = super.mo53771d();
        if (d != null) {
            d.f263402a = C92011d.TIP;
        }
        return d;
    }

    public C92007a getEditorData() {
        Matrix matrix;
        C92025s sVar = this.f263538F;
        if (!(sVar == null || (matrix = sVar.f263407f) == null)) {
            matrix.set(getTouchTracker().f321806g);
        }
        C92025s sVar2 = this.f263538F;
        if (sVar2 != null) {
            sVar2.f263402a = C92011d.TIP;
        }
        return this.f263538F;
    }

    public C98129b getType() {
        return C98129b.EditItemTypeTip;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        this.f263537E.set(getTouchTracker().f321806g);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        getTouchTracker().f321806g.set(this.f263537E);
        return onTouchEvent;
    }

    public final void setText(C92025s sVar) {
        C87412m.m108594g(sVar, "item");
        this.f263538F = sVar;
        setText(sVar.f263526g);
        Bitmap c = mo126007c(sVar);
        setSourceDataType(C92011d.TIP);
        setColor(sVar.f263527h);
        setTextBg(sVar.f263528i);
        int i = sVar.f263529j;
        if (i != 0) {
            i += C74942w4.m89784a(getContext(), 24);
        }
        setMarginBottom(i);
        setBitmap(c);
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            float height = (((float) ((getValidRect().height() - C74942w4.m89784a(getContext(), 128)) - C75044y4.m89991c(getContext()))) - ((float) getMarginBottom())) - ((float) bitmap.getHeight());
            int i2 = this.f263536D;
            C103020m mVar = C103020m.f303985a;
            int i3 = C103020m.f303987c.left;
            getTouchTracker().f321806g.setTranslate(i2 >= i3 ? (float) i2 : (float) i3, height);
        }
        postInvalidate();
    }
}
