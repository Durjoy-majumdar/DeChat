package vv1;

import android.view.View;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import j20.C117292a;
import java.util.ArrayList;
import te3.C52241zb0;
import w00.C22835e;

/* renamed from: vv1.h */
public final class C22797h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C22798i f65535d;

    /* renamed from: e */
    public final /* synthetic */ String f65536e;

    /* renamed from: f */
    public final /* synthetic */ long f65537f;

    /* renamed from: g */
    public final /* synthetic */ C52241zb0 f65538g;

    /* renamed from: h */
    public final /* synthetic */ int f65539h;

    public C22797h(C22798i iVar, String str, long j, C52241zb0 zb02, int i) {
        this.f65535d = iVar;
        this.f65536e = str;
        this.f65537f = j;
        this.f65538g = zb02;
        this.f65539h = i;
    }

    public final void onClick(View view) {
        UIStateCenter stateCenter;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC$buildRelevantFooter$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BaseMvvmActivity d3 = this.f65535d.mo14598d3();
        if (!(d3 == null || (stateCenter = d3.getStateCenter()) == null)) {
            stateCenter.dispatch(new C22835e(this.f65536e, this.f65537f, -1, this.f65538g, this.f65539h, 23));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC$buildRelevantFooter$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
