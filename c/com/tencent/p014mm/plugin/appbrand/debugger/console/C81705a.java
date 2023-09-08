package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.os.Parcelable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p385u2.C111105a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.a */
public final class C81705a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Parcelable[] f239810d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81705a(Parcelable[] parcelableArr) {
        super(0);
        this.f239810d = parcelableArr;
    }

    public Object invoke() {
        for (Parcelable parcelable : this.f239810d) {
            ConsoleDebugLogImpl.LogInfo logInfo = parcelable instanceof ConsoleDebugLogImpl.LogInfo ? (ConsoleDebugLogImpl.LogInfo) parcelable : null;
            if (logInfo != null) {
                int i = logInfo.f239800d;
                if (i == 2) {
                    boolean z = C81725x.f239845a;
                    String str = logInfo.f239801e;
                    C87412m.m108594g(str, "msg");
                    if (C81725x.f239845a) {
                        C81718u a = C81725x.f239847c.mo114082a();
                        a.getClass();
                        a.mo114084a("[V]" + str + 10, C111105a.m151500b(a.getContext(), C0966R.color.FG_2));
                    }
                } else if (i == 3) {
                    boolean z2 = C81725x.f239845a;
                    String str2 = logInfo.f239801e;
                    C87412m.m108594g(str2, "msg");
                    if (C81725x.f239845a) {
                        C81718u a2 = C81725x.f239847c.mo114082a();
                        a2.getClass();
                        a2.mo114084a("[D]" + str2 + 10, C111105a.m151500b(a2.getContext(), C0966R.color.FG_0));
                    }
                } else if (i == 4) {
                    boolean z3 = C81725x.f239845a;
                    String str3 = logInfo.f239801e;
                    C87412m.m108594g(str3, "msg");
                    if (C81725x.f239845a) {
                        C81718u a3 = C81725x.f239847c.mo114082a();
                        a3.getClass();
                        a3.mo114084a("[I]" + str3 + 10, C111105a.m151500b(a3.getContext(), C0966R.color.FG_0));
                    }
                } else if (i == 5) {
                    boolean z4 = C81725x.f239845a;
                    String str4 = logInfo.f239801e;
                    C87412m.m108594g(str4, "msg");
                    if (C81725x.f239845a) {
                        C81718u a4 = C81725x.f239847c.mo114082a();
                        a4.getClass();
                        a4.mo114084a("[W]" + str4 + 10, C111105a.m151500b(a4.getContext(), C0966R.color.Orange_80_CARE));
                    }
                } else if (i == 6) {
                    boolean z5 = C81725x.f239845a;
                    String str5 = logInfo.f239801e;
                    C87412m.m108594g(str5, "msg");
                    if (C81725x.f239845a) {
                        C81718u a5 = C81725x.f239847c.mo114082a();
                        a5.getClass();
                        a5.mo114084a("[E]" + str5 + 10, C111105a.m151500b(a5.getContext(), C0966R.color.Red_80_CARE));
                    }
                }
            }
        }
        return C13598b0.f38549a;
    }
}
