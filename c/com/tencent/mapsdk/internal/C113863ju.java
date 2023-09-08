package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.mapsdk.internal.C113896kq;
import com.tencent.mapsdk.internal.C113905ky;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.mapsdk.internal.ju */
public class C113863ju extends C113849jm {

    /* renamed from: a */
    public static final int f340641a = 10;

    /* renamed from: g */
    private static final C113905ky.C113910a f340642g;

    /* renamed from: h */
    private static final C113905ky.C113916g<C113905ky.C113918i<Bitmap>> f340643h;

    /* renamed from: b */
    public final AtomicInteger f340644b = new AtomicInteger();

    /* renamed from: c */
    public Bitmap f340645c;

    /* renamed from: d */
    public byte[] f340646d;

    /* renamed from: e */
    public int f340647e;

    /* renamed from: f */
    public String f340648f;

    static {
        C113905ky.C113910a aVar = new C113905ky.C113910a(Bitmap.Config.ARGB_8888);
        f340642g = aVar;
        f340643h = C113905ky.m157773a(aVar);
    }

    public C113863ju() {
    }

    /* renamed from: a */
    public static void m157340a(C113905ky.C113910a aVar) {
        C113905ky.C113910a aVar2 = f340642g;
        if (aVar != null) {
            aVar2.f340753a = aVar.f340753a;
            aVar2.f340754b = aVar.f340754b;
            aVar2.f340755c = aVar.f340755c;
        }
    }

    /* renamed from: h */
    private void m157341h() {
        byte[] bArr;
        Bitmap bitmap = this.f340645c;
        if (bitmap == null && (bArr = this.f340646d) != null) {
            this.f340647e = bArr.length;
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f340647e = this.f340645c.getAllocationByteCount();
        }
    }

    /* renamed from: i */
    private void m157342i() {
        Bitmap bitmap = this.f340645c;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f340648f = C104548ha.m139947a(this.f340645c);
        }
    }

    /* renamed from: j */
    private String m157343j() {
        return this.f340648f;
    }

    /* renamed from: b */
    public final byte[] mo56236b() {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        byte[] bArr = this.f340646d;
        if (bArr != null) {
            return bArr;
        }
        Bitmap bitmap = this.f340645c;
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    if (this.f340645c.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        C113886kg.m157515a((Closeable) byteArrayOutputStream);
                        return byteArray;
                    }
                    C113886kg.m157515a((Closeable) byteArrayOutputStream);
                } catch (Throwable th4) {
                    th = th4;
                    C113886kg.m157515a((Closeable) byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th5) {
                Throwable th6 = th5;
                byteArrayOutputStream = null;
                th = th6;
                C113886kg.m157515a((Closeable) byteArrayOutputStream);
                throw th;
            }
        }
        return new byte[0];
    }

    /* renamed from: c */
    public final synchronized Bitmap mo172245c() {
        if (this.f340645c == null) {
            mo56235a(this.f340646d);
        }
        Bitmap bitmap = this.f340645c;
        if (bitmap != null && bitmap.isRecycled()) {
            return null;
        }
        return this.f340645c;
    }

    /* renamed from: d */
    public final void mo172246d() {
        Bitmap bitmap = this.f340645c;
        if (bitmap != null && !bitmap.isRecycled()) {
            int decrementAndGet = this.f340644b.decrementAndGet();
            C113896kq.C113898a f = C113896kq.m157677f(C0949kl.f2248r);
            f.mo172332a("decrement refCount:" + decrementAndGet + " id = " + this.f340648f);
        }
    }

    /* renamed from: e */
    public final void mo172247e() {
        Bitmap bitmap = this.f340645c;
        if (bitmap != null && !bitmap.isRecycled()) {
            int incrementAndGet = this.f340644b.incrementAndGet();
            C113896kq.C113898a f = C113896kq.m157677f(C0949kl.f2248r);
            f.mo172332a("increment refCount:" + incrementAndGet + " id = " + this.f340648f);
        }
    }

    /* renamed from: f */
    public boolean mo172248f() {
        Bitmap bitmap = this.f340645c;
        if (bitmap != null && !bitmap.isRecycled() && this.f340644b.decrementAndGet() <= 0) {
            this.f340645c.recycle();
            C113896kq.m157677f(C0949kl.f2248r).mo172332a("recycle out");
        }
        this.f340646d = null;
        Bitmap bitmap2 = this.f340645c;
        return bitmap2 == null || bitmap2.isRecycled();
    }

    /* renamed from: g */
    public final boolean mo172249g() {
        Bitmap bitmap = this.f340645c;
        if (bitmap != null) {
            return bitmap.isRecycled();
        }
        byte[] bArr = this.f340646d;
        return bArr == null || bArr.length == 0;
    }

    public String toString() {
        return "BitmapData{id='" + this.f340648f + '\'' + '}';
    }

    public C113863ju(Bitmap bitmap) {
        this.f340645c = bitmap;
        m157342i();
        m157341h();
    }

    /* renamed from: a */
    public final int mo56234a() {
        return this.f340647e;
    }

    /* renamed from: a */
    public final void mo56235a(byte[] bArr) {
        int i;
        mo172248f();
        if (bArr != null && bArr.length > 0) {
            this.f340646d = bArr;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            } catch (Exception e) {
                C113889km.m157539a(C0949kl.f2248r, "BitmapData testOpts decodingByteArray exception: ", e.fillInStackTrace());
            }
            int i2 = options.outWidth;
            if (i2 > 0 && (i = options.outHeight) > 0) {
                C113905ky.C113910a aVar = f340642g;
                aVar.f340753a = i2;
                aVar.f340754b = i;
                Bitmap bitmap = null;
                boolean z = false;
                int i3 = 0;
                while (!z && i3 < 20) {
                    C113905ky.C113918i a = f340643h.mo172343a();
                    if (a != null) {
                        bitmap = (Bitmap) a.f340762a;
                        if (!bitmap.isRecycled() && bitmap.getWidth() == options.outWidth && bitmap.getHeight() == options.outHeight) {
                            z = true;
                        }
                    }
                    i3++;
                }
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                if (z) {
                    options2.inBitmap = bitmap;
                }
                options2.inSampleSize = 1;
                options2.inMutable = true;
                try {
                    this.f340645c = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
                } catch (Exception e2) {
                    C113889km.m157539a(C0949kl.f2248r, "BitmapData opts decodingByteArray exception: ", e2.fillInStackTrace());
                }
                this.f340646d = null;
                m157342i();
                m157341h();
            }
        }
    }

    public C113863ju(byte[] bArr) {
        this.f340646d = bArr;
        if (bArr != null) {
            mo56235a(bArr);
        }
    }
}
