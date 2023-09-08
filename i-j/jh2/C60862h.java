package jh2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import gy3.C87412m;
import java.util.ArrayList;
import jp3.C9486a;
import jp3.C9487b;

/* renamed from: jh2.h */
public final class C60862h extends C60856b {

    /* renamed from: p */
    public ArrayList<String> f173402p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60862h(C9487b<C9486a> bVar, ArrayList<String> arrayList, int i) {
        super(bVar);
        C87412m.m108594g(bVar, "lifeCycleKeeper");
        C87412m.m108594g(arrayList, "images");
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.f173402p = arrayList2;
        arrayList2.addAll(arrayList);
        this.f173384h = i;
    }

    /* renamed from: a */
    public Bitmap mo85763a(int i) {
        ArrayList<String> arrayList = this.f173402p;
        if (arrayList == null || arrayList.isEmpty()) {
            Bitmap createBitmap = Bitmap.createBitmap(this.f173387k, this.f173388l, Bitmap.Config.ARGB_8888);
            C87412m.m108593f(createBitmap, "createBitmap(thumbWidth,… Bitmap.Config.ARGB_8888)");
            return createBitmap;
        }
        int i2 = this.f173381e[i];
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.f173402p.get(i2), options);
        options.inSampleSize = BitmapUtil.calculateInSampleSize(options.outWidth, options.outHeight, this.f173387k, this.f173388l);
        options.inJustDecodeBounds = false;
        Bitmap d = MMBitmapFactory.m98735d(this.f173402p.get(i2), options);
        if (d != null) {
            return d;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(this.f173387k, this.f173388l, Bitmap.Config.ARGB_8888);
        C87412m.m108593f(createBitmap2, "createBitmap(thumbWidth,… Bitmap.Config.ARGB_8888)");
        return createBitmap2;
    }

    /* renamed from: b */
    public void mo85764b() {
    }

    /* renamed from: c */
    public void mo85765c() {
        if (this.f173384h == 10) {
            this.f173383g = 60000;
        } else {
            this.f173383g = 15000;
        }
        this.f173381e = new int[]{0, 0, 0};
        if (this.f173402p.size() >= 3) {
            this.f173381e[1] = this.f173402p.size() / 2;
            this.f173381e[2] = this.f173402p.size() - 1;
        } else if (this.f173402p.size() == 2) {
            int[] iArr = this.f173381e;
            iArr[1] = 1;
            iArr[2] = 1;
        }
    }
}
