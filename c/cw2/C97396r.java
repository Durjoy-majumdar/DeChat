package cw2;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import te3.C101765cp3;
import te3.bc4;
import te3.pc4;
import te3.sb4;

/* renamed from: cw2.r */
public final class C97396r {

    /* renamed from: a */
    public static final C97397a f285895a = new C97397a((C8480h) null);

    /* renamed from: cw2.r$a */
    public static final class C97397a {
        public C97397a(C8480h hVar) {
        }

        /* renamed from: a */
        public final pc4 mo136666a(String str) {
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14 = str;
            C87412m.m108594g(str14, "xml");
            Map<String, String> parseXml = XmlParser.parseXml(str14, "StoryObject", (String) null);
            if (parseXml == null) {
                return null;
            }
            pc4 pc4 = new pc4();
            sb4 sb4 = new sb4();
            C101765cp3 cp32 = new C101765cp3();
            cp32.f298034e = 0.0f;
            cp32.f298033d = 0.0f;
            pc4.f299135g = cp32;
            pc4.f299136h = sb4;
            String str15 = "";
            pc4.f299132d = str15;
            pc4.f299134f = 0;
            String str16 = parseXml.get(".StoryObject.id");
            if (str16 == null) {
                str16 = str15;
            }
            pc4.f299132d = str16;
            String str17 = parseXml.get(".StoryObject.username");
            if (str17 == null) {
                str17 = str15;
            }
            pc4.f299133e = str17;
            pc4.f299134f = Util.getInt(parseXml.get(".StoryObject.createTime"), 0);
            pc4.f299139n = Util.getInt(parseXml.get(".StoryObject.scope"), 0);
            C101765cp3 cp33 = new C101765cp3();
            cp33.f298033d = 0.0f;
            cp33.f298034e = 0.0f;
            cp33.f298035f = str15;
            cp33.f298041o = 0;
            cp33.f298038i = str15;
            cp33.f298039j = 0;
            cp33.f298037h = str15;
            cp33.f298036g = str15;
            cp33.f298042p = 1;
            cp33.f298047u = str15;
            cp33.f298048v = str15;
            pc4.f299135g = cp33;
            if (pc4.f299136h == null) {
                pc4.f299136h = new sb4();
            }
            sb4 sb42 = pc4.f299136h;
            String str18 = parseXml.get("contTitle");
            if (str18 == null) {
                str18 = str15;
            }
            sb42.f299397d = str18;
            int i = 0;
            while (true) {
                if (i != 0) {
                    str10 = ".StoryObject.ContentObject" + ".mediaList" + ".media" + i + ".id";
                    str7 = ".StoryObject.ContentObject" + ".mediaList" + ".media" + i + ".type";
                    str6 = ".StoryObject.ContentObject" + ".mediaList" + ".media" + i + ".url";
                    str5 = ".StoryObject.ContentObject" + ".mediaList" + ".media" + i + ".url.$videomd5";
                    str4 = ".StoryObject.ContentObject" + ".mediaList" + ".media" + i + ".thumb";
                    str3 = ".StoryObject.ContentObject" + ".mediaList" + ".media" + i + ".url.$type";
                    str12 = ".StoryObject.ContentObject" + ".mediaList" + ".media" + i + ".thumb.$type";
                    str11 = ".StoryObject.ContentObject" + ".mediaList" + ".media" + i + ".subType";
                    StringBuilder sb = new StringBuilder();
                    sb.append(".StoryObject.ContentObject");
                    sb.append(".mediaList");
                    sb.append(".media");
                    sb.append(i);
                    str2 = str15;
                    sb.append(".userData");
                    String sb5 = sb.toString();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(".StoryObject.ContentObject");
                    sb6.append(".mediaList");
                    sb6.append(".media");
                    sb6.append(i);
                    String str19 = sb5;
                    sb6.append(".url.$md5");
                    str8 = ".StoryObject.ContentObject" + ".mediaList" + ".media" + i + ".duration";
                    str9 = sb6.toString();
                    str13 = str19;
                } else {
                    str2 = str15;
                    str10 = ".StoryObject.ContentObject.mediaList.media.id";
                    str7 = ".StoryObject.ContentObject.mediaList.media.type";
                    str6 = ".StoryObject.ContentObject.mediaList.media.url";
                    str5 = ".StoryObject.ContentObject.mediaList.media.url.$videomd5";
                    str4 = ".StoryObject.ContentObject.mediaList.media.thumb";
                    str3 = ".StoryObject.ContentObject.mediaList.media.url.$type";
                    str12 = ".StoryObject.ContentObject.mediaList.media.thumb.$type";
                    str11 = ".StoryObject.ContentObject.mediaList.media.subType";
                    str13 = ".StoryObject.ContentObject.mediaList.media.userData";
                    str9 = ".StoryObject.ContentObject.mediaList.media.url.$md5";
                    str8 = ".StoryObject.ContentObject.mediaList.media.duration";
                }
                String str20 = parseXml.get(str10);
                String str21 = parseXml.get(str7);
                if (str21 == null) {
                    str21 = str2;
                }
                String str22 = parseXml.get(str6);
                if (str22 == null) {
                    str22 = str2;
                }
                String str23 = parseXml.get(str4);
                if (str23 == null) {
                    str23 = str2;
                }
                String str24 = parseXml.get(str5);
                if (str24 == null) {
                    str24 = str2;
                }
                String str25 = parseXml.get(str3);
                if (str25 == null) {
                    str25 = str2;
                }
                String str26 = parseXml.get(str12);
                if (str26 == null) {
                    str26 = str2;
                }
                String str27 = parseXml.get(str11);
                if (str27 == null) {
                    str27 = str2;
                }
                String str28 = parseXml.get(str13);
                String str29 = parseXml.get(str9);
                if (str29 == null) {
                    str29 = str2;
                }
                String str30 = parseXml.get(str8);
                if (str30 == null) {
                    str30 = str2;
                }
                if (str20 == null) {
                    return pc4;
                }
                bc4 bc4 = new bc4();
                bc4.f297959d = str20;
                bc4.f297960e = Util.getInt(str21, 0);
                bc4.f297961f = str22;
                bc4.f297962g = Util.getInt(str25, 0);
                bc4.f297963h = str23;
                bc4.f297964i = Util.getInt(str26, 0);
                bc4.f297965j = Util.getInt(str27, 0);
                bc4.f297966n = str29;
                bc4.f297967o = str24;
                bc4.f297978z = Util.getFloat(str30, 0.0f);
                pc4.f299136h.f299398e.add(bc4);
                i++;
                str15 = str2;
            }
        }
    }
}
