package ea3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kg3.C76577a;

/* renamed from: ea3.l */
public final class C7618l {

    /* renamed from: a */
    public static final C7618l f25900a = new C7618l();

    /* renamed from: b */
    public static final HashMap<String, WeakReference<Bitmap>> f25901b = new HashMap<>();

    /* renamed from: a */
    public final Bitmap mo8750a(String str) {
        if (str == null) {
            return null;
        }
        HashMap<String, WeakReference<Bitmap>> hashMap = f25901b;
        WeakReference weakReference = hashMap.get(str);
        if ((weakReference != null ? (Bitmap) weakReference.get() : null) != null) {
            Object obj = weakReference.get();
            C87412m.m108591d(obj);
            if (!((Bitmap) obj).isRecycled()) {
                return (Bitmap) weakReference.get();
            }
        }
        Bitmap decodeFile = C86013q1.m106450k(str) ? BitmapUtil.decodeFile(str, (BitmapFactory.Options) null) : null;
        if (decodeFile != null) {
            hashMap.put(str, new WeakReference(decodeFile));
            return decodeFile;
        }
        try {
            decodeFile = BackwardSupportUtil.BitmapFactory.decodeStream(MMApplicationContext.getContext().getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null));
            hashMap.put(str, new WeakReference(decodeFile));
            return decodeFile;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebViewBitmapUtil", e, "", new Object[0]);
            return decodeFile;
        }
    }
}
