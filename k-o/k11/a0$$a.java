package k11;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanNewUI;
import j11.C98896e;

public final /* synthetic */ class a0$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C99083a0 f290438d;

    /* renamed from: e */
    public final /* synthetic */ long f290439e;

    public /* synthetic */ a0$$a(C99083a0 a0Var, long j) {
        this.f290438d = a0Var;
        this.f290439e = j;
    }

    public final void run() {
        long j;
        long j2;
        C99083a0 a0Var = this.f290438d;
        long j3 = this.f290439e;
        CleanNewUI cleanNewUI = a0Var.f290437a;
        String str = CleanNewUI.f267927I;
        cleanNewUI.getClass();
        C98896e wx02 = C98896e.wx0();
        synchronized (C98896e.class) {
            j = wx02.f289906d;
            j2 = wx02.f289908f;
        }
        cleanNewUI.mo127440K7(j3);
        int i = (int) ((100 * j) / C98896e.wx0().vx0()[1]);
        if (i > 0) {
            cleanNewUI.f267950u.setText(cleanNewUI.getString(C0966R.string.be5, new Object[]{i + "%"}));
        } else {
            cleanNewUI.f267950u.setText(C0966R.string.be6);
        }
        long j4 = (j - j3) - j2;
        if (j4 <= 0) {
            j4 = 0;
        }
        cleanNewUI.mo127441L7(j4);
        cleanNewUI.f267953x.setEnabled(true);
        a0Var.f290437a.f267949t = null;
    }
}
