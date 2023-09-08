package sf0;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import nj3.C76879j;
import ob0.C117747y;
import p214om.C11502f;
import p910lj.C76701a;

/* renamed from: sf0.i */
public class C77693i extends C77688c {

    /* renamed from: sf0.i$a */
    public class C77694a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77701p0 f226476d;

        /* renamed from: e */
        public final /* synthetic */ Activity f226477e;

        public C77694a(C77693i iVar, C77701p0 p0Var, Activity activity) {
            this.f226476d = p0Var;
            this.f226477e = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f226476d.f226483d);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            intent.putExtra("needRedirect", false);
            intent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent, this.f226477e);
        }
    }

    /* renamed from: sf0.i$b */
    public class C77695b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f226478d;

        public C77695b(C77693i iVar, Activity activity) {
            this.f226478d = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f226478d.finish();
        }
    }

    public C77693i(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public boolean mo107843a(C77701p0 p0Var) {
        Log.m105918d("MicroMsg.ErrorConfirmProcessor", "handleDoneBack");
        Activity activity = this.f226475e;
        C76879j.m92707A(activity, p0Var.f226482c, "", activity.getString(C0966R.string.bjb), this.f226475e.getString(C0966R.string.bj_), new C77695b(this, activity), (DialogInterface.OnClickListener) null);
        return true;
    }

    /* renamed from: b */
    public boolean mo107844b(C77701p0 p0Var) {
        Log.m105918d("MicroMsg.ErrorConfirmProcessor", "handleFalseCancel");
        C76701a.makeText((Context) this.f226475e, (CharSequence) p0Var.f226482c, 0).show();
        return true;
    }

    /* renamed from: c */
    public boolean mo107845c(C77701p0 p0Var) {
        Log.m105918d("MicroMsg.ErrorConfirmProcessor", "handleFalseLast");
        C76701a.makeText((Context) this.f226475e, (CharSequence) p0Var.f226482c, 0).show();
        return true;
    }

    /* renamed from: d */
    public boolean mo107846d(C77701p0 p0Var) {
        Log.m105918d("MicroMsg.ErrorConfirmProcessor", "handleIgnore");
        C76701a.makeText((Context) this.f226475e, (CharSequence) p0Var.f226482c, 0).show();
        return true;
    }

    /* renamed from: e */
    public boolean mo107847e(C77701p0 p0Var) {
        Log.m105918d("MicroMsg.ErrorConfirmProcessor", "handleOpenUrl");
        Activity activity = this.f226475e;
        C76879j.m92707A(activity, p0Var.f226482c, "", activity.getString(C0966R.string.bjb), this.f226475e.getString(C0966R.string.bj_), new C77694a(this, p0Var, activity), (DialogInterface.OnClickListener) null);
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.ErrorConfirmProcessor", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
    }
}
