package hd0;

import a11.C39478b;
import android.net.Uri;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.xweb.util.FrequentLimiter;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75604z3;
import eb0.z3$$h;
import f40.C86709a0;
import f62.C75700k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import ob0.C35136m;
import ob0.C35141t;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p575jn.C98950b;
import p663qo.C101213l;
import p682rz.C101489t;
import p823sg.C101614i;
import p872ah.C67046a;
import q90.C101062d;
import sf0.C48374j0;
import sf0.C90188n0;
import te3.C77949j3;
import zt3.C119157j;

/* renamed from: hd0.u0 */
public class C76157u0 implements C35141t {
    /* renamed from: Fg */
    public C35136m.C35139b mo56403Fg(C35136m.C35137a aVar) {
        String str;
        String str2;
        long j;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        byte[] bArr;
        String str12;
        int i2;
        int i3;
        C35136m.C35137a aVar2 = aVar;
        Class<C101213l> cls = C101213l.class;
        Class cls2 = C75700k0.class;
        C77949j3 j3Var = aVar2.f94242a;
        if (j3Var == null) {
            Log.m105920e("MicroMsg.VideoMsgExtension", "onPreAddMessage cmdAM is null , give up.");
            return null;
        }
        String str13 = (String) C86709a0.m107535s().mo121142i().mo119684e(2, "");
        String g = C48374j0.m53718g(j3Var.f227629f);
        String g2 = C48374j0.m53718g(j3Var.f227628e);
        boolean z = ((C44667s4) ((C75700k0) C86709a0.m107533q(cls2)).V50()).mo69822qq(g2) || str13.equals(g2);
        Log.m105919d("MicroMsg.VideoMsgExtension", "video msg fromuser %s, toUser %s, userName %s, isSender %b", g2, g, str13, Boolean.valueOf(z));
        String str14 = str13;
        C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).h30(str13.equals(g2) ? g : g2, j3Var.f227638r);
        Log.m105925i("MicroMsg.VideoMsgExtension", "dkmsgid prepareMsgInfo svrid:%d localid:%d, flag:%d, msgseq:%d, addMsgInfo[%s]", Long.valueOf(j3Var.f227638r), Long.valueOf(h302.getMsgId()), Integer.valueOf(h302.mo108762o2()), Long.valueOf(h302.mo108772w2()), aVar2);
        long j2 = 0;
        if (h302.getMsgId() != 0) {
            if (h302.getCreateTime() + FrequentLimiter.WEEK_MILLS < C75604z3.m90841m(g2, (long) j3Var.f227635o)) {
                Log.m105929w("MicroMsg.VideoMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d localid:%d", Long.valueOf(j3Var.f227638r), Long.valueOf(h302.getMsgId()));
                C75604z3.m90834f(h302.getMsgId());
                j2 = 0;
                h302.setMsgId(0);
            } else {
                j2 = 0;
            }
        }
        if (h302.getMsgId() != j2) {
            Log.m105919d("MicroMsg.VideoMsgExtension", "Msgid:%d duplicate give up ", Long.valueOf(j3Var.f227638r));
            return null;
        }
        String g3 = C48374j0.m53718g(j3Var.f227631h);
        C98408n0 n0Var = new C98408n0();
        n0Var.f288570q = z ? g : g2;
        n0Var.f288563j = (long) j3Var.f227635o;
        n0Var.f288556c = j3Var.f227638r;
        n0Var.f288575v = j3Var.f227631h.f141175d;
        Log.m105925i("MicroMsg.VideoMsgExtension", "parseVideoMsgXml [%s] msg Source[%s]", g3, j3Var.f227636p);
        Map<String, String> parseXml = XmlParser.parseXml(g3, "msg", (String) null);
        if (parseXml == null) {
            C115669n.INSTANCE.idkeyStat(111, 216, 1, false);
            return null;
        }
        C72963f4 f4Var = new C72963f4();
        f4Var.mo101012p4(j3Var.f227636p);
        z3$$h w = C75604z3.m90851w(j3Var.f227636p);
        if (w != null) {
            f4Var.mo108731K2(w.f222099f);
            f4Var.f230739W = w.f222100g;
            f4Var.f230755r = true;
        }
        C98442x0 b = C98442x0.f288734i.mo137781b(g3);
        if (b != null) {
            str2 = "";
            long j3 = b.f288737a;
            str = g;
            if (b.f288738b) {
                if (((C98442x0) ((C101062d) C98442x0.f288736k).get(Long.valueOf(n0Var.f288556c))) != null) {
                    Log.m105928w("MicroMsg.VideoMsgExtension", "have complete msg, it may be place holder msg recv after complete msg, ignore it");
                    return null;
                }
            }
            j = j3;
        } else {
            str2 = "";
            str = g;
            j = 0;
        }
        try {
            n0Var.f288559f = Util.getInt(parseXml.get(".msg.videomsg.$length"), 0);
            n0Var.f288566m = Util.getInt(parseXml.get(".msg.videomsg.$playlength"), 0);
            Log.m105925i("MicroMsg.VideoMsgExtension", "video msg total len %d, video len %d", Integer.valueOf(n0Var.f288559f), Integer.valueOf(n0Var.f288566m));
            n0Var.f288571r = parseXml.get(".msg.videomsg.$fromusername");
            String str15 = str14;
            if (str15.equals(n0Var.mo137701e())) {
                str3 = str;
                n0Var.f288571r = str3;
            } else {
                str3 = str;
            }
            n0Var.f288536D = parseXml.get(".msg.statextstr");
            String str16 = parseXml.get(".msg.videomsg.$cdnthumbaeskey");
            String str17 = parseXml.get(".msg.videomsg.$cdnthumburl");
            String str18 = str3;
            int i4 = Util.getInt(parseXml.get(".msg.videomsg.$cdnthumblength"), 0);
            String str19 = parseXml.get(".msg.videomsg.$tpvideourl");
            int i5 = i4;
            String str20 = parseXml.get(".msg.videomsg.$tpthumburl");
            String str21 = parseXml.get(".msg.videomsg.$tpauthkey");
            String str22 = parseXml.get(".msg.videomsg.$tpthumbaeskey");
            String str23 = str15;
            int i6 = Util.getInt(parseXml.get(".msg.videomsg.$tpthumblength"), 0);
            int i7 = Util.getInt(parseXml.get(".msg.videomsg.$type"), 0);
            StringBuilder sb = new StringBuilder();
            Class<C101213l> cls3 = cls;
            sb.append("video msg exportType :");
            sb.append(i7);
            Log.m105918d("MicroMsg.VideoMsgExtension", sb.toString());
            n0Var.f288572s = i7 == 44 ? 1 : 0;
            if (62 == j3Var.f227630g) {
                n0Var.f288576w = 3;
                str7 = str16;
                str6 = str17;
                i = i5;
                str8 = str20;
                str5 = str21;
                str4 = str22;
                str9 = str23;
            } else if (i7 > 0) {
                n0Var.f288576w = 2;
                str9 = str23;
                str7 = str16;
                str6 = str17;
                i = i5;
                str8 = str20;
                str5 = str21;
                str4 = str22;
            } else {
                str9 = str23;
                n0Var.f288576w = 1;
                str7 = str16;
                str6 = str17;
                i = i5;
                str8 = str20;
                str5 = str21;
                str4 = str22;
            }
            String str24 = str8;
            String str25 = str2;
            String str26 = str19;
            n0Var.mo137714r(Util.nullAs(parseXml.get(".msg.streamvideo.streamvideourl"), str25), Util.getInt(parseXml.get(".msg.streamvideo.streamvideototaltime"), 0), Util.nullAs(parseXml.get(".msg.streamvideo.streamvideotitle"), str25), Util.nullAs(parseXml.get(".msg.streamvideo.streamvideowording"), str25), Util.nullAs(parseXml.get(".msg.streamvideo.streamvideoweburl"), str25), Util.nullAs(parseXml.get(".msg.streamvideo.streamvideoaduxinfo"), str25), Util.nullAs(parseXml.get(".msg.streamvideo.streamvideopublishid"), str25));
            String str27 = str9;
            if (n0Var.mo137701e().equals((String) C86709a0.m107535s().mo121142i().mo119684e(2, str25))) {
                return null;
            }
            String str28 = parseXml.get(".msg.commenturl");
            Map<String, String> parseXml2 = XmlParser.parseXml(g3, "msgoperation", (String) null);
            if (parseXml2 != null) {
                f4Var.f230733Q = parseXml2.get(".msgoperation.expinfo.expidstr");
                f4Var.f230755r = true;
                int i8 = Util.getInt(parseXml2.get(".msgoperation.sightmsg.downloadcontroltype"), 0);
                f4Var.f230734R = i8;
                f4Var.f230755r = true;
                str10 = str25;
                Log.m105925i("MicroMsg.VideoMsgExtension", "[chatting_exp] expidstr:%s, downloadcontroltype:%d", f4Var.f230733Q, Integer.valueOf(i8));
            } else {
                str10 = str25;
            }
            String e = n0Var.mo137701e();
            C101614i<String, ArrayList<C98408n0>> iVar = C98410o0.f288586c;
            String a = C98426q0.m127793a(e);
            n0Var.f288554a = a;
            f4Var.mo108745Y2(n0Var.f288556c);
            f4Var.mo108739S2(n0Var.mo137700d());
            Class cls4 = cls2;
            String str29 = g2;
            f4Var.mo108733M2(C75604z3.m90841m(n0Var.mo137707k(), n0Var.f288563j));
            f4Var.mo108749c3(n0Var.mo137707k());
            f4Var.mo100991d(j3Var.f227632i);
            f4Var.mo108740T2(z ? 1 : 0);
            if (j3Var.f227630g == 62) {
                f4Var.setType(62);
            } else {
                f4Var.setType(43);
            }
            f4Var.mo108732L2(C32829l0.m39827b(n0Var.mo137701e(), 0, false));
            f4Var.mo108746Z2(g3);
            f4Var.f230722E = str28;
            f4Var.f230755r = true;
            String str30 = j3Var.f227636p;
            if (f4Var.mo100994f4()) {
                str11 = str29;
                if (f4Var.getCreateTime() != ((long) j3Var.f227635o) * 1000 && !Util.isNullOrNil(str30)) {
                    str30 = str30.replace("</msgsource>", "<realcreatetime>" + j3Var.f227635o + "</realcreatetime></msgsource>");
                }
            } else {
                str11 = str29;
            }
            f4Var.mo101012p4(str30);
            C75604z3.m90842n(f4Var, aVar2);
            if (j != 0) {
                String str31 = str11;
                C72963f4 h303 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls4)).mo96095LE()).h30(str27.equals(str31) ? str18 : str31, j);
                int type = h303.getType();
                h303.mo108746Z2(g3);
                h303.mo108745Y2(n0Var.f288556c);
                C98408n0 i9 = C98429r0.m127818i(h303.mo108765s2());
                if (!(i9 == null || type == 268445456)) {
                    i9.f288575v = g3;
                    i9.f288556c = n0Var.f288556c;
                    C98429r0.m127808N(i9);
                    C98438x yx02 = C98398h0.yx0();
                    synchronized (yx02.f288719a) {
                        yx02.f288719a.offerFirst(h303);
                    }
                    ((C119157j) C119157j.f356862d).mo183875f(new C98444y(yx02));
                }
                C75604z3.m90828C(h303);
                return null;
            }
            long x = C75604z3.m90852x(f4Var);
            if (x <= 0) {
                C115669n.INSTANCE.idkeyStat(111, 215, 1, false);
                Log.m105921e("MicroMsg.VideoMsgExtension", "onPreAddMessage insert msg failed local:%d svrid:%d", Long.valueOf(x), Long.valueOf(n0Var.f288556c));
                return null;
            }
            n0Var.f288567n = (long) ((int) x);
            n0Var.f288564k = Util.nowSecond();
            n0Var.f288568o = 0;
            n0Var.f288562i = 111;
            Log.m105918d("MicroMsg.VideoMsgExtension", "Insert fileName[" + n0Var.mo137700d() + "] size:" + n0Var.f288559f + " svrid:" + n0Var.f288556c + " timelen:" + n0Var.f288566m + " user:" + n0Var.mo137707k() + " human:" + n0Var.mo137701e());
            if (!C98398h0.Bx0().mo137730s(n0Var)) {
                Log.m105918d("MicroMsg.VideoMsgExtension", "Insert Error fileName:" + n0Var.mo137700d());
                return null;
            }
            String r = C98398h0.Bx0().mo137729r(a);
            byte[] d = C48374j0.m53715d(j3Var.f227634n);
            Log.m105925i("MicroMsg.VideoMsgExtension", "imgBuf  :%d", Integer.valueOf(Util.getLength(d)));
            if (C90188n0.f258956x) {
                Log.m105928w("MicroMsg.VideoMsgExtension", "Test.useCdnDownThumb  set img buf null !!!!!!!");
                bArr = null;
            } else {
                bArr = d;
            }
            if (!Util.isNullOrNil(bArr)) {
                C98410o0.m127733x(r, 0, bArr);
                str12 = str10;
            } else if (!Util.isNullOrNil(str26)) {
                long j4 = n0Var.f288556c;
                Log.m105925i("MicroMsg.VideoMsgExtension", "getThumbByCdn msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", Long.valueOf(j4), n0Var.mo137707k(), str24, r);
                long nowMilliSecond = Util.nowMilliSecond();
                String str32 = r + ".tmp";
                C98124g gVar = new C98124g();
                gVar.f287660d = "task_VideoMsgExtension_1";
                long j5 = n0Var.f288563j;
                String k = n0Var.mo137707k();
                StringBuilder sb4 = new StringBuilder();
                str12 = str10;
                sb4.append(str12);
                sb4.append(j4);
                gVar.field_mediaId = C1297x.m1387b("downvideothumb", j5, k, sb4.toString());
                gVar.field_fullpath = str32;
                gVar.field_fileType = 19;
                gVar.field_aesKey = str4;
                gVar.field_authKey = str5;
                String str33 = str24;
                gVar.f287672s = str33;
                gVar.f287662f = new C76155s0(this, j4, n0Var, r, str33, i6, str32, nowMilliSecond);
                ((C101213l) C86312j.m106911c(cls3)).xf0(gVar);
            } else {
                str12 = str10;
                long j6 = n0Var.f288556c;
                Log.m105925i("MicroMsg.VideoMsgExtension", "getThumbByCdn msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", Long.valueOf(j6), n0Var.mo137707k(), str6, r);
                long nowMilliSecond2 = Util.nowMilliSecond();
                String str34 = r + ".tmp";
                C98124g gVar2 = new C98124g();
                gVar2.f287660d = "task_VideoMsgExtension_2";
                gVar2.field_mediaId = C1297x.m1387b("downvideothumb", n0Var.f288563j, n0Var.mo137707k(), str12 + j6);
                gVar2.field_fullpath = str34;
                gVar2.field_fileType = 3;
                int i15 = i;
                gVar2.field_totalLen = i15;
                gVar2.field_aesKey = str7;
                String str35 = str6;
                gVar2.field_fileId = str35;
                gVar2.field_priority = 3;
                boolean U5 = C72996z1.m85820U5(n0Var.mo137707k());
                gVar2.field_chattype = U5 ? 1 : 0;
                Log.m105919d("MicroMsg.VideoMsgExtension", "get thumb by cdn [video] chatType[%d] user[%s] ", Integer.valueOf(U5), n0Var.mo137707k());
                gVar2.f287662f = new C76156t0(this, j6, n0Var, r, str35, i15, str34, nowMilliSecond2);
                ((C101213l) C86312j.m106911c(cls3)).xf0(gVar2);
            }
            if (f4Var.mo100989b4() && ((C98950b) C86312j.m106911c(C98950b.class)).mo59102Tv(f4Var)) {
                C98429r0.m127804J(f4Var.mo108765s2());
                ((C101213l) C86312j.m106911c(cls3)).mo140297CA().add("video_" + f4Var.getMsgId());
            }
            if (C72996z1.m85820U5(n0Var.mo137707k())) {
                i3 = ((C39478b) C86312j.m106911c(C39478b.class)).mo62080p1(n0Var.mo137707k());
                i2 = (C45628s0.m50747L(n0Var.mo137707k()) || !C45628s0.m50739D(n0Var.mo137707k())) ? 2 : 3;
            } else {
                i3 = 0;
                i2 = 1;
            }
            C115669n.INSTANCE.mo160131h(14388, Long.valueOf(f4Var.mo108774y2()), Integer.valueOf(i2), str12, Integer.valueOf(i3));
            C98438x yx03 = C98398h0.yx0();
            synchronized (yx03.f288719a) {
                yx03.f288719a.offerFirst(f4Var);
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C98444y(yx03));
            return new C35136m.C35139b(f4Var, true);
        } catch (Exception e2) {
            C115669n.INSTANCE.idkeyStat(111, 216, 1, false);
            Log.m105920e("MicroMsg.VideoMsgExtension", "parsing voice msg xml failed");
            Log.m105921e("MicroMsg.VideoMsgExtension", "exception:%s", Util.stackTraceToString(e2));
            return null;
        }
    }

    /* renamed from: d */
    public int mo106356d(int i, C98121d dVar, long j, C98408n0 n0Var, String str, String str2, int i2, String str3, long j2) {
        C98408n0 f;
        C98121d dVar2 = dVar;
        int i3 = i2;
        if (i != 0) {
            Log.m105921e("MicroMsg.VideoMsgExtension", "getThumbByCdn failed. startRet:%d msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", Integer.valueOf(i), Long.valueOf(j), n0Var.mo137707k(), str2, str);
            return i;
        } else if (dVar2 == null) {
            return 0;
        } else {
            int i4 = dVar2.field_retCode;
            if (i4 != 0) {
                Log.m105921e("MicroMsg.VideoMsgExtension", "getThumbByCdn failed. sceneResult.field_retCode:%d msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", Integer.valueOf(i4), Long.valueOf(j), n0Var.mo137707k(), str2, str);
                C98408n0 n0Var2 = n0Var;
            } else {
                Uri n = C116299g2.m163858n(str);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                Uri n2 = C116299g2.m163858n(str3);
                String path2 = n2.getPath();
                if (path2 != null) {
                    String k2 = C116299g2.m163855k(path2, false, false);
                    if (!n2.getPath().equals(k2)) {
                        n2 = n2.buildUpon().path(k2).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
                C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (l.mo177810a() && l2.mo177810a()) {
                    try {
                        l2.f348991a.mo119946t(l2.f348992b, l.f348991a, l.f348992b);
                    } catch (IOException unused) {
                    }
                }
                Log.m105925i("MicroMsg.VideoMsgExtension", "getThumbByCdn succ. msgSvrId:%d user:%s thumbUrl:%s thumbPath:%s", Long.valueOf(j), n0Var.mo137707k(), str2, str);
                if (n0Var.f288576w == 3) {
                    C115669n nVar = C115669n.INSTANCE;
                    C115669n nVar2 = nVar;
                    nVar2.idkeyStat(198, 6, (long) i3, false);
                    nVar2.idkeyStat(198, 7, 1, false);
                    nVar.idkeyStat(198, C72996z1.m85820U5(n0Var.mo137707k()) ? 9 : 8, 1, false);
                } else {
                    C115669n nVar3 = C115669n.INSTANCE;
                    C115669n nVar4 = nVar3;
                    nVar4.idkeyStat(198, 11, (long) i3, false);
                    nVar4.idkeyStat(198, 12, 1, false);
                    nVar3.idkeyStat(198, C72996z1.m85820U5(n0Var.mo137707k()) ? 14 : 13, 1, false);
                }
            }
            C98410o0 Bx0 = C98398h0.Bx0();
            String d = n0Var.mo137700d();
            C101489t.C77595a.C77597c cVar = C101489t.C77595a.C77597c.NORMAL;
            Bx0.getClass();
            if (!Util.isNullOrNil(d) && (f = Bx0.mo137720f(d)) != null) {
                Bx0.f288588b.event(new C101489t.C77595a.C77596a(f.mo137700d(), C101489t.C77595a.C77598b.UPDATE, cVar, f.f288576w, f.f288577x));
                Bx0.f288588b.doNotify();
            }
            return 0;
        }
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
        C72963f4 f4Var = cVar.f94250a;
        if (f4Var != null) {
            C98429r0.m127815f(f4Var.mo108765s2());
        }
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }
}
