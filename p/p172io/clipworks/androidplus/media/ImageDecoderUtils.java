package p172io.clipworks.androidplus.media;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Size;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: io.clipworks.androidplus.media.ImageDecoderUtils */
public class ImageDecoderUtils {
    private static final String TAG = "ImageDecoderUtils";

    /* renamed from: io.clipworks.androidplus.media.ImageDecoderUtils$ImageInfo */
    public static final class ImageInfo {
        private int height;
        private String mimeType;
        private int rotation;
        private int width;

        public ImageInfo(String str, int i, int i2, int i3) {
            this.mimeType = str;
            this.width = i;
            this.height = i2;
            this.rotation = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageInfo)) {
                return false;
            }
            ImageInfo imageInfo = (ImageInfo) obj;
            return imageInfo.width == this.width && imageInfo.height == this.height && imageInfo.rotation == this.rotation && imageInfo.mimeType.equals(this.mimeType);
        }

        public int getHeight() {
            return this.height;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public int getRotation() {
            return this.rotation;
        }

        public int getWidth() {
            return this.width;
        }

        public String toString() {
            return "ImageInfo{width=" + this.width + ", height=" + this.height + ", rotation=" + this.rotation + ", mimeType='" + this.mimeType + '\'' + '}';
        }
    }

    private ImageDecoderUtils() {
    }

    public static Bitmap decodeImageBuffer(ByteBuffer byteBuffer) {
        return decodeImageBuffer(byteBuffer, -1);
    }

    public static Bitmap decodeImageFile(File file) {
        return decodeImageFile(file, -1);
    }

    private static Bitmap decodeImageFileP(File file, int i) {
        return decodeImageSource(ImageDecoder.createSource(file), i);
    }

    private static Bitmap decodeImageFilePreP(File file, int i) {
        return null;
    }

    private static Bitmap decodeImageSource(ImageDecoder.Source source, final int i) {
        return ImageDecoder.decodeBitmap(source, new ImageDecoder.OnHeaderDecodedListener() {
            public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                int i;
                int i2;
                if (i > 0) {
                    Size size = imageInfo.getSize();
                    if (size.getWidth() > i || size.getWidth() > i) {
                        float max = ((float) i) / ((float) Math.max(size.getWidth(), size.getHeight()));
                        int max2 = Math.max(Math.round(((float) size.getWidth()) * max), 1);
                        i2 = Math.max(Math.round(((float) size.getHeight()) * max), 1);
                        i = max2;
                    } else {
                        i = size.getWidth();
                        i2 = size.getHeight();
                    }
                    imageDecoder.setTargetSize(i, i2);
                    imageDecoder.setAllocator(1);
                }
            }
        });
    }

    private static Bitmap decodeStreamP(ByteBuffer byteBuffer, int i) {
        return decodeImageSource(ImageDecoder.createSource(byteBuffer), i);
    }

    private static Bitmap decodeStreamPreP(ByteBuffer byteBuffer, int i) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3 = new android.graphics.BitmapFactory.Options();
        r3.inJustDecodeBounds = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        android.graphics.BitmapFactory.decodeFile(r8, r3);
        r8 = r3.outMimeType;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r2 = new p172io.clipworks.androidplus.media.ImageDecoderUtils.ImageInfo(r3.outMimeType, r8, r4, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003f, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p172io.clipworks.androidplus.media.ImageDecoderUtils.ImageInfo getImageInfoFromFile(java.lang.String r8) {
        /*
            java.lang.String r0 = "image/"
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            r2 = 0
            r1.setDataSource(r8)     // Catch:{ Exception -> 0x0041 }
            r3 = 12
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ Exception -> 0x0041 }
            boolean r4 = r3.startsWith(r0)     // Catch:{ Exception -> 0x0041 }
            if (r4 == 0) goto L_0x003b
            r4 = 29
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ Exception -> 0x0041 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x0041 }
            r5 = 30
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ Exception -> 0x0041 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0041 }
            r6 = 31
            java.lang.String r6 = r1.extractMetadata(r6)     // Catch:{ Exception -> 0x0041 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x0041 }
            io.clipworks.androidplus.media.ImageDecoderUtils$ImageInfo r7 = new io.clipworks.androidplus.media.ImageDecoderUtils$ImageInfo     // Catch:{ Exception -> 0x0041 }
            r7.<init>(r3, r4, r5, r6)     // Catch:{ Exception -> 0x0041 }
            r2 = r7
        L_0x003b:
            r1.release()
            goto L_0x0069
        L_0x003f:
            r8 = move-exception
            goto L_0x006a
        L_0x0041:
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x003f }
            r3.<init>()     // Catch:{ all -> 0x003f }
            r4 = 1
            r3.inJustDecodeBounds = r4     // Catch:{ all -> 0x003f }
            android.graphics.BitmapFactory.decodeFile(r8, r3)     // Catch:{ Exception -> 0x003b }
            java.lang.String r8 = r3.outMimeType     // Catch:{ Exception -> 0x003b }
            if (r8 == 0) goto L_0x003b
            boolean r8 = r8.startsWith(r0)     // Catch:{ Exception -> 0x003b }
            if (r8 == 0) goto L_0x003b
            int r8 = r3.outWidth     // Catch:{ Exception -> 0x003b }
            r0 = -1
            if (r8 == r0) goto L_0x003b
            int r4 = r3.outHeight     // Catch:{ Exception -> 0x003b }
            if (r4 == r0) goto L_0x003b
            io.clipworks.androidplus.media.ImageDecoderUtils$ImageInfo r0 = new io.clipworks.androidplus.media.ImageDecoderUtils$ImageInfo     // Catch:{ Exception -> 0x003b }
            java.lang.String r3 = r3.outMimeType     // Catch:{ Exception -> 0x003b }
            r5 = 0
            r0.<init>(r3, r8, r4, r5)     // Catch:{ Exception -> 0x003b }
            r2 = r0
            goto L_0x003b
        L_0x0069:
            return r2
        L_0x006a:
            r1.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p172io.clipworks.androidplus.media.ImageDecoderUtils.getImageInfoFromFile(java.lang.String):io.clipworks.androidplus.media.ImageDecoderUtils$ImageInfo");
    }

    public static Bitmap decodeImageBuffer(ByteBuffer byteBuffer, int i) {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                return decodeStreamP(byteBuffer, i);
            }
            return decodeStreamPreP(byteBuffer, i);
        } catch (IOException unused) {
            return null;
        }
    }

    public static Bitmap decodeImageFile(File file, int i) {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                return decodeImageFileP(file, i);
            }
            return decodeImageFilePreP(file, i);
        } catch (IOException unused) {
            return null;
        }
    }
}
