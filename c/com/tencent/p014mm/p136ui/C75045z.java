package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C76868a0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.z */
public class C75045z {

    /* renamed from: com.tencent.mm.ui.z$a */
    public class C75046a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76868a0 f220798d;

        /* renamed from: e */
        public final /* synthetic */ Context f220799e;

        /* renamed from: f */
        public final /* synthetic */ Runnable f220800f;

        public C75046a(C76868a0 a0Var, Context context, Runnable runnable) {
            this.f220798d = a0Var;
            this.f220799e = context;
            this.f220800f = runnable;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/DismissConversationHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f220798d.mo140680z();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CONVERSATION_DISMISS_INTRO_BOOLEAN_SYNC, Boolean.FALSE);
            C75045z.m90000a(this.f220799e, this.f220800f);
            C117292a.m165361g(this, "com/tencent/mm/ui/DismissConversationHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.z$b */
    public class C75047b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Runnable f220801d;

        /* renamed from: e */
        public final /* synthetic */ Context f220802e;

        public C75047b(Runnable runnable, Context context) {
            this.f220801d = runnable;
            this.f220802e = context;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f220801d.run();
            if (C85875k4.m106208w()) {
                C88144b.m109801s(this.f220802e, ".ui.EmptyActivity", new Intent(), (Bundle) null);
            }
        }
    }

    /* renamed from: a */
    public static void m90000a(Context context, Runnable runnable) {
        C76879j.m92708B(context, context.getString(C0966R.string.glu), "", context.getString(C0966R.string.glv), context.getString(C0966R.string.f7926wf), new C75047b(runnable, context), (DialogInterface.OnClickListener) null, C0966R.color.f3041d1);
    }

    /* renamed from: b */
    public static void m90001b(Context context, Runnable runnable) {
        if (C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_CONVERSATION_DISMISS_INTRO_BOOLEAN_SYNC, true)) {
            C76868a0 a0Var = new C76868a0(context);
            a0Var.f224686L.setText(context.getString(C0966R.string.glx));
            a0Var.f224687M.setText(context.getString(C0966R.string.glw));
            a0Var.f224688N.setOnClickListener(new C75046a(a0Var, context, runnable));
            a0Var.mo140655A();
            return;
        }
        m90000a(context, runnable);
    }
}
