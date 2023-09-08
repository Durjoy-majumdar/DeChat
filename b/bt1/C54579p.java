package bt1;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: bt1.p */
public final class C54579p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C54585t f153035d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f153036e;

    /* renamed from: bt1.p$a */
    public static final class C54580a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C54585t f153037d;

        public C54580a(C54585t tVar) {
            this.f153037d = tVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$initNormalVideoLogic$2$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f153037d.mo75485q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$initNormalVideoLogic$2$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C54579p(C54585t tVar, Bitmap bitmap) {
        this.f153035d = tVar;
        this.f153036e = bitmap;
    }

    public final void run() {
        Log.m105924i("Finder.PostVideoWidget", "set coverUrl");
        C54585t tVar = this.f153035d;
        Bitmap bitmap = this.f153036e;
        C87412m.m108593f(bitmap, "cover");
        tVar.mo75445i(bitmap);
        C54585t tVar2 = this.f153035d;
        ImageView imageView = tVar2.f153050f;
        if (imageView != null) {
            imageView.setOnClickListener(new C54580a(tVar2));
        } else {
            C87412m.m108603p("thumbIv");
            throw null;
        }
    }
}
