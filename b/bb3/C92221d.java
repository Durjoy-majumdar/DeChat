package bb3;

import ab3.C91983a;
import cb3.C92393d;
import cb3.C92400k;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96734k;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import fy3.C32224a;
import gb3.C98095b;
import gb3.C98096c;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx3.C13598b0;
import te3.C101834rc0;
import wa3.C102364c;
import wa3.C102365e;
import wa3.C102368h;
import wa3.C102372l;
import xa3.C102587c;
import xa3.C102593i;
import xa3.C102599o;

/* renamed from: bb3.d */
public class C92221d {

    /* renamed from: a */
    public ArrayList<C102587c> f263945a = null;

    /* renamed from: b */
    public C91983a f263946b = null;

    /* renamed from: c */
    public C101834rc0 f263947c = null;

    /* renamed from: d */
    public int f263948d = 0;

    /* renamed from: e */
    public int f263949e = 0;

    /* renamed from: f */
    public int f263950f = 0;

    /* renamed from: g */
    public long f263951g;

    /* renamed from: h */
    public long f263952h;

    /* renamed from: i */
    public boolean f263953i = false;

    /* renamed from: j */
    public boolean f263954j = false;

    /* renamed from: bb3.d$a */
    public class C92222a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f263955d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f263956e;

        public C92222a(String str, ArrayList arrayList) {
            this.f263955d = str;
            this.f263956e = arrayList;
        }

        public void run() {
            C102372l.C102373a a = C102372l.m135093a(C92221d.this.f263945a, this.f263955d, this.f263956e, false);
            Log.m105924i("MicroMsg.Note.NoteDataManager", "updateDataByHtml, start mNotifyListener.setUpNoteData(dataItems, true)");
            C91983a aVar = C92221d.this.f263946b;
            if (aVar != null) {
                ((NoteEditorUI) aVar).mo134939g8(a, true);
            }
        }
    }

    /* renamed from: bb3.d$b */
    public class C92223b implements Runnable {
        public C92223b() {
        }

        public void run() {
            synchronized (C92221d.this) {
                if (C92221d.this.f263945a != null) {
                    int i = 0;
                    StringBuilder sb = new StringBuilder();
                    Iterator<C102587c> it = C92221d.this.f263945a.iterator();
                    while (it.hasNext()) {
                        C102587c next = it.next();
                        if (next.mo142212c() != 1) {
                            i++;
                        } else {
                            sb.append(((C102593i) next).f302126s);
                        }
                    }
                    C92221d.this.f263949e = C98096c.m126709d(sb.toString());
                    C92221d.this.f263950f = i;
                }
            }
        }
    }

    /* renamed from: bb3.d$c */
    public class C92224c implements C32224a<C13598b0> {
        public C92224c() {
        }

        public Object invoke() {
            C91983a aVar = C92221d.this.f263946b;
            if (aVar == null) {
                return null;
            }
            ((NoteEditorUI) aVar).mo134930Y7();
            NoteEditorUI noteEditorUI = (NoteEditorUI) C92221d.this.f263946b;
            noteEditorUI.f283212E.post(new C96734k(noteEditorUI));
            return null;
        }
    }

    /* renamed from: A */
    public final boolean mo126181A(int i, boolean z) {
        C91983a aVar;
        ArrayList<C102587c> arrayList = this.f263945a;
        boolean z2 = false;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            mo126190J(this.f263945a.get(i), false);
            this.f263945a.remove(i);
            z2 = true;
        }
        if (z2 && z && (aVar = this.f263946b) != null) {
            ((NoteEditorUI) aVar).mo134935d5(i);
            if (i > 0) {
                int i2 = i - 1;
                ((NoteEditorUI) this.f263946b).mo134931Z7(i2, this.f263945a.size() - i2);
            } else {
                ((NoteEditorUI) this.f263946b).mo134931Z7(i, this.f263945a.size() - i);
            }
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r1 == -1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r7 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r5 = r4.f263946b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        ((com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r5).mo134940h2(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo126182B(java.lang.String r5, xa3.C102587c r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<xa3.c> r0 = r4.f263945a     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            return
        L_0x0007:
            r0 = 0
            r1 = 0
        L_0x0009:
            java.util.ArrayList<xa3.c> r2 = r4.f263945a     // Catch:{ all -> 0x004e }
            int r2 = r2.size()     // Catch:{ all -> 0x004e }
            r3 = -1
            if (r1 >= r2) goto L_0x003c
            java.util.ArrayList<xa3.c> r2 = r4.f263945a     // Catch:{ all -> 0x004e }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x004e }
            xa3.c r2 = (xa3.C102587c) r2     // Catch:{ all -> 0x004e }
            java.lang.String r2 = r2.mo142211b()     // Catch:{ all -> 0x004e }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x004e }
            if (r2 == 0) goto L_0x0039
            java.util.ArrayList<xa3.c> r5 = r4.f263945a     // Catch:{ all -> 0x004e }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ all -> 0x004e }
            xa3.c r5 = (xa3.C102587c) r5     // Catch:{ all -> 0x004e }
            r4.mo126190J(r5, r0)     // Catch:{ all -> 0x004e }
            java.util.ArrayList<xa3.c> r5 = r4.f263945a     // Catch:{ all -> 0x004e }
            r5.set(r1, r6)     // Catch:{ all -> 0x004e }
            r5 = 1
            r4.mo126190J(r6, r5)     // Catch:{ all -> 0x004e }
            goto L_0x003d
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x0009
        L_0x003c:
            r1 = -1
        L_0x003d:
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            if (r1 == r3) goto L_0x004d
            if (r7 == 0) goto L_0x004d
            ab3.a r5 = r4.f263946b
            if (r5 == 0) goto L_0x004d
            r6 = 0
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r5 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r5
            r5.mo134940h2(r1, r6)
        L_0x004d:
            return
        L_0x004e:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x004e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bb3.C92221d.mo126182B(java.lang.String, xa3.c, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        return;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo126183C(int r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<xa3.c> r0 = r4.f263945a     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0049
            if (r5 < 0) goto L_0x0049
            int r0 = r0.size()     // Catch:{ all -> 0x004b }
            if (r5 < r0) goto L_0x000e
            goto L_0x0049
        L_0x000e:
            r0 = 0
            r1 = 0
        L_0x0010:
            java.util.ArrayList<xa3.c> r2 = r4.f263945a     // Catch:{ all -> 0x004b }
            int r2 = r2.size()     // Catch:{ all -> 0x004b }
            if (r1 >= r2) goto L_0x0047
            if (r1 != r5) goto L_0x0030
            java.util.ArrayList<xa3.c> r2 = r4.f263945a     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x004b }
            xa3.c r2 = (xa3.C102587c) r2     // Catch:{ all -> 0x004b }
            r3 = 1
            r2.f302071b = r3     // Catch:{ all -> 0x004b }
            java.util.ArrayList<xa3.c> r2 = r4.f263945a     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x004b }
            xa3.c r2 = (xa3.C102587c) r2     // Catch:{ all -> 0x004b }
            r2.f302077h = r6     // Catch:{ all -> 0x004b }
            goto L_0x0044
        L_0x0030:
            java.util.ArrayList<xa3.c> r2 = r4.f263945a     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x004b }
            xa3.c r2 = (xa3.C102587c) r2     // Catch:{ all -> 0x004b }
            r2.f302071b = r0     // Catch:{ all -> 0x004b }
            java.util.ArrayList<xa3.c> r2 = r4.f263945a     // Catch:{ all -> 0x004b }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x004b }
            xa3.c r2 = (xa3.C102587c) r2     // Catch:{ all -> 0x004b }
            r2.f302077h = r0     // Catch:{ all -> 0x004b }
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
        throw new UnsupportedOperationException("Method not decompiled: bb3.C92221d.mo126183C(int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0058, code lost:
        return;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo126184D(int r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<xa3.c> r0 = r4.f263945a     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            return
        L_0x0007:
            r1 = 0
            if (r5 < 0) goto L_0x002d
            int r0 = r0.size()     // Catch:{ all -> 0x0059 }
            if (r5 >= r0) goto L_0x002d
            java.util.ArrayList<xa3.c> r0 = r4.f263945a     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0059 }
            xa3.c r0 = (xa3.C102587c) r0     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0057
            boolean r3 = r0.f302078i     // Catch:{ all -> 0x0059 }
            if (r3 == r6) goto L_0x0057
            r0.f302078i = r6     // Catch:{ all -> 0x0059 }
            if (r7 == 0) goto L_0x0057
            ab3.a r6 = r4.f263946b     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0057
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r6 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r6     // Catch:{ all -> 0x0059 }
            r6.mo134940h2(r5, r1)     // Catch:{ all -> 0x0059 }
            goto L_0x0057
        L_0x002d:
            r0 = -1
            if (r5 != r0) goto L_0x0057
            r5 = 0
        L_0x0031:
            java.util.ArrayList<xa3.c> r0 = r4.f263945a     // Catch:{ all -> 0x0059 }
            int r0 = r0.size()     // Catch:{ all -> 0x0059 }
            if (r5 >= r0) goto L_0x0057
            java.util.ArrayList<xa3.c> r0 = r4.f263945a     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0059 }
            xa3.c r0 = (xa3.C102587c) r0     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0054
            boolean r3 = r0.f302078i     // Catch:{ all -> 0x0059 }
            if (r3 == r6) goto L_0x0054
            r0.f302078i = r6     // Catch:{ all -> 0x0059 }
            if (r7 == 0) goto L_0x0054
            ab3.a r0 = r4.f263946b     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0054
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r0 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r0     // Catch:{ all -> 0x0059 }
            r0.mo134940h2(r5, r1)     // Catch:{ all -> 0x0059 }
        L_0x0054:
            int r5 = r5 + 1
            goto L_0x0031
        L_0x0057:
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            return
        L_0x0059:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0059 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bb3.C92221d.mo126184D(int, boolean, boolean):void");
    }

    /* renamed from: E */
    public final String mo126185E(String str, int i) {
        return String.format("<div><object data-type=\"%d\" id=\"%s\" name=\"%s\" class=\"item item-\"></object></div>", new Object[]{Integer.valueOf(i), str, str});
    }

    /* renamed from: F */
    public int mo126186F() {
        ArrayList<C102587c> arrayList = this.f263945a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r6.f302082m == false) goto L_0x004f;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo126187G() {
        /*
            r10 = this;
            java.util.ArrayList<xa3.c> r0 = r10.f263945a
            java.lang.String r1 = "oriDataList"
            gy3.C87412m.m108594g(r0, r1)
            boolean r1 = r0.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0066
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.Iterator r3 = r0.iterator()
            r4 = 0
        L_0x001a:
            r5 = r4
        L_0x001b:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0060
            java.lang.Object r6 = r3.next()
            xa3.c r6 = (xa3.C102587c) r6
            int r7 = r6.mo142212c()
            r8 = 2
            r9 = 0
            if (r7 == r8) goto L_0x0037
            r8 = 6
            if (r7 == r8) goto L_0x0037
            r8 = 7
            if (r7 == r8) goto L_0x0037
            r7 = 0
            goto L_0x0038
        L_0x0037:
            r7 = 1
        L_0x0038:
            if (r7 == 0) goto L_0x005c
            if (r5 == 0) goto L_0x004a
            int r7 = r5.mo142218h()
            r8 = 3
            if (r7 < r8) goto L_0x0044
            r9 = 1
        L_0x0044:
            if (r9 != 0) goto L_0x004a
            boolean r7 = r6.f302082m
            if (r7 == 0) goto L_0x004f
        L_0x004a:
            xa3.p r5 = new xa3.p
            r5.<init>()
        L_0x004f:
            r5.mo142216f(r6)
            boolean r6 = r1.contains(r5)
            if (r6 != 0) goto L_0x001b
            r1.add(r5)
            goto L_0x001b
        L_0x005c:
            r1.add(r6)
            goto L_0x001a
        L_0x0060:
            r0.clear()
            r0.addAll(r1)
        L_0x0066:
            r10.f263954j = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bb3.C92221d.mo126187G():void");
    }

    /* renamed from: H */
    public void mo126188H() {
        if (this.f263954j) {
            C92225e eVar = C92225e.f263960a;
            ArrayList<C102587c> arrayList = this.f263945a;
            C87412m.m108594g(arrayList, "oriDataList");
            if (!arrayList.isEmpty()) {
                List<C102587c> c = eVar.mo126221c(arrayList);
                arrayList.clear();
                arrayList.addAll(c);
            }
            this.f263954j = false;
        } else {
            mo126187G();
        }
        ((NoteEditorUI) this.f263946b).mo134930Y7();
        C92400k.m116191h().mo126377c();
    }

    /* renamed from: I */
    public void mo126189I(String str) {
        ArrayList<String> b;
        if (!Util.isNullOrNil(str) && this.f263945a != null && (b = C98095b.m126705b(str)) != null && b.size() > 0) {
            synchronized (this) {
                try {
                    Log.m105925i("MicroMsg.Note.NoteDataManager", "updateDataByHtml, mHasInitDataListFinish :％B", Boolean.valueOf(this.f263953i));
                    C86709a0.m107525e().postToWorkerDelayed(new C92222a(str, b), this.f263953i ? 500 : 1000);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.Note.NoteDataManager", "updateDataByHtml exception,%s", e.toString());
                }
            }
        }
    }

    /* renamed from: J */
    public final void mo126190J(C102587c cVar, boolean z) {
        if (cVar != null) {
            if (cVar.mo142212c() == 1) {
                int d = C98096c.m126709d(((C102593i) cVar).f302126s);
                if (z) {
                    this.f263949e += d;
                } else {
                    this.f263949e -= d;
                }
            } else if (z) {
                this.f263950f++;
            } else {
                this.f263950f--;
            }
        }
    }

    /* renamed from: a */
    public boolean mo126191a(int i, C102587c cVar, boolean z) {
        boolean z2;
        C91983a aVar;
        synchronized (this) {
            if (cVar != null) {
                ArrayList<C102587c> arrayList = this.f263945a;
                if (arrayList != null && i >= 0 && i <= arrayList.size()) {
                    this.f263945a.add(i, cVar);
                    mo126190J(cVar, true);
                    z2 = true;
                }
            }
            z2 = false;
        }
        if (z2 && z && (aVar = this.f263946b) != null) {
            ((NoteEditorUI) aVar).mo134943r3(i);
            if (i > 0) {
                int i2 = i - 1;
                ((NoteEditorUI) this.f263946b).mo134931Z7(i2, this.f263945a.size() - i2);
            } else {
                ((NoteEditorUI) this.f263946b).mo134931Z7(i, this.f263945a.size() - i);
            }
        }
        return z2;
    }

    /* renamed from: b */
    public boolean mo126192b(C102587c cVar, boolean z) {
        boolean z2;
        C91983a aVar;
        synchronized (this) {
            if (cVar != null) {
                ArrayList<C102587c> arrayList = this.f263945a;
                if (arrayList != null) {
                    arrayList.add(cVar);
                    mo126190J(cVar, true);
                    z2 = true;
                }
            }
            z2 = false;
        }
        if (z2 && z && (aVar = this.f263946b) != null) {
            ((NoteEditorUI) aVar).mo134943r3(this.f263945a.size() - 1);
        }
        return z2;
    }

    /* renamed from: c */
    public final boolean mo126193c(int i, C102587c cVar, boolean z) {
        boolean z2;
        C91983a aVar;
        ArrayList<C102587c> arrayList;
        if (cVar == null || (arrayList = this.f263945a) == null || i < 0 || i > arrayList.size()) {
            z2 = false;
        } else {
            this.f263945a.add(i, cVar);
            mo126190J(cVar, true);
            z2 = true;
        }
        if (z2 && z && (aVar = this.f263946b) != null) {
            ((NoteEditorUI) aVar).mo134943r3(i);
            if (i > 0) {
                int i2 = i - 1;
                ((NoteEditorUI) this.f263946b).mo134931Z7(i2, this.f263945a.size() - i2);
            } else {
                ((NoteEditorUI) this.f263946b).mo134931Z7(i, this.f263945a.size() - i);
            }
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00eb, code lost:
        if (r1 == -1) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ed, code lost:
        if (r13 == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ef, code lost:
        r11 = r10.f263946b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f1, code lost:
        if (r11 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f3, code lost:
        ((com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r11).mo134931Z7(r1, r10.f263945a.size() - r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ff, code lost:
        mo126214x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0102, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo126194d(int r11, int r12, boolean r13) {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.Note.NoteDataManager"
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
            java.util.ArrayList<xa3.c> r0 = r10.f263945a     // Catch:{ all -> 0x0103 }
            if (r0 != 0) goto L_0x0026
            monitor-exit(r10)     // Catch:{ all -> 0x0103 }
            return
        L_0x0026:
            if (r11 > 0) goto L_0x0029
            r11 = 0
        L_0x0029:
            int r0 = r0.size()     // Catch:{ all -> 0x0103 }
            if (r12 < r0) goto L_0x0036
            java.util.ArrayList<xa3.c> r12 = r10.f263945a     // Catch:{ all -> 0x0103 }
            int r12 = r12.size()     // Catch:{ all -> 0x0103 }
            int r12 = r12 - r5
        L_0x0036:
            r0 = -1
            r1 = -1
        L_0x0038:
            if (r12 <= r11) goto L_0x00ea
            java.util.ArrayList<xa3.c> r2 = r10.f263945a     // Catch:{ all -> 0x0103 }
            java.lang.Object r2 = r2.get(r12)     // Catch:{ all -> 0x0103 }
            xa3.c r2 = (xa3.C102587c) r2     // Catch:{ all -> 0x0103 }
            java.util.ArrayList<xa3.c> r3 = r10.f263945a     // Catch:{ all -> 0x0103 }
            int r6 = r12 + -1
            java.lang.Object r3 = r3.get(r6)     // Catch:{ all -> 0x0103 }
            xa3.c r3 = (xa3.C102587c) r3     // Catch:{ all -> 0x0103 }
            if (r2 == 0) goto L_0x00e6
            int r7 = r2.mo142212c()     // Catch:{ all -> 0x0103 }
            if (r7 != r5) goto L_0x00e6
            if (r3 == 0) goto L_0x00e6
            int r7 = r3.mo142212c()     // Catch:{ all -> 0x0103 }
            if (r7 != r5) goto L_0x00e6
            xa3.i r2 = (xa3.C102593i) r2     // Catch:{ all -> 0x0103 }
            xa3.i r3 = (xa3.C102593i) r3     // Catch:{ all -> 0x0103 }
            java.lang.String r1 = r2.f302126s     // Catch:{ all -> 0x0103 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ all -> 0x0103 }
            if (r1 != 0) goto L_0x00be
            java.lang.String r1 = r2.f302126s     // Catch:{ all -> 0x0103 }
            android.text.Spanned r1 = za3.C102988a.m136184a(r1)     // Catch:{ all -> 0x0103 }
            java.lang.String r7 = r3.f302126s     // Catch:{ all -> 0x0103 }
            android.text.Spanned r7 = za3.C102988a.m136184a(r7)     // Catch:{ all -> 0x0103 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0103 }
            r8.<init>()     // Catch:{ all -> 0x0103 }
            java.lang.String r9 = r3.f302126s     // Catch:{ all -> 0x0103 }
            r8.append(r9)     // Catch:{ all -> 0x0103 }
            java.lang.String r9 = "<br/>"
            r8.append(r9)     // Catch:{ all -> 0x0103 }
            java.lang.String r9 = r2.f302126s     // Catch:{ all -> 0x0103 }
            r8.append(r9)     // Catch:{ all -> 0x0103 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0103 }
            r3.f302126s = r8     // Catch:{ all -> 0x0103 }
            boolean r8 = r2.f302071b     // Catch:{ all -> 0x0103 }
            if (r8 == 0) goto L_0x00af
            r3.f302071b = r5     // Catch:{ all -> 0x0103 }
            r3.f302077h = r4     // Catch:{ all -> 0x0103 }
            int r8 = r2.f302072c     // Catch:{ all -> 0x0103 }
            if (r8 == r0) goto L_0x00ac
            int r1 = r1.length()     // Catch:{ all -> 0x0103 }
            if (r8 < r1) goto L_0x00a1
            goto L_0x00ac
        L_0x00a1:
            int r1 = r7.length()     // Catch:{ all -> 0x0103 }
            int r1 = r1 + r5
            int r2 = r2.f302072c     // Catch:{ all -> 0x0103 }
            int r1 = r1 + r2
            r3.f302072c = r1     // Catch:{ all -> 0x0103 }
            goto L_0x00c8
        L_0x00ac:
            r3.f302072c = r0     // Catch:{ all -> 0x0103 }
            goto L_0x00c8
        L_0x00af:
            boolean r1 = r3.f302071b     // Catch:{ all -> 0x0103 }
            if (r1 == 0) goto L_0x00c8
            int r1 = r3.f302072c     // Catch:{ all -> 0x0103 }
            if (r1 != r0) goto L_0x00c8
            int r1 = r7.length()     // Catch:{ all -> 0x0103 }
            r3.f302072c = r1     // Catch:{ all -> 0x0103 }
            goto L_0x00c8
        L_0x00be:
            boolean r1 = r2.f302071b     // Catch:{ all -> 0x0103 }
            if (r1 == 0) goto L_0x00c8
            r3.f302071b = r5     // Catch:{ all -> 0x0103 }
            r3.f302077h = r4     // Catch:{ all -> 0x0103 }
            r3.f302072c = r0     // Catch:{ all -> 0x0103 }
        L_0x00c8:
            java.lang.String r1 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r2 = "checkMergeTextDataItem remove position: %d"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0103 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0103 }
            r3[r4] = r7     // Catch:{ all -> 0x0103 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)     // Catch:{ all -> 0x0103 }
            r10.mo126181A(r12, r4)     // Catch:{ all -> 0x0103 }
            if (r13 == 0) goto L_0x00e5
            ab3.a r1 = r10.f263946b     // Catch:{ all -> 0x0103 }
            if (r1 == 0) goto L_0x00e5
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r1 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r1     // Catch:{ all -> 0x0103 }
            r1.mo134935d5(r12)     // Catch:{ all -> 0x0103 }
        L_0x00e5:
            r1 = r6
        L_0x00e6:
            int r12 = r12 + -1
            goto L_0x0038
        L_0x00ea:
            monitor-exit(r10)     // Catch:{ all -> 0x0103 }
            if (r1 == r0) goto L_0x00ff
            if (r13 == 0) goto L_0x00ff
            ab3.a r11 = r10.f263946b
            if (r11 == 0) goto L_0x00ff
            java.util.ArrayList<xa3.c> r12 = r10.f263945a
            int r12 = r12.size()
            int r12 = r12 - r1
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r11 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r11
            r11.mo134931Z7(r1, r12)
        L_0x00ff:
            r10.mo126214x()
            return
        L_0x0103:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0103 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: bb3.C92221d.mo126194d(int, int, boolean):void");
    }

    /* renamed from: e */
    public boolean mo126195e(int i, int i2) {
        boolean z = i >= 0;
        boolean z2 = i2 >= 0;
        if (!z || this.f263949e + i <= 16384) {
            return z2 && this.f263950f + i2 > 30;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo126196f(ArrayList<C102587c> arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator<C102587c> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C102587c next = it.next();
            if (next.mo142212c() != 1) {
                i++;
            } else {
                sb.append(((C102593i) next).f302126s);
            }
        }
        return mo126195e(C98096c.m126709d(sb.toString()), i);
    }

    /* renamed from: g */
    public void mo126197g(boolean z) {
        C91983a aVar;
        boolean z2 = true;
        Object[] objArr = new Object[1];
        ArrayList<C102587c> arrayList = this.f263945a;
        objArr[0] = Integer.valueOf(arrayList != null ? arrayList.size() : 0);
        Log.m105925i("MicroMsg.Note.NoteDataManager", "clear mDataList, size:%d", objArr);
        synchronized (this) {
            ArrayList<C102587c> arrayList2 = this.f263945a;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                z2 = false;
            }
        }
        this.f263950f = 0;
        this.f263949e = 0;
        if (z2 && z && (aVar = this.f263946b) != null) {
            ((NoteEditorUI) aVar).mo134930Y7();
        }
    }

    /* renamed from: h */
    public void mo126198h() {
        synchronized (this) {
            ArrayList<C102587c> arrayList = this.f263945a;
            if (arrayList != null) {
                Iterator<C102587c> it = arrayList.iterator();
                while (it.hasNext()) {
                    C102587c next = it.next();
                    next.f302071b = false;
                    next.f302077h = false;
                }
            }
        }
    }

    /* renamed from: i */
    public void mo126199i() {
        ArrayList<C102587c> arrayList = this.f263945a;
        if (arrayList != null) {
            Iterator<C102587c> it = arrayList.iterator();
            while (it.hasNext()) {
                C102587c next = it.next();
                next.f302071b = false;
                next.f302077h = false;
            }
        }
    }

    /* renamed from: j */
    public String mo126200j() {
        String sb;
        ArrayList<C102587c> arrayList;
        synchronized (this) {
            if (this.f263948d == 0 && (arrayList = this.f263945a) != null) {
                Iterator<C102587c> it = arrayList.iterator();
                while (it.hasNext()) {
                    String e = ((C102599o) it.next()).mo142215e();
                    if (e.startsWith("WeNote_")) {
                        int i = Util.getInt(e.substring(7), -1);
                        int i2 = this.f263948d;
                        if (i <= i2) {
                            i = i2;
                        }
                        this.f263948d = i;
                    }
                }
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("WeNote_");
            int i3 = this.f263948d + 1;
            this.f263948d = i3;
            sb4.append(i3);
            sb = sb4.toString();
        }
        return sb;
    }

    /* renamed from: k */
    public C102587c mo126201k(int i) {
        ArrayList<C102587c> arrayList = this.f263945a;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return this.f263945a.get(i);
    }

    /* renamed from: l */
    public ArrayList<C102587c> mo126202l() {
        if (this.f263945a == null) {
            return null;
        }
        ArrayList<C102587c> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<C102587c> it = this.f263945a.iterator();
            while (it.hasNext()) {
                arrayList.add(C98096c.m126706a(it.next(), (C92393d) null));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r8v24 */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x041e, code lost:
        r4 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x051b, code lost:
        r2.mo141228A(r4.f302098o);
        r7.add(r2);
        r5 = 2;
        r8 = 4;
        r9 = 6;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public te3.C101801kd0 mo126203m(java.lang.String r24) {
        /*
            r23 = this;
            r1 = r23
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r24)
            r2 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r3 = "getFavProtoItem error ,htmlstr is null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
            return r2
        L_0x0011:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            monitor-enter(r23)
            bb3.e r0 = bb3.C92225e.f263960a     // Catch:{ all -> 0x06f9 }
            java.util.ArrayList<xa3.c> r4 = r1.f263945a     // Catch:{ all -> 0x06f9 }
            java.util.List r0 = r0.mo126221c(r4)     // Catch:{ all -> 0x06f9 }
            r4 = 0
            r5 = 0
        L_0x0021:
            r6 = r0
            java.util.LinkedList r6 = (java.util.LinkedList) r6     // Catch:{ all -> 0x06f9 }
            int r7 = r6.size()     // Catch:{ all -> 0x06f9 }
            r8 = 4
            r9 = 6
            r10 = 18
            r11 = 1
            if (r5 >= r7) goto L_0x01f5
            java.lang.Object r7 = r6.get(r5)     // Catch:{ all -> 0x06f9 }
            xa3.c r7 = (xa3.C102587c) r7     // Catch:{ all -> 0x06f9 }
            java.lang.String r12 = r7.f302070a     // Catch:{ all -> 0x06f9 }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ all -> 0x06f9 }
            if (r12 == 0) goto L_0x0047
            java.lang.String r12 = r7.toString()     // Catch:{ all -> 0x06f9 }
            java.lang.String r10 = wa3.C102368h.m135071b(r12, r10)     // Catch:{ all -> 0x06f9 }
            r7.f302070a = r10     // Catch:{ all -> 0x06f9 }
        L_0x0047:
            int r10 = r7.mo142212c()     // Catch:{ all -> 0x06f9 }
            r12 = -1
            if (r10 != r12) goto L_0x009f
            int r6 = r3.size()     // Catch:{ all -> 0x06f9 }
            if (r6 <= 0) goto L_0x0085
            int r6 = r3.size()     // Catch:{ all -> 0x06f9 }
            int r6 = r6 - r11
            java.lang.Object r6 = r3.get(r6)     // Catch:{ all -> 0x06f9 }
            xa3.o r6 = (xa3.C102599o) r6     // Catch:{ all -> 0x06f9 }
            int r6 = r6.f302099p     // Catch:{ all -> 0x06f9 }
            if (r6 != r11) goto L_0x0085
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x06f9 }
            r6.<init>()     // Catch:{ all -> 0x06f9 }
            int r7 = r3.size()     // Catch:{ all -> 0x06f9 }
            int r7 = r7 - r11
            java.lang.Object r7 = r3.get(r7)     // Catch:{ all -> 0x06f9 }
            xa3.i r7 = (xa3.C102593i) r7     // Catch:{ all -> 0x06f9 }
            java.lang.String r8 = r7.f302126s     // Catch:{ all -> 0x06f9 }
            r6.append(r8)     // Catch:{ all -> 0x06f9 }
            java.lang.String r8 = "\n"
            r6.append(r8)     // Catch:{ all -> 0x06f9 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x06f9 }
            r7.f302126s = r6     // Catch:{ all -> 0x06f9 }
            goto L_0x01f1
        L_0x0085:
            xa3.i r6 = new xa3.i     // Catch:{ all -> 0x06f9 }
            r6.<init>()     // Catch:{ all -> 0x06f9 }
            java.lang.String r8 = "\n"
            r6.f302126s = r8     // Catch:{ all -> 0x06f9 }
            java.lang.String r7 = r7.f302070a     // Catch:{ all -> 0x06f9 }
            r6.f302070a = r7     // Catch:{ all -> 0x06f9 }
            java.lang.String r7 = "-1"
            r6.f302098o = r7     // Catch:{ all -> 0x06f9 }
            r6.f302099p = r11     // Catch:{ all -> 0x06f9 }
            r6.f302097n = r2     // Catch:{ all -> 0x06f9 }
            r3.add(r6)     // Catch:{ all -> 0x06f9 }
            goto L_0x01f1
        L_0x009f:
            int r10 = r7.mo142212c()     // Catch:{ all -> 0x06f9 }
            if (r10 >= r12) goto L_0x00a7
            goto L_0x01f1
        L_0x00a7:
            int r10 = r7.mo142212c()     // Catch:{ all -> 0x06f9 }
            if (r10 == r9) goto L_0x00b3
            int r9 = r7.mo142212c()     // Catch:{ all -> 0x06f9 }
            if (r9 != r8) goto L_0x00f1
        L_0x00b3:
            r8 = r7
            xa3.o r8 = (xa3.C102599o) r8     // Catch:{ all -> 0x06f9 }
            java.lang.String r8 = r8.f302101r     // Catch:{ all -> 0x06f9 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ all -> 0x06f9 }
            if (r8 == 0) goto L_0x00f1
            te3.rc0 r8 = new te3.rc0     // Catch:{ all -> 0x06f9 }
            r8.<init>()     // Catch:{ all -> 0x06f9 }
            java.lang.String r9 = r7.f302070a     // Catch:{ all -> 0x06f9 }
            r8.mo141257m(r9)     // Catch:{ all -> 0x06f9 }
            java.lang.String r9 = r7.mo142213a()     // Catch:{ all -> 0x06f9 }
            r8.mo141261q(r9)     // Catch:{ all -> 0x06f9 }
            java.lang.String r8 = wa3.C102368h.m135072c(r8)     // Catch:{ all -> 0x06f9 }
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)     // Catch:{ all -> 0x06f9 }
            if (r9 == 0) goto L_0x00f1
            java.lang.String r9 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r10 = "getFavProtoItem,type = %d, localfile exsit,but localpath is null or nil, set path here"
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ all -> 0x06f9 }
            int r13 = r7.mo142212c()     // Catch:{ all -> 0x06f9 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x06f9 }
            r12[r4] = r13     // Catch:{ all -> 0x06f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r10, r12)     // Catch:{ all -> 0x06f9 }
            r9 = r7
            xa3.o r9 = (xa3.C102599o) r9     // Catch:{ all -> 0x06f9 }
            r9.f302101r = r8     // Catch:{ all -> 0x06f9 }
        L_0x00f1:
            int r8 = r7.mo142212c()     // Catch:{ all -> 0x06f9 }
            if (r8 == r11) goto L_0x00fe
            xa3.o r7 = (xa3.C102599o) r7     // Catch:{ all -> 0x06f9 }
            r3.add(r7)     // Catch:{ all -> 0x06f9 }
            goto L_0x01f1
        L_0x00fe:
            xa3.i r7 = (xa3.C102593i) r7     // Catch:{ all -> 0x06f9 }
            java.lang.String r8 = r7.f302126s     // Catch:{ all -> 0x06f9 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ all -> 0x06f9 }
            if (r8 == 0) goto L_0x015d
            int r6 = r3.size()     // Catch:{ all -> 0x06f9 }
            if (r6 <= 0) goto L_0x0141
            int r6 = r3.size()     // Catch:{ all -> 0x06f9 }
            int r6 = r6 - r11
            java.lang.Object r6 = r3.get(r6)     // Catch:{ all -> 0x06f9 }
            xa3.o r6 = (xa3.C102599o) r6     // Catch:{ all -> 0x06f9 }
            int r6 = r6.mo142212c()     // Catch:{ all -> 0x06f9 }
            if (r6 != r11) goto L_0x0141
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x06f9 }
            r6.<init>()     // Catch:{ all -> 0x06f9 }
            int r7 = r3.size()     // Catch:{ all -> 0x06f9 }
            int r7 = r7 - r11
            java.lang.Object r7 = r3.get(r7)     // Catch:{ all -> 0x06f9 }
            xa3.i r7 = (xa3.C102593i) r7     // Catch:{ all -> 0x06f9 }
            java.lang.String r8 = r7.f302126s     // Catch:{ all -> 0x06f9 }
            r6.append(r8)     // Catch:{ all -> 0x06f9 }
            java.lang.String r8 = "<br/>"
            r6.append(r8)     // Catch:{ all -> 0x06f9 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x06f9 }
            r7.f302126s = r6     // Catch:{ all -> 0x06f9 }
            goto L_0x01f1
        L_0x0141:
            xa3.i r6 = new xa3.i     // Catch:{ all -> 0x06f9 }
            r6.<init>()     // Catch:{ all -> 0x06f9 }
            java.lang.String r8 = "<br/>"
            r6.f302126s = r8     // Catch:{ all -> 0x06f9 }
            java.lang.String r8 = r7.f302070a     // Catch:{ all -> 0x06f9 }
            r6.f302070a = r8     // Catch:{ all -> 0x06f9 }
            java.lang.String r8 = r7.f302098o     // Catch:{ all -> 0x06f9 }
            r6.f302098o = r8     // Catch:{ all -> 0x06f9 }
            int r7 = r7.f302099p     // Catch:{ all -> 0x06f9 }
            r6.f302099p = r7     // Catch:{ all -> 0x06f9 }
            r6.f302097n = r2     // Catch:{ all -> 0x06f9 }
            r3.add(r6)     // Catch:{ all -> 0x06f9 }
            goto L_0x01f1
        L_0x015d:
            int r8 = r3.size()     // Catch:{ all -> 0x06f9 }
            if (r8 <= 0) goto L_0x0195
            int r8 = r3.size()     // Catch:{ all -> 0x06f9 }
            int r8 = r8 - r11
            java.lang.Object r8 = r3.get(r8)     // Catch:{ all -> 0x06f9 }
            xa3.o r8 = (xa3.C102599o) r8     // Catch:{ all -> 0x06f9 }
            int r8 = r8.mo142212c()     // Catch:{ all -> 0x06f9 }
            if (r8 != r11) goto L_0x0195
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x06f9 }
            r8.<init>()     // Catch:{ all -> 0x06f9 }
            int r9 = r3.size()     // Catch:{ all -> 0x06f9 }
            int r9 = r9 - r11
            java.lang.Object r9 = r3.get(r9)     // Catch:{ all -> 0x06f9 }
            xa3.i r9 = (xa3.C102593i) r9     // Catch:{ all -> 0x06f9 }
            java.lang.String r10 = r9.f302126s     // Catch:{ all -> 0x06f9 }
            r8.append(r10)     // Catch:{ all -> 0x06f9 }
            java.lang.String r7 = r7.f302126s     // Catch:{ all -> 0x06f9 }
            r8.append(r7)     // Catch:{ all -> 0x06f9 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x06f9 }
            r9.f302126s = r7     // Catch:{ all -> 0x06f9 }
            goto L_0x01af
        L_0x0195:
            xa3.i r8 = new xa3.i     // Catch:{ all -> 0x06f9 }
            r8.<init>()     // Catch:{ all -> 0x06f9 }
            java.lang.String r9 = r7.f302126s     // Catch:{ all -> 0x06f9 }
            r8.f302126s = r9     // Catch:{ all -> 0x06f9 }
            java.lang.String r9 = r7.f302070a     // Catch:{ all -> 0x06f9 }
            r8.f302070a = r9     // Catch:{ all -> 0x06f9 }
            java.lang.String r9 = r7.f302098o     // Catch:{ all -> 0x06f9 }
            r8.f302098o = r9     // Catch:{ all -> 0x06f9 }
            int r7 = r7.f302099p     // Catch:{ all -> 0x06f9 }
            r8.f302099p = r7     // Catch:{ all -> 0x06f9 }
            r8.f302097n = r2     // Catch:{ all -> 0x06f9 }
            r3.add(r8)     // Catch:{ all -> 0x06f9 }
        L_0x01af:
            int r7 = r5 + 1
            int r8 = r6.size()     // Catch:{ all -> 0x06f9 }
            if (r7 >= r8) goto L_0x01f1
            java.lang.Object r8 = r6.get(r7)     // Catch:{ all -> 0x06f9 }
            xa3.c r8 = (xa3.C102587c) r8     // Catch:{ all -> 0x06f9 }
            int r8 = r8.mo142212c()     // Catch:{ all -> 0x06f9 }
            if (r8 != r11) goto L_0x01f1
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x06f9 }
            xa3.i r6 = (xa3.C102593i) r6     // Catch:{ all -> 0x06f9 }
            java.lang.String r6 = r6.f302126s     // Catch:{ all -> 0x06f9 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ all -> 0x06f9 }
            if (r6 != 0) goto L_0x01f1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x06f9 }
            r6.<init>()     // Catch:{ all -> 0x06f9 }
            int r7 = r3.size()     // Catch:{ all -> 0x06f9 }
            int r7 = r7 - r11
            java.lang.Object r7 = r3.get(r7)     // Catch:{ all -> 0x06f9 }
            xa3.i r7 = (xa3.C102593i) r7     // Catch:{ all -> 0x06f9 }
            java.lang.String r8 = r7.f302126s     // Catch:{ all -> 0x06f9 }
            r6.append(r8)     // Catch:{ all -> 0x06f9 }
            java.lang.String r8 = "<br/>"
            r6.append(r8)     // Catch:{ all -> 0x06f9 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x06f9 }
            r7.f302126s = r6     // Catch:{ all -> 0x06f9 }
        L_0x01f1:
            int r5 = r5 + 1
            goto L_0x0021
        L_0x01f5:
            monitor-exit(r23)     // Catch:{ all -> 0x06f9 }
            java.lang.String r0 = "<wx-"
            r5 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r5)
            r6 = r24
            java.util.regex.Matcher r0 = r0.matcher(r6)
            java.lang.String r6 = "<"
            java.lang.String r0 = r0.replaceAll(r6)
            java.lang.String r6 = "</wx-"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6, r5)
            java.util.regex.Matcher r0 = r6.matcher(r0)
            java.lang.String r6 = "</"
            java.lang.String r6 = r0.replaceAll(r6)
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x0221 }
            r7 = 0
            goto L_0x0235
        L_0x0221:
            r0 = move-exception
            java.lang.String r7 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r12 = ""
            java.lang.Object[] r13 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r12, r13)
            java.lang.String r0 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r7 = "writehtmlfile, use utf-8 encoding error,use default encoding,"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)
            r0 = r2
            r7 = 1
        L_0x0235:
            te3.rc0 r12 = r1.f263947c
            r13 = 8
            r12.mo141260p(r13)
            te3.rc0 r12 = r1.f263947c
            java.lang.String r14 = "WeNoteHtmlFile"
            r12.mo141228A(r14)
            te3.rc0 r12 = r1.f263947c
            r12.mo141232F(r11)
            te3.rc0 r12 = r1.f263947c
            java.lang.String r14 = ".htm"
            r12.mo141261q(r14)
            te3.rc0 r12 = r1.f263947c
            java.lang.String r14 = r12.toString()
            java.lang.String r14 = wa3.C102368h.m135071b(r14, r10)
            r12.mo141257m(r14)
            te3.rc0 r12 = r1.f263947c
            java.lang.String r12 = wa3.C102368h.m135072c(r12)
            java.lang.String r14 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r15 = "getFavProtoItem: save note html file, path is %s"
            java.lang.Object[] r10 = new java.lang.Object[r11]
            r10[r4] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r15, r10)
            com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1
            r10.<init>((java.lang.String) r12)
            boolean r14 = r10.mo119967g()
            if (r14 == 0) goto L_0x027b
            r10.mo119966f()
        L_0x027b:
            boolean r14 = r10.mo119967g()
            if (r14 != 0) goto L_0x0291
            r10.mo119964e()     // Catch:{ IOException -> 0x0285 }
            goto L_0x0291
        L_0x0285:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r5 = ""
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r3, r5, r4)
            return r2
        L_0x0291:
            if (r7 != 0) goto L_0x06d9
            int r7 = r0.length
            int r0 = com.tencent.p014mm.vfs.C86013q1.m106438T(r12, r0, r4, r7)
            if (r0 != 0) goto L_0x06d9
            te3.rc0 r0 = r1.f263947c
            r0.f299284V = r12
            java.lang.String r0 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r7 = "do WNNoteBase.ConvertNote2FavProtoItem"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            te3.rc0 r0 = r1.f263947c
            java.util.HashMap<java.lang.String, org.json.JSONArray> r7 = wa3.C102365e.f301465s
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            te3.kd0 r10 = new te3.kd0
            r10.<init>()
            java.lang.String r12 = "WeNoteHtmlFile"
            if (r0 == 0) goto L_0x02bb
            r7.add(r0)
            goto L_0x02f7
        L_0x02bb:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r0 != 0) goto L_0x02f7
            int r0 = r6.length()
            if (r0 <= 0) goto L_0x02f7
            java.lang.String r0 = pb1.C11881t1.m11564b()
            te3.rc0 r6 = new te3.rc0
            r6.<init>()
            r6.mo141260p(r13)
            r6.mo141228A(r12)
            r6.mo141232F(r11)
            long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            r6.mo141269y(r14)
            java.lang.String r14 = ".htm"
            r6.mo141261q(r14)
            r7.add(r6)
            java.lang.String r14 = wa3.C102368h.m135072c(r6)
            boolean r15 = com.tencent.p014mm.vfs.C86013q1.m106450k(r14)
            if (r15 != 0) goto L_0x02f5
            com.tencent.p014mm.vfs.C86013q1.m106442c(r0, r14)
        L_0x02f5:
            r6.f299284V = r14
        L_0x02f7:
            java.util.Iterator r0 = r3.iterator()
        L_0x02fb:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x052a
            java.lang.Object r6 = r0.next()
            xa3.o r6 = (xa3.C102599o) r6
            if (r6 != 0) goto L_0x030a
            goto L_0x02fb
        L_0x030a:
            te3.rc0 r14 = r6.f302097n
            r15 = 3
            if (r14 == 0) goto L_0x031f
            int r2 = r14.f299258I
            r4 = 20
            if (r2 != r4) goto L_0x0318
            r14.mo141260p(r15)
        L_0x0318:
            te3.rc0 r2 = r6.f302097n
            r7.add(r2)
            goto L_0x03be
        L_0x031f:
            te3.rc0 r2 = new te3.rc0
            r2.<init>()
            te3.sc0 r4 = new te3.sc0
            r4.<init>()
            te3.tc0 r14 = new te3.tc0
            r14.<init>()
            r14.mo141309p(r9)
            r4.f299405d = r14
            r2.f299296c1 = r4
            int r4 = r6.f302099p
            switch(r4) {
                case 1: goto L_0x0468;
                case 2: goto L_0x0422;
                case 3: goto L_0x03c2;
                case 4: goto L_0x0394;
                case 5: goto L_0x0371;
                case 6: goto L_0x033c;
                default: goto L_0x033a;
            }
        L_0x033a:
            goto L_0x041e
        L_0x033c:
            r2.mo141260p(r8)
            r4 = r6
            xa3.k r4 = (xa3.C102595k) r4
            java.lang.String r14 = r6.f302070a
            r2.mo141257m(r14)
            java.lang.String r14 = r4.f302101r
            r2.f299284V = r14
            java.lang.String r14 = r4.f302084s
            r2.f299286W = r14
            java.lang.Class<dy.f> r14 = p500dy.C97560f.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            dy.f r14 = (p500dy.C97560f) r14
            java.lang.String r15 = r4.f302101r
            com.tencent.mm.plugin.sight.base.a r14 = r14.Z40(r15)
            if (r14 == 0) goto L_0x0367
            int r14 = r14.mo130041a()
            r2.mo141266v(r14)
            goto L_0x036a
        L_0x0367:
            r2.mo141266v(r11)
        L_0x036a:
            java.lang.String r4 = r4.f302086u
            r2.mo141261q(r4)
            goto L_0x041e
        L_0x0371:
            r2.mo141260p(r13)
            r4 = r6
            xa3.u r4 = (xa3.C102605u) r4
            java.lang.String r14 = r6.f302070a
            r2.mo141257m(r14)
            java.lang.String r14 = r4.f302101r
            r2.f299284V = r14
            r2.mo141232F(r11)
            java.lang.String r14 = r4.f302127s
            r2.mo141246U(r14)
            java.lang.String r14 = r4.f302128t
            r2.mo141265u(r14)
            java.lang.String r4 = r4.f302129u
            r2.mo141261q(r4)
            goto L_0x041e
        L_0x0394:
            r2.mo141260p(r15)
            r4 = r6
            xa3.v r4 = (xa3.C102606v) r4
            java.lang.String r14 = r6.f302070a
            r2.mo141257m(r14)
            java.lang.String r14 = r4.f302101r
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r15 != 0) goto L_0x03be
            int r15 = r14.length()
            if (r15 != 0) goto L_0x03ae
            goto L_0x03be
        L_0x03ae:
            r2.f299284V = r14
            int r14 = r4.f302135x
            r2.mo141266v(r14)
            r2.mo141232F(r11)
            java.lang.String r4 = r4.f302130s
            r2.mo141261q(r4)
            goto L_0x041e
        L_0x03be:
            r2 = 0
            r4 = 0
            goto L_0x02fb
        L_0x03c2:
            r2.mo141260p(r9)
            r4 = r6
            xa3.s r4 = (xa3.C102603s) r4
            java.lang.String r14 = r6.f302070a
            r2.mo141257m(r14)
            te3.zc0 r14 = new te3.zc0
            r14.<init>()
            java.lang.String r15 = r4.f302122w
            r14.mo141339v(r15)
            double r8 = r4.f302119t
            r14.mo141340w(r8)
            double r8 = r4.f302120u
            r14.mo141341x(r8)
            double r8 = r4.f302121v
            int r8 = (int) r8
            r14.mo141323F(r8)
            java.lang.String r8 = r4.f302118s
            r14.mo141322E(r8)
            java.lang.String r8 = r4.f302123x
            r14.mo141321C(r8)
            boolean r8 = r4.f302124y
            r14.mo141338u(r8)
            java.lang.String r8 = r4.f302125z
            r14.mo141343z(r8)
            java.lang.String r8 = r4.f302113A
            r14.mo141342y(r8)
            java.lang.String r8 = r4.f302114B
            r14.mo141319A(r8)
            float r8 = r4.f302115C
            r14.mo141320B(r8)
            java.lang.String r8 = r4.f302116D
            r14.mo141336s(r8)
            java.lang.String r4 = r4.f302117E
            r14.mo141337t(r4)
            r2.mo141231E(r11)
            r2.mo141232F(r11)
            te3.sc0 r4 = r2.f299296c1
            r4.f299406e = r14
        L_0x041e:
            r4 = r6
            r15 = 6
            goto L_0x051b
        L_0x0422:
            r2.mo141260p(r5)
            r4 = r6
            xa3.q r4 = (xa3.C102601q) r4
            java.lang.String r8 = r4.f302104s
            r2.f299284V = r8
            java.lang.String r9 = r4.f302070a
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x043e
            java.lang.String r8 = r6.f302070a
            r2.mo141257m(r8)
            java.lang.String r4 = r4.f302101r
            r2.f299286W = r4
            goto L_0x0464
        L_0x043e:
            java.lang.String r4 = r4.toString()
            r9 = 18
            java.lang.String r4 = wa3.C102368h.m135071b(r4, r9)
            r2.mo141257m(r4)
            r17 = 150(0x96, float:2.1E-43)
            r18 = 150(0x96, float:2.1E-43)
            android.graphics.Bitmap$CompressFormat r19 = android.graphics.Bitmap.CompressFormat.JPEG
            r20 = 90
            java.lang.String r21 = wa3.C102368h.m135074e(r2)
            r22 = 1
            r16 = r8
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbNail((java.lang.String) r16, (int) r17, (int) r18, (android.graphics.Bitmap.CompressFormat) r19, (int) r20, (java.lang.String) r21, (boolean) r22)
            java.lang.String r4 = wa3.C102368h.m135074e(r2)
            r2.f299286W = r4
        L_0x0464:
            r2.mo141260p(r5)
            goto L_0x041e
        L_0x0468:
            boolean r4 = wa3.C102365e.f301466t
            if (r4 != 0) goto L_0x04df
            i00.b r4 = wa3.C102364c.vx0()
            wa3.e r4 = r4.mo137946Rd()
            if (r4 != 0) goto L_0x047a
            r24 = r6
            r15 = 6
            goto L_0x04dc
        L_0x047a:
            wa3.f r8 = r4.f301472i
            java.lang.String r9 = r4.mo141945g()
            java.lang.String r8 = r8.mo141954a(r9)
            boolean r9 = r4.mo141944f()
            wa3.f r4 = r4.f301472i
            java.lang.String r4 = r4.f301479a
            com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct r14 = new com.tencent.mm.autogen.mmdata.rpt.FavoriteNoteClickReportStruct
            r14.<init>()
            r24 = r6
            r15 = 6
            long r5 = (long) r15
            r14.f265562d = r5
            java.lang.String r5 = "noteid"
            java.lang.String r5 = r14.mo86045b(r5, r8, r11)
            r14.f265564f = r5
            r14.f265565g = r9
            java.lang.String r5 = "sessionID"
            java.lang.String r4 = r14.mo86045b(r5, r4, r11)
            r14.f265563e = r4
            r14.mo86054n()
            int r4 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            if (r4 > r11) goto L_0x04dc
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r4 = 14547(0x38d3, float:2.0385E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 0
            r5[r6] = r4
            java.lang.String r4 = r14.mo1006q()
            java.lang.String r8 = "struct.toShowString()"
            gy3.C87412m.m108593f(r4, r8)
            java.lang.String r8 = "\r\n"
            java.lang.String r9 = " "
            java.lang.String r4 = z04.C112551y.m153814n(r4, r8, r9, r6)
            r5[r11] = r4
            java.lang.String r4 = "MicroMsg.WNNoteReporter"
            java.lang.String r6 = "report%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
        L_0x04dc:
            wa3.C102365e.f301466t = r11
            goto L_0x04e2
        L_0x04df:
            r24 = r6
            r15 = 6
        L_0x04e2:
            r2.mo141260p(r11)
            r2.mo141231E(r11)
            r2.mo141232F(r11)
            r6 = r24
            xa3.i r6 = (xa3.C102593i) r6
            r4 = r24
            java.lang.String r5 = r4.f302070a
            r2.mo141257m(r5)
            java.lang.String r5 = r6.f302126s
            java.lang.String r5 = gb3.C98095b.m126704a(r5)
            r2.mo141265u(r5)
            java.lang.String r5 = r2.f299301f
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x051b
            java.lang.String r5 = r2.f299301f
            int r5 = r5.length()
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r5 <= r6) goto L_0x051b
            java.lang.String r5 = r2.f299301f
            r8 = 0
            java.lang.String r5 = r5.substring(r8, r6)
            r2.mo141265u(r5)
        L_0x051b:
            java.lang.String r4 = r4.f302098o
            r2.mo141228A(r4)
            r7.add(r2)
            r2 = 0
            r4 = 0
            r5 = 2
            r8 = 4
            r9 = 6
            goto L_0x02fb
        L_0x052a:
            java.lang.String r0 = "MicroMsg.WNNoteBase"
            java.lang.String r2 = "do WNNoteBase.setExtraInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            int r2 = r7.size()
            if (r2 <= 0) goto L_0x06d5
            int r2 = r7.size()
            r6 = 0
        L_0x053c:
            if (r6 >= r2) goto L_0x06d5
            java.lang.Object r4 = r7.get(r6)
            te3.rc0 r4 = (te3.C101834rc0) r4
            if (r6 <= 0) goto L_0x0586
            java.lang.String r5 = r4.f299325s
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0586
            java.lang.String r5 = r4.toString()
            r8 = 18
            java.lang.String r5 = wa3.C102368h.m135071b(r5, r8)
            r4.mo141257m(r5)
            int r5 = r6 + -1
            if (r5 < 0) goto L_0x0572
            int r9 = r3.size()
            if (r5 >= r9) goto L_0x0572
            int r9 = r3.size()
            if (r9 <= 0) goto L_0x0572
            java.lang.Object r5 = r3.get(r5)
            xa3.o r5 = (xa3.C102599o) r5
            goto L_0x0573
        L_0x0572:
            r5 = 0
        L_0x0573:
            if (r5 == 0) goto L_0x0588
            java.lang.String r9 = r5.f302098o
            if (r9 == 0) goto L_0x0588
            java.lang.String r13 = r4.f299308i1
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L_0x0588
            java.lang.String r9 = r4.f299280T
            r5.f302070a = r9
            goto L_0x0588
        L_0x0586:
            r8 = 18
        L_0x0588:
            if (r6 <= 0) goto L_0x05a3
            java.lang.String r5 = r4.f299325s
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x05a3
            java.lang.String r5 = r4.f299329u
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x05a3
            r4.mo141231E(r11)
            r4.mo141232F(r11)
        L_0x05a0:
            r8 = 0
            goto L_0x06d1
        L_0x05a3:
            r5 = 2
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r14 = 0
            r9[r14] = r13
            int r13 = r4.f299258I
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9[r11] = r13
            java.lang.String r13 = "datalist.get[%d].type = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r13, r9)
            java.lang.String r9 = r4.f299284V
            boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)
            r14 = 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0641
            java.lang.Object[] r13 = new java.lang.Object[r11]
            r5 = 0
            r13[r5] = r9
            java.lang.String r8 = "datapath exist,pathname:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r8, r13)
            java.lang.String r8 = com.tencent.p014mm.vfs.C86013q1.m106456q(r9)
            byte[] r13 = com.tencent.p014mm.vfs.C86013q1.m106433O(r9, r5, r14)
            java.lang.String r13 = p823sg.C90193h.m112878f(r13)
            r4.mo141268x(r8)
            r4.mo141270z(r13)
            android.net.Uri r8 = com.tencent.p014mm.vfs.C116299g2.m163858n(r9)
            java.lang.String r13 = r8.getPath()
            if (r13 == 0) goto L_0x0604
            java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r5, r5)
            java.lang.String r5 = r8.getPath()
            boolean r5 = r5.equals(r13)
            if (r5 != 0) goto L_0x0604
            android.net.Uri$Builder r5 = r8.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r13)
            android.net.Uri r8 = r5.build()
        L_0x0604:
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r13 = 0
            com.tencent.mm.vfs.f0$h r5 = r5.mo177799l(r8, r13)
            boolean r8 = r5.mo177810a()
            if (r8 != 0) goto L_0x0612
            goto L_0x061c
        L_0x0612:
            com.tencent.mm.vfs.FileSystem$c r8 = r5.f348991a
            java.lang.String r5 = r5.f348992b
            com.tencent.mm.vfs.b0 r5 = r8.mo119945q(r5)
            if (r5 != 0) goto L_0x061f
        L_0x061c:
            r14 = 0
            goto L_0x0621
        L_0x061f:
            long r14 = r5.f250473c
        L_0x0621:
            r4.mo141269y(r14)
            java.lang.String r5 = wa3.C102368h.m135072c(r4)
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            boolean r13 = r9.equals(r5)
            if (r13 != 0) goto L_0x063f
            if (r8 != 0) goto L_0x063f
            java.lang.String r8 = r4.f299308i1
            boolean r8 = r12.equals(r8)
            if (r8 != 0) goto L_0x063f
            com.tencent.p014mm.vfs.C86013q1.m106442c(r9, r5)
        L_0x063f:
            r8 = 0
            goto L_0x064b
        L_0x0641:
            java.lang.Object[] r5 = new java.lang.Object[r11]
            r8 = 0
            r5[r8] = r9
            java.lang.String r9 = "datapath not exist, %s not exist!"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r9, r5)
        L_0x064b:
            java.lang.String r5 = r4.f299286W
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r9 == 0) goto L_0x06c6
            java.lang.Object[] r9 = new java.lang.Object[r11]
            r9[r8] = r5
            java.lang.String r13 = "thumbPath exist,pathname:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r13, r9)
            java.lang.String r9 = com.tencent.p014mm.vfs.C86013q1.m106456q(r5)
            r13 = 256(0x100, float:3.59E-43)
            java.lang.String r13 = p823sg.C90193h.m112877e(r5, r8, r13)
            r4.mo141245T(r9)
            r4.mo141244S(r13)
            android.net.Uri r9 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)
            java.lang.String r13 = r9.getPath()
            if (r13 == 0) goto L_0x0691
            java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r8, r8)
            java.lang.String r8 = r9.getPath()
            boolean r8 = r8.equals(r13)
            if (r8 != 0) goto L_0x0691
            android.net.Uri$Builder r8 = r9.buildUpon()
            android.net.Uri$Builder r8 = r8.path(r13)
            android.net.Uri r9 = r8.build()
        L_0x0691:
            com.tencent.mm.vfs.f0 r8 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r13 = 0
            com.tencent.mm.vfs.f0$h r8 = r8.mo177799l(r9, r13)
            boolean r9 = r8.mo177810a()
            if (r9 != 0) goto L_0x069f
            goto L_0x06a9
        L_0x069f:
            com.tencent.mm.vfs.FileSystem$c r9 = r8.f348991a
            java.lang.String r8 = r8.f348992b
            com.tencent.mm.vfs.b0 r8 = r9.mo119945q(r8)
            if (r8 != 0) goto L_0x06ac
        L_0x06a9:
            r8 = 0
            goto L_0x06ae
        L_0x06ac:
            long r8 = r8.f250473c
        L_0x06ae:
            r4.mo141243R(r8)
            java.lang.String r4 = wa3.C102368h.m135074e(r4)
            boolean r8 = r5.equals(r4)
            if (r8 != 0) goto L_0x05a0
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r8 != 0) goto L_0x05a0
            com.tencent.p014mm.vfs.C86013q1.m106442c(r5, r4)
            goto L_0x05a0
        L_0x06c6:
            java.lang.Object[] r4 = new java.lang.Object[r11]
            r8 = 0
            r4[r8] = r5
            java.lang.String r5 = "thumbPath not exist, pathname:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r4)
        L_0x06d1:
            int r6 = r6 + 1
            goto L_0x053c
        L_0x06d5:
            r10.mo141211f(r7)
            return r10
        L_0x06d9:
            java.lang.String r0 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r2 = "writefile error,return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 2131825770(0x7f11146a, float:1.9284406E38)
            java.lang.String r2 = r2.getString(r3)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r11)
            r0.show()
            r2 = 0
            return r2
        L_0x06f9:
            r0 = move-exception
            monitor-exit(r23)     // Catch:{ all -> 0x06f9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bb3.C92221d.mo126203m(java.lang.String):te3.kd0");
    }

    /* renamed from: n */
    public int mo126204n() {
        synchronized (this) {
            if (this.f263945a == null) {
                return -1;
            }
            for (int i = 0; i < this.f263945a.size(); i++) {
                C102587c cVar = this.f263945a.get(i);
                if (cVar != null && cVar.mo142212c() != -3 && cVar.mo142212c() != -2) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x019f, code lost:
        if (r7.f263954j == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return java.lang.String.format("<head image-show-type = \"%s\"></head>", new java.lang.Object[]{1}) + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return r0;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo126205o() {
        /*
            r7 = this;
            java.lang.String r0 = ""
            monitor-enter(r7)
            java.util.ArrayList<xa3.c> r1 = r7.f263945a     // Catch:{ all -> 0x01c3 }
            if (r1 == 0) goto L_0x01bf
            int r1 = r1.size()     // Catch:{ all -> 0x01c3 }
            if (r1 > 0) goto L_0x000f
            goto L_0x01bf
        L_0x000f:
            r1 = 0
            r2 = 0
        L_0x0011:
            java.util.ArrayList<xa3.c> r3 = r7.f263945a     // Catch:{ all -> 0x01c3 }
            int r3 = r3.size()     // Catch:{ all -> 0x01c3 }
            r4 = 1
            if (r2 >= r3) goto L_0x0194
            java.util.ArrayList<xa3.c> r3 = r7.f263945a     // Catch:{ all -> 0x01c3 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x01c3 }
            xa3.c r3 = (xa3.C102587c) r3     // Catch:{ all -> 0x01c3 }
            int r5 = r3.mo142212c()     // Catch:{ all -> 0x01c3 }
            r6 = -1
            if (r5 == r6) goto L_0x017f
            r6 = 20
            if (r5 == r6) goto L_0x0167
            switch(r5) {
                case 1: goto L_0x00ce;
                case 2: goto L_0x00b4;
                case 3: goto L_0x009a;
                case 4: goto L_0x007d;
                case 5: goto L_0x0063;
                case 6: goto L_0x0049;
                case 7: goto L_0x0032;
                default: goto L_0x0030;
            }     // Catch:{ all -> 0x01c3 }
        L_0x0030:
            goto L_0x0190
        L_0x0032:
            xa3.p r3 = (xa3.C102600p) r3     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r4.<init>()     // Catch:{ all -> 0x01c3 }
            r4.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r3.mo142217g()     // Catch:{ all -> 0x01c3 }
            r4.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01c3 }
            goto L_0x0190
        L_0x0049:
            xa3.k r3 = (xa3.C102595k) r3     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r4.<init>()     // Catch:{ all -> 0x01c3 }
            r4.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r3.f302098o     // Catch:{ all -> 0x01c3 }
            r3 = 6
            java.lang.String r0 = r7.mo126185E(r0, r3)     // Catch:{ all -> 0x01c3 }
            r4.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01c3 }
            goto L_0x0190
        L_0x0063:
            xa3.d r3 = (xa3.C102588d) r3     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r4.<init>()     // Catch:{ all -> 0x01c3 }
            r4.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r3.f302098o     // Catch:{ all -> 0x01c3 }
            r3 = 5
            java.lang.String r0 = r7.mo126185E(r0, r3)     // Catch:{ all -> 0x01c3 }
            r4.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01c3 }
            goto L_0x0190
        L_0x007d:
            xa3.l r3 = (xa3.C102596l) r3     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r4.<init>()     // Catch:{ all -> 0x01c3 }
            r4.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r3.f302098o     // Catch:{ all -> 0x01c3 }
            int r3 = r3.mo142212c()     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r7.mo126185E(r0, r3)     // Catch:{ all -> 0x01c3 }
            r4.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01c3 }
            goto L_0x0190
        L_0x009a:
            xa3.g r3 = (xa3.C102591g) r3     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r4.<init>()     // Catch:{ all -> 0x01c3 }
            r4.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r3.f302098o     // Catch:{ all -> 0x01c3 }
            r3 = 3
            java.lang.String r0 = r7.mo126185E(r0, r3)     // Catch:{ all -> 0x01c3 }
            r4.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01c3 }
            goto L_0x0190
        L_0x00b4:
            xa3.f r3 = (xa3.C102590f) r3     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r4.<init>()     // Catch:{ all -> 0x01c3 }
            r4.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r3.f302098o     // Catch:{ all -> 0x01c3 }
            r3 = 2
            java.lang.String r0 = r7.mo126185E(r0, r3)     // Catch:{ all -> 0x01c3 }
            r4.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01c3 }
            goto L_0x0190
        L_0x00ce:
            xa3.i r3 = (xa3.C102593i) r3     // Catch:{ all -> 0x01c3 }
            java.lang.String r5 = r3.f302126s     // Catch:{ all -> 0x01c3 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ all -> 0x01c3 }
            if (r5 == 0) goto L_0x00eb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r3.<init>()     // Catch:{ all -> 0x01c3 }
            r3.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = "<br/>"
            r3.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01c3 }
            goto L_0x0190
        L_0x00eb:
            java.lang.String r5 = r3.f302126s     // Catch:{ all -> 0x01c3 }
            java.lang.String r6 = "<wx-p"
            boolean r5 = r5.startsWith(r6)     // Catch:{ all -> 0x01c3 }
            if (r5 != 0) goto L_0x011c
            java.lang.String r5 = r3.f302126s     // Catch:{ all -> 0x01c3 }
            java.lang.String r6 = "<p"
            boolean r5 = r5.startsWith(r6)     // Catch:{ all -> 0x01c3 }
            if (r5 == 0) goto L_0x0100
            goto L_0x011c
        L_0x0100:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r5.<init>()     // Catch:{ all -> 0x01c3 }
            r5.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = "<p>"
            r5.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r3.f302126s     // Catch:{ all -> 0x01c3 }
            r5.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = "</p>"
            r5.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x01c3 }
            goto L_0x012d
        L_0x011c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r5.<init>()     // Catch:{ all -> 0x01c3 }
            r5.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r3.f302126s     // Catch:{ all -> 0x01c3 }
            r5.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x01c3 }
        L_0x012d:
            int r3 = r2 + 1
            java.util.ArrayList<xa3.c> r5 = r7.f263945a     // Catch:{ all -> 0x01c3 }
            int r5 = r5.size()     // Catch:{ all -> 0x01c3 }
            if (r3 >= r5) goto L_0x0190
            java.util.ArrayList<xa3.c> r5 = r7.f263945a     // Catch:{ all -> 0x01c3 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x01c3 }
            xa3.c r5 = (xa3.C102587c) r5     // Catch:{ all -> 0x01c3 }
            int r5 = r5.mo142212c()     // Catch:{ all -> 0x01c3 }
            if (r5 != r4) goto L_0x0190
            java.util.ArrayList<xa3.c> r4 = r7.f263945a     // Catch:{ all -> 0x01c3 }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x01c3 }
            xa3.i r3 = (xa3.C102593i) r3     // Catch:{ all -> 0x01c3 }
            java.lang.String r3 = r3.f302126s     // Catch:{ all -> 0x01c3 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ all -> 0x01c3 }
            if (r3 != 0) goto L_0x0190
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r3.<init>()     // Catch:{ all -> 0x01c3 }
            r3.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = "<br/>"
            r3.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01c3 }
            goto L_0x0190
        L_0x0167:
            xa3.b r3 = (xa3.C102586b) r3     // Catch:{ all -> 0x01c3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r4.<init>()     // Catch:{ all -> 0x01c3 }
            r4.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r3.f302098o     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r7.mo126185E(r0, r6)     // Catch:{ all -> 0x01c3 }
            r4.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01c3 }
            goto L_0x0190
        L_0x017f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c3 }
            r3.<init>()     // Catch:{ all -> 0x01c3 }
            r3.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = "<hr/>"
            r3.append(r0)     // Catch:{ all -> 0x01c3 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01c3 }
        L_0x0190:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0194:
            java.lang.String r2 = "\n"
            java.lang.String r3 = "<br/>"
            java.lang.String r0 = r0.replaceAll(r2, r3)     // Catch:{ all -> 0x01c3 }
            monitor-exit(r7)     // Catch:{ all -> 0x01c3 }
            boolean r2 = r7.f263954j
            if (r2 == 0) goto L_0x01be
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "<head image-show-type = \"%s\"></head>"
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r1] = r4
            java.lang.String r1 = java.lang.String.format(r3, r5)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L_0x01be:
            return r0
        L_0x01bf:
            java.lang.String r0 = ""
            monitor-exit(r7)     // Catch:{ all -> 0x01c3 }
            return r0
        L_0x01c3:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01c3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bb3.C92221d.mo126205o():java.lang.String");
    }

    /* renamed from: p */
    public int mo126206p() {
        synchronized (this) {
            ArrayList<C102587c> arrayList = this.f263945a;
            if (arrayList == null) {
                return -1;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C102587c cVar = this.f263945a.get(size);
                if (cVar != null && cVar.mo142212c() != -3 && cVar.mo142212c() != -2) {
                    return size;
                }
            }
            return -1;
        }
    }

    /* renamed from: q */
    public String mo126207q(String str) {
        synchronized (this) {
            if (this.f263945a != null) {
                int i = 0;
                while (true) {
                    if (i >= this.f263945a.size()) {
                        break;
                    }
                    boolean z = true;
                    if (this.f263945a.get(i).mo142212c() == 1) {
                        String replace = C98095b.m126704a(((C102593i) this.f263945a.get(i)).f302126s).replace("&lt;", "<").replace("&gt;", ">").replace(" ", " ");
                        if (!Util.isNullOrNil(replace)) {
                            String[] split = replace.split("\n");
                            int i2 = 0;
                            while (true) {
                                if (i2 >= split.length) {
                                    z = false;
                                    break;
                                } else if (!Util.isNullOrNil(split[i2].trim())) {
                                    str = split[i2];
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            if (z) {
                                break;
                            }
                        }
                    }
                    i++;
                }
            }
        }
        return str.length() > 1000 ? str.substring(0, 1000) : str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a3  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo126208r(java.util.List<xa3.C102587c> r19, int r20, int r21, com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r22
            r2 = 0
            if (r19 == 0) goto L_0x02b3
            int r3 = r19.size()
            if (r3 != 0) goto L_0x000f
            goto L_0x02b3
        L_0x000f:
            boolean r3 = r0.f263954j
            if (r3 != 0) goto L_0x0014
            return r2
        L_0x0014:
            java.util.Iterator r3 = r19.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0036
            java.lang.Object r4 = r3.next()
            xa3.c r4 = (xa3.C102587c) r4
            int r4 = r4.mo142212c()
            if (r4 == r5) goto L_0x0033
            r5 = 6
            if (r4 == r5) goto L_0x0033
            r5 = 7
            if (r4 == r5) goto L_0x0033
            r6 = 0
        L_0x0033:
            if (r6 != 0) goto L_0x0018
            return r2
        L_0x0036:
            java.util.ArrayList<xa3.c> r3 = r0.f263945a
            java.lang.String r4 = "oriData"
            gy3.C87412m.m108594g(r3, r4)
            boolean r4 = r19.isEmpty()
            if (r4 == 0) goto L_0x0046
            goto L_0x02a9
        L_0x0046:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.Iterator r7 = r19.iterator()
        L_0x004f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x006b
            java.lang.Object r8 = r7.next()
            xa3.c r8 = (xa3.C102587c) r8
            boolean r9 = r8 instanceof xa3.C102600p
            if (r9 == 0) goto L_0x0067
            xa3.p r8 = (xa3.C102600p) r8
            java.util.LinkedList<xa3.c> r8 = r8.f302102s
            r4.addAll(r8)
            goto L_0x004f
        L_0x0067:
            r4.add(r8)
            goto L_0x004f
        L_0x006b:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Log.isDebug()
            java.lang.String r8 = ", insertImgData = "
            java.lang.String r9 = ", subOffset = "
            java.lang.String r10 = ", pos = "
            java.lang.String r11 = "NoteDataManagerExt"
            if (r7 == 0) goto L_0x00ac
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r12 = "handleInsertToMediaGroupItem() called with: oriData = "
            r7.append(r12)
            r7.append(r3)
            r7.append(r10)
            r12 = r20
            r7.append(r12)
            r7.append(r9)
            r13 = r21
            r7.append(r13)
            r7.append(r8)
            r7.append(r4)
            java.lang.String r14 = ", editor = "
            r7.append(r14)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r7)
            goto L_0x00b0
        L_0x00ac:
            r12 = r20
            r13 = r21
        L_0x00b0:
            if (r1 == 0) goto L_0x0189
            int r14 = r22.getRecyclerItemPosition()
            xa3.c r15 = r0.mo126201k(r14)
            if (r15 == 0) goto L_0x0189
            r18.mo126199i()
            int r16 = r22.getEditTextType()
            if (r16 != 0) goto L_0x0189
            int r7 = r15.mo142212c()
            if (r7 != r6) goto L_0x0189
            bb3.i r7 = r22.getSelection()
            android.text.Editable r1 = r22.getText()
            int r6 = r7.f263989d
            java.lang.CharSequence r6 = r1.subSequence(r2, r6)
            int r7 = r7.f263990e
            int r2 = r1.length()
            java.lang.CharSequence r1 = r1.subSequence(r7, r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.text.Spanned"
            gy3.C87412m.m108592e(r6, r2)
            android.text.Spanned r6 = (android.text.Spanned) r6
            java.lang.String r6 = za3.C102990c.m136185a(r6)
            gy3.C87412m.m108592e(r1, r2)
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.String r1 = za3.C102990c.m136185a(r1)
            xa3.i r15 = (xa3.C102593i) r15
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            java.lang.String r7 = "backHtml"
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            java.lang.String r12 = "<br/>"
            if (r2 != 0) goto L_0x015a
            java.lang.String r2 = "frontHtml"
            gy3.C87412m.m108593f(r6, r2)
            r2 = 0
            r17 = r11
            r11 = 0
            r13 = 2
            boolean r2 = z04.C112551y.m153808h(r6, r12, r11, r13, r2)
            if (r2 == 0) goto L_0x0124
            int r2 = r6.length()
            r13 = 5
            int r2 = r2 - r13
            java.lang.String r6 = r6.substring(r11, r2)
            gy3.C87412m.m108593f(r6, r5)
        L_0x0124:
            r15.f302126s = r6
            int r14 = r14 + 1
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x0158
            xa3.i r2 = new xa3.i
            r2.<init>()
            r6 = 1
            r2.f302099p = r6
            gy3.C87412m.m108593f(r1, r7)
            r6 = 0
            boolean r7 = z04.C112551y.m153819s(r1, r12, r6)
            if (r7 == 0) goto L_0x014c
            int r7 = r1.length()
            r11 = 5
            java.lang.String r1 = r1.substring(r11, r7)
            gy3.C87412m.m108593f(r1, r5)
        L_0x014c:
            r2.f302126s = r1
            r2.f302072c = r6
            r2.f302071b = r6
            r2.f302077h = r6
            r3.add(r14, r2)
            goto L_0x017a
        L_0x0158:
            r6 = 0
            goto L_0x017a
        L_0x015a:
            r17 = r11
            r6 = 0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x017d
            gy3.C87412m.m108593f(r1, r7)
            boolean r2 = z04.C112551y.m153819s(r1, r12, r6)
            if (r2 == 0) goto L_0x0178
            int r2 = r1.length()
            r6 = 5
            java.lang.String r1 = r1.substring(r6, r2)
            gy3.C87412m.m108593f(r1, r5)
        L_0x0178:
            r15.f302126s = r1
        L_0x017a:
            r1 = r21
            goto L_0x0183
        L_0x017d:
            r3.remove(r14)
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x0183:
            r6 = -1
            if (r14 == r6) goto L_0x018f
            int r14 = r14 + -1
            goto L_0x018f
        L_0x0189:
            r17 = r11
            r6 = -1
            r1 = r21
            r14 = -1
        L_0x018f:
            if (r14 == r6) goto L_0x0192
            goto L_0x0194
        L_0x0192:
            r14 = r20
        L_0x0194:
            bb3.e$a r2 = new bb3.e$a
            r2.<init>(r14, r1)
            java.util.Iterator r1 = r4.iterator()
        L_0x019d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02a9
            java.lang.Object r4 = r1.next()
            xa3.c r4 = (xa3.C102587c) r4
            r0.mo126213w(r4)
            bb3.e r5 = bb3.C92225e.f263960a
            int r7 = r2.f77882a
            int r2 = r2.f77883b
            java.lang.String r11 = "insertImgData"
            gy3.C87412m.m108594g(r4, r11)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Log.isDebug()
            if (r11 == 0) goto L_0x01ee
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "handleInsertToMediaGroupItemSingle() called with: oriData = "
            r11.append(r12)
            r11.append(r3)
            r11.append(r10)
            r11.append(r7)
            r11.append(r9)
            r11.append(r2)
            r11.append(r8)
            r11.append(r4)
            java.lang.String r12 = ", noteDataManager = "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r12 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r11)
            goto L_0x01f0
        L_0x01ee:
            r12 = r17
        L_0x01f0:
            int r11 = r7 + 1
            xa3.c r13 = r0.mo126201k(r11)
            xa3.c r14 = r0.mo126201k(r7)
            boolean r15 = r14 instanceof xa3.C102600p
            r6 = 3
            if (r15 != 0) goto L_0x025f
            boolean r2 = r13 instanceof xa3.C102600p
            if (r2 == 0) goto L_0x0228
            xa3.p r13 = (xa3.C102600p) r13
            r13.getClass()
            java.util.LinkedList<xa3.c> r2 = r13.f302102s
            r2.addFirst(r4)
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r6 = 0
            r4[r6] = r2
            r2 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r4[r2] = r6
            java.lang.String r2 = "handle single curItem not MItem nextItem is MItem, add to first, after pos:%s suboffset:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r2, r4)
            r5.mo126220b(r11, r3)
            r5 = 2
            goto L_0x0296
        L_0x0228:
            xa3.p r2 = new xa3.p
            r2.<init>()
            r2.mo142216f(r4)
            int r4 = r3.size()
            if (r11 > r4) goto L_0x0238
            r7 = r11
            goto L_0x023d
        L_0x0238:
            int r4 = r3.size()
            r7 = r4
        L_0x023d:
            r3.add(r7, r2)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r5 = 0
            r2[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r5 = 1
            r2[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r5 = 2
            r2[r5] = r4
            java.lang.String r4 = "handle single curItem not MItem nextItem not MItem, add to pos:%s, after pos:%s suboffset:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r4, r2)
            r5 = 2
            r6 = 1
            goto L_0x029f
        L_0x025f:
            if (r2 > 0) goto L_0x0262
            r2 = 0
        L_0x0262:
            xa3.p r14 = (xa3.C102600p) r14
            r14.getClass()
            java.util.LinkedList<xa3.c> r13 = r14.f302102s
            int r13 = r13.size()
            if (r2 >= r13) goto L_0x0275
            java.util.LinkedList<xa3.c> r13 = r14.f302102s
            r13.add(r2, r4)
            goto L_0x027a
        L_0x0275:
            java.util.LinkedList<xa3.c> r13 = r14.f302102s
            r13.add(r4)
        L_0x027a:
            boolean r4 = r5.mo126220b(r7, r3)
            r5 = 2
            java.lang.Object[] r13 = new java.lang.Object[r5]
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r4)
            r15 = 0
            r13[r15] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            r15 = 1
            r13[r15] = r14
            java.lang.String r14 = "handle single curItem is MItem isOverSize:%s suboffset:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r14, r13)
            if (r4 == 0) goto L_0x0298
        L_0x0296:
            r6 = 1
            goto L_0x029e
        L_0x0298:
            if (r2 >= r6) goto L_0x029d
            int r6 = r2 + 1
            goto L_0x029f
        L_0x029d:
            r6 = -1
        L_0x029e:
            r7 = r11
        L_0x029f:
            bb3.e$a r2 = new bb3.e$a
            r2.<init>(r7, r6)
            r17 = r12
            r6 = -1
            goto L_0x019d
        L_0x02a9:
            bb3.d$c r1 = new bb3.d$c
            r1.<init>()
            com.tencent.p014mm.sdk.p134kt.CommonKt.uiThread(r1)
            r1 = 1
            return r1
        L_0x02b3:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bb3.C92221d.mo126208r(java.util.List, int, int, com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText):boolean");
    }

    /* renamed from: s */
    public int mo126209s(C102587c cVar, WXRTEditText wXRTEditText, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (cVar == null) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        return mo126210t(arrayList, wXRTEditText, z, z2, z3, z4, z5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01df, code lost:
        r7 = r9 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01e1, code lost:
        if (r7 < 0) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01e7, code lost:
        if (r7 >= mo126186F()) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01ea, code lost:
        r7 = mo126186F() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01ef, code lost:
        if (r13 == false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01f1, code lost:
        r7 = r7 + 1;
        r9 = r9 + 1;
        mo126199i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01fc, code lost:
        if (r7 >= mo126186F()) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01fe, code lost:
        r13 = mo126201k(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0202, code lost:
        if (r13 == null) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0204, code lost:
        r13.f302072c = 0;
        r13.f302071b = true;
        r13.f302077h = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x020b, code lost:
        r13 = new xa3.C102593i();
        r13.f302099p = 1;
        r13.f302126s = "";
        r13.f302072c = 0;
        r13.f302071b = true;
        r13.f302077h = false;
        mo126193c(r7, r13, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x021f, code lost:
        r13 = r6.f263946b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0221, code lost:
        if (r13 == null) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0223, code lost:
        if (r10 == false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0225, code lost:
        r9 = r9 - r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0226, code lost:
        if (r8 == false) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0228, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x022a, code lost:
        if (r11 < 0) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x022c, code lost:
        if (r9 <= 0) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x022e, code lost:
        ((com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r13).mo134942n4(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0233, code lost:
        if (r11 <= 0) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0235, code lost:
        r11 = r11 - 1;
        ((com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r6.f263946b).mo134931Z7(r11, mo126186F() - r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0243, code lost:
        if (r11 != 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0245, code lost:
        ((com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r6.f263946b).mo134931Z7(r11, mo126186F() - r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0251, code lost:
        if (r12 == false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0253, code lost:
        r8 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r6.f263946b;
        r8.f283212E.post(new com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C96734k(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0261, code lost:
        r8 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r6.f263946b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0265, code lost:
        if (r7 < 0) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x026d, code lost:
        if (r7 < r8.f283238X0.mo126186F()) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0270, code lost:
        r8.f283212E.post(new com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C6637j(r8, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x027b, code lost:
        r8.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x027e, code lost:
        mo126214x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0281, code lost:
        return r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a4  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo126210t(java.util.ArrayList<xa3.C102587c> r7, com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13) {
        /*
            r6 = this;
            r0 = -1
            if (r7 == 0) goto L_0x0285
            int r1 = r7.size()
            if (r1 <= 0) goto L_0x0285
            java.util.ArrayList<xa3.c> r1 = r6.f263945a
            if (r1 != 0) goto L_0x000f
            goto L_0x0285
        L_0x000f:
            i00.b r1 = wa3.C102364c.vx0()
            wa3.e r1 = r1.mo137946Rd()
            if (r1 != 0) goto L_0x0021
            java.lang.String r7 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r8 = "insertItemList, but get wnnote base is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r8)
            return r0
        L_0x0021:
            bb3.e r1 = bb3.C92225e.f263960a
            java.lang.String r2 = ""
            boolean r1 = r1.mo126219a(r6, r8, r2, r7)
            if (r1 == 0) goto L_0x002c
            return r0
        L_0x002c:
            if (r11 == 0) goto L_0x003e
            boolean r11 = r6.mo126196f(r7)
            if (r11 == 0) goto L_0x003e
            ab3.a r11 = r6.f263946b
            if (r11 == 0) goto L_0x003e
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r11 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r11
            r11.mo134932a8()
            return r0
        L_0x003e:
            r11 = 2
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L_0x0073
            int r9 = r7.size()
            int r9 = r9 - r2
            java.lang.Object r9 = r7.get(r9)
            xa3.c r9 = (xa3.C102587c) r9
            r9.f302072c = r0
            r9.f302071b = r2
            r9.f302077h = r1
            if (r8 == 0) goto L_0x0073
            boolean r3 = r8.f283158N
            if (r3 == 0) goto L_0x0073
            int r3 = r8.getEditTextType()
            if (r3 != r11) goto L_0x0063
            r9.f302080k = r11
            goto L_0x006b
        L_0x0063:
            int r3 = r8.getEditTextType()
            if (r3 != r2) goto L_0x006b
            r9.f302080k = r2
        L_0x006b:
            r8.f283158N = r1
            int r3 = r8.f283157M
            r9.f302081l = r3
            r8.f283157M = r1
        L_0x0073:
            r9 = 5
            if (r8 == 0) goto L_0x00b9
            int r3 = r8.getRecyclerItemPosition()
            if (r3 == 0) goto L_0x007d
            goto L_0x00b9
        L_0x007d:
            int r3 = r8.getEditTextType()
            if (r3 == r11) goto L_0x00b9
            int r3 = r8.getSelectionStart()
            if (r3 == 0) goto L_0x008a
            goto L_0x00b9
        L_0x008a:
            int r3 = r7.size()
            if (r3 > 0) goto L_0x0091
            goto L_0x00b9
        L_0x0091:
            java.lang.Object r3 = r7.get(r1)
            xa3.c r3 = (xa3.C102587c) r3
            int r3 = r3.mo142212c()
            if (r3 == r11) goto L_0x00a9
            r11 = 6
            if (r3 == r11) goto L_0x00a9
            if (r3 == r9) goto L_0x00a9
            r11 = 3
            if (r3 == r11) goto L_0x00a9
            r11 = 4
            if (r3 == r11) goto L_0x00a9
            goto L_0x00b9
        L_0x00a9:
            xa3.i r11 = new xa3.i
            r11.<init>()
            java.lang.String r3 = ""
            r11.f302126s = r3
            r11.f302071b = r1
            r11.f302077h = r1
            r7.add(r1, r11)
        L_0x00b9:
            monitor-enter(r6)
            if (r8 != 0) goto L_0x00eb
            int r8 = r6.mo126186F()     // Catch:{ all -> 0x0282 }
            r6.mo126199i()     // Catch:{ all -> 0x0282 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0282 }
            r9 = r8
        L_0x00c8:
            boolean r11 = r7.hasNext()     // Catch:{ all -> 0x0282 }
            if (r11 == 0) goto L_0x01dc
            java.lang.Object r11 = r7.next()     // Catch:{ all -> 0x0282 }
            xa3.c r11 = (xa3.C102587c) r11     // Catch:{ all -> 0x0282 }
            r6.mo126213w(r11)     // Catch:{ all -> 0x0282 }
            if (r11 == 0) goto L_0x00e5
            java.util.ArrayList<xa3.c> r0 = r6.f263945a     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x00e5
            r0.add(r11)     // Catch:{ all -> 0x0282 }
            r6.mo126190J(r11, r2)     // Catch:{ all -> 0x0282 }
            r11 = 1
            goto L_0x00e6
        L_0x00e5:
            r11 = 0
        L_0x00e6:
            if (r11 == 0) goto L_0x00c8
            int r9 = r9 + 1
            goto L_0x00c8
        L_0x00eb:
            int r11 = r8.getRecyclerItemPosition()     // Catch:{ all -> 0x0282 }
            xa3.c r3 = r6.mo126201k(r11)     // Catch:{ all -> 0x0282 }
            if (r3 != 0) goto L_0x00f7
            monitor-exit(r6)     // Catch:{ all -> 0x0282 }
            return r0
        L_0x00f7:
            r6.mo126199i()     // Catch:{ all -> 0x0282 }
            int r0 = r8.getEditTextType()     // Catch:{ all -> 0x0282 }
            if (r0 != 0) goto L_0x01b6
            int r0 = r3.mo142212c()     // Catch:{ all -> 0x0282 }
            if (r0 != r2) goto L_0x01b6
            bb3.i r0 = r8.getSelection()     // Catch:{ all -> 0x0282 }
            android.text.Editable r8 = r8.getText()     // Catch:{ all -> 0x0282 }
            int r4 = r0.f263989d     // Catch:{ all -> 0x0282 }
            java.lang.CharSequence r4 = r8.subSequence(r1, r4)     // Catch:{ all -> 0x0282 }
            int r0 = r0.f263990e     // Catch:{ all -> 0x0282 }
            int r5 = r8.length()     // Catch:{ all -> 0x0282 }
            java.lang.CharSequence r8 = r8.subSequence(r0, r5)     // Catch:{ all -> 0x0282 }
            android.text.Spanned r4 = (android.text.Spanned) r4     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = za3.C102990c.m136185a(r4)     // Catch:{ all -> 0x0282 }
            android.text.Spanned r8 = (android.text.Spanned) r8     // Catch:{ all -> 0x0282 }
            java.lang.String r8 = za3.C102990c.m136185a(r8)     // Catch:{ all -> 0x0282 }
            xa3.i r3 = (xa3.C102593i) r3     // Catch:{ all -> 0x0282 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ all -> 0x0282 }
            if (r4 != 0) goto L_0x0171
            java.lang.String r4 = "<br/>"
            boolean r4 = r0.endsWith(r4)     // Catch:{ all -> 0x0282 }
            if (r4 == 0) goto L_0x0143
            int r4 = r0.length()     // Catch:{ all -> 0x0282 }
            int r4 = r4 - r9
            java.lang.String r0 = r0.substring(r1, r4)     // Catch:{ all -> 0x0282 }
        L_0x0143:
            r3.f302126s = r0     // Catch:{ all -> 0x0282 }
            int r11 = r11 + 1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ all -> 0x0282 }
            if (r0 != 0) goto L_0x0198
            xa3.i r0 = new xa3.i     // Catch:{ all -> 0x0282 }
            r0.<init>()     // Catch:{ all -> 0x0282 }
            r0.f302099p = r2     // Catch:{ all -> 0x0282 }
            java.lang.String r3 = "<br/>"
            boolean r3 = r8.startsWith(r3)     // Catch:{ all -> 0x0282 }
            if (r3 == 0) goto L_0x0164
            int r3 = r8.length()     // Catch:{ all -> 0x0282 }
            java.lang.String r8 = r8.substring(r9, r3)     // Catch:{ all -> 0x0282 }
        L_0x0164:
            r0.f302126s = r8     // Catch:{ all -> 0x0282 }
            r0.f302072c = r1     // Catch:{ all -> 0x0282 }
            r0.f302071b = r1     // Catch:{ all -> 0x0282 }
            r0.f302077h = r1     // Catch:{ all -> 0x0282 }
            r6.mo126193c(r11, r0, r1)     // Catch:{ all -> 0x0282 }
            r8 = 1
            goto L_0x0199
        L_0x0171:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ all -> 0x0282 }
            if (r0 != 0) goto L_0x018a
            java.lang.String r0 = "<br/>"
            boolean r0 = r8.startsWith(r0)     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x0187
            int r0 = r8.length()     // Catch:{ all -> 0x0282 }
            java.lang.String r8 = r8.substring(r9, r0)     // Catch:{ all -> 0x0282 }
        L_0x0187:
            r3.f302126s = r8     // Catch:{ all -> 0x0282 }
            goto L_0x0198
        L_0x018a:
            r6.mo126181A(r11, r1)     // Catch:{ all -> 0x0282 }
            if (r10 == 0) goto L_0x0198
            ab3.a r8 = r6.f263946b     // Catch:{ all -> 0x0282 }
            if (r8 == 0) goto L_0x0198
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r8 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r8     // Catch:{ all -> 0x0282 }
            r8.mo134935d5(r11)     // Catch:{ all -> 0x0282 }
        L_0x0198:
            r8 = 0
        L_0x0199:
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0282 }
            r9 = r11
        L_0x019e:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x01de
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0282 }
            xa3.c r0 = (xa3.C102587c) r0     // Catch:{ all -> 0x0282 }
            r6.mo126213w(r0)     // Catch:{ all -> 0x0282 }
            boolean r0 = r6.mo126193c(r9, r0, r1)     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x019e
            int r9 = r9 + 1
            goto L_0x019e
        L_0x01b6:
            int r8 = r8.getEditTextType()     // Catch:{ all -> 0x0282 }
            if (r8 == r2) goto L_0x01be
            int r11 = r11 + 1
        L_0x01be:
            r8 = r11
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0282 }
            r9 = r8
        L_0x01c4:
            boolean r11 = r7.hasNext()     // Catch:{ all -> 0x0282 }
            if (r11 == 0) goto L_0x01dc
            java.lang.Object r11 = r7.next()     // Catch:{ all -> 0x0282 }
            xa3.c r11 = (xa3.C102587c) r11     // Catch:{ all -> 0x0282 }
            r6.mo126213w(r11)     // Catch:{ all -> 0x0282 }
            boolean r11 = r6.mo126193c(r9, r11, r1)     // Catch:{ all -> 0x0282 }
            if (r11 == 0) goto L_0x01c4
            int r9 = r9 + 1
            goto L_0x01c4
        L_0x01dc:
            r11 = r8
            r8 = 0
        L_0x01de:
            monitor-exit(r6)     // Catch:{ all -> 0x0282 }
            int r7 = r9 + -1
            if (r7 < 0) goto L_0x01ea
            int r0 = r6.mo126186F()
            if (r7 >= r0) goto L_0x01ea
            goto L_0x01ef
        L_0x01ea:
            int r7 = r6.mo126186F()
            int r7 = r7 - r2
        L_0x01ef:
            if (r13 == 0) goto L_0x021f
            int r7 = r7 + 1
            int r9 = r9 + 1
            r6.mo126199i()
            int r13 = r6.mo126186F()
            if (r7 >= r13) goto L_0x020b
            xa3.c r13 = r6.mo126201k(r7)
            if (r13 == 0) goto L_0x021f
            r13.f302072c = r1
            r13.f302071b = r2
            r13.f302077h = r1
            goto L_0x021f
        L_0x020b:
            xa3.i r13 = new xa3.i
            r13.<init>()
            r13.f302099p = r2
            java.lang.String r0 = ""
            r13.f302126s = r0
            r13.f302072c = r1
            r13.f302071b = r2
            r13.f302077h = r1
            r6.mo126193c(r7, r13, r1)
        L_0x021f:
            ab3.a r13 = r6.f263946b
            if (r13 == 0) goto L_0x027e
            if (r10 == 0) goto L_0x0251
            int r9 = r9 - r11
            if (r8 == 0) goto L_0x022a
            int r9 = r9 + 1
        L_0x022a:
            if (r11 < 0) goto L_0x0233
            if (r9 <= 0) goto L_0x0233
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r13 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r13
            r13.mo134942n4(r11, r9)
        L_0x0233:
            if (r11 <= 0) goto L_0x0243
            ab3.a r8 = r6.f263946b
            int r11 = r11 - r2
            int r9 = r6.mo126186F()
            int r9 = r9 - r11
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r8 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r8
            r8.mo134931Z7(r11, r9)
            goto L_0x0251
        L_0x0243:
            if (r11 != 0) goto L_0x0251
            ab3.a r8 = r6.f263946b
            int r9 = r6.mo126186F()
            int r9 = r9 - r11
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r8 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r8
            r8.mo134931Z7(r11, r9)
        L_0x0251:
            if (r12 == 0) goto L_0x0261
            ab3.a r8 = r6.f263946b
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r8 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r8
            com.tencent.mm.sdk.platformtools.MMHandler r9 = r8.f283212E
            com.tencent.mm.plugin.wenote.ui.nativenote.k r10 = new com.tencent.mm.plugin.wenote.ui.nativenote.k
            r10.<init>(r8)
            r9.post(r10)
        L_0x0261:
            ab3.a r8 = r6.f263946b
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r8 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r8
            if (r7 < 0) goto L_0x027b
            bb3.d r9 = r8.f283238X0
            int r9 = r9.mo126186F()
            if (r7 < r9) goto L_0x0270
            goto L_0x027e
        L_0x0270:
            com.tencent.mm.sdk.platformtools.MMHandler r9 = r8.f283212E
            com.tencent.mm.plugin.wenote.ui.nativenote.j r10 = new com.tencent.mm.plugin.wenote.ui.nativenote.j
            r10.<init>(r8, r7)
            r9.post(r10)
            goto L_0x027e
        L_0x027b:
            r8.getClass()
        L_0x027e:
            r6.mo126214x()
            return r7
        L_0x0282:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0282 }
            throw r7
        L_0x0285:
            java.lang.String r7 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r8 = "insertItemList,error,return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bb3.C92221d.mo126210t(java.util.ArrayList, com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText, boolean, boolean, boolean, boolean, boolean):int");
    }

    /* renamed from: u */
    public void mo126211u() {
        this.f263946b = null;
        ArrayList<C102587c> arrayList = this.f263945a;
        if (arrayList != null) {
            Iterator<C102587c> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo142214d();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a3, code lost:
        if (r7 != 0) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a5, code lost:
        ((com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r4.f263946b).mo134931Z7(r7, mo126186F() - r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b1, code lost:
        r6 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r4.f263946b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b5, code lost:
        if (r5 < 0) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01bd, code lost:
        if (r5 < r6.f283238X0.mo126186F()) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c0, code lost:
        r6.f283212E.post(new com.tencent.p014mm.plugin.wenote.p131ui.nativenote.C6637j(r6, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01cb, code lost:
        r6.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ce, code lost:
        mo126214x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d1, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016f, code lost:
        r5 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0171, code lost:
        if (r5 < 0) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0177, code lost:
        if (r5 >= mo126186F()) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017a, code lost:
        r5 = mo126186F() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017f, code lost:
        r6 = r4.f263946b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0181, code lost:
        if (r6 == null) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0183, code lost:
        if (r11 == false) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0185, code lost:
        r8 = r8 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0186, code lost:
        if (r1 == false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0188, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x018a, code lost:
        if (r7 < 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x018c, code lost:
        if (r8 <= 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x018e, code lost:
        ((com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r6).mo134942n4(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0193, code lost:
        if (r7 <= 0) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0195, code lost:
        r7 = r7 - 1;
        ((com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r4.f263946b).mo134931Z7(r7, mo126186F() - r7);
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0111  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo126212v(java.util.ArrayList<xa3.C102587c> r5, int r6, int r7, int r8, int r9, boolean r10, boolean r11) {
        /*
            r4 = this;
            r0 = -1
            if (r5 == 0) goto L_0x01d5
            int r1 = r5.size()
            if (r1 <= 0) goto L_0x01d5
            java.util.ArrayList<xa3.c> r1 = r4.f263945a
            if (r1 == 0) goto L_0x01d5
            if (r7 < 0) goto L_0x01d5
            if (r8 < 0) goto L_0x01d5
            if (r9 < 0) goto L_0x01d5
            if (r9 >= r8) goto L_0x0017
            goto L_0x01d5
        L_0x0017:
            i00.b r1 = wa3.C102364c.vx0()
            wa3.e r1 = r1.mo137946Rd()
            if (r1 != 0) goto L_0x002a
            java.lang.String r5 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r6 = "pasteItemList, but get wnnote base is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
            return r0
        L_0x002a:
            r1 = 0
            r2 = 1
            if (r10 == 0) goto L_0x004a
            int r10 = r5.size()
            int r10 = r10 - r2
            java.lang.Object r10 = r5.get(r10)
            xa3.c r10 = (xa3.C102587c) r10
            if (r10 != 0) goto L_0x0044
            java.lang.String r5 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r6 = "pasteItemList, lastInsertItem is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
            return r0
        L_0x0044:
            r10.f302072c = r0
            r10.f302071b = r2
            r10.f302077h = r1
        L_0x004a:
            xa3.c r10 = r4.mo126201k(r7)
            if (r10 != 0) goto L_0x0059
            java.lang.String r5 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r6 = "pasteItemList, item is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
            return r0
        L_0x0059:
            monitor-enter(r4)
            r4.mo126199i()     // Catch:{ all -> 0x01d2 }
            if (r6 != 0) goto L_0x014d
            int r3 = r10.mo142212c()     // Catch:{ all -> 0x01d2 }
            if (r3 != r2) goto L_0x014d
            r6 = r10
            xa3.i r6 = (xa3.C102593i) r6     // Catch:{ all -> 0x01d2 }
            java.lang.String r6 = r6.f302126s     // Catch:{ all -> 0x01d2 }
            android.text.Spanned r6 = za3.C102988a.m136184a(r6)     // Catch:{ all -> 0x01d2 }
            if (r6 == 0) goto L_0x0125
            int r3 = r6.length()     // Catch:{ all -> 0x01d2 }
            if (r8 > r3) goto L_0x0125
            int r3 = r6.length()     // Catch:{ all -> 0x01d2 }
            if (r9 <= r3) goto L_0x007e
            goto L_0x0125
        L_0x007e:
            java.lang.CharSequence r8 = r6.subSequence(r1, r8)     // Catch:{ all -> 0x01d2 }
            int r0 = r6.length()     // Catch:{ all -> 0x01d2 }
            java.lang.CharSequence r6 = r6.subSequence(r9, r0)     // Catch:{ all -> 0x01d2 }
            android.text.Spanned r8 = (android.text.Spanned) r8     // Catch:{ all -> 0x01d2 }
            java.lang.String r8 = za3.C102990c.m136185a(r8)     // Catch:{ all -> 0x01d2 }
            android.text.Spanned r6 = (android.text.Spanned) r6     // Catch:{ all -> 0x01d2 }
            java.lang.String r6 = za3.C102990c.m136185a(r6)     // Catch:{ all -> 0x01d2 }
            xa3.i r10 = (xa3.C102593i) r10     // Catch:{ all -> 0x01d2 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ all -> 0x01d2 }
            r0 = 5
            if (r9 != 0) goto L_0x00de
            java.lang.String r9 = "<br/>"
            boolean r9 = r8.endsWith(r9)     // Catch:{ all -> 0x01d2 }
            if (r9 == 0) goto L_0x00b0
            int r9 = r8.length()     // Catch:{ all -> 0x01d2 }
            int r9 = r9 - r0
            java.lang.String r8 = r8.substring(r1, r9)     // Catch:{ all -> 0x01d2 }
        L_0x00b0:
            r10.f302126s = r8     // Catch:{ all -> 0x01d2 }
            int r7 = r7 + 1
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ all -> 0x01d2 }
            if (r8 != 0) goto L_0x0105
            xa3.i r8 = new xa3.i     // Catch:{ all -> 0x01d2 }
            r8.<init>()     // Catch:{ all -> 0x01d2 }
            r8.f302099p = r2     // Catch:{ all -> 0x01d2 }
            java.lang.String r9 = "<br/>"
            boolean r9 = r6.startsWith(r9)     // Catch:{ all -> 0x01d2 }
            if (r9 == 0) goto L_0x00d1
            int r9 = r6.length()     // Catch:{ all -> 0x01d2 }
            java.lang.String r6 = r6.substring(r0, r9)     // Catch:{ all -> 0x01d2 }
        L_0x00d1:
            r8.f302126s = r6     // Catch:{ all -> 0x01d2 }
            r8.f302072c = r1     // Catch:{ all -> 0x01d2 }
            r8.f302071b = r1     // Catch:{ all -> 0x01d2 }
            r8.f302077h = r1     // Catch:{ all -> 0x01d2 }
            r4.mo126193c(r7, r8, r1)     // Catch:{ all -> 0x01d2 }
            r6 = 1
            goto L_0x0106
        L_0x00de:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ all -> 0x01d2 }
            if (r8 != 0) goto L_0x00f7
            java.lang.String r8 = "<br/>"
            boolean r8 = r6.startsWith(r8)     // Catch:{ all -> 0x01d2 }
            if (r8 == 0) goto L_0x00f4
            int r8 = r6.length()     // Catch:{ all -> 0x01d2 }
            java.lang.String r6 = r6.substring(r0, r8)     // Catch:{ all -> 0x01d2 }
        L_0x00f4:
            r10.f302126s = r6     // Catch:{ all -> 0x01d2 }
            goto L_0x0105
        L_0x00f7:
            r4.mo126181A(r7, r1)     // Catch:{ all -> 0x01d2 }
            if (r11 == 0) goto L_0x0105
            ab3.a r6 = r4.f263946b     // Catch:{ all -> 0x01d2 }
            if (r6 == 0) goto L_0x0105
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r6 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r6     // Catch:{ all -> 0x01d2 }
            r6.mo134935d5(r7)     // Catch:{ all -> 0x01d2 }
        L_0x0105:
            r6 = 0
        L_0x0106:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x01d2 }
            r8 = r7
        L_0x010b:
            boolean r9 = r5.hasNext()     // Catch:{ all -> 0x01d2 }
            if (r9 == 0) goto L_0x0123
            java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x01d2 }
            xa3.c r9 = (xa3.C102587c) r9     // Catch:{ all -> 0x01d2 }
            r4.mo126213w(r9)     // Catch:{ all -> 0x01d2 }
            boolean r9 = r4.mo126193c(r8, r9, r1)     // Catch:{ all -> 0x01d2 }
            if (r9 == 0) goto L_0x010b
            int r8 = r8 + 1
            goto L_0x010b
        L_0x0123:
            r1 = r6
            goto L_0x016e
        L_0x0125:
            java.lang.String r5 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r7 = "pasteItemList error, oriText:%d  startOff:%d  endOff:%d"
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x01d2 }
            if (r6 != 0) goto L_0x0131
            r6 = -1
            goto L_0x0135
        L_0x0131:
            int r6 = r6.length()     // Catch:{ all -> 0x01d2 }
        L_0x0135:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01d2 }
            r10[r1] = r6     // Catch:{ all -> 0x01d2 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x01d2 }
            r10[r2] = r6     // Catch:{ all -> 0x01d2 }
            r6 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01d2 }
            r10[r6] = r8     // Catch:{ all -> 0x01d2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r7, r10)     // Catch:{ all -> 0x01d2 }
            monitor-exit(r4)     // Catch:{ all -> 0x01d2 }
            return r0
        L_0x014d:
            if (r6 == r2) goto L_0x0151
            int r7 = r7 + 1
        L_0x0151:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x01d2 }
            r8 = r7
        L_0x0156:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x01d2 }
            if (r6 == 0) goto L_0x016e
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x01d2 }
            xa3.c r6 = (xa3.C102587c) r6     // Catch:{ all -> 0x01d2 }
            r4.mo126213w(r6)     // Catch:{ all -> 0x01d2 }
            boolean r6 = r4.mo126193c(r8, r6, r1)     // Catch:{ all -> 0x01d2 }
            if (r6 == 0) goto L_0x0156
            int r8 = r8 + 1
            goto L_0x0156
        L_0x016e:
            monitor-exit(r4)     // Catch:{ all -> 0x01d2 }
            int r5 = r8 + -1
            if (r5 < 0) goto L_0x017a
            int r6 = r4.mo126186F()
            if (r5 >= r6) goto L_0x017a
            goto L_0x017f
        L_0x017a:
            int r5 = r4.mo126186F()
            int r5 = r5 - r2
        L_0x017f:
            ab3.a r6 = r4.f263946b
            if (r6 == 0) goto L_0x01ce
            if (r11 == 0) goto L_0x01b1
            int r8 = r8 - r7
            if (r1 == 0) goto L_0x018a
            int r8 = r8 + 1
        L_0x018a:
            if (r7 < 0) goto L_0x0193
            if (r8 <= 0) goto L_0x0193
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r6 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r6
            r6.mo134942n4(r7, r8)
        L_0x0193:
            if (r7 <= 0) goto L_0x01a3
            ab3.a r6 = r4.f263946b
            int r7 = r7 - r2
            int r8 = r4.mo126186F()
            int r8 = r8 - r7
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r6 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r6
            r6.mo134931Z7(r7, r8)
            goto L_0x01b1
        L_0x01a3:
            if (r7 != 0) goto L_0x01b1
            ab3.a r6 = r4.f263946b
            int r8 = r4.mo126186F()
            int r8 = r8 - r7
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r6 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r6
            r6.mo134931Z7(r7, r8)
        L_0x01b1:
            ab3.a r6 = r4.f263946b
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r6 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r6
            if (r5 < 0) goto L_0x01cb
            bb3.d r7 = r6.f283238X0
            int r7 = r7.mo126186F()
            if (r5 < r7) goto L_0x01c0
            goto L_0x01ce
        L_0x01c0:
            com.tencent.mm.sdk.platformtools.MMHandler r7 = r6.f283212E
            com.tencent.mm.plugin.wenote.ui.nativenote.j r8 = new com.tencent.mm.plugin.wenote.ui.nativenote.j
            r8.<init>(r6, r5)
            r7.post(r8)
            goto L_0x01ce
        L_0x01cb:
            r6.getClass()
        L_0x01ce:
            r4.mo126214x()
            return r5
        L_0x01d2:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01d2 }
            throw r5
        L_0x01d5:
            java.lang.String r5 = "MicroMsg.Note.NoteDataManager"
            java.lang.String r6 = "pasteItemList,error,return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bb3.C92221d.mo126212v(java.util.ArrayList, int, int, int, int, boolean, boolean):int");
    }

    /* renamed from: w */
    public void mo126213w(C102587c cVar) {
        ArrayList<C102587c> arrayList;
        if (cVar != null) {
            C102599o oVar = (C102599o) cVar;
            if (oVar.mo142212c() > 1) {
                if (Util.isNullOrNil(oVar.f302098o)) {
                    if (this.f263948d == 0 && (arrayList = this.f263945a) != null) {
                        Iterator<C102587c> it = arrayList.iterator();
                        while (it.hasNext()) {
                            String e = ((C102599o) it.next()).mo142215e();
                            if (e.startsWith("WeNote_")) {
                                int i = Util.getInt(e.substring(7), -1);
                                int i2 = this.f263948d;
                                if (i <= i2) {
                                    i = i2;
                                }
                                this.f263948d = i;
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("WeNote_");
                    int i3 = this.f263948d + 1;
                    this.f263948d = i3;
                    sb.append(i3);
                    oVar.f302098o = sb.toString();
                }
                C102365e Rd = C102364c.vx0().mo137946Rd();
                if (Rd == null) {
                    Log.m105921e("MicroMsg.Note.NoteDataManager", "processItem,item is %s, but get wnnote base is null", cVar.toString());
                } else {
                    Map<String, C102599o> map = Rd.f301471h;
                    if (map == null) {
                        Log.m105921e("MicroMsg.Note.NoteDataManager", "processItem,item is %s, but mEditorIdToDataItem is null", cVar.toString());
                    } else {
                        map.put(oVar.f302098o, oVar);
                    }
                }
            }
            if (Util.isNullOrNil(cVar.f302070a)) {
                cVar.f302070a = C102368h.m135071b(cVar.toString(), 18);
            }
        }
    }

    /* renamed from: x */
    public void mo126214x() {
        C86709a0.m107525e().postToWorker(new C92223b());
    }

    /* renamed from: y */
    public boolean mo126215y(int i, boolean z) {
        return mo126216z(i, z, (C92393d) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r1 == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r11 == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        r11 = r9.f263946b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r11 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        ((com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r11).mo134935d5(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r10 <= 0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        r10 = r10 - 1;
        ((com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r9.f263946b).mo134931Z7(r10, r9.f263945a.size() - r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        ((com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r9.f263946b).mo134931Z7(r10, r9.f263945a.size() - r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        return r1;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo126216z(int r10, boolean r11, cb3.C92393d r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.ArrayList<xa3.c> r0 = r9.f263945a     // Catch:{ all -> 0x0068 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0039
            if (r10 < 0) goto L_0x0039
            int r0 = r0.size()     // Catch:{ all -> 0x0068 }
            if (r10 >= r0) goto L_0x0039
            bb3.e r3 = bb3.C92225e.f263960a     // Catch:{ all -> 0x0068 }
            java.util.ArrayList<xa3.c> r6 = r9.f263945a     // Catch:{ all -> 0x0068 }
            r4 = r10
            r5 = r11
            r7 = r12
            r8 = r9
            boolean r12 = r3.mo126222d(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0068 }
            if (r12 == 0) goto L_0x0028
            ab3.a r10 = r9.f263946b     // Catch:{ all -> 0x0068 }
            if (r10 == 0) goto L_0x0026
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r10 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r10     // Catch:{ all -> 0x0068 }
            r10.mo134930Y7()     // Catch:{ all -> 0x0068 }
        L_0x0026:
            monitor-exit(r9)     // Catch:{ all -> 0x0068 }
            return r2
        L_0x0028:
            java.util.ArrayList<xa3.c> r12 = r9.f263945a     // Catch:{ all -> 0x0068 }
            java.lang.Object r12 = r12.get(r10)     // Catch:{ all -> 0x0068 }
            xa3.c r12 = (xa3.C102587c) r12     // Catch:{ all -> 0x0068 }
            r9.mo126190J(r12, r1)     // Catch:{ all -> 0x0068 }
            java.util.ArrayList<xa3.c> r12 = r9.f263945a     // Catch:{ all -> 0x0068 }
            r12.remove(r10)     // Catch:{ all -> 0x0068 }
            r1 = 1
        L_0x0039:
            monitor-exit(r9)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x0067
            if (r11 == 0) goto L_0x0067
            ab3.a r11 = r9.f263946b
            if (r11 == 0) goto L_0x0067
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r11 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r11
            r11.mo134935d5(r10)
            if (r10 <= 0) goto L_0x0059
            ab3.a r11 = r9.f263946b
            int r10 = r10 - r2
            java.util.ArrayList<xa3.c> r12 = r9.f263945a
            int r12 = r12.size()
            int r12 = r12 - r10
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r11 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r11
            r11.mo134931Z7(r10, r12)
            goto L_0x0067
        L_0x0059:
            ab3.a r11 = r9.f263946b
            java.util.ArrayList<xa3.c> r12 = r9.f263945a
            int r12 = r12.size()
            int r12 = r12 - r10
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI r11 = (com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI) r11
            r11.mo134931Z7(r10, r12)
        L_0x0067:
            return r1
        L_0x0068:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0068 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bb3.C92221d.mo126216z(int, boolean, cb3.d):boolean");
    }
}
