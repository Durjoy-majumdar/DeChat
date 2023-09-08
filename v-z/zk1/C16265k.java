package zk1;

import android.widget.TextView;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import qn3.C77382c;
import rx3.C36570n;

/* renamed from: zk1.k */
public final class C16265k implements C77382c.C77383a {

    /* renamed from: d */
    public final /* synthetic */ C16229h f43552d;

    public C16265k(C16229h hVar) {
        this.f43552d = hVar;
    }

    /* renamed from: L0 */
    public void mo4083L0(String str) {
        ((TextView) ((C36570n) this.f43552d.f43493q).getValue()).setText("0");
    }

    /* renamed from: L3 */
    public void mo4084L3(String str) {
    }

    /* renamed from: P4 */
    public void mo4086P4(String str) {
        int b = C45078p0.m49923b(this.f43552d.f43475R, str) / 2;
        if (b < 0) {
            b = 0;
        }
        ((TextView) ((C36570n) this.f43552d.f43493q).getValue()).setText(String.valueOf(b));
    }
}
