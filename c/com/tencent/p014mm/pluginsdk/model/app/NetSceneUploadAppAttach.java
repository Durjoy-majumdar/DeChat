package com.tencent.p014mm.pluginsdk.model.app;

import ad0.C0033t;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.modelcdntran.C92796u;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.pluginsdk.model.app.C96766k1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import fd3.C97867h;
import fd3.C97872k;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import ld3.C46850c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89137b0;
import ob0.y$$d;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p206nj.C76861g;
import p663qo.C101213l;
import p680ru.C101464l;
import p740wo.C53193b;
import te3.sm4;
import te3.tm4;

/* renamed from: com.tencent.mm.pluginsdk.model.app.NetSceneUploadAppAttach */
public class NetSceneUploadAppAttach extends C117747y implements C1311n {

    /* renamed from: A */
    public IListener f283438A = new IListener<RecogQBarOfImageFileResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 812146647;
        }

        public boolean callback(IEvent iEvent) {
            String str;
            C68070l.C68072b u;
            RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
            String str2 = "";
            if (recogQBarOfImageFileResultEvent.f265015d.f265016a.equals(NetSceneUploadAppAttach.this.f283441f.field_fileFullPath)) {
                C96874n1 n1Var = C96874n1.f283849a;
                String d = n1Var.mo135195d(recogQBarOfImageFileResultEvent);
                int b = n1Var.mo135193b(recogQBarOfImageFileResultEvent);
                try {
                    str = URLEncoder.encode(d, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    Log.printErrStackTrace("MicroMsg.NetSceneUploadAppAttach", e, str2, new Object[0]);
                    str = str2;
                }
                if (NetSceneUploadAppAttach.this.f283457y == 1) {
                    C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(NetSceneUploadAppAttach.this.f283441f.field_msgInfoId);
                    C0033t tVar = new C0033t();
                    tVar.mo32a("20toUser", NetSceneUploadAppAttach.this.f283443h + ",");
                    tVar.mo32a("21source", "4,");
                    tVar.mo32a("22qrUrl", str + ",");
                    StringBuilder sb = new StringBuilder();
                    C98121d dVar = NetSceneUploadAppAttach.this.f283458z;
                    sb.append(dVar == null ? str2 : dVar.field_filemd5);
                    sb.append(",");
                    tVar.mo32a("23md5", sb.toString());
                    StringBuilder sb4 = new StringBuilder();
                    C98121d dVar2 = NetSceneUploadAppAttach.this.f283458z;
                    sb4.append(dVar2 == null ? str2 : dVar2.field_fileId);
                    sb4.append(",");
                    tVar.mo32a("24cdnFileId", sb4.toString());
                    StringBuilder sb5 = new StringBuilder();
                    C98121d dVar3 = NetSceneUploadAppAttach.this.f283458z;
                    sb5.append(dVar3 == null ? str2 : dVar3.field_aesKey);
                    sb5.append(",");
                    tVar.mo32a("25cdnAesKey", sb5.toString());
                    if (b002.mo101020w3() && (u = C68070l.C68072b.m80422u(b002.getContent(), (String) null)) != null) {
                        str2 = u.f195562d;
                    }
                    tVar.mo32a("26appip", str2 + ",");
                    tVar.mo32a("27toUsersCount", ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(NetSceneUploadAppAttach.this.f283443h) + ",");
                    tVar.mo32a("28codeType", b + ",");
                    tVar.mo32a("29msgid", Long.valueOf(b002.mo108774y2()));
                    Log.m105924i("MicroMsg.NetSceneUploadAppAttach", "report qrCodeImgChatting(13628): " + tVar.mo34c());
                    ((C101464l) C86312j.m106911c(C101464l.class)).mo140962S8(13628, tVar.toString());
                }
                NetSceneUploadAppAttach.this.f283438A.dead();
            }
            return false;
        }
    };

    /* renamed from: d */
    public C47350c f283439d;

    /* renamed from: e */
    public C11385n f283440e;

    /* renamed from: f */
    public C72683d f283441f = null;

    /* renamed from: g */
    public C68070l.C68072b f283442g = null;

    /* renamed from: h */
    public String f283443h;

    /* renamed from: i */
    public long f283444i = -1;

    /* renamed from: j */
    public String f283445j = null;

    /* renamed from: n */
    public boolean f283446n = true;

    /* renamed from: o */
    public boolean f283447o = true;

    /* renamed from: p */
    public String f283448p;

    /* renamed from: q */
    public int f283449q = 0;

    /* renamed from: r */
    public long f283450r = 0;

    /* renamed from: s */
    public String f283451s = "";

    /* renamed from: t */
    public boolean f283452t = false;

    /* renamed from: u */
    public boolean f283453u = false;

    /* renamed from: v */
    public C97867h.C97868a f283454v = new C96755a();

    /* renamed from: w */
    public C98124g.C98125a f283455w = new C96756b();

    /* renamed from: x */
    public boolean f283456x = false;

    /* renamed from: y */
    public int f283457y = 0;

    /* renamed from: z */
    public C98121d f283458z;

    /* renamed from: com.tencent.mm.pluginsdk.model.app.NetSceneUploadAppAttach$a */
    public class C96755a implements C97867h.C97868a {
        public C96755a() {
        }

        /* renamed from: a */
        public void mo127086a(int i, String str) {
            Log.m105921e("MicroMsg.NetSceneUploadAppAttach", "onUploadFailure, errCode:%s, uploadID:%s", Integer.valueOf(i), str);
            C72695v.m85055H(NetSceneUploadAppAttach.this.f283441f.systemRowid);
            C72684e vx02 = C72709y1.vx0();
            NetSceneUploadAppAttach netSceneUploadAppAttach = NetSceneUploadAppAttach.this;
            vx02.get(netSceneUploadAppAttach.f283444i, netSceneUploadAppAttach.f283441f);
            NetSceneUploadAppAttach.this.f283441f.field_signature = "";
            Log.m105929w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback startRet[%d] rowid[%d], reset signature ret[%b]", -1, Long.valueOf(NetSceneUploadAppAttach.this.f283444i), Boolean.valueOf(C72709y1.vx0().update(NetSceneUploadAppAttach.this.f283441f, new String[0])));
            NetSceneUploadAppAttach netSceneUploadAppAttach2 = NetSceneUploadAppAttach.this;
            netSceneUploadAppAttach2.f283440e.onSceneEnd(3, i, "", netSceneUploadAppAttach2);
        }

        /* renamed from: b */
        public void mo127087b(C97872k.C97873a aVar) {
            C97872k.C97873a aVar2 = aVar;
            Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "upload success, field_aesKey:%s, fileId:%s, fileLen:%s", aVar2.f287110b, aVar2.f287109a, Long.valueOf(aVar2.f287112d));
            Util.nowMilliSecond();
            long j = NetSceneUploadAppAttach.this.f283450r;
            C98121d dVar = new C98121d();
            dVar.field_aesKey = aVar2.f287110b;
            dVar.field_fileId = aVar2.f287109a;
            dVar.field_filemd5 = aVar2.f287111c;
            dVar.field_fileLength = aVar2.f287112d;
            C92796u Dx0 = C92779i0.Dx0();
            String str = NetSceneUploadAppAttach.this.f283441f.field_fileFullPath;
            Dx0.getClass();
            dVar.field_filecrc = CdnLogic.calcFileCrc32(C86013q1.m106448i(str, false));
            NetSceneUploadAppAttach netSceneUploadAppAttach = NetSceneUploadAppAttach.this;
            netSceneUploadAppAttach.f283441f.field_status = 199;
            boolean kD = C72709y1.vx0().update(netSceneUploadAppAttach.f283441f, new String[0]);
            if (!kD) {
                Log.m105920e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + kD);
                netSceneUploadAppAttach.f283449q = -10000 - C76861g.m92658a();
                netSceneUploadAppAttach.f283440e.onSceneEnd(3, 0, "", netSceneUploadAppAttach);
                return;
            }
            C72683d dVar2 = netSceneUploadAppAttach.f283441f;
            C72695v.m85080v(dVar2.field_msgInfoId, dVar2.field_mediaSvrId, dVar, true);
            C72683d dVar3 = netSceneUploadAppAttach.f283441f;
            C97625j3.m125815e().mo123460f(new C96766k1(dVar3.field_msgInfoId, true, dVar, new C96771o1(netSceneUploadAppAttach), netSceneUploadAppAttach.f283448p, dVar3));
        }

        /* renamed from: c */
        public void mo127088c(float f, long j) {
            NetSceneUploadAppAttach.this.f283441f.field_lastModifyTime = Util.nowSecond();
            C72683d dVar = NetSceneUploadAppAttach.this.f283441f;
            if (dVar.field_offset < j) {
                dVar.field_offset = j;
            }
            boolean kD = C72709y1.vx0().update(NetSceneUploadAppAttach.this.f283441f, new String[0]);
            if (!kD) {
                Log.m105920e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + kD);
                NetSceneUploadAppAttach.this.f283449q = -10000 - C76861g.m92658a();
                NetSceneUploadAppAttach netSceneUploadAppAttach = NetSceneUploadAppAttach.this;
                netSceneUploadAppAttach.f283440e.onSceneEnd(3, -1, "", netSceneUploadAppAttach);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.NetSceneUploadAppAttach$b */
    public class C96756b implements C98124g.C98125a {

        /* renamed from: com.tencent.mm.pluginsdk.model.app.NetSceneUploadAppAttach$b$a */
        public class C96757a implements C46850c.C46851a {

            /* renamed from: a */
            public final /* synthetic */ int f283462a;

            /* renamed from: b */
            public final /* synthetic */ C98121d f283463b;

            public C96757a(int i, C98121d dVar) {
                this.f283462a = i;
                this.f283463b = dVar;
            }

            /* renamed from: a */
            public void mo72061a(String str, String str2, String str3, String str4, String str5, String str6, long j) {
                Object[] objArr = new Object[8];
                objArr[0] = str;
                boolean z = true;
                objArr[1] = str2;
                objArr[2] = Util.secPrint(str3);
                objArr[3] = Util.secPrint(str4);
                objArr[4] = Util.secPrint(str5);
                objArr[5] = Util.secPrint(str6);
                if (NetSceneUploadAppAttach.this.f283442g != null) {
                    z = false;
                }
                objArr[6] = Boolean.valueOf(z);
                objArr[7] = Boolean.valueOf(NetSceneUploadAppAttach.this.f283447o);
                Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "summerbig NetSceneCheckBigFileUpload exist_whencheck call back new errMsg:[%s], md5[%s], aesKey[%s], signature[%s], aesKey[%s], signature[%s], amc null[%b], enableHitcheck[%b]", objArr);
                if (Util.isNullOrNil(str4)) {
                    C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(NetSceneUploadAppAttach.this.f283441f.field_msgInfoId);
                    b002.mo100991d(5);
                    ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
                    C72963f4 f4Var = new C72963f4();
                    f4Var.mo108733M2(C75604z3.m90843o(NetSceneUploadAppAttach.this.f283443h));
                    f4Var.mo108749c3(NetSceneUploadAppAttach.this.f283443h);
                    f4Var.mo108732L2(str);
                    f4Var.setType(10000);
                    f4Var.mo100991d(6);
                    f4Var.mo108740T2(0);
                    ((C72972g4) C97625j3.m125812b().mo105911z()).my0(f4Var);
                    return;
                }
                C96756b bVar = C96756b.this;
                C72683d dVar = NetSceneUploadAppAttach.this.f283441f;
                dVar.field_signature = str4;
                dVar.field_fakeAeskey = str5;
                dVar.field_fakeSignature = str6;
                bVar.mo135030a(this.f283462a, this.f283463b);
            }
        }

        /* renamed from: com.tencent.mm.pluginsdk.model.app.NetSceneUploadAppAttach$b$b */
        public class C96758b implements C46850c.C46851a {

            /* renamed from: a */
            public final /* synthetic */ int f283465a;

            /* renamed from: com.tencent.mm.pluginsdk.model.app.NetSceneUploadAppAttach$b$b$a */
            public class C96759a implements Runnable {
                public C96759a() {
                }

                public void run() {
                    Log.m105924i("MicroMsg.NetSceneUploadAppAttach", "summerbig doScene again");
                    NetSceneUploadAppAttach netSceneUploadAppAttach = NetSceneUploadAppAttach.this;
                    netSceneUploadAppAttach.doScene(netSceneUploadAppAttach.dispatcher(), NetSceneUploadAppAttach.this.f283440e);
                }
            }

            public C96758b(int i) {
                this.f283465a = i;
            }

            /* renamed from: a */
            public void mo72061a(String str, String str2, String str3, String str4, String str5, String str6, long j) {
                Object[] objArr = new Object[8];
                objArr[0] = str;
                boolean z = true;
                objArr[1] = str2;
                objArr[2] = Util.secPrint(str3);
                objArr[3] = Util.secPrint(str4);
                objArr[4] = Util.secPrint(str5);
                objArr[5] = Util.secPrint(str6);
                if (NetSceneUploadAppAttach.this.f283442g != null) {
                    z = false;
                }
                objArr[6] = Boolean.valueOf(z);
                objArr[7] = Boolean.valueOf(NetSceneUploadAppAttach.this.f283447o);
                Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "summerbig NetSceneCheckBigFileUpload not exist_whencheck call back new errMsg[%s], md5[%s], aesKey[%s], signature[%s], aesKey[%s], signature[%s], amc null[%b], enableHitcheck[%b]", objArr);
                if (Util.isNullOrNil(str4)) {
                    C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(NetSceneUploadAppAttach.this.f283441f.field_msgInfoId);
                    b002.mo100991d(5);
                    ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
                    C72963f4 f4Var = new C72963f4();
                    f4Var.mo108733M2(C75604z3.m90843o(NetSceneUploadAppAttach.this.f283443h));
                    f4Var.mo108749c3(NetSceneUploadAppAttach.this.f283443h);
                    f4Var.mo108732L2(str);
                    f4Var.setType(10000);
                    f4Var.mo100991d(6);
                    f4Var.mo108740T2(0);
                    ((C72972g4) C97625j3.m125812b().mo105911z()).my0(f4Var);
                    return;
                }
                C72683d dVar = NetSceneUploadAppAttach.this.f283441f;
                dVar.field_signature = str4;
                dVar.field_fakeAeskey = str5;
                dVar.field_fakeSignature = str6;
                dVar.field_lastModifyTime = Util.nowMilliSecond();
                C68070l.C68072b bVar = NetSceneUploadAppAttach.this.f283442g;
                if (bVar != null) {
                    bVar.f195622s = str2;
                    bVar.f195524R = str3;
                    bVar.f195594l = (int) j;
                    C72963f4 b003 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(NetSceneUploadAppAttach.this.f283441f.field_msgInfoId);
                    b003.mo108732L2(C68070l.C68072b.m80420s(NetSceneUploadAppAttach.this.f283442g, (String) null, (C98121d) null));
                    ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b003.getMsgId(), b003);
                }
                NetSceneUploadAppAttach.this.f283447o = false;
                boolean kD = C72709y1.vx0().update(NetSceneUploadAppAttach.this.f283441f, new String[0]);
                if (!kD) {
                    Log.m105920e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + kD);
                    NetSceneUploadAppAttach.this.f283449q = -10000 - C76861g.m92658a();
                    NetSceneUploadAppAttach netSceneUploadAppAttach = NetSceneUploadAppAttach.this;
                    netSceneUploadAppAttach.f283440e.onSceneEnd(3, this.f283465a, "", netSceneUploadAppAttach);
                    return;
                }
                C86709a0.m107525e().postToWorker(new C96759a());
            }
        }

        /* renamed from: com.tencent.mm.pluginsdk.model.app.NetSceneUploadAppAttach$b$c */
        public class C96760c implements C96766k1.C96767a {

            /* renamed from: a */
            public final /* synthetic */ C98121d f283468a;

            /* renamed from: com.tencent.mm.pluginsdk.model.app.NetSceneUploadAppAttach$b$c$a */
            public class C96761a implements Runnable {
                public C96761a() {
                }

                public void run() {
                    NetSceneUploadAppAttach netSceneUploadAppAttach = NetSceneUploadAppAttach.this;
                    netSceneUploadAppAttach.f283447o = false;
                    netSceneUploadAppAttach.f283441f.field_createTime = C31543z5.m39451a();
                    NetSceneUploadAppAttach.this.f283441f.field_lastModifyTime = Util.nowSecond();
                    C72683d dVar = NetSceneUploadAppAttach.this.f283441f;
                    dVar.field_offset = 0;
                    dVar.field_status = 101;
                    Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", Boolean.valueOf(NetSceneUploadAppAttach.this.f283447o), Boolean.valueOf(C72709y1.vx0().update(NetSceneUploadAppAttach.this.f283441f, new String[0])), Long.valueOf(NetSceneUploadAppAttach.this.f283441f.field_createTime));
                    NetSceneUploadAppAttach netSceneUploadAppAttach2 = NetSceneUploadAppAttach.this;
                    netSceneUploadAppAttach2.doScene(netSceneUploadAppAttach2.dispatcher(), NetSceneUploadAppAttach.this.f283440e);
                }
            }

            public C96760c(C98121d dVar) {
                this.f283468a = dVar;
            }

            /* renamed from: a */
            public void mo135032a(int i, int i2) {
                Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra NetSceneSendAppMsgForCdn callback %d,%d", Integer.valueOf(i), Integer.valueOf(i2));
                if (i == 4 && i2 == 102) {
                    C86709a0.m107525e().postToWorker(new C96761a());
                    return;
                }
                if (i == 0 && i2 == 0) {
                    NetSceneUploadAppAttach.this.mo135029j1(this.f283468a);
                }
                NetSceneUploadAppAttach netSceneUploadAppAttach = NetSceneUploadAppAttach.this;
                netSceneUploadAppAttach.f283440e.onSceneEnd(i, i2, "", netSceneUploadAppAttach);
            }
        }

        public C96756b() {
        }

        /* renamed from: a */
        public final void mo135030a(int i, C98121d dVar) {
            NetSceneUploadAppAttach.this.f283441f.field_status = 199;
            boolean kD = C72709y1.vx0().update(NetSceneUploadAppAttach.this.f283441f, new String[0]);
            if (!kD) {
                Log.m105920e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + kD);
                NetSceneUploadAppAttach.this.f283449q = -10000 - C76861g.m92658a();
                NetSceneUploadAppAttach netSceneUploadAppAttach = NetSceneUploadAppAttach.this;
                netSceneUploadAppAttach.f283440e.onSceneEnd(3, i, "", netSceneUploadAppAttach);
                return;
            }
            C72683d dVar2 = NetSceneUploadAppAttach.this.f283441f;
            C72695v.m85080v(dVar2.field_msgInfoId, dVar2.field_mediaSvrId, dVar, true);
            NetSceneUploadAppAttach netSceneUploadAppAttach2 = NetSceneUploadAppAttach.this;
            C72683d dVar3 = netSceneUploadAppAttach2.f283441f;
            C97625j3.m125815e().mo123460f(new C96766k1(dVar3.field_msgInfoId, true, dVar, new C96760c(dVar), netSceneUploadAppAttach2.f283448p, dVar3));
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            int i2 = i;
            C98120c cVar2 = cVar;
            C98121d dVar2 = dVar;
            Object[] objArr = new Object[7];
            objArr[0] = NetSceneUploadAppAttach.this.f283451s;
            objArr[1] = Integer.valueOf(i);
            objArr[2] = cVar2;
            objArr[3] = dVar2;
            objArr[4] = Boolean.valueOf(cVar2 != null);
            objArr[5] = Boolean.valueOf(dVar2 != null);
            objArr[6] = Boolean.valueOf(z);
            Log.m105919d("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s], progressing[%b], finish[%b], onlyCheckExist[%b]", objArr);
            C72684e vx02 = C72709y1.vx0();
            NetSceneUploadAppAttach netSceneUploadAppAttach = NetSceneUploadAppAttach.this;
            vx02.get(netSceneUploadAppAttach.f283444i, netSceneUploadAppAttach.f283441f);
            if (i2 == -21005) {
                Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", NetSceneUploadAppAttach.this.f283451s);
                return 0;
            } else if (i2 != 0) {
                C72695v.m85055H(NetSceneUploadAppAttach.this.f283441f.systemRowid);
                C72684e vx03 = C72709y1.vx0();
                NetSceneUploadAppAttach netSceneUploadAppAttach2 = NetSceneUploadAppAttach.this;
                vx03.get(netSceneUploadAppAttach2.f283444i, netSceneUploadAppAttach2.f283441f);
                NetSceneUploadAppAttach.this.f283441f.field_signature = "";
                Log.m105929w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback startRet[%d] rowid[%d], reset signature ret[%b]", Integer.valueOf(i), Long.valueOf(NetSceneUploadAppAttach.this.f283444i), Boolean.valueOf(C72709y1.vx0().update(NetSceneUploadAppAttach.this.f283441f, new String[0])));
                NetSceneUploadAppAttach netSceneUploadAppAttach3 = NetSceneUploadAppAttach.this;
                netSceneUploadAppAttach3.f283440e.onSceneEnd(3, i2, "", netSceneUploadAppAttach3);
                return 0;
            } else {
                C72683d dVar3 = NetSceneUploadAppAttach.this.f283441f;
                long j = dVar3.field_status;
                if (j == 105) {
                    Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "attach upload has paused, status:%d, rowid:%d", Long.valueOf(j), Long.valueOf(NetSceneUploadAppAttach.this.f283444i));
                    ((C101213l) C86312j.m106911c(C101213l.class)).gn0(NetSceneUploadAppAttach.this.f283451s);
                    C11385n nVar = NetSceneUploadAppAttach.this.f283440e;
                    nVar.onSceneEnd(3, i2, "attach  has paused, status" + NetSceneUploadAppAttach.this.f283441f.field_status, NetSceneUploadAppAttach.this);
                    return 0;
                } else if (cVar2 != null) {
                    dVar3.field_lastModifyTime = Util.nowSecond();
                    NetSceneUploadAppAttach.this.f283441f.field_offset = cVar2.field_finishedLength;
                    boolean kD = C72709y1.vx0().update(NetSceneUploadAppAttach.this.f283441f, new String[0]);
                    if (!kD) {
                        Log.m105920e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:" + kD);
                        NetSceneUploadAppAttach.this.f283449q = -10000 - C76861g.m92658a();
                        NetSceneUploadAppAttach netSceneUploadAppAttach4 = NetSceneUploadAppAttach.this;
                        netSceneUploadAppAttach4.f283440e.onSceneEnd(3, i2, "", netSceneUploadAppAttach4);
                    }
                    return 0;
                } else {
                    if (dVar2 != null) {
                        int i3 = dVar2.field_retCode;
                        if (i3 != 0) {
                            Log.m105921e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback sceneResult.retCode :%d arg[%s] info[%s]", Integer.valueOf(i3), dVar2.field_arg, dVar2.field_transInfo, "", "", "", "", "", "", "", dVar2.f287610b);
                            C72695v.m85055H(NetSceneUploadAppAttach.this.f283441f.systemRowid);
                            C72684e vx04 = C72709y1.vx0();
                            NetSceneUploadAppAttach netSceneUploadAppAttach5 = NetSceneUploadAppAttach.this;
                            vx04.get(netSceneUploadAppAttach5.f283444i, netSceneUploadAppAttach5.f283441f);
                            NetSceneUploadAppAttach.this.f283441f.field_signature = "";
                            Log.m105929w("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback startRet[%d] sceneResult.field_retCode[%d], rowid[%d], reset signature ret[%b]", Integer.valueOf(i), Integer.valueOf(dVar2.field_retCode), Long.valueOf(NetSceneUploadAppAttach.this.f283444i), Boolean.valueOf(C72709y1.vx0().update(NetSceneUploadAppAttach.this.f283441f, new String[0])));
                            NetSceneUploadAppAttach netSceneUploadAppAttach6 = NetSceneUploadAppAttach.this;
                            netSceneUploadAppAttach6.f283440e.onSceneEnd(3, dVar2.field_retCode, "", netSceneUploadAppAttach6);
                        } else {
                            Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback upload attach by cdn, isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], signature[%s]", Integer.valueOf(dVar2.field_UploadHitCacheType), Boolean.valueOf(z), Boolean.valueOf(dVar2.field_exist_whencheck), Util.secPrint(NetSceneUploadAppAttach.this.f283441f.field_signature));
                            if (!z) {
                                mo135030a(i2, dVar2);
                            } else if (dVar2.field_exist_whencheck) {
                                C89137b0 e = C97625j3.m125815e();
                                NetSceneUploadAppAttach netSceneUploadAppAttach7 = NetSceneUploadAppAttach.this;
                                e.mo123460f(new C46850c(netSceneUploadAppAttach7.f283442g, netSceneUploadAppAttach7.f283441f.field_fileFullPath, netSceneUploadAppAttach7.f283443h, new C96757a(i2, dVar2)));
                            } else {
                                Log.m105924i("MicroMsg.NetSceneUploadAppAttach", "summerbig upload check but not exist");
                                C89137b0 e2 = C97625j3.m125815e();
                                NetSceneUploadAppAttach netSceneUploadAppAttach8 = NetSceneUploadAppAttach.this;
                                e2.mo123460f(new C46850c((C68070l.C68072b) null, netSceneUploadAppAttach8.f283441f.field_fileFullPath, netSceneUploadAppAttach8.f283443h, new C96758b(i2)));
                            }
                        }
                    }
                    return 0;
                }
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

    public NetSceneUploadAppAttach(long j, String str, String str2) {
        this.f283444i = j;
        this.f283445j = str;
        this.f283448p = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new sm4();
        bVar.f127067b = new tm4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/uploadappattach";
        bVar.f127069d = 220;
        bVar.f127070e = 105;
        bVar.f127071f = 1000000105;
        this.f283439d = bVar.mo72403a();
        Log.m105925i("MicroMsg.NetSceneUploadAppAttach", "summerbig new NetSceneUploadAppAttach rowid[%d], emoticonmd5[%s], stack[%s]", Long.valueOf(j), str, Util.getStack());
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x068f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0692  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x06b5  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x06c6  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0810  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0821  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x049d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x04ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doScene(com.tencent.p014mm.network.C114770g r33, ob0.C11385n r34) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            java.lang.Class<gt.k> r3 = p158gt.C98201k.class
            r4 = r34
            r0.f283440e = r4
            r4 = 0
            r0.f283452t = r4
            com.tencent.mm.pluginsdk.model.app.d r5 = new com.tencent.mm.pluginsdk.model.app.d
            r5.<init>()
            r0.f283441f = r5
            com.tencent.mm.pluginsdk.model.app.e r5 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            long r6 = r0.f283444i
            com.tencent.mm.pluginsdk.model.app.d r8 = r0.f283441f
            boolean r5 = r5.get((long) r6, r8)
            r7 = -1
            java.lang.String r8 = "MicroMsg.NetSceneUploadAppAttach"
            if (r5 == 0) goto L_0x098d
            com.tencent.mm.pluginsdk.model.app.d r5 = r0.f283441f
            if (r5 != 0) goto L_0x002d
            goto L_0x098d
        L_0x002d:
            long r9 = r5.field_status
            r11 = 101(0x65, double:5.0E-322)
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x005f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = p206nj.C76861g.m92660c()
            r1.append(r2)
            java.lang.String r2 = " summerbig get field_status failed rowid:"
            r1.append(r2)
            long r2 = r0.f283444i
            r1.append(r2)
            java.lang.String r2 = " status:"
            r1.append(r2)
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r2 = r2.field_status
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            return r7
        L_0x005f:
            long r9 = r0.f283450r
            r11 = 0
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0071
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f283450r = r9
            com.tencent.mm.pluginsdk.model.app.d r5 = r0.f283441f
            long r9 = r5.field_offset
        L_0x0071:
            r5 = 6
            java.lang.Object[] r9 = new java.lang.Object[r5]
            long r13 = r0.f283444i
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r9[r4] = r10
            com.tencent.mm.pluginsdk.model.app.d r10 = r0.f283441f
            java.lang.String r13 = r10.field_fileFullPath
            r14 = 1
            r9[r14] = r13
            long r11 = r10.field_totalLen
            java.lang.Long r10 = java.lang.Long.valueOf(r11)
            r11 = 2
            r9[r11] = r10
            com.tencent.mm.pluginsdk.model.app.d r10 = r0.f283441f
            boolean r10 = r10.field_isUpload
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r12 = 3
            r9[r12] = r10
            com.tencent.mm.pluginsdk.model.app.d r10 = r0.f283441f
            int r10 = r10.field_isUseCdn
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13 = 4
            r9[r13] = r10
            com.tencent.mm.pluginsdk.model.app.d r10 = r0.f283441f
            long r5 = r10.field_type
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 5
            r9[r6] = r5
            java.lang.String r5 = "summerbig doScene rowid[%d], fileFullPath[%s], totalLen[%d],isUpload[%b], isUseCdn[%b], type[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r9)
            com.tencent.mm.pluginsdk.model.app.d r5 = r0.f283441f
            java.lang.String r5 = r5.field_appId
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r9 = 8
            if (r5 == 0) goto L_0x00dc
            java.lang.String r5 = "summerbig doScene checkArgs : appId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r5)
            com.tencent.mm.pluginsdk.model.app.d r5 = r0.f283441f
            long r4 = r5.field_type
            int r17 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r17 == 0) goto L_0x00dc
            r17 = 6
            int r19 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r19 == 0) goto L_0x00dc
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f283449q = r1
            return r7
        L_0x00dc:
            java.lang.Class<qo.l> r4 = p663qo.C101213l.class
            com.tencent.mm.pluginsdk.model.app.d r5 = r0.f283441f
            long r6 = r5.field_type
            java.lang.String r5 = "summerbig cdntra not use cdn flag:%b getCdnInfo:%d"
            java.lang.String r15 = "summerbig cdntra read msg info failed msgId[%d], rowid[%d], createtime[%d], len[%d], status[%d], upload[%b], useCdn[%d], mediaId[%s]"
            r20 = 9
            java.lang.String r12 = ""
            java.lang.String r11 = " "
            java.lang.String r14 = "summerbig cdntra amc.cdnAttachUrl[%s], amc.aesKey[%s], amc.filemd5[%s], amc.type[%d]"
            java.lang.String r13 = "summerbig cdntra parse content xml failed"
            java.lang.String r9 = "summerbig cdntra thumb[%s][%d] Too Big Not Use CDN TRANS"
            r24 = 7
            r22 = 8
            int r25 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r25 == 0) goto L_0x047e
            int r25 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r25 != 0) goto L_0x0105
            goto L_0x047e
        L_0x0105:
            boolean r6 = fd3.C32025c.m39609a()
            if (r6 != 0) goto L_0x0116
            java.lang.String r4 = "isAllow2UseCdnWithXLab = false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
        L_0x0111:
            r10 = r2
            r26 = r5
            goto L_0x01c9
        L_0x0116:
            di3.d r6 = di3.C86312j.m106911c(r4)
            qo.l r6 = (p663qo.C101213l) r6
            r7 = 4
            boolean r6 = r6.dm0(r7)
            if (r6 != 0) goto L_0x014d
            com.tencent.mm.pluginsdk.model.app.d r6 = r0.f283441f
            int r6 = r6.field_isUseCdn
            r10 = 1
            if (r6 == r10) goto L_0x014d
            r6 = 2
            java.lang.Object[] r10 = new java.lang.Object[r6]
            di3.d r4 = di3.C86312j.m106911c(r4)
            qo.l r4 = (p663qo.C101213l) r4
            boolean r4 = r4.dm0(r7)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r6 = 0
            r10[r6] = r4
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f283441f
            int r4 = r4.field_isUseCdn
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r10[r6] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r5, r10)
            goto L_0x0111
        L_0x014d:
            eb0.c r6 = eb0.C97625j3.m125812b()
            g62.l r6 = r6.mo105911z()
            com.tencent.mm.pluginsdk.model.app.d r7 = r0.f283441f
            r10 = r2
            long r1 = r7.field_msgInfoId
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            com.tencent.mm.storage.f4 r1 = r6.b00(r1)
            long r6 = r1.getMsgId()
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            r27 = r4
            r26 = r5
            long r4 = r2.field_msgInfoId
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x01d3
            r2 = 8
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r4 = 0
            r1[r4] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r4 = r2.systemRowid
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r4 = 1
            r1[r4] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r4 = r2.field_createTime
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r4 = 2
            r1[r4] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r4 = r2.field_totalLen
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r4 = 3
            r1[r4] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r4 = r2.field_status
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r4 = 4
            r1[r4] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            boolean r2 = r2.field_isUpload
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4 = 5
            r1[r4] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            int r2 = r2.field_isUseCdn
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 6
            r1[r4] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            java.lang.String r2 = r2.field_mediaId
            r1[r24] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r15, r1)
            r1 = 0
            r0.f283443h = r1
        L_0x01c9:
            r30 = r3
            r28 = r9
            r9 = r14
            r29 = r15
            r15 = r13
            goto L_0x046a
        L_0x01d3:
            java.lang.String r2 = r1.mo108768t()
            r0.f283443h = r2
            java.lang.String r2 = r1.mo108765s2()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x01f8
            di3.d r2 = di3.C86312j.m106911c(r3)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            java.lang.String r4 = r1.mo108765s2()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            java.lang.String r2 = r2.mo127161CZ(r4)
            goto L_0x01f9
        L_0x01f8:
            r2 = r12
        L_0x01f9:
            long r4 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r5 = (int) r4
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f283441f
            java.lang.String r4 = r4.field_fileFullPath
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            int r4 = (int) r6
            r6 = 262144(0x40000, float:3.67342E-40)
            if (r5 < r6) goto L_0x0222
            r6 = 2
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r4 = 0
            r1[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r4 = 1
            r1[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r9, r1)
            r30 = r3
            r28 = r9
            r29 = r15
            goto L_0x027d
        L_0x0222:
            com.tencent.mm.pluginsdk.model.app.d r6 = r0.f283441f
            long r6 = r6.field_createTime
            r28 = r9
            java.lang.String r9 = r1.mo108768t()
            r29 = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r12)
            r30 = r3
            r31 = r4
            long r3 = r0.f283444i
            r15.append(r3)
            java.lang.String r3 = r15.toString()
            java.lang.String r4 = "upattach"
            java.lang.String r3 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r4, r6, r9, r3)
            r0.f283451s = r3
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.mm.pluginsdk.model.app.d r3 = r0.f283441f
            long r6 = r3.field_createTime
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r6 = 0
            r4[r6] = r3
            java.lang.String r3 = r0.f283451s
            r7 = 1
            r4[r7] = r3
            java.lang.String r3 = "summerbig cdntra genClientId field_createTime[%d], useCdnTransClientId[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r3, r4)
            java.lang.String r3 = r0.f283451s
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0281
            java.lang.Object[] r1 = new java.lang.Object[r7]
            long r2 = r0.f283444i
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r6] = r2
            java.lang.String r2 = "summerbig cdntra genClientId failed not use cdn rowid:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r2, r1)
        L_0x027d:
            r15 = r13
            r9 = r14
            goto L_0x046a
        L_0x0281:
            gi.g r3 = new gi.g
            r3.<init>()
            java.lang.String r4 = "task_NetSceneUploadAppAttach"
            r3.f287660d = r4
            java.lang.String r4 = r1.getContent()
            java.lang.String r6 = r1.mo108768t()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r6)
            if (r6 == 0) goto L_0x02c1
            java.lang.String r6 = r1.getContent()
            int r6 = eb0.C75604z3.m90848t(r6)
            r7 = -1
            if (r6 == r7) goto L_0x02c1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = r1.getContent()
            r4.append(r7)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            r7 = 2
            int r6 = r6 + r7
            java.lang.String r4 = r4.substring(r6)
            java.lang.String r4 = r4.trim()
        L_0x02c1:
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r4)
            r6 = 0
            com.tencent.mm.message.l$b r4 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r4, r6)
            r0.f283442g = r4
            if (r4 == 0) goto L_0x030c
            r6 = 4
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r6 = r4.f195500J
            r9 = 0
            r7[r9] = r6
            java.lang.String r4 = r4.f195524R
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r4)
            r6 = 1
            r7[r6] = r4
            com.tencent.mm.message.l$b r4 = r0.f283442g
            java.lang.String r6 = r4.f195622s
            r9 = 2
            r7[r9] = r6
            int r4 = r4.f195582i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 3
            r7[r6] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r14, r7)
            com.tencent.mm.message.l$b r4 = r0.f283442g
            java.lang.String r6 = r4.f195500J
            r3.field_fileId = r6
            java.lang.String r6 = r4.f195524R
            r3.field_aesKey = r6
            java.lang.String r6 = r4.f195622s
            r3.field_filemd5 = r6
            int r6 = r4.f195626t
            if (r6 != 0) goto L_0x030a
            int r4 = r4.f195594l
            r6 = 26214400(0x1900000, float:5.2897246E-38)
            if (r4 <= r6) goto L_0x030f
        L_0x030a:
            r4 = 1
            goto L_0x0310
        L_0x030c:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r13)
        L_0x030f:
            r4 = 0
        L_0x0310:
            if (r4 == 0) goto L_0x0314
            r6 = 7
            goto L_0x0315
        L_0x0314:
            r6 = 5
        L_0x0315:
            r7 = 0
            r3.field_appType = r7
            gi.g$a r7 = r0.f283455w
            r3.f287662f = r7
            java.lang.String r7 = r0.f283451s
            r3.field_mediaId = r7
            com.tencent.mm.pluginsdk.model.app.d r7 = r0.f283441f
            java.lang.String r9 = r7.field_fileFullPath
            r3.field_fullpath = r9
            r3.field_thumbpath = r2
            r3.field_fileType = r6
            if (r4 == 0) goto L_0x0333
            java.lang.String r6 = r7.field_signature
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            goto L_0x0334
        L_0x0333:
            r6 = r12
        L_0x0334:
            r3.field_svr_signature = r6
            if (r4 == 0) goto L_0x0341
            com.tencent.mm.pluginsdk.model.app.d r6 = r0.f283441f
            java.lang.String r6 = r6.field_signature
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            goto L_0x0342
        L_0x0341:
            r6 = 0
        L_0x0342:
            r3.field_onlycheckexist = r6
            com.tencent.mm.pluginsdk.model.app.d r6 = r0.f283441f
            java.lang.String r7 = r6.field_fakeAeskey
            r3.field_fake_bigfile_signature_aeskey = r7
            java.lang.String r6 = r6.field_fakeSignature
            r3.field_fake_bigfile_signature = r6
            java.lang.String r6 = r1.mo108768t()
            r3.field_talker = r6
            r6 = 2
            r3.field_priority = r6
            r6 = r31
            r3.field_totalLen = r6
            r7 = 0
            r3.field_needStorage = r7
            r3.field_isStreamMedia = r7
            boolean r9 = r0.f283447o
            r3.field_enable_hitcheck = r9
            java.lang.String r1 = r1.mo108768t()
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
            r3.field_chattype = r1
            r3.field_force_aeskeycdn = r7
            r1 = 1
            r3.field_trysafecdn = r1
            r3.field_bzScene = r7
            boolean r1 = com.tencent.p014mm.modelcdntran.C1297x.m1388c()
            if (r1 == 0) goto L_0x037f
            if (r4 == 0) goto L_0x037f
            r1 = 1
            goto L_0x0380
        L_0x037f:
            r1 = 0
        L_0x0380:
            r3.field_use_multithread = r1
            r4 = 17
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7 = 0
            r4[r7] = r1
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f283441f
            r15 = r13
            r9 = r14
            long r13 = r1.field_msgInfoId
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r7 = 1
            r4[r7] = r1
            java.lang.String r1 = r3.field_fullpath
            r7 = 2
            r4[r7] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r6 = 3
            r4[r6] = r1
            r1 = 4
            r4[r1] = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r2 = 5
            r4[r2] = r1
            java.lang.String r1 = r0.f283451s
            r2 = 6
            r4[r2] = r1
            int r1 = r3.field_fileType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r24] = r1
            boolean r1 = r3.field_enable_hitcheck
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 8
            r4[r2] = r1
            r1 = 9
            boolean r2 = r3.field_onlycheckexist
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4[r1] = r2
            r1 = 10
            boolean r2 = r3.field_force_aeskeycdn
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4[r1] = r2
            r1 = 11
            boolean r2 = r3.field_trysafecdn
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4[r1] = r2
            r1 = 12
            java.lang.String r2 = r3.field_aesKey
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r2)
            r4[r1] = r2
            r1 = 13
            java.lang.String r2 = r3.field_filemd5
            r4[r1] = r2
            r1 = 14
            java.lang.String r2 = r3.field_svr_signature
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r2)
            r4[r1] = r2
            r1 = 15
            java.lang.String r2 = r3.field_fake_bigfile_signature_aeskey
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r2)
            r4[r1] = r2
            r1 = 16
            java.lang.String r2 = r3.field_fake_bigfile_signature
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r2)
            r4[r1] = r2
            java.lang.String r1 = "summerbig cdntra checkUseCdn field_use_multithread[%s], msgId:%d file[%s][%d] thumb[%s][%d], useCdnTransClientId[%s], fileType[%d], enable_hitcheck[%b], onlycheckexist[%b] force_aeskeycdn[%b] trysafecdn[%b] aeskey[%s], md5[%s], signature[%s], faeskey[%s], fsignature[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r4)
            di3.d r1 = di3.C86312j.m106911c(r27)
            qo.l r1 = (p663qo.C101213l) r1
            boolean r1 = r1.if0(r3)
            if (r1 != 0) goto L_0x042e
            java.lang.String r1 = "summerbig cdntra addSendTask failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            r0.f283451s = r12
            goto L_0x046a
        L_0x042e:
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f283441f
            int r2 = r1.field_isUseCdn
            r3 = 1
            if (r2 == r3) goto L_0x046d
            r1.field_isUseCdn = r3
            com.tencent.mm.pluginsdk.model.app.e r1 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            boolean r1 = r1.update(r2, r4)
            if (r1 != 0) goto L_0x046d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "summerbig checkUseCdn update info ret:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f283449q = r1
            ob0.n r1 = r0.f283440e
            r2 = 3
            r3 = -1
            r1.onSceneEnd(r2, r3, r12, r0)
        L_0x046a:
            r1 = 1
            r4 = 0
            goto L_0x0499
        L_0x046d:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r0.f283451s
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "summerbig checkUseCdn ret true useCdnTransClientId[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r2)
            r16 = 1
            goto L_0x049b
        L_0x047e:
            r10 = r2
            r30 = r3
            r26 = r5
            r28 = r9
            r9 = r14
            r29 = r15
            r1 = 1
            r4 = 0
            r15 = r13
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r2[r4] = r3
            java.lang.String r3 = "summerbig cdntra cdn not support Emoji or voiceremind now type:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r2)
        L_0x0499:
            r16 = 0
        L_0x049b:
            if (r16 == 0) goto L_0x04ae
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r2 = r0.f283444i
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r4] = r2
            java.lang.String r2 = "summerbig doScene cdntra use cdn return -1 for onGYNetEnd client rowid:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r2, r1)
            return r4
        L_0x04ae:
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f283441f
            long r1 = r1.field_type
            r5 = 8
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x06a1
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r3 != 0) goto L_0x04be
            goto L_0x06a1
        L_0x04be:
            di3.d r1 = di3.C86312j.m106911c(r10)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_parallel_upload_file_android
            int r1 = r1.mo58779Qe(r2, r4)
            r2 = 1
            if (r2 != r1) goto L_0x04cf
            r1 = 1
            goto L_0x04d0
        L_0x04cf:
            r1 = 0
        L_0x04d0:
            if (r1 != 0) goto L_0x04d8
            java.lang.String r1 = "NOT ALLOW USE PARALLEL UPLOAD APP ATTACH"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            goto L_0x0551
        L_0x04d8:
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r2 = r2.field_msgInfoId
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4 r1 = r1.b00(r2)
            long r2 = r1.getMsgId()
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f283441f
            long r4 = r4.field_msgInfoId
            java.lang.String r6 = "#parallel-upload# read msg info failed msgId[%d], rowid[%d], createtime[%d], len[%d], status[%d], upload[%b], useCdn[%d], mediaId[%s]"
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0556
            r2 = 8
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r3 = 0
            r1[r3] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r2 = r2.systemRowid
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r2 = r2.field_createTime
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            r1[r3] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r2 = r2.field_totalLen
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 3
            r1[r3] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r2 = r2.field_status
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 4
            r1[r3] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            boolean r2 = r2.field_isUpload
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 5
            r1[r3] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            int r2 = r2.field_isUseCdn
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 6
            r1[r3] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            java.lang.String r2 = r2.field_mediaId
            r1[r24] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r6, r1)
            r1 = 0
            r0.f283443h = r1
        L_0x0551:
            r3 = 1
            r16 = 0
            goto L_0x06b2
        L_0x0556:
            java.lang.String r2 = r1.mo108765s2()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0575
            di3.d r2 = di3.C86312j.m106911c(r30)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            java.lang.String r1 = r1.mo108765s2()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            java.lang.String r1 = r2.mo127161CZ(r1)
            goto L_0x0576
        L_0x0575:
            r1 = r12
        L_0x0576:
            fd3.h r2 = new fd3.h
            r2.<init>()
            com.tencent.mm.pluginsdk.model.app.d r3 = r0.f283441f
            if (r3 != 0) goto L_0x0582
            r4 = 0
            goto L_0x0584
        L_0x0582:
            long r4 = r3.field_msgInfoId
        L_0x0584:
            r2.f287089h = r4
            fd3.h$a r4 = r0.f283454v
            r2.f287084c = r4
            r4 = 3
            r2.f287083b = r4
            r4 = 5
            r2.f287082a = r4
            r2.f287086e = r1
            java.lang.String r1 = r3.field_fileFullPath
            r2.f287085d = r1
            fd3.d r1 = new fd3.d
            r1.<init>()
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.l r3 = r3.mo105911z()
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f283441f
            long r4 = r4.field_msgInfoId
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            com.tencent.mm.storage.f4 r3 = r3.b00(r4)
            long r4 = r3.getMsgId()
            com.tencent.mm.pluginsdk.model.app.d r7 = r0.f283441f
            long r13 = r7.field_msgInfoId
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0614
            r4 = 8
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r5 = 0
            r3[r5] = r4
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f283441f
            long r4 = r4.systemRowid
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 1
            r3[r5] = r4
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f283441f
            long r4 = r4.field_createTime
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 2
            r3[r5] = r4
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f283441f
            long r4 = r4.field_totalLen
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f283441f
            long r4 = r4.field_status
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 4
            r3[r5] = r4
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f283441f
            boolean r4 = r4.field_isUpload
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 5
            r3[r5] = r4
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f283441f
            int r4 = r4.field_isUseCdn
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 6
            r3[r5] = r4
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f283441f
            java.lang.String r4 = r4.field_mediaId
            r3[r24] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r6, r3)
            r3 = 0
            r0.f283443h = r3
            goto L_0x068a
        L_0x0614:
            java.lang.String r4 = r3.getContent()
            java.lang.String r5 = r3.mo108768t()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85820U5(r5)
            if (r5 == 0) goto L_0x064a
            java.lang.String r5 = r3.getContent()
            int r5 = eb0.C75604z3.m90848t(r5)
            r6 = -1
            if (r5 == r6) goto L_0x064a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.getContent()
            r4.append(r3)
            r4.append(r11)
            java.lang.String r3 = r4.toString()
            r4 = 2
            int r5 = r5 + r4
            java.lang.String r3 = r3.substring(r5)
            java.lang.String r4 = r3.trim()
        L_0x064a:
            r3 = 0
            com.tencent.mm.message.l$b r4 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r4, r3)
            r0.f283442g = r4
            if (r4 == 0) goto L_0x0657
            int r3 = r4.f195626t
            if (r3 != 0) goto L_0x065d
        L_0x0657:
            int r3 = r4.f195594l
            r5 = 26214400(0x1900000, float:5.2897246E-38)
            if (r3 <= r5) goto L_0x0686
        L_0x065d:
            r3 = 4
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r3 = r4.f195500J
            r6 = 0
            r5[r6] = r3
            java.lang.String r3 = r4.f195524R
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r3)
            r4 = 1
            r5[r4] = r3
            com.tencent.mm.message.l$b r3 = r0.f283442g
            java.lang.String r4 = r3.f195622s
            r6 = 2
            r5[r6] = r4
            int r3 = r3.f195582i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 3
            r5[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r9, r5)
            com.tencent.mm.message.l$b r3 = r0.f283442g
            java.lang.String r3 = r3.f195524R
            goto L_0x068b
        L_0x0686:
            r3 = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
        L_0x068a:
            r3 = r12
        L_0x068b:
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f283441f
            if (r4 == 0) goto L_0x0692
            java.lang.String r4 = r4.field_signature
            goto L_0x0693
        L_0x0692:
            r4 = 0
        L_0x0693:
            r1.f287060h = r4
            r1.f287061i = r3
            r1.mo137189b(r2)
            r3 = 1
            r0.f283452t = r3
            r1 = 1
            r16 = 0
            goto L_0x06b3
        L_0x06a1:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r16 = 0
            r4[r16] = r1
            java.lang.String r1 = "summerbig parallel-upload support Emoji or voiceremind now type:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r1, r4)
        L_0x06b2:
            r1 = 0
        L_0x06b3:
            if (r1 == 0) goto L_0x06c6
            java.lang.Object[] r1 = new java.lang.Object[r3]
            long r2 = r0.f283444i
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r16] = r2
            java.lang.String r2 = "summerbig doScene use parallel-upload return -1 for onGYNetEnd client rowid:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r2, r1)
            return r16
        L_0x06c6:
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f283441f
            long r1 = r1.field_type
            r3 = 8
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x06d7
            java.lang.String r1 = "checkUseCdnForEmoji only for emoji"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            goto L_0x07df
        L_0x06d7:
            com.tencent.mm.modelcdntran.CdnTransportService r1 = com.tencent.p014mm.modelcdntran.C92779i0.Ex0()
            r2 = 4
            boolean r1 = r1.mo126959q(r2)
            if (r1 != 0) goto L_0x070c
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f283441f
            int r1 = r1.field_isUseCdn
            r3 = 1
            if (r1 == r3) goto L_0x070d
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.mm.modelcdntran.CdnTransportService r4 = com.tencent.p014mm.modelcdntran.C92779i0.Ex0()
            boolean r2 = r4.mo126959q(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r4 = 0
            r1[r4] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            int r2 = r2.field_isUseCdn
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r3] = r2
            r2 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r2, r1)
            goto L_0x07e0
        L_0x070c:
            r3 = 1
        L_0x070d:
            di3.d r1 = di3.C86312j.m106911c(r10)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_uploadappattach_for_emoji_by_cdn
            r4 = 0
            int r1 = r1.mo58779Qe(r2, r4)
            if (r1 == r3) goto L_0x071e
            goto L_0x07e0
        L_0x071e:
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r2 = r2.field_msgInfoId
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4 r1 = r1.b00(r2)
            long r2 = r1.getMsgId()
            com.tencent.mm.pluginsdk.model.app.d r4 = r0.f283441f
            long r4 = r4.field_msgInfoId
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0798
            r2 = 8
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r3 = 0
            r1[r3] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r2 = r2.systemRowid
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r2 = r2.field_createTime
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            r1[r3] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r2 = r2.field_totalLen
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 3
            r1[r3] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r2 = r2.field_status
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 4
            r1[r3] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            boolean r2 = r2.field_isUpload
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 5
            r1[r3] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            int r2 = r2.field_isUseCdn
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 6
            r1[r3] = r2
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            java.lang.String r2 = r2.field_mediaId
            r1[r24] = r2
            r2 = r29
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r2, r1)
            r1 = 0
            r0.f283443h = r1
            goto L_0x07df
        L_0x0798:
            java.lang.String r2 = r1.mo108765s2()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x07b6
            di3.d r2 = di3.C86312j.m106911c(r30)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            java.lang.String r1 = r1.mo108765s2()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            java.lang.String r12 = r2.mo127161CZ(r1)
        L_0x07b6:
            long r1 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
            int r2 = (int) r1
            if (r2 == 0) goto L_0x07fa
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r2 < r1) goto L_0x07c4
            r1 = 2
            r4 = 0
            goto L_0x07fc
        L_0x07c4:
            java.lang.Class<z51.g> r1 = z51.C39315g.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            z51.g r1 = (z51.C39315g) r1
            zc3.a r1 = r1.mo58035cm()
            java.lang.String r2 = r0.f283445j
            i61.h r1 = (i61.C98602h) r1
            com.tencent.mm.storage.emotion.EmojiInfo r1 = r1.mo137999G(r2)
            if (r1 != 0) goto L_0x07e2
            java.lang.String r1 = "emjiInfo should not be null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
        L_0x07df:
            r3 = 1
        L_0x07e0:
            r4 = 0
            goto L_0x080c
        L_0x07e2:
            r2 = 1
            r0.f283453u = r2
            java.lang.String r2 = "upload emoji by cdn."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            ml.k r2 = new ml.k
            com.tencent.mm.pluginsdk.model.app.n1 r3 = new com.tencent.mm.pluginsdk.model.app.n1
            r3.<init>(r0)
            r4 = 0
            r2.<init>(r1, r4, r3)
            r3 = 1
            r16 = 1
            goto L_0x080e
        L_0x07fa:
            r4 = 0
            r1 = 2
        L_0x07fc:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            r2 = r28
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r2, r1)
        L_0x080c:
            r16 = 0
        L_0x080e:
            if (r16 == 0) goto L_0x0821
            java.lang.Object[] r1 = new java.lang.Object[r3]
            long r2 = r0.f283444i
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r4] = r2
            java.lang.String r2 = "summerbig doScene cdntra emoji use cdn return -1 for onGYNetEnd client rowid:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r2, r1)
            return r4
        L_0x0821:
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f283441f
            long r2 = r1.field_netTimes
            r4 = 3200(0xc80, double:1.581E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x084f
            long r1 = r1.systemRowid
            com.tencent.p014mm.pluginsdk.model.app.C72695v.m85055H(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = p206nj.C76861g.m92660c()
            r1.append(r2)
            java.lang.String r2 = " summerbig doScene info.field_netTimes > DOSCENE_LIMIT SET ERROR! rowid:"
            r1.append(r2)
            long r2 = r0.f283444i
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            r1 = -1
            return r1
        L_0x084f:
            r4 = 1
            long r2 = r2 + r4
            r1.field_netTimes = r2
            java.lang.String r1 = r1.field_clientAppDataId
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x086c
            java.lang.String r1 = "summerbig doScene checkArgs : clientAppDataId is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f283449q = r1
            r1 = -1
            return r1
        L_0x086c:
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f283441f
            long r2 = r1.field_totalLen
            r4 = 26214400(0x1900000, double:1.29516345E-316)
            r6 = 0
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x095d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x087f
            goto L_0x095d
        L_0x087f:
            java.lang.String r1 = r1.field_fileFullPath
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0897
            java.lang.String r1 = "summerbig doScene checkArgs : fileFullPath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f283449q = r1
            r1 = -1
            return r1
        L_0x0897:
            r1 = -1
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            java.lang.String r2 = r2.field_fileFullPath
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r3 = (int) r2
            r2 = 26214400(0x1900000, float:5.2897246E-38)
            if (r3 <= r2) goto L_0x08b3
            java.lang.String r2 = "summerbig doScene doScene : file is too large"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r2)
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r2 = r2.systemRowid
            com.tencent.p014mm.pluginsdk.model.app.C72695v.m85055H(r2)
            return r1
        L_0x08b3:
            java.lang.String r1 = r0.f283445j
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x08c9
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f283441f
            java.lang.String r2 = r1.field_fileFullPath
            long r3 = r1.field_offset
            int r1 = (int) r3
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r1 = com.tencent.p014mm.vfs.C86013q1.m106433O(r2, r1, r3)
            goto L_0x08d7
        L_0x08c9:
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f283441f
            java.lang.String r2 = r1.field_fileFullPath
            long r3 = r1.field_offset
            int r1 = (int) r3
            r3 = 32768(0x8000, float:4.5918E-41)
            byte[] r1 = com.tencent.p014mm.vfs.C86013q1.m106433O(r2, r1, r3)
        L_0x08d7:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r1)
            if (r2 == 0) goto L_0x08ed
            java.lang.String r1 = "summerbig doScene doScene : data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f283449q = r1
            r1 = -1
            return r1
        L_0x08ed:
            ob0.c r2 = r0.f283439d
            ob0.c$c r2 = r2.f127055a
            pe3.a r2 = r2.f127080a
            te3.sm4 r2 = (te3.sm4) r2
            com.tencent.mm.pluginsdk.model.app.d r3 = r0.f283441f
            java.lang.String r4 = r3.field_appId
            r2.f299433d = r4
            long r4 = r3.field_sdkVer
            int r5 = (int) r4
            r2.f299434e = r5
            java.lang.String r4 = r3.field_clientAppDataId
            r2.f299435f = r4
            long r3 = r3.field_type
            int r4 = (int) r3
            r2.f299441o = r4
            java.lang.String r3 = eb0.C75592q0.m90789s()
            r2.f299436g = r3
            com.tencent.mm.pluginsdk.model.app.d r3 = r0.f283441f
            long r4 = r3.field_totalLen
            int r5 = (int) r4
            r2.f299437h = r5
            long r3 = r3.field_offset
            int r4 = (int) r3
            r2.f299438i = r4
            java.lang.String r3 = r0.f283445j
            if (r3 == 0) goto L_0x0941
            boolean r4 = r0.f283446n
            if (r4 == 0) goto L_0x0941
            r2.f299442p = r3
            r2.f299437h = r5
            r1 = 0
            r2.f299439j = r1
            te3.qv3 r3 = new te3.qv3
            r3.<init>()
            byte[] r4 = new byte[r1]
            r3.mo73350k(r4)
            r2.f299440n = r3
            r0.f283446n = r1
            ob0.c r1 = r0.f283439d
            r3 = r33
            int r1 = r0.dispatch(r3, r1, r0)
            return r1
        L_0x0941:
            r3 = r33
            int r4 = r1.length
            r2.f299439j = r4
            te3.qv3 r4 = new te3.qv3
            r4.<init>()
            r4.mo73350k(r1)
            r2.f299440n = r4
            java.lang.String r1 = r0.f283445j
            if (r1 == 0) goto L_0x0956
            r2.f299442p = r1
        L_0x0956:
            ob0.c r1 = r0.f283439d
            int r1 = r0.dispatch(r3, r1, r0)
            return r1
        L_0x095d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "summerbig doScene checkArgs : totalLen is invalid, totalLen = "
            r1.append(r2)
            com.tencent.mm.pluginsdk.model.app.d r2 = r0.f283441f
            long r2 = r2.field_totalLen
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f283449q = r1
            com.tencent.mm.pluginsdk.model.app.d r1 = r0.f283441f
            long r2 = r1.field_totalLen
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x098b
            long r1 = r1.systemRowid
            com.tencent.p014mm.pluginsdk.model.app.C72695v.m85055H(r1)
        L_0x098b:
            r1 = -1
            return r1
        L_0x098d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = p206nj.C76861g.m92660c()
            r1.append(r2)
            java.lang.String r2 = " summerbig get info failed rowid:"
            r1.append(r2)
            long r2 = r0.f283444i
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            int r1 = p206nj.C76861g.m92658a()
            int r1 = -10000 - r1
            r0.f283449q = r1
            r1 = 0
            r0.f283441f = r1
            r1 = -1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.NetSceneUploadAppAttach.doScene(com.tencent.mm.network.g, ob0.n):int");
    }

    public int getType() {
        return 220;
    }

    /* renamed from: j1 */
    public final void mo135029j1(C98121d dVar) {
        if (this.f283441f.field_type == 2) {
            this.f283457y = 1;
            if (!this.f283456x) {
                this.f283458z = dVar;
                this.f283456x = true;
                RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
                this.f283438A.alive();
                RecogQBarOfImageFileEvent.C40158a aVar = recogQBarOfImageFileEvent.f107731d;
                aVar.f107733b = this.f283441f.field_fileFullPath;
                aVar.f107732a = System.currentTimeMillis();
                recogQBarOfImageFileEvent.publish();
            }
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4;
        int i5 = i2;
        int i6 = i3;
        Log.m105918d("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : errType = " + i5 + ", errCode = " + i6);
        if (i5 == 3 && i6 == -1 && !Util.isNullOrNil(this.f283451s)) {
            Log.m105929w("MicroMsg.NetSceneUploadAppAttach", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", this.f283451s);
        } else if (i5 == 0 && i6 == 0) {
            tm4 tm4 = (tm4) ((C47350c) uVar).f127056b.f127083a;
            String str2 = tm4.f185612d;
            if (str2 == null || this.f283445j != null || (str2.equals(this.f283441f.field_appId) && tm4.f185614f.equals(this.f283441f.field_clientAppDataId))) {
                int i7 = tm4.f185616h;
                if (i7 >= 0) {
                    long j = (long) i7;
                    C72683d dVar = this.f283441f;
                    long j2 = dVar.field_totalLen;
                    if (j == j2 && (i4 = tm4.f185617i) >= 0 && ((long) i4) <= j2) {
                        dVar.field_offset = (long) i4;
                        dVar.field_mediaSvrId = C72695v.m85060b(tm4.f185613e) ? tm4.f185613e : "";
                        C72683d dVar2 = this.f283441f;
                        if (dVar2.field_status == 105) {
                            Log.m105928w("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd STATUS PAUSE [" + this.f283441f.field_mediaSvrId + "," + this.f283441f.field_offset + "] ");
                            this.f283440e.onSceneEnd(i5, -1, "", this);
                            return;
                        }
                        if (dVar2.field_offset == dVar2.field_totalLen) {
                            if (Util.isNullOrNil(dVar2.field_mediaSvrId)) {
                                Log.m105920e("MicroMsg.NetSceneUploadAppAttach", "finish upload but mediaid == null!");
                                this.f283449q = -10000 - C76861g.m92658a();
                                this.f283440e.onSceneEnd(3, -1, "", this);
                                C72695v.m85055H(this.f283441f.systemRowid);
                                return;
                            }
                            this.f283441f.field_status = 199;
                        }
                        boolean kD = C72709y1.vx0().update(this.f283441f, new String[0]);
                        if (!kD) {
                            Log.m105920e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd update info ret:" + kD);
                            this.f283449q = -10000 - C76861g.m92658a();
                            mo135029j1((C98121d) null);
                            this.f283440e.onSceneEnd(3, -1, "", this);
                            return;
                        } else if (this.f283441f.field_status == 199) {
                            this.f283440e.onSceneEnd(0, 0, "", this);
                            return;
                        } else if (doScene(dispatcher(), this.f283440e) < 0) {
                            Log.m105920e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : doScene fail");
                            this.f283440e.onSceneEnd(3, -1, "", this);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                Log.m105920e("MicroMsg.NetSceneUploadAppAttach", "dataLen, startPos or totalLen is incorrect");
                this.f283449q = -10000 - C76861g.m92658a();
                this.f283440e.onSceneEnd(3, -1, "", this);
                return;
            }
            Log.m105920e("MicroMsg.NetSceneUploadAppAttach", "argument is not consistent");
            this.f283449q = -10000 - C76861g.m92658a();
            this.f283440e.onSceneEnd(3, -1, "", this);
        } else {
            Log.m105920e("MicroMsg.NetSceneUploadAppAttach", "onGYNetEnd : errType = " + i5 + ", errCode = " + i6);
            this.f283449q = -10000 - C76861g.m92658a();
            this.f283440e.onSceneEnd(i5, i6, str, this);
        }
    }

    public int securityLimitCount() {
        return 3200;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
