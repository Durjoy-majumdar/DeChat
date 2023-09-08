package az2;

import android.database.Cursor;
import android.util.Base64;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C31924c1;
import f62.C75700k0;
import fy3.C32224a;
import g62.C75875l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l20.C21388a;
import lz2.C10698i;
import lz2.C46925h;
import m02.C46940b;
import nz2.C47313a;
import ob0.C117747y;
import ob0.C35136m;
import ob0.C35142u;
import p327ct.C30914c;
import p564iq.C87790d;
import p773yy.C66710j;
import qy2.C77448f0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import rz2.C48201c;
import rz2.C48202d;
import rz2.C48203e;
import rz2.C48204f;
import rz2.C48205g;
import rz2.C48206h;
import rz2.C48212k;
import rz2.C48213l;
import su0.C13781a;
import sx3.C26236u;
import sx3.C64197v;
import uy2.C52657a;
import uz2.C52678e0;
import uz2.C52713s;
import uz2.C52718u;
import vz2.C78501d;
import wz2.C53271b;
import xy2.C53477h;
import yy2.C39246d;
import yy2.C53658a;
import yy2.C53659b;
import yy2.C79169c;
import yz2.C16086o;
import z04.C112551y;
import zh3.C91753f;

/* renamed from: az2.e */
public final class C39674e implements C31924c1, C35142u {

    /* renamed from: d */
    public static final C39674e f106452d = new C39674e();

    /* renamed from: e */
    public static final C13601g f106453e = C36568h.m40985a(C39676b.f106463d);

    /* renamed from: f */
    public static final C13601g f106454f = C36568h.m40985a(C28179h.f77674d);

    /* renamed from: g */
    public static final C13601g f106455g = C36568h.m40985a(C39678d.f106465d);

    /* renamed from: h */
    public static final C13601g f106456h = C36568h.m40985a(C39679f.f106466d);

    /* renamed from: i */
    public static final C13601g f106457i = C36568h.m40985a(C39680i.f106467d);

    /* renamed from: j */
    public static final C13601g f106458j = C36568h.m40985a(C39675a.f106462d);

    /* renamed from: n */
    public static final C13601g f106459n = C36568h.m40985a(C28178g.f77673d);

    /* renamed from: o */
    public static final C13601g f106460o = C36568h.m40985a(C39677c.f106464d);

    /* renamed from: p */
    public static long f106461p;

    /* renamed from: az2.e$e */
    public static final class C28177e extends C87413o implements C32224a<C79169c> {

        /* renamed from: d */
        public static final C28177e f77672d = new C28177e();

        public C28177e() {
            super(0);
        }

        public Object invoke() {
            C75875l LE = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
            C87412m.m108593f(LE, "service(IMessengerStorage::class.java).msgInfoStg");
            return new C79169c(LE);
        }
    }

    /* renamed from: az2.e$g */
    public static final class C28178g extends C87413o implements C32224a<C39246d> {

        /* renamed from: d */
        public static final C28178g f77673d = new C28178g();

        public C28178g() {
            super(0);
        }

        public Object invoke() {
            return new C39246d(C39674e.f106452d.mo62242Np());
        }
    }

    /* renamed from: az2.e$h */
    public static final class C28179h extends C87413o implements C32224a<C48206h> {

        /* renamed from: d */
        public static final C28179h f77674d = new C28179h();

        public C28179h() {
            super(0);
        }

        public Object invoke() {
            return new C48206h(C39674e.f106452d.mo62242Np());
        }
    }

    /* renamed from: az2.e$a */
    public static final class C39675a extends C87413o implements C32224a<C53658a> {

        /* renamed from: d */
        public static final C39675a f106462d = new C39675a();

        public C39675a() {
            super(0);
        }

        public Object invoke() {
            return new C53658a(C39674e.f106452d.mo62242Np());
        }
    }

    /* renamed from: az2.e$b */
    public static final class C39676b extends C87413o implements C32224a<C91753f> {

        /* renamed from: d */
        public static final C39676b f106463d = new C39676b();

        public C39676b() {
            super(0);
        }

        public Object invoke() {
            HashMap hashMap = new HashMap();
            hashMap.put(-450132065, new C39681f());
            hashMap.put(-822819882, new C39682g());
            hashMap.put(1875311212, new C39683h());
            hashMap.put(23107883, new C39684i());
            hashMap.put(-1903554517, new C39685j());
            hashMap.put(-295484990, new C39686k());
            hashMap.put(-1718773947, new C28180l());
            C91753f fVar = new C91753f();
            fVar.mo125626p(C86709a0.m107535s().f251807e + "TextStatus.db", hashMap, true, true);
            return fVar;
        }
    }

    /* renamed from: az2.e$c */
    public static final class C39677c extends C87413o implements C32224a<C53659b> {

        /* renamed from: d */
        public static final C39677c f106464d = new C39677c();

        public C39677c() {
            super(0);
        }

        public Object invoke() {
            return new C53659b(C39674e.f106452d.mo62242Np());
        }
    }

    /* renamed from: az2.e$d */
    public static final class C39678d extends C87413o implements C32224a<C48203e> {

        /* renamed from: d */
        public static final C39678d f106465d = new C39678d();

        public C39678d() {
            super(0);
        }

        public Object invoke() {
            return new C48203e(C39674e.f106452d.mo62242Np());
        }
    }

    /* renamed from: az2.e$f */
    public static final class C39679f extends C87413o implements C32224a<C48205g> {

        /* renamed from: d */
        public static final C39679f f106466d = new C39679f();

        public C39679f() {
            super(0);
        }

        public Object invoke() {
            return new C48205g(C39674e.f106452d.mo62242Np());
        }
    }

    /* renamed from: az2.e$i */
    public static final class C39680i extends C87413o implements C32224a<C48213l> {

        /* renamed from: d */
        public static final C39680i f106467d = new C39680i();

        public C39680i() {
            super(0);
        }

        public Object invoke() {
            return new C48213l(C39674e.f106452d.mo62242Np());
        }
    }

    static {
        C36568h.m40985a(C28177e.f77672d);
    }

    /* renamed from: T0 */
    public static void m42302T0(C39674e eVar, boolean z, int i, Object obj) {
        boolean z2 = true;
        if ((i & 1) != 0) {
            z = false;
        }
        eVar.getClass();
        long c = C31543z5.m39453c();
        if (z || Math.abs(c - f106461p) > 600000) {
            C48201c n0 = eVar.mo62253n0(C13781a.m13082a());
            String str = n0 != null ? n0.field_StatusID : null;
            Log.m105924i("MicroMsg.TextStatus.TextStatusInfoManager", "reqGetSelfInfo() called with: forceRequest = " + z + " selfStatusId = " + str);
            if (str != null && !C112551y.m153811k(str)) {
                z2 = false;
            }
            if (!z2) {
                C86709a0.m107524d().mo123460f(new C46925h(str));
                f106461p = c;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0159  */
    /* renamed from: X0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m42303X0(az2.C39674e r16, java.lang.String r17, java.lang.String r18, uz2.C52718u r19, int r20, java.lang.String r21, long r22, int r24, java.lang.Object r25) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r24 & 8
            r4 = 0
            if (r3 == 0) goto L_0x000d
            r3 = 0
            goto L_0x000f
        L_0x000d:
            r3 = r20
        L_0x000f:
            r5 = r24 & 16
            java.lang.String r6 = "NOT_SET"
            if (r5 == 0) goto L_0x0017
            r5 = r6
            goto L_0x0019
        L_0x0017:
            r5 = r21
        L_0x0019:
            r7 = 32
            r8 = r24 & 32
            if (r8 == 0) goto L_0x0022
            r8 = 0
            goto L_0x0024
        L_0x0022:
            r8 = r22
        L_0x0024:
            r16.getClass()
            java.lang.String r10 = "username"
            gy3.C87412m.m108594g(r0, r10)
            java.lang.String r10 = "id"
            gy3.C87412m.m108594g(r1, r10)
            java.lang.String r10 = "info"
            gy3.C87412m.m108594g(r2, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "username "
            r10.append(r11)
            r10.append(r0)
            r10.append(r7)
            r10.append(r1)
            r10.append(r7)
            r10.append(r3)
            r10.append(r7)
            java.lang.String r7 = r2.f147241j
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            java.lang.String r10 = "MicroMsg.TextStatus.TextStatusInfoManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r7)
            java.lang.String r7 = su0.C13781a.m13082a()
            boolean r7 = gy3.C87412m.m108589b(r0, r7)
            java.lang.String r11 = " create_time:"
            java.lang.String r12 = "update deleteResult:"
            r15 = 7
            r13 = 1
            if (r7 == 0) goto L_0x0186
            rz2.h r7 = r16.mo62255t0()
            rz2.c r7 = r7.mo72970kD(r0)
            if (r7 != 0) goto L_0x0087
            rz2.c r7 = new rz2.c
            r7.<init>()
            b03.f r8 = b03.C39696f.f106501a
            r8.mo62318a(r0, r15)
            goto L_0x00c9
        L_0x0087:
            int r8 = r2.f147245q
            int r9 = r7.field_CreateTime
            if (r8 >= r9) goto L_0x00b4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "current postInfo is new.(cur:"
            r0.append(r1)
            int r1 = r7.field_CreateTime
            r0.append(r1)
            java.lang.String r1 = ", new:"
            r0.append(r1)
            int r1 = r2.f147245q
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x01f5
        L_0x00b4:
            if (r8 == r9) goto L_0x00cb
            java.lang.String r8 = r7.field_StatusID
            boolean r8 = gy3.C87412m.m108589b(r1, r8)
            if (r8 == 0) goto L_0x00bf
            goto L_0x00cb
        L_0x00bf:
            rz2.c r7 = new rz2.c
            r7.<init>()
            b03.f r8 = b03.C39696f.f106501a
            r8.mo62318a(r0, r15)
        L_0x00c9:
            r8 = 0
            goto L_0x00d7
        L_0x00cb:
            int r8 = r7.mo72944m2(r1, r2, r13)
            if (r8 <= 0) goto L_0x00d6
            b03.f r9 = b03.C39696f.f106501a
            r9.mo62318a(r0, r8)
        L_0x00d6:
            r8 = 1
        L_0x00d7:
            int r9 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            if (r9 > r13) goto L_0x012f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r13 = "update() called with: username = "
            r9.append(r13)
            r9.append(r0)
            java.lang.String r13 = ", id = "
            r9.append(r13)
            r9.append(r1)
            java.lang.String r13 = ", info = "
            r9.append(r13)
            r9.append(r2)
            java.lang.String r13 = ", state = "
            r9.append(r13)
            r9.append(r3)
            java.lang.String r13 = ", visibilityInfo = "
            r9.append(r13)
            r9.append(r5)
            java.lang.String r13 = " item.field_visibilityInfo:"
            r9.append(r13)
            java.lang.String r13 = r7.field_visibilityInfo
            r9.append(r13)
            java.lang.String r13 = " isUpdate:"
            r9.append(r13)
            r9.append(r8)
            java.lang.String r13 = "  stack:"
            r9.append(r13)
            com.tencent.mm.sdk.platformtools.MMStack r13 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r9)
        L_0x012f:
            r7.field_UserName = r0
            r7.field_StatusID = r1
            r7.field_state = r3
            boolean r1 = gy3.C87412m.m108589b(r5, r6)
            if (r1 != 0) goto L_0x013d
            r7.field_visibilityInfo = r5
        L_0x013d:
            r5 = r16
            r5.mo62237B(r7, r2)
            if (r8 == 0) goto L_0x014f
            rz2.h r1 = r16.mo62255t0()
            java.lang.String[] r3 = new java.lang.String[r4]
            boolean r1 = r1.update(r7, r3)
            goto L_0x0157
        L_0x014f:
            rz2.h r1 = r16.mo62255t0()
            boolean r1 = r1.insert(r7)
        L_0x0157:
            if (r1 == 0) goto L_0x0182
            kz2.a r1 = kz2.C76641a.f224261a
            r1.mo106920e(r0, r7)
            rz2.h r1 = r16.mo62255t0()
            int r3 = r2.f147245q
            boolean r0 = r1.mo72969jo(r0, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            r1.append(r0)
            r1.append(r11)
            int r0 = r2.f147245q
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x0182:
            long r13 = r7.systemRowid
            goto L_0x0243
        L_0x0186:
            r5 = r16
            rz2.h r5 = r16.mo62255t0()
            rz2.c r5 = r5.mo72970kD(r0)
            if (r5 != 0) goto L_0x019d
            rz2.c r5 = new rz2.c
            r5.<init>()
            b03.f r4 = b03.C39696f.f106501a
            r4.mo62318a(r0, r15)
            goto L_0x0203
        L_0x019d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "last status:"
            r6.append(r7)
            java.lang.String r7 = r5.field_StatusID
            r6.append(r7)
            java.lang.String r7 = " state:"
            r6.append(r7)
            int r7 = r5.field_state
            r6.append(r7)
            java.lang.String r7 = " createTime:"
            r6.append(r7)
            int r7 = r5.field_CreateTime
            r6.append(r7)
            java.lang.String r7 = " mediaType:"
            r6.append(r7)
            int r7 = r5.field_MediaType
            r6.append(r7)
            java.lang.String r7 = "  "
            r6.append(r7)
            java.lang.String r7 = r5.field_MediaThumbUrl
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)
            long r6 = r5.field_profileSeq
            int r14 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x01f8
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r0[r4] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0[r13] = r1
            java.lang.String r1 = "update: lastSeq:%s thisSeq:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r1, r0)
        L_0x01f5:
            r13 = -1
            goto L_0x0243
        L_0x01f8:
            int r4 = r5.mo72944m2(r1, r2, r4)
            if (r4 <= 0) goto L_0x0203
            b03.f r6 = b03.C39696f.f106501a
            r6.mo62318a(r0, r4)
        L_0x0203:
            r5.field_UserName = r0
            r5.field_StatusID = r1
            r5.field_state = r3
            az2.e r1 = f106452d
            r1.mo62237B(r5, r2)
            rz2.h r3 = r1.mo62255t0()
            boolean r3 = r3.replace(r5)
            if (r3 == 0) goto L_0x0241
            kz2.a r3 = kz2.C76641a.f224261a
            r3.mo106920e(r0, r5)
            rz2.h r1 = r1.mo62255t0()
            int r3 = r2.f147245q
            boolean r0 = r1.mo72969jo(r0, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            r1.append(r0)
            r1.append(r11)
            int r0 = r2.f147245q
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
        L_0x0241:
            long r13 = r5.systemRowid
        L_0x0243:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: az2.C39674e.m42303X0(az2.e, java.lang.String, java.lang.String, uz2.u, int, java.lang.String, long, int, java.lang.Object):long");
    }

    /* renamed from: B */
    public final void mo62237B(C48201c cVar, C52718u uVar) {
        C87412m.m108594g(cVar, "<this>");
        C87412m.m108594g(uVar, "info");
        cVar.field_Description = uVar.f147231J;
        C52678e0 e0Var = uVar.f147238g;
        byte[] bArr = null;
        cVar.field_IconID = e0Var != null ? e0Var.f147088e : null;
        cVar.field_TopicId = e0Var != null ? e0Var.f147087d : null;
        cVar.field_ClusterId = e0Var != null ? e0Var.f147096p : null;
        cVar.field_MediaType = uVar.f147237f;
        cVar.field_MediaUrl = uVar.f147239h;
        cVar.field_MediaAESKey = uVar.f147240i;
        cVar.field_MediaThumbUrl = uVar.f147241j;
        cVar.field_MediaThumbAESKey = uVar.f147242n;
        cVar.field_PoiID = uVar.f147247s;
        cVar.field_PoiName = uVar.f147248t;
        cVar.field_Latitude = uVar.f147236e;
        cVar.field_Longitude = uVar.f147235d;
        cVar.field_Visibility = uVar.f147243o;
        cVar.field_ExpireTime = uVar.f147246r;
        cVar.field_CreateTime = uVar.f147245q;
        cVar.field_backgroundId = uVar.f147252x;
        cVar.field_option = Long.valueOf(uVar.f147249u);
        cVar.field_mediaWidth = uVar.f147250v;
        cVar.field_mediaHeight = uVar.f147251w;
        cVar.field_referenceUserName = uVar.f147224C;
        cVar.field_referenceTextStatusId = uVar.f147225D;
        cVar.field_duplicateUserName = uVar.f147227F;
        cVar.field_duplicateTextStatusId = uVar.f147228G;
        cVar.field_sceneType = uVar.f147226E;
        C52678e0 e0Var2 = uVar.f147238g;
        cVar.field_TopicInfo = e0Var2 != null ? e0Var2.toByteArray() : null;
        C52713s sVar = uVar.f147232K;
        if (sVar != null) {
            bArr = sVar.toByteArray();
        }
        cVar.field_EmojiInfo = bArr;
        if (uVar.isIncludeUnKnownField()) {
            cVar.field_statusExtInfoOriBytes = uVar.getData();
        }
    }

    /* renamed from: D */
    public final C53658a mo62238D() {
        return (C53658a) ((C36570n) f106458j).getValue();
    }

    /* renamed from: E0 */
    public final C48213l mo62239E0() {
        return (C48213l) ((C36570n) f106457i).getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo62240H0() {
        /*
            r3 = this;
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TEXT_STATUS_LASTTIME_LIKE_TAB_SHOWN_INT
            r2 = 0
            java.lang.Object r0 = r0.mo119685f(r1, r2)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0016
            r2 = r0
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x0016:
            if (r2 == 0) goto L_0x001d
            int r0 = r2.intValue()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            rz2.e r1 = r3.mo62246S()
            int r1 = r1.mo72955qq(r0)
            rz2.g r2 = r3.mo62249g0()
            int r0 = r2.mo72956Lo(r0)
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: az2.C39674e.mo62240H0():int");
    }

    /* renamed from: N0 */
    public final void mo62241N0() {
        int qq = C53658a.m60191qq(mo62238D(), 0, 1, (Object) null);
        Log.m105918d("MicroMsg.TextStatus.TextStatusInfoManager", "markConvTabUnread() called  unreadCnt = " + qq);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_LASTTIME_CONV_UNREAD_INT, Integer.valueOf(qq));
    }

    /* renamed from: Np */
    public final C91753f mo62242Np() {
        return (C91753f) ((C36570n) f106453e).getValue();
    }

    /* renamed from: O */
    public final C53659b mo62243O() {
        return (C53659b) ((C36570n) f106460o).getValue();
    }

    /* renamed from: O0 */
    public final void mo62244O0() {
        Log.m105918d("MicroMsg.TextStatus.TextStatusInfoManager", "markNotifyShown() called");
        int e = C31543z5.m39455e();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_LASTTIME_NOTIFY_SHOWN_INT, Integer.valueOf(e));
        Log.m105918d("MicroMsg.TextStatus.TextStatusInfoManager", "markLikeTabShown() called");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_LASTTIME_LIKE_TAB_SHOWN_INT, Integer.valueOf(e));
        Log.m105918d("MicroMsg.TextStatus.TextStatusInfoManager", "markConvTabShown() called");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_LASTTIME_CONV_TAB_SHOWN_INT, Integer.valueOf(e));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final nz2.C47313a.C47314a mo62245Q(int r11) {
        /*
            r10 = this;
            yy2.b r0 = r10.mo62243O()
            uy2.e r0 = r0.mo74249Lo()
            if (r0 == 0) goto L_0x000d
            int r1 = r0.field_createTime
            goto L_0x000e
        L_0x000d:
            r1 = -1
        L_0x000e:
            r2 = 0
            if (r1 <= r11) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r0 = r2
        L_0x0013:
            yy2.a r1 = r10.mo62238D()
            r1.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "select *, rowid from TextStatusConversation where isRedDot = 1 and updateTime > "
            r3.append(r4)
            long r4 = (long) r11
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r3.append(r4)
            java.lang.String r11 = " ORDER BY updateTime DESC"
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r1.f150722d
            android.database.Cursor r11 = r1.rawQuery(r11, r2)
            if (r11 == 0) goto L_0x004f
            boolean r1 = r11.moveToFirst()
            if (r1 == 0) goto L_0x004c
            uy2.a r1 = new uy2.a
            r1.<init>()
            r1.convertFrom(r11)
            goto L_0x0050
        L_0x004c:
            r11.close()
        L_0x004f:
            r1 = r2
        L_0x0050:
            r11 = 2
            com.tencent.mm.sdk.storage.IAutoDBItem[] r11 = new com.tencent.p014mm.sdk.storage.IAutoDBItem[r11]
            r3 = 0
            r11[r3] = r0
            r0 = 1
            r11[r0] = r1
            java.util.List r11 = sx3.C64197v.m75537f(r11)
            java.util.Iterator r11 = r11.iterator()
            boolean r0 = r11.hasNext()
            if (r0 != 0) goto L_0x0069
            r0 = r2
            goto L_0x00ba
        L_0x0069:
            java.lang.Object r0 = r11.next()
            boolean r1 = r11.hasNext()
            if (r1 != 0) goto L_0x0074
            goto L_0x00ba
        L_0x0074:
            r1 = r0
            com.tencent.mm.sdk.storage.IAutoDBItem r1 = (com.tencent.p014mm.sdk.storage.IAutoDBItem) r1
            boolean r3 = r1 instanceof uy2.C52657a
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r3 == 0) goto L_0x0087
            uy2.a r1 = (uy2.C52657a) r1
            long r6 = r1.field_updateTime
            long r8 = (long) r5
            long r6 = r6 / r8
            int r1 = (int) r6
            goto L_0x0092
        L_0x0087:
            boolean r3 = r1 instanceof uy2.C52660e
            if (r3 == 0) goto L_0x0090
            uy2.e r1 = (uy2.C52660e) r1
            int r1 = r1.field_createTime
            goto L_0x0092
        L_0x0090:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0092:
            java.lang.Object r3 = r11.next()
            r6 = r3
            com.tencent.mm.sdk.storage.IAutoDBItem r6 = (com.tencent.p014mm.sdk.storage.IAutoDBItem) r6
            boolean r7 = r6 instanceof uy2.C52657a
            if (r7 == 0) goto L_0x00a5
            uy2.a r6 = (uy2.C52657a) r6
            long r6 = r6.field_updateTime
            long r8 = (long) r5
            long r6 = r6 / r8
            int r7 = (int) r6
            goto L_0x00b0
        L_0x00a5:
            boolean r7 = r6 instanceof uy2.C52660e
            if (r7 == 0) goto L_0x00ae
            uy2.e r6 = (uy2.C52660e) r6
            int r7 = r6.field_createTime
            goto L_0x00b0
        L_0x00ae:
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b0:
            if (r1 >= r7) goto L_0x00b4
            r0 = r3
            r1 = r7
        L_0x00b4:
            boolean r3 = r11.hasNext()
            if (r3 != 0) goto L_0x0092
        L_0x00ba:
            com.tencent.mm.sdk.storage.IAutoDBItem r0 = (com.tencent.p014mm.sdk.storage.IAutoDBItem) r0
            boolean r11 = r0 instanceof uy2.C52657a
            java.lang.String r1 = "<this>"
            if (r11 == 0) goto L_0x00cf
            uy2.a r0 = (uy2.C52657a) r0
            gy3.C87412m.m108594g(r0, r1)
            nz2.a$a r11 = new nz2.a$a
            java.lang.String r0 = r0.field_sessionId
            r11.<init>(r0)
            return r11
        L_0x00cf:
            boolean r11 = r0 instanceof uy2.C52660e
            if (r11 == 0) goto L_0x00e0
            uy2.e r0 = (uy2.C52660e) r0
            gy3.C87412m.m108594g(r0, r1)
            nz2.a$a r11 = new nz2.a$a
            java.lang.String r0 = r0.field_session_id
            r11.<init>(r0)
            return r11
        L_0x00e0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: az2.C39674e.mo62245Q(int):nz2.a$a");
    }

    /* renamed from: S */
    public final C48203e mo62246S() {
        return (C48203e) ((C36570n) f106455g).getValue();
    }

    /* renamed from: d */
    public final void mo62247d(Map<String, String> map) {
        C87412m.m108594g(map, "values");
        String str = map.get(".sysmsg.modtextstatus.UserName");
        String str2 = map.get(".sysmsg.modtextstatus.TextStatusID");
        String str3 = map.get(".sysmsg.modtextstatus.TextStatusExtInfo");
        String str4 = map.get(".sysmsg.modtextstatus.ProfileSeq");
        long parseLong = str4 != null ? Long.parseLong(str4) : 0;
        boolean z = true;
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                if (!(str3 == null || str3.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    C52718u uVar = new C52718u();
                    uVar.parseFrom(Base64.decode(str3, 0));
                    m42303X0(f106452d, str, str2, uVar, 4, (String) null, parseLong, 16, (Object) null);
                    return;
                }
            }
            f106452d.mo62255t0().mo72973qq(str);
        }
    }

    /* renamed from: f0 */
    public final C47313a mo62248f0() {
        Object obj;
        C13604l lVar;
        String str;
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_TEXT_STATUS_LASTTIME_NOTIFY_SHOWN_INT, (Object) null);
        Integer num = f instanceof Integer ? (Integer) f : null;
        int intValue = num != null ? num.intValue() : 0;
        C47313a aVar = new C47313a((C47313a.C47314a) null, 0, (String) null, 7, (C8480h) null);
        C39674e eVar = f106452d;
        int qq = eVar.mo62246S().mo72955qq(intValue);
        int Lo = eVar.mo62249g0().mo72956Lo(intValue);
        int Lo2 = eVar.mo62238D().mo74246Lo();
        int i = qq + Lo + Lo2;
        Log.m105924i("MicroMsg.TextStatus.TextStatusInfoManager", "handleNotify, unreadCnt:" + i + " likeUnreadCnt:" + qq + " refUnreadCnt:" + Lo + " convUnreadCnt:" + Lo2);
        aVar.f126986b = i;
        if (i > 0) {
            Cursor rawQuery = eVar.mo62246S().f129184d.rawQuery("select rowid, * from TextStatusLike order by CreateTime DESC LIMIT 1", (String[]) null);
            C87412m.m108593f(rawQuery, "db.rawQuery(sql, null)");
            C48202d dVar = new C48202d();
            if (rawQuery.moveToNext()) {
                dVar.convertFrom(rawQuery);
            }
            rawQuery.close();
            Cursor rawQuery2 = eVar.mo62249g0().f129187d.rawQuery("select rowid, * from TextStatusReference order by CreateTime DESC LIMIT 1", (String[]) null);
            C87412m.m108593f(rawQuery2, "db.rawQuery(sql, null)");
            C48204f fVar = new C48204f();
            if (rawQuery2.moveToNext()) {
                fVar.convertFrom(rawQuery2);
            }
            rawQuery2.close();
            C53658a D = eVar.mo62238D();
            D.getClass();
            C52657a aVar2 = (C52657a) C53271b.f148691B.selectAll().orderBy((List<? extends ISqlOrder>) C26236u.m33719b(C53271b.f148692C.orderDesc())).limit(1, 0).build().singleQuery(D.f150722d, C52657a.class);
            Iterator it = C64197v.m75537f(dVar, fVar, aVar2).iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    IAutoDBItem iAutoDBItem = (IAutoDBItem) obj;
                    int i2 = iAutoDBItem instanceof C48202d ? ((C48202d) iAutoDBItem).field_CreateTime : iAutoDBItem instanceof C48204f ? ((C48204f) iAutoDBItem).field_CreateTime : iAutoDBItem instanceof C52657a ? (int) (((C52657a) iAutoDBItem).field_updateTime / ((long) 1000)) : Integer.MIN_VALUE;
                    do {
                        Object next = it.next();
                        IAutoDBItem iAutoDBItem2 = (IAutoDBItem) next;
                        int i3 = iAutoDBItem2 instanceof C48202d ? ((C48202d) iAutoDBItem2).field_CreateTime : iAutoDBItem2 instanceof C48204f ? ((C48204f) iAutoDBItem2).field_CreateTime : iAutoDBItem2 instanceof C52657a ? (int) (((C52657a) iAutoDBItem2).field_updateTime / ((long) 1000)) : Integer.MIN_VALUE;
                        if (i2 < i3) {
                            obj = next;
                            i2 = i3;
                        }
                    } while (it.hasNext());
                }
            }
            IAutoDBItem iAutoDBItem3 = (IAutoDBItem) obj;
            if (iAutoDBItem3 instanceof C48202d) {
                C48202d dVar2 = (C48202d) iAutoDBItem3;
                lVar = new C13604l(((C46940b) C86312j.m106911c(C46940b.class)).mo72127jk(dVar2.field_HashUserName, 1), Integer.valueOf(dVar2.field_CreateTime));
            } else if (iAutoDBItem3 instanceof C48204f) {
                C48204f fVar2 = (C48204f) iAutoDBItem3;
                lVar = new C13604l(fVar2.field_UserName, Integer.valueOf(fVar2.field_CreateTime));
            } else if (iAutoDBItem3 instanceof C52657a) {
                C52657a aVar3 = (C52657a) iAutoDBItem3;
                lVar = new C13604l(aVar3.field_sessionId, Integer.valueOf((int) (aVar3.field_updateTime / ((long) 1000))));
            } else {
                lVar = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("lastLike:");
            sb.append(Integer.valueOf(dVar.field_CreateTime));
            sb.append(" lastRef:");
            sb.append(Integer.valueOf(fVar.field_CreateTime));
            sb.append(" + lastConv:");
            sb.append(aVar2 != null ? Long.valueOf(aVar2.field_updateTime) : null);
            sb.append(" latestUser:");
            sb.append(iAutoDBItem3);
            sb.append(' ');
            sb.append(lVar);
            Log.m105918d("MicroMsg.TextStatus.TextStatusInfoManager", sb.toString());
            if (lVar == null || (str = (String) lVar.f38555d) == null) {
                str = "";
            }
            aVar.f126987c = str;
        } else {
            aVar.f126985a = eVar.mo62245Q(intValue);
        }
        return aVar;
    }

    /* renamed from: g0 */
    public final C48205g mo62249g0() {
        return (C48205g) ((C36570n) f106456h).getValue();
    }

    /* renamed from: h1 */
    public final void mo62250h1() {
        long G = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_TEXT_STATUS_LAST_MARK_READ_TIME_LONG_SYNC, 0);
        boolean z = C16086o.f43233d > 0;
        long abs = Math.abs(System.currentTimeMillis() - G);
        SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
        if (abs > ((long) 0) && !z) {
            ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33507p(352280, true);
        }
    }

    /* renamed from: j0 */
    public final C39246d mo62251j0() {
        return (C39246d) ((C36570n) f106459n).getValue();
    }

    /* renamed from: j1 */
    public final boolean mo62252j1(Long l, int i) {
        if (l == null) {
            return false;
        }
        C48201c cVar = new C48201c();
        if (!mo62255t0().get(l.longValue(), cVar)) {
            return false;
        }
        cVar.field_state = i;
        return mo62255t0().replace(cVar);
    }

    /* renamed from: n0 */
    public final C48201c mo62253n0(String str) {
        C48212k wx02;
        if ((str == null || C112551y.m153811k(str)) || !((C87790d) C86312j.m106911c(C87790d.class)).isInstalled("xlab")) {
            return null;
        }
        if (!C72996z1.m85799F5(str)) {
            return mo62255t0().mo72970kD(str);
        }
        if ((str == null || C112551y.m153811k(str)) || (wx02 = ((C53477h) C86312j.m106911c(C53477h.class)).wx0(str)) == null) {
            return null;
        }
        C52718u l2 = wx02.mo72977l2();
        if (l2 == null) {
            l2 = new C52718u();
        }
        C48201c cVar = new C48201c();
        cVar.field_UserName = str;
        cVar.field_StatusID = wx02.field_textStatusId;
        f106452d.mo62237B(cVar, l2);
        if (C66710j.C53637a.m60171a(cVar, false, 1, (Object) null).f147089f == null || C66710j.C53637a.m60171a(cVar, false, 1, (Object) null).f147089f.isEmpty()) {
            return null;
        }
        return cVar;
    }

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        C48201c Ow;
        C48204f fVar;
        if (map != null) {
            Log.m105924i("MicroMsg.TextStatus.TextStatusInfoManager", "subtype:" + str + ", values:" + map);
            if (C77448f0.m93392d(str, false) != 2 && str != null) {
                switch (str.hashCode()) {
                    case -1813338250:
                        if (str.equals("textstatuslike")) {
                            mo62254q(map);
                            return;
                        }
                        return;
                    case -1306850335:
                        if (str.equals("modtextstatus")) {
                            mo62247d(map);
                            return;
                        }
                        return;
                    case -384935220:
                        if (str.equals("textstatusreference")) {
                            String str2 = map.get(".sysmsg.textstatusreference.UserName");
                            String str3 = map.get(".sysmsg.textstatusreference.TextStatusID");
                            String str4 = map.get(".sysmsg.textstatusreference.CreateTime");
                            int parseInt = str4 != null ? Integer.parseInt(str4) : 0;
                            String str5 = map.get(".sysmsg.textstatusreference.ReferenceCount");
                            int parseInt2 = str5 != null ? Integer.parseInt(str5) : 0;
                            String str6 = map.get(".sysmsg.textstatusreference.ShowType");
                            int parseInt3 = str6 != null ? Integer.parseInt(str6) : 0;
                            if (!(str3 == null || str3.length() == 0)) {
                                if (!(str2 == null || str2.length() == 0) && (Ow = mo62255t0().mo72963Ow(str3)) != null) {
                                    C48205g g0 = mo62249g0();
                                    g0.getClass();
                                    C87412m.m108594g(str2, "userName");
                                    Cursor rawQuery = g0.f129187d.rawQuery("select rowid, * from TextStatusReference where TextStatusId = ? and UserName = ? ", new String[]{Util.escapeSqlValue(str3), Util.escapeSqlValue(str2)});
                                    C87412m.m108593f(rawQuery, "db.rawQuery(sql, arrayOf…scapeSqlValue(userName)))");
                                    if (rawQuery.moveToFirst()) {
                                        fVar = new C48204f();
                                        fVar.convertFrom(rawQuery);
                                    } else {
                                        fVar = null;
                                    }
                                    rawQuery.close();
                                    if (fVar == null) {
                                        fVar = new C48204f();
                                    }
                                    fVar.field_UserName = str2;
                                    fVar.field_TextStatusId = str3;
                                    fVar.field_CreateTime = parseInt;
                                    fVar.field_ShowType = parseInt3;
                                    fVar.field_thumbUrl = Ow.field_MediaThumbUrl;
                                    fVar.field_TopicInfo = Ow.field_TopicInfo;
                                    fVar.field_Description = Ow.field_Description;
                                    if (((int) fVar.systemRowid) == -1) {
                                        mo62249g0().insert(fVar);
                                    } else {
                                        mo62249g0().update(fVar, new String[0]);
                                    }
                                    mo62250h1();
                                    C48201c Ow2 = mo62255t0().mo72963Ow(str3);
                                    if (Ow2 != null) {
                                        Ow2.field_referenceCount = parseInt2;
                                        f106452d.mo62255t0().replace(Ow2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case 1048566785:
                        if (str.equals("textstatusiconconfigrefresh")) {
                            IStatusIconHelperKt.m39109a().mo62284N(2);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C10698i) {
            new HashMap();
            ((C10698i) yVar).getClass();
            throw null;
        }
    }

    /* renamed from: q */
    public final void mo62254q(Map<String, String> map) {
        Map<String, String> map2 = map;
        C87412m.m108594g(map2, "values");
        String str = map2.get(".sysmsg.textstatuslike.HashUserName");
        String str2 = map2.get(".sysmsg.textstatuslike.TextStatusID");
        String str3 = map2.get(".sysmsg.textstatuslike.Version");
        int parseInt = str3 != null ? Integer.parseInt(str3) : 0;
        String str4 = map2.get(".sysmsg.textstatuslike.LikeCountVersion");
        int parseInt2 = str4 != null ? Integer.parseInt(str4) : 0;
        Log.m105925i("MicroMsg.TextStatus.TextStatusInfoManager", "onNewXmlReceived:textStatusId:%s version:%s likeCountVersion:%s", Integer.valueOf(parseInt), Integer.valueOf(parseInt2), str2);
        if (!(str2 == null || str2.length() == 0)) {
            if (!(str == null || str.length() == 0)) {
                String str5 = map2.get(".sysmsg.textstatuslike.DeleteFlag");
                int parseInt3 = str5 != null ? Integer.parseInt(str5) : 0;
                C48202d Lo = mo62246S().mo72950Lo(str2, str);
                C48206h t0 = mo62255t0();
                t0.getClass();
                C48201c Ow = t0.mo72963Ow(str2);
                if (parseInt3 != 1 || Lo == null) {
                    if (parseInt3 != 1) {
                        if (Lo == null) {
                            Lo = new C48202d();
                        }
                        Lo.field_HashUserName = str;
                        Lo.field_TextStatusId = str2;
                        String str6 = map2.get(".sysmsg.textstatuslike.Type");
                        Lo.field_Type = str6 != null ? Integer.parseInt(str6) : 0;
                        String str7 = map2.get(".sysmsg.textstatuslike.Notify");
                        Lo.field_Notify = str7 != null ? Integer.parseInt(str7) : 0;
                        String str8 = map2.get(".sysmsg.textstatuslike.CreateTime");
                        Lo.field_CreateTime = str8 != null ? Integer.parseInt(str8) : 0;
                        Lo.field_DisplayName = map2.get(".sysmsg.textstatuslike.NickName");
                        Lo.field_HeadImgUrl = map2.get(".sysmsg.textstatuslike.HeadImgUrl");
                        Lo.field_Description = Ow.field_Description;
                        Lo.field_thumbUrl = Ow.field_MediaThumbUrl;
                        Lo.field_TopicInfo = Ow.field_TopicInfo;
                        if (((int) Lo.systemRowid) == -1) {
                            C39674e eVar = f106452d;
                            eVar.mo62246S().insert(Lo);
                            if (Lo.field_Notify == 1) {
                                eVar.mo62250h1();
                            }
                        } else if (parseInt == 0 || parseInt > Lo.field_Version) {
                            Lo.field_Version = parseInt;
                            C39674e eVar2 = f106452d;
                            eVar2.mo62246S().update(Lo, new String[0]);
                            if (Lo.field_Notify == 1) {
                                eVar2.mo62250h1();
                            }
                        } else {
                            Log.m105929w("MicroMsg.TextStatus.TextStatusInfoManager", "onNewXmlReceived: likeMsg update. version:%s field_Version:%s", Integer.valueOf(parseInt), Integer.valueOf(Lo.field_Version));
                        }
                        C78501d.m94805g(C78501d.f229945a, ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33503l(352280) ? 5 : 6, (String) null, (String) null, 0, (String) null, 0, 62, (Object) null);
                    }
                } else if (parseInt == 0 || parseInt > Lo.field_Version) {
                    Lo.field_Version = parseInt;
                    mo62246S().delete(Lo, new String[0]);
                } else {
                    Log.m105929w("MicroMsg.TextStatus.TextStatusInfoManager", "onNewXmlReceived: likeMsg delete. version:%s field_Version:%s", Integer.valueOf(parseInt), Integer.valueOf(Lo.field_Version));
                }
                if (parseInt2 == 0 || parseInt2 > Ow.field_LikeCountVersion) {
                    Ow.field_LikeCount = Util.getInt(map2.get(".sysmsg.textstatuslike.LikeCount"), 0);
                    Ow.field_LikeCountVersion = parseInt2;
                    f106452d.mo62255t0().mo72961LL(Ow);
                }
            }
        }
    }

    /* renamed from: t0 */
    public final C48206h mo62255t0() {
        return (C48206h) ((C36570n) f106454f).getValue();
    }
}
