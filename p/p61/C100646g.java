package p61;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import j61.C46443q;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13598b0;
import sf0.C48374j0;
import te3.C101824o80;
import te3.C51468tz1;

/* renamed from: p61.g */
public final class C100646g {

    /* renamed from: a */
    public final String f294844a;

    /* renamed from: b */
    public final C32227p<List<? extends C101824o80>, Boolean, C13598b0> f294845b;

    /* renamed from: c */
    public final String f294846c = "MicroMsg.EmojiStoreIPListPageSource";

    /* renamed from: d */
    public byte[] f294847d;

    /* renamed from: e */
    public boolean f294848e;

    /* renamed from: f */
    public boolean f294849f;

    /* renamed from: g */
    public boolean f294850g;

    /* renamed from: h */
    public final C11385n f294851h;

    /* renamed from: p61.g$a */
    public static final class C100647a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C100646g f294852d;

        public C100647a(C100646g gVar) {
            this.f294852d = gVar;
        }

        public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.emoji.net.NetSceneGetEmotionList");
            C51468tz1 l1 = ((C46443q) yVar).mo71839l1();
            String str2 = this.f294852d.f294846c;
            Log.m105924i(str2, "load: " + i + ", " + i2);
            if (i == 0 || i == 4) {
                if (i2 == 0) {
                    C100646g gVar = this.f294852d;
                    gVar.f294847d = null;
                    gVar.f294849f = true;
                } else {
                    this.f294852d.f294847d = C48374j0.m53715d(l1.f142489d);
                }
            }
            C100646g gVar2 = this.f294852d;
            gVar2.f294848e = false;
            gVar2.f294845b.invoke(l1.f142491f, Boolean.FALSE);
            C100646g gVar3 = this.f294852d;
            if (gVar3.f294850g) {
                gVar3.f294850g = false;
                gVar3.mo140090a();
            }
        }
    }

    public C100646g(String str, C32227p<? super List<? extends C101824o80>, ? super Boolean, C13598b0> pVar) {
        C87412m.m108594g(str, "ipSetKey");
        C87412m.m108594g(pVar, "dataCallback");
        this.f294844a = str;
        this.f294845b = pVar;
        C100647a aVar = new C100647a(this);
        this.f294851h = aVar;
        C86709a0.m107529k().f251779b.mo123455a(411, aVar);
    }

    /* renamed from: a */
    public final void mo140090a() {
        String str = this.f294846c;
        Log.m105924i(str, "load: " + this.f294849f + ", " + this.f294848e);
        if (!this.f294849f) {
            if (this.f294848e) {
                this.f294850g = true;
                return;
            }
            this.f294848e = true;
            C46443q qVar = new C46443q(14, this.f294847d, 0, false);
            qVar.f125107j = this.f294844a;
            C86709a0.m107529k().f251779b.mo123460f(qVar);
        }
    }
}
