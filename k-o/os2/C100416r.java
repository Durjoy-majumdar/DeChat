package os2;

import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import f40.C86709a0;
import i40.C60247c;
import iu2.C60631e;
import iu2.C98802d;

/* renamed from: os2.r */
public class C100416r {
    /* renamed from: a */
    public static SnsInfo m131408a(String str) {
        SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        if (C100417r0.m131418g(str)) {
            SnsInfo SE = C94866e1.Yx0().mo139806SE(C100417r0.m131425n(str));
            SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
            return SE;
        }
        AdSnsInfo jo = C94866e1.zx0().mo139864jo(C100417r0.m131425n(str));
        if (jo != null) {
            SnsInfo convertToSnsInfo = jo.convertToSnsInfo();
            SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
            return convertToSnsInfo;
        }
        SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        return null;
    }

    /* renamed from: b */
    public static SnsInfo m131409b(String str) {
        SnsMethodCalculate.markStartTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        if (C100417r0.m131418g(str)) {
            SnsInfo LL = C94866e1.Yx0().mo139800LL(C100417r0.m131424m(str));
            SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
            return LL;
        }
        AdSnsInfo qq = C94866e1.zx0().mo139865qq(C100417r0.m131424m(str));
        if (qq != null) {
            SnsInfo convertToSnsInfo = qq.convertToSnsInfo();
            SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
            return convertToSnsInfo;
        }
        SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        return null;
    }

    /* renamed from: c */
    public static boolean m131410c(SnsInfo snsInfo) {
        boolean z;
        C39622i0 a;
        C39622i0 a2;
        Class cls = C98802d.class;
        Class<C60247c> cls2 = C60247c.class;
        Class cls3 = C60631e.class;
        SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        if (snsInfo.isAd()) {
            AdSnsInfo adSnsInfo = snsInfo.getAdSnsInfo();
            z = C94866e1.zx0().replace(adSnsInfo);
            if (z) {
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (cls2.isAssignableFrom(cls3)) {
                        a2 = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls3);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                ((C98802d) ((C60631e) a2).mo85233d3(cls)).mo138174d3(adSnsInfo.localid, StorageEventId.getUPDATE());
            }
        } else {
            z = C94866e1.Yx0().Pq0(snsInfo);
            if (z) {
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (cls2.isAssignableFrom(cls3)) {
                        a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls3);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                ((C98802d) ((C60631e) a).mo85233d3(cls)).mo138178i3(snsInfo.field_snsId, StorageEventId.getUPDATE());
            }
        }
        SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        return z;
    }

    /* renamed from: d */
    public static boolean m131411d(String str, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        if (C100417r0.m131418g(str)) {
            boolean yu02 = C94866e1.Yx0().yu0(C100417r0.m131425n(str), snsInfo);
            SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
            return yu02;
        }
        boolean bD = C94866e1.zx0().mo139863bD(C100417r0.m131425n(str), snsInfo.getAdSnsInfo());
        SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.MergeInfoStorage");
        return bD;
    }
}
