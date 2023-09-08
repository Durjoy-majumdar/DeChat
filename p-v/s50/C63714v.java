package s50;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import u80.C111142d;
import u80.C111143e;
import w80.C111742d;

/* renamed from: s50.v */
public final class C63714v implements TRTCCloudListener.TRTCVideoRenderListener {

    /* renamed from: a */
    public String f180603a;

    /* renamed from: b */
    public int f180604b;

    /* renamed from: c */
    public MMHandler f180605c;

    /* renamed from: d */
    public C111742d.C65942b f180606d;

    /* renamed from: e */
    public Object f180607e;

    /* renamed from: f */
    public boolean f180608f;

    /* renamed from: g */
    public C63700b0 f180609g;

    /* renamed from: h */
    public boolean f180610h = true;

    /* renamed from: s50.v$a */
    public static final class C63715a implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ C63714v f180611d;

        public C63715a(C63714v vVar) {
            this.f180611d = vVar;
        }

        public final boolean handleMessage(Message message) {
            Object obj;
            Message message2 = message;
            C87412m.m108594g(message2, LocaleUtil.ITALIAN);
            if (message2.what == 1024) {
                C63714v vVar = this.f180611d;
                Object obj2 = message2.obj;
                C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame");
                TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame = (TRTCCloudDef.TRTCVideoFrame) obj2;
                C111742d.C65942b bVar = vVar.f180606d;
                if (!(bVar == null || !vVar.f180608f || (obj = vVar.f180607e) == null)) {
                    Log.m105924i("MicroMsg.LiveCoreVisitor", "makeOutputSurface");
                    EGLSurface h = C111742d.f334647a.mo163465h(bVar.f189591a, obj);
                    bVar.f189592b = h;
                    EGL14.eglMakeCurrent(bVar.f189591a, h, h, bVar.f189593c);
                    vVar.f180608f = false;
                    vVar.f180610h = false;
                }
                if (!vVar.f180610h) {
                    C63700b0 b0Var = vVar.f180609g;
                    if (b0Var != null) {
                        int i = tRTCVideoFrame.bufferType;
                        if (i == 3) {
                            b0Var.f180569a = 0;
                        } else if (tRTCVideoFrame.pixelFormat == 1 && i == 2) {
                            b0Var.f180569a = 1;
                        } else {
                            Log.m105928w("MicroMsg.LiveCoreVisitor", "error video frame type");
                        }
                        int i2 = tRTCVideoFrame.width;
                        int i3 = tRTCVideoFrame.height;
                        int i4 = b0Var.f180569a;
                        if (i4 == 0) {
                            if (b0Var.f180570b == null) {
                                b0Var.f180570b = new C111143e(i2, i3, b0Var.f180573e, b0Var.f180574f, 0, b0Var.f180572d, 16, (C8480h) null);
                            } else {
                                C111142d dVar = b0Var.f180571c;
                                if (dVar != null) {
                                    dVar.f332751f = b0Var.f180572d;
                                }
                            }
                            C111143e eVar = b0Var.f180570b;
                            if (eVar != null) {
                                eVar.mo143263u(i2, i3);
                            }
                            C111143e eVar2 = b0Var.f180570b;
                            if (eVar2 != null) {
                                eVar2.mo158522s(b0Var.f180573e, b0Var.f180574f);
                            }
                            C111143e eVar3 = b0Var.f180570b;
                            if (eVar3 != null) {
                                eVar3.f332758m = tRTCVideoFrame.rotation;
                            }
                            if (eVar3 != null) {
                                eVar3.f332822G = tRTCVideoFrame.texture.textureId;
                            }
                            if (eVar3 != null) {
                                eVar3.mo162879m();
                            }
                        } else if (i4 == 1) {
                            b0Var.f180577i = Util.currentTicks();
                            C111142d dVar2 = b0Var.f180571c;
                            if (dVar2 == null) {
                                b0Var.f180571c = new C111142d(i2, i3, b0Var.f180573e, b0Var.f180574f, 0, b0Var.f180572d, 16, (C8480h) null);
                                b0Var.f180576h.startTimer(1000);
                            } else {
                                dVar2.f332751f = b0Var.f180572d;
                            }
                            C111142d dVar3 = b0Var.f180571c;
                            if (dVar3 != null) {
                                dVar3.mo143263u(i2, i3);
                            }
                            C111142d dVar4 = b0Var.f180571c;
                            if (dVar4 != null) {
                                dVar4.mo158522s(b0Var.f180573e, b0Var.f180574f);
                            }
                            C111142d dVar5 = b0Var.f180571c;
                            if (dVar5 != null) {
                                dVar5.f332758m = tRTCVideoFrame.rotation;
                            }
                            if (dVar5 != null) {
                                byte[] bArr = tRTCVideoFrame.data;
                                C87412m.m108593f(bArr, "frame.data");
                                dVar5.f332816O = bArr;
                            }
                            C111142d dVar6 = b0Var.f180571c;
                            if (dVar6 != null) {
                                dVar6.mo162879m();
                            }
                            b0Var.f180575g++;
                            long ticksToNow = Util.ticksToNow(b0Var.f180577i);
                            Log.m105924i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorRenderAnchorCostPerFrame is " + ticksToNow);
                            C115669n.INSTANCE.mo160138m((int) 1383, 6, 7, (int) ticksToNow, false);
                        }
                    }
                    C111742d.C65942b bVar2 = vVar.f180606d;
                    if (bVar2 != null) {
                        EGL14.eglSwapBuffers(bVar2.f189591a, bVar2.f189592b);
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: s50.v$b */
    public static final class C63716b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f180612d;

        public C63716b(C32224a aVar) {
            this.f180612d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f180612d.invoke();
        }
    }

    /* renamed from: s50.v$c */
    public static final class C63717c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Object f180613d;

        /* renamed from: e */
        public final /* synthetic */ C63714v f180614e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63717c(Object obj, C63714v vVar) {
            super(0);
            this.f180613d = obj;
            this.f180614e = vVar;
        }

        public Object invoke() {
            Object obj = this.f180613d;
            if (obj != null && !C87412m.m108589b(obj, this.f180614e.f180607e)) {
                C63714v vVar = this.f180614e;
                vVar.f180607e = this.f180613d;
                vVar.f180608f = true;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: s50.v$d */
    public static final class C63718d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63714v f180615d;

        /* renamed from: e */
        public final /* synthetic */ int f180616e;

        /* renamed from: f */
        public final /* synthetic */ int f180617f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63718d(C63714v vVar, int i, int i2) {
            super(0);
            this.f180615d = vVar;
            this.f180616e = i;
            this.f180617f = i2;
        }

        public Object invoke() {
            C63700b0 b0Var = this.f180615d.f180609g;
            if (b0Var != null) {
                int i = this.f180616e;
                int i2 = this.f180617f;
                Log.m105924i("MicroMsg.LiveCoreVisitor", "updateDrawSize: [" + i + ',' + i2 + ']');
                b0Var.f180573e = i;
                b0Var.f180574f = i2;
            }
            return C13598b0.f38549a;
        }
    }

    public C63714v(String str, int i) {
        C87412m.m108594g(str, "userId");
        this.f180603a = str;
        this.f180604b = i;
        int i2 = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("MicroMsg.LiveCoreVisitor_render", 10);
        a.start();
        this.f180605c = new MMHandler(a.getLooper(), (MMHandler.Callback) new C63715a(this));
        mo88555a(new C63720x(this));
        mo88555a(new C63719w(this));
    }

    /* renamed from: a */
    public final void mo88555a(C32224a<C13598b0> aVar) {
        if (aVar != null) {
            this.f180605c.post(new C63716b(aVar));
        }
    }

    /* renamed from: b */
    public void mo88556b(Object obj) {
        Log.m105924i("MicroMsg.LiveCoreVisitor", "setOutputSurface:" + obj);
        mo88555a(new C63717c(obj, this));
    }

    /* renamed from: c */
    public final void mo88557c(int i, int i2) {
        mo88555a(new C63718d(this, i, i2));
    }

    public void onRenderVideoFrame(String str, int i, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (C87412m.m108589b(str, this.f180603a) && i == this.f180604b) {
            this.f180605c.obtainMessage(1024, tRTCVideoFrame).sendToTarget();
        }
    }
}
