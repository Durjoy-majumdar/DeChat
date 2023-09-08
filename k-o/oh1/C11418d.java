package oh1;

import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import y50.C15936n0;

/* renamed from: oh1.d */
public final class C11418d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C11415c f33591d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11418d(C11415c cVar) {
        super(0);
        this.f33591d = cVar;
    }

    public Object invoke() {
        C11415c cVar = this.f33591d;
        int i = cVar.f33583p;
        if (i > 0) {
            boolean z = i >= 3600;
            TextView textView = cVar.f33585r;
            if (textView != null) {
                textView.setText(C15936n0.C15937a.m14866a(C15936n0.f42815a, i, XVFSFile.PATH_SEPARATOR, z, false, false, 24, (Object) null));
            }
            C11415c cVar2 = this.f33591d;
            cVar2.f33583p--;
        } else {
            cVar.f33584q.stopTimer();
            ViewGroup viewGroup = cVar.f33581n;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
        return C13598b0.f38549a;
    }
}
