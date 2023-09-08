package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.d */
public final class C6468d extends C87413o implements C32226l<HashMap<String, Object>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ DeleteMsgParams f23527d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<Long> f23528e;

    /* renamed from: f */
    public final /* synthetic */ C8477a0 f23529f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6468d(DeleteMsgParams deleteMsgParams, ArrayList<Long> arrayList, C8477a0 a0Var) {
        super(1);
        this.f23527d = deleteMsgParams;
        this.f23528e = arrayList;
        this.f23529f = a0Var;
    }

    public Object invoke(Object obj) {
        HashMap hashMap = (HashMap) obj;
        C87412m.m108594g(hashMap, "item");
        String str = (String) hashMap.get("sessionId");
        Object obj2 = hashMap.get("localMsgId");
        long safeParseLong = Util.safeParseLong(obj2 instanceof String ? (String) obj2 : null);
        if (!this.f23527d.f23470d.equals(str) || safeParseLong < 0) {
            this.f23529f.f27482d = true;
        } else {
            this.f23528e.add(Long.valueOf(safeParseLong));
        }
        return C13598b0.f38549a;
    }
}
