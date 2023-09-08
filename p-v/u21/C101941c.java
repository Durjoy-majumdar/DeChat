package u21;

import com.tencent.p014mm.plugin.component.editor.C93088r;
import com.tencent.p014mm.plugin.component.editor.EditorUI;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import o21.C100273b;
import p21.C100616a;
import p21.C100618c;
import p21.C100620e;
import p21.C100621f;
import p21.C100626k;
import p21.C100628m;
import p21.C100630o;
import p21.C100631p;
import t21.C101712a;
import te3.C101834rc0;

/* renamed from: u21.c */
public class C101941c {

    /* renamed from: g */
    public static volatile C101941c f300116g;

    /* renamed from: a */
    public ArrayList<C100616a> f300117a = null;

    /* renamed from: b */
    public C101712a f300118b = null;

    /* renamed from: c */
    public C101834rc0 f300119c = null;

    /* renamed from: d */
    public int f300120d = 0;

    /* renamed from: e */
    public int f300121e = 0;

    /* renamed from: f */
    public int f300122f = 0;

    /* renamed from: u21.c$a */
    public class C101942a implements Runnable {
        public C101942a() {
        }

        public void run() {
            synchronized (C101941c.this) {
                if (C101941c.this.f300117a != null) {
                    int i = 0;
                    StringBuilder sb = new StringBuilder();
                    Iterator<C100616a> it = C101941c.this.f300117a.iterator();
                    while (it.hasNext()) {
                        C100616a next = it.next();
                        if (next.mo140076b() != 1) {
                            i++;
                        } else {
                            sb.append(((C100628m) next).f294819s);
                        }
                    }
                    C101941c.this.f300121e = C93088r.m117434d(sb.toString());
                    C101941c.this.f300122f = i;
                }
            }
        }
    }

    /* renamed from: q */
    public static C101941c m134173q() {
        if (f300116g == null) {
            synchronized (C101941c.class) {
                if (f300116g == null) {
                    f300116g = new C101941c();
                }
            }
        }
        return f300116g;
    }

    /* renamed from: A */
    public final String mo141442A(String str, int i) {
        return String.format("<div><object data-type=\"%d\" id=\"%s\" name=\"%s\" class=\"item item-\"></object></div>", new Object[]{Integer.valueOf(i), str, str});
    }

    /* renamed from: B */
    public int mo141443B() {
        ArrayList<C100616a> arrayList = this.f300117a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: C */
    public final void mo141444C(C100616a aVar, boolean z) {
        if (aVar != null) {
            if (aVar.mo140076b() == 1) {
                int d = C93088r.m117434d(((C100628m) aVar).f294819s);
                if (z) {
                    this.f300121e += d;
                } else {
                    this.f300121e -= d;
                }
            } else if (z) {
                this.f300122f++;
            } else {
                this.f300122f--;
            }
        }
    }

    /* renamed from: a */
    public boolean mo141445a(int i, C100616a aVar, boolean z) {
        boolean z2;
        C101712a aVar2;
        synchronized (this) {
            if (aVar != null) {
                ArrayList<C100616a> arrayList = this.f300117a;
                if (arrayList != null && i >= 0 && i <= arrayList.size()) {
                    this.f300117a.add(i, aVar);
                    mo141444C(aVar, true);
                    z2 = true;
                }
            }
            z2 = false;
        }
        if (z2 && z && (aVar2 = this.f300118b) != null) {
            aVar2.mo94195r3(i);
            if (i > 0) {
                int i2 = i - 1;
                ((EditorUI) this.f300118b).mo127485T7(i2, this.f300117a.size() - i2);
            } else {
                ((EditorUI) this.f300118b).mo127485T7(i, this.f300117a.size() - i);
            }
        }
        return z2;
    }

    /* renamed from: b */
    public boolean mo141446b(C100616a aVar, boolean z) {
        boolean z2;
        C101712a aVar2;
        synchronized (this) {
            if (aVar != null) {
                ArrayList<C100616a> arrayList = this.f300117a;
                if (arrayList != null) {
                    arrayList.add(aVar);
                    mo141444C(aVar, true);
                    z2 = true;
                }
            }
            z2 = false;
        }
        if (z2 && z && (aVar2 = this.f300118b) != null) {
            aVar2.mo94195r3(this.f300117a.size() - 1);
        }
        return z2;
    }

    /* renamed from: c */
    public final boolean mo141447c(int i, C100616a aVar, boolean z) {
        boolean z2;
        C101712a aVar2;
        ArrayList<C100616a> arrayList;
        if (aVar == null || (arrayList = this.f300117a) == null || i < 0 || i > arrayList.size()) {
            z2 = false;
        } else {
            this.f300117a.add(i, aVar);
            mo141444C(aVar, true);
            z2 = true;
        }
        if (z2 && z && (aVar2 = this.f300118b) != null) {
            aVar2.mo94195r3(i);
            if (i > 0) {
                int i2 = i - 1;
                ((EditorUI) this.f300118b).mo127485T7(i2, this.f300117a.size() - i2);
            } else {
                ((EditorUI) this.f300118b).mo127485T7(i, this.f300117a.size() - i);
            }
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e9, code lost:
        if (r1 == -1) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00eb, code lost:
        if (r13 == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ed, code lost:
        r11 = r10.f300118b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ef, code lost:
        if (r11 == null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f1, code lost:
        ((com.tencent.p014mm.plugin.component.editor.EditorUI) r11).mo127485T7(r1, r10.f300117a.size() - r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fd, code lost:
        mo141465v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0100, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141448d(int r11, int r12, boolean r13) {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.EditorDataManager"
            java.lang.String r1 = "checkMergeTextDataItem startPos: %d endPos: %d needNotify: %b"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r4 = 0
            r2[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r5 = 1
            r2[r5] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r13)
            r6 = 2
            r2[r6] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r2)
            monitor-enter(r10)
            java.util.ArrayList<p21.a> r0 = r10.f300117a     // Catch:{ all -> 0x0101 }
            if (r0 != 0) goto L_0x0026
            monitor-exit(r10)     // Catch:{ all -> 0x0101 }
            return
        L_0x0026:
            if (r11 > 0) goto L_0x0029
            r11 = 0
        L_0x0029:
            int r0 = r0.size()     // Catch:{ all -> 0x0101 }
            if (r12 < r0) goto L_0x0036
            java.util.ArrayList<p21.a> r12 = r10.f300117a     // Catch:{ all -> 0x0101 }
            int r12 = r12.size()     // Catch:{ all -> 0x0101 }
            int r12 = r12 - r5
        L_0x0036:
            r0 = -1
            r1 = -1
        L_0x0038:
            if (r12 <= r11) goto L_0x00e8
            java.util.ArrayList<p21.a> r2 = r10.f300117a     // Catch:{ all -> 0x0101 }
            java.lang.Object r2 = r2.get(r12)     // Catch:{ all -> 0x0101 }
            p21.a r2 = (p21.C100616a) r2     // Catch:{ all -> 0x0101 }
            java.util.ArrayList<p21.a> r3 = r10.f300117a     // Catch:{ all -> 0x0101 }
            int r6 = r12 + -1
            java.lang.Object r3 = r3.get(r6)     // Catch:{ all -> 0x0101 }
            p21.a r3 = (p21.C100616a) r3     // Catch:{ all -> 0x0101 }
            if (r2 == 0) goto L_0x00e4
            int r7 = r2.mo140076b()     // Catch:{ all -> 0x0101 }
            if (r7 != r5) goto L_0x00e4
            if (r3 == 0) goto L_0x00e4
            int r7 = r3.mo140076b()     // Catch:{ all -> 0x0101 }
            if (r7 != r5) goto L_0x00e4
            p21.m r2 = (p21.C100628m) r2     // Catch:{ all -> 0x0101 }
            p21.m r3 = (p21.C100628m) r3     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = r2.f294819s     // Catch:{ all -> 0x0101 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ all -> 0x0101 }
            if (r1 != 0) goto L_0x00be
            java.lang.String r1 = r2.f294819s     // Catch:{ all -> 0x0101 }
            android.text.Spanned r1 = s21.C101496a.m133260a(r1)     // Catch:{ all -> 0x0101 }
            java.lang.String r7 = r3.f294819s     // Catch:{ all -> 0x0101 }
            android.text.Spanned r7 = s21.C101496a.m133260a(r7)     // Catch:{ all -> 0x0101 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
            r8.<init>()     // Catch:{ all -> 0x0101 }
            java.lang.String r9 = r3.f294819s     // Catch:{ all -> 0x0101 }
            r8.append(r9)     // Catch:{ all -> 0x0101 }
            java.lang.String r9 = "<br/>"
            r8.append(r9)     // Catch:{ all -> 0x0101 }
            java.lang.String r9 = r2.f294819s     // Catch:{ all -> 0x0101 }
            r8.append(r9)     // Catch:{ all -> 0x0101 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0101 }
            r3.f294819s = r8     // Catch:{ all -> 0x0101 }
            boolean r8 = r2.f294796b     // Catch:{ all -> 0x0101 }
            if (r8 == 0) goto L_0x00af
            r3.f294796b = r5     // Catch:{ all -> 0x0101 }
            r3.f294801g = r4     // Catch:{ all -> 0x0101 }
            int r8 = r2.f294797c     // Catch:{ all -> 0x0101 }
            if (r8 == r0) goto L_0x00ac
            int r1 = r1.length()     // Catch:{ all -> 0x0101 }
            if (r8 < r1) goto L_0x00a1
            goto L_0x00ac
        L_0x00a1:
            int r1 = r7.length()     // Catch:{ all -> 0x0101 }
            int r1 = r1 + r5
            int r2 = r2.f294797c     // Catch:{ all -> 0x0101 }
            int r1 = r1 + r2
            r3.f294797c = r1     // Catch:{ all -> 0x0101 }
            goto L_0x00c8
        L_0x00ac:
            r3.f294797c = r0     // Catch:{ all -> 0x0101 }
            goto L_0x00c8
        L_0x00af:
            boolean r1 = r3.f294796b     // Catch:{ all -> 0x0101 }
            if (r1 == 0) goto L_0x00c8
            int r1 = r3.f294797c     // Catch:{ all -> 0x0101 }
            if (r1 != r0) goto L_0x00c8
            int r1 = r7.length()     // Catch:{ all -> 0x0101 }
            r3.f294797c = r1     // Catch:{ all -> 0x0101 }
            goto L_0x00c8
        L_0x00be:
            boolean r1 = r2.f294796b     // Catch:{ all -> 0x0101 }
            if (r1 == 0) goto L_0x00c8
            r3.f294796b = r5     // Catch:{ all -> 0x0101 }
            r3.f294801g = r4     // Catch:{ all -> 0x0101 }
            r3.f294797c = r0     // Catch:{ all -> 0x0101 }
        L_0x00c8:
            java.lang.String r1 = "MicroMsg.EditorDataManager"
            java.lang.String r2 = "checkMergeTextDataItem remove position: %d"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0101 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0101 }
            r3[r4] = r7     // Catch:{ all -> 0x0101 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)     // Catch:{ all -> 0x0101 }
            r10.mo141467x(r12, r4)     // Catch:{ all -> 0x0101 }
            if (r13 == 0) goto L_0x00e3
            t21.a r1 = r10.f300118b     // Catch:{ all -> 0x0101 }
            if (r1 == 0) goto L_0x00e3
            r1.mo94186d5(r12)     // Catch:{ all -> 0x0101 }
        L_0x00e3:
            r1 = r6
        L_0x00e4:
            int r12 = r12 + -1
            goto L_0x0038
        L_0x00e8:
            monitor-exit(r10)     // Catch:{ all -> 0x0101 }
            if (r1 == r0) goto L_0x00fd
            if (r13 == 0) goto L_0x00fd
            t21.a r11 = r10.f300118b
            if (r11 == 0) goto L_0x00fd
            java.util.ArrayList<p21.a> r12 = r10.f300117a
            int r12 = r12.size()
            int r12 = r12 - r1
            com.tencent.mm.plugin.component.editor.EditorUI r11 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r11
            r11.mo127485T7(r1, r12)
        L_0x00fd:
            r10.mo141465v()
            return
        L_0x0101:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0101 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u21.C101941c.mo141448d(int, int, boolean):void");
    }

    /* renamed from: e */
    public boolean mo141449e(ArrayList<C100616a> arrayList) {
        int i;
        ArrayList<C100616a> arrayList2 = this.f300117a;
        if (arrayList2 != null) {
            Iterator<C100616a> it = arrayList2.iterator();
            i = 0;
            while (it.hasNext()) {
                C100616a next = it.next();
                if ((next instanceof C100630o) || (next instanceof C100626k) || (next instanceof C100618c)) {
                    i = (int) (((long) i) + ((C100620e) next).f294810o);
                }
            }
        } else {
            i = 0;
        }
        if (arrayList != null) {
            Iterator<C100616a> it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C100616a next2 = it4.next();
                if ((next2 instanceof C100630o) || (next2 instanceof C100626k) || (next2 instanceof C100618c)) {
                    i = (int) (((long) i) + ((C100620e) next2).f294810o);
                }
            }
        }
        Log.m105925i("MicroMsg.EditorDataManager", "checkReachMaxAttachLimit: %dM", Integer.valueOf((i / 1024) / 1024));
        return i > 104857600;
    }

    /* renamed from: f */
    public boolean mo141450f(int i, int i2) {
        boolean z = i >= 0;
        boolean z2 = i2 >= 0;
        if (!z || this.f300121e + i <= 16384) {
            return z2 && this.f300122f + i2 > 30;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo141451g(ArrayList<C100616a> arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator<C100616a> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C100616a next = it.next();
            if (next.mo140076b() != 1) {
                i++;
            } else {
                sb.append(((C100628m) next).f294819s);
            }
        }
        return mo141450f(C93088r.m117434d(sb.toString()), i);
    }

    /* renamed from: h */
    public void mo141452h(boolean z) {
        C101712a aVar;
        boolean z2 = true;
        Object[] objArr = new Object[1];
        ArrayList<C100616a> arrayList = this.f300117a;
        objArr[0] = Integer.valueOf(arrayList != null ? arrayList.size() : 0);
        Log.m105925i("MicroMsg.EditorDataManager", "clear mDataList, size:%d", objArr);
        synchronized (this) {
            ArrayList<C100616a> arrayList2 = this.f300117a;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                z2 = false;
            }
        }
        this.f300122f = 0;
        this.f300121e = 0;
        if (z2 && z && (aVar = this.f300118b) != null) {
            ((EditorUI) aVar).mo127484S7();
        }
    }

    /* renamed from: i */
    public void mo141453i() {
        synchronized (this) {
            ArrayList<C100616a> arrayList = this.f300117a;
            if (arrayList != null) {
                Iterator<C100616a> it = arrayList.iterator();
                while (it.hasNext()) {
                    C100616a next = it.next();
                    next.f294796b = false;
                    next.f294801g = false;
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo141454j() {
        ArrayList<C100616a> arrayList = this.f300117a;
        if (arrayList != null) {
            Iterator<C100616a> it = arrayList.iterator();
            while (it.hasNext()) {
                C100616a next = it.next();
                next.f294796b = false;
                next.f294801g = false;
            }
        }
    }

    /* renamed from: k */
    public String mo141455k() {
        String sb;
        ArrayList<C100616a> arrayList;
        synchronized (this) {
            if (this.f300120d == 0 && (arrayList = this.f300117a) != null) {
                Iterator<C100616a> it = arrayList.iterator();
                while (it.hasNext()) {
                    C100620e eVar = (C100620e) it.next();
                    if (eVar.f294807l.startsWith("WeNote_")) {
                        int i = Util.getInt(eVar.f294807l.substring(7), -1);
                        int i2 = this.f300120d;
                        if (i <= i2) {
                            i = i2;
                        }
                        this.f300120d = i;
                    }
                }
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("WeNote_");
            int i3 = this.f300120d + 1;
            this.f300120d = i3;
            sb4.append(i3);
            sb = sb4.toString();
        }
        return sb;
    }

    /* renamed from: l */
    public C100616a mo141456l(int i) {
        ArrayList<C100616a> arrayList = this.f300117a;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return this.f300117a.get(i);
    }

    /* renamed from: m */
    public ArrayList<C100616a> mo141457m() {
        if (this.f300117a == null) {
            return null;
        }
        ArrayList<C100616a> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<C100616a> it = this.f300117a.iterator();
            while (it.hasNext()) {
                arrayList.add(C93088r.m117431a(it.next()));
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public int mo141458n() {
        synchronized (this) {
            if (this.f300117a == null) {
                return -1;
            }
            for (int i = 0; i < this.f300117a.size(); i++) {
                C100616a aVar = this.f300117a.get(i);
                if (aVar != null && aVar.mo140076b() != -3 && aVar.mo140076b() != -2) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: o */
    public String mo141459o() {
        StringBuilder sb = new StringBuilder();
        synchronized (this) {
            ArrayList<C100616a> arrayList = this.f300117a;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    for (int i = 0; i < this.f300117a.size(); i++) {
                        C100616a aVar = this.f300117a.get(i);
                        switch (aVar.mo140076b()) {
                            case -1:
                                sb.append("<hr/>");
                                break;
                            case 1:
                                C100628m mVar = (C100628m) aVar;
                                if (!Util.isNullOrNil(mVar.f294819s)) {
                                    if (!mVar.f294819s.startsWith("<wx-p>")) {
                                        sb.append("<wx-p>");
                                    }
                                    sb.append(mVar.f294819s);
                                    if (mVar.f294819s.endsWith("</wx-p>")) {
                                        break;
                                    } else {
                                        sb.append("</wx-p>");
                                        break;
                                    }
                                } else {
                                    sb.append("<br/>");
                                    break;
                                }
                            case 2:
                                sb.append(mo141442A(((C100626k) aVar).f294807l, 2));
                                break;
                            case 3:
                                sb.append(mo141442A(((C100621f) aVar).f294807l, 3));
                                break;
                            case 4:
                                sb.append(mo141442A(((C100631p) aVar).f294807l, 4));
                                break;
                            case 5:
                                sb.append(mo141442A(((C100618c) aVar).f294807l, 5));
                                break;
                            case 6:
                                sb.append(mo141442A(((C100630o) aVar).f294807l, 6));
                                break;
                        }
                    }
                    StringBuilder sb4 = new StringBuilder(sb.toString().replaceAll("\n", "<br/>"));
                    return sb4.toString();
                }
            }
            return "";
        }
    }

    /* renamed from: p */
    public int mo141460p() {
        synchronized (this) {
            ArrayList<C100616a> arrayList = this.f300117a;
            if (arrayList == null) {
                return -1;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C100616a aVar = this.f300117a.get(size);
                if (aVar != null && aVar.mo140076b() != -3 && aVar.mo140076b() != -2) {
                    return size;
                }
            }
            return -1;
        }
    }

    /* renamed from: r */
    public int mo141461r(C100616a aVar, WXRTEditText wXRTEditText, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (aVar == null) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        return mo141462s(arrayList, wXRTEditText, z, z2, z3, z4, z5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01cc, code lost:
        r10 = r5.f300118b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ce, code lost:
        if (r10 == null) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d0, code lost:
        if (r9 == false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01d2, code lost:
        r0 = r0 - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d3, code lost:
        if (r7 == false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d5, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d7, code lost:
        if (r8 < 0) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d9, code lost:
        if (r0 <= 0) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01db, code lost:
        r10.mo94193n4(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01de, code lost:
        if (r8 <= 0) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01e0, code lost:
        r8 = r8 - 1;
        ((com.tencent.p014mm.plugin.component.editor.EditorUI) r5.f300118b).mo127485T7(r8, m134173q().mo141443B() - r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01f2, code lost:
        if (r8 != 0) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01f4, code lost:
        ((com.tencent.p014mm.plugin.component.editor.EditorUI) r5.f300118b).mo127485T7(r8, m134173q().mo141443B() - r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0204, code lost:
        if (r11 == false) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0206, code lost:
        r7 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r5.f300118b;
        r7.f268052q.post(new com.tencent.p014mm.plugin.component.editor.C93073g(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0214, code lost:
        r7 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r5.f300118b;
        r7.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x021b, code lost:
        if (r6 < 0) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0225, code lost:
        if (r6 < m134173q().mo141443B()) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0228, code lost:
        r7.f268052q.post(new com.tencent.p014mm.plugin.component.editor.C55597f(r7, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0232, code lost:
        mo141465v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0235, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017c, code lost:
        r6 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017e, code lost:
        if (r6 < 0) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0188, code lost:
        if (r6 >= m134173q().mo141443B()) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x018b, code lost:
        r6 = m134173q().mo141443B() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0194, code lost:
        if (r12 == false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0196, code lost:
        r6 = r6 + 1;
        r0 = r0 + 1;
        mo141454j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a5, code lost:
        if (r6 >= m134173q().mo141443B()) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a7, code lost:
        r12 = m134173q().mo141456l(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01af, code lost:
        if (r12 == null) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01b1, code lost:
        r12.f294797c = 0;
        r12.f294796b = true;
        r12.f294801g = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b8, code lost:
        r12 = new p21.C100628m();
        r12.f294811p = 1;
        r12.f294819s = "";
        r12.f294797c = 0;
        r12.f294796b = true;
        r12.f294801g = false;
        mo141447c(r6, r12, false);
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0140  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo141462s(java.util.ArrayList<p21.C100616a> r6, com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12) {
        /*
            r5 = this;
            r0 = -1
            if (r6 == 0) goto L_0x0239
            int r1 = r6.size()
            if (r1 <= 0) goto L_0x0239
            java.util.ArrayList<p21.a> r1 = r5.f300117a
            if (r1 != 0) goto L_0x000f
            goto L_0x0239
        L_0x000f:
            if (r10 == 0) goto L_0x0021
            boolean r10 = r5.mo141451g(r6)
            if (r10 == 0) goto L_0x0021
            t21.a r10 = r5.f300118b
            if (r10 == 0) goto L_0x0021
            com.tencent.mm.plugin.component.editor.EditorUI r10 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r10
            r10.mo127486U7()
            return r0
        L_0x0021:
            r10 = 0
            r1 = 1
            if (r8 == 0) goto L_0x0056
            int r8 = r6.size()
            int r8 = r8 - r1
            java.lang.Object r8 = r6.get(r8)
            p21.a r8 = (p21.C100616a) r8
            r8.f294797c = r0
            r8.f294796b = r1
            r8.f294801g = r10
            if (r7 == 0) goto L_0x0056
            boolean r2 = r7.f268140N
            if (r2 == 0) goto L_0x0056
            int r2 = r7.getEditTextType()
            r3 = 2
            if (r2 != r3) goto L_0x0046
            r8.f294804j = r3
            goto L_0x004e
        L_0x0046:
            int r2 = r7.getEditTextType()
            if (r2 != r1) goto L_0x004e
            r8.f294804j = r1
        L_0x004e:
            r7.f268140N = r10
            int r2 = r7.f268139M
            r8.f294805k = r2
            r7.f268139M = r10
        L_0x0056:
            monitor-enter(r5)
            if (r7 != 0) goto L_0x0088
            int r7 = r5.mo141443B()     // Catch:{ all -> 0x0236 }
            r5.mo141454j()     // Catch:{ all -> 0x0236 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0236 }
            r8 = r7
        L_0x0065:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0236 }
            if (r0 == 0) goto L_0x0178
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x0236 }
            p21.a r0 = (p21.C100616a) r0     // Catch:{ all -> 0x0236 }
            r5.mo141464u(r0)     // Catch:{ all -> 0x0236 }
            if (r0 == 0) goto L_0x0082
            java.util.ArrayList<p21.a> r2 = r5.f300117a     // Catch:{ all -> 0x0236 }
            if (r2 == 0) goto L_0x0082
            r2.add(r0)     // Catch:{ all -> 0x0236 }
            r5.mo141444C(r0, r1)     // Catch:{ all -> 0x0236 }
            r0 = 1
            goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            if (r0 == 0) goto L_0x0065
            int r8 = r8 + 1
            goto L_0x0065
        L_0x0088:
            int r8 = r7.getRecyclerItemPosition()     // Catch:{ all -> 0x0236 }
            p21.a r2 = r5.mo141456l(r8)     // Catch:{ all -> 0x0236 }
            if (r2 != 0) goto L_0x0094
            monitor-exit(r5)     // Catch:{ all -> 0x0236 }
            return r0
        L_0x0094:
            r5.mo141454j()     // Catch:{ all -> 0x0236 }
            int r0 = r7.getEditTextType()     // Catch:{ all -> 0x0236 }
            if (r0 != 0) goto L_0x0152
            int r0 = r2.mo140076b()     // Catch:{ all -> 0x0236 }
            if (r0 != r1) goto L_0x0152
            u21.g r0 = r7.getSelection()     // Catch:{ all -> 0x0236 }
            android.text.Editable r7 = r7.getText()     // Catch:{ all -> 0x0236 }
            int r3 = r0.f300151d     // Catch:{ all -> 0x0236 }
            java.lang.CharSequence r3 = r7.subSequence(r10, r3)     // Catch:{ all -> 0x0236 }
            int r0 = r0.f300152e     // Catch:{ all -> 0x0236 }
            int r4 = r7.length()     // Catch:{ all -> 0x0236 }
            java.lang.CharSequence r7 = r7.subSequence(r0, r4)     // Catch:{ all -> 0x0236 }
            android.text.Spanned r3 = (android.text.Spanned) r3     // Catch:{ all -> 0x0236 }
            java.lang.String r0 = s21.C101498c.m133261a(r3)     // Catch:{ all -> 0x0236 }
            android.text.Spanned r7 = (android.text.Spanned) r7     // Catch:{ all -> 0x0236 }
            java.lang.String r7 = s21.C101498c.m133261a(r7)     // Catch:{ all -> 0x0236 }
            p21.m r2 = (p21.C100628m) r2     // Catch:{ all -> 0x0236 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x0236 }
            r4 = 5
            if (r3 != 0) goto L_0x010f
            java.lang.String r3 = "<br/>"
            boolean r3 = r0.endsWith(r3)     // Catch:{ all -> 0x0236 }
            if (r3 == 0) goto L_0x00e1
            int r3 = r0.length()     // Catch:{ all -> 0x0236 }
            int r3 = r3 - r4
            java.lang.String r0 = r0.substring(r10, r3)     // Catch:{ all -> 0x0236 }
        L_0x00e1:
            r2.f294819s = r0     // Catch:{ all -> 0x0236 }
            int r8 = r8 + 1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ all -> 0x0236 }
            if (r0 != 0) goto L_0x0134
            p21.m r0 = new p21.m     // Catch:{ all -> 0x0236 }
            r0.<init>()     // Catch:{ all -> 0x0236 }
            r0.f294811p = r1     // Catch:{ all -> 0x0236 }
            java.lang.String r2 = "<br/>"
            boolean r2 = r7.startsWith(r2)     // Catch:{ all -> 0x0236 }
            if (r2 == 0) goto L_0x0102
            int r2 = r7.length()     // Catch:{ all -> 0x0236 }
            java.lang.String r7 = r7.substring(r4, r2)     // Catch:{ all -> 0x0236 }
        L_0x0102:
            r0.f294819s = r7     // Catch:{ all -> 0x0236 }
            r0.f294797c = r10     // Catch:{ all -> 0x0236 }
            r0.f294796b = r10     // Catch:{ all -> 0x0236 }
            r0.f294801g = r10     // Catch:{ all -> 0x0236 }
            r5.mo141447c(r8, r0, r10)     // Catch:{ all -> 0x0236 }
            r7 = 1
            goto L_0x0135
        L_0x010f:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ all -> 0x0236 }
            if (r0 != 0) goto L_0x0128
            java.lang.String r0 = "<br/>"
            boolean r0 = r7.startsWith(r0)     // Catch:{ all -> 0x0236 }
            if (r0 == 0) goto L_0x0125
            int r0 = r7.length()     // Catch:{ all -> 0x0236 }
            java.lang.String r7 = r7.substring(r4, r0)     // Catch:{ all -> 0x0236 }
        L_0x0125:
            r2.f294819s = r7     // Catch:{ all -> 0x0236 }
            goto L_0x0134
        L_0x0128:
            r5.mo141467x(r8, r10)     // Catch:{ all -> 0x0236 }
            if (r9 == 0) goto L_0x0134
            t21.a r7 = r5.f300118b     // Catch:{ all -> 0x0236 }
            if (r7 == 0) goto L_0x0134
            r7.mo94186d5(r8)     // Catch:{ all -> 0x0236 }
        L_0x0134:
            r7 = 0
        L_0x0135:
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0236 }
            r0 = r8
        L_0x013a:
            boolean r2 = r6.hasNext()     // Catch:{ all -> 0x0236 }
            if (r2 == 0) goto L_0x017b
            java.lang.Object r2 = r6.next()     // Catch:{ all -> 0x0236 }
            p21.a r2 = (p21.C100616a) r2     // Catch:{ all -> 0x0236 }
            r5.mo141464u(r2)     // Catch:{ all -> 0x0236 }
            boolean r2 = r5.mo141447c(r0, r2, r10)     // Catch:{ all -> 0x0236 }
            if (r2 == 0) goto L_0x013a
            int r0 = r0 + 1
            goto L_0x013a
        L_0x0152:
            int r7 = r7.getEditTextType()     // Catch:{ all -> 0x0236 }
            if (r7 == r1) goto L_0x015a
            int r8 = r8 + 1
        L_0x015a:
            r7 = r8
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0236 }
            r8 = r7
        L_0x0160:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0236 }
            if (r0 == 0) goto L_0x0178
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x0236 }
            p21.a r0 = (p21.C100616a) r0     // Catch:{ all -> 0x0236 }
            r5.mo141464u(r0)     // Catch:{ all -> 0x0236 }
            boolean r0 = r5.mo141447c(r8, r0, r10)     // Catch:{ all -> 0x0236 }
            if (r0 == 0) goto L_0x0160
            int r8 = r8 + 1
            goto L_0x0160
        L_0x0178:
            r0 = r8
            r8 = r7
            r7 = 0
        L_0x017b:
            monitor-exit(r5)     // Catch:{ all -> 0x0236 }
            int r6 = r0 + -1
            if (r6 < 0) goto L_0x018b
            u21.c r2 = m134173q()
            int r2 = r2.mo141443B()
            if (r6 >= r2) goto L_0x018b
            goto L_0x0194
        L_0x018b:
            u21.c r6 = m134173q()
            int r6 = r6.mo141443B()
            int r6 = r6 - r1
        L_0x0194:
            if (r12 == 0) goto L_0x01cc
            int r6 = r6 + 1
            int r0 = r0 + 1
            r5.mo141454j()
            u21.c r12 = m134173q()
            int r12 = r12.mo141443B()
            if (r6 >= r12) goto L_0x01b8
            u21.c r12 = m134173q()
            p21.a r12 = r12.mo141456l(r6)
            if (r12 == 0) goto L_0x01cc
            r12.f294797c = r10
            r12.f294796b = r1
            r12.f294801g = r10
            goto L_0x01cc
        L_0x01b8:
            p21.m r12 = new p21.m
            r12.<init>()
            r12.f294811p = r1
            java.lang.String r2 = ""
            r12.f294819s = r2
            r12.f294797c = r10
            r12.f294796b = r1
            r12.f294801g = r10
            r5.mo141447c(r6, r12, r10)
        L_0x01cc:
            t21.a r10 = r5.f300118b
            if (r10 == 0) goto L_0x0232
            if (r9 == 0) goto L_0x0204
            int r0 = r0 - r8
            if (r7 == 0) goto L_0x01d7
            int r0 = r0 + 1
        L_0x01d7:
            if (r8 < 0) goto L_0x01de
            if (r0 <= 0) goto L_0x01de
            r10.mo94193n4(r8, r0)
        L_0x01de:
            if (r8 <= 0) goto L_0x01f2
            t21.a r7 = r5.f300118b
            int r8 = r8 - r1
            u21.c r9 = m134173q()
            int r9 = r9.mo141443B()
            int r9 = r9 - r8
            com.tencent.mm.plugin.component.editor.EditorUI r7 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r7
            r7.mo127485T7(r8, r9)
            goto L_0x0204
        L_0x01f2:
            if (r8 != 0) goto L_0x0204
            t21.a r7 = r5.f300118b
            u21.c r9 = m134173q()
            int r9 = r9.mo141443B()
            int r9 = r9 - r8
            com.tencent.mm.plugin.component.editor.EditorUI r7 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r7
            r7.mo127485T7(r8, r9)
        L_0x0204:
            if (r11 == 0) goto L_0x0214
            t21.a r7 = r5.f300118b
            com.tencent.mm.plugin.component.editor.EditorUI r7 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r7
            com.tencent.mm.sdk.platformtools.MMHandler r8 = r7.f268052q
            com.tencent.mm.plugin.component.editor.g r9 = new com.tencent.mm.plugin.component.editor.g
            r9.<init>(r7)
            r8.post(r9)
        L_0x0214:
            t21.a r7 = r5.f300118b
            com.tencent.mm.plugin.component.editor.EditorUI r7 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r7
            r7.getClass()
            if (r6 < 0) goto L_0x0232
            u21.c r8 = m134173q()
            int r8 = r8.mo141443B()
            if (r6 < r8) goto L_0x0228
            goto L_0x0232
        L_0x0228:
            com.tencent.mm.sdk.platformtools.MMHandler r8 = r7.f268052q
            com.tencent.mm.plugin.component.editor.f r9 = new com.tencent.mm.plugin.component.editor.f
            r9.<init>(r7, r6)
            r8.post(r9)
        L_0x0232:
            r5.mo141465v()
            return r6
        L_0x0236:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0236 }
            throw r6
        L_0x0239:
            java.lang.String r6 = "MicroMsg.EditorDataManager"
            java.lang.String r7 = "insertItemList,error,return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u21.C101941c.mo141462s(java.util.ArrayList, com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText, boolean, boolean, boolean, boolean, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01bb, code lost:
        if (r5 < m134173q().mo141443B()) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01be, code lost:
        r6.f268052q.post(new com.tencent.p014mm.plugin.component.editor.C55597f(r6, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c8, code lost:
        mo141465v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01cb, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015a, code lost:
        r5 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x015c, code lost:
        if (r5 < 0) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0166, code lost:
        if (r5 >= m134173q().mo141443B()) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0169, code lost:
        r5 = m134173q().mo141443B() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0172, code lost:
        r6 = r4.f300118b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0174, code lost:
        if (r6 == null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0176, code lost:
        if (r11 == false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0178, code lost:
        r8 = r8 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0179, code lost:
        if (r1 == false) goto L_0x017d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017b, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x017d, code lost:
        if (r7 < 0) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x017f, code lost:
        if (r8 <= 0) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0181, code lost:
        r6.mo94193n4(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0184, code lost:
        if (r7 <= 0) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0186, code lost:
        r7 = r7 - 1;
        ((com.tencent.p014mm.plugin.component.editor.EditorUI) r4.f300118b).mo127485T7(r7, m134173q().mo141443B() - r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0198, code lost:
        if (r7 != 0) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x019a, code lost:
        ((com.tencent.p014mm.plugin.component.editor.EditorUI) r4.f300118b).mo127485T7(r7, m134173q().mo141443B() - r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01aa, code lost:
        r6 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r4.f300118b;
        r6.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01b1, code lost:
        if (r5 < 0) goto L_0x01c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fc  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo141463t(java.util.ArrayList<p21.C100616a> r5, int r6, int r7, int r8, int r9, boolean r10, boolean r11) {
        /*
            r4 = this;
            r0 = -1
            if (r5 == 0) goto L_0x01cf
            int r1 = r5.size()
            if (r1 <= 0) goto L_0x01cf
            java.util.ArrayList<p21.a> r1 = r4.f300117a
            if (r1 == 0) goto L_0x01cf
            if (r7 < 0) goto L_0x01cf
            if (r8 < 0) goto L_0x01cf
            if (r9 < 0) goto L_0x01cf
            if (r9 >= r8) goto L_0x0017
            goto L_0x01cf
        L_0x0017:
            r1 = 0
            r2 = 1
            if (r10 == 0) goto L_0x0037
            int r10 = r5.size()
            int r10 = r10 - r2
            java.lang.Object r10 = r5.get(r10)
            p21.a r10 = (p21.C100616a) r10
            if (r10 != 0) goto L_0x0031
            java.lang.String r5 = "MicroMsg.EditorDataManager"
            java.lang.String r6 = "pasteItemList, lastInsertItem is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
            return r0
        L_0x0031:
            r10.f294797c = r0
            r10.f294796b = r2
            r10.f294801g = r1
        L_0x0037:
            p21.a r10 = r4.mo141456l(r7)
            if (r10 != 0) goto L_0x0046
            java.lang.String r5 = "MicroMsg.EditorDataManager"
            java.lang.String r6 = "pasteItemList, item is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
            return r0
        L_0x0046:
            monitor-enter(r4)
            r4.mo141454j()     // Catch:{ all -> 0x01cc }
            if (r6 != 0) goto L_0x0138
            int r3 = r10.mo140076b()     // Catch:{ all -> 0x01cc }
            if (r3 != r2) goto L_0x0138
            r6 = r10
            p21.m r6 = (p21.C100628m) r6     // Catch:{ all -> 0x01cc }
            java.lang.String r6 = r6.f294819s     // Catch:{ all -> 0x01cc }
            android.text.Spanned r6 = s21.C101496a.m133260a(r6)     // Catch:{ all -> 0x01cc }
            if (r6 == 0) goto L_0x0110
            int r3 = r6.length()     // Catch:{ all -> 0x01cc }
            if (r8 > r3) goto L_0x0110
            int r3 = r6.length()     // Catch:{ all -> 0x01cc }
            if (r9 <= r3) goto L_0x006b
            goto L_0x0110
        L_0x006b:
            java.lang.CharSequence r8 = r6.subSequence(r1, r8)     // Catch:{ all -> 0x01cc }
            int r0 = r6.length()     // Catch:{ all -> 0x01cc }
            java.lang.CharSequence r6 = r6.subSequence(r9, r0)     // Catch:{ all -> 0x01cc }
            android.text.Spanned r8 = (android.text.Spanned) r8     // Catch:{ all -> 0x01cc }
            java.lang.String r8 = s21.C101498c.m133261a(r8)     // Catch:{ all -> 0x01cc }
            android.text.Spanned r6 = (android.text.Spanned) r6     // Catch:{ all -> 0x01cc }
            java.lang.String r6 = s21.C101498c.m133261a(r6)     // Catch:{ all -> 0x01cc }
            p21.m r10 = (p21.C100628m) r10     // Catch:{ all -> 0x01cc }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ all -> 0x01cc }
            r0 = 5
            if (r9 != 0) goto L_0x00cb
            java.lang.String r9 = "<br/>"
            boolean r9 = r8.endsWith(r9)     // Catch:{ all -> 0x01cc }
            if (r9 == 0) goto L_0x009d
            int r9 = r8.length()     // Catch:{ all -> 0x01cc }
            int r9 = r9 - r0
            java.lang.String r8 = r8.substring(r1, r9)     // Catch:{ all -> 0x01cc }
        L_0x009d:
            r10.f294819s = r8     // Catch:{ all -> 0x01cc }
            int r7 = r7 + 1
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ all -> 0x01cc }
            if (r8 != 0) goto L_0x00f0
            p21.m r8 = new p21.m     // Catch:{ all -> 0x01cc }
            r8.<init>()     // Catch:{ all -> 0x01cc }
            r8.f294811p = r2     // Catch:{ all -> 0x01cc }
            java.lang.String r9 = "<br/>"
            boolean r9 = r6.startsWith(r9)     // Catch:{ all -> 0x01cc }
            if (r9 == 0) goto L_0x00be
            int r9 = r6.length()     // Catch:{ all -> 0x01cc }
            java.lang.String r6 = r6.substring(r0, r9)     // Catch:{ all -> 0x01cc }
        L_0x00be:
            r8.f294819s = r6     // Catch:{ all -> 0x01cc }
            r8.f294797c = r1     // Catch:{ all -> 0x01cc }
            r8.f294796b = r1     // Catch:{ all -> 0x01cc }
            r8.f294801g = r1     // Catch:{ all -> 0x01cc }
            r4.mo141447c(r7, r8, r1)     // Catch:{ all -> 0x01cc }
            r6 = 1
            goto L_0x00f1
        L_0x00cb:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ all -> 0x01cc }
            if (r8 != 0) goto L_0x00e4
            java.lang.String r8 = "<br/>"
            boolean r8 = r6.startsWith(r8)     // Catch:{ all -> 0x01cc }
            if (r8 == 0) goto L_0x00e1
            int r8 = r6.length()     // Catch:{ all -> 0x01cc }
            java.lang.String r6 = r6.substring(r0, r8)     // Catch:{ all -> 0x01cc }
        L_0x00e1:
            r10.f294819s = r6     // Catch:{ all -> 0x01cc }
            goto L_0x00f0
        L_0x00e4:
            r4.mo141467x(r7, r1)     // Catch:{ all -> 0x01cc }
            if (r11 == 0) goto L_0x00f0
            t21.a r6 = r4.f300118b     // Catch:{ all -> 0x01cc }
            if (r6 == 0) goto L_0x00f0
            r6.mo94186d5(r7)     // Catch:{ all -> 0x01cc }
        L_0x00f0:
            r6 = 0
        L_0x00f1:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x01cc }
            r8 = r7
        L_0x00f6:
            boolean r9 = r5.hasNext()     // Catch:{ all -> 0x01cc }
            if (r9 == 0) goto L_0x010e
            java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x01cc }
            p21.a r9 = (p21.C100616a) r9     // Catch:{ all -> 0x01cc }
            r4.mo141464u(r9)     // Catch:{ all -> 0x01cc }
            boolean r9 = r4.mo141447c(r8, r9, r1)     // Catch:{ all -> 0x01cc }
            if (r9 == 0) goto L_0x00f6
            int r8 = r8 + 1
            goto L_0x00f6
        L_0x010e:
            r1 = r6
            goto L_0x0159
        L_0x0110:
            java.lang.String r5 = "MicroMsg.EditorDataManager"
            java.lang.String r7 = "pasteItemList error, oriText:%d  startOff:%d  endOff:%d"
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x01cc }
            if (r6 != 0) goto L_0x011c
            r6 = -1
            goto L_0x0120
        L_0x011c:
            int r6 = r6.length()     // Catch:{ all -> 0x01cc }
        L_0x0120:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01cc }
            r10[r1] = r6     // Catch:{ all -> 0x01cc }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x01cc }
            r10[r2] = r6     // Catch:{ all -> 0x01cc }
            r6 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01cc }
            r10[r6] = r8     // Catch:{ all -> 0x01cc }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r7, r10)     // Catch:{ all -> 0x01cc }
            monitor-exit(r4)     // Catch:{ all -> 0x01cc }
            return r0
        L_0x0138:
            if (r6 == r2) goto L_0x013c
            int r7 = r7 + 1
        L_0x013c:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x01cc }
            r8 = r7
        L_0x0141:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x01cc }
            if (r6 == 0) goto L_0x0159
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x01cc }
            p21.a r6 = (p21.C100616a) r6     // Catch:{ all -> 0x01cc }
            r4.mo141464u(r6)     // Catch:{ all -> 0x01cc }
            boolean r6 = r4.mo141447c(r8, r6, r1)     // Catch:{ all -> 0x01cc }
            if (r6 == 0) goto L_0x0141
            int r8 = r8 + 1
            goto L_0x0141
        L_0x0159:
            monitor-exit(r4)     // Catch:{ all -> 0x01cc }
            int r5 = r8 + -1
            if (r5 < 0) goto L_0x0169
            u21.c r6 = m134173q()
            int r6 = r6.mo141443B()
            if (r5 >= r6) goto L_0x0169
            goto L_0x0172
        L_0x0169:
            u21.c r5 = m134173q()
            int r5 = r5.mo141443B()
            int r5 = r5 - r2
        L_0x0172:
            t21.a r6 = r4.f300118b
            if (r6 == 0) goto L_0x01c8
            if (r11 == 0) goto L_0x01aa
            int r8 = r8 - r7
            if (r1 == 0) goto L_0x017d
            int r8 = r8 + 1
        L_0x017d:
            if (r7 < 0) goto L_0x0184
            if (r8 <= 0) goto L_0x0184
            r6.mo94193n4(r7, r8)
        L_0x0184:
            if (r7 <= 0) goto L_0x0198
            t21.a r6 = r4.f300118b
            int r7 = r7 - r2
            u21.c r8 = m134173q()
            int r8 = r8.mo141443B()
            int r8 = r8 - r7
            com.tencent.mm.plugin.component.editor.EditorUI r6 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r6
            r6.mo127485T7(r7, r8)
            goto L_0x01aa
        L_0x0198:
            if (r7 != 0) goto L_0x01aa
            t21.a r6 = r4.f300118b
            u21.c r8 = m134173q()
            int r8 = r8.mo141443B()
            int r8 = r8 - r7
            com.tencent.mm.plugin.component.editor.EditorUI r6 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r6
            r6.mo127485T7(r7, r8)
        L_0x01aa:
            t21.a r6 = r4.f300118b
            com.tencent.mm.plugin.component.editor.EditorUI r6 = (com.tencent.p014mm.plugin.component.editor.EditorUI) r6
            r6.getClass()
            if (r5 < 0) goto L_0x01c8
            u21.c r7 = m134173q()
            int r7 = r7.mo141443B()
            if (r5 < r7) goto L_0x01be
            goto L_0x01c8
        L_0x01be:
            com.tencent.mm.sdk.platformtools.MMHandler r7 = r6.f268052q
            com.tencent.mm.plugin.component.editor.f r8 = new com.tencent.mm.plugin.component.editor.f
            r8.<init>(r6, r5)
            r7.post(r8)
        L_0x01c8:
            r4.mo141465v()
            return r5
        L_0x01cc:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01cc }
            throw r5
        L_0x01cf:
            java.lang.String r5 = "MicroMsg.EditorDataManager"
            java.lang.String r6 = "pasteItemList,error,return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u21.C101941c.mo141463t(java.util.ArrayList, int, int, int, int, boolean, boolean):int");
    }

    /* renamed from: u */
    public final void mo141464u(C100616a aVar) {
        ArrayList<C100616a> arrayList;
        if (aVar != null) {
            C100620e eVar = (C100620e) aVar;
            if (eVar.mo140076b() > 1 && Util.isNullOrNil(eVar.f294807l)) {
                if (this.f300120d == 0 && (arrayList = this.f300117a) != null) {
                    Iterator<C100616a> it = arrayList.iterator();
                    while (it.hasNext()) {
                        C100620e eVar2 = (C100620e) it.next();
                        if (eVar2.f294807l.startsWith("WeNote_")) {
                            int i = Util.getInt(eVar2.f294807l.substring(7), -1);
                            int i2 = this.f300120d;
                            if (i <= i2) {
                                i = i2;
                            }
                            this.f300120d = i;
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("WeNote_");
                int i3 = this.f300120d + 1;
                this.f300120d = i3;
                sb.append(i3);
                eVar.f294807l = sb.toString();
            }
            if (Util.isNullOrNil(aVar.f294795a)) {
                aVar.f294795a = C100273b.m131073a(aVar.toString(), 18);
            }
        }
    }

    /* renamed from: v */
    public void mo141465v() {
        C86709a0.m107525e().postToWorker(new C101942a());
    }

    /* renamed from: w */
    public boolean mo141466w(int i, boolean z) {
        boolean z2;
        C101712a aVar;
        synchronized (this) {
            ArrayList<C100616a> arrayList = this.f300117a;
            z2 = false;
            if (arrayList != null && i >= 0 && i < arrayList.size()) {
                mo141444C(this.f300117a.get(i), false);
                this.f300117a.remove(i).mo140077c();
                z2 = true;
            }
        }
        if (z2 && z && (aVar = this.f300118b) != null) {
            aVar.mo94186d5(i);
            if (i > 0) {
                int i2 = i - 1;
                ((EditorUI) this.f300118b).mo127485T7(i2, this.f300117a.size() - i2);
            } else {
                ((EditorUI) this.f300118b).mo127485T7(i, this.f300117a.size() - i);
            }
        }
        return z2;
    }

    /* renamed from: x */
    public final boolean mo141467x(int i, boolean z) {
        C101712a aVar;
        ArrayList<C100616a> arrayList = this.f300117a;
        boolean z2 = false;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            mo141444C(this.f300117a.get(i), false);
            this.f300117a.remove(i).mo140077c();
            z2 = true;
        }
        if (z2 && z && (aVar = this.f300118b) != null) {
            aVar.mo94186d5(i);
            if (i > 0) {
                int i2 = i - 1;
                ((EditorUI) this.f300118b).mo127485T7(i2, this.f300117a.size() - i2);
            } else {
                ((EditorUI) this.f300118b).mo127485T7(i, this.f300117a.size() - i);
            }
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        return;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141468y(int r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<p21.a> r0 = r4.f300117a     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0049
            if (r5 < 0) goto L_0x0049
            int r0 = r0.size()     // Catch:{ all -> 0x004b }
            if (r5 < r0) goto L_0x000e
            goto L_0x0049
        L_0x000e:
            r0 = 0
            r1 = 0
        L_0x0010:
            java.util.ArrayList<p21.a> r2 = r4.f300117a     // Catch:{ all -> 0x004b }
            int r2 = r2.size()     // Catch:{ all -> 0x004b }
            if (r1 >= r2) goto L_0x0047
            if (r1 != r5) goto L_0x0030
            java.util.ArrayList<p21.a> r2 = r4.f300117a     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x004b }
            p21.a r2 = (p21.C100616a) r2     // Catch:{ all -> 0x004b }
            r3 = 1
            r2.f294796b = r3     // Catch:{ all -> 0x004b }
            java.util.ArrayList<p21.a> r2 = r4.f300117a     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x004b }
            p21.a r2 = (p21.C100616a) r2     // Catch:{ all -> 0x004b }
            r2.f294801g = r6     // Catch:{ all -> 0x004b }
            goto L_0x0044
        L_0x0030:
            java.util.ArrayList<p21.a> r2 = r4.f300117a     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x004b }
            p21.a r2 = (p21.C100616a) r2     // Catch:{ all -> 0x004b }
            r2.f294796b = r0     // Catch:{ all -> 0x004b }
            java.util.ArrayList<p21.a> r2 = r4.f300117a     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x004b }
            p21.a r2 = (p21.C100616a) r2     // Catch:{ all -> 0x004b }
            r2.f294801g = r0     // Catch:{ all -> 0x004b }
        L_0x0044:
            int r1 = r1 + 1
            goto L_0x0010
        L_0x0047:
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            return
        L_0x0049:
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            return
        L_0x004b:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u21.C101941c.mo141468y(int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0054, code lost:
        return;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141469z(int r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<p21.a> r0 = r4.f300117a     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            return
        L_0x0007:
            r1 = 0
            if (r5 < 0) goto L_0x002b
            int r0 = r0.size()     // Catch:{ all -> 0x0055 }
            if (r5 >= r0) goto L_0x002b
            java.util.ArrayList<p21.a> r0 = r4.f300117a     // Catch:{ all -> 0x0055 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0055 }
            p21.a r0 = (p21.C100616a) r0     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0053
            boolean r3 = r0.f294802h     // Catch:{ all -> 0x0055 }
            if (r3 == r6) goto L_0x0053
            r0.f294802h = r6     // Catch:{ all -> 0x0055 }
            if (r7 == 0) goto L_0x0053
            t21.a r6 = r4.f300118b     // Catch:{ all -> 0x0055 }
            if (r6 == 0) goto L_0x0053
            r6.mo94191h2(r5, r1)     // Catch:{ all -> 0x0055 }
            goto L_0x0053
        L_0x002b:
            r0 = -1
            if (r5 != r0) goto L_0x0053
            r5 = 0
        L_0x002f:
            java.util.ArrayList<p21.a> r0 = r4.f300117a     // Catch:{ all -> 0x0055 }
            int r0 = r0.size()     // Catch:{ all -> 0x0055 }
            if (r5 >= r0) goto L_0x0053
            java.util.ArrayList<p21.a> r0 = r4.f300117a     // Catch:{ all -> 0x0055 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0055 }
            p21.a r0 = (p21.C100616a) r0     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0050
            boolean r3 = r0.f294802h     // Catch:{ all -> 0x0055 }
            if (r3 == r6) goto L_0x0050
            r0.f294802h = r6     // Catch:{ all -> 0x0055 }
            if (r7 == 0) goto L_0x0050
            t21.a r0 = r4.f300118b     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0050
            r0.mo94191h2(r5, r1)     // Catch:{ all -> 0x0055 }
        L_0x0050:
            int r5 = r5 + 1
            goto L_0x002f
        L_0x0053:
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            return
        L_0x0055:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u21.C101941c.mo141469z(int, boolean, boolean):void");
    }
}
