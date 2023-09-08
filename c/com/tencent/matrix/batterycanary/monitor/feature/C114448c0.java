package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import p933be.C113159b;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.c0 */
public class C114448c0 implements C113159b.C113164d {

    /* renamed from: a */
    public final /* synthetic */ C114536x.C114544h f343130a;

    public C114448c0(C114536x.C114544h hVar) {
        this.f343130a = hVar;
    }

    /* renamed from: a */
    public boolean mo165682a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2128145023:
                if (str.equals("android.intent.action.SCREEN_OFF")) {
                    c = 0;
                    break;
                }
                break;
            case -1886648615:
                if (str.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    c = 1;
                    break;
                }
                break;
            case -1454123155:
                if (str.equals("android.intent.action.SCREEN_ON")) {
                    c = 2;
                    break;
                }
                break;
            case 1019184907:
                if (str.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C114536x.C114544h hVar = this.f343130a;
                if (!hVar.f343314b) {
                    hVar.f343313a.accept(3);
                    break;
                }
                break;
            case 1:
                C114536x.C114544h hVar2 = this.f343130a;
                hVar2.f343314b = false;
                hVar2.f343313a.accept(2);
                break;
            case 2:
                C114536x.C114544h hVar3 = this.f343130a;
                if (!hVar3.f343314b) {
                    hVar3.f343313a.accept(5);
                    break;
                }
                break;
            case 3:
                C114536x.C114544h hVar4 = this.f343130a;
                hVar4.f343314b = true;
                hVar4.f343313a.accept(1);
                break;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo165683e(C113159b.C113163c cVar, long j) {
        return false;
    }
}
