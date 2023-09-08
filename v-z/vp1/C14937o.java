package vp1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.xweb.file.XVFSFile;
import er1.C58784w3;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ho1.C8643p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o40.C61925b;
import o40.C61926c;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C36907w;
import te3.C49863il0;
import te3.C50140kk0;
import te3.C51985xk0;
import te3.C64273c21;
import zc1.C66785b;

/* renamed from: vp1.o */
public final class C14937o {

    /* renamed from: a */
    public static final C14938a f40972a = new C14938a((C8480h) null);

    /* renamed from: b */
    public static final Integer[] f40973b = {3, 0, 1, 2, 4, 5, 6, 9, 7, 8, 10, 11, 12, 13, 14, 18, 20, 17, 18, 19, 21, 23};

    /* renamed from: c */
    public static final Integer[] f40974c = {0, 1, 2, 4, 5, 6, 9, 7, 8, 10, 17, 19, 23};

    /* renamed from: d */
    public static final C14943r f40975d;

    /* renamed from: e */
    public static C14943r f40976e;

    /* renamed from: vp1.o$a */
    public static final class C14938a {

        /* renamed from: vp1.o$a$a */
        public static final class C14939a extends C87413o implements C32226l<C49863il0, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ String f40977d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14939a(String str) {
                super(1);
                this.f40977d = str;
            }

            public Object invoke(Object obj) {
                C49863il0 il02 = (C49863il0) obj;
                boolean z = true;
                if (!C87412m.m108589b(this.f40977d, il02.f135461e)) {
                    if (!(this.f40977d.length() == 0) && !Util.isNullOrNil(il02.f135461e)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        }

        public C14938a(C8480h hVar) {
        }

        /* renamed from: i */
        public static /* synthetic */ List m14143i(C14938a aVar, int i, String str, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            return aVar.mo13987h(i, str);
        }

        /* renamed from: a */
        public final void mo13980a(int i, String str, LinkedList<C14945t> linkedList) {
            C87412m.m108594g(str, "username");
            C87412m.m108594g(linkedList, "list");
            if (C110823p.m151009y(C14937o.f40973b, Integer.valueOf(i))) {
                try {
                    C49863il0 il02 = new C49863il0();
                    LinkedList<C50140kk0> linkedList2 = new LinkedList<>();
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                    for (C14945t tVar : linkedList) {
                        arrayList.add(tVar.f40983a);
                    }
                    linkedList2.addAll(arrayList);
                    il02.f135460d = linkedList2;
                    il02.f135461e = str;
                    il02.f135462f = System.currentTimeMillis();
                    C14924a a = C14937o.f40976e.mo13997a(i);
                    C51985xk0 xk02 = a.f40955c;
                    LinkedList<C49863il0> linkedList3 = xk02.f144718d;
                    C87412m.m108593f(linkedList3, "it.infoList");
                    C61926c.m72675T(linkedList3, new C14939a(str));
                    while (true) {
                        int size = xk02.f144718d.size();
                        C14938a aVar = C14937o.f40972a;
                        if (size > 20) {
                            LinkedList<C49863il0> linkedList4 = xk02.f144718d;
                            C87412m.m108593f(linkedList4, "it.infoList");
                            linkedList4.remove(C110818d0.m150917O(linkedList4, 0));
                        } else {
                            xk02.f144718d.add(il02);
                            Log.m105924i("Finder.FinderPage", "total cache username " + str + " list " + linkedList.size() + " totalCount: " + xk02.f144718d.size());
                            mo13981b(a);
                            return;
                        }
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("Finder.FinderPage", e, "", new Object[0]);
                }
            }
        }

        /* renamed from: b */
        public final void mo13981b(C14924a aVar) {
            try {
                byte[] byteArray = aVar.f40955c.toByteArray();
                C61925b bVar = new C61925b("cache2File");
                C86009m1 m1Var = new C86009m1(C58784w3.f168295a.mo83907W(2));
                if (!m1Var.mo119977o()) {
                    m1Var.mo119966f();
                }
                if (!m1Var.mo119967g()) {
                    m1Var.mo119987x();
                }
                String str = m1Var.mo119971i() + XVFSFile.SEPARATOR_CHAR + aVar.f40954b + ".ext";
                C86013q1.m106437S(str, byteArray);
                Log.m105924i("Finder.FinderPage", "cache2File " + aVar.f40954b + ' ' + byteArray.length + ' ' + str + ' ' + bVar);
            } catch (Exception e) {
                Log.printErrStackTrace("Finder.FinderPage", e, "", new Object[0]);
            }
        }

        /* renamed from: c */
        public final void mo13982c() {
            String W = C58784w3.f168295a.mo83907W(0);
            if (C86013q1.m106450k(W)) {
                C86013q1.m106445f(W);
                C86013q1.m106461v(W);
                Log.m105924i("Finder.FinderPage", "del " + W + " and ret " + C86013q1.m106450k(W));
            }
            C14943r rVar = C14937o.f40975d;
            C14937o.f40976e = rVar;
            for (C14924a aVar : rVar.f40982a) {
                aVar.f40956d = false;
                aVar.f40955c = new C51985xk0();
            }
            Log.m105924i("Finder.FinderPage", "clearAll " + C14937o.f40976e + ' ' + C14937o.f40976e.f40982a.length);
        }

        /* renamed from: d */
        public final void mo13983d(int i, String str, C32226l<? super C50140kk0, Boolean> lVar, boolean z) {
            LinkedList<C50140kk0> linkedList;
            C87412m.m108594g(str, "username");
            C87412m.m108594g(lVar, "filter");
            Log.m105924i("Finder.FinderPage", "deleteData typeFlag: " + i + ", username: " + str + " isFlush: " + z);
            mo13990l(i);
            C49863il0 g = mo13986g(C14937o.f40976e.mo13997a(i), str);
            if (g != null && (linkedList = g.f135460d) != null) {
                C8477a0 a0Var = new C8477a0();
                C61926c.m72675T(linkedList, new C14934k(lVar, a0Var));
                if (a0Var.f27482d && z) {
                    C14937o.f40972a.mo13981b(C14937o.f40976e.mo13997a(i));
                }
            }
        }

        /* renamed from: e */
        public final void mo13984e(long j, int i) {
            C49863il0 il02;
            LinkedList<C50140kk0> linkedList;
            mo13990l(i);
            LinkedList<C49863il0> linkedList2 = C14937o.f40976e.mo13997a(i).f40955c.f144718d;
            if (linkedList2 != null && (il02 = (C49863il0) C110818d0.m150917O(linkedList2, 0)) != null && (linkedList = il02.f135460d) != null) {
                C8477a0 a0Var = new C8477a0();
                C61926c.m72675T(linkedList, new C14932i(j, a0Var));
                if (a0Var.f27482d) {
                    C14937o.f40972a.mo13981b(C14937o.f40976e.mo13997a(i));
                }
            }
        }

        /* renamed from: f */
        public final void mo13985f(String str, C49863il0 il02) {
            LinkedList<C50140kk0> linkedList;
            FinderContact finderContact;
            FinderObjectDesc finderObjectDesc;
            C64273c21 c212;
            C64273c21 c213;
            if (System.currentTimeMillis() - (il02 != null ? il02.f135462f : 0) > ((long) (C32444a.f86069J0.mo60266n().intValue() * CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL))) {
                ArrayList arrayList = null;
                if (!(il02 == null || (linkedList = il02.f135460d) == null)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (T next : linkedList) {
                        C50140kk0 kk02 = (C50140kk0) next;
                        FinderObject finderObject = kk02.f136839f;
                        boolean z = ((finderObject == null || (c213 = finderObject.liveInfo) == null) ? null : Long.valueOf(c213.f182392d)) != null;
                        if (z) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(" filter live:");
                            FinderObject finderObject2 = kk02.f136839f;
                            sb.append((finderObject2 == null || (c212 = finderObject2.liveInfo) == null) ? null : Long.valueOf(c212.f182392d));
                            sb.append(',');
                            FinderObject finderObject3 = kk02.f136839f;
                            sb.append((finderObject3 == null || (finderObjectDesc = finderObject3.objectDesc) == null) ? null : finderObjectDesc.description);
                            sb.append(',');
                            FinderObject finderObject4 = kk02.f136839f;
                            sb.append((finderObject4 == null || (finderContact = finderObject4.contact) == null) ? null : finderContact.nickname);
                            Log.m105924i("Finder.FinderPage", sb.toString());
                        }
                        if (!z) {
                            arrayList2.add(next);
                        }
                    }
                    arrayList = arrayList2;
                }
                if (il02 != null) {
                    il02.f135460d = new LinkedList<>(arrayList);
                }
            }
        }

        /* renamed from: g */
        public final C49863il0 mo13986g(C14924a aVar, String str) {
            C51985xk0 xk02;
            LinkedList<C49863il0> linkedList;
            C51985xk0 xk03;
            LinkedList<C49863il0> linkedList2;
            T t = null;
            if ((str.length() == 0) || C87412m.m108589b(str, C66785b.f191882e.mo90662O5())) {
                if (aVar == null || (xk02 = aVar.f40955c) == null || (linkedList = xk02.f144718d) == null) {
                    return null;
                }
                return (C49863il0) C110818d0.m150917O(linkedList, 0);
            } else if (aVar == null || (xk03 = aVar.f40955c) == null || (linkedList2 = xk03.f144718d) == null) {
                return null;
            } else {
                Iterator<T> it = linkedList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (C87412m.m108589b(((C49863il0) next).f135461e, str)) {
                        t = next;
                        break;
                    }
                }
                return (C49863il0) t;
            }
        }

        /* renamed from: h */
        public final List<C0740i2> mo13987h(int i, String str) {
            C49863il0 il02;
            LinkedList<C50140kk0> linkedList;
            LinkedList<C50140kk0> linkedList2;
            C0740i2 a;
            T t;
            C87412m.m108594g(str, "username");
            mo13990l(i);
            C51985xk0 xk02 = C14937o.f40976e.mo13997a(i).f40955c;
            LinkedList linkedList3 = new LinkedList();
            Integer num = null;
            if (str.length() == 0) {
                LinkedList<C49863il0> linkedList4 = xk02.f144718d;
                C87412m.m108593f(linkedList4, "cache.infoList");
                il02 = (C49863il0) C110818d0.m150917O(linkedList4, 0);
            } else {
                LinkedList<C49863il0> linkedList5 = xk02.f144718d;
                C87412m.m108593f(linkedList5, "cache.infoList");
                Iterator<T> it = linkedList5.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C87412m.m108589b(((C49863il0) t).f135461e, str)) {
                        break;
                    }
                }
                il02 = (C49863il0) t;
            }
            mo13985f("cacheToRVFeedList", il02);
            if (!(il02 == null || (linkedList2 = il02.f135460d) == null)) {
                for (C50140kk0 kk02 : linkedList2) {
                    int i2 = kk02.f136842i;
                    C14945t sVar = i2 == 0 ? new C14944s(kk02) : i2 == 1 ? new C14946u(kk02) : i2 == 3 ? new C8643p(kk02) : null;
                    if (!(sVar == null || (a = sVar.mo9512a()) == null)) {
                        linkedList3.add(a);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("read cache username:");
            sb.append(str);
            sb.append(" size:");
            if (!(il02 == null || (linkedList = il02.f135460d) == null)) {
                num = Integer.valueOf(linkedList.size());
            }
            sb.append(num);
            Log.m105924i("Finder.FinderPage", sb.toString());
            C14938a aVar = C14937o.f40972a;
            return linkedList3;
        }

        /* renamed from: j */
        public final List<FinderItem> mo13988j(String str, int i) {
            C49863il0 il02;
            LinkedList<C50140kk0> linkedList;
            LinkedList<C50140kk0> linkedList2;
            T t;
            C87412m.m108594g(str, "username");
            mo13990l(i);
            C51985xk0 xk02 = C14937o.f40976e.mo13997a(i).f40955c;
            LinkedList linkedList3 = new LinkedList();
            Integer num = null;
            if ((str.length() == 0) || C87412m.m108589b(str, C66785b.f191882e.mo90662O5())) {
                LinkedList<C49863il0> linkedList4 = xk02.f144718d;
                C87412m.m108593f(linkedList4, "cache.infoList");
                il02 = (C49863il0) C110818d0.m150917O(linkedList4, 0);
            } else {
                il02 = null;
            }
            if (!C87412m.m108589b(il02 != null ? il02.f135461e : null, str)) {
                LinkedList<C49863il0> linkedList5 = xk02.f144718d;
                C87412m.m108593f(linkedList5, "cache.infoList");
                Iterator<T> it = linkedList5.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C87412m.m108589b(((C49863il0) t).f135461e, str)) {
                        break;
                    }
                }
                il02 = (C49863il0) t;
            }
            mo13985f("cacheToFinderItemList", il02);
            if (!(il02 == null || (linkedList2 = il02.f135460d) == null)) {
                for (C50140kk0 kk02 : linkedList2) {
                    C87412m.m108593f(kk02, LocaleUtil.ITALIAN);
                    FinderItem a = C14936m.f40971a.mo13978a(kk02);
                    if (a != null) {
                        linkedList3.add(a);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("read cache username:");
            sb.append(str);
            sb.append(" size:");
            if (!(il02 == null || (linkedList = il02.f135460d) == null)) {
                num = Integer.valueOf(linkedList.size());
            }
            sb.append(num);
            Log.m105924i("Finder.FinderPage", sb.toString());
            C14938a aVar = C14937o.f40972a;
            return linkedList3;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: te3.il0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<cm1.C0716c> mo13989k(int r9) {
            /*
                r8 = this;
                r8.mo13990l(r9)
                vp1.r r0 = vp1.C14937o.f40976e
                vp1.a r9 = r0.mo13997a(r9)
                te3.xk0 r9 = r9.f40955c
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                java.lang.String r1 = ""
                int r2 = r1.length()
                r3 = 0
                r4 = 1
                if (r2 != 0) goto L_0x001c
                r2 = 1
                goto L_0x001d
            L_0x001c:
                r2 = 0
            L_0x001d:
                java.lang.String r5 = "cache.infoList"
                r6 = 0
                if (r2 != 0) goto L_0x0052
                zc1.b r2 = zc1.C66785b.f191882e
                java.lang.String r2 = r2.mo90662O5()
                boolean r2 = gy3.C87412m.m108589b(r1, r2)
                if (r2 == 0) goto L_0x002f
                goto L_0x0052
            L_0x002f:
                java.util.LinkedList<te3.il0> r9 = r9.f144718d
                gy3.C87412m.m108593f(r9, r5)
                java.util.Iterator r9 = r9.iterator()
            L_0x0038:
                boolean r2 = r9.hasNext()
                if (r2 == 0) goto L_0x004e
                java.lang.Object r2 = r9.next()
                r5 = r2
                te3.il0 r5 = (te3.C49863il0) r5
                java.lang.String r5 = r5.f135461e
                boolean r5 = gy3.C87412m.m108589b(r5, r1)
                if (r5 == 0) goto L_0x0038
                goto L_0x004f
            L_0x004e:
                r2 = r6
            L_0x004f:
                te3.il0 r2 = (te3.C49863il0) r2
                goto L_0x005e
            L_0x0052:
                java.util.LinkedList<te3.il0> r9 = r9.f144718d
                gy3.C87412m.m108593f(r9, r5)
                java.lang.Object r9 = sx3.C110818d0.m150917O(r9, r3)
                r2 = r9
                te3.il0 r2 = (te3.C49863il0) r2
            L_0x005e:
                if (r2 == 0) goto L_0x0094
                java.util.LinkedList<te3.kk0> r9 = r2.f135460d
                if (r9 == 0) goto L_0x0094
                java.util.Iterator r9 = r9.iterator()
            L_0x0068:
                boolean r5 = r9.hasNext()
                if (r5 == 0) goto L_0x0094
                java.lang.Object r5 = r9.next()
                te3.kk0 r5 = (te3.C50140kk0) r5
                java.lang.String r7 = "it"
                gy3.C87412m.m108593f(r5, r7)
                int r7 = r5.f136842i
                if (r7 != r4) goto L_0x007f
                r7 = 1
                goto L_0x0080
            L_0x007f:
                r7 = 0
            L_0x0080:
                if (r7 == 0) goto L_0x008d
                te3.je1 r5 = r5.f136841h
                if (r5 == 0) goto L_0x008d
                kf1.h6 r7 = kf1.C9778h6.f30304a
                cm1.c r5 = r7.mo10380a(r5)
                goto L_0x008e
            L_0x008d:
                r5 = r6
            L_0x008e:
                if (r5 == 0) goto L_0x0068
                r0.add(r5)
                goto L_0x0068
            L_0x0094:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r3 = "read cache username:"
                r9.append(r3)
                r9.append(r1)
                java.lang.String r1 = " size:"
                r9.append(r1)
                if (r2 == 0) goto L_0x00b4
                java.util.LinkedList<te3.kk0> r1 = r2.f135460d
                if (r1 == 0) goto L_0x00b4
                int r1 = r1.size()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            L_0x00b4:
                r9.append(r6)
                java.lang.String r9 = r9.toString()
                java.lang.String r1 = "Finder.FinderPage"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
                vp1.o$a r9 = vp1.C14937o.f40972a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: vp1.C14937o.C14938a.mo13989k(int):java.util.List");
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x007a A[Catch:{ Exception -> 0x00a7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x009f A[Catch:{ Exception -> 0x00a7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00c4  */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final vp1.C14924a mo13990l(int r13) {
            /*
                r12 = this;
                vp1.r r0 = vp1.C14937o.f40976e
                vp1.a r0 = r0.mo13997a(r13)
                boolean r0 = r0.f40956d
                if (r0 == 0) goto L_0x0011
                vp1.r r0 = vp1.C14937o.f40976e
                vp1.a r13 = r0.mo13997a(r13)
                return r13
            L_0x0011:
                vp1.r r0 = vp1.C14937o.f40976e
                java.lang.String r1 = ""
                java.lang.String r2 = "Finder.FinderPage"
                r3 = 0
                r4 = 1
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7 }
                r5.<init>()     // Catch:{ Exception -> 0x00a7 }
                er1.w3 r6 = er1.C58784w3.f168295a     // Catch:{ Exception -> 0x00a7 }
                r7 = 2
                java.lang.String r6 = r6.mo83907W(r7)     // Catch:{ Exception -> 0x00a7 }
                r5.append(r6)     // Catch:{ Exception -> 0x00a7 }
                r6 = 47
                r5.append(r6)     // Catch:{ Exception -> 0x00a7 }
                vp1.r r6 = vp1.C14937o.f40976e     // Catch:{ Exception -> 0x00a7 }
                vp1.a r6 = r6.mo13997a(r13)     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r6 = r6.f40954b     // Catch:{ Exception -> 0x00a7 }
                r5.append(r6)     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r6 = ".ext"
                r5.append(r6)     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00a7 }
                o40.b r6 = new o40.b     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r7 = "file2Cache"
                r6.<init>(r7)     // Catch:{ Exception -> 0x00a7 }
                r7 = -1
                byte[] r7 = com.tencent.p014mm.vfs.C86013q1.m106433O(r5, r3, r7)     // Catch:{ Exception -> 0x00a7 }
                te3.xk0 r8 = new te3.xk0     // Catch:{ Exception -> 0x00a7 }
                r8.<init>()     // Catch:{ Exception -> 0x00a7 }
                r9 = 0
                if (r7 != 0) goto L_0x0056
                goto L_0x0065
            L_0x0056:
                r8.parseFrom(r7)     // Catch:{ Exception -> 0x005a }
                goto L_0x0066
            L_0x005a:
                r8 = move-exception
                java.lang.String r10 = "safeParser"
                java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00a7 }
                r11[r3] = r8     // Catch:{ Exception -> 0x00a7 }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r10, r1, r11)     // Catch:{ Exception -> 0x00a7 }
            L_0x0065:
                r8 = r9
            L_0x0066:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7 }
                r10.<init>()     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r11 = "file2Cache "
                r10.append(r11)     // Catch:{ Exception -> 0x00a7 }
                r10.append(r13)     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r11 = "  "
                r10.append(r11)     // Catch:{ Exception -> 0x00a7 }
                if (r7 == 0) goto L_0x007f
                int r7 = r7.length     // Catch:{ Exception -> 0x00a7 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00a7 }
            L_0x007f:
                r10.append(r9)     // Catch:{ Exception -> 0x00a7 }
                r7 = 32
                r10.append(r7)     // Catch:{ Exception -> 0x00a7 }
                r10.append(r5)     // Catch:{ Exception -> 0x00a7 }
                r10.append(r7)     // Catch:{ Exception -> 0x00a7 }
                r10.append(r6)     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r5 = r10.toString()     // Catch:{ Exception -> 0x00a7 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)     // Catch:{ Exception -> 0x00a7 }
                vp1.r r5 = vp1.C14937o.f40976e     // Catch:{ Exception -> 0x00a7 }
                vp1.a r5 = r5.mo13997a(r13)     // Catch:{ Exception -> 0x00a7 }
                if (r8 != 0) goto L_0x00a4
                te3.xk0 r8 = new te3.xk0     // Catch:{ Exception -> 0x00a7 }
                r8.<init>()     // Catch:{ Exception -> 0x00a7 }
            L_0x00a4:
                r5.f40955c = r8     // Catch:{ Exception -> 0x00a7 }
                goto L_0x00ad
            L_0x00a7:
                r5 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r3]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r5, r1, r6)
            L_0x00ad:
                vp1.r r1 = vp1.C14937o.f40976e
                vp1.a r1 = r1.mo13997a(r13)
                r1.f40956d = r4
                vp1.r r1 = vp1.C14937o.f40976e
                vp1.a r1 = r1.mo13997a(r13)
                r0.getClass()
                vp1.a[] r2 = r0.f40982a
                int r4 = r2.length
                r5 = 0
            L_0x00c2:
                if (r3 >= r4) goto L_0x00d4
                r6 = r2[r3]
                int r7 = r5 + 1
                int r6 = r6.f40953a
                if (r13 != r6) goto L_0x00d0
                vp1.a[] r6 = r0.f40982a
                r6[r5] = r1
            L_0x00d0:
                int r3 = r3 + 1
                r5 = r7
                goto L_0x00c2
            L_0x00d4:
                vp1.r r0 = vp1.C14937o.f40976e
                vp1.a r13 = r0.mo13997a(r13)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: vp1.C14937o.C14938a.mo13990l(int):vp1.a");
        }

        /* renamed from: m */
        public final void mo13991m(long j, int i, FinderObject finderObject) {
            LinkedList<C50140kk0> linkedList;
            C87412m.m108594g(finderObject, "item");
            Log.m105924i("Finder.FinderPage", "updatePageData pageName:" + i + ", svrId:" + j);
            if (i >= 0) {
                try {
                    mo13990l(i);
                    C49863il0 g = mo13986g(C14937o.f40976e.mo13997a(i), "");
                    if (g != null && (linkedList = g.f135460d) != null && C14936m.f40971a.mo13979b(j, finderObject, linkedList)) {
                        C14937o.f40972a.mo13981b(C14937o.f40976e.mo13997a(i));
                    }
                } catch (Throwable th) {
                    if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
                        throw th;
                    }
                    Log.printErrStackTrace("Finder.FinderPage", th, "updatePageData " + i, new Object[0]);
                }
            }
        }
    }

    static {
        C14943r rVar = new C14943r(new C14924a[]{new C14924a(0, "main_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(1, "profile_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(2, "like_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(3, "others_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(4, "prefetch_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(5, "friend_tab_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(6, "lbs_tab_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(7, "follow_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(8, "machine_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(9, "lbs_tab_section_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(10, "fav_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(11, "mega_video_like_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(12, "mega_video_fav_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(13, "mega_video_profile_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(14, "profile_at_feed_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(15, "nearby_live_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(16, "nearby_live_more_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(18, "manage_at_feed_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(20, "profile_poi_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(17, "music_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(19, "qq_music_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(18, "manage_at_feed_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(21, "biz_profile_v3", new C51985xk0(), false, 8, (C8480h) null), new C14924a(23, "collection_v3", new C51985xk0(), false, 8, (C8480h) null)});
        f40975d = rVar;
        f40976e = rVar;
    }
}
