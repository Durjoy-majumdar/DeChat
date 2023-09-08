package tg3;

import android.content.DialogInterface;
import com.tencent.p014mm.sandbox.updater.AppUpdaterUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: tg3.m */
public class C90479m implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ AppUpdaterUI f260034d;

    public C90479m(AppUpdaterUI appUpdaterUI) {
        this.f260034d = appUpdaterUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105918d("MicroMsg.AppUpdaterUI", "click cancel button");
        AppUpdaterUI.m105873G7(this.f260034d, 12);
        AppUpdaterUI.m105871E7(this.f260034d, 2);
    }
}
