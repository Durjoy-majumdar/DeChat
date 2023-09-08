package ye0;

import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import org.libpag.PAGFile;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98123f;
import p1081gi.C98124g;
import p663qo.C101213l;
import u60.C65220d;
import u60.C65234n;
import ze0.C103013c;

/* renamed from: ye0.a */
public abstract class C102831a extends C65220d {

    /* renamed from: f */
    public final C103013c f303562f;

    /* renamed from: g */
    public final String f303563g = "PAGLoadTask";

    /* renamed from: h */
    public final int f303564h = 10000;

    /* renamed from: i */
    public final int f303565i = 10001;

    /* renamed from: j */
    public final int f303566j = 10002;

    /* renamed from: n */
    public final String f303567n = ".temp";

    /* renamed from: ye0.a$a */
    public static abstract class C102832a {

        /* renamed from: ye0.a$a$a */
        public static final class C102833a extends C102832a {

            /* renamed from: a */
            public final String f303568a;

            /* renamed from: b */
            public final int f303569b;

            public C102833a(String str, int i) {
                C87412m.m108594g(str, "path");
                this.f303568a = str;
                this.f303569b = i;
            }

            public String toString() {
                return "[Failed] path:" + this.f303568a + ", errcode:" + this.f303569b;
            }
        }

        /* renamed from: ye0.a$a$b */
        public static final class C102834b extends C102832a {

            /* renamed from: a */
            public final String f303570a;

            public C102834b(String str) {
                C87412m.m108594g(str, "path");
                this.f303570a = str;
            }

            public String toString() {
                return "[success] path:" + this.f303570a;
            }
        }
    }

    /* renamed from: ye0.a$b */
    public static final class C102835b implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C102831a f303571d;

        /* renamed from: e */
        public final /* synthetic */ String f303572e;

        /* renamed from: f */
        public final /* synthetic */ String f303573f;

        public C102835b(C102831a aVar, String str, String str2) {
            this.f303571d = aVar;
            this.f303572e = str;
            this.f303573f = str2;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C87412m.m108594g(str, "mediaId");
            String str2 = this.f303571d.f303563g;
            StringBuilder sb = new StringBuilder();
            sb.append("cdncallback, mediaId:");
            sb.append(str);
            sb.append(", startRet:");
            sb.append(i);
            sb.append(", ");
            PAGFile pAGFile = null;
            sb.append(dVar != null ? Integer.valueOf(dVar.field_retCode) : null);
            Log.m105924i(str2, sb.toString());
            if (dVar == null) {
                return 0;
            }
            if (dVar.field_retCode == 0) {
                boolean k = C86013q1.m106450k(this.f303572e);
                long l = C86013q1.m106451l(this.f303572e);
                String str3 = this.f303571d.f303563g;
                Log.m105924i(str3, "success, fileExist:" + k + ", fileLength:" + l);
                long d = C86013q1.m106443d(this.f303572e, this.f303573f, false);
                String str4 = this.f303571d.f303563g;
                Log.m105924i(str4, "copied length = " + d);
                C86013q1.m106447h(this.f303572e);
                C102831a aVar = this.f303571d;
                String str5 = this.f303573f;
                aVar.getClass();
                PAGFile Load = PAGFile.Load(str5);
                boolean z2 = true;
                if (Load != null) {
                    pAGFile = Load;
                }
                if (pAGFile == null) {
                    if (aVar.f303562f.f303965c) {
                        C86013q1.m106447h(str5);
                    }
                    z2 = false;
                }
                aVar.mo142557e(z2 ? new C102832a.C102834b(this.f303573f) : new C102832a.C102833a(this.f303573f, this.f303571d.f303566j));
            } else {
                String str6 = this.f303571d.f303563g;
                Log.m105924i(str6, "failed, " + dVar.field_retCode);
                this.f303571d.mo142557e(new C102832a.C102833a(this.f303573f, dVar.field_retCode));
            }
            this.f303571d.mo11853b(C65234n.OK);
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

    public C102831a(C103013c cVar) {
        C87412m.m108594g(cVar, "config");
        this.f303562f = cVar;
    }

    /* renamed from: a */
    public void mo11852a() {
        C65234n nVar = C65234n.OK;
        Log.m105924i(this.f303563g, "load pag config:" + this.f303562f);
        C103013c cVar = this.f303562f;
        String str = cVar.f303964b;
        String str2 = cVar.f303963a;
        String str3 = str + this.f303567n;
        C98123f fVar = null;
        try {
            C98123f fVar2 = new C98123f();
            fVar2.f287660d = "task_PagCdnDownloader";
            String host = new URL(str2).getHost();
            int f = C81035d.m98965f(host, false, new ArrayList());
            int f2 = C81035d.m98965f(host, true, new ArrayList());
            fVar2.field_mediaId = MD5Util.getMD5String(str2);
            fVar2.f287631R = str2;
            fVar2.f287633S = host;
            fVar2.f287635U = str3;
            fVar2.f287638X = f;
            fVar2.f287639Y = f2;
            fVar2.f287640Z = false;
            fVar2.f287641p0 = "" + ConnectivityCompat.Companion.getCompatMixStrength$default(ConnectivityCompat.Companion, false, 1, (Object) null);
            fVar2.f287642x0 = "";
            fVar2.f287630Q0 = 150;
            fVar2.f287632R0 = 20201;
            Log.m105924i(this.f303563g, "attachPagTaskInfo mediaId:" + fVar2.field_mediaId + " imageUrl:" + str2);
            fVar = fVar2;
        } catch (MalformedURLException e) {
            Log.printErrStackTrace(this.f303563g, e, "", new Object[0]);
            Log.m105928w(this.f303563g, "attachPagTaskInfo fail:" + e);
        }
        if (fVar == null) {
            mo142557e(new C102832a.C102833a(str, this.f303564h));
            mo11853b(nVar);
            return;
        }
        fVar.f287662f = new C102835b(this, str3, str);
        if (!((C101213l) C86312j.m106911c(C101213l.class)).xf0(fVar)) {
            Log.m105924i(this.f303563g, "addRecvTask failed.");
            mo142557e(new C102832a.C102833a(str, this.f303565i));
            mo11853b(nVar);
        }
    }

    /* renamed from: c */
    public boolean mo89346c(C65220d dVar) {
        C87412m.m108594g(dVar, "newTask");
        return false;
    }

    /* renamed from: d */
    public String mo11854d() {
        String mD5String = MD5Util.getMD5String(this.f303562f.f303963a);
        C87412m.m108593f(mD5String, "getMD5String(config.url)");
        return mD5String;
    }

    /* renamed from: e */
    public abstract void mo142557e(C102832a aVar);
}
