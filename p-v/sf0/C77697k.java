package sf0;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;
import ob0.C117747y;

/* renamed from: sf0.k */
public class C77697k extends C77688c {

    /* renamed from: sf0.k$a */
    public class C77698a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Activity f226479d;

        public C77698a(C77697k kVar, Activity activity) {
            this.f226479d = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f226479d.finish();
        }
    }

    public C77697k(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public boolean mo107843a(C77701p0 p0Var) {
        Log.m105918d("MicroMsg.ErrorMsgBoxProcessor", "handleDoneBack");
        Activity activity = this.f226475e;
        C76879j.m92754y(activity, p0Var.f226482c, "", activity.getString(C0966R.string.f8029zr), new C77698a(this, activity));
        return true;
    }

    /* renamed from: b */
    public boolean mo107844b(C77701p0 p0Var) {
        Log.m105918d("MicroMsg.ErrorMsgBoxProcessor", "handleFalseCancel");
        Activity activity = this.f226475e;
        C76879j.m92754y(activity, p0Var.f226482c, "", activity.getString(C0966R.string.f8029zr), (DialogInterface.OnClickListener) null);
        return true;
    }

    /* renamed from: c */
    public boolean mo107845c(C77701p0 p0Var) {
        Log.m105918d("MicroMsg.ErrorMsgBoxProcessor", "handleFalseLast");
        Activity activity = this.f226475e;
        C76879j.m92754y(activity, p0Var.f226482c, "", activity.getString(C0966R.string.f8029zr), (DialogInterface.OnClickListener) null);
        return true;
    }

    /* renamed from: d */
    public boolean mo107846d(C77701p0 p0Var) {
        Log.m105918d("MicroMsg.ErrorMsgBoxProcessor", "handleIgnore");
        Activity activity = this.f226475e;
        C76879j.m92754y(activity, p0Var.f226482c, "", activity.getString(C0966R.string.f8029zr), (DialogInterface.OnClickListener) null);
        return true;
    }

    /* renamed from: e */
    public boolean mo107847e(C77701p0 p0Var) {
        Log.m105918d("MicroMsg.ErrorMsgBoxProcessor", "handleOpenUrl");
        Activity activity = this.f226475e;
        C76879j.m92754y(activity, p0Var.f226482c, "", activity.getString(C0966R.string.f8029zr), (DialogInterface.OnClickListener) null);
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.ErrorMsgBoxProcessor", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
    }
}
