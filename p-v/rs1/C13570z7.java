package rs1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import er1.C58784w3;
import gy3.C87412m;

/* renamed from: rs1.z7 */
public final class C13570z7 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f38493d;

    /* renamed from: e */
    public final /* synthetic */ TextView f38494e;

    /* renamed from: f */
    public final /* synthetic */ C13549y7 f38495f;

    /* renamed from: g */
    public final /* synthetic */ int f38496g;

    public C13570z7(Bitmap bitmap, TextView textView, C13549y7 y7Var, int i) {
        this.f38493d = bitmap;
        this.f38494e = textView;
        this.f38495f = y7Var;
        this.f38496g = i;
    }

    public final void run() {
        Bitmap bitmap = this.f38493d;
        if (bitmap != null) {
            TextView textView = this.f38494e;
            C13549y7 y7Var = this.f38495f;
            int i = this.f38496g;
            if (textView != null) {
                C58784w3 w3Var = C58784w3.f168295a;
                AppCompatActivity activity = y7Var.getActivity();
                String string = y7Var.getContext().getString(C0966R.string.mee);
                C87412m.m108593f(string, "context.getString(R.stri…ate_migrate_dialog_title)");
                textView.setText(w3Var.mo83960r1(activity, string, '#', new BitmapDrawable(bitmap), C0966R.color.FG_0, i, i));
            }
        }
    }
}
