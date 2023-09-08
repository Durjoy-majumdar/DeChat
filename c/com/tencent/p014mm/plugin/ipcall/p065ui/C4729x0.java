package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.DialogInterface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.x0 */
public class C4729x0 extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ String f19742d;

    /* renamed from: e */
    public final /* synthetic */ IPCallShareCouponCardUI f19743e;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.x0$a */
    public class C4730a implements DialogInterface.OnClickListener {
        public C4730a(C4729x0 x0Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public C4729x0(IPCallShareCouponCardUI iPCallShareCouponCardUI, String str) {
        this.f19743e = iPCallShareCouponCardUI;
        this.f19742d = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI$14", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        ((TextView) view).setHighlightColor(this.f19743e.getResources().getColor(C0966R.color.ahf));
        C115669n.INSTANCE.mo160131h(13340, -1, -1, -1, -1, 1);
        C76879j.m92712F(this.f19743e.getContext(), this.f19742d, this.f19743e.getString(C0966R.string.fx_), true).mo107541v(C0966R.string.ftt, new C4730a(this));
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI$14", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f19743e.getResources().getColor(C0966R.color.a1d));
        textPaint.setUnderlineText(false);
    }
}
