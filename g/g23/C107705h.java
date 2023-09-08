package g23;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.plugin.vlog.model.C96530a0;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import cy3.C58003b;
import gy3.C8480h;
import gy3.C87412m;
import java.io.InputStream;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: g23.h */
public final class C107705h extends C107697b {

    /* renamed from: p */
    public Bitmap f322257p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107705h(int i, int i2, int i3, C96530a0 a0Var) {
        super(i, i2, i3, a0Var, false, 16, (C8480h) null);
        C87412m.m108594g(a0Var, "material");
    }

    /* renamed from: a */
    public void mo158103a(boolean z) {
    }

    /* renamed from: b */
    public void mo158104b(long j, boolean z) {
        Bitmap bitmap;
        if (z && (bitmap = this.f322257p) != null) {
            Log.m105924i("MicroMsg.VLogImagePlayer", "VLogImagePlayer playing, uploadBitmapTexture, bitmap:" + bitmap + ", width:" + bitmap.getWidth() + ", height:" + bitmap.getHeight());
            C111742d.C111743a aVar = C111742d.f334647a;
            GLES20.glBindTexture(3553, this.f322211a);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            GLES20.glBindTexture(3553, 0);
            bitmap.recycle();
            this.f322257p = null;
        }
    }

    /* renamed from: c */
    public void mo158105c() {
        this.f322225o = true;
    }

    /* renamed from: d */
    public void mo158106d(long j) {
        boolean z;
        ExifInterface exifInterface;
        int i;
        Throwable th;
        if (!this.f322224n) {
            this.f322224n = true;
            C107706i iVar = C107706i.f322258a;
            C107696a a = iVar.mo158113a(this.f322214d.f282491c);
            if (a != null) {
                Log.m105924i("MicroMsg.VLogImagePlayer", "prepare get info from cache");
                this.f322216f = a.f322204a;
                this.f322217g = a.f322205b;
                this.f322222l = a.f322206c;
                z = true;
            } else {
                z = false;
            }
            if (!z || this.f322257p == null) {
                long currentTimeMillis = System.currentTimeMillis();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(this.f322214d.f282491c, options);
                int i2 = options.outWidth;
                int i3 = options.outHeight;
                options.inSampleSize = BitmapUtil.calculateInSampleSize(i2, i3, this.f322212b, this.f322213c);
                options.inJustDecodeBounds = false;
                Bitmap d = MMBitmapFactory.m98735d(this.f322214d.f282491c, options);
                Integer num = null;
                if (d == null || d.isRecycled()) {
                    d = null;
                } else if (d.getWidth() % 2 == 1) {
                    Bitmap createBitmap = Bitmap.createBitmap(d.getWidth() + 1, d.getHeight(), Bitmap.Config.ARGB_8888);
                    C87412m.m108591d(createBitmap);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawARGB(0, 0, 0, 0);
                    canvas.drawBitmap(d, 0.0f, 0.0f, (Paint) null);
                    d = createBitmap;
                }
                C87412m.m108591d(d);
                this.f322216f = d.getWidth();
                this.f322217g = d.getHeight();
                Log.m105924i("MicroMsg.VLogImagePlayer", "prepare,oriWidth:" + i2 + "  oriHeight:" + i3 + " drawWidth:" + this.f322212b + ", drawHeight:" + this.f322213c + ", width:" + this.f322216f + ", height:" + this.f322217g);
                InputStream E = C86013q1.m106423E(this.f322214d.f282491c);
                if (E != null) {
                    try {
                        exifInterface = new ExifInterface(E);
                        C13598b0 b0Var = C13598b0.f38549a;
                        C58003b.m67160a(E, (Throwable) null);
                    } catch (Throwable th4) {
                        Throwable th5 = th4;
                        C58003b.m67160a(E, th);
                        throw th5;
                    }
                } else {
                    exifInterface = null;
                }
                if (exifInterface != null) {
                    i = 1;
                    num = Integer.valueOf(exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1));
                } else {
                    i = 1;
                }
                if (num != null && num.intValue() == 6) {
                    this.f322222l = i;
                    Log.m105924i("MicroMsg.VLogImagePlayer", "image rotate 90");
                } else if (num != null && num.intValue() == 3) {
                    this.f322222l = 2;
                    Log.m105924i("MicroMsg.VLogImagePlayer", "image rotate 180");
                } else if (num != null && num.intValue() == 8) {
                    this.f322222l = 3;
                    Log.m105924i("MicroMsg.VLogImagePlayer", "image rotate 270");
                }
                this.f322257p = d;
                C107706i.m145888b(iVar, this.f322214d.f282491c, this.f322216f, this.f322217g, this.f322222l, 0, 0, 0, 0, 240, (Object) null);
                Log.m105924i("MicroMsg.VLogImagePlayer", "[prepare] image play time = " + (System.currentTimeMillis() - currentTimeMillis));
                return;
            }
            Log.m105924i("MicroMsg.VLogImagePlayer", "prepare finish get from cache");
            Log.m105924i("MicroMsg.VLogImagePlayer", "prepare drawWidth:" + this.f322212b + ", drawHeight:" + this.f322213c + ", width:" + this.f322216f + ", height:" + this.f322217g);
        }
    }

    /* renamed from: e */
    public void mo158107e() {
        this.f322224n = false;
        Bitmap bitmap = this.f322257p;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f322257p = null;
        this.f322225o = false;
    }

    /* renamed from: f */
    public void mo158108f() {
        this.f322224n = false;
    }
}
