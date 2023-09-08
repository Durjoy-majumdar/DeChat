package co1;

import android.os.SystemClock;
import android.text.TextUtils;
import bo1.C39825z;
import cm1.C55015f1;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import e03.C58469b;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import iy3.C60641c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import o40.C61926c;
import p663qo.C101213l;
import p682rz.C36594q;
import p823sg.C101614i;
import pl1.C62367r0;
import rx3.C13605o;
import sx3.C36907w;
import te3.C50296lq0;
import te3.C51974xh1;
import te3.C52117yh1;
import te3.C52175yv2;
import te3.C64689rq2;
import te3.C64802wh1;
import te3.C64850yb1;
import up1.C27696y;
import up1.C37521f;
import ux3.C65486b;
import vp1.C65840n;
import z04.C112551y;

/* renamed from: co1.e */
public final class C55048e {

    /* renamed from: L */
    public static final C26871a f154532L = new C26871a((C8480h) null);

    /* renamed from: M */
    public static final boolean f154533M = ((C36594q) C86312j.m106911c(C36594q.class)).mo60733UY(4);

    /* renamed from: N */
    public static final boolean f154534N = (((C101213l) C86312j.m106911c(C101213l.class)).mo140305fF() != 0);

    /* renamed from: A */
    public int f154535A;

    /* renamed from: B */
    public String f154536B;

    /* renamed from: C */
    public int f154537C;

    /* renamed from: D */
    public int f154538D;

    /* renamed from: E */
    public int f154539E;

    /* renamed from: F */
    public int f154540F;

    /* renamed from: G */
    public final int f154541G;

    /* renamed from: H */
    public int f154542H;

    /* renamed from: I */
    public int f154543I;

    /* renamed from: J */
    public float f154544J;

    /* renamed from: K */
    public final ConcurrentHashMap<Long, Object> f154545K;

    /* renamed from: a */
    public C39825z f154546a = new C39825z();

    /* renamed from: b */
    public int f154547b = 1;

    /* renamed from: c */
    public int f154548c = 4;

    /* renamed from: d */
    public int f154549d = C60641c.m70921b(30.000002f);

    /* renamed from: e */
    public long f154550e = 2097152;

    /* renamed from: f */
    public int f154551f = 1;

    /* renamed from: g */
    public int f154552g = 1;

    /* renamed from: h */
    public int f154553h = 4;

    /* renamed from: i */
    public int f154554i = C60641c.m70921b(0.0f);

    /* renamed from: j */
    public int f154555j;

    /* renamed from: k */
    public long f154556k;

    /* renamed from: l */
    public long f154557l;

    /* renamed from: m */
    public long f154558m;

    /* renamed from: n */
    public int f154559n = 1;

    /* renamed from: o */
    public int f154560o = 2;

    /* renamed from: p */
    public ConcurrentHashMap<String, C52117yh1> f154561p = new ConcurrentHashMap<>();

    /* renamed from: q */
    public ConcurrentHashMap<String, C52175yv2> f154562q = new ConcurrentHashMap<>();

    /* renamed from: r */
    public final C101614i<String, C13605o<C64850yb1, String, Long>> f154563r = new C101614i<>(300);

    /* renamed from: s */
    public final boolean f154564s;

    /* renamed from: t */
    public boolean f154565t;

    /* renamed from: u */
    public boolean f154566u;

    /* renamed from: v */
    public int f154567v;

    /* renamed from: w */
    public int f154568w;

    /* renamed from: x */
    public int f154569x;

    /* renamed from: y */
    public boolean f154570y;

    /* renamed from: z */
    public int f154571z;

    /* renamed from: co1.e$a */
    public static final class C26871a {
        public C26871a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C27696y mo53892a(String str) {
            C27696y yVar = C27696y.V0_VIDEO;
            if (C87412m.m108589b(str, "xV0")) {
                return yVar;
            }
            C27696y yVar2 = C27696y.V1_VIDEO;
            if (C87412m.m108589b(str, "xV1")) {
                return yVar2;
            }
            C27696y yVar3 = C27696y.V2_VIDEO;
            if (C87412m.m108589b(str, "xV2")) {
                return yVar3;
            }
            C27696y yVar4 = C27696y.V3_VIDEO;
            if (C87412m.m108589b(str, "xV3")) {
                return yVar4;
            }
            C27696y yVar5 = C27696y.V4_VIDEO;
            if (C87412m.m108589b(str, "xV4")) {
                return yVar5;
            }
            C27696y yVar6 = C27696y.V5_VIDEO;
            if (C87412m.m108589b(str, "xV5")) {
                return yVar6;
            }
            C27696y yVar7 = C27696y.V6_VIDEO;
            if (C87412m.m108589b(str, "xV6")) {
                return yVar7;
            }
            C27696y yVar8 = C27696y.V7_VIDEO;
            if (C87412m.m108589b(str, "xV7")) {
                return yVar8;
            }
            C27696y yVar9 = C27696y.V8_VIDEO;
            if (C87412m.m108589b(str, "xV8")) {
                return yVar9;
            }
            C27696y yVar10 = C27696y.V9_VIDEO;
            if (C87412m.m108589b(str, "xV9")) {
                return yVar10;
            }
            C27696y yVar11 = C27696y.V10_VIDEO;
            if (C87412m.m108589b(str, "xV10")) {
                return yVar11;
            }
            C27696y yVar12 = C27696y.V12_VIDEO;
            if (C87412m.m108589b(str, "xV12")) {
                return yVar12;
            }
            C27696y yVar13 = C27696y.V0_SDR_VIDEO;
            if (C87412m.m108589b(str, "xV0-Sdr")) {
                return yVar13;
            }
            C27696y yVar14 = C27696y.H0_VIDEO;
            if (C87412m.m108589b(str, "H0")) {
                return yVar14;
            }
            C27696y yVar15 = C27696y.H1_VIDEO;
            if (C87412m.m108589b(str, "H1")) {
                return yVar15;
            }
            C27696y yVar16 = C27696y.H2_VIDEO;
            if (C87412m.m108589b(str, "H2")) {
                return yVar16;
            }
            C27696y yVar17 = C27696y.H3_VIDEO;
            if (C87412m.m108589b(str, "H3")) {
                return yVar17;
            }
            C27696y yVar18 = C27696y.H4_VIDEO;
            if (C87412m.m108589b(str, "H4")) {
                return yVar18;
            }
            C27696y yVar19 = C27696y.H5_VIDEO;
            if (C87412m.m108589b(str, "H5")) {
                return yVar19;
            }
            C27696y yVar20 = C27696y.H6_VIDEO;
            if (C87412m.m108589b(str, "H6")) {
                return yVar20;
            }
            C27696y yVar21 = C27696y.H7_VIDEO;
            if (C87412m.m108589b(str, "H7")) {
                return yVar21;
            }
            C27696y yVar22 = C27696y.H8_VIDEO;
            if (C87412m.m108589b(str, "H8")) {
                return yVar22;
            }
            C27696y yVar23 = C27696y.H9_VIDEO;
            if (C87412m.m108589b(str, "H9")) {
                return yVar23;
            }
            C27696y yVar24 = C27696y.H10_VIDEO;
            if (C87412m.m108589b(str, "H10")) {
                return yVar24;
            }
            C27696y yVar25 = C27696y.H12_VIDEO;
            if (C87412m.m108589b(str, "H12")) {
                return yVar25;
            }
            C27696y yVar26 = C27696y.V2_HDR_10;
            if (C87412m.m108589b(str, "V2-Hdr10")) {
                return yVar26;
            }
            C27696y yVar27 = C27696y.V2_DOLBY_HDR;
            if (C87412m.m108589b(str, "V2-DolbyHdr")) {
                return yVar27;
            }
            C27696y yVar28 = C27696y.W1_VIDEO;
            if (C87412m.m108589b(str, "xW1")) {
                return yVar28;
            }
            C27696y yVar29 = C27696y.W2_VIDEO;
            if (C87412m.m108589b(str, "xW2")) {
                return yVar29;
            }
            C27696y yVar30 = C27696y.W3_VIDEO;
            if (C87412m.m108589b(str, "xW3")) {
                return yVar30;
            }
            C27696y yVar31 = C27696y.W4_VIDEO;
            if (C87412m.m108589b(str, "xW4")) {
                return yVar31;
            }
            C27696y yVar32 = C27696y.W5_VIDEO;
            if (C87412m.m108589b(str, "xW5")) {
                return yVar32;
            }
            return C87412m.m108589b(str, "W6") ? C27696y.W6_VIDEO : C27696y.V99_VIDEO;
        }
    }

    /* renamed from: co1.e$b */
    public static final class C55049b {

        /* renamed from: a */
        public final C58469b f154572a;

        /* renamed from: b */
        public final int f154573b;

        /* renamed from: c */
        public final long f154574c;

        /* renamed from: d */
        public final String f154575d;

        /* renamed from: e */
        public final String f154576e;

        /* renamed from: f */
        public final C62367r0 f154577f;

        /* renamed from: g */
        public final boolean f154578g;

        static {
            new C55049b(new C58469b(), 0, 0, "", "", new C62367r0(new C64689rq2(), C27696y.V99_VIDEO, "xV99", 0, 0, (String) null, 56, (C8480h) null), false, 64, (C8480h) null);
        }

        public C55049b(C58469b bVar, int i, long j, String str, String str2, C62367r0 r0Var, boolean z, int i2, C8480h hVar) {
            z = (i2 & 64) != 0 ? false : z;
            C87412m.m108594g(bVar, "taskContext");
            C87412m.m108594g(str, "fileFormat");
            C87412m.m108594g(str2, "codingFormat");
            C87412m.m108594g(r0Var, "media");
            this.f154572a = bVar;
            this.f154573b = i;
            this.f154574c = j;
            this.f154575d = str;
            this.f154576e = str2;
            this.f154577f = r0Var;
            this.f154578g = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C55049b)) {
                return false;
            }
            C55049b bVar = (C55049b) obj;
            return C87412m.m108589b(this.f154572a, bVar.f154572a) && this.f154573b == bVar.f154573b && this.f154574c == bVar.f154574c && C87412m.m108589b(this.f154575d, bVar.f154575d) && C87412m.m108589b(this.f154576e, bVar.f154576e) && C87412m.m108589b(this.f154577f, bVar.f154577f) && this.f154578g == bVar.f154578g;
        }

        public int hashCode() {
            long j = this.f154574c;
            int hashCode = ((((((((((this.f154572a.hashCode() * 31) + this.f154573b) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f154575d.hashCode()) * 31) + this.f154576e.hashCode()) * 31) + this.f154577f.hashCode()) * 31;
            boolean z = this.f154578g;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return this.f154573b + "%:" + this.f154574c + XVFSFile.PATH_SEPARATOR_CHAR + this.f154575d;
        }
    }

    /* renamed from: co1.e$c */
    public static final class C55050c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((C55015f1) t).field_fileFormat.hashCode()), Integer.valueOf(((C55015f1) t2).field_fileFormat.hashCode()));
        }
    }

    public C55048e() {
        C37521f fVar = C37521f.f99374d;
        this.f154564s = fVar.mo61171Y();
        this.f154571z = -1;
        this.f154535A = 10000;
        this.f154536B = "";
        this.f154537C = -1;
        this.f154538D = -1;
        this.f154539E = -1;
        fVar.getClass();
        this.f154541G = C37521f.f99323X;
        this.f154545K = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public final C13605o<C64850yb1, String, Long> mo76104a(String str, long j, LinkedList<C64850yb1> linkedList, String str2) {
        C64850yb1 yb12;
        String str3;
        T t;
        C64850yb1 yb13;
        boolean z;
        T t2;
        boolean z2;
        String str4 = str;
        long j2 = j;
        LinkedList<C64850yb1> linkedList2 = linkedList;
        String str5 = str2;
        if (!TextUtils.isEmpty(this.f154536B)) {
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (!C87412m.m108589b(((C64850yb1) t2).f186466d, this.f154536B) || TextUtils.isEmpty(this.f154536B)) {
                    z2 = false;
                    continue;
                } else {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            yb12 = (C64850yb1) t2;
            str3 = "step#0";
        } else {
            Iterator<T> it4 = linkedList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    t = null;
                    break;
                }
                t = it4.next();
                C64850yb1 yb14 = (C64850yb1) t;
                if (!C112551y.m153809i(yb14.f186469g, str, true) || ((long) yb14.f186468f) >= j2) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            yb12 = (C64850yb1) t;
            if (yb12 == null) {
                ListIterator<C64850yb1> listIterator = linkedList2.listIterator(linkedList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        yb13 = null;
                        break;
                    }
                    yb13 = listIterator.previous();
                    if (C112551y.m153809i(yb13.f186469g, str, true)) {
                        break;
                    }
                }
                C64850yb1 yb15 = yb13;
                yb12 = yb15 == null ? null : yb15;
                str3 = "step#2";
            } else {
                str3 = "step#1";
            }
        }
        String str6 = str5 + '.' + str3;
        StringBuilder sb = new StringBuilder();
        sb.append("findSpecInternal ");
        sb.append(str5);
        sb.append(" reqFormat");
        sb.append(str);
        sb.append(" maxBitRate:");
        sb.append(j2);
        sb.append(" output:");
        sb.append(yb12 != null ? C55051g.m62153b(yb12) : null);
        sb.append(" step:");
        sb.append(str6);
        sb.append(" input:");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
        for (C64850yb1 b : linkedList) {
            arrayList.add(C55051g.m62153b(b));
        }
        sb.append(arrayList);
        sb.append(' ');
        Log.m105924i("Finder.MediaPreloadModel", sb.toString());
        if (yb12 == null) {
            return null;
        }
        C64850yb1 yb16 = new C64850yb1();
        yb16.f186466d = yb12.f186466d;
        yb16.f186467e = yb12.f186467e;
        yb16.f186468f = yb12.f186468f;
        yb16.f186469g = yb12.f186469g;
        yb16.f186470h = yb12.f186470h;
        yb16.f186471i = yb12.f186471i;
        yb16.f186472j = yb12.f186472j;
        yb16.f186473n = yb12.f186473n;
        yb16.f186478s = yb12.f186478s;
        yb16.f186477r = yb12.f186477r;
        yb16.f186476q = yb12.f186476q;
        return mo76107d(yb16, str6, linkedList, j);
    }

    /* renamed from: b */
    public final C62367r0 mo76105b(long j, C64689rq2 rq22) {
        C64689rq2 rq23 = rq22;
        C87412m.m108594g(rq23, "media");
        long currentTimeMillis = System.currentTimeMillis();
        C13605o<C64850yb1, String, Long> c = mo76106c(j, rq22, false, 0);
        C64850yb1 yb12 = (C64850yb1) c.f38557d;
        String str = yb12.f186469g;
        if (str == null) {
            str = "";
        }
        C64689rq2 rq24 = rq23;
        C62367r0 r0Var = new C62367r0(rq22, f154532L.mo53892a(yb12.f186466d), yb12.f186466d, C112551y.m153809i(str, "h266", true) ? 3 : C112551y.m153809i(str, "h265", true) ? 2 : 1, yb12.f186470h, (String) null, 32, (C8480h) null);
        this.f154563r.put(r0Var.mo11841b(), c);
        StringBuilder sb = new StringBuilder();
        sb.append("[findTargetMedia] feedId=");
        sb.append(C61926c.m72691p(j));
        sb.append(" stage=");
        sb.append((String) c.f38558e);
        sb.append(" target");
        sb.append(C55051g.m62153b(yb12));
        sb.append(" sdrSpec=");
        LinkedList<C64850yb1> linkedList = rq24.f185282v;
        C87412m.m108593f(linkedList, "media.spec");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C64850yb1 yb13 : linkedList) {
            C87412m.m108593f(yb13, LocaleUtil.ITALIAN);
            arrayList.add(C55051g.m62153b(yb13));
        }
        sb.append(arrayList);
        sb.append(" hdrSpec=");
        LinkedList<C64850yb1> linkedList2 = rq24.f185265Z;
        C87412m.m108593f(linkedList2, "media.hdr_spec");
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList2, 10));
        for (C64850yb1 yb14 : linkedList2) {
            C87412m.m108593f(yb14, LocaleUtil.ITALIAN);
            arrayList2.add(C55051g.m62153b(yb14));
        }
        sb.append(arrayList2);
        sb.append(" hlsSpec=");
        LinkedList<C50296lq0> linkedList3 = rq24.f185264Y;
        C87412m.m108593f(linkedList3, "media.hls_spec");
        ArrayList arrayList3 = new ArrayList(C36907w.m41090l(linkedList3, 10));
        for (C50296lq0 lq02 : linkedList3) {
            C87412m.m108593f(lq02, LocaleUtil.ITALIAN);
            arrayList3.add("Spec[" + lq02.f137579g + ' ' + lq02.f137576d + ' ' + Util.getSizeKB((long) lq02.f137577e) + ']');
        }
        sb.append(arrayList3);
        sb.append(" maxBitRate:");
        sb.append(this.f154556k);
        sb.append(" isOverseasUser:");
        sb.append(f154534N);
        sb.append(" Cost=");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(' ');
        Log.m105924i("Finder.MediaPreloadModel", sb.toString());
        return r0Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: te3.yb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: te3.yb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: te3.yb1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: te3.yb1} */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0656, code lost:
        if (r4 != null) goto L_0x065d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0161, code lost:
        if (((java.lang.Boolean) ((rx3.C36570n) up1.C37521f.f99201J).getValue()).booleanValue() == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0175, code lost:
        if (up1.C37521f.f99285S6.mo60266n().intValue() == 1) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0177, code lost:
        r2.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x019f, code lost:
        if (((java.lang.Boolean) ((rx3.C36570n) up1.C37521f.f99192I).getValue()).booleanValue() == false) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b3, code lost:
        if (up1.C37521f.f99285S6.mo60266n().intValue() == 1) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b5, code lost:
        r2.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01eb, code lost:
        if (up1.C37521f.f99191H8.mo60266n().intValue() != 1) goto L_0x01ef;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0452  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13605o<te3.C64850yb1, java.lang.String, java.lang.Long> mo76106c(long r34, te3.C64689rq2 r36, boolean r37, int r38) {
        /*
            r33 = this;
            r6 = r33
            r15 = r36
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r7 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            long r8 = r6.f154556k
            boolean r0 = gr1.C59686x0.f170506a
            r6.f154565t = r0
            boolean r1 = gr1.C59686x0.f170507b
            boolean r2 = gr1.C59686x0.f170508c
            if (r0 == 0) goto L_0x001f
            if (r1 == 0) goto L_0x0017
            r1 = 1088(0x440, float:1.525E-42)
            goto L_0x0021
        L_0x0017:
            if (r2 == 0) goto L_0x001c
            r1 = 720(0x2d0, float:1.009E-42)
            goto L_0x0021
        L_0x001c:
            r1 = 540(0x21c, float:7.57E-43)
            goto L_0x0021
        L_0x001f:
            r1 = 10000(0x2710, float:1.4013E-41)
        L_0x0021:
            r6.f154535A = r1
            java.lang.String r10 = "h264"
            java.lang.String r11 = "h265"
            java.lang.String r12 = "h266"
            if (r0 == 0) goto L_0x002d
            r13 = r12
            goto L_0x0038
        L_0x002d:
            boolean r0 = f154533M
            if (r0 == 0) goto L_0x0037
            boolean r0 = f154534N
            if (r0 != 0) goto L_0x0037
            r13 = r11
            goto L_0x0038
        L_0x0037:
            r13 = r10
        L_0x0038:
            java.util.LinkedList<te3.yb1> r0 = r15.f185282v
            java.lang.String r14 = "media.spec"
            gy3.C87412m.m108593f(r0, r14)
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r16 = ""
            r1 = r16
        L_0x0047:
            boolean r2 = r0.hasNext()
            r3 = 58
            r4 = 45
            if (r2 == 0) goto L_0x0074
            java.lang.Object r2 = r0.next()
            te3.yb1 r2 = (te3.C64850yb1) r2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = r2.f186466d
            r5.append(r1)
            r5.append(r3)
            int r1 = r2.f186468f
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            goto L_0x0047
        L_0x0074:
            java.util.LinkedList<te3.yb1> r0 = r15.f185265Z
            java.lang.String r2 = "media.hdr_spec"
            gy3.C87412m.m108593f(r0, r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x007f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00ac
            java.lang.Object r5 = r0.next()
            te3.yb1 r5 = (te3.C64850yb1) r5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = r5.f186466d
            r4.append(r1)
            r4.append(r3)
            int r1 = r5.f186468f
            r4.append(r1)
            r5 = 45
            r4.append(r5)
            java.lang.String r1 = r4.toString()
            r4 = 45
            goto L_0x007f
        L_0x00ac:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.String> r0 = wp1.C15585f.f42214d
            java.lang.Long r3 = java.lang.Long.valueOf(r34)
            r0.put(r3, r1)
            di3.d r0 = di3.C86312j.m106911c(r7)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            co1.e r0 = r0.Hx0()
            bo1.z r0 = r0.f154546a
            r0.mo62457j1()
            java.util.LinkedList<te3.yb1> r0 = r15.f185282v
            gy3.C87412m.m108593f(r0, r14)
            java.util.Iterator r0 = r0.iterator()
        L_0x00cd:
            boolean r1 = r0.hasNext()
            r3 = 1
            if (r1 == 0) goto L_0x00e5
            java.lang.Object r1 = r0.next()
            r4 = r1
            te3.yb1 r4 = (te3.C64850yb1) r4
            int r4 = r4.f186479t
            if (r4 != r3) goto L_0x00e1
            r4 = 1
            goto L_0x00e2
        L_0x00e1:
            r4 = 0
        L_0x00e2:
            if (r4 == 0) goto L_0x00cd
            goto L_0x00e6
        L_0x00e5:
            r1 = 0
        L_0x00e6:
            te3.yb1 r1 = (te3.C64850yb1) r1
            if (r1 != 0) goto L_0x00ec
            r0 = 0
            goto L_0x00fa
        L_0x00ec:
            rx3.o r0 = new rx3.o
            long r3 = r6.f154556k
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "server"
            r0.<init>(r1, r4, r3)
        L_0x00fa:
            java.lang.String r4 = "Finder.MediaPreloadModel"
            if (r0 != 0) goto L_0x071d
            java.util.LinkedList<te3.yb1> r0 = r15.f185265Z
            gy3.C87412m.m108593f(r0, r2)
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            r19 = r7
            r7 = 46
            if (r1 >= r3) goto L_0x012c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "getSupportHdrSpecList return for version:"
            r0.append(r3)
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r5 = 1
            goto L_0x0213
        L_0x012c:
            java.util.Iterator r0 = r0.iterator()
        L_0x0130:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0207
            java.lang.Object r1 = r0.next()
            te3.yb1 r1 = (te3.C64850yb1) r1
            java.lang.String r3 = r1.f186466d
            java.lang.String r5 = "V2-DolbyHdr"
            boolean r3 = gy3.C87412m.m108589b(r3, r5)
            if (r3 == 0) goto L_0x017a
            co1.d r3 = co1.C16929d.f45756a
            boolean r3 = r3.mo18029a()
            if (r3 == 0) goto L_0x0163
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            rx3.g r3 = up1.C37521f.f99201J
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x0177
        L_0x0163:
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99285S6
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r5 = 1
            if (r3 != r5) goto L_0x017a
        L_0x0177:
            r2.add(r1)
        L_0x017a:
            java.lang.String r3 = r1.f186466d
            java.lang.String r5 = "V2-Hdr10"
            boolean r3 = gy3.C87412m.m108589b(r3, r5)
            if (r3 == 0) goto L_0x01b8
            co1.d r3 = co1.C16929d.f45756a
            boolean r3 = r3.mo18030b()
            if (r3 == 0) goto L_0x01a1
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            rx3.g r3 = up1.C37521f.f99192I
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x01b5
        L_0x01a1:
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99285S6
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r5 = 1
            if (r3 != r5) goto L_0x01b8
        L_0x01b5:
            r2.add(r1)
        L_0x01b8:
            boolean r3 = f154533M
            if (r3 == 0) goto L_0x0130
            java.lang.String r3 = r1.f186466d
            java.lang.String r5 = "W6"
            boolean r3 = gy3.C87412m.m108589b(r3, r5)
            if (r3 != 0) goto L_0x01d1
            java.lang.String r3 = r1.f186466d
            java.lang.String r5 = "xW6"
            boolean r3 = gy3.C87412m.m108589b(r3, r5)
            if (r3 == 0) goto L_0x0130
        L_0x01d1:
            co1.d r3 = co1.C16929d.f45756a
            boolean r3 = r3.mo18031c()
            if (r3 == 0) goto L_0x01ee
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99191H8
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r5 = 1
            if (r3 == r5) goto L_0x0202
            goto L_0x01ef
        L_0x01ee:
            r5 = 1
        L_0x01ef:
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99285S6
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != r5) goto L_0x0130
        L_0x0202:
            r2.add(r1)
            goto L_0x0130
        L_0x0207:
            r5 = 1
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0213
            java.lang.String r0 = "getSupportHdrSpecList is empty for no support hdr."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
        L_0x0213:
            java.lang.String r1 = "h265"
            java.lang.String r18 = "HDR"
            r0 = r33
            r3 = 3
            r5 = r2
            r7 = 1
            r2 = r8
            r21 = r4
            r4 = r5
            r5 = r18
            rx3.o r0 = r0.mo76104a(r1, r2, r4, r5)
            if (r0 != 0) goto L_0x0717
            java.util.LinkedList<te3.yb1> r0 = r15.f185282v
            gy3.C87412m.m108593f(r0, r14)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            boolean r2 = r6.f154565t
            java.lang.String r5 = "xV0"
            if (r2 != 0) goto L_0x024b
            r17 = r5
            r22 = r10
            r10 = r12
            r20 = r13
            r23 = r14
            r12 = r21
            goto L_0x0414
        L_0x024b:
            java.util.Iterator r2 = r0.iterator()
        L_0x024f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x026b
            java.lang.Object r3 = r2.next()
            te3.yb1 r3 = (te3.C64850yb1) r3
            java.lang.String r7 = r3.f186466d
            boolean r7 = gy3.C87412m.m108589b(r7, r5)
            if (r7 != 0) goto L_0x0269
            int r3 = r3.f186477r
            if (r3 > 0) goto L_0x0269
            r2 = 0
            goto L_0x026c
        L_0x0269:
            r7 = 1
            goto L_0x024f
        L_0x026b:
            r2 = 1
        L_0x026c:
            java.util.Iterator r0 = r0.iterator()
            r24 = r4
            r17 = r5
            r22 = r10
            r20 = r13
            r23 = r14
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0282:
            boolean r25 = r0.hasNext()
            if (r25 == 0) goto L_0x030f
            java.lang.Object r25 = r0.next()
            r26 = r0
            r0 = r25
            te3.yb1 r0 = (te3.C64850yb1) r0
            r25 = r3
            java.lang.String r3 = r0.f186469g
            r27 = r7
            r7 = 1
            boolean r3 = z04.C112551y.m153809i(r3, r12, r7)
            if (r3 == 0) goto L_0x02ab
            int r3 = r0.f186468f
            if (r3 <= r4) goto L_0x02ab
            int r4 = r0.f186477r
            r32 = r4
            r4 = r3
            r3 = r32
            goto L_0x02ad
        L_0x02ab:
            r3 = r25
        L_0x02ad:
            int r7 = r0.f186468f
            r25 = r3
            r28 = r4
            long r3 = (long) r7
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x0301
            java.lang.String r3 = r0.f186469g
            r4 = 1
            boolean r3 = z04.C112551y.m153809i(r3, r12, r4)
            if (r3 == 0) goto L_0x02e4
            int r3 = r0.f186472j
            int r4 = r0.f186473n
            if (r3 <= r4) goto L_0x02c9
            r7 = r4
            goto L_0x02ca
        L_0x02c9:
            r7 = r3
        L_0x02ca:
            r29 = r12
            int r12 = r6.f154535A
            if (r7 > r12) goto L_0x02e6
            if (r3 <= r4) goto L_0x02d3
            r3 = r4
        L_0x02d3:
            if (r3 <= r5) goto L_0x02d6
            r5 = r3
        L_0x02d6:
            int r3 = r0.f186468f
            if (r3 <= r10) goto L_0x02de
            int r7 = r0.f186477r
            r10 = r3
            goto L_0x02e0
        L_0x02de:
            r7 = r27
        L_0x02e0:
            r1.add(r0)
            goto L_0x0305
        L_0x02e4:
            r29 = r12
        L_0x02e6:
            java.lang.String r3 = r0.f186469g
            r4 = 1
            boolean r3 = z04.C112551y.m153809i(r3, r11, r4)
            if (r3 == 0) goto L_0x0303
            int r3 = r0.f186472j
            int r4 = r0.f186473n
            if (r3 <= r4) goto L_0x02f6
            r3 = r4
        L_0x02f6:
            if (r3 <= r13) goto L_0x02f9
            r13 = r3
        L_0x02f9:
            int r3 = r0.f186468f
            if (r3 <= r14) goto L_0x0303
            int r15 = r0.f186477r
            r14 = r3
            goto L_0x0303
        L_0x0301:
            r29 = r12
        L_0x0303:
            r7 = r27
        L_0x0305:
            r3 = r25
            r0 = r26
            r4 = r28
            r12 = r29
            goto L_0x0282
        L_0x030f:
            r25 = r3
            r27 = r7
            r29 = r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[H266List] maxBitRate"
            r0.append(r3)
            r0.append(r8)
            java.lang.String r3 = " maxResLimit"
            r0.append(r3)
            int r3 = r6.f154535A
            r0.append(r3)
            java.lang.String r3 = " maxH266Res "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = " maxH265Res "
            r0.append(r3)
            r0.append(r13)
            java.lang.String r3 = " maxH266Bitrate"
            r0.append(r3)
            r0.append(r10)
            java.lang.String r3 = " maxH265Bitrate"
            r0.append(r3)
            r0.append(r14)
            java.lang.String r3 = " mediaSpecHasVideoBR"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = " maxH265VideoBitrate"
            r0.append(r3)
            r0.append(r15)
            java.lang.String r3 = " maxH266VideoBitrate"
            r0.append(r3)
            r0.append(r7)
            java.lang.String r3 = " highestLevelH266VBR "
            r0.append(r3)
            r3 = r25
            r0.append(r3)
            java.lang.String r12 = " highestLevelH266BR "
            r0.append(r12)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r12 = r21
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
            if (r2 == 0) goto L_0x0382
            r14 = r15
        L_0x0382:
            if (r2 == 0) goto L_0x0385
            goto L_0x0386
        L_0x0385:
            r7 = r10
        L_0x0386:
            if (r2 == 0) goto L_0x0389
            goto L_0x038a
        L_0x0389:
            r3 = r4
        L_0x038a:
            if (r7 >= r3) goto L_0x03c7
            int r0 = r6.f154541G
            long r3 = (long) r0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x03c7
            java.util.Iterator r0 = r1.iterator()
        L_0x0397:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x03c2
            java.lang.Object r1 = r0.next()
            te3.yb1 r1 = (te3.C64850yb1) r1
            java.lang.String r2 = r1.f186469g
            r10 = r29
            r3 = 1
            boolean r2 = z04.C112551y.m153809i(r2, r10, r3)
            if (r2 == 0) goto L_0x03bb
            int r2 = r1.f186468f
            long r2 = (long) r2
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x03bb
            r4 = r24
            r4.add(r1)
            goto L_0x03bd
        L_0x03bb:
            r4 = r24
        L_0x03bd:
            r24 = r4
            r29 = r10
            goto L_0x0397
        L_0x03c2:
            r4 = r24
            r10 = r29
            goto L_0x0409
        L_0x03c7:
            r4 = r24
            r10 = r29
            int r0 = r5 + 8
            if (r0 < r13) goto L_0x0417
            float r0 = (float) r7
            float r3 = (float) r14
            r15 = 1057803469(0x3f0ccccd, float:0.55)
            float r15 = r15 * r3
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x03db
            goto L_0x0417
        L_0x03db:
            java.util.Iterator r0 = r1.iterator()
        L_0x03df:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0409
            java.lang.Object r1 = r0.next()
            te3.yb1 r1 = (te3.C64850yb1) r1
            if (r2 == 0) goto L_0x03f0
            int r5 = r1.f186477r
            goto L_0x03f2
        L_0x03f0:
            int r5 = r1.f186468f
        L_0x03f2:
            java.lang.String r7 = r1.f186469g
            r13 = 1
            boolean r7 = z04.C112551y.m153809i(r7, r10, r13)
            if (r7 == 0) goto L_0x03df
            float r5 = (float) r5
            r7 = 1062836634(0x3f59999a, float:0.85)
            float r7 = r7 * r3
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x03df
            r4.add(r1)
            goto L_0x03df
        L_0x0409:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0414
            java.lang.String r0 = "getSupportH266SpecList is empty for no support h266."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
        L_0x0414:
            r15 = 32
            goto L_0x0441
        L_0x0417:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r15 = 32
            r0.append(r15)
            r0.append(r7)
            java.lang.String r1 = "is smaller than"
            r0.append(r1)
            r0.append(r13)
            r0.append(r15)
            r0.append(r14)
            java.lang.String r1 = ", H266 return empty list"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
        L_0x0441:
            java.lang.String r1 = "h266"
            java.lang.String r5 = "H266-SDR"
            r0 = r33
            r2 = r8
            r7 = r17
            rx3.o r0 = r0.mo76104a(r1, r2, r4, r5)
            r14 = r36
            if (r0 != 0) goto L_0x071b
            java.util.LinkedList<te3.yb1> r0 = r14.f185282v
            r13 = r23
            gy3.C87412m.m108593f(r0, r13)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            boolean r2 = f154533M
            boolean r3 = f154534N
            java.lang.String r5 = "xV2"
            if (r2 == 0) goto L_0x0584
            if (r3 == 0) goto L_0x046b
            goto L_0x0584
        L_0x046b:
            java.util.Iterator r0 = r0.iterator()
        L_0x046f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0487
            java.lang.Object r2 = r0.next()
            te3.yb1 r2 = (te3.C64850yb1) r2
            java.lang.String r3 = r2.f186469g
            boolean r3 = gy3.C87412m.m108589b(r3, r11)
            if (r3 == 0) goto L_0x046f
            r1.add(r2)
            goto L_0x046f
        L_0x0487:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x0490:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04b6
            java.lang.Object r3 = r2.next()
            r4 = r3
            te3.yb1 r4 = (te3.C64850yb1) r4
            java.lang.String r15 = r4.f186466d
            boolean r15 = gy3.C87412m.m108589b(r15, r7)
            if (r15 == 0) goto L_0x04af
            java.lang.String r4 = r4.f186469g
            boolean r4 = gy3.C87412m.m108589b(r4, r11)
            if (r4 == 0) goto L_0x04af
            r4 = 1
            goto L_0x04b0
        L_0x04af:
            r4 = 0
        L_0x04b0:
            if (r4 == 0) goto L_0x04b3
            goto L_0x04b7
        L_0x04b3:
            r15 = 32
            goto L_0x0490
        L_0x04b6:
            r3 = 0
        L_0x04b7:
            te3.yb1 r3 = (te3.C64850yb1) r3
            java.util.Iterator r2 = r1.iterator()
        L_0x04bd:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x04e5
            java.lang.Object r4 = r2.next()
            r15 = r4
            te3.yb1 r15 = (te3.C64850yb1) r15
            r17 = r2
            java.lang.String r2 = r15.f186466d
            boolean r2 = gy3.C87412m.m108589b(r2, r5)
            if (r2 == 0) goto L_0x04de
            java.lang.String r2 = r15.f186469g
            boolean r2 = gy3.C87412m.m108589b(r2, r11)
            if (r2 == 0) goto L_0x04de
            r2 = 1
            goto L_0x04df
        L_0x04de:
            r2 = 0
        L_0x04df:
            if (r2 == 0) goto L_0x04e2
            goto L_0x04e6
        L_0x04e2:
            r2 = r17
            goto L_0x04bd
        L_0x04e5:
            r4 = 0
        L_0x04e6:
            te3.yb1 r4 = (te3.C64850yb1) r4
            java.util.Iterator r2 = r1.iterator()
        L_0x04ec:
            boolean r15 = r2.hasNext()
            if (r15 == 0) goto L_0x0520
            java.lang.Object r15 = r2.next()
            r17 = r2
            r2 = r15
            te3.yb1 r2 = (te3.C64850yb1) r2
            r21 = r5
            java.lang.String r5 = r2.f186466d
            r23 = r7
            java.lang.String r7 = "xV4"
            boolean r5 = gy3.C87412m.m108589b(r5, r7)
            if (r5 == 0) goto L_0x0514
            java.lang.String r2 = r2.f186469g
            boolean r2 = gy3.C87412m.m108589b(r2, r11)
            if (r2 == 0) goto L_0x0514
            r2 = 1
            goto L_0x0515
        L_0x0514:
            r2 = 0
        L_0x0515:
            if (r2 == 0) goto L_0x0519
            r5 = r15
            goto L_0x0525
        L_0x0519:
            r2 = r17
            r5 = r21
            r7 = r23
            goto L_0x04ec
        L_0x0520:
            r21 = r5
            r23 = r7
            r5 = 0
        L_0x0525:
            te3.yb1 r5 = (te3.C64850yb1) r5
            if (r3 == 0) goto L_0x057f
            if (r4 != 0) goto L_0x052d
            if (r5 == 0) goto L_0x057f
        L_0x052d:
            if (r4 == 0) goto L_0x0532
            r0.add(r4)
        L_0x0532:
            if (r5 == 0) goto L_0x0537
            r0.add(r5)
        L_0x0537:
            r0.add(r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0543:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x056b
            java.lang.Object r7 = r1.next()
            r15 = r7
            te3.yb1 r15 = (te3.C64850yb1) r15
            boolean r17 = gy3.C87412m.m108589b(r15, r3)
            if (r17 != 0) goto L_0x0564
            boolean r17 = gy3.C87412m.m108589b(r15, r4)
            if (r17 != 0) goto L_0x0564
            boolean r15 = gy3.C87412m.m108589b(r15, r5)
            if (r15 != 0) goto L_0x0564
            r15 = 1
            goto L_0x0565
        L_0x0564:
            r15 = 0
        L_0x0565:
            if (r15 == 0) goto L_0x0543
            r2.add(r7)
            goto L_0x0543
        L_0x056b:
            java.util.Iterator r1 = r2.iterator()
        L_0x056f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0582
            java.lang.Object r2 = r1.next()
            te3.yb1 r2 = (te3.C64850yb1) r2
            r0.add(r2)
            goto L_0x056f
        L_0x057f:
            r0.addAll(r1)
        L_0x0582:
            r4 = r0
            goto L_0x05aa
        L_0x0584:
            r21 = r5
            r23 = r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "getSupportH265SpecList return for isSupportH265:"
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = " isOversea:"
            r0.append(r2)
            r0.append(r3)
            r2 = 46
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            r4 = r1
        L_0x05aa:
            java.lang.String r1 = "h265"
            java.lang.String r5 = "H265-SDR"
            r0 = r33
            r2 = r8
            r7 = r21
            rx3.o r0 = r0.mo76104a(r1, r2, r4, r5)
            if (r0 != 0) goto L_0x071b
            java.util.LinkedList<te3.yb1> r0 = r14.f185282v
            gy3.C87412m.m108593f(r0, r13)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x05c7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05e3
            java.lang.Object r1 = r0.next()
            te3.yb1 r1 = (te3.C64850yb1) r1
            java.lang.String r2 = r1.f186469g
            r15 = r22
            boolean r2 = gy3.C87412m.m108589b(r2, r15)
            if (r2 == 0) goto L_0x05e0
            r4.add(r1)
        L_0x05e0:
            r22 = r15
            goto L_0x05c7
        L_0x05e3:
            r15 = r22
            java.lang.String r1 = "h264"
            java.lang.String r5 = "H264-SDR"
            r0 = r33
            r2 = r8
            rx3.o r0 = r0.mo76104a(r1, r2, r4, r5)
            if (r0 != 0) goto L_0x071b
            java.util.LinkedList<te3.yb1> r3 = r14.f185282v
            gy3.C87412m.m108593f(r3, r13)
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99537v3
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r5 = "xV1"
            r1 = 1
            if (r0 != r1) goto L_0x0659
            r1 = r20
            boolean r2 = gy3.C87412m.m108589b(r1, r11)
            if (r2 == 0) goto L_0x0635
            java.util.Iterator r2 = r3.iterator()
        L_0x061a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0630
            java.lang.Object r4 = r2.next()
            r8 = r4
            te3.yb1 r8 = (te3.C64850yb1) r8
            java.lang.String r8 = r8.f186466d
            boolean r8 = gy3.C87412m.m108589b(r8, r7)
            if (r8 == 0) goto L_0x061a
            goto L_0x0631
        L_0x0630:
            r4 = 0
        L_0x0631:
            if (r4 == 0) goto L_0x0635
            r5 = r7
            goto L_0x065d
        L_0x0635:
            boolean r2 = gy3.C87412m.m108589b(r1, r15)
            if (r2 == 0) goto L_0x065b
            java.util.Iterator r2 = r3.iterator()
        L_0x063f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0655
            java.lang.Object r4 = r2.next()
            r7 = r4
            te3.yb1 r7 = (te3.C64850yb1) r7
            java.lang.String r7 = r7.f186466d
            boolean r7 = gy3.C87412m.m108589b(r7, r5)
            if (r7 == 0) goto L_0x063f
            goto L_0x0656
        L_0x0655:
            r4 = 0
        L_0x0656:
            if (r4 == 0) goto L_0x065b
            goto L_0x065d
        L_0x0659:
            r1 = r20
        L_0x065b:
            r5 = r23
        L_0x065d:
            te3.yb1 r2 = new te3.yb1
            r2.<init>()
            r2.f186466d = r5
            r2.f186469g = r1
            long r7 = r6.f154550e
            int r1 = (int) r7
            r2.f186467e = r1
            if (r37 == 0) goto L_0x0708
            if (r0 == 0) goto L_0x0708
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Object> r0 = r6.f154545K
            java.lang.Long r1 = java.lang.Long.valueOf(r34)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0708
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "commentScene"
            r4 = r38
            r0.put(r1, r4)
            java.lang.String r1 = o40.C61926c.m72691p(r34)
            java.lang.String r4 = "feedId"
            r0.put(r4, r1)
            java.lang.String r1 = "targetFileFormat"
            r0.put(r1, r5)
            boolean r1 = f154533M
            java.lang.String r4 = "isSupportH265"
            r0.put(r4, r1)
            java.lang.String r1 = r14.f185275p
            java.lang.String r4 = "media"
            r0.put(r4, r1)
            java.util.LinkedList<te3.yb1> r1 = r14.f185282v
            gy3.C87412m.m108593f(r1, r13)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = sx3.C36907w.m41090l(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x06b8:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x06d1
            java.lang.Object r5 = r1.next()
            te3.yb1 r5 = (te3.C64850yb1) r5
            java.lang.String r7 = "it"
            gy3.C87412m.m108593f(r5, r7)
            java.lang.String r5 = co1.C55051g.m62153b(r5)
            r4.add(r5)
            goto L_0x06b8
        L_0x06d1:
            java.lang.String r1 = "spec"
            r0.put(r1, r4)
            int r1 = r14.f185277q
            r7 = 3
            if (r1 != r7) goto L_0x06de
            r4 = 1
            goto L_0x06df
        L_0x06de:
            r4 = 0
        L_0x06df:
            java.lang.String r1 = "isLongVideo"
            r0.put(r1, r4)
            ft1.a r22 = ft1.C59319a.f169618b
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            co1.f r1 = new co1.f
            r1.<init>(r0)
            r29 = 28
            r30 = 0
            java.lang.String r23 = "SpecError"
            r28 = r1
            o40.C11348f.C11349a.m11178b(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Long r0 = java.lang.Long.valueOf(r34)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Object> r1 = r6.f154545K
            r1.put(r0, r6)
            goto L_0x0709
        L_0x0708:
            r7 = 3
        L_0x0709:
            long r4 = r6.f154556k
            java.lang.String r8 = "step#default"
            r0 = r33
            r1 = r2
            r2 = r8
            rx3.o r0 = r0.mo76107d(r1, r2, r3, r4)
            goto L_0x0723
        L_0x0717:
            r10 = r12
            r14 = r15
            r12 = r21
        L_0x071b:
            r7 = 3
            goto L_0x0723
        L_0x071d:
            r19 = r7
            r10 = r12
            r14 = r15
            r7 = 3
            r12 = r4
        L_0x0723:
            di3.d r1 = di3.C86312j.m106911c(r19)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            co1.e r1 = r1.Hx0()
            int r1 = r1.f154540F
            r2 = 2
            if (r1 == 0) goto L_0x075f
            r3 = 1
            if (r1 == r3) goto L_0x0758
            if (r1 == r2) goto L_0x0751
            if (r1 == r7) goto L_0x074a
            r4 = 4
            if (r1 == r4) goto L_0x0743
            co1.b$a r1 = new co1.b$a
            r4 = 0
            r1.<init>(r4, r4, r3)
            goto L_0x0766
        L_0x0743:
            r4 = 0
            co1.b$a r1 = new co1.b$a
            r1.<init>(r3, r3, r4)
            goto L_0x0766
        L_0x074a:
            r4 = 0
            co1.b$a r1 = new co1.b$a
            r1.<init>(r3, r3, r3)
            goto L_0x0766
        L_0x0751:
            r4 = 0
            co1.b$a r1 = new co1.b$a
            r1.<init>(r4, r3, r4)
            goto L_0x0766
        L_0x0758:
            r4 = 0
            co1.b$a r1 = new co1.b$a
            r1.<init>(r4, r3, r3)
            goto L_0x0766
        L_0x075f:
            r3 = 1
            r4 = 0
            co1.b$a r1 = new co1.b$a
            r1.<init>(r3, r3, r3)
        L_0x0766:
            boolean r1 = r1.mo786a()
            if (r1 == 0) goto L_0x0866
            A r1 = r0.f38557d
            te3.yb1 r1 = (te3.C64850yb1) r1
            java.lang.String r5 = r1.f186469g
            if (r5 != 0) goto L_0x0776
            r5 = r16
        L_0x0776:
            boolean r8 = z04.C112551y.m153809i(r5, r10, r3)
            if (r8 == 0) goto L_0x077e
            r11 = 3
            goto L_0x0787
        L_0x077e:
            boolean r5 = z04.C112551y.m153809i(r5, r11, r3)
            if (r5 == 0) goto L_0x0786
            r11 = 2
            goto L_0x0787
        L_0x0786:
            r11 = 1
        L_0x0787:
            pl1.r0 r3 = new pl1.r0
            co1.e$a r5 = f154532L
            java.lang.String r7 = r1.f186466d
            up1.y r9 = r5.mo53892a(r7)
            java.lang.String r10 = r1.f186466d
            int r1 = r1.f186470h
            r13 = 0
            r5 = 32
            r15 = 0
            r8 = 32
            r7 = r3
            r8 = r36
            r31 = r12
            r12 = r1
            r14 = r5
            r1 = r36
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            wp1.g r5 = wp1.C66167g.f190173a
            java.lang.String r3 = r3.mo11841b()
            r7 = 0
            cm1.f1 r2 = wp1.C66167g.m78055d(r5, r3, r4, r2, r7)
            int r3 = r2.mo76072m2()
            boolean r2 = r2.mo76074o2()
            if (r2 != 0) goto L_0x0866
            r2 = 30
            if (r3 >= r2) goto L_0x0866
            java.lang.String r2 = r1.f185275p
            if (r2 != 0) goto L_0x07c6
            r2 = r16
        L_0x07c6:
            java.util.List r2 = r5.mo90235e(r2)
            co1.e$c r3 = new co1.e$c
            r3.<init>()
            java.util.List r2 = sx3.C110818d0.m150943o0(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x07d7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x07eb
            java.lang.Object r5 = r2.next()
            r3 = r5
            cm1.f1 r3 = (cm1.C55015f1) r3
            boolean r3 = r3.mo76074o2()
            if (r3 == 0) goto L_0x07d7
            goto L_0x07ec
        L_0x07eb:
            r5 = r7
        L_0x07ec:
            cm1.f1 r5 = (cm1.C55015f1) r5
            if (r5 == 0) goto L_0x0866
            java.lang.String r2 = r5.field_fileFormat
            java.lang.String r3 = "it.field_fileFormat"
            gy3.C87412m.m108593f(r2, r3)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.LinkedList<te3.yb1> r4 = r1.f185265Z
            r3.addAll(r4)
            java.util.LinkedList<te3.yb1> r1 = r1.f185282v
            r3.addAll(r1)
            java.util.Iterator r1 = r3.iterator()
        L_0x080a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0820
            java.lang.Object r3 = r1.next()
            r4 = r3
            te3.yb1 r4 = (te3.C64850yb1) r4
            java.lang.String r4 = r4.f186466d
            boolean r4 = gy3.C87412m.m108589b(r2, r4)
            if (r4 == 0) goto L_0x080a
            goto L_0x0821
        L_0x0820:
            r3 = r7
        L_0x0821:
            te3.yb1 r3 = (te3.C64850yb1) r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "findTargetFileFormatSpec targetFileFormat:"
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = " targetSpec:"
            r1.append(r2)
            if (r3 == 0) goto L_0x083c
            java.lang.String r2 = co1.C55051g.m62153b(r3)
            goto L_0x083d
        L_0x083c:
            r2 = r7
        L_0x083d:
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r2 = r31
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            if (r3 == 0) goto L_0x0862
            rx3.o r5 = new rx3.o
            long r1 = r6.f154556k
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "step#replace"
            r5.<init>(r3, r2, r1)
            goto L_0x0863
        L_0x0862:
            r5 = r7
        L_0x0863:
            if (r5 == 0) goto L_0x0866
            r0 = r5
        L_0x0866:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: co1.C55048e.mo76106c(long, te3.rq2, boolean, int):rx3.o");
    }

    /* renamed from: d */
    public final C13605o<C64850yb1, String, Long> mo76107d(C64850yb1 yb12, String str, List<? extends C64850yb1> list, long j) {
        C37521f.f99374d.getClass();
        if (C37521f.f99204J3.mo60266n().intValue() != 1 || !f154533M || !TextUtils.isEmpty(this.f154536B) || f154534N) {
            return new C13605o<>(yb12, str, Long.valueOf(j));
        }
        Log.m105924i("Finder.MediaPreloadModel", "[tranToH265IfEnable] , newFormat:" + yb12.f186466d);
        return new C13605o<>(yb12, str + '+', Long.valueOf(j));
    }

    /* renamed from: e */
    public final void mo76108e(C51974xh1 xh12, HashMap<Long, FinderObject> hashMap) {
        FinderObjectDesc finderObjectDesc;
        LinkedList<FinderMedia> linkedList;
        C87412m.m108594g(xh12, "info");
        C87412m.m108594g(hashMap, "feedSet");
        this.f154557l = xh12.f144649d;
        C64802wh1 wh12 = xh12.f144650e;
        if (wh12 != null) {
            this.f154547b = wh12.f186101d;
            this.f154548c = wh12.f186102e;
            this.f154549d = C60641c.m70921b(wh12.f186104g * 100.0f);
            this.f154556k = (long) wh12.f186103f;
            this.f154550e = (long) wh12.f186105h;
            int i = wh12.f186106i;
            int i2 = 1;
            if (1 >= i) {
                i = 1;
            }
            this.f154551f = i;
            int i3 = wh12.f186107j;
            if (1 < i3) {
                i2 = i3;
            }
            this.f154552g = i2;
            this.f154553h = wh12.f186108n;
            this.f154554i = C60641c.m70921b(wh12.f186109o * 100.0f);
            this.f154555j = wh12.f186110p;
            this.f154558m = (long) wh12.f186111q;
            this.f154559n = wh12.f186112r;
            this.f154560o = wh12.f186113s;
            this.f154567v = wh12.f186114t;
            this.f154568w = wh12.f186115u;
            this.f154569x = wh12.f186116v;
            this.f154570y = wh12.f186117w;
            this.f154571z = wh12.f186119y;
            this.f154537C = wh12.f186120z;
            this.f154538D = wh12.f186091A;
            this.f154539E = wh12.f186092B;
            this.f154540F = wh12.f186093C;
            this.f154542H = wh12.f186095E;
            this.f154543I = wh12.f186096F;
            this.f154544J = (float) wh12.f186100J;
            LinkedList<C52117yh1> linkedList2 = xh12.f144651f;
            if (linkedList2 != null) {
                for (C52117yh1 yh12 : linkedList2) {
                    FinderObject finderObject = hashMap.get(Long.valueOf(yh12.f145301d));
                    if (!(finderObject == null || (finderObjectDesc = finderObject.objectDesc) == null || (linkedList = finderObjectDesc.media) == null)) {
                        for (FinderMedia finderMedia : linkedList) {
                            ConcurrentHashMap<String, C52117yh1> concurrentHashMap = this.f154561p;
                            C87412m.m108593f(finderMedia, LocaleUtil.ITALIAN);
                            String str = C65840n.m77568d(finderMedia).f185275p;
                            if (str == null) {
                                str = "";
                            }
                            concurrentHashMap.put(str, yh12);
                        }
                    }
                }
            }
            C39825z zVar = this.f154546a;
            zVar.getClass();
            zVar.f106842d = SystemClock.uptimeMillis();
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TP_PLAYER_LOCAL_SERVER_BUFFER_SIZE_LONG_SYNC, Long.valueOf((long) this.f154537C));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TP_PLAYER_LOCAL_SERVER_SEND_SOCKET_BUFFER_SIZE_LONG_SYNC, Long.valueOf((long) this.f154538D));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TP_PLAYER_FFMPEG_TCP_RECV_SOCKET_BUFFER_SIZE_LONG_SYNC, Long.valueOf((long) this.f154539E));
        Log.m105924i("Finder.MediaPreloadModel", "[updatePreloadInfo]\nisSupportH265=" + f154533M + "\nisSupportH266=" + this.f154565t + "\n[prev:next]Count=" + this.f154547b + XVFSFile.PATH_SEPARATOR_CHAR + this.f154548c + "\nmaxPreloadPercent=" + this.f154549d + "\nmaxPreloadBitRate=" + this.f154556k + ", maxPreloadBytes=" + Util.getSizeKB(this.f154550e) + "\nmaxPreloadTaskCount=" + this.f154551f + "\n[preload:play]ConcurrentCount=" + this.f154552g + XVFSFile.PATH_SEPARATOR_CHAR + this.f154553h + "\n[startPreloadSecs:startPreloadPercent]=" + this.f154555j + XVFSFile.PATH_SEPARATOR_CHAR + this.f154554i + "\nisOpenMultiBitRateDownload=" + this.f154564s + "\nhotFeed=" + this.f154561p.size() + "\nmegaVideo[prev:next]Count=" + this.f154559n + XVFSFile.PATH_SEPARATOR_CHAR + this.f154560o + "\nmegaVideoMaxBitrate=" + this.f154558m + "\nhotMegaVideoMediaSet=" + this.f154562q.size() + "\nminBufferLength=" + this.f154567v + "\nmaxBufferLength=" + this.f154568w + "\nminCurrentFeedBufferLength=" + this.f154569x + "\ncanPreCreatedPlayer=" + this.f154570y + "\nlsBufferSize=" + this.f154537C + "\nlsSendSocketBufferSize=" + this.f154538D + "\ntcpRecvBufferSize=" + this.f154539E + "\nlast_feed_info_count=" + this.f154542H + "\nnext_feed_info_count=" + this.f154543I + 10);
        LinkedList linkedList3 = new LinkedList(xh12.f144651f);
        xh12.f144651f.clear();
        byte[] byteArray = xh12.toByteArray();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TIMELINE_LAST_PRELOAD_INFO_STRING_SYNC, Util.encodeHexString(byteArray));
        StringBuilder sb = new StringBuilder();
        sb.append("[storePreloadInfo] buffer size=");
        sb.append(Util.getSizeKB((long) byteArray.length));
        Log.m105924i("Finder.MediaPreloadModel", sb.toString());
        xh12.f144651f.addAll(linkedList3);
    }
}
