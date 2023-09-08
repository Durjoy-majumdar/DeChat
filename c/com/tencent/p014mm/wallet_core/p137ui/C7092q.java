package com.tencent.p014mm.wallet_core.p137ui;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import de3.C75359b0;
import j20.C117292a;
import java.util.ArrayList;
import wd3.C53155r0;

/* renamed from: com.tencent.mm.wallet_core.ui.q */
public class C7092q extends C75359b0 {

    /* renamed from: d */
    public C7093a f24997d;

    /* renamed from: e */
    public boolean f24998e;

    /* renamed from: f */
    public long f24999f;

    /* renamed from: com.tencent.mm.wallet_core.ui.q$a */
    public interface C7093a {
        void onClick(View view);
    }

    public C7092q(C7093a aVar, boolean z) {
        super(7, (C53155r0) null);
        this.f24997d = aVar;
        this.f24998e = z;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/wallet_core/ui/TextLinkClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f24997d != null) {
            boolean z = true;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f24999f >= 1000) {
                z = false;
            }
            this.f24999f = currentTimeMillis;
            if (z) {
                C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/TextLinkClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                this.f24997d.onClick(view);
                C75226r.m90203c(view);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/TextLinkClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void setColorConfig(int i) {
        Context context = MMApplicationContext.getContext();
        super.setColorConfig(i);
        if (i == 7) {
            setColor(context.getResources().getColor(C0966R.color.f2958ae), context.getResources().getColor(C0966R.color.FG_3));
        } else if (i == 6) {
            setColor(context.getResources().getColor(C0966R.color.f2971b1), context.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_1));
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.f24998e) {
            C85875k4.m106189j0(textPaint, 0.8f);
        }
    }

    public C7092q(int i, C7093a aVar) {
        super(i, (C53155r0) null);
        this.f24998e = true;
        this.f24997d = aVar;
    }

    public C7092q(int i, int i2, C7093a aVar) {
        super(i, i2);
        this.f24998e = true;
        this.f24997d = aVar;
    }
}
