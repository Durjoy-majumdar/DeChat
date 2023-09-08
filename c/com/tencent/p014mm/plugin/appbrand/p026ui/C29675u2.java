package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.os.Looper;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.service.AppBrandUIFinishEvent;
import fy3.C32226l;
import kotlin.Metadata;
import x20.C15618a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.u2 */
public final class C29675u2 {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.ui.u2$a */
    public static final class C29676a<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C29676a<InputType, ResultType> f80632d = new C29676a<>();

        public void invoke(Object obj, C1256g gVar) {
            String str;
            IPCString iPCString = (IPCString) obj;
            if (!(iPCString == null || (str = iPCString.f10315d) == null)) {
                AppBrandUIFinishEvent appBrandUIFinishEvent = new AppBrandUIFinishEvent();
                appBrandUIFinishEvent.f80565d.f80566a = str;
                appBrandUIFinishEvent.asyncPublish(Looper.getMainLooper());
            }
            if (gVar != null) {
                C15618a.m14625a(gVar);
            }
        }
    }

    /* renamed from: a */
    public static final void m38852a(String str, String str2) {
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                C28947a.m38500a(str, new IPCString(str2), C29676a.f80632d, (C32226l) null);
            }
        }
    }
}
