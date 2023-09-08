package bz0;

import a14.C0000n0;
import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import com.tencent.p014mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo;
import com.tencent.p014mm.plugin.car_license_plate.p030ui.CarLicensePlateEditUI;
import com.tencent.p014mm.plugin.car_license_plate.p030ui.CarLicensePlateListViewContract$ViewModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import cz0.C86159b;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewPresenter$startEditUIForUpdate$1", mo125469f = "CarLicensePlateListViewPresenter.kt", mo125470l = {108, 118}, mo125471m = "invokeSuspend")
/* renamed from: bz0.t */
public final class C79903t extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f234090d;

    /* renamed from: e */
    public final /* synthetic */ Activity f234091e;

    /* renamed from: f */
    public final /* synthetic */ String f234092f;

    /* renamed from: g */
    public final /* synthetic */ C79896s f234093g;

    /* renamed from: bz0.t$a */
    public static final class C79904a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C79896s f234094d;

        /* renamed from: e */
        public final /* synthetic */ String f234095e;

        /* renamed from: f */
        public final /* synthetic */ String f234096f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79904a(C79896s sVar, String str, String str2) {
            super(0);
            this.f234094d = sVar;
            this.f234095e = str;
            this.f234096f = str2;
        }

        public Object invoke() {
            CarLicensePlateListViewContract$ViewModel viewModel = this.f234094d.getViewModel();
            String str = this.f234095e;
            String str2 = this.f234096f;
            C87412m.m108594g(str, "oldPlate");
            C87412m.m108594g(str2, "newPlate");
            if (C87412m.m108589b((Object) null, viewModel.f248031d)) {
                viewModel.mo118134a(str2);
            } else {
                MMCarLicensePlateInfo mMCarLicensePlateInfo = viewModel.f248031d;
                C87412m.m108591d(mMCarLicensePlateInfo);
                int indexOf = mMCarLicensePlateInfo.f247996d.indexOf(str);
                if (indexOf >= 0) {
                    mMCarLicensePlateInfo.f247996d.add(indexOf + 1, str2);
                    mMCarLicensePlateInfo.f247996d.remove(indexOf);
                } else {
                    mMCarLicensePlateInfo.f247996d.add(str2);
                }
            }
            C79896s sVar = this.f234094d;
            C79890q qVar = sVar.f234075b;
            if (qVar != null) {
                qVar.mo110053a(sVar.getViewModel().f248031d);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79903t(Activity activity, String str, C79896s sVar, C15601d<? super C79903t> dVar) {
        super(2, dVar);
        this.f234091e = activity;
        this.f234092f = str;
        this.f234093g = sVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C79903t(this.f234091e, this.f234092f, this.f234093g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C79903t) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f234090d;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Activity activity = this.f234091e;
            Intent intent = new Intent(this.f234091e, CarLicensePlateEditUI.class);
            intent.putExtra("INTENT_KEY_DEFAULT_PLATE_TEXT", this.f234092f);
            this.f234090d = 1;
            obj = C86159b.m106675c(activity, intent, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Instrumentation.ActivityResult activityResult = (Instrumentation.ActivityResult) obj;
        C87412m.m108594g(activityResult, "<this>");
        int resultCode = activityResult.getResultCode();
        Intent resultData = activityResult.getResultData();
        Log.m105924i("MicroMsg.CarLicensePlateListViewPresenter", "startEditUIForUpdate(plateNo:" + this.f234092f + "), get code:" + resultCode + ", data:" + resultData);
        if (-2 == resultCode) {
            this.f234093g.mo110062e();
            return C13598b0.f38549a;
        }
        String str = null;
        if (-1 == resultCode && resultData != null) {
            str = resultData.getStringExtra("RESULT_KEY_SUBMITTED_PLATE_TEXT");
        }
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (!z && !C87412m.m108589b(str, this.f234092f)) {
            C79904a aVar2 = new C79904a(this.f234093g, this.f234092f, str);
            this.f234090d = 2;
            if (C86159b.m106676d(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return C13598b0.f38549a;
    }
}
