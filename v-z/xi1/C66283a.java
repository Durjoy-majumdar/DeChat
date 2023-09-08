package xi1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import yi1.C66654a;

/* renamed from: xi1.a */
public final class C66283a {

    /* renamed from: a */
    public final View f190818a;

    /* renamed from: b */
    public final C66654a f190819b;

    /* renamed from: c */
    public final ViewGroup f190820c;

    /* renamed from: d */
    public final TextView f190821d;

    /* renamed from: xi1.a$a */
    public static final class C66284a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66283a f190822d;

        public C66284a(C66283a aVar) {
            this.f190822d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/milestone/banner/LiveMilestoneBannerWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f190822d.f190819b.mo74701H2();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/milestone/banner/LiveMilestoneBannerWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C66283a(View view, C66654a aVar) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(aVar, "adapter");
        this.f190818a = view;
        this.f190819b = aVar;
        View findViewById = view.findViewById(C0966R.C0970id.od_);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.f…stone_banner_item_layout)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.f190820c = viewGroup;
        View findViewById2 = view.findViewById(C0966R.C0970id.oh6);
        C87412m.m108593f(findViewById2, "root.findViewById<TextView>(R.id.milestone_text)");
        this.f190821d = (TextView) findViewById2;
        viewGroup.setOnClickListener(new C66284a(this));
    }
}
