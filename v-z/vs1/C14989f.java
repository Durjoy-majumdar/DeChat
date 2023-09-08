package vs1;

import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: vs1.f */
public final class C14989f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14974a f41088d;

    /* renamed from: e */
    public final /* synthetic */ int f41089e;

    /* renamed from: f */
    public final /* synthetic */ EditText f41090f;

    /* renamed from: g */
    public final /* synthetic */ View f41091g;

    public C14989f(C14974a aVar, int i, EditText editText, View view) {
        this.f41088d = aVar;
        this.f41089e = i;
        this.f41090f = editText;
        this.f41091g = view;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$VoteEditViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f41088d.f41037e.get(this.f41089e).f41058c == 2) {
            this.f41090f.removeTextChangedListener((TextWatcher) ((HashMap) this.f41088d.f41048s).get(Integer.valueOf(this.f41091g.hashCode())));
            ((HashMap) this.f41088d.f41048s).remove(Integer.valueOf(this.f41091g.hashCode()));
            this.f41090f.setText("");
            this.f41088d.notifyItemRemoved(this.f41089e);
            this.f41088d.f41037e.remove(this.f41089e);
            C14974a aVar = this.f41088d;
            aVar.notifyItemRangeChanged(this.f41089e, aVar.f41037e.size() - this.f41089e);
            this.f41088d.mo14025F4();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$VoteEditViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
