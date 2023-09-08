package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import nc0.C76850a;
import p447aw.C103918d;
import qg0.C12215a;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.z */
public class C6641z implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f23926d;

    /* renamed from: e */
    public final /* synthetic */ C96728e0 f23927e;

    public C6641z(C96728e0 e0Var, Context context) {
        this.f23927e = e0Var;
        this.f23926d = context;
    }

    public void onClick(View view) {
        Class cls = C103918d.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!WeChatBrands.Business.Entries.SessionLocation.checkAvailable(view.getContext())) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((NoteEditorUI) this.f23927e.f283371s).f283238X0.mo126184D(-1, false, true);
        if (!C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
            boolean z1 = ((C103918d) C86312j.m106911c(cls)).mo125788z1((Activity) this.f23926d, "android.permission.ACCESS_FINE_LOCATION", 64, (String) null, (String) null);
            Log.m105925i("MicroMsg.WNNoteFootPannel", "summerper checkPermission checkLocation[%b]", Boolean.valueOf(z1));
            if (!z1) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        } else if (!((C103918d) C86312j.m106911c(cls)).Lb0((Activity) this.f23926d, "android.permission.ACCESS_FINE_LOCATION")) {
            if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue()) {
                Context context = this.f23926d;
                C12215a.m11778c((Activity) context, context.getResources().getString(C0966R.string.gbq, new Object[]{LocaleUtil.getApplicationLanguage()}), 30764, true);
            } else {
                ((C103918d) C86312j.m106911c(cls)).mo125790zt((Activity) this.f23926d, "android.permission.ACCESS_FINE_LOCATION", 64);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
        intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
        intent.putExtra("map_view_type", 3);
        C88144b.m109795m(this.f23926d, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, 4098);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
