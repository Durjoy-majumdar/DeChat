package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.v3 */
public class C19785v3 extends C19782s3 {

    /* renamed from: d */
    public TextView f56289d;

    /* renamed from: e */
    public ImageView f56290e;

    /* renamed from: f */
    public ImageView f56291f;

    /* renamed from: g */
    public ImageView f56292g;

    /* renamed from: a */
    public void mo26227a(View view) {
        ViewStub viewStub;
        if (this.f56257a == null && (viewStub = (ViewStub) view.findViewById(C0966R.C0970id.l9k)) != null) {
            viewStub.inflate();
            View findViewById = view.findViewById(C0966R.C0970id.b5p);
            this.f56257a = findViewById;
            this.f56290e = (ImageView) findViewById.findViewById(C0966R.C0970id.buo);
            this.f56258b = (TextView) this.f56257a.findViewById(C0966R.C0970id.knx);
            this.f56289d = (TextView) this.f56257a.findViewById(C0966R.C0970id.hxq);
            this.f56291f = (ImageView) this.f56257a.findViewById(C0966R.C0970id.f358928hx1);
            this.f56292g = (ImageView) this.f56257a.findViewById(C0966R.C0970id.lkn);
            this.f56259c = (ImageView) this.f56257a.findViewById(C0966R.C0970id.bv_);
        }
    }
}
