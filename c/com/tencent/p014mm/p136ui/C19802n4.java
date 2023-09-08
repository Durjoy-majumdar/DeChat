package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72992v4;
import di3.C86312j;
import eb0.C31455d0;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import fd0.C75743h;
import ht1.C60200t1;
import ht1.C76243a5;
import java.util.List;
import jr2.C99019x;
import lc3.C10485b;
import nc0.C76850a;
import o03.C21723h;
import os2.C100421x;
import p03.C21912d;
import p167hz.C21032k;
import te3.C64586nn1;
import wc3.C78535a0;

/* renamed from: com.tencent.mm.ui.n4 */
public class C19802n4 {
    /* renamed from: a */
    public static boolean m21508a(MultiProcessMMKV multiProcessMMKV, int i, String str) {
        String str2 = "active" + str;
        boolean z = multiProcessMMKV.getBoolean(str2, false);
        Log.m105925i("MicroMsg.UnreadCountHelper", "countToTab unreadCount %d dynaCfgKey %s activeDisable %b ", Integer.valueOf(i), str, Boolean.valueOf(z));
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b(str, 0);
        if (i == 0) {
            if (!z) {
                multiProcessMMKV.putBoolean(str2, true);
            }
            return b == 1;
        } else if (b != 1) {
            return !z;
        } else {
            if (z) {
                multiProcessMMKV.putBoolean(str2, false);
            }
            return true;
        }
    }

    /* renamed from: b */
    public static int m21509b() {
        int i;
        int i2;
        int i3;
        int i4;
        Class cls = C60200t1.class;
        Class cls2 = C21912d.class;
        boolean z = false;
        if (!C97625j3.m125811a()) {
            Log.m105928w("MicroMsg.UnreadCountHelper", "getFindTabUnreadCount, but mmcore not ready");
            return 0;
        }
        int a = ((C75592q0.m90785o() & 64) == 0 && (C75592q0.m90787q() & 32768) == 0) ? C31455d0.m39412a() + 0 : 0;
        if ((C75592q0.m90785o() & 256) == 0) {
            C72992v4 yx02 = C75743h.yx0();
            i = (yx02 != null ? yx02.mo101222Ow() + 0 : 0) + C78535a0.m94863b().getShakeMessageUnreadCnt();
        } else {
            i = 0;
        }
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("CountToTabConfig");
        if (m21508a(singleMMKV, i, "EnableShakeUnreadCountToTab")) {
            a += i;
        }
        if ((C75592q0.m90785o() & 32768) == 0 && C99019x.m128969a() != null) {
            C100421x xVar = (C100421x) C99019x.m128969a();
            xVar.getClass();
            SnsMethodCalculate.markStartTimeMs("isHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            boolean z2 = xVar.f294192e;
            SnsMethodCalculate.markEndTimeMs("isHoldUnread", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            a = z2 ? 0 : a + ((C100421x) C99019x.m128969a()).mo139896kD();
        }
        C21032k t4 = ((C21912d) C86312j.m106911c(cls2)).mo34966t4();
        if (C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
            Log.m105924i("MicroMsg.UnreadCountHelper", "checkLookVisibility EuropeanUnionCountry");
        } else if (t4 != null && ((C21723h) t4).mo33981A()) {
            int p = ((C21723h) ((C21912d) C86312j.m106911c(cls2)).mo34966t4()).mo34005p();
            if (m21508a(singleMMKV, p, "EnableStoriesUnreadCountToTab")) {
                C21723h hVar = (C21723h) ((C21912d) C86312j.m106911c(cls2)).mo34966t4();
                if (!Util.isNullOrNil((List) hVar.f61500d) && hVar.f61500d.getLast().f64542p == 1) {
                    z = true;
                }
                if (z && p > 0) {
                    a += p;
                }
            }
        }
        if (!((C76243a5) C86312j.m106911c(C76243a5.class)).Vh0()) {
            return a;
        }
        C64586nn1 R5 = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77246R5("Discovery");
        if (R5 == null || (i4 = R5.f184503e) <= 0) {
            C64586nn1 R52 = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77246R5("FinderMentionEntrance");
            i2 = (R52 == null || (i3 = R52.f184503e) <= 0 || a <= 0) ? a : a + i3;
        } else {
            i2 = i4 + a;
        }
        return m21508a(singleMMKV, i2, "EnableFinderUnreadCountToTab") ? i2 : a;
    }
}
