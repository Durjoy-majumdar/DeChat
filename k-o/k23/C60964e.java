package k23;

import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import jh2.C60863m;
import rx3.C13598b0;

/* renamed from: k23.e */
public final class C60964e {

    /* renamed from: b */
    public static String f173631b = (C86709a0.m107535s().f251806d + "vlog/coming/");

    /* renamed from: a */
    public C60863m f173632a = C60863m.f173404c;

    public C60964e() {
        C60863m.C60868a aVar = C60863m.f173403b;
    }

    /* renamed from: a */
    public final void mo85939a(String str, C32227p<? super Boolean, ? super String, C13598b0> pVar) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(pVar, "callback");
        C60863m mVar = this.f173632a;
        AudioCacheInfo audioCacheInfo = new AudioCacheInfo();
        audioCacheInfo.f163814f = str;
        audioCacheInfo.f163813e = str.hashCode();
        audioCacheInfo.f163817i = f173631b + str.hashCode() + '_' + C31543z5.m39453c() + ".a";
        mVar.mo85769c(audioCacheInfo, pVar);
    }
}
