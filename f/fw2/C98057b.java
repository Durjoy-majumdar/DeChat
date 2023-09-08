package fw2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import cw2.C97391o;
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
import p823sg.C90193h;
import qe3.C89625d;
import t60.C101725g;
import te3.bc4;
import w60.C102349a;
import w60.C102350b;
import x60.C102564a;
import z04.C119027c;

/* renamed from: fw2.b */
public final class C98057b extends C100284b<C98059c> {

    /* renamed from: fw2.b$a */
    public static final class C98058a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C98059c f287502d;

        /* renamed from: e */
        public final /* synthetic */ C100284b.C100285a f287503e;

        /* renamed from: f */
        public final /* synthetic */ String f287504f;

        public C98058a(C98059c cVar, C100284b.C100285a aVar, String str) {
            this.f287502d = cVar;
            this.f287503e = aVar;
            this.f287504f = str;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C87412m.m108594g(str, "mediaId");
            Log.m105924i("MicroMsg.Loader.StoryDownloader", "mediaId " + str + " startRet " + i + " sceneResult " + dVar + " onlyCheckExist " + z);
            if (dVar == null || this.f287502d == null) {
                return 0;
            }
            C100284b.C100285a aVar = this.f287503e;
            String str2 = this.f287504f;
            aVar.mo129425b(new C102350b(str2, "", new C102349a(str2)));
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

    /* renamed from: a */
    public void mo95802a(C102564a<C98059c> aVar, C101725g gVar, C100284b.C100285a aVar2) {
        String str;
        boolean z;
        C102564a<C98059c> aVar3 = aVar;
        C101725g gVar2 = gVar;
        C100284b.C100285a aVar4 = aVar2;
        C87412m.m108594g(aVar3, "data");
        C87412m.m108594g(gVar2, "fileNameCreator");
        C87412m.m108594g(aVar4, "callback");
        C98059c cVar = (C98059c) aVar3.f301995a;
        StoryCore.f281736t.getClass();
        ConnectivityCompat.Companion companion = ConnectivityCompat.Companion;
        String format = String.format(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/?version=%d&uin=%s&nettype=%d&signal=%d%s", Arrays.copyOf(new Object[]{Integer.valueOf(C89625d.f257841g), C77710q.m93738a(C86709a0.m107523b().mo121110g()), Integer.valueOf(NetStatusUtil.getNetTypeForStat(MMApplicationContext.getContext())), Integer.valueOf(ConnectivityCompat.Companion.getCompatMixStrength$default(companion, false, 1, (Object) null)), ""}, 5));
        C87412m.m108593f(format, "format(format, *args)");
        C98123f fVar = new C98123f();
        fVar.f287660d = "task_StoryDownloader";
        Log.m105924i("MicroMsg.Loader.StoryDownloader", "loadDataImp " + aVar3.f301995a + " story " + cVar.f287505d.f297961f);
        StringBuilder sb = new StringBuilder();
        C97391o oVar = C97391o.f285892a;
        C98059c cVar2 = (C98059c) aVar3.f301995a;
        String str2 = cVar2.f287505d.f297961f;
        String str3 = cVar2.f287506e;
        if (str2 == null) {
            oVar.getClass();
            str = "";
        } else {
            StringBuilder sb4 = new StringBuilder();
            byte[] bytes = str2.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            sb4.append(oVar.mo136654g(oVar.mo136649b(str3) + "pic/", C90193h.m112878f(bytes)));
            sb4.append(".d");
            str = sb4.toString();
        }
        sb.append(str);
        sb.append(gVar2.mo140078a(aVar3));
        String sb5 = sb.toString();
        try {
            bc4 bc4 = cVar.f287505d;
            String host = new URL(bc4.f297963h).getHost();
            ArrayList arrayList = new ArrayList();
            int f = C81035d.m98965f(host, false, arrayList);
            ArrayList arrayList2 = new ArrayList();
            int f2 = C81035d.m98965f(host, true, arrayList2);
            fVar.field_mediaId = bc4.f297959d + '_';
            fVar.f287631R = bc4.f297963h;
            fVar.f287633S = host;
            fVar.f287634T = format;
            fVar.f287635U = sb5;
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
            fVar.f287643y0 = cVar.f287505d.f297977y;
            fVar.f287663g = 3;
            fVar.f287630Q0 = 100;
            fVar.f287632R0 = 20201;
            Log.m105925i("MicroMsg.Loader.StoryDownloader", "attachSnsImgTaskInfo reqDownType:%s", fVar);
            z = true;
        } catch (MalformedURLException e) {
            Log.printErrStackTrace("MicroMsg.Loader.StoryDownloader", e, "", new Object[0]);
            Log.m105928w("MicroMsg.Loader.StoryDownloader", "attachSnsImgTaskInfo fail:" + e);
            z = false;
        }
        if (z) {
            fVar.f287662f = new C98058a(cVar, aVar4, sb5);
            if (((C101213l) C86312j.m106911c(C101213l.class)).xf0(fVar)) {
                Log.m105924i("MicroMsg.Loader.StoryDownloader", "SubCoreCdnTransport addRecvTask suc");
                return;
            }
            Log.m105928w("MicroMsg.Loader.StoryDownloader", "SubCoreCdnTransport addRecvTask failed");
            aVar2.mo129424a();
            return;
        }
        Log.m105928w("MicroMsg.Loader.StoryDownloader", "attachSnsImgTaskInfo failed");
        aVar2.mo129424a();
    }
}
