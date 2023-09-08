package com.tencent.matrix.lifecycle.supervisor;

import com.tencent.matrix.lifecycle.C80406g;
import com.tencent.matrix.lifecycle.C80407h;
import fy3.C32227p;
import java.util.Map;

/* renamed from: com.tencent.matrix.lifecycle.supervisor.b */
public final class C80476b implements C80407h, C80406g {

    /* renamed from: d */
    public final /* synthetic */ Map.Entry f235471d;

    /* renamed from: e */
    public final /* synthetic */ C32227p f235472e;

    public C80476b(Map.Entry entry, C32227p pVar) {
        this.f235471d = entry;
        this.f235472e = pVar;
    }

    public void off() {
        this.f235472e.invoke(this.f235471d.getKey(), Boolean.FALSE);
    }

    /* renamed from: on */
    public void mo60742on() {
        this.f235472e.invoke(this.f235471d.getKey(), Boolean.TRUE);
    }

    public boolean serial() {
        return true;
    }
}
