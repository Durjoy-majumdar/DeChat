package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import di3.C86312j;
import he0.C76158j;

/* renamed from: com.tencent.mm.ui.contact.b3 */
public class C6880b3 extends LinearLayout {

    /* renamed from: d */
    public Context f24514d;

    /* renamed from: e */
    public String f24515e;

    public C6880b3(Context context, String str) {
        super(context);
        this.f24514d = context;
        this.f24515e = str;
        Class cls = C76158j.class;
        View inflate = View.inflate(getContext(), C0966R.C0971layout.f359920bm3, this);
        View findViewById = findViewById(C0966R.C0970id.ckb);
        inflate.setOnClickListener(new C6945z2(this));
        findViewById.setOnTouchListener(new C6877a3(this));
        MaskLayout maskLayout = (MaskLayout) findViewById.findViewById(C0966R.C0970id.a_t);
        ((C76158j) C86312j.m106911c(cls)).mo106369nc(this.f24515e, "openim_acct_type_icon", C76158j.C8510a.TYPE_URL);
        if (this.f24515e.equals("cloudim")) {
            ((ImageView) maskLayout.getContentView()).setImageResource(C0966R.raw.avatar_wechat_frame);
        }
        ((TextView) findViewById(C0966R.C0970id.ckc)).setText(((C76158j) C86312j.m106911c(cls)).mo106369nc(this.f24515e, "openim_acct_type_title", C76158j.C8510a.TYPE_WORDING));
    }
}
