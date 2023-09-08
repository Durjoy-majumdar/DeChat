package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import androidx.transition.Transition;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C100124v0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.t3 */
public class C69689t3 implements Transition.C103824e {

    /* renamed from: d */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI.C69490m f201087d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI f201088e;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.t3$a */
    public class C69690a implements Runnable {
        public C69690a() {
        }

        public void run() {
            if (C85875k4.m106211z()) {
                C69689t3.this.f201087d.f200587L.setBackgroundResource(C0966R.C0969drawable.aed);
            } else {
                C69689t3.this.f201087d.f200587L.setBackgroundResource(C0966R.C0969drawable.aeb);
            }
            C69689t3.this.f201087d.f200587L.setEnabled(true);
            C69689t3.this.f201087d.f44854d.setSelected(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.t3$b */
    public class C69691b implements DialogInterface.OnDismissListener {
        public C69691b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.LuckyMoneyPickEnvelopeUI", "dialog dismiss");
            C69689t3.this.f201088e.finish();
        }
    }

    public C69689t3(LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, LuckyMoneyPickEnvelopeUI.C69490m mVar) {
        this.f201088e = luckyMoneyPickEnvelopeUI;
        this.f201087d = mVar;
    }

    /* renamed from: a */
    public void mo91179a(Transition transition) {
        this.f201087d.f44854d.postDelayed(new C69690a(), 300);
    }

    /* renamed from: b */
    public void mo77557b(Transition transition) {
        Log.m105918d("MicroMsg.LuckyMoneyPickEnvelopeUI", "transition end");
        C100124v0.m130821c((Drawable) null, this.f201088e.getContext().getResources().getString(C0966R.string.gfq), this.f201088e.getContext(), 2, new C69691b());
    }

    /* renamed from: c */
    public void mo91180c(Transition transition) {
    }

    /* renamed from: d */
    public void mo91181d(Transition transition) {
    }
}
