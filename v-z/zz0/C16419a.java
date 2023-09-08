package zz0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: zz0.a */
public final class C16419a implements View.OnClickListener {

    /* renamed from: d */
    public static final C16419a f43830d = new C16419a();

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/cast/banner/ScreenCastBanner$initialize$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C88144b.m109791i(MMApplicationContext.getContext(), "cast", ".ui.ScreenCastActivity", new Intent(), (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/cast/banner/ScreenCastBanner$initialize$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
