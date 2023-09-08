package vr2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: vr2.c0 */
public final class C52986c0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f147897d;

    /* renamed from: e */
    public final /* synthetic */ long f147898e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f147899f;

    /* renamed from: vr2.c0$a */
    public static final class C52987a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f147900d;

        public C52987a(View view) {
            this.f147900d = view;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1$1");
            this.f147900d.setClickable(true);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1$1");
        }
    }

    public C52986c0(View view, long j, C32224a<C13598b0> aVar) {
        this.f147897d = view;
        this.f147898e = j;
        this.f147899f = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
        this.f147897d.setClickable(false);
        View view2 = this.f147897d;
        view2.postDelayed(new C52987a(view2), this.f147898e);
        this.f147899f.invoke();
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
