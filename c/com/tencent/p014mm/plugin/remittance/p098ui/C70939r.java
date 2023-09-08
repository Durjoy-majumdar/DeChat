package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.wxpaysdk.api.ResendMsgInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gc0.C20828a;
import hc0.C20937c;
import qo3.C47883u;
import qo3.C77426q;

/* renamed from: com.tencent.mm.plugin.remittance.ui.r */
public class C70939r {

    /* renamed from: a */
    public Context f205385a;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.r$a */
    public class C70940a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C47883u f205386a;

        public C70940a(C70939r rVar, C47883u uVar) {
            this.f205386a = uVar;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            Log.m105925i("MicroMsg.RemindCollectionDialog", "onDialogClick() bOk:%s", Boolean.valueOf(z));
            C47883u uVar = this.f205386a;
            if (uVar != null) {
                uVar.mo353a(z, str);
            }
        }
    }

    public C70939r(Context context) {
        this.f205385a = context;
    }

    /* renamed from: a */
    public void mo97594a(ResendMsgInfo resendMsgInfo, C47883u uVar) {
        if (resendMsgInfo == null) {
            Log.m105924i("MicroMsg.RemindCollectionDialog", "init() resendMsgInfo == null");
            return;
        }
        View inflate = View.inflate(this.f205385a, C0966R.C0971layout.brb, (ViewGroup) null);
        C20828a b = C20828a.m22825b();
        String str = resendMsgInfo.f211426e;
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59359o = C0966R.C0969drawable.cad;
        b.mo32519h(str, (ImageView) inflate.findViewById(C0966R.C0970id.il7), bVar.mo32666a());
        ((MMNeat7extView) inflate.findViewById(C0966R.C0970id.br8)).mo104279b(resendMsgInfo.f211427f);
        C77426q qVar = new C77426q(this.f205385a);
        qVar.mo107606r(resendMsgInfo.f211425d);
        qVar.mo107592d(inflate);
        qVar.mo107598j(resendMsgInfo.f211428g);
        qVar.mo107602n(resendMsgInfo.f211429h);
        qVar.mo107590b(new C70940a(this, uVar));
        qVar.mo107603o();
    }
}
