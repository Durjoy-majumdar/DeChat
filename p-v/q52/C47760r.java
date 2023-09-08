package q52;

import android.app.Activity;
import android.content.DialogInterface;
import qo3.C77398g;

/* renamed from: q52.r */
public final class C47760r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f128276d;

    /* renamed from: e */
    public final /* synthetic */ String f128277e;

    /* renamed from: f */
    public final /* synthetic */ String f128278f;

    public C47760r(Activity activity, String str, String str2) {
        this.f128276d = activity;
        this.f128277e = str;
        this.f128278f = str2;
    }

    public final void run() {
        if (!this.f128276d.isFinishing()) {
            C77398g gVar = new C77398g(this.f128276d);
            String str = this.f128277e;
            String str2 = this.f128278f;
            gVar.setTitle((CharSequence) str + ": 检测到 js 异常");
            gVar.mo107533r(str2);
            gVar.mo107542x("我知道了，马上修", true, (DialogInterface.OnClickListener) null);
            gVar.show();
        }
    }
}
