package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.luggage.sdk.processes.C80250c;
import com.tencent.luggage.sdk.processes.LuggageServiceType;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.task.z */
public class C84344z extends C84273a0 {

    /* renamed from: n */
    public final C84310k[] f246276n;

    public C84344z() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(new C84314n());
        mo116967T(arrayList);
        Object[] array = arrayList.toArray(new C84310k[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f246276n = (C84310k[]) array;
    }

    /* renamed from: L */
    public C84310k mo116948L(LuggageServiceType luggageServiceType) {
        C87412m.m108594g(luggageServiceType, "serviceType");
        if (LuggageServiceType.WASERVICE == luggageServiceType) {
            return null;
        }
        return super.mo116948L(luggageServiceType);
    }

    /* renamed from: U */
    public C84310k[] mo116968U() {
        return this.f246276n;
    }

    /* renamed from: o */
    public C80250c[] mo111400o() {
        return this.f246276n;
    }
}
