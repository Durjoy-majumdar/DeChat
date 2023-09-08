package r61;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2DesignerUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import q61.C101037a;
import te3.C49978jd3;

/* renamed from: r61.f */
public final class C101356f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101358h f296904d;

    /* renamed from: e */
    public final /* synthetic */ C49978jd3 f296905e;

    public C101356f(C101358h hVar, C49978jd3 jd32) {
        this.f296904d = hVar;
        this.f296905e = jd32;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog$updateDesignerRelativeInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101358h hVar = this.f296904d;
        C101037a.m132405c(hVar.f296909e, 4, hVar.f296922u, hVar.f296923v, hVar.f296924w);
        Intent intent = new Intent();
        C101358h hVar2 = this.f296904d;
        C49978jd3 jd32 = this.f296905e;
        intent.setClass(hVar2.f296908d, EmojiStoreV2DesignerUI.class);
        intent.putExtra("uin", jd32.f136019d);
        intent.putExtra("name", jd32.f136020e);
        intent.putExtra("headurl", jd32.f136021f);
        intent.putExtra("extra_scence", 0);
        Context context = this.f296904d.f296908d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog$updateDesignerRelativeInfo$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog$updateDesignerRelativeInfo$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog$updateDesignerRelativeInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
