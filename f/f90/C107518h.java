package f90;

import android.graphics.Point;
import android.opengl.EGLContext;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j90.C108667e;
import m90.C109557d;
import m90.C109572k;
import m90.C88716b;
import p80.C110194c;
import s80.C110777a;
import y80.C112405g;
import y80.C38978c;
import y80.C66557b;

/* renamed from: f90.h */
public final class C107518h {

    /* renamed from: a */
    public static final C107518h f321688a = new C107518h();

    /* renamed from: b */
    public static C110777a f321689b;

    /* renamed from: f90.h$a */
    public static final class C107519a extends C87413o implements C32224a<C107517g> {

        /* renamed from: d */
        public final /* synthetic */ int f321690d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107519a(int i) {
            super(0);
            this.f321690d = i;
        }

        public Object invoke() {
            int i = 1;
            int i2 = this.f321690d == 2 ? 1 : 2;
            if (!C38978c.f105018a.mo61859a()) {
                i = 2;
            }
            return new C107517g(i2, i, this.f321690d);
        }
    }

    /* renamed from: a */
    public final C88716b mo157958a(int i, VideoTransPara videoTransPara, C112405g gVar, EGLContext eGLContext, C108667e eVar, C110777a aVar) {
        C87412m.m108594g(videoTransPara, "videoTransPara");
        C87412m.m108594g(gVar, "camera");
        C87412m.m108594g(eGLContext, "eglContext");
        C87412m.m108594g(eVar, "view");
        C107519a aVar2 = new C107519a(i);
        int i2 = -1;
        if (i == 2) {
            if (aVar == null) {
                f321689b = (C110777a) aVar2.invoke();
            } else {
                f321689b = aVar;
            }
            C110777a aVar3 = f321689b;
            if (aVar3 != null) {
                if (C38978c.f105018a.mo61859a()) {
                    aVar3.mo159591u(videoTransPara.f267166d, videoTransPara.f267167e);
                } else if (gVar.mo143174m() != null) {
                    aVar3.mo159591u(C66557b.f191416c, C66557b.f191415b);
                    aVar3.mo159589r(C66557b.f191417d);
                    aVar3.mo159588m(C66557b.f191420g);
                }
            }
            C110777a aVar4 = f321689b;
            C110194c previewTexture = eVar.getPreviewTexture();
            if (previewTexture != null) {
                i2 = previewTexture.f329652e;
            }
            return new C109557d(videoTransPara, aVar4, eGLContext, i2);
        }
        if (aVar == null) {
            f321689b = (C110777a) aVar2.invoke();
        } else {
            f321689b = aVar;
        }
        C110777a aVar5 = f321689b;
        if (aVar5 != null) {
            if (C38978c.f105018a.mo61859a()) {
                aVar5.mo159591u(videoTransPara.f267166d, videoTransPara.f267167e);
            } else if (gVar.mo143174m() != null) {
                Point point = new Point(C66557b.f191416c, C66557b.f191415b);
                aVar5.mo159591u(point.x, point.y);
                aVar5.mo159589r(C66557b.f191417d);
                aVar5.mo159588m(C66557b.f191420g);
            }
        }
        C110777a aVar6 = f321689b;
        C110194c previewTexture2 = eVar.getPreviewTexture();
        if (previewTexture2 != null) {
            i2 = previewTexture2.f329652e;
        }
        return new C109572k(videoTransPara, aVar6, eGLContext, i2);
    }
}
