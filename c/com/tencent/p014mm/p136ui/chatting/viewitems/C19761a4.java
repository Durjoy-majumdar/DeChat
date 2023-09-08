package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.a4 */
public class C19761a4 extends C19782s3 {

    /* renamed from: d */
    public ImageView f56182d;

    /* renamed from: e */
    public TextView f56183e;

    /* renamed from: a */
    public void mo26227a(View view) {
        ViewStub viewStub;
        if (this.f56257a == null && (viewStub = (ViewStub) view.findViewById(C0966R.C0970id.l9q)) != null) {
            viewStub.inflate();
            View findViewById = view.findViewById(C0966R.C0970id.b5x);
            this.f56257a = findViewById;
            this.f56258b = (TextView) findViewById.findViewById(C0966R.C0970id.knx);
            this.f56183e = (TextView) this.f56257a.findViewById(C0966R.C0970id.kky);
            this.f56182d = (ImageView) this.f56257a.findViewById(C0966R.C0970id.f358928hx1);
        }
    }
}
