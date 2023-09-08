package com.tencent.p014mm.pluginsdk.model.app;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Pair;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68065f;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.modelcdntran.C68104e;
import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.p014mm.opensdk.modelmsg.WXDesignerSharedObject;
import com.tencent.p014mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.p014mm.opensdk.modelmsg.WXEmojiPageSharedObject;
import com.tencent.p014mm.opensdk.modelmsg.WXEmojiSharedObject;
import com.tencent.p014mm.opensdk.modelmsg.WXFileObject;
import com.tencent.p014mm.opensdk.modelmsg.WXImageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXLiteAppObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVipInfo;
import com.tencent.p014mm.opensdk.modelmsg.WXNativeGamePageObject;
import com.tencent.p014mm.opensdk.modelmsg.WXTextObject;
import com.tencent.p014mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.p014mm.opensdk.modelmsg.WXWeWorkObject;
import com.tencent.p014mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.p014mm.p136ui.chatting.viewitems.C97184i1;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.gamesharecard.LiteAppBizDataInfo;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6690n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72915l;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75710x0;
import gy1.C76074a;
import gy1.C8476b;
import gy3.C87412m;
import h81.C32735h;
import ht1.C60167f1;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import jd3.C76403a;
import kr0.C76629w0;
import ld3.C46850c;
import nj3.C76879j;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C47355o;
import ob0.C89144l0;
import ob0.l0$$e;
import p1081gi.C98121d;
import p206nj.C76861g;
import p215oo.C77032h;
import p529fv.C59331r;
import p61.C77058k0;
import p753xp.C102704b;
import p867wp.C102479b;
import pc0.C100765f;
import qc0.C101093a;
import qg2.C77335p;
import s90.C77626a;
import t90.C77878b;
import te3.C51900wz3;
import te3.C64791vz3;
import zt3.C119157j;

/* renamed from: com.tencent.mm.pluginsdk.model.app.v */
public class C72695v {

    /* renamed from: a */
    public static C77335p f211532a;

    /* renamed from: com.tencent.mm.pluginsdk.model.app.v$a */
    public class C72696a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f211533d;

        /* renamed from: e */
        public final /* synthetic */ C67391b f211534e;

        public C72696a(C72963f4 f4Var, C67391b bVar) {
            this.f211533d = f4Var;
            this.f211534e = bVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C72695v.m85081w(this.f211533d);
            this.f211534e.mo91541B(true);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.v$b */
    public class C72697b implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.v$c */
    public class C72698c implements C47355o {

        /* renamed from: d */
        public final /* synthetic */ C72701f f211535d;

        public C72698c(C72701f fVar) {
            this.f211535d = fVar;
        }

        /* renamed from: m */
        public void mo26221m(int i, int i2, C117747y yVar) {
            C72701f fVar = this.f211535d;
            if (fVar != null) {
                fVar.mo100168m(i, i2, yVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.v$d */
    public class C72699d implements C46850c.C46851a {

        /* renamed from: a */
        public final /* synthetic */ C72963f4 f211536a;

        /* renamed from: b */
        public final /* synthetic */ long f211537b;

        /* renamed from: c */
        public final /* synthetic */ String f211538c;

        public C72699d(C72963f4 f4Var, long j, String str) {
            this.f211536a = f4Var;
            this.f211537b = j;
            this.f211538c = str;
        }

        /* renamed from: a */
        public void mo72061a(String str, String str2, String str3, String str4, String str5, String str6, long j) {
            if (Util.isNullOrNil(str4)) {
                this.f211536a.mo100991d(5);
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(this.f211536a.getMsgId(), this.f211536a);
                C72963f4 f4Var = new C72963f4();
                f4Var.mo108733M2(C75604z3.m90843o(f4Var.mo108768t()));
                f4Var.mo108749c3(f4Var.mo108768t());
                f4Var.mo108732L2(str);
                f4Var.setType(10000);
                f4Var.mo100991d(6);
                f4Var.mo108740T2(0);
                ((C72972g4) C97625j3.m125812b().mo105911z()).my0(f4Var);
                return;
            }
            C72704x1 zx02 = C72709y1.zx0();
            long j2 = this.f211537b;
            String str7 = this.f211538c;
            this.f211536a.getType();
            zx02.getClass();
            C97625j3.m125815e().mo123460f(new C96763j1(j2, str7, str4));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.v$e */
    public class C72700e implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ long f211539d;

        /* renamed from: e */
        public final /* synthetic */ C72683d f211540e;

        /* renamed from: f */
        public final /* synthetic */ long f211541f;

        public C72700e(long j, C72683d dVar, long j2) {
            this.f211539d = j;
            this.f211540e = dVar;
            this.f211541f = j2;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            C47350c cVar2 = cVar;
            Class cls = C75700k0.class;
            Log.m105925i("MicroMsg.AppMsgLogic", "sendFileUploadMsgCallback type:%d errType:%d errCode:%d errMsg:%s tempMsgId:%s", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2), Util.nullAs(str, ""), Long.valueOf(this.f211539d));
            C64791vz3 vz32 = (C64791vz3) cVar2.f127055a.f127080a;
            if (vz32 != null) {
                String str2 = vz32.f186026e;
                if (Util.isEqual(str2, this.f211539d + "")) {
                    if (i == 0 && i2 == 0) {
                        C51900wz3 wz32 = (C51900wz3) cVar2.f127056b.f127083a;
                        if (wz32 != null) {
                            Log.m105925i("MicroMsg.AppMsgLogic", "FileUploadToken:%s NewMsgId:%s msgId:%s", wz32.f144368d, Long.valueOf(wz32.f144369e), vz32.f186026e);
                            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(Util.safeParseLong(vz32.f186026e));
                            if (b002.getMsgId() == 0) {
                                Log.m105921e("MicroMsg.AppMsgLogic", "sendFileUploadMsgCallback msg:%s no exist!", vz32.f186026e);
                                return 0;
                            }
                            C68070l.C68072b u = C68070l.C68072b.m80422u(Util.processXml(b002.getContent()), (String) null);
                            C77878b bVar = new C77878b();
                            String str3 = wz32.f144368d;
                            C87412m.m108594g(str3, "<set-?>");
                            bVar.f226902c = str3;
                            bVar.f226901b = wz32.f144369e;
                            u.mo93545f(bVar);
                            b002.mo108732L2(C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
                            b002.mo100991d(2);
                            b002.mo108745Y2(wz32.f144369e);
                            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(b002.getMsgId(), b002);
                            ((C119157j) C119157j.f356862d).mo183875f(new C97184i1(u, b002, 1));
                            C102479b Bg = ((C102704b) C86312j.m106911c(C102704b.class)).mo138748Bg(this.f211540e.field_fileFullPath, 6, u.f195622s, (byte[]) null);
                            Log.m105919d("MicroMsg.AppMsgLogic", "fileCheckDup %s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", this.f211540e.field_fileFullPath, Integer.valueOf(Bg.f301760a), Boolean.valueOf(Bg.f301761b), Boolean.FALSE, Boolean.valueOf(Bg.f301762c), Long.valueOf(Bg.f301763d));
                        }
                    } else {
                        C72695v.m85055H(this.f211541f);
                    }
                    C72709y1.zx0().mo100171d();
                }
            }
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.v$f */
    public interface C72701f {
        /* renamed from: m */
        void mo100168m(int i, int i2, C117747y yVar);
    }

    /* renamed from: A */
    public static int m85048A(C68070l.C68072b bVar, WXMediaMessage wXMediaMessage, String str, String str2, String str3, int i, C72681a aVar, Map<String, Long> map, String str4, String str5, String str6, String str7) {
        C72683d dVar;
        String str8;
        C68070l.C68072b bVar2 = bVar;
        WXMediaMessage wXMediaMessage2 = wXMediaMessage;
        String str9 = str2;
        String str10 = str3;
        C72681a aVar2 = aVar;
        Map<String, Long> map2 = map;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        Class cls = C77032h.class;
        if (i == 1) {
            C6690n nVar = new C6690n();
            nVar.f24054b = 1;
            bVar2.mo93545f(nVar);
        }
        String r = m85076r(bVar2, wXMediaMessage2, str9, aVar2);
        Log.m105924i("MicroMsg.AppMsgLogic", C76861g.m92660c() + "summerbig content url:" + bVar2.f195586j + " lowUrl:" + bVar2.f195590k + " attachlen:" + bVar2.f195594l + " attachid:" + bVar2.f195606o + " attach file:" + r + " webViewReqId: " + str11 + " msgSvrId: " + str12 + " talkerUsername: " + str13 + " snsLocalId: " + str14);
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append("");
        String sb4 = sb.toString();
        if (!Util.isNullOrNil(r)) {
            dVar = m85059a(sb4, bVar2, r);
            if (dVar == null) {
                return 0 - C76861g.m92658a();
            }
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(r);
            if (imageOptions != null) {
                bVar2.f195521Q = imageOptions.outWidth;
                bVar2.f195518P = imageOptions.outHeight;
            }
        } else {
            dVar = null;
        }
        C72963f4 f4Var = new C72963f4();
        byte[] bArr = wXMediaMessage2.thumbData;
        if (bArr != null && bArr.length > 0) {
            if (bArr.length <= 65536 || wXMediaMessage.getType() == 36 || wXMediaMessage.getType() == 46 || wXMediaMessage.getType() == 101) {
                str8 = m85082x(wXMediaMessage2.thumbData, false, Bitmap.CompressFormat.JPEG, true);
            } else {
                str8 = m85082x(wXMediaMessage2.thumbData, bVar2.f195582i == 2, Bitmap.CompressFormat.JPEG, false);
            }
            Log.m105918d("MicroMsg.AppMsgLogic", C76861g.m92660c() + " summerbig thumbData MsgInfo path:" + str8);
            if (!Util.isNullOrNil(str8)) {
                f4Var.mo108739S2(str8);
            }
        }
        if (dVar != null) {
            bVar2.f195606o = "" + dVar.systemRowid;
            if (bVar2.f195582i == 6 && Util.isNullOrNil(bVar2.f195622s)) {
                bVar2.f195622s = C92779i0.Dx0().mo127020d(dVar.field_fileFullPath);
            }
        }
        bVar2.f195610p = str9;
        bVar2.f195498I1 = str11;
        f4Var.mo108732L2(C68070l.C68072b.m80420s(bVar2, (String) null, (C98121d) null));
        f4Var.mo100991d(1);
        f4Var.mo108740T2(1);
        f4Var.setType(m85070l(bVar));
        Iterator<String> it = Util.stringsToList(str.split(",")).iterator();
        while (it.hasNext()) {
            String next = it.next();
            f4Var.mo108749c3(next);
            f4Var.mo108733M2(C75604z3.m90843o(next));
            String B00 = ((C75710x0) C86312j.m106911c(C75710x0.class)).B00(f4Var);
            if (!Util.isNullOrNil(str5) && !Util.isNullOrNil(str6)) {
                B00 = ((C77032h) C86312j.m106911c(cls)).mo107358EP(B00, str12, str13);
                ((C77032h) C86312j.m106911c(cls)).mo107357DR();
            } else if (!Util.isNullOrNil(str7)) {
                C100765f fVar = new C100765f();
                fVar.f295215c = str14;
                B00 = ((C77032h) C86312j.m106911c(cls)).Yq0(B00, fVar);
                ((C77032h) C86312j.m106911c(cls)).mo107357DR();
            }
            if (!Util.isNullOrNil(B00)) {
                f4Var.mo101012p4(B00);
            }
            Map<String, Long> map3 = map;
            Long valueOf = Long.valueOf(map3 != null ? map3.get(next).longValue() : -1);
            if (valueOf == null || valueOf.longValue() < 0) {
                valueOf = Long.valueOf(((C72972g4) C97625j3.m125812b().mo105911z()).my0(f4Var));
            } else {
                Log.m105925i("MicroMsg.AppMsgLogic", "sendAppMsg, updateById, existMsgId:%d ", valueOf);
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(valueOf.longValue(), f4Var);
            }
            if (valueOf.longValue() < 0) {
                Log.m105920e("MicroMsg.AppMsgLogic", C76861g.m92660c() + " summerbig insert msg failed :" + valueOf);
                return 0 - C76861g.m92658a();
            }
            Log.m105924i("MicroMsg.AppMsgLogic", C76861g.m92658a() + " summerbig new msg inserted to db , local id = " + valueOf);
            f4Var.setMsgId(valueOf.longValue());
            C68070l lVar = new C68070l();
            lVar.field_xml = f4Var.getContent();
            lVar.field_title = wXMediaMessage2.title;
            lVar.field_type = wXMediaMessage2.mediaObject.type();
            lVar.field_description = wXMediaMessage2.description;
            Iterator<String> it4 = it;
            lVar.field_msgId = valueOf.longValue();
            lVar.field_source = bVar2.f195484F;
            C72709y1.Ax0().insert(lVar);
            if (dVar != null) {
                long longValue = valueOf.longValue();
                dVar.field_msgInfoId = longValue;
                dVar.field_status = 101;
                Log.m105925i("MicroMsg.AppMsgLogic", "summerbig sendAppMsg update attInfo field_msgInfoId[%d], field_status[%d], systemRowid[%d], type[%d]", Long.valueOf(longValue), Long.valueOf(dVar.field_status), Long.valueOf(dVar.systemRowid), Integer.valueOf(lVar.field_type));
                C72709y1.vx0().update(dVar, new String[0]);
                if (!Util.isNullOrNil(str3)) {
                    C72709y1.zx0().f211550d.put(Long.valueOf(dVar.field_msgInfoId), str3);
                } else {
                    String str15 = str3;
                }
                m85058K(f4Var, dVar);
                C72681a aVar3 = aVar;
            } else {
                String str16 = str3;
                Log.m105925i("MicroMsg.AppMsgLogic", "summerbig sendAppMsg dosceneSendAppMsg attInfo[%s], msgId[%d], sessionId[%s], type[%d]", dVar, valueOf, str16, Integer.valueOf(lVar.field_type));
                C72704x1 zx02 = C72709y1.zx0();
                long longValue2 = valueOf.longValue();
                zx02.getClass();
                C96763j1 j1Var = new C96763j1(longValue2, str16, (String) null);
                j1Var.f283477j = aVar;
                Log.m105925i("MicroMsg.NetSceneSendAppMsg", "NetSceneSendAppMsg directShare[%d]", Integer.valueOf(i));
                C72681a aVar4 = j1Var.f283477j;
                if (aVar4 != null) {
                    Log.m105925i("MicroMsg.NetSceneSendAppMsg", "NetSceneSendAppMsg tokenValid[%d], pkgName[%s]", Integer.valueOf(aVar4.f211479a), j1Var.f283477j.f211480b);
                }
                C97625j3.m125815e().mo123460f(j1Var);
            }
            wXMediaMessage2 = wXMediaMessage;
            it = it4;
        }
        return 0;
    }

    /* renamed from: B */
    public static int m85049B(WXMediaMessage wXMediaMessage, String str, String str2, String str3, int i, String str4) {
        return m85050C(wXMediaMessage, str, str2, str3, i, str4, (String) null, 0, (C72681a) null);
    }

    /* renamed from: C */
    public static int m85050C(WXMediaMessage wXMediaMessage, String str, String str2, String str3, int i, String str4, String str5, int i2, C72681a aVar) {
        return m85051D(wXMediaMessage, str, str2, str3, i, str4, str5, i2, aVar, (Map<String, Long>) null, (String) null, (String) null, (String) null, (String) null);
    }

    /* renamed from: D */
    public static int m85051D(WXMediaMessage wXMediaMessage, String str, String str2, String str3, int i, String str4, String str5, int i2, C72681a aVar, Map<String, Long> map, String str6, String str7, String str8, String str9) {
        C68070l.C68072b bVar = new C68070l.C68072b();
        bVar.f195562d = str;
        bVar.f195484F = str2;
        bVar.f195618r = i;
        return m85048A(bVar, wXMediaMessage, str3, str4, str5, i2, aVar, map, str6, str7, str8, str9);
    }

    /* renamed from: E */
    public static Pair<Integer, Long> m85052E(C68070l.C68072b bVar, String str, String str2, String str3, String str4, byte[] bArr) {
        return m85053F(bVar, str, str2, str3, str4, bArr, (String) null);
    }

    /* renamed from: F */
    public static Pair<Integer, Long> m85053F(C68070l.C68072b bVar, String str, String str2, String str3, String str4, byte[] bArr, String str5) {
        return m85054G(bVar, str, str2, str3, str4, bArr, str5, "", "", 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:112|(0)|116|117) */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0289, code lost:
        if (r14 != null) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03a1, code lost:
        if (r1 != null) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03c4, code lost:
        if (r1 != null) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x026a, code lost:
        r22 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0271, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0272, code lost:
        r22 = r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x029b */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0298 A[SYNTHETIC, Splitter:B:114:0x0298] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x041a A[SYNTHETIC, Splitter:B:183:0x041a] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0537  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0271 A[ExcHandler: all (th java.lang.Throwable), PHI: r6 
      PHI: (r6v18 com.tencent.mm.modelimage.m) = (r6v7 com.tencent.mm.modelimage.m), (r6v7 com.tencent.mm.modelimage.m), (r6v19 com.tencent.mm.modelimage.m), (r6v19 com.tencent.mm.modelimage.m) binds: [B:76:0x0238, B:77:?, B:79:0x0244, B:80:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:76:0x0238] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Long> m85054G(com.tencent.p014mm.message.C68070l.C68072b r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, byte[] r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, long r41) {
        /*
            r1 = r32
            r2 = r35
            r3 = r36
            r5 = r37
            r13 = r38
            r14 = r41
            java.lang.Class<oo.h> r16 = p215oo.C77032h.class
            java.lang.Class<gt.k> r0 = p158gt.C98201k.class
            r12 = 2
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r11 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r4[r11] = r3
            r9 = 1
            r4[r9] = r1
            java.lang.String r8 = "MicroMsg.AppMsgLogic"
            java.lang.String r6 = "summerbig sendAppMsg attachFilePath[%s], content[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r6, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            long r6 = java.lang.System.currentTimeMillis()
            r4.append(r6)
            java.lang.String r7 = ""
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r36)
            r17 = r10
            if (r6 != 0) goto L_0x005f
            com.tencent.mm.pluginsdk.model.app.d r4 = m85059a(r4, r1, r3)
            if (r4 != 0) goto L_0x005d
            android.util.Pair r0 = new android.util.Pair
            int r1 = p206nj.C76861g.m92658a()
            int r11 = r11 - r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r2 = -1
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.<init>(r1, r2)
            return r0
        L_0x005d:
            r6 = r4
            goto L_0x0060
        L_0x005f:
            r6 = 0
        L_0x0060:
            com.tencent.p014mm.pluginsdk.p133ui.tools.C72922q.m85518a()
            com.tencent.mm.storage.f4 r4 = new com.tencent.mm.storage.f4
            r4.<init>()
            java.lang.Class<s90.a> r10 = s90.C77626a.class
            com.tencent.mm.message.g r10 = r1.mo93555w(r10)
            s90.a r10 = (s90.C77626a) r10
            if (r10 == 0) goto L_0x0084
            java.lang.String r12 = r10.f226287b
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0084
            java.lang.String r10 = r10.f226289d
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0084
            r10 = 1
            goto L_0x0085
        L_0x0084:
            r10 = 0
        L_0x0085:
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r10)
            r12[r11] = r19
            java.lang.String r9 = "isUseOriginThumb:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r12)
            if (r5 == 0) goto L_0x041e
            int r9 = r5.length
            if (r9 <= 0) goto L_0x041e
            int r9 = r1.f195582i
            r11 = 33
            r12 = 100
            if (r9 == r11) goto L_0x0104
            r11 = 36
            if (r9 == r11) goto L_0x0104
            r11 = 44
            if (r9 == r11) goto L_0x0104
            r11 = 48
            if (r9 != r11) goto L_0x00ac
            goto L_0x0106
        L_0x00ac:
            r11 = 46
            if (r9 != r11) goto L_0x00d6
            if (r10 == 0) goto L_0x00c3
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r0 = r0.mo127189kD(r5)
            goto L_0x00ea
        L_0x00c3:
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r0 = r0.yx0(r5, r12, r9)
            goto L_0x00ea
        L_0x00d6:
            r11 = 101(0x65, float:1.42E-43)
            if (r9 != r11) goto L_0x00ec
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r0 = r0.mo127189kD(r5)
        L_0x00ea:
            r11 = 2
            goto L_0x00f8
        L_0x00ec:
            r11 = 2
            if (r9 != r11) goto L_0x00f1
            r0 = 1
            goto L_0x00f2
        L_0x00f1:
            r0 = 0
        L_0x00f2:
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.PNG
            java.lang.String r0 = m85082x(r5, r0, r9, r10)
        L_0x00f8:
            r26 = r4
            r27 = r6
            r28 = r7
            r31 = r8
            r5 = r17
            goto L_0x03cd
        L_0x0104:
            r11 = 48
        L_0x0106:
            if (r9 != r11) goto L_0x010b
            r9 = 0
            r11 = 0
            goto L_0x011f
        L_0x010b:
            android.util.DisplayMetrics r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getDefaultDisplayMetrics()
            float r9 = r9.density
            r11 = 1131413504(0x43700000, float:240.0)
            float r9 = r9 * r11
            int r9 = (int) r9
            android.util.DisplayMetrics r12 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getDefaultDisplayMetrics()
            float r12 = r12.density
            float r12 = r12 * r11
            int r11 = (int) r12
        L_0x011f:
            java.lang.Class<com.tencent.mm.message.a> r12 = com.tencent.p014mm.message.C80995a.class
            com.tencent.mm.message.g r12 = r1.mo93555w(r12)
            com.tencent.mm.message.a r12 = (com.tencent.p014mm.message.C80995a) r12
            if (r12 == 0) goto L_0x0130
            r24 = r4
            java.lang.String r4 = r12.f237913v
            r25 = r4
            goto L_0x0134
        L_0x0130:
            r24 = r4
            r25 = r7
        L_0x0134:
            if (r12 == 0) goto L_0x013a
            boolean r4 = r12.f237914w
            r12 = r4
            goto L_0x013b
        L_0x013a:
            r12 = 0
        L_0x013b:
            if (r10 == 0) goto L_0x0159
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r0 = r0.mo127189kD(r5)
            r27 = r6
            r28 = r7
            r31 = r8
            r5 = r17
            r26 = r24
            goto L_0x03cd
        L_0x0159:
            int r4 = r1.f195582i
            r10 = 44
            if (r4 == r10) goto L_0x019e
            r10 = 48
            if (r4 == r10) goto L_0x019e
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            r9 = 70
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.JPEG
            r11 = 720(0x2d0, float:1.009E-42)
            r21 = 1061997773(0x3f4ccccd, float:0.8)
            r22 = 262144(0x40000, float:3.67342E-40)
            r4 = r0
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            r26 = r24
            r5 = r37
            r27 = r6
            r6 = r9
            r9 = r7
            r7 = r10
            r10 = r8
            r8 = r11
            r28 = r9
            r11 = 1
            r9 = r21
            r31 = r10
            r30 = r17
            r10 = r22
            r17 = 2
            r11 = r25
            r3 = 2
            java.lang.String r0 = r4.Ax0(r5, r6, r7, r8, r9, r10, r11, r12)
            r5 = r30
            goto L_0x03cd
        L_0x019e:
            r27 = r6
            r28 = r7
            r31 = r8
            r30 = r17
            r26 = r24
            r3 = 2
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG
            r6 = r0
            com.tencent.mm.modelimage.m r6 = (com.tencent.p014mm.modelimage.C92839m) r6
            r6.getClass()
            java.lang.String r7 = "save bitmap to image error, %s"
            java.lang.String r8 = "create thumbnail, delete tmp file"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r37)
            java.lang.String r10 = "MicroMsg.ImgInfoStorage"
            if (r0 == 0) goto L_0x01d3
            java.lang.String r0 = "save dir thumb error, thumbBuf is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            r5 = r30
            r10 = 0
            goto L_0x03cc
        L_0x01d3:
            long r17 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = com.tencent.p014mm.modelimage.C92839m.m117079SE()
            java.lang.String r3 = "th_"
            r14 = r28
            r13 = 1
            java.lang.String r3 = r6.mo127174TY(r0, r3, r14, r13)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r3)
            java.lang.String r13 = ".tmp"
            r15.append(r13)
            java.lang.String r13 = r15.toString()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r2 = "saveDirThumb, fullPath = "
            r15.append(r2)
            r15.append(r3)
            java.lang.String r2 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r2)
            int r2 = r5.length
            android.graphics.BitmapFactory$Options r15 = new android.graphics.BitmapFactory$Options
            r15.<init>()
            r1 = 1
            r15.inJustDecodeBounds = r1
            int r1 = r5.length
            r14 = 0
            android.graphics.BitmapFactory.decodeByteArray(r5, r14, r1, r15)
            java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106429K(r13, r14)     // Catch:{ IOException -> 0x03a4, Exception -> 0x037a, all -> 0x0375 }
            r1.write(r5)     // Catch:{ IOException -> 0x0368, Exception -> 0x0362 }
            r1.flush()     // Catch:{ IOException -> 0x0368, Exception -> 0x0362 }
            android.graphics.Bitmap r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeByteArray(r5, r9, r11)     // Catch:{ IOException -> 0x0368, Exception -> 0x0362 }
            int r11 = r5.length     // Catch:{ IOException -> 0x0368, Exception -> 0x0362 }
            if (r9 == 0) goto L_0x033b
            int r14 = r5.length     // Catch:{ IOException -> 0x0368, Exception -> 0x0362 }
            r20 = r11
            r11 = 262144(0x40000, float:3.67342E-40)
            if (r14 <= r11) goto L_0x029c
            java.io.ByteArrayOutputStream r14 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x027d, all -> 0x0278 }
            r14.<init>()     // Catch:{ Exception -> 0x027d, all -> 0x0278 }
            r11 = 100
            r9.compress(r4, r11, r14)     // Catch:{ Exception -> 0x0275, all -> 0x0271 }
            byte[] r11 = r14.toByteArray()     // Catch:{ Exception -> 0x0275, all -> 0x0271 }
            int r11 = r11.length     // Catch:{ Exception -> 0x0275, all -> 0x0271 }
            r20 = r11
            r11 = 100
        L_0x0244:
            byte[] r5 = r14.toByteArray()     // Catch:{ Exception -> 0x026a, all -> 0x0271 }
            int r5 = r5.length     // Catch:{ Exception -> 0x026a, all -> 0x0271 }
            r22 = r6
            r6 = 262144(0x40000, float:3.67342E-40)
            if (r5 <= r6) goto L_0x0265
            r5 = 15
            if (r11 < r5) goto L_0x0265
            r14.reset()     // Catch:{ Exception -> 0x026c }
            int r11 = r11 + -5
            r9.compress(r4, r11, r14)     // Catch:{ Exception -> 0x026c }
            byte[] r5 = r14.toByteArray()     // Catch:{ Exception -> 0x026c }
            int r5 = r5.length     // Catch:{ Exception -> 0x026c }
            r20 = r5
            r6 = r22
            goto L_0x0244
        L_0x0265:
            r23 = r11
            r11 = r20
            goto L_0x028b
        L_0x026a:
            r22 = r6
        L_0x026c:
            r23 = r11
            r11 = r20
            goto L_0x0284
        L_0x0271:
            r0 = move-exception
            r22 = r6
            goto L_0x0296
        L_0x0275:
            r22 = r6
            goto L_0x0280
        L_0x0278:
            r0 = move-exception
            r22 = r6
            r14 = 0
            goto L_0x0296
        L_0x027d:
            r22 = r6
            r14 = 0
        L_0x0280:
            r11 = r20
            r23 = 100
        L_0x0284:
            java.lang.String r5 = "compress bitmap failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r5)     // Catch:{ all -> 0x0295 }
            if (r14 == 0) goto L_0x028e
        L_0x028b:
            r14.close()     // Catch:{ Exception -> 0x028e }
        L_0x028e:
            r5 = r23
            r6 = 1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r9, r5, r4, r3, r6)     // Catch:{ IOException -> 0x0337, Exception -> 0x0333 }
            goto L_0x02a5
        L_0x0295:
            r0 = move-exception
        L_0x0296:
            if (r14 == 0) goto L_0x029b
            r14.close()     // Catch:{ Exception -> 0x029b }
        L_0x029b:
            throw r0     // Catch:{ IOException -> 0x0337, Exception -> 0x0333 }
        L_0x029c:
            r22 = r6
            com.tencent.p014mm.vfs.C86013q1.m106463x(r13, r3)     // Catch:{ IOException -> 0x0337, Exception -> 0x0333 }
            r11 = r20
            r5 = 100
        L_0x02a5:
            java.lang.String r6 = "in ImgInfoStorage, extractThumbNail done: %s, %s, quality : %d"
            r14 = 3
            r20 = r4
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r21 = 0
            r4[r21] = r13     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r19 = 1
            r4[r19] = r3     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r5 = 2
            r4[r5] = r3     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r6, r4)     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r4 = 10
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r25)     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            java.lang.String r6 = "UTF-8"
            java.lang.String r5 = p206nj.C117627q.m165909b(r5, r6)     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r6 = 0
            r4[r6] = r5     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r6 = 1
            r4[r6] = r5     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r5 = 2
            r4[r5] = r2     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            int r2 = r15.outHeight     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r4[r14] = r2     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r2 = 4
            int r5 = r15.outWidth     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r4[r2] = r5     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r2 = 5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r4[r2] = r5     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            int r2 = r9.getHeight()     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r5 = 6
            r4[r5] = r2     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r2 = 7
            int r5 = r9.getWidth()     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r4[r2] = r5     // Catch:{ IOException -> 0x032f, Exception -> 0x032b }
            r2 = 8
            r5 = r30
            r4[r2] = r5     // Catch:{ IOException -> 0x0329, Exception -> 0x0327 }
            r2 = 9
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0329, Exception -> 0x0327 }
            long r11 = r11 - r17
            java.lang.Long r6 = java.lang.Long.valueOf(r11)     // Catch:{ IOException -> 0x0329, Exception -> 0x0327 }
            r4[r2] = r6     // Catch:{ IOException -> 0x0329, Exception -> 0x0327 }
            r2 = 16498(0x4072, float:2.3119E-41)
            r3.mo160131h(r2, r4)     // Catch:{ IOException -> 0x0329, Exception -> 0x0327 }
            goto L_0x033d
        L_0x0327:
            r0 = move-exception
            goto L_0x0382
        L_0x0329:
            r0 = move-exception
            goto L_0x036e
        L_0x032b:
            r0 = move-exception
        L_0x032c:
            r5 = r30
            goto L_0x0382
        L_0x032f:
            r0 = move-exception
        L_0x0330:
            r5 = r30
            goto L_0x036e
        L_0x0333:
            r0 = move-exception
            r20 = r4
            goto L_0x032c
        L_0x0337:
            r0 = move-exception
            r20 = r4
            goto L_0x0330
        L_0x033b:
            r5 = r30
        L_0x033d:
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r2 == 0) goto L_0x0349
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r8)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r13)
        L_0x0349:
            r1.close()     // Catch:{ Exception -> 0x034c }
        L_0x034c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "THUMBNAIL_DIRPATH://th_"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            goto L_0x03cc
        L_0x035f:
            r0 = move-exception
            goto L_0x040a
        L_0x0362:
            r0 = move-exception
            r20 = r4
            r22 = r6
            goto L_0x032c
        L_0x0368:
            r0 = move-exception
            r20 = r4
            r22 = r6
            goto L_0x0330
        L_0x036e:
            r3 = r37
            r6 = r20
            r9 = r22
            goto L_0x03ab
        L_0x0375:
            r0 = move-exception
            r29 = 0
            goto L_0x040c
        L_0x037a:
            r0 = move-exception
            r20 = r4
            r22 = r6
            r5 = r30
            r1 = 0
        L_0x0382:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x035f }
            r4 = 0
            r3[r4] = r0     // Catch:{ all -> 0x035f }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r7, r3)     // Catch:{ all -> 0x035f }
            r3 = r37
            r6 = r20
            r9 = r22
            java.lang.String r0 = r9.zx0(r3, r2, r6, r4)     // Catch:{ all -> 0x035f }
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r2 == 0) goto L_0x03a1
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r8)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r13)
        L_0x03a1:
            if (r1 == 0) goto L_0x03cb
            goto L_0x03c6
        L_0x03a4:
            r0 = move-exception
            r3 = r5
            r9 = r6
            r5 = r30
            r6 = r4
            r1 = 0
        L_0x03ab:
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x035f }
            r11 = 0
            r4[r11] = r0     // Catch:{ all -> 0x035f }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r7, r4)     // Catch:{ all -> 0x035f }
            java.lang.String r0 = r9.zx0(r3, r2, r6, r11)     // Catch:{ all -> 0x035f }
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r2 == 0) goto L_0x03c4
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r8)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r13)
        L_0x03c4:
            if (r1 == 0) goto L_0x03cb
        L_0x03c6:
            r1.close()     // Catch:{ Exception -> 0x03ca }
            goto L_0x03cb
        L_0x03ca:
        L_0x03cb:
            r10 = r0
        L_0x03cc:
            r0 = r10
        L_0x03cd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = p206nj.C76861g.m92660c()
            r1.append(r2)
            java.lang.String r2 = " thumbData MsgInfo path:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r2 = r31
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r3 = r26
            if (r1 != 0) goto L_0x0426
            r3.mo108739S2(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "new thumbnail saved, path"
            r1.append(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            goto L_0x0426
        L_0x040a:
            r29 = r1
        L_0x040c:
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r1 == 0) goto L_0x0418
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r8)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r13)
        L_0x0418:
            if (r29 == 0) goto L_0x041d
            r29.close()     // Catch:{ Exception -> 0x041d }
        L_0x041d:
            throw r0
        L_0x041e:
            r3 = r4
            r27 = r6
            r28 = r7
            r2 = r8
            r5 = r17
        L_0x0426:
            r10 = r27
            if (r10 == 0) goto L_0x045b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r28
            r0.append(r1)
            long r6 = r10.systemRowid
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1 = r32
            r1.f195606o = r0
            int r0 = r1.f195582i
            r4 = 6
            if (r0 != r4) goto L_0x045d
            java.lang.String r0 = r1.f195622s
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x045d
            com.tencent.mm.modelcdntran.u r0 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            java.lang.String r4 = r10.field_fileFullPath
            java.lang.String r0 = r0.mo127020d(r4)
            r1.f195622s = r0
            goto L_0x045d
        L_0x045b:
            r1 = r32
        L_0x045d:
            r4 = 0
            java.lang.String r0 = com.tencent.p014mm.message.C68070l.C68072b.m80420s(r1, r4, r4)
            r3.mo108732L2(r0)
            r4 = 1
            r3.mo100991d(r4)
            r6 = r35
            r3.mo108749c3(r6)
            long r7 = eb0.C75604z3.m90843o(r35)
            r3.mo108733M2(r7)
            r3.mo108740T2(r4)
            int r0 = m85070l(r32)
            r3.setType(r0)
            java.lang.String r0 = eb0.C75569c4.m90680m(r40)
            r3.mo101012p4(r0)
            java.lang.Class<f62.x0> r0 = f62.C75710x0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            f62.x0 r0 = (f62.C75710x0) r0
            java.lang.String r0 = r0.B00(r3)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 != 0) goto L_0x04a8
            r3.mo101012p4(r0)
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r4 = r3.f230724G
            r7 = 0
            r0[r7] = r4
            java.lang.String r4 = "NetSceneSendMsg:MsgSource:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r0)
        L_0x04a8:
            int r0 = r1.f195582i
            r4 = 57
            if (r0 != r4) goto L_0x04b7
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r0 = r1.f195641w2
            if (r0 == 0) goto L_0x04b7
            java.lang.String r0 = r0.f201550n
            r3.mo101012p4(r0)
        L_0x04b7:
            r7 = 0
            r11 = r41
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x04c8
            r4 = 2
            java.lang.String r0 = eb0.C75569c4.m90655A(r4)
            r4 = 0
            eb0.C75569c4.m90664J(r3, r0, r4)
        L_0x04c8:
            int r0 = r1.f195582i
            r4 = 53
            if (r0 != r4) goto L_0x04d9
            android.util.Pair<java.lang.String, java.lang.String> r0 = r1.f195637v2
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            r3.f230737U = r0
            r9 = 1
            r3.f230755r = r9
        L_0x04d9:
            di3.d r0 = di3.C86312j.m106911c(r16)
            oo.h r0 = (p215oo.C77032h) r0
            r0.mo107359RF(r3, r11)
            di3.d r0 = di3.C86312j.m106911c(r16)
            oo.h r0 = (p215oo.C77032h) r0
            r0.mo107357DR()
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            long r11 = r0.my0(r3)
            int r0 = r1.f195582i
            if (r0 != r4) goto L_0x0518
            com.tencent.mm.autogen.events.NotifyGroupSolitatireEvent r0 = new com.tencent.mm.autogen.events.NotifyGroupSolitatireEvent
            r0.<init>()
            com.tencent.mm.autogen.events.NotifyGroupSolitatireEvent$a r4 = r0.f193754d
            r9 = 0
            r4.f193756a = r9
            java.lang.String r9 = r3.f230737U
            r4.f193758c = r9
            java.lang.String r9 = r3.mo108768t()
            r4.f193757b = r9
            com.tencent.mm.autogen.events.NotifyGroupSolitatireEvent$b r4 = r0.f193755e
            r4.f193760a = r11
            r0.publish()
        L_0x0518:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = p206nj.C76861g.m92660c()
            r0.append(r4)
            java.lang.String r4 = " msginfo insert id: "
            r0.append(r4)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0567
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = p206nj.C76861g.m92660c()
            r0.append(r1)
            java.lang.String r1 = "insert msg failed :"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            android.util.Pair r0 = new android.util.Pair
            int r1 = p206nj.C76861g.m92658a()
            r2 = 0
            int r1 = 0 - r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r0.<init>(r1, r2)
            return r0
        L_0x0567:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r4 = p206nj.C76861g.m92658a()
            r0.append(r4)
            java.lang.String r4 = " new msg inserted to db , local id = "
            r0.append(r4)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r3.setMsgId(r11)
            com.tencent.mm.message.l r0 = new com.tencent.mm.message.l
            r0.<init>()
            java.lang.String r4 = r3.getContent()
            r0.field_xml = r4
            r4 = r33
            r0.field_appId = r4
            java.lang.String r4 = r1.f195570f
            r0.field_title = r4
            int r4 = r1.f195582i
            r0.field_type = r4
            java.lang.String r4 = r1.f195574g
            r0.field_description = r4
            r0.field_msgId = r11
            r4 = r34
            r0.field_source = r4
            com.tencent.mm.pluginsdk.model.app.s r4 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.Ax0()
            r4.insert(r0)
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            if (r10 != 0) goto L_0x05b3
            goto L_0x05b4
        L_0x05b3:
            r4 = 0
        L_0x05b4:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r7 = 0
            r0[r7] = r4
            java.lang.String r4 = "summerbig sendAppMsg attInfo is null[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r0)
            if (r10 == 0) goto L_0x05f0
            r10.field_msgInfoId = r11
            r8 = 101(0x65, double:5.0E-322)
            r10.field_status = r8
            com.tencent.mm.pluginsdk.model.app.e r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            java.lang.String[] r2 = new java.lang.String[r7]
            r0.update(r10, r2)
            int r0 = r1.f195582i
            r1 = 2
            if (r0 == r1) goto L_0x05dd
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r38)
            if (r0 != 0) goto L_0x05ec
        L_0x05dd:
            com.tencent.mm.pluginsdk.model.app.x1 r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.zx0()
            java.util.HashMap<java.lang.Long, java.lang.String> r0 = r0.f211550d
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            r2 = r38
            r0.put(r1, r2)
        L_0x05ec:
            m85058K(r3, r10)
            goto L_0x0626
        L_0x05f0:
            r2 = r38
            int r0 = r1.f195626t
            if (r0 != 0) goto L_0x0613
            int r0 = r1.f195594l
            r4 = 26214400(0x1900000, float:5.2897246E-38)
            if (r0 <= r4) goto L_0x05fd
            goto L_0x0613
        L_0x05fd:
            com.tencent.mm.pluginsdk.model.app.x1 r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.zx0()
            r0.getClass()
            com.tencent.mm.pluginsdk.model.app.j1 r0 = new com.tencent.mm.pluginsdk.model.app.j1
            r1 = r39
            r0.<init>(r11, r2, r1)
            ob0.b0 r1 = eb0.C97625j3.m125815e()
            r1.mo123460f(r0)
            goto L_0x0626
        L_0x0613:
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            ld3.c r4 = new ld3.c
            com.tencent.mm.pluginsdk.model.app.v$d r7 = new com.tencent.mm.pluginsdk.model.app.v$d
            r7.<init>(r3, r11, r2)
            r2 = r36
            r4.<init>(r1, r2, r6, r7)
            r0.mo123460f(r4)
        L_0x0626:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
            r0.<init>(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C72695v.m85054G(com.tencent.mm.message.l$b, java.lang.String, java.lang.String, java.lang.String, java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, long):android.util.Pair");
    }

    /* renamed from: H */
    public static void m85055H(long j) {
        C72709y1.vx0().mo100149SE(j, 198);
        Log.m105919d("MicroMsg.AppMsgLogic", "setError rowid:%s, stack:%s", Long.valueOf(j), Util.getStack());
        C72683d dVar = new C72683d();
        C72709y1.vx0().get(j, dVar);
        if (dVar.field_msgInfoId > 0) {
            C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(dVar.field_msgInfoId);
            if (b002.getMsgId() == dVar.field_msgInfoId) {
                if (b002.getStatus() == 2 && b002.getType() == 1090519089 && b002.f230741Y == 0) {
                    b002.mo108734N2(100);
                    ((C119157j) C119157j.f356862d).mo183875f(new C97184i1((C68070l.C68072b) null, b002, 3));
                } else {
                    b002.mo100991d(5);
                }
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
            }
        }
    }

    /* renamed from: I */
    public static void m85056I(C67391b bVar, C72963f4 f4Var, int i, C68070l.C68072b bVar2) {
        C76879j.m92707A(bVar.mo91565f(), bVar.mo91572m().getString(i), "", bVar.mo91572m().getString(C0966R.string.a0l), bVar.mo91572m().getString(C0966R.string.f7926wf), new C72696a(f4Var, bVar), new C72697b());
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(f4Var.getMsgId());
        b002.mo108734N2(101);
        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), b002);
        ((C119157j) C119157j.f356862d).mo183875f(new C97184i1(bVar2, b002, 5));
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0199  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m85057J(java.lang.String r22, com.tencent.p014mm.storage.C72963f4 r23) {
        /*
            r0 = r22
            r1 = 0
            if (r23 != 0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = r23.getMsgId()
            com.tencent.mm.pluginsdk.model.app.d r2 = m85064f(r0, r2)
            java.lang.String r3 = r23.getContent()
            r4 = 0
            com.tencent.mm.message.l$b r3 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r3, r4)
            if (r3 == 0) goto L_0x0042
            java.lang.String r5 = r3.f195570f
            int r6 = sf0.C77702q0.f226484a
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x0022
            r5 = r6
        L_0x0022:
            java.lang.String r7 = r3.f195602n
            if (r7 != 0) goto L_0x0027
            r7 = r6
        L_0x0027:
            java.lang.String r7 = r7.toLowerCase()
            java.lang.String r8 = r3.f195622s
            if (r8 != 0) goto L_0x0030
            r8 = r6
        L_0x0030:
            java.lang.String r9 = r3.f195488G
            if (r9 != 0) goto L_0x0035
            r9 = r6
        L_0x0035:
            java.lang.String r10 = r3.f195524R
            if (r10 != 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r6 = r10
        L_0x003b:
            r14 = r5
            r12 = r6
            r15 = r7
            r13 = r8
            r16 = r9
            goto L_0x0048
        L_0x0042:
            r12 = r4
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
        L_0x0048:
            r6 = 8
            r9 = 5
            r10 = 4
            r11 = 3
            r17 = 2
            java.lang.String r5 = "MicroMsg.AppMsgLogic"
            r19 = 1
            if (r2 != 0) goto L_0x00ca
            long r7 = r23.getMsgId()
            java.lang.String r2 = r23.getContent()
            m85072n(r7, r2, r4)
            long r7 = r23.getMsgId()
            com.tencent.mm.pluginsdk.model.app.d r2 = m85064f(r0, r7)
            if (r2 == 0) goto L_0x00c6
            java.lang.Object[] r0 = new java.lang.Object[r6]
            long r6 = r2.systemRowid
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r0[r1] = r4
            long r6 = r2.field_totalLen
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r0[r19] = r4
            java.lang.String r4 = r2.field_fileFullPath
            r0[r17] = r4
            long r6 = r2.field_type
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r0[r11] = r4
            java.lang.String r4 = r2.field_mediaId
            r0[r10] = r4
            long r6 = r2.field_msgInfoId
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r0[r9] = r4
            boolean r4 = r2.field_isUpload
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r6 = 6
            r0[r6] = r4
            java.lang.String r4 = r2.field_signature
            if (r4 != 0) goto L_0x00a4
            r18 = -1
            goto L_0x00aa
        L_0x00a4:
            int r4 = r4.length()
            r18 = r4
        L_0x00aa:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            r6 = 7
            r0[r6] = r4
            java.lang.String r4 = "summerbig tryInitAttachInfo newInfo systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], signature len[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r0)
            if (r3 == 0) goto L_0x00c6
            int r0 = r3.f195626t
            if (r0 != 0) goto L_0x00c3
            int r0 = r3.f195594l
            r3 = 26214400(0x1900000, float:5.2897246E-38)
            if (r0 <= r3) goto L_0x00c6
        L_0x00c3:
            r11 = r2
            goto L_0x0197
        L_0x00c6:
            r11 = r2
            r1 = 1
            goto L_0x0197
        L_0x00ca:
            java.lang.String r0 = r2.field_fileFullPath
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r3 = r0.getPath()
            if (r3 == 0) goto L_0x00f0
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r1, r1)
            java.lang.String r7 = r0.getPath()
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x00f0
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r3)
            android.net.Uri r0 = r0.build()
        L_0x00f0:
            long r7 = r2.field_status
            r20 = 199(0xc7, double:9.83E-322)
            int r3 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r3 != 0) goto L_0x0122
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r3 = r3.mo177799l(r0, r4)
            boolean r7 = r3.mo177810a()
            if (r7 != 0) goto L_0x0106
            r7 = 0
            goto L_0x010e
        L_0x0106:
            com.tencent.mm.vfs.FileSystem$c r7 = r3.f348991a
            java.lang.String r8 = r3.f348992b
            boolean r7 = r7.mo119948x(r8)
        L_0x010e:
            if (r7 != 0) goto L_0x0121
            java.lang.String r7 = "summerbig tryInitAttachInfo info exist but file not!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            long r7 = r23.getMsgId()
            java.lang.String r6 = r23.getContent()
            m85072n(r7, r6, r4)
        L_0x0121:
            r4 = r3
        L_0x0122:
            r3 = 10
            java.lang.Object[] r3 = new java.lang.Object[r3]
            long r6 = r2.systemRowid
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r3[r1] = r6
            long r6 = r2.field_totalLen
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r3[r19] = r6
            java.lang.String r6 = r2.field_fileFullPath
            r3[r17] = r6
            long r6 = r2.field_type
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r3[r11] = r6
            java.lang.String r6 = r2.field_mediaId
            r3[r10] = r6
            long r6 = r2.field_msgInfoId
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r3[r9] = r6
            boolean r6 = r2.field_isUpload
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7 = 6
            r3[r7] = r6
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r0 = r6.mo177799l(r0, r4)
            boolean r4 = r0.mo177810a()
            if (r4 != 0) goto L_0x0164
            goto L_0x016c
        L_0x0164:
            com.tencent.mm.vfs.FileSystem$c r1 = r0.f348991a
            java.lang.String r0 = r0.f348992b
            boolean r1 = r1.mo119948x(r0)
        L_0x016c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r1 = 7
            r3[r1] = r0
            long r0 = r2.field_status
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 8
            r3[r1] = r0
            r0 = 9
            java.lang.String r1 = r2.field_signature
            if (r1 != 0) goto L_0x0185
            r1 = -1
            goto L_0x0189
        L_0x0185:
            int r1 = r1.length()
        L_0x0189:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r0] = r1
            java.lang.String r0 = "summerbig tryInitAttachInfo info exist systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], file.exists[%b], status[%d], signature len[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r3)
            goto L_0x00c6
        L_0x0197:
            if (r1 != 0) goto L_0x01a6
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            qg2.n r2 = new qg2.n
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.mo123460f(r2)
        L_0x01a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C72695v.m85057J(java.lang.String, com.tencent.mm.storage.f4):boolean");
    }

    /* renamed from: K */
    public static void m85058K(C72963f4 f4Var, C72683d dVar) {
        if (f4Var == null || dVar == null || f4Var.getType() != 1090519089) {
            C72709y1.zx0().mo100171d();
            return;
        }
        C89144l0.m111429e(new C76403a(dVar).f256789f, new C72700e(dVar.field_msgInfoId, dVar, dVar.systemRowid), false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.pluginsdk.model.app.C72683d m85059a(java.lang.String r12, com.tencent.p014mm.message.C68070l.C68072b r13, java.lang.String r14) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = p206nj.C76861g.m92660c()
            r0.append(r1)
            java.lang.String r1 = " summerbig buildUploadAttachInfo clientAppDataId:"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " attach file :"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.AppMsgLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.String r0 = "//"
            java.lang.String r2 = "/"
            java.lang.String r0 = r14.replace(r0, r2)
            com.tencent.mm.vfs.VFSStrategy$$b r2 = com.tencent.p014mm.vfs.VFSStrategy.f348871a
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            android.net.Uri r2 = r2.mo177792e(r3)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0064
            java.lang.String r5 = r2.getScheme()
            java.lang.String r6 = "wcf"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x004b
            goto L_0x0064
        L_0x004b:
            com.tencent.mm.vfs.y1 r5 = com.tencent.p014mm.vfs.C116343y1.f349133a
            java.lang.String r7 = r2.getAuthority()
            java.lang.String r2 = "fsName"
            gy3.C87412m.m108594g(r7, r2)
            java.lang.String[] r6 = com.tencent.p014mm.vfs.C116343y1.f349136d
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            int r2 = sx3.C110821n.m150959f(r6, r7, r8, r9, r10, r11)
            if (r2 < 0) goto L_0x0064
            r2 = 1
            goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            r5 = 0
            if (r2 != 0) goto L_0x007d
            java.lang.String r2 = a70.C112760b.m154216X()
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x007d
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r4] = r0
            java.lang.String r13 = "summerbig Error attach path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r13, r12)
            return r5
        L_0x007d:
            com.tencent.mm.pluginsdk.model.app.d r0 = new com.tencent.mm.pluginsdk.model.app.d
            r0.<init>()
            int r2 = r13.f195594l
            long r6 = (long) r2
            r0.field_totalLen = r6
            r0.field_fileFullPath = r14
            int r14 = r13.f195566e
            long r6 = (long) r14
            r0.field_sdkVer = r6
            java.lang.String r14 = r13.f195562d
            r0.field_appId = r14
            r0.field_clientAppDataId = r12
            int r12 = r13.f195582i
            long r12 = (long) r12
            r0.field_type = r12
            r12 = 200(0xc8, double:9.9E-322)
            r0.field_status = r12
            r0.field_isUpload = r3
            long r12 = eb0.C31543z5.m39451a()
            r0.field_createTime = r12
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r0.field_lastModifyTime = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = ""
            r12.append(r13)
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r0.field_mediaSvrId = r12
            r0.field_isUseCdn = r4
            com.tencent.mm.pluginsdk.model.app.e r12 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            r12.insert(r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = p206nj.C76861g.m92660c()
            r12.append(r13)
            java.lang.String r13 = " summerbig buildUploadAttachInfo file:"
            r12.append(r13)
            java.lang.String r13 = r0.field_fileFullPath
            r12.append(r13)
            java.lang.String r13 = " rowid:"
            r12.append(r13)
            long r13 = r0.systemRowid
            r12.append(r13)
            java.lang.String r13 = " clientAppDataId:"
            r12.append(r13)
            java.lang.String r13 = r0.field_clientAppDataId
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r12)
            long r12 = r0.systemRowid
            r2 = 0
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 >= 0) goto L_0x0122
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = p206nj.C76861g.m92660c()
            r12.append(r13)
            java.lang.String r13 = " summerbig uploadAttach insert appattach info failed :"
            r12.append(r13)
            long r13 = r0.systemRowid
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r12)
            return r5
        L_0x0122:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C72695v.m85059a(java.lang.String, com.tencent.mm.message.l$b, java.lang.String):com.tencent.mm.pluginsdk.model.app.d");
    }

    /* renamed from: b */
    public static boolean m85060b(String str) {
        return !Util.isNullOrNil(str) && !str.equals("0:0");
    }

    /* renamed from: c */
    public static int m85061c(int i) {
        switch (i) {
            case -1879048191:
            case -1879048190:
            case -1879048189:
            case -1879048186:
            case -1879048185:
            case -1879048183:
            case -1879048176:
            case 74:
            case 83:
            case 84:
            case 87:
            case 95:
            case 1048625:
            case 16777265:
            case 268435505:
            case 285212721:
            case 301989937:
            case 318767153:
            case 335544369:
            case 352321585:
            case 369098801:
            case 385876017:
            case 402653233:
            case 419430449:
            case 436207665:
            case 452984881:
            case 469762097:
            case 486539313:
            case 503316529:
            case 520093745:
            case 536870961:
            case 536936497:
            case 553648177:
            case 587202609:
            case 603979825:
            case 687865905:
            case 704643121:
            case 738197553:
            case 754974769:
            case 771751985:
            case 805306417:
            case 822083633:
            case 855638065:
            case 905969713:
            case 922746929:
            case 939524145:
            case 973078577:
            case 974127153:
            case 975175729:
            case 976224305:
            case 977272881:
            case 1040187441:
            case 1077936177:
            case 1090519089:
            case 1107296305:
            case 1124073521:
            case 1140850737:
                return 49;
            default:
                return i;
        }
    }

    /* renamed from: d */
    public static void m85062d(C72963f4 f4Var, C72701f fVar) {
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
        if (u == null) {
            Log.m105921e("MicroMsg.AppMsgLogic", "parse msgContent error, %s", f4Var.getContent());
            return;
        }
        if (Util.isNullOrNil(u.f195606o) && !Util.isNullOrNil(u.f195500J)) {
            Log.m105921e("MicroMsg.AppMsgLogic", "msgContent format error, %s", f4Var.getContent());
            u.f195606o = "" + u.f195500J.hashCode();
        }
        String str = u.f195606o;
        if (!m85074p(f4Var, m85064f(str, f4Var.getMsgId())) && m85057J(str, f4Var)) {
            f211532a = new C77335p(f4Var.getMsgId(), str, new C72698c(fVar));
            C97625j3.m125815e().mo123460f(f211532a);
        }
    }

    /* renamed from: e */
    public static String m85063e(String str, String str2, String str3) {
        String str4;
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        if (Util.isNullOrNil(str2)) {
            str4 = str + "da_" + Util.nowMilliSecond();
            if (!Util.isNullOrNil(str3)) {
                str4 = str4 + "." + str3;
            }
        } else {
            if (!Util.isNullOrNil(str3) && !str2.endsWith(str3)) {
                str2 = str2 + "." + str3;
            }
            str4 = str + str2;
            if (C86013q1.m106450k(str4)) {
                int i = 1;
                while (true) {
                    if (i >= 20) {
                        break;
                    }
                    if (!C86013q1.m106450k(str + i + "_" + str2)) {
                        str4 = str + i + "_" + str2;
                        break;
                    }
                    i++;
                }
                if (i == 20) {
                    str4 = str + "da_" + Util.nowMilliSecond();
                    if (!Util.isNullOrNil(str3)) {
                        str4 = str4 + "." + str3;
                    }
                }
            }
        }
        try {
            if (new C86009m1(str4).mo119974l().mo119971i().equalsIgnoreCase(new C86009m1(str).mo119971i())) {
                return str4;
            }
            String str5 = str + "da_" + Util.nowMilliSecond();
            if (!Util.isNullOrNil(str2)) {
                str5 = str5 + str2;
            }
            if (!Util.isNullOrNil(str3)) {
                str5 = str5 + "." + str3;
            }
            Log.m105929w("MicroMsg.AppMsgLogic", "maybe DirTraversal attach. %s", str5);
            return str5;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AppMsgLogic", e, "", new Object[0]);
            String str6 = str + "da_" + Util.nowMilliSecond();
            if (Util.isNullOrNil(str3)) {
                return str6;
            }
            return str6 + "." + str3;
        }
    }

    /* renamed from: f */
    public static C72683d m85064f(String str, long j) {
        C72683d g = m85065g(str);
        if (g == null) {
            g = C72709y1.vx0().mo100150Yt(j);
        }
        if (g != null) {
            Log.m105925i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo info[%s], rowid[%d], isUpload[%b], fullpath[%s], totallen[%d], offset[%d], mediaSvrId[%s], mediaid[%s], msgid[%d], type[%d], stack[%s]", g, Long.valueOf(g.systemRowid), Boolean.valueOf(g.field_isUpload), g.field_fileFullPath, Long.valueOf(g.field_totalLen), Long.valueOf(g.field_offset), g.field_mediaSvrId, g.field_mediaId, Long.valueOf(g.field_msgInfoId), Long.valueOf(g.field_type), Util.getStack());
        } else {
            Log.m105929w("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo is null stack[%s]", Util.getStack());
        }
        return g;
    }

    /* renamed from: g */
    public static C72683d m85065g(String str) {
        C72683d dVar = new C72683d();
        if (Util.isNullOrNil(str)) {
            return null;
        }
        Log.m105925i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s", str);
        long j = Util.getLong(str, -1);
        if (j != -1) {
            C72709y1.vx0().get(j, dVar);
            if (dVar.systemRowid != j && ((dVar = C72709y1.vx0().mo100154qq(str)) == null || !dVar.field_mediaSvrId.equals(str))) {
                Log.m105924i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 1");
            }
            Log.m105925i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", str, Long.valueOf(j));
            return dVar;
        }
        dVar = C72709y1.vx0().mo100154qq(str);
        if (dVar == null || !dVar.field_mediaSvrId.equals(str)) {
            Log.m105924i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 2");
        }
        Log.m105925i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", str, Long.valueOf(j));
        return dVar;
        dVar = null;
        Log.m105925i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", str, Long.valueOf(j));
        return dVar;
    }

    /* renamed from: h */
    public static C72683d m85066h(String str, long j, int i, String str2, String str3, int i2) {
        C72683d dVar = new C72683d();
        dVar.field_fileFullPath = str;
        dVar.field_appId = str2;
        dVar.field_sdkVer = (long) i;
        dVar.field_mediaSvrId = str3;
        dVar.field_totalLen = (long) i2;
        dVar.field_status = 101;
        dVar.field_isUpload = false;
        dVar.field_createTime = C31543z5.m39451a();
        dVar.field_lastModifyTime = Util.nowSecond();
        dVar.field_msgInfoId = j;
        dVar.field_netTimes = 0;
        return dVar;
    }

    /* renamed from: i */
    public static String m85067i() {
        return VFSStrategy.m163776d("attachment") + XVFSFile.SEPARATOR_CHAR;
    }

    /* renamed from: j */
    public static String m85068j() {
        return VFSStrategy.m163776d("attachment") + XVFSFile.SEPARATOR_CHAR;
    }

    /* renamed from: k */
    public static C72683d m85069k(C72963f4 f4Var, String str) {
        C72683d g = m85065g(str);
        if (g != null) {
            return g;
        }
        m85072n(f4Var.getMsgId(), f4Var.getContent(), (String) null);
        return m85065g(str);
    }

    /* renamed from: l */
    public static int m85070l(C68070l.C68072b bVar) {
        int i;
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_finder_no_support_share_switch;
        C32735h.C32737c cVar2 = C32735h.C32737c.clicfg_finder_entry;
        Class cls = C32735h.class;
        if (bVar == null) {
            return 49;
        }
        int i2 = bVar.f195582i;
        int i3 = bVar.f195492H;
        int i4 = bVar.f195545Y;
        int i5 = bVar.f195548Z;
        int i6 = bVar.f195644x1;
        int i7 = bVar.f195478D1;
        Log.m105918d("MicroMsg.AppMsgLogic", "getLocalAppMsgType showType " + i3 + " atype " + i2 + ", itemShowType = " + i4 + ", c2cNewAAType = " + i6 + ", bubbleType = " + i7);
        if (i2 == 76) {
            return 1040187441;
        }
        if (i2 == 3 && (((C59331r) C86312j.m106911c(C59331r.class)).mo84029q1(bVar.f195562d) || "wx485a97c844086dc9".equals(bVar.f195562d))) {
            return 1040187441;
        }
        if (i4 == 4 || i5 != 0) {
            return 318767153;
        }
        if (i2 == 2001) {
            if (i3 == 1 || i7 == 1) {
                return 469762097;
            }
            return i6 == 4 ? 503316529 : 436207665;
        } else if (i2 == 2002) {
            return 536870961;
        } else {
            if (i2 == 2003) {
                return 536936497;
            }
            if (i2 == 66) {
                return 905969713;
            }
            if (i3 == 1) {
                return i2 == 21 ? -1879048185 : 285212721;
            }
            if (i3 == 2) {
                return i2 == 21 ? -1879048183 : 301989937;
            }
            if (i3 == 3) {
                return i2 == 21 ? -1879048176 : -1879048189;
            }
            if (i3 == 4) {
                return i2 == 21 ? -1879048183 : -1879048190;
            }
            if (i3 == 5) {
                return -1879048191;
            }
            if (i3 == 17) {
                return -1879048186;
            }
            if (i2 == 1) {
                return 16777265;
            }
            if (i2 == 2) {
                return 268435505;
            }
            if (i2 == 16) {
                return 452984881;
            }
            if (i2 == 17) {
                return -1879048186;
            }
            if (i2 != 33) {
                if (i2 == 34) {
                    return 520093745;
                }
                if (i2 == 59) {
                    return (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar2, 0) != 1 && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0) == 1) ? 49 : 838860849;
                }
                if (i2 == 60) {
                    return 855638065;
                }
                if (i2 == 62) {
                    return 922746929;
                }
                if (i2 == 63) {
                    return (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar2, 0) != 1 && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0) == 1) ? 49 : 973078577;
                }
                switch (i2) {
                    case 6:
                        return 1090519089;
                    case 8:
                        return 1048625;
                    case 10:
                        return 335544369;
                    case 13:
                        return 369098801;
                    case 20:
                        return 402653233;
                    case 36:
                        break;
                    case 50:
                        return (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar2, 0) != 1 && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0) == 1) ? 49 : 771751985;
                    case 51:
                        return (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar2, 0) != 1 && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0) == 1) ? 49 : 754974769;
                    case 52:
                        return (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar2, 0) != 1 && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0) == 1) ? 49 : 788529201;
                    case 53:
                        return 805306417;
                    case 54:
                        C68065f fVar = (C68065f) bVar.mo93555w(C68065f.class);
                        return (fVar == null || fVar.f195427l == null) ? 49 : 486539313;
                    case 57:
                        return 822083633;
                    case 65:
                        return (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar2, 0) != 1 && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0) == 1) ? 49 : 989855793;
                    case 69:
                        return 939524145;
                    case 77:
                        return 1074790449;
                    case 94:
                        return 976224305;
                    case 95:
                        return 1080033329;
                    case 96:
                        return 977272881;
                    case 98:
                        return 1124073521;
                    case 101:
                        return 1140850737;
                    case 2000:
                    case 2011:
                        return 419430449;
                    case 671088689:
                        return 671088689;
                    default:
                        switch (i2) {
                            case 46:
                                return 687865905;
                            case 47:
                                return 704643121;
                            case 48:
                                return 738197553;
                            default:
                                switch (i2) {
                                    case 71:
                                        return (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar2, 0) != 1 && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0) == 1) ? 49 : 1023410225;
                                    case 72:
                                        return (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar2, 0) != 1 && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0) == 1) ? 49 : 1006633009;
                                    case 73:
                                        return (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar2, 0) != 1 && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0) == 1) ? 49 : 956301361;
                                    case 74:
                                        return 1090519089;
                                    case 75:
                                        int b = C60167f1.m70144b(bVar.f195491G2, bVar.f195479D2);
                                        if (b == 2) {
                                            return 1057030193;
                                        }
                                        if (b == 3) {
                                            return 1023541297;
                                        }
                                        if (b != 4) {
                                            return b != 100000000 ? 49 : 1023475761;
                                        }
                                        return 1023606833;
                                    default:
                                        switch (i2) {
                                            case 80:
                                                return 1075839025;
                                            case 81:
                                                return (((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar2, 0) != 1 && ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0) == 1) ? 49 : 1076887601;
                                            case 82:
                                                return 974127153;
                                            default:
                                                switch (i2) {
                                                    case 87:
                                                        return 1107296305;
                                                    case 88:
                                                        return 975175729;
                                                    case 89:
                                                        return 1078984753;
                                                    default:
                                                        return 49;
                                                }
                                        }
                                }
                        }
                }
            }
            C80995a aVar = (C80995a) bVar.mo93555w(C80995a.class);
            if (aVar == null || !aVar.f237893b || ((i = bVar.f195581h2) != 2 && i != 3)) {
                return (aVar == null || !aVar.f237896e || bVar.f195581h2 != 3) ? 49 : 587202609;
            }
            return 553648177;
        }
    }

    /* renamed from: m */
    public static int m85071m(String str) {
        C68070l.C68072b u = C68070l.C68072b.m80422u(str, (String) null);
        if (u == null || !m85060b(u.f195606o)) {
            return -1;
        }
        C72683d dVar = new C72683d();
        long j = Util.getLong(u.f195606o, -1);
        if (j != -1) {
            C72709y1.vx0().get(j, dVar);
            if (dVar.systemRowid != j && ((dVar = C72709y1.vx0().mo100154qq(u.f195606o)) == null || !dVar.field_mediaSvrId.equals(u.f195606o))) {
                return -1;
            }
        } else {
            dVar = C72709y1.vx0().mo100154qq(u.f195606o);
            if (dVar == null || !dVar.field_mediaSvrId.equals(u.f195606o)) {
                return -1;
            }
        }
        long j2 = dVar.field_totalLen;
        if (j2 == 0) {
            return -1;
        }
        return (int) ((dVar.field_offset * 100) / j2);
    }

    /* renamed from: n */
    public static String m85072n(long j, String str, String str2) {
        Log.m105925i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach msgLocalId[%d], msgXml[%s], downloadPath[%s]", Long.valueOf(j), str, str2);
        C68070l.C68072b u = C68070l.C68072b.m80422u(str, (String) null);
        if (u == null) {
            return null;
        }
        if (str2 == null) {
            str2 = m85063e(m85068j(), u.f195570f, u.f195602n);
        }
        String str3 = str2;
        if (Util.isNullOrNil(u.f195606o) && !Util.isNullOrNil(u.f195500J)) {
            u.f195606o = "" + u.f195500J.hashCode();
        }
        int i = u.f195566e;
        String str4 = u.f195562d;
        String str5 = u.f195606o;
        m85073o(str3, j, i, str4, str5, u.f195594l, u.f195582i, u.f195524R, u.f195626t);
        return str5;
    }

    /* renamed from: o */
    public static String m85073o(String str, long j, int i, String str2, String str3, int i2, int i3, String str4, int i4) {
        C72683d dVar = new C72683d();
        dVar.field_fileFullPath = str;
        dVar.field_appId = str2;
        dVar.field_sdkVer = (long) i;
        dVar.field_mediaSvrId = str3;
        dVar.field_totalLen = (long) i2;
        dVar.field_status = 101;
        dVar.field_isUpload = false;
        dVar.field_createTime = C31543z5.m39451a();
        dVar.field_lastModifyTime = Util.nowSecond();
        dVar.field_msgInfoId = j;
        dVar.field_netTimes = 0;
        dVar.field_type = (long) i3;
        Log.m105925i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach ret[%b], rowid[%d], field_totalLen[%d], type[%d], isLargeFile[%d], destFile[%s], msgLocalId[%s], stack[%s]", Boolean.valueOf(C72709y1.vx0().insert(dVar)), Long.valueOf(dVar.systemRowid), Long.valueOf(dVar.field_totalLen), Long.valueOf(dVar.field_type), Integer.valueOf(i4), str, Long.valueOf(j), Util.getStack());
        return str3;
    }

    /* renamed from: p */
    public static boolean m85074p(C72963f4 f4Var, C72683d dVar) {
        if (dVar == null || !C86013q1.m106450k(dVar.field_fileFullPath)) {
            return false;
        }
        return dVar.mo100146l2() || (f4Var.mo108769t2() == 1 && dVar.field_isUpload);
    }

    /* renamed from: q */
    public static boolean m85075q(int i) {
        switch (i) {
            case -1879048191:
            case -1879048190:
            case -1879048189:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: r */
    public static String m85076r(C68070l.C68072b bVar, WXMediaMessage wXMediaMessage, String str, C72681a aVar) {
        Log.m105918d("MicroMsg.AppMsgLogic", C76861g.m92660c() + "mediaMessageToContent sdkver:" + wXMediaMessage.sdkVer + " title:" + wXMediaMessage.title + " desc:" + wXMediaMessage.description + " type:" + wXMediaMessage.mediaObject.type());
        bVar.f195566e = wXMediaMessage.sdkVer;
        bVar.f195570f = wXMediaMessage.title;
        bVar.f195574g = wXMediaMessage.description;
        bVar.f195536V = wXMediaMessage.mediaTagName;
        bVar.f195539W = wXMediaMessage.messageAction;
        bVar.f195542X = wXMediaMessage.messageExt;
        WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
        bVar.f195582i = iMediaObject.type();
        if (aVar != null && !Util.isNullOrNil(aVar.f211482d)) {
            C77626a aVar2 = (C77626a) bVar.mo93555w(C77626a.class);
            C77626a aVar3 = aVar2 != null ? aVar2 : new C77626a();
            aVar3.f226289d = aVar.f211482d;
            aVar3.f226287b = wXMediaMessage.thumbDataHash;
            WXMediaMessage.IMediaObject iMediaObject2 = wXMediaMessage.mediaObject;
            if (iMediaObject2 instanceof WXMusicVideoObject) {
                aVar3.f226288c = ((WXMusicVideoObject) iMediaObject2).hdAlbumThumbFileHash;
            }
            if (aVar2 == null) {
                bVar.mo93545f(aVar3);
            }
        }
        int i = bVar.f195582i;
        if (i == 7) {
            WXAppExtendObject wXAppExtendObject = (WXAppExtendObject) iMediaObject;
            bVar.f195614q = wXAppExtendObject.extInfo;
            if (!Util.isNullOrNil(wXAppExtendObject.fileData)) {
                Log.m105918d("MicroMsg.AppMsgLogic", C76861g.m92660c() + " fileData:" + wXAppExtendObject.fileData.length);
                byte[] bArr = wXAppExtendObject.fileData;
                bVar.f195594l = bArr.length;
                return m85083y(bArr);
            }
            bVar.f195594l = (int) C86013q1.m106451l(wXAppExtendObject.filePath);
            Log.m105918d("MicroMsg.AppMsgLogic", C76861g.m92660c() + " read file:" + wXAppExtendObject.filePath + " len:" + bVar.f195594l);
            if (bVar.f195594l <= 0) {
                return null;
            }
            bVar.f195602n = C86013q1.m106454o(wXAppExtendObject.filePath);
            return wXAppExtendObject.filePath;
        }
        int i2 = -1;
        if (i == 49) {
            int i3 = ((WXWeWorkObject) iMediaObject).subType;
            if (i3 == 1 || i3 == 2) {
                i2 = 19;
            }
            bVar.f195582i = i2;
            return null;
        } else if (i == 6) {
            WXFileObject wXFileObject = (WXFileObject) iMediaObject;
            if (!Util.isNullOrNil(wXFileObject.fileData)) {
                Log.m105918d("MicroMsg.AppMsgLogic", C76861g.m92660c() + " fileData:" + wXFileObject.fileData.length);
                byte[] bArr2 = wXFileObject.fileData;
                bVar.f195594l = bArr2.length;
                return m85083y(bArr2);
            }
            bVar.f195594l = (int) C86013q1.m106451l(wXFileObject.filePath);
            Log.m105918d("MicroMsg.AppMsgLogic", C76861g.m92660c() + " read file:" + wXFileObject.filePath + " len:" + bVar.f195594l);
            if (bVar.f195594l <= 0) {
                return null;
            }
            bVar.f195602n = C86013q1.m106454o(wXFileObject.filePath);
            return wXFileObject.filePath;
        } else {
            String str2 = "";
            boolean z = false;
            if (i == 2) {
                WXImageObject wXImageObject = (WXImageObject) iMediaObject;
                if (!Util.isNullOrNil(wXImageObject.imageData)) {
                    Log.m105918d("MicroMsg.AppMsgLogic", C76861g.m92660c() + " fileData:" + wXImageObject.imageData.length);
                    byte[] bArr3 = wXImageObject.imageData;
                    bVar.f195594l = bArr3.length;
                    return m85083y(bArr3);
                }
                if (!Util.isNullOrNil(wXImageObject.imagePath)) {
                    bVar.f195594l = (int) C86013q1.m106451l(wXImageObject.imagePath);
                    Log.m105918d("MicroMsg.AppMsgLogic", C76861g.m92660c() + " read file:" + wXImageObject.imagePath + " len:" + bVar.f195594l);
                    if (bVar.f195594l > 0) {
                        bVar.f195602n = C86013q1.m106454o(wXImageObject.imagePath);
                        String d = C97625j3.m125812b().mo105889d();
                        String i4 = new C86009m1(d, "appmsg_img_" + System.currentTimeMillis()).mo119971i();
                        BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(wXImageObject.imagePath);
                        if (imageOptions == null || imageOptions.outWidth <= 0 || imageOptions.outHeight <= 0) {
                            Object[] objArr = new Object[3];
                            objArr[0] = Boolean.valueOf(imageOptions == null);
                            objArr[1] = Integer.valueOf(imageOptions == null ? -1 : imageOptions.outWidth);
                            if (imageOptions != null) {
                                i2 = imageOptions.outHeight;
                            }
                            objArr[2] = Integer.valueOf(i2);
                            Log.m105921e("MicroMsg.AppMsgLogic", "options is null! %B, bitmapWidth = %d, bitmapHeight = %d", objArr);
                        } else if (C75592q0.m90771a(wXImageObject.imagePath, str2, true)) {
                            Log.m105925i("MicroMsg.AppMsgLogic", "this picture can send raw image but must copy [%s] to [%s]", wXImageObject.imagePath, i4);
                            if (C86013q1.m106443d(wXImageObject.imagePath, i4, false) >= 0) {
                                return i4;
                            }
                            Log.m105929w("MicroMsg.AppMsgLogic", "copy file error path[%s, %s]", wXImageObject.imagePath, i4);
                            return null;
                        } else {
                            if (imageOptions.outWidth > 960 || imageOptions.outHeight > 960) {
                                Bitmap extractThumbNail = BitmapUtil.extractThumbNail(wXImageObject.imagePath, 960, 960, false);
                                if (extractThumbNail != null) {
                                    try {
                                        BitmapUtil.saveBitmapToImage(extractThumbNail, 100, Bitmap.CompressFormat.JPEG, i4, true);
                                    } catch (IOException e) {
                                        Log.printErrStackTrace("MicroMsg.AppMsgLogic", e, str2, new Object[0]);
                                    }
                                }
                                return null;
                            } else if (C86013q1.m106443d(wXImageObject.imagePath, i4, false) < 0) {
                                return null;
                            }
                            return i4;
                        }
                    }
                }
                return null;
            } else if (i == 3) {
                WXMusicObject wXMusicObject = (WXMusicObject) iMediaObject;
                bVar.f195586j = wXMusicObject.musicUrl;
                bVar.f195590k = wXMusicObject.musicLowBandUrl;
                bVar.f195530T = wXMusicObject.musicDataUrl;
                bVar.f195533U = wXMusicObject.musicLowBandDataUrl;
                C72916m mVar = new C72916m();
                mVar.f212519b = wXMusicObject.songAlbumUrl;
                mVar.f212520c = wXMusicObject.songLyric;
                bVar.mo93545f(mVar);
                return null;
            } else if (i == 76) {
                WXMusicVideoObject wXMusicVideoObject = (WXMusicVideoObject) iMediaObject;
                bVar.f195586j = wXMusicVideoObject.musicUrl;
                bVar.f195530T = wXMusicVideoObject.musicDataUrl;
                C72916m mVar2 = new C72916m();
                mVar2.f212519b = aVar != null ? aVar.f211481c : str2;
                mVar2.f212525h = wXMusicVideoObject.singerName;
                mVar2.f212526i = wXMusicVideoObject.albumName;
                mVar2.f212520c = wXMusicVideoObject.songLyric;
                mVar2.f212527j = wXMusicVideoObject.musicGenre;
                mVar2.f212528k = String.valueOf(wXMusicVideoObject.issueDate);
                mVar2.f212529l = wXMusicVideoObject.identification;
                mVar2.f212531n = wXMusicVideoObject.duration;
                mVar2.f212530m = bVar.f195542X;
                mVar2.f212532o = wXMusicVideoObject.musicOperationUrl;
                WXMusicVipInfo wXMusicVipInfo = wXMusicVideoObject.musicVipInfo;
                if (wXMusicVipInfo != null) {
                    str2 = C101093a.m132484f(wXMusicVipInfo.musicId);
                }
                mVar2.f212533p = str2;
                Object[] objArr2 = new Object[2];
                objArr2[0] = wXMusicVideoObject.singerName;
                if (wXMusicVideoObject.musicVipInfo != null) {
                    z = true;
                }
                objArr2[1] = Boolean.valueOf(z);
                Log.m105925i("MicroMsg.AppMsgLogic", "share music mv to chatting, singerName:%s, musicVipInfo is valid:%b", objArr2);
                bVar.mo93545f(mVar2);
                return null;
            } else if (i == 4) {
                WXVideoObject wXVideoObject = (WXVideoObject) iMediaObject;
                bVar.f195586j = wXVideoObject.videoUrl;
                bVar.f195590k = wXVideoObject.videoLowBandUrl;
                return null;
            } else if (i == 5 || i == 54 || i == 69) {
                WXWebpageObject wXWebpageObject = (WXWebpageObject) iMediaObject;
                bVar.f195586j = wXWebpageObject.webpageUrl;
                if (!Util.isNullOrNil(wXWebpageObject.extInfo)) {
                    bVar.f195614q = wXWebpageObject.extInfo;
                }
                if (!Util.isNullOrNil(wXWebpageObject.canvasPageXml)) {
                    bVar.f195475C2 = wXWebpageObject.canvasPageXml;
                }
                if (bVar.f195582i == 69 && (wXWebpageObject instanceof C8476b)) {
                    C8476b bVar2 = (C8476b) wXWebpageObject;
                    C76074a aVar4 = new C76074a();
                    aVar4.f222931b = bVar2.f27477a;
                    aVar4.f222932c = bVar2.f27478b;
                    aVar4.f222933d = bVar2.f27479c;
                    aVar4.f222934e = bVar2.f27480d;
                    aVar4.f222935f = bVar2.f27481e;
                    bVar.mo93545f(aVar4);
                }
                return null;
            } else {
                if (i == 36 || i == 46 || i == 48) {
                    WXMiniProgramObject wXMiniProgramObject = (WXMiniProgramObject) iMediaObject;
                    bVar.f195573f2 = wXMiniProgramObject.userName;
                    bVar.f195569e2 = wXMiniProgramObject.path;
                    bVar.f195586j = wXMiniProgramObject.webpageUrl;
                    WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(wXMiniProgramObject.userName);
                    if (N2 != null) {
                        if (N2.mo113942o2() != null) {
                            bVar.f195467A2 = N2.mo113942o2().f239452d;
                        }
                        bVar.f195471B2 = N2.field_brandIconURL;
                        Log.m105925i("MicroMsg.AppMsgLogic", "add appbrand version and appbrand icon url : %d, %s", Integer.valueOf(bVar.f195467A2), bVar.f195471B2);
                    }
                } else if (i == 1) {
                    bVar.f195570f = ((WXTextObject) iMediaObject).text;
                    return null;
                } else if (i == 8) {
                    WXEmojiObject wXEmojiObject = (WXEmojiObject) iMediaObject;
                    if (!Util.isNullOrNil(wXEmojiObject.emojiData)) {
                        Log.m105918d("MicroMsg.AppMsgLogic", C76861g.m92660c() + " fileData:" + wXEmojiObject.emojiData.length);
                        byte[] bArr4 = wXEmojiObject.emojiData;
                        bVar.f195594l = bArr4.length;
                        return m85083y(bArr4);
                    } else if (!Util.isNullOrNil(wXEmojiObject.emojiPath)) {
                        bVar.f195594l = (int) C86013q1.m106451l(wXEmojiObject.emojiPath);
                        Log.m105918d("MicroMsg.AppMsgLogic", C76861g.m92660c() + " read file:" + wXEmojiObject.emojiPath + " len:" + bVar.f195594l);
                        if (bVar.f195594l <= 0) {
                            return null;
                        }
                        bVar.f195602n = C86013q1.m106454o(wXEmojiObject.emojiPath);
                        return wXEmojiObject.emojiPath;
                    } else {
                        bVar.f195610p = str;
                    }
                } else if (i == 15) {
                    WXEmojiSharedObject wXEmojiSharedObject = (WXEmojiSharedObject) iMediaObject;
                    bVar.f195646y = wXEmojiSharedObject.thumburl;
                    bVar.f195587j0 = wXEmojiSharedObject.packageflag;
                    bVar.f195583i0 = wXEmojiSharedObject.packageid;
                    bVar.f195492H = 8;
                    bVar.f195586j = wXEmojiSharedObject.url;
                    return null;
                } else if (i == 13) {
                    WXEmojiSharedObject wXEmojiSharedObject2 = (WXEmojiSharedObject) iMediaObject;
                    bVar.f195646y = wXEmojiSharedObject2.thumburl;
                    bVar.f195587j0 = wXEmojiSharedObject2.packageflag;
                    bVar.f195583i0 = wXEmojiSharedObject2.packageid;
                    bVar.f195492H = 8;
                    bVar.f195586j = wXEmojiSharedObject2.url;
                    return null;
                } else if (i == 68) {
                    WXLiteAppObject wXLiteAppObject = (WXLiteAppObject) iMediaObject;
                    bVar.f195586j = wXLiteAppObject.webpageUrl;
                    bVar.f195621r2 = wXLiteAppObject.userName;
                    bVar.f195625s2 = wXLiteAppObject.path;
                    bVar.f195629t2 = wXLiteAppObject.query;
                    bVar.f195633u2 = wXLiteAppObject.source;
                    bVar.f195492H = 0;
                    return null;
                } else if (i == 25) {
                    WXDesignerSharedObject wXDesignerSharedObject = (WXDesignerSharedObject) iMediaObject;
                    bVar.f195646y = wXDesignerSharedObject.thumburl;
                    bVar.f195586j = wXDesignerSharedObject.url;
                    bVar.f195502J1 = wXDesignerSharedObject.designerUIN;
                    bVar.f195505K1 = wXDesignerSharedObject.designerName;
                    bVar.f195508L1 = wXDesignerSharedObject.designerRediretctUrl;
                    bVar.f195492H = 18;
                    return null;
                } else if (i == 27 || i == 26) {
                    WXEmojiPageSharedObject wXEmojiPageSharedObject = (WXEmojiPageSharedObject) iMediaObject;
                    String str3 = wXEmojiPageSharedObject.iconUrl;
                    bVar.f195646y = str3;
                    bVar.f195586j = wXEmojiPageSharedObject.url;
                    bVar.f195511M1 = wXEmojiPageSharedObject.tid;
                    bVar.f195514N1 = wXEmojiPageSharedObject.title;
                    bVar.f195517O1 = wXEmojiPageSharedObject.desc;
                    bVar.f195520P1 = str3;
                    bVar.f195523Q1 = wXEmojiPageSharedObject.secondUrl;
                    bVar.f195526R1 = wXEmojiPageSharedObject.pageType;
                    bVar.f195492H = 20;
                    return null;
                } else if (i == 97) {
                    C77058k0 k0Var = (C77058k0) iMediaObject;
                    String str4 = k0Var.iconUrl;
                    bVar.f195646y = str4;
                    bVar.f195586j = k0Var.url;
                    bVar.f195511M1 = k0Var.tid;
                    bVar.f195514N1 = k0Var.title;
                    bVar.f195517O1 = k0Var.desc;
                    bVar.f195520P1 = str4;
                    bVar.f195523Q1 = k0Var.secondUrl;
                    bVar.f195526R1 = k0Var.pageType;
                    bVar.f195529S1 = k0Var.f225102a;
                    bVar.f195492H = 0;
                    return null;
                } else if (i == 101) {
                    WXNativeGamePageObject wXNativeGamePageObject = (WXNativeGamePageObject) iMediaObject;
                    C72915l lVar = new C72915l();
                    bVar.f195586j = "https://support.weixin.qq.com/update/";
                    LiteAppBizDataInfo liteAppBizDataInfo = aVar.f211484f;
                    if (liteAppBizDataInfo == null) {
                        Log.m105920e("MicroMsg.AppMsgLogic", "johnjh msg gamepageobject or liteappbizdatainfo is null");
                        return null;
                    }
                    bVar.f195621r2 = liteAppBizDataInfo.f19382d;
                    bVar.f195625s2 = liteAppBizDataInfo.f19383e;
                    bVar.f195629t2 = liteAppBizDataInfo.f19384f;
                    bVar.f195633u2 = liteAppBizDataInfo.f19386h.intValue();
                    LiteAppBizDataInfo liteAppBizDataInfo2 = aVar.f211484f;
                    lVar.f212511b = liteAppBizDataInfo2.f19385g;
                    lVar.f212512c = liteAppBizDataInfo2.f19387i;
                    if (wXNativeGamePageObject.isVideo) {
                        lVar.f212515f = 1;
                    } else {
                        lVar.f212515f = 0;
                    }
                    lVar.f212516g = wXNativeGamePageObject.videoDuration;
                    lVar.f212514e = wXNativeGamePageObject.shareData;
                    lVar.f212513d = aVar.f211483e;
                    lVar.f212517h = 0;
                    bVar.mo93545f(lVar);
                    return null;
                }
                return null;
            }
        }
    }

    /* renamed from: s */
    public static int m85077s(long j, String str, String str2) {
        C72683d Yt = C72709y1.vx0().mo100150Yt(j);
        if (Yt == null) {
            Log.m105920e("MicroMsg.AppMsgLogic", "ERR:" + C76861g.m92660c() + " getinfo failed: " + str2);
            return -1;
        } else if (Yt.field_status != 101) {
            Log.m105920e("MicroMsg.AppMsgLogic", "ERR:" + C76861g.m92660c() + " get status failed: " + str2 + " status:" + Yt.field_status);
            return -1;
        } else {
            Yt.field_status = 102;
            Yt.field_lastModifyTime = Util.nowSecond();
            C72709y1.vx0().update(Yt, new String[0]);
            String m1 = C77335p.m93216m1(Yt.field_createTime, str, j);
            C68104e.f195751a.mo93612a(m1, new WeakReference((Object) null));
            Log.m105925i("MicroMsg.AppMsgLogic", "pauseDownloadAttach %s %s %s %s", Long.valueOf(j), str, str2, m1);
            return 0;
        }
    }

    /* renamed from: t */
    public static int m85078t(long j, String str) {
        C72683d Yt = C72709y1.vx0().mo100150Yt(j);
        if (Yt == null) {
            Log.m105920e("MicroMsg.AppMsgLogic", "ERR:" + C76861g.m92660c() + " getinfo failed: " + str);
            return -1;
        } else if (Yt.field_status != 101) {
            Log.m105920e("MicroMsg.AppMsgLogic", "ERR:" + C76861g.m92660c() + " get status failed: " + str + " status:" + Yt.field_status);
            return -1;
        } else {
            if (!Util.isNullOrNil(Yt.field_clientAppDataId) || Util.isNullOrNil(Yt.field_mediaSvrId)) {
                Yt.field_status = 105;
            } else {
                Yt.field_status = 102;
            }
            Yt.field_lastModifyTime = Util.nowSecond();
            C72709y1.vx0().update(Yt, new String[0]);
            return 0;
        }
    }

    /* renamed from: u */
    public static int m85079u(long j, String str) {
        C72683d Yt = C72709y1.vx0().mo100150Yt(j);
        if (Yt == null) {
            Log.m105920e("MicroMsg.AppMsgLogic", "ERR:" + C76861g.m92660c() + " getinfo failed: " + str);
            return -1;
        }
        long j2 = Yt.field_status;
        if (j2 == 105 || j2 == 101) {
            Yt.field_status = 101;
            Yt.field_lastModifyTime = Util.nowSecond();
            C72709y1.vx0().update(Yt, new String[0]);
            C72709y1.zx0().mo100171d();
            return 0;
        }
        Log.m105920e("MicroMsg.AppMsgLogic", "ERR:" + C76861g.m92660c() + " get status failed: " + str + " status:" + Yt.field_status);
        return -1;
    }

    /* renamed from: v */
    public static int m85080v(long j, String str, C98121d dVar, boolean z) {
        int a;
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(j);
        if (b002.getMsgId() != j) {
            Log.m105920e("MicroMsg.AppMsgLogic", C76861g.m92660c() + " getmsgFailed id:" + j);
            a = C76861g.m92658a();
        } else {
            C68070l.C68072b u = C68070l.C68072b.m80422u(b002.getContent(), (String) null);
            if (u == null) {
                Log.m105920e("MicroMsg.AppMsgLogic", C76861g.m92660c() + " getmsgFailed id:" + j);
                a = C76861g.m92658a();
            } else if (u.f195582i == 6 && b002.getType() == 10000) {
                Log.m105921e("MicroMsg.AppMsgLogic", "rebuildXMLAtUploadFin: stop send revoke msg(%s)", Long.valueOf(b002.getMsgId()));
                return -1;
            } else {
                u.f195606o = str;
                if (z && dVar != null) {
                    u.f195524R = dVar.field_aesKey.equals("") ? u.f195524R : dVar.field_aesKey;
                    u.f195500J = dVar.field_fileId.equals("") ? u.f195500J : dVar.field_fileId;
                    u.f195622s = dVar.field_filemd5.equals("") ? u.f195622s : dVar.field_filemd5;
                    long j2 = dVar.field_fileLength;
                    u.f195594l = j2 == 0 ? u.f195594l : (int) j2;
                    u.f195503K = dVar.field_thumbUrl.equals("") ? u.f195503K : dVar.field_thumbUrl;
                }
                b002.mo108732L2(C68070l.C68072b.m80420s(u, u.f195606o, dVar));
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
                C68070l a0 = C72709y1.Ax0().mo135038a0(j);
                if (a0 != null) {
                    a0.field_xml = b002.getContent();
                    C72709y1.Ax0().update(a0, "msgId");
                }
                if (z) {
                    C72683d Yt = C72709y1.vx0().mo100150Yt(j);
                    Yt.field_mediaSvrId = str;
                    Yt.field_offset = Yt.field_totalLen;
                    C72709y1.vx0().update(Yt, new String[0]);
                }
                return 0;
            }
        }
        return 0 - a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0215  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Long> m85081w(com.tencent.p014mm.storage.C72963f4 r18) {
        /*
            java.lang.Class<gt.k> r0 = p158gt.C98201k.class
            java.lang.String r1 = r18.getContent()
            r2 = 0
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r2)
            java.lang.String r3 = "MicroMsg.AppMsgLogic"
            if (r1 != 0) goto L_0x0016
            java.lang.String r0 = "resend app message error: app content null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            return r2
        L_0x0016:
            java.lang.String r4 = r1.f195606o
            com.tencent.mm.pluginsdk.model.app.d r4 = m85065g(r4)
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0040
            java.lang.String r6 = r4.field_fileFullPath
            if (r6 == 0) goto L_0x0040
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0040
            eb0.c r6 = eb0.C97625j3.m125812b()
            java.lang.String r6 = r6.mo105889d()
            java.lang.String r7 = r1.f195570f
            java.lang.String r8 = r1.f195602n
            java.lang.String r6 = m85063e(r6, r7, r8)
            java.lang.String r4 = r4.field_fileFullPath
            com.tencent.p014mm.vfs.C86013q1.m106442c(r4, r6)
            goto L_0x0041
        L_0x0040:
            r6 = r5
        L_0x0041:
            java.lang.String r4 = r18.mo108765s2()
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L_0x006e
            java.lang.String r4 = r18.mo108765s2()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x006e
            di3.d r4 = di3.C86312j.m106911c(r0)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            java.lang.String r9 = r18.mo108765s2()
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            java.lang.String r4 = r4.v10(r9, r8)
            r9 = -1
            byte[] r4 = com.tencent.p014mm.vfs.C86013q1.m106433O(r4, r7, r9)     // Catch:{ Exception -> 0x006d }
            goto L_0x006f
        L_0x006d:
        L_0x006e:
            r4 = r2
        L_0x006f:
            com.tencent.mm.message.l$b r14 = com.tencent.p014mm.message.C68070l.C68072b.m80418i(r1)
            java.lang.String r1 = r1.f195484F
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            long r10 = java.lang.System.currentTimeMillis()
            r9.append(r10)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r10 != 0) goto L_0x00aa
            com.tencent.mm.pluginsdk.model.app.d r6 = m85059a(r9, r14, r6)
            if (r6 != 0) goto L_0x00ab
            android.util.Pair r0 = new android.util.Pair
            int r1 = p206nj.C76861g.m92658a()
            int r7 = r7 - r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = -1
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.<init>(r1, r2)
            goto L_0x0346
        L_0x00aa:
            r6 = r2
        L_0x00ab:
            com.tencent.mm.storage.f4 r15 = new com.tencent.mm.storage.f4
            r15.<init>()
            if (r4 == 0) goto L_0x0114
            int r9 = r4.length
            if (r9 <= 0) goto L_0x0114
            int r9 = r14.f195582i
            r10 = 46
            if (r9 != r10) goto L_0x00d0
            di3.d r0 = di3.C86312j.m106911c(r0)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            r9 = 100
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.JPEG
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r0 = r0.yx0(r4, r9, r10)
            goto L_0x00dc
        L_0x00d0:
            r0 = 2
            if (r9 != r0) goto L_0x00d5
            r0 = 1
            goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.PNG
            java.lang.String r0 = m85082x(r4, r0, r9, r7)
        L_0x00dc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = p206nj.C76861g.m92660c()
            r4.append(r9)
            java.lang.String r9 = " thumbData MsgInfo path:"
            r4.append(r9)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 != 0) goto L_0x0114
            r15.mo108739S2(r0)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "new thumbnail saved, path"
            r4.append(r9)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
        L_0x0114:
            if (r6 == 0) goto L_0x0142
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            long r4 = r6.systemRowid
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r14.f195606o = r0
            int r0 = r14.f195582i
            r4 = 6
            if (r0 != r4) goto L_0x0142
            java.lang.String r0 = r14.f195622s
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0142
            com.tencent.mm.modelcdntran.u r0 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            java.lang.String r4 = r6.field_fileFullPath
            java.lang.String r0 = r0.mo127020d(r4)
            r14.f195622s = r0
        L_0x0142:
            java.lang.String r0 = com.tencent.p014mm.message.C68070l.C68072b.m80420s(r14, r2, r2)
            r15.mo108732L2(r0)
            r15.mo100991d(r8)
            java.lang.String r0 = r18.mo108768t()
            r15.mo108749c3(r0)
            java.lang.String r0 = r18.mo108768t()
            long r4 = eb0.C75604z3.m90843o(r0)
            r15.mo108733M2(r4)
            r15.mo108740T2(r8)
            int r0 = m85070l(r14)
            r15.setType(r0)
            java.lang.Class<f62.x0> r0 = f62.C75710x0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            f62.x0 r0 = (f62.C75710x0) r0
            java.lang.String r0 = r0.B00(r15)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x0188
            r15.mo101012p4(r0)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r2 = r15.f230724G
            r0[r7] = r2
            java.lang.String r2 = "NetSceneSendMsg:MsgSource:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r2, r0)
        L_0x0188:
            int r0 = r14.f195582i
            r2 = 53
            if (r0 != r2) goto L_0x0197
            r0 = r18
            java.lang.String r4 = r0.f230737U
            r15.f230737U = r4
            r15.f230755r = r8
            goto L_0x0199
        L_0x0197:
            r0 = r18
        L_0x0199:
            eb0.c r4 = eb0.C97625j3.m125812b()
            g62.l r4 = r4.mo105911z()
            com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
            long r4 = r4.my0(r15)
            int r9 = r14.f195582i
            if (r9 != r2) goto L_0x01c5
            com.tencent.mm.autogen.events.NotifyGroupSolitatireEvent r2 = new com.tencent.mm.autogen.events.NotifyGroupSolitatireEvent
            r2.<init>()
            com.tencent.mm.autogen.events.NotifyGroupSolitatireEvent$a r9 = r2.f193754d
            r9.f193756a = r7
            java.lang.String r10 = r15.f230737U
            r9.f193758c = r10
            java.lang.String r10 = r15.mo108768t()
            r9.f193757b = r10
            com.tencent.mm.autogen.events.NotifyGroupSolitatireEvent$b r9 = r2.f193755e
            r9.f193760a = r4
            r2.publish()
        L_0x01c5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = p206nj.C76861g.m92660c()
            r2.append(r9)
            java.lang.String r9 = " msginfo insert id: "
            r2.append(r9)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
            r9 = 0
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0215
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = p206nj.C76861g.m92660c()
            r0.append(r1)
            java.lang.String r1 = "insert msg failed :"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            android.util.Pair r0 = new android.util.Pair
            int r1 = p206nj.C76861g.m92658a()
            int r7 = r7 - r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r0.<init>(r1, r2)
            goto L_0x0346
        L_0x0215:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r9 = p206nj.C76861g.m92658a()
            r2.append(r9)
            java.lang.String r9 = " new msg inserted to db , local id = "
            r2.append(r9)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            r15.setMsgId(r4)
            com.tencent.mm.autogen.events.UpdateFailedMsgIdEvent r2 = new com.tencent.mm.autogen.events.UpdateFailedMsgIdEvent
            r2.<init>()
            com.tencent.mm.autogen.events.UpdateFailedMsgIdEvent$a r3 = r2.f193982d
            long r9 = r18.getMsgId()
            r3.f193983a = r9
            com.tencent.mm.autogen.events.UpdateFailedMsgIdEvent$a r3 = r2.f193982d
            r3.f193984b = r4
            r2.publish()
            com.tencent.mm.message.l r2 = new com.tencent.mm.message.l
            r2.<init>()
            java.lang.String r3 = r15.getContent()
            r2.field_xml = r3
            java.lang.String r3 = r14.f195570f
            r2.field_title = r3
            int r3 = r14.f195582i
            r2.field_type = r3
            java.lang.String r3 = r14.f195574g
            r2.field_description = r3
            r2.field_msgId = r4
            r2.field_source = r1
            com.tencent.mm.pluginsdk.model.app.s r1 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.Ax0()
            r1.insert(r2)
            if (r6 == 0) goto L_0x027f
            r6.field_msgInfoId = r4
            r0 = 101(0x65, double:5.0E-322)
            r6.field_status = r0
            com.tencent.mm.pluginsdk.model.app.e r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            java.lang.String[] r1 = new java.lang.String[r7]
            r0.update(r6, r1)
            m85058K(r15, r6)
            goto L_0x0338
        L_0x027f:
            int r1 = r14.f195582i
            r2 = 24
            if (r1 == r2) goto L_0x0293
            r2 = 19
            if (r1 != r2) goto L_0x028a
            goto L_0x0293
        L_0x028a:
            com.tencent.mm.pluginsdk.model.app.x1 r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.zx0()
            r0.mo100169b(r4)
            goto L_0x0338
        L_0x0293:
            java.lang.String r1 = r14.f195571f0
            te3.dp3 r1 = qg2.C101147j0.m132643x(r1)
            te3.kd0 r2 = new te3.kd0
            r2.<init>()
            if (r1 == 0) goto L_0x02a7
            java.util.LinkedList<te3.rc0> r3 = r2.f298618f
            java.util.LinkedList<te3.rc0> r6 = r1.f227155f
            r3.addAll(r6)
        L_0x02a7:
            java.lang.String r13 = r18.mo108768t()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = java.util.Collections.synchronizedList(r3)
            java.util.LinkedList<te3.rc0> r6 = r2.f298618f
            java.util.Iterator r6 = r6.iterator()
        L_0x02ba:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x030f
            java.lang.Object r9 = r6.next()
            te3.rc0 r9 = (te3.C101834rc0) r9
            long r10 = r9.f299276R
            r16 = 26214400(0x1900000, double:1.29516345E-316)
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 > 0) goto L_0x02d0
            goto L_0x02ba
        L_0x02d0:
            cp.c$b r10 = new cp.c$b
            r10.<init>()
            java.lang.String r11 = qg2.C101147j0.m132636q(r9, r4, r8)
            java.lang.String r12 = com.tencent.p014mm.vfs.C86013q1.m106456q(r11)
            r10.f122416g = r13
            long r7 = r9.f299276R
            r10.f122414e = r7
            java.lang.String r7 = r9.f299262K
            r10.f122413d = r7
            java.lang.String r7 = r9.f299266M
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x02f0
            goto L_0x02f2
        L_0x02f0:
            java.lang.String r12 = r9.f299266M
        L_0x02f2:
            r10.f122410a = r12
            java.lang.String r7 = r9.f299329u
            r10.f122411b = r7
            java.lang.String r7 = r9.f299297d
            r10.f122412c = r7
            java.lang.String r7 = r9.f299284V
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0305
            goto L_0x0307
        L_0x0305:
            java.lang.String r11 = r9.f299284V
        L_0x0307:
            r10.f122415f = r11
            r3.add(r10)
            r7 = 0
            r8 = 1
            goto L_0x02ba
        L_0x030f:
            int r6 = r3.size()
            if (r6 <= 0) goto L_0x0331
            ob0.b0 r6 = f40.C86709a0.m107524d()
            ld3.a r7 = new ld3.a
            com.tencent.mm.pluginsdk.model.app.y r8 = new com.tencent.mm.pluginsdk.model.app.y
            r9 = r8
            r10 = r4
            r12 = r18
            r0 = r15
            r15 = r2
            r16 = r1
            r17 = r0
            r9.<init>(r10, r12, r13, r14, r15, r16, r17)
            r7.<init>(r3, r8)
            r6.mo123460f(r7)
            goto L_0x0338
        L_0x0331:
            com.tencent.mm.pluginsdk.model.app.x1 r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.zx0()
            r0.mo100169b(r4)
        L_0x0338:
            android.util.Pair r0 = new android.util.Pair
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r0.<init>(r1, r2)
        L_0x0346:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C72695v.m85081w(com.tencent.mm.storage.f4):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0108 A[SYNTHETIC, Splitter:B:39:0x0108] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013a A[SYNTHETIC, Splitter:B:49:0x013a] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m85082x(byte[] r19, boolean r20, android.graphics.Bitmap.CompressFormat r21, boolean r22) {
        /*
            r0 = r19
            r1 = r22
            java.lang.Class<gt.k> r2 = p158gt.C98201k.class
            if (r1 == 0) goto L_0x001a
            di3.d r2 = di3.C86312j.m106911c(r2)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            java.lang.String r0 = r2.mo127189kD(r0)
            goto L_0x010c
        L_0x001a:
            di3.d r2 = di3.C86312j.m106911c(r2)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            r2.getClass()
            java.lang.String r3 = "create thumbnail, delete tmp file"
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r19)
            r5 = 0
            java.lang.String r6 = "MicroMsg.ImgInfoStorage"
            if (r4 == 0) goto L_0x003c
            java.lang.String r0 = "saveDirThumbForAppMsg save dir thumb error, thumbBuf is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            goto L_0x010b
        L_0x003c:
            java.lang.String r4 = com.tencent.p014mm.modelimage.C92839m.m117079SE()
            r7 = 1
            java.lang.String r8 = "msgth_"
            java.lang.String r9 = ""
            java.lang.String r2 = r2.mo127174TY(r4, r8, r9, r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            java.lang.String r9 = ".tmp"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "saveDirThumbForAppMsg, fullPath = "
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r9)
            r9 = 0
            java.io.OutputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106429K(r8, r9)     // Catch:{ Exception -> 0x00cb, all -> 0x00c9 }
            r10.write(r0)     // Catch:{ Exception -> 0x00c7 }
            r10.flush()     // Catch:{ Exception -> 0x00c7 }
            r0 = 128(0x80, float:1.794E-43)
            r11 = 120(0x78, float:1.68E-43)
            if (r20 == 0) goto L_0x0083
            r12 = 128(0x80, float:1.794E-43)
            goto L_0x0085
        L_0x0083:
            r12 = 120(0x78, float:1.68E-43)
        L_0x0085:
            if (r20 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r0 = 120(0x78, float:1.68E-43)
        L_0x008a:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r8, r12, r0, r9)     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x00a3
            r11 = 90
            r12 = r21
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r11, r12, r2, r7)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r0 = "in ImgInfoStorage, extractThumbNail done: %s, %s"
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x00c7 }
            r11[r9] = r8     // Catch:{ Exception -> 0x00c7 }
            r11[r7] = r2     // Catch:{ Exception -> 0x00c7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r0, r11)     // Catch:{ Exception -> 0x00c7 }
        L_0x00a3:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r0 == 0) goto L_0x00af
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r3)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r8)
        L_0x00af:
            r10.close()     // Catch:{ Exception -> 0x00b2 }
        L_0x00b2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "THUMBNAIL_APPMSG_DIR://msgth_"
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            goto L_0x010c
        L_0x00c4:
            r0 = move-exception
            r5 = r10
            goto L_0x012c
        L_0x00c7:
            r0 = move-exception
            goto L_0x00cd
        L_0x00c9:
            r0 = move-exception
            goto L_0x012c
        L_0x00cb:
            r0 = move-exception
            r10 = r5
        L_0x00cd:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x00c4 }
            r12 = 111(0x6f, double:5.5E-322)
            r14 = 189(0xbd, double:9.34E-322)
            r16 = 1
            r18 = 0
            r11.idkeyStat(r12, r14, r16, r18)     // Catch:{ all -> 0x00c4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            r2.<init>()     // Catch:{ all -> 0x00c4 }
            java.lang.String r7 = "create thumbnail from byte failed: msgth_"
            r2.append(r7)     // Catch:{ all -> 0x00c4 }
            r2.append(r4)     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = ", ex = "
            r2.append(r4)     // Catch:{ all -> 0x00c4 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00c4 }
            r2.append(r0)     // Catch:{ all -> 0x00c4 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00c4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ all -> 0x00c4 }
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r0 == 0) goto L_0x0106
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r3)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r8)
        L_0x0106:
            if (r10 == 0) goto L_0x010b
            r10.close()     // Catch:{ Exception -> 0x010b }
        L_0x010b:
            r0 = r5
        L_0x010c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "saveAppMsgDirThumb directSave:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "  path:"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MicroMsg.AppMsgLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return r0
        L_0x012c:
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r1 == 0) goto L_0x0138
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r3)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r8)
        L_0x0138:
            if (r5 == 0) goto L_0x013d
            r5.close()     // Catch:{ Exception -> 0x013d }
        L_0x013d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C72695v.m85082x(byte[], boolean, android.graphics.Bitmap$CompressFormat, boolean):java.lang.String");
    }

    /* renamed from: y */
    public static String m85083y(byte[] bArr) {
        if (Util.isNullOrNil(bArr)) {
            Log.m105920e("MicroMsg.AppMsgLogic", C76861g.m92660c() + " attachBuf is null");
            return null;
        }
        String str = C97625j3.m125812b().mo105889d() + "ua_" + Util.nowMilliSecond();
        Log.m105918d("MicroMsg.AppMsgLogic", C76861g.m92660c() + " buildUploadAttachInfo file:" + str);
        if (C86013q1.m106438T(str, bArr, 0, bArr.length) == 0) {
            return str;
        }
        Log.m105920e("MicroMsg.AppMsgLogic", C76861g.m92660c() + " writeFile error file:" + str);
        return null;
    }

    /* renamed from: z */
    public static int m85084z(C68070l.C68072b bVar, WXMediaMessage wXMediaMessage, String str, String str2, int i, C72681a aVar) {
        return m85048A(bVar, wXMediaMessage, str, str2, (String) null, i, aVar, (Map<String, Long>) null, (String) null, (String) null, (String) null, (String) null);
    }
}
