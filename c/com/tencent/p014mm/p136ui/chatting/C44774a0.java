package com.tencent.p014mm.p136ui.chatting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SetRecvTmpMsgOptionEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedList;
import ke3.C88144b;
import nj3.C76879j;
import te3.C50869ps2;

/* renamed from: com.tencent.mm.ui.chatting.a0 */
public class C44774a0 implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ C44856q2 f121521a;

    /* renamed from: b */
    public final /* synthetic */ C44851e0 f121522b;

    /* renamed from: com.tencent.mm.ui.chatting.a0$a */
    public class C44775a implements DialogInterface.OnCancelListener {
        public C44775a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123470p(1030, C44774a0.this.f121522b);
        }
    }

    public C44774a0(C44851e0 e0Var, C44856q2 q2Var) {
        this.f121522b = e0Var;
        this.f121521a = q2Var;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        if (i == 0) {
            Intent intent = new Intent();
            try {
                intent.putExtra("rawUrl", String.format(C44851e0.f121690f, new Object[]{URLEncoder.encode(this.f121521a.f121701a, "UTF-8"), URLEncoder.encode(this.f121521a.f121702b, "UTF-8"), Long.valueOf(this.f121521a.f121703c.mo108774y2()), Integer.valueOf((int) (this.f121521a.f121703c.getCreateTime() / 1000)), 42}));
                intent.putExtra("show_bottom", false);
                intent.putExtra("showShare", false);
                C88144b.m109791i(this.f121522b.f121692e.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            } catch (UnsupportedEncodingException e) {
                Log.m105921e("MicroMsg.AppSpamClickListener", "exception in expore, %s", e.getMessage());
            }
        } else if (i == 1) {
            C44856q2 q2Var = this.f121521a;
            Log.m105919d("MicroMsg.AppSpamClickListener", "hakon refulse, fromUserName = %s, templateId = %s", q2Var.f121701a, q2Var.f121702b);
            C97625j3.m125815e().mo123455a(1030, this.f121522b);
            C50869ps2 ps22 = new C50869ps2();
            ps22.f139940f = 1;
            ps22.f139938d = this.f121521a.f121702b;
            ps22.f139939e = "";
            LinkedList<C50869ps2> linkedList = new LinkedList<>();
            linkedList.add(ps22);
            SetRecvTmpMsgOptionEvent setRecvTmpMsgOptionEvent = new SetRecvTmpMsgOptionEvent();
            SetRecvTmpMsgOptionEvent.C28823a aVar = setRecvTmpMsgOptionEvent.f78977d;
            aVar.f78978a = this.f121521a.f121701a;
            aVar.f78979b = linkedList;
            if (setRecvTmpMsgOptionEvent.publish()) {
                C44851e0 e0Var = this.f121522b;
                e0Var.f121691d = C76879j.m92723Q(e0Var.f121692e.mo91565f(), this.f121522b.f121692e.mo91572m().getString(C0966R.string.a3h), this.f121522b.f121692e.mo91572m().getString(C0966R.string.a4d), true, true, new C44775a());
            }
        }
    }
}
