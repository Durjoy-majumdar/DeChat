package ki3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.timelineedit.TimelineEditor;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import li3.C109385a;
import mi3.C24989c;
import sp3.C110807k;

/* renamed from: ki3.n */
public final class C109023n extends C87413o implements C32226l<byte[], C110807k> {

    /* renamed from: d */
    public final /* synthetic */ TimelineEditor f326527d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109023n(TimelineEditor timelineEditor) {
        super(1);
        this.f326527d = timelineEditor;
    }

    public Object invoke(Object obj) {
        byte[] bArr = (byte[]) obj;
        C87412m.m108595h(bArr, LocaleUtil.ITALIAN);
        C24989c e = C24989c.m31616e(bArr);
        C87412m.m108590c(e, "compositionInfo");
        return C109385a.m148549d(e, this.f326527d);
    }
}
