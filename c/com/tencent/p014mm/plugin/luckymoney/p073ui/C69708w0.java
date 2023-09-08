package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.w0 */
public class C69708w0 extends SimplePAGViewUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C77994sf2 f201121d;

    /* renamed from: e */
    public final /* synthetic */ View f201122e;

    /* renamed from: f */
    public final /* synthetic */ View f201123f;

    /* renamed from: g */
    public final /* synthetic */ ImageView f201124g;

    /* renamed from: h */
    public final /* synthetic */ View f201125h;

    /* renamed from: i */
    public final /* synthetic */ ViewGroup f201126i;

    /* renamed from: j */
    public final /* synthetic */ View f201127j;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.w0$a */
    public class C69709a implements Runnable {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.w0$a$a */
        public class C69710a implements Runnable {
            public C69710a() {
            }

            public void run() {
                View view = C69708w0.this.f201123f;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C69708w0.this.f201124g.setVisibility(4);
                View view2 = C69708w0.this.f201125h;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(4);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C69708w0.this.f201126i.setBackgroundResource(C0966R.color.ahf);
            }
        }

        public C69709a() {
        }

        public void run() {
            View view = C69708w0.this.f201122e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C69708w0.this.f201122e.postDelayed(new C69710a(), 100);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.w0$b */
    public class C69711b implements Runnable {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.w0$b$a */
        public class C69712a implements Runnable {
            public C69712a() {
            }

            public void run() {
                C69708w0.this.f201126i.setBackgroundResource(C0966R.color.ahf);
            }
        }

        public C69711b() {
        }

        public void run() {
            View view = C69708w0.this.f201127j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$14$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C69708w0.this.f201127j.postDelayed(new C69712a(), 100);
        }
    }

    public C69708w0(LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, C77994sf2 sf22, View view, View view2, ImageView imageView, View view3, ViewGroup viewGroup, View view4) {
        this.f201121d = sf22;
        this.f201122e = view;
        this.f201123f = view2;
        this.f201124g = imageView;
        this.f201125h = view3;
        this.f201126i = viewGroup;
        this.f201127j = view4;
    }

    public void onAnimationCancel(PAGView pAGView) {
    }

    public void onAnimationEnd(PAGView pAGView) {
    }

    public void onAnimationRepeat(PAGView pAGView) {
    }

    public void onAnimationStart(PAGView pAGView) {
        if (this.f201121d.f228203g.f228242D == 2) {
            this.f201122e.postDelayed(new C69709a(), 0);
        } else {
            this.f201127j.postDelayed(new C69711b(), 0);
        }
    }
}
