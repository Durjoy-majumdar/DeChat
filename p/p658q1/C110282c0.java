package p658q1;

import androidx.compose.p002ui.platform.C103627h;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103635j0;
import androidx.compose.p002ui.platform.C103673o2;
import androidx.compose.p002ui.platform.C103709y1;
import fy3.C32224a;
import fy3.C32226l;
import p009c2.C54652b0;
import p1111g1.C107693a;
import p1116h1.C108009b;
import p190l1.C109109q;
import p258w0.C111681b;
import p258w0.C111685g;
import p436a1.C103262s;
import p451b2.C104014i;
import p451b2.C54397h;
import p560i2.C108322d;
import p560i2.C33183o;
import p869y0.C66478i;
import rx3.C13598b0;

/* renamed from: q1.c0 */
public interface C110282c0 {

    /* renamed from: q1.c0$a */
    public static final class C110283a {
        /* renamed from: a */
        public static /* synthetic */ void m149951a(C110282c0 c0Var, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                c0Var.mo144620a(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
    }

    /* renamed from: q1.c0$b */
    public interface C110284b {
        /* renamed from: d */
        void mo161687d();
    }

    /* renamed from: a */
    void mo144620a(boolean z);

    /* renamed from: b */
    void mo144622b(C110301j jVar, boolean z);

    /* renamed from: c */
    long mo144623c(long j);

    /* renamed from: d */
    void mo144626d();

    /* renamed from: e */
    long mo144632e(long j);

    /* renamed from: f */
    void mo144633f(C110301j jVar);

    /* renamed from: g */
    void mo144635g(C110301j jVar, boolean z);

    C103627h getAccessibilityManager();

    C111681b getAutofill();

    C111685g getAutofillTree();

    C103635j0 getClipboardManager();

    C108322d getDensity();

    C66478i getFocusManager();

    C104014i.C104015a getFontFamilyResolver();

    C54397h.C54398a getFontLoader();

    C107693a getHapticFeedBack();

    C108009b getInputModeManager();

    C33183o getLayoutDirection();

    C109109q getPointerIconService();

    C110308p getSharedDrawScope();

    boolean getShowLayoutBounds();

    C110292f0 getSnapshotObserver();

    C54652b0 getTextInputService();

    C103709y1 getTextToolbar();

    C103633i2 getViewConfiguration();

    C103673o2 getWindowInfo();

    /* renamed from: h */
    void mo144666h(C110301j jVar);

    /* renamed from: j */
    void mo144668j(C110301j jVar);

    /* renamed from: k */
    void mo144669k();

    /* renamed from: m */
    void mo144671m(C110301j jVar);

    /* renamed from: n */
    void mo144672n(C110284b bVar);

    /* renamed from: o */
    void mo144673o(C32224a<C13598b0> aVar);

    /* renamed from: p */
    void mo144686p(C110301j jVar, long j);

    /* renamed from: q */
    C110281b0 mo144687q(C32226l<? super C103262s, C13598b0> lVar, C32224a<C13598b0> aVar);

    boolean requestFocus();

    void setShowLayoutBounds(boolean z);
}
