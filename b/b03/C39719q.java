package b03;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: b03.q */
public final class C39719q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f106571d;

    /* renamed from: e */
    public final /* synthetic */ long f106572e;

    /* renamed from: f */
    public final /* synthetic */ View.OnClickListener f106573f;

    /* renamed from: g */
    public final /* synthetic */ C32224a<C13598b0> f106574g;

    /* renamed from: b03.q$a */
    public static final class C39720a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f106575d;

        public C39720a(View view) {
            this.f106575d = view;
        }

        public final void run() {
            this.f106575d.setClickable(true);
        }
    }

    public C39719q(View view, long j, View.OnClickListener onClickListener, C32224a<C13598b0> aVar) {
        this.f106571d = view;
        this.f106572e = j;
        this.f106573f = onClickListener;
        this.f106574g = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/util/TextStatusUtilsKt$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f106571d.setClickable(false);
        View view2 = this.f106571d;
        view2.postDelayed(new C39720a(view2), this.f106572e);
        View.OnClickListener onClickListener = this.f106573f;
        if (onClickListener != null) {
            onClickListener.onClick(this.f106571d);
        }
        C32224a<C13598b0> aVar = this.f106574g;
        if (aVar != null) {
            aVar.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/util/TextStatusUtilsKt$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
