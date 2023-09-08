package lv0;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72989o2;
import com.tencent.p014mm.storage.C96985s2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C86484b;
import i61.C98602h;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import jv0.C99055a;
import lv0.C99648a;
import lv0.C99659k;
import lv0.C99661l;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import ov0.C100546d;
import ov0.C100554g;
import ov0.C100556h;
import pv0.C100968x;
import sf0.C48374j0;
import te3.C51163rv3;
import te3.C77926f9;
import yu0.C102908a;
import z51.C39315g;

/* renamed from: lv0.e */
public class C99653e implements C99663m {
    /* renamed from: c */
    public static boolean m130061c(String str) {
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            str = str.substring(indexOf);
        }
        return XmlParser.parseXml(str, "msg", (String) null) != null;
    }

    /* renamed from: a */
    public int mo139033a(String str, C77926f9 f9Var, C72963f4 f4Var) {
        C99648a.C99649a aVar;
        C77926f9 f9Var2 = f9Var;
        C72963f4 f4Var2 = f4Var;
        Class cls = C39315g.class;
        f4Var2.mo108732L2(f9Var2.f227337h.f141175d);
        String str2 = f9Var2.f227335f.f141175d;
        String str3 = f9Var2.f227336g.f141175d;
        C100554g h = C100546d.m131563g().mo139995h();
        if (h.f294625o != 0) {
            if (((String) h.f294611a.mo119684e(2, (Object) null)).equals(str2)) {
                str2 = str3;
            }
            String str4 = f9Var2.f227337h.f141175d;
            Map<String, String> parseXml = XmlParser.parseXml(str4, "msg", (String) null);
            C96985s2 I = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138002I(str4, str2);
            if (I == null) {
                Log.m105928w("MicroMsg.BakOldItemEmoji", "EmojiMsgInfo is null");
                return -1;
            }
            EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(I.f284163d);
            if (G == null) {
                Log.m105928w("MicroMsg.BakOldItemEmoji", "EmojiInfo is null");
                return -1;
            }
            if (parseXml.get(".msg.emoji.$androidmd5") == null) {
                String str5 = I.f284163d;
                if (C99648a.f292056c == null) {
                    C99648a.f292056c = new C99648a();
                }
                C99648a aVar2 = C99648a.f292056c;
                if (aVar2.f292057b == null) {
                    aVar2.mo139026c();
                }
                Iterator it = ((HashMap) aVar2.f292057b).values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = (C99648a.C99649a) it.next();
                    String str6 = aVar.f292059b;
                    if (str6 != null && str6.equals(str5)) {
                        break;
                    }
                }
                String str7 = aVar == null ? null : aVar.f292058a;
                if (!Util.isNullOrNil(str7)) {
                    I.f284163d = str7;
                    Log.m105919d("MicroMsg.BakOldItemEmoji", "convert ip to android md5 %s", str7);
                }
            }
            String str8 = parseXml.get(".msg.emoji.$productid");
            if (!TextUtils.isEmpty(str8)) {
                I.f284168i = str8;
            }
            f4Var2.setType(47);
            f4Var2.mo108739S2(I.f284163d);
            f4Var2.mo108732L2(C72989o2.m85759f(I.f284161b, 0, !G.mo62678k() && !G.mo135617o2(), I.f284163d, false, ""));
            if (!G.mo62633C1()) {
                String c = C100546d.m131563g().mo139995h().mo140003c();
                if (TextUtils.isEmpty(str8)) {
                    C99055a.m129009h(f9Var2, 4, c + I.f284163d + "_thumb");
                    StringBuilder sb = new StringBuilder();
                    sb.append(c);
                    sb.append(I.f284163d);
                    C99055a.m129009h(f9Var2, 5, sb.toString());
                } else {
                    Uri n = C116299g2.m163858n(c + str8);
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
                    C99055a.m129009h(f9Var2, 4, c + str8 + "/" + I.f284163d + "_cover");
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(c);
                    sb4.append(str8);
                    sb4.append("/");
                    sb4.append(I.f284163d);
                    C99055a.m129009h(f9Var2, 5, sb4.toString());
                }
                EmojiInfo emojiInfo = new EmojiInfo(c);
                emojiInfo.field_md5 = I.f284163d;
                emojiInfo.field_svrid = I.f284162c;
                emojiInfo.field_catalog = 65;
                emojiInfo.field_type = I.f284164e;
                emojiInfo.field_size = I.f284165f;
                emojiInfo.field_state = 0;
                if (!TextUtils.isEmpty(str8)) {
                    emojiInfo.field_groupId = str8;
                }
                if (!Util.isNullOrNil(I.f284154B)) {
                    emojiInfo.field_activityid = I.f284154B;
                }
                C100546d.m131563g().mo139995h().mo140006f().replace(emojiInfo);
            }
            Log.m105918d("MicroMsg.BakOldItemEmoji", "id " + C100556h.m131583c(f4Var));
            return 0;
        }
        throw new C86484b();
    }

    /* renamed from: b */
    public int mo139034b(C77926f9 f9Var, boolean z, C72963f4 f4Var, String str, LinkedList<C100968x> linkedList, HashMap<Long, C99659k.C99660a> hashMap, boolean z2, long j) {
        int i;
        int i2;
        C77926f9 f9Var2 = f9Var;
        int length = Util.isNullOrNil(f4Var.getContent()) ? 0 : f4Var.getContent().getBytes().length;
        String trim = new C72989o2(f4Var.getContent()).f212823f.trim();
        if (!m130061c(trim)) {
            trim = f4Var.getContent();
            if (!m130061c(trim)) {
                EmojiInfo TO = C100546d.m131563g().mo139995h().mo140006f().mo142044TO(f4Var.mo108765s2());
                if (TO == null) {
                    trim = null;
                } else {
                    String md5 = TO.getMd5();
                    if (C99648a.f292056c == null) {
                        C99648a aVar = new C99648a();
                        C99648a.f292056c = aVar;
                        C102908a.m136012a(aVar);
                    }
                    C99648a aVar2 = C99648a.f292056c;
                    if (aVar2.f292057b == null) {
                        aVar2.mo139026c();
                    }
                    C99648a.C99649a aVar3 = (C99648a.C99649a) ((HashMap) aVar2.f292057b).get(md5);
                    if (aVar3 == null) {
                        aVar3 = new C99648a.C99649a(TO.getMd5(), TO.getMd5(), TO.getMd5(), TO.getMd5());
                    }
                    StringWriter stringWriter = new StringWriter();
                    try {
                        XmlSerializer newSerializer = XmlPullParserFactory.newInstance().newSerializer();
                        newSerializer.setOutput(stringWriter);
                        newSerializer.startDocument("UTF-8", Boolean.TRUE);
                        newSerializer.startTag((String) null, "msg");
                        newSerializer.startTag((String) null, "emoji");
                        newSerializer.attribute((String) null, "fromusername", f9Var2.f227335f.f141175d);
                        newSerializer.attribute((String) null, "tousername", f9Var2.f227336g.f141175d);
                        newSerializer.attribute((String) null, "type", TO.field_type + "");
                        String str2 = TO.field_svrid;
                        if (str2 == null) {
                            str2 = "";
                        }
                        newSerializer.attribute((String) null, "idbuffer", str2);
                        newSerializer.attribute((String) null, "md5", aVar3.f292059b);
                        newSerializer.attribute((String) null, "len", "1024");
                        newSerializer.attribute((String) null, "androidmd5", aVar3.f292058a);
                        newSerializer.attribute((String) null, "androidlen", "1024");
                        newSerializer.attribute((String) null, "productid", TO.field_groupId);
                        newSerializer.endTag((String) null, "emoji");
                        if (TO.mo62678k()) {
                            newSerializer.startTag((String) null, "gameext");
                            Map<String, String> parseXml = XmlParser.parseXml(TO.getContent(), "gameext", (String) null);
                            String nullAs = Util.nullAs(parseXml.get(".gameext.$type"), "");
                            String nullAs2 = Util.nullAs(parseXml.get(".gameext.$content"), "");
                            if (!nullAs.equals("")) {
                                if (!nullAs2.equals("")) {
                                    newSerializer.attribute((String) null, "type", nullAs + "");
                                    newSerializer.attribute((String) null, "content", nullAs2 + "");
                                    newSerializer.endTag((String) null, "gameext");
                                }
                            }
                            stringWriter.close();
                            trim = "";
                        }
                        newSerializer.endTag((String) null, "msg");
                        newSerializer.endDocument();
                        stringWriter.flush();
                        stringWriter.close();
                        String stringBuffer = stringWriter.getBuffer().toString();
                        try {
                            trim = stringBuffer.substring(stringBuffer.indexOf("<msg>"), stringBuffer.indexOf("</msg>") + 6);
                            Log.m105918d("MicroMsg.EmojiConvert", "xml " + trim);
                        } catch (Exception unused) {
                        }
                    } catch (XmlPullParserException e) {
                        Log.printErrStackTrace("MicroMsg.EmojiConvert", e, "", new Object[0]);
                    } catch (IllegalArgumentException e2) {
                        Log.printErrStackTrace("MicroMsg.EmojiConvert", e2, "", new Object[0]);
                    } catch (IllegalStateException e3) {
                        Log.printErrStackTrace("MicroMsg.EmojiConvert", e3, "", new Object[0]);
                    } catch (IOException e4) {
                        Log.printErrStackTrace("MicroMsg.EmojiConvert", e4, "", new Object[0]);
                    }
                }
                if (f4Var.mo108769t2() != 1 && C100556h.m131584d(f4Var.mo108768t())) {
                    trim = f4Var.mo108768t() + " :\n " + trim;
                }
            }
        }
        if (trim == null || !m130061c(trim)) {
            Log.m105918d("MicroMsg.BakOldItemEmoji", "emoji error" + Util.secPrint(trim));
            return -1;
        }
        C51163rv3 rv32 = new C51163rv3();
        rv32.mo73357f(Util.nullAs(trim, ""));
        f9Var2.f227337h = rv32;
        EmojiInfo TO2 = C100546d.m131563g().mo139995h().mo140006f().mo142044TO(f4Var.mo108765s2());
        if ((TO2 != null && TO2.mo62637I0()) || TO2 == null) {
            return length;
        }
        if (TextUtils.isEmpty(TO2.field_groupId)) {
            String str3 = C100546d.m131563g().mo139995h().mo140003c() + TO2.getMd5() + "_thumb";
            if (C86013q1.m106451l(str3) < 0) {
                Log.m105920e("MicroMsg.BakOldItemEmoji", "thumbPath error");
                return -1;
            }
            i = C99661l.m130077a(new C99661l.C99662a(str3, f9Var, linkedList, 4, z, "_thumb", z2, (C100968x) null));
        } else {
            String str4 = C100546d.m131563g().mo139995h().mo140003c() + TO2.field_groupId + "/" + TO2.getMd5() + "_cover";
            if (C86013q1.m106451l(str4) < 0) {
                Log.m105920e("MicroMsg.BakOldItemEmoji", "thumbPath error");
                return -1;
            }
            i = C99661l.m130077a(new C99661l.C99662a(str4, f9Var, linkedList, 4, z, "_thumb", z2, (C100968x) null));
        }
        int i3 = length + i;
        if (TextUtils.isEmpty(TO2.field_groupId) && TO2.mo62633C1()) {
            i2 = C99661l.m130077a(new C99661l.C99662a(C100546d.m131563g().mo139995h().mo140003c() + TO2.getMd5(), f9Var, linkedList, 5, z, z2, (C100968x) null, C100546d.m131563g().mo139995h().mo140006f().mo142044TO(new C72989o2(C48374j0.m53718g(f9Var2.f227337h)).f212821d)));
        } else if (!TO2.mo62642M0()) {
            return i3;
        } else {
            i2 = C99661l.m130077a(new C99661l.C99662a(C100546d.m131563g().mo139995h().mo140003c() + TO2.field_groupId + "/" + TO2.getMd5(), f9Var, linkedList, 5, z, z2, (C100968x) null, C100546d.m131563g().mo139995h().mo140006f().mo142044TO(new C72989o2(C48374j0.m53718g(f9Var2.f227337h)).f212821d)));
        }
        return i3 + i2;
    }
}
