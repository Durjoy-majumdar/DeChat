package j71;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import p80.C110194c;
import u80.C111139a;

/* renamed from: j71.j */
public final class C108592j extends C98915l implements C108596o {

    /* renamed from: t */
    public final String f325106t = "MicroMsg.EmojiCapturePreviewRenderer";

    public C108592j() {
        super(0, 1, (C8480h) null);
    }

    /* renamed from: b */
    public C110194c mo159587b() {
        C111139a aVar = this.f331382g;
        C108596o oVar = aVar instanceof C108596o ? (C108596o) aVar : null;
        if (oVar != null) {
            return oVar.mo159587b();
        }
        return null;
    }

    /* renamed from: f */
    public C111139a mo157952f() {
        Log.m105924i(this.f325106t, "doInitRenderProc, useCpuCrop:false");
        return new C108584a(this.f331376a, this.f331377b, this.f331378c, this.f331379d, this.f331380e, this.f331381f);
    }
}
