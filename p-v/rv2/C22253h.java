package rv2;

import android.os.CancellationSignal;
import android.os.Handler;
import android.view.View;
import com.tencent.p014mm.plugin.soter.p322ui.SoterTestUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.security.Signature;
import java.security.SignatureException;
import java.util.ArrayList;
import lt3.C21460a;
import mt3.C21527b;
import ot3.C21889m;

/* renamed from: rv2.h */
public class C22253h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SoterTestUI f63054d;

    /* renamed from: rv2.h$a */
    public class C22254a extends C21527b.C21529b {

        /* renamed from: a */
        public final /* synthetic */ Signature f63055a;

        public C22254a(Signature signature) {
            this.f63055a = signature;
        }

        /* renamed from: a */
        public void mo33739a() {
        }

        /* renamed from: b */
        public void mo33740b(int i, CharSequence charSequence) {
            Log.m105924i("MicroMsg.SoterTestUI", "hy: onAuthenticationError");
        }

        /* renamed from: c */
        public void mo33741c() {
            Log.m105924i("MicroMsg.SoterTestUI", "hy: onAuthenticationFailed");
        }

        /* renamed from: d */
        public void mo33742d(int i, CharSequence charSequence) {
            Log.m105924i("MicroMsg.SoterTestUI", "hy: onAuthenticationHelp");
        }

        /* renamed from: e */
        public void mo33743e(C21527b.C21530c cVar) {
            Log.m105924i("MicroMsg.SoterTestUI", "hy: onAuthenticationSucceeded");
            try {
                this.f63055a.update("challenge".getBytes());
                C21889m a = C21460a.m24267a(this.f63055a.sign());
                C22253h.this.f63054d.f347297o.setText(a == null ? "not pass: exception occurs" : a.toString());
            } catch (SignatureException e) {
                Log.m105920e("MicroMsg.SoterTestUI", "hy: occurred exception when sign: " + e.toString());
            }
        }
    }

    public C22253h(SoterTestUI soterTestUI) {
        this.f63054d = soterTestUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/soter/ui/SoterTestUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Signature d = C21460a.m24270d("sample_auth_key_name");
        if (d != null) {
            try {
                d.update("challenge".getBytes());
                d.sign();
                Log.m105920e("MicroMsg.SoterTestUI", "hy: should NOT happen if no exception");
                this.f63054d.f347297o.setText("not passed: signature success without fingerprint authentication");
                C117292a.m165361g(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } catch (SignatureException e) {
                Log.m105920e("MicroMsg.SoterTestUI", "hy: occurred exception when sign: " + e.toString());
                SoterTestUI soterTestUI = this.f63054d;
                C21527b bVar = new C21527b(soterTestUI);
                C21527b.C21532e eVar = C21527b.f60988b;
                if (!eVar.isHardwareDetected(soterTestUI) || !eVar.mo33737b(bVar.f60989a)) {
                    Log.m105920e("MicroMsg.SoterTestUI", "hy: no hardware detected or no fingerprint registered");
                } else {
                    eVar.mo33736a(bVar.f60989a, new C21527b.C21531d(d), 0, (CancellationSignal) null, new C22254a(d), (Handler) null);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        } else {
            Log.m105920e("MicroMsg.SoterTestUI", "hy: signature is null. do sign failed");
            C117292a.m165361g(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
