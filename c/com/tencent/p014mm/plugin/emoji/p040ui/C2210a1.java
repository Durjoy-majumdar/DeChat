package com.tencent.p014mm.plugin.emoji.p040ui;

import android.view.View;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.emoji.ui.a1 */
public final class C2210a1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C85801v1 f12242d;

    /* renamed from: e */
    public final /* synthetic */ C101218e0 f12243e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f12244f;

    public C2210a1(C85801v1 v1Var, C101218e0 e0Var, C32224a<C13598b0> aVar) {
        this.f12242d = v1Var;
        this.f12243e = e0Var;
        this.f12244f = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/EmotionRecognitionGuideDialog$Companion$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f12242d.mo119677K(C72994y1.C72995a.USERINFO_EMOTION_RECOGNITION_GUIDE_BOOLEAN_SYNC, Boolean.TRUE);
        this.f12243e.mo140680z();
        this.f12244f.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/EmotionRecognitionGuideDialog$Companion$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
