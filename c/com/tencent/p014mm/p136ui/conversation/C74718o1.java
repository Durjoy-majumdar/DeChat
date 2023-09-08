package com.tencent.p014mm.p136ui.conversation;

import gy3.C87412m;
import java.util.List;
import org.json.JSONObject;
import sx3.C64197v;

/* renamed from: com.tencent.mm.ui.conversation.o1 */
public final class C74718o1 implements C74710m0 {

    /* renamed from: a */
    public static final C74718o1 f219681a = new C74718o1();

    /* renamed from: b */
    public static final List<C74710m0> f219682b = C64197v.m75537f(C85846n1.f250046a, C85848p1.f250055a);

    /* renamed from: a */
    public boolean mo103866a(C74708l1 l1Var, JSONObject jSONObject) {
        C87412m.m108594g(l1Var, "context");
        for (C74710m0 a : f219682b) {
            if (a.mo103866a(l1Var, jSONObject)) {
                return true;
            }
        }
        return false;
    }
}
