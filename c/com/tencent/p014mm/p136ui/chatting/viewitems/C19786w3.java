package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.w3 */
public class C19786w3 extends C19782s3 {

    /* renamed from: d */
    public ImageView f56293d;

    /* renamed from: e */
    public ImageView f56294e;

    /* renamed from: f */
    public View f56295f;

    /* renamed from: g */
    public TextView f56296g;

    /* renamed from: h */
    public MMNeat7extView f56297h;

    /* renamed from: i */
    public MMNeat7extView f56298i;

    /* renamed from: j */
    public View f56299j;

    /* renamed from: a */
    public void mo26227a(View view) {
        ViewStub viewStub;
        if (this.f56257a == null && (viewStub = (ViewStub) view.findViewById(C0966R.C0970id.l9l)) != null) {
            viewStub.inflate();
            View findViewById = view.findViewById(C0966R.C0970id.b5r);
            this.f56257a = findViewById;
            this.f56293d = (ImageView) findViewById.findViewById(C0966R.C0970id.buo);
            this.f56294e = (ImageView) this.f56257a.findViewById(C0966R.C0970id.i1x);
            ImageView imageView = (ImageView) this.f56257a.findViewById(C0966R.C0970id.hw9);
            this.f56295f = this.f56257a.findViewById(C0966R.C0970id.b8b);
            this.f56296g = (TextView) this.f56257a.findViewById(C0966R.C0970id.hwd);
            this.f56297h = (MMNeat7extView) this.f56257a.findViewById(C0966R.C0970id.oim);
            this.f56298i = (MMNeat7extView) this.f56257a.findViewById(C0966R.C0970id.jmf);
            this.f56299j = this.f56257a.findViewById(C0966R.C0970id.jml);
        }
    }
}
