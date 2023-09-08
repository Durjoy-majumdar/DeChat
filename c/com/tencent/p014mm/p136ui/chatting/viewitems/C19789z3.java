package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.z3 */
public class C19789z3 extends C19782s3 {

    /* renamed from: d */
    public MMNeat7extView f56311d;

    /* renamed from: e */
    public TextView f56312e;

    /* renamed from: f */
    public ImageView f56313f;

    /* renamed from: g */
    public ImageView f56314g;

    /* renamed from: h */
    public View f56315h;

    /* renamed from: a */
    public void mo26227a(View view) {
        ViewStub viewStub;
        if (this.f56257a == null && (viewStub = (ViewStub) view.findViewById(C0966R.C0970id.l9p)) != null) {
            viewStub.inflate();
            View findViewById = view.findViewById(C0966R.C0970id.b5v);
            this.f56257a = findViewById;
            this.f56313f = (ImageView) findViewById.findViewById(C0966R.C0970id.buo);
            this.f56259c = (ImageView) this.f56257a.findViewById(C0966R.C0970id.bv_);
            this.f56314g = (ImageView) this.f56257a.findViewById(C0966R.C0970id.i1x);
            this.f56311d = (MMNeat7extView) this.f56257a.findViewById(C0966R.C0970id.kpm);
            this.f56312e = (TextView) this.f56257a.findViewById(C0966R.C0970id.kky);
            this.f56315h = this.f56257a.findViewById(C0966R.C0970id.b9b);
        }
    }
}
