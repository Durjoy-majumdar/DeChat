package com.tencent.p014mm.plugin.biz;

import android.text.TextUtils;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SemiXml;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import gw0.C76073b;
import java.util.Map;
import kb0.C9576e;
import kr0.C76629w0;
import p823sg.C101611g;
import p823sg.C101614i;
import rb0.C47996o;
import s90.C77627f;
import s90.C77629i;
import s90.C77630j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.biz.a */
public class C68761a extends C86301e implements C76073b {
    /* renamed from: II */
    public int mo94595II(long j, String str) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i > 0) {
            Integer num = C92721n.f266841b.get(Long.valueOf(j));
            if (num != null) {
                return num.intValue();
            }
        } else {
            C101611g<Long, C77629i> gVar = C92721n.f266840a;
        }
        Map<String, String> decode = SemiXml.decode(str);
        if (decode == null) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(Util.getInt(decode.get(".msg.appmsg.mmreader.category.$count"), 0));
        if (i > 0) {
            C92721n.f266841b.put(Long.valueOf(j), valueOf);
        }
        return valueOf.intValue();
    }

    /* renamed from: JG */
    public String mo94596JG(String str, String str2) {
        WxaAttributes N2;
        C101611g<Long, C77629i> gVar = C92721n.f266840a;
        String str3 = null;
        Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
        if (parseXml == null) {
            Log.m105920e("MicroMsg.AppMsgBizHelper", "getAppMsgDyeingTempFromUser fail, values is null");
        } else {
            str3 = parseXml.get(".msg.fromusername");
        }
        if (!Util.isNullOrNil(str3) || C72996z1.m85841l5(str2)) {
            str2 = str3;
        }
        if (!Util.isNullOrNil(str2)) {
            if (C9576e.m9260a(str2) && (N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(str2)) != null && !TextUtils.isEmpty(N2.field_nickname)) {
                return N2.field_nickname;
            }
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
            if (z1Var != null && ((int) z1Var.f108320R1) > 0) {
                return ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str2);
            }
        }
        return "";
    }

    /* renamed from: JZ */
    public C77627f mo94597JZ(long j, String str) {
        String str2;
        String str3;
        String str4 = str;
        long j2 = 0;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i > 0) {
            C77629i iVar = C92721n.f266840a.get(Long.valueOf(j));
            if (iVar != null) {
                return iVar;
            }
        } else {
            C101611g<Long, C77629i> gVar = C92721n.f266840a;
        }
        Map<String, String> decode = SemiXml.decode(str);
        if (decode == null) {
            decode = XmlParser.parseXml(str4, "msg", (String) null);
        }
        if (decode == null) {
            return new C77629i();
        }
        int i2 = Util.getInt(decode.get(".msg.appmsg.mmreader.category.$type"), 0);
        String nullAsNil = Util.nullAsNil(decode.get(".msg.appmsg.mmreader.name"));
        int i3 = Util.getInt(decode.get(".msg.appmsg.mmreader.forbid_forward"), 0);
        int i4 = Util.getInt(decode.get(".msg.appmsg.mmreader.category.$count"), 0);
        C77629i iVar2 = new C77629i();
        iVar2.f226290d = i2;
        iVar2.f226291e = nullAsNil;
        iVar2.f226294h = decode.get(".msg.commenturl");
        iVar2.f226296j = i3;
        int i5 = 0;
        while (i5 < i4) {
            C77630j jVar = new C77630j();
            StringBuilder sb = new StringBuilder();
            sb.append(".msg.appmsg.mmreader.category.item");
            if (i5 == 0) {
                str2 = "";
            } else {
                str2 = "" + i5;
            }
            sb.append(str2);
            String sb4 = sb.toString();
            jVar.f226325d = decode.get(sb4 + ".title");
            jVar.f226326e = decode.get(sb4 + ".url");
            jVar.f226327f = decode.get(sb4 + ".shorturl");
            jVar.f226328g = decode.get(sb4 + ".longurl");
            jVar.f226329h = Util.getLong(decode.get(sb4 + ".pub_time"), j2);
            jVar.f226331j = decode.get(sb4 + ".tweetid");
            jVar.f226332n = decode.get(sb4 + ".digest");
            jVar.f226333o = Util.getInt(decode.get(sb4 + ".itemshowtype"), 0);
            jVar.f226335q = Util.getInt(decode.get(sb4 + ".play_length"), 0);
            jVar.f226330i = decode.get(sb4 + ".cover");
            String str5 = decode.get(sb4 + ".cover_235_1");
            String str6 = decode.get(sb4 + ".cover_16_9");
            jVar.f226322N = str6;
            if ((jVar.f226333o != 5 && !Util.isNullOrNil(str5)) || Util.isNullOrNil(jVar.f226330i)) {
                jVar.f226330i = str5;
            }
            if (jVar.f226333o == 5 && !Util.isNullOrNil(str6)) {
                jVar.f226330i = str6;
            }
            for (int i6 = 0; i6 < 100; i6++) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                sb5.append(".pic_urls.pic_url");
                if (i6 == 0) {
                    str3 = "";
                } else {
                    str3 = "" + i6;
                }
                sb5.append(str3);
                String str7 = decode.get(sb5.toString());
                if (Util.isNullOrNil(str7)) {
                    break;
                }
                jVar.f226316H.add(str7);
            }
            if (jVar.f226316H.size() == 0) {
                jVar.f226316H.add(jVar.f226330i);
            }
            jVar.f226312D = decode.get(sb4 + ".cover_1_1");
            jVar.f226334p = Util.getInt(decode.get(sb4 + ".del_flag"), 0);
            jVar.f226336r = decode.get(sb4 + ".weapp_username");
            jVar.f226337s = decode.get(sb4 + ".weapp_path");
            jVar.f226338t = Util.getInt(decode.get(sb4 + ".weapp_version"), 0);
            jVar.f226339u = Util.getInt(decode.get(sb4 + ".weapp_state"), 0);
            jVar.f226340v = decode.get(sb4 + ".weapp_appid");
            jVar.f226341w = decode.get(sb4 + ".weapp_image_url");
            jVar.f226342x = decode.get(sb4 + ".weapp_icon");
            jVar.f226343y = decode.get(sb4 + ".weapp_nickname");
            jVar.f226344z = decode.get(sb4 + ".play_url");
            jVar.f226309A = decode.get(sb4 + ".player");
            jVar.f226310B = Util.getInt(decode.get(sb4 + ".music_source"), 1);
            jVar.f226311C = Util.getInt(decode.get(sb4 + ".pic_num"), 1);
            jVar.f226313E = Util.getInt(decode.get(sb4 + ".video_width"), 0);
            jVar.f226314F = Util.getInt(decode.get(sb4 + ".video_height"), 0);
            jVar.f226317I = Util.getInt(decode.get(sb4 + ".is_pay_subscribe"), 0);
            jVar.f226320L = Util.getLong(decode.get(sb4 + ".comment_topic_id"), 0);
            jVar.f226315G = decode.get(sb4 + ".vid");
            jVar.f226321M = str4;
            jVar.f226322N = decode.get(sb4 + ".cover_16_9");
            iVar2.f226295i.add(jVar);
            i5++;
            j2 = 0;
        }
        C47996o.m53357c(decode);
        String nullAsNil2 = Util.nullAsNil(decode.get(".msg.fromusername"));
        if (!Util.isNullOrNil(nullAsNil2)) {
            String j3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(nullAsNil2).mo62909j3();
            iVar2.f226292f = nullAsNil2;
            iVar2.f226293g = j3;
        }
        if (i > 0) {
            ((C101614i) C92721n.f266840a).mo139557c(Long.valueOf(j), iVar2);
            C92721n.f266841b.put(Long.valueOf(j), Integer.valueOf(i4));
        }
        return iVar2;
    }

    /* renamed from: h0 */
    public boolean mo94598h0(String str) {
        C101611g<Long, C77629i> gVar = C92721n.f266840a;
        return C9576e.m9260a(str);
    }

    /* renamed from: kB */
    public String mo94599kB(String str) {
        return C92721n.m116883k(str);
    }

    public String lg0(String str, String str2) {
        C101611g<Long, C77629i> gVar = C92721n.f266840a;
        Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
        if (parseXml == null) {
            Log.m105920e("MicroMsg.AppMsgBizHelper", "getAppMsgDyeingTempTitle fail, values is null");
            return " ";
        }
        Util.getInt(parseXml.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
        Util.nullAs(parseXml.get(".msg.appmsg.ext_pay_info.pay_type"), "");
        String nullAsNil = Util.nullAsNil(parseXml.get(".msg.appmsg.title"));
        if (Util.isNullOrNil(nullAsNil)) {
            nullAsNil = parseXml.get(".msg.appmsg.mmreader.category.item.title");
        }
        return Util.isNullOrNil(nullAsNil) ? " " : nullAsNil;
    }
}
