package c33;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import ei2.C31606c;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hi2.C98453h;
import java.io.IOException;
import rx3.C13598b0;
import te3.C101758az;
import te3.C64899zy;

/* renamed from: c33.e */
public final class C92345e extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C31606c f264239d;

    /* renamed from: e */
    public final /* synthetic */ EffectManager f264240e;

    /* renamed from: f */
    public final /* synthetic */ RecordConfigProvider f264241f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f264242g;

    /* renamed from: h */
    public final /* synthetic */ C64899zy f264243h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92345e(C31606c cVar, EffectManager effectManager, RecordConfigProvider recordConfigProvider, C32226l<? super Boolean, C13598b0> lVar, C64899zy zyVar) {
        super(1);
        this.f264239d = cVar;
        this.f264240e = effectManager;
        this.f264241f = recordConfigProvider;
        this.f264242g = lVar;
        this.f264243h = zyVar;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        this.f264239d.destroy();
        this.f264240e.mo154931k();
        if (bitmap == null) {
            Log.m105920e("MicroMsg.VideoBackgroundRemuxChain", "setThumbBitmap error");
            C98453h hVar = C98453h.f288774a;
            String str = this.f264241f.f272900A;
            C87412m.m108593f(str, "configProvider.inputVideoPath");
            String str2 = this.f264241f.f272902C;
            C87412m.m108593f(str2, "configProvider.thumbPath");
            boolean t = C98453h.m127895t(hVar, str, str2, 0, 4, (Object) null);
            Log.m105924i("MicroMsg.VideoBackgroundRemuxChain", "setThumbBitmap, thumb is null >> " + t);
            this.f264242g.invoke(Boolean.valueOf(t));
        } else {
            Log.m105924i("MicroMsg.VideoBackgroundRemuxChain", "setThumbBitmap success");
            if (C86013q1.m106450k(this.f264241f.f272902C)) {
                Log.m105924i("MicroMsg.VideoBackgroundRemuxChain", this.f264241f.f272902C + " is exit");
                C86013q1.m106447h(this.f264241f.f272902C);
            }
            float height = (((float) bitmap.getHeight()) * 1.0f) / ((float) bitmap.getWidth());
            C101758az azVar = this.f264243h.f186904i;
            float f = (((float) azVar.f297902j) * 1.0f) / ((float) azVar.f297901i);
            if (((double) Math.abs(height - f)) > 0.01d) {
                Log.m105924i("MicroMsg.VideoBackgroundRemuxChain", "resize thumb bitmap from:" + height + " to:" + f);
                bitmap = BitmapUtil.scaleBitmap(bitmap, 1.0f, f / height);
            }
            try {
                BitmapUtil.saveBitmapToImage(bitmap, 60, Bitmap.CompressFormat.JPEG, this.f264241f.f272902C, true);
            } catch (IOException unused) {
                Log.m105920e("MicroMsg.VideoBackgroundRemuxChain", "setThumbBitmap is error");
                this.f264242g.invoke(Boolean.FALSE);
            }
            this.f264242g.invoke(Boolean.TRUE);
        }
        return C13598b0.f38549a;
    }
}
