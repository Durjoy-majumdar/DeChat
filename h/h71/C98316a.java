package h71;

import android.graphics.Matrix;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.CaptureEditorContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p248ug.C78158s0;
import y61.C102813c;

/* renamed from: h71.a */
public final class C98316a implements C78158s0.C78159a {

    /* renamed from: a */
    public final /* synthetic */ CaptureEditorContainer f288171a;

    public C98316a(CaptureEditorContainer captureEditorContainer) {
        this.f288171a = captureEditorContainer;
    }

    /* renamed from: a */
    public void mo68482a(IEmojiInfo iEmojiInfo) {
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        Log.m105925i(this.f288171a.f269325d, "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
        C102813c presenter = this.f288171a.getPresenter();
        if (presenter != null) {
            presenter.mo136698c(iEmojiInfo, (Matrix) null);
        }
        onHide();
    }

    public void onHide() {
        this.f288171a.mo128093b(false);
    }
}
