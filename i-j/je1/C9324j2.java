package je1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import f40.C86709a0;
import fy3.C32232u;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lc3.C10485b;
import rx3.C13598b0;
import te3.C50401mh0;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: je1.j2 */
public final class C9324j2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f29134d;

    /* renamed from: e */
    public final /* synthetic */ C32232u<Integer, String, String, String, Integer, Integer, FinderJumpInfo, C13598b0> f29135e;

    /* renamed from: je1.j2$a */
    public static final class C9325a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32232u<Integer, String, String, String, Integer, Integer, FinderJumpInfo, C13598b0> f29136a;

        /* renamed from: b */
        public final /* synthetic */ String f29137b;

        public C9325a(C32232u<? super Integer, ? super String, ? super String, ? super String, ? super Integer, ? super Integer, ? super FinderJumpInfo, C13598b0> uVar, String str) {
            this.f29136a = uVar;
            this.f29137b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
            r5 = r1.f144772d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                ob0.b$c r1 = (ob0.C89132b.C89134c) r1
                int r2 = r1.f256793a
                r3 = 2
                java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
                r4 = 0
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                if (r2 != 0) goto L_0x007a
                int r2 = r1.f256794b
                if (r2 != 0) goto L_0x007a
                T r1 = r1.f256796d
                te3.xo1 r1 = (te3.C51999xo1) r1
                r2 = 0
                if (r1 == 0) goto L_0x0027
                te3.uo1 r5 = r1.f144772d
                if (r5 == 0) goto L_0x0027
                java.lang.String r5 = r5.f142978d
                r15 = r5
                goto L_0x0028
            L_0x0027:
                r15 = r2
            L_0x0028:
                if (r1 == 0) goto L_0x0030
                te3.uo1 r5 = r1.f144772d
                if (r5 == 0) goto L_0x0030
                int r4 = r5.f142979e
            L_0x0030:
                if (r1 == 0) goto L_0x0038
                te3.uo1 r5 = r1.f144772d
                if (r5 == 0) goto L_0x0038
                int r3 = r5.f142982h
            L_0x0038:
                if (r1 == 0) goto L_0x0043
                te3.uo1 r1 = r1.f144772d
                if (r1 == 0) goto L_0x0043
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r1.f142983i
                r18 = r1
                goto L_0x0045
            L_0x0043:
                r18 = r2
            L_0x0045:
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
                if (r1 != 0) goto L_0x0061
                if (r15 == 0) goto L_0x0061
                fy3.u<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, com.tencent.mm.protocal.protobuf.FinderJumpInfo, rx3.b0> r11 = r0.f29136a
                java.util.Map<java.lang.String, java.lang.String> r1 = je1.C9329k2.f29148a
                java.lang.String r14 = r0.f29137b
                java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
                java.lang.Integer r17 = java.lang.Integer.valueOf(r3)
                java.lang.String r13 = ""
                r11.invoke(r12, r13, r14, r15, r16, r17, r18)
                goto L_0x008d
            L_0x0061:
                fy3.u<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, com.tencent.mm.protocal.protobuf.FinderJumpInfo, rx3.b0> r1 = r0.f29136a
                int r2 = je1.C9329k2.f29151d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
                java.lang.String r7 = r0.f29137b
                java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
                java.lang.String r6 = ""
                java.lang.String r8 = ""
                r4 = r1
                r11 = r18
                r4.invoke(r5, r6, r7, r8, r9, r10, r11)
                goto L_0x008d
            L_0x007a:
                fy3.u<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, com.tencent.mm.protocal.protobuf.FinderJumpInfo, rx3.b0> r4 = r0.f29136a
                int r2 = r1.f256794b
                java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
                java.lang.String r6 = r1.f256795c
                java.lang.String r7 = r0.f29137b
                r11 = 0
                java.lang.String r8 = ""
                r9 = r12
                r4.invoke(r5, r6, r7, r8, r9, r10, r11)
            L_0x008d:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: je1.C9324j2.C9325a.call(java.lang.Object):java.lang.Object");
        }
    }

    public C9324j2(String str, C32232u<? super Integer, ? super String, ? super String, ? super String, ? super Integer, ? super Integer, ? super FinderJumpInfo, C13598b0> uVar) {
        this.f29134d = str;
        this.f29135e = uVar;
    }

    public final void run() {
        Log.m105924i("Finder.FinderExtendReadingVerifier", "verify " + this.f29134d);
        try {
            String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderExtendedReadingPrefix");
            if (Util.isNullOrNil(c)) {
                c = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + ';';
            }
            C87412m.m108593f(c, "prefixs");
            List T = C112550d0.m153784T(C112550d0.m153799i0(c).toString(), new char[]{';'}, false, 0, 6, (Object) null);
            ArrayList<String> arrayList = new ArrayList<>();
            for (Object next : T) {
                if (!Util.isNullOrNil(C112550d0.m153799i0((String) next).toString())) {
                    arrayList.add(next);
                }
            }
            String str = this.f29134d;
            boolean z = false;
            for (String i0 : arrayList) {
                String lowerCase = str.toLowerCase();
                C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
                if (C112551y.m153819s(lowerCase, C112550d0.m153799i0(i0).toString(), false)) {
                    z = true;
                }
            }
            if (z) {
                new C9378t1(1, this.f29134d, 0, (C50401mh0) null, 12, (C8480h) null).mo9225i().mo123420E(new C9325a(this.f29135e, this.f29134d));
                return;
            }
            Log.m105924i("Finder.FinderExtendReadingVerifier", "scheme or host not valid");
            C32232u<Integer, String, String, String, Integer, Integer, FinderJumpInfo, C13598b0> uVar = this.f29135e;
            Map<String, String> map = C9329k2.f29148a;
            uVar.invoke(Integer.valueOf(C9329k2.f29149b), "", this.f29134d, "", 0, 2, null);
        } catch (MalformedURLException e) {
            Log.printErrStackTrace("Finder.FinderExtendReadingVerifier", e, "MalformedURLException", new Object[0]);
            C32232u<Integer, String, String, String, Integer, Integer, FinderJumpInfo, C13598b0> uVar2 = this.f29135e;
            Map<String, String> map2 = C9329k2.f29148a;
            uVar2.invoke(Integer.valueOf(C9329k2.f29149b), "", this.f29134d, "", 0, 2, null);
        } catch (IOException e2) {
            Log.printErrStackTrace("Finder.FinderExtendReadingVerifier", e2, "IOException", new Object[0]);
            C32232u<Integer, String, String, String, Integer, Integer, FinderJumpInfo, C13598b0> uVar3 = this.f29135e;
            Map<String, String> map3 = C9329k2.f29148a;
            uVar3.invoke(Integer.valueOf(C9329k2.f29150c), "", this.f29134d, "", 0, 2, null);
        } catch (Throwable th) {
            Log.printErrStackTrace("Finder.FinderExtendReadingVerifier", th, "Throwable", new Object[0]);
            C32232u<Integer, String, String, String, Integer, Integer, FinderJumpInfo, C13598b0> uVar4 = this.f29135e;
            Map<String, String> map4 = C9329k2.f29148a;
            uVar4.invoke(Integer.valueOf(C9329k2.f29150c), "", this.f29134d, "", 0, 2, null);
        }
    }
}
