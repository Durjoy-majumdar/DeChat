package lr2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.tencent.p014mm.memory.C92712l;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p757xv.C91353u;
import vr2.C102236a0;

/* renamed from: lr2.a */
public class C99590a {
    /* renamed from: a */
    public static Bitmap m130018a(String str, BitmapFactory.Options options, float f) {
        SnsMethodCalculate.markStartTimeMs("decode", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        long currentTimeMillis = System.currentTimeMillis();
        Bitmap b = C92712l.m116840c().mo126911b(str, options);
        if (f == 0.0f) {
            Log.m105919d("MicroMsg.SnsBitmapUtil", "decode used %dms %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), b);
            SnsMethodCalculate.markEndTimeMs("decode", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return b;
        }
        Bitmap bitmap = null;
        if (b != null) {
            bitmap = BitmapUtil.getRoundedCornerBitmap(b, true, f * ((float) b.getWidth()));
            Log.m105919d("MicroMsg.SnsBitmapUtil", "decode used %dms %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), b);
        }
        SnsMethodCalculate.markEndTimeMs("decode", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        return bitmap;
    }

    /* renamed from: b */
    public static C92714n m130019b(String str, BitmapFactory.Options options) {
        SnsMethodCalculate.markStartTimeMs("decodeWithRotateByExif", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        SnsMethodCalculate.markStartTimeMs("checkSupportWideColor", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        SnsMethodCalculate.markEndTimeMs("checkSupportWideColor", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Bitmap b = C92712l.m116840c().mo126911b(str, options);
            if (b != null) {
                b = C102236a0.m134750j(str, b);
            }
            Log.m105919d("MicroMsg.SnsBitmapUtil", "decodeWithRotateByExif used %dms bitmap: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), b);
            C92714n c = C92714n.m116851c(b);
            SnsMethodCalculate.markEndTimeMs("decodeWithRotateByExif", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return c;
        } catch (OutOfMemoryError e) {
            Log.m105921e("MicroMsg.SnsBitmapUtil", "%s", ((MemoryWatchDog) ((C91353u) C86312j.m106911c(C91353u.class)).mo112623CU()).mo118581g());
            Log.m105920e("MicroMsg.SnsBitmapUtil", "OutOfMemoryError e " + e.getMessage());
            SnsMethodCalculate.markEndTimeMs("decodeWithRotateByExif", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return null;
        }
    }

    /* renamed from: c */
    public static Bitmap m130020c(String str, BitmapFactory.Options options, BitmapFactory.Options options2) {
        SnsMethodCalculate.markStartTimeMs("decodeWithRotateByExifReturnBitmap", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        SnsMethodCalculate.markStartTimeMs("checkSupportWideColor", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        SnsMethodCalculate.markEndTimeMs("checkSupportWideColor", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Bitmap b = C92712l.m116840c().mo126911b(str, options);
            if (b != null) {
                b = C102236a0.m134750j(str, b);
            }
            Log.m105919d("MicroMsg.SnsBitmapUtil", "decodeWithRotateByExif used %dms bitmap: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), b);
            SnsMethodCalculate.markEndTimeMs("decodeWithRotateByExifReturnBitmap", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return b;
        } catch (OutOfMemoryError e) {
            Log.m105921e("MicroMsg.SnsBitmapUtil", "%s", ((MemoryWatchDog) ((C91353u) C86312j.m106911c(C91353u.class)).mo112623CU()).mo118581g());
            Log.m105920e("MicroMsg.SnsBitmapUtil", "OutOfMemoryError e " + e.getMessage());
            SnsMethodCalculate.markEndTimeMs("decodeWithRotateByExifReturnBitmap", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return null;
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.SnsBitmapUtil", e2, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("decodeWithRotateByExifReturnBitmap", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return null;
        }
    }

    /* renamed from: d */
    public static Bitmap m130021d(String str, Rect rect, BitmapFactory.Options options) {
        SnsMethodCalculate.markStartTimeMs("regionDecodeWithRotateByExif", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        long currentTimeMillis = System.currentTimeMillis();
        Bitmap e = C92712l.m116840c().mo126913e(str, rect, options);
        if (e != null) {
            e = C102236a0.m134750j(str, e);
        }
        Log.m105919d("MicroMsg.SnsBitmapUtil", "regionDecodeWithRotateByExif used %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        SnsMethodCalculate.markEndTimeMs("regionDecodeWithRotateByExif", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        return e;
    }
}
