package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.SemiXml;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.Map;
import rx3.C13598b0;
import te3.C22493dh;
import te3.C22495eh;
import te3.C22499hb0;
import te3.C64818wx2;
import te3.re4;

/* renamed from: com.tencent.mm.storage.g1 */
public final class C19611g1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ re4 f55487d;

    /* renamed from: e */
    public final /* synthetic */ Map<String, String> f55488e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19611g1(re4 re4, Map<String, String> map) {
        super(0);
        this.f55487d = re4;
        this.f55488e = map;
    }

    public Object invoke() {
        Object obj;
        String str;
        Object obj2;
        re4 re4 = this.f55487d;
        String str2 = this.f55488e.get(".sysmsg.BizAccountRecommend.Event");
        Object obj3 = "";
        if (str2 == null) {
            str2 = obj3;
        }
        re4.f64522n = str2;
        this.f55487d.f64524p = Util.getInt(this.f55488e.get(".sysmsg.BizAccountRecommend.UseServerTime"), 0);
        re4 re42 = this.f55487d;
        C22499hb0 hb02 = new C22499hb0();
        re4 re43 = this.f55487d;
        Map<String, String> map = this.f55488e;
        hb02.f63902d = re43.f64515d.f64239d;
        LinkedList<C22495eh> linkedList = new LinkedList<>();
        C87412m.m108594g(map, "values");
        int i = 0;
        while (i < 10) {
            StringBuilder sb = new StringBuilder();
            sb.append(".sysmsg.BizAccountRecommend.BizAccount");
            sb.append(i == 0 ? obj3 : Integer.valueOf(i));
            String sb4 = sb.toString();
            if (Util.isNullOrNil(map.get(sb4 + ".UserName"))) {
                break;
            }
            C22495eh ehVar = new C22495eh();
            ehVar.f63794e = map.get(sb4 + ".UserName");
            ehVar.f63795f = map.get(sb4 + ".NickName");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            String str3 = ".RecommendReason";
            sb5.append(str3);
            ehVar.f63796g = map.get(sb5.toString());
            ehVar.f63797h = map.get(sb4 + ".Signature");
            ehVar.f63798i = map.get(sb4 + ".BrandIconUrl");
            ehVar.f63799j = map.get(sb4 + ".AppMsgRecReason");
            ehVar.f63801o = new LinkedList<>();
            int i2 = 0;
            while (i2 < 21) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(sb4);
                sb6.append(".NegativeFeedbackReason");
                sb6.append(i2 == 0 ? obj3 : Integer.valueOf(i2));
                String str4 = map.get(sb6.toString());
                if (Util.isNullOrNil(str4)) {
                    break;
                }
                ehVar.f63801o.add(str4);
                i2++;
            }
            ehVar.f63802p = Util.getInt(map.get(sb4 + ".ShowNegativeFeedbackReason"), 1);
            ehVar.f63800n = new LinkedList<>();
            linkedList.add(ehVar);
            int i3 = 0;
            while (true) {
                if (i3 >= 2) {
                    obj = obj3;
                    break;
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(sb4);
                sb7.append(".AppMsg");
                sb7.append(i3 == 0 ? obj3 : Integer.valueOf(i3));
                String sb8 = sb7.toString();
                StringBuilder sb9 = new StringBuilder();
                sb9.append(sb8);
                obj = obj3;
                sb9.append(".Title");
                if (Util.isNullOrNil(map.get(sb9.toString()))) {
                    break;
                }
                C22493dh dhVar = new C22493dh();
                String str5 = sb4;
                dhVar.f63751e = map.get(sb8 + ".Title");
                dhVar.f63752f = map.get(sb8 + ".Digest");
                dhVar.f63755i = map.get(sb8 + ".ContentUrl");
                dhVar.f63744C = map.get(sb8 + str3);
                dhVar.f63757n = map.get(sb8 + ".CoverImgUrl");
                dhVar.f63758o = map.get(sb8 + ".CoverImgUrl_1_1");
                dhVar.f63759p = map.get(sb8 + ".CoverImgUrl_235_1");
                dhVar.f63760q = Util.getInt(map.get(sb8 + ".ItemShowType"), -1);
                dhVar.f63764u = map.get(sb8 + ".VideoId");
                dhVar.f63765v = Util.getInt(map.get(sb8 + ".VideoWidth"), -1);
                dhVar.f63766w = Util.getInt(map.get(sb8 + ".VideoHeight"), -1);
                dhVar.f63767x = Util.getInt(map.get(sb8 + ".VideoDuration"), -1);
                dhVar.f63768y = Util.getInt(map.get(sb8 + ".CreateTime"), -1);
                dhVar.f63745D = map.get(sb8 + ".VoicePlayUrl");
                dhVar.f63746E = Util.getInt(map.get(sb8 + ".VoiceDuration"), -1);
                dhVar.f63742A = new LinkedList<>();
                int i4 = 0;
                while (true) {
                    if (i4 >= 21) {
                        str = str3;
                        break;
                    }
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(sb8);
                    sb10.append(".NegativeFeedbackReason");
                    if (i4 == 0) {
                        str = str3;
                        obj2 = obj;
                    } else {
                        str = str3;
                        obj2 = Integer.valueOf(i4);
                    }
                    sb10.append(obj2);
                    String str6 = map.get(sb10.toString());
                    if (Util.isNullOrNil(str6)) {
                        break;
                    }
                    dhVar.f63742A.add(str6);
                    i4++;
                    str3 = str;
                }
                dhVar.f63743B = Util.getInt(map.get(sb8 + ".ShowNegativeFeedbackReason"), 1);
                dhVar.f63747F = Util.getInt(map.get(sb8 + ".RecRk"), 0);
                dhVar.f63748G = map.get(sb8 + ".RecInfo");
                dhVar.f63749H = SemiXml.encode(map);
                ehVar.f63800n.add(dhVar);
                i3++;
                obj3 = obj;
                sb4 = str5;
                str3 = str;
            }
            i++;
            obj3 = obj;
        }
        Object obj4 = obj3;
        C19613h1.m21045r(map);
        hb02.f63905g = linkedList;
        String str7 = map.get(".sysmsg.BizAccountRecommend.RecSummary");
        if (str7 == null) {
            str7 = obj4;
        }
        hb02.f63907i = str7;
        String str8 = map.get(".sysmsg.BizAccountRecommend.CardId");
        if (str8 == null) {
            str8 = obj4;
        }
        hb02.f63908j = str8;
        String str9 = map.get(".sysmsg.BizAccountRecommend.ExpType");
        if (str9 == null) {
            str9 = obj4;
        }
        hb02.f63909n = str9;
        hb02.f63906h = C19613h1.m21049v(map.get(".sysmsg.BizAccountRecommend.Flag"));
        re42.f64523o = hb02;
        this.f55487d.f64529u = C19613h1.m21045r(this.f55488e);
        this.f55487d.f64531w = C19613h1.m21046s(this.f55488e);
        re4 re44 = this.f55487d;
        Map<String, String> map2 = this.f55488e;
        C87412m.m108594g(map2, "values");
        C64818wx2 wx22 = new C64818wx2();
        wx22.f186233d = Util.getInt(map2.get(".sysmsg.BizAccountRecommend.ToprightShowMode"), 0);
        wx22.f186234e = Util.getInt(map2.get(".sysmsg.BizAccountRecommend.SubscribeFilterFlag"), 0);
        re44.f64532x = wx22;
        return C13598b0.f38549a;
    }
}
