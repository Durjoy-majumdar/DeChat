package ga0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import pe3.C89349b;
import sx3.C64197v;

/* renamed from: ga0.d */
public final class C59401d {

    /* renamed from: a */
    public static final C59401d f169764a = new C59401d();

    /* renamed from: a */
    public static final LinkedList m69311a(C59401d dVar, List list) {
        int i;
        boolean z;
        dVar.getClass();
        LinkedList linkedList = new LinkedList();
        int i2 = 299;
        int i3 = 299;
        while (true) {
            boolean z2 = true;
            i = 0;
            if (i2 > 0 && i3 > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                linkedList.clear();
                int i4 = 0;
                int i5 = 0;
                for (Object next : list) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        String str = (String) next;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = z2;
                        BitmapFactory.decodeFile(str, options);
                        options.inSampleSize = BitmapUtil.calculateInSampleSize(options.outWidth, options.outHeight, 299, 299);
                        options.inJustDecodeBounds = false;
                        Bitmap d = MMBitmapFactory.m98735d(str, options);
                        if (d == null) {
                            d = Bitmap.createBitmap(299, 299, Bitmap.Config.ARGB_8888);
                            C87412m.m108593f(d, "createBitmap(\n          …onfig.ARGB_8888\n        )");
                        }
                        new Canvas(createBitmap).drawBitmap(d, (Rect) null, new Rect(0, 0, i3, i2), (Paint) null);
                        C89349b bVar = new C89349b(BitmapUtil.Bitmap2Bytes(createBitmap, 50));
                        linkedList.add(bVar);
                        i4 += bVar.f257327a.length;
                        i5 = i6;
                        z2 = true;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                Log.m105924i("MicroMsg.CgiHelper", "imageData size:" + i4 + " thumbWidth:" + i3 + " thumbHeight:" + i2);
                i3 /= 2;
                i2 /= 2;
                if (i4 <= 102400) {
                    z = true;
                    break;
                }
            } else {
                Log.m105924i("MicroMsg.CgiHelper", "get image data fail!");
                z = false;
            }
        }
        Log.m105924i("MicroMsg.CgiHelper", "get image data fail!");
        z = false;
        if (!z) {
            linkedList.clear();
            byte[] Bitmap2Bytes = BitmapUtil.Bitmap2Bytes(Bitmap.createBitmap(299, 299, Bitmap.Config.ARGB_8888), 50);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                C89349b bVar2 = new C89349b(Bitmap2Bytes);
                linkedList.add(bVar2);
                i += bVar2.f257327a.length;
            }
            Log.m105924i("MicroMsg.CgiHelper", "backup imageData size:" + i);
        }
        return linkedList;
    }
}
