package nj3;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import nj3.C76879j;

/* renamed from: nj3.m */
public class C76892m implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76879j.C47267l f224742d;

    /* renamed from: e */
    public final /* synthetic */ MMEditText f224743e;

    /* renamed from: f */
    public final /* synthetic */ Context f224744f;

    /* renamed from: nj3.m$a */
    public class C76893a implements Runnable {
        public C76893a() {
        }

        public void run() {
            ((MMActivity) C76892m.this.f224744f).hideVKB();
        }
    }

    public C76892m(C76879j.C47267l lVar, MMEditText mMEditText, Context context) {
        this.f224742d = lVar;
        this.f224743e = mMEditText;
        this.f224744f = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C76879j.C47267l lVar = this.f224742d;
        if (lVar != null ? lVar.onFinish(this.f224743e.getText().toString().trim()) : true) {
            dialogInterface.dismiss();
            if (this.f224744f instanceof MMActivity) {
                MMHandlerThread.postToMainThread(new C76893a());
            }
        }
    }
}
