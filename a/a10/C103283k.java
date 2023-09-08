package a10;

import a14.C0002w;
import a14.C53873d2;
import a14.C53973z1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import fy3.C32224a;
import gy3.C87412m;
import java.nio.ByteBuffer;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.FlutterEngine;
import rx3.C13598b0;

/* renamed from: a10.k */
public final class C103283k {

    /* renamed from: a */
    public final boolean f304527a;

    /* renamed from: b */
    public final ImageReader f304528b;

    /* renamed from: c */
    public FlutterEngine f304529c;

    /* renamed from: d */
    public final C0002w f304530d = C53873d2.m60389a((C53973z1) null, 1, (Object) null);

    /* renamed from: e */
    public C32224a<C13598b0> f304531e;

    /* renamed from: f */
    public final int f304532f;

    /* renamed from: g */
    public final int f304533g;

    public C103283k(Context context, Point point, boolean z) {
        ImageReader imageReader;
        C87412m.m108594g(context, "context");
        this.f304527a = z;
        point = point == null ? C112717f.f337490a.getDisplayRealSize(context) : point;
        int i = point.x;
        this.f304532f = i;
        int i2 = point.y;
        this.f304533g = i2;
        if (Build.VERSION.SDK_INT >= 29) {
            imageReader = ImageReader.newInstance(i, i2, 1, 1, 768);
            C87412m.m108593f(imageReader, "{\n            ImageReade…T\n            )\n        }");
        } else {
            imageReader = ImageReader.newInstance(i, i2, 1, 1);
            C87412m.m108593f(imageReader, "{\n            ImageReade…88, MAX_IMAGES)\n        }");
        }
        this.f304528b = imageReader;
        imageReader.setOnImageAvailableListener(new k$$a(this), new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public final Bitmap mo143064a() {
        Image acquireLatestImage = this.f304528b.acquireLatestImage();
        if (acquireLatestImage == null) {
            Log.m165292w("MicroMsg.FlutterOffscreenSurface", "no image available");
            return null;
        } else if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = acquireLatestImage.getHardwareBuffer();
            if (hardwareBuffer == null) {
                return null;
            }
            Bitmap wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return wrapHardwareBuffer;
        } else {
            Image.Plane[] planes = acquireLatestImage.getPlanes();
            C87412m.m108593f(planes, "image.planes");
            if (planes.length != 1) {
                Log.m165292w("MicroMsg.FlutterOffscreenSurface", "no image plane");
                return null;
            }
            Image.Plane plane = planes[0];
            Bitmap createBitmap = Bitmap.createBitmap(plane.getRowStride() / plane.getPixelStride(), acquireLatestImage.getHeight(), Bitmap.Config.ARGB_8888);
            ByteBuffer buffer = plane.getBuffer();
            buffer.rewind();
            createBitmap.copyPixelsFromBuffer(buffer);
            return createBitmap;
        }
    }
}
