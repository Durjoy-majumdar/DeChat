package wt0;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: wt0.a */
public final class C91106a extends FrameLayout implements C91114h, View.OnClickListener {

    /* renamed from: d */
    public TextView f261291d;

    /* renamed from: e */
    public final Runnable f261292e = new C91107a();

    /* renamed from: f */
    public final MMHandler f261293f = new MMHandler(Looper.getMainLooper());

    /* renamed from: g */
    public ViewPropertyAnimator f261294g;

    /* renamed from: h */
    public ViewPropertyAnimator f261295h;

    /* renamed from: wt0.a$a */
    public class C91107a implements Runnable {
        public C91107a() {
        }

        public void run() {
            C91106a aVar = C91106a.this;
            if (aVar.getAlpha() != 0.0f && aVar.f261295h == null) {
                aVar.animate().cancel();
                ViewPropertyAnimator animate = aVar.animate();
                aVar.f261295h = animate;
                animate.alpha(0.0f).setListener(new C91109c(aVar)).start();
            }
        }
    }

    public C91106a(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f6470fq, this, true);
        this.f261291d = (TextView) findViewById(C0966R.C0970id.knx);
        setOnClickListener(this);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandNewBanAlert", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandNewBanAlert", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
