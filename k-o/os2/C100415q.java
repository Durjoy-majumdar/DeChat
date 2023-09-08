package os2;

import ad0.C91999u;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Map;
import p823sg.C90193h;
import te3.C101804kv2;
import te3.C101817mv2;
import z04.C119027c;

/* renamed from: os2.q */
public final class C100415q {

    /* renamed from: a */
    public static final C100415q f294176a = new C100415q();

    /* renamed from: a */
    public final C101804kv2 mo139879a(String str, Map<String, String> map) {
        byte[] bArr;
        String str2 = str;
        Map<String, String> map2 = map;
        SnsMethodCalculate.markStartTimeMs("parseMedia", "com.tencent.mm.plugin.sns.storage.MediaObjParser");
        if (str2 == null) {
            SnsMethodCalculate.markEndTimeMs("parseMedia", "com.tencent.mm.plugin.sns.storage.MediaObjParser");
            return null;
        } else if (map2 == null) {
            SnsMethodCalculate.markEndTimeMs("parseMedia", "com.tencent.mm.plugin.sns.storage.MediaObjParser");
            return null;
        } else {
            String str3 = str2 + ".id";
            String str4 = str2 + ".type";
            String str5 = str2 + ".title";
            String str6 = str2 + ".description";
            String str7 = str2 + ".url";
            String str8 = str2 + ".url.$videomd5";
            String str9 = str2 + ".thumb";
            String str10 = str2 + ".private";
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            String str11 = "parseMedia";
            sb.append(".userData");
            String sb4 = sb.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            String str12 = sb4;
            sb5.append(".lowBandUrl");
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str2);
            String str13 = str2 + ".subType";
            sb7.append(".lowBandUrl.$type");
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str2);
            String str14 = sb8;
            sb9.append(".songalbumurl");
            String sb10 = sb9.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(str2);
            String str15 = sb10;
            sb11.append(".songlyric");
            String sb12 = sb11.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(str2);
            String str16 = sb12;
            sb13.append(".attachUrl");
            String sb14 = sb13.toString();
            StringBuilder sb15 = new StringBuilder();
            sb15.append(str2);
            String str17 = sb14;
            sb15.append(".attachUrl.$md5");
            String sb16 = sb15.toString();
            StringBuilder sb17 = new StringBuilder();
            sb17.append(str2);
            String str18 = sb16;
            sb17.append(".url.$md5");
            String sb18 = sb17.toString();
            StringBuilder sb19 = new StringBuilder();
            sb19.append(str2);
            String str19 = sb18;
            sb19.append(".videosize.$attachTotalTime");
            String sb20 = sb19.toString();
            StringBuilder sb21 = new StringBuilder();
            sb21.append(str2);
            String str20 = sb20;
            sb21.append(".attachThumbUrl");
            String sb22 = sb21.toString();
            StringBuilder sb23 = new StringBuilder();
            sb23.append(str2);
            String str21 = sb22;
            sb23.append(".attachShareTitle");
            String sb24 = sb23.toString();
            StringBuilder sb25 = new StringBuilder();
            sb25.append(str2);
            String str22 = sb24;
            sb25.append(".enc");
            String sb26 = sb25.toString();
            StringBuilder sb27 = new StringBuilder();
            sb27.append(str2);
            String str23 = sb26;
            sb27.append(".enc.$key");
            String sb28 = sb27.toString();
            StringBuilder sb29 = new StringBuilder();
            sb29.append(str2);
            String str24 = sb28;
            sb29.append(".url.$token");
            String sb30 = sb29.toString();
            StringBuilder sb31 = new StringBuilder();
            sb31.append(str2);
            String str25 = sb30;
            sb31.append(".url.$enc_idx");
            String sb32 = sb31.toString();
            StringBuilder sb33 = new StringBuilder();
            sb33.append(str2);
            String str26 = sb32;
            sb33.append(".url.$key");
            String sb34 = sb33.toString();
            StringBuilder sb35 = new StringBuilder();
            sb35.append(str2);
            String str27 = sb34;
            sb35.append(".thumb.$token");
            String sb36 = sb35.toString();
            StringBuilder sb37 = new StringBuilder();
            sb37.append(str2);
            String str28 = sb36;
            sb37.append(".thumb.$enc_idx");
            String sb38 = sb37.toString();
            StringBuilder sb39 = new StringBuilder();
            sb39.append(str2);
            String str29 = sb38;
            sb39.append(".thumb.$key");
            String sb40 = sb39.toString();
            StringBuilder sb41 = new StringBuilder();
            sb41.append(str2);
            String str30 = sb40;
            sb41.append(".videoDuration");
            String sb42 = sb41.toString();
            SnsMethodCalculate.markStartTimeMs("fillContentMediaSize", "com.tencent.mm.plugin.sns.storage.MediaObjParser");
            String str31 = sb6;
            StringBuilder sb43 = new StringBuilder();
            sb43.append(str2);
            String str32 = str2 + ".thumb.$type";
            sb43.append(".size.$width");
            String sb44 = sb43.toString();
            StringBuilder sb45 = new StringBuilder();
            sb45.append(str2);
            String str33 = str2 + ".url.$type";
            sb45.append(".size.$height");
            String sb46 = sb45.toString();
            String str34 = map2.get(sb44);
            String str35 = map2.get(sb46);
            String str36 = map2.get(str2 + ".size.$totalSize");
            C101817mv2 mv22 = new C101817mv2();
            String str37 = str8;
            mv22.f298876e = 0.0f;
            mv22.f298875d = 0.0f;
            mv22.f298877f = 0.0f;
            if (str34 != null) {
                mv22.f298875d = C91999u.m115570p(str34);
            }
            if (str35 != null) {
                mv22.f298876e = C91999u.m115570p(str35);
            }
            if (str36 != null) {
                mv22.f298877f = C91999u.m115570p(str36);
            }
            SnsMethodCalculate.markEndTimeMs("fillContentMediaSize", "com.tencent.mm.plugin.sns.storage.MediaObjParser");
            String str38 = map2.get(str3);
            String str39 = map2.get(str4);
            String str40 = map2.get(str5);
            String str41 = map2.get(str6);
            String str42 = map2.get(str7);
            String str43 = map2.get(str10);
            String str44 = map2.get(str9);
            String str45 = map2.get(str33);
            String str46 = map2.get(str32);
            String str47 = map2.get(str31);
            String str48 = map2.get(str14);
            String str49 = "com.tencent.mm.plugin.sns.storage.MediaObjParser";
            String str50 = map2.get(str15);
            String str51 = map2.get(sb42);
            String str52 = map2.get(str16);
            String str53 = map2.get(str37);
            String str54 = map2.get(str13);
            String str55 = map2.get(str12);
            String str56 = map2.get(str17);
            String str57 = map2.get(str18);
            String str58 = map2.get(str19);
            String str59 = map2.get(str20);
            String str60 = map2.get(str21);
            String str61 = map2.get(str22);
            String str62 = map2.get(str23);
            String str63 = map2.get(str24);
            String str64 = map2.get(str25);
            String str65 = map2.get(str26);
            String str66 = map2.get(str27);
            String str67 = map2.get(str28);
            String str68 = map2.get(str29);
            String str69 = map2.get(str30);
            if (str39 == null || Util.isNullOrNil(str38)) {
                SnsMethodCalculate.markEndTimeMs(str11, str49);
                return null;
            }
            C101804kv2 kv22 = new C101804kv2();
            kv22.f298689d = C91999u.m115574t(str38);
            kv22.f298690e = C91999u.m115572r(str39);
            kv22.f298697o = C91999u.m115574t(str40);
            kv22.f298691f = C91999u.m115574t(str41);
            kv22.f298692g = C91999u.m115574t(str42);
            kv22.f298693h = C91999u.m115572r(str45);
            kv22.f298694i = C91999u.m115574t(str44);
            kv22.f298695j = C91999u.m115572r(str46);
            kv22.f298696n = C91999u.m115572r(str43);
            kv22.f298698p = mv22;
            kv22.f298699q = C91999u.m115574t(str47);
            kv22.f298700r = C91999u.m115572r(str48);
            kv22.f298682P = str50;
            kv22.f298683Q = str52;
            kv22.f298703u = C91999u.m115574t(str55);
            kv22.f298704v = C91999u.m115572r(str54);
            kv22.f298706x = C91999u.m115574t(str56);
            kv22.f298708z = C91999u.m115574t(str57);
            kv22.f298707y = C91999u.m115574t(str58);
            kv22.f298680M = C91999u.m115574t(str53);
            kv22.f298668A = C91999u.m115572r(str59);
            kv22.f298669B = C91999u.m115574t(str60);
            kv22.f298670C = C91999u.m115574t(str61);
            kv22.f298671D = C91999u.m115572r(str62);
            kv22.f298672E = C91999u.m115573s(str63);
            String str70 = kv22.f298692g;
            if (str70 == null) {
                bArr = "".getBytes(C119027c.f356488a);
                C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
            } else {
                C87412m.m108593f(str70, "mediaObj.Url");
                bArr = str70.getBytes(C119027c.f356488a);
                C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
            }
            kv22.f298673F = C90193h.m112878f(bArr);
            kv22.f298674G = str64;
            kv22.f298675H = C91999u.m115572r(str65);
            kv22.f298676I = str66;
            kv22.f298677J = str67;
            kv22.f298678K = C91999u.m115572r(str68);
            kv22.f298679L = str69;
            kv22.f298684R = C91999u.m115570p(str51);
            SnsMethodCalculate.markEndTimeMs(str11, str49);
            return kv22;
        }
    }
}
