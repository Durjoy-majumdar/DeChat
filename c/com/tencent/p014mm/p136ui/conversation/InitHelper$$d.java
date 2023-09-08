package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import f40.C86709a0;
import jr2.C99019x;
import nj3.C76879j;
import os2.C100399d0;
import pc0.C47457o;

/* renamed from: com.tencent.mm.ui.conversation.InitHelper$$d */
public class InitHelper$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ InitHelper f219460d;

    /* renamed from: com.tencent.mm.ui.conversation.InitHelper$$d$a */
    public class C74651a implements DialogInterface.OnCancelListener {
        public C74651a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123458d(InitHelper$$d.this.f219460d.f219445j);
            if (C99019x.m128971c() != null) {
                ((C100399d0) C99019x.m128971c()).mo139791qq();
            }
        }
    }

    public InitHelper$$d(InitHelper initHelper) {
        this.f219460d = initHelper;
    }

    public void run() {
        Object[] objArr = new Object[2];
        objArr[0] = Long.valueOf(this.f219460d.f219442g.mo72288a());
        C47457o oVar = this.f219460d.f219445j;
        objArr[1] = Integer.valueOf(oVar == null ? -2 : oVar.hashCode());
        Log.m105919d("MicroMsg.InitHelper", "dkinit showProgressDlg t:%d initScene:%d", objArr);
        ProgressDialog progressDialog = this.f219460d.f219446n;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f219460d.f219446n.dismiss();
        }
        InitHelper initHelper = this.f219460d;
        Activity activity = initHelper.f219447o;
        initHelper.f219446n = C76879j.m92723Q(activity, activity.getString(C0966R.string.a3h), this.f219460d.f219447o.getString(C0966R.string.a05), true, false, new C74651a());
        C86709a0.m107525e().setHighPriority();
    }
}
