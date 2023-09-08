package gt0;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import gt0.C87340f;
import java.util.ArrayList;

/* renamed from: gt0.e */
public class C87338e implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C87340f.C87341a f253121d;

    public C87338e(C87340f fVar, C87340f.C87341a aVar) {
        this.f253121d = aVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105924i("MicroMsg.AppBrandAuthorizeDialog", "stev dialog onCancel");
        this.f253121d.mo114547a(3, (ArrayList<String>) null);
    }
}
