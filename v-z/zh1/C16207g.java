package zh1;

import android.view.View;
import ig1.C8916d;
import j20.C117292a;
import java.util.ArrayList;
import yh1.C16011a;
import zh1.C16203f;

/* renamed from: zh1.g */
public final class C16207g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C16203f f43420d;

    /* renamed from: e */
    public final /* synthetic */ C16203f.C16204a f43421e;

    /* renamed from: f */
    public final /* synthetic */ int f43422f;

    public C16207g(C16203f fVar, C16203f.C16204a aVar, int i) {
        this.f43420d = fVar;
        this.f43421e = aVar;
        this.f43422f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C16203f fVar = this.f43420d;
        C16011a aVar = fVar.f43408c;
        C8916d dVar = fVar.f43413h;
        String str = dVar != null ? dVar.field_rewardProductId : null;
        if (str == null) {
            str = "";
        }
        aVar.mo12008d(str, this.f43421e.f43415d.get(this.f43422f).f140088d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftBatchSelectPanelWidget$ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
