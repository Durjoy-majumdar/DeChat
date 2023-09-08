package g71;

import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.plugin.emojicapture.p841ui.capture.EditorStickerView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import sh3.C101624e;
import te3.C101814mn2;
import u60.C65234n;

/* renamed from: g71.f */
public final class C98085f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EditorStickerView f287555d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98085f(EditorStickerView editorStickerView) {
        super(0);
        this.f287555d = editorStickerView;
    }

    public Object invoke() {
        C104428a aVar = this.f287555d.f269278r;
        boolean z = true;
        if (aVar == null || !aVar.isShowing()) {
            z = false;
        }
        if (z) {
            EditorStickerView editorStickerView = this.f287555d;
            C101814mn2 mn22 = editorStickerView.f269281u;
            if (mn22 != null) {
                editorStickerView.f269279s = mn22;
                editorStickerView.f269280t = mn22.f298862d;
                C65234n c = C101624e.f297484a.mo141086c(mn22);
                if (c == C65234n.OK) {
                    editorStickerView.mo128067c(c);
                }
            }
        } else {
            EditorStickerView editorStickerView2 = this.f287555d;
            EditorStickerView.m117837b(editorStickerView2, editorStickerView2.f269271h);
        }
        return C13598b0.f38549a;
    }
}
