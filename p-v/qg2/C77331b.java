package qg2;

import a70.C112760b;
import android.net.Uri;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72684e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import ob0.C117747y;
import p763ym.C53543s;

/* renamed from: qg2.b */
public class C77331b {

    /* renamed from: a */
    public static C77335p f225452a;

    /* renamed from: qg2.b$a */
    public interface C77332a {
        /* renamed from: m */
        void mo107460m(int i, int i2, C117747y yVar);
    }

    /* renamed from: a */
    public static C72683d m93197a(String str, long j) {
        Class cls = C53543s.class;
        C72683d Yt = ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100150Yt(j);
        if (Yt == null) {
            Yt = new C72683d();
            if (Util.isNullOrNil(str)) {
                Yt = null;
            } else {
                Log.m105925i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s", str);
                long j2 = Util.getLong(str, -1);
                if (j2 != -1) {
                    ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100147Lo(j2, Yt);
                    if (Yt.systemRowid != j2 && ((Yt = ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100154qq(str)) == null || !Yt.field_mediaSvrId.equals(str))) {
                        Log.m105924i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 1");
                    }
                    Log.m105925i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", str, Long.valueOf(j2));
                } else {
                    Yt = ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100154qq(str);
                    if (Yt == null || !Yt.field_mediaSvrId.equals(str)) {
                        Log.m105924i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 2");
                    }
                    Log.m105925i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", str, Long.valueOf(j2));
                }
                Yt = null;
                Log.m105925i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", str, Long.valueOf(j2));
            }
        }
        if (Yt != null) {
            Log.m105925i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo info[%s], rowid[%d], isUpload[%b], fullpath[%s], totallen[%d], offset[%d], mediaSvrId[%s], mediaid[%s], msgid[%d], type[%d], stack[%s]", Yt, Long.valueOf(Yt.systemRowid), Boolean.valueOf(Yt.field_isUpload), Yt.field_fileFullPath, Long.valueOf(Yt.field_totalLen), Long.valueOf(Yt.field_offset), Yt.field_mediaSvrId, Yt.field_mediaId, Long.valueOf(Yt.field_msgInfoId), Long.valueOf(Yt.field_type), Util.getStack());
        } else {
            Log.m105929w("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo is null stack[%s]", Util.getStack());
        }
        return Yt;
    }

    /* renamed from: b */
    public static String m93198b(long j, String str, String str2) {
        String str3;
        String str4 = str;
        Log.m105925i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach msgLocalId[%d], msgXml[%s], downloadPath[%s]", Long.valueOf(j), str4, str2);
        C68070l.C68072b u = C68070l.C68072b.m80422u(str4, (String) null);
        if (u == null) {
            return null;
        }
        if (str2 != null) {
            str3 = str2;
        } else {
            String s = C112760b.m154247s();
            String str5 = u.f195570f;
            String str6 = u.f195602n;
            Uri n = C116299g2.m163858n(s);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0 f0Var = C116281f0.C116289i.f348994a;
            C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                if (l2.mo177810a()) {
                    l2.f348991a.mo119937g(l2.f348992b);
                }
            }
            if (Util.isNullOrNil(str5)) {
                str3 = s + "da_" + Util.nowMilliSecond();
                if (!Util.isNullOrNil(str6)) {
                    str3 = str3 + "." + str6;
                }
            } else {
                if (!Util.isNullOrNil(str6) && !str5.endsWith(str6)) {
                    str5 = str5 + "." + str6;
                }
                String str7 = s + str5;
                if (C86013q1.m106450k(str7)) {
                    int i = 1;
                    while (true) {
                        if (i >= 20) {
                            str3 = str7;
                            break;
                        }
                        if (!C86013q1.m106450k(s + i + "_" + str5)) {
                            str3 = s + i + "_" + str5;
                            break;
                        }
                        i++;
                    }
                    if (i == 20) {
                        str3 = s + "da_" + Util.nowMilliSecond();
                        if (!Util.isNullOrNil(str6)) {
                            str3 = str3 + "." + str6;
                        }
                    }
                } else {
                    str3 = str7;
                }
            }
            try {
                if (!new C86009m1(str3).mo119974l().mo119971i().equalsIgnoreCase(new C86009m1(s).mo119971i())) {
                    str3 = s + "da_" + Util.nowMilliSecond();
                    Log.m105929w("MicroMsg.AppMsgLogic", "maybe DirTraversal attach. %s", str3);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppMsgLogic", e, "", new Object[0]);
                str3 = s + "da_" + Util.nowMilliSecond();
                if (!Util.isNullOrNil(str6)) {
                    str3 = str3 + "." + str6;
                }
            }
        }
        if (Util.isNullOrNil(u.f195606o) && !Util.isNullOrNil(u.f195500J)) {
            u.f195606o = "" + u.f195500J.hashCode();
        }
        int i2 = u.f195566e;
        String str8 = u.f195562d;
        String str9 = u.f195606o;
        int i3 = u.f195594l;
        int i4 = u.f195582i;
        int i5 = u.f195626t;
        C72683d dVar = new C72683d();
        dVar.field_fileFullPath = str3;
        dVar.field_appId = str8;
        dVar.field_sdkVer = (long) i2;
        dVar.field_mediaSvrId = str9;
        dVar.field_totalLen = (long) i3;
        dVar.field_status = 101;
        dVar.field_isUpload = false;
        dVar.field_createTime = C31543z5.m39451a();
        dVar.field_lastModifyTime = Util.nowSecond();
        dVar.field_msgInfoId = j;
        dVar.field_netTimes = 0;
        dVar.field_type = (long) i4;
        Log.m105925i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach ret[%b], rowid[%d], field_totalLen[%d], type[%d], isLargeFile[%d], destFile[%s], stack[%s]", Boolean.valueOf(((C72684e) ((C53543s) C86312j.m106911c(C53543s.class)).mo74024KZ()).mo100151bD(dVar)), Long.valueOf(dVar.systemRowid), Long.valueOf(dVar.field_totalLen), Long.valueOf(dVar.field_type), Integer.valueOf(i5), str3, Util.getStack());
        return str9;
    }

    /* renamed from: c */
    public static boolean m93199c(C72963f4 f4Var, C72683d dVar) {
        if (dVar == null || !C86013q1.m106450k(dVar.field_fileFullPath)) {
            return false;
        }
        return dVar.mo100146l2() || (f4Var.mo108769t2() == 1 && dVar.field_isUpload);
    }

    /* renamed from: d */
    public static void m93200d(long j) {
        Class cls = C75700k0.class;
        Class cls2 = C53543s.class;
        ((C72684e) ((C53543s) C86312j.m106911c(cls2)).mo74024KZ()).mo100149SE(j, 198);
        C72683d dVar = new C72683d();
        ((C72684e) ((C53543s) C86312j.m106911c(cls2)).mo74024KZ()).mo100147Lo(j, dVar);
        if (dVar.field_msgInfoId > 0) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(dVar.field_msgInfoId);
            if (b002.getMsgId() == dVar.field_msgInfoId) {
                if (b002.getType() == 1090519089 && b002.f230741Y == 1) {
                    b002.mo108734N2(3);
                } else {
                    b002.mo100991d(5);
                }
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(b002.getMsgId(), b002);
            }
        }
    }
}
