package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C19623o0;
import wd3.C22906q;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h4 */
public class C18287h4 implements C22906q.C22907a {

    /* renamed from: a */
    public final /* synthetic */ C19623o0 f50565a;

    /* renamed from: b */
    public final /* synthetic */ int f50566b;

    /* renamed from: c */
    public final /* synthetic */ C18294i4 f50567c;

    public C18287h4(C18294i4 i4Var, C19623o0 o0Var, int i) {
        this.f50567c = i4Var;
        this.f50565a = o0Var;
        this.f50566b = i;
    }

    public void onFinish() {
        C18294i4 i4Var = this.f50567c;
        i4Var.f50817y = true;
        i4Var.f50808p.setTextColor(i4Var.f50824c.getResources().getColor(C0966R.color.BW_100_Alpha_0_6_5));
        ImageView imageView = this.f50567c.f50806n;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        C18294i4 i4Var2 = this.f50567c;
        if (i4Var2.f50816x > 1) {
            i4Var2.f50811s.setTextColor(i4Var2.f50824c.getResources().getColor(C0966R.color.al_));
            this.f50567c.f50600F.setBackgroundResource(C0966R.C0969drawable.f4608ho);
        } else {
            i4Var2.f50600F.setBackgroundResource(C0966R.C0969drawable.ayq);
        }
        C18294i4 i4Var3 = this.f50567c;
        i4Var3.f50596B.setTextColor(i4Var3.f50824c.getResources().getColor(C0966R.color.al_));
        this.f50567c.f50825d.f51445p.mo23110l(this.f50565a.field_msgId, this.f50566b);
    }

    public void onStart() {
    }
}
