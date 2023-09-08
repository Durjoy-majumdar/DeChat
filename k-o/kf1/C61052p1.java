package kf1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import ur1.C65467c;

/* renamed from: kf1.p1 */
public final class C61052p1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f173876d;

    /* renamed from: e */
    public final /* synthetic */ C61028h1 f173877e;

    /* renamed from: f */
    public final /* synthetic */ String f173878f;

    /* renamed from: g */
    public final /* synthetic */ String f173879g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61052p1(Bitmap bitmap, C61028h1 h1Var, String str, String str2) {
        super(0);
        this.f173876d = bitmap;
        this.f173877e = h1Var;
        this.f173878f = str;
        this.f173879g = str2;
    }

    public Object invoke() {
        TextView textView;
        if (this.f173876d == null) {
            this.f173877e.mo85987j(this.f173878f);
        } else {
            C61028h1 h1Var = this.f173877e;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f173876d);
            String str = this.f173878f;
            C65467c cVar = h1Var.f173805n;
            if (cVar != null) {
                TextView textView2 = cVar.f188390e;
                if (textView2 != null) {
                    textView = textView2;
                } else {
                    C87412m.m108603p("headerTitleTv");
                    throw null;
                }
            } else {
                textView = null;
            }
            if (textView != null) {
                C58784w3 w3Var = C58784w3.f168295a;
                Context context = h1Var.f173798d;
                int i = h1Var.f173799e;
                textView.setText(w3Var.mo83960r1(context, str, '#', bitmapDrawable, C0966R.color.FG_0, i, i));
            }
        }
        Log.m105924i("Finder.FavListDrawerPresenter", "getImage resource :" + this.f173876d + " iconUrl:" + this.f173879g);
        return C13598b0.f38549a;
    }
}
