package ai2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import bi2.C92264c;
import ci2.C104380d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.PhotoEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gi2.C98129b;
import gy3.C87412m;
import kg3.C76577a;
import o40.C61926c;
import te3.C101769d70;
import zg2.C103020m;

/* renamed from: ai2.t */
public final class C92026t extends C92008b {

    /* renamed from: C */
    public final String f263532C = "MicroMsg.TextItemView";

    /* renamed from: D */
    public C92025s f263533D;

    /* renamed from: E */
    public String f263534E;

    public C92026t(Context context) {
        super(context);
        setTextSize(getResources().getDimension(C0966R.dimen.f357021a32));
        this.f263534E = "";
    }

    /* renamed from: c */
    public final Bitmap mo126000c(C92025s sVar) {
        Bitmap bitmap;
        C87412m.m108594g(sVar, "item");
        setSourceDataType(C92011d.TEXT);
        Context context = getContext();
        C87412m.m108593f(context, "context");
        PhotoEditText photoEditText = new PhotoEditText(context);
        int b = C76577a.m92151b(getContext(), 16);
        int b2 = C76577a.m92151b(getContext(), 8);
        photoEditText.setPadding(b, b2, b, b2);
        photoEditText.setTextColor(sVar.f263527h);
        photoEditText.setTextBackground(sVar.f263528i);
        photoEditText.setTextSize(0, getTextSize());
        photoEditText.setText(String.valueOf(sVar.f263526g));
        photoEditText.setSingleLine(false);
        if (!(sVar.f263530k.length() > 0)) {
            photoEditText.setTypeface(photoEditText.getTypeface(), 1);
        } else if (C86013q1.m106450k(sVar.f263530k)) {
            photoEditText.setTypeface(Typeface.createFromFile(sVar.f263530k));
        } else {
            photoEditText.setTypeface(Typeface.DEFAULT);
        }
        if (sVar.f263528i == 0 && sVar.f263527h != -16777216) {
            C61926c.m72678c(photoEditText);
        }
        C103020m mVar = C103020m.f303985a;
        int width = C103020m.f303987c.width();
        if (width > 0) {
            photoEditText.setMaxWidth(width);
        }
        photoEditText.measure(0, 0);
        int width2 = (photoEditText.getMeasuredWidth() <= 0 || photoEditText.getMeasuredWidth() > C103020m.f303987c.width()) ? C103020m.f303987c.width() : photoEditText.getMeasuredWidth();
        int height = (photoEditText.getMeasuredHeight() <= 0 || photoEditText.getMeasuredHeight() > C103020m.f303987c.height()) ? C103020m.f303987c.height() : photoEditText.getMeasuredHeight();
        if (width2 <= 0 || height <= 0) {
            String str = this.f263532C;
            Log.m105928w(str, "create bitmap size error: " + width2 + ", " + height);
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        } else {
            bitmap = Bitmap.createBitmap(width2, height, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap);
        photoEditText.draw(canvas);
        canvas.save();
        canvas.translate((float) b, (float) b2);
        photoEditText.getLayout().draw(canvas);
        canvas.restore();
        C87412m.m108593f(bitmap, "bitmap");
        return bitmap;
    }

    /* renamed from: d */
    public C92007a mo53771d() {
        C92007a d = super.mo53771d();
        C92025s sVar = this.f263533D;
        if (sVar != null) {
            if (d != null) {
                C104380d dVar = sVar.f263404c;
                C87412m.m108594g(dVar, "range");
                d.f263404c.mo146050d(dVar.mo146049c(), dVar.mo146048b());
            }
            if (d != null) {
                d.f263405d = sVar.f263405d;
            }
            if (d instanceof C92025s) {
                C92025s sVar2 = (C92025s) d;
                String str = this.f263534E;
                sVar2.getClass();
                C87412m.m108594g(str, "<set-?>");
                sVar2.f263530k = str;
            }
        }
        return d;
    }

    /* renamed from: g */
    public final C92264c mo126001g(C92025s sVar) {
        C87412m.m108594g(sVar, "item");
        C92264c cVar = new C92264c(mo126000c(sVar), sVar.f263407f);
        C101769d70 d702 = new C101769d70();
        d702.f298084d = sVar.f263404c.mo146049c();
        d702.f298085e = sVar.f263404c.mo146048b();
        cVar.f264074c = d702;
        return cVar;
    }

    public C92007a getEditorData() {
        return this.f263533D;
    }

    public final String getFont() {
        return this.f263534E;
    }

    public C98129b getType() {
        return C98129b.EditItemTypeText;
    }

    /* renamed from: j */
    public final void mo126003j(float f, float f2) {
        boolean z = true;
        if (!(f == 0.0f)) {
            if (f2 != 0.0f) {
                z = false;
            }
            if (!z) {
                getTouchTracker().f321806g.setScale(f, f2);
            }
        }
    }

    /* renamed from: k */
    public final void mo126004k(C92025s sVar) {
        C87412m.m108594g(sVar, "item");
        setText(sVar);
        setViewMatrix(sVar.f263407f);
        getTouchTracker().f321806g.set(sVar.f263407f);
        setSourceDataType(C92011d.TEXT);
    }

    public final void setFont(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f263534E = str;
    }

    public final void setText(C92025s sVar) {
        C87412m.m108594g(sVar, "item");
        this.f263533D = sVar;
        Bitmap c = mo126000c(sVar);
        setText(sVar.f263526g);
        setSourceDataType(C92011d.TEXT);
        setColor(sVar.f263527h);
        setTextBg(sVar.f263528i);
        this.f263534E = sVar.f263530k;
        if (getBitmap() == null) {
            getTouchTracker().f321806g.postTranslate(((float) (-getWidth())) / 2.0f, -((((float) ((getDisplayRect().top + getDisplayRect().bottom) / 2)) - (((float) (getValidRect().top + getValidRect().bottom)) / 2.0f)) + (((float) getHeight()) / 2.0f)));
        }
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            getTouchTracker().f321806g.preTranslate(((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
        }
        setBitmap(c);
        postInvalidate();
    }
}
