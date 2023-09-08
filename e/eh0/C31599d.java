package eh0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mars.ilink.comm.PlatformComm;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.wechat.aff.common.AffAccountManager;
import com.tencent.wechat.aff.common.AffCgiManager;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p144dt.C31283c;
import p144dt.C7516d;
import p206nj.C88957l;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@C86522b
/* renamed from: eh0.d */
public final class C31599d extends C86301e implements C31283c {

    /* renamed from: d */
    public boolean f84442d;

    /* renamed from: e */
    public final C13601g f84443e = C36568h.m40985a(C31600a.f84444d);

    /* renamed from: eh0.d$a */
    public static final class C31600a extends C87413o implements C32224a<C20602c> {

        /* renamed from: d */
        public static final C31600a f84444d = new C31600a();

        public C31600a() {
            super(0);
        }

        public Object invoke() {
            return new C20602c();
        }
    }

    public C31599d() {
        C88957l.m111078n("aff_biz");
        C88957l.m111078n("aff_ilink");
        C88957l.m111078n("ilink_network");
        C88957l.m111078n("ilink2");
        PlatformComm.init(MMApplicationContext.getContext(), new Handler(Looper.getMainLooper()));
        vx0();
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountInitialized(context);
        vx0();
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountReleased(context);
        AffAccountManager.getInstance().accountLogoutAsyncAsync(0, C86709a0.m107523b().mo121111i());
    }

    /* renamed from: qo */
    public void mo58050qo() {
        ((C7516d) C86312j.m106911c(C7516d.class)).mo8638Za();
    }

    /* renamed from: ss */
    public void mo58051ss(boolean z) {
        ((C20602c) ((C36570n) this.f84443e).getValue()).getClass();
        AffCgiManager.getInstance().setProxyIlinkAsync(0, z);
    }

    public final void vx0() {
        if (!this.f84442d && C86709a0.m107522a()) {
            this.f84442d = true;
            AffAccountManager.getInstance().accountLogin(C86013q1.m106448i(VFSStrategy.m163776d("aff_biz"), false), C86709a0.m107523b().mo121111i());
        }
    }
}
