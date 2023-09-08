package dv0;

import com.google.android.gms.dynamite.ProviderConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.autogen.events.QueryRecordMsgMediaListEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import dv0.C97551k;
import eb0.C31543z5;
import eb0.C86484b;
import gw0.C76073b;
import hv0.C98540b;
import hv0.C98542c;
import hv0.C98543d;
import hv0.C98544e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import p753xp.C102704b;
import p867wp.C102479b;
import ph0.C100792a;
import pv0.C100968x;
import s90.C77627f;
import s90.C77630j;
import t90.C77879c;
import te3.C51163rv3;
import te3.C77926f9;
import vh0.C78415b;
import yu0.C102913k;

/* renamed from: dv0.c */
public class C97544c implements C75460n {
    /* renamed from: a */
    public int mo105806a(String str, C77926f9 f9Var, C72963f4 f4Var) {
        int b;
        C77926f9 f9Var2 = f9Var;
        C72963f4 f4Var2 = f4Var;
        Class cls = C77879c.class;
        Class cls2 = C102704b.class;
        String str2 = f9Var2.f227335f.f141175d;
        String str3 = f9Var2.f227337h.f141175d;
        if (str3 == null) {
            return 0;
        }
        f4Var2.mo108732L2(str3);
        if (!(f4Var.mo108769t2() == 1 || !C98543d.m128034e(str2) || (b = C98543d.m128031b(f9Var2.f227337h.f141175d)) == -1)) {
            str3 = (f9Var2.f227337h.f141175d + " ").substring(b + 2).trim();
        }
        String processXml = Util.processXml(str3);
        C68070l.C68072b u = C68070l.C68072b.m80422u(processXml, (String) null);
        if (u == null) {
            Log.m105920e("MicroMsg.BackupItemAppMsg", "parse app message failed, insert failed");
            return 0;
        }
        int i = u.f195582i;
        if (i == 2000 || i == 2011) {
            f4Var2.setType(419430449);
            C98543d.m128033d(f4Var);
            return 0;
        }
        int i2 = 7;
        int i3 = 19;
        if (i == 19 || i == 24) {
            f4Var2.setType(C72695v.m85070l(u));
            C98543d.m128033d(f4Var);
            QueryRecordMsgMediaListEvent queryRecordMsgMediaListEvent = new QueryRecordMsgMediaListEvent();
            QueryRecordMsgMediaListEvent.C92546a aVar = queryRecordMsgMediaListEvent.f265003d;
            aVar.f265005a = u.f195571f0;
            aVar.f265006b = f4Var.getMsgId();
            queryRecordMsgMediaListEvent.publish();
            Log.m105919d("MicroMsg.BackupItemAppMsg", "pathList:%s", queryRecordMsgMediaListEvent.f265004e.f265007a);
            String[] split = queryRecordMsgMediaListEvent.f265004e.f265007a.split(XVFSFile.PATH_SEPARATOR);
            int i4 = 0;
            while (i4 < split.length) {
                String x = C102913k.m136059x(f9Var2, i2, "." + i4);
                if (!Util.isNullOrNil(x)) {
                    Log.m105919d("MicroMsg.BackupItemAppMsg", "record mediaId:%s, index:%d", x, Integer.valueOf(i4));
                    C86013q1.m106463x(C102913k.m136050o(x) + x, split[i4]);
                    C102479b Bg = ((C102704b) C86312j.m106911c(cls2)).mo138748Bg(split[i4], i3, (String) null, (byte[]) null);
                    Log.m105919d("MicroMsg.BackupItemAppMsg", "recordCheckDup :%s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", split[i4], Integer.valueOf(Bg.f301760a), Boolean.valueOf(Bg.f301761b), Boolean.FALSE, Boolean.valueOf(Bg.f301762c), Long.valueOf(Bg.f301763d));
                }
                i4++;
                i3 = 19;
                i2 = 7;
            }
            return 0;
        } else if (i == 87) {
            f4Var2.setType(C72695v.m85070l(u));
            String content = f4Var.getContent();
            f4Var2.mo108732L2(content.substring(0, content.indexOf(60)) + ((C77879c) u.mo93555w(cls)).f226903b);
            f4Var2.mo108746Z2(content);
            f4Var2.mo101012p4(f9Var2.f227340n);
            C98543d.m128033d(f4Var);
            String[] jL = ((C78415b) C86312j.m106911c(C78415b.class)).mo94223jL(f4Var2, ((C77879c) u.mo93555w(cls)).f226904c);
            for (int i5 = 0; i5 < jL.length; i5++) {
                String x2 = C102913k.m136059x(f9Var2, 7, "_fav." + i5);
                if (!Util.isNullOrNil(x2)) {
                    Log.m105919d("MicroMsg.BackupItemAppMsg", "record mediaId:%s, index:%d", x2, Integer.valueOf(i5));
                    C86013q1.m106463x(C102913k.m136050o(x2) + x2, jL[i5]);
                }
            }
            return 0;
        } else if (i == 98) {
            f4Var2.setType(C72695v.m85070l(u));
            C98543d.m128033d(f4Var);
            List<String> f = C100792a.f295260a.mo140235f(f4Var2);
            int i6 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) f;
                if (i6 >= arrayList.size()) {
                    return 0;
                }
                String x3 = C102913k.m136059x(f9Var2, 7, "_asset." + i6);
                if (!Util.isNullOrNil(x3)) {
                    Log.m105919d("MicroMsg.BackupItemAppMsg", "album mediaId:%s, index:%d", x3, Integer.valueOf(i6));
                    C86013q1.m106463x(C102913k.m136050o(x3) + x3, (String) arrayList.get(i6));
                    C102479b Bg2 = ((C102704b) C86312j.m106911c(cls2)).mo138748Bg((String) arrayList.get(i6), 19, (String) null, (byte[]) null);
                    Log.m105919d("MicroMsg.BackupItemAppMsg", "recordCheckDup :%s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", arrayList.get(i6), Integer.valueOf(Bg2.f301760a), Boolean.valueOf(Bg2.f301761b), Boolean.FALSE, Boolean.valueOf(Bg2.f301762c), Long.valueOf(Bg2.f301763d));
                }
                i6++;
            }
        } else {
            C44561j jVar = new C44561j();
            jVar.field_appId = u.f195562d;
            C98542c e = C98544e.m128035f().mo137901e();
            if (e.f288980o != 0) {
                if (e.f288976k.get(jVar, new String[0]) && jVar.field_appVersion < u.f195480E) {
                    C98540b d = C98544e.m128035f().mo137900d();
                    d.f288962a.add(new C98540b.C98541a(d, 1, u.f195562d));
                }
                f4Var2.setType(C72695v.m85070l(u));
                byte[] z = C102913k.m136061z(f9Var2, 6);
                if (z != null && f4Var.getMsgId() == 0) {
                    String bD = C98544e.m128035f().mo137901e().mo137896d().mo127179bD(z);
                    Log.m105918d("MicroMsg.BackupItemAppMsg", "thumbData MsgInfo path:" + bD);
                    if (!Util.isNullOrNil(bD)) {
                        f4Var2.mo108739S2(bD);
                    }
                }
                String x4 = C102913k.m136059x(f9Var2, 8, (String) null);
                int y = C102913k.m136060y(f9Var2, 8);
                if (Util.isNullOrNil(x4)) {
                    x4 = C102913k.m136059x(f9Var2, 7, (String) null);
                    y = C102913k.m136060y(f9Var2, 7);
                }
                String str4 = C102913k.m136050o(x4) + x4;
                C98543d.m128033d(f4Var);
                C68070l lVar = new C68070l();
                u.mo93547j(lVar);
                lVar.field_msgId = f4Var.getMsgId();
                C98542c e2 = C98544e.m128035f().mo137901e();
                if (e2.f288980o != 0) {
                    e2.f288975j.insert(lVar);
                    if (!Util.isNullOrNil(x4)) {
                        C72963f4 h302 = ((C72972g4) C98544e.m128035f().mo137901e().mo137897e()).h30(str.equals(f9Var2.f227335f.f141175d) ? f9Var2.f227336g.f141175d : f9Var2.f227335f.f141175d, f9Var2.f227348v);
                        C72683d qq = C98544e.m128035f().mo137901e().mo137893a().mo100154qq(u.f195606o);
                        if (qq == null) {
                            Log.m105918d("MicroMsg.BackupItemAppMsg", "recover AppAttachInfo is null.");
                            long msgId = h302.getMsgId();
                            C68070l.C68072b u2 = C68070l.C68072b.m80422u(processXml, (String) null);
                            if (u2 != null) {
                                String e3 = C72695v.m85063e(C72695v.m85068j(), u2.f195570f, u2.f195602n);
                                int i7 = u2.f195566e;
                                String str5 = u2.f195562d;
                                String str6 = u2.f195606o;
                                int i8 = u2.f195594l;
                                C72683d dVar = new C72683d();
                                dVar.field_fileFullPath = e3;
                                dVar.field_appId = str5;
                                dVar.field_sdkVer = (long) i7;
                                dVar.field_mediaSvrId = str6;
                                dVar.field_totalLen = (long) i8;
                                dVar.field_status = 101;
                                dVar.field_isUpload = false;
                                dVar.field_createTime = C31543z5.m39451a();
                                dVar.field_lastModifyTime = Util.nowSecond();
                                dVar.field_msgInfoId = msgId;
                                dVar.field_netTimes = 0;
                                if (!C98544e.m128035f().mo137901e().mo137893a().insert(dVar)) {
                                    Log.m105921e("MicroMsg.BackupStorageLogic", "initDownloadAttach insert error, msgLocalId[%d]", Long.valueOf(msgId));
                                }
                            }
                            qq = C98544e.m128035f().mo137901e().mo137893a().mo100154qq(u.f195606o);
                            if (qq == null) {
                                Log.m105921e("MicroMsg.BackupItemAppMsg", "getAppAttachInfoStg().getByMediaId is null! attachid[%s]", u.f195606o);
                                return 0;
                            }
                            int i9 = u.f195594l;
                            if (!(i9 == 0 || y == 0)) {
                                if (y >= i9) {
                                    qq.field_status = 199;
                                } else if (f4Var.mo108769t2() == 1) {
                                    qq.field_status = 105;
                                } else {
                                    qq.field_status = 102;
                                }
                            }
                        }
                        long j = (long) y;
                        qq.field_offset = j;
                        qq.field_totalLen = j;
                        C86013q1.m106463x(str4, qq.field_fileFullPath);
                        C98544e.m128035f().mo137901e().mo137893a().update(qq, new String[0]);
                        C102479b Bg3 = ((C102704b) C86312j.m106911c(cls2)).mo138748Bg(qq.field_fileFullPath, 6, (String) null, (byte[]) null);
                        Log.m105919d("MicroMsg.BackupItemAppMsg", "recover fileCheckDup %s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", qq.field_fileFullPath, Integer.valueOf(Bg3.f301760a), Boolean.valueOf(Bg3.f301761b), Boolean.FALSE, Boolean.valueOf(Bg3.f301762c), Long.valueOf(Bg3.f301763d));
                    }
                    return 0;
                }
                throw new C86484b();
            }
            throw new C86484b();
        }
    }

    /* renamed from: b */
    public int mo105807b(C77926f9 f9Var, boolean z, C72963f4 f4Var, String str, LinkedList<C100968x> linkedList, boolean z2) {
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        C77627f fVar;
        String str10;
        C68070l.C68072b bVar;
        int i2;
        int i3;
        int i4;
        C72683d qq;
        String str11;
        String str12;
        String str13;
        C72683d Yt;
        int indexOf;
        C77926f9 f9Var2 = f9Var;
        C72963f4 f4Var2 = f4Var;
        int type = f4Var.getType();
        if (type == 1048625) {
            C77926f9 f9Var3 = f9Var2;
            int length = Util.isNullOrNil(f4Var.getContent()) ? 0 : f4Var.getContent().getBytes().length;
            if (f4Var.getContent() == null) {
                return -1;
            }
            String content = f4Var.getContent();
            if (!C102913k.m136042g(content)) {
                content = f4Var.getContent();
                if (!C102913k.m136042g(content)) {
                    Log.m105920e("MicroMsg.BackupItemAppMsg", "get xml error " + content);
                    return 0;
                }
            }
            if (!Util.isNullOrNil(content)) {
                C51163rv3 rv32 = new C51163rv3();
                rv32.mo73357f(Util.nullAs(content, ""));
                f9Var3.f227337h = rv32;
            }
            return length;
        } else if (type != 285212721) {
            String z25 = f4Var.getType() == 1107296305 ? f4Var.mo108775z2() : f4Var.getContent();
            int length2 = Util.isNullOrNil(z25) ? 0 : z25.getBytes().length;
            String processXml = Util.processXml((f4Var.mo108769t2() == 1 || !C98543d.m128034e(f4Var.mo108768t()) || (indexOf = z25.indexOf(58)) == -1) ? z25 : z25.substring(indexOf + 1));
            C68070l.C68072b bVar2 = null;
            if (processXml != null) {
                bVar2 = C68070l.C68072b.m80422u(processXml, (String) null);
            }
            C68070l.C68072b bVar3 = bVar2;
            if (bVar3 == null) {
                return 0;
            }
            String v102 = C98544e.m128035f().mo137901e().mo137896d().v10(f4Var.mo108765s2(), true);
            if (C86013q1.m106450k(v102)) {
                bVar = bVar3;
                i2 = 1;
                length2 += C97551k.m125702a(new C97551k.C97552a(v102, f9Var, linkedList, 6, z, "_thumb", z2, (C100968x) null));
                i3 = 2;
            } else {
                bVar = bVar3;
                i2 = 1;
                i3 = 2;
                if (bVar.f195582i == 2) {
                    return -1;
                }
            }
            int i5 = bVar.f195582i;
            if (i5 != i3) {
                String str14 = "_fav.";
                String str15 = "record file exit:%s, index:%d";
                if (i5 == 19 || i5 == 24) {
                    C77926f9 f9Var4 = f9Var;
                    String str16 = str15;
                    String str17 = str14;
                    QueryRecordMsgMediaListEvent queryRecordMsgMediaListEvent = new QueryRecordMsgMediaListEvent();
                    QueryRecordMsgMediaListEvent.C92546a aVar = queryRecordMsgMediaListEvent.f265003d;
                    aVar.f265005a = bVar.f195571f0;
                    aVar.f265006b = f4Var.getMsgId();
                    queryRecordMsgMediaListEvent.publish();
                    Log.m105925i("MicroMsg.BackupItemAppMsg", "pathList:%s", queryRecordMsgMediaListEvent.f265004e.f265007a);
                    String[] split = queryRecordMsgMediaListEvent.f265004e.f265007a.split(XVFSFile.PATH_SEPARATOR);
                    int i6 = 0;
                    while (i6 < split.length) {
                        if (!C86013q1.m106450k(split[i6])) {
                            str11 = str17;
                        } else {
                            Log.m105925i("MicroMsg.BackupItemAppMsg", str16, split[i6], Integer.valueOf(i6));
                            String str18 = split[i6];
                            StringBuilder sb = new StringBuilder();
                            String str19 = str17;
                            sb.append(str19);
                            sb.append(i6);
                            str11 = str19;
                            length2 += C97551k.m125702a(new C97551k.C97552a(str18, f9Var, linkedList, 7, z, sb.toString(), z2, (C100968x) null));
                        }
                        i6++;
                        str17 = str11;
                    }
                    return length2;
                }
                if (i5 != 87) {
                    if (i5 == 98) {
                        List<String> f = C100792a.f295260a.mo140235f(f4Var2);
                        int i7 = 0;
                        while (true) {
                            ArrayList arrayList = (ArrayList) f;
                            if (i7 >= arrayList.size()) {
                                break;
                            }
                            if (C86013q1.m106450k((String) arrayList.get(i7))) {
                                Object[] objArr = new Object[2];
                                objArr[0] = arrayList.get(i7);
                                objArr[i2] = Integer.valueOf(i7);
                                Log.m105925i("MicroMsg.BackupItemAppMsg", "album file exit:%s, index:%d", objArr);
                                length2 += C97551k.m125702a(new C97551k.C97552a((String) arrayList.get(i7), f9Var, linkedList, 7, z, "_asset." + i7, z2, (C100968x) null));
                            }
                            i7++;
                        }
                    } else if ((i5 == 6 || i5 == 7) && ((((Yt = C98544e.m128035f().mo137901e().mo137893a().mo100150Yt(f4Var.getMsgId())) != null && Yt.mo100146l2()) || (f4Var.mo108769t2() == i2 && Yt != null && Yt.field_isUpload)) && C86013q1.m106450k(Yt.field_fileFullPath))) {
                        i4 = C97551k.m125702a(new C97551k.C97552a(Yt.field_fileFullPath, f9Var, linkedList, 7, z, z2, (C100968x) null));
                    }
                } else {
                    C51163rv3 rv33 = new C51163rv3();
                    rv33.mo73357f(Util.nullAs(z25, ""));
                    C77926f9 f9Var5 = f9Var;
                    f9Var5.f227337h = rv33;
                    f9Var5.f227340n = f4Var2.f230724G;
                    String[] jL = ((C78415b) C86312j.m106911c(C78415b.class)).mo94223jL(f4Var2, ((C77879c) bVar.mo93555w(C77879c.class)).f226904c);
                    int i8 = 0;
                    while (i8 < jL.length) {
                        if (!C86013q1.m106450k(jL[i8])) {
                            str13 = str15;
                            str12 = str14;
                        } else {
                            Log.m105925i("MicroMsg.BackupItemAppMsg", str15, jL[i8], Integer.valueOf(i8));
                            str13 = str15;
                            str12 = str14;
                            length2 += C97551k.m125702a(new C97551k.C97552a(jL[i8], f9Var, linkedList, 7, z, str14 + i8, z2, (C100968x) null));
                        }
                        i8++;
                        str15 = str13;
                        str14 = str12;
                    }
                }
                return length2;
            }
            C77926f9 f9Var6 = f9Var;
            if (!Util.isNullOrNil(bVar.f195606o) && (((qq = C98544e.m128035f().mo137901e().mo137893a().mo100154qq(bVar.f195606o)) != null && qq.mo100146l2()) || (f4Var.mo108769t2() == 1 && qq != null && qq.field_isUpload))) {
                String str20 = qq.field_fileFullPath;
                if (C86013q1.m106450k(str20)) {
                    Log.m105918d("MicroMsg.BackupItemAppMsg", "image " + str20);
                    i4 = C97551k.m125702a(new C97551k.C97552a(str20, f9Var, linkedList, 7, z, z2, (C100968x) null));
                }
            }
            return length2;
            length2 += i4;
            return length2;
        } else {
            int length3 = Util.isNullOrNil(f4Var.getContent()) ? 0 : f4Var.getContent().getBytes().length;
            if (z) {
                i = length3;
            } else {
                String content2 = f4Var.getContent();
                C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(0, content2);
                C97542a aVar2 = new C97542a(content2);
                if (!aVar2.f286249b) {
                    Log.m105920e("MicroMsg.AppmsgConvert", "buffer error");
                    i = length3;
                    str2 = "";
                } else {
                    C97543b bVar4 = new C97543b();
                    LinkedList<C77630j> linkedList2 = JZ.f226295i;
                    HashMap hashMap = new HashMap();
                    bVar4.mo136815c("msg");
                    hashMap.put("appid", aVar2.f286248a.get(".msg.appmsg.$appid"));
                    hashMap.put("sdkver", aVar2.f286248a.get(".msg.appmsg.$sdkver"));
                    String str21 = "appmsg";
                    bVar4.mo136816d(str21, hashMap);
                    if (linkedList2 == null) {
                        linkedList2 = new LinkedList<>();
                    }
                    if (linkedList2.size() == 0) {
                        str5 = "";
                        str4 = str5;
                        str3 = str4;
                    } else {
                        str5 = linkedList2.get(0).f226325d;
                        str4 = linkedList2.get(0).f226326e;
                        String str22 = linkedList2.get(0).f226330i;
                        str3 = linkedList2.get(0).f226332n;
                    }
                    bVar4.mo136813a(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str5);
                    bVar4.mo136813a("des", aVar2.f286248a.get(".msg.appmsg.des"));
                    bVar4.mo136813a("action", aVar2.f286248a.get(".msg.appmsg.action"));
                    int a = aVar2.mo136812a(".msg.appmsg.type");
                    bVar4.mo136815c("type");
                    i = length3;
                    bVar4.f286250a.append(a);
                    bVar4.mo136814b("type");
                    int a2 = aVar2.mo136812a(".msg.appmsg.showtype");
                    bVar4.mo136815c("showtype");
                    bVar4.f286250a.append(a2);
                    bVar4.mo136814b("showtype");
                    bVar4.mo136813a("content", aVar2.f286248a.get(".msg.appmsg.content"));
                    bVar4.mo136813a("url", str4);
                    bVar4.mo136813a("lowurl", aVar2.f286248a.get(".msg.appmsg.lowurl"));
                    bVar4.mo136815c("appattach");
                    int a3 = aVar2.mo136812a(".msg.appmsg.appattach.totallen");
                    bVar4.mo136815c("totallen");
                    String str23 = "MicroMsg.AppmsgConvert";
                    bVar4.f286250a.append(a3);
                    bVar4.mo136814b("totallen");
                    bVar4.mo136813a("attachid", aVar2.f286248a.get(".msg.appmsg.appattach.attachid"));
                    bVar4.mo136813a("fileext", aVar2.f286248a.get(".msg.appmsg.appattach.fileext"));
                    bVar4.mo136814b("appattach");
                    String str24 = "mmreader";
                    bVar4.mo136815c(str24);
                    hashMap.put("type", JZ.f226290d + "");
                    hashMap.put("convMsgCount", linkedList2.size() + "");
                    String str25 = "category";
                    bVar4.mo136816d(str25, hashMap);
                    String str26 = "name";
                    bVar4.mo136813a(str26, JZ.f226293g);
                    bVar4.mo136815c("topnew");
                    bVar4.mo136813a("cover", aVar2.f286248a.get(".msg.appmsg.mmreader.category.topnew.cover"));
                    String str27 = "msg";
                    bVar4.mo136813a("width", aVar2.f286248a.get(".msg.appmsg.mmreader.category.topnew.width"));
                    bVar4.mo136813a("height", aVar2.f286248a.get(".msg.appmsg.mmreader.category.topnew.height"));
                    bVar4.mo136813a("digest", str3);
                    bVar4.mo136814b("topnew");
                    int i9 = 0;
                    while (i9 < linkedList2.size()) {
                        bVar4.mo136815c("item");
                        if (linkedList2.get(i9) == null) {
                            str8 = str24;
                            str6 = str21;
                            str7 = str25;
                            str9 = str26;
                            fVar = JZ;
                        } else {
                            String str28 = linkedList2.get(i9).f226325d;
                            str6 = str21;
                            String str29 = linkedList2.get(i9).f226326e;
                            str8 = str24;
                            String str30 = linkedList2.get(i9).f226327f;
                            str7 = str25;
                            String str31 = linkedList2.get(i9).f226328g;
                            String str32 = "item";
                            StringBuilder sb4 = new StringBuilder();
                            String str33 = str26;
                            C77627f fVar2 = JZ;
                            C97542a aVar3 = aVar2;
                            sb4.append(linkedList2.get(i9).f226329h);
                            sb4.append("");
                            String sb5 = sb4.toString();
                            String str34 = linkedList2.get(i9).f226330i;
                            String str35 = linkedList2.get(i9).f226331j;
                            String str36 = linkedList2.get(i9).f226332n;
                            bVar4.mo136813a(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str28);
                            bVar4.mo136813a("url", str29);
                            bVar4.mo136813a("shorturl", str30);
                            bVar4.mo136813a("longurl", str31);
                            bVar4.mo136813a("pub_time", sb5);
                            bVar4.mo136813a("cover", str34);
                            bVar4.mo136813a("tweetid", str35);
                            bVar4.mo136813a("digest", str36);
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(".msg.appmsg.mmreader.category.item");
                            if (i9 == 0) {
                                str10 = "";
                            } else {
                                str10 = "" + i9;
                            }
                            sb6.append(str10);
                            String sb7 = sb6.toString();
                            aVar2 = aVar3;
                            bVar4.mo136813a("fileid", aVar2.f286248a.get(sb7 + ".fileid"));
                            bVar4.mo136815c(FirebaseAnalytics.C113379b.SOURCE);
                            bVar4.mo136815c(FirebaseAnalytics.C113379b.SOURCE);
                            fVar = fVar2;
                            str9 = str33;
                            bVar4.mo136813a(str9, fVar.f226293g);
                            bVar4.mo136814b(FirebaseAnalytics.C113379b.SOURCE);
                            bVar4.mo136814b(FirebaseAnalytics.C113379b.SOURCE);
                            bVar4.mo136814b(str32);
                        }
                        i9++;
                        str21 = str6;
                        JZ = fVar;
                        str26 = str9;
                        str24 = str8;
                        str25 = str7;
                    }
                    String str37 = str24;
                    C77627f fVar3 = JZ;
                    bVar4.mo136814b(str25);
                    bVar4.mo136815c(FFmpegMetadataRetriever.METADATA_KEY_PUBLISHER);
                    bVar4.mo136813a("convName", fVar3.f226292f);
                    bVar4.mo136813a("nickname", fVar3.f226293g);
                    bVar4.mo136814b(FFmpegMetadataRetriever.METADATA_KEY_PUBLISHER);
                    bVar4.mo136814b(str37);
                    bVar4.mo136814b(str21);
                    bVar4.mo136813a("fromusername", fVar3.f226292f);
                    int a4 = aVar2.mo136812a(".msg.scene");
                    bVar4.mo136815c(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    bVar4.f286250a.append(a4);
                    bVar4.mo136814b(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
                    bVar4.mo136815c("appinfo");
                    bVar4.mo136813a(ProviderConstants.API_COLNAME_FEATURE_VERSION, aVar2.f286248a.get(".msg.appinfo.appname"));
                    bVar4.mo136813a("appname", aVar2.f286248a.get(".msg.appinfo.version"));
                    bVar4.mo136814b("appinfo");
                    bVar4.mo136813a("commenturl", fVar3.f226294h);
                    bVar4.mo136814b(str27);
                    Log.m105918d(str23, "xml " + bVar4.f286250a.toString());
                    str2 = bVar4.f286250a.toString();
                }
                if (Util.isNullOrNil(str2)) {
                    return 0;
                }
                C51163rv3 rv34 = new C51163rv3();
                rv34.mo73357f(Util.nullAs(str2, ""));
                f9Var.f227337h = rv34;
            }
            return i;
        }
    }
}
