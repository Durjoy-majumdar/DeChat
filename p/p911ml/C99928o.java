package p911ml;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C87412m;
import u60.C65220d;
import u60.C65222f;
import u60.C65231j;
import u60.C65234n;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;

/* renamed from: ml.o */
public final class C99928o {

    /* renamed from: a */
    public static final C99928o f292790a = new C99928o();

    /* renamed from: b */
    public static final C65222f<C99911d> f292791b;

    /* renamed from: ml.o$a */
    public static final class C99929a implements C65231j<C99911d> {
        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C99911d dVar2 = (C99911d) dVar;
            C87412m.m108594g(dVar2, "task");
            C87412m.m108594g(nVar, "status");
            Log.m105924i("MicroMsg.EmojiUploadManager", "onLoaderFin: " + dVar2.mo11854d() + ", " + nVar);
        }
    }

    static {
        C65222f<C99911d> fVar = new C65222f<>(new C102156f(new C102152a(20, Integer.MAX_VALUE), new C102157g(1, 5), 1, "EmojiUpload"));
        f292791b = fVar;
        fVar.mo89353f(new C99929a());
    }

    /* renamed from: a */
    public final void mo139268a(EmojiInfo emojiInfo) {
        C87412m.m108594g(emojiInfo, "emojiInfo");
        Log.m105924i("MicroMsg.EmojiUploadManager", "addUploadTask: " + emojiInfo.getMd5());
        f292791b.mo89348b(new C99911d(emojiInfo));
    }
}
