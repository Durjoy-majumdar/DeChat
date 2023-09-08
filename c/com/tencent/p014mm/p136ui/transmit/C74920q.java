package com.tencent.p014mm.p136ui.transmit;

import android.content.Context;
import android.content.DialogInterface;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.ui.transmit.q */
public class C74920q {

    /* renamed from: a */
    public Context f220289a;

    /* renamed from: b */
    public C89779i0 f220290b;

    /* renamed from: c */
    public boolean f220291c;

    /* renamed from: d */
    public boolean f220292d;

    /* renamed from: e */
    public boolean f220293e;

    /* renamed from: f */
    public String f220294f;

    /* renamed from: g */
    public boolean f220295g = false;

    /* renamed from: h */
    public int f220296h;

    /* renamed from: i */
    public Runnable f220297i = new C74921a();

    /* renamed from: j */
    public C74922b f220298j;

    /* renamed from: com.tencent.mm.ui.transmit.q$a */
    public class C74921a implements Runnable {
        public C74921a() {
        }

        public void run() {
            C89779i0 i0Var = C74920q.this.f220290b;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C74920q qVar = C74920q.this;
            C74922b bVar = qVar.f220298j;
            if (bVar != null) {
                bVar.mo104149a(qVar.f220293e, qVar.f220294f, qVar.f220296h, qVar.f220295g);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.transmit.q$b */
    public interface C74922b {
        /* renamed from: a */
        void mo104149a(boolean z, String str, int i, boolean z2);
    }

    public C74920q(Context context) {
        this.f220289a = context;
    }

    /* renamed from: a */
    public void mo104168a() {
        this.f220292d = true;
        if (true && this.f220291c) {
            MMHandlerThread.removeRunnable(this.f220297i);
            C74922b bVar = this.f220298j;
            if (bVar != null) {
                bVar.mo104149a(this.f220293e, this.f220294f, this.f220296h, this.f220295g);
            }
        }
    }

    /* renamed from: b */
    public void mo104169b(boolean z, String str, int i, boolean z2) {
        this.f220291c = true;
        this.f220293e = z;
        this.f220294f = str;
        this.f220296h = i;
        this.f220295g = z2;
        if (true && this.f220292d) {
            C74922b bVar = this.f220298j;
            if (bVar != null) {
                bVar.mo104149a(z, str, i, z2);
            }
        } else if (z) {
            Context context = this.f220289a;
            this.f220290b = C76879j.m92723Q(context, "", context.getString(C0966R.string.ilt), false, true, (DialogInterface.OnCancelListener) null);
            MMHandlerThread.postToMainThreadDelayed(this.f220297i, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
    }
}
