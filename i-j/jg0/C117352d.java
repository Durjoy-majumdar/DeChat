package jg0;

import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import qo3.C89779i0;

/* renamed from: jg0.d */
public final class C117352d implements C11385n, C47355o {

    /* renamed from: d */
    public MMHandler f351324d = new MMHandler(Looper.getMainLooper());

    /* renamed from: e */
    public Context f351325e;

    /* renamed from: f */
    public C89779i0 f351326f;

    /* renamed from: g */
    public C117747y f351327g;

    /* renamed from: h */
    public C117354b f351328h;

    /* renamed from: jg0.d$a */
    public class C117353a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f351329d;

        public C117353a(int i) {
            this.f351329d = i;
        }

        public void run() {
            C89779i0 i0Var = C117352d.this.f351326f;
            if (i0Var != null) {
                i0Var.setMessage(C117352d.this.f351325e.getString(C0966R.string.a05) + this.f351329d + "%");
            }
        }
    }

    /* renamed from: jg0.d$b */
    public interface C117354b {
    }

    public C117352d(Context context, C117354b bVar) {
        this.f351325e = context;
        this.f351328h = bVar;
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
        this.f351324d.post(new C117353a(i2 != 0 ? (int) ((((long) i) * 100) / ((long) i2)) : 0));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 139) {
            C86709a0.m107524d().mo123470p(139, this);
        } else if (yVar.getType() == 138) {
            C86709a0.m107524d().mo123470p(138, this);
        }
        if (i2 == 0 && i == 0) {
            ((SimpleLoginUI.C115079j) this.f351328h).mo174846a(true);
        } else {
            Log.m105920e("MicroMsg.DoInit", "do init failed, err=" + i + "," + i2);
            ((SimpleLoginUI.C115079j) this.f351328h).mo174846a(false);
        }
        C89779i0 i0Var = this.f351326f;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }
}
