package g71;

import com.tencent.p014mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.p014mm.plugin.emojicapture.p841ui.capture.EditorStickerView;
import fy3.C32226l;
import gy3.C87413o;
import rh3.C101380d;
import rx3.C13598b0;
import sh3.C101624e;
import te3.C101814mn2;
import u60.C65234n;

/* renamed from: g71.h */
public final class C98087h extends C87413o implements C32226l<C101380d, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EditorStickerView f287557d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98087h(EditorStickerView editorStickerView) {
        super(1);
        this.f287557d = editorStickerView;
    }

    public Object invoke(Object obj) {
        C101380d dVar = (C101380d) obj;
        EditorStickerView editorStickerView = this.f287557d;
        editorStickerView.f269281u = dVar != null ? dVar.f296960a : null;
        if (dVar != null) {
            EmojiCaptureReporter reporter = editorStickerView.getReporter();
            if (reporter != null) {
                C101814mn2 mn22 = dVar.f296960a;
                String str = mn22.f298862d;
                String str2 = mn22.f298864f;
                int i = dVar.f296961b;
                int i2 = dVar.f296962c;
                reporter.f269121A = str;
                reporter.f269124D = str2;
                reporter.f269122B = i;
                reporter.f269123C = i2;
                reporter.mo127935e(23);
            }
            EditorStickerView editorStickerView2 = this.f287557d;
            C101814mn2 mn23 = dVar.f296960a;
            editorStickerView2.f269279s = mn23;
            editorStickerView2.f269280t = mn23.f298862d;
            C65234n c = C101624e.f297484a.mo141086c(mn23);
            if (c == C65234n.OK) {
                this.f287557d.mo128067c(c);
            }
        }
        return C13598b0.f38549a;
    }
}
