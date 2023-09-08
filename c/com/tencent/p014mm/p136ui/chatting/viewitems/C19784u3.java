package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u3 */
public class C19784u3 extends C19782s3 {

    /* renamed from: d */
    public View f56270d;

    /* renamed from: e */
    public ImageView f56271e;

    /* renamed from: f */
    public ImageView f56272f;

    /* renamed from: g */
    public TextView f56273g;

    /* renamed from: h */
    public TextView f56274h;

    /* renamed from: i */
    public TextView f56275i;

    /* renamed from: j */
    public FinderLiveOnliveWidget f56276j;

    /* renamed from: k */
    public FinderLiveOnliveWidget f56277k;

    /* renamed from: l */
    public View f56278l;

    /* renamed from: m */
    public View f56279m;

    /* renamed from: n */
    public ImageView f56280n;

    /* renamed from: o */
    public View f56281o;

    /* renamed from: p */
    public TextView f56282p;

    /* renamed from: q */
    public TextView f56283q;

    /* renamed from: r */
    public View f56284r;

    /* renamed from: s */
    public TextView f56285s;

    /* renamed from: t */
    public TextView f56286t;

    /* renamed from: u */
    public FinderLiveOnliveWidget f56287u;

    /* renamed from: v */
    public FinderLiveOnliveWidget f56288v;

    /* renamed from: a */
    public void mo26227a(View view) {
        ViewStub viewStub;
        if (this.f56257a == null && (viewStub = (ViewStub) view.findViewById(C0966R.C0970id.f359503n51)) != null) {
            viewStub.inflate();
            this.f56257a = view.findViewById(C0966R.C0970id.mxa);
            View findViewById = view.findViewById(C0966R.C0970id.njl);
            this.f56270d = findViewById;
            this.f56271e = (ImageView) findViewById.findViewById(C0966R.C0970id.mxf);
            this.f56272f = (ImageView) this.f56270d.findViewById(C0966R.C0970id.mxj);
            this.f56273g = (TextView) this.f56270d.findViewById(C0966R.C0970id.mxk);
            this.f56274h = (TextView) this.f56270d.findViewById(C0966R.C0970id.mxl);
            this.f56275i = (TextView) this.f56270d.findViewById(C0966R.C0970id.mxi);
            this.f56276j = (FinderLiveOnliveWidget) this.f56270d.findViewById(C0966R.C0970id.dnt);
            this.f56277k = (FinderLiveOnliveWidget) this.f56270d.findViewById(C0966R.C0970id.dke);
            this.f56278l = view.findViewById(C0966R.C0970id.njk);
            this.f56279m = view.findViewById(C0966R.C0970id.l67);
            this.f56280n = (ImageView) this.f56278l.findViewById(C0966R.C0970id.l66);
            this.f56281o = this.f56278l.findViewById(C0966R.C0970id.mot);
            this.f56282p = (TextView) this.f56278l.findViewById(C0966R.C0970id.mou);
            this.f56283q = (TextView) this.f56278l.findViewById(C0966R.C0970id.mow);
            this.f56284r = this.f56278l.findViewById(C0966R.C0970id.l68);
            this.f56285s = (TextView) this.f56278l.findViewById(C0966R.C0970id.l69);
            this.f56286t = (TextView) this.f56278l.findViewById(C0966R.C0970id.l6_);
            this.f56287u = (FinderLiveOnliveWidget) this.f56278l.findViewById(C0966R.C0970id.dnt);
            this.f56288v = (FinderLiveOnliveWidget) this.f56278l.findViewById(C0966R.C0970id.dke);
        }
    }
}
