package tj1;

import android.view.View;
import android.widget.TextView;
import j20.C117292a;
import java.util.ArrayList;
import te3.C48769aw;
import tj1.C13929a;
import tj1.C13931b;

/* renamed from: tj1.e */
public final class C13949e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C48769aw f39185d;

    /* renamed from: e */
    public final /* synthetic */ C13931b f39186e;

    /* renamed from: f */
    public final /* synthetic */ C13931b.C13936e f39187f;

    /* renamed from: g */
    public final /* synthetic */ C13929a.C13930a f39188g;

    public C13949e(C48769aw awVar, C13931b bVar, C13931b.C13936e eVar, C13929a.C13930a aVar) {
        this.f39185d = awVar;
        this.f39186e = bVar;
        this.f39187f = eVar;
        this.f39188g = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$GiftChooseAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i = this.f39185d.f130787e + 1;
        if (i <= this.f39186e.f39152r) {
            this.f39187f.f39162A.setText(String.valueOf(i), TextView.BufferType.EDITABLE);
            this.f39185d.f130787e = i;
            this.f39188g.f39133a = true;
            this.f39187f.f39165D.setChecked(true);
            this.f39186e.mo13396b();
        }
        this.f39187f.f39168G.setAlpha(1.0f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$GiftChooseAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
