package d60;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: d60.k0 */
public final class C7202k0 extends C58121a {

    /* renamed from: f */
    public final C58124b f25214f;

    /* renamed from: g */
    public final View f25215g;

    /* renamed from: d60.k0$a */
    public static final class C7203a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7202k0 f25216d;

        public C7203a(C7202k0 k0Var) {
            this.f25216d = k0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveKickedPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b.C7172a.m7372a(this.f25216d.f25214f, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveKickedPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7202k0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f25214f = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.fus);
        this.f25215g = findViewById;
        findViewById.setOnClickListener(new C7203a(this));
    }
}
