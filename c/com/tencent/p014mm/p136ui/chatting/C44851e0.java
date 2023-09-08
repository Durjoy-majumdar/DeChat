package com.tencent.p014mm.p136ui.chatting;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C74785j2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.pluginsdk.model.app.C44549d1;
import com.tencent.p014mm.pluginsdk.model.app.C44552f;
import com.tencent.p014mm.pluginsdk.model.app.C44554g;
import com.tencent.p014mm.pluginsdk.model.app.C44583u0;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p763ym.C79138l;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.ui.chatting.e0 */
public class C44851e0 implements View.OnClickListener, C44583u0, C11385n {

    /* renamed from: f */
    public static final String f121690f = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/mp/readtemplate?t=wxm-appmsg-inform&bizusername=%s&tid=%s&mid=%s&mtime=%s&scene=%s#wechat_redirect");

    /* renamed from: d */
    public ProgressDialog f121691d;

    /* renamed from: e */
    public C67391b f121692e;

    public C44851e0(C67391b bVar) {
        this.f121692e = bVar;
    }

    /* renamed from: a */
    public static void m49715a(C44851e0 e0Var, C117747y yVar) {
        e0Var.getClass();
        C97625j3.m125815e().mo123460f(yVar);
        e0Var.f121691d = C76879j.m92723Q(e0Var.f121692e.mo91565f(), e0Var.f121692e.mo91572m().getString(C0966R.string.a3h), e0Var.f121692e.mo91572m().getString(C0966R.string.a4d), true, true, new C44850d0(e0Var, yVar));
    }

    /* renamed from: c3 */
    public void mo69343c3(int i, int i2, String str, C44549d1 d1Var) {
        Log.m105918d("MicroMsg.AppSpamClickListener", "appsettings errType = " + i + ", errCode = " + i2);
        ProgressDialog progressDialog = this.f121691d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f121691d.dismiss();
            this.f121691d = null;
        }
        C72709y1.wx0().mo69347a(2, this);
        if (i == 0 && i2 == 0) {
            C76879j.m92726T(this.f121692e.mo91565f(), this.f121692e.mo91572m().getString(C0966R.string.fbi));
        } else if (!C74785j2.C6981a.m7247a(this.f121692e.mo91565f(), i, i2, str, 4)) {
            C76701a.makeText((Context) this.f121692e.mo91565f(), (CharSequence) this.f121692e.mo91572m().getString(C0966R.string.f_6, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            Log.m105920e("MicroMsg.AppSpamClickListener", "onClick tag is null");
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i = 2;
        boolean z = false;
        if (view.getTag() instanceof C74243t8) {
            C74243t8 t8Var = (C74243t8) view.getTag();
            if (t8Var == null) {
                Log.m105920e("MicroMsg.AppSpamClickListener", "ItemDataTag is null");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            String str = t8Var.f217989w.f195562d;
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.AppSpamClickListener", "appId is null or nil");
            } else if (((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(str, false) == null) {
                Log.m105920e("MicroMsg.AppSpamClickListener", "get null appinfo : appid = " + str);
            } else {
                z = true;
            }
            if (!z) {
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C44552f wx02 = C72709y1.wx0();
            wx02.getClass();
            MMHandlerThread.postToMainThread(new C44554g(wx02, 2, this));
            if (!this.f121692e.mo91583x()) {
                i = 1;
            }
            String r = this.f121692e.mo91577r();
            if (C72996z1.m85820U5(r)) {
                r = C75604z3.m90847s(t8Var.f212238a.getContent());
            }
            C68070l.C68072b bVar = t8Var.f217989w;
            C76879j.m92707A(this.f121692e.mo91565f(), this.f121692e.mo91572m().getString(C0966R.string.a0a), this.f121692e.mo91572m().getString(C0966R.string.a0b), this.f121692e.mo91572m().getString(C0966R.string.f7346dj), this.f121692e.mo91572m().getString(C0966R.string.hvi), new C44776b0(this, bVar, r, i), new C44777c0(this, bVar, r, i));
        } else if (view.getTag() instanceof C44856q2) {
            C44856q2 q2Var = (C44856q2) view.getTag();
            if (q2Var == null) {
                Log.m105920e("MicroMsg.AppSpamClickListener", "TemplateItemDataTag is null");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (Util.isNullOrNil(q2Var.f121702b) || q2Var.f121703c == null) {
                Log.m105921e("MicroMsg.AppSpamClickListener", "wrong args, tag is null ? ", Boolean.FALSE);
            } else {
                C76879j.m92737h(this.f121692e.mo91565f(), (String) null, new String[]{this.f121692e.mo91572m().getString(C0966R.string.jyp), this.f121692e.mo91572m().getString(C0966R.string.jyq), this.f121692e.mo91572m().getString(C0966R.string.f7926wf)}, (String) null, true, new C44774a0(this, q2Var));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/AppSpamClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        ProgressDialog progressDialog = this.f121691d;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f121691d.dismiss();
            this.f121691d = null;
        }
        C97625j3.m125815e().mo123470p(1030, this);
        if (i == 0 && i2 == 0) {
            C76879j.m92726T(this.f121692e.mo91565f(), this.f121692e.mo91572m().getString(C0966R.string.fbi));
            return;
        }
        C76701a.makeText((Context) this.f121692e.mo91565f(), (CharSequence) this.f121692e.mo91572m().getString(C0966R.string.jyr, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
    }
}
