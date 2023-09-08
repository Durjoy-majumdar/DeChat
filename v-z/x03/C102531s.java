package x03;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p03.C21914h;
import p03.C21915i;
import p1081gi.C98121d;
import p910lj.C76701a;
import te3.C101756ae0;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C49768hy;
import te3.uh4;
import te3.xh4;
import u73.C90621r0;

/* renamed from: x03.s */
public class C102531s {

    /* renamed from: b */
    public static final C102531s f301890b = new C102531s();

    /* renamed from: a */
    public xh4 f301891a;

    /* renamed from: a */
    public void mo142142a(MMActivity mMActivity, uh4 uh4, xh4 xh4) {
        MMActivity mMActivity2 = mMActivity;
        uh4 uh42 = uh4;
        xh4 xh42 = xh4;
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        C101834rc0 rc02 = new C101834rc0();
        String string = Util.isNullOrNil(xh42.f64734p) ? mMActivity2.getString(C0966R.string.hta) : xh42.f64734p;
        rc02.mo141242Q(xh42.f64732n);
        rc02.mo141246U(xh42.f64733o);
        rc02.mo141265u(string);
        rc02.mo141267w(xh42.f64736q);
        rc02.mo141231E(true);
        rc02.mo141232F(true);
        rc02.mo141260p(5);
        C101756ae0 ae02 = new C101756ae0();
        ae02.mo141197q(xh42.f64736q);
        ae02.mo141198r(xh42.f64733o);
        ae02.mo141194n(string);
        kd02.mo141221s(ae02);
        C90621r0 r0Var = new C90621r0();
        r0Var.f260345b = xh42.f64729h;
        r0Var.f260346c = xh42.f64743x;
        r0Var.f260347d = uh42.f64643j;
        r0Var.f260348e = xh42.f64742w;
        r0Var.f260349f = 100201;
        r0Var.f260350g = xh42.f64732n;
        r0Var.f260351h = xh42.f64733o;
        r0Var.f260352i = xh42.f64734p;
        r0Var.f260353j = xh42.f64736q;
        r0Var.f260354k = xh42.f64737r;
        r0Var.f260355l = xh42.f64738s;
        r0Var.f260356m = xh42.f64739t;
        r0Var.f260357n = xh42.f64740u;
        r0Var.f260358o = xh42.f64744y;
        r0Var.f260359p = xh42.f64745z;
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(uh42.f64647q);
        linkedList.addAll(xh42.f64721W);
        r0Var.f260361r = C21914h.m25168p(xh42.f64703D).toString();
        r0Var.f260360q = mo142144c(linkedList).toString();
        r0Var.f260362s = xh42.f64712M;
        r0Var.f260363t = xh42.f64727f;
        StringBuilder sb = new StringBuilder();
        r0Var.mo7616c(sb, (C68070l.C68072b) null, (String) null, (C98121d) null, 0, 0);
        ae02.f297877u = sb.toString();
        ae02.f297878v = true;
        rd02.mo141275k(C75592q0.m90789s());
        rd02.mo141279o(C75592q0.m90789s());
        rd02.mo141277m(3);
        rd02.mo141273f(Util.nowMilliSecond());
        rd02.mo141276l(xh42.f64732n);
        rd02.mo141278n(xh42.f64732n);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264679d = rc02.f299297d;
        aVar.f264676a = kd02;
        aVar.f264688m = 25;
        aVar.f264689n = 2;
        aVar.f264678c = 5;
        aVar.f264684i = mMActivity2;
        kd02.mo141219q(rd02);
        kd02.f298618f.add(rc02);
        doFavoriteEvent.publish();
    }

    /* renamed from: b */
    public void mo142143b(C22947b bVar, int i, int i2, Intent intent) {
        ArrayList<String> stringArrayListExtra;
        if (i == 1024) {
            if (i2 == -1) {
                C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.f360099a34, 1).show();
                C21915i.m25176h(bVar.mo24989r4(), this.f301891a, "1", C75592q0.m90789s(), "");
            }
        } else if (i == 2048 && i2 == -1 && (stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames")) != null && stringArrayListExtra.size() > 0) {
            StringBuilder sb = new StringBuilder("");
            StringBuilder sb4 = new StringBuilder("");
            Iterator<String> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (C72996z1.m85820U5(next)) {
                    sb.append(3);
                    sb.append(";");
                } else {
                    sb.append(2);
                    sb.append(";");
                }
                sb4.append(next);
                sb4.append(";");
            }
            C21915i.m25176h(bVar.mo24989r4(), this.f301891a, sb.toString(), C75592q0.m90789s(), sb4.toString());
        }
    }

    /* renamed from: c */
    public final JSONArray mo142144c(List<C49768hy> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                JSONObject jSONObject = new JSONObject();
                C49768hy hyVar = list.get(i);
                jSONObject.put("key", hyVar.f134951d);
                jSONObject.put("uintValue", hyVar.f134952e);
                jSONObject.put("textValue", hyVar.f134953f);
                jSONArray.put(jSONObject);
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }
}
