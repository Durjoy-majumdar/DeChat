package fi1;

import a14.C53916l;
import a14.C53921m;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.io.ByteArrayOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import kotlin.Result;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98123f;
import p1081gi.C98124g;
import p663qo.C101213l;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: fi1.d */
public final class C59098d {

    /* renamed from: a */
    public static final C59098d f169061a = new C59098d();

    /* renamed from: fi1.d$a */
    public static abstract class C59099a {

        /* renamed from: fi1.d$a$a */
        public static final class C59100a extends C59099a {

            /* renamed from: a */
            public final int f169062a;

            public C59100a(int i) {
                this.f169062a = i;
            }
        }

        /* renamed from: fi1.d$a$b */
        public static final class C59101b extends C59099a {
            public C59101b(String str) {
                C87412m.m108594g(str, "path");
            }
        }
    }

    /* renamed from: fi1.d$b */
    public static final class C59102b implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ String f169063d;

        /* renamed from: e */
        public final /* synthetic */ C53916l<C59099a> f169064e;

        public C59102b(String str, C53916l<? super C59099a> lVar) {
            this.f169063d = str;
            this.f169064e = lVar;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C87412m.m108594g(str, "mediaId");
            StringBuilder sb = new StringBuilder();
            sb.append("cdncallback, mediaId:");
            sb.append(str);
            sb.append(", startRet:");
            sb.append(i);
            sb.append(", ");
            sb.append(dVar != null ? Integer.valueOf(dVar.field_retCode) : null);
            Log.m105924i("Finder.FinderLivePagLoader", sb.toString());
            if (dVar == null) {
                return 0;
            }
            if (dVar.field_retCode == 0) {
                Log.m105924i("Finder.FinderLivePagLoader", "success, fileExist:" + C86013q1.m106450k(this.f169063d));
                C53916l<C59099a> lVar = this.f169064e;
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m168114constructorimpl(new C59099a.C59101b(this.f169063d)));
            } else {
                Log.m105924i("Finder.FinderLivePagLoader", "failed, " + dVar.field_retCode);
                C53916l<C59099a> lVar2 = this.f169064e;
                Result.Companion companion2 = Result.Companion;
                lVar2.resumeWith(Result.m168114constructorimpl(new C59099a.C59100a(dVar.field_retCode)));
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(byteArrayOutputStream, "buff");
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(bArr, "inbuf");
            return new byte[0];
        }
    }

    /* renamed from: fi1.d$c */
    public static final class C59103c extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98123f f169065d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59103c(C98123f fVar) {
            super(1);
            this.f169065d = fVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            Log.m105924i("Finder.FinderLivePagLoader", "invokeOnCancellation");
            this.f169065d.f287662f = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final Object mo84292a(String str, String str2, C15601d<? super C59099a> dVar) {
        Log.m105924i("Finder.FinderLivePagLoader", "loadPag url:" + str + ", path:" + str2);
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        if (C86013q1.m106450k(str2)) {
            Log.m105924i("Finder.FinderLivePagLoader", "fileExist");
            Result.Companion companion = Result.Companion;
            mVar.resumeWith(Result.m168114constructorimpl(new C59099a.C59101b(str2)));
        } else {
            C98123f fVar = null;
            try {
                C98123f fVar2 = new C98123f();
                fVar2.f287660d = "task_FinderCdnDownloader";
                String host = new URL(str).getHost();
                int f = C81035d.m98965f(host, false, new ArrayList());
                int f2 = C81035d.m98965f(host, true, new ArrayList());
                fVar2.field_mediaId = MD5Util.getMD5String(str);
                fVar2.f287631R = str;
                fVar2.f287633S = host;
                fVar2.f287635U = str2;
                fVar2.f287638X = f;
                fVar2.f287639Y = f2;
                fVar2.f287640Z = false;
                fVar2.f287641p0 = "" + ConnectivityCompat.Companion.getCompatMixStrength$default(ConnectivityCompat.Companion, false, 1, (Object) null);
                fVar2.f287642x0 = "";
                fVar2.f287630Q0 = 150;
                fVar2.f287632R0 = 20201;
                Log.m105924i("Finder.FinderLivePagLoader", "attachPagTaskInfo mediaId:" + fVar2.field_mediaId + " imageUrl:" + str);
                fVar = fVar2;
            } catch (MalformedURLException e) {
                Log.printErrStackTrace("Finder.FinderLivePagLoader", e, "", new Object[0]);
                Log.m105928w("Finder.FinderLivePagLoader", "attachPagTaskInfo fail:" + e);
            }
            if (fVar == null) {
                Result.Companion companion2 = Result.Companion;
                mVar.resumeWith(Result.m168114constructorimpl(new C59099a.C59100a(10000)));
            } else {
                fVar.f287662f = new C59102b(str2, mVar);
                if (((C101213l) C86312j.m106911c(C101213l.class)).xf0(fVar)) {
                    mVar.mo74599v(new C59103c(fVar));
                } else {
                    Log.m105924i("Finder.FinderLivePagLoader", "addRecvTask failed.");
                    Result.Companion companion3 = Result.Companion;
                    mVar.resumeWith(Result.m168114constructorimpl(new C59099a.C59100a(10001)));
                }
            }
        }
        return mVar.mo74608o();
    }
}
