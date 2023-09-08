package zp3;

import com.tencent.p014mm.view.C106853e;
import com.tencent.p014mm.view.PhotoEditText;
import com.tencent.p014mm.view.TextModeSelectView;
import com.tencent.p014mm.view.footer.SelectColorBar;

public final /* synthetic */ class a$$a implements TextModeSelectView.C97327a {

    /* renamed from: a */
    public final /* synthetic */ C106853e f337356a;

    /* renamed from: b */
    public final /* synthetic */ SelectColorBar f337357b;

    public /* synthetic */ a$$a(C106853e eVar, SelectColorBar selectColorBar) {
        this.f337356a = eVar;
        this.f337357b = selectColorBar;
    }

    /* renamed from: a */
    public final void mo136442a(int i) {
        C106853e eVar = this.f337356a;
        SelectColorBar selectColorBar = this.f337357b;
        boolean z = false;
        if (i == 3) {
            selectColorBar.setSelectColor(((Integer) eVar.f319944u.getTag()).intValue());
            eVar.f319943t.setTextBackground(((Integer) eVar.f319944u.getTag()).intValue());
        } else {
            eVar.f319944u.setTag(Integer.valueOf(selectColorBar.getCurColor()));
            eVar.f319943t.setTextBackground(0);
        }
        PhotoEditText photoEditText = eVar.f319943t;
        if (i == 2) {
            z = true;
        }
        photoEditText.setEnableStoke(z);
    }
}
