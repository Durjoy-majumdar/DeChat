package wb1;

import a70.C112760b;
import com.tencent.p014mm.sdk.coroutines.FlowController;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i40.C98597b;
import i40.C98598e;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import pb1.C100697a1;
import pb1.C100734q;
import pb1.C100755z;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C64197v;
import te3.C101757at;
import te3.C101801kd0;
import te3.C101834rc0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: wb1.n */
public final class C102402n extends C98597b {

    /* renamed from: f */
    public final C13601g f301598f = C36568h.m40985a(C38044d.f100575d);

    /* renamed from: g */
    public final C13601g f301599g = C36568h.m40985a(C102403a.f301601d);

    /* renamed from: h */
    public final C13601g f301600h;

    /* renamed from: wb1.n$d */
    public static final class C38044d extends C87413o implements C32224a<C86009m1> {

        /* renamed from: d */
        public static final C38044d f100575d = new C38044d();

        public C38044d() {
            super(0);
        }

        public Object invoke() {
            String str = C86709a0.m107523b().mo121111i() + "_FavCheckCdnFSC";
            VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
            return C112760b.m154236i0(str);
        }
    }

    /* renamed from: wb1.n$a */
    public static final class C102403a extends C87413o implements C32224a<FlowController> {

        /* renamed from: d */
        public static final C102403a f301601d = new C102403a();

        public C102403a() {
            super(0);
        }

        public Object invoke() {
            return new FlowController(1, C15062m.f41196d);
        }
    }

    /* renamed from: wb1.n$b */
    public static final class C102404b extends C87413o implements C32224a<LifecycleScope> {

        /* renamed from: d */
        public final /* synthetic */ C98598e f301602d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102404b(C98598e eVar) {
            super(0);
            this.f301602d = eVar;
        }

        public Object invoke() {
            return new LifecycleScope("FavCheckCdnPLC", this.f301602d, 0, 4, (C8480h) null);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.fav.model.service.FavCheckCdnFSC", mo125469f = "FavCheckCdnFSC.kt", mo125470l = {108, 250, 279}, mo125471m = "startCgi")
    /* renamed from: wb1.n$c */
    public static final class C102405c extends C66704d {

        /* renamed from: d */
        public Object f301603d;

        /* renamed from: e */
        public Object f301604e;

        /* renamed from: f */
        public Object f301605f;

        /* renamed from: g */
        public Object f301606g;

        /* renamed from: h */
        public Object f301607h;

        /* renamed from: i */
        public Object f301608i;

        /* renamed from: j */
        public Object f301609j;

        /* renamed from: n */
        public Object f301610n;

        /* renamed from: o */
        public Object f301611o;

        /* renamed from: p */
        public Object f301612p;

        /* renamed from: q */
        public Object f301613q;

        /* renamed from: r */
        public Object f301614r;

        /* renamed from: s */
        public Object f301615s;

        /* renamed from: t */
        public Object f301616t;

        /* renamed from: u */
        public Object f301617u;

        /* renamed from: v */
        public int f301618v;

        /* renamed from: w */
        public /* synthetic */ Object f301619w;

        /* renamed from: x */
        public final /* synthetic */ C102402n f301620x;

        /* renamed from: y */
        public int f301621y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102405c(C102402n nVar, C15601d<? super C102405c> dVar) {
            super(dVar);
            this.f301620x = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f301619w = obj;
            this.f301621y |= Integer.MIN_VALUE;
            return this.f301620x.mo141982j3((C100755z) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102402n(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "service");
        this.f301600h = C36568h.m40985a(new C102404b(eVar));
    }

    /* renamed from: g3 */
    public final void mo141980g3(List<C101757at> list, Map<String, C101834rc0> map, C101801kd0 kd02, int i) {
        LinkedList<C101834rc0> linkedList;
        if (kd02 != null && (linkedList = kd02.f298618f) != null) {
            for (C101834rc0 rc02 : linkedList) {
                String str = rc02.f299280T;
                C87412m.m108593f(str, "dataItem.dataId");
                map.put(str, rc02);
                if (C100734q.m131833X(rc02.f299258I)) {
                    mo141980g3(list, map, rc02.f299275Q1, i);
                } else {
                    ArrayList<C101757at> arrayList = new ArrayList<>();
                    if (rc02.f299258I != 6) {
                        if (!rc02.f299283U0) {
                            C101757at atVar = new C101757at();
                            atVar.f297886g = (int) rc02.f299276R;
                            atVar.f297884e = rc02.f299266M;
                            atVar.f297885f = rc02.f299271P;
                            atVar.f297883d = rc02.f299280T;
                            atVar.f297888i = rc02.f299274Q0;
                            atVar.f297887h = i;
                            atVar.f297889j = 0;
                            arrayList.add(atVar);
                        }
                        if (!rc02.f299287W0) {
                            C101757at atVar2 = new C101757at();
                            atVar2.f297886g = (int) rc02.f299336x0;
                            atVar2.f297884e = rc02.f299288X;
                            atVar2.f297885f = rc02.f299292Z;
                            atVar2.f297888i = rc02.f299274Q0;
                            atVar2.f297887h = i;
                            atVar2.f297883d = "thumb_" + rc02.f299280T;
                            atVar2.f297889j = 1;
                            arrayList.add(atVar2);
                        }
                    }
                    if (!(!arrayList.isEmpty())) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        for (C101757at atVar3 : arrayList) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("check CDN ");
                            sb.append(atVar3.f297889j == 1 ? "thumb" : "data");
                            sb.append(" dataId ");
                            sb.append(atVar3.f297883d);
                            sb.append(" dataType ");
                            sb.append(rc02.f299258I);
                            sb.append(" dataSourceId ");
                            sb.append(atVar3.f297888i);
                            sb.append(" DataSourceType ");
                            sb.append(atVar3.f297887h);
                            sb.append(" FullSize ");
                            sb.append(atVar3.f297886g);
                            sb.append(", FullMd5 ");
                            sb.append(atVar3.f297884e);
                            sb.append(", Head256Md5 ");
                            sb.append(atVar3.f297885f);
                            Log.m105924i("MicroMsg.Fav.FavCheckCdnFSC", sb.toString());
                        }
                        list.addAll(arrayList);
                    }
                }
            }
        }
    }

    /* renamed from: i3 */
    public final void mo141981i3(C101801kd0 kd02) {
        LinkedList<C101834rc0> linkedList;
        if (kd02 != null && (linkedList = kd02.f298618f) != null) {
            int i = 0;
            for (T next : linkedList) {
                int i2 = i + 1;
                String str = null;
                if (i >= 0) {
                    C101834rc0 rc02 = (C101834rc0) next;
                    if (C100734q.m131833X(rc02.f299258I)) {
                        mo141981i3(rc02.f299275Q1);
                        C100697a1 a1Var = (C100697a1) C86312j.m106911c(C100697a1.class);
                        C101801kd0 kd03 = rc02.f299275Q1;
                        String str2 = kd03 != null ? kd03.f298626q : null;
                        String str3 = "";
                        if (str2 == null) {
                            str2 = str3;
                        }
                        if (kd03 != null) {
                            str = kd03.f298628s;
                        }
                        if (str != null) {
                            str3 = str;
                        }
                        C87412m.m108593f(kd03, "dataItem.protoItem");
                        rc02.mo141234H(a1Var.tn0(str2, str3, kd03, rc02.f299258I));
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: te3.rc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: te3.rc0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v37, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v162, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v38, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v163, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v46, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v164, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v18, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v165, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v20, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v166, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v19, resolved type: gy3.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v167, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v21, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v168, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v14, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v169, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v12, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v170, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v19, resolved type: gy3.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v171, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v21, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v172, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v10, resolved type: com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v173, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v16, resolved type: pb1.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v174, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v12, resolved type: wb1.n} */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:31|(2:32|33)|34|35|36|37|38|39|40|(1:42)(9:43|44|45|46|56|(0)(0)|(0)|173|174)|42) */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:31|32|33|34|35|36|37|38|39|40|(1:42)(9:43|44|45|46|56|(0)(0)|(0)|173|174)|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x07a4, code lost:
        r40 = r1;
        r36 = r9;
        r37 = r10;
        r1 = r14;
        r39 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x07b3, code lost:
        if ((!r3.isEmpty()) == false) goto L_0x07e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x07b5, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, "errorDataIdMap: " + r3);
        ((xb1.C102614d) ((pb1.C100718j1) di3.C86312j.m106911c(r31)).mo128199Jq()).mo142272mL(3, r40.field_localId);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x07df, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x07e0, code lost:
        r2 = r40;
        r8 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x031b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x031c, code lost:
        r9 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x031f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0320, code lost:
        r39 = r9;
        r41 = r10;
        r40 = r11;
        r35 = r12;
        r3 = r13;
        r36 = r14;
        r34 = r38;
        r9 = r47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0340, code lost:
        r11 = r3;
        r3 = r8;
        r10 = r9;
        r12 = r25;
        r13 = r26;
        r14 = r27;
        r15 = r28;
        r8 = r31;
        r25 = r35;
        r28 = r39;
        r27 = r40;
        r26 = r41;
        r9 = r2;
        r31 = r4;
        r35 = r6;
        r6 = r32;
        r4 = r1;
        r32 = r5;
        r1 = r7;
        r7 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x07e5  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x07f3  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0808  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x085e  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0865  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x08b9  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x098e  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0993  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0999  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0a3b  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0a72  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0a78  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0a7e  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0a8a  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0ab6  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0b8d  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0b92  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0b98  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0c46  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0c7d  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0c83  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0c89  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0c95  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0ca7  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0cb4 A[LOOP:1: B:277:0x0cae->B:279:0x0cb4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0ccc  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0ce3  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0cea  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0cf1  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0cf8  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0cff  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0d08  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0d12  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0d69  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0048  */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo141982j3(pb1.C100755z r47, wx3.C15601d<? super rx3.C13598b0> r48) {
        /*
            r46 = this;
            r1 = r46
            r0 = r47
            r2 = r48
            java.lang.Class<qo.h> r3 = p663qo.C101211h.class
            java.lang.Class<qo.i> r4 = p663qo.C77384i.class
            java.lang.Class<pw.d> r5 = p654pw.C100972d.class
            com.tencent.mm.modelcdntran.v$a r6 = com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnDownloadCallbackFindLocal
            com.tencent.mm.modelcdntran.v$a r7 = com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnDownloadCallbackSuccess
            java.lang.Class<pb1.j1> r8 = pb1.C100718j1.class
            boolean r9 = r2 instanceof wb1.C102402n.C102405c
            if (r9 == 0) goto L_0x0025
            r9 = r2
            wb1.n$c r9 = (wb1.C102402n.C102405c) r9
            int r10 = r9.f301621y
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r10 & r11
            if (r12 == 0) goto L_0x0025
            int r10 = r10 - r11
            r9.f301621y = r10
            goto L_0x002a
        L_0x0025:
            wb1.n$c r9 = new wb1.n$c
            r9.<init>(r1, r2)
        L_0x002a:
            java.lang.Object r2 = r9.f301619w
            xx3.a r10 = xx3.C15911a.COROUTINE_SUSPENDED
            int r11 = r9.f301621y
            java.lang.String r12 = "VFSFile(tempFolder, mediaId).absolutePath"
            java.lang.String r13 = " result "
            java.lang.String r14 = " to "
            java.lang.String r15 = "localId"
            r16 = r6
            java.lang.String r6 = "MicroMsg.Fav.FavCheckCdnFSC"
            r17 = r7
            java.lang.String r7 = "getService(ICdnFeatureService::class.java)"
            r48 = r10
            r21 = 0
            r10 = 1
            if (r11 == 0) goto L_0x01e0
            if (r11 == r10) goto L_0x0158
            r10 = 2
            if (r11 == r10) goto L_0x00dc
            r3 = 3
            if (r11 != r3) goto L_0x00d4
            int r0 = r9.f301618v
            java.lang.Object r3 = r9.f301617u
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r10 = r9.f301616t
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r9.f301615s
            java.lang.String r11 = (java.lang.String) r11
            r22 = r0
            java.lang.Object r0 = r9.f301614r
            te3.rc0 r0 = (te3.C101834rc0) r0
            r47 = r0
            java.lang.Object r0 = r9.f301613q
            java.util.Iterator r0 = (java.util.Iterator) r0
            r25 = r0
            java.lang.Object r0 = r9.f301612p
            java.util.List r0 = (java.util.List) r0
            r26 = r0
            java.lang.Object r0 = r9.f301611o
            java.util.List r0 = (java.util.List) r0
            r27 = r0
            java.lang.Object r0 = r9.f301610n
            gy3.a0 r0 = (gy3.C8477a0) r0
            r28 = r0
            java.lang.Object r0 = r9.f301609j
            gy3.d0 r0 = (gy3.C8478d0) r0
            r29 = r0
            java.lang.Object r0 = r9.f301608i
            gy3.d0 r0 = (gy3.C8478d0) r0
            r30 = r0
            java.lang.Object r0 = r9.f301607h
            gy3.d0 r0 = (gy3.C8478d0) r0
            r31 = r0
            java.lang.Object r0 = r9.f301606g
            gy3.d0 r0 = (gy3.C8478d0) r0
            r32 = r0
            java.lang.Object r0 = r9.f301605f
            com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct r0 = (com.tencent.p014mm.autogen.mmdata.rpt.FavAddQualityStruct) r0
            r33 = r0
            java.lang.Object r0 = r9.f301604e
            pb1.z r0 = (pb1.C100755z) r0
            r34 = r0
            java.lang.Object r0 = r9.f301603d
            wb1.n r0 = (wb1.C102402n) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r42 = r12
            r1 = r13
            r13 = r7
            r12 = r9
            r7 = r16
            r9 = r17
            r16 = r28
            r28 = r25
            r25 = r15
            r15 = r48
            r48 = r34
            r44 = r14
            r14 = r47
            r47 = r0
            r0 = r11
            r11 = r10
            r10 = r8
            r8 = r6
            r6 = r30
            r30 = r5
            r5 = r29
            r29 = r4
            r4 = r3
            r3 = r2
            r2 = r44
            goto L_0x0b89
        L_0x00d4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x00dc:
            int r0 = r9.f301618v
            java.lang.Object r3 = r9.f301617u
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r10 = r9.f301616t
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r9.f301615s
            java.lang.String r11 = (java.lang.String) r11
            r25 = r0
            java.lang.Object r0 = r9.f301614r
            te3.rc0 r0 = (te3.C101834rc0) r0
            r47 = r0
            java.lang.Object r0 = r9.f301613q
            java.util.Iterator r0 = (java.util.Iterator) r0
            r26 = r0
            java.lang.Object r0 = r9.f301612p
            java.util.List r0 = (java.util.List) r0
            r27 = r0
            java.lang.Object r0 = r9.f301611o
            java.util.List r0 = (java.util.List) r0
            r28 = r0
            java.lang.Object r0 = r9.f301610n
            gy3.a0 r0 = (gy3.C8477a0) r0
            r29 = r0
            java.lang.Object r0 = r9.f301609j
            gy3.d0 r0 = (gy3.C8478d0) r0
            r30 = r0
            java.lang.Object r0 = r9.f301608i
            gy3.d0 r0 = (gy3.C8478d0) r0
            r31 = r0
            java.lang.Object r0 = r9.f301607h
            gy3.d0 r0 = (gy3.C8478d0) r0
            r32 = r0
            java.lang.Object r0 = r9.f301606g
            gy3.d0 r0 = (gy3.C8478d0) r0
            r33 = r0
            java.lang.Object r0 = r9.f301605f
            com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct r0 = (com.tencent.p014mm.autogen.mmdata.rpt.FavAddQualityStruct) r0
            r34 = r0
            java.lang.Object r0 = r9.f301604e
            pb1.z r0 = (pb1.C100755z) r0
            r35 = r0
            java.lang.Object r0 = r9.f301603d
            wb1.n r0 = (wb1.C102402n) r0
            kotlin.ResultKt.throwOnFailure(r2)
            r1 = r2
            r43 = r12
            r40 = r25
            r2 = r29
            r42 = r35
            r29 = r4
            r12 = r11
            r25 = r15
            r4 = r16
            r15 = r47
            r11 = r48
            r47 = r0
            r0 = r14
            r14 = r13
            r13 = r7
            r7 = r17
            r44 = r30
            r30 = r5
            r5 = r44
            goto L_0x098a
        L_0x0158:
            java.lang.Object r0 = r9.f301615s
            r10 = r0
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r0 = r9.f301614r
            r11 = r0
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r0 = r9.f301613q
            r25 = r0
            java.util.List r25 = (java.util.List) r25
            java.lang.Object r0 = r9.f301612p
            r26 = r0
            java.util.Map r26 = (java.util.Map) r26
            java.lang.Object r0 = r9.f301611o
            r27 = r0
            gy3.a0 r27 = (gy3.C8477a0) r27
            java.lang.Object r0 = r9.f301610n
            r28 = r0
            gy3.d0 r28 = (gy3.C8478d0) r28
            java.lang.Object r0 = r9.f301609j
            r29 = r0
            gy3.d0 r29 = (gy3.C8478d0) r29
            java.lang.Object r0 = r9.f301608i
            r30 = r0
            gy3.d0 r30 = (gy3.C8478d0) r30
            java.lang.Object r0 = r9.f301607h
            r31 = r0
            gy3.d0 r31 = (gy3.C8478d0) r31
            java.lang.Object r0 = r9.f301606g
            r32 = r0
            java.util.Map r32 = (java.util.Map) r32
            java.lang.Object r0 = r9.f301605f
            r33 = r0
            com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct r33 = (com.tencent.p014mm.autogen.mmdata.rpt.FavAddQualityStruct) r33
            java.lang.Object r0 = r9.f301604e
            r34 = r0
            pb1.z r34 = (pb1.C100755z) r34
            java.lang.Object r0 = r9.f301603d
            r35 = r0
            wb1.n r35 = (wb1.C102402n) r35
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ d -> 0x01c3 }
            r36 = r10
            r1 = r30
            r10 = r48
            r30 = r5
            r48 = r7
            r7 = r17
            r44 = r33
            r33 = r3
            r3 = r44
            r45 = r29
            r29 = r4
            r4 = r34
            r34 = r45
            goto L_0x0313
        L_0x01c3:
            r0 = move-exception
            r36 = r10
            r1 = r30
            r10 = r48
            r30 = r5
            r48 = r7
            r7 = r17
            r44 = r33
            r33 = r3
            r3 = r44
            r45 = r29
            r29 = r4
            r4 = r34
            r34 = r45
            goto L_0x0362
        L_0x01e0:
            kotlin.ResultKt.throwOnFailure(r2)
            pb1.b0 r2 = pb1.C100698b0.f295038a
            com.tencent.mm.autogen.mmdata.rpt.FavAddQualityStruct r2 = r2.mo140126b()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "startCgi "
            r10.append(r11)
            r25 = r12
            long r11 = r0.field_localId
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            te3.kd0 r12 = r0.field_favProto
            r26 = r9
            int r9 = r0.field_sourceType
            r1.mo141980g3(r10, r11, r12, r9)
            if (r2 != 0) goto L_0x0218
            goto L_0x021e
        L_0x0218:
            int r9 = r10.size()
            r2.f265504j = r9
        L_0x021e:
            gy3.d0 r9 = new gy3.d0
            r9.<init>()
            gy3.d0 r12 = new gy3.d0
            r12.<init>()
            gy3.d0 r27 = new gy3.d0
            r27.<init>()
            gy3.d0 r28 = new gy3.d0
            r28.<init>()
            boolean r29 = r10.isEmpty()
            r24 = 1
            r29 = r29 ^ 1
            if (r29 == 0) goto L_0x0e6b
            gy3.a0 r29 = new gy3.a0
            r29.<init>()
            java.util.LinkedHashMap r30 = new java.util.LinkedHashMap
            r30.<init>()
            java.util.ArrayList r31 = new java.util.ArrayList
            r31.<init>()
            java.util.ArrayList r32 = new java.util.ArrayList
            r32.<init>()
            r1 = 10
            java.util.List r1 = com.tencent.p014mm.sdk.p134kt.CommonKt.splitList(r10, r1)
            java.util.Iterator r1 = r1.iterator()
            r47 = r48
            r48 = r7
            r7 = r12
            r10 = r30
            r12 = r31
            r30 = r5
            r31 = r8
            r5 = r11
            r11 = r29
            r8 = r2
            r29 = r4
            r4 = r9
            r2 = r26
            r9 = r28
            r26 = r13
            r28 = r15
            r13 = r32
            r15 = r1
            r32 = r6
            r6 = r46
            r1 = r0
            r44 = r27
            r27 = r14
            r14 = r44
        L_0x0284:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x081c
            java.lang.Object r0 = r15.next()
            java.util.List r0 = (java.util.List) r0
            r33 = r3
            te3.bt r3 = new te3.bt
            r3.<init>()
            r34 = r15
            java.util.LinkedList<te3.at> r15 = r3.f131297e
            r15.addAll(r0)
            int r0 = r0.size()
            r3.f131296d = r0
            ob0.b r0 = r3.mo73335b()     // Catch:{ d -> 0x0330 }
            r35 = 0
            r3 = 0
            r37 = 0
            r2.f301603d = r6     // Catch:{ d -> 0x0330 }
            r2.f301604e = r1     // Catch:{ d -> 0x0330 }
            r2.f301605f = r8     // Catch:{ d -> 0x0330 }
            r2.f301606g = r5     // Catch:{ d -> 0x0330 }
            r2.f301607h = r4     // Catch:{ d -> 0x0330 }
            r2.f301608i = r7     // Catch:{ d -> 0x0330 }
            r2.f301609j = r14     // Catch:{ d -> 0x0330 }
            r2.f301610n = r9     // Catch:{ d -> 0x0330 }
            r2.f301611o = r11     // Catch:{ d -> 0x0330 }
            r2.f301612p = r10     // Catch:{ d -> 0x0330 }
            r2.f301613q = r12     // Catch:{ d -> 0x0330 }
            r2.f301614r = r13     // Catch:{ d -> 0x0330 }
            r38 = r14
            r14 = r34
            r2.f301615s = r14     // Catch:{ d -> 0x031f }
            r15 = 1
            r2.f301621y = r15     // Catch:{ d -> 0x031f }
            r39 = r9
            r9 = r0
            r41 = r10
            r40 = r11
            r10 = r35
            r35 = r12
            r12 = r3
            r3 = r13
            r13 = r2
            r42 = r47
            r15 = r14
            r34 = r38
            r0 = 3
            r14 = r0
            r36 = r15
            r15 = r37
            java.lang.Object r0 = q40.C89456b.m111831a(r9, r10, r12, r13, r14, r15)     // Catch:{ d -> 0x031b }
            r9 = r42
            if (r0 != r9) goto L_0x02f0
            return r9
        L_0x02f0:
            r11 = r3
            r3 = r8
            r10 = r9
            r12 = r25
            r13 = r26
            r14 = r27
            r15 = r28
            r8 = r31
            r25 = r35
            r28 = r39
            r27 = r40
            r26 = r41
            r9 = r2
            r31 = r4
            r35 = r6
            r6 = r32
            r2 = r0
            r4 = r1
            r32 = r5
            r1 = r7
            r7 = r17
        L_0x0313:
            te3.ct r2 = (te3.C49046ct) r2     // Catch:{ d -> 0x0319 }
            r17 = r7
            goto L_0x0390
        L_0x0319:
            r0 = move-exception
            goto L_0x0362
        L_0x031b:
            r0 = move-exception
            r9 = r42
            goto L_0x0340
        L_0x031f:
            r0 = move-exception
            r39 = r9
            r41 = r10
            r40 = r11
            r35 = r12
            r3 = r13
            r36 = r14
            r34 = r38
            r9 = r47
            goto L_0x0340
        L_0x0330:
            r0 = move-exception
            r39 = r9
            r41 = r10
            r40 = r11
            r35 = r12
            r3 = r13
            r36 = r34
            r9 = r47
            r34 = r14
        L_0x0340:
            r11 = r3
            r3 = r8
            r10 = r9
            r12 = r25
            r13 = r26
            r14 = r27
            r15 = r28
            r8 = r31
            r25 = r35
            r28 = r39
            r27 = r40
            r26 = r41
            r9 = r2
            r31 = r4
            r35 = r6
            r6 = r32
            r4 = r1
            r32 = r5
            r1 = r7
            r7 = r17
        L_0x0362:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "cgi errCode:"
            r2.append(r5)
            int r5 = r0.f35058f
            r2.append(r5)
            java.lang.String r5 = " errType:"
            r2.append(r5)
            int r5 = r0.f35057e
            r2.append(r5)
            java.lang.String r5 = " errMsg:"
            r2.append(r5)
            java.lang.String r0 = r0.f35059g
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r17 = r7
            r2 = r21
        L_0x0390:
            r0 = r28
            r5 = r32
            r47 = r35
            r7 = r1
            r1 = r4
            r28 = r15
            r4 = r31
            r15 = r36
            r31 = r8
            r8 = r3
            r3 = r26
            r26 = r13
            r13 = r11
            r11 = r27
            r27 = r14
            r14 = r34
            r44 = r25
            r25 = r12
            r12 = r44
            if (r2 == 0) goto L_0x07e5
            java.util.LinkedList<te3.qc0> r2 = r2.f131938e
            r32 = r8
            java.lang.String r8 = "response.List"
            gy3.C87412m.m108593f(r2, r8)
            java.util.Iterator r2 = r2.iterator()
            r8 = 0
        L_0x03c3:
            boolean r34 = r2.hasNext()
            if (r34 == 0) goto L_0x07a4
            java.lang.Object r34 = r2.next()
            int r35 = r8 + 1
            if (r8 < 0) goto L_0x07a0
            r8 = r34
            te3.qc0 r8 = (te3.C101832qc0) r8
            r34 = r2
            java.lang.String r2 = r8.f299210d
            if (r2 == 0) goto L_0x03e4
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x03e2
            goto L_0x03e4
        L_0x03e2:
            r2 = 0
            goto L_0x03e5
        L_0x03e4:
            r2 = 1
        L_0x03e5:
            if (r2 == 0) goto L_0x03f3
            r40 = r1
            r36 = r9
            r37 = r10
            r41 = r14
            r39 = r15
            goto L_0x075a
        L_0x03f3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r36 = r9
            java.lang.String r9 = "process favCDNItem dataId:"
            r2.append(r9)
            java.lang.String r9 = r8.f299210d
            r2.append(r9)
            java.lang.String r9 = " status:"
            r2.append(r9)
            int r9 = r8.f299218o
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            int r2 = r8.f299218o
            java.lang.String r9 = "thumb_"
            r37 = r10
            java.lang.String r10 = "not found favdataitem data "
            java.lang.String r38 = ""
            r39 = r15
            java.lang.String r15 = "favCDNItem.DataId"
            r40 = r1
            java.lang.String r1 = "this as java.lang.String).substring(startIndex)"
            r41 = r14
            r14 = 1
            if (r2 == r14) goto L_0x0548
            r14 = 2
            if (r2 != r14) goto L_0x0435
            goto L_0x0548
        L_0x0435:
            java.lang.String r2 = r8.f299210d
            gy3.C87412m.m108593f(r2, r15)
            r14 = 0
            boolean r2 = z04.C112551y.m153819s(r2, r9, r14)
            java.lang.String r9 = "dataId:"
            if (r2 == 0) goto L_0x04ca
            java.lang.String r2 = r8.f299210d
            if (r2 == 0) goto L_0x0450
            r14 = 6
            java.lang.String r2 = r2.substring(r14)
            gy3.C87412m.m108593f(r2, r1)
            goto L_0x0452
        L_0x0450:
            r2 = r38
        L_0x0452:
            java.lang.Object r1 = r5.get(r2)
            te3.rc0 r1 = (te3.C101834rc0) r1
            if (r1 == 0) goto L_0x049a
            java.lang.String r2 = r1.f299309j
            if (r2 == 0) goto L_0x0467
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x0465
            goto L_0x0467
        L_0x0465:
            r2 = 0
            goto L_0x0468
        L_0x0467:
            r2 = 1
        L_0x0468:
            if (r2 == 0) goto L_0x0495
            di3.d r2 = di3.C86312j.m106911c(r33)
            qo.h r2 = (p663qo.C101211h) r2
            java.lang.String r2 = r2.mo140293rN()
            r1.mo141255k(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            java.lang.String r8 = r1.f299280T
            r2.append(r8)
            java.lang.String r8 = " local not exist cdn thumb key, generate "
            r2.append(r8)
            java.lang.String r8 = r1.f299309j
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
        L_0x0495:
            r12.add(r1)
            goto L_0x075a
        L_0x049a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            int r2 = r8.f299218o
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r1)
            java.lang.String r1 = r8.f299210d
            gy3.C87412m.m108593f(r1, r15)
            int r2 = r8.f299218o
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            java.lang.Object r1 = r3.put(r1, r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x075a
        L_0x04ca:
            java.lang.String r1 = r8.f299210d
            if (r1 != 0) goto L_0x04d0
            r1 = r38
        L_0x04d0:
            java.lang.Object r2 = r5.get(r1)
            te3.rc0 r2 = (te3.C101834rc0) r2
            if (r2 == 0) goto L_0x0518
            java.lang.String r1 = r2.f299329u
            if (r1 == 0) goto L_0x04e5
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x04e3
            goto L_0x04e5
        L_0x04e3:
            r1 = 0
            goto L_0x04e6
        L_0x04e5:
            r1 = 1
        L_0x04e6:
            if (r1 == 0) goto L_0x0513
            di3.d r1 = di3.C86312j.m106911c(r33)
            qo.h r1 = (p663qo.C101211h) r1
            java.lang.String r1 = r1.mo140293rN()
            r2.mo141253f(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r8 = r2.f299280T
            r1.append(r8)
            java.lang.String r8 = " local not exist cdn data key, generate "
            r1.append(r8)
            java.lang.String r8 = r2.f299329u
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
        L_0x0513:
            r13.add(r2)
            goto L_0x075a
        L_0x0518:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r1)
            r1 = 32
            r2.append(r1)
            int r1 = r8.f299218o
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r1)
            java.lang.String r1 = r8.f299210d
            gy3.C87412m.m108593f(r1, r15)
            int r2 = r8.f299218o
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            java.lang.Object r1 = r3.put(r1, r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x075a
        L_0x0548:
            java.lang.String r2 = r8.f299210d
            gy3.C87412m.m108593f(r2, r15)
            r14 = 0
            boolean r2 = z04.C112551y.m153819s(r2, r9, r14)
            if (r2 == 0) goto L_0x066a
            java.lang.String r2 = r8.f299210d
            if (r2 == 0) goto L_0x0561
            r9 = 6
            java.lang.String r2 = r2.substring(r9)
            gy3.C87412m.m108593f(r2, r1)
            goto L_0x0563
        L_0x0561:
            r2 = r38
        L_0x0563:
            java.lang.Object r1 = r5.get(r2)
            te3.rc0 r1 = (te3.C101834rc0) r1
            if (r1 == 0) goto L_0x0634
            java.lang.String r2 = r8.f299215i
            r1.mo141255k(r2)
            java.lang.String r2 = r8.f299214h
            r1.mo141256l(r2)
            r2 = 1
            r1.mo141232F(r2)
            long r9 = r1.f299336x0
            int r2 = r8.f299213g
            long r14 = (long) r2
            int r38 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r38 == 0) goto L_0x05b7
            if (r2 <= 0) goto L_0x05b7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = r8.f299210d
            r2.append(r9)
            java.lang.String r9 = " svrThumbFullSize %d, localThumbFullSize %d"
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            int r9 = r8.f299213g
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r9)
            r9 = 0
            r10[r9] = r14
            long r14 = r1.f299336x0
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r14)
            r14 = 1
            r10[r14] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r2, r10)
            int r2 = r8.f299213g
            long r9 = (long) r2
            r1.mo141243R(r9)
        L_0x05b7:
            java.lang.String r2 = r8.f299211e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x05f1
            java.lang.String r2 = r8.f299211e
            java.lang.String r9 = r1.f299288X
            boolean r2 = gy3.C87412m.m108589b(r2, r9)
            if (r2 != 0) goto L_0x05f1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = r8.f299210d
            r2.append(r9)
            java.lang.String r9 = " svrThumbMd5 %s, localThumbMd5 %s"
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r9 = r8.f299211e
            r14 = 0
            r10[r14] = r9
            java.lang.String r9 = r1.f299288X
            r14 = 1
            r10[r14] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r2, r10)
            java.lang.String r2 = r8.f299211e
            r1.mo141245T(r2)
        L_0x05f1:
            java.lang.String r2 = r8.f299212f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x062c
            java.lang.String r2 = r8.f299212f
            java.lang.String r9 = r1.f299292Z
            boolean r2 = gy3.C87412m.m108589b(r2, r9)
            if (r2 != 0) goto L_0x062c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = r8.f299210d
            r2.append(r9)
            java.lang.String r9 = " svrThumbHead256md5 %s, localThumbHead256md5 %s"
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r9 = r8.f299212f
            r14 = 0
            r10[r14] = r9
            java.lang.String r9 = r1.f299292Z
            r14 = 1
            r10[r14] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r2, r10)
            java.lang.String r2 = r8.f299212f
            r1.mo141244S(r2)
            goto L_0x062d
        L_0x062c:
            r14 = 1
        L_0x062d:
            int r1 = r7.f27483d
            int r1 = r1 + r14
            r7.f27483d = r1
            goto L_0x075a
        L_0x0634:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r9 = "not found favdataitem thumb "
            r1.append(r9)
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            int r2 = r8.f299218o
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r1)
            java.lang.String r1 = r8.f299210d
            gy3.C87412m.m108593f(r1, r15)
            int r2 = r8.f299218o
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            r3.put(r1, r8)
            int r1 = r0.f27483d
            r2 = 1
            int r1 = r1 + r2
            r0.f27483d = r1
            goto L_0x075a
        L_0x066a:
            java.lang.String r1 = r8.f299210d
            if (r1 != 0) goto L_0x0670
            r1 = r38
        L_0x0670:
            java.lang.Object r2 = r5.get(r1)
            te3.rc0 r2 = (te3.C101834rc0) r2
            if (r2 == 0) goto L_0x075e
            java.lang.String r1 = r8.f299215i
            r2.mo141253f(r1)
            java.lang.String r1 = r8.f299214h
            r2.mo141254j(r1)
            r1 = 1
            r2.mo141231E(r1)
            java.lang.String r1 = r8.f299217n
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0693
            java.lang.String r1 = r8.f299217n
            r2.mo141250Y(r1)
        L_0x0693:
            java.lang.String r1 = r8.f299211e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x06cd
            java.lang.String r1 = r8.f299211e
            java.lang.String r9 = r2.f299266M
            boolean r1 = gy3.C87412m.m108589b(r1, r9)
            if (r1 != 0) goto L_0x06cd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r9 = r8.f299210d
            r1.append(r9)
            java.lang.String r9 = " svrFullMd5 %s, localMd5 %s"
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r9 = r8.f299211e
            r14 = 0
            r10[r14] = r9
            java.lang.String r9 = r2.f299266M
            r14 = 1
            r10[r14] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r1, r10)
            java.lang.String r1 = r8.f299211e
            r2.mo141268x(r1)
        L_0x06cd:
            java.lang.String r1 = r8.f299212f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0707
            java.lang.String r1 = r8.f299212f
            java.lang.String r9 = r2.f299271P
            boolean r1 = gy3.C87412m.m108589b(r1, r9)
            if (r1 != 0) goto L_0x0707
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r9 = r8.f299210d
            r1.append(r9)
            java.lang.String r9 = " svrHead256md5 %s, localHead256md5 %s"
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r9 = r8.f299212f
            r14 = 0
            r10[r14] = r9
            java.lang.String r9 = r2.f299271P
            r14 = 1
            r10[r14] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r1, r10)
            java.lang.String r1 = r8.f299212f
            r2.mo141270z(r1)
        L_0x0707:
            int r1 = r8.f299213g
            if (r1 <= 0) goto L_0x0745
            long r9 = (long) r1
            long r14 = r2.f299276R
            int r1 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0745
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r9 = r8.f299210d
            r1.append(r9)
            java.lang.String r9 = " svrFullSize %d, localFullSize %d"
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            int r9 = r8.f299213g
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r9)
            r9 = 0
            r10[r9] = r14
            long r14 = r2.f299276R
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r14)
            r14 = 1
            r10[r14] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r1, r10)
            int r1 = r8.f299213g
            long r9 = (long) r1
            r2.mo141269y(r9)
        L_0x0745:
            int r1 = r8.f299218o
            r9 = 2
            if (r1 != r9) goto L_0x0754
            int r1 = r8.f299219p
            r2.f299291Y0 = r1
            r1 = 1
            r2.f299293Z0 = r1
            r11.f27482d = r1
            goto L_0x0755
        L_0x0754:
            r1 = 1
        L_0x0755:
            int r2 = r4.f27483d
            int r2 = r2 + r1
            r4.f27483d = r2
        L_0x075a:
            r1 = r41
            r8 = 1
            goto L_0x0791
        L_0x075e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r1)
            r1 = 32
            r2.append(r1)
            int r1 = r8.f299218o
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r1)
            java.lang.String r1 = r8.f299210d
            gy3.C87412m.m108593f(r1, r15)
            int r2 = r8.f299218o
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            r3.put(r1, r8)
            r1 = r41
            int r2 = r1.f27483d
            r8 = 1
            int r2 = r2 + r8
            r1.f27483d = r2
        L_0x0791:
            r14 = r1
            r2 = r34
            r8 = r35
            r9 = r36
            r10 = r37
            r15 = r39
            r1 = r40
            goto L_0x03c3
        L_0x07a0:
            sx3.C64197v.m75542k()
            throw r21
        L_0x07a4:
            r40 = r1
            r36 = r9
            r37 = r10
            r1 = r14
            r39 = r15
            r8 = 1
            boolean r2 = r3.isEmpty()
            r2 = r2 ^ r8
            if (r2 == 0) goto L_0x07e0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "errorDataIdMap: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            di3.d r0 = di3.C86312j.m106911c(r31)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            r2 = r40
            long r1 = r2.field_localId
            xb1.d r0 = (xb1.C102614d) r0
            r3 = 3
            r0.mo142272mL(r3, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x07e0:
            r2 = r40
            rx3.b0 r8 = rx3.C13598b0.f38549a
            goto L_0x07f1
        L_0x07e5:
            r2 = r1
            r32 = r8
            r36 = r9
            r37 = r10
            r1 = r14
            r39 = r15
            r8 = r21
        L_0x07f1:
            if (r8 != 0) goto L_0x0808
            di3.d r0 = di3.C86312j.m106911c(r31)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            long r1 = r2.field_localId
            xb1.d r0 = (xb1.C102614d) r0
            r3 = 3
            r0.mo142272mL(r3, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0808:
            r9 = r0
            r14 = r1
            r1 = r2
            r10 = r3
            r8 = r32
            r3 = r33
            r2 = r36
            r15 = r39
            r32 = r6
            r6 = r47
            r47 = r37
            goto L_0x0284
        L_0x081c:
            r39 = r9
            r40 = r11
            r35 = r12
            r3 = r13
            r34 = r14
            r9 = r47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "after cgi ThumbSize:"
            r0.append(r5)
            int r5 = r35.size()
            r0.append(r5)
            java.lang.String r5 = " DataSize:"
            r0.append(r5)
            int r5 = r3.size()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r5 = r32
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            te3.kd0 r0 = r1.field_favProto
            r6.mo141981i3(r0)
            java.lang.String r0 = pb1.C100755z.m131907w2(r1)
            r1.field_xml = r0
            boolean r0 = pb1.C100745t.m131889a(r0)
            if (r0 == 0) goto L_0x0865
            if (r8 != 0) goto L_0x0861
            goto L_0x0873
        L_0x0861:
            r10 = 0
            r8.f265510p = r10
            goto L_0x0873
        L_0x0865:
            if (r8 != 0) goto L_0x0868
            goto L_0x086b
        L_0x0868:
            r0 = -1
            r8.f265510p = r0
        L_0x086b:
            if (r8 != 0) goto L_0x086e
            goto L_0x0873
        L_0x086e:
            java.lang.String r0 = r1.field_xml
            r8.mo126619s(r0)
        L_0x0873:
            di3.d r0 = di3.C86312j.m106911c(r31)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            java.lang.String[] r10 = new java.lang.String[]{r28}
            xb1.d r0 = (xb1.C102614d) r0
            boolean r0 = r0.update(r1, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "save fav item info after checkCDN "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.util.Iterator r0 = r35.iterator()
            r12 = r2
            r11 = r5
            r10 = r8
            r13 = r9
            r14 = r25
            r15 = r28
            r9 = r35
            r5 = r39
            r2 = r40
            r25 = 0
            r8 = r6
            r6 = r34
        L_0x08b3:
            boolean r28 = r0.hasNext()
            if (r28 == 0) goto L_0x0a99
            java.lang.Object r28 = r0.next()
            r47 = r11
            int r11 = r25 + 1
            if (r25 < 0) goto L_0x0a95
            r25 = r15
            r15 = r28
            te3.rc0 r15 = (te3.C101834rc0) r15
            r28 = r13
            java.lang.String r13 = pb1.C100734q.m131826Q(r15)
            boolean r32 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r32 != 0) goto L_0x0a21
            r40 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r41 = r13
            java.lang.String r13 = "FavCheckCdnFSC_record_thumb_"
            r11.append(r13)
            java.lang.String r13 = r15.f299280T
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            com.tencent.mm.vfs.m1 r13 = new com.tencent.mm.vfs.m1
            r42 = r0
            rx3.g r0 = r8.f301598f
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            com.tencent.mm.vfs.m1 r0 = (com.tencent.p014mm.vfs.C86009m1) r0
            r13.<init>((com.tencent.p014mm.vfs.C86009m1) r0, (java.lang.String) r11)
            java.lang.String r0 = r13.mo119971i()
            gy3.C87412m.m108593f(r0, r14)
            di3.d r13 = di3.C86312j.m106911c(r30)
            pw.d r13 = (p654pw.C100972d) r13
            r43 = r14
            java.lang.String r14 = "FavCheckCdnFSCThumb"
            gi.g r13 = r13.mo139622B6(r14, r0, r15)
            r13.field_mediaId = r11
            di3.d r14 = di3.C86312j.m106911c(r29)
            r33 = r13
            r13 = r48
            gy3.C87412m.m108593f(r14, r13)
            r32 = r14
            qo.i r32 = (p663qo.C77384i) r32
            r34 = 0
            r36 = 0
            r38 = 6
            r39 = 0
            r12.f301603d = r8
            r12.f301604e = r1
            r12.f301605f = r10
            r12.f301606g = r4
            r12.f301607h = r7
            r12.f301608i = r6
            r12.f301609j = r5
            r12.f301610n = r2
            r12.f301611o = r9
            r12.f301612p = r3
            r14 = r42
            r12.f301613q = r14
            r12.f301614r = r15
            r42 = r1
            r1 = r41
            r12.f301615s = r1
            r12.f301616t = r11
            r12.f301617u = r0
            r48 = r0
            r0 = r40
            r12.f301618v = r0
            r1 = 2
            r12.f301621y = r1
            r37 = r12
            java.lang.Object r1 = p663qo.C77384i.C77385a.m93301a(r32, r33, r34, r36, r37, r38, r39)
            r0 = r28
            if (r1 != r0) goto L_0x0963
            return r0
        L_0x0963:
            r33 = r4
            r32 = r7
            r28 = r9
            r34 = r10
            r10 = r11
            r9 = r12
            r4 = r16
            r7 = r17
            r12 = r41
            r11 = r0
            r0 = r27
            r27 = r3
            r3 = r48
            r44 = r6
            r6 = r47
            r47 = r8
            r8 = r31
            r31 = r44
            r45 = r26
            r26 = r14
            r14 = r45
        L_0x098a:
            com.tencent.mm.modelcdntran.v r1 = (com.tencent.p014mm.modelcdntran.C92798v) r1
            if (r1 == 0) goto L_0x0993
            r48 = r2
            com.tencent.mm.modelcdntran.v$a r2 = r1.f267130a
            goto L_0x0997
        L_0x0993:
            r48 = r2
            r2 = r21
        L_0x0997:
            if (r2 == r7) goto L_0x09d6
            if (r1 == 0) goto L_0x099e
            com.tencent.mm.modelcdntran.v$a r2 = r1.f267130a
            goto L_0x09a0
        L_0x099e:
            r2 = r21
        L_0x09a0:
            if (r2 != r4) goto L_0x09a3
            goto L_0x09d6
        L_0x09a3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r3 = " download thumb fail "
            r2.append(r3)
            if (r1 == 0) goto L_0x09b5
            com.tencent.mm.modelcdntran.v$a r3 = r1.f267130a
            goto L_0x09b7
        L_0x09b5:
            r3 = r21
        L_0x09b7:
            r2.append(r3)
            r3 = 32
            r2.append(r3)
            if (r1 == 0) goto L_0x09c9
            int r1 = r1.f267132c
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r1)
            goto L_0x09cb
        L_0x09c9:
            r3 = r21
        L_0x09cb:
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            goto L_0x09fd
        L_0x09d6:
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106463x(r3, r12)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r10 = " download thumb success and move file from "
            r2.append(r10)
            r2.append(r3)
            r2.append(r0)
            r2.append(r12)
            r2.append(r14)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
        L_0x09fd:
            r2 = r48
            r16 = r4
            r17 = r7
            r41 = r12
            r3 = r27
            r7 = r32
            r4 = r33
            r10 = r34
            r1 = r42
            r27 = r0
            r12 = r9
            r0 = r26
            r9 = r28
            r26 = r14
            r14 = r11
            r11 = r6
            r6 = r31
            r31 = r8
            r8 = r47
            goto L_0x0a35
        L_0x0a21:
            r42 = r1
            r40 = r11
            r41 = r13
            r43 = r14
            r13 = r48
            r14 = r0
            r0 = r28
            r11 = r47
            r44 = r14
            r14 = r0
            r0 = r44
        L_0x0a35:
            boolean r28 = com.tencent.p014mm.vfs.C86013q1.m106450k(r41)
            if (r28 != 0) goto L_0x0a8a
            di3.d r0 = di3.C86312j.m106911c(r31)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            long r1 = r1.field_localId
            xb1.d r0 = (xb1.C102614d) r0
            r3 = 3
            r0.mo142272mL(r3, r1)
            r0 = 10001(0x2711, float:1.4014E-41)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r15.f299258I
            r1.append(r2)
            r2 = 58
            r1.append(r2)
            java.lang.String r2 = r15.f299280T
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r8.getClass()
            r2 = 20002(0x4e22, float:2.8029E-41)
            pb1.C100745t.m131894f(r2, r0, r1)
            if (r10 != 0) goto L_0x0a72
            goto L_0x0a75
        L_0x0a72:
            r1 = -2
            r10.f265515u = r1
        L_0x0a75:
            if (r10 != 0) goto L_0x0a78
            goto L_0x0a7c
        L_0x0a78:
            r0 = -16
            r10.f265517w = r0
        L_0x0a7c:
            if (r10 == 0) goto L_0x0a81
            r10.mo86054n()
        L_0x0a81:
            pb1.b0 r0 = pb1.C100698b0.f295038a
            r1 = 1
            r0.mo140131g(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0a8a:
            r48 = r13
            r13 = r14
            r15 = r25
            r25 = r40
            r14 = r43
            goto L_0x08b3
        L_0x0a95:
            sx3.C64197v.m75542k()
            throw r21
        L_0x0a99:
            r42 = r1
            r47 = r11
            r0 = r13
            r43 = r14
            r25 = r15
            r13 = r48
            java.util.Iterator r1 = r3.iterator()
            r14 = r0
            r0 = r1
            r1 = r42
            r15 = r43
            r22 = 0
        L_0x0ab0:
            boolean r28 = r0.hasNext()
            if (r28 == 0) goto L_0x0ca7
            java.lang.Object r28 = r0.next()
            r40 = r11
            int r11 = r22 + 1
            if (r22 < 0) goto L_0x0ca3
            r22 = r14
            r14 = r28
            te3.rc0 r14 = (te3.C101834rc0) r14
            r47 = r11
            java.lang.String r11 = pb1.C100734q.m131880w(r14)
            boolean r28 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)
            if (r28 != 0) goto L_0x0c25
            r48 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r28 = r0
            java.lang.String r0 = "FavCheckCdnFSC_record_data_"
            r11.append(r0)
            java.lang.String r0 = r14.f299280T
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.tencent.mm.vfs.m1 r11 = new com.tencent.mm.vfs.m1
            r41 = r3
            rx3.g r3 = r8.f301598f
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            com.tencent.mm.vfs.m1 r3 = (com.tencent.p014mm.vfs.C86009m1) r3
            r11.<init>((com.tencent.p014mm.vfs.C86009m1) r3, (java.lang.String) r0)
            java.lang.String r3 = r11.mo119971i()
            gy3.C87412m.m108593f(r3, r15)
            di3.d r11 = di3.C86312j.m106911c(r30)
            pw.d r11 = (p654pw.C100972d) r11
            r42 = r15
            java.lang.String r15 = "FavCheckCdnFSCData"
            gi.g r11 = r11.hf0(r15, r3, r14)
            r11.field_mediaId = r0
            di3.d r15 = di3.C86312j.m106911c(r29)
            gy3.C87412m.m108593f(r15, r13)
            r32 = r15
            qo.i r32 = (p663qo.C77384i) r32
            r34 = 0
            r36 = 0
            r38 = 6
            r39 = 0
            r12.f301603d = r8
            r12.f301604e = r1
            r12.f301605f = r10
            r12.f301606g = r4
            r12.f301607h = r7
            r12.f301608i = r6
            r12.f301609j = r5
            r12.f301610n = r2
            r12.f301611o = r9
            r15 = r41
            r12.f301612p = r15
            r41 = r8
            r8 = r28
            r12.f301613q = r8
            r12.f301614r = r14
            r8 = r48
            r12.f301615s = r8
            r12.f301616t = r0
            r12.f301617u = r3
            r48 = r0
            r0 = r47
            r12.f301618v = r0
            r47 = r3
            r3 = 3
            r12.f301621y = r3
            r33 = r11
            r37 = r12
            java.lang.Object r3 = p663qo.C77384i.C77385a.m93301a(r32, r33, r34, r36, r37, r38, r39)
            r11 = r22
            if (r3 != r11) goto L_0x0b62
            return r11
        L_0x0b62:
            r22 = r0
            r32 = r4
            r0 = r8
            r33 = r10
            r10 = r31
            r8 = r40
            r4 = r47
            r31 = r7
            r7 = r16
            r47 = r41
            r16 = r2
            r2 = r27
            r27 = r9
            r9 = r17
            r44 = r11
            r11 = r48
            r48 = r1
            r1 = r26
            r26 = r15
            r15 = r44
        L_0x0b89:
            com.tencent.mm.modelcdntran.v r3 = (com.tencent.p014mm.modelcdntran.C92798v) r3
            if (r3 == 0) goto L_0x0b92
            r17 = r5
            com.tencent.mm.modelcdntran.v$a r5 = r3.f267130a
            goto L_0x0b96
        L_0x0b92:
            r17 = r5
            r5 = r21
        L_0x0b96:
            if (r5 == r9) goto L_0x0bd5
            if (r3 == 0) goto L_0x0b9d
            com.tencent.mm.modelcdntran.v$a r5 = r3.f267130a
            goto L_0x0b9f
        L_0x0b9d:
            r5 = r21
        L_0x0b9f:
            if (r5 != r7) goto L_0x0ba2
            goto L_0x0bd5
        L_0x0ba2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            java.lang.String r5 = " download data fail "
            r4.append(r5)
            if (r3 == 0) goto L_0x0bb4
            com.tencent.mm.modelcdntran.v$a r5 = r3.f267130a
            goto L_0x0bb6
        L_0x0bb4:
            r5 = r21
        L_0x0bb6:
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            if (r3 == 0) goto L_0x0bc8
            int r3 = r3.f267132c
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r3)
            goto L_0x0bca
        L_0x0bc8:
            r11 = r21
        L_0x0bca:
            r4.append(r11)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            goto L_0x0bfe
        L_0x0bd5:
            r5 = 32
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106463x(r4, r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r11)
            java.lang.String r11 = " download data success and move file from "
            r5.append(r11)
            r5.append(r4)
            r5.append(r2)
            r5.append(r0)
            r5.append(r1)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
        L_0x0bfe:
            r11 = r0
            r20 = r1
            r40 = r8
            r5 = r17
            r0 = r28
            r4 = r32
            r3 = 32
            r8 = r47
            r1 = r48
            r17 = r9
            r9 = r27
            r27 = r2
            r2 = r16
            r16 = r7
            r7 = r31
            r31 = r10
            r10 = r33
            r44 = r15
            r15 = r14
            r14 = r44
            goto L_0x0c40
        L_0x0c25:
            r28 = r0
            r41 = r8
            r8 = r11
            r42 = r15
            r11 = r22
            r0 = r47
            r15 = r3
            r3 = 32
            r22 = r0
            r20 = r26
            r0 = r28
            r26 = r15
            r15 = r14
            r14 = r11
            r11 = r8
            r8 = r41
        L_0x0c40:
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)
            if (r11 != 0) goto L_0x0c95
            di3.d r0 = di3.C86312j.m106911c(r31)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            long r1 = r1.field_localId
            xb1.d r0 = (xb1.C102614d) r0
            r11 = 3
            r0.mo142272mL(r11, r1)
            r0 = 10002(0x2712, float:1.4016E-41)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r15.f299258I
            r1.append(r2)
            r2 = 58
            r1.append(r2)
            java.lang.String r2 = r15.f299280T
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r8.getClass()
            r15 = 20002(0x4e22, float:2.8029E-41)
            pb1.C100745t.m131894f(r15, r0, r1)
            if (r10 != 0) goto L_0x0c7d
            goto L_0x0c80
        L_0x0c7d:
            r1 = -2
            r10.f265515u = r1
        L_0x0c80:
            if (r10 != 0) goto L_0x0c83
            goto L_0x0c87
        L_0x0c83:
            r0 = -17
            r10.f265517w = r0
        L_0x0c87:
            if (r10 == 0) goto L_0x0c8c
            r10.mo86054n()
        L_0x0c8c:
            pb1.b0 r0 = pb1.C100698b0.f295038a
            r1 = 1
            r0.mo140131g(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0c95:
            r15 = 20002(0x4e22, float:2.8029E-41)
            r18 = -2
            r3 = r26
            r11 = r40
            r15 = r42
            r26 = r20
            goto L_0x0ab0
        L_0x0ca3:
            sx3.C64197v.m75542k()
            throw r21
        L_0x0ca7:
            r15 = r3
            r40 = r11
            java.util.Iterator r0 = r9.iterator()
        L_0x0cae:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0cbf
            java.lang.Object r3 = r0.next()
            te3.rc0 r3 = (te3.C101834rc0) r3
            r8 = 0
            pb1.C100734q.m131831V(r3, r1, r8)
            goto L_0x0cae
        L_0x0cbf:
            r8 = 0
            java.util.Iterator r0 = r15.iterator()
            r23 = 0
        L_0x0cc6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0ce0
            java.lang.Object r3 = r0.next()
            int r11 = r23 + 1
            if (r23 < 0) goto L_0x0cdc
            te3.rc0 r3 = (te3.C101834rc0) r3
            pb1.C100734q.m131830U(r3, r1, r8, r8)
            r23 = r11
            goto L_0x0cc6
        L_0x0cdc:
            sx3.C64197v.m75542k()
            throw r21
        L_0x0ce0:
            if (r10 != 0) goto L_0x0ce3
            goto L_0x0ce7
        L_0x0ce3:
            int r0 = r4.f27483d
            r10.f265506l = r0
        L_0x0ce7:
            if (r10 != 0) goto L_0x0cea
            goto L_0x0cee
        L_0x0cea:
            int r0 = r7.f27483d
            r10.f265507m = r0
        L_0x0cee:
            if (r10 != 0) goto L_0x0cf1
            goto L_0x0cf5
        L_0x0cf1:
            int r0 = r6.f27483d
            r10.f265508n = r0
        L_0x0cf5:
            if (r10 != 0) goto L_0x0cf8
            goto L_0x0cfc
        L_0x0cf8:
            int r0 = r5.f27483d
            r10.f265509o = r0
        L_0x0cfc:
            if (r10 != 0) goto L_0x0cff
            goto L_0x0d05
        L_0x0cff:
            int r0 = r15.size()
            r10.f265512r = r0
        L_0x0d05:
            if (r10 != 0) goto L_0x0d08
            goto L_0x0d0e
        L_0x0d08:
            int r0 = r9.size()
            r10.f265513s = r0
        L_0x0d0e:
            boolean r0 = r2.f27482d
            if (r0 == 0) goto L_0x0d69
            r0 = 12
            r1.field_itemStatus = r0
            di3.d r0 = di3.C86312j.m106911c(r31)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            java.lang.String[] r2 = new java.lang.String[]{r25}
            xb1.d r0 = (xb1.C102614d) r0
            r0.update(r1, r2)
            boolean r0 = r9.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x0d52
            boolean r0 = r15.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0d39
            goto L_0x0d52
        L_0x0d39:
            java.lang.String r0 = "waitServerUpload favSendService run"
            r2 = r40
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            di3.d r0 = di3.C86312j.m106911c(r31)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.e1 r0 = r0.th0()
            wb1.x r0 = (wb1.C102421x) r0
            r0.mo142000c()
            goto L_0x0e9c
        L_0x0d52:
            r2 = r40
            java.lang.String r0 = "waitServerUpload favCdnService run"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            di3.d r0 = di3.C86312j.m106911c(r31)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.l0 r0 = r0.mo128212cl()
            r0.run()
            goto L_0x0e9c
        L_0x0d69:
            r2 = r40
            boolean r0 = r9.isEmpty()
            r3 = 1
            r0 = r0 ^ r3
            r4 = 18
            if (r0 != 0) goto L_0x0e08
            boolean r0 = r15.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0d7e
            goto L_0x0e08
        L_0x0d7e:
            int r0 = r1.field_id
            if (r0 <= 0) goto L_0x0dc0
            r0 = 17
            r1.field_itemStatus = r0
            di3.d r0 = di3.C86312j.m106911c(r31)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            java.lang.String[] r3 = new java.lang.String[]{r25}
            xb1.d r0 = (xb1.C102614d) r0
            r0.update(r1, r3)
            di3.d r0 = di3.C86312j.m106911c(r31)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.y0 r0 = r0.mo128203Ly()
            wb1.u r0 = (wb1.C102417u) r0
            r0.mo141993c()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "STATUS_MODING id:"
            r0.append(r3)
            int r1 = r1.field_id
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0e9c
        L_0x0dc0:
            int r0 = r1.field_type
            if (r0 != r4) goto L_0x0dca
            te3.kd0 r0 = r1.field_favProto
            r3 = 1
            r0.mo141222t(r3)
        L_0x0dca:
            r3 = 9
            r1.field_itemStatus = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "STATUS_SENDING type:"
            r0.append(r3)
            int r3 = r1.field_type
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            di3.d r0 = di3.C86312j.m106911c(r31)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            java.lang.String[] r2 = new java.lang.String[]{r25}
            xb1.d r0 = (xb1.C102614d) r0
            r0.update(r1, r2)
            di3.d r0 = di3.C86312j.m106911c(r31)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.e1 r0 = r0.th0()
            wb1.x r0 = (wb1.C102421x) r0
            r0.mo142000c()
            goto L_0x0e9c
        L_0x0e08:
            int r0 = r1.field_id
            if (r0 <= 0) goto L_0x0e27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "STATUS_NEED_MOD_UPLOADING id:"
            r0.append(r3)
            int r3 = r1.field_id
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = 15
            r1.field_itemStatus = r0
            goto L_0x0e4a
        L_0x0e27:
            int r0 = r1.field_type
            if (r0 != r4) goto L_0x0e31
            te3.kd0 r0 = r1.field_favProto
            r3 = 1
            r0.mo141222t(r3)
        L_0x0e31:
            r0 = 4
            r1.field_itemStatus = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "STATUS_DATA_UPLOADING type:"
            r0.append(r3)
            int r3 = r1.field_type
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x0e4a:
            di3.d r0 = di3.C86312j.m106911c(r31)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.w0 r0 = r0.mo128199Jq()
            java.lang.String[] r2 = new java.lang.String[]{r25}
            xb1.d r0 = (xb1.C102614d) r0
            r0.update(r1, r2)
            di3.d r0 = di3.C86312j.m106911c(r31)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.l0 r0 = r0.mo128212cl()
            r0.run()
            goto L_0x0e9c
        L_0x0e6b:
            if (r2 != 0) goto L_0x0e6e
            goto L_0x0e71
        L_0x0e6e:
            r1 = 0
            r2.f265504j = r1
        L_0x0e71:
            java.lang.String r1 = "Empty DataList, Start Send"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            r1 = 9
            r0.field_itemStatus = r1
            di3.d r1 = di3.C86312j.m106911c(r8)
            pb1.j1 r1 = (pb1.C100718j1) r1
            pb1.w0 r1 = r1.mo128199Jq()
            java.lang.String[] r2 = new java.lang.String[]{r15}
            xb1.d r1 = (xb1.C102614d) r1
            r1.update(r0, r2)
            di3.d r0 = di3.C86312j.m106911c(r8)
            pb1.j1 r0 = (pb1.C100718j1) r0
            pb1.e1 r0 = r0.th0()
            wb1.x r0 = (wb1.C102421x) r0
            r0.mo142000c()
        L_0x0e9c:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wb1.C102402n.mo141982j3(pb1.z, wx3.d):java.lang.Object");
    }
}
