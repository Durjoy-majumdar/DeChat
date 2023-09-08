package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.scanner.C5176w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p728vs.C52991e;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.scanner.ui.a0 */
public class C94512a0 implements C11385n {

    /* renamed from: d */
    public Context f273308d;

    /* renamed from: e */
    public String f273309e;

    /* renamed from: f */
    public C52991e f273310f;

    /* renamed from: g */
    public C89779i0 f273311g;

    /* renamed from: h */
    public MTimerHandler f273312h = new MTimerHandler(new C94513a(), false);

    /* renamed from: com.tencent.mm.plugin.scanner.ui.a0$a */
    public class C94513a implements MTimerHandler.CallBack {

        /* renamed from: com.tencent.mm.plugin.scanner.ui.a0$a$a */
        public class C94514a implements DialogInterface.OnCancelListener {
            public C94514a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d((C117747y) C94512a0.this.f273310f);
                C94512a0.this.f273311g = null;
            }
        }

        public C94513a() {
        }

        public boolean onTimerExpired() {
            C94512a0 a0Var = C94512a0.this;
            Context context = a0Var.f273308d;
            a0Var.f273311g = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), C94512a0.this.f273308d.getString(C0966R.string.a4d), false, true, new C94514a());
            return false;
        }
    }

    public C94512a0(Context context) {
        this.f273308d = context;
    }

    /* renamed from: a */
    public final void mo129998a(String str, int i, byte[] bArr) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("useJs", true);
        intent.putExtra("vertical_scroll", true);
        intent.putExtra("geta8key_session_id", i);
        intent.putExtra("geta8key_cookie", bArr);
        ((C67654r1) C5176w.m5203a()).mo93190w(intent, this.f273308d);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        this.f273312h.stopTimer();
        C89779i0 i0Var = this.f273311g;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        C86709a0.m107524d().mo123470p(233, this);
        C52991e eVar = (C52991e) yVar;
        if (i == 0 && i2 == 0) {
            String R = eVar.mo63062R();
            if (R == null || R.length() == 0) {
                mo129998a(this.f273309e, eVar.getCurrentSessionId(), eVar.mo63063U());
            } else {
                mo129998a(R, eVar.getCurrentSessionId(), eVar.mo63063U());
            }
        } else {
            Log.m105920e("MicroMsg.scanner.ViewMMURL", "getA8Key fail, errType = " + i + ", errCode = " + i2);
            mo129998a(this.f273309e, eVar.getCurrentSessionId(), eVar.mo63063U());
        }
    }
}
