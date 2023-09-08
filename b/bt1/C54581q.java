package bt1;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import gy3.C8477a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: bt1.q */
public final class C54581q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C8477a0 f153038d;

    /* renamed from: e */
    public final /* synthetic */ C54585t f153039e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f153040f;

    /* renamed from: bt1.q$a */
    public static final class C54582a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C54585t f153041d;

        public C54582a(C54585t tVar) {
            this.f153041d = tVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$initNormalVideoLogic$2$1$3$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f153041d.mo75485q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$initNormalVideoLogic$2$1$3$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C54581q(C8477a0 a0Var, C54585t tVar, Bitmap bitmap) {
        this.f153038d = a0Var;
        this.f153039e = tVar;
        this.f153040f = bitmap;
    }

    public final void run() {
        if (this.f153038d.f27482d) {
            C54585t tVar = this.f153039e;
            Bitmap bitmap = this.f153040f;
            C87412m.m108593f(bitmap, "thumb");
            tVar.mo75445i(bitmap);
            C54585t tVar2 = this.f153039e;
            ImageView imageView = tVar2.f153050f;
            if (imageView != null) {
                imageView.setOnClickListener(new C54582a(tVar2));
            } else {
                C87412m.m108603p("thumbIv");
                throw null;
            }
        }
    }
}
