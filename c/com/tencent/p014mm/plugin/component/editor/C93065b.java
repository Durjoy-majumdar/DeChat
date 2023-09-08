package com.tencent.p014mm.plugin.component.editor;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.component.editor.C93062a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;
import p663qo.C101213l;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.component.editor.b */
public class C93065b {

    /* renamed from: d */
    public static final C93065b f268104d = new C93065b();

    /* renamed from: a */
    public List<C93067b> f268105a = new ArrayList();

    /* renamed from: b */
    public ConcurrentHashMap<String, C93062a> f268106b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public C98124g.C98125a f268107c = new C93066a();

    /* renamed from: com.tencent.mm.plugin.component.editor.b$a */
    public class C93066a implements C98124g.C98125a {
        public C93066a() {
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C93062a.C93064b bVar = C93062a.C93064b.OUT_OF_DATE;
            C93062a.C93064b bVar2 = C93062a.C93064b.ERR;
            C93062a aVar = C93065b.this.f268106b.get(str);
            if (aVar == null) {
                Log.m105920e("MicroMsg.editor.EditorCdnManager", "cdn info is null!!!");
                return 0;
            } else if (i != 0) {
                Log.m105921e("MicroMsg.editor.EditorCdnManager", "transfer err! startRet: %s. cdnInfo:%s", Integer.valueOf(i), aVar);
                if (-5103059 == i) {
                    C93065b.m117398a(C93065b.this, aVar, bVar);
                } else {
                    C93065b.m117398a(C93065b.this, aVar, bVar2);
                }
                C93065b.this.f268106b.remove(aVar.f268082b);
                return 0;
            } else {
                C101834rc0 rc02 = aVar.f268081a;
                if (cVar != null) {
                    aVar.f268087g = cVar.field_finishedLength;
                    aVar.f268086f = cVar.field_toltalLength;
                    C93065b.m117398a(C93065b.this, aVar, C93062a.C93064b.TRAN);
                } else if (dVar != null) {
                    if (dVar.field_retCode >= 0) {
                        if (aVar.f268090j) {
                            aVar.f268089i = dVar.field_aesKey;
                            aVar.f268088h = dVar.field_fileUrl;
                        }
                        if (str.endsWith("_t")) {
                            rc02.mo141255k(aVar.f268089i);
                            rc02.mo141256l(aVar.f268088h);
                        } else {
                            rc02.mo141253f(aVar.f268089i);
                            rc02.mo141254j(aVar.f268088h);
                            if (aVar.f268090j) {
                                if (aVar.f268083c == 4) {
                                    Log.m105925i("MicroMsg.editor.EditorCdnManager", "video stream, id:%s", dVar.field_videoFileId);
                                    rc02.mo141250Y(dVar.field_videoFileId);
                                }
                            }
                        }
                        Log.m105925i("MicroMsg.editor.EditorCdnManager", "transfer done, mediaId=%s completeResult.mediaId=%s aesKey=%s completeInfo=%s", str, dVar.f287609a, dVar.field_aesKey, dVar.toString());
                        C93065b.m117398a(C93065b.this, aVar, C93062a.C93064b.SUCC);
                    } else {
                        Log.m105921e("MicroMsg.editor.EditorCdnManager", "transfer err. mediaId=%s completeResult.mediaId=%s aesKey=%s completeInfo=%s", str, dVar.f287609a, dVar.field_aesKey, dVar.toString());
                        if (-5103059 == dVar.field_retCode) {
                            C93065b.m117398a(C93065b.this, aVar, bVar);
                        } else {
                            C93065b.m117398a(C93065b.this, aVar, bVar2);
                        }
                    }
                    C93065b.this.f268106b.remove(aVar.f268082b);
                }
                return 0;
            }
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.b$b */
    public interface C93067b {
        /* renamed from: a */
        void mo127454a(C93062a aVar, C93062a.C93064b bVar);
    }

    /* renamed from: a */
    public static void m117398a(C93065b bVar, C93062a aVar, C93062a.C93064b bVar2) {
        Iterator it = ((ArrayList) bVar.f268105a).iterator();
        while (it.hasNext()) {
            ((C93067b) it.next()).mo127454a(aVar, bVar2);
        }
    }

    /* renamed from: b */
    public void mo127510b(C93067b bVar) {
        if (!((ArrayList) this.f268105a).contains(bVar)) {
            ((ArrayList) this.f268105a).add(bVar);
        }
    }

    /* renamed from: c */
    public void mo127511c(C93062a aVar) {
        if (!this.f268106b.containsKey(aVar.f268082b)) {
            this.f268106b.put(aVar.f268082b, aVar);
            Class cls = C101213l.class;
            C98127h hVar = new C98127h();
            hVar.f287660d = "task_EditorUI";
            hVar.f287662f = this.f268107c;
            hVar.field_mediaId = aVar.f268082b;
            hVar.field_priority = 3;
            hVar.field_appType = CdnLogic.kGroupNoticeCDNAppType;
            hVar.field_bzScene = 2;
            if (aVar.f268090j) {
                hVar.f287661e = true;
                hVar.field_needStorage = true;
                hVar.field_totalLen = (int) aVar.f268086f;
                hVar.field_aesKey = aVar.f268089i;
                hVar.field_fileId = aVar.f268088h;
                hVar.field_isStreamMedia = aVar.f268083c == 4;
                hVar.field_fullpath = C86013q1.m106448i(aVar.f268084d, false);
                hVar.field_fileType = 20303;
                hVar.field_force_aeskeycdn = true;
                hVar.field_trysafecdn = false;
                ((C101213l) C86312j.m106911c(cls)).if0(hVar);
            } else {
                hVar.f287661e = false;
                hVar.field_totalLen = (int) aVar.f268086f;
                String str = aVar.f268088h;
                hVar.field_fileId = str;
                hVar.f287672s = str;
                hVar.f287705p0 = str;
                hVar.field_fullpath = C86013q1.m106448i(aVar.f268084d, false);
                String str2 = aVar.f268089i;
                hVar.field_aesKey = str2;
                hVar.f287700b1 = str2;
                hVar.field_needStorage = true;
                hVar.field_isStreamMedia = aVar.f268083c == 4;
                hVar.field_fileType = 20303;
                ((C101213l) C86312j.m106911c(cls)).xf0(hVar);
            }
            Log.m105925i("MicroMsg.editor.EditorCdnManager", "startTransfer. CdnInfo: %s", aVar);
        }
    }

    /* renamed from: d */
    public void mo127512d() {
        Class cls = C101213l.class;
        if (this.f268106b.size() > 0) {
            for (C93062a next : this.f268106b.values()) {
                if (next.f268090j) {
                    ((C101213l) C86312j.m106911c(cls)).gn0(next.f268082b);
                    Log.m105925i("MicroMsg.editor.EditorCdnManager", "cancelCurTask send: %s", next.f268082b);
                } else {
                    ((C101213l) C86312j.m106911c(cls)).Gm0(next.f268082b);
                    Log.m105925i("MicroMsg.editor.EditorCdnManager", "cancelCurTask recv: %s", next.f268082b);
                }
            }
            this.f268106b.clear();
        }
    }

    /* renamed from: e */
    public void mo127513e(String str) {
        Class cls = C101213l.class;
        C93062a aVar = this.f268106b.get(str);
        if (aVar != null) {
            if (aVar.f268090j) {
                ((C101213l) C86312j.m106911c(cls)).gn0(aVar.f268082b);
                Log.m105925i("MicroMsg.editor.EditorCdnManager", "cancelCurTask send: %s", aVar.f268082b);
                return;
            }
            ((C101213l) C86312j.m106911c(cls)).Gm0(aVar.f268082b);
            Log.m105925i("MicroMsg.editor.EditorCdnManager", "cancelCurTask recv: %s", aVar.f268082b);
        }
    }
}
