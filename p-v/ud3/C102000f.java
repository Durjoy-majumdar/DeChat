package ud3;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ud3.f */
public final class C102000f {

    /* renamed from: ud3.f$a */
    public class C102001a implements BitmapUtil.ImageWriteOSCallback {

        /* renamed from: a */
        public final /* synthetic */ Bitmap f300321a;

        /* renamed from: b */
        public final /* synthetic */ Bitmap.CompressFormat f300322b;

        /* renamed from: c */
        public final /* synthetic */ int f300323c;

        public C102001a(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i) {
            this.f300321a = bitmap;
            this.f300322b = compressFormat;
            this.f300323c = i;
        }

        public void callback(OutputStream outputStream) {
            try {
                this.f300321a.compress(this.f300322b, this.f300323c, outputStream);
                outputStream.flush();
                try {
                    outputStream.close();
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.VideoUtil", e, "", new Object[0]);
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.VideoUtil", e2, "", new Object[0]);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e3) {
                        Log.printErrStackTrace("MicroMsg.VideoUtil", e3, "", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e4) {
                        Log.printErrStackTrace("MicroMsg.VideoUtil", e4, "", new Object[0]);
                    }
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m134325a(Bitmap bitmap, int i, Bitmap.CompressFormat compressFormat, String str, boolean z) {
        if (!(str == null || str.length() <= 0)) {
            try {
                BitmapUtil.getImageWriteOutputStream(str, (BitmapUtil.ImageWriteOSCallback) new C102001a(bitmap, compressFormat, i));
                if (z) {
                    Log.m105925i("MicroMsg.VideoUtil", "recycle bitmap:%s", bitmap.toString());
                    bitmap.recycle();
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VideoUtil", e, "", new Object[0]);
                if (z) {
                    Log.m105925i("MicroMsg.VideoUtil", "recycle bitmap:%s", bitmap.toString());
                }
            } catch (Throwable th) {
                if (z) {
                    Log.m105925i("MicroMsg.VideoUtil", "recycle bitmap:%s", bitmap.toString());
                    bitmap.recycle();
                }
                throw th;
            }
        } else {
            throw new IOException("saveBitmapToImage pathName null or nil");
        }
    }
}
