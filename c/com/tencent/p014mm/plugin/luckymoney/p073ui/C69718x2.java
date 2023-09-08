package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.x2 */
public class C69718x2 extends SimplePAGViewUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ int f201138d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyNotHookReceiveUI f201139e;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.x2$a */
    public class C69719a implements Runnable {
        public C69719a() {
        }

        public void run() {
            View view = C69718x2.this.f201139e.f200396A;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$22$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$22$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C69718x2.this.f201139e.f200445v.setBackgroundResource(C0966R.color.ahf);
            C69718x2.this.f201139e.f200447x.setVisibility(4);
            C69718x2.this.f201139e.f200449y.setVisibility(4);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.x2$b */
    public class C69720b implements Runnable {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.x2$b$a */
        public class C69721a implements Runnable {
            public C69721a() {
            }

            public void run() {
                C69718x2.this.f201139e.f200445v.setBackgroundResource(C0966R.color.ahf);
            }
        }

        public C69720b() {
        }

        public void run() {
            View view = C69718x2.this.f201139e.f200397B;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$22$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$22$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C69718x2.this.f201139e.f200397B.postDelayed(new C69721a(), 300);
        }
    }

    public C69718x2(LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI, int i) {
        this.f201139e = luckyMoneyNotHookReceiveUI;
        this.f201138d = i;
    }

    public void onAnimationCancel(PAGView pAGView) {
    }

    public void onAnimationEnd(PAGView pAGView) {
    }

    public void onAnimationRepeat(PAGView pAGView) {
    }

    public void onAnimationStart(PAGView pAGView) {
        if (this.f201138d == 2) {
            View view = this.f201139e.f200399D;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$22", "onAnimationStart", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNotHookReceiveUI$22", "onAnimationStart", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f201139e.f200399D.postDelayed(new C69719a(), 300);
            return;
        }
        this.f201139e.f200447x.postDelayed(new C69720b(), 0);
    }
}
