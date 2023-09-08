package qj1;

import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import y50.C15936n0;

/* renamed from: qj1.c3 */
public final class C62666c3 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C62627a3 f177950d;

    /* renamed from: qj1.c3$a */
    public static final class C62667a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62627a3 f177951d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62667a(C62627a3 a3Var) {
            super(0);
            this.f177951d = a3Var;
        }

        public Object invoke() {
            C62627a3 a3Var = this.f177951d;
            TextView textView = a3Var.f177841r;
            C15936n0.C15937a aVar = C15936n0.f42815a;
            int i = a3Var.f177842s + 1;
            a3Var.f177842s = i;
            textView.setText(aVar.mo14587b(i, XVFSFile.PATH_SEPARATOR));
            return C13598b0.f38549a;
        }
    }

    public C62666c3(C62627a3 a3Var) {
        this.f177950d = a3Var;
    }

    public final boolean onTimerExpired() {
        C61926c.m72668M(new C62667a(this.f177950d));
        return true;
    }
}
