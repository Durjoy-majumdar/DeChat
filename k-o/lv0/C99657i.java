package lv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import hd0.C32829l0;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98426q0;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import jv0.C99055a;
import lv0.C99659k;
import lv0.C99661l;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import ov0.C100546d;
import ov0.C100556h;
import p823sg.C101614i;
import pv0.C100968x;
import te3.C51163rv3;
import te3.C77926f9;

/* renamed from: lv0.i */
public class C99657i implements C99663m {
    /* renamed from: a */
    public int mo139033a(String str, C77926f9 f9Var, C72963f4 f4Var) {
        String str2;
        C98408n0 n0Var = new C98408n0();
        n0Var.f288570q = f9Var.f227335f.f141175d;
        n0Var.f288563j = f4Var.getCreateTime();
        n0Var.f288556c = f9Var.f227348v;
        String str3 = f9Var.f227337h.f141175d;
        Log.m105918d("MicroMsg.BakOldItemVideo", "parseVideoMsgXML content:" + str3);
        Map<String, String> parseXml = XmlParser.parseXml(str3, "msg", (String) null);
        int i = 1;
        if (parseXml != null) {
            try {
                n0Var.f288559f = Util.getInt(parseXml.get(".msg.videomsg.$length"), 0);
                n0Var.f288566m = Util.getInt(parseXml.get(".msg.videomsg.$playlength"), 0);
                n0Var.f288571r = parseXml.get(".msg.videomsg.$fromusername");
                int i2 = Util.getInt(parseXml.get(".msg.videomsg.$type"), 0);
                Log.m105918d("MicroMsg.BakOldItemVideo", "video msg exportType :" + i2);
                if (i2 != 44) {
                    i = 0;
                }
                n0Var.f288572s = i;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.BakOldItemVideo", "parsing voice msg xml failed");
                Log.printErrStackTrace("MicroMsg.BakOldItemVideo", e, "", new Object[0]);
            }
        } else {
            Log.m105921e("MicroMsg.BakOldItemVideo", "videomsg paseXml failed:%s", f9Var.f227337h.f141175d);
            f4Var.mo108732L2(f9Var.f227337h.f141175d);
        }
        if (C99055a.m129002a(f9Var, 10) || C99055a.m129002a(f9Var, 12)) {
            n0Var.f288562i = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
        } else {
            n0Var.f288562i = 111;
        }
        String k = n0Var.mo137707k();
        C101614i<String, ArrayList<C98408n0>> iVar = C98410o0.f288586c;
        String a = C98426q0.m127793a(k);
        f4Var.mo108739S2(a);
        n0Var.f288554a = a;
        if (f4Var.getType() != 62) {
            f4Var.setType(43);
        }
        f4Var.mo108732L2(C32829l0.m39827b(n0Var.mo137701e(), n0Var.f288565l, false));
        n0Var.f288567n = (long) ((int) C100556h.m131583c(f4Var));
        n0Var.f288564k = Util.nowSecond();
        n0Var.f288568o = 0;
        Log.m105918d("MicroMsg.BakOldItemVideo", "Insert fileName[" + n0Var.mo137700d() + "] size:" + n0Var.f288559f + " svrid:" + n0Var.f288556c + " timelen:" + n0Var.f288566m + " user:" + n0Var.mo137707k() + " human:" + n0Var.mo137701e());
        C100546d.m131563g().mo139995h().mo140009i().mo137730s(n0Var);
        String r = C100546d.m131563g().mo139995h().mo140009i().mo137729r(a);
        if (f4Var.getType() == 62) {
            C99055a.m129009h(f9Var, 13, r);
            str2 = C99055a.m129005d(f9Var, 12, (String) null);
        } else {
            C99055a.m129009h(f9Var, 11, r);
            str2 = C99055a.m129005d(f9Var, 10, (String) null);
        }
        if (str2 != null) {
            C86013q1.m106442c(C99055a.m129007f(str2), C100546d.m131563g().mo139995h().mo140009i().mo137728q(a));
        }
        return 0;
    }

    /* renamed from: b */
    public int mo139034b(C77926f9 f9Var, boolean z, C72963f4 f4Var, String str, LinkedList<C100968x> linkedList, HashMap<Long, C99659k.C99660a> hashMap, boolean z2, long j) {
        int i;
        int i2;
        C77926f9 f9Var2 = f9Var;
        String q = C100546d.m131563g().mo139995h().mo140009i().mo137728q(f4Var.mo108765s2());
        String s2 = f4Var.mo108765s2();
        String str2 = null;
        C98408n0 f = Util.isNullOrNil(s2) ? null : C100546d.m131563g().mo139995h().mo140009i().mo137720f(s2);
        int i3 = 0;
        boolean z3 = f == null || f.f288562i == 199;
        C86009m1 m1Var = new C86009m1(q);
        int r = (!z3 || !m1Var.mo119967g()) ? 0 : (int) m1Var.mo119980r();
        String r2 = C100546d.m131563g().mo139995h().mo140009i().mo137729r(f4Var.mo108765s2());
        C86009m1 m1Var2 = new C86009m1(r2);
        int r3 = m1Var2.mo119967g() ? (int) m1Var2.mo119980r() : 0;
        if (z) {
            return r3 + r;
        }
        if (r3 != 0) {
            if (f4Var.getType() == 62) {
                i = 62;
                i2 = C99661l.m130077a(new C99661l.C99662a(r2, f9Var, linkedList, 13, z, "_thumb", z2, (C100968x) null));
            } else {
                i = 62;
                i2 = C99661l.m130077a(new C99661l.C99662a(r2, f9Var, linkedList, 11, z, "_thumb", z2, (C100968x) null));
            }
            i3 = 0 + i2;
        } else {
            i = 62;
        }
        if (z3 && r != 0) {
            i3 += f4Var.getType() == i ? C99661l.m130077a(new C99661l.C99662a(q, f9Var, linkedList, 12, z, z2, (C100968x) null)) : C99661l.m130077a(new C99661l.C99662a(q, f9Var, linkedList, 10, z, z2, (C100968x) null));
        }
        String s25 = f4Var.mo108765s2();
        C98408n0 f2 = Util.isNullOrNil(s25) ? null : C100546d.m131563g().mo139995h().mo140009i().mo137720f(s25);
        if (f2 != null) {
            int i4 = f4Var.getType() == i ? 62 : 43;
            f9Var2.f227333d = i4;
            if (!Util.isNullOrNil(f4Var.getContent())) {
                String e = C100556h.m131584d(f4Var.mo108768t()) ? f2.mo137701e() : f9Var2.f227335f.f141175d;
                StringWriter stringWriter = new StringWriter();
                try {
                    XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
                    newSerializer.setOutput(stringWriter);
                    newSerializer.startTag((String) null, "msg");
                    newSerializer.startTag((String) null, "videomsg");
                    Map<String, String> parseXml = XmlParser.parseXml(f2.mo137705i(), "msg", (String) null);
                    if (parseXml != null) {
                        newSerializer.attribute((String) null, "aeskey", "" + parseXml.get(".msg.videomsg.$aeskey"));
                        newSerializer.attribute((String) null, "cdnthumbaeskey", "" + parseXml.get(".msg.videomsg.$cdnthumbaeskey"));
                        newSerializer.attribute((String) null, "cdnvideourl", "" + parseXml.get(".msg.videomsg.$cdnvideourl"));
                        newSerializer.attribute((String) null, "cdnthumburl", "" + parseXml.get(".msg.videomsg.$cdnthumburl"));
                        newSerializer.attribute((String) null, "cdnthumblength", "" + parseXml.get(".msg.videomsg.$cdnthumblength"));
                    }
                    newSerializer.attribute((String) null, "playlength", "" + f2.f288566m);
                    newSerializer.attribute((String) null, "length", "" + f2.f288559f);
                    newSerializer.attribute((String) null, "type", "" + i4);
                    if (!Util.isNullOrNil(e)) {
                        newSerializer.attribute((String) null, "fromusername", e);
                    }
                    newSerializer.attribute((String) null, "md5", "" + f2.f288579z);
                    newSerializer.endTag((String) null, "videomsg");
                    newSerializer.endTag((String) null, "msg");
                    newSerializer.endDocument();
                    stringWriter.flush();
                    stringWriter.close();
                    str2 = stringWriter.getBuffer().toString();
                } catch (Exception e2) {
                    Log.m105920e("MicroMsg.BakOldItemVideo", "packetVoice xml error: " + e2.toString());
                }
            }
        }
        if (str2 == null) {
            return i3;
        }
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str2;
        rv32.f141176e = true;
        f9Var2.f227337h = rv32;
        return i3 + str2.length();
    }
}
