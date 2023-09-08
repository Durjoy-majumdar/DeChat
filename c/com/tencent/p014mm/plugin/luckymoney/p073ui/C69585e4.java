package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.animation.ValueAnimator;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatting.component.ListScrollPAGView;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeUI;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.e4 */
public class C69585e4 implements ListScrollPAGView.C17719f {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyPickEnvelopeUI.C69498r f200896a;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.e4$a */
    public class C69586a implements Runnable {
        public C69586a() {
        }

        public void run() {
            C69585e4.this.f200896a.f200621D.setVisibility(4);
            C69585e4.this.f200896a.f200631N.setBackgroundResource(C0966R.color.ahf);
            C69585e4.this.f200896a.f200642Z.setBackgroundResource(C0966R.color.ahf);
            C69585e4.this.f200896a.f200619B.setVisibility(4);
            C69585e4.this.f200896a.f200620C.setVisibility(4);
        }
    }

    public C69585e4(LuckyMoneyPickEnvelopeUI.C69498r rVar) {
        this.f200896a = rVar;
    }

    public void onFlush() {
        LuckyMoneyPickEnvelopeUI.C69498r rVar = this.f200896a;
        if (!rVar.f200626I) {
            ValueAnimator valueAnimator = rVar.f200623F.f48756h;
            if (valueAnimator != null ? valueAnimator.isRunning() : false) {
                this.f200896a.f200623F.postDelayed(new C69586a(), 100);
                this.f200896a.f200626I = true;
            }
        }
    }
}
