package com.tencent.p014mm.plugin.qqmail.p090ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.MailAttachListLinearLayout */
public class MailAttachListLinearLayout extends LinearLayout {

    /* renamed from: d */
    public Context f248797d;

    /* renamed from: e */
    public List<String> f248798e = new ArrayList();

    /* renamed from: f */
    public String f248799f;

    public MailAttachListLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f248797d = context;
    }

    public void setMailId(String str) {
        this.f248799f = str;
    }
}
