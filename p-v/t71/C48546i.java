package t71;

import android.content.Context;
import bl3.C39818r;
import c81.C39904a;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebFeature;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import m71.C46947a;
import m71.C46948b;
import pe3.C47465a;
import te3.C49539gb2;
import te3.C49683hb2;
import te3.C51723vp1;
import te3.C51984xk;
import te3.kb4;
import te3.oa4;
import te3.pa4;
import te3.r85;
import u71.C37346b;
import v71.C37687a;
import v71.C37689c;
import w71.C38028a;

/* renamed from: t71.i */
public class C48546i extends C46947a<C49539gb2, C49683hb2> {

    /* renamed from: f */
    public Context f129831f;

    /* renamed from: g */
    public String f129832g;

    /* renamed from: h */
    public String f129833h;

    /* renamed from: i */
    public String f129834i;

    /* renamed from: j */
    public String f129835j;

    /* renamed from: n */
    public String f129836n;

    /* renamed from: o */
    public String f129837o;

    /* renamed from: p */
    public List<kb4> f129838p;

    /* renamed from: q */
    public r85 f129839q;

    /* renamed from: r */
    public ArrayList<String> f129840r;

    /* renamed from: s */
    public List<C51984xk> f129841s;

    /* renamed from: t */
    public boolean f129842t;

    /* renamed from: u */
    public int f129843u;

    /* renamed from: v */
    public boolean f129844v;

    /* renamed from: w */
    public final WeakReference<C46948b<C48546i>> f129845w;

    public C48546i(Context context, String str, String str2, C46948b<C48546i> bVar) {
        Log.m105925i("MicroMsg.NetSceneGetProfileDetail", "NetSceneGetProfileDetail, username: %s, appName: %s", str, str2);
        this.f129831f = context;
        this.f129832g = str;
        this.f129833h = str2;
        this.f129845w = new WeakReference<>(bVar);
    }

    public int getType() {
        return XWebFeature.INTERFACE_CONFIGURE_V8_LITE;
    }

    public String getUri() {
        return "/cgi-bin/mmbiz-bin/rank/getuserrankdetail";
    }

    /* renamed from: k1 */
    public C47465a mo72131k1() {
        return new C49539gb2();
    }

    /* renamed from: l1 */
    public C47465a mo72132l1() {
        return new C49683hb2();
    }

    /* renamed from: m1 */
    public void mo72133m1(C47465a aVar) {
        C49539gb2 gb22 = (C49539gb2) aVar;
        gb22.f133950e = this.f129833h;
        gb22.f133949d = this.f129832g;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C46948b bVar;
        boolean z;
        LinkedList linkedList;
        LinkedList linkedList2;
        LinkedList<pa4> linkedList3;
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        boolean z2 = true;
        Log.m105919d("MicroMsg.NetSceneGetProfileDetail", "hy: getdetail scene gy end. errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str2);
        if (i4 == 0 && i5 == 0) {
            C49683hb2 hb22 = (C49683hb2) mo72130j1();
            C39904a aVar = (C39904a) C39818r.f106831a.mo62443b(this.f129831f).mo75002a(C39904a.class);
            aVar.f106990f = hb22;
            if (hb22 == null || (linkedList3 = hb22.f134554w) == null) {
                linkedList2 = null;
                linkedList = null;
                z = false;
            } else {
                String str3 = null;
                linkedList2 = null;
                linkedList = null;
                String str4 = null;
                z = false;
                for (pa4 pa4 : linkedList3) {
                    int i6 = pa4.f139686o;
                    if (i6 == 0) {
                        if (str4 == null || !C87412m.m108589b(str4, pa4.f139678d)) {
                            if (linkedList2 != null && (linkedList2.isEmpty() ^ z2) == z2) {
                                if (linkedList2 != null) {
                                    aVar.f106991g.add(linkedList2);
                                }
                                linkedList2 = new LinkedList();
                            }
                            if (linkedList != null && (linkedList.isEmpty() ^ z2) == z2) {
                                LinkedList<LinkedList<pa4>> linkedList4 = aVar.f106991g;
                                C87412m.m108591d(linkedList);
                                linkedList4.add(linkedList);
                            }
                            LinkedList linkedList5 = new LinkedList();
                            str4 = pa4.f139678d;
                            linkedList = linkedList5;
                        }
                        if (linkedList != null) {
                            linkedList.add(pa4);
                        }
                        if (C87412m.m108589b(pa4.f139678d, "21f9d636b41b25be")) {
                            z = true;
                        }
                    } else if (i6 == z2) {
                        if (str3 == null || !C87412m.m108589b(str3, pa4.f139679e)) {
                            if (linkedList != null && (linkedList.isEmpty() ^ z2) == z2) {
                                if (linkedList != null) {
                                    aVar.f106991g.add(linkedList);
                                }
                                linkedList = new LinkedList();
                            }
                            if (linkedList2 != null && (linkedList2.isEmpty() ^ z2) == z2) {
                                LinkedList<LinkedList<pa4>> linkedList6 = aVar.f106991g;
                                C87412m.m108591d(linkedList2);
                                linkedList6.add(linkedList2);
                            }
                            linkedList2 = new LinkedList();
                            str3 = pa4.f139679e;
                        }
                        if (linkedList2 != null) {
                            linkedList2.add(pa4);
                        }
                    } else {
                        if (i6 == 2) {
                            aVar.f106993i = pa4;
                        }
                        z2 = true;
                    }
                }
            }
            if (linkedList2 != null && (linkedList2.isEmpty() ^ true)) {
                LinkedList<LinkedList<pa4>> linkedList7 = aVar.f106991g;
                C87412m.m108591d(linkedList2);
                linkedList7.add(linkedList2);
            }
            if (linkedList != null && (linkedList.isEmpty() ^ true)) {
                LinkedList<LinkedList<pa4>> linkedList8 = aVar.f106991g;
                C87412m.m108591d(linkedList);
                linkedList8.add(linkedList);
            }
            LinkedList linkedList9 = new LinkedList();
            if (!z) {
                LinkedList<oa4> linkedList10 = hb22 != null ? hb22.f134537A : null;
                if (!(linkedList10 == null || linkedList10.isEmpty())) {
                    pa4 pa42 = new pa4();
                    pa42.f139678d = "21f9d636b41b25be";
                    pa42.f139686o = 0;
                    pa42.f139681g = null;
                    linkedList9.add(pa42);
                    aVar.f106991g.add(linkedList9);
                }
            }
            this.f129835j = hb22.f134538d;
            this.f129836n = hb22.f134539e;
            this.f129839q = hb22.f134540f;
            this.f129837o = hb22.f134546o;
            this.f129838p = hb22.f134547p;
            this.f129842t = hb22.f134549r;
            this.f129841s = hb22.f134550s;
            ArrayList<String> arrayList = new ArrayList<>();
            this.f129840r = arrayList;
            this.f129843u = hb22.f134552u;
            this.f129844v = hb22.f134551t;
            this.f129834i = hb22.f134553v;
            LinkedList<String> linkedList11 = hb22.f134544j;
            if (linkedList11 != null) {
                arrayList.addAll(linkedList11);
            }
            LinkedList linkedList12 = new LinkedList();
            this.f129838p = linkedList12;
            LinkedList<kb4> linkedList13 = hb22.f134547p;
            if (linkedList13 != null) {
                linkedList12.addAll(linkedList13);
            }
            String str5 = this.f129832g;
            if (str5 != null && !str5.equalsIgnoreCase(C75592q0.m90789s())) {
                if (!this.f129842t) {
                    C41166r1.Ax0().mo61485Lo(this.f129832g);
                } else {
                    C38028a Ax0 = C41166r1.Ax0();
                    String str6 = this.f129832g;
                    Ax0.getClass();
                    if (Ax0.mo61490qq(new C37346b("hardcode_rank_id", "hardcode_app_name", str6)) == null) {
                        C37689c cVar = new C37689c();
                        cVar.field_rankID = "hardcode_rank_id";
                        cVar.field_appusername = "hardcode_app_name";
                        cVar.field_username = str6;
                        cVar.field_step = 0;
                        Ax0.insert(cVar);
                    }
                }
            }
            if (hb22.f134548q != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<C51723vp1> it = hb22.f134548q.iterator();
                while (it.hasNext()) {
                    C51723vp1 next = it.next();
                    if (((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69724s3(next.f143615e)) {
                        C37689c cVar2 = new C37689c();
                        cVar2.field_username = next.f143615e;
                        cVar2.field_step = next.f143616f;
                        arrayList2.add(cVar2);
                    } else {
                        C86709a0.m107529k().f251779b.mo123460f(new C48545h(next.f143615e, (C46948b<C48545h>) null));
                    }
                }
                Log.m105919d("MicroMsg.NetSceneGetProfileDetail", "follows %d %s", Integer.valueOf(arrayList2.size()), arrayList2.toString());
                if (C75592q0.m90789s().equalsIgnoreCase(this.f129832g)) {
                    C41166r1.Ax0().mo61488bD(arrayList2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            this.f129841s = arrayList3;
            LinkedList<C51984xk> linkedList14 = hb22.f134550s;
            if (linkedList14 != null) {
                arrayList3.addAll(linkedList14);
            }
            this.f129842t = hb22.f134549r;
            C37687a aVar2 = new C37687a();
            aVar2.field_championMotto = this.f129836n;
            aVar2.field_championUrl = this.f129835j;
            aVar2.field_username = this.f129832g;
            C41166r1.vx0().mo61491Lo(aVar2, true);
        }
        WeakReference<C46948b<C48546i>> weakReference = this.f129845w;
        if (!(weakReference == null || (bVar = weakReference.get()) == null)) {
            bVar.mo64355a(i4, i5, str2, this);
        }
        super.onGYNetEnd(i, i2, i3, str, uVar, bArr);
    }
}
