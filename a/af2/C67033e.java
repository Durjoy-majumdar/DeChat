package af2;

import android.content.Intent;
import bf2.C39765h;
import bf2.C39768m;
import bf2.C54454k;
import bf2.C67224c;
import bf2.C67225n;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.product.p087ui.C70106c;
import com.tencent.p014mm.plugin.product.p087ui.C70109g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p1081gi.C98121d;
import te3.C49097d50;
import te3.C49254ea0;
import te3.C49638h1;
import te3.C51858wn3;
import te3.C52029xv3;
import te3.C64661ql2;
import te3.C77905b4;
import te3.C77908bi3;
import te3.c64;
import ze2.C79322b;

/* renamed from: af2.e */
public class C67033e {

    /* renamed from: a */
    public C0036f f192532a = null;

    /* renamed from: b */
    public C67036o f192533b;

    /* renamed from: c */
    public List<C39560p> f192534c;

    /* renamed from: d */
    public String f192535d;

    /* renamed from: e */
    public String f192536e;

    /* renamed from: f */
    public int f192537f = 1;

    /* renamed from: g */
    public String f192538g;

    /* renamed from: h */
    public C49254ea0 f192539h;

    /* renamed from: i */
    public C77905b4 f192540i;

    /* renamed from: j */
    public C51858wn3 f192541j;

    /* renamed from: k */
    public String f192542k;

    /* renamed from: l */
    public String f192543l;

    /* renamed from: m */
    public int f192544m;

    /* renamed from: n */
    public Map<String, C67035g> f192545n;

    /* renamed from: o */
    public Map<String, String> f192546o = new HashMap();

    /* renamed from: p */
    public LinkedList<C49254ea0> f192547p;

    /* renamed from: q */
    public LinkedList<C49638h1> f192548q;

    /* renamed from: r */
    public C67035g f192549r;

    /* renamed from: s */
    public C70109g f192550s;

    /* renamed from: t */
    public Map<String, LinkedList<C49097d50>> f192551t = null;

    /* renamed from: af2.e$a */
    public class C67034a implements Comparator<Map.Entry<String, String>> {
        public int compare(Object obj, Object obj2) {
            return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
    }

    /* renamed from: m */
    public static String m79195m(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new C67034a());
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append((String) entry.getKey());
            sb.append(XVFSFile.PATH_SEPARATOR);
            sb.append((String) entry.getValue());
            sb.append(";");
        }
        sb.deleteCharAt(sb.lastIndexOf(";"));
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r0 = r4.f192533b.f192558e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo90998a() {
        /*
            r4 = this;
            int r0 = r4.f192537f
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x001c
            af2.o r3 = r4.f192533b
            if (r3 == 0) goto L_0x001c
            int r3 = r4.mo91004g()
            if (r0 > r3) goto L_0x001c
            af2.o r0 = r4.f192533b
            bf2.c r0 = r0.f192558e
            if (r0 == 0) goto L_0x001c
            java.util.LinkedList<bf2.m> r0 = r0.f193037t
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 != 0) goto L_0x0020
            return r2
        L_0x0020:
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f192546o
            if (r0 == 0) goto L_0x0042
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r0 = r0.size()
            int r3 = r4.f192544m
            if (r0 != r3) goto L_0x0042
            if (r3 <= 0) goto L_0x003f
            af2.g r0 = r4.f192549r
            if (r0 == 0) goto L_0x0042
            int r0 = r4.f192537f
            if (r0 <= 0) goto L_0x0042
            int r3 = r4.mo91004g()
            if (r0 > r3) goto L_0x0042
            return r1
        L_0x003f:
            if (r3 != 0) goto L_0x0042
            return r1
        L_0x0042:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: af2.C67033e.mo90998a():boolean");
    }

    /* renamed from: b */
    public boolean mo90999b() {
        if (mo90998a() && this.f192540i != null) {
            return mo91001d().mo96502a() || this.f192539h != null;
        }
        return false;
    }

    /* renamed from: c */
    public void mo91000c() {
        this.f192533b = null;
        List<C39560p> list = this.f192534c;
        if (list != null) {
            list.clear();
            this.f192534c = null;
        }
        this.f192535d = null;
        this.f192536e = null;
        this.f192537f = 1;
        this.f192538g = null;
        this.f192539h = null;
        this.f192541j = null;
        this.f192542k = null;
        this.f192544m = 0;
        this.f192549r = null;
        Map<String, C67035g> map = this.f192545n;
        if (map != null) {
            map.clear();
            this.f192545n = null;
        }
        Map<String, String> map2 = this.f192546o;
        if (map2 != null) {
            ((HashMap) map2).clear();
        }
        LinkedList<C49254ea0> linkedList = this.f192547p;
        if (linkedList != null) {
            linkedList.clear();
            this.f192547p = null;
        }
        Map<String, LinkedList<C49097d50>> map3 = this.f192551t;
        if (map3 != null) {
            map3.clear();
            this.f192551t = null;
        }
    }

    /* renamed from: d */
    public C70109g mo91001d() {
        if (this.f192550s == null) {
            this.f192550s = new C70109g(0, 0);
        }
        return this.f192550s;
    }

    /* renamed from: e */
    public String mo91002e() {
        C67035g gVar = this.f192549r;
        return (gVar == null || Util.isNullOrNil(gVar.f152713f)) ? this.f192542k : this.f192549r.f152713f;
    }

    /* renamed from: f */
    public int mo91003f() {
        Map<String, LinkedList<C49097d50>> map = this.f192551t;
        int i = 0;
        if (map != null && map.size() > 0) {
            for (LinkedList next : this.f192551t.values()) {
                if (next != null && next.size() > 0) {
                    Iterator it = next.iterator();
                    while (it.hasNext()) {
                        i += ((C49097d50) it.next()).f132117e;
                    }
                }
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r1.f152715h;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo91004g() {
        /*
            r2 = this;
            af2.o r0 = r2.f192533b
            int r0 = r0.f192556c
            af2.g r1 = r2.f192549r
            if (r1 == 0) goto L_0x000d
            int r1 = r1.f152715h
            if (r0 <= r1) goto L_0x000d
            r0 = r1
        L_0x000d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: af2.C67033e.mo91004g():int");
    }

    /* renamed from: h */
    public C51858wn3 mo91005h() {
        C51858wn3 wn32 = this.f192541j;
        if (wn32 != null) {
            return wn32;
        }
        if (this.f192532a == null) {
            this.f192532a = C79322b.vx0().xx0();
        }
        C0036f fVar = this.f192532a;
        List<String> list = fVar.f43a;
        String str = (list == null || ((ArrayList) list).size() < 1) ? null : (String) ((ArrayList) fVar.f43a).get(0);
        if (!Util.isNullOrNil(str)) {
            C51858wn3 wn33 = new C51858wn3();
            this.f192541j = wn33;
            wn33.f144161e = str;
            wn33.f144160d = 1;
            return wn33;
        }
        C77905b4 b4Var = this.f192540i;
        if (b4Var == null || Util.isNullOrNil(b4Var.f226984h)) {
            return null;
        }
        C51858wn3 wn34 = new C51858wn3();
        this.f192541j = wn34;
        wn34.f144161e = b4Var.f226984h;
        wn34.f144160d = 1;
        return wn34;
    }

    /* renamed from: i */
    public LinkedList<C52029xv3> mo91006i() {
        LinkedList<C52029xv3> linkedList = new LinkedList<>();
        C52029xv3 xv32 = new C52029xv3();
        xv32.f144997f = this.f192537f;
        C67036o oVar = this.f192533b;
        xv32.f144995d = oVar.f192554a;
        xv32.f144998g = oVar.f192562i;
        xv32.f144996e = this.f192538g;
        linkedList.add(xv32);
        return linkedList;
    }

    /* renamed from: j */
    public String mo91007j() {
        C67225n nVar = this.f192533b.f192559f;
        if (nVar != null) {
            return nVar.f193045g;
        }
        return null;
    }

    /* renamed from: k */
    public String mo91008k() {
        if (!Util.isNullOrNil(this.f192533b.mo91020a())) {
            return C70106c.m82576m(this.f192533b.mo91020a());
        }
        return null;
    }

    /* renamed from: l */
    public String mo91009l() {
        C54454k kVar;
        C67036o oVar = this.f192533b;
        C67224c cVar = oVar.f192558e;
        return (cVar == null || (kVar = cVar.f193041x) == null) ? !Util.isNullOrNil(oVar.f192562i) ? this.f192533b.f192562i : this.f192536e : kVar.f152710e;
    }

    /* renamed from: n */
    public c64 mo91010n() {
        c64 c64 = new c64();
        c64.f131556j = this.f192535d;
        c64.f131550d = 1;
        c64.f131551e = new LinkedList<>();
        C77908bi3 bi32 = new C77908bi3();
        bi32.f227005f = this.f192537f;
        C67036o oVar = this.f192533b;
        bi32.f227008i = oVar.f192554a;
        C67224c cVar = oVar.f192558e;
        bi32.f227012p = cVar.f193024d;
        C67035g gVar = this.f192549r;
        if (gVar != null) {
            bi32.f227006g = gVar.f192552i;
        } else {
            bi32.f227006g = cVar.f193027g;
        }
        bi32.f227009j = oVar.f192562i;
        bi32.f227010n = this.f192538g;
        bi32.f227011o = oVar.f192555b;
        bi32.f227003d = this.f192544m;
        bi32.f227004e = new LinkedList<>();
        for (String str : ((HashMap) this.f192546o).keySet()) {
            C64661ql2 ql22 = new C64661ql2();
            ql22.f185058d = str;
            ql22.f185059e = (String) ((HashMap) this.f192546o).get(str);
            bi32.f227004e.add(ql22);
        }
        bi32.f227018v = new LinkedList<>();
        bi32.f227017u = 0;
        Map<String, LinkedList<C49097d50>> map = this.f192551t;
        if (map != null && ((HashMap) map).size() > 0) {
            for (LinkedList linkedList : ((HashMap) this.f192551t).values()) {
                bi32.f227018v.addAll(linkedList);
                bi32.f227017u += linkedList.size();
            }
        }
        c64.f131551e.add(bi32);
        c64.f131554h = new LinkedList<>();
        c64.f131555i = 1;
        C51858wn3 h = mo91005h();
        this.f192541j = h;
        if (h != null) {
            c64.f131554h.add(h);
        } else {
            C51858wn3 wn32 = new C51858wn3();
            this.f192541j = wn32;
            wn32.f144160d = 0;
            c64.f131554h.add(wn32);
        }
        c64.f131553g = this.f192540i;
        c64.f131552f = this.f192539h;
        return c64;
    }

    /* renamed from: o */
    public int mo91011o() {
        int i;
        int i2;
        C49254ea0 ea02;
        int i3 = 0;
        if (!mo91001d().mo96502a() && (ea02 = this.f192539h) != null) {
            i3 = 0 + ea02.f132822e;
        }
        C67035g gVar = this.f192549r;
        if (gVar != null) {
            i2 = gVar.f192552i;
            i = this.f192537f;
        } else {
            i2 = this.f192533b.f192558e.f193027g;
            i = this.f192537f;
        }
        return (i3 + (i2 * i)) - mo91003f();
    }

    /* renamed from: p */
    public String mo91012p() {
        C68070l.C68072b bVar = new C68070l.C68072b();
        bVar.f195570f = this.f192533b.f192558e.f193024d;
        bVar.f195574g = mo91013q();
        bVar.f195582i = 13;
        bVar.f195586j = mo91009l();
        bVar.f195646y = this.f192533b.mo91020a();
        C67036o oVar = this.f192533b;
        bVar.f195575g0 = oVar.f192555b;
        bVar.f195579h0 = mo91014r(oVar);
        return C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
    }

    /* renamed from: q */
    public String mo91013q() {
        C67224c cVar = this.f192533b.f192558e;
        return C39552d.m42185b((double) cVar.f193028h, cVar.f193040w);
    }

    /* renamed from: r */
    public String mo91014r(C67036o oVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("<mallProductInfo>");
        sb.append("<type>");
        sb.append(oVar.f192555b);
        sb.append("</type>");
        sb.append("<id>");
        sb.append(oVar.f192554a);
        sb.append("</id>");
        sb.append("<version>");
        sb.append(oVar.f192558e.f193038u);
        sb.append("</version>");
        sb.append("<name>");
        sb.append(Util.escapeStringForXml(oVar.f192558e.f193024d));
        sb.append("</name>");
        sb.append("<highPrice>");
        sb.append(oVar.f192558e.f193027g);
        sb.append("</highPrice>");
        sb.append("<lowPrice>");
        sb.append(oVar.f192558e.f193028h);
        sb.append("</lowPrice>");
        sb.append("<originPrice>");
        sb.append(oVar.f192558e.f193026f);
        sb.append("</originPrice>");
        sb.append("<sourceUrl>");
        sb.append(Util.escapeStringForXml(this.f192533b.f192562i));
        sb.append("</sourceUrl>");
        if (oVar.f192558e.f193029i != null) {
            sb.append("<imgCount>");
            sb.append(oVar.f192558e.f193029i.size());
            sb.append("</imgCount>");
            sb.append("<imgList>");
            Iterator<String> it = oVar.f192558e.f193029i.iterator();
            while (it.hasNext()) {
                sb.append("<imgUrl>");
                sb.append(Util.escapeStringForXml(it.next()));
                sb.append("</imgUrl>");
            }
            sb.append("</imgList>");
        }
        sb.append("<shareInfo>");
        sb.append("<shareUrl>");
        sb.append(Util.escapeStringForXml(mo91009l()));
        sb.append("</shareUrl>");
        sb.append("<shareThumbUrl>");
        sb.append(Util.escapeStringForXml(oVar.mo91020a()));
        sb.append("</shareThumbUrl>");
        sb.append("</shareInfo>");
        if (this.f192533b.f192559f != null) {
            sb.append("<sellerInfo>");
            sb.append("<appID>");
            sb.append(oVar.f192559f.f193042d);
            sb.append("</appID>");
            sb.append("<appName>");
            sb.append(oVar.f192559f.f193043e);
            sb.append("</appName>");
            sb.append("<usrName>");
            sb.append(oVar.f192559f.f193045g);
            sb.append("</usrName>");
            sb.append("</sellerInfo>");
        }
        sb.append("</mallProductInfo>");
        return sb.toString();
    }

    /* renamed from: s */
    public void mo91015s(Intent intent) {
        C77905b4 b4Var = new C77905b4();
        b4Var.f226984h = Util.nullAs(intent.getStringExtra("userName"), "");
        b4Var.f226985i = Util.nullAs(intent.getStringExtra("telNumber"), "");
        b4Var.f226986j = Util.nullAs(intent.getStringExtra("addressPostalCode"), "");
        b4Var.f226981e = Util.nullAs(intent.getStringExtra("proviceFirstStageName"), "");
        b4Var.f226982f = Util.nullAs(intent.getStringExtra("addressCitySecondStageName"), "");
        b4Var.f226980d = Util.nullAs(intent.getStringExtra("addressCountiesThirdStageName"), "");
        b4Var.f226983g = Util.nullAs(intent.getStringExtra("addressDetailInfo"), "");
        if (!Util.isNullOrNil(b4Var.f226984h) && !Util.isNullOrNil(b4Var.f226985i)) {
            this.f192540i = b4Var;
        }
    }

    /* renamed from: t */
    public void mo91016t(int i) {
        LinkedList<C49254ea0> linkedList = this.f192547p;
        if (linkedList != null && i < linkedList.size() && i >= 0) {
            this.f192539h = this.f192547p.get(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0135, code lost:
        r0 = r0.f106709d;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo91017u(af2.C67036o r13, java.util.List<af2.C39560p> r14) {
        /*
            r12 = this;
            r12.mo91000c()
            r12.f192533b = r13
            r12.f192534c = r14
            java.lang.String r13 = r13.f192562i
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x0015
            af2.o r13 = r12.f192533b
            java.lang.String r14 = r12.f192536e
            r13.f192562i = r14
        L_0x0015:
            af2.o r13 = r12.f192533b
            java.util.LinkedList<bf2.l> r13 = r13.f192560g
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            r12.f192545n = r14
            r14 = 0
            if (r13 == 0) goto L_0x00c4
            int r0 = r13.size()
            if (r0 > 0) goto L_0x002b
            goto L_0x00c4
        L_0x002b:
            int r0 = r13.size()
            r1 = 0
        L_0x0030:
            if (r1 >= r0) goto L_0x00c1
            java.lang.Object r2 = r13.get(r1)
            bf2.l r2 = (bf2.C54455l) r2
            java.lang.String r3 = r2.f152711d
            java.lang.String r4 = ";"
            java.lang.String[] r3 = r3.split(r4)
            if (r3 == 0) goto L_0x00bd
            int r5 = r3.length
            if (r5 > 0) goto L_0x0047
            goto L_0x00bd
        L_0x0047:
            int r5 = r3.length
            int r6 = 32 - r5
            r7 = -1
            int r6 = r7 >>> r6
            r8 = 1
        L_0x004e:
            if (r8 > r6) goto L_0x00bd
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = 0
        L_0x0056:
            if (r10 >= r5) goto L_0x006b
            int r11 = 31 - r10
            int r11 = r8 << r11
            int r11 = r11 >> 31
            if (r11 != r7) goto L_0x0068
            r11 = r3[r10]
            r9.append(r11)
            r9.append(r4)
        L_0x0068:
            int r10 = r10 + 1
            goto L_0x0056
        L_0x006b:
            int r10 = r9.lastIndexOf(r4)
            r9.deleteCharAt(r10)
            java.util.Map<java.lang.String, af2.g> r10 = r12.f192545n
            java.lang.String r11 = r9.toString()
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.Object r10 = r10.get(r11)
            af2.g r10 = (af2.C67035g) r10
            if (r10 == 0) goto L_0x0098
            int r9 = r10.f192552i
            int r11 = r2.f152712e
            if (r9 >= r11) goto L_0x008a
            r10.f192552i = r11
        L_0x008a:
            int r9 = r10.f192553j
            if (r9 <= r11) goto L_0x0090
            r10.f192553j = r11
        L_0x0090:
            int r9 = r10.f152715h
            int r11 = r2.f152715h
            int r9 = r9 + r11
            r10.f152715h = r9
            goto L_0x00ba
        L_0x0098:
            af2.g r10 = new af2.g
            r10.<init>()
            int r11 = r2.f152712e
            r10.f192552i = r11
            r10.f192553j = r11
            int r11 = r2.f152715h
            r10.f152715h = r11
            java.util.LinkedList<bf2.e> r11 = r2.f152714g
            r10.f152714g = r11
            java.lang.String r11 = r2.f152713f
            r10.f152713f = r11
            java.util.Map<java.lang.String, af2.g> r11 = r12.f192545n
            java.lang.String r9 = r9.toString()
            java.util.HashMap r11 = (java.util.HashMap) r11
            r11.put(r9, r10)
        L_0x00ba:
            int r8 = r8 + 1
            goto L_0x004e
        L_0x00bd:
            int r1 = r1 + 1
            goto L_0x0030
        L_0x00c1:
            r12.mo91018v()
        L_0x00c4:
            af2.o r13 = r12.f192533b
            bf2.c r13 = r13.f192558e
            if (r13 == 0) goto L_0x00d4
            java.util.LinkedList<bf2.m> r13 = r13.f193037t
            if (r13 == 0) goto L_0x00d4
            int r13 = r13.size()
            r12.f192544m = r13
        L_0x00d4:
            af2.o r13 = r12.f192533b
            bf2.c r13 = r13.f192558e
            if (r13 == 0) goto L_0x00f2
            java.util.LinkedList<java.lang.String> r13 = r13.f193029i
            if (r13 == 0) goto L_0x00f2
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x00f2
            af2.o r13 = r12.f192533b
            bf2.c r13 = r13.f192558e
            java.util.LinkedList<java.lang.String> r13 = r13.f193029i
            java.lang.Object r13 = r13.get(r14)
            java.lang.String r13 = (java.lang.String) r13
            r12.f192542k = r13
        L_0x00f2:
            af2.o r13 = r12.f192533b
            java.lang.String r13 = r13.mo91020a()
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x012f
            java.lang.Class<xs.b> r13 = p755xs.C102720b.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            xs.b r13 = (p755xs.C102720b) r13
            com.tencent.mm.plugin.product.ui.c r0 = new com.tencent.mm.plugin.product.ui.c
            af2.o r1 = r12.f192533b
            java.lang.String r1 = r1.mo91020a()
            r0.<init>(r1)
            r13.mo142104N6(r0)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "product img path : "
            r13.append(r0)
            java.lang.String r0 = r12.mo91008k()
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "MicroMsg.MallProductManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r13)
        L_0x012f:
            af2.o r13 = r12.f192533b
            bf2.f r0 = r13.f192561h
            if (r0 == 0) goto L_0x013c
            bf2.j r0 = r0.f106709d
            if (r0 == 0) goto L_0x013c
            int r0 = r0.f106720d
            goto L_0x013d
        L_0x013c:
            r0 = 0
        L_0x013d:
            bf2.n r13 = r13.f192559f
            if (r13 == 0) goto L_0x0143
            int r14 = r13.f193046h
        L_0x0143:
            com.tencent.mm.plugin.product.ui.g r13 = new com.tencent.mm.plugin.product.ui.g
            r13.<init>(r0, r14)
            r12.f192550s = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: af2.C67033e.mo91017u(af2.o, java.util.List):void");
    }

    /* renamed from: v */
    public void mo91018v() {
        if (this.f192546o != null) {
            Iterator<C39768m> it = this.f192533b.f192558e.f193037t.iterator();
            while (it.hasNext()) {
                C39768m next = it.next();
                Iterator<C39765h> it4 = next.f106725f.iterator();
                while (it4.hasNext()) {
                    C39765h next2 = it4.next();
                    String str = next.f106723d;
                    String str2 = next2.f106715d;
                    Map<String, String> map = this.f192546o;
                    boolean z = false;
                    if (!(map == null || this.f192545n == null)) {
                        if (((HashMap) map).containsKey(str)) {
                            ((HashMap) this.f192546o).put(str, str2);
                            String m = m79195m(this.f192546o);
                            ((HashMap) this.f192546o).put(str, (String) ((HashMap) this.f192546o).get(str));
                            C67035g gVar = this.f192545n.get(m);
                            if (gVar != null) {
                                if (gVar.f152715h <= 0) {
                                }
                            }
                        } else {
                            ((HashMap) this.f192546o).put(str, str2);
                            String m2 = m79195m(this.f192546o);
                            ((HashMap) this.f192546o).remove(str);
                            C67035g gVar2 = this.f192545n.get(m2);
                            if (gVar2 != null) {
                                if (gVar2.f152715h <= 0) {
                                }
                            }
                        }
                        z = true;
                    }
                    next2.f106717f = z;
                    Log.m105918d("MicroMsg.MallProductManager", "(" + next.f106723d + " , " + next2.f106715d + ") hasStock--> " + next2.f106717f);
                }
            }
        }
    }
}
