package xz0;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import dz0.C20483c;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import te3.C22498fy;
import wz0.C22945n;
import wz0.C53263p;

/* renamed from: xz0.f */
public class C23151f extends C23145a {

    /* renamed from: g */
    public View f66500g;

    /* renamed from: h */
    public TextView f66501h;

    /* renamed from: i */
    public TextView f66502i;

    /* renamed from: j */
    public View f66503j;

    /* renamed from: k */
    public TextView f66504k;

    /* renamed from: l */
    public TextView f66505l;

    /* renamed from: m */
    public View f66506m;

    /* renamed from: n */
    public View f66507n;

    /* renamed from: o */
    public View f66508o;

    public C23151f(Context context) {
        super(context);
    }

    /* renamed from: g */
    public void mo36528g() {
        this.f66500g = this.f66474c.findViewById(C0966R.C0970id.hsg);
        this.f66501h = (TextView) this.f66474c.findViewById(C0966R.C0970id.hsi);
        this.f66502i = (TextView) this.f66474c.findViewById(C0966R.C0970id.hsh);
        this.f66503j = this.f66474c.findViewById(C0966R.C0970id.f357513a92);
        this.f66504k = (TextView) this.f66474c.findViewById(C0966R.C0970id.a94);
        this.f66505l = (TextView) this.f66474c.findViewById(C0966R.C0970id.f357514a93);
        this.f66507n = this.f66474c.findViewById(C0966R.C0970id.axu);
        this.f66508o = this.f66474c.findViewById(C0966R.C0970id.asm);
    }

    /* renamed from: h */
    public void mo36529h() {
        C22498fy fyVar;
        if (this.f66472a.mo23264L0().f64149s == null || this.f66472a.mo23264L0().f64149s.size() <= 0) {
            Log.m105924i("MicroMsg.CardWidgetInvoice", "primary_fields is null");
        } else {
            LinkedList<C22498fy> linkedList = this.f66472a.mo23264L0().f64149s;
            C22498fy fyVar2 = null;
            if (linkedList.size() == 1) {
                fyVar = linkedList.get(0);
            } else {
                C22498fy fyVar3 = linkedList.get(0);
                fyVar2 = linkedList.get(1);
                fyVar = fyVar3;
            }
            if (fyVar != null) {
                View view = this.f66500g;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "uppdatePrimaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "uppdatePrimaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f66501h.setText(fyVar.f63884d);
                this.f66502i.setText(fyVar.f63885e);
                if (!TextUtils.isEmpty(fyVar.f63889i)) {
                    this.f66501h.setTextColor(C22945n.m27004d(fyVar.f63889i));
                }
                if (!TextUtils.isEmpty(fyVar.f63890j)) {
                    this.f66502i.setTextColor(C22945n.m27004d(fyVar.f63890j));
                }
            }
            if (fyVar2 != null) {
                View view2 = this.f66503j;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "uppdatePrimaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "uppdatePrimaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f66504k.setText(fyVar2.f63884d);
                this.f66505l.setText(fyVar2.f63885e);
                if (!TextUtils.isEmpty(fyVar2.f63889i)) {
                    this.f66504k.setTextColor(C22945n.m27004d(fyVar2.f63889i));
                }
                if (!TextUtils.isEmpty(fyVar2.f63890j)) {
                    this.f66505l.setTextColor(C22945n.m27004d(fyVar2.f63890j));
                }
            }
        }
        if (this.f66472a.mo23267O() && !this.f66472a.mo23285h2()) {
            Log.m105924i("MicroMsg.CardWidgetInvoice", "is not invoice, don't updateCardSecondaryFieldListView");
        } else if (this.f66472a.mo23263J0().f63952q == null || this.f66472a.mo23263J0().f63952q.size() < 1) {
            View view4 = this.f66506m;
            if (view4 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "updateCardSecondaryFieldListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "updateCardSecondaryFieldListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById = this.f66474c.findViewById(C0966R.C0970id.asm);
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view6 = findViewById;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "updateCardSecondaryFieldListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "updateCardSecondaryFieldListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            if (this.f66506m == null) {
                this.f66506m = ((ViewStub) this.f66474c.findViewById(C0966R.C0970id.awx)).inflate();
            }
            View findViewById2 = this.f66474c.findViewById(C0966R.C0970id.asm);
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view7 = findViewById2;
            C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "updateCardSecondaryFieldListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "updateCardSecondaryFieldListView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view8 = this.f66506m;
            C20483c cVar = this.f66472a;
            View.OnClickListener onClickListener = this.f66477f;
            LinkedList<C22498fy> linkedList2 = cVar.mo23263J0().f63952q;
            if (linkedList2.size() == 1) {
                View findViewById3 = view8.findViewById(C0966R.C0970id.f357634ax1);
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(0);
                View view9 = findViewById3;
                C117292a.m165358d(view9, aVar6.mo10232b(), "com/tencent/mm/plugin/card/util/CardViewUtil", "updateCardSecondaryFieldListView", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/card/util/CardViewUtil", "updateCardSecondaryFieldListView", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C22498fy fyVar4 = linkedList2.get(0);
                ((TextView) view8.findViewById(C0966R.C0970id.j7j)).setText(fyVar4.f63884d);
                ((TextView) view8.findViewById(C0966R.C0970id.j7g)).setText(fyVar4.f63885e);
                view8.findViewById(C0966R.C0970id.f357634ax1).setOnClickListener(onClickListener);
                if (!TextUtils.isEmpty(fyVar4.f63889i)) {
                    ((TextView) view8.findViewById(C0966R.C0970id.j7j)).setTextColor(C22945n.m27004d(fyVar4.f63889i));
                }
                if (!TextUtils.isEmpty(fyVar4.f63890j)) {
                    ((TextView) view8.findViewById(C0966R.C0970id.j7g)).setTextColor(C22945n.m27004d(fyVar4.f63890j));
                }
                View findViewById4 = view8.findViewById(C0966R.C0970id.f357635ax2);
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(8);
                View view10 = findViewById4;
                C117292a.m165358d(view10, aVar7.mo10232b(), "com/tencent/mm/plugin/card/util/CardViewUtil", "updateCardSecondaryFieldListView", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/card/util/CardViewUtil", "updateCardSecondaryFieldListView", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (linkedList2.size() >= 2) {
                C22498fy fyVar5 = linkedList2.get(0);
                ((TextView) view8.findViewById(C0966R.C0970id.j7j)).setText(fyVar5.f63884d);
                ((TextView) view8.findViewById(C0966R.C0970id.j7g)).setText(fyVar5.f63885e);
                if (!TextUtils.isEmpty(fyVar5.f63889i)) {
                    ((TextView) view8.findViewById(C0966R.C0970id.j7j)).setTextColor(C22945n.m27004d(fyVar5.f63889i));
                }
                if (!TextUtils.isEmpty(fyVar5.f63890j)) {
                    ((TextView) view8.findViewById(C0966R.C0970id.j7g)).setTextColor(C22945n.m27004d(fyVar5.f63890j));
                }
                C22498fy fyVar6 = linkedList2.get(1);
                ((TextView) view8.findViewById(C0966R.C0970id.j7k)).setText(fyVar6.f63884d);
                ((TextView) view8.findViewById(C0966R.C0970id.j7h)).setText(fyVar6.f63885e);
                if (!TextUtils.isEmpty(fyVar6.f63889i)) {
                    ((TextView) view8.findViewById(C0966R.C0970id.j7k)).setTextColor(C22945n.m27004d(fyVar6.f63889i));
                }
                if (!TextUtils.isEmpty(fyVar6.f63890j)) {
                    ((TextView) view8.findViewById(C0966R.C0970id.j7h)).setTextColor(C22945n.m27004d(fyVar6.f63890j));
                }
                view8.findViewById(C0966R.C0970id.f357634ax1).setOnClickListener(onClickListener);
                view8.findViewById(C0966R.C0970id.f357635ax2).setOnClickListener(onClickListener);
            }
        }
        if (this.f66472a.mo23296v1()) {
            View view11 = this.f66507n;
            C9556a aVar8 = new C9556a();
            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
            aVar8.mo10233c(8);
            View view12 = view11;
            C117292a.m165358d(view12, aVar8.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view13 = this.f66507n;
            C9556a aVar9 = new C9556a();
            ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
            aVar9.mo10233c(0);
            View view14 = view13;
            C117292a.m165358d(view14, aVar9.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view14, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView = (TextView) this.f66507n.findViewById(C0966R.C0970id.ax_);
            if (!TextUtils.isEmpty(this.f66472a.mo23264L0().f64124T)) {
                textView.setText(this.f66472a.mo23264L0().f64124T);
            } else {
                C53263p.m59704e(textView, this.f66472a.mo23263J0().f63942d);
            }
        }
        if (this.f66472a.mo23263J0().f63961z != null || !this.f66472a.mo23296v1()) {
            View view15 = this.f66508o;
            C9556a aVar10 = new C9556a();
            aVar10.mo10233c(8);
            View view16 = view15;
            C117292a.m165358d(view16, aVar10.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view16, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view17 = this.f66508o;
        C9556a aVar11 = new C9556a();
        aVar11.mo10233c(0);
        View view18 = view17;
        C117292a.m165358d(view18, aVar11.mo10232b(), "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view17.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
        C117292a.m165359e(view18, "com/tencent/mm/plugin/card/widget/CardWidgetInvoice", "refreshExtraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
