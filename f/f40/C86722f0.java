package f40;

import bp3.C79760s;
import com.tencent.p014mm.app.C80637z0;
import h40.C87422a;
import j40.C46396a;
import lp3.C88631d;

/* renamed from: f40.f0 */
public class C86722f0 implements C88631d.C88632b<Object> {

    /* renamed from: a */
    public final /* synthetic */ long f251775a;

    /* renamed from: b */
    public final /* synthetic */ C46396a f251776b;

    /* renamed from: c */
    public final /* synthetic */ C86732g0 f251777c;

    public C86722f0(C86732g0 g0Var, long j, C46396a aVar) {
        this.f251777c = g0Var;
        this.f251775a = j;
        this.f251776b = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo1772a(Object obj) {
        C86739i0.m107600b("executeBootExtension");
        synchronized (this.f251777c.f251791c) {
            this.f251777c.f251792d = true;
        }
        C87422a.m108608a("summerboot mmskeleton boot startup finished in [%s]!", C87422a.m108609d(this.f251775a));
        try {
            C79760s.m96908a("kernelCallbacks.onStartupDone()");
            this.f251777c.f251795g.mo1180e();
            C79760s.m96909b();
            C86739i0.m107600b("onStartupDone");
            C80637z0.INSTANCE.mo112374e(C80637z0.C80646h.UNTIL_KERNEL_STARTUP_END);
            this.f251777c.f251793e = System.currentTimeMillis();
            this.f251776b.f124992e.f125000h = this.f251777c.f251793e;
        } catch (Throwable th) {
            C79760s.m96909b();
            throw th;
        }
    }
}
