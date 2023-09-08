package p203mi;

import android.content.Context;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.C67990s0;
import com.tencent.p014mm.chatroom.p015ui.C67992t0;
import com.tencent.p014mm.chatroom.p015ui.C67994u0;
import com.tencent.p014mm.chatroom.p015ui.C68006v0;
import com.tencent.p014mm.chatroom.p015ui.ManageChatroomUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.concurrent.atomic.AtomicBoolean;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C89779i0;
import te3.C49380f50;

/* renamed from: mi.j */
public class C76766j implements C11385n {

    /* renamed from: d */
    public C76767a f224553d;

    /* renamed from: e */
    public Context f224554e;

    /* renamed from: f */
    public C89779i0 f224555f;

    /* renamed from: g */
    public boolean f224556g;

    /* renamed from: h */
    public Runnable f224557h;

    /* renamed from: i */
    public Runnable f224558i;

    /* renamed from: j */
    public AtomicBoolean f224559j = new AtomicBoolean(false);

    /* renamed from: mi.j$a */
    public interface C76767a {
    }

    public C76766j(Context context, C76767a aVar) {
        this.f224554e = context;
        this.f224553d = aVar;
        this.f224555f = null;
    }

    /* renamed from: a */
    public final void mo107021a(boolean z, C49380f50 f502, int i) {
        C76767a aVar = this.f224553d;
        if (aVar != null) {
            C67994u0 u0Var = (C67994u0) aVar;
            if (f502 == null || !z) {
                Context context = u0Var.f195138a;
                int i2 = ManageChatroomUI.f108069s;
                C76912y0.m92769h(context, context.getResources().getString(C0966R.string.c06), C0966R.raw.icons_filled_error);
                ManageChatroomUI manageChatroomUI = u0Var.f195140c;
                C67990s0 s0Var = new C67990s0(u0Var, i);
                manageChatroomUI.getClass();
                new MMHandler().postDelayed(new C68006v0(manageChatroomUI, s0Var), 1000);
                return;
            }
            Context context2 = u0Var.f195138a;
            int i3 = ManageChatroomUI.f108069s;
            Toast d = C76912y0.m92765d(context2, context2.getResources().getString(C0966R.string.c08), C0966R.raw.icons_filled_done);
            ManageChatroomUI manageChatroomUI2 = u0Var.f195140c;
            C67992t0 t0Var = new C67992t0(u0Var, d, i);
            manageChatroomUI2.getClass();
            new MMHandler().postDelayed(new C68006v0(manageChatroomUI2, t0Var), 1000);
        }
    }

    /* renamed from: b */
    public final void mo107022b() {
        if (this.f224556g) {
            Runnable runnable = this.f224558i;
            if (runnable != null) {
                MMHandlerThread.removeRunnable(runnable);
            }
            C89779i0 i0Var = this.f224555f;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f224555f = null;
            }
        }
        MMHandlerThread.removeRunnable(this.f224557h);
        C86709a0.m107529k().f251779b.mo123470p(6217, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.CheckFinderManagerSwithFun", "onSceneEnd, errType = " + i + ", errCode = " + i2 + "," + str);
        if (!(yVar instanceof C47044o) || yVar.getType() != 6217) {
            Log.m105928w("MicroMsg.CheckFinderManagerSwithFun", "not expected scene,  type = " + yVar.getType());
            return;
        }
        mo107022b();
        if (i == 0 && i2 == 0) {
            mo107021a(true, (C49380f50) ((C47044o) yVar).f126418e.f127056b.f127083a, 0);
            return;
        }
        if (!Util.isNullOrNil(str)) {
            C76879j.m92748s(this.f224554e, str, "");
        }
        mo107021a(false, (C49380f50) null, i2);
    }
}
