package sf0;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import p910lj.C76701a;

/* renamed from: sf0.l */
public class C77699l extends C77688c {
    public C77699l(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public boolean mo107843a(C77701p0 p0Var) {
        Log.m105918d("MicroMsg.ErrorTextStripleProcessor", "handleDoneBack");
        C76701a.makeText((Context) this.f226475e, (CharSequence) p0Var.f226482c, 0).show();
        this.f226475e.finish();
        return true;
    }

    /* renamed from: b */
    public boolean mo107844b(C77701p0 p0Var) {
        Log.m105918d("MicroMsg.ErrorTextStripleProcessor", "handleFalseCancel");
        C76701a.makeText((Context) this.f226475e, (CharSequence) p0Var.f226482c, 0).show();
        return true;
    }

    /* renamed from: c */
    public boolean mo107845c(C77701p0 p0Var) {
        Log.m105918d("MicroMsg.ErrorTextStripleProcessor", "handleFalseLast");
        C76701a.makeText((Context) this.f226475e, (CharSequence) p0Var.f226482c, 0).show();
        return true;
    }

    /* renamed from: d */
    public boolean mo107846d(C77701p0 p0Var) {
        Log.m105918d("MicroMsg.ErrorTextStripleProcessor", "handleIgnore");
        C76701a.makeText((Context) this.f226475e, (CharSequence) p0Var.f226482c, 0).show();
        return true;
    }

    /* renamed from: e */
    public boolean mo107847e(C77701p0 p0Var) {
        Log.m105918d("MicroMsg.ErrorTextStripleProcessor", "handleOpenUrl");
        C76701a.makeText((Context) this.f226475e, (CharSequence) p0Var.f226482c, 0).show();
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.ErrorTextStripleProcessor", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
    }
}
