package t82;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import p248ug.C111161j0;

/* renamed from: t82.a */
public final class C110945a implements C111161j0 {

    /* renamed from: a */
    public final /* synthetic */ C110949e f331838a;

    public C110945a(C110949e eVar) {
        this.f331838a = eVar;
    }

    /* renamed from: a */
    public void mo79184a(Bitmap bitmap, boolean z) {
        if (bitmap != null) {
            this.f331838a.getClass();
        }
    }

    /* renamed from: b */
    public void mo79185b(Exception exc) {
        Log.m105921e("MicroMsg.MultiTalkEditPhotoContainerPlugin", "photoEditor onError: %s", exc);
        this.f331838a.f331851p = false;
    }
}
