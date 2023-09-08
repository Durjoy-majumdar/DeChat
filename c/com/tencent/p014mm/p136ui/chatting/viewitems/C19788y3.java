package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.y3 */
public class C19788y3 extends C19782s3 {

    /* renamed from: d */
    public MMNeat7extView f56308d;

    /* renamed from: e */
    public TextView f56309e;

    /* renamed from: f */
    public LinearLayout f56310f;

    /* renamed from: a */
    public void mo26227a(View view) {
        ViewStub viewStub;
        if (this.f56257a == null && (viewStub = (ViewStub) view.findViewById(C0966R.C0970id.l9o)) != null) {
            viewStub.inflate();
            View findViewById = view.findViewById(C0966R.C0970id.b5t);
            this.f56257a = findViewById;
            this.f56308d = (MMNeat7extView) findViewById.findViewById(C0966R.C0970id.knx);
            this.f56309e = (TextView) this.f56257a.findViewById(C0966R.C0970id.ki9);
            this.f56310f = (LinearLayout) this.f56257a.findViewById(C0966R.C0970id.kil);
        }
    }
}
