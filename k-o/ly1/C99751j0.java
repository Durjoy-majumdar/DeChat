package ly1;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import ic0.C21070h;
import jc0.C21210b;
import zt3.C119157j;

/* renamed from: ly1.j0 */
public class C99751j0 implements C21070h {

    /* renamed from: a */
    public final /* synthetic */ ImageView f292356a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f292357b;

    /* renamed from: ly1.j0$a */
    public class C99752a implements Runnable {
        public C99752a() {
        }

        public void run() {
            C99751j0.this.f292356a.setVisibility(0);
            C99751j0.this.f292357b.setVisibility(8);
        }
    }

    public C99751j0(C99757m0 m0Var, ImageView imageView, ImageView imageView2) {
        this.f292356a = imageView;
        this.f292357b = imageView2;
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
    }

    /* renamed from: b */
    public void mo6677b(String str, View view, C21210b bVar) {
        ((C119157j) C119157j.f356862d).mo183895z(new C99752a());
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        return null;
    }
}
