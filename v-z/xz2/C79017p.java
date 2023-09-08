package xz2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import go3.C59600d;
import gy3.C87412m;
import ke3.C88144b;
import qy2.C36206l;
import qy2.C77455o;
import uz2.C65488a0;
import uz2.C65490m;

/* renamed from: xz2.p */
public final class C79017p implements C36206l {

    /* renamed from: xz2.p$a */
    public static final class C79018a extends C77455o {

        /* renamed from: d */
        public final /* synthetic */ C79017p f232025d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79018a(String str, C79017p pVar) {
            super(str);
            this.f232025d = pVar;
        }

        /* renamed from: d */
        public boolean mo84142d(Context context, Bundle bundle) {
            C65488a0 a0Var = this.f225886b;
            boolean z = false;
            if (a0Var != null) {
                C79017p pVar = this.f232025d;
                if (C87412m.m108589b(a0Var.f188439d, "11")) {
                    C72996z1 y3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69730y3("WeRun-WeChat");
                    if (y3 != null && y3.mo62927s3()) {
                        z = true;
                    }
                    if (z) {
                        Intent intent = new Intent();
                        intent.putExtra("username", C75592q0.m90789s());
                        intent.putExtra("key_is_latest", true);
                        intent.putExtra("rank_id", "#");
                        intent.putExtra("key_only_show_latest_rank", true);
                        intent.putExtra("app_username", ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName("gh_43f2581f6fd6"));
                        intent.putExtra("device_type", 1);
                        C88144b.m109791i(context, "exdevice", ".ui.ExdeviceRankInfoUI", intent, (Bundle) null);
                    } else if (context != null) {
                        pVar.getClass();
                        Intent intent2 = new Intent();
                        intent2.putExtra("Contact_User", "gh_43f2581f6fd6");
                        C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: j */
        public boolean mo84146j() {
            return false;
        }

        /* renamed from: n */
        public void mo84148n() {
        }
    }

    /* renamed from: IT */
    public C59600d mo84138IT(String str, FrameLayout frameLayout, C65488a0 a0Var, C65490m mVar) {
        C87412m.m108594g(frameLayout, "p1");
        C87412m.m108594g(mVar, "p3");
        return null;
    }

    public C77455o l30(String str) {
        return new C79018a(str, this);
    }

    public void release() {
    }
}
