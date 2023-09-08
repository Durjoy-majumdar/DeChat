package com.tencent.p014mm.plugin.appbrand.utils;

import android.content.Context;
import android.view.OrientationEventListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.z1 */
public class C84800z1 extends OrientationEventListener {

    /* renamed from: a */
    public C84801a f247231a = C84801a.NONE;

    /* renamed from: b */
    public int f247232b = 45;

    /* renamed from: c */
    public C84802b f247233c;

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.z1$a */
    public enum C84801a {
        NONE,
        PORTRAIT,
        LANDSCAPE,
        REVERSE_PORTRAIT,
        REVERSE_LANDSCAPE
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.z1$b */
    public interface C84802b {
        /* renamed from: a */
        void mo22146a(C84801a aVar, C84801a aVar2);
    }

    public C84800z1(Context context, C84802b bVar) {
        super(context);
        this.f247233c = bVar;
    }

    public void disable() {
        super.disable();
        this.f247231a = C84801a.NONE;
    }

    public void enable() {
        super.enable();
    }

    public void onOrientationChanged(int i) {
        if (i != -1) {
            C84801a aVar = this.f247231a;
            int i2 = this.f247232b;
            C84801a aVar2 = ((i < 360 - i2 || i >= 360) && (i < 0 || i > i2 + 0)) ? (i < 270 - i2 || i > i2 + 270) ? (i < 180 - i2 || i > i2 + 180) ? (i < 90 - i2 || i > i2 + 90) ? aVar : C84801a.REVERSE_LANDSCAPE : C84801a.REVERSE_PORTRAIT : C84801a.LANDSCAPE : C84801a.PORTRAIT;
            if (aVar2 != aVar) {
                C84802b bVar = this.f247233c;
                if (!(bVar == null || aVar == C84801a.NONE)) {
                    bVar.mo22146a(aVar, aVar2);
                }
                this.f247231a = aVar2;
            }
            Log.m105927v("MicroMsg.OrientationListenerHelper", "OrientationListener onOrientationChanged: %d", Integer.valueOf(i));
        }
    }
}
