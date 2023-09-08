package p833zk;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import rx3.C13598b0;

/* renamed from: zk.a */
public final class C103037a implements C103043e {

    /* renamed from: a */
    public C103044f f304013a;

    /* renamed from: b */
    public C32226l<? super Boolean, C13598b0> f304014b;

    /* renamed from: c */
    public final C103038a f304015c = new C103038a(this);

    /* renamed from: zk.a$a */
    public static final class C103038a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C103037a f304016d;

        public C103038a(C103037a aVar) {
            this.f304016d = aVar;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C32226l<? super Boolean, C13598b0> lVar;
            this.f304016d.getClass();
            Log.m105924i("MicroMsg.EmojiLoader.EmojiFetcher", "callback " + i + ' ' + cVar + ' ' + dVar);
            if (i == 0 && dVar != null && dVar.field_retCode == 0) {
                this.f304016d.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("download ");
                C103044f fVar = this.f304016d.f304013a;
                if (fVar != null) {
                    sb.append(fVar.f304025a.getMd5());
                    sb.append(" finish");
                    Log.m105924i("MicroMsg.EmojiLoader.EmojiFetcher", sb.toString());
                    C32226l<? super Boolean, C13598b0> lVar2 = this.f304016d.f304014b;
                    if (lVar2 != null) {
                        lVar2.invoke(Boolean.TRUE);
                    }
                    return 0;
                }
                C87412m.m108603p("fetcherConfig");
                throw null;
            }
            if (!((i == 0 && (dVar == null || dVar.field_retCode == 0)) || (lVar = this.f304016d.f304014b) == null)) {
                lVar.invoke(Boolean.FALSE);
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return new byte[0];
        }
    }

    /* renamed from: a */
    public void mo142747a(C103044f fVar, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(fVar, "fetcherConfig");
        this.f304013a = fVar;
        this.f304014b = lVar;
        C101213l lVar2 = (C101213l) C86312j.m106911c(C101213l.class);
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_EmojiCdnFetcher";
        C103044f fVar2 = this.f304013a;
        if (fVar2 != null) {
            gVar.field_authKey = fVar2.f304028d;
            gVar.field_fileType = 19;
            StringBuilder sb = new StringBuilder();
            sb.append("downemoji_");
            C103044f fVar3 = this.f304013a;
            if (fVar3 != null) {
                sb.append(fVar3.f304025a.getMd5());
                gVar.field_mediaId = sb.toString();
                C103044f fVar4 = this.f304013a;
                if (fVar4 != null) {
                    gVar.field_fullpath = fVar4.f304027c;
                    gVar.f287672s = fVar4.f304026b;
                    gVar.f287662f = this.f304015c;
                    lVar2.xf0(gVar);
                    return;
                }
                C87412m.m108603p("fetcherConfig");
                throw null;
            }
            C87412m.m108603p("fetcherConfig");
            throw null;
        }
        C87412m.m108603p("fetcherConfig");
        throw null;
    }
}
