package mr0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import com.tencent.p014mm.sdk.platformtools.FileSeekingInputStream;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import kb0.C76529i;
import lb0.C88394b;

/* renamed from: mr0.a */
public class C88831a implements C88394b.C88405h {

    /* renamed from: d */
    public int f256244d;

    /* renamed from: e */
    public int f256245e;

    /* renamed from: f */
    public C76529i.C76530a f256246f = C76529i.C76530a.DECODE_TYPE_DEFAULT;

    public C88831a(int i, int i2) {
        this.f256244d = i;
        this.f256245e = i2;
    }

    /* renamed from: a */
    public Bitmap mo94301a(InputStream inputStream) {
        int i;
        int i2;
        int i3;
        int i4;
        InputStream bufferedInputStream;
        Log.m105919d("MicroMsg.AppBrand.BitmapDecoderImpl", "decode type: %d.", Integer.valueOf(this.f256246f.ordinal()));
        Bitmap bitmap = null;
        try {
            if (!inputStream.markSupported()) {
                if (inputStream instanceof FileInputStream) {
                    bufferedInputStream = new FileSeekingInputStream((FileInputStream) inputStream);
                } else if (!inputStream.markSupported()) {
                    bufferedInputStream = new BufferedInputStream(inputStream);
                }
                inputStream = bufferedInputStream;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            inputStream.mark(8388608);
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, (Rect) null, options);
            inputStream.reset();
            if (decodeStream != null) {
                Log.m105925i("MicroMsg.AppBrand.BitmapDecoderImpl", "bitmap recycle %s", decodeStream);
                decodeStream.recycle();
            }
            int i5 = options.outHeight;
            if (i5 > 0) {
                int i6 = options.outWidth;
                if (i6 > 0) {
                    int i7 = (int) ((((double) i6) * 1.0d) / ((double) this.f256244d));
                    options.inSampleSize = i7;
                    if (i7 <= 1) {
                        options.inSampleSize = 1;
                    }
                    while (true) {
                        i = options.outHeight;
                        i2 = options.outWidth;
                        int i8 = options.inSampleSize;
                        if (((i * i2) / i8) / i8 <= 2764800) {
                            break;
                        }
                        options.inSampleSize = i8 + 1;
                    }
                    int i9 = this.f256244d;
                    int i15 = this.f256245e;
                    options.inJustDecodeBounds = false;
                    options.inMutable = true;
                    float f = ((float) i2) / ((float) i);
                    float f2 = ((float) i9) / ((float) i15);
                    int ordinal = this.f256246f.ordinal();
                    if (ordinal == 0) {
                        if (f > f2) {
                            i4 = options.outHeight;
                            i3 = (int) (((((float) i4) * 1.0f) * ((float) this.f256244d)) / ((float) this.f256245e));
                        } else {
                            i3 = options.outWidth;
                            i4 = (int) (((((float) i3) * 1.0f) * ((float) this.f256245e)) / ((float) this.f256244d));
                        }
                        Bitmap decodeRegion = BitmapRegionDecoder.newInstance(inputStream, false).decodeRegion(new Rect(0, 0, i3, i4), options);
                        if (decodeRegion == null) {
                            Log.m105921e("MicroMsg.AppBrand.BitmapDecoderImpl", "get null result using RegionDecoder, origin[%dx%d], desire[%dx%d]", Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight), Integer.valueOf(i3), Integer.valueOf(i4));
                            try {
                                inputStream.reset();
                                bitmap = BitmapFactory.decodeStream(inputStream, (Rect) null, options);
                            } catch (IOException | OutOfMemoryError e) {
                                Log.printErrStackTrace("MicroMsg.AppBrand.BitmapDecoderImpl", e, "fallback using BitmapFactory", new Object[0]);
                            }
                        }
                        bitmap = decodeRegion;
                    } else if (ordinal == 1) {
                        bitmap = BitmapFactory.decodeStream(inputStream, (Rect) null, options);
                    }
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    return bitmap;
                }
            }
            Log.m105921e("MicroMsg.AppBrand.BitmapDecoderImpl", "decode[%s] error, outHeight[%d] outWidth[%d]", inputStream, Integer.valueOf(i5), Integer.valueOf(options.outWidth));
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            return null;
        } catch (IOException e2) {
            Log.m105921e("MicroMsg.AppBrand.BitmapDecoderImpl", "%s", e2);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            return null;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public String key() {
        return String.format("Decoder_w%s_h%s", new Object[]{Integer.valueOf(this.f256244d), Integer.valueOf(this.f256245e)});
    }
}
