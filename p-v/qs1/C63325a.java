package qs1;

import cj1.C54847z3;
import cl1.C39970c;
import cl1.C55001u;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98123f;
import p1081gi.C98124g;
import p663qo.C101213l;
import p823sg.C90193h;
import pe3.C47465a;
import pl1.C11977d0;
import rx3.C13598b0;
import te3.C50980qm1;
import te3.C51765w03;
import te3.C64683rm1;
import te3.C64780vo2;
import tf0.C64916p1;

/* renamed from: qs1.a */
public final class C63325a extends C39970c<C45795b> {

    /* renamed from: f */
    public C64780vo2 f179685f;

    /* renamed from: g */
    public C64780vo2 f179686g;

    /* renamed from: h */
    public long f179687h;

    /* renamed from: qs1.a$a */
    public static final class C63326a extends C98123f {

        /* renamed from: S0 */
        public final long f179688S0;

        /* renamed from: T0 */
        public final String f179689T0;

        public C63326a(long j, String str) {
            this.f179688S0 = j;
            this.f179689T0 = str;
        }
    }

    /* renamed from: qs1.a$b */
    public static final class C63327b implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C63325a f179690d;

        /* renamed from: e */
        public final /* synthetic */ C63326a f179691e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f179692f;

        public C63327b(C63325a aVar, C63326a aVar2, C32226l<? super Boolean, C13598b0> lVar) {
            this.f179690d = aVar;
            this.f179691e = aVar2;
            this.f179692f = lVar;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C87412m.m108594g(str, "mediaId");
            Log.m105924i("Finder.LiveDecorationSlice", "mediaId " + str + " startRet " + i + " sceneResult " + dVar + " onlyCheckExist " + z);
            if (dVar == null) {
                Log.m105924i("Finder.LiveDecorationSlice", "skip fetch pag callback, sceneResult == null");
                return 0;
            } else if (dVar.field_retCode != 0) {
                Log.m105928w("Finder.LiveDecorationSlice", "skip fetch pag callback, fetch pag fail:" + dVar.field_retCode);
                return 0;
            } else {
                try {
                    long j = ((C55001u) this.f179690d.business(C55001u.class)).f154420q.f182392d;
                    String a = C90193h.m112873a(new C86009m1(this.f179691e.f287635U), (int) C86013q1.m106451l(this.f179691e.f287635U));
                    Log.m105924i("Finder.LiveDecorationSlice", "loadDecorationRes finish. localMd5:" + a + " taskMd5:" + this.f179691e.f179689T0 + " curLiveId:" + j + " taskLiveId:" + this.f179691e.f179688S0);
                    C63326a aVar = this.f179691e;
                    if (j != aVar.f179688S0 || !Util.isEqual(a, aVar.f179689T0)) {
                        C32226l<Boolean, C13598b0> lVar = this.f179692f;
                        if (lVar != null) {
                            lVar.invoke(Boolean.FALSE);
                        }
                        return 0;
                    }
                    C32226l<Boolean, C13598b0> lVar2 = this.f179692f;
                    if (lVar2 != null) {
                        lVar2.invoke(Boolean.TRUE);
                    }
                    return 0;
                } catch (Exception e) {
                    Log.m105920e("Finder.LiveDecorationSlice", "loadDecorationRes err:" + e.getMessage());
                    C32226l<Boolean, C13598b0> lVar3 = this.f179692f;
                    if (lVar3 != null) {
                        lVar3.invoke(Boolean.FALSE);
                    }
                }
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

    /* renamed from: qs1.a$c */
    public static final class C63328c extends C54847z3.C54849b<C64683rm1> {

        /* renamed from: b */
        public final /* synthetic */ C32227p<C64780vo2, C64780vo2, C13598b0> f179693b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63328c(C32227p<? super C64780vo2, ? super C64780vo2, C13598b0> pVar, Class<C64683rm1> cls) {
            super(cls);
            this.f179693b = pVar;
        }

        /* renamed from: a */
        public void mo9116a(C47465a aVar) {
            C64780vo2 vo22;
            boolean z;
            T t;
            boolean z2;
            C64683rm1 rm12 = (C64683rm1) aVar;
            C87412m.m108594g(rm12, "result");
            LinkedList<C64780vo2> linkedList = rm12.f185203d;
            T t2 = null;
            if (linkedList != null) {
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C64780vo2) t).f185963d == 1) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                }
                vo22 = (C64780vo2) t;
            } else {
                vo22 = null;
            }
            LinkedList<C64780vo2> linkedList2 = rm12.f185204e;
            if (linkedList2 != null) {
                Iterator<T> it4 = linkedList2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    T next = it4.next();
                    if (((C64780vo2) next).f185963d == 1) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        t2 = next;
                        break;
                    }
                }
                t2 = (C64780vo2) t2;
            }
            C32227p<C64780vo2, C64780vo2, C13598b0> pVar = this.f179693b;
            if (pVar != null) {
                pVar.invoke(vo22, t2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63325a(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: c3 */
    public final String mo88226c3(C64780vo2 vo22) {
        String str = null;
        String str2 = vo22 != null ? vo22.f185964e : null;
        if (str2 == null || str2.length() == 0) {
            return "";
        }
        if (vo22 != null) {
            str = vo22.f185964e;
        }
        String mD5String = MD5Util.getMD5String(str);
        C87412m.m108593f(mD5String, "key");
        return ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76718rZ(new C11977d0("", mD5String, "", false, false, (C51765w03) null, 56, (C8480h) null));
    }

    /* renamed from: d3 */
    public final void mo88227d3(C64780vo2 vo22, C32226l<? super Boolean, C13598b0> lVar) {
        String str;
        if (vo22 != null && (str = vo22.f185964e) != null) {
            C63326a aVar = new C63326a(((C55001u) business(C55001u.class)).f154420q.f182392d, vo22.f185965f);
            aVar.f287660d = "task_FinderCdnDownloader";
            String c3 = mo88226c3(vo22);
            C86013q1.m106447h(c3);
            C86013q1.m106461v(new C86009m1(c3).mo119973k());
            boolean z = true;
            try {
                String host = new URL(str).getHost();
                int f = C81035d.m98965f(host, false, new ArrayList());
                int f2 = C81035d.m98965f(host, true, new ArrayList());
                aVar.field_mediaId = MD5Util.getMD5String(str);
                aVar.f287631R = str;
                aVar.f287633S = host;
                aVar.f287635U = c3;
                aVar.f287638X = f;
                aVar.f287639Y = f2;
                aVar.f287641p0 = "" + ConnectivityCompat.Companion.getCompatMixStrength$default(ConnectivityCompat.Companion, false, 1, (Object) null);
                aVar.f287642x0 = "";
                aVar.f287630Q0 = 150;
                aVar.f287632R0 = 20201;
                Log.m105925i("Finder.LiveDecorationSlice", "attachDecorTaskInfo url:%s", str);
            } catch (MalformedURLException e) {
                Log.printErrStackTrace("Finder.LiveDecorationSlice", e, "", new Object[0]);
                Log.m105928w("Finder.LiveDecorationSlice", "attachGiftPagTaskInfo fail:" + e);
                z = false;
            }
            if (z) {
                aVar.f287662f = new C63327b(this, aVar, lVar);
                if (((C101213l) C86312j.m106911c(C101213l.class)).xf0(aVar)) {
                    Log.m105924i("Finder.LiveDecorationSlice", "SubCoreCdnTransport addRecvTask suc");
                    return;
                }
                if (lVar != null) {
                    lVar.invoke(Boolean.FALSE);
                }
                Log.m105928w("Finder.LiveDecorationSlice", "SubCoreCdnTransport addRecvTask failed");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011 A[RETURN, SYNTHETIC] */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo88228e3(java.lang.String r4, int r5) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            if (r5 != 0) goto L_0x0013
            te3.vo2 r5 = r3.f179685f
            if (r5 == 0) goto L_0x000b
            java.lang.String r0 = r5.f185964e
        L_0x000b:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r4)
            if (r4 != 0) goto L_0x0022
        L_0x0011:
            r1 = 1
            goto L_0x0022
        L_0x0013:
            if (r5 != r2) goto L_0x0022
            te3.vo2 r5 = r3.f179686g
            if (r5 == 0) goto L_0x001b
            java.lang.String r0 = r5.f185964e
        L_0x001b:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r4)
            if (r4 != 0) goto L_0x0022
            goto L_0x0011
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qs1.C63325a.mo88228e3(java.lang.String, int):boolean");
    }

    /* renamed from: f3 */
    public final void mo88229f3(C32227p<? super C64780vo2, ? super C64780vo2, C13598b0> pVar) {
        FinderLiveService.f159376d.getClass();
        FinderLiveService.f159383n.mo75799e(8, new C50980qm1(), new C63328c(pVar, C64683rm1.class), false);
    }

    public void onCleared() {
        this.f179685f = null;
        this.f179686g = null;
        this.f179687h = 0;
    }
}
