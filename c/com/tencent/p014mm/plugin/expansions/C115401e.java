package com.tencent.p014mm.plugin.expansions;

import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import java.util.concurrent.Callable;

/* renamed from: com.tencent.mm.plugin.expansions.e */
public class C115401e implements Callable<Void> {

    /* renamed from: d */
    public final /* synthetic */ Boolean f345907d;

    /* renamed from: e */
    public final /* synthetic */ C115402f f345908e;

    public C115401e(C115402f fVar, Boolean bool) {
        this.f345908e = fVar;
        this.f345907d = bool;
    }

    public Object call() {
        this.f345908e.f345909a.mo894a(new IPCBoolean(this.f345907d.booleanValue()));
        return null;
    }
}
