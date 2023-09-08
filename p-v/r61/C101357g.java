package r61;

import android.view.View;
import i61.C98605n;
import j20.C117292a;
import java.util.ArrayList;
import q61.C101037a;
import te3.C101824o80;

/* renamed from: r61.g */
public final class C101357g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101358h f296906d;

    /* renamed from: e */
    public final /* synthetic */ C101824o80 f296907e;

    public C101357g(C101358h hVar, C101824o80 o802) {
        this.f296906d = hVar;
        this.f296907e = o802;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog$updateEmotionRelativeInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101358h hVar = this.f296906d;
        C101037a.m132405c(hVar.f296909e, 4, hVar.f296922u, hVar.f296923v, hVar.f296924w);
        C98605n.m128201c(this.f296906d.f296908d, this.f296907e, false, 0, -1, -1, "", 0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog$updateEmotionRelativeInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
