package hf2;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: hf2.h */
public final class C8520h implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public static final C8520h f27562d = new C8520h();

    public final void onCancel(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception e) {
            Log.m105921e("NewBizInfoSettingJsApiUIC", "showProgressDlg onCancel exp: %s ", e.getLocalizedMessage());
        }
    }
}
