package g71;

import android.content.DialogInterface;
import b71.C92208n;
import com.tencent.p014mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.p014mm.plugin.emojicapture.p841ui.capture.EditorStickerView;
import te3.C101814mn2;

/* renamed from: g71.g */
public final class C98086g implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ EditorStickerView f287556d;

    public C98086g(EditorStickerView editorStickerView) {
        this.f287556d = editorStickerView;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        EditorStickerView editorStickerView = this.f287556d;
        C101814mn2 mn22 = editorStickerView.f269281u;
        if (mn22 != null) {
            editorStickerView.f269274n.mo126164a(mn22);
            C92208n nVar = editorStickerView.f269275o;
            nVar.f263919e = mn22.f298862d;
            nVar.f263921g = true;
        }
        EmojiCaptureReporter reporter = this.f287556d.getReporter();
        if (reporter != null) {
            reporter.mo127935e(26);
        }
    }
}
