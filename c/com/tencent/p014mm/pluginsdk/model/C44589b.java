package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32228q;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.pluginsdk.model.b */
public final class C44589b extends C87413o implements C32228q<String, String, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C44591c f120894d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44589b(C44591c cVar) {
        super(3);
        this.f120894d = cVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        if (Util.isNullOrNil((String) obj2)) {
            this.f120894d.stopCheck();
            if (booleanValue) {
                int i = this.f120894d.f120901a;
                if (i == 4) {
                    C19428d.f54856a.mo25155H(13);
                } else if (i == 8) {
                    C19428d.f54856a.mo25155H(14);
                } else if (i == 9) {
                    C19428d.f54856a.mo25155H(15);
                }
            }
        }
        return C13598b0.f38549a;
    }
}
