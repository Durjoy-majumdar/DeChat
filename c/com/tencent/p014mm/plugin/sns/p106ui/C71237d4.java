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

/* renamed from: com.tencent.mm.plugin.sns.ui.d4 */
public class C71237d4 implements TextWatcher {

    /* renamed from: d */
    public List<ForegroundColorSpan> f206179d = new LinkedList();

    /* renamed from: e */
    public final /* synthetic */ SnsCommentFooter f206180e;

    public C71237d4(SnsCommentFooter snsCommentFooter) {
        this.f206180e = snsCommentFooter;
    }

    public void afterTextChanged(Editable editable) {
        SnsMethodCalculate.markStartTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
        Editable text = SnsCommentFooter.m122046g(this.f206180e).getText();
        for (ForegroundColorSpan removeSpan : this.f206179d) {
            text.removeSpan(removeSpan);
        }
        ((LinkedList) this.f206179d).clear();
        String obj = SnsCommentFooter.m122046g(this.f206180e).getText().toString();
        if (((C101980n) C86312j.m106911c(C101980n.class)).mo134684EO()) {
            Matcher matcher = C75369r.f221604t.matcher(obj);
            while (matcher.find()) {
                matcher.group();
                int start = matcher.start();
                int end = matcher.end();
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f206180e.getResources().getColor(C0966R.color.Link_100));
                ((LinkedList) this.f206179d).add(foregroundColorSpan);
                text.setSpan(foregroundColorSpan, start, end, 33);
            }
        }
        SnsMethodCalculate.markEndTimeMs("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
        SnsMethodCalculate.markEndTimeMs("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
        SnsMethodCalculate.markEndTimeMs("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$12");
    }
}
