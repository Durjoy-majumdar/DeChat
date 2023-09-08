package com.tencent.p014mm.smiley;

import a70.C112760b;
import com.tencent.p014mm.autogen.mmdata.rpt.EmojiInitProfileStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.smiley.C96940i;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import java.io.DataInputStream;
import java.util.Iterator;
import java.util.LinkedList;
import p523fp.C32147e;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: com.tencent.mm.smiley.r */
public final class C96965r {

    /* renamed from: d */
    public static boolean f284067d;

    /* renamed from: e */
    public static final String f284068e;

    /* renamed from: f */
    public static String f284069f;

    /* renamed from: g */
    public static String f284070g;

    /* renamed from: a */
    public C96964q f284071a = new C96964q();

    /* renamed from: b */
    public C96968b f284072b;

    /* renamed from: c */
    public boolean f284073c;

    /* renamed from: com.tencent.mm.smiley.r$c */
    public static final class C44649c {

        /* renamed from: a */
        public static final C96965r f121057a = new C96965r((C8480h) null);
    }

    /* renamed from: com.tencent.mm.smiley.r$a */
    public static final class C96966a {

        /* renamed from: com.tencent.mm.smiley.r$a$a */
        public static final class C96967a {

            /* renamed from: a */
            public static final C96966a f284074a = new C96966a((C8480h) null);
        }

        public C96966a(C8480h hVar) {
        }

        /* renamed from: a */
        public static void m124550a(C96966a aVar, long j, int i, long j2, int i2, boolean z, int i3, Object obj) {
            aVar.getClass();
            EmojiInitProfileStruct emojiInitProfileStruct = new EmojiInitProfileStruct();
            emojiInitProfileStruct.f265421e = i2;
            emojiInitProfileStruct.f265423g = i;
            emojiInitProfileStruct.f265422f = j;
            emojiInitProfileStruct.f265420d = j2;
            emojiInitProfileStruct.mo86054n();
        }
    }

    /* renamed from: com.tencent.mm.smiley.r$b */
    public static final class C96968b {

        /* renamed from: a */
        public final int f284075a;

        /* renamed from: b */
        public final long f284076b;

        /* renamed from: c */
        public final int f284077c;

        /* renamed from: d */
        public final int f284078d;

        public C96968b(int i, long j, int i2) {
            this.f284075a = i;
            this.f284076b = j;
            this.f284077c = i2;
            this.f284078d = i2 + 4 + 8 + 4;
        }
    }

    /* renamed from: com.tencent.mm.smiley.r$d */
    public static final class C96969d implements C96975y {

        /* renamed from: a */
        public final /* synthetic */ int f284079a;

        /* renamed from: b */
        public final /* synthetic */ C8478d0 f284080b;

        /* renamed from: c */
        public final /* synthetic */ C8478d0 f284081c;

        public C96969d(int i, C8478d0 d0Var, C8478d0 d0Var2) {
            this.f284079a = i;
            this.f284080b = d0Var;
            this.f284081c = d0Var2;
        }

        /* renamed from: a */
        public boolean mo135526a(C96974x xVar, int i, int i2) {
            C87412m.m108594g(xVar, "item");
            int i3 = i2 - 1;
            if (i3 <= this.f284079a) {
                this.f284080b.f27483d = i3;
            }
            this.f284081c.f27483d = i3;
            return true;
        }
    }

    static {
        String str = C112760b.m154216X() + "app_font";
        f284068e = str;
        f284069f = str + "/color_emoji_new";
        f284070g = str + "/color_emoji";
    }

    public C96965r(C8480h hVar) {
    }

    /* renamed from: a */
    public final void mo135549a(String str, boolean z) {
        C86009m1 m1Var = new C86009m1(f284068e);
        if (m1Var.mo119978p()) {
            m1Var.mo119966f();
        }
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        C86013q1.m106442c(str, f284069f);
        Log.m105924i("MicroMsg.EmojiResProcessor", "copyColorEmojiFile from " + str + " to " + f284069f + ", tryReCheck=[" + z + ']');
        if (z && MMApplicationContext.isMainProcess()) {
            Log.m105924i("MicroMsg.EmojiResProcessor", "copyColorEmojiFile: try checkEntireCurrentEmojiFile");
            Class cls = C32147e.class;
            String e6 = ((C32147e) C86312j.m106911c(cls)).mo58513e6(37, 8);
            String q = C86013q1.m106456q(f284069f);
            if (!C87412m.m108589b(e6, q)) {
                Log.m105924i("MicroMsg.EmojiResProcessor", "checkEntireCurrentEmojiFile: md5 match failed, originMd5:" + e6 + ", currentMd5:" + q);
                mo135549a(((C32147e) C86312j.m106911c(cls)).mo58507AD(37, 8), false);
                return;
            }
            Log.m105924i("MicroMsg.EmojiResProcessor", "checkEntireCurrentEmojiFile: md5 match success");
        }
    }

    /* renamed from: b */
    public final void mo135550b() {
        long currentTimeMillis = System.currentTimeMillis();
        C86009m1 m1Var = new C86009m1(f284068e);
        if (m1Var.mo119978p()) {
            m1Var.mo119966f();
        }
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        C86013q1.m106442c("assets:///color_emoji", f284070g);
        this.f284073c = true;
        Log.m105924i("MicroMsg.EmojiResProcessor", "copyOldColorEmojiFileFromAsset from asset. use time:" + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    /* renamed from: c */
    public final C96968b mo135551c(DataInputStream dataInputStream) {
        C87412m.m108594g(dataInputStream, "dis");
        return new C96968b(dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readInt());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
        if (r4 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006d, code lost:
        if (r4 != null) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x0063=Splitter:B:35:0x0063, B:27:0x004f=Splitter:B:27:0x004f} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.smiley.C96965r.C96968b mo135552d(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.EmojiResProcessor"
            java.lang.String r2 = "filePath"
            gy3.C87412m.m108594g(r11, r2)
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)
            r3 = 0
            if (r2 == 0) goto L_0x007b
            r2 = 0
            java.io.InputStream r11 = com.tencent.p014mm.vfs.C86013q1.m106423E(r11)     // Catch:{ IOException -> 0x005f, Exception -> 0x004b, all -> 0x0048 }
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0043, Exception -> 0x003e, all -> 0x003a }
            r4.<init>(r11)     // Catch:{ IOException -> 0x0043, Exception -> 0x003e, all -> 0x003a }
            int r2 = r4.readInt()     // Catch:{ IOException -> 0x0038, Exception -> 0x0036 }
            long r5 = r4.readLong()     // Catch:{ IOException -> 0x0038, Exception -> 0x0036 }
            int r7 = r4.readInt()     // Catch:{ IOException -> 0x0038, Exception -> 0x0036 }
            com.tencent.mm.smiley.r$b r8 = new com.tencent.mm.smiley.r$b     // Catch:{ IOException -> 0x0038, Exception -> 0x0036 }
            r8.<init>(r2, r5, r7)     // Catch:{ IOException -> 0x0038, Exception -> 0x0036 }
            if (r11 == 0) goto L_0x0030
            r11.close()
        L_0x0030:
            r4.close()
            return r8
        L_0x0034:
            r0 = move-exception
            goto L_0x003c
        L_0x0036:
            r2 = move-exception
            goto L_0x004f
        L_0x0038:
            r2 = move-exception
            goto L_0x0063
        L_0x003a:
            r0 = move-exception
            r4 = r2
        L_0x003c:
            r2 = r11
            goto L_0x0070
        L_0x003e:
            r4 = move-exception
            r9 = r4
            r4 = r2
            r2 = r9
            goto L_0x004f
        L_0x0043:
            r4 = move-exception
            r9 = r4
            r4 = r2
            r2 = r9
            goto L_0x0063
        L_0x0048:
            r0 = move-exception
            r4 = r2
            goto L_0x0070
        L_0x004b:
            r11 = move-exception
            r4 = r2
            r2 = r11
            r11 = r4
        L_0x004f:
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x0034 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r5)     // Catch:{ all -> 0x0034 }
            if (r11 == 0) goto L_0x0059
            r11.close()
        L_0x0059:
            if (r4 == 0) goto L_0x007b
        L_0x005b:
            r4.close()
            goto L_0x007b
        L_0x005f:
            r11 = move-exception
            r4 = r2
            r2 = r11
            r11 = r4
        L_0x0063:
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ all -> 0x0034 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r5)     // Catch:{ all -> 0x0034 }
            if (r11 == 0) goto L_0x006d
            r11.close()
        L_0x006d:
            if (r4 == 0) goto L_0x007b
            goto L_0x005b
        L_0x0070:
            if (r2 == 0) goto L_0x0075
            r2.close()
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r4.close()
        L_0x007a:
            throw r0
        L_0x007b:
            com.tencent.mm.smiley.r$b r11 = new com.tencent.mm.smiley.r$b
            r0 = 0
            r11.<init>(r3, r0, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.smiley.C96965r.mo135552d(java.lang.String):com.tencent.mm.smiley.r$b");
    }

    /* renamed from: e */
    public final C96973t0 mo135553e(int i) {
        boolean z = false;
        if (57345 <= i && i < 58680) {
            z = true;
        }
        if (!z) {
            return null;
        }
        C96976z zVar = C96940i.C96942b.f283995a.f283994e.f283932b.get(i, (Object) null);
        Object data = zVar != null ? zVar.getData() : null;
        if (data instanceof C96973t0) {
            return (C96973t0) data;
        }
        return null;
    }

    /* renamed from: f */
    public final long mo135554f() {
        C96968b bVar = this.f284072b;
        if (bVar != null) {
            return bVar.f284076b;
        }
        return 0;
    }

    /* renamed from: g */
    public final int mo135555g(String str, int i, int i2) {
        if (!f284067d) {
            return i2;
        }
        if (str != null) {
            if (!(str.length() == 0) && i >= 0 && i2 > 0) {
                if (str.length() <= i2) {
                    return str.length();
                }
                C8478d0 d0Var = new C8478d0();
                d0Var.f27483d = i;
                C8478d0 d0Var2 = new C8478d0();
                d0Var2.f27483d = -1;
                while (true) {
                    int i3 = d0Var.f27483d;
                    if (i3 >= i2) {
                        break;
                    }
                    if (C96940i.C96942b.f283995a.f283994e.f283932b.get(str.codePointAt(i3)) != null) {
                        C96940i.C96942b.f283995a.mo135530a(str, d0Var.f27483d, str.length(), new C96969d(i2, d0Var2, d0Var));
                    } else {
                        d0Var2.f27483d = d0Var.f27483d;
                    }
                    d0Var.f27483d++;
                }
                if (d0Var2.f27483d == -1) {
                    d0Var2.f27483d = i + 1;
                }
                return d0Var2.f27483d + 1;
            }
        }
        return 0;
    }

    /* renamed from: h */
    public final boolean mo135556h(DataInputStream dataInputStream, C96968b bVar, boolean z) {
        int i = bVar != null ? bVar.f284077c : 0;
        if (bVar == null || i <= 0) {
            return false;
        }
        byte[] bArr = new byte[i];
        dataInputStream.read(bArr);
        if (!this.f284073c) {
            this.f284071a.parseFrom(bArr);
        } else {
            C96929d dVar = new C96929d();
            dVar.parseFrom(bArr);
            LinkedList<C96938h> linkedList = dVar.f283949e;
            LinkedList<C96927c> linkedList2 = new LinkedList<>();
            LinkedList<C96971s0> linkedList3 = new LinkedList<>();
            LinkedList<C96928c0> linkedList4 = new LinkedList<>();
            Iterator<C96938h> it = linkedList.iterator();
            while (it.hasNext()) {
                C96938h next = it.next();
                C96927c cVar = new C96927c();
                int size = linkedList2.size();
                int i2 = next.f283978d;
                if (i2 != 0) {
                    cVar.f283943d.add(Integer.valueOf(i2));
                }
                int i3 = next.f283979e;
                if (i3 != 0) {
                    cVar.f283943d.add(Integer.valueOf(i3));
                }
                C96930d0 d0Var = new C96930d0();
                d0Var.f283953d = next.f283983i;
                d0Var.f283954e = next.f283984j;
                d0Var.f283955f = 64;
                d0Var.f283956g = 64;
                cVar.f283944e = d0Var;
                if (next.f283980f != 0) {
                    C96971s0 s0Var = new C96971s0();
                    s0Var.f284088d = next.f283980f;
                    s0Var.f284090f = size;
                    linkedList3.add(s0Var);
                }
                if (next.f283981g != -1) {
                    C96928c0 c0Var = new C96928c0();
                    c0Var.f283945d = next.f283981g;
                    c0Var.f283947f = size;
                    linkedList4.add(c0Var);
                }
                linkedList2.add(cVar);
            }
            C96964q qVar = new C96964q();
            qVar.f284064d = linkedList2;
            qVar.f284066f = linkedList4;
            qVar.f284065e = linkedList3;
            this.f284071a = qVar;
        }
        LinkedList<C96927c> linkedList5 = this.f284071a.f284064d;
        C87412m.m108593f(linkedList5, "mEmojiHeader.emojiDataItems");
        if (linkedList5.isEmpty()) {
            Log.m105924i("MicroMsg.EmojiResProcessor", "constructIndex failed , emoji items is empty.");
        } else {
            for (C96927c cVar2 : linkedList5) {
                LinkedList<Integer> linkedList6 = cVar2.f283943d;
                C87412m.m108593f(linkedList6, "emojiDataItem.codePoints");
                C96930d0 d0Var2 = cVar2.f283944e;
                C87412m.m108593f(d0Var2, "emojiDataItem.picItem");
                C96973t0 t0Var = new C96973t0(linkedList6, d0Var2);
                C96940i iVar = C96940i.C96942b.f283995a;
                iVar.getClass();
                iVar.f283994e.mo135512a(t0Var, 0, C96944j.f283997d);
            }
            LinkedList<C96971s0> linkedList7 = this.f284071a.f284065e;
            C87412m.m108593f(linkedList7, "mEmojiHeader.softbankEmojiItems");
            for (C96971s0 s0Var2 : linkedList7) {
                C96940i iVar2 = C96940i.C96942b.f283995a;
                C87412m.m108593f(s0Var2, "softbankItem");
                iVar2.getClass();
                C96927c cVar3 = (C96927c) C110818d0.m150917O(linkedList5, s0Var2.f284090f);
                if (cVar3 != null) {
                    LinkedList<Integer> linkedList8 = cVar3.f283943d;
                    C87412m.m108593f(linkedList8, "emojiDataItem.codePoints");
                    C96930d0 d0Var3 = cVar3.f283944e;
                    C87412m.m108593f(d0Var3, "emojiDataItem.picItem");
                    C96973t0 t0Var2 = new C96973t0(linkedList8, d0Var3);
                    C96960o0 o0Var = iVar2.f283994e;
                    int i4 = s0Var2.f284088d;
                    o0Var.getClass();
                    C96925b c = o0Var.mo135514c();
                    c.f283931a = t0Var2;
                    synchronized (o0Var.f283932b) {
                        o0Var.f283932b.put(i4, c);
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                }
            }
        }
        C96964q qVar2 = this.f284071a;
        LinkedList<C96971s0> linkedList9 = qVar2.f284065e;
        LinkedList<C96928c0> linkedList10 = qVar2.f284066f;
        LinkedList<C96927c> linkedList11 = qVar2.f284064d;
        Iterator<C96971s0> it4 = linkedList9.iterator();
        while (it4.hasNext()) {
            C96971s0 next2 = it4.next();
            C96940i.C96942b.f283995a.f283990a.append(next2.f284088d, next2);
            C96940i.C96942b.f283995a.f283991b.append(linkedList11.get(next2.f284090f).f283944e.f283953d, next2);
        }
        Iterator<C96928c0> it5 = linkedList10.iterator();
        while (it5.hasNext()) {
            C96928c0 next3 = it5.next();
            C96940i.C96942b.f283995a.f283992c.append(next3.f283945d, next3);
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r13v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r13v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01ab, code lost:
        if (com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess() == false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01ad, code lost:
        com.tencent.p014mm.smiley.C96965r.C96966a.m124550a(com.tencent.p014mm.smiley.C96965r.C96966a.C96967a.f284074a, java.lang.System.currentTimeMillis() - r4, r13, mo135554f(), r1.f284071a.f284064d.size(), false, 16, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01f7, code lost:
        if (com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess() == false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01f9, code lost:
        com.tencent.p014mm.smiley.C96965r.C96966a.m124550a(com.tencent.p014mm.smiley.C96965r.C96966a.C96967a.f284074a, java.lang.System.currentTimeMillis() - r4, r17, mo135554f(), r1.f284071a.f284064d.size(), false, 16, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0216, code lost:
        ((p629ny.C76979h) di3.C86312j.m106911c(r2)).clearCache();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014b, code lost:
        if (com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess() == false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x017b, code lost:
        if (com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess() == false) goto L_0x0216;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0191 A[SYNTHETIC, Splitter:B:101:0x0191] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x019b A[Catch:{ IOException -> 0x0197, all -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x026c A[SYNTHETIC, Splitter:B:135:0x026c] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0276 A[Catch:{ IOException -> 0x0272, all -> 0x0270, all -> 0x02a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074 A[Catch:{ IOException -> 0x00a7, all -> 0x00a4, all -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0131 A[SYNTHETIC, Splitter:B:72:0x0131] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x013b A[Catch:{ IOException -> 0x0137, all -> 0x0135, all -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0158  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo135557i() {
        /*
            r24 = this;
            r1 = r24
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            java.lang.String r3 = ""
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = f284069f
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            r6 = 0
            r7 = 1
            java.lang.String r8 = "MicroMsg.EmojiResProcessor"
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = f284070g
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 == 0) goto L_0x0021
            r1.f284073c = r7
            goto L_0x002d
        L_0x0021:
            r24.mo135550b()
            goto L_0x002d
        L_0x0025:
            r1.f284073c = r6
            java.lang.String r0 = "new emoji color file exist."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
        L_0x002d:
            r9 = 0
            r10 = 2
            r11 = -1
            java.lang.String r0 = "initRes: start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ IOException -> 0x0185, Exception -> 0x0125, all -> 0x011d }
            boolean r0 = r1.f284073c     // Catch:{ IOException -> 0x0185, Exception -> 0x0125, all -> 0x011d }
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = f284070g     // Catch:{ IOException -> 0x0185, Exception -> 0x0125, all -> 0x011d }
            goto L_0x003e
        L_0x003c:
            java.lang.String r0 = f284069f     // Catch:{ IOException -> 0x0185, Exception -> 0x0125, all -> 0x011d }
        L_0x003e:
            java.io.InputStream r12 = com.tencent.p014mm.vfs.C86013q1.m106423E(r0)     // Catch:{ IOException -> 0x0185, Exception -> 0x0125, all -> 0x011d }
            java.io.DataInputStream r13 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0119, Exception -> 0x0116, all -> 0x0114 }
            r13.<init>(r12)     // Catch:{ IOException -> 0x0119, Exception -> 0x0116, all -> 0x0114 }
            com.tencent.mm.smiley.r$b r0 = r1.mo135551c(r13)     // Catch:{ IOException -> 0x0111, Exception -> 0x010f, all -> 0x010c }
            r1.f284072b = r0     // Catch:{ IOException -> 0x0111, Exception -> 0x010f, all -> 0x010c }
            int r0 = r0.f284077c     // Catch:{ IOException -> 0x0111, Exception -> 0x010f, all -> 0x010c }
            if (r0 <= 0) goto L_0x0060
            int r14 = r13.available()     // Catch:{ IOException -> 0x0111, Exception -> 0x010f, all -> 0x010c }
            if (r0 <= r14) goto L_0x0058
            goto L_0x0060
        L_0x0058:
            com.tencent.mm.smiley.r$b r0 = r1.f284072b     // Catch:{ IOException -> 0x0111, Exception -> 0x010f, all -> 0x010c }
            boolean r0 = r1.mo135556h(r13, r0, r6)     // Catch:{ IOException -> 0x0111, Exception -> 0x010f, all -> 0x010c }
            r10 = r0
            goto L_0x006f
        L_0x0060:
            java.lang.String r14 = "emoji, header size error %d"
            java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0111, Exception -> 0x010f, all -> 0x010c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0111, Exception -> 0x010f, all -> 0x010c }
            r15[r6] = r0     // Catch:{ IOException -> 0x0111, Exception -> 0x010f, all -> 0x010c }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r14, r15)     // Catch:{ IOException -> 0x0111, Exception -> 0x010f, all -> 0x010c }
            r11 = 3
            r10 = 0
        L_0x006f:
            r13.close()     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
            if (r12 == 0) goto L_0x0077
            r12.close()     // Catch:{ IOException -> 0x00a7, all -> 0x00a4 }
        L_0x0077:
            f284067d = r10
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x00d4
            long r12 = java.lang.System.currentTimeMillis()
            long r15 = r12 - r4
            if (r10 == 0) goto L_0x008a
            r17 = 0
            goto L_0x008c
        L_0x008a:
            r17 = r11
        L_0x008c:
            com.tencent.mm.smiley.r$a r14 = com.tencent.p014mm.smiley.C96965r.C96966a.C96967a.f284074a
            long r18 = r24.mo135554f()
            com.tencent.mm.smiley.q r0 = r1.f284071a
            java.util.LinkedList<com.tencent.mm.smiley.c> r0 = r0.f284064d
            int r20 = r0.size()
            r21 = 0
            r22 = 16
            r23 = 0
            com.tencent.p014mm.smiley.C96965r.C96966a.m124550a(r14, r15, r17, r18, r20, r21, r22, r23)
            goto L_0x00d4
        L_0x00a4:
            r0 = move-exception
            r7 = r11
            goto L_0x00e1
        L_0x00a7:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x00e0 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r3, r11)     // Catch:{ all -> 0x00e0 }
            f284067d = r10
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x00d4
            long r6 = java.lang.System.currentTimeMillis()
            long r12 = r6 - r4
            r14 = r10 ^ 1
            com.tencent.mm.smiley.r$a r11 = com.tencent.p014mm.smiley.C96965r.C96966a.C96967a.f284074a
            long r15 = r24.mo135554f()
            com.tencent.mm.smiley.q r0 = r1.f284071a
            java.util.LinkedList<com.tencent.mm.smiley.c> r0 = r0.f284064d
            int r17 = r0.size()
            r18 = 0
            r19 = 16
            r20 = 0
            com.tencent.p014mm.smiley.C96965r.C96966a.m124550a(r11, r12, r14, r15, r17, r18, r19, r20)
        L_0x00d4:
            di3.d r0 = di3.C86312j.m106911c(r2)
            ny.h r0 = (p629ny.C76979h) r0
            r0.clearCache()
            r6 = r10
            goto L_0x021f
        L_0x00e0:
            r0 = move-exception
        L_0x00e1:
            f284067d = r10
            boolean r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r2 == 0) goto L_0x010b
            long r2 = java.lang.System.currentTimeMillis()
            long r12 = r2 - r4
            if (r10 == 0) goto L_0x00f3
            r14 = 0
            goto L_0x00f4
        L_0x00f3:
            r14 = r7
        L_0x00f4:
            com.tencent.mm.smiley.r$a r11 = com.tencent.p014mm.smiley.C96965r.C96966a.C96967a.f284074a
            long r15 = r24.mo135554f()
            com.tencent.mm.smiley.q r2 = r1.f284071a
            java.util.LinkedList<com.tencent.mm.smiley.c> r2 = r2.f284064d
            int r17 = r2.size()
            r18 = 0
            r19 = 16
            r20 = 0
            com.tencent.p014mm.smiley.C96965r.C96966a.m124550a(r11, r12, r14, r15, r17, r18, r19, r20)
        L_0x010b:
            throw r0
        L_0x010c:
            r0 = move-exception
            r9 = r13
            goto L_0x011f
        L_0x010f:
            r0 = move-exception
            goto L_0x0128
        L_0x0111:
            r0 = move-exception
            goto L_0x0188
        L_0x0114:
            r0 = move-exception
            goto L_0x011f
        L_0x0116:
            r0 = move-exception
            r13 = r9
            goto L_0x0128
        L_0x0119:
            r0 = move-exception
            r13 = r9
            goto L_0x0188
        L_0x011d:
            r0 = move-exception
            r12 = r9
        L_0x011f:
            r13 = r9
            r17 = -1
            r9 = r0
            goto L_0x026a
        L_0x0125:
            r0 = move-exception
            r12 = r9
            r13 = r12
        L_0x0128:
            r17 = 2
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x017f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r3, r11)     // Catch:{ all -> 0x017f }
            if (r13 == 0) goto L_0x0139
            r13.close()     // Catch:{ IOException -> 0x0137, all -> 0x0135 }
            goto L_0x0139
        L_0x0135:
            r0 = move-exception
            goto L_0x0150
        L_0x0137:
            r0 = move-exception
            goto L_0x013f
        L_0x0139:
            if (r12 == 0) goto L_0x0175
            r12.close()     // Catch:{ IOException -> 0x0137, all -> 0x0135 }
            goto L_0x0175
        L_0x013f:
            r13 = 1
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x014e }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r3, r10)     // Catch:{ all -> 0x014e }
            f284067d = r6
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x0216
            goto L_0x01ad
        L_0x014e:
            r0 = move-exception
            r10 = 1
        L_0x0150:
            f284067d = r6
            boolean r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r2 == 0) goto L_0x0174
            long r2 = java.lang.System.currentTimeMillis()
            long r8 = r2 - r4
            com.tencent.mm.smiley.r$a r7 = com.tencent.p014mm.smiley.C96965r.C96966a.C96967a.f284074a
            long r11 = r24.mo135554f()
            com.tencent.mm.smiley.q r2 = r1.f284071a
            java.util.LinkedList<com.tencent.mm.smiley.c> r2 = r2.f284064d
            int r13 = r2.size()
            r14 = 0
            r15 = 16
            r16 = 0
            com.tencent.p014mm.smiley.C96965r.C96966a.m124550a(r7, r8, r10, r11, r13, r14, r15, r16)
        L_0x0174:
            throw r0
        L_0x0175:
            f284067d = r6
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x0216
            goto L_0x01f9
        L_0x017f:
            r0 = move-exception
            r9 = r0
            r17 = 2
            goto L_0x026a
        L_0x0185:
            r0 = move-exception
            r12 = r9
            r13 = r12
        L_0x0188:
            r17 = 1
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x0266 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r3, r10)     // Catch:{ all -> 0x0266 }
            if (r13 == 0) goto L_0x0199
            r13.close()     // Catch:{ IOException -> 0x0197 }
            goto L_0x0199
        L_0x0195:
            r0 = move-exception
            goto L_0x01cb
        L_0x0197:
            r0 = move-exception
            goto L_0x019f
        L_0x0199:
            if (r12 == 0) goto L_0x01f1
            r12.close()     // Catch:{ IOException -> 0x0197 }
            goto L_0x01f1
        L_0x019f:
            r13 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0195 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r3, r7)     // Catch:{ all -> 0x0195 }
            f284067d = r6
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x0216
        L_0x01ad:
            long r10 = java.lang.System.currentTimeMillis()
            long r11 = r10 - r4
            com.tencent.mm.smiley.r$a r10 = com.tencent.p014mm.smiley.C96965r.C96966a.C96967a.f284074a
            long r14 = r24.mo135554f()
            com.tencent.mm.smiley.q r0 = r1.f284071a
            java.util.LinkedList<com.tencent.mm.smiley.c> r0 = r0.f284064d
            int r16 = r0.size()
            r17 = 0
            r18 = 16
            r19 = 0
            com.tencent.p014mm.smiley.C96965r.C96966a.m124550a(r10, r11, r13, r14, r16, r17, r18, r19)
            goto L_0x0216
        L_0x01cb:
            r10 = 1
            f284067d = r6
            boolean r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r2 == 0) goto L_0x01f0
            long r2 = java.lang.System.currentTimeMillis()
            long r8 = r2 - r4
            com.tencent.mm.smiley.r$a r7 = com.tencent.p014mm.smiley.C96965r.C96966a.C96967a.f284074a
            long r11 = r24.mo135554f()
            com.tencent.mm.smiley.q r2 = r1.f284071a
            java.util.LinkedList<com.tencent.mm.smiley.c> r2 = r2.f284064d
            int r13 = r2.size()
            r14 = 0
            r15 = 16
            r16 = 0
            com.tencent.p014mm.smiley.C96965r.C96966a.m124550a(r7, r8, r10, r11, r13, r14, r15, r16)
        L_0x01f0:
            throw r0
        L_0x01f1:
            f284067d = r6
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x0216
        L_0x01f9:
            long r10 = java.lang.System.currentTimeMillis()
            long r15 = r10 - r4
            com.tencent.mm.smiley.r$a r14 = com.tencent.p014mm.smiley.C96965r.C96966a.C96967a.f284074a
            long r18 = r24.mo135554f()
            com.tencent.mm.smiley.q r0 = r1.f284071a
            java.util.LinkedList<com.tencent.mm.smiley.c> r0 = r0.f284064d
            int r20 = r0.size()
            r21 = 0
            r22 = 16
            r23 = 0
            com.tencent.p014mm.smiley.C96965r.C96966a.m124550a(r14, r15, r17, r18, r20, r21, r22, r23)
        L_0x0216:
            di3.d r0 = di3.C86312j.m106911c(r2)
            ny.h r0 = (p629ny.C76979h) r0
            r0.clearCache()
        L_0x021f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "init: supportVersion:"
            r0.append(r2)
            com.tencent.mm.smiley.r$b r2 = r1.f284072b
            if (r2 == 0) goto L_0x0234
            int r2 = r2.f284075a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0235
        L_0x0234:
            r2 = r9
        L_0x0235:
            r0.append(r2)
            java.lang.String r2 = ", emojiVersion:"
            r0.append(r2)
            com.tencent.mm.smiley.r$b r2 = r1.f284072b
            if (r2 == 0) goto L_0x0247
            long r2 = r2.f284076b
            java.lang.Long r9 = java.lang.Long.valueOf(r2)
        L_0x0247:
            r0.append(r9)
            java.lang.String r2 = " , process:"
            r0.append(r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getProcessName()
            r0.append(r2)
            java.lang.String r2 = ", success:"
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            return r6
        L_0x0266:
            r0 = move-exception
            r9 = r0
            r17 = 1
        L_0x026a:
            if (r13 == 0) goto L_0x0274
            r13.close()     // Catch:{ IOException -> 0x0272, all -> 0x0270 }
            goto L_0x0274
        L_0x0270:
            r0 = move-exception
            goto L_0x027a
        L_0x0272:
            r0 = move-exception
            goto L_0x027d
        L_0x0274:
            if (r12 == 0) goto L_0x02d0
            r12.close()     // Catch:{ IOException -> 0x0272, all -> 0x0270 }
            goto L_0x02d0
        L_0x027a:
            r10 = r17
            goto L_0x02ab
        L_0x027d:
            r13 = 1
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x02a9 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r3, r10)     // Catch:{ all -> 0x02a9 }
            f284067d = r6
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x02f5
            long r6 = java.lang.System.currentTimeMillis()
            long r11 = r6 - r4
            com.tencent.mm.smiley.r$a r10 = com.tencent.p014mm.smiley.C96965r.C96966a.C96967a.f284074a
            long r14 = r24.mo135554f()
            com.tencent.mm.smiley.q r0 = r1.f284071a
            java.util.LinkedList<com.tencent.mm.smiley.c> r0 = r0.f284064d
            int r16 = r0.size()
            r17 = 0
            r18 = 16
            r19 = 0
            com.tencent.p014mm.smiley.C96965r.C96966a.m124550a(r10, r11, r13, r14, r16, r17, r18, r19)
            goto L_0x02f5
        L_0x02a9:
            r0 = move-exception
            r10 = 1
        L_0x02ab:
            f284067d = r6
            boolean r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r2 == 0) goto L_0x02cf
            long r2 = java.lang.System.currentTimeMillis()
            long r8 = r2 - r4
            com.tencent.mm.smiley.r$a r7 = com.tencent.p014mm.smiley.C96965r.C96966a.C96967a.f284074a
            long r11 = r24.mo135554f()
            com.tencent.mm.smiley.q r2 = r1.f284071a
            java.util.LinkedList<com.tencent.mm.smiley.c> r2 = r2.f284064d
            int r13 = r2.size()
            r14 = 0
            r15 = 16
            r16 = 0
            com.tencent.p014mm.smiley.C96965r.C96966a.m124550a(r7, r8, r10, r11, r13, r14, r15, r16)
        L_0x02cf:
            throw r0
        L_0x02d0:
            f284067d = r6
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r0 == 0) goto L_0x02f5
            long r6 = java.lang.System.currentTimeMillis()
            long r15 = r6 - r4
            com.tencent.mm.smiley.r$a r14 = com.tencent.p014mm.smiley.C96965r.C96966a.C96967a.f284074a
            long r18 = r24.mo135554f()
            com.tencent.mm.smiley.q r0 = r1.f284071a
            java.util.LinkedList<com.tencent.mm.smiley.c> r0 = r0.f284064d
            int r20 = r0.size()
            r21 = 0
            r22 = 16
            r23 = 0
            com.tencent.p014mm.smiley.C96965r.C96966a.m124550a(r14, r15, r17, r18, r20, r21, r22, r23)
        L_0x02f5:
            di3.d r0 = di3.C86312j.m106911c(r2)
            ny.h r0 = (p629ny.C76979h) r0
            r0.clearCache()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.smiley.C96965r.mo135557i():boolean");
    }
}
