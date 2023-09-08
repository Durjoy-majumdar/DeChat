package g63;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBaseUI;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import g63.C45890a;
import qo3.C47883u;

/* renamed from: g63.e */
public class C59374e implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ Context f169699a;

    /* renamed from: b */
    public final /* synthetic */ C45890a.C45894c f169700b;

    /* renamed from: c */
    public final /* synthetic */ TextView f169701c;

    /* renamed from: d */
    public final /* synthetic */ EditText f169702d;

    /* renamed from: e */
    public final /* synthetic */ String f169703e;

    /* renamed from: f */
    public final /* synthetic */ String f169704f;

    /* renamed from: g */
    public final /* synthetic */ TextView f169705g;

    /* renamed from: g63.e$a */
    public class C59375a implements Runnable {
        public C59375a() {
        }

        public void run() {
            ((MMActivity) C59374e.this.f169699a).hideVKB();
        }
    }

    public C59374e(Context context, C45890a.C45894c cVar, TextView textView, EditText editText, String str, String str2, TextView textView2) {
        this.f169699a = context;
        this.f169700b = cVar;
        this.f169701c = textView;
        this.f169702d = editText;
        this.f169703e = str;
        this.f169704f = str2;
        this.f169705g = textView2;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        if (this.f169699a instanceof MMActivity) {
            if (this.f169700b != null) {
                boolean isNullOrNil = Util.isNullOrNil(this.f169701c.getText().toString().trim());
                ((RemittanceBaseUI.C70630e) this.f169700b).mo97290a(isNullOrNil, this.f169702d.getText().toString().trim(), this.f169703e, this.f169704f, this.f169705g.getText().toString().trim());
            }
            if (this.f169699a instanceof MMActivity) {
                MMHandlerThread.postToMainThread(new C59375a());
            }
        }
    }
}
