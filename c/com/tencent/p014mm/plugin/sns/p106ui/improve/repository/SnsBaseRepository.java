package com.tencent.p014mm.plugin.sns.p106ui.improve.repository;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C39623j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/repository/SnsBaseRepository;", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/s;", "lifecycle", "<init>", "(Landroidx/lifecycle/s;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.repository.SnsBaseRepository */
public abstract class SnsBaseRepository implements C103764p {

    /* renamed from: d */
    public final C0125s f164441d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.repository.SnsBaseRepository$a */
    public /* synthetic */ class C57409a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f164442a;

        static {
            int[] iArr = new int[C39623j.C39625b.values().length];
            iArr[C39623j.C39625b.ON_CREATE.ordinal()] = 1;
            iArr[C39623j.C39625b.ON_DESTROY.ordinal()] = 2;
            f164442a = iArr;
        }
    }

    public SnsBaseRepository(C0125s sVar) {
        C87412m.m108594g(sVar, "lifecycle");
        this.f164441d = sVar;
        sVar.getLifecycle().addObserver(this);
    }

    /* renamed from: a */
    public abstract void mo81011a();

    /* renamed from: b */
    public abstract void mo81012b();

    /* renamed from: k4 */
    public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        SnsMethodCalculate.markStartTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsBaseRepository");
        C87412m.m108594g(sVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bVar, "event");
        int i = C57409a.f164442a[bVar.ordinal()];
        if (i == 1) {
            mo81011a();
        } else if (i == 2) {
            mo81012b();
        }
        SnsMethodCalculate.markEndTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsBaseRepository");
    }
}
