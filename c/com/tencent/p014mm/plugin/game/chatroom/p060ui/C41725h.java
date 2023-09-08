package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.p136ui.base.MMClearEditText;
import dx1.C45488d;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.h */
public final class C41725h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C45488d f112302d;

    /* renamed from: e */
    public final /* synthetic */ long f112303e;

    /* renamed from: f */
    public final /* synthetic */ long f112304f;

    public C41725h(C45488d dVar, long j, long j2) {
        this.f112302d = dVar;
        this.f112303e = j;
        this.f112304f = j2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/ui/MentionSomeoneDialogUtil$initMentionSomeoneDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f112302d.f123127b.setVisibility(0);
        this.f112302d.f123128c.setVisibility(8);
        MMClearEditText mMClearEditText = this.f112302d.f123126a;
        C87412m.m108593f(mMClearEditText, "binding.etInputName");
        Object systemService = mMClearEditText.getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            mMClearEditText.requestFocus();
            inputMethodManager.showSoftInput(mMClearEditText, 0);
        }
        C40308d.f108375a.mo62995e(700, 2, this.f112303e, this.f112304f, (String) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/ui/MentionSomeoneDialogUtil$initMentionSomeoneDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
