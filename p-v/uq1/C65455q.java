package uq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import je1.C60815y3;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p599lr.C61381b;
import p663qo.C101213l;
import pe3.C47465a;
import pe3.C89349b;
import qo1.C63289e;
import sx3.C26236u;
import te3.C50401mh0;
import te3.C50542nh0;
import te3.C64313dg1;
import te3.C64553md1;
import te3.zr4;
import u60.C65220d;
import u60.C65234n;

/* renamed from: uq1.q */
public final class C65455q extends C65220d {

    /* renamed from: f */
    public final String f188342f;

    /* renamed from: g */
    public final String f188343g;

    /* renamed from: h */
    public final String f188344h = "Finder.FinderUploadCoverImageTask";

    /* renamed from: i */
    public final C65456a f188345i = new C65456a(this);

    /* renamed from: uq1.q$a */
    public static final class C65456a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C65455q f188346d;

        /* renamed from: uq1.q$a$a */
        public static final class C65457a implements C11385n {

            /* renamed from: d */
            public final /* synthetic */ C65455q f188347d;

            /* renamed from: e */
            public final /* synthetic */ List<C50401mh0> f188348e;

            /* renamed from: f */
            public final /* synthetic */ C98121d f188349f;

            public C65457a(C65455q qVar, List<? extends C50401mh0> list, C98121d dVar) {
                this.f188347d = qVar;
                this.f188348e = list;
                this.f188349f = dVar;
            }

            public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                C86709a0.m107524d().mo123470p(3870, this);
                String str2 = this.f188347d.f188344h;
                Log.m105924i(str2, "errType " + i + " , errCode " + i2 + ", errMsg " + str);
                C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderOplog");
                C60815y3 y3Var = (C60815y3) yVar;
                List<C50542nh0> l1 = y3Var.mo85733l1();
                C47350c cVar = y3Var.f173208h;
                C87412m.m108591d(cVar);
                C47465a aVar = cVar.f127055a.f127080a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderOplogRequest");
                LinkedList<C50401mh0> linkedList = ((C64313dg1) aVar).f182704e;
                C87412m.m108593f(linkedList, "rr!!.requestProtoBuf as …nderOplogRequest).cmdList");
                if (i == 0 && i2 == 0 && C87412m.m108589b(this.f188348e, linkedList)) {
                    Iterator<C50542nh0> it = l1.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        C50542nh0 next = it.next();
                        if (next.f138602d == 1 && next.f138603e == 0) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 != -1) {
                        Log.m105924i(this.f188347d.f188344h, "update coverImg succ");
                        C65455q qVar = this.f188347d;
                        String str3 = this.f188349f.field_fileUrl;
                        C87412m.m108593f(str3, "sceneResult.field_fileUrl");
                        C65455q.m77128e(qVar, str3, true);
                        this.f188347d.mo11853b(C65234n.OK);
                        return;
                    }
                    Log.m105924i(this.f188347d.f188344h, "update coverImg failed");
                    C65455q qVar2 = this.f188347d;
                    String str4 = this.f188349f.field_fileUrl;
                    C87412m.m108593f(str4, "sceneResult.field_fileUrl");
                    C65455q.m77128e(qVar2, str4, false);
                    this.f188347d.mo11853b(C65234n.Fail);
                }
            }
        }

        public C65456a(C65455q qVar) {
            this.f188346d = qVar;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            String str2;
            int i2 = i;
            C98121d dVar2 = dVar;
            C65234n nVar = C65234n.Fail;
            String str3 = this.f188346d.f188344h;
            Object[] objArr = new Object[3];
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i);
            if (dVar2 == null || (str2 = dVar.toString()) == null) {
                str2 = "null";
            }
            objArr[2] = str2;
            Log.m105925i(str3, "on cdn callback mediaId = %s, startRet = %d, sceneResult %s", objArr);
            if (i2 != 0) {
                Log.m105921e(this.f188346d.f188344h, "start failed : %d, media id is :%s", Integer.valueOf(i), str);
                if (i2 != -21005) {
                    C65455q.m77128e(this.f188346d, "", false);
                    this.f188346d.mo11853b(nVar);
                }
                return 0;
            }
            if (!Util.isNullOrNil(str) && dVar2 != null) {
                Log.m105925i(this.f188346d.f188344h, "retCode %d, fileId %s, url %s", Integer.valueOf(dVar2.field_retCode), dVar2.field_fileId, dVar2.field_fileUrl);
                if (dVar2.field_retCode != 0) {
                    C65455q.m77128e(this.f188346d, "", false);
                    this.f188346d.mo11853b(nVar);
                    return 0;
                } else if (C58961d.f168673a.mo84155b(this.f188346d.f188343g) != null) {
                    C65455q qVar = this.f188346d;
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MY_FINDER_LOCAL_COVER_IMG_STRING_SYNC, dVar2.field_fileUrl);
                    C64553md1 md12 = new C64553md1();
                    md12.f184297f = dVar2.field_fileUrl;
                    C50401mh0 mh02 = new C50401mh0();
                    mh02.f138028d = 1;
                    mh02.f138029e = C89349b.m111674a(md12.toByteArray());
                    List b = C26236u.m33719b(mh02);
                    C60815y3 y3Var = new C60815y3(qVar.f188343g, b, false, 0, (String) null, 28, (C8480h) null);
                    C86709a0.m107524d().mo123455a(3870, new C65457a(qVar, b, dVar2));
                    C86709a0.m107524d().mo123460f(y3Var);
                }
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return null;
        }
    }

    public C65455q(String str, String str2) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(str2, "userName");
        this.f188342f = str;
        this.f188343g = str2;
    }

    /* renamed from: e */
    public static final void m77128e(C65455q qVar, String str, boolean z) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MY_FINDER_LOCAL_COVER_IMG_STRING_SYNC;
        String str2 = qVar.f188344h;
        Log.m105924i(str2, "updateContact " + str + ", " + z);
        C58961d.C58963b bVar = C58961d.f168673a;
        C58969q b = bVar.mo84155b(qVar.f188343g);
        if (b != null) {
            if (z) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
            } else {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
            }
            bVar.mo84166o(b);
        }
    }

    /* renamed from: a */
    public void mo11852a() {
        if (!C86013q1.m106450k(this.f188342f)) {
            String str = this.f188344h;
            Log.m105918d(str, "path " + this.f188342f + " is not file");
            mo11853b(C65234n.Fail);
            return;
        }
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_FinderUploadCoverImageTask";
        gVar.f287662f = this.f188345i;
        gVar.field_mediaId = MD5Util.getMD5String(this.f188342f);
        gVar.field_fullpath = this.f188342f;
        gVar.field_thumbpath = C63289e.C63290a.m74586a(((C61381b) C86312j.m106911c(C61381b.class)).Xs0(), this.f188342f, (zr4) null, 2, (Object) null);
        gVar.field_talker = "";
        gVar.field_needStorage = true;
        gVar.field_fileType = 20201;
        gVar.field_appType = 100;
        gVar.field_bzScene = 1;
        gVar.f287673t = 60;
        gVar.f287674u = 300;
        gVar.field_priority = 2;
        ((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar);
    }

    /* renamed from: d */
    public String mo11854d() {
        return this.f188342f;
    }
}
