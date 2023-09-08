package e01;

import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.opengl.EGLContext;
import android.os.Bundle;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.view.Surface;
import c01.C104224p;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32226l;
import g01.C107658b;
import g01.C107659c;
import gy3.C87412m;
import h81.C32735h;
import i01.C76253c;
import java.util.Arrays;
import m01.C109453a;
import m01.C109455d;
import n80.C109697b;
import p156gj.C107835h0;
import p182kk.C61104a;
import p206nj.C11171e;
import rx3.C13598b0;
import w80.C111742d;
import zt3.C119157j;

/* renamed from: e01.b */
public final class C107077b implements C109455d {

    /* renamed from: a */
    public final /* synthetic */ C107075a f320517a;

    /* renamed from: b */
    public final /* synthetic */ Context f320518b;

    /* renamed from: e01.b$a */
    public static final class C75466a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C107075a f221779d;

        public C75466a(C107075a aVar) {
            this.f221779d = aVar;
        }

        public final void run() {
            C107075a aVar = this.f221779d;
            C76253c cVar = C76253c.INIT_MEDIACODEC_FAILED;
            aVar.f320512r = cVar;
            C32226l<? super C76253c, C13598b0> lVar = aVar.f320513s;
            if (lVar != null) {
                lVar.invoke(cVar);
            }
        }
    }

    /* renamed from: e01.b$b */
    public static final class C107078b implements C107659c.C107660a {

        /* renamed from: a */
        public final /* synthetic */ C107075a f320519a;

        public C107078b(C107075a aVar) {
            this.f320519a = aVar;
        }

        /* renamed from: a */
        public void mo157533a(Surface surface) {
            C87412m.m108594g(surface, "surface");
            VirtualDisplay virtualDisplay = this.f320519a.f320497c;
            if (virtualDisplay != null) {
                virtualDisplay.setSurface(surface);
            }
        }

        /* renamed from: b */
        public void mo157534b() {
            C104224p pVar = this.f320519a.f320500f;
            if (pVar != null) {
                if (!C11171e.m11046c(23)) {
                    C32735h.C32737c cVar = C32735h.C32737c.clicfg_finder_screec_cast_pc_use_async_codec;
                    Class cls = C32735h.class;
                    int i = C107835h0.f322856m.f322867G;
                    boolean z = true;
                    if (i != -1) {
                        if (i != 1) {
                            z = i != 2 ? ((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, true) : false;
                        }
                    } else if (!BuildInfo.IS_FLAVOR_RED && !BuildInfo.DEBUG) {
                        z = ((C32735h) C86312j.m106911c(cls)).mo58784wf(cVar, true);
                    }
                    if (z) {
                        return;
                    }
                }
                C109697b bVar = pVar.f308515c;
                if (bVar != null) {
                    bVar.mo160917a(0);
                }
            }
        }
    }

    public C107077b(C107075a aVar, Context context) {
        this.f320517a = aVar;
        this.f320518b = context;
    }

    /* renamed from: a */
    public void mo157530a(Surface surface) {
        C87412m.m108594g(surface, "surface");
        C107075a aVar = this.f320517a;
        C107659c cVar = aVar.f320502h;
        if (cVar != null) {
            cVar.f322071e = new C107078b(aVar);
        }
        if (cVar != null) {
            boolean z = cVar.f322079m;
            if (z) {
                Log.m105924i("MicroMsg.ScreenCastRenderMgr", "use open gl renderer media projection");
                cVar.f322078l = C111742d.C111743a.m152351i(C111742d.f334647a, cVar.f322067a, cVar.f322068b, (EGLContext) null, 4, (Object) null);
                cVar.mo158076c();
                Log.m105924i("MicroMsg.CastReportHelper", "markVideoRendererUseOpenGL");
                C115669n.INSTANCE.mo175913w(1634, 14, 1);
            } else if (!z) {
                Log.m105924i("MicroMsg.ScreenCastRenderMgr", "use image reader render media projection");
                cVar.mo158076c();
                Log.m105924i("MicroMsg.CastReportHelper", "markVideoRendererUseImageReader");
                C115669n.INSTANCE.mo175913w(1634, 15, 1);
            }
        }
        C107659c cVar2 = this.f320517a.f320502h;
        if (cVar2 != null) {
            cVar2.f322070d = surface;
            if (cVar2.f322079m) {
                C111742d.C65942b bVar = cVar2.f322078l;
                if (bVar != null) {
                    bVar.f189592b = C111742d.f334647a.mo163465h(bVar.f189591a, surface);
                }
            } else {
                C107658b bVar2 = cVar2.f322074h;
                if (bVar2 != null) {
                    bVar2.f322063e = surface;
                }
            }
        }
        this.f320517a.f320510p = new C109453a();
        C109453a aVar2 = this.f320517a.f320510p;
        if (aVar2 != null) {
            aVar2.mo160690a();
        }
        this.f320517a.f320509o = Util.currentTicks();
    }

    /* renamed from: b */
    public void mo157531b() {
        ((C119157j) C119157j.f356862d).mo183895z(new C75466a(this.f320517a));
    }

    /* renamed from: c */
    public void mo157532c(byte[] bArr) {
        C87412m.m108594g(bArr, "byteArray");
        if (!C61104a.m71641A()) {
            boolean z = false;
            if (!C61104a.m71642B(this.f320518b, false) && !C61104a.m71644D()) {
                TelephonyManager telephonyManager = (TelephonyManager) this.f320518b.getSystemService("phone");
                if (2 == telephonyManager.getCallState() || 1 == telephonyManager.getCallState()) {
                    z = true;
                }
                if (!z) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    C87412m.m108593f(copyOf, "copyOf(this, newSize)");
                    Bundle bundle = new Bundle();
                    bundle.putByte("data_type", (byte) 1);
                    bundle.putByteArray("data_data", copyOf);
                    MMHandler mMHandler = this.f320517a.f320504j;
                    if (mMHandler != null) {
                        Message message = new Message();
                        message.setData(bundle);
                        mMHandler.sendMessage(message);
                        return;
                    }
                    return;
                }
            }
        }
        Log.m105920e("MicroMsg.ScreenCastManager", "current is in voip do not allow to send video ");
    }
}
