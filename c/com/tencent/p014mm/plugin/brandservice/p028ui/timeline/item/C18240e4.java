package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C19623o0;
import s90.C77630j;
import wd3.C22906q;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.e4 */
public class C18240e4 implements C22906q.C22907a {

    /* renamed from: a */
    public final /* synthetic */ C77630j f50437a;

    /* renamed from: b */
    public final /* synthetic */ C19623o0 f50438b;

    /* renamed from: c */
    public final /* synthetic */ int f50439c;

    /* renamed from: d */
    public final /* synthetic */ C18245f4 f50440d;

    public C18240e4(C18245f4 f4Var, C77630j jVar, C19623o0 o0Var, int i) {
        this.f50440d = f4Var;
        this.f50437a = jVar;
        this.f50438b = o0Var;
        this.f50439c = i;
    }

    public void onFinish() {
        C18245f4 f4Var = this.f50440d;
        f4Var.f50817y = true;
        f4Var.f50808p.setTextColor(f4Var.f50824c.getResources().getColor(C0966R.color.BW_100_Alpha_0_6_5));
        ImageView imageView = this.f50440d.f50806n;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        C18245f4 f4Var2 = this.f50440d;
        if (!f4Var2.mo22917j(f4Var2.f50816x, this.f50437a)) {
            C18245f4 f4Var3 = this.f50440d;
            f4Var3.f50811s.setTextColor(f4Var3.f50824c.getResources().getColor(C0966R.color.al_));
            if (this.f50440d.mo22916i(this.f50437a)) {
                this.f50440d.f50815w.setBackgroundResource(C0966R.C0969drawable.f4607hn);
            } else {
                this.f50440d.f50815w.setBackgroundResource(C0966R.C0969drawable.f4608ho);
            }
        } else {
            C18245f4 f4Var4 = this.f50440d;
            if (f4Var4.f50818z > 0) {
                f4Var4.f50815w.setBackgroundResource(C0966R.C0969drawable.f4608ho);
            }
        }
        this.f50440d.f50825d.f51445p.mo23110l(this.f50438b.field_msgId, this.f50439c);
    }

    public void onStart() {
    }
}
