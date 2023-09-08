package p1017od;

import com.github.henryye.nativeiv.BaseImageDecodeService;
import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.github.henryye.nativeiv.api.IImageDecodeService;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import com.tencent.magicbrush.MBRuntime;

/* renamed from: od.h */
public class C89162h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ IImageDecodeService.C80190c f256938d;

    /* renamed from: e */
    public final /* synthetic */ String f256939e;

    /* renamed from: f */
    public final /* synthetic */ Object f256940f;

    /* renamed from: g */
    public final /* synthetic */ ImageDecodeConfig f256941g;

    /* renamed from: h */
    public final /* synthetic */ MBRuntime f256942h;

    public C89162h(MBRuntime mBRuntime, IImageDecodeService.C80190c cVar, String str, Object obj, ImageDecodeConfig imageDecodeConfig) {
        this.f256942h = mBRuntime;
        this.f256938d = cVar;
        this.f256939e = str;
        this.f256940f = obj;
        this.f256941g = imageDecodeConfig;
    }

    public void run() {
        if (this.f256942h.f235052a == 0) {
            IImageDecodeService.C80190c cVar = this.f256938d;
            Object obj = this.f256940f;
            ((BaseImageDecodeService.C80183c) cVar).getClass();
            if (obj != null) {
                ((IBitmap) obj).recycle();
                return;
            }
            return;
        }
        MBRuntime mBRuntime = this.f256942h;
        mBRuntime.nativeNotifyImageDecoded(mBRuntime.f235052a, this.f256939e, this.f256940f, this.f256941g);
    }
}
