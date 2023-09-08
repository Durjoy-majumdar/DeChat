package w51;

import android.view.View;
import com.tencent.p014mm.plugin.emoji.model.C93108e0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: w51.a */
public class C102329a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C93108e0.C93110b f301375d;

    /* renamed from: e */
    public final /* synthetic */ C102330b f301376e;

    public C102329a(C102330b bVar, C93108e0.C93110b bVar2) {
        this.f301376e = bVar;
        this.f301375d = bVar2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f301376e.getClass();
        C102330b bVar = this.f301376e;
        C93108e0.C93110b bVar2 = this.f301375d;
        bVar.getClass();
        if (bVar2 != null) {
            bVar2.mo127623k5(bVar);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/adapter/BaseEmojiItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
