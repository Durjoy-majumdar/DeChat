package uv0;

import android.view.View;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.view.C105107a;
import com.tencent.p014mm.plugin.ball.view.C55570b;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import uv0.C111231e;
import uv0.C111234h;
import yv0.C112505b;

/* renamed from: uv0.a */
public class C111227a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BallInfo f333064d;

    /* renamed from: e */
    public final /* synthetic */ C111231e.C111232a f333065e;

    /* renamed from: f */
    public final /* synthetic */ C111231e f333066f;

    public C111227a(C111231e eVar, BallInfo ballInfo, C111231e.C111232a aVar) {
        this.f333066f = eVar;
        this.f333064d = ballInfo;
        this.f333065e = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C111234h.C111236b.f333107a.mo64043a(view.getContext(), this.f333064d)) {
            Log.m105924i("MicroMsg.FloatBallMenuAdapter", "onFloatBallListCloseBtn delegate intercept");
            C117292a.m165361g(this, "com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C111231e eVar = this.f333066f;
        if (eVar.f333091i) {
            boolean z = true;
            Log.m105919d("MicroMsg.FloatBallMenuAdapter", "alvinluo notifyItemRemoved position: %d", Integer.valueOf(this.f333065e.f333093A));
            C111231e eVar2 = this.f333066f;
            C111231e.C111232a aVar = this.f333065e;
            List<BallInfo> list = eVar2.f333089g;
            if (list != null) {
                if (list.size() > 1) {
                    int i = aVar.f333093A;
                    if (i < 0 || i >= eVar2.f333089g.size()) {
                        z = false;
                    }
                    if (z) {
                        eVar2.f333089g.remove(aVar.f333093A);
                        eVar2.notifyItemRemoved(aVar.f333093A);
                    }
                } else if (eVar2.f333089g.size() == 1) {
                    int i2 = aVar.f333093A;
                    if (i2 < 0 || i2 >= eVar2.f333089g.size()) {
                        z = false;
                    }
                    if (z) {
                        eVar2.f333089g.remove(aVar.f333093A);
                        C55570b.C55575e eVar3 = eVar2.f333092j;
                        if (eVar3 != null) {
                            ((C105107a) eVar3).mo149377a(aVar, new C111228b(eVar2, aVar));
                        }
                    }
                }
            }
        } else {
            C112505b bVar = eVar.f333090h;
            if (bVar != null) {
                bVar.mo145798d(this.f333064d, this.f333065e.mo17363j());
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
