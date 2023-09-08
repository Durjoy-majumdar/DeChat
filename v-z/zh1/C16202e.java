package zh1;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zh1.e */
public final class C16202e implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C16200d f43405d;

    public C16202e(C16200d dVar) {
        this.f43405d = dVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Log.m105924i("GiftActivityJumpToastWidget", "dismiss half dialog");
        this.f43405d.f43403g = null;
    }
}
