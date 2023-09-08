package f03;

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
import f40.C86709a0;
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
import w60.C102349a;
import w60.C102350b;
import x60.C102564a;

/* renamed from: f03.a */
public final class C97779a extends C100284b<C97784f> {

    /* renamed from: a */
    public final String f286859a = "MicroMsg.CdnImageDownloder";

    /* renamed from: f03.a$a */
    public static final class C97780a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C97779a f286860d;

        /* renamed from: e */
        public final /* synthetic */ String f286861e;

        /* renamed from: f */
        public final /* synthetic */ C100284b.C100285a f286862f;

        public C97780a(C97779a aVar, String str, C100284b.C100285a aVar2) {
            this.f286860d = aVar;
            this.f286861e = str;
            this.f286862f = aVar2;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C87412m.m108594g(str, "mediaId");
            String str2 = this.f286860d.f286859a;
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
            sb.append(", fileExist:");
            sb.append(C86013q1.m106450k(this.f286861e));
            Log.m105924i(str2, sb.toString());
            if (dVar != null) {
                if (dVar.field_retCode != 0) {
                    this.f286862f.mo129424a();
                    return 0;
                }
                C100284b.C100285a aVar = this.f286862f;
                String str3 = this.f286861e;
                aVar.mo129425b(new C102350b(str3, "", new C102349a(str3)));
                return 0;
            } else if (i == 0) {
                return 0;
            } else {
                this.f286862f.mo129424a();
                return 0;
            }
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

    /* renamed from: a */
    public void mo95802a(C102564a<C97784f> aVar, C101725g gVar, C100284b.C100285a aVar2) {
        C102564a<C97784f> aVar3 = aVar;
        C100284b.C100285a aVar4 = aVar2;
        C87412m.m108594g(aVar3, "url");
        C87412m.m108594g(gVar, "fileNameCreator");
        C87412m.m108594g(aVar4, "callback");
        StringBuilder sb = new StringBuilder();
        sb.append(((C97784f) aVar3.f301995a).f286868d);
        String str = ((C97784f) aVar3.f301995a).f286871g;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        String sb4 = sb.toString();
        boolean z = false;
        ConnectivityCompat.Companion companion = ConnectivityCompat.Companion;
        String format = String.format(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/?version=%d&uin=%s&nettype=%d&signal=%d%s", Arrays.copyOf(new Object[]{Integer.valueOf(C89625d.f257841g), C77710q.m93738a(C86709a0.m107523b().mo121110g()), Integer.valueOf(NetStatusUtil.getNetTypeForStat(MMApplicationContext.getContext())), Integer.valueOf(ConnectivityCompat.Companion.getCompatMixStrength$default(companion, false, 1, (Object) null)), ""}, 5));
        C87412m.m108593f(format, "format(format, *args)");
        C98123f fVar = new C98123f();
        fVar.f287660d = "task_FinderCdnDownloader";
        String str2 = ((C97784f) aVar3.f301995a).f286869e;
        Log.m105924i(this.f286859a, "start load tmpFileFilePath:" + str2 + ", url:" + ((C97784f) aVar3.f301995a).f286868d);
        C86013q1.m106461v(new C86009m1(str2).mo119973k());
        T t = aVar3.f301995a;
        C87412m.m108593f(t, "url.value()");
        C97784f fVar2 = (C97784f) t;
        try {
            String host = new URL(sb4).getHost();
            ArrayList arrayList = new ArrayList();
            int f = C81035d.m98965f(host, false, arrayList);
            ArrayList arrayList2 = new ArrayList();
            int f2 = C81035d.m98965f(host, true, arrayList2);
            fVar.field_mediaId = fVar2.mo11841b();
            fVar.f287631R = sb4;
            fVar.f287643y0 = fVar2.f286870f;
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
            Log.m105925i(this.f286859a, "attachSnsImgTaskInfo, imageUrl:%s， " + fVar2.f286870f, sb4);
            z = true;
        } catch (MalformedURLException e) {
            Log.printErrStackTrace(this.f286859a, e, "", new Object[0]);
            Log.m105928w(this.f286859a, "attachSnsImgTaskInfo fail:" + e);
        }
        if (z) {
            fVar.f287662f = new C97780a(this, str2, aVar4);
            if (((C101213l) C86312j.m106911c(C101213l.class)).xf0(fVar)) {
                Log.m105924i(this.f286859a, "SubCoreCdnTransport addRecvTask succ");
                return;
            }
            Log.m105928w(this.f286859a, "SubCoreCdnTransport addRecvTask failed");
            aVar2.mo129424a();
            return;
        }
        Log.m105928w(this.f286859a, "attachSnsImgTaskInfo failed");
        aVar2.mo129424a();
    }
}
