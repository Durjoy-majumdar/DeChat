package p207nl;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p207nl.C100130h;
import rx3.C13598b0;

/* renamed from: nl.a */
public final class C100128a extends C100130h {

    /* renamed from: nl.a$a */
    public static final class C100129a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C100128a f293299d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100129a(C100128a aVar) {
            super(0);
            this.f293299d = aVar;
        }

        public Object invoke() {
            this.f293299d.getClass();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100128a(Context context, EmojiInfo emojiInfo, String str, C100130h.C100131a aVar) {
        super(context, emojiInfo, str, aVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(emojiInfo, "emojiInfo");
        C87412m.m108594g(aVar, "callback");
    }

    /* renamed from: a */
    public void mo139425a(int i, String str) {
        C100129a aVar = new C100129a(this);
        boolean z = false;
        this.f293302c.mo57745a(false);
        if (i == -100000) {
            String string = this.f293300a.getString(C0966R.string.c4f);
            C87412m.m108593f(string, "context.getString(R.stri…moji_add_failed_activity)");
            mo139426b(string, aVar);
        } else if (i == 4) {
            String string2 = this.f293300a.getString(C0966R.string.c7p);
            C87412m.m108593f(string2, "context.getString(R.stri…emoji_send_need_exchange)");
            mo139426b(string2, aVar);
        } else if (i == 8) {
            String string3 = this.f293300a.getString(C0966R.string.c4h);
            C87412m.m108593f(string3, "context.getString(R.stri…emoji_add_failed_no_area)");
            mo139426b(string3, aVar);
        } else if (i != 9) {
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (z) {
                String string4 = this.f293300a.getString(C0966R.string.c4e);
                C87412m.m108593f(string4, "context.getString(R.string.emoji_add_failed)");
                mo139426b(string4, aVar);
                return;
            }
            mo139426b(str, aVar);
        } else {
            String string5 = this.f293300a.getString(C0966R.string.c4g);
            C87412m.m108593f(string5, "context.getString(R.stri…emoji_add_failed_expired)");
            mo139426b(string5, aVar);
        }
    }
}
