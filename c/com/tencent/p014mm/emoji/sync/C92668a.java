package com.tencent.p014mm.emoji.sync;

import android.content.Intent;
import com.tencent.p014mm.emoji.sync.EmojiSyncLoaderIPC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import o40.C61926c;
import p490dl.C97489o;
import p595ll.C99501m;
import p595ll.C99504p;
import p595ll.C99510s;
import p595ll.C99511t;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import sx3.C64197v;

/* renamed from: com.tencent.mm.emoji.sync.a */
public final class C92668a implements C99511t {

    /* renamed from: q */
    public static final C92674f f266699q = new C92674f((C8480h) null);

    /* renamed from: r */
    public static final C92678k f266700r = new C92671c();

    /* renamed from: s */
    public static final C92678k f266701s = new C92670b();

    /* renamed from: t */
    public static final C13601g<C99511t> f266702t = C36568h.m40985a(C92673e.f266721d);

    /* renamed from: u */
    public static final C13601g<C99511t> f266703u = C36568h.m40985a(C92672d.f266720d);

    /* renamed from: a */
    public final C92677j f266704a;

    /* renamed from: b */
    public final C92676i f266705b;

    /* renamed from: c */
    public String f266706c = "MicroMsg.EmojiSyncLoader";

    /* renamed from: d */
    public int f266707d;

    /* renamed from: e */
    public int f266708e = -1;

    /* renamed from: f */
    public int f266709f;

    /* renamed from: g */
    public int f266710g;

    /* renamed from: h */
    public boolean f266711h;

    /* renamed from: i */
    public boolean f266712i;

    /* renamed from: j */
    public final List<String> f266713j = Collections.synchronizedList(new LinkedList());

    /* renamed from: k */
    public final LinkedList<C92678k> f266714k = new LinkedList<>();

    /* renamed from: l */
    public final C99504p f266715l = new C99504p(3);

    /* renamed from: m */
    public int f266716m;

    /* renamed from: n */
    public final C99501m f266717n = new C99501m(this);

    /* renamed from: o */
    public final Boolean[] f266718o = {Boolean.FALSE};

    /* renamed from: p */
    public final Byte[] f266719p = new Byte[0];

    /* renamed from: com.tencent.mm.emoji.sync.a$g */
    public static final class C28914g implements C92676i {
        /* renamed from: a */
        public int mo56307a() {
            return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_emoji_sync_min_count, 300);
        }

        /* renamed from: b */
        public int mo56308b(int i) {
            return i + ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_emoji_sync_more_count, 120);
        }

        /* renamed from: c */
        public int mo56309c() {
            return 5;
        }
    }

    /* renamed from: com.tencent.mm.emoji.sync.a$a */
    public static final class C92669a implements C92677j {
        /* renamed from: a */
        public List<EmojiInfo> mo126715a() {
            return C97489o.m125592g().mo136761b(false);
        }
    }

    /* renamed from: com.tencent.mm.emoji.sync.a$b */
    public static final class C92670b implements C92678k {
        /* renamed from: a */
        public void mo126716a(int i) {
            EmojiSyncLoaderIPC.EmojiSyncData c = C92668a.f266699q.mo126719c(1);
            Intent intent = new Intent();
            int i2 = EmojiUpdateReceiver.f266698a;
            intent.setAction("com.tencent.mm.Emoji_Update");
            intent.putExtra("type", "TYPE_UPDATE_EMOJI_SYNC");
            intent.putExtra("data", c);
            MMApplicationContext.getContext().sendBroadcast(intent);
        }
    }

    /* renamed from: com.tencent.mm.emoji.sync.a$c */
    public static final class C92671c implements C92678k {
        /* renamed from: a */
        public void mo126716a(int i) {
            EmojiSyncLoaderIPC.EmojiSyncData c = C92668a.f266699q.mo126719c(0);
            Intent intent = new Intent();
            int i2 = EmojiUpdateReceiver.f266698a;
            intent.setAction("com.tencent.mm.Emoji_Update");
            intent.putExtra("type", "TYPE_UPDATE_EMOJI_SYNC");
            intent.putExtra("data", c);
            MMApplicationContext.getContext().sendBroadcast(intent);
        }
    }

    /* renamed from: com.tencent.mm.emoji.sync.a$d */
    public static final class C92672d extends C87413o implements C32224a<C99511t> {

        /* renamed from: d */
        public static final C92672d f266720d = new C92672d();

        public C92672d() {
            super(0);
        }

        public Object invoke() {
            if (!MMApplicationContext.isMainProcess()) {
                return new EmojiSyncLoaderIPC(1);
            }
            C92668a aVar = new C92668a(new C92669a(), new C28914g(), (C8480h) null);
            aVar.f266706c += "_capture";
            aVar.mo126705f(C92668a.f266701s);
            return aVar;
        }
    }

    /* renamed from: com.tencent.mm.emoji.sync.a$e */
    public static final class C92673e extends C87413o implements C32224a<C99511t> {

        /* renamed from: d */
        public static final C92673e f266721d = new C92673e();

        public C92673e() {
            super(0);
        }

        public Object invoke() {
            if (!MMApplicationContext.isMainProcess()) {
                return new EmojiSyncLoaderIPC(0);
            }
            C92668a aVar = new C92668a(new C92675h(), new C28914g(), (C8480h) null);
            aVar.f266706c += "_custom";
            aVar.mo126705f(C92668a.f266700r);
            return aVar;
        }
    }

    /* renamed from: com.tencent.mm.emoji.sync.a$f */
    public static final class C92674f {
        public C92674f(C8480h hVar) {
        }

        /* renamed from: a */
        public final C99511t mo126717a(boolean z) {
            C99511t tVar = (C99511t) ((C36570n) C92668a.f266703u).getValue();
            if (!z) {
                tVar.init();
            }
            return tVar;
        }

        /* renamed from: b */
        public final C99511t mo126718b(boolean z) {
            C99511t tVar = (C99511t) ((C36570n) C92668a.f266702t).getValue();
            if (!z) {
                tVar.init();
            }
            return tVar;
        }

        /* renamed from: c */
        public final EmojiSyncLoaderIPC.EmojiSyncData mo126719c(int i) {
            C92668a aVar;
            EmojiSyncLoaderIPC.EmojiSyncData emojiSyncData = new EmojiSyncLoaderIPC.EmojiSyncData();
            emojiSyncData.f266687d = i;
            if (i == 1) {
                C99511t a = mo126717a(false);
                C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.emoji.sync.EmojiSyncLoader");
                aVar = (C92668a) a;
            } else {
                C99511t b = mo126718b(false);
                C87412m.m108592e(b, "null cannot be cast to non-null type com.tencent.mm.emoji.sync.EmojiSyncLoader");
                aVar = (C92668a) b;
            }
            emojiSyncData.f266688e = aVar.f266707d;
            emojiSyncData.f266690g = aVar.f266709f;
            emojiSyncData.f266689f = aVar.f266708e;
            emojiSyncData.f266691h = aVar.f266712i;
            return emojiSyncData;
        }
    }

    /* renamed from: com.tencent.mm.emoji.sync.a$h */
    public static final class C92675h implements C92677j {
        /* renamed from: a */
        public List<EmojiInfo> mo126715a() {
            return C97489o.m125592g().mo136760a();
        }
    }

    /* renamed from: com.tencent.mm.emoji.sync.a$i */
    public interface C92676i {
        /* renamed from: a */
        int mo56307a();

        /* renamed from: b */
        int mo56308b(int i);

        /* renamed from: c */
        int mo56309c();
    }

    /* renamed from: com.tencent.mm.emoji.sync.a$j */
    public interface C92677j {
        /* renamed from: a */
        List<EmojiInfo> mo126715a();
    }

    /* renamed from: com.tencent.mm.emoji.sync.a$k */
    public interface C92678k {
        /* renamed from: a */
        void mo126716a(int i);
    }

    /* renamed from: com.tencent.mm.emoji.sync.a$l */
    public static final class C92679l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92668a f266722d;

        /* renamed from: e */
        public final /* synthetic */ boolean f266723e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92679l(C92668a aVar, boolean z) {
            super(0);
            this.f266722d = aVar;
            this.f266723e = z;
        }

        public Object invoke() {
            C92668a aVar = this.f266722d;
            Byte[] bArr = aVar.f266719p;
            boolean z = this.f266723e;
            synchronized (bArr) {
                List<EmojiInfo> a = aVar.f266704a.mo126715a();
                aVar.f266710g = a.size();
                if (!aVar.f266711h) {
                    Iterator<EmojiInfo> it = a.iterator();
                    boolean z2 = false;
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        } else if (!it.next().mo135616m2()) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i < 0 || i >= a.size()) {
                        int i2 = aVar.f266710g;
                        aVar.f266709f = i2;
                        aVar.f266707d = i2;
                        aVar.f266708e = i2;
                        aVar.f266712i = true;
                        C61926c.m72668M(new C92682b(aVar));
                    } else {
                        aVar.f266707d = i;
                        if (i < aVar.f266705b.mo56307a()) {
                            aVar.f266709f = aVar.f266705b.mo56307a();
                        } else {
                            aVar.f266709f = aVar.f266707d;
                        }
                        aVar.f266708e = aVar.f266707d;
                        aVar.f266712i = aVar.f266709f == aVar.f266710g;
                    }
                    String str = aVar.f266706c;
                    Log.m105924i(str, "checkSyncEmoji: " + aVar.f266707d + ", " + aVar.f266709f + ", " + aVar.f266712i);
                    if (z) {
                        synchronized (aVar.f266719p) {
                            Log.m105924i(aVar.f266706c, "start: ");
                            if (aVar.f266712i) {
                                aVar.f266711h = false;
                            } else if (!aVar.f266711h) {
                                z2 = true;
                            }
                            if (z2) {
                                aVar.mo126714g();
                            }
                            C13598b0 b0Var = C13598b0.f38549a;
                        }
                    }
                    C13598b0 b0Var2 = C13598b0.f38549a;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.sync.a$m */
    public static final class C92680m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92668a f266724d;

        /* renamed from: e */
        public final /* synthetic */ C92678k f266725e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92680m(C92668a aVar, C92678k kVar) {
            super(0);
            this.f266724d = aVar;
            this.f266725e = kVar;
        }

        public Object invoke() {
            if (!this.f266724d.f266714k.contains(this.f266725e)) {
                this.f266724d.f266714k.add(this.f266725e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.sync.a$n */
    public static final class C92681n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92668a f266726d;

        /* renamed from: e */
        public final /* synthetic */ C92678k f266727e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92681n(C92668a aVar, C92678k kVar) {
            super(0);
            this.f266726d = aVar;
            this.f266727e = kVar;
        }

        public Object invoke() {
            this.f266726d.f266714k.remove(this.f266727e);
            return C13598b0.f38549a;
        }
    }

    public C92668a(C92677j jVar, C92676i iVar, C8480h hVar) {
        this.f266704a = jVar;
        this.f266705b = iVar;
    }

    /* renamed from: a */
    public void mo126699a() {
        synchronized (this.f266719p) {
            String str = this.f266706c;
            Log.m105924i(str, "loadMore: " + this.f266711h + ", " + this.f266712i);
            boolean z = false;
            if (this.f266712i) {
                this.f266711h = false;
            } else if (!this.f266711h) {
                z = true;
            }
            if (z) {
                this.f266709f = this.f266705b.mo56308b(this.f266709f);
                mo126714g();
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public int mo126700b() {
        if (this.f266712i) {
            return Integer.MAX_VALUE;
        }
        return this.f266709f;
    }

    /* renamed from: c */
    public int mo126701c() {
        if (this.f266712i) {
            return Integer.MAX_VALUE;
        }
        return this.f266708e;
    }

    /* renamed from: d */
    public void mo126702d(boolean z) {
        if (MMApplicationContext.isMainProcess()) {
            if (!C86709a0.m107522a()) {
                Log.m105929w(this.f266706c, "checkSyncEmoji(%s): account was not ready, ignore rest logic.", Boolean.valueOf(z));
                return;
            }
            C61926c.m72657B("EmojiSyncLoader_checkSyncEmoji", true, new C92679l(this, z));
        }
    }

    public void destroy() {
        if (this.f266718o[0].booleanValue()) {
            synchronized (this.f266718o) {
                if (this.f266718o[0].booleanValue()) {
                    synchronized (this.f266719p) {
                        try {
                            C99504p pVar = this.f266715l;
                            pVar.f291732a.clear();
                            for (Map.Entry next : pVar.f291733b.entrySet()) {
                            }
                            this.f266715l.f291734c = null;
                            C13598b0 b0Var = C13598b0.f38549a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    this.f266718o[0] = Boolean.FALSE;
                }
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: e */
    public void mo126704e(C92678k kVar) {
        C87412m.m108594g(kVar, "callback");
        C61926c.m72668M(new C92681n(this, kVar));
    }

    /* renamed from: f */
    public void mo126705f(C92678k kVar) {
        C87412m.m108594g(kVar, "callback");
        C61926c.m72668M(new C92680m(this, kVar));
    }

    /* renamed from: g */
    public final void mo126714g() {
        List<EmojiInfo> a = this.f266704a.mo126715a();
        this.f266710g = a.size();
        int min = Math.min(this.f266709f, a.size());
        this.f266709f = min;
        if (this.f266707d > min) {
            this.f266707d = min;
        }
        int i = this.f266707d;
        if (min > i) {
            this.f266711h = true;
        }
        if (!this.f266711h && min == this.f266710g) {
            this.f266712i = true;
        }
        this.f266708e = i;
        String str = this.f266706c;
        Log.m105924i(str, "startInternal: " + this.f266707d + ", " + this.f266709f + ", " + this.f266710g + ", " + this.f266708e + ", " + this.f266711h + ", " + this.f266712i);
        C99504p pVar = this.f266715l;
        List<EmojiInfo> subList = a.subList(this.f266707d, this.f266709f);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(subList, 10));
        int i2 = 0;
        for (T next : subList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                EmojiInfo emojiInfo = (EmojiInfo) next;
                this.f266713j.add(emojiInfo.getMd5());
                arrayList.add(new C99504p.C99505a(emojiInfo, i2 + this.f266707d));
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        pVar.getClass();
        C61926c.m72668M(new C99510s(pVar, arrayList));
    }

    public boolean hasMore() {
        return !this.f266712i;
    }

    public void init() {
        if (!this.f266718o[0].booleanValue()) {
            synchronized (this.f266718o) {
                if (!this.f266718o[0].booleanValue()) {
                    synchronized (this.f266719p) {
                        this.f266715l.f291734c = this.f266717n;
                        this.f266709f = this.f266705b.mo56307a();
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                    mo126702d(false);
                    this.f266718o[0] = Boolean.TRUE;
                }
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        }
    }
}
