package os2;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: os2.v */
public class C35299v {
    /* renamed from: a */
    public static void m40633a(long j) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SNS_MEDIA_COLLAPSE_STRING;
        SnsMethodCalculate.markStartTimeMs("removeCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        String[] split = ((String) C86709a0.m107535s().mo121142i().mo119685f(aVar, "")).split("&");
        boolean z = true;
        boolean z2 = split.length >= 1 && Util.getBoolean(split[0], false);
        if (split.length < 2 || !Util.getBoolean(split[1], false)) {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 2; i < split.length; i++) {
            long j2 = Util.getLong(split[i], 0);
            if (j2 != 0) {
                arrayList.add(Long.valueOf(j2));
            }
        }
        arrayList.remove(Long.valueOf(j));
        Collections.reverse(arrayList);
        m40635c(arrayList.size() > 0 ? (Long) arrayList.get(0) : null);
        StringBuilder sb = new StringBuilder();
        sb.append(z2);
        sb.append("&");
        sb.append(z);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sb.append("&");
            sb.append(arrayList.get(i2));
        }
        C86709a0.m107535s().mo121142i().mo119677K(aVar, sb.toString());
        SnsMethodCalculate.markEndTimeMs("removeCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
    }

    /* renamed from: b */
    public static boolean m40634b(long j) {
        boolean z;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SNS_MEDIA_COLLAPSE_STRING;
        SnsMethodCalculate.markStartTimeMs("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        SnsInfo SE = C94866e1.Yx0().mo139806SE(j);
        if (SE == null) {
            SnsMethodCalculate.markEndTimeMs("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
            return false;
        }
        String[] split = ((String) C86709a0.m107535s().mo121142i().mo119685f(aVar, "")).split("&");
        boolean z2 = split.length >= 1 && Util.getBoolean(split[0], false);
        int i = 2;
        boolean z3 = split.length >= 2 && Util.getBoolean(split[1], false);
        ArrayList arrayList = new ArrayList();
        while (i < split.length) {
            boolean z4 = z3;
            long j2 = Util.getLong(split[i], 0);
            if (j2 != 0) {
                arrayList.add(Long.valueOf(j2));
            }
            i++;
            z3 = z4;
        }
        boolean z5 = z3;
        if (SE.getTimeLine().ContentObj.f298424e == 15) {
            if (!z2) {
                z = z5;
                z2 = true;
            } else {
                SnsMethodCalculate.markEndTimeMs("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
                return false;
            }
        } else if (SE.getTimeLine().ContentObj.f298424e != 1) {
            SnsMethodCalculate.markEndTimeMs("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
            return false;
        } else if (!z5) {
            z = true;
        } else {
            SnsMethodCalculate.markEndTimeMs("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
            return false;
        }
        if (!arrayList.contains(Long.valueOf(j))) {
            arrayList.add(Long.valueOf(j));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z2);
        sb.append("&");
        sb.append(z);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sb.append("&");
            sb.append(arrayList.get(i2));
        }
        C86709a0.m107535s().mo121142i().mo119677K(aVar, sb.toString());
        m40635c(Long.valueOf(j));
        SnsMethodCalculate.markEndTimeMs("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        return true;
    }

    /* renamed from: c */
    public static void m40635c(Long l) {
        SnsMethodCalculate.markStartTimeMs("updateConfigStg", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SNS_MEDIA_COLLAPSE_SNS_ID_LONG, l);
        SnsMethodCalculate.markEndTimeMs("updateConfigStg", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
    }
}
