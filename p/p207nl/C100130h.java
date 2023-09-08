package p207nl;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32224a;
import gy3.C87412m;
import nj3.C76879j;
import p490dl.C97489o;
import p812el.C45677b;
import qo3.C77398g;
import rx3.C13598b0;
import u61.C101964h;

/* renamed from: nl.h */
public abstract class C100130h {

    /* renamed from: a */
    public final Context f293300a;

    /* renamed from: b */
    public EmojiInfo f293301b;

    /* renamed from: c */
    public final C100131a f293302c;

    /* renamed from: d */
    public final String f293303d = "MicroMsg.EmojiExchangeCheck";

    /* renamed from: nl.h$a */
    public interface C100131a {
        /* renamed from: a */
        void mo57745a(boolean z);
    }

    /* renamed from: nl.h$b */
    public static final class C100132b implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f293304d;

        public C100132b(C32224a<C13598b0> aVar) {
            this.f293304d = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f293304d.invoke();
        }
    }

    public C100130h(Context context, EmojiInfo emojiInfo, String str, C100131a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(emojiInfo, "emojiInfo");
        C87412m.m108594g(aVar, "callback");
        this.f293300a = context;
        this.f293301b = emojiInfo;
        this.f293302c = aVar;
        if (!C101964h.m134227i(emojiInfo) && !Util.isEqual(this.f293301b.getGroupId(), "capture") && !Util.isNullOrNil(this.f293301b.field_groupId)) {
            String str2 = this.f293301b.field_groupId;
            C87412m.m108593f(str2, "emojiInfo.field_groupId");
            if (!C97489o.m125592g().mo136766h().f143906d.contains(str2) && !this.f293301b.mo62678k()) {
                String str3 = this.f293301b.field_groupId;
                C87412m.m108593f(str3, "emojiInfo.field_groupId");
                new C45677b(str3, 1, str).mo9225i().mo123420E(new C100133i(this));
                Log.m105924i("MicroMsg.EmojiExchangeCheck", "do exchange " + this.f293301b.field_md5 + ' ' + this.f293301b.field_groupId + ", " + str);
                return;
            }
        }
        EmojiInfo emojiInfo2 = this.f293301b;
        Log.m105925i("MicroMsg.EmojiExchangeCheck", "no need exchange %s %s", emojiInfo2.field_md5, emojiInfo2.field_groupId);
        aVar.mo57745a(true);
    }

    /* renamed from: a */
    public abstract void mo139425a(int i, String str);

    /* renamed from: b */
    public final void mo139426b(String str, C32224a<C13598b0> aVar) {
        C87412m.m108594g(str, "msg");
        C87412m.m108594g(aVar, "dismissCallback");
        C77398g F = C76879j.m92712F(this.f293300a, str, "", true);
        if (F != null) {
            F.setOnDismissListener(new C100132b(aVar));
        }
    }
}
