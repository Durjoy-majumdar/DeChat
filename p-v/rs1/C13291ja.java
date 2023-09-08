package rs1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import er1.C58784w3;
import gy3.C87412m;

/* renamed from: rs1.ja */
public final class C13291ja implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f37724d;

    /* renamed from: e */
    public final /* synthetic */ TextView f37725e;

    /* renamed from: f */
    public final /* synthetic */ C13334ma f37726f;

    /* renamed from: g */
    public final /* synthetic */ int f37727g;

    public C13291ja(Bitmap bitmap, TextView textView, C13334ma maVar, int i) {
        this.f37724d = bitmap;
        this.f37725e = textView;
        this.f37726f = maVar;
        this.f37727g = i;
    }

    public final void run() {
        Bitmap bitmap = this.f37724d;
        if (bitmap != null) {
            TextView textView = this.f37725e;
            C13334ma maVar = this.f37726f;
            int i = this.f37727g;
            if (textView != null) {
                C58784w3 w3Var = C58784w3.f168295a;
                AppCompatActivity activity = maVar.getActivity();
                String string = maVar.getContext().getString(C0966R.string.meh);
                C87412m.m108593f(string, "context.getString(R.stri…_star_guide_dialog_title)");
                textView.setText(w3Var.mo83960r1(activity, string, '#', new BitmapDrawable(bitmap), C0966R.color.FG_0, i, i));
            }
        }
    }
}
