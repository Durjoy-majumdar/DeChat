package hs1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hs1.c */
public final class C8738c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f28003d;

    /* renamed from: e */
    public final /* synthetic */ C8740e f28004e;

    public C8738c(String str, C8740e eVar) {
        this.f28003d = str;
        this.f28004e = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("finder_username", this.f28003d);
        Context context = this.f28004e.getContext();
        C87412m.m108593f(context, "context");
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76819V1(context, intent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
