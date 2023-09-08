package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import com.tencent.p014mm.C0966R;
import de3.C75369r;
import di3.C86312j;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import u73.C101980n;
import zj3.C79353f1;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.w */
public class C72838w implements TextWatcher {

    /* renamed from: d */
    public List<ForegroundColorSpan> f212260d = new LinkedList();

    /* renamed from: e */
    public final /* synthetic */ ChatFooter f212261e;

    public C72838w(ChatFooter chatFooter) {
        this.f212261e = chatFooter;
    }

    public void afterTextChanged(Editable editable) {
        Editable text = this.f212261e.f211888j.getText();
        for (ForegroundColorSpan removeSpan : this.f212260d) {
            text.removeSpan(removeSpan);
        }
        ((LinkedList) this.f212260d).clear();
        String obj = this.f212261e.f211888j.getText().toString();
        if (((C101980n) C86312j.m106911c(C101980n.class)).n30()) {
            Matcher matcher = C75369r.f221604t.matcher(obj);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f212261e.getResources().getColor(C0966R.color.Link_100));
                ((LinkedList) this.f212260d).add(foregroundColorSpan);
                text.setSpan(foregroundColorSpan, start, end, 33);
            }
        }
        ChatFooter$$i1 chatFooter$$i1 = this.f212261e.f211826V1;
        if (!(chatFooter$$i1 == null || chatFooter$$i1.mo100531a() == null)) {
            ((C79353f1) this.f212261e.f211826V1.mo100531a().f193278b.mo102812a(C79353f1.class)).mo102535n1(obj);
        }
        ChatFooter chatFooter = this.f212261e;
        if (chatFooter.f211860d2) {
            chatFooter.f211888j.setHint("");
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
