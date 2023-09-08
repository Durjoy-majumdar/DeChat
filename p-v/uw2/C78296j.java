package uw2;

import android.database.Cursor;
import android.net.Uri;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import eb0.C97625j3;
import java.util.HashMap;
import ng2.C11163e;

/* renamed from: uw2.j */
public class C78296j {
    /* renamed from: a */
    public static boolean m94583a(String str) {
        if (str == null) {
            return false;
        }
        C78295i c = m94585c(str);
        if (c == null) {
            Log.m105918d("MicroMsg.VoiceRemindLogic", "cancel null record : " + str);
            return true;
        }
        Log.m105918d("MicroMsg.VoiceRemindLogic", "cancel record : " + str + " LocalId:" + c.field_msglocalid);
        if (c.field_msglocalid != 0) {
            ((C72972g4) C97625j3.m125812b().mo105911z()).mo101125kD((long) c.field_msglocalid);
        }
        C78291e.xx0().mo108319c(str);
        C78306m xx02 = C78291e.xx0();
        String b = m94584b(str, false);
        C78289d dVar = (C78289d) ((HashMap) xx02.f229384e).get(b);
        if (dVar != null) {
            dVar.mo108308a();
            ((HashMap) xx02.f229384e).remove(b);
        }
        Uri n = C116299g2.m163858n(m94584b(str, false));
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        return l.mo177810a() && l.f348991a.mo119933c(l.f348992b);
    }

    /* renamed from: b */
    public static String m94584b(String str, boolean z) {
        C97625j3.m125812b().getClass();
        String genPath = FilePathGenerator.genPath(C11163e.m11041a(), "recbiz_", str, ".rec", 2);
        if (Util.isNullOrNil(genPath)) {
            return null;
        }
        if (z) {
            return genPath;
        }
        new C86009m1(genPath).mo119967g();
        return genPath;
    }

    /* renamed from: c */
    public static C78295i m94585c(String str) {
        C78295i iVar;
        Cursor rawQuery = C78291e.xx0().f229383d.rawQuery("SELECT filename, user, msgid, offset, filenowsize, totallen, status, createtime, lastmodifytime, clientid, voicelenght, msglocalid, human, voiceformat, nettimes, reserved1, reserved2 FROM VoiceRemindInfo WHERE filename= ?", new String[]{str}, 2);
        if (rawQuery.moveToFirst()) {
            iVar = new C78295i();
            iVar.convertFrom(rawQuery);
        } else {
            iVar = null;
        }
        rawQuery.close();
        return iVar;
    }

    /* renamed from: d */
    public static C78289d m94586d(String str) {
        C78306m xx02 = C78291e.xx0();
        String b = m94584b(str, false);
        if (((HashMap) xx02.f229384e).get(b) == null) {
            ((HashMap) xx02.f229384e).put(b, new C78289d(b));
        }
        return (C78289d) ((HashMap) xx02.f229384e).get(b);
    }

    /* renamed from: e */
    public static boolean m94587e(String str) {
        if (str == null) {
            return false;
        }
        C78295i c = m94585c(str);
        if (c == null) {
            Log.m105920e("MicroMsg.VoiceRemindLogic", "Set error failed file:" + str);
            return false;
        }
        c.field_status = 98;
        c.field_lastmodifytime = System.currentTimeMillis() / 1000;
        c.f229349U = C0947jz.f2205e;
        boolean f = m94588f(c);
        Log.m105918d("MicroMsg.VoiceRemindLogic", "setError file:" + str + " msgid:" + c.field_msglocalid + " old stat:" + c.field_status);
        if (c.field_msglocalid == 0 || Util.isNullOrNil(c.field_user)) {
            Log.m105920e("MicroMsg.VoiceRemindLogic", "setError failed msg id:" + c.field_msglocalid + " user:" + c.field_user);
            return f;
        }
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00((long) c.field_msglocalid);
        b002.setMsgId((long) c.field_msglocalid);
        b002.mo100991d(5);
        b002.mo108749c3(c.field_user);
        b002.mo108732L2(C37600h.m41450a(c.field_human, -1, true));
        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
        return f;
    }

    /* renamed from: f */
    public static boolean m94588f(C78295i iVar) {
        if (iVar == null || iVar.f229349U == -1) {
            return false;
        }
        return C78291e.xx0().mo108320jo(iVar.field_filename, iVar);
    }
}
