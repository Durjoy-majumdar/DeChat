package te0;

import android.view.View;
import com.tencent.p014mm.openim.p018ui.dialog.OpenIMConfirmDialogView;
import com.tencent.p014mm.plugin.profile.C70137b;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import p239sv.C77790f;

/* renamed from: te0.c */
public final class C77897c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ OpenIMConfirmDialogView f226955d;

    public C77897c(OpenIMConfirmDialogView openIMConfirmDialogView) {
        this.f226955d = openIMConfirmDialogView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/openim/ui/dialog/OpenIMConfirmDialogView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C77790f fVar = this.f226955d.f195844X0;
        if (fVar != null) {
            C70137b bVar = (C70137b) fVar;
            Log.m105924i("MicroMsg.NewContactWidgetNormal", "confirmDialog onConfirmClick");
            bVar.f202471e.mo96530a(bVar.f202468b, bVar.f202469c, bVar.f202470d, true);
            ((C77894a) bVar.f202467a).dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/openim/ui/dialog/OpenIMConfirmDialogView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
