package dv0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import dv0.C97551k;
import hd0.C32829l0;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98426q0;
import hv0.C98543d;
import hv0.C98544e;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p753xp.C102704b;
import p823sg.C101614i;
import pv0.C100968x;
import te3.C51163rv3;
import te3.C77926f9;
import yu0.C102913k;

/* renamed from: dv0.h */
public class C97549h implements C75460n {
    /* renamed from: a */
    public int mo105806a(String str, C77926f9 f9Var, C72963f4 f4Var) {
        String str2;
        byte[] bArr;
        String str3;
        C77926f9 f9Var2 = f9Var;
        C72963f4 f4Var2 = f4Var;
        Class cls = C102704b.class;
        C98408n0 n0Var = new C98408n0();
        String str4 = f9Var2.f227335f.f141175d;
        String str5 = f9Var2.f227336g.f141175d;
        if (f4Var.mo108769t2() == 1) {
            str4 = str5;
        }
        n0Var.f288570q = str4;
        n0Var.f288563j = f4Var.getCreateTime();
        n0Var.f288556c = f9Var2.f227348v;
        String str6 = f9Var2.f227337h.f141175d;
        Log.m105918d("MicroMsg.BackupItemVideo", "parseVideoMsgXML content:" + str6);
        Map<String, String> parseXml = XmlParser.parseXml(str6, "msg", (String) null);
        if (parseXml != null) {
            try {
                n0Var.f288559f = Util.getInt(parseXml.get(".msg.videomsg.$length"), 0);
                n0Var.f288566m = Util.getInt(parseXml.get(".msg.videomsg.$playlength"), 0);
                n0Var.f288571r = parseXml.get(".msg.videomsg.$fromusername");
                int i = Util.getInt(parseXml.get(".msg.videomsg.$type"), 0);
                Log.m105918d("MicroMsg.BackupItemVideo", "video msg exportType :" + i);
                n0Var.f288572s = i == 44 ? 1 : 0;
                n0Var.f288575v = str6;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.BackupItemVideo", "parsing voice msg xml failed");
                Log.printErrStackTrace("MicroMsg.BackupItemVideo", e, "", new Object[0]);
            }
        } else {
            Log.m105921e("MicroMsg.BackupItemVideo", "videomsg paseXml failed:%s", f9Var2.f227337h.f141175d);
            f4Var2.mo108732L2(f9Var2.f227337h.f141175d);
        }
        if (C102913k.m136045j(f9Var2, 10) || C102913k.m136045j(f9Var2, 12)) {
            n0Var.f288562i = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
        } else {
            n0Var.f288562i = 111;
        }
        String k = n0Var.mo137707k();
        C101614i<String, ArrayList<C98408n0>> iVar = C98410o0.f288586c;
        String a = C98426q0.m127793a(k);
        f4Var2.mo108739S2(a);
        n0Var.f288554a = a;
        if (f4Var.getType() != 62) {
            f4Var2.setType(43);
        }
        f4Var2.mo108732L2(C32829l0.m39827b(n0Var.mo137701e(), n0Var.f288565l, false));
        n0Var.f288567n = (long) ((int) C98543d.m128033d(f4Var));
        n0Var.f288564k = Util.nowSecond();
        n0Var.f288568o = 0;
        Log.m105918d("MicroMsg.BackupItemVideo", "Insert fileName[" + n0Var.mo137700d() + "] size:" + n0Var.f288559f + " svrid:" + n0Var.f288556c + " timelen:" + n0Var.f288566m + " user:" + n0Var.mo137707k() + " human:" + n0Var.mo137701e());
        C98544e.m128035f().mo137901e().mo137898f().mo137730s(n0Var);
        String r = C98544e.m128035f().mo137901e().mo137898f().mo137729r(a);
        if (f4Var.getType() == 62) {
            C102913k.m136033E(f9Var2, 13, r);
            bArr = null;
            str3 = C102913k.m136059x(f9Var2, 12, (String) null);
            str2 = null;
        } else {
            bArr = null;
            C102913k.m136033E(f9Var2, 11, r);
            str3 = C102913k.m136059x(f9Var2, 10, (String) null);
            str2 = C102913k.m136059x(f9Var2, 17, "_hd");
        }
        String str7 = "MicroMsg.BackupItemVideo";
        ((C102704b) C86312j.m106911c(cls)).mo138751as(r, f4Var.getType(), C86013q1.m106456q(r), bArr);
        if (str3 != null) {
            String q = C98544e.m128035f().mo137901e().mo137898f().mo137728q(a);
            C86013q1.m106463x(C102913k.m136050o(str3) + str3, q);
            ((C102704b) C86312j.m106911c(cls)).mo138751as(q, f4Var.getType(), C86013q1.m106456q(q), (byte[]) null);
        }
        if (str2 == null) {
            return 0;
        }
        String str8 = C102913k.m136050o(str2) + str2;
        String str9 = a + FirebaseAnalytics.C113379b.ORIGIN;
        C98408n0 n0Var2 = new C98408n0();
        n0Var2.f288554a = str9;
        n0Var2.f288563j = f4Var.getCreateTime();
        n0Var2.f288564k = Util.nowSecond();
        n0Var2.f288568o = 0;
        if (C102913k.m136045j(f9Var2, 17)) {
            n0Var2.f288562i = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
        } else {
            n0Var2.f288562i = 111;
        }
        n0Var2.f288566m = n0Var.f288566m;
        n0Var2.f288559f = n0Var.f288559f;
        Log.m105918d(str7, "Insert origin fileName[" + n0Var2.mo137700d() + "] size:" + n0Var2.f288559f + " svrid:" + n0Var2.f288556c + " timelen:" + n0Var2.f288566m + " user:" + n0Var2.mo137707k() + " human:" + n0Var2.mo137701e());
        C98544e.m128035f().mo137901e().mo137898f().mo137730s(n0Var2);
        n0Var.f288546N = str9;
        n0Var.f288552T = true;
        C98544e.m128035f().mo137901e().mo137898f().mo137733w(n0Var);
        String q2 = C98544e.m128035f().mo137901e().mo137898f().mo137728q(str9);
        C86013q1.m106463x(str8, q2);
        ((C102704b) C86312j.m106911c(cls)).mo138751as(q2, f4Var.getType(), C86013q1.m106456q(q2), (byte[]) null);
        return 0;
    }

    /* renamed from: b */
    public int mo105807b(C77926f9 f9Var, boolean z, C72963f4 f4Var, String str, LinkedList<C100968x> linkedList, boolean z2) {
        String str2;
        int i;
        int i2;
        String str3;
        int i3;
        C77926f9 f9Var2 = f9Var;
        String q = C98544e.m128035f().mo137901e().mo137898f().mo137728q(f4Var.mo108765s2());
        C98408n0 c = C98543d.m128032c(f4Var.mo108765s2());
        boolean z3 = c == null || c.f288562i == 199;
        C86009m1 m1Var = new C86009m1(q);
        int r = (!z3 || !m1Var.mo119967g()) ? 0 : (int) m1Var.mo119980r();
        if (c == null) {
            str2 = f4Var.mo108765s2() + FirebaseAnalytics.C113379b.ORIGIN;
        } else {
            str2 = c.f288546N;
        }
        String q2 = C98544e.m128035f().mo137901e().mo137898f().mo137728q(str2);
        C98408n0 c2 = C98543d.m128032c(str2);
        boolean z4 = c2 != null && c2.f288562i == 199;
        if (z4) {
            C86009m1 m1Var2 = new C86009m1(q2);
            if (m1Var2.mo119967g()) {
                r += (int) m1Var2.mo119980r();
            }
        }
        int i4 = r;
        String r2 = C98544e.m128035f().mo137901e().mo137898f().mo137729r(f4Var.mo108765s2());
        C86009m1 m1Var3 = new C86009m1(r2);
        int r3 = m1Var3.mo119967g() ? (int) m1Var3.mo119980r() : 0;
        if (z) {
            return r3 + i4;
        }
        if (r3 != 0) {
            if (f4Var.getType() == 62) {
                i = 62;
                i3 = C97551k.m125702a(new C97551k.C97552a(r2, f9Var, linkedList, 13, z, "_thumb", z2, (C100968x) null));
            } else {
                i = 62;
                i3 = C97551k.m125702a(new C97551k.C97552a(r2, f9Var, linkedList, 11, z, "_thumb", z2, (C100968x) null));
            }
            i2 = i3 + 0;
        } else {
            i = 62;
            i2 = 0;
        }
        if (!z3 || i4 == 0) {
            str3 = "MicroMsg.BackupItemVideo";
        } else if (f4Var.getType() == i) {
            i2 += C97551k.m125702a(new C97551k.C97552a(q, f9Var, linkedList, 12, z, z2, (C100968x) null));
            str3 = "MicroMsg.BackupItemVideo";
        } else {
            str3 = "MicroMsg.BackupItemVideo";
            int a = C97551k.m125702a(new C97551k.C97552a(q, f9Var, linkedList, 10, z, z2, (C100968x) null)) + i2;
            if (z4) {
                int a2 = C97551k.m125702a(new C97551k.C97552a(q2, f9Var, linkedList, 17, z, "_hd", z2, (C100968x) null));
                i2 = a + a2;
                Log.m105920e(str3, "pack origin video, packed video size = " + a2);
            } else {
                i2 = a;
            }
        }
        C98408n0 c3 = C98543d.m128032c(f4Var.mo108765s2());
        String str4 = null;
        if (c3 != null) {
            if (f4Var.getType() != i) {
                i = 43;
            }
            f9Var2.f227333d = i;
            if (!Util.isNullOrNil(f4Var.getContent())) {
                String e = C98543d.m128034e(f4Var.mo108768t()) ? c3.mo137701e() : f9Var2.f227335f.f141175d;
                StringWriter stringWriter = new StringWriter();
                try {
                    XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
                    newSerializer.setOutput(stringWriter);
                    newSerializer.startTag((String) null, "msg");
                    newSerializer.startTag((String) null, "videomsg");
                    Map<String, String> parseXml = XmlParser.parseXml(c3.mo137705i(), "msg", (String) null);
                    if (parseXml != null) {
                        newSerializer.attribute((String) null, "aeskey", "" + parseXml.get(".msg.videomsg.$aeskey"));
                        newSerializer.attribute((String) null, "cdnthumbaeskey", "" + parseXml.get(".msg.videomsg.$cdnthumbaeskey"));
                        newSerializer.attribute((String) null, "cdnvideourl", "" + parseXml.get(".msg.videomsg.$cdnvideourl"));
                        newSerializer.attribute((String) null, "cdnthumburl", "" + parseXml.get(".msg.videomsg.$cdnthumburl"));
                        newSerializer.attribute((String) null, "cdnthumblength", "" + parseXml.get(".msg.videomsg.$cdnthumblength"));
                        newSerializer.attribute((String) null, "rawmd5", "" + parseXml.get(".msg.videomsg.$rawmd5"));
                        newSerializer.attribute((String) null, "cdnrawvideourl", "" + parseXml.get(".msg.videomsg.$cdnrawvideourl"));
                        newSerializer.attribute((String) null, "cdnrawvideoaeskey", "" + parseXml.get(".msg.videomsg.$cdnrawvideoaeskey"));
                        newSerializer.attribute((String) null, "rawlength", "" + parseXml.get(".msg.videomsg.$rawlength"));
                        newSerializer.attribute((String) null, "overwritenewmsgid", "" + parseXml.get(".msg.videomsg.$overwritenewmsgid"));
                    }
                    newSerializer.attribute((String) null, "playlength", "" + c3.f288566m);
                    newSerializer.attribute((String) null, "length", "" + c3.f288559f);
                    newSerializer.attribute((String) null, "type", "" + i);
                    if (!Util.isNullOrNil(e)) {
                        newSerializer.attribute((String) null, "fromusername", e);
                    }
                    newSerializer.attribute((String) null, "md5", "" + c3.f288579z);
                    newSerializer.endTag((String) null, "videomsg");
                    newSerializer.endTag((String) null, "msg");
                    newSerializer.endDocument();
                    stringWriter.flush();
                    stringWriter.close();
                    str4 = stringWriter.getBuffer().toString();
                } catch (Exception e2) {
                    Log.printErrStackTrace(str3, e2, "packetVoice xml error", new Object[0]);
                }
            }
        }
        if (str4 == null) {
            return i2;
        }
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str4;
        rv32.f141176e = true;
        f9Var2.f227337h = rv32;
        return i2 + str4.length();
    }
}
