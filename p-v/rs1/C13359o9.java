package rs1;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import er1.C58784w3;
import gy3.C87412m;

/* renamed from: rs1.o9 */
public final class C13359o9 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f37866d;

    /* renamed from: e */
    public final /* synthetic */ C13146c9 f37867e;

    /* renamed from: f */
    public final /* synthetic */ TextView f37868f;

    public C13359o9(Bitmap bitmap, C13146c9 c9Var, TextView textView) {
        this.f37866d = bitmap;
        this.f37867e = c9Var;
        this.f37868f = textView;
    }

    public final void run() {
        Bitmap bitmap = this.f37866d;
        if (bitmap != null) {
            C13146c9 c9Var = this.f37867e;
            TextView textView = this.f37868f;
            int dimension = (int) c9Var.getContext().getResources().getDimension(C0966R.dimen.f3743cv);
            if (textView != null) {
                C58784w3 w3Var = C58784w3.f168295a;
                Activity context = c9Var.getContext();
                String string = c9Var.getContext().getString(C0966R.string.fnn);
                C87412m.m108593f(string, "context.getString(com.te…ring.finder_fav_feed_new)");
                textView.setText(w3Var.mo83960r1(context, string, '#', new BitmapDrawable(bitmap), C0966R.color.a7f, dimension, dimension));
            }
        }
    }
}
