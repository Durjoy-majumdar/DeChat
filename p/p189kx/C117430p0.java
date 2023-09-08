package p189kx;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.qbar.C19936d;
import com.tencent.qbar.WxQbarNative;
import di3.C86301e;
import ei3.C86522b;
import p200lx.C10660k0;

@C86522b
/* renamed from: kx.p0 */
public class C117430p0 extends C86301e implements C10660k0 {
    public int[] o00(Bitmap bitmap) {
        boolean z = C19936d.f56883f;
        int[] iArr = new int[6];
        long currentTimeMillis = System.currentTimeMillis();
        int GetDominantColors = WxQbarNative.GetDominantColors(bitmap, iArr);
        Log.m105924i("MicroMsg.WxQBar", "getDominantColors: cost - " + (System.currentTimeMillis() - currentTimeMillis));
        int i = iArr[0];
        if (i == 0 || GetDominantColors != 0) {
            Log.m105921e("MicroMsg.WxQBar", "getDominantColors error: outColor both 0 or res = %s", Integer.valueOf(GetDominantColors));
            return null;
        }
        return new int[]{Color.argb(255, i, iArr[1], iArr[2]), Color.argb(255, iArr[3], iArr[4], iArr[5])};
    }

    public Bitmap p60(String str, int i, boolean z) {
        return C19936d.m21741d(str, i, z);
    }

    /* renamed from: yp */
    public Bitmap mo10927yp(String str, int i) {
        return C19936d.m21741d(str, i, false);
    }
}
