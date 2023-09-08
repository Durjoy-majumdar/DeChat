package pn1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import f62.C31922b1;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import ht1.C60152b4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import ob0.C35136m;
import pe3.C89349b;
import rx3.C13604l;
import sx3.C110818d0;
import te3.C51978xi1;
import te3.C64341ei1;
import te3.C64520lb3;
import te3.C64586nn1;
import te3.C64788vx2;
import te3.C64858yi1;
import te3.a45;

/* renamed from: pn1.g */
public final class C62409g implements C31922b1 {
    /* renamed from: X5 */
    public C35136m.C35139b mo10269X5(String str, Map<String, String> map, C35136m.C35137a aVar) {
        Map<String, String> map2 = map;
        C87412m.m108594g(map2, "values");
        C87412m.m108594g(aVar, "p2");
        if (!C87412m.m108589b(str, "FinderPromotion")) {
            return null;
        }
        Log.m105924i("Finder.FinderPromotionConsumer", "[FinderPromotionConsumer]");
        int safeParseInt = Util.safeParseInt(map2.get(".sysmsg.msg.msg_type"));
        Class cls = FinderCommonFeatureService.class;
        String str2 = "";
        if (safeParseInt == 1) {
            int safeParseInt2 = Util.safeParseInt(map2.get(".sysmsg.msg.msg_action"));
            Log.m105924i("Finder.FinderPromotionConsumer", "[dealWithRedPackFinder] msgAction:" + safeParseInt2);
            if (safeParseInt2 == 1) {
                C64341ei1 q = mo87459q(map2);
                ArrayList<String> d = mo87458d(q, new int[]{2, 3});
                FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
                C51978xi1 xi12 = new C51978xi1();
                xi12.f144673h = String.valueOf(C31543z5.m39453c());
                xi12.f144669d = 0;
                xi12.f144670e = 1015;
                C64858yi1 yi12 = new C64858yi1();
                yi12.f186556q = 1;
                C64788vx2 vx22 = q.f182970j;
                yi12.f186557r = new C89349b(vx22 != null ? vx22.toByteArray() : null);
                xi12.f144671f = new C89349b(yi12.toByteArray());
                xi12.f144675j = q.f182966f;
                int e = q.f182967g - C31543z5.m39455e();
                if (e < 0) {
                    e = 0;
                }
                xi12.f144674i = e;
                C64586nn1 nn12 = new C64586nn1();
                nn12.f184502d = 3;
                String str3 = (String) C110818d0.m150917O(d, 0);
                if (str3 == null) {
                    str3 = str2;
                }
                nn12.f184504f = str3;
                nn12.f184506h = 1;
                nn12.f184507i = "ProfileEntrance";
                xi12.f144672g.add(nn12);
                C64586nn1 nn13 = new C64586nn1();
                nn13.f184502d = 20;
                String str4 = (String) C110818d0.m150917O(d, 1);
                if (str4 != null) {
                    str2 = str4;
                }
                nn13.f184504f = str2;
                nn13.f184506h = 1;
                nn13.f184507i = "FinderProfileBanner";
                nn13.f184508j = "ProfileEntrance";
                xi12.f144672g.add(nn13);
                C60152b4.C8759a.m8561a(Nx0, xi12, "checkFinderRedPackRedDot", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
                Log.m105924i("Finder.FinderPromotionConsumer", "[dealWithRedPackFinder] starttime" + xi12.f144675j + ", endtime" + q.f182967g + ", title1:" + nn12.f184504f + " ,title2:" + nn13.f184504f + ", expire_time" + xi12.f144674i);
            } else if (safeParseInt2 == 2) {
                C60152b4.C8759a.m8562b(((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0(), 1015, (String) null, 2, (Object) null);
            }
        } else if (safeParseInt == 2) {
            int safeParseInt3 = Util.safeParseInt(map2.get(".sysmsg.msg.msg_action"));
            Log.m105924i("Finder.FinderPromotionConsumer", "[dealWithRedPackWx] msgAction:" + safeParseInt3);
            if (safeParseInt3 == 1) {
                C64341ei1 q2 = mo87459q(map2);
                ArrayList<String> d2 = mo87458d(q2, new int[]{1});
                FinderRedDotManager Nx02 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
                C51978xi1 xi13 = new C51978xi1();
                xi13.f144673h = String.valueOf(C31543z5.m39453c());
                xi13.f144669d = q2.f182964d;
                xi13.f144670e = 1016;
                C64858yi1 yi13 = new C64858yi1();
                yi13.f186556q = 1;
                C64788vx2 vx23 = q2.f182970j;
                yi13.f186557r = new C89349b(vx23 != null ? vx23.toByteArray() : null);
                xi13.f144671f = new C89349b(yi13.toByteArray());
                xi13.f144675j = q2.f182966f;
                int e2 = q2.f182967g - C31543z5.m39455e();
                if (e2 < 0) {
                    e2 = 0;
                }
                xi13.f144674i = e2;
                C64586nn1 nn14 = new C64586nn1();
                nn14.f184502d = 20;
                String str5 = (String) C110818d0.m150917O(d2, 0);
                if (str5 != null) {
                    str2 = str5;
                }
                nn14.f184504f = str2;
                nn14.f184506h = 1;
                nn14.f184507i = "CreateFinderEntrance";
                xi13.f144672g.add(nn14);
                C60152b4.C8759a.m8561a(Nx02, xi13, "checkFinderRedPackRedDot", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
                Log.m105924i("Finder.FinderPromotionConsumer", "[dealWithRedPackFinder] starttime" + xi13.f144675j + ", endtime" + q2.f182967g + ", title:" + nn14.f184504f + ", expire_time" + xi13.f144674i);
            } else if (safeParseInt3 == 2) {
                C60152b4.C8759a.m8562b(((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0(), 1016, (String) null, 2, (Object) null);
            }
        }
        return null;
    }

    /* renamed from: d */
    public final ArrayList<String> mo87458d(C64341ei1 ei12, int[] iArr) {
        String str;
        HashMap hashMap = new HashMap();
        LinkedList<C64520lb3> linkedList = ei12.f182971n;
        C87412m.m108593f(linkedList, "promotion.path_infos");
        for (C64520lb3 lb32 : linkedList) {
            Integer valueOf = Integer.valueOf(lb32.f184070d);
            a45 a45 = lb32.f184071e;
            if (a45 == null) {
                a45 = new a45();
            }
            hashMap.put(valueOf, a45);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int valueOf2 : iArr) {
            a45 a452 = (a45) hashMap.get(Integer.valueOf(valueOf2));
            if (a452 != null) {
                str = LocaleUtil.isSimplifiedChineseAppLang() ? a452.f182027d : LocaleUtil.isTraditionalChineseAppLang() ? a452.f182028e : !LocaleUtil.isChineseAppLang() ? a452.f182029f : a452.f182027d;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            str = "";
            arrayList.add(str);
        }
        return arrayList;
    }

    /* renamed from: q */
    public final C64341ei1 mo87459q(Map<String, String> map) {
        C64341ei1 ei12 = new C64341ei1();
        ei12.f182964d = Util.safeParseInt(map.get(".sysmsg.msg.priority"));
        ei12.f182965e = Util.safeParseInt(map.get(".sysmsg.msg.msg_action"));
        ei12.f182966f = Util.safeParseInt(map.get(".sysmsg.msg.start_time"));
        ei12.f182967g = Util.safeParseInt(map.get(".sysmsg.msg.end_time"));
        ei12.f182968h = Util.safeParseInt(map.get(".sysmsg.msg.msg_type"));
        ei12.f182969i = Util.safeParseInt(map.get(".sysmsg.msg.msg_ext"));
        C64788vx2 vx22 = new C64788vx2();
        vx22.f186009d = map.get(".sysmsg.msg.miniapp_msg.miniapp_name");
        vx22.f186010e = map.get(".sysmsg.msg.miniapp_msg.miniapp_path");
        vx22.f186011f = Util.safeParseInt(map.get(".sysmsg.msg.miniapp_msg.miniapp_scene"));
        ei12.f182970j = vx22;
        LinkedList<C64520lb3> linkedList = new LinkedList<>();
        String str = ".sysmsg.msg.path_info";
        int i = 1;
        while (map.containsKey(str)) {
            C8479f0 f0Var = new C8479f0();
            T a45 = new a45();
            a45.f182027d = map.get(str + ".wording.zh_cn");
            a45.f182028e = map.get(str + ".wording.zh_tw");
            a45.f182029f = map.get(str + ".wording.en");
            f0Var.f27484d = a45;
            C64520lb3 lb32 = new C64520lb3();
            lb32.f184071e = (a45) f0Var.f27484d;
            lb32.f184070d = Util.safeParseInt(map.get(str + ".msg_position"));
            linkedList.add(lb32);
            str = ".sysmsg.msg.path_info" + i;
            i++;
        }
        ei12.f182971n = linkedList;
        return ei12;
    }
}
