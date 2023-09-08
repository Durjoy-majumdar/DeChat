package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.view.View;
import de3.C75359b0;
import j20.C117292a;
import java.util.ArrayList;
import wd3.C53155r0;

/* renamed from: com.tencent.mm.plugin.aa.ui.a */
public class C68271a extends C75359b0 {

    /* renamed from: d */
    public C68272a f196283d;

    /* renamed from: com.tencent.mm.plugin.aa.ui.a$a */
    public interface C68272a {
        void onClick(View view);
    }

    public C68271a(C68272a aVar) {
        super(2, (C53155r0) null);
        this.f196283d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/aa/ui/AAClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C68272a aVar = this.f196283d;
        if (aVar != null) {
            aVar.onClick(view);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/aa/ui/AAClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
