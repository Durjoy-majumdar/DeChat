package jg0;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: jg0.c */
public class C117351c implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C117352d f351323d;

    public C117351c(C117352d dVar) {
        this.f351323d = dVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105928w("MicroMsg.DoInit", "do init canceled");
        C86709a0.m107524d().mo123458d(this.f351323d.f351327g);
        if (this.f351323d.f351327g.getType() == 139) {
            C86709a0.m107524d().mo123470p(139, this.f351323d);
        } else if (this.f351323d.f351327g.getType() == 138) {
            C86709a0.m107524d().mo123470p(138, this.f351323d);
        }
    }
}
