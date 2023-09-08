package lh2;

import android.os.Bundle;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p248ug.C78158s0;
import qh2.C101198e;

/* renamed from: lh2.g */
public final class C99442g implements C78158s0.C78159a {

    /* renamed from: a */
    public final /* synthetic */ C99426e f291559a;

    public C99442g(C99426e eVar) {
        this.f291559a = eVar;
    }

    /* renamed from: a */
    public void mo68482a(IEmojiInfo iEmojiInfo) {
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        Log.m105925i("MicroMsg.EditorVideoPluginLayoutNew", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
        if (iEmojiInfo.mo62639J() == null) {
            iEmojiInfo.mo62679k0(iEmojiInfo.getMd5(), "");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("PARAM_EDIT_EMOJI_INFO", iEmojiInfo);
        this.f291559a.f291492d.mo14585p(C101198e.C101199b.EDIT_ADD_EMOJI, bundle);
        onHide();
    }

    public void onHide() {
        this.f291559a.mo138866y().mo136744b(false);
    }
}
