package op0;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import gt0.C87327c0;
import gt0.C87370k0;
import p210o.C11323a;

/* renamed from: op0.c */
public final class C89256c implements DialogInterface {

    /* renamed from: d */
    public C11323a<Context, C87370k0.C87371a> f257150d;

    /* renamed from: e */
    public MTimerHandler f257151e;

    /* renamed from: f */
    public C87370k0.C87371a f257152f;

    /* renamed from: g */
    public DialogInterface.OnCancelListener f257153g;

    /* renamed from: h */
    public int f257154h;

    /* renamed from: i */
    public boolean f257155i = false;

    /* renamed from: j */
    public boolean f257156j = false;

    /* renamed from: op0.c$a */
    public class C89257a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime f257157d;

        public C89257a(AppBrandRuntime appBrandRuntime) {
            this.f257157d = appBrandRuntime;
        }

        public void run() {
            C89256c.this.mo123573a(this.f257157d);
        }
    }

    /* renamed from: op0.c$b */
    public class C89258b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRuntime f257159d;

        public C89258b(AppBrandRuntime appBrandRuntime) {
            this.f257159d = appBrandRuntime;
        }

        public boolean onTimerExpired() {
            C89256c cVar = C89256c.this;
            if (!cVar.f257155i && !cVar.f257156j) {
                Context R = this.f257159d.mo113026R();
                if (R == null) {
                    R = this.f257159d.f238141d;
                }
                C11323a<Context, C87370k0.C87371a> aVar = C89256c.this.f257150d;
                C87370k0.C87371a apply = aVar == null ? null : aVar.apply(R);
                if (apply == null) {
                    apply = new C87327c0(R);
                }
                apply.setOnCancelListener(C89256c.this.f257153g);
                apply.setCancelable(true);
                apply.setCanceledOnTouchOutside(false);
                this.f257159d.f238156u.mo121778b(apply);
                C89256c cVar2 = C89256c.this;
                cVar2.f257152f = apply;
                int i = cVar2.f257154h;
                if (i > 0 && (apply instanceof C87327c0)) {
                    ((C87327c0) apply).setProgress(i);
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public void mo123573a(AppBrandRuntime appBrandRuntime) {
        if (!MMHandlerThread.isMainThread()) {
            MMHandlerThread.postToMainThread(new C89257a(appBrandRuntime));
            return;
        }
        MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C89258b(appBrandRuntime), false);
        this.f257151e = mTimerHandler;
        mTimerHandler.startTimer(500);
    }

    public void cancel() {
        this.f257155i = true;
        C87370k0.C87371a aVar = this.f257152f;
        if (aVar != null) {
            aVar.cancel();
            return;
        }
        DialogInterface.OnCancelListener onCancelListener = this.f257153g;
        if (onCancelListener != null) {
            onCancelListener.onCancel(this);
        }
    }

    public void dismiss() {
        this.f257156j = true;
        C87370k0.C87371a aVar = this.f257152f;
        if (aVar != null) {
            aVar.dismiss();
        }
    }
}
