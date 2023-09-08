package com.tencent.p014mm.openim.p018ui;

import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import je0.C21216d0;
import je0.C21229g0;
import je0.C21230h0;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C88989a;
import rx3.C36570n;
import se0.C22361f;
import te3.C51195s3;
import vo3.C90852c;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/openim/ui/OpenIMKefuConfirmUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-comm_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.openim.ui.OpenIMKefuConfirmUI */
public final class OpenIMKefuConfirmUI extends MMActivity {

    /* renamed from: d */
    public final C21216d0 f49091d = new C21216d0(this);

    /* renamed from: e */
    public boolean f49092e;

    /* renamed from: com.tencent.mm.openim.ui.OpenIMKefuConfirmUI$a */
    public static final class C17822a implements C22361f.C22362a {
        /* renamed from: a */
        public void mo21987a(int i) {
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b4k;
    }

    public void onBackPressed() {
        this.f49091d.cancel();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        C51195s3 s3Var;
        super.onCreate(bundle);
        getController().mo177105z0(C74933u4.m89764a(getContext().getResources().getColor(C0966R.color.al6), 0));
        View findViewById = findViewById(C0966R.C0970id.bl5);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/openim/ui/OpenIMKefuConfirmUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/openim/ui/OpenIMKefuConfirmUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C21216d0 d0Var = this.f49091d;
        Intent intent = getIntent();
        d0Var.f60010o = intent;
        String str = null;
        OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = intent != null ? (OpenIMKefuStartConversationRequest) intent.getParcelableExtra("key_start_conversation_request") : null;
        d0Var.f59999d = openIMKefuStartConversationRequest;
        Object[] objArr = new Object[2];
        if (!(openIMKefuStartConversationRequest == null || (s3Var = openIMKefuStartConversationRequest.f108520i) == null)) {
            str = s3Var.f141285d;
        }
        objArr[0] = str;
        objArr[1] = Integer.valueOf(d0Var.mo33210i());
        Log.m105925i("MicroMsg.OpenIMKefuConfirmController", "alvinluo onCreate url: %s, confirmPageType: %s", objArr);
        C21216d0 d0Var2 = this.f49091d;
        C17822a aVar2 = new C17822a();
        d0Var2.getClass();
        d0Var2.f59998c = aVar2;
    }

    public void onResume() {
        super.onResume();
        if (!this.f49092e) {
            this.f49092e = true;
            C21216d0 d0Var = this.f49091d;
            if (d0Var.f59999d == null) {
                d0Var.f60008m.mo33217a(3, 5, "request invalid");
                d0Var.mo33209h(5, "request invalid");
                return;
            }
            Activity activity = d0Var.f59996a;
            d0Var.f60009n = C76879j.m92723Q(activity, "", activity.getString(C0966R.string.f360085a04), false, true, new C21229g0(d0Var));
            OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = d0Var.f59999d;
            C87412m.m108591d(openIMKefuStartConversationRequest);
            if (((Number) ((C36570n) d0Var.f60003h).getValue()).intValue() == 8) {
                C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C21230h0(d0Var, openIMKefuStartConversationRequest, (C15601d<? super C21230h0>) null), 3, (Object) null);
            } else {
                d0Var.mo33207g(openIMKefuStartConversationRequest);
            }
        }
    }
}
