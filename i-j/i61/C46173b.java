package i61;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;

/* renamed from: i61.b */
public class C46173b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EmojiInfo f124467d;

    /* renamed from: e */
    public final /* synthetic */ C46174c f124468e;

    public C46173b(C46174c cVar, EmojiInfo emojiInfo) {
        this.f124468e = cVar;
        this.f124467d = emojiInfo;
    }

    public void run() {
        EmojiInfo emojiInfo = this.f124467d;
        if (emojiInfo != null && !emojiInfo.mo62633C1()) {
            Log.m105925i("MicroMsg.emoji.EmojiFileCheckerMgr", "chatting emoji broken. try to recover:%s", this.f124467d.getMd5());
            this.f124468e.mo71608a(this.f124467d, true);
        }
    }
}
