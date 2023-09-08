package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import dj1.C45354e1;
import er1.C58728f5;
import fy3.C32230s;
import gy3.C87412m;
import rx3.C13598b0;
import te3.C51372tb1;

/* renamed from: cj1.z */
public final class C39968z implements C45354e1.C45355a {

    /* renamed from: a */
    public final /* synthetic */ C54820t f107139a;

    /* renamed from: b */
    public final /* synthetic */ C32230s<Boolean, Integer, Integer, String, C51372tb1, C13598b0> f107140b;

    public C39968z(C54820t tVar, C32230s<? super Boolean, ? super Integer, ? super Integer, ? super String, ? super C51372tb1, C13598b0> sVar) {
        this.f107139a = tVar;
        this.f107140b = sVar;
    }

    /* renamed from: a */
    public void mo62571a(int i, int i2, String str, C51372tb1 tb12) {
        C87412m.m108594g(tb12, "resp");
        if (i == 0 && i2 == 0) {
            C32230s<Boolean, Integer, Integer, String, C51372tb1, C13598b0> sVar = this.f107140b;
            if (sVar != null) {
                sVar.mo237D(Boolean.TRUE, Integer.valueOf(i2), Integer.valueOf(i), str == null ? "" : str, tb12);
                return;
            }
            return;
        }
        Log.m105924i(this.f107139a.f153694d, "manual close live room failed");
        C32230s<Boolean, Integer, Integer, String, C51372tb1, C13598b0> sVar2 = this.f107140b;
        if (sVar2 != null) {
            sVar2.mo237D(Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i), str == null ? "" : str, tb12);
        }
        C58728f5.m68215a(C58728f5.f168144a, "manualCloseLive", i2, i, str == null ? "" : str, this.f107139a.f153692b, (String) null, 32, (Object) null);
    }
}
