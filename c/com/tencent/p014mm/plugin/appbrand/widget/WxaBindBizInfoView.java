package com.tencent.p014mm.plugin.appbrand.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.WxaBindBizInfoView */
public class WxaBindBizInfoView extends LinearLayout {

    /* renamed from: d */
    public List<WxaAttributes.WxaEntryInfo> f12000d;

    /* renamed from: e */
    public View f12001e;

    /* renamed from: f */
    public View f12002f;

    static {
        C76577a.m92151b(MMApplicationContext.getContext(), 15);
        C76577a.m92151b(MMApplicationContext.getContext(), 30);
    }

    public WxaBindBizInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo1974a();
    }

    /* renamed from: a */
    public final void mo1974a() {
        this.f12000d = new LinkedList();
        View inflate = View.inflate(getContext(), C0966R.C0971layout.f6446f3, this);
        this.f12001e = inflate.findViewById(C0966R.C0970id.e_6);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.f1d);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f359390ko1);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.btx);
        this.f12002f = inflate.findViewById(C0966R.C0970id.f358767gz0);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.f357787br2);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(C0966R.C0970id.f358465fa1);
    }

    public List<WxaAttributes.WxaEntryInfo> getWxaEntryInfoList() {
        return this.f12000d;
    }

    public WxaBindBizInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo1974a();
    }
}
