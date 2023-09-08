package er1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import dp1.C58363h;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60179k4;
import ke3.C88144b;
import o40.C61926c;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import zc1.C66785b;

/* renamed from: er1.e */
public final class C58710e implements C60179k4.C60180a {

    /* renamed from: a */
    public final /* synthetic */ Context f168060a;

    /* renamed from: b */
    public final /* synthetic */ C49712hj1 f168061b;

    /* renamed from: er1.e$a */
    public static final class C58711a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f168062d;

        /* renamed from: e */
        public final /* synthetic */ int f168063e;

        /* renamed from: f */
        public final /* synthetic */ int f168064f;

        /* renamed from: g */
        public final /* synthetic */ String f168065g;

        /* renamed from: h */
        public final /* synthetic */ String f168066h;

        /* renamed from: i */
        public final /* synthetic */ C49712hj1 f168067i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58711a(Context context, int i, int i2, String str, String str2, C49712hj1 hj12) {
            super(0);
            this.f168062d = context;
            this.f168063e = i;
            this.f168064f = i2;
            this.f168065g = str;
            this.f168066h = str2;
            this.f168067i = hj12;
        }

        public Object invoke() {
            if (!C58784w3.f168295a.mo83954p(this.f168062d, this.f168063e, this.f168064f, this.f168065g)) {
                String str = this.f168066h;
                C87412m.m108593f(str, "sessionId");
                if (str.length() > 0) {
                    C58363h.C58364b.m67608a(C58363h.f167143g, this.f168067i, 1, 1, (Long) null, 8, (Object) null);
                    Intent intent = new Intent();
                    intent.putExtra("Chat_Self", C66785b.f191882e.mo90662O5());
                    intent.putExtra("Chat_User", this.f168066h);
                    intent.putExtra("finish_direct", true);
                    C13442s8.f38060Q0.mo12871c(this.f168062d, intent);
                    C88144b.m109801s(this.f168062d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C58710e(Context context, C49712hj1 hj12) {
        this.f168060a = context;
        this.f168061b = hj12;
    }

    /* renamed from: a */
    public final void mo83611a(String str, int i, int i2, String str2) {
        C61926c.m72668M(new C58711a(this.f168060a, i, i2, str2, str, this.f168061b));
    }
}
