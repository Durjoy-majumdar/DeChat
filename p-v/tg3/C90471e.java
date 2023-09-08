package tg3;

import android.content.DialogInterface;
import com.tencent.p014mm.sandbox.updater.AppUpdaterUI;

/* renamed from: tg3.e */
public class C90471e implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ AppUpdaterUI f260024d;

    public C90471e(AppUpdaterUI appUpdaterUI) {
        this.f260024d = appUpdaterUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        AppUpdaterUI.m105871E7(this.f260024d, 2);
    }
}
