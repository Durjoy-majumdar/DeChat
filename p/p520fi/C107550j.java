package p520fi;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;

/* renamed from: fi.j */
public class C107550j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f321780d;

    /* renamed from: e */
    public final /* synthetic */ String f321781e;

    public C107550j(C107551k kVar, Bitmap bitmap, String str) {
        this.f321780d = bitmap;
        this.f321781e = str;
    }

    public void run() {
        try {
            BitmapUtil.saveBitmapToImage(this.f321780d, 50, Bitmap.CompressFormat.PNG, this.f321781e, true);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.MosaicCache", e, "", new Object[0]);
        }
    }
}
