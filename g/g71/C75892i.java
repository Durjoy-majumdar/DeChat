package g71;

import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.plugin.emojicapture.p841ui.capture.EditorStickerView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: g71.i */
public final class C75892i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ EditorStickerView f222567d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75892i(EditorStickerView editorStickerView) {
        super(0);
        this.f222567d = editorStickerView;
    }

    public Object invoke() {
        C104428a aVar = this.f222567d.f269278r;
        if (aVar != null) {
            aVar.dismiss();
        }
        return C13598b0.f38549a;
    }
}
