package bi2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import p008bq.C92292x0;
import p384tk.C101900d;

/* renamed from: bi2.e */
public final class C92266e extends C92262a {

    /* renamed from: e */
    public IEmojiInfo f264087e;

    /* renamed from: f */
    public final String f264088f = "MicroMsg.EmojiEditorItem";

    /* renamed from: g */
    public C101900d f264089g;

    /* renamed from: h */
    public Bitmap f264090h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92266e(IEmojiInfo iEmojiInfo, Matrix matrix) {
        super(matrix);
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        C87412m.m108594g(matrix, "matrix");
        this.f264087e = iEmojiInfo;
    }

    /* renamed from: a */
    public long mo126255a(long j) {
        String str = this.f264088f;
        Log.m105918d(str, "request time is " + j + ", curr frame is " + this.f264073b);
        return super.mo126255a(j);
    }

    /* renamed from: b */
    public void mo126256b() {
        C101900d dVar = this.f264089g;
        if (dVar != null) {
            dVar.destroy();
        } else {
            C87412m.m108603p("decoder");
            throw null;
        }
    }

    /* renamed from: c */
    public void mo126257c(Canvas canvas, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
        if (mo126261g()) {
            canvas.save();
            canvas.concat(this.f264072a);
            Bitmap bitmap = this.f264090h;
            if (bitmap != null) {
                C87412m.m108591d(bitmap);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            }
            canvas.restore();
        }
    }

    /* renamed from: d */
    public void mo126258d() {
        String str = this.f264088f;
        Log.m105918d(str, "filepath is " + this.f264087e.mo62640K1());
        this.f264089g = ((C92292x0) C86312j.m106911c(C92292x0.class)).getDecoder(this.f264087e);
    }

    /* renamed from: e */
    public long mo126259e() {
        C101900d dVar = this.f264089g;
        if (dVar != null) {
            dVar.mo35631b();
            C101900d dVar2 = this.f264089g;
            if (dVar2 != null) {
                this.f264090h = dVar2.getFrame();
                C101900d dVar3 = this.f264089g;
                if (dVar3 != null) {
                    return (long) dVar3.mo35633d();
                }
                C87412m.m108603p("decoder");
                throw null;
            }
            C87412m.m108603p("decoder");
            throw null;
        }
        C87412m.m108603p("decoder");
        throw null;
    }

    /* renamed from: f */
    public void mo126260f(long j) {
        this.f264075d = j;
        if (mo126261g()) {
            C101900d dVar = this.f264089g;
            if (dVar != null) {
                dVar.seekTo(j);
                C101900d dVar2 = this.f264089g;
                if (dVar2 != null) {
                    this.f264090h = dVar2.getFrame();
                } else {
                    C87412m.m108603p("decoder");
                    throw null;
                }
            } else {
                C87412m.m108603p("decoder");
                throw null;
            }
        }
    }
}
