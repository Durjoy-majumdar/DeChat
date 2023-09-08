package com.tencent.p014mm.p136ui.base;

import android.view.View;
import com.tencent.p014mm.p136ui.base.MMClearEditText;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.base.c */
public class C57664c implements MMClearEditText.C57660d {

    /* renamed from: a */
    public final /* synthetic */ MMFormVerifyCodeInputView f165063a;

    public C57664c(MMFormVerifyCodeInputView mMFormVerifyCodeInputView) {
        this.f165063a = mMFormVerifyCodeInputView;
    }

    /* renamed from: a */
    public void mo82030a(boolean z) {
        View view = this.f165063a.f214803i;
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/MMFormVerifyCodeInputView$3", "showClearBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView$3", "showClearBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
