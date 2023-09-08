package k90;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import i72.C108382h;
import j90.C108667e;
import s80.C110777a;

/* renamed from: k90.c */
public final class C108968c extends C108965b {

    /* renamed from: h */
    public final C108382h f326414h = new C108969a(this);

    /* renamed from: k90.c$a */
    public static final class C108969a implements C108382h {

        /* renamed from: d */
        public final /* synthetic */ C108968c f326415d;

        public C108969a(C108968c cVar) {
            this.f326415d = cVar;
        }

        /* renamed from: f */
        public final boolean mo157927f(byte[] bArr) {
            C108968c cVar = this.f326415d;
            if (bArr != null) {
                C110777a aVar = cVar.f326404c;
                if (aVar != null) {
                    C110777a.m150772l(aVar, bArr, false, 2, (Object) null);
                }
                cVar.f326402a.requestRender();
            } else {
                Log.m105926v(cVar.f326403b, "passing draw");
            }
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108968c(C108667e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "view");
    }

    /* renamed from: a */
    public C108382h mo160063a() {
        return this.f326414h;
    }
}
