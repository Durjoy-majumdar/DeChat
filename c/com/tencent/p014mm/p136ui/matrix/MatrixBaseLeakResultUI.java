package com.tencent.p014mm.p136ui.matrix;

import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import kotlin.Metadata;
import p910lj.C76701a;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/matrix/MatrixBaseLeakResultUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-performance_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI */
public abstract class MatrixBaseLeakResultUI extends VASActivity {

    /* renamed from: d */
    public int f250202d = 3;

    /* renamed from: e */
    public int f250203e = 2;

    /* renamed from: f */
    public final MTimerHandler f250204f = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C85885a(this), true);

    /* renamed from: com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI$a */
    public static final class C85885a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ MatrixBaseLeakResultUI f250205d;

        /* renamed from: com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI$a$a */
        public static final class C85886a implements MenuItem.OnMenuItemClickListener {

            /* renamed from: d */
            public final /* synthetic */ MatrixBaseLeakResultUI f250206d;

            /* renamed from: com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI$a$a$a */
            public static final class C85887a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ MatrixBaseLeakResultUI f250207d;

                public C85887a(MatrixBaseLeakResultUI matrixBaseLeakResultUI) {
                    this.f250207d = matrixBaseLeakResultUI;
                }

                public final void run() {
                    this.f250207d.f250203e = 2;
                }
            }

            public C85886a(MatrixBaseLeakResultUI matrixBaseLeakResultUI) {
                this.f250206d = matrixBaseLeakResultUI;
            }

            public final boolean onMenuItemClick(MenuItem menuItem) {
                Log.m105924i("MicroMsg.MatrixBaseLeakResultUI", "confirmed ");
                MatrixBaseLeakResultUI matrixBaseLeakResultUI = this.f250206d;
                if (matrixBaseLeakResultUI.f250202d > 0) {
                    return false;
                }
                int i = matrixBaseLeakResultUI.f250203e - 1;
                matrixBaseLeakResultUI.f250203e = i;
                if (i > 0) {
                    ((C119157j) C119157j.f356862d).mo183894y("Click-Count-Down");
                    C76701a.makeText(this.f250206d.getApplicationContext(), (CharSequence) "再点 " + this.f250206d.f250203e + " 次", 1).show();
                    ((C119157j) C119157j.f356862d).mo183879j(new C85887a(this.f250206d), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, "Click-Count-Down");
                    return false;
                }
                matrixBaseLeakResultUI.finish();
                return false;
            }
        }

        public C85885a(MatrixBaseLeakResultUI matrixBaseLeakResultUI) {
            this.f250205d = matrixBaseLeakResultUI;
        }

        public final boolean onTimerExpired() {
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(this.f250205d.f250202d);
            sb.append(')');
            String sb4 = sb.toString();
            MatrixBaseLeakResultUI matrixBaseLeakResultUI = this.f250205d;
            if (matrixBaseLeakResultUI.f250202d <= 0) {
                sb4 = "";
            }
            String str = this.f250205d.getString(C0966R.string.f8014z_) + sb4;
            MatrixBaseLeakResultUI matrixBaseLeakResultUI2 = this.f250205d;
            matrixBaseLeakResultUI.addTextOptionMenu(1, str, new C85886a(matrixBaseLeakResultUI2), (View.OnLongClickListener) null, matrixBaseLeakResultUI2.f250202d <= 0 ? MMActivityController.C73075r.GREEN : MMActivityController.C73075r.NORMAL);
            MatrixBaseLeakResultUI matrixBaseLeakResultUI3 = this.f250205d;
            int i = matrixBaseLeakResultUI3.f250202d - 1;
            matrixBaseLeakResultUI3.f250202d = i;
            return i >= 0;
        }
    }

    public void onBackPressed() {
    }

    public boolean onClickDialogSpaceOnHalfScreenMode() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtnVisible(false);
        this.f250204f.startTimer(1000);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f250204f.stopTimer();
    }
}
