package xp1;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import j20.C117292a;
import java.util.ArrayList;
import p910lj.C76701a;
import xp1.C15869b;

/* renamed from: xp1.a */
public final class C15868a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C15869b.C15870a f42719d;

    /* renamed from: e */
    public final /* synthetic */ C15869b.C15871b f42720e;

    /* renamed from: f */
    public final /* synthetic */ int f42721f;

    public C15868a(C15869b.C15870a aVar, C15869b.C15871b bVar, int i) {
        this.f42719d = aVar;
        this.f42720e = bVar;
        this.f42721f = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/tools/DebugDialog$RvAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C15869b.C15870a aVar = this.f42719d;
        DialogInterface.OnClickListener onClickListener = aVar.f42724e;
        if (onClickListener == null) {
            TextView textView = this.f42720e.f42726z;
            CharSequence text = textView != null ? textView.getText() : null;
            if (text == null) {
                text = "";
            }
            ClipboardHelper.setText(text);
            C76701a.makeText(this.f42720e.f44854d.getContext(), (CharSequence) "copy done", 0).show();
        } else {
            onClickListener.onClick(aVar.f42725f, this.f42721f);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/tools/DebugDialog$RvAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
