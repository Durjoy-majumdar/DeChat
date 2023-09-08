package xm3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.mmdata.rpt.MvvmOptimizeReportStruct;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.UUID;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import yb2.C15946a;

/* renamed from: xm3.x */
public final class C78937x extends C15946a {

    /* renamed from: d */
    public long f231807d;

    /* renamed from: e */
    public String f231808e = "";

    /* renamed from: f */
    public String f231809f = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78937x(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreateBefore(Bundle bundle) {
        this.f231807d = C31543z5.m39453c();
        this.f231808e = getActivity().getClass().getSimpleName() + '-' + getIntent().getIntExtra("list_type", -1);
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        this.f231809f = uuid;
    }

    public void onResume() {
        Class cls = C61212e.class;
        if (!Util.isNullOrNil(this.f231809f)) {
            MvvmOptimizeReportStruct mvvmOptimizeReportStruct = new MvvmOptimizeReportStruct();
            mvvmOptimizeReportStruct.f194290d = mvvmOptimizeReportStruct.mo86045b("Type", this.f231808e, true);
            mvvmOptimizeReportStruct.f194291e = mvvmOptimizeReportStruct.mo86045b("SessionId", this.f231809f, true);
            mvvmOptimizeReportStruct.f194293g = 0;
            mvvmOptimizeReportStruct.f194292f = C31543z5.m39453c() - this.f231807d;
            mvvmOptimizeReportStruct.mo86054n();
            mvvmOptimizeReportStruct.mo86056r();
            this.f231809f = "";
        }
        AppCompatActivity activity = getActivity();
        if (activity != null) {
            ((C61212e) C86312j.m106911c(cls)).mo86178qr(activity, C11345b.SelectContactUI);
        }
        AppCompatActivity activity2 = getActivity();
        if (activity2 != null) {
            ((C61212e) C86312j.m106911c(cls)).mo86179qs(activity2, C76986a.NewGroupChat);
        }
    }
}
