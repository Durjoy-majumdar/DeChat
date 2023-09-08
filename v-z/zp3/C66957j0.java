package zp3;

import android.graphics.Rect;
import com.tencent.p014mm.C0966R;

/* renamed from: zp3.j0 */
public final class C66957j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112661i0 f192359d;

    /* renamed from: e */
    public final /* synthetic */ int f192360e;

    public C66957j0(C112661i0 i0Var, int i) {
        this.f192359d = i0Var;
        this.f192360e = i;
    }

    public final void run() {
        this.f192359d.getWindowVisibleDisplayFrame(new Rect());
        this.f192359d.findViewById(C0966R.C0970id.agw).setPadding(0, 0, 0, this.f192360e);
    }
}
