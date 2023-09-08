package fu2;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.sheet.SnsGroupDialog;
import gu2.C98214b;
import gy3.C87412m;

/* renamed from: fu2.o */
public final class C98020o extends C97987a {

    /* renamed from: fu2.o$a */
    public static final class C98021a implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public static final C98021a f287434d = new C98021a();

        public final void onDismiss(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGroupClick$click$1");
            SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGroupClick$click$1");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98020o(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo71269a(View view) {
        SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGroupClick");
        C98214b c = mo137310c();
        if (c == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGroupClick");
            return;
        }
        SnsGroupDialog snsGroupDialog = new SnsGroupDialog(mo137309b(), (int) c.mo137526z2(), 1, 2);
        snsGroupDialog.show();
        snsGroupDialog.f126908o = C98021a.f287434d;
        SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveGroupClick");
    }
}
