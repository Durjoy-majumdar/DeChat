package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import fy3.C32224a;
import gj2.C98130a;
import gj2.C98131b;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import kotlin.Metadata;
import o40.C61926c;
import org.json.JSONObject;
import p278yh.C102863s;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sm2.C101654d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerSerializeClassDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSerializeClassDemoUI */
public final class RepairerSerializeClassDemoUI extends BaseRepairerUI {

    /* renamed from: e */
    public static final /* synthetic */ int f273093e = 0;

    /* renamed from: d */
    public final C13601g f273094d = C36568h.m40985a(new C94450b(this));

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSerializeClassDemoUI$a */
    public static final class C94449a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSerializeClassDemoUI f273095d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94449a(RepairerSerializeClassDemoUI repairerSerializeClassDemoUI) {
            super(0);
            this.f273095d = repairerSerializeClassDemoUI;
        }

        public Object invoke() {
            C98130a aVar = new C98130a();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C98131b());
            arrayList.add(new C98131b());
            arrayList.add(new C98131b());
            ((ArrayList) aVar.f287717f).add("field7String1");
            ((ArrayList) aVar.f287717f).add("field7String2");
            ((ArrayList) aVar.f287717f).add("field7String3");
            ((ArrayList) aVar.f287717f).add("field7String4");
            aVar.f287718g.add(101);
            aVar.f287718g.add(102);
            aVar.f287718g.add(103);
            aVar.f287719h.getClass();
            aVar.f287719h.getClass();
            JSONObject s = aVar.mo141111s();
            aVar.mo141100e().mo53859e(aVar, false);
            String z = aVar.mo141118z();
            String h = aVar.mo141100e().mo53862h();
            C87412m.m108594g(h, "xmlPrefixTag");
            C101654d e = aVar.mo141100e();
            e.mo53863i(aVar, false, e.mo53857c(), h);
            C101654d e2 = aVar.mo141100e();
            e2.mo53863i(aVar, true, e2.mo53857c(), "wechat.msg");
            C61926c.m72668M(new C94455l(this.f273095d, s, z));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSerializeClassDemoUI$b */
    public static final class C94450b extends C87413o implements C32224a<C102863s> {

        /* renamed from: d */
        public final /* synthetic */ RepairerSerializeClassDemoUI f273096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94450b(RepairerSerializeClassDemoUI repairerSerializeClassDemoUI) {
            super(0);
            this.f273096d = repairerSerializeClassDemoUI;
        }

        public Object invoke() {
            RepairerSerializeClassDemoUI repairerSerializeClassDemoUI = this.f273096d;
            int i = RepairerSerializeClassDemoUI.f273093e;
            return new C102863s(repairerSerializeClassDemoUI.getContentView());
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d5f;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C61926c.m72656A((String) null, new C94449a(this));
    }
}
