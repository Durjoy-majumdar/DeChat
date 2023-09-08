package xh2;

import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: xh2.b */
public final class C66280b extends C87413o implements C32227p<Boolean, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AudioCacheInfo f190817d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66280b(AudioCacheInfo audioCacheInfo) {
        super(2);
        this.f190817d = audioCacheInfo;
    }

    public Object invoke(Object obj, Object obj2) {
        String str = (String) obj2;
        this.f190817d.f163818j = ((Boolean) obj).booleanValue();
        return C13598b0.f38549a;
    }
}
