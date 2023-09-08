package yu0;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: yu0.j */
public class C39174j implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f105415d;

    public C39174j(int i) {
        this.f105415d = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105925i("MicroMsg.BackupUtil", "low battery, user click sure. battery:%d", Integer.valueOf(this.f105415d));
    }
}
