package uv0;

import android.view.View;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: uv0.d */
public class C111230d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BallInfo f333073d;

    /* renamed from: e */
    public final /* synthetic */ C111231e f333074e;

    public C111230d(C111231e eVar, BallInfo ballInfo) {
        this.f333074e = eVar;
        this.f333073d = ballInfo;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BallInfo ballInfo = this.f333073d;
        ballInfo.f311683H.f311721j = 1;
        this.f333074e.f333090h.mo145797a(ballInfo);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
