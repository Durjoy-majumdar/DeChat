package oy2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.test.ExMainSettings;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import p910lj.C76701a;

/* renamed from: oy2.d */
public final class C11793d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExMainSettings f34506d;

    public C11793d(ExMainSettings exMainSettings) {
        this.f34506d = exMainSettings;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/test/ExMainSettings$initList$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.moveLogsFromCacheDirToLogDir();
        C76701a.makeText((Context) this.f34506d.getContext(), (CharSequence) "move success", 0).show();
        C117292a.m165361g(this, "com/tencent/mm/plugin/test/ExMainSettings$initList$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
