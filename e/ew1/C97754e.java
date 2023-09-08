package ew1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ew1.e */
public class C97754e {

    /* renamed from: a */
    public int f286782a;

    /* renamed from: b */
    public int f286783b;

    /* renamed from: c */
    public int f286784c;

    /* renamed from: d */
    public int f286785d;

    /* renamed from: e */
    public int f286786e;

    /* renamed from: f */
    public int f286787f;

    /* renamed from: g */
    public int f286788g;

    /* renamed from: h */
    public int f286789h;

    /* renamed from: i */
    public int f286790i;

    /* renamed from: j */
    public int f286791j;

    /* renamed from: k */
    public int f286792k;

    /* renamed from: l */
    public int f286793l;

    /* renamed from: m */
    public int f286794m;

    /* renamed from: n */
    public int f286795n;

    /* renamed from: o */
    public int f286796o;

    /* renamed from: p */
    public String f286797p;

    /* renamed from: q */
    public long f286798q;

    /* renamed from: r */
    public List<String> f286799r = new ArrayList(9);

    /* renamed from: s */
    public List<String> f286800s = new ArrayList(9);

    /* renamed from: t */
    public List<String> f286801t = new ArrayList(9);

    /* renamed from: u */
    public List<String> f286802u = new ArrayList(9);

    /* renamed from: v */
    public List<String> f286803v = new ArrayList(9);

    /* renamed from: w */
    public HashMap<String, Integer> f286804w = new HashMap<>(9);

    /* renamed from: x */
    public Set<String> f286805x = new HashSet();

    /* renamed from: y */
    public ThreadLocal<Boolean> f286806y = new C97755a(this);

    /* renamed from: ew1.e$a */
    public class C97755a extends ThreadLocal<Boolean> {
        public C97755a(C97754e eVar) {
        }

        public Object initialValue() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: ew1.e$b */
    public static class C97756b {

        /* renamed from: a */
        public static C97754e f286807a = new C97754e((C97755a) null);
    }

    public C97754e(C97755a aVar) {
    }

    /* renamed from: a */
    public void mo137082a(String str) {
        Log.m105925i("MicroMsg.GalleryReporter", "path: %s.", str);
        if (!Util.isNullOrNil(str)) {
            ((ArrayList) this.f286799r).remove(str);
            ((ArrayList) this.f286800s).remove(str);
            ((ArrayList) this.f286801t).remove(str);
            ((ArrayList) this.f286802u).remove(str);
            ((ArrayList) this.f286803v).remove(str);
            this.f286804w.remove(str);
            ((HashSet) this.f286805x).remove(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo137083b(java.lang.String r8, int r9, int r10) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "MicroMsg.GalleryReporter"
            if (r9 < 0) goto L_0x0108
            r3 = 4
            if (r9 <= r3) goto L_0x000b
            goto L_0x0108
        L_0x000b:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r4 == 0) goto L_0x0018
            java.lang.String r8 = "path is invalid!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r8)
            return
        L_0x0018:
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r5[r0] = r6
            r5[r1] = r8
            java.lang.String r6 = "type: %d, path: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r5)
            java.util.List<java.lang.String> r5 = r7.f286799r
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r5 = r5.contains(r8)
            if (r5 == 0) goto L_0x0043
            java.util.List<java.lang.String> r9 = r7.f286799r
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.remove(r8)
            java.lang.String r9 = "sendCountFromSearchUnOCRList, remove."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
        L_0x0040:
            r0 = 1
            goto L_0x00f9
        L_0x0043:
            java.util.List<java.lang.String> r5 = r7.f286800s
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r5 = r5.contains(r8)
            if (r5 == 0) goto L_0x005b
            java.util.List<java.lang.String> r9 = r7.f286800s
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.remove(r8)
            java.lang.String r9 = "sendCountFromSearchOCRList, remove."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            goto L_0x0040
        L_0x005b:
            java.util.List<java.lang.String> r5 = r7.f286801t
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r5 = r5.contains(r8)
            if (r5 == 0) goto L_0x0073
            java.util.List<java.lang.String> r9 = r7.f286801t
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.remove(r8)
            java.lang.String r9 = "sendCountFromClassifyList, remove."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            goto L_0x0040
        L_0x0073:
            java.util.List<java.lang.String> r5 = r7.f286802u
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r5 = r5.contains(r8)
            if (r5 == 0) goto L_0x008b
            java.util.List<java.lang.String> r9 = r7.f286802u
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.remove(r8)
            java.lang.String r9 = "sendCountFromDefaultList, remove."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            goto L_0x0040
        L_0x008b:
            java.util.List<java.lang.String> r5 = r7.f286803v
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r5 = r5.contains(r8)
            if (r5 == 0) goto L_0x00a3
            java.util.List<java.lang.String> r9 = r7.f286803v
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.remove(r8)
            java.lang.String r9 = "sendCountFromOtherList, remove."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            goto L_0x0040
        L_0x00a3:
            java.lang.String r5 = "add!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            if (r9 == 0) goto L_0x00d4
            if (r9 == r1) goto L_0x00cc
            if (r9 == r4) goto L_0x00c4
            r1 = 3
            if (r9 == r1) goto L_0x00bc
            if (r9 == r3) goto L_0x00b4
            goto L_0x00db
        L_0x00b4:
            java.util.List<java.lang.String> r9 = r7.f286803v
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.add(r8)
            goto L_0x00db
        L_0x00bc:
            java.util.List<java.lang.String> r9 = r7.f286802u
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.add(r8)
            goto L_0x00db
        L_0x00c4:
            java.util.List<java.lang.String> r9 = r7.f286801t
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.add(r8)
            goto L_0x00db
        L_0x00cc:
            java.util.List<java.lang.String> r9 = r7.f286800s
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.add(r8)
            goto L_0x00db
        L_0x00d4:
            java.util.List<java.lang.String> r9 = r7.f286799r
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.add(r8)
        L_0x00db:
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r7.f286804w
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.put(r8, r10)
            java.lang.ThreadLocal<java.lang.Boolean> r9 = r7.f286806y
            java.lang.Object r9 = r9.get()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00f9
            java.util.Set<java.lang.String> r9 = r7.f286805x
            java.util.HashSet r9 = (java.util.HashSet) r9
            r9.add(r8)
        L_0x00f9:
            if (r0 == 0) goto L_0x0107
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r7.f286804w
            r9.remove(r8)
            java.util.Set<java.lang.String> r9 = r7.f286805x
            java.util.HashSet r9 = (java.util.HashSet) r9
            r9.remove(r8)
        L_0x0107:
            return
        L_0x0108:
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r0] = r9
            java.lang.String r9 = "type error, %d."
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ew1.C97754e.mo137083b(java.lang.String, int, int):void");
    }

    /* renamed from: c */
    public void mo137084c(int i) {
        switch (i) {
            case 4:
                this.f286782a = 2;
                return;
            case 5:
                this.f286782a = 11;
                return;
            case 7:
            case 8:
                this.f286782a = 3;
                return;
            case 11:
                this.f286782a = 12;
                return;
            case 13:
                this.f286782a = 6;
                return;
            case 14:
            case 22:
                this.f286782a = 8;
                return;
            case 16:
                this.f286782a = 10;
                return;
            case 17:
                this.f286782a = 5;
                return;
            case 18:
                this.f286782a = 9;
                return;
            case 19:
                this.f286782a = 13;
                return;
            case 20:
                this.f286782a = 14;
                return;
            case 21:
                this.f286782a = 15;
                return;
            case 24:
                this.f286782a = 16;
                return;
            default:
                this.f286782a = i;
                return;
        }
    }
}
