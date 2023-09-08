package uz3;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import qz3.C26019c;
import qz3.C26046l;
import qz3.C26052n;
import qz3.C26065q;
import rx3.C13604l;
import sz3.C26238b;
import sz3.C26243c;
import tz3.C26349a;
import xz3.C26585b;
import xz3.C26586d;
import xz3.C26589f;
import xz3.C26601j;
import xz3.C26607p;

/* renamed from: uz3.h */
public final class C26380h {

    /* renamed from: a */
    public static final C26380h f73581a = new C26380h();

    /* renamed from: b */
    public static final C26589f f73582b;

    static {
        C26589f fVar = new C26589f();
        fVar.mo53551a(C26349a.f73453a);
        fVar.mo53551a(C26349a.f73454b);
        fVar.mo53551a(C26349a.f73455c);
        fVar.mo53551a(C26349a.f73456d);
        fVar.mo53551a(C26349a.f73457e);
        fVar.mo53551a(C26349a.f73458f);
        fVar.mo53551a(C26349a.f73459g);
        fVar.mo53551a(C26349a.f73460h);
        fVar.mo53551a(C26349a.f73461i);
        fVar.mo53551a(C26349a.f73462j);
        fVar.mo53551a(C26349a.f73463k);
        fVar.mo53551a(C26349a.f73464l);
        fVar.mo53551a(C26349a.f73465m);
        fVar.mo53551a(C26349a.f73466n);
        f73582b = fVar;
    }

    /* renamed from: d */
    public static final boolean m33951d(C26052n nVar) {
        C87412m.m108594g(nVar, TPReportKeys.Common.COMMON_PROTO);
        C26238b.C26240b bVar = C26377c.f73576a;
        C26238b.C26240b bVar2 = C26377c.f73576a;
        Object f = nVar.mo53571f(C26349a.f73457e);
        C87412m.m108593f(f, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean d = bVar2.mo53140c(((Number) f).intValue());
        C87412m.m108593f(d, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return d.booleanValue();
    }

    /* renamed from: f */
    public static final C13604l<C26378f, C26019c> m33952f(String[] strArr, String[] strArr2) {
        C87412m.m108594g(strArr, "data");
        C87412m.m108594g(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C118638a.m167311b(strArr));
        C26378f g = f73581a.mo53367g(byteArrayInputStream, strArr2);
        C26589f fVar = f73582b;
        C26585b bVar = (C26585b) C26019c.f72472R;
        bVar.getClass();
        C26586d dVar = new C26586d(byteArrayInputStream);
        C26607p pVar = (C26607p) bVar.mo52860a(dVar, fVar);
        try {
            dVar.mo53517a(0);
            bVar.mo53515b(pVar);
            return new C13604l<>(g, (C26019c) pVar);
        } catch (C26601j e) {
            e.f74023d = pVar;
            throw e;
        }
    }

    /* renamed from: h */
    public static final C13604l<C26378f, C26046l> m33953h(String[] strArr, String[] strArr2) {
        C87412m.m108594g(strArr, "data");
        C87412m.m108594g(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C118638a.m167311b(strArr));
        C26378f g = f73581a.mo53367g(byteArrayInputStream, strArr2);
        C26589f fVar = f73582b;
        C26585b bVar = (C26585b) C26046l.f72661r;
        bVar.getClass();
        C26586d dVar = new C26586d(byteArrayInputStream);
        C26607p pVar = (C26607p) bVar.mo52860a(dVar, fVar);
        try {
            dVar.mo53517a(0);
            bVar.mo53515b(pVar);
            return new C13604l<>(g, (C26046l) pVar);
        } catch (C26601j e) {
            e.f74023d = pVar;
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final uz3.C22710d.C22712b mo53363a(qz3.C26023d r17, sz3.C26243c r18, sz3.C26247g r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "proto"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.String r3 = "nameResolver"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "typeTable"
            gy3.C87412m.m108594g(r2, r3)
            xz3.h$f<qz3.d, tz3.a$c> r3 = tz3.C26349a.f73453a
            java.lang.String r4 = "constructorSignature"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.Object r3 = sz3.C26245e.m33733a(r0, r3)
            tz3.a$c r3 = (tz3.C26349a.C26354c) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0037
            int r6 = r3.f73481e
            r6 = r6 & r5
            if (r6 != r5) goto L_0x002d
            r6 = 1
            goto L_0x002e
        L_0x002d:
            r6 = 0
        L_0x002e:
            if (r6 == 0) goto L_0x0037
            int r6 = r3.f73482f
            java.lang.String r6 = r1.getString(r6)
            goto L_0x0039
        L_0x0037:
            java.lang.String r6 = "<init>"
        L_0x0039:
            if (r3 == 0) goto L_0x004b
            int r7 = r3.f73481e
            r8 = 2
            r7 = r7 & r8
            if (r7 != r8) goto L_0x0042
            r4 = 1
        L_0x0042:
            if (r4 == 0) goto L_0x004b
            int r0 = r3.f73483g
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0094
        L_0x004b:
            java.util.List<qz3.u> r0 = r0.f72544h
            java.lang.String r3 = "proto.valueParameterList"
            gy3.C87412m.m108593f(r0, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r3 = 10
            int r3 = sx3.C36907w.m41090l(r0, r3)
            r7.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0061:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = r0.next()
            qz3.u r3 = (qz3.C26082u) r3
            uz3.h r4 = f73581a
            java.lang.String r5 = "it"
            gy3.C87412m.m108593f(r3, r5)
            qz3.q r3 = sz3.C26246f.m33739e(r3, r2)
            java.lang.String r3 = r4.mo53366e(r3, r1)
            if (r3 != 0) goto L_0x0080
            r0 = 0
            return r0
        L_0x0080:
            r7.add(r3)
            goto L_0x0061
        L_0x0084:
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 56
            r15 = 0
            java.lang.String r8 = ""
            java.lang.String r9 = "("
            java.lang.String r10 = ")V"
            java.lang.String r0 = sx3.C110818d0.m150921S(r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0094:
            uz3.d$b r1 = new uz3.d$b
            r1.<init>(r6, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uz3.C26380h.mo53363a(qz3.d, sz3.c, sz3.g):uz3.d$b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final uz3.C22710d.C22711a mo53364b(qz3.C26052n r7, sz3.C26243c r8, sz3.C26247g r9, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = "proto"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "nameResolver"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "typeTable"
            gy3.C87412m.m108594g(r9, r0)
            xz3.h$f<qz3.n, tz3.a$d> r0 = tz3.C26349a.f73456d
            java.lang.String r1 = "propertySignature"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.Object r0 = sz3.C26245e.m33733a(r7, r0)
            tz3.a$d r0 = (tz3.C26349a.C26357d) r0
            r1 = 0
            if (r0 != 0) goto L_0x0020
            return r1
        L_0x0020:
            int r2 = r0.f73492e
            r3 = 1
            r2 = r2 & r3
            r4 = 0
            if (r2 != r3) goto L_0x0029
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            if (r2 == 0) goto L_0x002f
            tz3.a$b r0 = r0.f73493f
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            if (r0 != 0) goto L_0x0035
            if (r10 == 0) goto L_0x0035
            return r1
        L_0x0035:
            if (r0 == 0) goto L_0x0044
            int r10 = r0.f73470e
            r10 = r10 & r3
            if (r10 != r3) goto L_0x003e
            r10 = 1
            goto L_0x003f
        L_0x003e:
            r10 = 0
        L_0x003f:
            if (r10 == 0) goto L_0x0044
            int r10 = r0.f73471f
            goto L_0x0046
        L_0x0044:
            int r10 = r7.f72698i
        L_0x0046:
            if (r0 == 0) goto L_0x0059
            int r2 = r0.f73470e
            r5 = 2
            r2 = r2 & r5
            if (r2 != r5) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            if (r3 == 0) goto L_0x0059
            int r7 = r0.f73472g
            java.lang.String r7 = r8.getString(r7)
            goto L_0x0064
        L_0x0059:
            qz3.q r7 = sz3.C26246f.m33738d(r7, r9)
            java.lang.String r7 = r6.mo53366e(r7, r8)
            if (r7 != 0) goto L_0x0064
            return r1
        L_0x0064:
            uz3.d$a r9 = new uz3.d$a
            java.lang.String r8 = r8.getString(r10)
            r9.<init>(r8, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: uz3.C26380h.mo53364b(qz3.n, sz3.c, sz3.g, boolean):uz3.d$a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e A[LOOP:0: B:16:0x0068->B:18:0x006e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ba A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bb  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final uz3.C22710d.C22712b mo53365c(qz3.C26041i r18, sz3.C26243c r19, sz3.C26247g r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "proto"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.String r3 = "nameResolver"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "typeTable"
            gy3.C87412m.m108594g(r2, r3)
            xz3.h$f<qz3.i, tz3.a$c> r3 = tz3.C26349a.f73454b
            java.lang.String r4 = "methodSignature"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.Object r3 = sz3.C26245e.m33733a(r0, r3)
            tz3.a$c r3 = (tz3.C26349a.C26354c) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0033
            int r6 = r3.f73481e
            r6 = r6 & r5
            if (r6 != r5) goto L_0x002d
            r6 = 1
            goto L_0x002e
        L_0x002d:
            r6 = 0
        L_0x002e:
            if (r6 == 0) goto L_0x0033
            int r6 = r3.f73482f
            goto L_0x0035
        L_0x0033:
            int r6 = r0.f72626i
        L_0x0035:
            if (r3 == 0) goto L_0x004a
            int r7 = r3.f73481e
            r8 = 2
            r7 = r7 & r8
            if (r7 != r8) goto L_0x003e
            r4 = 1
        L_0x003e:
            if (r4 == 0) goto L_0x004a
            int r0 = r3.f73483g
            java.lang.String r0 = r1.getString(r0)
            r2 = r17
            goto L_0x00db
        L_0x004a:
            qz3.q r3 = sz3.C26246f.m33736b(r0, r2)
            java.util.List r3 = sx3.C64197v.m75538g(r3)
            java.util.List<qz3.u> r4 = r0.f72635u
            java.lang.String r5 = "proto.valueParameterList"
            gy3.C87412m.m108593f(r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r8 = sx3.C36907w.m41090l(r4, r7)
            r5.<init>(r8)
            java.util.Iterator r4 = r4.iterator()
        L_0x0068:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0081
            java.lang.Object r8 = r4.next()
            qz3.u r8 = (qz3.C26082u) r8
            java.lang.String r9 = "it"
            gy3.C87412m.m108593f(r8, r9)
            qz3.q r8 = sz3.C26246f.m33739e(r8, r2)
            r5.add(r8)
            goto L_0x0068
        L_0x0081:
            java.util.List r3 = sx3.C110818d0.m150933e0(r3, r5)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r4 = sx3.C36907w.m41090l(r3, r7)
            r8.<init>(r4)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0094:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x00ae
            java.lang.Object r4 = r3.next()
            qz3.q r4 = (qz3.C26065q) r4
            uz3.h r7 = f73581a
            java.lang.String r4 = r7.mo53366e(r4, r1)
            if (r4 != 0) goto L_0x00aa
            return r5
        L_0x00aa:
            r8.add(r4)
            goto L_0x0094
        L_0x00ae:
            qz3.q r0 = sz3.C26246f.m33737c(r0, r2)
            r2 = r17
            java.lang.String r0 = r2.mo53366e(r0, r1)
            if (r0 != 0) goto L_0x00bb
            return r5
        L_0x00bb:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 56
            r16 = 0
            java.lang.String r9 = ""
            java.lang.String r10 = "("
            java.lang.String r11 = ")"
            java.lang.String r4 = sx3.C110818d0.m150921S(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x00db:
            uz3.d$b r3 = new uz3.d$b
            java.lang.String r1 = r1.getString(r6)
            r3.<init>(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: uz3.C26380h.mo53365c(qz3.i, sz3.c, sz3.g):uz3.d$b");
    }

    /* renamed from: e */
    public final String mo53366e(C26065q qVar, C26243c cVar) {
        if (qVar.mo52919l()) {
            return C22709b.m26584b(cVar.mo53143a(qVar.f72771o));
        }
        return null;
    }

    /* renamed from: g */
    public final C26378f mo53367g(InputStream inputStream, String[] strArr) {
        C26349a.C26360e eVar = (C26349a.C26360e) ((C26585b) C26349a.C26360e.f73507n).mo53516c(inputStream, f73582b);
        C87412m.m108593f(eVar, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new C26378f(eVar, strArr);
    }
}
