package ry1;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42149z0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import py1.C47673t;
import py1.C47685u4;
import qo3.C77389a;
import qo3.C77398g;
import uy1.C52642c;

/* renamed from: ry1.y0 */
public class C48172y0 implements View.OnClickListener, C11385n {

    /* renamed from: d */
    public Context f129110d;

    /* renamed from: e */
    public C42039b f129111e = null;

    /* renamed from: f */
    public DialogInterface.OnClickListener f129112f = null;

    /* renamed from: g */
    public int f129113g;

    /* renamed from: ry1.y0$a */
    public class C48173a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f129114d;

        public C48173a(String str) {
            this.f129114d = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C52642c.m59001s(C48172y0.this.f129110d, this.f129114d);
            C48172y0 y0Var = C48172y0.this;
            Context context = y0Var.f129110d;
            C42039b bVar = y0Var.f129111e;
            C40314g.m43488g(context, bVar.f113254G1, bVar.f113255H1, bVar.f113256I1, 17, bVar.field_appId, y0Var.f129113g, bVar.f113252E1, bVar.f113263P1);
        }
    }

    /* renamed from: ry1.y0$b */
    public static class C48174b {

        /* renamed from: a */
        public String f129116a;

        /* renamed from: b */
        public String f129117b;

        /* renamed from: c */
        public String f129118c;

        /* renamed from: d */
        public String f129119d;
    }

    public C48172y0(Context context) {
        this.f129110d = context;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameSubscriptionClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof C42039b)) {
            Log.m105920e("MicroMsg.GameSubscriptionClickListener", "No GameAppInfo");
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameSubscriptionClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f129111e = (C42039b) view.getTag();
        Log.m105924i("MicroMsg.GameSubscriptionClickListener", "Clicked appid = " + this.f129111e.field_appId);
        C86709a0.m107524d().mo123455a(1219, this);
        String applicationLanguage = LocaleUtil.getApplicationLanguage();
        C42039b bVar = this.f129111e;
        C86709a0.m107524d().mo123460f(new C42149z0(bVar.field_appId, applicationLanguage, bVar.f113252E1, bVar.f113260M1));
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameSubscriptionClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0 && yVar.getType() == 1219) {
            C86709a0.m107524d().mo123470p(1219, this);
            C47465a aVar = ((C42149z0) yVar).f113600e.f127056b.f127083a;
            C47685u4 u4Var = aVar == null ? new C47685u4() : (C47685u4) aVar;
            C48174b bVar = null;
            Boolean valueOf = Boolean.valueOf(u4Var.f128061d);
            String str2 = u4Var.f128062e;
            String str3 = u4Var.f128063f;
            C47673t tVar = u4Var.f128064g;
            if (tVar != null) {
                bVar = new C48174b();
                bVar.f129116a = tVar.f128011d;
                bVar.f129117b = tVar.f128012e;
                bVar.f129118c = tVar.f128013f;
                bVar.f129119d = tVar.f128014g;
            }
            this.f129111e.f113253F1 = valueOf.booleanValue();
            if (!Util.isNullOrNil(str2)) {
                if (bVar != null) {
                    String str4 = bVar.f129119d;
                    Context context = this.f129110d;
                    C77389a aVar2 = new C77389a();
                    aVar2.f225644a = str2;
                    aVar2.f225660q = bVar.f129116a;
                    aVar2.f225668y = false;
                    aVar2.f225663t = bVar.f129117b;
                    aVar2.f225620C = new C48173a(str4);
                    aVar2.f225641X = true;
                    aVar2.f225664u = bVar.f129118c;
                    aVar2.f225621D = this.f129112f;
                    C77398g gVar = new C77398g(context, C0966R.style.a66);
                    gVar.mo107525e(aVar2);
                    gVar.show();
                } else if (!Util.isNullOrNil(str3)) {
                    Context context2 = this.f129110d;
                    C77389a aVar3 = new C77389a();
                    aVar3.f225644a = str2;
                    aVar3.f225660q = str3;
                    aVar3.f225668y = false;
                    aVar3.f225663t = C0086a.m38a(context2).getString(C0966R.string.fc6);
                    aVar3.f225620C = this.f129112f;
                    C77398g gVar2 = new C77398g(context2, C0966R.style.a66);
                    gVar2.mo107525e(aVar3);
                    gVar2.show();
                }
            }
        } else {
            Context context3 = this.f129110d;
            C77389a aVar4 = new C77389a();
            aVar4.f225660q = C0086a.m38a(context3).getString(C0966R.string.fc7);
            aVar4.f225663t = C0086a.m38a(context3).getString(C0966R.string.fc6);
            C77398g gVar3 = new C77398g(context3, C0966R.style.a66);
            gVar3.mo107525e(aVar4);
            gVar3.show();
        }
    }
}
