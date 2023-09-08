package com.tencent.p014mm.plugin.brandservice.p028ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import c00.C39884q;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.contact.C44879k3;
import com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p214om.C11502f;
import p240sx.C77810t;
import p418rx.C48095o;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.base.a */
public class C40657a implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BrandServiceSortView f109228d;

    public C40657a(BrandServiceSortView brandServiceSortView) {
        this.f109228d = brandServiceSortView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        Object tag = view.getTag();
        if (tag == null || !(tag instanceof BrandServiceSortView.C40656f)) {
            Log.m105928w("MicroMsg.BrandServiceSortView", "view tag is null or is not a instance of ResHolder.");
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        BrandServiceSortView.C40656f fVar = (BrandServiceSortView.C40656f) tag;
        if (Util.isNullOrNil(fVar.f109221a)) {
            Log.m105928w("MicroMsg.BrandServiceSortView", "username is null or nil.");
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        ((C39884q) C86312j.m106911c(C39884q.class)).mo55839ow(fVar.f109221a);
        ((C48095o) ((C77810t) C86312j.m106911c(C77810t.class)).Ag0()).getClass();
        C44879k3.m49760a(this.f109228d.f109205E, 12, 4, i - 1);
        if (this.f109228d.f109216z) {
            Intent intent = new Intent();
            intent.putExtra("Select_Contact", fVar.f109221a);
            intent.putExtra("Select_Conv_User", fVar.f109221a);
            if (this.f109228d.getContext() instanceof Activity) {
                Activity activity = (Activity) this.f109228d.getContext();
                activity.setResult(-1, intent);
                activity.finish();
                C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
        }
        String str = fVar.f109221a;
        Context context = this.f109228d.getContext();
        Log.m105924i("MicroMsg.BrandService.BrandServiceApplication", "startChattingUI");
        Intent putExtra = new Intent().putExtra("Chat_User", str);
        putExtra.putExtra("finish_direct", true);
        putExtra.putExtra("chat_from_scene", 2);
        putExtra.putExtra("specific_chat_from_scene", 4);
        putExtra.putExtra("img_gallery_enter_from_chatting_ui", true);
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(putExtra, context);
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/base/BrandServiceSortView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
