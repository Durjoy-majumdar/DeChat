package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MaskLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import p196ln.C76705f;

/* renamed from: com.tencent.mm.ui.contact.w0 */
public class C6939w0 extends LinearLayout {

    /* renamed from: d */
    public Context f24634d;

    /* renamed from: e */
    public String f24635e;

    public C6939w0(Context context, String str) {
        super(context);
        this.f24634d = context;
        this.f24635e = str;
        View inflate = View.inflate(getContext(), C0966R.C0971layout.a3i, this);
        View findViewById = findViewById(C0966R.C0970id.ckb);
        inflate.setOnClickListener(new C6937u0(this));
        findViewById.setOnTouchListener(new C6938v0(this));
        C72996z1 N2 = C97625j3.m125812b().mo105907v().mo69664N2(this.f24635e);
        if (N2 == null || ((int) N2.f108320R1) <= 0) {
            Log.m105921e("MicroMsg.EnterpriseBizViewItem", "contact is null, %s", this.f24635e);
            return;
        }
        MaskLayout maskLayout = (MaskLayout) findViewById.findViewById(C0966R.C0970id.a_t);
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) maskLayout.getContentView(), this.f24635e);
        if (N2.mo73953E2() != 0) {
            maskLayout.setMaskBitmap((Bitmap) null);
        } else {
            maskLayout.setMaskBitmap((Bitmap) null);
        }
        ((TextView) findViewById(C0966R.C0970id.ckc)).setText(N2.mo62909j3());
    }
}
