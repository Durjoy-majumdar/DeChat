package vd3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.io.IOException;
import java.io.InputStream;
import kg3.C76577a;
import vd3.C78391d;
import vd3.C78407r;
import we3.C78592b;

/* renamed from: vd3.g */
public class C78395g extends C78391d {

    /* renamed from: w */
    public static C78592b f229714w;

    /* renamed from: t */
    public float f229715t = 0.5f;

    /* renamed from: u */
    public Bitmap f229716u = null;

    /* renamed from: v */
    public final Paint f229717v = new Paint();

    public C78395g(String str, float f) {
        super(C78391d.C78393b.m94671c(), str);
        this.f229715t = f;
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        super.mo1428X(str);
    }

    /* renamed from: b */
    public final void mo108341b(Canvas canvas, Bitmap bitmap) {
        Rect rect;
        Rect bounds = getBounds();
        if (this.f229750n > 1.0f || this.f229744e) {
            int height = (bitmap.getHeight() / 15) / 2;
            int width = (bitmap.getWidth() / 15) / 2;
            rect = new Rect(width, height, bitmap.getWidth() - width, bitmap.getHeight() - height);
        } else {
            rect = null;
        }
        canvas.drawBitmap(bitmap, rect, bounds, this.f229743d);
    }

    public void draw(Canvas canvas) {
        InputStream open;
        if (f229714w == null) {
            f229714w = C78592b.C53158a.m59566a();
        }
        String str = this.f229749j + "-" + this.f229715t;
        Bitmap uf02 = f229714w.uf0(str);
        if (uf02 == null || uf02.isRecycled()) {
            Bitmap ov02 = this.f229745f ? this.f229748i.ov0(this.f229749j, canvas.getWidth(), canvas.getHeight(), 1) : this.f229748i.loadBitmap(this.f229749j);
            C78407r.C78409b bVar = this.f229748i;
            boolean a = bVar instanceof C78407r.C78410c ? ((C78407r.C78410c) bVar).mo108339a(this.f229749j) : true;
            if (ov02 == null || ov02.isRecycled()) {
                if (this.f229716u == null) {
                    try {
                        open = MMApplicationContext.getContext().getAssets().open("avatar/default_nor_avatar.png", 3);
                        Bitmap decodeStream = BackwardSupportUtil.BitmapFactory.decodeStream(open, C76577a.m92156g((Context) null));
                        this.f229716u = BitmapUtil.getRoundedCornerBitmap(decodeStream, true, this.f229715t * ((float) decodeStream.getWidth()));
                        if (open != null) {
                            open.close();
                        }
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.AvatarRoundDrawable", e, "", new Object[0]);
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
                Bitmap bitmap = this.f229716u;
                if (bitmap != null && !bitmap.isRecycled()) {
                    mo108341b(canvas, bitmap);
                }
            } else {
                if (a) {
                    ov02 = BitmapUtil.getRoundedCornerBitmap(ov02, false, this.f229715t * ((float) ov02.getWidth()));
                }
                f229714w.om0(str, ov02);
                mo108341b(canvas, ov02);
            }
        } else {
            mo108341b(canvas, uf02);
        }
        if (this.f229710s) {
            this.f229717v.setColor(-16777216);
            this.f229717v.setAlpha(76);
            this.f229717v.setAntiAlias(true);
            RectF rectF = new RectF(getBounds());
            canvas.drawRoundRect(rectF, this.f229715t * rectF.width(), this.f229715t * rectF.height(), this.f229717v);
            return;
        }
        return;
        throw th;
    }
}
