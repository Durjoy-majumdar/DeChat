package ea3;

import a70.C112760b;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;

/* renamed from: ea3.i */
public class C7615i {
    /* renamed from: a */
    public static Intent m7749a(String str) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", FileProviderHelper.getUriForFile(MMApplicationContext.getContext(), new C86009m1(m7750b(str))));
        return intent;
    }

    /* renamed from: b */
    public static String m7750b(String str) {
        C86009m1 m1Var = new C86009m1(C112760b.m154240l());
        if (!m1Var.mo119987x()) {
            Log.m105924i("MicroMsg.WebJSSDKUtil", "mkdirs failed.File is exist = " + m1Var.mo119967g());
        }
        if (!m1Var.mo119967g()) {
            Log.m105921e("MicroMsg.WebJSSDKUtil", "camera storage path do not exist.(%s)", C112760b.m154240l());
        }
        String str2 = m1Var.mo119971i() + "/" + str + ".jpg";
        Log.m105925i("MicroMsg.WebJSSDKUtil", "get file path from capture file name : %s == %s", str, str2);
        return str2;
    }
}
