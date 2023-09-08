package vq1;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import je1.C46536t0;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49712hj1;
import u60.C65234n;
import up1.C65426w0;
import vq1.C65866w;
import vq1.C65869y;

/* renamed from: vq1.a0 */
public final class C52981a0 extends C14961i {

    /* renamed from: c */
    public final long f147871c;

    /* renamed from: d */
    public final String f147872d;

    /* renamed from: e */
    public final C65426w0 f147873e;

    /* renamed from: f */
    public final boolean f147874f;

    /* renamed from: g */
    public final int f147875g;

    /* renamed from: h */
    public final C49712hj1 f147876h;

    /* renamed from: i */
    public final boolean f147877i;

    /* renamed from: vq1.a0$a */
    public static final class C52982a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C52981a0 f147878a;

        /* renamed from: b */
        public final /* synthetic */ C65869y.C65870a f147879b;

        public C52982a(C52981a0 a0Var, C65869y.C65870a aVar) {
            this.f147878a = a0Var;
            this.f147879b = aVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C65234n nVar = C65234n.Fail;
            Log.m105924i("Finder.LikeActionTask", "LikeActionTask callback " + cVar.f256793a + ' ' + cVar.f256794b + ' ' + cVar.f256795c);
            int i = cVar.f256793a;
            if (i == 0 && cVar.f256794b == 0) {
                int likeCount = this.f147878a.f147873e.getLikeCount();
                boolean z = this.f147878a.f147873e.getLikeFlag() == 1;
                C52981a0 a0Var = this.f147878a;
                if (a0Var.f147874f) {
                    C65426w0 w0Var = a0Var.f147873e;
                    w0Var.mo89532o2().likeCount = w0Var.getLikeCount() + (z ^ true ? 1 : 0);
                } else {
                    C65426w0 w0Var2 = a0Var.f147873e;
                    w0Var2.mo89532o2().likeCount = w0Var2.getLikeCount() + (z ? -1 : 0);
                }
                C52981a0 a0Var2 = this.f147878a;
                a0Var2.f147873e.mo89532o2().likeFlag = a0Var2.f147874f ? 1 : 0;
                C52981a0 a0Var3 = this.f147878a;
                if (a0Var3.f147877i && a0Var3.f147875g == 1) {
                    if (a0Var3.f147874f) {
                        C65426w0 w0Var3 = a0Var3.f147873e;
                        w0Var3.mo89523B2(1 | w0Var3.mo89533p2());
                    } else {
                        C65426w0 w0Var4 = a0Var3.f147873e;
                        w0Var4.mo89523B2(w0Var4.mo89533p2() & -2);
                    }
                }
                int likeFlag = this.f147878a.f147873e.getLikeFlag();
                Log.m105924i("Finder.LikeCommentAction", "CgiFinderLikeFeed end likeFlag: " + likeFlag + " likeCount " + this.f147878a.f147873e.getLikeCount() + ' ' + z + ' ' + likeCount);
                C65866w.f189407h.mo89911j(this.f147878a);
                this.f147879b.mo14006a(C65234n.OK, false);
            } else if (i == 4) {
                C61926c.m72668M(new C65872z(this.f147878a));
                this.f147879b.mo14006a(nVar, false);
            } else {
                this.f147879b.mo14006a(nVar, true);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52981a0(long j, String str, C65426w0 w0Var, boolean z, int i, C65866w.C14969b bVar, C49712hj1 hj12, boolean z2) {
        super(bVar);
        C87412m.m108594g(str, "objectNonceId");
        C87412m.m108594g(w0Var, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
        C87412m.m108594g(hj12, "contextObj");
        this.f147871c = j;
        this.f147872d = str;
        this.f147873e = w0Var;
        this.f147874f = z;
        this.f147875g = i;
        this.f147876h = hj12;
        this.f147877i = z2;
    }

    /* renamed from: a */
    public void mo14007a(C65869y.C65870a aVar) {
        C87412m.m108594g(aVar, "callback");
        super.mo14007a(aVar);
        new C46536t0(this, this.f147876h).mo9225i().mo123420E(new C52982a(this, aVar));
    }

    /* renamed from: c */
    public String mo14008c() {
        return "id_" + this.f147871c + '_' + this.f147873e.mo89531n2() + '_' + this.f147874f + '_' + this.f147875g + '_' + this.f41018b;
    }

    public String toString() {
        return "action_" + this.f147871c + '_' + this.f147873e.mo89531n2() + '_' + this.f147874f + '_' + this.f147875g;
    }
}
