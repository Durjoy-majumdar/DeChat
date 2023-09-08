package vz0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import te3.C22498fy;
import te3.C77968n40;

/* renamed from: vz0.o */
public class C78497o extends C22821l {

    /* renamed from: b */
    public View f229934b;

    /* renamed from: c */
    public LinearLayout f229935c;

    /* renamed from: d */
    public boolean f229936d = false;

    /* renamed from: vz0.o$a */
    public class C78498a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77968n40 f229937d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList f229938e;

        /* renamed from: f */
        public final /* synthetic */ LayoutInflater f229939f;

        public C78498a(C77968n40 n402, LinkedList linkedList, LayoutInflater layoutInflater) {
            this.f229937d = n402;
            this.f229938e = linkedList;
            this.f229939f = layoutInflater;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/view/CardDetailTableView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C78497o oVar = C78497o.this;
            oVar.f229936d = true;
            View findViewById = oVar.f229934b.findViewById(C0966R.C0970id.c3v);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDetailTableView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/card/ui/view/CardDetailTableView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            for (int i = this.f229937d.f227879f; i < this.f229938e.size(); i++) {
                TextView textView = (TextView) this.f229939f.inflate(C0966R.C0971layout.f6784of, (ViewGroup) null, false);
                textView.setText(((C22498fy) this.f229938e.get(i)).f63884d);
                C78497o.this.f229935c.addView(textView);
            }
            C78497o.this.f229935c.invalidate();
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/view/CardDetailTableView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: c */
    public void mo35949c() {
    }

    /* renamed from: d */
    public void mo35950d(int i) {
        View view = this.f229934b;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDetailTableView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardDetailTableView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e */
    public void mo35951e() {
        if (this.f229934b == null) {
            this.f229934b = ((ViewStub) mo35969b(C0966R.C0970id.f357621au0)).inflate();
        }
        C77968n40 n402 = ((CardDetailUIContoller) this.f65616a).f51776E.mo23263J0().f63961z;
        ((TextView) this.f229934b.findViewById(C0966R.C0970id.c3x)).setText(n402.f227877d);
        LinkedList<C22498fy> linkedList = n402.f227880g;
        if (linkedList != null && linkedList.size() > 0) {
            LinearLayout linearLayout = (LinearLayout) this.f229934b.findViewById(C0966R.C0970id.c3w);
            this.f229935c = linearLayout;
            linearLayout.removeAllViews();
            LinkedList<C22498fy> linkedList2 = n402.f227880g;
            LayoutInflater layoutInflater = (LayoutInflater) ((CardDetailUIContoller) this.f65616a).f51797e.getSystemService("layout_inflater");
            if (n402.f227879f >= linkedList2.size() || this.f229936d) {
                View findViewById = this.f229934b.findViewById(C0966R.C0970id.c3v);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDetailTableView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/view/CardDetailTableView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                for (int i = 0; i < linkedList2.size(); i++) {
                    TextView textView = (TextView) layoutInflater.inflate(C0966R.C0971layout.f6784of, (ViewGroup) null, false);
                    textView.setText(linkedList2.get(i).f63884d);
                    this.f229935c.addView(textView);
                }
                this.f229935c.invalidate();
                return;
            }
            for (int i2 = 0; i2 < n402.f227879f; i2++) {
                TextView textView2 = (TextView) layoutInflater.inflate(C0966R.C0971layout.f6784of, (ViewGroup) null, false);
                textView2.setText(linkedList2.get(i2).f63884d);
                this.f229935c.addView(textView2);
            }
            this.f229935c.invalidate();
            View findViewById2 = this.f229934b.findViewById(C0966R.C0970id.c3v);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardDetailTableView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardDetailTableView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f229934b.findViewById(C0966R.C0970id.c3v).setOnClickListener(new C78498a(n402, linkedList2, layoutInflater));
        }
    }
}
