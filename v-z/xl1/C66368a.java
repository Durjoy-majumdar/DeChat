package xl1;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import he1.C59840c;
import ht1.C60200t1;
import ie1.C46237b;
import java.util.ArrayList;
import java.util.List;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import te3.C48877bm0;
import te3.C50409mj;

/* renamed from: xl1.a */
public final class C66368a implements C11385n {

    /* renamed from: d */
    public BaseFinderFeed f191068d;

    /* renamed from: e */
    public C89349b f191069e;

    /* renamed from: f */
    public C66369a f191070f;

    /* renamed from: g */
    public long f191071g;

    /* renamed from: h */
    public long f191072h;

    /* renamed from: i */
    public boolean f191073i;

    /* renamed from: j */
    public boolean f191074j;

    /* renamed from: n */
    public Context f191075n;

    /* renamed from: o */
    public byte[] f191076o = new byte[1024];

    /* renamed from: p */
    public final C13601g f191077p = C36568h.m40985a(C66370b.f191078d);

    /* renamed from: xl1.a$a */
    public interface C66369a {
        /* renamed from: a */
        void mo84823a(List<C59840c> list);
    }

    /* renamed from: xl1.a$b */
    public static final class C66370b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C66370b f191078d = new C66370b();

        public C66370b() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83778Y5());
        }
    }

    /* renamed from: xl1.a$c */
    public static final class C66371c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C117747y f191079d;

        /* renamed from: e */
        public final /* synthetic */ int f191080e;

        /* renamed from: f */
        public final /* synthetic */ int f191081f;

        /* renamed from: g */
        public final /* synthetic */ C66368a f191082g;

        /* renamed from: h */
        public final /* synthetic */ String f191083h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66371c(C117747y yVar, int i, int i2, C66368a aVar, String str) {
            super(0);
            this.f191079d = yVar;
            this.f191080e = i;
            this.f191081f = i2;
            this.f191082g = aVar;
            this.f191083h = str;
        }

        public Object invoke() {
            C66369a aVar;
            C117747y yVar = this.f191079d;
            if (yVar instanceof C46237b) {
                int i = this.f191080e;
                if (i == 0 && this.f191081f == 0) {
                    if (((C46237b) yVar).f124639g == this.f191082g.mo90470c().mo3513o().getId()) {
                        if (this.f191082g.f191071g == ((C46237b) this.f191079d).mo71651n1() && this.f191082g.f191072h == ((C46237b) this.f191079d).mo71650m1()) {
                            Log.m105924i("FinderBulletLoader", "onSceneEnd: hasMore = false, id=" + C61926c.m72691p(this.f191082g.mo90470c().mo3513o().getId()) + ", pullType=" + ((C46237b) this.f191079d).f124641i + ", minBulletTime = " + this.f191082g.f191071g + ", maxBulletTime = " + this.f191082g.f191072h);
                            this.f191082g.f191073i = false;
                        } else {
                            long j = (long) 1000;
                            C66368a.m78283a(this.f191082g, (int) (((C46237b) this.f191079d).mo71651n1() / j), (int) (((C46237b) this.f191079d).mo71650m1() / j));
                            this.f191082g.f191071g = ((C46237b) this.f191079d).mo71651n1();
                            this.f191082g.f191072h = ((C46237b) this.f191079d).mo71650m1();
                            C66368a aVar2 = this.f191082g;
                            C47465a aVar3 = ((C46237b) this.f191079d).f124642j.f127056b.f127083a;
                            C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetBulletCommentResponse");
                            aVar2.f191069e = ((C48877bm0) aVar3).f131196e;
                            List<C50409mj> l1 = ((C46237b) this.f191079d).mo71649l1();
                            ArrayList arrayList = new ArrayList(C36907w.m41090l(l1, 10));
                            for (C50409mj cVar : l1) {
                                arrayList.add(new C59840c(cVar));
                            }
                            if ((!arrayList.isEmpty()) && (aVar = this.f191082g.f191070f) != null) {
                                aVar.mo84823a(arrayList);
                            }
                            this.f191082g.f191073i = true;
                            Log.m105924i("FinderBulletLoader", "onSceneEnd: size = " + arrayList.size() + ", hasMore = " + this.f191082g.f191073i + ", id=" + C61926c.m72691p(this.f191082g.mo90470c().mo3513o().getId()) + ", pullType=" + ((C46237b) this.f191079d).f124641i + ", minBulletTime = " + this.f191082g.f191071g + ", maxBulletTime = " + this.f191082g.f191072h);
                        }
                    }
                    return C13598b0.f38549a;
                }
                if (i == 4 && ((C46237b) yVar).mo71651n1() > 0 && ((C46237b) this.f191079d).mo71651n1() < ((C46237b) this.f191079d).mo71650m1()) {
                    long n1 = ((C46237b) this.f191079d).mo71651n1();
                    C66368a aVar4 = this.f191082g;
                    if (n1 > aVar4.f191071g) {
                        long j2 = (long) 1000;
                        C66368a.m78283a(aVar4, (int) (((C46237b) this.f191079d).mo71651n1() / j2), (int) (((C46237b) this.f191079d).mo71650m1() / j2));
                        this.f191082g.f191071g = ((C46237b) this.f191079d).mo71651n1();
                        this.f191082g.f191072h = ((C46237b) this.f191079d).mo71650m1();
                        this.f191082g.f191073i = true;
                        Log.m105920e("FinderBulletLoader", "NetSceneFinderGetBullet: errType=" + this.f191080e + ", errCode=" + this.f191081f + ", errMsg=" + this.f191083h + ", hasMore=" + this.f191082g.f191073i + ", minBulletTime=" + ((C46237b) this.f191079d).mo71651n1() + ", maxBulletTime=" + ((C46237b) this.f191079d).mo71650m1());
                    }
                }
                this.f191082g.f191073i = false;
                Log.m105920e("FinderBulletLoader", "NetSceneFinderGetBullet: errType=" + this.f191080e + ", errCode=" + this.f191081f + ", errMsg=" + this.f191083h + ", hasMore=" + this.f191082g.f191073i + ", minBulletTime=" + ((C46237b) this.f191079d).mo71651n1() + ", maxBulletTime=" + ((C46237b) this.f191079d).mo71650m1());
            }
            this.f191082g.f191074j = false;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m78283a(C66368a aVar, int i, int i2) {
        if (i >= i2) {
            aVar.getClass();
            return;
        }
        aVar.mo90469b(i2, "dyeArray");
        byte[] bArr = aVar.f191076o;
        int length = i2 >= bArr.length ? bArr.length - 1 : i2;
        Log.m105924i("FinderBulletLoader", "dyeArray: startIndex=" + i + ", realEndIndex=" + length + ", endIndex=" + i2 + ", arraySize=" + aVar.f191076o.length);
        if (i <= length) {
            while (true) {
                aVar.f191076o[i] = 1;
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo90469b(int i, String str) {
        if (i + 1 > this.f191076o.length) {
            Log.m105924i("FinderBulletLoader", "checkExpandArray: source=" + str + ", totalTime=" + i + ", current array size = " + this.f191076o.length + ", maxVideoDuration=" + ((Number) ((C36570n) this.f191077p).getValue()).intValue());
            if (i >= ((Number) ((C36570n) this.f191077p).getValue()).intValue()) {
                i = ((Number) ((C36570n) this.f191077p).getValue()).intValue() - 1;
            }
            int length = this.f191076o.length;
            do {
                length += 1024;
            } while (length < i + 1);
            Log.m105924i("FinderBulletLoader", "checkExpandArray: source=" + str + ", totalTimeSec=" + i + ", newArrayLen = " + length);
            byte[] bArr = new byte[length];
            byte[] bArr2 = this.f191076o;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.f191076o = bArr;
        }
    }

    /* renamed from: c */
    public final BaseFinderFeed mo90470c() {
        BaseFinderFeed baseFinderFeed = this.f191068d;
        if (baseFinderFeed != null) {
            return baseFinderFeed;
        }
        C87412m.m108603p("feed");
        throw null;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C61926c.m72668M(new C66371c(yVar, i, i2, this, str));
    }
}
