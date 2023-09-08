package p441aq;

import android.content.Context;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import i61.C98602h;
import p008bq.C67309t0;
import z51.C39315g;

@C86522b
/* renamed from: aq.r */
public class C67099r extends C86301e implements C67309t0 {
    /* renamed from: JV */
    public boolean mo91187JV(Context context, String str, String str2) {
        return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138010Q(context, str, str2);
    }

    /* renamed from: T */
    public String mo91188T(String str) {
        return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138012T(str);
    }

    /* renamed from: Vs */
    public IEmojiInfo mo91189Vs(String str) {
        return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137999G(str);
    }

    /* renamed from: WE */
    public String mo91190WE(Context context, String str) {
        return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137995C(context, str);
    }

    /* renamed from: ZT */
    public byte[] mo91191ZT(IEmojiInfo iEmojiInfo) {
        return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138041z((EmojiInfo) iEmojiInfo);
    }

    /* renamed from: ko */
    public void mo91192ko(IEmojiInfo iEmojiInfo) {
        ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138019f((EmojiInfo) iEmojiInfo);
    }

    public IEmojiInfo q00(String str) {
        EmojiInfo emojiInfo = new EmojiInfo();
        if (!Util.isNullOrNil(str)) {
            emojiInfo.field_md5 = str;
        }
        return emojiInfo;
    }

    /* renamed from: sI */
    public boolean mo91194sI() {
        return ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm() == null;
    }
}
