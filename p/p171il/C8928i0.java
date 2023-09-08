package p171il;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.emoji.debug.EmojiDebugUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: il.i0 */
public final class C8928i0 implements View.OnLongClickListener {

    /* renamed from: d */
    public static final C8928i0 f28234d = new C8928i0();

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/emoji/panel/adapter/SmileyTabAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        Intent intent = new Intent(view.getContext(), EmojiDebugUI.class);
        Context context = view.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/emoji/panel/adapter/SmileyTabAdapter$onBindViewHolder$1", "onLongClick", "(Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/emoji/panel/adapter/SmileyTabAdapter$onBindViewHolder$1", "onLongClick", "(Landroid/view/View;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165362h(true, this, "com/tencent/mm/emoji/panel/adapter/SmileyTabAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
