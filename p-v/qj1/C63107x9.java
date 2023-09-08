package qj1;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.x9 */
public final class C63107x9 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f179085d;

    /* renamed from: e */
    public final /* synthetic */ C63049v9 f179086e;

    /* renamed from: f */
    public final /* synthetic */ String f179087f;

    /* renamed from: g */
    public final /* synthetic */ int f179088g;

    /* renamed from: h */
    public final /* synthetic */ int f179089h;

    /* renamed from: i */
    public final /* synthetic */ PointF f179090i;

    /* renamed from: j */
    public final /* synthetic */ PointF f179091j;

    /* renamed from: n */
    public final /* synthetic */ PointF f179092n;

    /* renamed from: o */
    public final /* synthetic */ PointF f179093o;

    /* renamed from: p */
    public final /* synthetic */ PointF f179094p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63107x9(Bitmap bitmap, C63049v9 v9Var, String str, int i, int i2, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, PointF pointF5) {
        super(0);
        this.f179085d = bitmap;
        this.f179086e = v9Var;
        this.f179087f = str;
        this.f179088g = i;
        this.f179089h = i2;
        this.f179090i = pointF;
        this.f179091j = pointF2;
        this.f179092n = pointF3;
        this.f179093o = pointF4;
        this.f179094p = pointF5;
    }

    public Object invoke() {
        if (this.f179085d != null) {
            ImageView imageView = new ImageView(this.f179086e.f166287d.getContext());
            imageView.setImageBitmap(this.f179085d);
            int i = this.f179086e.f178921G;
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, i);
            int i2 = this.f179088g;
            int i3 = this.f179089h;
            marginLayoutParams.setMarginStart(i2);
            marginLayoutParams.topMargin = i3;
            imageView.setLayoutParams(marginLayoutParams);
            this.f179086e.mo87987b1().addView(imageView);
            imageView.setAlpha(0.0f);
            imageView.post(new C63087w9(imageView, this.f179086e, this.f179090i, this.f179091j, this.f179092n, this.f179093o, this.f179094p));
        } else {
            String str = this.f179086e.f178936q;
            Log.m105928w(str, "loadOthersAvatar fail: " + this.f179087f);
        }
        return C13598b0.f38549a;
    }
}
