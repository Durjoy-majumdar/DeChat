package xu0;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.OutputStream;

/* renamed from: xu0.m */
public final class C15903m implements BitmapUtil.ImageWriteOSCallback {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f42780a;

    /* renamed from: b */
    public final /* synthetic */ String f42781b;

    public C15903m(Bitmap bitmap, String str) {
        this.f42780a = bitmap;
        this.f42781b = str;
    }

    public final void callback(OutputStream outputStream) {
        try {
            boolean compress = this.f42780a.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
            Log.m105924i("MicroMsg.Avatar.HdAvatarUpdateSmallFilePPC", "update small bitmap result:" + compress + " username:" + this.f42781b);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Avatar.HdAvatarUpdateSmallFilePPC", e, "updateSmallAvatar", new Object[0]);
        } catch (Throwable th) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
            throw th;
        }
        try {
            outputStream.close();
        } catch (Exception unused2) {
        }
    }
}
