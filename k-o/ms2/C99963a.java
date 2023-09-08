package ms2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.LinkedList;
import java.util.Map;
import te3.C101804kv2;
import te3.C101817mv2;
import te3.C64231ae2;
import te3.C64512l4;
import te3.C64545m7;
import te3.C64570n7;

/* renamed from: ms2.a */
public class C99963a {
    /* renamed from: a */
    public static C101817mv2 m130600a(Map<String, String> map, String str) {
        SnsMethodCalculate.markStartTimeMs("fillContentMediaSize", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        String str2 = str + ".size" + ".$width";
        String str3 = str + ".size" + ".$height";
        String str4 = map.get(str2);
        String str5 = map.get(str3);
        String str6 = map.get(str + ".size" + ".$totalSize");
        C101817mv2 mv22 = new C101817mv2();
        mv22.f298876e = 0.0f;
        mv22.f298875d = 0.0f;
        mv22.f298877f = 0.0f;
        if (str4 != null) {
            mv22.f298875d = m130601b(str4);
        }
        if (str5 != null) {
            mv22.f298876e = m130601b(str5);
        }
        if (str6 != null) {
            mv22.f298877f = m130601b(str6);
        }
        SnsMethodCalculate.markEndTimeMs("fillContentMediaSize", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        return mv22;
    }

    /* renamed from: b */
    public static float m130601b(String str) {
        SnsMethodCalculate.markStartTimeMs("parserFloat", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        float f = 0.0f;
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("parserFloat", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
            return 0.0f;
        }
        try {
            f = Util.getFloat(str, 0.0f);
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.AlbumBgHelper", "parseFloat error " + str);
        }
        SnsMethodCalculate.markEndTimeMs("parserFloat", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        return f;
    }

    /* renamed from: c */
    public static C64512l4 m130602c(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        C64512l4 l4Var;
        C64231ae2 ae22;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17 = "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper";
        SnsMethodCalculate.markStartTimeMs("parserFromXml", str17);
        Map<String, String> parseXml = XmlParser.parseXml(str, "albumList", (String) null);
        SnsMethodCalculate.markStartTimeMs("getNewAlbumBG", str17);
        C64512l4 l4Var2 = new C64512l4();
        SnsMethodCalculate.markEndTimeMs("getNewAlbumBG", str17);
        if (parseXml != null) {
            l4Var2.f184030f = m130604e(parseXml.get(".albumList.$lang"));
            SnsMethodCalculate.markStartTimeMs("fillAuthor", str17);
            C64545m7 m7Var = new C64545m7();
            m7Var.f184209d = m130604e(parseXml.get(".albumList.album.author.name"));
            m7Var.f184210e = m130604e(parseXml.get(".albumList.album.author.title"));
            m7Var.f184212g = m130604e(parseXml.get(".albumList.album.author.description"));
            m7Var.f184211f = m130604e(parseXml.get(".albumList.album.author.quote"));
            SnsMethodCalculate.markStartTimeMs("fillAuthorIcon", str17);
            C64570n7 n7Var = new C64570n7();
            C101817mv2 a = m130600a(parseXml, ".albumList.album.author.icon.media");
            str2 = "parserFromXml";
            Map<String, String> map = parseXml;
            C101804kv2 kv22 = new C101804kv2();
            kv22.f298689d = m130604e(parseXml.get(".albumList.album.author.icon.media.id"));
            kv22.f298690e = m130603d(parseXml.get(".albumList.album.author.icon.media.type"));
            kv22.f298697o = m130604e(parseXml.get(".albumList.album.author.icon.media.title"));
            kv22.f298691f = m130604e(parseXml.get(".albumList.album.author.icon.media.desc"));
            kv22.f298692g = m130604e(parseXml.get(".albumList.album.author.icon.media.url"));
            kv22.f298693h = m130603d(parseXml.get(".albumList.album.author.icon.media.url.$type"));
            kv22.f298694i = m130604e(parseXml.get(".albumList.album.author.icon.media.thumb"));
            kv22.f298695j = m130603d(parseXml.get(".albumList.album.author.icon.media.thumb.$type"));
            kv22.f298696n = m130603d(parseXml.get(".albumList.album.author.icon.media.private"));
            kv22.f298698p = a;
            n7Var.f184437d = kv22;
            SnsMethodCalculate.markEndTimeMs("fillAuthorIcon", str17);
            m7Var.f184213h = n7Var;
            l4Var2.f184028d = m7Var;
            SnsMethodCalculate.markEndTimeMs("fillAuthor", str17);
            String str18 = "fillGroupList";
            SnsMethodCalculate.markStartTimeMs(str18, str17);
            int i2 = 0;
            while (true) {
                C64231ae2 ae23 = new C64231ae2();
                if (i2 == 0) {
                    str4 = ".albumList.album.groupList.group.name";
                    str3 = ".albumList.album.groupList.group.mediaList";
                } else {
                    str4 = ".albumList.album.groupList.group" + i2 + ".name";
                    str3 = ".albumList.album.groupList.group" + i2 + ".mediaList";
                }
                Map<String, String> map2 = map;
                String str19 = map2.get(str4);
                if (str19 == null) {
                    break;
                }
                ae23.f182080d = m130604e(str19);
                SnsMethodCalculate.markStartTimeMs("fillMediaList", str17);
                LinkedList<C101804kv2> linkedList = new LinkedList<>();
                int i3 = 0;
                while (true) {
                    str5 = str18;
                    i = i2;
                    l4Var = l4Var2;
                    ae22 = ae23;
                    if (i3 != 0) {
                        str6 = str17;
                        str15 = str3 + ".media" + i3 + ".id";
                        str13 = str3 + ".media" + i3 + ".type";
                        str16 = str3 + ".media" + i3 + ".title";
                        str14 = str3 + ".media" + i3 + ".desc";
                        str12 = str3 + ".media" + i3 + ".url";
                        str7 = str3 + ".media" + i3 + ".thumb";
                        str8 = str3 + ".media" + i3 + ".url.$type";
                        str9 = str3 + ".media" + i3 + ".thumb.$type";
                        str10 = str3 + ".media" + i3 + ".private";
                        str11 = str3 + ".media" + i3;
                    } else {
                        str6 = str17;
                        str15 = str3 + ".media" + ".id";
                        str13 = str3 + ".media" + ".type";
                        str16 = str3 + ".media" + ".title";
                        str14 = str3 + ".media" + ".desc";
                        str12 = str3 + ".media" + ".url";
                        str7 = str3 + ".media" + ".thumb";
                        str8 = str3 + ".media" + ".url.$type";
                        str9 = str3 + ".media" + ".thumb.$type";
                        str10 = str3 + ".media" + ".private";
                        str11 = str3 + ".media";
                    }
                    if (str15 != null && str13 != null) {
                        C101817mv2 a2 = m130600a(map2, str11);
                        String str20 = map2.get(str15);
                        String str21 = map2.get(str13);
                        String str22 = map2.get(str16);
                        String str23 = map2.get(str14);
                        String str24 = map2.get(str12);
                        String str25 = map2.get(str10);
                        String str26 = map2.get(str7);
                        String str27 = map2.get(str8);
                        String str28 = map2.get(str9);
                        if (str20 == null || str21 == null) {
                            break;
                        }
                        C101804kv2 kv23 = new C101804kv2();
                        kv23.f298689d = m130604e(str20);
                        kv23.f298690e = m130603d(str21);
                        kv23.f298697o = m130604e(str22);
                        kv23.f298691f = m130604e(str23);
                        kv23.f298692g = m130604e(str24);
                        kv23.f298693h = m130603d(str27);
                        kv23.f298694i = m130604e(str26);
                        kv23.f298695j = m130603d(str28);
                        kv23.f298696n = m130603d(str25);
                        kv23.f298698p = a2;
                        linkedList.add(kv23);
                        i3++;
                        str18 = str5;
                        i2 = i;
                        l4Var2 = l4Var;
                        ae23 = ae22;
                        str17 = str6;
                    } else {
                        break;
                    }
                }
                String str29 = str6;
                SnsMethodCalculate.markEndTimeMs("fillMediaList", str29);
                C64231ae2 ae24 = ae22;
                ae24.f182081e = linkedList;
                C64512l4 l4Var3 = l4Var;
                l4Var3.f184029e.add(ae24);
                i2 = i + 1;
                str17 = str29;
                l4Var2 = l4Var3;
                str18 = str5;
                map = map2;
            }
            SnsMethodCalculate.markEndTimeMs(str18, str17);
        } else {
            str2 = "parserFromXml";
        }
        C64512l4 l4Var4 = l4Var2;
        SnsMethodCalculate.markEndTimeMs(str2, str17);
        return l4Var4;
    }

    /* renamed from: d */
    public static int m130603d(String str) {
        SnsMethodCalculate.markStartTimeMs("parserInt", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        int i = 0;
        try {
            i = Util.getInt(str, 0);
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.AlbumBgHelper", "parserInt error " + str);
        }
        SnsMethodCalculate.markEndTimeMs("parserInt", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        return i;
    }

    /* renamed from: e */
    public static String m130604e(String str) {
        SnsMethodCalculate.markStartTimeMs("parserString", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("parserString", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
            return "";
        }
        SnsMethodCalculate.markEndTimeMs("parserString", "com.tencent.mm.plugin.sns.snstimeline.AlbumBgHelper");
        return str;
    }
}
