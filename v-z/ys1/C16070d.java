package ys1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import gy3.C87412m;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import nj3.C76912y0;
import nr3.C89059e;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C51079ra1;
import te3.C52311zv;
import vs1.C14974a;
import ws1.C15592b;

/* renamed from: ys1.d */
public final class C16070d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C16065a f43217d;

    /* renamed from: ys1.d$a */
    public static final class C16071a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C16065a f43218a;

        public C16071a(C16065a aVar) {
            this.f43218a = aVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            this.f43218a.f43212j.mo8913b();
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                this.f43218a.getActivity().finish();
                C76912y0.m92768g(this.f43218a.getContext(), this.f43218a.getResources().getString(C0966R.string.ms5));
            } else {
                String str = cVar.f256795c;
                if (str == null || str.length() == 0) {
                    C76912y0.m92767f(this.f43218a.getContext(), this.f43218a.getResources().getString(C0966R.string.ms4));
                } else {
                    C76912y0.m92767f(this.f43218a.getContext(), cVar.f256795c);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C16070d(C16065a aVar) {
        this.f43217d = aVar;
    }

    public final void onClick(View view) {
        C51079ra1 ra12;
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/vote/uic/FinderLiveAnchorEditVoteUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f43217d.f43212j.begin();
        C14974a aVar = this.f43217d.f43208f;
        T t = null;
        if (aVar != null) {
            C51079ra1 ra13 = new C51079ra1();
            List<C14974a.C14979e> list = aVar.f41037e;
            C87412m.m108593f(list, "dataList");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C14974a.C14979e) next).f41058c == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            C14974a.C14979e eVar = (C14974a.C14979e) t;
            if (eVar != null) {
                C14974a.C14980f fVar = eVar.f41057b;
                ra13.f140787g = fVar.f41060b * 60;
                ra13.f140785e = fVar.f41061c;
                ra13.f140784d = fVar.f41059a ^ true ? 1 : 0;
            }
            List<C14974a.C14979e> list2 = aVar.f41037e;
            C87412m.m108593f(list2, "dataList");
            ArrayList arrayList2 = new ArrayList();
            for (T next2 : list2) {
                if (((C14974a.C14979e) next2).f41058c == 2) {
                    arrayList2.add(next2);
                }
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                C14974a.C14979e eVar2 = (C14974a.C14979e) it4.next();
                String str = eVar2.f41056a;
                if (!(str == null || str.length() == 0)) {
                    LinkedList<C52311zv> linkedList = ra13.f140786f;
                    C52311zv zvVar = new C52311zv();
                    zvVar.f146239d = eVar2.f41056a;
                    linkedList.add(zvVar);
                }
            }
            ra12 = ra13;
        } else {
            ra12 = null;
        }
        C16065a aVar2 = this.f43217d;
        C89059e i = new C15592b(aVar2.f43209g, aVar2.f43210h, aVar2.f43211i, ra12, 0).mo9225i();
        i.mo123420E(new C16071a(this.f43217d));
        AppCompatActivity activity = this.f43217d.getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        i.mo11397F((MMActivity) activity);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/uic/FinderLiveAnchorEditVoteUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
