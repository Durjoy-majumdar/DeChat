package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import xd3.C78802b;

/* renamed from: com.tencent.mm.ui.conversation.banner.k */
public class C74670k extends C78802b {

    /* renamed from: h */
    public String f219532h;

    /* renamed from: i */
    public String f219533i;

    /* renamed from: j */
    public boolean f219534j;

    public C74670k(Context context, String str, String str2, boolean z) {
        super(context);
        this.f219532h = str;
        this.f219533i = str2;
        this.f219534j = z;
        Context context2 = this.f230570g.get();
        if (context2 != null) {
            this.f230569f = mo103828h(C97625j3.m125812b().mo105905t().mo106157c(this.f219532h, "showtype"), context2);
        }
        View view = this.f230569f;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.b8j);
            String c = C97625j3.m125812b().mo105905t().mo106157c(this.f219532h, "wording");
            String c2 = C97625j3.m125812b().mo105905t().mo106157c(this.f219533i, "wording");
            if (!Util.isNullOrNil(c)) {
                textView.setText(c);
            } else if (!Util.isNullOrNil(c2)) {
                textView.setText(c2);
            }
            String c3 = C97625j3.m125812b().mo105905t().mo106157c(this.f219532h, "linkname");
            String c4 = C97625j3.m125812b().mo105905t().mo106157c(this.f219532h, "linksrc");
            TextView textView2 = (TextView) this.f230569f.findViewById(C0966R.C0970id.b8i);
            if (!Util.isNullOrNil(c3)) {
                textView2.setText(c3);
            }
            k$$a k__a = new k$$a(this, c4);
            if ("2".equals(C97625j3.m125812b().mo105905t().mo106157c(this.f219532h, "showtype"))) {
                this.f230569f.setOnClickListener(k__a);
                return;
            }
            textView2.setOnClickListener(k__a);
            ((ImageView) this.f230569f.findViewById(C0966R.C0970id.b8h)).setOnClickListener(new C74671l(this));
        }
    }

    /* renamed from: a */
    public void mo7968a() {
    }

    /* renamed from: b */
    public int mo7969b() {
        return -1;
    }

    /* renamed from: h */
    public View mo103828h(String str, Context context) {
        return "2".equals(str) ? View.inflate(context, C0966R.C0971layout.co5, (ViewGroup) null) : View.inflate(context, C0966R.C0971layout.f6983u2, (ViewGroup) null);
    }

    /* renamed from: i */
    public void mo103829i() {
    }
}
