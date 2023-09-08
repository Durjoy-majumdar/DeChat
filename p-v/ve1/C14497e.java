package ve1;

import android.view.View;
import android.widget.TextView;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;

/* renamed from: ve1.e */
public final class C14497e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14533h f40185d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f40186e;

    /* renamed from: f */
    public final /* synthetic */ TextView f40187f;

    /* renamed from: g */
    public final /* synthetic */ TextView f40188g;

    /* renamed from: ve1.e$a */
    public static final class C14498a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TextView f40189d;

        public C14498a(TextView textView) {
            this.f40189d = textView;
        }

        public final void run() {
            this.f40189d.setVisibility(8);
        }
    }

    public C14497e(C14533h hVar, C60905o oVar, TextView textView, TextView textView2) {
        this.f40185d = hVar;
        this.f40186e = oVar;
        this.f40187f = textView;
        this.f40188g = textView2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C14533h.m13852j(this.f40185d, this.f40186e, false, 0);
        this.f40187f.postDelayed(new C14498a(this.f40188g), 1000);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
