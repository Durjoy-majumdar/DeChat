package qw1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: qw1.h */
public class C101315h {
    /* renamed from: a */
    public static Bitmap m132899a(String str, int i) {
        Bitmap b;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.GalleryBitmapUtil", "imgPath is invalid.");
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            byte[] thumbnail = new ExifInterface(str).getThumbnail();
            if (!(thumbnail == null || (b = m132900b(thumbnail, options, i)) == null)) {
                Log.m105924i("MicroMsg.GalleryBitmapUtil", "decode thumb success from exif.");
                return b;
            }
        } catch (FileNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.GalleryBitmapUtil", e, "failed to find file to read thumbnail: %s.", str);
        } catch (IOException | IndexOutOfBoundsException | OutOfMemoryError e2) {
            Log.printErrStackTrace("MicroMsg.GalleryBitmapUtil", e2, "failed to get thumbnail from: %s.", str);
        } catch (Exception e3) {
            Log.printErrStackTrace("MicroMsg.GalleryBitmapUtil", e3, "failed to get thumbnail from: %s.", str);
        }
        try {
            return m132901c(C86013q1.m106465z(str, "r").getFileDescriptor(), options, i);
        } catch (Exception | OutOfMemoryError e4) {
            Log.printErrStackTrace("MicroMsg.GalleryBitmapUtil", e4, "decodeThumbnail fail!!!", new Object[0]);
            return null;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.GalleryBitmapUtil", th, "err!!", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static Bitmap m132900b(byte[] bArr, BitmapFactory.Options options, int i) {
        int i2;
        int i3;
        if (bArr == null) {
            return null;
        }
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i4 = options.outWidth;
        if (i4 < i || (i2 = options.outHeight) < i) {
            return null;
        }
        int max = Math.max(i4 / i, i2 / i);
        if (max <= 1) {
            i3 = 1;
        } else if (max > 8) {
            i3 = (max / 8) * 8;
        } else if (max > 0) {
            i3 = Integer.highestOneBit(max);
        } else {
            throw new IllegalArgumentException();
        }
        options.inSampleSize = i3;
        options.inJustDecodeBounds = false;
        options.inMutable = true;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    /* renamed from: c */
    public static Bitmap m132901c(FileDescriptor fileDescriptor, BitmapFactory.Options options, int i) {
        int i2;
        int i3;
        int i4;
        if (fileDescriptor == null) {
            return null;
        }
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect) null, options);
        int i5 = options.outWidth;
        int i6 = options.outHeight;
        if (i5 == -1 || i6 == -1) {
            Log.m105924i("MicroMsg.GalleryBitmapUtil", "decode error, get invalid picture size");
            return null;
        }
        int min = Math.min(i5, i6) / i;
        if (min < 1) {
            i2 = 1;
        } else if (min <= 0 || min > 1073741824) {
            throw new IllegalArgumentException("n is invalid: " + min);
        } else {
            int i7 = min - 1;
            int i8 = (i7 >> 16) | i7;
            int i9 = i8 | (i8 >> 8);
            int i15 = i9 | (i9 >> 4);
            int i16 = i15 | (i15 >> 2);
            i2 = (i16 | (i16 >> 1)) + 1;
        }
        while (true) {
            i3 = i5 / i2;
            i4 = i6 / i2;
            if (i3 * i4 < 640000) {
                break;
            }
            i2 *= 2;
        }
        options.inSampleSize = i2;
        options.inJustDecodeBounds = false;
        options.inMutable = true;
        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect) null, options);
        return decodeFileDescriptor.getWidth() * decodeFileDescriptor.getHeight() >= 640000 ? Bitmap.createScaledBitmap(decodeFileDescriptor, i3, i4, false) : decodeFileDescriptor;
    }
}
