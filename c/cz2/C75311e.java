package cz2;

import android.text.Editable;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import z04.C112550d0;

/* renamed from: cz2.e */
public final class C75311e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75314h f221465d;

    public C75311e(C75314h hVar) {
        this.f221465d = hVar;
    }

    public final void onClick(View view) {
        String str;
        Editable text;
        String obj;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75314h hVar = this.f221465d;
        MMEditText mMEditText = hVar.f221471i;
        if (mMEditText == null || (text = mMEditText.getText()) == null || (obj = text.toString()) == null || (str = C112550d0.m153799i0(obj).toString()) == null) {
            str = "";
        }
        String str2 = hVar.f221472j;
        Log.m105924i("MicroMsg.TextStatus.DoWhatCustomStatusConvert", "ok: " + str + ' ' + str2);
        hVar.f221467e.mo98435a(str2, str);
        hVar.f221468f.mo98436a("ACTION_EXIT");
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
