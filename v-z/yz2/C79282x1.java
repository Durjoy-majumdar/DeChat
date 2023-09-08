package yz2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import p008bq.C39833l0;
import p008bq.C67309t0;
import uz2.C78316t;

/* renamed from: yz2.x1 */
public final class C79282x1 implements C39833l0.C39835b {

    /* renamed from: a */
    public final /* synthetic */ C78316t f232731a;

    /* renamed from: b */
    public final /* synthetic */ TextStatusEditHalfScreenActivity f232732b;

    public C79282x1(C78316t tVar, TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
        this.f232731a = tVar;
        this.f232732b = textStatusEditHalfScreenActivity;
    }

    /* renamed from: a */
    public final void mo62472a(int i, String str) {
        Log.m105924i("MicroMsg.TextStatus.TextStatusEditHalfScreenActivity", "initEmojiInfo:  emojiUploadCheck errType:" + i + " gifMd5:" + str);
        if (i == 0) {
            C78316t tVar = this.f232731a;
            if (tVar.f229443d != null) {
                this.f232732b.mo98574g8(((C67309t0) C86312j.m106911c(C67309t0.class)).q00(tVar.f229443d));
                return;
            }
            return;
        }
        TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity = this.f232732b;
        String string = textStatusEditHalfScreenActivity.getString(C0966R.string.n5u);
        C87412m.m108593f(string, "getString(R.string.text_status_emoji_load_fail)");
        textStatusEditHalfScreenActivity.mo98542E8(string);
    }
}
