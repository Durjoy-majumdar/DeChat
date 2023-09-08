package ry1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import com.tencent.p014mm.plugin.game.model.C69019n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import p755xs.C102720b;

/* renamed from: ry1.e0 */
public class C77593e0 extends BitmapDrawable implements C102720b.C78973a {

    /* renamed from: g */
    public static MMHandler f226209g = new MMHandler(Looper.getMainLooper());

    /* renamed from: h */
    public static Bitmap f226210h;

    /* renamed from: d */
    public String f226211d;

    /* renamed from: e */
    public Bitmap f226212e;

    /* renamed from: f */
    public Runnable f226213f;

    /* renamed from: ry1.e0$a */
    public class C77594a implements Runnable {
        public C77594a() {
        }

        public void run() {
            C77593e0.this.invalidateSelf();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C77593e0(java.lang.String r2, ry1.C77593e0.C77594a r3) {
        /*
            r1 = this;
            android.graphics.Bitmap r3 = f226210h
            if (r3 == 0) goto L_0x000d
            boolean r3 = r3.isRecycled()
            if (r3 != 0) goto L_0x000d
            android.graphics.Bitmap r3 = f226210h
            goto L_0x0017
        L_0x000d:
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            r0 = 8
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r0, r0, r3)
            f226210h = r3
        L_0x0017:
            r1.<init>(r3)
            ry1.e0$a r3 = new ry1.e0$a
            r3.<init>()
            r1.f226213f = r3
            android.graphics.Paint r3 = r1.getPaint()
            r0 = 1
            r3.setAntiAlias(r0)
            r3.setFilterBitmap(r0)
            java.lang.Class<xs.b> r3 = p755xs.C102720b.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            xs.b r3 = (p755xs.C102720b) r3
            r3.Lu0(r1)
            r1.mo107778a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ry1.C77593e0.<init>(java.lang.String, ry1.e0$a):void");
    }

    /* renamed from: a */
    public void mo107778a(String str) {
        if (str != null && !str.equals(this.f226211d)) {
            Log.m105925i("MicroMsg.GameDrawable", "set a new url for the drawable,url:[%s]", str);
            this.f226211d = str;
            Bitmap N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C69019n0(this.f226211d));
            if (N6 != null && !N6.isRecycled()) {
                this.f226212e = N6;
            }
            f226209g.post(this.f226213f);
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f226212e;
        if (bitmap == null || bitmap.isRecycled()) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        canvas.drawBitmap(this.f226212e, new Rect(0, 0, this.f226212e.getWidth(), this.f226212e.getHeight()), bounds, getPaint());
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        if (this.f226211d != null) {
            if ((this.f226211d.hashCode() + "").equals(str) && bitmap != null && !bitmap.isRecycled()) {
                Log.m105924i("MicroMsg.GameDrawable", "onGerPictureFinish() function has been invoke.");
                this.f226212e = bitmap;
                f226209g.post(this.f226213f);
            }
        }
    }
}
