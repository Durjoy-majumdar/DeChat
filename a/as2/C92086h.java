package as2;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import java.util.HashMap;
import java.util.LinkedList;
import p823sg.C90193h;
import sf0.C48374j0;
import te3.C101808lv2;
import te3.C51101rf2;
import te3.h84;
import te3.j74;

/* renamed from: as2.h */
public class C92086h {

    /* renamed from: a */
    public static final ThreadLocal<HashMap<String, Long>> f263636a = new ThreadLocal<>();

    /* renamed from: a */
    public static boolean m115754a(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        boolean b = m115755b(snsInfo, C94897n1.m120367e(snsInfo));
        SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        return b;
    }

    /* renamed from: b */
    public static boolean m115755b(SnsInfo snsInfo, SnsObject snsObject) {
        SnsMethodCalculate.markStartTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return true;
        }
        C101808lv2 postInfo = snsInfo.getPostInfo();
        if (snsInfo.getTypeFlag() != 21) {
            SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return true;
        } else if (postInfo.f298730D == 1) {
            SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return true;
        } else if (C75592q0.m90789s().equals(snsInfo.getUserName())) {
            SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return true;
        } else {
            h84 h84 = snsObject.SnsRedEnvelops;
            if (h84 != null) {
                LinkedList<j74> linkedList = h84.f134505e;
                if (linkedList == null || linkedList.size() == 0) {
                    SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                    return false;
                }
                String s = C75592q0.m90789s();
                for (j74 j74 : linkedList) {
                    if (s.equals(j74.f135912d)) {
                        SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                        return true;
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m115756c(String str) {
        SnsMethodCalculate.markStartTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
        boolean b = m115755b(DN, C94897n1.m120367e(DN));
        SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        return b;
    }

    /* renamed from: d */
    public static int m115757d(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        SnsMethodCalculate.markStartTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        int i = 0;
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        } else {
            SnsObject e = C94897n1.m120367e(snsInfo);
            if (e == null) {
                SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            } else {
                h84 h84 = e.SnsRedEnvelops;
                if (h84 == null || h84.f134505e.size() == 0) {
                    SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                } else {
                    i = h84.f134505e.size();
                    SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        return i;
    }

    /* renamed from: e */
    public static long m115758e(SnsInfo snsInfo, SnsObject snsObject) {
        SnsMethodCalculate.markStartTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        long j = 0;
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return 0;
        }
        if (snsObject == null) {
            snsObject = C94897n1.m120367e(snsInfo);
        }
        if (snsObject == null) {
            SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return 0;
        }
        h84 h84 = snsObject.SnsRedEnvelops;
        if (h84 == null) {
            SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return 0;
        }
        LinkedList<j74> linkedList = h84.f134505e;
        if (linkedList == null) {
            SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return 0;
        }
        String str = snsInfo.contentByteMd5;
        if (Util.isNullOrNil(str)) {
            str = C90193h.m112878f(snsInfo.field_content) + C90193h.m112878f(snsInfo.field_attrBuf);
        }
        HashMap hashMap = f263636a.get();
        if (hashMap == null || !hashMap.containsKey(str)) {
            for (j74 next : linkedList) {
                C51101rf2 rf22 = new C51101rf2();
                try {
                    rf22.parseFrom(C48374j0.m53715d(next.f135914f));
                } catch (Exception e) {
                    Log.m105920e("MicrMsg.SnsLuckyUtil", e.getMessage() + "hbBuffer is error");
                }
                j += rf22.f140881d;
            }
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(str, Long.valueOf(j));
            f263636a.set(hashMap);
            SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return j;
        }
        long longValue = ((Long) hashMap.get(str)).longValue();
        SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        return longValue;
    }
}
