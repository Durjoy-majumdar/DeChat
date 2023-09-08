package f83;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.websearch.p898ui.WebSearchImageLoadingUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: f83.a */
public final class C97845a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebSearchImageLoadingUI f286997d;

    /* renamed from: f83.a$a */
    public static final class C97846a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WebSearchImageLoadingUI f286998d;

        public C97846a(WebSearchImageLoadingUI webSearchImageLoadingUI) {
            this.f286998d = webSearchImageLoadingUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/websearch/ui/WebSearchImageLoadingUI$onError$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f286998d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/websearch/ui/WebSearchImageLoadingUI$onError$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C97845a(WebSearchImageLoadingUI webSearchImageLoadingUI) {
        this.f286997d = webSearchImageLoadingUI;
    }

    public final void run() {
        ((MMAnimateView) this.f286997d.findViewById(C0966R.C0970id.g3d)).setVisibility(8);
        ((TextView) this.f286997d.findViewById(C0966R.C0970id.g3r)).setVisibility(8);
        ((TextView) this.f286997d.findViewById(C0966R.C0970id.f357940cl1)).setVisibility(8);
        ((Button) this.f286997d.findViewById(C0966R.C0970id.cks)).setVisibility(8);
        ((TextView) this.f286997d.findViewById(C0966R.C0970id.cn4)).setVisibility(0);
        ((Button) this.f286997d.findViewById(C0966R.C0970id.f357950cn3)).setVisibility(0);
        ((Button) this.f286997d.findViewById(C0966R.C0970id.f357950cn3)).setOnClickListener(new C97846a(this.f286997d));
    }
}
