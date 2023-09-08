package hh3;

import bh3.C113177k;
import com.tencent.p014mm.autogen.mmdata.rpt.SystemAutorizationPopupWindowStruct;
import di3.C86312j;
import gy3.C87412m;
import p156gj.C87203t;

/* renamed from: hh3.f */
public final class C117098f {

    /* renamed from: a */
    public static final C117098f f350877a = new C117098f();

    /* renamed from: b */
    public static /* synthetic */ void m165127b(C117098f fVar, long j, Long l, Long l2, Boolean bool, int i, Object obj) {
        Long l3 = (i & 2) != 0 ? -1L : l;
        Long l4 = (i & 4) != 0 ? -1L : l2;
        if ((i & 8) != 0) {
            bool = Boolean.FALSE;
        }
        fVar.mo181044a(j, l3, l4, bool);
    }

    /* renamed from: a */
    public final void mo181044a(long j, Long l, Long l2, Boolean bool) {
        SystemAutorizationPopupWindowStruct systemAutorizationPopupWindowStruct = new SystemAutorizationPopupWindowStruct();
        systemAutorizationPopupWindowStruct.f343836d = j;
        if (l != null) {
            long longValue = l.longValue();
            if (longValue != -1) {
                systemAutorizationPopupWindowStruct.f343837e = longValue;
            }
        }
        if (l2 != null) {
            long longValue2 = l2.longValue();
            if (longValue2 != -1) {
                systemAutorizationPopupWindowStruct.f343838f = longValue2;
            }
        }
        systemAutorizationPopupWindowStruct.f343839g = systemAutorizationPopupWindowStruct.mo86045b("DeviceID", C87203t.m108266b(), true);
        if (C87412m.m108589b(bool, Boolean.TRUE)) {
            systemAutorizationPopupWindowStruct.f343840h = systemAutorizationPopupWindowStruct.mo86045b("CurrentPrivacyFullStatus", ((C113177k) C86312j.m106911c(C113177k.class)).y60(), true);
        }
        systemAutorizationPopupWindowStruct.mo86054n();
    }
}
