package if2;

import android.widget.TextView;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import rx3.C36570n;

/* renamed from: if2.e */
public final class C8892e implements C75597w2.C31525a {

    /* renamed from: a */
    public final /* synthetic */ C8887d f28162a;

    /* renamed from: b */
    public final /* synthetic */ String f28163b;

    public C8892e(C8887d dVar, String str) {
        this.f28162a = dVar;
        this.f28163b = str;
    }

    /* renamed from: a */
    public final void mo1109a(String str, boolean z) {
        if (z) {
            ((TextView) ((C36570n) this.f28162a.f28155e).getValue()).setText(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str).getNickname());
            return;
        }
        ((TextView) ((C36570n) this.f28162a.f28155e).getValue()).setText(this.f28163b);
    }
}
