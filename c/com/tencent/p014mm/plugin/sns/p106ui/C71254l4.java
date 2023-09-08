package com.tencent.p014mm.plugin.sns.p106ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import de3.C75369r;
import di3.C86312j;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import u73.C101980n;

/* renamed from: com.tencent.mm.plugin.sns.ui.l4 */
public class C71254l4 implements TextWatcher {

    /* renamed from: d */
    public List<ForegroundColorSpan> f206199d = new LinkedList();

    /* renamed from: e */
    public final /* synthetic */ SnsCommentUI f206200e;

    public C71254l4(SnsCommentUI snsCommentUI) {
        this.f206200e = snsCommentUI;
    }

    public void afterTextChanged(Editable editable) {
        SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
        Editable text = SnsCommentUI.m83635H7(this.f206200e).getText();
        for (ForegroundColorSpan removeSpan : this.f206199d) {
            text.removeSpan(removeSpan);
        }
        ((LinkedList) this.f206199d).clear();
        String obj = SnsCommentUI.m83635H7(this.f206200e).getText().toString();
        if (((C101980n) C86312j.m106911c(C101980n.class)).mo134684EO()) {
            Matcher matcher = C75369r.f221604t.matcher(obj);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f206200e.getResources().getColor(C0966R.color.Link_100));
                ((LinkedList) this.f206199d).add(foregroundColorSpan);
                text.setSpan(foregroundColorSpan, start, end, 33);
            }
        }
        SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
        SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
        SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$6");
    }
}
