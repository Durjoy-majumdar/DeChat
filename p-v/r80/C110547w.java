package r80;

import android.media.MediaFormat;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: r80.w */
public final class C110547w extends C87413o implements C32226l<MediaFormat, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110538r f330626d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110547w(C110538r rVar) {
        super(1);
        this.f330626d = rVar;
    }

    public Object invoke(Object obj) {
        MediaFormat mediaFormat = (MediaFormat) obj;
        C87412m.m108594g(mediaFormat, "mediaFormat");
        String str = this.f330626d.f330612w;
        Log.m105924i(str, "onFormatChanged, format:" + mediaFormat);
        C110505a aVar = this.f330626d.f330559I;
        if (aVar != null) {
            aVar.mo161982k(mediaFormat);
        }
        return C13598b0.f38549a;
    }
}
