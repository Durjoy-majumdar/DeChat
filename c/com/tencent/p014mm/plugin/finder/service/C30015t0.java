package com.tencent.p014mm.plugin.finder.service;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import o40.C11348f;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.service.t0 */
public final class C30015t0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C56294r0 f81240d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30015t0(C56294r0 r0Var) {
        super(0);
        this.f81240d = r0Var;
    }

    public Object invoke() {
        try {
            Set<AppCompatActivity> set = this.f81240d.f160893s;
            C87412m.m108593f(set, "enterFinderActivity");
            C56294r0 r0Var = this.f81240d;
            ArrayList arrayList = new ArrayList();
            for (T next : set) {
                AppCompatActivity appCompatActivity = (AppCompatActivity) next;
                C87412m.m108593f(appCompatActivity, LocaleUtil.ITALIAN);
                if (r0Var.iu0(appCompatActivity)) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AppCompatActivity appCompatActivity2 = (AppCompatActivity) it.next();
                Log.m105924i("FinderMultiTaskService", "checkClearFinderTask: clear exceptional finder ui, ui = " + appCompatActivity2.getClass().getSimpleName());
                appCompatActivity2.setResult(0);
                appCompatActivity2.finishAffinity();
            }
            Set<Activity> set2 = this.f81240d.f160895u;
            C87412m.m108593f(set2, "enteredNonFinderActivity");
            for (Activity activity : set2) {
                Log.m105924i("FinderMultiTaskService", "checkClearFinderTask: clear exceptional non finder ui, ui = " + activity.getClass().getSimpleName());
                activity.setResult(0);
                activity.finishAffinity();
            }
        } catch (Throwable th) {
            Log.m105921e("FinderMultiTaskService", "checkClearFinderTask2: crash,", th);
            C11348f.C11349a.m11178b(C59319a.f169618b, "clearFinderTaskCrash2", false, (C11348f.C11352b) null, false, false, new C3606s0(th), 28, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
