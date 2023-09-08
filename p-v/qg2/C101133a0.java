package qg2;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tmassistantsdk.downloadservice.Downloads;
import di3.C86312j;
import f40.C86709a0;
import java.io.ByteArrayOutputStream;
import java.util.LinkedList;
import java.util.List;
import og2.C100336e;
import og2.C100338g;
import og2.C100344n;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import p749xh.C66261f3;
import p753xp.C102704b;
import p867wp.C102479b;
import qg2.C47838o;

/* renamed from: qg2.a0 */
public class C101133a0 extends C101176x<C100344n> {

    /* renamed from: g */
    public C98124g.C98125a f296027g = new C101134a();

    /* renamed from: qg2.a0$a */
    public class C101134a implements C98124g.C98125a {

        /* renamed from: qg2.a0$a$a */
        public class C101135a implements C47838o.C47839a {

            /* renamed from: a */
            public final /* synthetic */ C100344n f296029a;

            /* renamed from: b */
            public final /* synthetic */ C98121d f296030b;

            public C101135a(C100344n nVar, C98121d dVar) {
                this.f296029a = nVar;
                this.f296030b = dVar;
            }

            /* renamed from: a */
            public void mo72581a(String str, int i, int i2) {
                Class cls = C100336e.class;
                Log.m105925i("MicroMsg.RecordMsgCDNService", "summersafecdn NetSceneCheckMd5 callback [%d, %d], [%s]", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i == 4 && i2 == 102) {
                    Log.m105925i("MicroMsg.RecordMsgCDNService", "summersafecdn NetSceneCheckMd5 MM_ERR_GET_AESKEY_FAILED old status[%d, %d, %d]", Integer.valueOf(this.f296029a.field_status), Integer.valueOf(this.f296029a.field_offset), Integer.valueOf(this.f296029a.field_totalLen));
                    C100344n nVar = this.f296029a;
                    nVar.field_offset = 0;
                    nVar.field_totalLen = 0;
                    nVar.field_status = 0;
                    ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).update(this.f296029a, C66261f3.COL_LOCALID);
                    C101133a0.this.mo140577g(this.f296029a, false);
                    return;
                }
                C100344n nVar2 = this.f296029a;
                nVar2.field_cdnKey = str;
                nVar2.field_cdnUrl = this.f296030b.field_fileId;
                ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).update(this.f296029a, C66261f3.COL_LOCALID);
                C101133a0.this.mo140622e();
            }
        }

        public C101134a() {
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            String str2 = str;
            int i2 = i;
            C98120c cVar2 = cVar;
            C98121d dVar2 = dVar;
            Class cls = C100336e.class;
            Log.m105927v("MicroMsg.RecordMsgCDNService", "cdn transfer callback, startRet[%d], mediaId[%s]", Integer.valueOf(i), str2);
            if (cVar2 != null) {
                Log.m105927v("MicroMsg.RecordMsgCDNService", "cdn transfer callback, mediaid[%s], totallen[%d], offset[%d]", cVar2.f287607a, Long.valueOf(cVar2.field_toltalLength), Long.valueOf(cVar2.field_finishedLength));
            }
            if (i2 == -21006 || i2 == -21005) {
                C101133a0.this.mo140622e();
                return 0;
            }
            C100344n qq = ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).mo140585qq(str2);
            if (qq == null) {
                Log.m105929w("MicroMsg.RecordMsgCDNService", "onCdnCallback info null, mediaId[%s]", str2);
                C101133a0.this.mo140622e();
                return 0;
            }
            if (i2 != 0) {
                Log.m105929w("MicroMsg.RecordMsgCDNService", "[record] tran fail, startRet[%d], mediaId[%s], type[%d]", Integer.valueOf(i), str2, Integer.valueOf(qq.field_type));
                if (-5103059 == i2) {
                    qq.field_status = 4;
                } else {
                    qq.field_status = 3;
                }
                qq.field_errCode = i2;
                ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).update(qq, C66261f3.COL_LOCALID);
                C101133a0.this.mo140622e();
            } else if (cVar2 != null) {
                qq.field_offset = (int) cVar2.field_finishedLength;
                qq.field_totalLen = (int) cVar2.field_toltalLength;
                qq.field_status = 1;
                ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).update(qq, C66261f3.COL_LOCALID);
            } else if (dVar2 != null) {
                Object[] objArr = new Object[8];
                objArr[0] = Integer.valueOf(dVar2.field_retCode);
                objArr[1] = Integer.valueOf(dVar2.field_UploadHitCacheType);
                objArr[2] = Boolean.valueOf(z);
                objArr[3] = Boolean.valueOf(dVar2.field_exist_whencheck);
                objArr[4] = Util.secPrint(dVar2.field_aesKey);
                objArr[5] = dVar2.field_filemd5;
                objArr[6] = str2;
                objArr[7] = Boolean.valueOf(1 == qq.field_type);
                Log.m105925i("MicroMsg.RecordMsgCDNService", "[record] summersafecdn cdnCallback upload attach by cdn, retCode:%d isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], aesKey[%s], md5[%s], mediaId:%s, isDownload:%b", objArr);
                int i3 = dVar2.field_retCode;
                if (i3 >= 0) {
                    qq.field_status = 2;
                    if (1 == qq.field_type) {
                        C101133a0 a0Var = C101133a0.this;
                        String str3 = qq.field_path + ".temp";
                        String str4 = qq.field_path;
                        a0Var.getClass();
                        if (Util.isNullOrNil(str3) || Util.isNullOrNil(str4)) {
                            Log.m105928w("MicroMsg.RecordMsgCDNService", "do rename and copy file, but path error");
                        } else {
                            C86009m1 m1Var = new C86009m1(str3);
                            C86009m1 m1Var2 = new C86009m1(str4);
                            if (m1Var.mo119967g()) {
                                Log.m105927v("MicroMsg.RecordMsgCDNService", "rename file suc:%b, old:%s, new:%s", Boolean.valueOf(m1Var.mo119988y(m1Var2)), str3, m1Var2);
                            }
                        }
                        C102479b Bg = ((C102704b) C86312j.m106911c(C102704b.class)).mo138748Bg(qq.field_path, 19, (String) null, (byte[]) null);
                        Log.m105919d("MicroMsg.RecordMsgCDNService", "recordCheckDup %s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", qq.field_path, Integer.valueOf(Bg.f301760a), Boolean.valueOf(Bg.f301761b), Boolean.FALSE, Boolean.valueOf(Bg.f301762c), Long.valueOf(Bg.f301763d));
                        ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).delete(qq, C66261f3.COL_LOCALID);
                    } else {
                        Log.m105925i("MicroMsg.RecordMsgCDNService", "transfer done, mediaid=%s, md5=%s", dVar2.f287609a, str2);
                        Log.m105919d("MicroMsg.RecordMsgCDNService", "transfer done, completeInfo=%s", dVar2);
                        Log.m105919d("MicroMsg.RecordMsgCDNService", "summersafecdn cdnCallback upload field_aesKey[%s], field_fileId[%s]", dVar2.field_aesKey, dVar2.field_fileId);
                        if (dVar.mo137409b()) {
                            Log.m105925i("MicroMsg.RecordMsgCDNService", "summersafecdn isUploadBySafeCDNWithMD5 field_upload_by_safecdn[%b], field_UploadHitCacheType[%d], crc[%d], aeskey[%s], newmd5[%s]", Boolean.valueOf(dVar2.field_upload_by_safecdn), Integer.valueOf(dVar2.field_UploadHitCacheType), Integer.valueOf(dVar2.field_filecrc), dVar2.field_aesKey, dVar2.field_mp4identifymd5);
                            C86709a0.m107529k().f251779b.mo123460f(new C47838o(dVar2.field_fileId, dVar2.field_filemd5, dVar2.field_mp4identifymd5, dVar2.field_filecrc, new C101135a(qq, dVar2)));
                            return 0;
                        }
                        qq.field_cdnKey = dVar2.field_aesKey;
                        qq.field_cdnUrl = dVar2.field_fileId;
                        ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).update(qq, C66261f3.COL_LOCALID);
                    }
                } else {
                    Log.m105921e("MicroMsg.RecordMsgCDNService", "transfer error, mediaid=%s, retCode:%d", dVar2.f287609a, Integer.valueOf(i3));
                    int i4 = dVar2.field_retCode;
                    if (-5103059 == i4) {
                        qq.field_status = 4;
                    } else {
                        qq.field_status = 3;
                    }
                    qq.field_errCode = i4;
                    ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).update(qq, C66261f3.COL_LOCALID);
                }
                C101133a0.this.mo140622e();
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

    public C101133a0() {
        super(1, Downloads.MAX_RETYR_AFTER);
    }

    /* renamed from: a */
    public void mo139220a(C100338g gVar) {
        if (gVar == null) {
            Log.m105928w("MicroMsg.RecordMsgCDNService", "cancelJob info null");
        } else if (gVar instanceof C100344n) {
            C100344n nVar = (C100344n) gVar;
            ((C101213l) C86312j.m106911c(C101213l.class)).gn0(nVar.field_mediaId);
            boolean Lo = ((C101136b0) ((C100336e) C86312j.m106911c(C100336e.class)).mo139410hi()).delete(nVar, C66261f3.COL_LOCALID);
            this.f296153e.remove(gVar);
            this.f296152d.remove(gVar.getKey());
            mo140622e();
            Log.m105925i("MicroMsg.RecordMsgCDNService", "cancelJob result:%s, mediaId:%s", Boolean.valueOf(Lo), nVar.field_mediaId);
        }
    }

    /* renamed from: b */
    public void mo139221b(C100338g gVar) {
        if (gVar instanceof C100344n) {
            mo140577g((C100344n) gVar, true);
        }
    }

    /* renamed from: d */
    public List<C100344n> mo139222d() {
        C101136b0 b0Var = (C101136b0) ((C100336e) C86312j.m106911c(C100336e.class)).mo139410hi();
        b0Var.getClass();
        LinkedList linkedList = new LinkedList();
        Cursor rawQuery = b0Var.f296032d.rawQuery("SELECT * FROM RecordCDNInfo WHERE status != 3 AND status != 4 AND status != 2 AND status != -1", (String[]) null, 2);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                C100344n nVar = new C100344n();
                nVar.convertFrom(rawQuery);
                linkedList.add(nVar);
            }
            rawQuery.close();
        }
        Log.m105919d("MicroMsg.RecordMsgCDNStorage", "get all finish, result count %d", Integer.valueOf(linkedList.size()));
        Log.m105925i("MicroMsg.RecordMsgCDNService", "get to do jobs, size %d", Integer.valueOf(linkedList.size()));
        return linkedList;
    }

    /* renamed from: g */
    public final void mo140577g(C100344n nVar, boolean z) {
        C100344n nVar2 = nVar;
        Class cls = C101213l.class;
        Log.m105925i("MicroMsg.RecordMsgCDNService", "summersafecdn doJob, md5:%s, mediaId:%s, jobType[%d], jobStatus[%s]", nVar2.field_dataId, nVar2.field_mediaId, Integer.valueOf(nVar2.field_type), Integer.valueOf(nVar2.field_status));
        if (-1 != nVar2.field_status) {
            C98124g gVar = new C98124g();
            gVar.f287660d = "task_RecordMsgCDNService";
            C98124g.C98125a aVar = this.f296027g;
            gVar.f287662f = aVar;
            gVar.field_mediaId = nVar2.field_mediaId;
            if (2 == nVar2.field_type) {
                gVar.f287661e = true;
                gVar.field_priority = 1;
                gVar.field_needStorage = false;
                gVar.field_totalLen = nVar2.field_totalLen;
                gVar.field_aesKey = nVar2.field_cdnKey;
                gVar.field_fileId = nVar2.field_cdnUrl;
                gVar.f287662f = aVar;
                gVar.field_fullpath = nVar2.field_path;
                gVar.field_fileType = nVar2.field_fileType;
                gVar.field_talker = nVar2.field_toUser;
                gVar.field_force_aeskeycdn = false;
                gVar.field_trysafecdn = true;
                gVar.field_enable_hitcheck = z;
                Log.m105925i("MicroMsg.RecordMsgCDNService", "[record] summersafecdn doJob TYPE_UPLOAD addSendTask field_force_aeskeycdn:%b, type[%d], aesKey[%s], fileId[%s], force_aeskeycdn[%b] trysafecdn[%b] enable_hitcheck[%b], mediaId:%s", false, Integer.valueOf(gVar.field_fileType), gVar.field_aesKey, gVar.field_fileId, Boolean.valueOf(gVar.field_force_aeskeycdn), Boolean.valueOf(gVar.field_trysafecdn), Boolean.valueOf(gVar.field_enable_hitcheck), gVar.field_mediaId);
                ((C101213l) C86312j.m106911c(cls)).if0(gVar);
            } else {
                gVar.f287661e = false;
                gVar.field_priority = 2;
                gVar.field_needStorage = false;
                gVar.field_totalLen = nVar2.field_totalLen;
                gVar.field_aesKey = nVar2.field_cdnKey;
                gVar.field_fileId = nVar2.field_cdnUrl;
                gVar.f287662f = aVar;
                gVar.field_fullpath = nVar2.field_path + ".temp";
                gVar.field_fileType = nVar2.field_fileType;
                if (!Util.isNullOrNil(nVar2.field_tpdataurl)) {
                    gVar.field_fileType = 19;
                    gVar.field_authKey = nVar2.field_tpauthkey;
                    gVar.field_aesKey = nVar2.field_tpaeskey;
                    gVar.f287672s = nVar2.field_tpdataurl;
                    gVar.field_fileId = "";
                }
                Log.m105925i("MicroMsg.RecordMsgCDNService", "[record] summersafecdn doJob TYPE_DOWNLOAD addSendTask field_force_aeskeycdn:%b, type[%d], aesKey[%s], fileId[%s], force_aeskeycdn[%b] trysafecdn[%b] enable_hitcheck[%b], mediaId:%s", Boolean.valueOf(gVar.field_force_aeskeycdn), Integer.valueOf(gVar.field_fileType), gVar.field_aesKey, gVar.field_fileId, Boolean.valueOf(gVar.field_force_aeskeycdn), Boolean.valueOf(gVar.field_trysafecdn), Boolean.valueOf(gVar.field_enable_hitcheck), gVar.field_mediaId);
                ((C101213l) C86312j.m106911c(cls)).xf0(gVar);
            }
            Log.m105919d("MicroMsg.RecordMsgCDNService", "summersafecdn doJob, isSend:%B totallen:%d, aseKey:%s, url[%s], fullPath[%s], fileType[%d], enable_hitcheck[%b], force_aeskeycdn[%b]", Boolean.valueOf(gVar.f287661e), Integer.valueOf(gVar.field_totalLen), gVar.field_aesKey, gVar.field_fileId, gVar.field_fullpath, Integer.valueOf(gVar.field_fileType), Boolean.valueOf(gVar.field_enable_hitcheck), Boolean.valueOf(gVar.field_force_aeskeycdn));
        }
    }
}
