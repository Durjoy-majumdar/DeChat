package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.wallet_core.p137ui.C75226r;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.z */
public class C72478z extends ClickableSpan {

    /* renamed from: d */
    public C72479a f210835d = null;

    /* renamed from: e */
    public int f210836e = -1;

    /* renamed from: f */
    public int f210837f = -1;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.z$a */
    public interface C72479a {
        void onClick(View view);
    }

    public C72478z(Context context) {
        this.f210836e = context.getResources().getColor(C0966R.color.ajd);
        this.f210837f = context.getResources().getColor(C0966R.color.ahf);
    }

    /* renamed from: a */
    public void mo99888a(C72479a aVar) {
        this.f210835d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C72479a aVar = this.f210835d;
        if (aVar != null) {
            aVar.onClick(view);
            C75226r.m90203c(view);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(false);
        textPaint.setColor(this.f210836e);
        textPaint.setUnderlineText(false);
        textPaint.bgColor = this.f210837f;
    }
}
