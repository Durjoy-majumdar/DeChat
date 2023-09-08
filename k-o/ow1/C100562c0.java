package ow1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.gallery.model.C93951d;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import p851es.C58800a;
import qw1.C101316l;

/* renamed from: ow1.c0 */
public final class C100562c0 extends Drawable {

    /* renamed from: o */
    public static final Paint f294630o;

    /* renamed from: a */
    public ImageView f294631a;

    /* renamed from: b */
    public Bitmap f294632b;

    /* renamed from: c */
    public C58800a f294633c;

    /* renamed from: d */
    public String f294634d;

    /* renamed from: e */
    public String f294635e;

    /* renamed from: f */
    public long f294636f;

    /* renamed from: g */
    public int f294637g;

    /* renamed from: h */
    public int f294638h;

    /* renamed from: i */
    public C93974o.C93980f f294639i;

    /* renamed from: j */
    public long f294640j;

    /* renamed from: k */
    public Rect f294641k = new Rect();

    /* renamed from: l */
    public boolean f294642l = false;

    /* renamed from: m */
    public boolean f294643m = false;

    /* renamed from: n */
    public boolean f294644n = false;

    /* renamed from: ow1.c0$a */
    public static final class C100563a implements Runnable {

        /* renamed from: d */
        public final WeakReference<ImageView> f294645d;

        public C100563a(ImageView imageView) {
            this.f294645d = new WeakReference<>(imageView);
        }

        public void run() {
            ImageView imageView = this.f294645d.get();
            Drawable drawable = imageView == null ? null : imageView.getDrawable();
            if (!(drawable instanceof C100562c0)) {
                Log.m105928w("MicroMsg.ThumbDrawable", "[tomys] ownerView is null or not a ThumbDrawable, ignore this task.");
                return;
            }
            C100562c0 c0Var = (C100562c0) drawable;
            Log.m105919d("MicroMsg.ThumbDrawable", "invalidateSelf, mFilePath: %s.", c0Var.f294634d);
            Bitmap e = C93958f.m118747g().mo128877e(c0Var.f294634d, c0Var.f294635e, c0Var.f294636f, c0Var.f294639i, c0Var.f294640j);
            c0Var.f294632b = e;
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(e == null);
            objArr[1] = c0Var.f294634d;
            Log.m105919d("MicroMsg.ThumbDrawable", "pennqin, set bitmap 3, bitmap is null %s filepath: %s.", objArr);
            Bitmap bitmap = c0Var.f294632b;
            if (bitmap == null || bitmap.isRecycled()) {
                String d = C101316l.m132905d(c0Var.f294634d, c0Var.f294639i, c0Var.f294638h);
                Log.m105919d("MicroMsg.ThumbDrawable", "traceGetLis, create & add listener 2: %s.", d);
                C93958f.m118747g().mo128873a(new C100564b(c0Var.f294631a, d));
                C93958f.m118747g().mo128876d(c0Var.f294634d, c0Var.f294637g, c0Var.f294635e, c0Var.f294636f, c0Var.f294639i, c0Var.f294638h, c0Var.f294640j);
                Log.m105919d("MicroMsg.ThumbDrawable", "invalidateSelf! mBitmap is invalid! path:%s.", c0Var.f294634d);
            }
            c0Var.invalidateSelf();
        }
    }

    /* renamed from: ow1.c0$b */
    public static final class C100564b implements C93951d.C93956e {

        /* renamed from: a */
        public final WeakReference<ImageView> f294646a;

        /* renamed from: b */
        public final String f294647b;

        public C100564b(ImageView imageView, String str) {
            this.f294646a = new WeakReference<>(imageView);
            this.f294647b = str;
        }

        /* renamed from: a */
        public String mo128887a() {
            return this.f294647b;
        }

        /* renamed from: b */
        public void mo128888b(String str) {
            Log.m105919d("MicroMsg.ThumbDrawable", "onImageGet fileKey: %s.", str);
            Drawable c = mo140021c();
            if (c instanceof C100562c0) {
                C100562c0 c0Var = (C100562c0) c;
                if (C101316l.m132905d(c0Var.f294634d, c0Var.f294639i, c0Var.f294638h).equals(str)) {
                    Log.m105919d("MicroMsg.ThumbDrawable", "match!!! start invalidate, fileKey: %s. ", str);
                    ImageView imageView = this.f294646a.get();
                    if (imageView != null) {
                        imageView.post(new C100563a(imageView));
                        return;
                    }
                    return;
                }
                return;
            }
            Log.m105929w("MicroMsg.ThumbDrawable", "drawable [%s] in ownerRef [%s] is not a ThumbDrawable, ignore.", c, this.f294646a);
        }

        /* renamed from: c */
        public final Drawable mo140021c() {
            ImageView imageView = this.f294646a.get();
            if (imageView != null) {
                return imageView.getDrawable();
            }
            return null;
        }

        public boolean equals(Object obj) {
            Drawable drawable;
            if (obj == null) {
                return false;
            }
            Drawable c = mo140021c();
            if (obj instanceof C100564b) {
                drawable = ((C100564b) obj).mo140021c();
            } else {
                if (obj instanceof C100562c0) {
                    drawable = (Drawable) obj;
                }
                return false;
            }
            if (!(c == null || drawable == null)) {
                return c.equals(drawable);
            }
            return false;
        }

        public int hashCode() {
            Drawable c = mo140021c();
            return c != null ? c.hashCode() : super.hashCode();
        }

        public String toString() {
            return "decodeTaskKey:" + this.f294647b + " ownerRef:" + this.f294646a;
        }
    }

    static {
        Paint paint = new Paint();
        f294630o = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
    }

    public C100562c0(ImageView imageView) {
        this.f294631a = imageView;
        this.f294634d = "";
        this.f294635e = "";
    }

    /* renamed from: a */
    public static void m131590a(ImageView imageView, int i, String str, String str2, long j, int i2, long j2) {
        m131592c(imageView, i, str, str2, j, i2, (C58800a) null, (C93974o.C93980f) null, j2);
    }

    /* renamed from: b */
    public static void m131591b(ImageView imageView, int i, String str, String str2, long j, int i2, C58800a aVar, long j2) {
        m131592c(imageView, i, str, str2, j, i2, aVar, (C93974o.C93980f) null, j2);
    }

    /* renamed from: c */
    public static void m131592c(ImageView imageView, int i, String str, String str2, long j, int i2, C58800a aVar, C93974o.C93980f fVar, long j2) {
        Bitmap bitmap;
        ImageView imageView2 = imageView;
        int i3 = i2;
        C93974o.C93980f fVar2 = fVar;
        long j3 = j2;
        Drawable drawable = imageView.getDrawable();
        C100562c0 c0Var = drawable instanceof C100562c0 ? (C100562c0) drawable : new C100562c0(imageView2);
        boolean z = false;
        if (fVar2 == null) {
            c0Var.f294639i = null;
            c0Var.f294642l = false;
        } else if (!fVar2.equals(c0Var.f294639i)) {
            c0Var.f294642l = true;
            c0Var.f294639i = fVar2;
        }
        if (c0Var.f294638h != i3) {
            c0Var.f294643m = true;
            c0Var.f294638h = i3;
        }
        if (c0Var.f294640j != j3) {
            c0Var.f294644n = true;
            c0Var.f294640j = j3;
        }
        c0Var.f294633c = aVar;
        String str3 = Util.isNullOrNil(str) ? str2 : str;
        if (Util.isNullOrNil(str3)) {
            Log.m105920e("MicroMsg.ThumbDrawable", "filepath is null or nil");
        } else if (!c0Var.f294634d.equals(str3) || (bitmap = c0Var.f294632b) == null || bitmap.isRecycled() || c0Var.f294642l || c0Var.f294643m || c0Var.f294644n) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(c0Var.f294642l);
            C93974o.C93980f fVar3 = c0Var.f294639i;
            Object obj = "";
            objArr[1] = fVar3 == null ? obj : fVar3.toString();
            Log.m105919d("MicroMsg.ThumbDrawable", "setMediaFeature, crop area: %s %s.", objArr);
            if (c0Var.f294642l) {
                c0Var.f294642l = false;
            }
            Log.m105919d("MicroMsg.ThumbDrawable", "setMediaFeature, path equal? [%s] isPositionUpdate? [%s] isDateModified? [%s] mModifyDate [%s].", Boolean.valueOf(c0Var.f294634d.equals(str3)), Boolean.valueOf(c0Var.f294643m), Boolean.valueOf(c0Var.f294644n), Long.valueOf(c0Var.f294640j));
            if (c0Var.f294643m) {
                c0Var.f294643m = false;
            }
            if (c0Var.f294644n) {
                c0Var.f294644n = false;
            }
            c0Var.f294634d = str3;
            c0Var.f294635e = str2;
            c0Var.f294636f = j;
            c0Var.f294637g = i;
            String str4 = "MicroMsg.ThumbDrawable";
            Bitmap e = C93958f.m118747g().mo128877e(c0Var.f294634d, c0Var.f294635e, c0Var.f294636f, c0Var.f294639i, c0Var.f294640j);
            c0Var.f294632b = e;
            Object[] objArr2 = new Object[4];
            objArr2[0] = str3;
            objArr2[1] = Boolean.valueOf(e == null);
            Bitmap bitmap2 = c0Var.f294632b;
            objArr2[2] = bitmap2 != null ? Boolean.valueOf(bitmap2.isRecycled()) : obj;
            objArr2[3] = c0Var;
            String str5 = str4;
            Log.m105919d(str5, "pennqin, set bitmap 1, filePath:[%s] mBitmap is null:[%s], mBitmap.isRecycled():[%s], this: %s.", objArr2);
            Bitmap bitmap3 = c0Var.f294632b;
            if (bitmap3 == null || bitmap3.isRecycled()) {
                String d = C101316l.m132905d(c0Var.f294634d, c0Var.f294639i, c0Var.f294638h);
                Log.m105919d(str5, "traceGetLis, create & add listener 1: %s.", d);
                C93958f.m118747g().mo128873a(new C100564b(c0Var.f294631a, d));
                Bitmap d2 = C93958f.m118747g().mo128876d(c0Var.f294634d, i, str2, j, c0Var.f294639i, c0Var.f294638h, c0Var.f294640j);
                c0Var.f294632b = d2;
                Object[] objArr3 = new Object[4];
                objArr3[0] = c0Var.f294634d;
                if (d2 == null) {
                    z = true;
                }
                objArr3[1] = Boolean.valueOf(z);
                Bitmap bitmap4 = c0Var.f294632b;
                if (bitmap4 != null) {
                    obj = Boolean.valueOf(bitmap4.isRecycled());
                }
                objArr3[2] = obj;
                objArr3[3] = c0Var;
                Log.m105919d(str5, "pennqin, set bitmap 2, filePath:[%s] mBitmap is null:[%s], mBitmap.isRecycled():[%s], this: %s.", objArr3);
            } else {
                Object[] objArr4 = new Object[4];
                objArr4[0] = c0Var.f294634d;
                if (c0Var.f294632b == null) {
                    z = true;
                }
                objArr4[1] = Boolean.valueOf(z);
                Bitmap bitmap5 = c0Var.f294632b;
                if (bitmap5 != null) {
                    obj = Boolean.valueOf(bitmap5.isRecycled());
                }
                objArr4[2] = obj;
                objArr4[3] = c0Var;
                Log.m105919d(str5, "pennqin, set bitmap 1 ok!!! filePath:[%s] mBitmap is null:[%s], mBitmap.isRecycled():[%s], this: %s.", objArr4);
            }
            Bitmap bitmap6 = c0Var.f294632b;
            if (bitmap6 != null && !bitmap6.isRecycled()) {
                c0Var.f294631a.invalidate();
            }
        } else {
            Object[] objArr5 = new Object[2];
            objArr5[0] = c0Var.f294634d;
            Bitmap bitmap7 = c0Var.f294632b;
            objArr5[1] = bitmap7 != null ? Boolean.valueOf(bitmap7.isRecycled()) : "bitmap is null.";
            Log.m105919d("MicroMsg.ThumbDrawable", "setMediaFeature filePath:[%s], mBitmap.isRecycled():[%s].", objArr5);
        }
        imageView2.setImageDrawable(c0Var);
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f294632b;
        Object obj = "";
        if (bitmap == null || bitmap.isRecycled()) {
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(this.f294632b == null);
            Log.m105919d("MicroMsg.ThumbDrawable", "[duanyi] get bitmap is null: %s.", objArr);
            String d = C101316l.m132905d(this.f294634d, this.f294639i, this.f294638h);
            Log.m105919d("MicroMsg.ThumbDrawable", "traceGetLis, create & add listener 3: %s.", d);
            C93958f.m118747g().mo128873a(new C100564b(this.f294631a, d));
            Bitmap d2 = C93958f.m118747g().mo128876d(this.f294634d, this.f294637g, this.f294635e, this.f294636f, this.f294639i, this.f294638h, this.f294640j);
            this.f294632b = d2;
            Object[] objArr2 = new Object[4];
            objArr2[0] = this.f294634d;
            objArr2[1] = Boolean.valueOf(d2 == null);
            Bitmap bitmap2 = this.f294632b;
            if (bitmap2 != null) {
                obj = Boolean.valueOf(bitmap2.isRecycled());
            }
            objArr2[2] = obj;
            objArr2[3] = this;
            Log.m105919d("MicroMsg.ThumbDrawable", "pennqin, set bitmap 4, filePath:[%s] mBitmap is null:[%s], mBitmap.isRecycled():[%s], this: %s.", objArr2);
        } else {
            Object[] objArr3 = new Object[2];
            objArr3[0] = this.f294634d;
            C93974o.C93980f fVar = this.f294639i;
            if (fVar != null) {
                obj = fVar.f271229f;
            }
            objArr3[1] = obj;
            Log.m105919d("MicroMsg.ThumbDrawable", "[duanyi test] get bitmap ok: %s crop area id: %s.", objArr3);
        }
        Bitmap bitmap3 = this.f294632b;
        if (bitmap3 == null || bitmap3.isRecycled()) {
            Log.m105919d("MicroMsg.ThumbDrawable", "pennqin, get bitmap 4 fail!!! %s.", this.f294634d);
            return;
        }
        C58800a aVar = this.f294633c;
        if (aVar != null) {
            aVar.mo80484a();
            this.f294633c = null;
        }
        Bitmap bitmap4 = this.f294632b;
        Rect rect = this.f294641k;
        if (bitmap4.getWidth() > bitmap4.getHeight()) {
            rect.top = 0;
            rect.bottom = bitmap4.getHeight();
            int width = (bitmap4.getWidth() - bitmap4.getHeight()) >> 1;
            rect.left = width;
            rect.right = width + bitmap4.getHeight();
        } else {
            rect.left = 0;
            rect.right = bitmap4.getWidth();
            int height = (bitmap4.getHeight() - bitmap4.getWidth()) >> 1;
            rect.top = height;
            rect.bottom = height + bitmap4.getWidth();
        }
        canvas.drawBitmap(this.f294632b, this.f294641k, getBounds(), f294630o);
        Log.m105919d("MicroMsg.ThumbDrawable", "bounds:%s", getBounds().toString());
    }

    public int getIntrinsicHeight() {
        return 400;
    }

    public int getIntrinsicWidth() {
        return 400;
    }

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        Log.m105919d("MicroMsg.ThumbDrawable", "setBoundsLTRB:%d %d - %d %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        super.setBounds(i, i2, i3, i4);
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setBounds(Rect rect) {
        Log.m105919d("MicroMsg.ThumbDrawable", "setBoundsRECT:%s", rect.toString());
        super.setBounds(rect);
    }
}
