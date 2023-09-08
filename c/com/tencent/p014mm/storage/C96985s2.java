package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import java.util.Map;

/* renamed from: com.tencent.mm.storage.s2 */
public class C96985s2 {

    /* renamed from: A */
    public String f284153A;

    /* renamed from: B */
    public String f284154B;

    /* renamed from: C */
    public String f284155C;

    /* renamed from: D */
    public String f284156D;

    /* renamed from: E */
    public String f284157E;

    /* renamed from: F */
    public String f284158F;

    /* renamed from: G */
    public String f284159G;

    /* renamed from: a */
    public String f284160a;

    /* renamed from: b */
    public String f284161b;

    /* renamed from: c */
    public String f284162c;

    /* renamed from: d */
    public String f284163d;

    /* renamed from: e */
    public int f284164e;

    /* renamed from: f */
    public int f284165f;

    /* renamed from: g */
    public int f284166g;

    /* renamed from: h */
    public int f284167h;

    /* renamed from: i */
    public String f284168i;

    /* renamed from: j */
    public long f284169j;

    /* renamed from: k */
    public String f284170k = "";

    /* renamed from: l */
    public String f284171l = "";

    /* renamed from: m */
    public String f284172m;

    /* renamed from: n */
    public String f284173n;

    /* renamed from: o */
    public String f284174o;

    /* renamed from: p */
    public String f284175p;

    /* renamed from: q */
    public String f284176q;

    /* renamed from: r */
    public String f284177r;

    /* renamed from: s */
    public String f284178s;

    /* renamed from: t */
    public boolean f284179t = true;

    /* renamed from: u */
    public int f284180u;

    /* renamed from: v */
    public int f284181v;

    /* renamed from: w */
    public long f284182w;

    /* renamed from: x */
    public int f284183x;

    /* renamed from: y */
    public int f284184y;

    /* renamed from: z */
    public String f284185z;

    /* renamed from: a */
    public static C96985s2 m124654a(String str, String str2, String str3) {
        Log.m105918d("MicroMsg.emoji.EmojiMsgInfo", "parserEmojiXml " + str2);
        return m124655b(XmlParser.parseXml(str2, "msg", (String) null), str, str2, str3);
    }

    /* renamed from: b */
    public static C96985s2 m124655b(Map<String, String> map, String str, String str2, String str3) {
        Map<String, String> map2 = map;
        Object obj = ".msg.emoji.$attachedtext";
        Object obj2 = ".msg.emoji.$activityid";
        Object obj3 = ".msg.emoji.$externmd5";
        Object obj4 = ".msg.emoji.$externurl";
        if (map2 == null) {
            return null;
        }
        String str4 = "MicroMsg.emoji.EmojiMsgInfo";
        C96985s2 s2Var = new C96985s2();
        Object obj5 = ".msg.emoji.$height";
        s2Var.f284170k = str2;
        s2Var.f284160a = str;
        s2Var.f284162c = map2.get(".msg.emoji.$idbuffer");
        s2Var.f284161b = map2.get(".msg.emoji.$fromusername");
        String str5 = map2.get(".msg.emoji.$androidmd5");
        s2Var.f284163d = str5;
        if (str5 == null) {
            s2Var.f284163d = map2.get(".msg.emoji.$md5");
        }
        if (!Util.isNullOrNil(s2Var.f284163d)) {
            s2Var.f284163d = s2Var.f284163d.toLowerCase();
        }
        try {
            s2Var.f284164e = Integer.valueOf(map2.get(".msg.emoji.$type")).intValue();
            if (map2.get(".msg.emoji.$androidlen") != null) {
                s2Var.f284165f = Integer.valueOf(map2.get(".msg.emoji.$androidlen")).intValue();
            } else if (map2.get(".msg.emoji.$len") != null) {
                s2Var.f284165f = Integer.valueOf(map2.get(".msg.emoji.$len")).intValue();
            }
            if (map2.get(".msg.gameext.$type") != null) {
                s2Var.f284166g = Integer.valueOf(map2.get(".msg.gameext.$type")).intValue();
            }
            if (map2.get(".msg.gameext.$content") != null) {
                s2Var.f284167h = Integer.valueOf(map2.get(".msg.gameext.$content")).intValue();
            }
            if (map2.get(".msg.emoji.$productid") != null) {
                s2Var.f284168i = map2.get(".msg.emoji.$productid");
            }
            if (map2.get(".msg.emoji.$cdnurl") != null) {
                s2Var.f284172m = map2.get(".msg.emoji.$cdnurl");
            }
            if (map2.get(".msg.emoji.$tpurl") != null) {
                s2Var.f284185z = map2.get(".msg.emoji.$tpurl");
            }
            if (map2.get(".msg.emoji.$tpauthkey") != null) {
                s2Var.f284153A = map2.get(".msg.emoji.$tpauthkey");
            }
            if (map2.get(".msg.emoji.$designerid") != null) {
                s2Var.f284173n = map2.get(".msg.emoji.$designerid");
            }
            if (map2.get(".msg.emoji.$thumburl") != null) {
                s2Var.f284174o = map2.get(".msg.emoji.$thumburl");
            }
            if (map2.get(".msg.emoji.$encrypturl") != null) {
                s2Var.f284175p = map2.get(".msg.emoji.$encrypturl");
            }
            if (map2.get(".msg.emoji.$aeskey") != null) {
                s2Var.f284176q = map2.get(".msg.emoji.$aeskey");
            }
            if (map2.get(".msg.emoji.$width") != null) {
                s2Var.f284183x = Integer.valueOf(map2.get(".msg.emoji.$width")).intValue();
            }
            Object obj6 = obj5;
            if (map2.get(obj6) != null) {
                s2Var.f284184y = Integer.valueOf(map2.get(obj6)).intValue();
            }
            Object obj7 = obj4;
            if (map2.get(obj7) != null) {
                s2Var.f284177r = map2.get(obj7);
            }
            Object obj8 = obj3;
            if (map2.get(obj8) != null) {
                s2Var.f284178s = map2.get(obj8);
            }
            Object obj9 = obj2;
            if (map2.get(obj9) != null) {
                s2Var.f284154B = map2.get(obj9);
            }
            Object obj10 = obj;
            if (map2.get(obj10) != null) {
                s2Var.f284156D = map2.get(obj10);
            }
            if (map2.get(".msg.emoji.$attachedtextcolor") != null) {
                s2Var.f284158F = map2.get(".msg.emoji.$attachedtextcolor");
            }
            if (map2.get(".msg.emoji.$lensid") != null) {
                s2Var.f284157E = map2.get(".msg.emoji.$lensid");
            }
            if (map2.get(".msg.emoji.$linkid") != null) {
                s2Var.f284155C = map2.get(".msg.emoji.$linkid");
            }
            if (map2.get(".msg.emoji.$desc") != null) {
                s2Var.f284159G = map2.get(".msg.emoji.$desc");
            }
            if (!Util.isNullOrNil(str3)) {
                s2Var.f284171l = str3;
            }
            Log.m105919d(str4, "parserEmojiXml id:%s  md5:%s  type:%d  len:%d  gameType:%d  gameContent:%d  productId:%s  cdnUrl:%s tpUrl:%s designerid:%s thumburl:%s encryptrul:%s width:%d height:%d externUrl:%s externMd5:%s", s2Var.f284162c, s2Var.f284163d, Integer.valueOf(s2Var.f284164e), Integer.valueOf(s2Var.f284165f), Integer.valueOf(s2Var.f284166g), Integer.valueOf(s2Var.f284167h), s2Var.f284168i, s2Var.f284172m, s2Var.f284185z, s2Var.f284173n, s2Var.f284174o, s2Var.f284175p, Integer.valueOf(s2Var.f284183x), Integer.valueOf(s2Var.f284184y), s2Var.f284177r, s2Var.f284178s);
            return s2Var;
        } catch (Exception e) {
            Log.m105921e(str4, "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }
}
