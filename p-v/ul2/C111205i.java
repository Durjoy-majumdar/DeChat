package ul2;

import android.view.View;
import com.tencent.p014mm.plugin.scanner.model.C106071g1;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeMaskView;
import gy3.C8479f0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ul2.i */
public final class C111205i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScanCodeMaskView f333025d;

    /* renamed from: e */
    public final /* synthetic */ int f333026e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<View> f333027f;

    public C111205i(ScanCodeMaskView scanCodeMaskView, int i, C8479f0<View> f0Var) {
        this.f333025d = scanCodeMaskView;
        this.f333026e = i;
        this.f333027f = f0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$showSuccessView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ScanCodeMaskView scanCodeMaskView = this.f333025d;
        int i = this.f333026e;
        scanCodeMaskView.f315991Q = i;
        C106071g1 g1Var = scanCodeMaskView.f315990P;
        if (g1Var != null) {
            g1Var.mo24354a(i, (View) this.f333027f.f27484d);
        }
        for (View onClickListener : this.f333025d.getSuccessMarkViewList()) {
            onClickListener.setOnClickListener((View.OnClickListener) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView$showSuccessView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
