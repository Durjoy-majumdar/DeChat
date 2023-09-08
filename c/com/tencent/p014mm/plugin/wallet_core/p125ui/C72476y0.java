package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75226r;
import de3.C75359b0;
import j20.C117292a;
import java.util.ArrayList;
import wd3.C53155r0;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.y0 */
public class C72476y0 extends C75359b0 {

    /* renamed from: d */
    public C72477a f210833d;

    /* renamed from: e */
    public boolean f210834e;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.y0$a */
    public interface C72477a {
        /* renamed from: a */
        void mo66525a(View view);
    }

    public C72476y0(String str, C72477a aVar) {
        this(2, aVar);
        if (!Util.isNullOrNil(str)) {
            setColor(Color.parseColor(str), MMApplicationContext.getContext().getResources().getColor(C0966R.color.ad7));
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C72477a aVar = this.f210833d;
        if (aVar != null) {
            aVar.mo66525a(view);
            C75226r.m90203c(view);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void setColorConfig(int i) {
        Context context = MMApplicationContext.getContext();
        super.setColorConfig(i);
        if (i == 7) {
            setColor(context.getResources().getColor(C0966R.color.f2958ae), context.getResources().getColor(C0966R.color.FG_3));
        } else if (i == 5) {
            setColor(context.getResources().getColor(C0966R.color.al6), context.getResources().getColor(C0966R.color.ad7));
        } else if (i == 6) {
            setColor(context.getResources().getColor(C0966R.color.f2971b1), context.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_1));
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.f210834e) {
            C85875k4.m106189j0(textPaint, 0.8f);
        }
    }

    public C72476y0(int i, C72477a aVar) {
        super(i, (C53155r0) null);
        this.f210834e = false;
        this.f210833d = aVar;
    }

    public C72476y0(int i, C72477a aVar, boolean z) {
        super(i, (C53155r0) null);
        this.f210833d = aVar;
        this.f210834e = z;
    }
}
