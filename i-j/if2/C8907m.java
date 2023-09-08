package if2;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: if2.m */
public final class C8907m implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public static final C8907m f28191d = new C8907m();

    public final void onCancel(DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (Exception e) {
            Log.m105921e("NewBizInfoSettingJsApiUIC", "showProgressDlg onCancel exp: %s ", e.getLocalizedMessage());
        }
    }
}
