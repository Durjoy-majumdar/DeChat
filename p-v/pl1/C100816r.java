package pl1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import er1.C58741j5;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import o60.C100284b;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98123f;
import p1081gi.C98124g;
import p663qo.C101213l;
import p823sg.C77710q;
import qe3.C89625d;
import t60.C101725g;
import up1.C27696y;
import w60.C102349a;
import w60.C102350b;
import x60.C102564a;

/* renamed from: pl1.r */
public final class C100816r extends C100284b<C100810g0> {

    /* renamed from: pl1.r$a */
    public static final class C100817a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C100810g0 f295328d;

        /* renamed from: e */
        public final /* synthetic */ C100284b.C100285a f295329e;

        /* renamed from: f */
        public final /* synthetic */ String f295330f;

        public C100817a(C100810g0 g0Var, C100284b.C100285a aVar, String str) {
            this.f295328d = g0Var;
            this.f295329e = aVar;
            this.f295330f = str;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C87412m.m108594g(str, "mediaId");
            StringBuilder sb = new StringBuilder();
            sb.append("mediaId ");
            sb.append(str);
            sb.append(" startRet ");
            sb.append(i);
            sb.append(" sceneResult ");
            sb.append(dVar);
            sb.append(" onlyCheckExist ");
            sb.append(z);
            sb.append(" retCode ");
            sb.append(dVar != null ? Integer.valueOf(dVar.field_retCode) : "");
            Log.m105924i("Finder.FinderCdnDownloader", sb.toString());
            if (dVar != null) {
                if (this.f295328d == null) {
                    return 0;
                }
                if (dVar.field_retCode != 0) {
                    this.f295329e.mo129424a();
                } else {
                    C100284b.C100285a aVar = this.f295329e;
                    String str2 = this.f295330f;
                    aVar.mo129425b(new C102350b(str2, "", new C102349a(str2)));
                }
            } else if (i != 0) {
                this.f295329e.mo129424a();
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

    public C100816r(C62366q qVar) {
    }

    /* renamed from: a */
    public void mo95802a(C102564a<C100810g0> aVar, C101725g gVar, C100284b.C100285a aVar2) {
        String str;
        C102564a<C100810g0> aVar3 = aVar;
        C100284b.C100285a aVar4 = aVar2;
        C87412m.m108594g(aVar3, "item");
        C87412m.m108594g(gVar, "fileNameCreator");
        C87412m.m108594g(aVar4, "callback");
        C100810g0 g0Var = (C100810g0) aVar3.f301995a;
        if (g0Var.getMediaType() == C27696y.RAW_IMAGE) {
            str = g0Var.getUrl() + g0Var.getUrlToken();
            Log.m105924i("Finder.FinderCdnDownloader", "[loadByCdn] finder image, " + g0Var.getMediaType() + ' ' + g0Var.getUrlToken() + " uniqueValue=" + g0Var.mo11841b() + ' ' + str);
        } else {
            str = g0Var.getThumbUrl() + g0Var.getThumbUrlToken();
            Log.m105924i("Finder.FinderCdnDownloader", "[loadByCdn] finder image, " + g0Var.getMediaType() + ' ' + g0Var.getThumbUrlToken() + " uniqueValue=" + g0Var.mo11841b() + ' ' + str);
        }
        boolean z = false;
        ConnectivityCompat.Companion companion = ConnectivityCompat.Companion;
        String format = String.format(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/?version=%d&uin=%s&nettype=%d&signal=%d%s", Arrays.copyOf(new Object[]{Integer.valueOf(C89625d.f257841g), C77710q.m93738a(C86709a0.m107523b().mo121110g()), Integer.valueOf(NetStatusUtil.getNetTypeForStat(MMApplicationContext.getContext())), Integer.valueOf(ConnectivityCompat.Companion.getCompatMixStrength$default(companion, false, 1, (Object) null)), ""}, 5));
        C87412m.m108593f(format, "format(format, *args)");
        C98123f fVar = new C98123f();
        fVar.f287660d = "task_FinderCdnDownloader";
        C58741j5 j5Var = C58741j5.f168184a;
        String str2 = C58741j5.f168192i + g0Var.mo11841b();
        C86013q1.m106447h(str2);
        C86013q1.m106461v(new C86009m1(str2).mo119973k());
        try {
            String host = new URL(str).getHost();
            ArrayList arrayList = new ArrayList();
            int f = C81035d.m98965f(host, false, arrayList);
            ArrayList arrayList2 = new ArrayList();
            int f2 = C81035d.m98965f(host, true, arrayList2);
            fVar.field_mediaId = g0Var.mo11841b();
            fVar.f287631R = str;
            fVar.f287643y0 = g0Var.getDecodeKey();
            fVar.f287633S = host;
            fVar.f287634T = format;
            fVar.f287635U = str2;
            int size = arrayList.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = (String) arrayList.get(i);
            }
            fVar.f287636V = strArr;
            int size2 = arrayList2.size();
            String[] strArr2 = new String[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                strArr2[i2] = (String) arrayList2.get(i2);
            }
            fVar.f287637W = strArr2;
            fVar.f287638X = f;
            fVar.f287639Y = f2;
            fVar.f287640Z = false;
            fVar.f287641p0 = "" + ConnectivityCompat.Companion.getCompatMixStrength$default(companion, false, 1, (Object) null);
            fVar.f287642x0 = "";
            fVar.f287663g = 3;
            fVar.f287630Q0 = 150;
            fVar.f287632R0 = 20201;
            Log.m105925i("Finder.FinderCdnDownloader", "attachSnsImgTaskInfo decodeKey:%s, imageUrl:%s", g0Var.getDecodeKey(), str);
            z = true;
        } catch (MalformedURLException e) {
            Log.printErrStackTrace("Finder.FinderCdnDownloader", e, "", new Object[0]);
            Log.m105928w("Finder.FinderCdnDownloader", "attachSnsImgTaskInfo fail:" + e);
        }
        if (z) {
            fVar.f287662f = new C100817a(g0Var, aVar4, str2);
            if (((C101213l) C86312j.m106911c(C101213l.class)).xf0(fVar)) {
                Log.m105924i("Finder.FinderCdnDownloader", "SubCoreCdnTransport addRecvTask suc");
                return;
            }
            Log.m105928w("Finder.FinderCdnDownloader", "SubCoreCdnTransport addRecvTask failed");
            aVar2.mo129424a();
            return;
        }
        Log.m105928w("Finder.FinderCdnDownloader", "attachSnsImgTaskInfo failed");
        aVar2.mo129424a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C100816r(C62366q qVar, int i, C8480h hVar) {
        this((i & 1) != 0 ? null : qVar);
    }
}
