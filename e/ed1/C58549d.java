package ed1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bd1.C54446b;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.account.component.FinderAccountSwitchUIC$buildConvert$1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import dp1.C7446m0;
import gd1.C45905a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zc1.C66785b;

/* renamed from: ed1.d */
public final class C58549d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C58551f f167588d;

    public C58549d(C58551f fVar) {
        this.f167588d = fVar;
    }

    public final void onClick(View view) {
        View findViewById;
        TextView textView;
        Window window;
        View decorView;
        Window window2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C58551f fVar = this.f167588d;
        fVar.getClass();
        Log.m105924i("FinderAccountSwitchUIC", "[onClickSwitch]");
        ArrayList<C45905a> arrayList2 = new ArrayList<>();
        List<? extends C54446b> list = fVar.f167593g;
        if (list != null) {
            for (C54446b bVar : list) {
                C66785b bVar2 = C66785b.f191882e;
                String str = bVar.field_username;
                C87412m.m108593f(str, "it.field_username");
                if (bVar2.mo90676q0(str)) {
                    arrayList2.add(0, new C45905a(bVar, C87412m.m108589b(bVar.field_username, fVar.f167598o)));
                } else {
                    arrayList2.add(new C45905a(bVar, C87412m.m108589b(bVar.field_username, fVar.f167598o)));
                }
            }
        }
        if (fVar.f167600q) {
            C45905a aVar = new C45905a(new C54446b(), false);
            aVar.f123876f = fVar.f167597n;
            arrayList2.add(aVar);
        }
        fVar.f167594h = arrayList2;
        if (fVar.f167591e == null) {
            fVar.f167591e = new C104428a(fVar.getContext(), C0966R.style.f8363ft);
            View inflate = LayoutInflater.from(fVar.getContext()).inflate(C0966R.C0971layout.cxw, (ViewGroup) null, false);
            C104428a aVar2 = fVar.f167591e;
            if (aVar2 != null) {
                aVar2.setContentView(inflate);
            }
            C104428a aVar3 = fVar.f167591e;
            if (!(aVar3 == null || (window2 = aVar3.getWindow()) == null)) {
                window2.setDimAmount(0.4f);
            }
            C104428a aVar4 = fVar.f167591e;
            if (!(aVar4 == null || (window = aVar4.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
                decorView.setBackgroundResource(C0966R.C0969drawable.aqh);
            }
            if (!(inflate == null || (textView = (TextView) inflate.findViewById(C0966R.C0970id.n5p)) == null)) {
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
            }
            if (!(inflate == null || (findViewById = inflate.findViewById(C0966R.C0970id.n5n)) == null)) {
                findViewById.setOnClickListener(new C58550e(fVar));
            }
            C87412m.m108593f(inflate, "view");
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0966R.C0970id.n5o);
            recyclerView.setLayoutManager(new LinearLayoutManager(fVar.getContext()));
            ArrayList<C45905a> arrayList3 = fVar.f167594h;
            if (arrayList3 != null) {
                fVar.f167595i = new WxRecyclerAdapter<>(new FinderAccountSwitchUIC$buildConvert$1(), arrayList3, false);
            }
            recyclerView.setAdapter(fVar.f167595i);
            WxRecyclerAdapter<C45905a> wxRecyclerAdapter = fVar.f167595i;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.f173488o = new C58548c(fVar);
            }
            C7446m0.m7572b(C7446m0.f25635a, inflate, "account_panel", 32, 0, (Map) null, 24, (Object) null);
        } else {
            WxRecyclerAdapter<C45905a> wxRecyclerAdapter2 = fVar.f167595i;
            if (wxRecyclerAdapter2 != null) {
                List<C45905a> data = wxRecyclerAdapter2.getData();
                data.clear();
                ArrayList<C45905a> arrayList4 = fVar.f167594h;
                if (arrayList4 != null) {
                    Iterator<C45905a> it = arrayList4.iterator();
                    while (it.hasNext()) {
                        data.add(it.next());
                    }
                }
                wxRecyclerAdapter2.notifyDataSetChanged();
            }
        }
        C104428a aVar5 = fVar.f167591e;
        if (aVar5 != null) {
            aVar5.show();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
