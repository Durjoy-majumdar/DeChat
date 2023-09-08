package x70;

import a80.C103327c;
import android.hardware.display.DisplayManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.wxmm.v2helper;
import f80.C107486a;
import f80.C107488c;
import f80.C107490e;
import f80.C107491f;
import fy3.C32224a;
import g80.C107782d;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import v70.C111389d;
import v70.C111406s;
import v70.C111407t;
import v70.C111408u;
import v70.C111409v;
import wx3.C15601d;

/* renamed from: x70.e */
public abstract class C112044e implements DisplayManager.DisplayListener, C111406s, C111407t, C111409v, C111408u {

    /* renamed from: d */
    public int f335419d = hashCode();

    /* renamed from: e */
    public C103327c f335420e;

    /* renamed from: f */
    public final C13601g f335421f = C36568h.m40985a(C112046b.f335426d);

    /* renamed from: g */
    public final C13601g f335422g = C36568h.m40985a(new C112045a(this));

    /* renamed from: h */
    public volatile long f335423h = -1;

    /* renamed from: i */
    public final DisplayManager f335424i;

    /* renamed from: x70.e$a */
    public static final class C112045a extends C87413o implements C32224a<C107782d> {

        /* renamed from: d */
        public final /* synthetic */ C112044e f335425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112045a(C112044e eVar) {
            super(0);
            this.f335425d = eVar;
        }

        public Object invoke() {
            return (C107782d) ((C107490e) ((C36570n) this.f335425d.f335421f).getValue()).f321599a;
        }
    }

    /* renamed from: x70.e$b */
    public static final class C112046b extends C87413o implements C32224a<C107490e<C107782d>> {

        /* renamed from: d */
        public static final C112046b f335426d = new C112046b();

        public C112046b() {
            super(0);
        }

        public Object invoke() {
            C107486a aVar = C107488c.f321596a;
            C107490e b = C107488c.f321596a.mo157913b((String) null, C107491f.Created);
            if (b == null) {
                b = new C107490e(new C107782d(), (C107491f) null, 2, (C8480h) null);
            }
            b.f321600b = C107491f.InUsed;
            return b;
        }
    }

    public C112044e() {
        Object systemService = MMApplicationContext.getContext().getSystemService("display");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        this.f335424i = (DisplayManager) systemService;
    }

    public void onDisplayAdded(int i) {
        Log.m105924i("MicroMsg.Camera.CameraKit", "Display #" + i + " added.");
    }

    public void onDisplayChanged(int i) {
        Log.m105924i("MicroMsg.Camera.CameraKit", "Display #" + i + " changed.");
        if (this.f335420e != null) {
            if (System.currentTimeMillis() - this.f335423h < 1000) {
                Log.m105920e("MicroMsg.Camera.CameraKit", "jump onDisplayChanged");
                return;
            }
            C103327c cVar = this.f335420e;
            C87412m.m108591d(cVar);
            int c = cVar.mo143122c();
            C103327c cVar2 = this.f335420e;
            C87412m.m108591d(cVar2);
            if (mo163767p().f333482j.f320925d != ((cVar2.mo143117w() - c) + v2helper.VOIP_ENC_HEIGHT_LV1) % v2helper.VOIP_ENC_HEIGHT_LV1) {
                this.f335423h = System.currentTimeMillis();
                C112069u uVar = (C112069u) this;
                Log.m105924i("MicroMsg.Camera.CameraKit", "updateScreenRotate");
                uVar.mo163062D("updateScreenRotate", new C112074v(uVar, (C15601d<? super C112074v>) null));
            }
        }
    }

    public void onDisplayRemoved(int i) {
        Log.m105924i("MicroMsg.Camera.CameraKit", "Display #" + i + " removed.");
    }

    /* renamed from: p */
    public final C111389d mo163767p() {
        return (C111389d) ((C36570n) this.f335422g).getValue();
    }
}
