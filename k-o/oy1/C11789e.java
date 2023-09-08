package oy1;

import android.content.Context;
import android.net.Uri;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import di3.C86312j;
import java.io.ByteArrayOutputStream;
import ob0.C47350c;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p500dy.C97560f;
import sw1.C48478n;
import ww1.C53211a;
import ww1.C53212b;
import ww1.C53216f;
import z04.C112551y;

/* renamed from: oy1.e */
public final class C11789e implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C11785d f34501d;

    /* renamed from: e */
    public final /* synthetic */ Context f34502e;

    public C11789e(C11785d dVar, Context context) {
        this.f34501d = dVar;
        this.f34502e = context;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        String str2;
        C86001b0 q;
        String dVar2;
        C11785d dVar3 = this.f34501d;
        Context context = this.f34502e;
        dVar3.getClass();
        Object[] objArr = new Object[4];
        objArr[0] = str;
        boolean z2 = true;
        objArr[1] = Integer.valueOf(i);
        String str3 = "null";
        if (cVar == null || (str2 = cVar.toString()) == null) {
            str2 = str3;
        }
        objArr[2] = str2;
        if (!(dVar == null || (dVar2 = dVar.toString()) == null)) {
            str3 = dVar2;
        }
        objArr[3] = str3;
        Log.m105919d("MiniGameVideoShareProcessor", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", objArr);
        if (i == -21005) {
            Log.m105925i("MiniGameVideoShareProcessor", "duplicate request, ignore this request, media id is %s", str);
        } else if (i != 0) {
            Log.m105921e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, upload failed start failed : %d, media id is :%s", Integer.valueOf(i), str);
            C11781a aVar = dVar3.f34484c;
            if (aVar != null) {
                aVar.mo11674a("upload start failed");
            }
        } else if (cVar == null && dVar != null) {
            int i2 = dVar.field_retCode;
            if (i2 != 0) {
                Log.m105921e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, upload failed cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str, Integer.valueOf(i2), dVar);
                C11781a aVar2 = dVar3.f34484c;
                if (aVar2 != null) {
                    aVar2.mo11674a("upload failed");
                }
            } else {
                Log.m105924i("MiniGameVideoShareProcessor", "gamelog.share , share video ,sceneResult.videoUrl =  " + dVar.field_fileUrl + " sceneResult.thumbUrl =  " + dVar.field_thumbUrl);
                String str4 = dVar.field_fileUrl;
                String str5 = dVar.field_thumbUrl;
                if (!dVar3.f34486e) {
                    if (str4 == null || str4.length() == 0) {
                        Log.m105920e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, upload failed videoUrl is null");
                        C11781a aVar3 = dVar3.f34484c;
                        if (aVar3 != null) {
                            aVar3.mo11674a("videoUrl is null upload failed");
                        }
                    } else {
                        if (!(str5 == null || str5.length() == 0)) {
                            z2 = false;
                        }
                        if (z2) {
                            Log.m105920e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, upload failed thumbUrl is null");
                            C11781a aVar4 = dVar3.f34484c;
                            if (aVar4 != null) {
                                aVar4.mo11674a("thumbUrl is null upload failed");
                            }
                        } else {
                            String n = (!C112551y.m153819s(str5, C113600ck.f339986i, false) && C112551y.m153819s(str5, "http", false)) ? C112551y.m153814n(str5, "http", C113600ck.f339986i, false) : str5;
                            C94554a Z40 = ((C97560f) C86312j.m106911c(C97560f.class)).Z40(dVar3.f34482a.f38919c);
                            Uri n2 = C116299g2.m163858n(dVar3.f34482a.f38919c);
                            String path = n2.getPath();
                            if (path != null) {
                                String k = C116299g2.m163855k(path, false, false);
                                if (!n2.getPath().equals(k)) {
                                    n2 = n2.buildUpon().path(k).build();
                                }
                            }
                            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
                            long j = 0;
                            if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
                                j = q.f250473c;
                            }
                            int i3 = (int) j;
                            Log.m105924i("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, doShareCgi appid = " + dVar3.f34482a.f38917a + " videoUrl = " + str4 + " thumbUrl = " + str5 + "  duration = " + Z40.f273443a + "width = " + Z40.f273445c + "   height = " + Z40.f273446d + "  size= " + i3);
                            C53211a aVar5 = new C53211a();
                            C53216f fVar = new C53216f();
                            fVar.f148451d = dVar3.f34482a.f38917a;
                            fVar.f148453f = str4;
                            fVar.f148454g = n;
                            fVar.f148455h = (int) ((float) Math.ceil((double) (((float) Z40.f273443a) / ((float) 1000))));
                            fVar.f148456i = Z40.f273445c;
                            fVar.f148457j = Z40.f273446d;
                            fVar.f148458n = i3;
                            C48478n.C13793h hVar = dVar3.f34482a;
                            String str6 = hVar.f38921e;
                            String str7 = "";
                            if (str6 == null) {
                                str6 = str7;
                            }
                            fVar.f148459o = str6;
                            String str8 = hVar.f38922f;
                            if (str8 != null) {
                                str7 = str8;
                            }
                            fVar.f148460p = str7;
                            fVar.f148461q = hVar.f38920d;
                            aVar5.f148437d = fVar;
                            aVar5.f148438e = MD5Util.getMD5String(dVar3.f34482a.f38919c + System.currentTimeMillis());
                            C47350c.C47352b bVar = new C47350c.C47352b();
                            bVar.f127066a = aVar5;
                            bVar.f127067b = new C53212b();
                            bVar.f127068c = "/cgi-bin/mmgame-bin/addwxagvideo";
                            bVar.f127069d = 20452;
                            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C11784c(dVar3, n, context));
                        }
                    }
                }
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
