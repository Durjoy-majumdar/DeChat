package tj1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import te3.C48769aw;
import tj1.C13929a;
import tj1.C13931b;

/* renamed from: tj1.f */
public final class C13950f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C48769aw f39189d;

    /* renamed from: e */
    public final /* synthetic */ C13931b f39190e;

    /* renamed from: f */
    public final /* synthetic */ C13931b.C13936e f39191f;

    /* renamed from: g */
    public final /* synthetic */ C13929a.C13930a f39192g;

    public C13950f(C48769aw awVar, C13931b bVar, C13931b.C13936e eVar, C13929a.C13930a aVar) {
        this.f39189d = awVar;
        this.f39190e = bVar;
        this.f39191f = eVar;
        this.f39192g = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$GiftChooseAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i = this.f39189d.f130787e - 1;
        this.f39190e.getClass();
        if (i >= 0) {
            this.f39191f.f39162A.setText(String.valueOf(i), TextView.BufferType.EDITABLE);
            this.f39189d.f130787e = i;
            this.f39190e.getClass();
            if (i == 0) {
                Log.m105924i(this.f39190e.f39136b, "giftCountMinus click to 0");
                this.f39191f.f39165D.setChecked(false);
                this.f39192g.f39133a = false;
            }
        }
        int i2 = this.f39189d.f130787e;
        this.f39190e.getClass();
        if (i2 == 0) {
            this.f39191f.f39168G.setAlpha(0.3f);
        } else {
            this.f39191f.f39168G.setAlpha(1.0f);
        }
        this.f39190e.mo13396b();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftPkgChooseView$GiftChooseAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
