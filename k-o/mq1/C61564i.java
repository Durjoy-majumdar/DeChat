package mq1;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C87412m;
import hp3.C87581a;
import je1.C46523h2;
import mq1.C61557e;
import mq1.C61560g;
import nq1.C61888c;
import o40.C61926c;
import ob0.C47350c;
import ob0.C89132b;
import qq1.C63317a;
import rx3.C13598b0;
import sq1.C64147b;
import te3.C49031co1;
import te3.C64263bo1;
import te3.C64488kb1;
import u60.C65234n;

/* renamed from: mq1.i */
public final class C61564i extends C61552a {

    /* renamed from: c */
    public final C63317a f174975c;

    /* renamed from: d */
    public final C64147b f174976d;

    /* renamed from: e */
    public final boolean f174977e;

    /* renamed from: f */
    public final int f174978f;

    /* renamed from: g */
    public final long f174979g;

    /* renamed from: h */
    public final int f174980h;

    /* renamed from: mq1.i$a */
    public static final class C61565a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C61564i f174981a;

        /* renamed from: b */
        public final /* synthetic */ C61560g.C61561a f174982b;

        public C61565a(C61564i iVar, C61560g.C61561a aVar) {
            this.f174981a = iVar;
            this.f174982b = aVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C65234n nVar = C65234n.Fail;
            int i = cVar.f256793a;
            boolean z = true;
            if (i == 0 && cVar.f256794b == 0) {
                int likeCount = this.f174981a.f174976d.getLikeCount();
                if (this.f174981a.f174976d.getLikeFlag() != 1) {
                    z = false;
                }
                C61564i iVar = this.f174981a;
                if (iVar.f174977e) {
                    C64147b bVar = iVar.f174976d;
                    bVar.mo88876n2().likeCount = bVar.getLikeCount() + (z ^ true ? 1 : 0);
                } else {
                    C64147b bVar2 = iVar.f174976d;
                    bVar2.mo88876n2().likeCount = bVar2.getLikeCount() + (z ? -1 : 0);
                }
                C61564i iVar2 = this.f174981a;
                C64147b bVar3 = iVar2.f174976d;
                bVar3.mo88876n2().likeFlag = iVar2.f174977e ? 1 : 0;
                int likeFlag = this.f174981a.f174976d.getLikeFlag();
                Log.m105924i("Finder.LikeCommentAction", "CgiFinderLikeFeed end likeFlag: " + likeFlag + " likeCount " + this.f174981a.f174976d.getLikeCount() + ' ' + z + ' ' + likeCount);
                C61557e.f174962f.mo86494c(this.f174981a);
                this.f174982b.mo86497a(C65234n.OK, false);
            } else if (i == 4) {
                C61926c.m72668M(new C61563h(this.f174981a));
                this.f174982b.mo86497a(nVar, false);
            } else {
                this.f174982b.mo86497a(nVar, true);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61564i(C63317a aVar, C64147b bVar, boolean z, int i, C61557e.C34636a aVar2) {
        super(aVar2);
        C87412m.m108594g(aVar, "feedItem");
        C87412m.m108594g(bVar, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
        this.f174975c = aVar;
        this.f174976d = bVar;
        this.f174977e = z;
        this.f174978f = i;
        this.f174979g = aVar.mo88217a();
        this.f174980h = i;
    }

    /* renamed from: a */
    public void mo86488a(C61560g.C61561a aVar) {
        C87412m.m108594g(aVar, "callback");
        super.mo86488a(aVar);
        C61888c cVar = new C61888c(this.f174975c);
        long m2 = this.f174976d.mo88875m2();
        int i = this.f174977e ? 3 : 4;
        int i2 = this.f174978f;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C64263bo1 bo12 = new C64263bo1();
        C63317a aVar2 = cVar.f175991i;
        bo12.f182303f = aVar2.f179669a;
        bo12.f182304g = aVar2.f179670b;
        C64488kb1 kb12 = aVar2.f179676h;
        bo12.f182309o = kb12 != null ? C58739j4.f168176a.mo83710g0(kb12) : null;
        bo12.f182301d = C46523h2.f125330a.mo71859a(6989);
        bo12.f182306i = m2;
        bo12.f182307j = i;
        bo12.f182308n = i2;
        bo12.f182302e = System.currentTimeMillis();
        bVar.f127066a = bo12;
        bVar.f127067b = new C49031co1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderunilike";
        bVar.f127069d = 6989;
        cVar.mo123453j(bVar.mo72403a());
        cVar.mo9225i().mo123420E(new C61565a(this, aVar));
    }

    /* renamed from: b */
    public String mo86489b() {
        return "id_" + this.f174975c.f179674f + '_' + this.f174976d.mo88875m2() + '_' + this.f174977e + '_' + this.f174978f + '_' + this.f174953b;
    }

    public String toString() {
        return "action_" + this.f174975c.f179674f + '_' + this.f174976d.mo88875m2() + '_' + this.f174977e + '_' + this.f174978f;
    }
}
