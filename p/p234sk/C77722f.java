package p234sk;

import com.tencent.p014mm.emoji.debug.EmojiDebugUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32226l;
import hp3.C87581a;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C26236u;

/* renamed from: sk.f */
public final class C77722f<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ EmojiDebugUI f226528a;

    /* renamed from: b */
    public final /* synthetic */ String f226529b;

    /* renamed from: c */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f226530c;

    public C77722f(EmojiDebugUI emojiDebugUI, String str, C32226l<? super Boolean, C13598b0> lVar) {
        this.f226528a = emojiDebugUI;
        this.f226529b = str;
        this.f226530c = lVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        int i2 = cVar.f256794b;
        String str = this.f226528a.f266603d;
        Log.m105924i(str, "addEmoji: " + i + ", " + i2);
        if (i == 0 && i2 == 0) {
            EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(this.f226529b);
            int i3 = TO.field_catalog;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
            if (i3 != 81) {
                TO.field_catalog = 81;
                TO.field_reserved3 = C30790w2.m39221h().mo57717d().mo142062nP() + 1;
                C30790w2.m39221h().mo57717d().r50(TO);
                C30790w2.m39221h().mo57717d().c40(0, C26236u.m33719b(this.f226529b));
            }
            this.f226530c.invoke(Boolean.TRUE);
        } else {
            this.f226530c.invoke(Boolean.FALSE);
            C61926c.m72668M(new C13693e(this.f226528a, i, i2));
        }
        return C13598b0.f38549a;
    }
}
