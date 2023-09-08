package c71;

import a71.C91977i;
import android.content.Intent;
import com.tencent.p014mm.plugin.emojicapture.proxy.EmojiCaptureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.service.C116024c;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import o40.C61926c;
import org.xwalk.core.XWalkEnvironment;
import p207nl.C89008j;
import rh3.C101383g;
import rx3.C13598b0;
import u60.C65220d;
import u60.C65222f;
import u60.C65231j;
import u60.C65234n;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;

/* renamed from: c71.g */
public final class C92367g {

    /* renamed from: a */
    public static final C92367g f264320a = new C92367g();

    /* renamed from: b */
    public static final LinkedList<C92366f> f264321b = new LinkedList<>();

    /* renamed from: c */
    public static final C65222f<C92370i> f264322c;

    /* renamed from: d */
    public static C32224a<C13598b0> f264323d = C92369b.f264325d;

    /* renamed from: e */
    public static final List<C92366f> f264324e = Collections.synchronizedList(new LinkedList());

    /* renamed from: c71.g$a */
    public static final class C92368a implements C65231j<C92370i> {
        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C92366f fVar;
            C92370i iVar = (C92370i) dVar;
            C87412m.m108594g(iVar, "task");
            C87412m.m108594g(nVar, "status");
            List<C92366f> list = C92367g.f264324e;
            C87412m.m108593f(list, "mixTasks");
            synchronized (list) {
                fVar = null;
                for (C92366f fVar2 : list) {
                    if (fVar2.f264311b == iVar.f264328h) {
                        fVar = fVar2;
                    }
                }
            }
            if (fVar != null) {
                C92367g.f264324e.remove(fVar);
            }
            List<C92366f> list2 = C92367g.f264324e;
            if (list2.isEmpty()) {
                C61926c.m72666K(1000, C92367g.f264323d);
            }
            Log.m105924i("MicroMsg.EmojiMixManager", "onLoaderFin: " + nVar + ", " + list2.size());
        }
    }

    /* renamed from: c71.g$b */
    public static final class C92369b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C92369b f264325d = new C92369b();

        public C92369b() {
            super(0);
        }

        public Object invoke() {
            C116024c.m163165e(new Intent(MMApplicationContext.getContext(), EmojiCaptureService.class), XWalkEnvironment.MODULE_TOOLS, true, C88144b.m109786e(XWalkEnvironment.MODULE_TOOLS));
            return C13598b0.f38549a;
        }
    }

    static {
        C65222f<C92370i> fVar = new C65222f<>(new C102156f(new C102152a(20, Integer.MAX_VALUE), new C102157g(1, 5), 1, "EmojiMix"));
        f264322c = fVar;
        fVar.mo89353f(new C92368a());
    }

    /* renamed from: a */
    public final C92366f mo126338a(int i, long j, String str, C92360a aVar, int i2, boolean z, C101383g gVar, EmojiInfo emojiInfo) {
        C87412m.m108594g(str, "videoPath");
        C87412m.m108594g(aVar, "retriever");
        C87412m.m108594g(emojiInfo, "emojiInfo");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        C89008j jVar = C89008j.f256613a;
        sb4.append(C89008j.f256615c);
        sb4.append("capture_emoji/");
        String sb5 = sb4.toString();
        C86013q1.m106461v(sb5);
        sb.append(sb5);
        sb.append("temp_gif");
        sb.append(Util.nowMilliSecond());
        C92366f fVar = new C92366f(i, j, str, sb.toString(), aVar, i2, z, gVar, !C91977i.f263322a, emojiInfo);
        f264324e.add(fVar);
        f264322c.mo89348b(new C92370i(fVar));
        f264321b.add(fVar);
        MMHandlerThread.removeRunnable(new C28510h(f264323d));
        C116024c.m163164d(new Intent(MMApplicationContext.getContext(), EmojiCaptureService.class), XWalkEnvironment.MODULE_TOOLS, true, C88144b.m109786e(XWalkEnvironment.MODULE_TOOLS));
        return fVar;
    }
}
