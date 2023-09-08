package as2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import vr2.C102236a0;

/* renamed from: as2.a */
public class C92084a {
    /* renamed from: a */
    public static C92714n m115749a(Bitmap bitmap, String str, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        SnsMethodCalculate.markStartTimeMs("blurBitmap", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        C92714n c = C92714n.m116851c(BitmapUtil.fastblur(bitmap, i2));
        SnsMethodCalculate.markEndTimeMs("blurBitmap", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        if (c == null) {
            Log.m105920e("MicroMsg.BlurHelper", "returnBitmap error2 ");
        }
        if (c != null) {
            c.f266822h = false;
            new Canvas(c.f266818d).drawColor(i);
        }
        try {
            c.f266822h = false;
            BitmapUtil.saveBitmapToImage(c.f266818d, 70, Bitmap.CompressFormat.JPEG, str, false);
        } catch (IOException e) {
            Log.m105920e("MicroMsg.BlurHelper", "error for exception " + e.getMessage());
            Log.printErrStackTrace("MicroMsg.BlurHelper", e, "", new Object[0]);
        }
        Log.m105924i("MicroMsg.BlurHelper", "blur done bitmap  " + c);
        SnsMethodCalculate.markEndTimeMs("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        return c;
    }

    /* renamed from: b */
    public static C92714n m115750b(String str, String str2) {
        C92714n nVar;
        SnsMethodCalculate.markStartTimeMs("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        int argb = Color.argb(51, 255, 255, 255);
        SnsMethodCalculate.markStartTimeMs("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        C92714n p = C102236a0.m134762p(str);
        if (p == null) {
            Log.m105920e("MicroMsg.BlurHelper", "returnBitmap error1 ");
            nVar = null;
            SnsMethodCalculate.markEndTimeMs("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        } else {
            p.f266822h = false;
            nVar = m115749a(p.f266818d, str2, argb, 55);
            SnsMethodCalculate.markEndTimeMs("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        }
        SnsMethodCalculate.markEndTimeMs("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        return nVar;
    }
}
