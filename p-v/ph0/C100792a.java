package ph0;

import a70.C112760b;
import bp3.C28360d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p434ig.C98671a;
import p434ig.C98672d;
import p434ig.C98674g;
import p823sg.C90193h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C119027c;

/* renamed from: ph0.a */
public final class C100792a {

    /* renamed from: a */
    public static final C100792a f295260a = new C100792a();

    /* renamed from: b */
    public static final C13601g f295261b = C36568h.m40985a(C11936a.f34870d);

    /* renamed from: ph0.a$a */
    public static final class C11936a extends C87413o implements C32224a<C86009m1> {

        /* renamed from: d */
        public static final C11936a f34870d = new C11936a();

        public C11936a() {
            super(0);
        }

        public Object invoke() {
            String str = C86709a0.m107523b().mo121111i() + "albumTemp";
            VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
            return C112760b.m154236i0(str);
        }
    }

    /* renamed from: h */
    public static /* synthetic */ int m131981h(C100792a aVar, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        if ((i3 & 8) != 0) {
            z2 = false;
        }
        return aVar.mo140236g(i, i2, z, z2);
    }

    /* renamed from: a */
    public final void mo140230a(C98671a aVar, C98674g gVar) {
        C87412m.m108594g(aVar, "albumAppMsg");
        C87412m.m108594g(gVar, "albumInfoItem");
        aVar.mo53880Q(gVar.mo55352E());
        if (gVar.mo55349B().length() > 200) {
            String substring = gVar.mo55349B().substring(0, 200);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            gVar.mo55356I(substring);
        }
        aVar.mo53877N(gVar.mo55349B());
        aVar.mo53881R(98);
        aVar.mo53882S(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/update/");
        aVar.mo53874K("view");
        aVar.mo55243V(gVar.mo141118z());
    }

    /* renamed from: b */
    public final String mo140231b(String str, int i) {
        C87412m.m108594g(str, "dataString");
        byte[] bytes = (str + i + System.currentTimeMillis()).getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        String f = C90193h.m112878f(bytes);
        C87412m.m108593f(f, "getMessageDigest((dataSt…eMillis()).toByteArray())");
        return f;
    }

    /* renamed from: c */
    public final C86009m1 mo140232c(String str, long j) {
        if (str.length() == 0) {
            str = "fakerAlbumUserName";
        }
        String format = String.format("%s/", Arrays.copyOf(new Object[]{C28360d.f78014a.mo55933a(str, j)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        C86009m1 m1Var = new C86009m1(format);
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            m1Var.mo119987x();
        }
        return m1Var;
    }

    /* renamed from: d */
    public final String mo140233d(C98672d dVar, C72963f4 f4Var) {
        String j = mo140238j(dVar, f4Var);
        return !C86013q1.m106450k(j) ? mo140245q(dVar, f4Var) : j;
    }

    /* renamed from: e */
    public final String mo140234e(C98672d dVar, String str, long j) {
        C87412m.m108594g(str, "talker");
        String k = mo140239k(dVar, str, j);
        return !C86013q1.m106450k(k) ? mo140246r(dVar, str, j) : k;
    }

    /* renamed from: f */
    public final List<String> mo140235f(C72963f4 f4Var) {
        C87412m.m108594g(f4Var, "msg");
        ArrayList arrayList = new ArrayList();
        try {
            C98671a aVar = new C98671a();
            String content = f4Var.getContent();
            C87412m.m108593f(content, "msg.content");
            aVar.mo141099d(content);
            C98674g gVar = new C98674g();
            gVar.mo141099d(aVar.f289309p);
            for (C98672d dVar : gVar.f289364h) {
                C100792a aVar2 = f295260a;
                String v = aVar2.mo140250v(dVar, f4Var);
                String q = aVar2.mo140245q(dVar, f4Var);
                String j = aVar2.mo140238j(dVar, f4Var);
                arrayList.add(v);
                arrayList.add(q);
                arrayList.add(j);
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* renamed from: g */
    public final int mo140236g(int i, int i2, boolean z, boolean z2) {
        if (2 == i) {
            if (z) {
                return 1;
            }
            return z2 ? 3 : 2;
        } else if (4 == i) {
            return 4;
        } else {
            return i2 > 26214400 ? 7 : 5;
        }
    }

    /* renamed from: i */
    public final String mo140237i(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return ((C86009m1) ((C36570n) f295261b).getValue()) + File.separator + str;
    }

    /* renamed from: j */
    public final String mo140238j(C98672d dVar, C72963f4 f4Var) {
        String t = f4Var != null ? f4Var.mo108768t() : null;
        if (t == null) {
            t = "";
        }
        return mo140239k(dVar, t, f4Var != null ? f4Var.getMsgId() : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if ((r0.length() > 0) == true) goto L_0x002e;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo140239k(p434ig.C98672d r10, java.lang.String r11, long r12) {
        /*
            r9 = this;
            java.lang.String r0 = "talker"
            gy3.C87412m.m108594g(r11, r0)
            int r0 = r11.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 != 0) goto L_0x0019
            r3 = 0
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0039
        L_0x0019:
            if (r10 == 0) goto L_0x002d
            java.lang.String r0 = r10.mo55280S()
            if (r0 == 0) goto L_0x002d
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 != r1) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            if (r1 == 0) goto L_0x0039
            java.lang.String r10 = r10.mo55280S()
            if (r10 != 0) goto L_0x0038
            java.lang.String r10 = ""
        L_0x0038:
            return r10
        L_0x0039:
            r0 = 0
            if (r10 == 0) goto L_0x0042
            java.lang.String r1 = r10.mo55264K()
            r3 = r1
            goto L_0x0043
        L_0x0042:
            r3 = r0
        L_0x0043:
            if (r10 == 0) goto L_0x0049
            java.lang.String r0 = r10.mo55262J()
        L_0x0049:
            r4 = r0
            r8 = 1
            r2 = r9
            r5 = r11
            r6 = r12
            java.lang.String r10 = r2.mo140240l(r3, r4, r5, r6, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ph0.C100792a.mo140239k(ig.d, java.lang.String, long):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if ((r10.length() > 0) == true) goto L_0x0076;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo140240l(java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8, int r10) {
        /*
            r4 = this;
            java.lang.String r0 = "talker"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = ""
            if (r5 == 0) goto L_0x00a1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r1 == 0) goto L_0x0012
            goto L_0x00a1
        L_0x0012:
            java.lang.String r5 = r4.mo140241m(r5, r10)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r10 != 0) goto L_0x00a1
            boolean r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()
            if (r10 == 0) goto L_0x00a1
            boolean r10 = f40.C86709a0.m107522a()
            if (r10 != 0) goto L_0x002a
            goto L_0x00a1
        L_0x002a:
            com.tencent.mm.vfs.m1 r7 = r4.mo140232c(r7, r8)
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L_0x0075
            int r10 = r6.length()
            int r10 = r10 - r9
            r0 = 0
            r1 = 0
        L_0x0039:
            if (r0 > r10) goto L_0x005e
            if (r1 != 0) goto L_0x003f
            r2 = r0
            goto L_0x0040
        L_0x003f:
            r2 = r10
        L_0x0040:
            char r2 = r6.charAt(r2)
            r3 = 32
            int r2 = gy3.C87412m.m108596i(r2, r3)
            if (r2 > 0) goto L_0x004e
            r2 = 1
            goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            if (r1 != 0) goto L_0x0058
            if (r2 != 0) goto L_0x0055
            r1 = 1
            goto L_0x0039
        L_0x0055:
            int r0 = r0 + 1
            goto L_0x0039
        L_0x0058:
            if (r2 != 0) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            int r10 = r10 + -1
            goto L_0x0039
        L_0x005e:
            int r10 = r10 + r9
            java.lang.CharSequence r10 = r6.subSequence(r0, r10)
            java.lang.String r10 = r10.toString()
            if (r10 == 0) goto L_0x0075
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x0071
            r10 = 1
            goto L_0x0072
        L_0x0071:
            r10 = 0
        L_0x0072:
            if (r10 != r9) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r9 = 0
        L_0x0076:
            if (r9 == 0) goto L_0x008c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r5 = 46
            r9.append(r5)
            r9.append(r6)
            java.lang.String r5 = r9.toString()
        L_0x008c:
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            r6.<init>((com.tencent.p014mm.vfs.C86009m1) r7, (java.lang.String) r5)
            java.lang.String r5 = r6.mo119971i()
            java.lang.String r6 = "VFSFile(subDir, fileName).absolutePath"
            gy3.C87412m.m108593f(r5, r6)
            r6 = -1
            r9 = 3
            com.tencent.p014mm.vfs.VFSStrategy.m163779g(r5, r6, r9, r8)
            return r5
        L_0x00a1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ph0.C100792a.mo140240l(java.lang.String, java.lang.String, java.lang.String, long, int):java.lang.String");
    }

    /* renamed from: m */
    public final String mo140241m(String str, int i) {
        C87412m.m108594g(str, "dataId");
        if (Util.isEqual(i, 1)) {
            return str;
        }
        return i + '_' + str;
    }

    /* renamed from: n */
    public final String mo140242n(String str, long j, boolean z) {
        C87412m.m108594g(str, "dataId");
        if (z) {
            return str + "@c2c_download@" + j;
        }
        return str + "@c2c_upload@" + j;
    }

    /* renamed from: o */
    public final String mo140243o(String str, C72963f4 f4Var, boolean z) {
        C87412m.m108594g(str, "dataId");
        return mo140242n(str, f4Var != null ? f4Var.getMsgId() : 0, z);
    }

    /* renamed from: p */
    public final String mo140244p(String str) {
        C87412m.m108594g(str, "dataId");
        return str + "_m";
    }

    /* renamed from: q */
    public final String mo140245q(C98672d dVar, C72963f4 f4Var) {
        String t = f4Var != null ? f4Var.mo108768t() : null;
        if (t == null) {
            t = "";
        }
        return mo140246r(dVar, t, f4Var != null ? f4Var.getMsgId() : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if ((r0.length() > 0) == true) goto L_0x002e;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo140246r(p434ig.C98672d r7, java.lang.String r8, long r9) {
        /*
            r6 = this;
            java.lang.String r0 = "talker"
            gy3.C87412m.m108594g(r8, r0)
            int r0 = r8.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 != 0) goto L_0x0019
            r3 = 0
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0039
        L_0x0019:
            if (r7 == 0) goto L_0x002d
            java.lang.String r0 = r7.mo55304e0()
            if (r0 == 0) goto L_0x002d
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 != r1) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            if (r1 == 0) goto L_0x0039
            java.lang.String r7 = r7.mo55304e0()
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = ""
        L_0x0038:
            return r7
        L_0x0039:
            if (r7 == 0) goto L_0x0040
            java.lang.String r7 = r7.mo55264K()
            goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            r1 = r7
            r5 = 1
            r0 = r6
            r2 = r8
            r3 = r9
            java.lang.String r7 = r0.mo140248t(r1, r2, r3, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ph0.C100792a.mo140246r(ig.d, java.lang.String, long):java.lang.String");
    }

    /* renamed from: s */
    public final String mo140247s(String str, String str2, long j) {
        C87412m.m108594g(str, "dataId");
        C87412m.m108594g(str2, "talker");
        return mo140248t(str, str2, j, 1);
    }

    /* renamed from: t */
    public final String mo140248t(String str, String str2, long j, int i) {
        if (str == null || Util.isNullOrNil(str)) {
            return "";
        }
        String i2 = new C86009m1(mo140232c(str2, j), mo140241m(mo140244p(str), i)).mo119971i();
        C87412m.m108593f(i2, "VFSFile(subDir, midId).absolutePath");
        VFSStrategy.m163779g(i2, -1, 3, false);
        return i2;
    }

    /* renamed from: u */
    public final String mo140249u(String str) {
        C87412m.m108594g(str, "dataId");
        return str + "_t";
    }

    /* renamed from: v */
    public final String mo140250v(C98672d dVar, C72963f4 f4Var) {
        String t = f4Var != null ? f4Var.mo108768t() : null;
        if (t == null) {
            t = "";
        }
        return mo140251w(dVar, t, f4Var != null ? f4Var.getMsgId() : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if ((r0.length() > 0) == true) goto L_0x002e;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo140251w(p434ig.C98672d r7, java.lang.String r8, long r9) {
        /*
            r6 = this;
            java.lang.String r0 = "talker"
            gy3.C87412m.m108594g(r8, r0)
            int r0 = r8.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 != 0) goto L_0x0019
            r3 = 0
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0039
        L_0x0019:
            if (r7 == 0) goto L_0x002d
            java.lang.String r0 = r7.mo55334t0()
            if (r0 == 0) goto L_0x002d
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 != r1) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            if (r1 == 0) goto L_0x0039
            java.lang.String r7 = r7.mo55334t0()
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = ""
        L_0x0038:
            return r7
        L_0x0039:
            if (r7 == 0) goto L_0x0040
            java.lang.String r7 = r7.mo55264K()
            goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            r1 = r7
            r5 = 1
            r0 = r6
            r2 = r8
            r3 = r9
            java.lang.String r7 = r0.mo140252x(r1, r2, r3, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ph0.C100792a.mo140251w(ig.d, java.lang.String, long):java.lang.String");
    }

    /* renamed from: x */
    public final String mo140252x(String str, String str2, long j, int i) {
        C87412m.m108594g(str2, "talker");
        if (str == null || Util.isNullOrNil(str)) {
            return "";
        }
        String i2 = new C86009m1(mo140232c(str2, j), mo140241m(mo140249u(str), i)).mo119971i();
        C87412m.m108593f(i2, "VFSFile(subDir, thumbId).absolutePath");
        VFSStrategy.m163779g(i2, -1, 3, false);
        return i2;
    }

    /* renamed from: y */
    public final long mo140253y(C98674g gVar) {
        C87412m.m108594g(gVar, "albumInfoItem");
        long j = 0;
        for (C98672d dVar : gVar.mo55348A()) {
            j += dVar.mo55268M() + dVar.mo55300c0() + dVar.mo55344y0();
        }
        return j;
    }
}
