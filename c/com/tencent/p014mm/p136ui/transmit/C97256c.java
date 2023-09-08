package com.tencent.p014mm.p136ui.transmit;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.modelimage.C92834j;
import com.tencent.p014mm.modelimage.C92855q0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98426q0;
import hd0.C98429r0;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import p682rz.C101488s;
import p682rz.C101491u;
import p823sg.C101614i;
import rn3.C101409t;
import te3.tc4;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.transmit.c */
public class C97256c implements C98124g.C98125a {

    /* renamed from: d */
    public boolean f285450d = false;

    /* renamed from: e */
    public C98121d f285451e = null;

    /* renamed from: f */
    public String f285452f;

    /* renamed from: g */
    public final /* synthetic */ String f285453g;

    /* renamed from: h */
    public final /* synthetic */ String f285454h;

    /* renamed from: i */
    public final /* synthetic */ String f285455i;

    /* renamed from: j */
    public final /* synthetic */ String f285456j;

    /* renamed from: n */
    public final /* synthetic */ int f285457n;

    /* renamed from: o */
    public final /* synthetic */ int f285458o;

    /* renamed from: p */
    public final /* synthetic */ int f285459p;

    /* renamed from: q */
    public final /* synthetic */ String f285460q;

    /* renamed from: r */
    public final /* synthetic */ String f285461r;

    /* renamed from: s */
    public final /* synthetic */ String f285462s;

    /* renamed from: t */
    public final /* synthetic */ String f285463t;

    /* renamed from: u */
    public final /* synthetic */ int f285464u;

    /* renamed from: v */
    public final /* synthetic */ C98408n0 f285465v;

    /* renamed from: w */
    public final /* synthetic */ MsgRetransmitUI f285466w;

    /* renamed from: com.tencent.mm.ui.transmit.c$a */
    public class C97257a implements C92834j {
        public C97257a() {
        }

        /* renamed from: a */
        public void mo127120a(int i, int i2) {
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(C97256c.this.f285452f);
            Zd.f288562i = 111;
            Zd.f288548P = 256;
            ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137733w(Zd);
            boolean z = false;
            Log.m105919d("MicroMsg.MsgRetransmitUI", "NetSceneUploadVideoForCdn callback, errType: %s, errCode: %s", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 0 && i2 == 0) {
                z = true;
            }
            MsgRetransmitUI.m125190F7(Long.valueOf(C97256c.this.f285466w.f285374f), C97256c.this.f285460q, z, 3);
        }
    }

    public C97256c(MsgRetransmitUI msgRetransmitUI, String str, String str2, String str3, String str4, int i, int i2, int i3, String str5, String str6, String str7, String str8, int i4, C98408n0 n0Var) {
        this.f285466w = msgRetransmitUI;
        this.f285453g = str;
        this.f285454h = str2;
        this.f285455i = str3;
        this.f285456j = str4;
        this.f285457n = i;
        this.f285458o = i2;
        this.f285459p = i3;
        this.f285460q = str5;
        this.f285461r = str6;
        this.f285462s = str7;
        this.f285463t = str8;
        this.f285464u = i4;
        this.f285465v = n0Var;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        String str2;
        C98121d dVar2 = dVar;
        Class cls = C101488s.class;
        if (dVar2 != null) {
            if (dVar2.field_exist_whencheck) {
                boolean z2 = this.f285450d;
                dVar2.field_fileId = z2 ? this.f285453g : this.f285454h;
                dVar2.field_aesKey = z2 ? this.f285455i : this.f285456j;
                dVar2.field_thumbimgLength = this.f285457n;
                dVar2.field_fileLength = (long) (z2 ? this.f285458o : this.f285459p);
                dVar2.field_toUser = this.f285460q;
                dVar2.field_filemd5 = z2 ? this.f285461r : this.f285462s;
                dVar2.field_mp4identifymd5 = this.f285463t;
                Log.m105925i("MicroMsg.MsgRetransmitUI", "support second!! sceneResult: %s", dVar2);
                if (!this.f285450d) {
                    String str3 = this.f285460q;
                    C101614i<String, ArrayList<C98408n0>> iVar = C98410o0.f288586c;
                    str2 = C98426q0.m127793a(str3);
                    this.f285452f = str2;
                } else {
                    str2 = this.f285452f + FirebaseAnalytics.C113379b.ORIGIN;
                }
                String str4 = str2;
                String r = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137729r(str4);
                String r2 = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137729r(this.f285466w.f285375g);
                if (!this.f285450d) {
                    C86013q1.m106442c(r2, r);
                }
                String str5 = (((((("<msg><videomsg aeskey=\"" + this.f285456j + "\" cdnthumbaeskey=\"" + this.f285456j + "\" cdnvideourl=\"" + this.f285454h + "\" ") + "cdnthumburl=\"" + this.f285454h + "\" ") + "length=\"" + this.f285459p + "\" ") + "cdnrawvideourl=\"" + this.f285453g + "\" ") + "cdnrawvideoaeskey=\"" + this.f285455i + "\" ") + "rawlength=\"" + this.f285458o + "\" ") + "cdnthumblength=\"" + this.f285457n + "\"/></msg>";
                Log.m105925i("MicroMsg.MsgRetransmitUI", "cdn callback new build cdnInfo:%s", str5);
                if (!this.f285450d) {
                    C98429r0.m127829t(str4, this.f285464u, this.f285460q, str5, 43, this.f285465v.f288567n);
                } else {
                    C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(this.f285452f);
                    if (Zd == null) {
                        Log.m105928w("MicroMsg.MsgRetransmitUI", "compress video info is null, pls check process");
                        this.f285466w.finish();
                        return 0;
                    }
                    Zd.f288546N = str4;
                    Zd.f288552T = true;
                    C98429r0.m127827r(str4, (String) null, this.f285464u, this.f285460q, (String) null, 0, "", 43, (tc4) null, "", 0, (String) null, (String) null, true);
                    ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137733w(Zd);
                }
                if (C98429r0.m127830u() && !Util.isNullOrNil(this.f285453g) && !this.f285450d) {
                    C98124g gVar = new C98124g();
                    gVar.f287660d = "task_MsgRetransmitUI_3";
                    gVar.f287662f = this;
                    gVar.field_mediaId = C1297x.m1387b("checkExist", Util.nowMilliSecond(), this.f285460q, "" + this.f285466w.f285374f);
                    gVar.field_fileId = this.f285453g;
                    gVar.field_aesKey = this.f285455i;
                    gVar.field_filemd5 = this.f285461r;
                    gVar.field_fileType = 4;
                    gVar.field_talker = this.f285460q;
                    gVar.field_priority = 2;
                    gVar.field_svr_signature = "";
                    gVar.field_onlycheckexist = true;
                    gVar.field_trysafecdn = true;
                    Log.m105919d("MicroMsg.MsgRetransmitUI", "field_fileId:%s, md5:%s, field_aesKey:%s, xml:%s", this.f285454h, this.f285462s, this.f285456j, this.f285465v.mo137705i());
                    boolean if02 = ((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar);
                    this.f285450d = if02;
                    this.f285451e = dVar2;
                    if (if02) {
                        return 0;
                    }
                }
                C92855q0 f = C92855q0.m117113f();
                f.f267460C = this.f285452f;
                boolean z3 = this.f285450d;
                f.f267464G = z3 ? dVar2 : null;
                f.f267461D = 0;
                if (z3) {
                    dVar2 = this.f285451e;
                }
                f.f267462E = dVar2;
                f.f267463F = new C97257a();
                f.f295194h = 4;
                f.mo140195a().mo123694a();
                this.f285466w.finish();
            } else if (!this.f285450d) {
                MsgRetransmitUI msgRetransmitUI = this.f285466w;
                int i2 = MsgRetransmitUI.f285342V0;
                msgRetransmitUI.getClass();
                ((C119157j) C119157j.f356862d).mo183876g(new C97254a(msgRetransmitUI), "MicroMsg.MsgRetransmitUI");
                msgRetransmitUI.f285384r = false;
                Log.m105924i("MicroMsg.MsgRetransmitUI", "not support second!! dealDownloadVideo");
            } else {
                Log.m105924i("MicroMsg.MsgRetransmitUI", "origin video not support second!! dealDownloadVideo, go ahead normal video");
                if (this.f285451e == null || Util.isNullOrNil(this.f285452f)) {
                    Log.m105928w("MicroMsg.MsgRetransmitUI", "temp result is null, some thing wrong in process");
                } else {
                    C92855q0 f2 = C92855q0.m117113f();
                    f2.f267460C = this.f285452f;
                    f2.f267461D = 0;
                    f2.f267462E = this.f285451e;
                    f2.f267463F = new C101409t(this);
                    f2.f295194h = 4;
                    f2.mo140195a().mo123694a();
                }
                this.f285466w.finish();
            }
        }
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return new byte[0];
    }
}
