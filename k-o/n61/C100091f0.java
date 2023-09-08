package n61;

import androidx.lifecycle.C39623j;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model.EmojiStoreExchangeTask;
import com.tencent.wxmm.v2helper;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j61.C46439j;
import o40.C61926c;
import p61.C100671r;
import rx3.C13598b0;

/* renamed from: n61.f0 */
public final class C100091f0 implements C100671r.C100673b {

    /* renamed from: d */
    public final C39623j f293219d;

    /* renamed from: e */
    public final C100671r f293220e;

    /* renamed from: n61.f0$a */
    public static final class C100092a implements EmojiStoreExchangeTask.C93271a {

        /* renamed from: a */
        public final /* synthetic */ C100091f0 f293221a;

        /* renamed from: b */
        public final /* synthetic */ String f293222b;

        /* renamed from: n61.f0$a$a */
        public static final class C100093a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C100091f0 f293223d;

            /* renamed from: e */
            public final /* synthetic */ String f293224e;

            /* renamed from: f */
            public final /* synthetic */ int f293225f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C100093a(C100091f0 f0Var, String str, int i) {
                super(0);
                this.f293223d = f0Var;
                this.f293224e = str;
                this.f293225f = i;
            }

            public Object invoke() {
                C100671r rVar = this.f293223d.f293220e;
                if (rVar != null) {
                    String str = this.f293224e;
                    rVar.f294946d.mo140089g(this.f293225f, str);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: n61.f0$a$b */
        public static final class C100094b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C100091f0 f293226d;

            /* renamed from: e */
            public final /* synthetic */ int f293227e;

            /* renamed from: f */
            public final /* synthetic */ String f293228f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C100094b(C100091f0 f0Var, int i, String str) {
                super(0);
                this.f293226d = f0Var;
                this.f293227e = i;
                this.f293228f = str;
            }

            public Object invoke() {
                C100671r rVar = this.f293226d.f293220e;
                if (rVar != null) {
                    rVar.f294946d.mo140085a(this.f293227e, this.f293228f);
                }
                return C13598b0.f38549a;
            }
        }

        public C100092a(C100091f0 f0Var, String str) {
            this.f293221a = f0Var;
            this.f293222b = str;
        }

        /* renamed from: a */
        public void mo127924a(int i) {
            C61926c.m72668M(new C100094b(this.f293221a, i, this.f293222b));
        }

        /* renamed from: b */
        public void mo127925b(int i) {
            C61926c.m72668M(new C100093a(this.f293221a, this.f293222b, i));
        }

        /* renamed from: c */
        public void mo127926c(boolean z) {
        }
    }

    public C100091f0(C39623j jVar, C100671r rVar) {
        C87412m.m108594g(jVar, "lifecycle");
        this.f293219d = jVar;
        this.f293220e = rVar;
    }

    /* renamed from: c0 */
    public void mo127894c0(String str, String str2, String str3, String str4, String str5) {
        C87412m.m108594g(str, "productId");
        EmojiStoreExchangeTask emojiStoreExchangeTask = new EmojiStoreExchangeTask(str, str2, str3, str4, str5, new C100092a(this, str));
        C39623j jVar = this.f293219d;
        C87412m.m108594g(jVar, "lifecycle");
        jVar.addObserver(emojiStoreExchangeTask);
        C86709a0.m107529k().f251779b.mo123455a(v2helper.EMethodSetNgStrength, emojiStoreExchangeTask);
        emojiStoreExchangeTask.f269088o.alive();
        emojiStoreExchangeTask.f269087n = new C46439j(emojiStoreExchangeTask.f269080d, emojiStoreExchangeTask.f269081e, emojiStoreExchangeTask.f269082f, emojiStoreExchangeTask.f269083g, emojiStoreExchangeTask.f269084h);
        C86709a0.m107529k().f251779b.mo123460f(emojiStoreExchangeTask.f269087n);
    }

    /* renamed from: y */
    public void mo127895y() {
    }
}
