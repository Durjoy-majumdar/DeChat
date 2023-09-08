package com.tencent.p014mm.accessibility.feature;

import com.tencent.p014mm.accessibility.uitl.AccUtil;
import f40.C86709a0;
import kotlin.Metadata;
import lc3.C10485b;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.feature.AccessibilityService$onAccountInitialized$4 */
public final class AccessibilityService$onAccountInitialized$4 implements Runnable {
    public static final AccessibilityService$onAccountInitialized$4 INSTANCE = new AccessibilityService$onAccountInitialized$4();

    public final void run() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("_AutoAccessibility_WhiteList");
        if (c != null) {
            if (c.length() > 0) {
                AccUtil.INSTANCE.setWhileList(C112550d0.m153785U(c, new String[]{";"}, false, 0, 6, (Object) null));
            }
        }
    }
}
