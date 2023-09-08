package com.tencent.p014mm.plugin.multitalk.model;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.sdk.platformtools.Log;
import ds3.C107064d;
import gy3.C87412m;
import nw3.C109779e;

/* renamed from: com.tencent.mm.plugin.multitalk.model.e1 */
public final class C105798e1 implements C105794d1 {

    /* renamed from: a */
    public final C107064d f314607a;

    /* renamed from: b */
    public boolean f314608b = true;

    /* renamed from: c */
    public C105820n f314609c;

    /* renamed from: d */
    public boolean f314610d;

    public C105798e1(C107064d dVar) {
        C87412m.m108594g(dVar, "multiTalkSdkApi");
        this.f314607a = dVar;
        System.currentTimeMillis();
        this.f314610d = true;
    }

    /* renamed from: a */
    public synchronized void mo150746a(byte[] bArr, long j, int i, int i2, int i3) {
        byte[] bArr2 = bArr;
        long j2 = j;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        synchronized (this) {
            C87412m.m108594g(bArr2, "pBuffer");
            boolean z = false;
            if (C105851w0.zx0().f314506t != null ? C105851w0.zx0().mo150681w(C105851w0.zx0().f314506t.f320042d) : false) {
                if (this.f314610d) {
                    Log.m105924i("VideoTransOutDataMuxer", "ilink onCameraFrame screen video soft");
                    C105724z.INSTANCE.mo150609s(bArr2, i4, i5, i6 + 128);
                } else {
                    C105820n nVar = this.f314609c;
                    if (nVar != null) {
                        nVar.mo150797c();
                        if (!nVar.mo150802h()) {
                            nVar = null;
                        }
                        if (nVar != null) {
                            boolean z2 = nVar.mo150796b(bArr2, i4, i5, i6) >= 0;
                            Log.m105924i("VideoTransOutDataMuxer", "ilink onCameraFrame screen video hw, success: " + z2);
                            if (!z2) {
                                nVar.mo150795a(8, true, false, true);
                                this.f314609c = null;
                            }
                            if (z2) {
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        Log.m105924i("VideoTransOutDataMuxer", "ilink onCameraFrame screen video soft");
                        C105724z.INSTANCE.mo150609s(bArr2, i4, i5, i6 + 128);
                    }
                }
                if (!C105851w0.zx0().mo150625B() && C105851w0.zx0().f314498j) {
                    C105851w0.zx0().mo150655c0(3, true);
                }
            } else {
                if (this.f314610d) {
                    Log.m105924i("VideoTransOutDataMuxer", "onCameraFrame screen video soft");
                    ((C109779e) this.f314607a).mo161036g(bArr, (int) j2, i, i2, i3);
                } else {
                    C105820n nVar2 = this.f314609c;
                    if (nVar2 != null) {
                        nVar2.mo150797c();
                        if (!nVar2.mo150802h()) {
                            nVar2 = null;
                        }
                        if (nVar2 != null) {
                            boolean z3 = nVar2.mo150796b(bArr2, i4, i5, i6) >= 0;
                            Log.m105924i("VideoTransOutDataMuxer", "onCameraFrame screen video hw, success: " + z3);
                            if (!z3) {
                                nVar2.mo150795a(8, true, false, true);
                                this.f314609c = null;
                            }
                            if (z3) {
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        Log.m105924i("VideoTransOutDataMuxer", "onCameraFrame screen video soft");
                        ((C109779e) this.f314607a).mo161036g(bArr, (int) j2, i, i2, i3);
                    }
                }
                if (!C105851w0.zx0().mo150625B() && C105851w0.zx0().f314498j) {
                    C105851w0.zx0().mo150655c0(3, true);
                }
                Log.m105924i("VideoTransOutDataMuxer", "onCameraFrame screen video w: " + i4 + ", h: " + i5);
                Log.m105924i("VideoTransOutDataMuxer", "onCameraFrame screen video ret: " + ((C109779e) this.f314607a).mo161037h(bArr, (int) j2, i, i2, i3, 1) + ", w: " + i4 + ", h: " + i5);
            }
        }
    }

    /* renamed from: b */
    public void mo150747b(boolean z) {
        if (!z && this.f314609c == null) {
            this.f314609c = new C105820n(1920, 1080, 5, 3000, 0, "video/avc");
        }
        if (z) {
            this.f314609c = null;
        }
        this.f314608b = z;
    }
}
