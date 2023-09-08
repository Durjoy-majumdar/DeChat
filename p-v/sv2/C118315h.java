package sv2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.sport.model.C115758a;
import com.tencent.p014mm.plugin.sport.model.C115775n;
import com.tencent.p014mm.plugin.sport.model.C115777p;
import com.tencent.p014mm.plugin.sport.model.C115778q;
import com.tencent.p014mm.plugin.sport.model.C43165f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import nj3.C76901s0;
import qo3.C47877k0;
import tv2.C52366c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: sv2.h */
public class C118315h extends C86301e implements C52366c {

    /* renamed from: sv2.h$a */
    public class C118316a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Activity f353595d;

        /* renamed from: e */
        public final /* synthetic */ String f353596e;

        public C118316a(C118315h hVar, Activity activity, String str) {
            this.f353595d = activity;
            this.f353596e = str;
        }

        public void run() {
            Activity activity = this.f353595d;
            String str = this.f353596e;
            C76901s0 s0Var = C115778q.f347351a;
            if ((s0Var == null || !s0Var.isShowing()) && C115775n.f347342a.mo176128a("KEY_SHOW_NOT_SUPPORT_DEVICE_STEP_TIPS", 1) != 0 && C75592q0.m90789s().equals(str) && !((C52366c) C86312j.m106911c(C52366c.class)).mo73380Wi(MMApplicationContext.getContext())) {
                C115778q.f347351a = C47877k0.m53189a(activity, 1, C0966R.raw.icons_filled_info, activity.getResources().getColor(C0966R.color.f2966ao), MMApplicationContext.getContext().getString(C0966R.string.jm6), C0966R.raw.icons_outlined_close, (View.OnClickListener) null, (PopupWindow.OnDismissListener) null, new C115777p());
            }
        }
    }

    /* renamed from: BH */
    public void mo73377BH() {
        Class cls = C118311f.class;
        if (((C118311f) C86312j.m106911c(cls)).vx0() != null) {
            C115758a vx02 = ((C118311f) C86312j.m106911c(cls)).vx0();
            long a = vx02.mo176114a();
            Log.m105925i("MicroMsg.Sport.DeviceStepManager", "forceUploadDeviceStep %d", Long.valueOf(a));
            vx02.mo176117d(a);
        }
    }

    /* renamed from: Rw */
    public boolean mo73378Rw() {
        return C115778q.m162836e();
    }

    public void W60() {
        C76901s0 s0Var = C115778q.f347351a;
        if (s0Var != null) {
            s0Var.dismiss();
            C115778q.f347351a = null;
        }
    }

    /* renamed from: Wi */
    public boolean mo73380Wi(Context context) {
        return C115778q.m162832a(context);
    }

    public void b50(String str, String str2, int i, int i2, int i3, String str3, int i4) {
        if (C86709a0.m107522a() && i3 > 0) {
            C86709a0.m107524d().mo123460f(new C43165f(str, str2, i, i2, i3, str3, i4));
        }
    }

    /* renamed from: s6 */
    public void mo73382s6(Activity activity, String str) {
        MMHandlerThread.postToMainThread(new C118316a(this, activity, str));
    }
}
