package a90;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.RenderScript;
import android.renderscript.Type;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f72.C97842b;
import fy3.C32226l;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import n90.C109726b;
import p277yf.C112440j;
import rx3.C13598b0;

/* renamed from: a90.a */
public final class C103329a implements Runnable {

    /* renamed from: d */
    public final C103340f f304665d;

    /* renamed from: e */
    public final Point f304666e;

    /* renamed from: f */
    public final boolean f304667f;

    /* renamed from: g */
    public final Image f304668g;

    /* renamed from: h */
    public final C32226l<Bitmap, C13598b0> f304669h;

    public C103329a(C103340f fVar, Point point, boolean z, Image image, C32226l<? super Bitmap, C13598b0> lVar) {
        C87412m.m108594g(point, "screenSize");
        C87412m.m108594g(image, "image");
        C87412m.m108594g(lVar, "imageReadyCallback");
        this.f304665d = fVar;
        this.f304666e = point;
        this.f304667f = z;
        this.f304668g = image;
        this.f304669h = lVar;
    }

    /* renamed from: a */
    public final Bitmap mo143131a(Image image, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (this.f304665d == null) {
            Log.m105920e("MicroMsg.Camera2ImageSaver", "a error happened when use rs and does not init rs helper");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap b = mo143132b(image, i3, i4, byteArrayOutputStream);
            byteArrayOutputStream.close();
            return b;
        }
        Image image2 = image;
        long currentTicks = Util.currentTicks();
        int width = image.getWidth();
        int height = image.getHeight();
        Point point = this.f304666e;
        float ceil = (float) Math.ceil((double) ((((float) height) - (((float) width) * (((float) point.x) / ((float) point.y)))) / ((float) 2)));
        Image.Plane[] planes = image.getPlanes();
        byte[][] bArr = new byte[3][];
        for (int i5 = 0; i5 < 3; i5++) {
            ByteBuffer buffer = planes[i5].getBuffer();
            byte[] bArr2 = new byte[buffer.capacity()];
            buffer.get(bArr2);
            bArr[i5] = bArr2;
        }
        long currentTicks2 = Util.currentTicks();
        C103340f fVar = this.f304665d;
        Image.Plane[] planes2 = image.getPlanes();
        C87412m.m108593f(planes2, "image.planes");
        int i6 = (int) ceil;
        fVar.getClass();
        fVar.mo143200a();
        int rowStride = planes2[0].getRowStride();
        int rowStride2 = planes2[1].getRowStride();
        int pixelStride = planes2[1].getPixelStride();
        RenderScript renderScript = fVar.f304722c;
        Type.Builder builder = new Type.Builder(renderScript, Element.U8(renderScript));
        long j = currentTicks;
        builder.setX(rowStride).setY(bArr[0].length / rowStride);
        Allocation createTyped = Allocation.createTyped(fVar.f304722c, builder.create());
        createTyped.copyFrom(bArr[0]);
        C112440j jVar = fVar.f304721b;
        if (jVar != null) {
            synchronized (jVar) {
                try {
                    jVar.setVar(8, createTyped);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        RenderScript renderScript2 = fVar.f304722c;
        Type.Builder builder2 = new Type.Builder(renderScript2, Element.U8(renderScript2));
        builder2.setX(bArr[1].length);
        Allocation createTyped2 = Allocation.createTyped(fVar.f304722c, builder2.create());
        createTyped2.copyFrom(bArr[1]);
        C112440j jVar2 = fVar.f304721b;
        if (jVar2 != null) {
            synchronized (jVar2) {
                try {
                    jVar2.setVar(9, createTyped2);
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        Allocation createTyped3 = Allocation.createTyped(fVar.f304722c, builder2.create());
        createTyped3.copyFrom(bArr[2]);
        C112440j jVar3 = fVar.f304721b;
        if (jVar3 != null) {
            synchronized (jVar3) {
                try {
                    jVar3.setVar(10, createTyped3);
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }
        C112440j jVar4 = fVar.f304721b;
        if (jVar4 != null) {
            long j2 = (long) 0;
            synchronized (jVar4) {
                try {
                    FieldPacker fieldPacker = jVar4.f336677b;
                    if (fieldPacker != null) {
                        fieldPacker.reset();
                    } else {
                        try {
                            jVar4.f336677b = new FieldPacker(4);
                        } catch (Throwable th6) {
                            th = th6;
                            throw th;
                        }
                    }
                    jVar4.f336677b.addU32(j2);
                    jVar4.setVar(3, jVar4.f336677b);
                } catch (Throwable th7) {
                    th = th7;
                    throw th;
                }
            }
        }
        C112440j jVar5 = fVar.f304721b;
        if (jVar5 != null) {
            jVar5.mo164152h((long) i6);
        }
        C112440j jVar6 = fVar.f304721b;
        if (jVar6 != null) {
            jVar6.mo164151g((long) rowStride2);
        }
        C112440j jVar7 = fVar.f304721b;
        if (jVar7 != null) {
            jVar7.mo164150f((long) pixelStride);
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3 - 0, i4 - (i6 * 2), Bitmap.Config.ARGB_8888);
        Allocation createFromBitmap = Allocation.createFromBitmap(fVar.f304722c, createBitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        C112440j jVar8 = fVar.f304721b;
        if (jVar8 != null) {
            jVar8.mo164145a(createFromBitmap);
        }
        createFromBitmap.copyTo(createBitmap);
        createTyped.destroy();
        createTyped2.destroy();
        createTyped3.destroy();
        createFromBitmap.destroy();
        C87412m.m108593f(createBitmap, "bmp");
        Log.m105924i("MicroMsg.Camera2ImageSaver", "op1 cost " + Util.ticksToNow(currentTicks2));
        if (this.f304667f) {
            long currentTicks3 = Util.currentTicks();
            Bitmap c = this.f304665d.mo143202c(createBitmap, 90);
            Log.m105924i("MicroMsg.Camera2ImageSaver", "op2 cost " + Util.ticksToNow(currentTicks3));
            long currentTicks4 = Util.currentTicks();
            C103340f fVar2 = this.f304665d;
            fVar2.getClass();
            fVar2.mo143200a();
            C112440j jVar9 = fVar2.f304721b;
            if (jVar9 != null) {
                int width2 = c.getWidth();
                synchronized (jVar9) {
                    try {
                        jVar9.setVar(1, width2);
                    } catch (Throwable th8) {
                        throw th8;
                    }
                }
            }
            C112440j jVar10 = fVar2.f304721b;
            if (jVar10 != null) {
                int height2 = c.getHeight();
                synchronized (jVar10) {
                    try {
                        jVar10.setVar(2, height2);
                    } catch (Throwable th9) {
                        throw th9;
                    }
                }
            }
            Allocation createFromBitmap2 = Allocation.createFromBitmap(fVar2.f304722c, c, Allocation.MipmapControl.MIPMAP_NONE, 1);
            c.recycle();
            C112440j jVar11 = fVar2.f304721b;
            if (jVar11 != null) {
                synchronized (jVar11) {
                    try {
                        jVar11.setVar(0, createFromBitmap2);
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(c.getWidth(), c.getHeight(), c.getConfig());
            Allocation createFromBitmap3 = Allocation.createFromBitmap(fVar2.f304722c, createBitmap2, Allocation.MipmapControl.MIPMAP_NONE, 1);
            C112440j jVar12 = fVar2.f304721b;
            if (jVar12 != null) {
                jVar12.mo164146b(createFromBitmap3, createFromBitmap3);
            }
            createFromBitmap3.copyTo(createBitmap2);
            createFromBitmap3.destroy();
            createFromBitmap2.destroy();
            C87412m.m108593f(createBitmap2, "target");
            Log.m105924i("MicroMsg.Camera2ImageSaver", "op3 cost " + Util.ticksToNow(currentTicks4));
            long ticksToNow = Util.ticksToNow(j);
            Log.m105924i("MicroMsg.Camera2ImageSaver", "newFunc cost " + ticksToNow);
            return createBitmap2;
        }
        long currentTicks5 = Util.currentTicks();
        Bitmap c2 = this.f304665d.mo143202c(createBitmap, 270);
        Log.m105924i("MicroMsg.Camera2ImageSaver", "op4 cost " + Util.ticksToNow(currentTicks5));
        long ticksToNow2 = Util.ticksToNow(j);
        Log.m105924i("MicroMsg.Camera2ImageSaver", "newFunc cost " + ticksToNow2);
        return c2;
    }

    /* renamed from: b */
    public final Bitmap mo143132b(Image image, int i, int i2, ByteArrayOutputStream byteArrayOutputStream) {
        Rect rect;
        int i3;
        int i4 = i;
        int i5 = i2;
        Rect cropRect = image.getCropRect();
        int format = image.getFormat();
        int width = cropRect.width();
        int height = cropRect.height();
        Image.Plane[] planes = image.getPlanes();
        int i6 = width * height;
        byte[] bArr = new byte[((ImageFormat.getBitsPerPixel(format) * i6) / 8)];
        byte[] bArr2 = new byte[planes[0].getRowStride()];
        int length = planes.length;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        int i15 = 1;
        while (i8 < length) {
            if (i8 != 0) {
                if (i8 == i7) {
                    i9 = i6 + 1;
                } else if (i8 == 2) {
                    i9 = i6;
                }
                i15 = 2;
            } else {
                i9 = 0;
                i15 = 1;
            }
            ByteBuffer buffer = planes[i8].getBuffer();
            int rowStride = planes[i8].getRowStride();
            int pixelStride = planes[i8].getPixelStride();
            Image.Plane[] planeArr = planes;
            int i16 = i8 == 0 ? 0 : 1;
            int i17 = width >> i16;
            int i18 = width;
            int i19 = height >> i16;
            int i25 = height;
            int i26 = i6;
            buffer.position(((cropRect.top >> i16) * rowStride) + ((cropRect.left >> i16) * pixelStride));
            int i27 = 0;
            while (i27 < i19) {
                if (pixelStride == 1 && i15 == 1) {
                    buffer.get(bArr, i9, i17);
                    i9 += i17;
                    rect = cropRect;
                    i3 = i17;
                } else {
                    rect = cropRect;
                    i3 = ((i17 - 1) * pixelStride) + 1;
                    buffer.get(bArr2, 0, i3);
                    for (int i28 = 0; i28 < i17; i28++) {
                        bArr[i9] = bArr2[i28 * pixelStride];
                        i9 += i15;
                    }
                }
                if (i27 < i19 - 1) {
                    buffer.position((buffer.position() + rowStride) - i3);
                }
                i27++;
                cropRect = rect;
            }
            Rect rect2 = cropRect;
            i8++;
            planes = planeArr;
            width = i18;
            height = i25;
            i6 = i26;
            i7 = 1;
        }
        byte[] x = C97842b.m126307x(bArr, i4, i5, 90);
        C87412m.m108593f(x, "rotateNv21(yuvData, srcHeight, srcWidth, 90)");
        if (this.f304667f) {
            SightVideoJNI.mirrorCameraData(x, i5, i4, true);
        }
        Point point = this.f304666e;
        float f = ((float) i4) * (((float) point.x) / ((float) point.y));
        float f2 = (((float) i5) - f) / ((float) 2);
        new YuvImage(x, 17, i2, i, (int[]) null).compressToJpeg(new Rect((int) f2, 0, (int) (f + f2), i4), 100, byteArrayOutputStream);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
        C87412m.m108593f(decodeByteArray, "decodeByteArray(stream.t…rray(), 0, stream.size())");
        return decodeByteArray;
    }

    public void run() {
        Bitmap bitmap;
        boolean f = C109726b.m149051f();
        try {
            int width = this.f304668g.getWidth();
            int height = this.f304668g.getHeight();
            if (f) {
                bitmap = mo143131a(this.f304668g, width, height);
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Bitmap b = mo143132b(this.f304668g, width, height, byteArrayOutputStream);
                byteArrayOutputStream.close();
                bitmap = b;
            }
            this.f304669h.invoke(bitmap);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Camera2ImageSaver", "take photo use image stream error", e.getLocalizedMessage());
        } catch (Throwable th) {
            this.f304668g.close();
            throw th;
        }
        this.f304668g.close();
    }
}
