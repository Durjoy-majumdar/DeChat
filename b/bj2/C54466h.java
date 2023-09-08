package bj2;

import android.view.View;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import f40.C86709a0;
import i40.C60247c;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: bj2.h */
public final class C54466h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C54471p f152732d;

    public C54466h(C54471p pVar) {
        this.f152732d = pVar;
    }

    public final void onClick(View view) {
        C39622i0 a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/DemoConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Class cls = C54468j.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        MvvmStorage.delete$default(((C54468j) a).mo85233d3(C54472r.class), this.f152732d.f152734d, false, false, 6, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/DemoConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
