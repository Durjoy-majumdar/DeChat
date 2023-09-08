package a63;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: a63.b */
public class C39498b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f106060d;

    /* renamed from: e */
    public final /* synthetic */ Activity f106061e;

    public C39498b(boolean z, Activity activity) {
        this.f106060d = z;
        this.f106061e = activity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click cancel");
        dialogInterface.dismiss();
        if (this.f106060d) {
            this.f106061e.finish();
        }
    }
}
