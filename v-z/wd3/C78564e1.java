package wd3;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: wd3.e1 */
public class C78564e1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f230129d;

    /* renamed from: e */
    public final /* synthetic */ String f230130e;

    /* renamed from: f */
    public final /* synthetic */ C78553c1 f230131f;

    public C78564e1(C78553c1 c1Var, int i, String str) {
        this.f230131f = c1Var;
        this.f230129d = i;
        this.f230130e = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105919d("MicroMsg.SendVerifyRequest", "jacks 1 catch add Contact errCode: %d && errMsg: %s", Integer.valueOf(this.f230129d), this.f230130e);
        this.f230131f.getClass();
    }
}
