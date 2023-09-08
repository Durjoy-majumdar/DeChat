package com.tencent.p014mm.plugin.base.stub;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.base.stub.C68748c;
import eb0.C75592q0;
import nj3.C76879j;
import sw1.C48477m;

/* renamed from: com.tencent.mm.plugin.base.stub.a */
public class C68746a extends C68748c {

    /* renamed from: com.tencent.mm.plugin.base.stub.a$a */
    public class C68747a implements DialogInterface.OnClickListener {
        public C68747a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C48477m a = C48477m.C13789a.m13091a();
            if (a != null) {
                a.P60(C68746a.this.f197495c, C75592q0.m90772b(), 2, C68746a.this.f197494b);
            }
            C68746a.this.f197496d.mo94586a(false);
        }
    }

    public C68746a(Context context, String str, String str2, C68748c.C68750b bVar) {
        super(context, str, str2, bVar);
    }

    /* renamed from: b */
    public void mo94582b() {
        C76879j.m92744o(this.f197493a, C0966R.string.fb8, C0966R.string.a3h, false, new C68747a());
    }
}
