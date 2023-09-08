package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import te3.mg4;
import te3.pg4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.t */
public class C29763t {

    /* renamed from: a */
    public static mg4 f80772a;

    /* renamed from: a */
    public static mg4 m38870a() {
        mg4 mg4 = f80772a;
        if (mg4 != null) {
            return mg4;
        }
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_BIZ_TIME_LINE_OFTEN_READ_STRING_SYNC, "");
        if (Util.isNullOrNil(str)) {
            return null;
        }
        mg4 mg42 = new mg4();
        try {
            mg42.parseFrom(Base64.decode(str, 0));
            f80772a = mg42;
            return mg42;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.BizTimeLineOftenReadHelper", "getOftenRead exp: %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m38871b(String str) {
        mg4 a;
        if (Util.isNullOrNil(str) || (a = m38870a()) == null) {
            return false;
        }
        LinkedList<pg4> linkedList = a.f184323d;
        if (Util.isNullOrNil((List) linkedList)) {
            return false;
        }
        Iterator<pg4> it = linkedList.iterator();
        while (it.hasNext()) {
            pg4 next = it.next();
            if (next != null && str.equals(next.f354229d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m38872c(mg4 mg4) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_BIZ_TIME_LINE_OFTEN_READ_STRING_SYNC;
        f80772a = mg4;
        try {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Base64.encodeToString(mg4.toByteArray(), 0));
        } catch (Exception e) {
            Log.m105921e("MicroMsg.BizTimeLineOftenReadHelper", "resetOftenRead exp: %s", e.getMessage());
            C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
        }
    }
}
