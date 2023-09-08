package com.tencent.p014mm.plugin.multitalk.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.multitalk.model.i0 */
public class C105806i0 {

    /* renamed from: com.tencent.mm.plugin.multitalk.model.i0$a */
    public enum C105807a {
        WIFI,
        _4G,
        _3GOr_2G,
        None
    }

    /* renamed from: a */
    public static long m142148a() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MULTITALK_DISABLE_TIME_INT_SYNC;
        int intValue = ((Integer) i.mo119685f(aVar, -1)).intValue();
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_MULTITALK_DISABLE_TIMESTAMP_LONG_SYNC;
        long longValue = ((Long) i2.mo119685f(aVar2, -1L)).longValue();
        C85801v1 i3 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_MULTITALK_CLEAR_DISABLE_TIMESTAMP_BOOLEAN_SYNC;
        boolean g = i3.mo119686g(aVar3, true);
        Log.m105925i("MicroMsg.MultiTalkUtil", "checkMultiTalkAvailable, clear:%s, disableTime: %s, disableTimestamp: %s", Boolean.valueOf(g), Integer.valueOf(intValue), Long.valueOf(longValue));
        if (g || intValue <= 0 || longValue <= 0) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, -1);
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, -1L);
            C86709a0.m107535s().mo121142i().mo119677K(aVar3, Boolean.FALSE);
            return 0;
        }
        long milliSecondsToNow = Util.milliSecondsToNow(longValue);
        long j = ((long) intValue) * 1000;
        if (milliSecondsToNow <= j) {
            return j - milliSecondsToNow;
        }
        C86709a0.m107535s().mo121142i().mo119677K(aVar, -1);
        C86709a0.m107535s().mo121142i().mo119677K(aVar2, -1L);
        return 0;
    }

    /* renamed from: b */
    public static String m142149b(MultiTalkGroup multiTalkGroup) {
        if (multiTalkGroup == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        List<MultiTalkGroupMember> list = multiTalkGroup.f320047i;
        stringBuffer.append("->[usernamelist]");
        if (list != null) {
            for (MultiTalkGroupMember next : list) {
                stringBuffer.append(next.f320048d + "|");
                stringBuffer.append(next.f320050f + ", ");
            }
        }
        stringBuffer.append(" ->createname:" + multiTalkGroup.f320046h);
        stringBuffer.append(" ->talkgroupId:" + multiTalkGroup.f320042d);
        stringBuffer.append(" ->wxGroupId:" + multiTalkGroup.f320044f);
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static C105807a m142150c() {
        return NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? C105807a.WIFI : NetStatusUtil.is4G(MMApplicationContext.getContext()) ? C105807a._4G : (NetStatusUtil.is3G(MMApplicationContext.getContext()) || NetStatusUtil.is2G(MMApplicationContext.getContext())) ? C105807a._3GOr_2G : C105807a.None;
    }

    /* renamed from: d */
    public static String m142151d(MultiTalkGroup multiTalkGroup) {
        String str = null;
        for (int i = 0; i < multiTalkGroup.f320047i.size(); i++) {
            if (multiTalkGroup.f320047i.get(i).f320048d.equals(C75592q0.m90789s())) {
                str = multiTalkGroup.f320047i.get(i).f320049e;
            }
        }
        return str;
    }

    /* renamed from: e */
    public static String m142152e(MultiTalkGroup multiTalkGroup) {
        if (multiTalkGroup == null) {
            return "";
        }
        String str = multiTalkGroup.f320042d;
        if (Util.isNullOrNil(str)) {
            str = multiTalkGroup.f320043e;
        }
        return Util.nullAs(str, "");
    }

    /* renamed from: f */
    public static boolean m142153f(MultiTalkGroup multiTalkGroup) {
        if (multiTalkGroup == null) {
            return false;
        }
        boolean z = false;
        boolean z2 = false;
        for (MultiTalkGroupMember next : multiTalkGroup.f320047i) {
            if (next.f320048d.equals(C75592q0.m90789s())) {
                if (next.f320050f != 10) {
                    continue;
                } else if (z2) {
                    return true;
                } else {
                    z = true;
                }
            } else if (next.f320050f != 10) {
                continue;
            } else if (z) {
                return true;
            } else {
                z2 = true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m142154g(int i) {
        return i == 2 || i == 3;
    }
}
