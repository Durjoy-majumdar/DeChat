package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.app.ActivityManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.e0 */
public final class C40708e0 extends C87413o implements C32226l<ActivityManager.RunningAppProcessInfo, Boolean> {

    /* renamed from: d */
    public static final C40708e0 f109355d = new C40708e0();

    public C40708e0() {
        super(1);
    }

    public Object invoke(Object obj) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        C87412m.m108594g(runningAppProcessInfo, LocaleUtil.ITALIAN);
        String str = runningAppProcessInfo.processName;
        C40789z zVar = C40789z.f109640a;
        return Boolean.valueOf(C87412m.m108589b(str, (String) ((C36570n) C40789z.f109642c).getValue()));
    }
}
