package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.x3 */
public class C19787x3 extends C19782s3 {

    /* renamed from: d */
    public ImageView f56300d;

    /* renamed from: e */
    public View f56301e;

    /* renamed from: f */
    public View f56302f;

    /* renamed from: g */
    public MMNeat7extView f56303g;

    /* renamed from: h */
    public MMNeat7extView f56304h;

    /* renamed from: i */
    public TextView f56305i;

    /* renamed from: j */
    public ImageView f56306j;

    /* renamed from: k */
    public ImageView f56307k;

    /* renamed from: a */
    public void mo26227a(View view) {
        ViewStub viewStub;
        if (this.f56257a == null && (viewStub = (ViewStub) view.findViewById(C0966R.C0970id.l9n)) != null) {
            viewStub.inflate();
            View findViewById = view.findViewById(C0966R.C0970id.kqy);
            this.f56257a = findViewById;
            this.f56304h = (MMNeat7extView) findViewById.findViewById(C0966R.C0970id.knx);
            this.f56300d = (ImageView) this.f56257a.findViewById(C0966R.C0970id.buo);
            this.f56301e = this.f56257a.findViewById(C0966R.C0970id.buv);
            this.f56302f = this.f56257a.findViewById(C0966R.C0970id.agk);
            this.f56303g = (MMNeat7extView) this.f56257a.findViewById(C0966R.C0970id.kpj);
            this.f56305i = (TextView) this.f56257a.findViewById(C0966R.C0970id.f357871c73);
            this.f56306j = (ImageView) this.f56257a.findViewById(C0966R.C0970id.i1x);
            this.f56307k = (ImageView) this.f56257a.findViewById(C0966R.C0970id.bve);
        }
    }
}
