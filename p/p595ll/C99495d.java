package p595ll;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import java.util.List;
import ob0.C89132b;
import p812el.C97670a;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C51365ta;

/* renamed from: ll.d */
public final class C99495d {

    /* renamed from: a */
    public final List<String> f291706a;

    /* renamed from: b */
    public final C89349b f291707b;

    /* renamed from: c */
    public final C32227p<Boolean, Integer, C13598b0> f291708c;

    /* renamed from: d */
    public final String f291709d = "MicroMsg.EmojiMd5ToInfo";

    /* renamed from: e */
    public int f291710e;

    /* renamed from: f */
    public int f291711f;

    /* renamed from: ll.d$a */
    public static final class C99496a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C99495d f291712a;

        public C99496a(C99495d dVar) {
            this.f291712a = dVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            C51365ta taVar = (C51365ta) cVar.f256796d;
            String str = this.f291712a.f291709d;
            Log.m105924i(str, "requestNext: " + i + ", " + i2);
            if (i == 0 && i2 == 0) {
                C99495d dVar = this.f291712a;
                C87412m.m108593f(taVar, "rsp");
                dVar.getClass();
                if (taVar.f142064g != null) {
                    C30790w2.m39221h().mo57717d().P50(taVar.f142064g);
                }
                if (dVar.f291711f < dVar.f291706a.size()) {
                    dVar.mo138909a();
                } else {
                    C32227p<Boolean, Integer, C13598b0> pVar = dVar.f291708c;
                    if (pVar != null) {
                        pVar.invoke(Boolean.TRUE, Integer.valueOf(dVar.f291711f));
                    }
                }
                return C13598b0.f38549a;
            }
            C99495d dVar2 = this.f291712a;
            C32227p<Boolean, Integer, C13598b0> pVar2 = dVar2.f291708c;
            if (pVar2 == null) {
                return null;
            }
            pVar2.invoke(Boolean.FALSE, Integer.valueOf(dVar2.f291710e));
            return C13598b0.f38549a;
        }
    }

    public C99495d(List<String> list, C89349b bVar, C32227p<? super Boolean, ? super Integer, C13598b0> pVar) {
        C87412m.m108594g(list, "md5List");
        this.f291706a = list;
        this.f291707b = bVar;
        this.f291708c = pVar;
        Log.m105924i("MicroMsg.EmojiMd5ToInfo", "request size: " + list.size());
        if (!list.isEmpty()) {
            mo138909a();
        } else if (pVar != null) {
            pVar.invoke(Boolean.TRUE, 0);
        }
    }

    /* renamed from: a */
    public final void mo138909a() {
        int i = this.f291711f;
        this.f291710e = i;
        int i2 = i + 100;
        this.f291711f = i2;
        if (i2 > this.f291706a.size()) {
            this.f291711f = this.f291706a.size();
        }
        new C97670a(1, 0, this.f291706a.subList(this.f291710e, this.f291711f), this.f291707b, (C89349b) null, 16, (C8480h) null).mo9225i().mo123420E(new C99496a(this));
    }
}
