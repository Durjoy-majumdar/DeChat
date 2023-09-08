package yz2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import p008bq.C39833l0;
import p008bq.C67309t0;
import uz2.C78316t;

/* renamed from: yz2.o1 */
public final class C79254o1 implements C39833l0.C39835b {

    /* renamed from: a */
    public final /* synthetic */ C78316t f232679a;

    /* renamed from: b */
    public final /* synthetic */ TextStatusEditActivity f232680b;

    public C79254o1(C78316t tVar, TextStatusEditActivity textStatusEditActivity) {
        this.f232679a = tVar;
        this.f232680b = textStatusEditActivity;
    }

    /* renamed from: a */
    public final void mo62472a(int i, String str) {
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditActivity", "initEmojiInfo:  emojiUploadCheck errType:" + i + " gifMd5:" + str);
        if (i == 0) {
            C78316t tVar = this.f232679a;
            if (tVar.f229443d != null) {
                this.f232680b.mo98458c8(((C67309t0) C86312j.m106911c(C67309t0.class)).q00(tVar.f229443d));
                return;
            }
            return;
        }
        TextStatusEditActivity textStatusEditActivity = this.f232680b;
        String string = textStatusEditActivity.getString(C0966R.string.n5u);
        C87412m.m108593f(string, "getString(R.string.text_status_emoji_load_fail)");
        textStatusEditActivity.mo98491t8(string);
    }
}
