package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.contact.SelectContactUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.conversation.banner.i */
public class C74668i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74669j f219529d;

    public C74668i(C74669j jVar) {
        this.f219529d = jVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/ChattingRecommendBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent(this.f219529d.f230570g.get(), SelectContactUI.class);
        C74560s1.m89276e();
        intent.putExtra("list_attr", C74560s1.f219160a & -257);
        intent.putExtra("list_type", 10);
        intent.putExtra("received_card_name", this.f219529d.f219530h);
        intent.putExtra("recommend_friends", true);
        intent.putExtra("titile", this.f219529d.f230570g.get().getString(C0966R.string.f7496hv));
        Context context = this.f219529d.f230570g.get();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/conversation/banner/ChattingRecommendBanner$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/ui/conversation/banner/ChattingRecommendBanner$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C97625j3.m125812b().mo105904s().mo106156b(this.f219529d.f219530h);
        C97625j3.m125812b().mo105904s().mo106156b(this.f219529d.f219531i);
        C115669n.INSTANCE.mo160131h(11003, this.f219529d.f219530h, 2, 0);
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/ChattingRecommendBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
