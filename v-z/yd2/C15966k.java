package yd2;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import te3.C49070cz2;

/* renamed from: yd2.k */
public final class C15966k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79076g f42862d;

    public C15966k(C79076g gVar) {
        this.f42862d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/patmsg/ui/PatSuffixSettingDialog$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        EditText editText = (EditText) this.f42862d.findViewById(C0966R.C0970id.hrk);
        if (editText != null) {
            C79076g gVar = this.f42862d;
            Editable text = editText.getText();
            C87412m.m108593f(text, "it.text");
            gVar.getClass();
            C49070cz2 cz22 = new C49070cz2();
            String escapeStringForUCC = Util.escapeStringForUCC(text.toString());
            C87412m.m108593f(escapeStringForUCC, "escapeStringForUCC(suffix.toString())");
            int length = escapeStringForUCC.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = C87412m.m108596i(escapeStringForUCC.charAt(!z ? i : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            cz22.f132042d = escapeStringForUCC.subSequence(i, length + 1).toString();
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).x90().mo71315mc(new C32330n(WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, cz22));
            Context context = gVar.f232208f;
            gVar.f232216q = C76879j.m92723Q(context, "", context.getString(C0966R.string.gvc), false, false, (DialogInterface.OnCancelListener) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/patmsg/ui/PatSuffixSettingDialog$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
