package iz1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import wy1.C53224d;
import xy1.C53474j;
import xy1.C53475k;
import yy1.C53641c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: iz1.c */
public final class C33479c extends C86301e implements C53475k {

    /* renamed from: iz1.c$a */
    public static final class C33480a extends C87413o implements C32227p<String, C53641c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f90665d;

        /* renamed from: e */
        public final /* synthetic */ String f90666e;

        /* renamed from: f */
        public final /* synthetic */ C53475k.C38908a f90667f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33480a(String str, String str2, C53475k.C38908a aVar) {
            super(2);
            this.f90665d = str;
            this.f90666e = str2;
            this.f90667f = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            C53641c cVar = (C53641c) obj2;
            C87412m.m108594g(str, "sessionId");
            Log.m105924i("GameLife.GameLifeSessionInfoService", "[getSessionId] " + this.f90665d + " to " + this.f90666e + " => " + str + ", from server.");
            if (str.length() > 0) {
                ((C53224d) C86312j.m106911c(C53224d.class)).Bx0().mo59164Lo(str, this.f90665d, this.f90666e, cVar);
            }
            this.f90667f.mo7487a(str);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: G2 */
    public C53474j mo59160G2(String str) {
        return ((C53224d) C86312j.m106911c(C53224d.class)).Bx0().mo59165jo(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c5  */
    /* renamed from: fG */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo59161fG(java.lang.String r8, java.lang.String r9, int r10, pe3.C89349b r11, xy1.C53475k.C38908a r12) {
        /*
            r7 = this;
            java.lang.String r0 = "callback"
            gy3.C87412m.m108594g(r12, r0)
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L_0x0012
            int r2 = r8.length()
            if (r2 != 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r2 = 0
            goto L_0x0013
        L_0x0012:
            r2 = 1
        L_0x0013:
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x00dc
            if (r9 == 0) goto L_0x0022
            int r2 = r9.length()
            if (r2 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r2 = 0
            goto L_0x0023
        L_0x0022:
            r2 = 1
        L_0x0023:
            if (r2 == 0) goto L_0x0027
            goto L_0x00dc
        L_0x0027:
            java.lang.String r2 = "selfUsername"
            gy3.C87412m.m108594g(r8, r2)
            java.lang.String r2 = "talker"
            gy3.C87412m.m108594g(r9, r2)
            java.lang.Class<wy1.d> r2 = wy1.C53224d.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            wy1.d r2 = (wy1.C53224d) r2
            iz1.f r2 = r2.Bx0()
            int r4 = r8.length()
            if (r4 != 0) goto L_0x0045
            r4 = 1
            goto L_0x0046
        L_0x0045:
            r4 = 0
        L_0x0046:
            if (r4 != 0) goto L_0x00ad
            int r4 = r9.length()
            if (r4 != 0) goto L_0x0050
            r4 = 1
            goto L_0x0051
        L_0x0050:
            r4 = 0
        L_0x0051:
            if (r4 == 0) goto L_0x0054
            goto L_0x00ad
        L_0x0054:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, iz1.b> r4 = r2.f90675e
            java.lang.String r5 = r2.mo59166qq(r8, r9)
            java.lang.Object r4 = r4.get(r5)
            iz1.b r4 = (iz1.C33478b) r4
            if (r4 != 0) goto L_0x00b2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "select * , rowid from GameLifeSessionInfo  where talker = '"
            r4.append(r5)
            r4.append(r9)
            java.lang.String r5 = "' and selfUserName = '"
            r4.append(r5)
            r4.append(r8)
            r5 = 39
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r2.f90674d
            r6 = 0
            android.database.Cursor r4 = r5.rawQuery(r4, r6)
            iz1.b r5 = new iz1.b
            r5.<init>()
            r5.field_talker = r9
            r5.field_selfUserName = r8
            if (r4 == 0) goto L_0x009e
            boolean r6 = r4.moveToFirst()
            if (r6 == 0) goto L_0x009b
            r5.convertFrom(r4)
        L_0x009b:
            r4.close()
        L_0x009e:
            java.lang.String r4 = r5.field_sessionId
            if (r4 == 0) goto L_0x00ab
            java.util.concurrent.ConcurrentHashMap<java.lang.String, iz1.b> r4 = r2.f90675e
            java.lang.String r2 = r2.mo59166qq(r8, r9)
            r4.put(r2, r5)
        L_0x00ab:
            r4 = r5
            goto L_0x00b2
        L_0x00ad:
            iz1.b r4 = new iz1.b
            r4.<init>()
        L_0x00b2:
            java.lang.String r2 = r4.field_sessionId
            if (r2 != 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r3 = r2
        L_0x00b8:
            int r2 = r3.length()
            if (r2 != 0) goto L_0x00bf
            r0 = 1
        L_0x00bf:
            if (r0 != 0) goto L_0x00c5
            r12.mo7487a(r3)
            return
        L_0x00c5:
            iz1.c$a r0 = new iz1.c$a
            r0.<init>(r8, r9, r12)
            zy1.c r12 = new zy1.c
            r12.<init>(r8, r9, r10, r11)
            nr3.e r8 = r12.mo9225i()
            iz1.d r9 = new iz1.d
            r9.<init>(r0)
            r8.mo123419C(r9)
            return
        L_0x00dc:
            r12.mo7487a(r3)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "[get SessionId] self:"
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = " talker:"
            r10.append(r8)
            r10.append(r9)
            java.lang.String r8 = " in invalid"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.String r9 = "GameLife.GameLifeSessionInfoService"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iz1.C33479c.mo59161fG(java.lang.String, java.lang.String, int, pe3.b, xy1.k$a):void");
    }

    /* renamed from: n */
    public String mo59162n(String str) {
        String str2 = ((C53224d) C86312j.m106911c(C53224d.class)).Bx0().mo59165jo(str).field_talker;
        return str2 == null ? "" : str2;
    }
}
