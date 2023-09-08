package t51;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.eggspring.p882ui.SpringLuckyEggActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import nj3.C76912y0;
import p51.C110184g;
import p821rk.C48041n;
import qo3.C47883u;
import qo3.C77426q;
import rx3.C36570n;
import u51.C37341a;

/* renamed from: t51.p */
public final class C110926p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SpringLuckyEggActivity f331743d;

    /* renamed from: t51.p$a */
    public static final class C110927a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ SpringLuckyEggActivity f331744a;

        public C110927a(SpringLuckyEggActivity springLuckyEggActivity) {
            this.f331744a = springLuckyEggActivity;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            if (z) {
                SpringLuckyEggActivity springLuckyEggActivity = this.f331744a;
                int i = SpringLuckyEggActivity.f312420n;
                C48041n value = springLuckyEggActivity.mo149514M7().f331793q.getValue();
                C115669n.INSTANCE.mo160131h(18916, C110184g.f329622e, "", 23, "", "", "", "", "", C110184g.f329624g, Long.valueOf(value != null ? value.f128876u : 0));
                SpringLuckyEggActivity springLuckyEggActivity2 = this.f331744a;
                C76912y0.m92768g(springLuckyEggActivity2, springLuckyEggActivity2.getString(C0966R.string.lqi));
                this.f331744a.finish();
                C37341a aVar = C37341a.f98737a;
                String str2 = (String) ((C36570n) this.f331744a.f312427j).getValue();
                if (str2 != null) {
                    LinkedList<String> linkedList = C37341a.f98738b;
                    synchronized (linkedList) {
                        linkedList.add(str2);
                    }
                    aVar.mo61045a();
                }
            }
        }
    }

    public C110926p(SpringLuckyEggActivity springLuckyEggActivity) {
        this.f331743d = springLuckyEggActivity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.SpringLuckyEggActivity", "setupViews: click close");
        C77426q qVar = new C77426q(this.f331743d);
        qVar.mo107606r(this.f331743d.getString(C0966R.string.lqk));
        qVar.mo107595g(this.f331743d.getString(C0966R.string.lqj));
        qVar.mo107602n(this.f331743d.getString(C0966R.string.lqh));
        qVar.mo107590b(new C110927a(this.f331743d));
        qVar.mo107603o();
        C117292a.m165361g(this, "com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
