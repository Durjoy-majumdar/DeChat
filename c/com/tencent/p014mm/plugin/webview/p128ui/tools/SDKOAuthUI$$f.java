package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import java.util.LinkedList;
import p629ny.C76979h;
import te3.C90438s43;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$f */
public final class SDKOAuthUI$$f extends BaseAdapter {

    /* renamed from: d */
    public LinkedList<C90438s43> f249437d;

    /* renamed from: e */
    public LayoutInflater f249438e;

    /* renamed from: f */
    public C20937c.C20939b f249439f;

    /* renamed from: g */
    public Context f249440g;

    /* renamed from: h */
    public int f249441h;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI$$f$a */
    public static final class C85566a {

        /* renamed from: a */
        public ImageView f249442a;

        /* renamed from: b */
        public TextView f249443b;

        /* renamed from: c */
        public TextView f249444c;

        /* renamed from: d */
        public ImageView f249445d;
    }

    public SDKOAuthUI$$f(Context context, LinkedList<C90438s43> linkedList, int i) {
        this.f249440g = context;
        this.f249438e = LayoutInflater.from(context);
        this.f249437d = linkedList;
        if (linkedList == null) {
            this.f249437d = new LinkedList<>();
        }
        Log.m105925i("MicroMsg.SdkOAuthUI", "LoginAvatarListAdapter avatars size:%d", Integer.valueOf(this.f249437d.size()));
        C20937c.C20939b bVar = new C20937c.C20939b();
        this.f249439f = bVar;
        bVar.f59359o = C0966R.raw.native_oauth_default_head_img;
        bVar.f59364t = true;
        bVar.f59365u = this.f249440g.getResources().getDimension(C0966R.dimen.f357058am1);
        this.f249441h = i;
    }

    /* renamed from: a */
    public C90438s43 getItem(int i) {
        LinkedList<C90438s43> linkedList = this.f249437d;
        if (linkedList == null || i < 0 || i >= linkedList.size()) {
            return null;
        }
        return this.f249437d.get(i);
    }

    public int getCount() {
        LinkedList<C90438s43> linkedList = this.f249437d;
        if (linkedList == null) {
            return 0;
        }
        return linkedList.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C85566a aVar;
        View view2;
        C90438s43 a = getItem(i);
        if (a == null) {
            return view;
        }
        if (view == null) {
            aVar = new C85566a();
            view2 = this.f249438e.inflate(C0966R.C0971layout.f6532hf, (ViewGroup) null, false);
            aVar.f249442a = (ImageView) view2.findViewById(C0966R.C0970id.f357481a24);
            aVar.f249443b = (TextView) view2.findViewById(C0966R.C0970id.a2d);
            aVar.f249444c = (TextView) view2.findViewById(C0966R.C0970id.a1y);
            aVar.f249445d = (ImageView) view2.findViewById(C0966R.C0970id.a2g);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (C85566a) view.getTag();
        }
        aVar.f249443b.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f249440g, a.f259830e, aVar.f249443b.getTextSize()));
        C20828a.m22825b().mo32519h(a.f259831f, aVar.f249442a, this.f249439f.mo32666a());
        String str = a.f259832g;
        if (str != null) {
            aVar.f249444c.setText(str);
            aVar.f249444c.setVisibility(0);
        } else {
            aVar.f249444c.setVisibility(8);
        }
        if (a.f259829d == this.f249441h) {
            aVar.f249445d.setVisibility(0);
        } else {
            aVar.f249445d.setVisibility(4);
        }
        return view2;
    }
}
