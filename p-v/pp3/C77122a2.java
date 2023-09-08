package pp3;

import com.tencent.p014mm.vfs.C75056b;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pp3.a2 */
public final class C77122a2 extends C87413o implements C32226l<C75056b, C13598b0> {

    /* renamed from: d */
    public static final C77122a2 f225231d = new C77122a2();

    public C77122a2() {
        super(1);
    }

    public Object invoke(Object obj) {
        C75056b bVar = (C75056b) obj;
        C87412m.m108594g(bVar, "$this$category");
        bVar.mo104645a(ShareConstants.PATCH_DIRECTORY_NAME, new int[0], C77119a.f225228d);
        bVar.mo104645a("PublicResource", new int[0], C77126b.f225235d);
        bVar.mo104645a("CheckResUpdate", new int[]{0, 4}, C77133c.f225242d);
        bVar.mo104645a("face_detect", new int[0], C77140d.f225249d);
        bVar.mo104645a("TencentMapSDK", new int[0], C77147e.f225256d);
        bVar.mo104645a("WxAudioLib", new int[0], C77154f.f225263d);
        bVar.mo104645a("NewMsgRingtone", new int[0], C77161g.f225270d);
        return C13598b0.f38549a;
    }
}
