package tw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C35136m;
import ob0.C35141t;
import p872ah.C67046a;
import sd3.C101583a;
import sf0.C48374j0;

/* renamed from: tw2.c */
public class C37291c implements C35141t, C11385n {

    /* renamed from: d */
    public Queue<C37292a> f98649d = null;

    /* renamed from: e */
    public boolean f98650e = false;

    /* renamed from: tw2.c$a */
    public static class C37292a {

        /* renamed from: a */
        public String f98651a;

        /* renamed from: b */
        public Queue<String> f98652b = new LinkedList();

        public C37292a(String str) {
            this.f98651a = str;
            Log.m105918d("MicroMsg.PushMessageExtension", "DoSceneStruct:" + str);
            ArrayList<C101583a> d = C101583a.m133409d(MMApplicationContext.getContext(), str);
            if (d == null || d.size() <= 0) {
                Log.m105920e("MicroMsg.PushMessageExtension", "Parse Message Failed !");
                return;
            }
            for (int i = 0; i < d.size(); i++) {
                Map<String, String> map = d.get(i).f297397i;
                if (map != null) {
                    for (Map.Entry<String, String> value : map.entrySet()) {
                        this.f98652b.offer((String) value.getValue());
                    }
                }
            }
        }
    }

    /* renamed from: Fg */
    public C35136m.C35139b mo56403Fg(C35136m.C35137a aVar) {
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        if (this.f98649d == null) {
            this.f98649d = new LinkedList();
        }
        C37292a aVar2 = new C37292a(g);
        if (g == null) {
            return null;
        }
        ((LinkedList) this.f98649d).offer(aVar2);
        mo61026d();
        return null;
    }

    /* renamed from: d */
    public final void mo61026d() {
        if (!this.f98650e && this.f98649d.size() != 0) {
            C37292a peek = this.f98649d.peek();
            if (((LinkedList) peek.f98652b).size() == 0) {
                this.f98649d.poll();
                C97625j3.m125812b().mo105906u().mo119676J(8193, peek.f98651a);
                C97625j3.m125812b().mo105906u().mo119676J(8449, Long.valueOf(Util.nowSecond()));
                return;
            }
            String str = (String) ((LinkedList) peek.f98652b).peek();
            if (str != null && str.length() > 0) {
                this.f98650e = true;
                C52378b bVar = new C52378b(str);
                C97625j3.m125815e().mo123455a(141, this);
                C97625j3.m125815e().mo123460f(bVar);
            }
        }
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() != 141) {
            this.f98650e = false;
            return;
        }
        C97625j3.m125815e().mo123470p(141, this);
        String str2 = ((C52378b) yVar).f146409e;
        C37292a peek = this.f98649d.peek();
        if (peek == null || ((LinkedList) peek.f98652b).size() == 0) {
            Log.m105920e("MicroMsg.PushMessageExtension", "getDoSceneQueue failed ! reset queue!");
            this.f98649d = new LinkedList();
            this.f98650e = false;
        } else if (((LinkedList) peek.f98652b).size() == 0) {
            Log.m105920e("MicroMsg.PushMessageExtension", "get imgQueue failed ! ignore this message");
            this.f98649d.poll();
            this.f98650e = false;
        } else if (!((String) ((LinkedList) peek.f98652b).peek()).equals(str2)) {
            Log.m105920e("MicroMsg.PushMessageExtension", "check img url failed ! ignore this message");
            this.f98649d.poll();
            this.f98650e = false;
        } else if (i == 0 && i2 == 0) {
            ((LinkedList) peek.f98652b).poll();
            this.f98650e = false;
            mo61026d();
        } else {
            Log.m105920e("MicroMsg.PushMessageExtension", "down failed [" + i + "," + i2 + "] ignore this message : img:[" + str2 + "] ");
            this.f98649d.poll();
            this.f98650e = false;
        }
    }
}
