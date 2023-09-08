package uy1;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import o90.C100301b;
import uy1.C52645f;

/* renamed from: uy1.h */
public class C52655h implements C52645f.C52652e {

    /* renamed from: a */
    public final /* synthetic */ C52645f.C52652e f147033a;

    /* renamed from: b */
    public final /* synthetic */ int f147034b;

    /* renamed from: c */
    public final /* synthetic */ int f147035c;

    /* renamed from: d */
    public final /* synthetic */ int f147036d;

    /* renamed from: e */
    public final /* synthetic */ String f147037e;

    /* renamed from: f */
    public final /* synthetic */ C52645f f147038f;

    public C52655h(C52645f fVar, C52645f.C52652e eVar, int i, int i2, int i3, String str) {
        this.f147038f = fVar;
        this.f147033a = eVar;
        this.f147034b = i;
        this.f147035c = i2;
        this.f147036d = i3;
        this.f147037e = str;
    }

    /* renamed from: a */
    public void mo65432a(View view, Bitmap bitmap) {
        Bitmap bitmap2;
        int i;
        int i2;
        Log.m105918d("MicroMsg.GameImageUtil", "getBitmapWithWH, onFinish");
        if (bitmap != null && !bitmap.isRecycled()) {
            C52645f fVar = this.f147038f;
            int i3 = this.f147034b;
            int i4 = this.f147035c;
            fVar.getClass();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (!(width == i3 && height == i4)) {
                float f = (float) i4;
                float f2 = ((float) height) / f;
                float f3 = (float) i3;
                float f4 = ((float) width) / f3;
                if (f2 < f4) {
                    i2 = (int) (f2 * f3);
                    try {
                        bitmap2 = Bitmap.createBitmap(bitmap, (width - i2) / 2, 0, i2, height);
                        i = height;
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    int i5 = (int) (f4 * f);
                    bitmap2 = Bitmap.createBitmap(bitmap, 0, (height - i5) / 2, width, i5);
                    i = i5;
                    i2 = width;
                }
                Log.m105925i("MicroMsg.GameImageUtil", "resizeBitmap, bitmapW = %d, bitmapH = %d, newWidth = %d, newHeight = %d", Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(i2), Integer.valueOf(i));
                bitmap = bitmap2;
            }
            Log.m105918d("MicroMsg.GameImageUtil", "getBitmapWithWH, resizeBitmap end");
            int i6 = this.f147036d;
            if (i6 != 0) {
                bitmap = BitmapUtil.getRoundedCornerBitmap(bitmap, true, (float) i6);
            }
            ((C100301b) this.f147038f.f147001d).mo139557c(this.f147037e, bitmap);
            C52645f.C52652e eVar = this.f147033a;
            if (eVar != null) {
                eVar.mo65432a(view, bitmap);
            }
        }
    }

    /* renamed from: b */
    public void mo65433b(String str, View view) {
        C52645f.C52652e eVar = this.f147033a;
        if (eVar != null) {
            eVar.mo65433b(str, view);
        }
    }
}
