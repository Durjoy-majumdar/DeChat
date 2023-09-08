package ve1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import er1.C58784w3;
import gy3.C87412m;
import jq3.C60905o;

/* renamed from: ve1.v1 */
public final class C14654v1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f40532d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f40533e;

    /* renamed from: f */
    public final /* synthetic */ TextView f40534f;

    /* renamed from: g */
    public final /* synthetic */ int f40535g;

    public C14654v1(Bitmap bitmap, C60905o oVar, TextView textView, int i) {
        this.f40532d = bitmap;
        this.f40533e = oVar;
        this.f40534f = textView;
        this.f40535g = i;
    }

    public final void run() {
        Bitmap bitmap = this.f40532d;
        if (bitmap != null) {
            C60905o oVar = this.f40533e;
            TextView textView = this.f40534f;
            int i = this.f40535g;
            int dimension = (int) oVar.f173499A.getResources().getDimension(C0966R.dimen.f3738cr);
            C58784w3 w3Var = C58784w3.f168295a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            String string = oVar.f173499A.getString(C0966R.string.mv8, new Object[]{Integer.valueOf(i)});
            C87412m.m108593f(string, "holder.context.getString…ith_icon, friendFavCount)");
            textView.setText(w3Var.mo83960r1(context, string, '#', new BitmapDrawable(bitmap), C0966R.color.f2975b6, dimension, dimension));
        }
    }
}
