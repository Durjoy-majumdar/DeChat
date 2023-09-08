package cz2;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cz2.a */
public final class C7150a implements View.OnClickListener {

    /* renamed from: d */
    public static final C7150a f25125d = new C7150a();

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$expand$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.TextStatus.DoWhatCustomStatusConvert", "expand: statusIconLayout onClick");
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$expand$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
