package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import p196ln.C76706g;
import p196ln.C76708i;
import p214om.C11502f;
import p910lj.C76701a;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$e */
public class n8$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C96085n8 f21243d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.n8$$e$a */
    public class C5481a implements C75597w2.C31525a {
        public C5481a() {
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            SnsMethodCalculate.markStartTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10$1");
            C96085n8 n8Var = n8$$e.this.f21243d;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            C89779i0 i0Var = n8Var.f280585c;
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            if (i0Var != null) {
                C96085n8 n8Var2 = n8$$e.this.f21243d;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                C89779i0 i0Var2 = n8Var2.f280585c;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                i0Var2.dismiss();
            }
            if (!z) {
                C76701a.makeText(C96085n8.m123094b(n8$$e.this.f21243d), (CharSequence) C96085n8.m123094b(n8$$e.this.f21243d).getString(C0966R.string.f0a, new Object[]{3, -1}), 0).show();
            } else {
                ((C76708i) C86312j.m106911c(C76708i.class)).mo106848yE(str, 3);
                ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93582i(str);
                Intent intent = new Intent();
                intent.addFlags(268435456);
                intent.putExtra("Contact_User", str);
                intent.putExtra("Contact_Scene", 37);
                C86709a0.m107528h();
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
                if (z1Var != null && z1Var.mo62916m3()) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.kvStat(10298, str + "," + 37);
                    intent.putExtra("Contact_Scene", 37);
                }
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, C96085n8.m123094b(n8$$e.this.f21243d));
            }
            SnsMethodCalculate.markEndTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.n8$$e$b */
    public class C5482b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C5479k8 f21245d;

        public C5482b(n8$$e n8__e, C5479k8 k8Var) {
            this.f21245d = k8Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10$2");
            C75597w2 a = C31519v2.m39436a();
            this.f21245d.getClass();
            a.mo55989f((String) null);
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10$2");
        }
    }

    public n8$$e(C96085n8 n8Var) {
        this.f21243d = n8Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10");
        if (view.getTag() instanceof C5479k8) {
            C5479k8 k8Var = (C5479k8) view.getTag();
            k8Var.getClass();
            if (Util.isNullOrNil((String) null)) {
                Log.m105920e("MicroMsg.TimeLineClickEvent", "show source profile fail, username is null");
                C76701a.makeText(C96085n8.m123094b(this.f21243d), (CharSequence) C96085n8.m123094b(this.f21243d).getString(C0966R.string.f0a, new Object[]{3, -1}), 0).show();
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C86709a0.m107528h();
            C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
            k8Var.getClass();
            C72996z1 z1Var = Ni.get((String) null);
            if (z1Var != null) {
                String username = z1Var.getUsername();
                k8Var.getClass();
                if (username.equals((Object) null)) {
                    Intent intent = new Intent();
                    intent.addFlags(268435456);
                    k8Var.getClass();
                    intent.putExtra("Contact_User", (String) null);
                    C115669n nVar = C115669n.INSTANCE;
                    StringBuilder sb = new StringBuilder();
                    k8Var.getClass();
                    sb.append((String) null);
                    sb.append(",");
                    sb.append(37);
                    nVar.kvStat(10298, sb.toString());
                    intent.putExtra("Contact_Scene", 37);
                    ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, C96085n8.m123094b(this.f21243d));
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
            }
            C75597w2 a = C31519v2.m39436a();
            k8Var.getClass();
            a.mo55988e((String) null, "", new C5481a());
            C96085n8 n8Var = this.f21243d;
            C89779i0 Q = C76879j.m92723Q(C96085n8.m123094b(n8Var), C96085n8.m123094b(this.f21243d).getString(C0966R.string.a3h), C96085n8.m123094b(this.f21243d).getString(C0966R.string.a4d), true, true, new C5482b(this, k8Var));
            SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            n8Var.f280585c = Q;
            SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$10");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
