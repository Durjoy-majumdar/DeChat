package qk1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.FinderTagFlowLayout;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import qk1.C12855y1;
import te3.C51228sd2;

/* renamed from: qk1.z1 */
public final class C12872z1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C12855y1.C12869i f36844d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C51228sd2> f36845e;

    /* renamed from: qk1.z1$a */
    public static final class C12873a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12855y1.C12869i f36846d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList<C51228sd2> f36847e;

        /* renamed from: f */
        public final /* synthetic */ LinkedList<View> f36848f;

        public C12873a(C12855y1.C12869i iVar, LinkedList<C51228sd2> linkedList, LinkedList<View> linkedList2) {
            this.f36846d = iVar;
            this.f36847e = linkedList;
            this.f36848f = linkedList2;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$RewardMemberViewHolder$addGiftItem$2$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderTagFlowLayout finderTagFlowLayout = this.f36846d.f36837E;
            StringBuilder sb = new StringBuilder();
            sb.append('x');
            sb.append(this.f36847e.get(0).f141448e);
            ((TextView) finderTagFlowLayout.getChildAt(finderTagFlowLayout.getChildCount() - 1).findViewById(C0966R.C0970id.dyh)).setText(sb.toString());
            LinkedList<View> linkedList = this.f36848f;
            C12855y1.C12869i iVar = this.f36846d;
            for (View addView : linkedList) {
                iVar.f36837E.addView(addView);
            }
            this.f36846d.f36837E.setOnClickListener((View.OnClickListener) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$RewardMemberViewHolder$addGiftItem$2$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C12872z1(C12855y1.C12869i iVar, LinkedList<C51228sd2> linkedList) {
        this.f36844d = iVar;
        this.f36845e = linkedList;
    }

    public final void run() {
        int size = ((ArrayList) this.f36844d.f36837E.f162129d).size();
        if (size > 1) {
            LinkedList linkedList = new LinkedList();
            for (int i = 1; i < size; i++) {
                Object obj = ((ArrayList) this.f36844d.f36837E.f162129d).get(i);
                C87412m.m108593f(obj, "giftLayout.mAllViews[i]");
                C12855y1.C12869i iVar = this.f36844d;
                for (View view : (Iterable) obj) {
                    iVar.f36837E.removeView(view);
                    linkedList.add(view);
                }
            }
            C12855y1.C12869i iVar2 = this.f36844d;
            iVar2.f36837E.setOnClickListener(new C12873a(iVar2, this.f36845e, linkedList));
            FinderTagFlowLayout finderTagFlowLayout = this.f36844d.f36837E;
            ((TextView) finderTagFlowLayout.getChildAt(finderTagFlowLayout.getChildCount() - 1).findViewById(C0966R.C0970id.dyh)).setText("...");
        }
    }
}
