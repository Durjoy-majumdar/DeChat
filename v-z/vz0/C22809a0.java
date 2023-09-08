package vz0;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import com.tencent.p014mm.sdk.platformtools.Util;
import dz0.C20483c;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import rz0.C22286g;
import te3.C22498fy;
import wz0.C22945n;

/* renamed from: vz0.a0 */
public class C22809a0 extends C22821l {

    /* renamed from: b */
    public View f65577b;

    /* renamed from: c */
    public View f65578c;

    /* renamed from: c */
    public void mo35949c() {
    }

    /* renamed from: d */
    public void mo35950d(int i) {
        View view = this.f65577b;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f65578c;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i));
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: e */
    public void mo35951e() {
        int i;
        int i2;
        CardDetailUIContoller cardDetailUIContoller = (CardDetailUIContoller) this.f65616a;
        C20483c cVar = cardDetailUIContoller.f51776E;
        C22286g gVar = cardDetailUIContoller.f51798f;
        if (cVar.mo23263J0().f63952q != null && cVar.mo23263J0().f63952q.size() > 1) {
            if (this.f65577b == null) {
                this.f65577b = ((ViewStub) mo35969b(C0966R.C0970id.awz)).inflate();
            }
            View view = this.f65578c;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            CardDetailUIContoller cardDetailUIContoller2 = (CardDetailUIContoller) this.f65616a;
            MMActivity mMActivity = cardDetailUIContoller2.f51797e;
            View view3 = this.f65577b;
            View.OnClickListener onClickListener = cardDetailUIContoller2.f51794X;
            LinkedList<C22498fy> linkedList = cVar.mo23263J0().f63952q;
            int d = C22945n.m27004d(cVar.mo23264L0().f64145p);
            ViewGroup viewGroup = (ViewGroup) view3;
            viewGroup.removeAllViews();
            Iterator<C22498fy> it = linkedList.iterator();
            while (it.hasNext()) {
                C22498fy next = it.next();
                View inflate = C85868k2.m106137b(mMActivity).inflate(C0966R.C0971layout.f6766ny, viewGroup, false);
                inflate.setId(C0966R.C0970id.f357633ax0);
                inflate.setTag(Integer.valueOf(linkedList.indexOf(next)));
                inflate.setOnClickListener(onClickListener);
                if (TextUtils.isEmpty(next.f63887g) && Util.isNullOrNil(next.f63893p)) {
                    inflate.setEnabled(false);
                }
                ((TextView) inflate.findViewById(C0966R.C0970id.j7i)).setText(next.f63884d);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.j7f);
                textView.setText(next.f63885e);
                textView.setTextColor(d);
                viewGroup.addView(inflate);
                if (linkedList.indexOf(next) + 1 != linkedList.size()) {
                    viewGroup.addView(C85868k2.m106137b(mMActivity).inflate(C0966R.C0971layout.f6767nz, viewGroup, false));
                }
            }
            if (!cVar.mo23291o() || cVar.mo23263J0().f63959x == null || TextUtils.isEmpty(cVar.mo23263J0().f63959x.f63884d)) {
                i2 = C0966R.C0969drawable.ags;
            } else {
                View view4 = this.f65577b;
                i2 = C0966R.C0969drawable.ags;
                view4.setBackgroundResource(C0966R.C0969drawable.ags);
            }
            if (!cVar.mo23291o() && gVar.mo35427a()) {
                this.f65577b.setBackgroundResource(i2);
            }
        } else if (cVar.mo23263J0().f63952q == null || cVar.mo23263J0().f63952q.size() != 1) {
            View view5 = this.f65577b;
            if (view5 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view7 = this.f65578c;
            if (view7 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar3.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            if (this.f65578c == null) {
                this.f65578c = ((ViewStub) mo35969b(C0966R.C0970id.awy)).inflate();
            }
            View view9 = this.f65577b;
            if (view9 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view10 = view9;
                C117292a.m165358d(view10, aVar4.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/card/ui/view/CardSecondaryFieldView", "updateCardSecondaryFieldView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view11 = this.f65578c;
            View.OnClickListener onClickListener2 = ((CardDetailUIContoller) this.f65616a).f51794X;
            LinkedList<C22498fy> linkedList2 = cVar.mo23263J0().f63952q;
            if (linkedList2.size() == 1) {
                View findViewById = view11.findViewById(C0966R.C0970id.f357634ax1);
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(0);
                C117292a.m165358d(findViewById, aVar5.mo10232b(), "com/tencent/mm/plugin/card/util/CardViewUtil", "updateCardSecondaryFieldSingleView", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view12 = findViewById;
                view12.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/card/util/CardViewUtil", "updateCardSecondaryFieldSingleView", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C22498fy fyVar = linkedList2.get(0);
                ((TextView) view11.findViewById(C0966R.C0970id.j7j)).setText(fyVar.f63884d);
                ((TextView) view11.findViewById(C0966R.C0970id.j7g)).setText(fyVar.f63885e);
                ((TextView) view11.findViewById(C0966R.C0970id.j7g)).setTextColor(C22945n.m27004d(cVar.mo23264L0().f64145p));
                view11.findViewById(C0966R.C0970id.f357634ax1).setOnClickListener(onClickListener2);
                if (TextUtils.isEmpty(fyVar.f63887g)) {
                    view11.findViewById(C0966R.C0970id.f357634ax1).setEnabled(false);
                }
            }
            if (!cVar.mo23291o() || cVar.mo23263J0().f63959x == null || TextUtils.isEmpty(cVar.mo23263J0().f63959x.f63884d)) {
                i = C0966R.C0969drawable.ags;
            } else {
                View view13 = this.f65578c;
                i = C0966R.C0969drawable.ags;
                view13.setBackgroundResource(C0966R.C0969drawable.ags);
            }
            if (!cVar.mo23291o() && gVar.mo35427a()) {
                this.f65578c.setBackgroundResource(i);
            }
        }
    }
}
