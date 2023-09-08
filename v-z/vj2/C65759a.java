package vj2;

import com.tencent.p014mm.message.C68066g;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d03.C58010a;
import gy3.C87412m;
import java.util.Map;
import p1081gi.C98121d;
import wj2.C53183e;
import wj2.C66132f;
import z04.C112551y;
import z04.C66725r;

/* renamed from: vj2.a */
public final class C65759a extends C68066g {

    /* renamed from: b */
    public C66132f f189163b = new C66132f();

    /* renamed from: a */
    public C68066g mo7615a() {
        C65759a aVar = new C65759a();
        aVar.f189163b = this.f189163b;
        return aVar;
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        String str2;
        C87412m.m108594g(sb, "sb");
        C66132f fVar = this.f189163b;
        if (fVar.f190092o == 0) {
            if ((fVar.f190093p.length() == 0) && fVar.f190094q == 0) {
                str2 = "";
                sb.append(str2);
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("<TPMediaInfoDesc>\n<info>");
        C58010a aVar = fVar.f190078a;
        sb4.append(fVar.mo90171b(aVar != null ? C66132f.f190074D.mo90185b(aVar) : null));
        sb4.append("</info>\n<startTime>");
        sb4.append(fVar.mo90171b(Long.valueOf(fVar.f190079b)));
        sb4.append("</startTime>\n<endTime>");
        sb4.append(fVar.mo90171b(Long.valueOf(fVar.f190080c)));
        sb4.append("</endTime>\n<hashCode>");
        sb4.append(fVar.mo90171b(fVar.f190082e));
        sb4.append("</hashCode>\n<duration>");
        sb4.append(fVar.mo90171b(Long.valueOf(fVar.f190084g)));
        sb4.append("</duration>\n<shortSongName>");
        sb4.append(fVar.mo90171b(fVar.f190086i));
        sb4.append("</shortSongName>\n<songName>");
        sb4.append(fVar.mo90171b(fVar.f190085h));
        sb4.append("</songName>\n<singerName>");
        sb4.append(fVar.mo90171b(fVar.f190087j));
        sb4.append("</singerName>\n<cover>");
        sb4.append(fVar.mo90171b(fVar.f190088k));
        sb4.append("</cover>\n<channelId>");
        sb4.append(fVar.mo90171b(fVar.f190089l));
        sb4.append("</channelId>\n<ringtoneSource>");
        sb4.append(fVar.mo90171b(fVar.f190090m));
        sb4.append("</ringtoneSource>\n<finderObjectId>");
        sb4.append(fVar.mo90171b(Long.valueOf(fVar.f190092o)));
        sb4.append("</finderObjectId>\n<finderNonceId>");
        sb4.append(fVar.mo90171b(fVar.f190093p));
        sb4.append("</finderNonceId>\n<musicSid>");
        sb4.append(fVar.mo90171b(Integer.valueOf(fVar.f190094q)));
        sb4.append("</musicSid>\n<unAvailable>");
        sb4.append(fVar.mo90171b(Boolean.valueOf(fVar.f190091n)));
        sb4.append("</unAvailable>\n<finderAuthorHeadUrl>");
        sb4.append(fVar.mo90171b(fVar.f190097t));
        sb4.append("</finderAuthorHeadUrl>\n<finderAuthIconUrl>");
        sb4.append(fVar.mo90171b(fVar.f190098u));
        sb4.append("</finderAuthIconUrl>\n<finderAuthProfession>");
        sb4.append(fVar.mo90171b(fVar.f190099v));
        sb4.append("</finderAuthProfession>\n<finderAuthProfessionType>");
        sb4.append(fVar.mo90171b(Integer.valueOf(fVar.f190100w)));
        sb4.append("</finderAuthProfessionType>\n<authProfessionType>");
        sb4.append(fVar.mo90171b(Integer.valueOf(fVar.f190101x)));
        sb4.append("</authProfessionType>\n<singerFinderUserName>");
        sb4.append(fVar.mo90171b(fVar.f190075A));
        sb4.append("</singerFinderUserName>\n<singerBaikeURL>");
        sb4.append(fVar.mo90171b(fVar.f190076B));
        sb4.append("</singerBaikeURL>\n<finderUserName>");
        sb4.append(fVar.mo90171b(fVar.f190103z));
        sb4.append("</finderUserName>\n<hasBgm>");
        sb4.append(fVar.mo90171b(Boolean.valueOf(fVar.f190102y)));
        sb4.append("</hasBgm>\n</TPMediaInfoDesc>\n");
        str2 = C66725r.m78728b(C112551y.m153816p(sb4.toString(), "\n", "", false, 4, (Object) null));
        sb.append(str2);
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        C87412m.m108594g(map, "values");
        C66132f fVar = this.f189163b;
        fVar.getClass();
        try {
            if (!map.isEmpty()) {
                C66132f.C66133a aVar = C66132f.f190074D;
                C58010a aVar2 = new C58010a();
                String nullAs = Util.nullAs(map.get(".msg.appmsg.TPMediaInfoDesc" + ".info"), "{}");
                C87412m.m108593f(nullAs, "nullAs(values[\"$tagPrefix.info\"], \"{}\")");
                fVar.f190078a = aVar.mo90184a(aVar2, nullAs);
                fVar.f190079b = Util.safeParseLong(map.get(".msg.appmsg.TPMediaInfoDesc" + ".startTime"));
                fVar.f190080c = Util.safeParseLong(map.get(".msg.appmsg.TPMediaInfoDesc" + ".endTime"));
                fVar.f190082e = Util.nullAs(map.get(".msg.appmsg.TPMediaInfoDesc" + ".endTime"), "");
                fVar.f190084g = Util.safeParseLong(map.get(".msg.appmsg.TPMediaInfoDesc" + ".duration"));
                String nullAs2 = Util.nullAs(map.get(".msg.appmsg.TPMediaInfoDesc" + ".shortSongName"), "");
                C87412m.m108593f(nullAs2, "nullAs(values[\"$tagPrefix.shortSongName\"], \"\")");
                fVar.f190086i = nullAs2;
                String nullAs3 = Util.nullAs(map.get(".msg.appmsg.TPMediaInfoDesc" + ".songName"), "");
                C87412m.m108593f(nullAs3, "nullAs(values[\"$tagPrefix.songName\"], \"\")");
                fVar.f190085h = nullAs3;
                String nullAs4 = Util.nullAs(map.get(".msg.appmsg.TPMediaInfoDesc" + ".singerName"), "");
                C87412m.m108593f(nullAs4, "nullAs(values[\"$tagPrefix.singerName\"], \"\")");
                fVar.f190087j = nullAs4;
                String nullAs5 = Util.nullAs(map.get(".msg.appmsg.TPMediaInfoDesc" + ".cover"), "");
                C87412m.m108593f(nullAs5, "nullAs(values[\"$tagPrefix.cover\"], \"\")");
                fVar.f190088k = nullAs5;
                String nullAs6 = Util.nullAs(map.get(".msg.appmsg.TPMediaInfoDesc" + ".channelId"), "");
                C87412m.m108593f(nullAs6, "nullAs(values[\"$tagPrefix.channelId\"], \"\")");
                fVar.f190089l = nullAs6;
                C53183e.C53184a aVar3 = C53183e.f148370d;
                fVar.f190090m = aVar3.mo73863a(Util.safeParseInt(map.get(".msg.appmsg.TPMediaInfoDesc" + ".channelId")));
                fVar.f190092o = Util.safeParseLong(map.get(".msg.appmsg.TPMediaInfoDesc" + ".finderObjectId"));
                String nullAs7 = Util.nullAs(map.get(".msg.appmsg.TPMediaInfoDesc" + ".finderNonceId"), "");
                C87412m.m108593f(nullAs7, "nullAs(values[\"$tagPrefix.finderNonceId\"], \"\")");
                fVar.f190093p = nullAs7;
                fVar.f190094q = Util.safeParseInt(map.get(".msg.appmsg.TPMediaInfoDesc" + ".musicSid"));
                fVar.f190091n = Boolean.parseBoolean(Util.nullAsNil(map.get(".msg.appmsg.TPMediaInfoDesc" + ".unAvailable")));
                String nullAs8 = Util.nullAs(map.get(".msg.appmsg.TPMediaInfoDesc" + ".finderAuthorHeadUrl"), "");
                C87412m.m108593f(nullAs8, "nullAs(values[\"$tagPrefi…inderAuthorHeadUrl\"], \"\")");
                fVar.f190097t = nullAs8;
                String nullAs9 = Util.nullAs(map.get(".msg.appmsg.TPMediaInfoDesc" + ".finderAuthIconUrl"), "");
                C87412m.m108593f(nullAs9, "nullAs(values[\"$tagPrefix.finderAuthIconUrl\"], \"\")");
                fVar.f190098u = nullAs9;
                String nullAs10 = Util.nullAs(map.get(".msg.appmsg.TPMediaInfoDesc" + ".finderAuthProfession"), "");
                C87412m.m108593f(nullAs10, "nullAs(values[\"$tagPrefi…nderAuthProfession\"], \"\")");
                fVar.f190099v = nullAs10;
                fVar.f190100w = Util.safeParseInt(map.get(".msg.appmsg.TPMediaInfoDesc" + ".finderAuthProfessionType"));
                fVar.f190101x = Util.safeParseInt(map.get(".msg.appmsg.TPMediaInfoDesc" + ".authProfessionType"));
                String nullAs11 = Util.nullAs(map.get(".msg.appmsg.TPMediaInfoDesc" + ".singerFinderUserName"), "");
                C87412m.m108593f(nullAs11, "nullAs(values[\"$tagPrefi…ngerFinderUserName\"], \"\")");
                fVar.f190075A = nullAs11;
                String nullAs12 = Util.nullAs(map.get(".msg.appmsg.TPMediaInfoDesc" + ".singerBaikeURL"), "");
                C87412m.m108593f(nullAs12, "nullAs(values[\"$tagPrefix.singerBaikeURL\"], \"\")");
                fVar.f190076B = nullAs12;
                String nullAs13 = Util.nullAs(map.get(".msg.appmsg.TPMediaInfoDesc" + ".finderUserName"), "");
                C87412m.m108593f(nullAs13, "nullAs(values[\"$tagPrefix.finderUserName\"], \"\")");
                fVar.f190103z = nullAs13;
                fVar.f190102y = Util.getBoolean(map.get(".msg.appmsg.TPMediaInfoDesc" + ".hasBgm"), false);
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.TPMediaInfoDesc", "parse error! %s", e.getMessage());
        }
    }

    /* renamed from: f */
    public final C66132f mo89769f() {
        return this.f189163b;
    }
}
