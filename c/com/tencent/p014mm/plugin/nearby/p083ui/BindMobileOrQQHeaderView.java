package com.tencent.p014mm.plugin.nearby.p083ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.nearby.ui.BindMobileOrQQHeaderView */
public class BindMobileOrQQHeaderView extends LinearLayout {

    /* renamed from: d */
    public WeImageView f20063d;

    /* renamed from: e */
    public C4922b f20064e;

    /* renamed from: f */
    public View.OnClickListener f20065f;

    /* renamed from: com.tencent.mm.plugin.nearby.ui.BindMobileOrQQHeaderView$a */
    public class C4921a implements View.OnClickListener {
        public C4921a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearby/ui/BindMobileOrQQHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.setClass(BindMobileOrQQHeaderView.this.getContext(), BindMContactIntroUI.class);
            intent.putExtra("key_upload_scene", 7);
            MMWizardActivity.m7017L7(BindMobileOrQQHeaderView.this.getContext(), intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/BindMobileOrQQHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.BindMobileOrQQHeaderView$b */
    public enum C4922b {
        Mobile
    }

    public BindMobileOrQQHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20065f = new C4921a();
        mo5868a(context);
    }

    /* renamed from: a */
    public final void mo5868a(Context context) {
        View inflate = View.inflate(context, C0966R.C0971layout.bjw, this);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.ha8);
        this.f20063d = (WeImageView) inflate.findViewById(C0966R.C0970id.h_q);
        int ordinal = this.f20064e.ordinal();
        if (ordinal == 0) {
            setOnClickListener(this.f20065f);
            this.f20063d.setImageResource(C0966R.raw.icons_outlined_cellphone);
        } else if (ordinal == 1) {
            setOnClickListener(this.f20065f);
            this.f20063d.setImageResource(C0966R.raw.icons_outlined_contacts);
        }
    }

    public BindMobileOrQQHeaderView(Context context) {
        super(context);
        this.f20065f = new C4921a();
        this.f20064e = C4922b.Mobile;
        mo5868a(context);
    }
}
