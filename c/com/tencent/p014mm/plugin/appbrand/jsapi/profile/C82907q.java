package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SetLocalQQMobileEvent;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import nj3.C76879j;
import p196ln.C76706g;
import p196ln.C76708i;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.q */
public final class C82907q extends AppBrandProxyUIProcessTask {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.q$a */
    public static final class C82908a implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ C82907q f242384a;

        /* renamed from: b */
        public final /* synthetic */ ProfileResult f242385b;

        /* renamed from: c */
        public final /* synthetic */ C89779i0 f242386c;

        /* renamed from: d */
        public final /* synthetic */ int f242387d;

        public C82908a(C82907q qVar, ProfileResult profileResult, C89779i0 i0Var, int i) {
            this.f242384a = qVar;
            this.f242385b = profileResult;
            this.f242386c = i0Var;
            this.f242387d = i;
        }

        /* renamed from: a */
        public final void mo1109a(String str, boolean z) {
            Class cls = C75700k0.class;
            if (this.f242384a.getActivityContext() == null) {
                Log.m105928w("ProfileTask", "handleRequest, getNow callback, context has already been detached!");
                ProfileResult profileResult = this.f242385b;
                profileResult.f242335d = 0;
                this.f242384a.finishProcess(profileResult);
                return;
            }
            C89779i0 i0Var = this.f242386c;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
            if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69730y3(str);
                z = false;
            } else {
                str = z1Var.getUsername();
            }
            if (!z) {
                Log.m105928w("ProfileTask", "handleRequest, getNow callback fail");
                ProfileResult profileResult2 = this.f242385b;
                profileResult2.f242335d = 0;
                this.f242384a.finishProcess(profileResult2);
                return;
            }
            ((C76708i) C86312j.m106911c(C76708i.class)).mo106848yE(str, 3);
            ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93582i(str);
            C87412m.m108591d(z1Var);
            if (z1Var.mo62916m3()) {
                C115669n.INSTANCE.kvStat(10298, z1Var.getUsername() + ',' + this.f242387d);
                ProfileResult profileResult3 = this.f242385b;
                profileResult3.f242336e = profileResult3.f242336e | 1;
            }
            if (z1Var.mo62927s3()) {
                this.f242385b.f242336e |= 2;
            }
            ProfileResult profileResult4 = this.f242385b;
            profileResult4.f242335d = 1;
            this.f242384a.finishProcess(profileResult4);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.q$b */
    public static final class C82909b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ String f242388d;

        /* renamed from: e */
        public final /* synthetic */ ProfileResult f242389e;

        /* renamed from: f */
        public final /* synthetic */ C82907q f242390f;

        public C82909b(String str, ProfileResult profileResult, C82907q qVar) {
            this.f242388d = str;
            this.f242389e = profileResult;
            this.f242390f = qVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C31519v2.m39436a().mo55989f(this.f242388d);
            ProfileResult profileResult = this.f242389e;
            profileResult.f242335d = 2;
            this.f242390f.finishProcess(profileResult);
        }
    }

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        Class cls = C75700k0.class;
        C87412m.m108594g(processRequest, "request");
        ProfileResult profileResult = new ProfileResult();
        if (!(processRequest instanceof ProfileRequest)) {
            Log.m105928w("ProfileTask", "handleRequest, request not instance of ProfileRequest");
            profileResult.f242335d = 0;
            finishProcess(profileResult);
        } else if (!C86709a0.m107523b().mo121115m()) {
            Log.m105920e("ProfileTask", "handleRequest, MMKernel.account().hasLogin() is false");
            profileResult.f242335d = 0;
            finishProcess(profileResult);
        } else {
            ProfileRequest profileRequest = (ProfileRequest) processRequest;
            int i = profileRequest.f242334e;
            String str = profileRequest.f242333d;
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
            if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69730y3(str);
            }
            if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                Log.m105924i("ProfileTask", "handleRequest, request contact info");
                C31519v2.m39436a().mo55988e(str, "", new C82908a(this, profileResult, C76879j.m92723Q(getActivityContext(), getActivityContext().getString(C0966R.string.a3h), getActivityContext().getString(C0966R.string.a4d), true, true, new C82909b(str, profileResult, this)), i));
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("Contact_User", str);
            profileResult.f242337f = z1Var.getUsername();
            if (z1Var.mo62916m3()) {
                C115669n.INSTANCE.kvStat(10298, z1Var.getUsername() + ',' + i);
                profileResult.f242336e = profileResult.f242336e | 1;
                intent.putExtra("Contact_Scene", i);
            }
            if (z1Var.mo62927s3()) {
                profileResult.f242336e |= 2;
                SetLocalQQMobileEvent setLocalQQMobileEvent = new SetLocalQQMobileEvent();
                SetLocalQQMobileEvent.C1133a aVar = setLocalQQMobileEvent.f9501d;
                aVar.f9503a = intent;
                aVar.f9504b = str;
                setLocalQQMobileEvent.publish();
            }
            profileResult.f242335d = 1;
            finishProcess(profileResult);
        }
    }
}
