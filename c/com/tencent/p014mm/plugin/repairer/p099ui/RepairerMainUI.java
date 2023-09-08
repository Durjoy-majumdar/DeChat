package com.tencent.p014mm.plugin.repairer.p099ui;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import di3.C86312j;
import ej2.C45659a;
import ej2.C45661b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hj2.C59926a;
import hj2.C59927b;
import java.util.HashSet;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tf3.C37073p;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/RepairerMainUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerPrefUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerMainUI */
public final class RepairerMainUI extends BaseRepairerPrefUI {

    /* renamed from: e */
    public static final HashSet<Activity> f53305e = new HashSet<>();

    /* renamed from: d */
    public final C13601g f53306d = C36568h.m40985a(new C18977a(this));

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerMainUI$c */
    public static final class C18976c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RepairerMainUI f53307d;

        public C18976c(RepairerMainUI repairerMainUI) {
            this.f53307d = repairerMainUI;
        }

        public final void run() {
            this.f53307d.mo24166H7().mo149070g0(true, 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerMainUI$a */
    public static final class C18977a extends C87413o implements C32224a<C45659a> {

        /* renamed from: d */
        public final /* synthetic */ RepairerMainUI f53308d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18977a(RepairerMainUI repairerMainUI) {
            super(0);
            this.f53308d = repairerMainUI;
        }

        public Object invoke() {
            return new C45659a(new C45661b(this.f53308d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerMainUI$b */
    public static final class C18978b extends C87413o implements C32226l<C59927b, C13598b0> {

        /* renamed from: d */
        public static final C18978b f53309d = new C18978b();

        public C18978b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C59927b bVar = (C59927b) obj;
            C87412m.m108594g(bVar, "state");
            IStateAction action = bVar.getAction();
            if (action != null && (action instanceof C59926a)) {
                C59926a aVar = (C59926a) action;
                bVar.f171034d = true;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.RepairerMainUI$d */
    public static final class C18979d implements Runnable {

        /* renamed from: d */
        public static final C18979d f53310d = new C18979d();

        public final void run() {
        }
    }

    /* renamed from: H7 */
    public final C45659a mo24166H7() {
        return (C45659a) ((C36570n) this.f53306d).getValue();
    }

    public void onBackPressed() {
        if (!mo24166H7().mo64004y0(2)) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (CrashReportFactory.hasDebuger() && CrashReportFactory.isMonkeyEnv()) {
            f53305e.add(this);
        }
        UIStateCenter stateCenter = getStateCenter();
        if (stateCenter != null) {
            stateCenter.process((C0125s) this, C18978b.f53309d);
        }
        setTitleBarClickListener(new C18976c(this), C18979d.f53310d);
        mo24166H7().mo35648A(25, "Repairer");
        mo24166H7().mo67998q0("微信维修厂");
    }

    public void onDestroy() {
        super.onDestroy();
        mo24166H7().mo67996A0();
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58782dM(new C37073p()) != 1) {
            z = false;
        }
        VASActivity.Companion.getClass();
        VASActivity.vasController.mo162722a(z);
    }

    public void onPause() {
        super.onPause();
        mo24166H7().mo64001C();
    }

    public void onResume() {
        super.onResume();
        mo24166H7().mo64003o();
    }
}
