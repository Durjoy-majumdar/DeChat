package mh0;

import android.os.SystemClock;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.pluginsdk.model.app.C96776s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.sql.DeleteSql;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import i40.C60247c;
import i40.C98597b;
import i40.C98598e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import nh0.C100114a;
import ob0.C89132b;
import p1083jg.C98941c;
import p158gt.C98201k;
import p434ig.C98671a;
import p434ig.C98672d;
import p434ig.C98674g;
import p548hg.C76165c;
import p606mm.C99933h;
import p682rz.C101480j;
import p749xh.C102653l;
import p753xp.C102704b;
import p763ym.C53543s;
import p867wp.C102479b;
import ph0.C100792a;
import qh0.C62619a;
import rh0.C101376a;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C64596nz3;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: mh0.i */
public final class C99879i extends C86301e implements C76165c {

    /* renamed from: d */
    public boolean f292656d;

    /* renamed from: e */
    public int f292657e = -1;

    /* renamed from: f */
    public final HashMap<Long, C99880a> f292658f = new HashMap<>();

    /* renamed from: g */
    public final LinkedList<C72963f4> f292659g = new LinkedList<>();

    /* renamed from: h */
    public int f292660h = 7;

    /* renamed from: i */
    public final C99872f f292661i = new C99872f();

    /* renamed from: j */
    public final IStorageObserver<C102653l> f292662j;

    /* renamed from: mh0.i$a */
    public static final class C99880a {

        /* renamed from: a */
        public long f292663a = SystemClock.elapsedRealtime();

        /* renamed from: b */
        public int f292664b = 3;
    }

    /* renamed from: mh0.i$b */
    public final class C99881b implements Runnable {

        /* renamed from: d */
        public final C72963f4 f292665d;

        /* renamed from: e */
        public final /* synthetic */ C99879i f292666e;

        public C99881b(C99879i iVar, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "info");
            this.f292666e = iVar;
            this.f292665d = f4Var;
        }

        /* renamed from: c */
        public static C13604l m130442c(C99881b bVar, C98674g gVar, C99862a aVar, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2, boolean z3, int i, Object obj) {
            boolean z4 = (i & 64) != 0 ? true : z3;
            bVar.getClass();
            List<C98672d> A = gVar.mo55348A();
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = A.iterator();
            while (true) {
                boolean z5 = false;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C98672d) next).mo55274P() == 2) {
                    z5 = true;
                }
                if (z5) {
                    arrayList3.add(next);
                }
            }
            Iterator it4 = arrayList3.iterator();
            boolean z6 = false;
            boolean z7 = false;
            while (it4.hasNext()) {
                C13604l<Boolean, Boolean> d = bVar.mo139233d((C98672d) it4.next(), aVar, arrayList, arrayList2, z, z2, z4);
                z6 |= ((Boolean) d.f38555d).booleanValue();
                z7 |= ((Boolean) d.f38556e).booleanValue();
            }
            List<C98672d> A2 = gVar.mo55348A();
            ArrayList arrayList4 = new ArrayList();
            for (T next2 : A2) {
                if (((C98672d) next2).mo55274P() == 4) {
                    arrayList4.add(next2);
                }
            }
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                C13604l<Boolean, Boolean> e = bVar.mo139234e((C98672d) it5.next(), aVar, arrayList, arrayList2, z, z4);
                z6 |= ((Boolean) e.f38555d).booleanValue();
                z7 |= ((Boolean) e.f38556e).booleanValue();
            }
            return new C13604l(Boolean.valueOf(z6), Boolean.valueOf(z7));
        }

        /* renamed from: a */
        public final void mo139231a(boolean z, boolean z2, boolean z3, C98671a aVar, C98674g gVar, C99862a aVar2) {
            C87412m.m108594g(aVar, "albumAppMsg");
            C87412m.m108594g(gVar, "albumInfoItem");
            if (z) {
                Log.m105924i("MicroMsg.AlbumMsgSendService", "update album info, something changed, msgid " + this.f292665d.getMsgId() + ", type " + this.f292665d.getType());
                aVar.mo55243V(gVar.mo141118z());
                this.f292665d.mo108732L2(aVar.mo141118z());
                C98597b.C60245a aVar3 = C98597b.f289091e;
                C7335d c = C86312j.m106911c(C99864d.class);
                C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
                ((C99865e0) aVar3.mo85231a((C98598e) c, C99865e0.class)).mo139218j3(aVar2, this.f292665d, true);
                ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(this.f292665d.getMsgId(), this.f292665d);
            }
            if (!z2 && !z3) {
                Log.m105924i("MicroMsg.AlbumMsgSendService", "doSendContinue without cdn task");
                this.f292666e.wx0(this.f292665d, aVar, gVar, aVar2, false);
                this.f292666e.mo106377PI((C72963f4) null);
            }
            this.f292666e.f292661i.mo140623f();
            this.f292666e.f292656d = false;
        }

        /* renamed from: b */
        public final void mo139232b(String str, String str2) {
            C87412m.m108594g(str, "path");
            C102479b as = ((C102704b) C86312j.m106911c(C102704b.class)).mo138751as(str, 9999, str2, (byte[]) null);
            Log.m105925i("MicroMsg.AlbumMsgSendService", "AlbumCheckDup :%s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", str, Integer.valueOf(as.f301760a), Boolean.valueOf(as.f301761b), Boolean.FALSE, Boolean.valueOf(as.f301762c), Long.valueOf(as.f301763d));
        }

        /* JADX WARNING: Removed duplicated region for block: B:241:0x076e  */
        /* JADX WARNING: Removed duplicated region for block: B:243:0x07a2  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01e8  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x01ea  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0209  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x020f  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0219  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final rx3.C13604l<java.lang.Boolean, java.lang.Boolean> mo139233d(p434ig.C98672d r28, mh0.C99862a r29, java.util.ArrayList<com.tencent.mars.cdn.CdnLogic.CheckHitFileInfo> r30, java.util.ArrayList<p434ig.C98672d> r31, boolean r32, boolean r33, boolean r34) {
            /*
                r27 = this;
                r0 = r27
                r1 = r28
                r2 = r30
                r3 = r31
                java.lang.Class<nh0.a> r4 = nh0.C100114a.class
                java.lang.String r5 = r28.mo55264K()
                r6 = r29
                mh0.q r5 = r6.mo139216A(r5)
                if (r5 == 0) goto L_0x001b
                java.lang.String r7 = r5.mo55384I()
                goto L_0x001c
            L_0x001b:
                r7 = 0
            L_0x001c:
                java.lang.String r8 = r28.mo55250D()
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                r9 = 0
                r10 = 1
                if (r8 != 0) goto L_0x0032
                java.lang.String r8 = r28.mo55302d0()
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r8 == 0) goto L_0x0038
            L_0x0032:
                boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
                if (r8 == 0) goto L_0x003a
            L_0x0038:
                r14 = 1
                goto L_0x003b
            L_0x003a:
                r14 = 0
            L_0x003b:
                java.lang.String r8 = ""
                r15 = 4
                java.lang.String r6 = "MicroMsg.AlbumMsgSendService"
                if (r33 != 0) goto L_0x0316
                ph0.a r2 = ph0.C100792a.f295260a
                java.lang.String r3 = r28.mo55264K()
                com.tencent.mm.storage.f4 r11 = r0.f292665d
                long r12 = r11.getMsgId()
                java.lang.String r3 = r2.mo140242n(r3, r12, r9)
                com.tencent.mm.sdk.storage.sql.SelectSql r11 = p749xh.C102653l.m135584F2(r3)
                rh0.a$a r12 = rh0.C101376a.f296957i
                rh0.a r13 = r12.mo140861a()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r13 = r13.getDB()
                com.tencent.mm.sdk.storage.IAutoDBItem r4 = r11.singleQuery(r13, r4)
                nh0.a r4 = (nh0.C100114a) r4
                if (r4 != 0) goto L_0x02fb
                if (r14 == 0) goto L_0x00d7
                com.tencent.mm.storage.f4 r4 = r0.f292665d
                java.lang.String r4 = r2.mo140238j(r1, r4)
                long r20 = com.tencent.p014mm.vfs.C86013q1.m106443d(r7, r4, r10)
                r18 = 0
                int r11 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
                if (r11 <= 0) goto L_0x007c
                r11 = 1
                goto L_0x007d
            L_0x007c:
                r11 = 0
            L_0x007d:
                java.lang.Object[] r13 = new java.lang.Object[r15]
                java.lang.String r20 = r28.mo55250D()
                r13[r9] = r20
                r13[r10] = r7
                r7 = 2
                r13[r7] = r4
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r11)
                r11 = 3
                r13[r11] = r7
                java.lang.String r7 = "[checkUseCgi]send album origin img CdnDataUrl[%s] copy[%s] to [%s] result[%B]"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r13)
                java.lang.String r7 = r28.mo55286V()
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 == 0) goto L_0x00ac
                java.lang.String r7 = "[checkUseCgi]send album not find full md5, try to calculate"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                java.lang.String r7 = com.tencent.p014mm.vfs.C86013q1.m106456q(r4)
                r1.mo55287V0(r7)
            L_0x00ac:
                java.lang.String r7 = r28.mo55288W()
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 == 0) goto L_0x00d0
                java.lang.String r7 = "[checkUseCgi]send album origin img not find head 256 md5, try to calculate"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                r7 = 256(0x100, float:3.59E-43)
                byte[] r11 = com.tencent.p014mm.vfs.C86013q1.m106433O(r4, r9, r7)
                if (r11 != 0) goto L_0x00c5
                r7 = 0
                goto L_0x00c9
            L_0x00c5:
                java.lang.String r7 = p823sg.C90193h.m112878f(r11)
            L_0x00c9:
                if (r7 != 0) goto L_0x00cc
                goto L_0x00cd
            L_0x00cc:
                r8 = r7
            L_0x00cd:
                r1.mo55289W0(r8)
            L_0x00d0:
                java.lang.String r7 = r28.mo55286V()
                r0.mo139232b(r4, r7)
            L_0x00d7:
                if (r5 == 0) goto L_0x00de
                java.lang.String r4 = r5.mo55382G()
                goto L_0x00df
            L_0x00de:
                r4 = 0
            L_0x00df:
                if (r5 == 0) goto L_0x00e6
                java.lang.String r7 = r5.mo55385J()
                goto L_0x00e7
            L_0x00e6:
                r7 = 0
            L_0x00e7:
                java.lang.String r8 = "[checkUseCgi]copy img mid[%s] to [%s] result[%B]"
                if (r14 == 0) goto L_0x0157
                java.lang.String r11 = r28.mo55302d0()
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
                if (r11 == 0) goto L_0x00fb
                boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
                if (r11 == 0) goto L_0x0157
            L_0x00fb:
                com.tencent.mm.storage.f4 r11 = r0.f292665d
                java.lang.String r11 = r2.mo140245q(r1, r11)
                long r20 = com.tencent.p014mm.vfs.C86013q1.m106443d(r4, r11, r10)
                r18 = 0
                int r13 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
                if (r13 <= 0) goto L_0x010d
                r13 = 1
                goto L_0x010e
            L_0x010d:
                r13 = 0
            L_0x010e:
                long r9 = com.tencent.p014mm.vfs.C86013q1.m106451l(r11)
                int r20 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
                if (r20 == 0) goto L_0x0119
                r1.mo55301c1(r9)
            L_0x0119:
                if (r5 != 0) goto L_0x011c
                goto L_0x0124
            L_0x011c:
                long r9 = r28.mo55300c0()
                int r10 = (int) r9
                r5.mo55399X(r10)
            L_0x0124:
                r9 = 3
                java.lang.Object[] r10 = new java.lang.Object[r9]
                r9 = 0
                r10[r9] = r4
                r4 = 1
                r10[r4] = r11
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r13)
                r9 = 2
                r10[r9] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r8, r10)
                if (r13 == 0) goto L_0x014f
                java.lang.String r4 = r28.mo55298b0()
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 == 0) goto L_0x014f
                java.lang.String r4 = "[checkUseCgi]not find MidMd5 md5, try to calculate"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
                java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106456q(r11)
                r1.mo55299b1(r4)
            L_0x014f:
                java.lang.String r4 = r28.mo55298b0()
                r0.mo139232b(r11, r4)
                goto L_0x0168
            L_0x0157:
                java.lang.String r9 = r28.mo55250D()
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 == 0) goto L_0x016b
                boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
                if (r9 == 0) goto L_0x0168
                goto L_0x016b
            L_0x0168:
                r26 = r14
                goto L_0x01c7
            L_0x016b:
                com.tencent.mm.storage.f4 r9 = r0.f292665d
                java.lang.String r9 = r2.mo140238j(r1, r9)
                r10 = 1
                long r20 = com.tencent.p014mm.vfs.C86013q1.m106443d(r4, r9, r10)
                r10 = 0
                int r13 = (r20 > r10 ? 1 : (r20 == r10 ? 0 : -1))
                r26 = r14
                if (r13 <= 0) goto L_0x0180
                r13 = 1
                goto L_0x0181
            L_0x0180:
                r13 = 0
            L_0x0181:
                long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
                int r20 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r20 == 0) goto L_0x018c
                r1.mo55269M0(r14)
            L_0x018c:
                if (r5 != 0) goto L_0x018f
                goto L_0x0197
            L_0x018f:
                long r10 = r28.mo55268M()
                int r11 = (int) r10
                r5.mo55399X(r11)
            L_0x0197:
                r10 = 3
                java.lang.Object[] r11 = new java.lang.Object[r10]
                r10 = 0
                r11[r10] = r4
                r4 = 1
                r11[r4] = r9
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r13)
                r10 = 2
                r11[r10] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r8, r11)
                java.lang.String r4 = r28.mo55286V()
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 == 0) goto L_0x01c0
                java.lang.String r4 = "[checkUseCgi]not find img MidMd5 md5, try to calculate"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
                java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106456q(r9)
                r1.mo55287V0(r4)
            L_0x01c0:
                java.lang.String r4 = r28.mo55286V()
                r0.mo139232b(r9, r4)
            L_0x01c7:
                java.lang.String r4 = r28.mo55256G()
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 == 0) goto L_0x01d7
                boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
                if (r4 == 0) goto L_0x024f
            L_0x01d7:
                com.tencent.mm.storage.f4 r4 = r0.f292665d
                java.lang.String r4 = r2.mo140250v(r1, r4)
                r8 = 1
                long r9 = com.tencent.p014mm.vfs.C86013q1.m106443d(r7, r4, r8)
                r13 = 0
                int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                if (r11 <= 0) goto L_0x01ea
                r9 = 1
                goto L_0x01eb
            L_0x01ea:
                r9 = 0
            L_0x01eb:
                r10 = 3
                java.lang.Object[] r11 = new java.lang.Object[r10]
                r10 = 0
                r11[r10] = r7
                r11[r8] = r4
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r9)
                r8 = 2
                r11[r8] = r7
                java.lang.String r7 = "[checkUseCgi]copy img thumb[%s] to [%s] result[%B]"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r11)
                long r7 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
                r10 = 0
                int r13 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
                if (r13 == 0) goto L_0x020c
                r1.mo55345y1(r7)
            L_0x020c:
                if (r5 != 0) goto L_0x020f
                goto L_0x0217
            L_0x020f:
                long r7 = r28.mo55344y0()
                int r8 = (int) r7
                r5.mo55408g0(r8)
            L_0x0217:
                if (r9 == 0) goto L_0x0248
                java.lang.String r5 = r28.mo55338v0()
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 == 0) goto L_0x022f
                java.lang.String r5 = "[checkUseCgi]not find img ThumbMd5 md5, try to calculate"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106456q(r4)
                r1.mo55339v1(r5)
            L_0x022f:
                java.lang.String r5 = r28.mo55340w0()
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 == 0) goto L_0x0248
                java.lang.String r5 = "[checkUseCgi]not find img Thumb Head 256 Md5, try to calculate"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                r5 = 256(0x100, float:3.59E-43)
                r7 = 0
                java.lang.String r5 = p823sg.C90193h.m112877e(r4, r7, r5)
                r1.mo55341w1(r5)
            L_0x0248:
                java.lang.String r5 = r28.mo55338v0()
                r0.mo139232b(r4, r5)
            L_0x024f:
                nh0.a r4 = new nh0.a
                r4.<init>()
                java.lang.String r5 = r28.mo55248C()
                r4.mo142346H2(r5)
                java.lang.String r5 = r28.mo55250D()
                r4.mo142364a1(r5)
                java.lang.String r5 = r28.mo55264K()
                r4.mo142348J2(r5)
                r4.mo142358T2(r3)
                long r7 = r28.mo55268M()
                int r5 = (int) r7
                r4.mo142363Y2(r5)
                java.lang.String r5 = r4.mo142384y2()
                int r5 = r5.hashCode()
                r4.mo142357S2(r5)
                r5 = 2
                r4.setType(r5)
                int r19 = r28.mo55274P()
                long r7 = r28.mo55268M()
                int r1 = (int) r7
                r21 = 0
                r22 = 0
                r23 = 12
                r24 = 0
                r18 = r2
                r20 = r1
                int r1 = ph0.C100792a.m131981h(r18, r19, r20, r21, r22, r23, r24)
                r4.mo142353O2(r1)
                com.tencent.mm.storage.f4 r1 = r0.f292665d
                long r1 = r1.getMsgId()
                r4.mo142359U2(r1)
                com.tencent.mm.storage.f4 r1 = r0.f292665d
                java.lang.String r1 = r1.mo100965E2()
                r4.mo142362X2(r1)
                r1 = 1
                r4.mo142356R2(r1)
                r4.mo142354P2(r1)
                r9 = r26
                r4.mo142355Q2(r9)
                r4.mo142347I2(r1)
                r2 = 0
                r4.mo142365d(r2)
                com.tencent.mm.sdk.storage.executor.InsertExecutor r5 = p749xh.C102653l.m135582D2(r4, r1)
                rh0.a r7 = r12.mo140861a()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = r7.getDB()
                long r7 = r5.execute(r7)
                r5 = 4
                java.lang.Object[] r5 = new java.lang.Object[r5]
                int r9 = r4.mo142383x2()
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r5[r2] = r9
                java.lang.Long r2 = java.lang.Long.valueOf(r7)
                r5[r1] = r2
                int r1 = r4.mo142378t2()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 2
                r5[r2] = r1
                r1 = 3
                r5[r1] = r3
                java.lang.String r1 = "[checkUseCgi]send album img insert localId[%d] result[%B] fileType[%d], mediaId[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r5)
                goto L_0x030e
            L_0x02fb:
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                int r2 = r4.getStatus()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 0
                r1[r3] = r2
                java.lang.String r2 = "[checkUseCgi]hasInsertCdn, cdnInfo status:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r1)
            L_0x030e:
                rx3.l r1 = new rx3.l
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r1.<init>(r2, r2)
                return r1
            L_0x0316:
                r9 = r14
                if (r9 == 0) goto L_0x03b0
                if (r34 != 0) goto L_0x031d
                goto L_0x03b0
            L_0x031d:
                ph0.a r10 = ph0.C100792a.f295260a
                com.tencent.mm.storage.f4 r11 = r0.f292665d
                java.lang.String r10 = r10.mo140238j(r1, r11)
                r11 = 1
                long r12 = com.tencent.p014mm.vfs.C86013q1.m106443d(r7, r10, r11)
                r14 = 0
                int r20 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r20 <= 0) goto L_0x0332
                r12 = 1
                goto L_0x0333
            L_0x0332:
                r12 = 0
            L_0x0333:
                r13 = 4
                java.lang.Object[] r14 = new java.lang.Object[r13]
                java.lang.String r13 = r28.mo55250D()
                r15 = 0
                r14[r15] = r13
                r14[r11] = r7
                r7 = 2
                r14[r7] = r10
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r12)
                r11 = 3
                r14[r11] = r7
                java.lang.String r7 = "send album origin img CdnDataUrl[%s] copy[%s] to [%s] result[%B]"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r14)
                java.lang.String r7 = r28.mo55286V()
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 == 0) goto L_0x0368
                java.lang.String r7 = "send album not find full md5, try to calculate"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                java.lang.String r7 = com.tencent.p014mm.vfs.C86013q1.m106456q(r10)
                r1.mo55287V0(r7)
                r7 = 1
                goto L_0x0369
            L_0x0368:
                r7 = 0
            L_0x0369:
                java.lang.String r11 = r28.mo55288W()
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
                if (r11 == 0) goto L_0x0390
                java.lang.String r7 = "send album origin img not find head 256 md5, try to calculate"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                r7 = 256(0x100, float:3.59E-43)
                r11 = 0
                byte[] r12 = com.tencent.p014mm.vfs.C86013q1.m106433O(r10, r11, r7)
                if (r12 != 0) goto L_0x0384
                r7 = 0
                goto L_0x0388
            L_0x0384:
                java.lang.String r7 = p823sg.C90193h.m112878f(r12)
            L_0x0388:
                if (r7 != 0) goto L_0x038b
                goto L_0x038c
            L_0x038b:
                r8 = r7
            L_0x038c:
                r1.mo55289W0(r8)
                r7 = 1
            L_0x0390:
                long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r10)
                r13 = 0
                int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r8 == 0) goto L_0x03a8
                r1.mo55269M0(r11)
                if (r5 != 0) goto L_0x03a0
                goto L_0x03a8
            L_0x03a0:
                long r11 = r28.mo55268M()
                int r8 = (int) r11
                r5.mo55404c0(r8)
            L_0x03a8:
                java.lang.String r8 = r28.mo55286V()
                r0.mo139232b(r10, r8)
                goto L_0x03b1
            L_0x03b0:
                r7 = 0
            L_0x03b1:
                if (r5 == 0) goto L_0x03b8
                java.lang.String r8 = r5.mo55385J()
                goto L_0x03b9
            L_0x03b8:
                r8 = 0
            L_0x03b9:
                java.lang.String r10 = r28.mo55256G()
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                if (r10 == 0) goto L_0x03c9
                boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
                if (r10 == 0) goto L_0x0451
            L_0x03c9:
                if (r34 != 0) goto L_0x03ce
                r8 = 0
                goto L_0x0450
            L_0x03ce:
                ph0.a r10 = ph0.C100792a.f295260a
                com.tencent.mm.storage.f4 r11 = r0.f292665d
                java.lang.String r10 = r10.mo140250v(r1, r11)
                r11 = 1
                long r12 = com.tencent.p014mm.vfs.C86013q1.m106443d(r8, r10, r11)
                r14 = 0
                int r20 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r20 <= 0) goto L_0x03e3
                r12 = 1
                goto L_0x03e4
            L_0x03e3:
                r12 = 0
            L_0x03e4:
                r13 = 3
                java.lang.Object[] r14 = new java.lang.Object[r13]
                r13 = 0
                r14[r13] = r8
                r14[r11] = r10
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r12)
                r11 = 2
                r14[r11] = r8
                java.lang.String r8 = "copy img thumb[%s] to [%s] result[%B]"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r8, r14)
                long r13 = com.tencent.p014mm.vfs.C86013q1.m106451l(r10)
                r18 = 0
                int r8 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
                if (r8 == 0) goto L_0x0405
                r1.mo55345y1(r13)
            L_0x0405:
                if (r5 != 0) goto L_0x0408
                goto L_0x0410
            L_0x0408:
                long r13 = r28.mo55344y0()
                int r8 = (int) r13
                r5.mo55408g0(r8)
            L_0x0410:
                if (r12 == 0) goto L_0x0448
                java.lang.String r8 = r28.mo55338v0()
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r8 == 0) goto L_0x042b
                java.lang.String r8 = "not find img ThumbMd5 md5, try to calculate"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
                java.lang.String r8 = com.tencent.p014mm.vfs.C86013q1.m106456q(r10)
                r1.mo55339v1(r8)
                r8 = 1
                goto L_0x042c
            L_0x042b:
                r8 = 0
            L_0x042c:
                java.lang.String r11 = r28.mo55340w0()
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
                if (r11 == 0) goto L_0x0449
                java.lang.String r8 = "not find img Thumb Head 256 Md5, try to calculate"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
                r8 = 256(0x100, float:3.59E-43)
                r11 = 0
                java.lang.String r8 = p823sg.C90193h.m112877e(r10, r11, r8)
                r1.mo55341w1(r8)
                r8 = 1
                goto L_0x0449
            L_0x0448:
                r8 = 0
            L_0x0449:
                java.lang.String r11 = r28.mo55338v0()
                r0.mo139232b(r10, r11)
            L_0x0450:
                r7 = r7 | r8
            L_0x0451:
                if (r5 == 0) goto L_0x0458
                java.lang.String r8 = r5.mo55382G()
                goto L_0x0459
            L_0x0458:
                r8 = 0
            L_0x0459:
                r10 = -1
                java.lang.String r11 = "copy img mid[%s] to [%s] result[%B]"
                if (r9 == 0) goto L_0x05e3
                java.lang.String r12 = r28.mo55302d0()
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                if (r12 == 0) goto L_0x046e
                boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
                if (r12 == 0) goto L_0x05e3
            L_0x046e:
                if (r34 != 0) goto L_0x0472
                r5 = 0
                goto L_0x04d4
            L_0x0472:
                ph0.a r12 = ph0.C100792a.f295260a
                com.tencent.mm.storage.f4 r13 = r0.f292665d
                java.lang.String r12 = r12.mo140245q(r1, r13)
                r13 = 1
                long r14 = com.tencent.p014mm.vfs.C86013q1.m106443d(r8, r12, r13)
                r18 = 0
                int r13 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
                if (r13 <= 0) goto L_0x0487
                r13 = 1
                goto L_0x0488
            L_0x0487:
                r13 = 0
            L_0x0488:
                long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
                int r16 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
                if (r16 == 0) goto L_0x0493
                r1.mo55301c1(r14)
            L_0x0493:
                if (r5 != 0) goto L_0x0496
                goto L_0x049e
            L_0x0496:
                long r14 = r28.mo55300c0()
                int r15 = (int) r14
                r5.mo55399X(r15)
            L_0x049e:
                r5 = 3
                java.lang.Object[] r14 = new java.lang.Object[r5]
                r5 = 0
                r14[r5] = r8
                r5 = 1
                r14[r5] = r12
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r13)
                r8 = 2
                r14[r8] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r11, r14)
                if (r13 == 0) goto L_0x04cc
                java.lang.String r5 = r28.mo55298b0()
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 == 0) goto L_0x04cc
                java.lang.String r5 = "not find MidMd5 md5, try to calculate"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106456q(r12)
                r1.mo55299b1(r5)
                r5 = 1
                goto L_0x04cd
            L_0x04cc:
                r5 = 0
            L_0x04cd:
                java.lang.String r8 = r28.mo55298b0()
                r0.mo139232b(r12, r8)
            L_0x04d4:
                r7 = r7 | r5
                if (r32 == 0) goto L_0x04d9
                goto L_0x05f4
            L_0x04d9:
                ph0.a r5 = ph0.C100792a.f295260a
                com.tencent.mm.storage.f4 r8 = r0.f292665d
                java.lang.String r8 = r5.mo140238j(r1, r8)
                java.lang.String r11 = r28.mo55264K()
                com.tencent.mm.storage.f4 r12 = r0.f292665d
                long r12 = r12.getMsgId()
                r14 = 0
                java.lang.String r11 = r5.mo140242n(r11, r12, r14)
                com.tencent.mm.sdk.storage.sql.SelectSql r12 = p749xh.C102653l.m135584F2(r11)
                rh0.a$a r13 = rh0.C101376a.f296957i
                rh0.a r14 = r13.mo140861a()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r14 = r14.getDB()
                com.tencent.mm.sdk.storage.IAutoDBItem r4 = r12.singleQuery(r14, r4)
                nh0.a r4 = (nh0.C100114a) r4
                if (r4 != 0) goto L_0x05b1
                nh0.a r4 = new nh0.a
                r4.<init>()
                java.lang.String r10 = r28.mo55248C()
                r4.mo142346H2(r10)
                java.lang.String r10 = r28.mo55250D()
                r4.mo142364a1(r10)
                java.lang.String r10 = r28.mo55264K()
                r4.mo142348J2(r10)
                r4.mo142358T2(r11)
                long r14 = r28.mo55268M()
                int r10 = (int) r14
                r4.mo142363Y2(r10)
                java.lang.String r10 = r4.mo142384y2()
                int r10 = r10.hashCode()
                r4.mo142357S2(r10)
                r4.mo142361W2(r8)
                r8 = 2
                r4.setType(r8)
                int r19 = r28.mo55274P()
                long r14 = r28.mo55268M()
                int r8 = (int) r14
                r21 = 0
                r22 = 0
                r23 = 12
                r24 = 0
                r18 = r5
                r20 = r8
                int r5 = ph0.C100792a.m131981h(r18, r19, r20, r21, r22, r23, r24)
                r4.mo142353O2(r5)
                com.tencent.mm.storage.f4 r5 = r0.f292665d
                long r14 = r5.getMsgId()
                r4.mo142359U2(r14)
                com.tencent.mm.storage.f4 r5 = r0.f292665d
                java.lang.String r5 = r5.mo100965E2()
                r4.mo142362X2(r5)
                r5 = 0
                r4.mo142356R2(r5)
                r8 = 1
                r4.mo142355Q2(r8)
                r4.mo142354P2(r8)
                r4.mo142365d(r5)
                com.tencent.mm.sdk.storage.executor.InsertExecutor r10 = p749xh.C102653l.m135582D2(r4, r8)
                rh0.a r12 = r13.mo140861a()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r12 = r12.getDB()
                long r12 = r10.execute(r12)
                r10 = 4
                java.lang.Object[] r10 = new java.lang.Object[r10]
                int r14 = r4.mo142383x2()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r10[r5] = r14
                java.lang.Long r5 = java.lang.Long.valueOf(r12)
                r10[r8] = r5
                int r4 = r4.mo142378t2()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 2
                r10[r5] = r4
                r8 = 3
                r10[r8] = r11
                java.lang.String r4 = "send album origin img insert localId[%d] result[%B] fileType[%d], mediaId[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r10)
                goto L_0x05df
            L_0x05b1:
                r5 = 2
                r8 = 3
                int r11 = r4.getStatus()
                if (r11 == r5) goto L_0x05f4
                int r5 = r4.getStatus()
                if (r5 == r8) goto L_0x05f4
                int r5 = r4.getStatus()
                r8 = 4
                if (r5 == r8) goto L_0x05f4
                int r5 = r4.getStatus()
                if (r5 == r10) goto L_0x05f4
                r5 = 1
                java.lang.Object[] r8 = new java.lang.Object[r5]
                int r4 = r4.getStatus()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 0
                r8[r5] = r4
                java.lang.String r4 = "hasInsertCdn, origin img cdnInfo status:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r8)
            L_0x05df:
                r25 = 1
                goto L_0x076c
            L_0x05e3:
                java.lang.String r12 = r28.mo55250D()
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                if (r12 == 0) goto L_0x05f8
                boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
                if (r12 == 0) goto L_0x05f4
                goto L_0x05f8
            L_0x05f4:
                r25 = 0
                goto L_0x076c
            L_0x05f8:
                if (r34 != 0) goto L_0x05fc
                r5 = 0
                goto L_0x065c
            L_0x05fc:
                ph0.a r12 = ph0.C100792a.f295260a
                com.tencent.mm.storage.f4 r13 = r0.f292665d
                java.lang.String r12 = r12.mo140238j(r1, r13)
                r13 = 1
                long r14 = com.tencent.p014mm.vfs.C86013q1.m106443d(r8, r12, r13)
                r18 = 0
                int r13 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
                if (r13 <= 0) goto L_0x0611
                r13 = 1
                goto L_0x0612
            L_0x0611:
                r13 = 0
            L_0x0612:
                long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
                int r16 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
                if (r16 == 0) goto L_0x061d
                r1.mo55269M0(r14)
            L_0x061d:
                if (r5 != 0) goto L_0x0620
                goto L_0x0628
            L_0x0620:
                long r14 = r28.mo55268M()
                int r15 = (int) r14
                r5.mo55399X(r15)
            L_0x0628:
                r5 = 3
                java.lang.Object[] r14 = new java.lang.Object[r5]
                r5 = 0
                r14[r5] = r8
                r5 = 1
                r14[r5] = r12
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r13)
                r8 = 2
                r14[r8] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r11, r14)
                java.lang.String r5 = r28.mo55286V()
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 == 0) goto L_0x0654
                java.lang.String r5 = "not find img MidMd5 md5, try to calculate"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106456q(r12)
                r1.mo55287V0(r5)
                r5 = 1
                goto L_0x0655
            L_0x0654:
                r5 = 0
            L_0x0655:
                java.lang.String r8 = r28.mo55286V()
                r0.mo139232b(r12, r8)
            L_0x065c:
                r7 = r7 | r5
                if (r32 == 0) goto L_0x0660
                goto L_0x05f4
            L_0x0660:
                ph0.a r5 = ph0.C100792a.f295260a
                com.tencent.mm.storage.f4 r8 = r0.f292665d
                java.lang.String r8 = r5.mo140238j(r1, r8)
                java.lang.String r11 = r28.mo55264K()
                com.tencent.mm.storage.f4 r12 = r0.f292665d
                long r12 = r12.getMsgId()
                r14 = 0
                java.lang.String r11 = r5.mo140242n(r11, r12, r14)
                com.tencent.mm.sdk.storage.sql.SelectSql r12 = p749xh.C102653l.m135584F2(r11)
                rh0.a$a r13 = rh0.C101376a.f296957i
                rh0.a r14 = r13.mo140861a()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r14 = r14.getDB()
                com.tencent.mm.sdk.storage.IAutoDBItem r4 = r12.singleQuery(r14, r4)
                nh0.a r4 = (nh0.C100114a) r4
                if (r4 != 0) goto L_0x0739
                nh0.a r4 = new nh0.a
                r4.<init>()
                java.lang.String r10 = r28.mo55248C()
                r4.mo142346H2(r10)
                java.lang.String r10 = r28.mo55250D()
                r4.mo142364a1(r10)
                java.lang.String r10 = r28.mo55264K()
                r4.mo142348J2(r10)
                r4.mo142358T2(r11)
                long r14 = r28.mo55268M()
                int r10 = (int) r14
                r4.mo142363Y2(r10)
                java.lang.String r10 = r4.mo142384y2()
                int r10 = r10.hashCode()
                r4.mo142357S2(r10)
                r4.mo142361W2(r8)
                r8 = 2
                r4.setType(r8)
                int r19 = r28.mo55274P()
                long r14 = r28.mo55268M()
                int r8 = (int) r14
                r21 = 0
                r22 = 0
                r23 = 8
                r24 = 0
                r18 = r5
                r20 = r8
                int r5 = ph0.C100792a.m131981h(r18, r19, r20, r21, r22, r23, r24)
                r4.mo142353O2(r5)
                com.tencent.mm.storage.f4 r5 = r0.f292665d
                long r14 = r5.getMsgId()
                r4.mo142359U2(r14)
                com.tencent.mm.storage.f4 r5 = r0.f292665d
                java.lang.String r5 = r5.mo100965E2()
                r4.mo142362X2(r5)
                r5 = 1
                r4.mo142354P2(r5)
                r8 = 0
                r4.mo142365d(r8)
                com.tencent.mm.sdk.storage.executor.InsertExecutor r8 = p749xh.C102653l.m135582D2(r4, r5)
                rh0.a r5 = r13.mo140861a()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r5.getDB()
                long r12 = r8.execute(r5)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r8 = "insert album mid img localId["
                r5.append(r8)
                int r4 = r4.mo142383x2()
                r5.append(r4)
                java.lang.String r4 = "] mediaId["
                r5.append(r4)
                r5.append(r11)
                java.lang.String r4 = "] result["
                r5.append(r4)
                r5.append(r12)
                r4 = 93
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
                r5 = 1
                goto L_0x0767
            L_0x0739:
                int r5 = r4.getStatus()
                r8 = 2
                if (r5 == r8) goto L_0x0769
                int r5 = r4.getStatus()
                r8 = 3
                if (r5 == r8) goto L_0x0769
                int r5 = r4.getStatus()
                r8 = 4
                if (r5 == r8) goto L_0x0769
                int r5 = r4.getStatus()
                if (r5 == r10) goto L_0x0769
                r5 = 1
                java.lang.Object[] r8 = new java.lang.Object[r5]
                int r4 = r4.getStatus()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r10 = 0
                r8[r10] = r4
                java.lang.String r4 = "hasInsertCdn, mid img cdnInfo status:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r8)
            L_0x0767:
                r10 = 1
                goto L_0x076a
            L_0x0769:
                r10 = 0
            L_0x076a:
                r25 = r10
            L_0x076c:
                if (r2 == 0) goto L_0x07a0
                com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo r4 = new com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo
                r4.<init>()
                ph0.a r11 = ph0.C100792a.f295260a
                int r12 = r28.mo55274P()
                long r5 = r28.mo55268M()
                int r13 = (int) r5
                r15 = 0
                r16 = 8
                r17 = 0
                r14 = r9
                int r5 = ph0.C100792a.m131981h(r11, r12, r13, r14, r15, r16, r17)
                r4.filetype = r5
                long r5 = r28.mo55268M()
                r4.filesize = r5
                java.lang.String r5 = r28.mo55286V()
                r4.filemd5 = r5
                long r5 = r28.mo55344y0()
                int r6 = (int) r5
                r4.thumbsize = r6
                r2.add(r4)
            L_0x07a0:
                if (r3 == 0) goto L_0x07a5
                r3.add(r1)
            L_0x07a5:
                rx3.l r1 = new rx3.l
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r25)
                r1.<init>(r2, r3)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: mh0.C99879i.C99881b.mo139233d(ig.d, mh0.a, java.util.ArrayList, java.util.ArrayList, boolean, boolean, boolean):rx3.l");
        }

        /* JADX WARNING: Removed duplicated region for block: B:121:0x03dc  */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x054c  */
        /* JADX WARNING: Removed duplicated region for block: B:157:0x0581  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0114  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0137  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0139  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0153  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x027e  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final rx3.C13604l<java.lang.Boolean, java.lang.Boolean> mo139234e(p434ig.C98672d r35, mh0.C99862a r36, java.util.ArrayList<com.tencent.mars.cdn.CdnLogic.CheckHitFileInfo> r37, java.util.ArrayList<p434ig.C98672d> r38, boolean r39, boolean r40) {
            /*
                r34 = this;
                r0 = r34
                r1 = r35
                r2 = r37
                r3 = r38
                java.lang.Class<nh0.a> r4 = nh0.C100114a.class
                java.lang.String r5 = r35.mo55264K()
                r6 = r36
                mh0.q r5 = r6.mo139216A(r5)
                if (r5 == 0) goto L_0x001b
                java.lang.String r8 = r5.mo55384I()
                goto L_0x001c
            L_0x001b:
                r8 = 0
            L_0x001c:
                if (r5 == 0) goto L_0x0023
                java.lang.String r9 = r5.mo55385J()
                goto L_0x0024
            L_0x0023:
                r9 = 0
            L_0x0024:
                mh0.n r6 = r36.mo55365D()
                java.util.ArrayList r6 = r6.mo139238A()
                boolean r10 = r6 instanceof java.util.Collection
                if (r10 == 0) goto L_0x0038
                boolean r10 = r6.isEmpty()
                if (r10 == 0) goto L_0x0038
            L_0x0036:
                r6 = 1
                goto L_0x0054
            L_0x0038:
                java.util.Iterator r6 = r6.iterator()
            L_0x003c:
                boolean r10 = r6.hasNext()
                if (r10 == 0) goto L_0x0036
                java.lang.Object r10 = r6.next()
                mh0.q r10 = (mh0.C99893q) r10
                int r10 = r10.mo55376A()
                if (r10 != 0) goto L_0x0050
                r10 = 1
                goto L_0x0051
            L_0x0050:
                r10 = 0
            L_0x0051:
                if (r10 == 0) goto L_0x003c
                r6 = 0
            L_0x0054:
                if (r6 == 0) goto L_0x0066
                java.lang.Class<rz.r> r6 = p682rz.C101487r.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                rz.r r6 = (p682rz.C101487r) r6
                boolean r6 = r6.mo140796Ys()
                if (r6 == 0) goto L_0x0066
                r6 = 1
                goto L_0x0067
            L_0x0066:
                r6 = 0
            L_0x0067:
                r13 = 0
                java.lang.String r10 = "MicroMsg.AlbumMsgSendService"
                r15 = 2
                r7 = 3
                if (r40 != 0) goto L_0x0072
                r14 = 0
                goto L_0x00f3
            L_0x0072:
                long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
                int r18 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r18 == 0) goto L_0x007d
                r1.mo55269M0(r11)
            L_0x007d:
                ph0.a r11 = ph0.C100792a.f295260a
                com.tencent.mm.storage.f4 r12 = r0.f292665d
                java.lang.String r11 = r11.mo140250v(r1, r12)
                r12 = 1
                long r17 = com.tencent.p014mm.vfs.C86013q1.m106443d(r9, r11, r12)
                int r19 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
                if (r19 <= 0) goto L_0x0091
                r18 = 1
                goto L_0x0093
            L_0x0091:
                r18 = 0
            L_0x0093:
                java.lang.Object[] r13 = new java.lang.Object[r7]
                r14 = 0
                r13[r14] = r9
                r13[r12] = r11
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r18)
                r13[r15] = r9
                java.lang.String r9 = "copy video thumb[%s] to [%s] result[%B]"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r13)
                long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r11)
                r19 = 0
                int r9 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
                if (r9 == 0) goto L_0x00b2
                r1.mo55345y1(r12)
            L_0x00b2:
                if (r18 == 0) goto L_0x00ea
                java.lang.String r9 = r35.mo55338v0()
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 == 0) goto L_0x00cd
                java.lang.String r9 = "not find img ThumbMd5 md5, try to calculate"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
                java.lang.String r9 = com.tencent.p014mm.vfs.C86013q1.m106456q(r11)
                r1.mo55339v1(r9)
                r9 = 1
                goto L_0x00ce
            L_0x00cd:
                r9 = 0
            L_0x00ce:
                java.lang.String r12 = r35.mo55340w0()
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                if (r12 == 0) goto L_0x00eb
                java.lang.String r9 = "not find img Thumb Head 256 Md5, try to calculate"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
                r9 = 256(0x100, float:3.59E-43)
                r12 = 0
                java.lang.String r9 = p823sg.C90193h.m112877e(r11, r12, r9)
                r1.mo55341w1(r9)
                r9 = 1
                goto L_0x00eb
            L_0x00ea:
                r9 = 0
            L_0x00eb:
                java.lang.String r12 = r35.mo55338v0()
                r0.mo139232b(r11, r12)
                r14 = r9
            L_0x00f3:
                java.lang.String r9 = r35.mo55250D()
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                java.lang.String r11 = "copy origin video [%s] to [%s] result[%B]"
                if (r9 != 0) goto L_0x0109
                java.lang.String r9 = r35.mo55302d0()
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 == 0) goto L_0x0111
            L_0x0109:
                boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
                if (r9 == 0) goto L_0x0267
                if (r6 == 0) goto L_0x0267
            L_0x0111:
                if (r5 != 0) goto L_0x0114
                goto L_0x011c
            L_0x0114:
                long r12 = r35.mo55268M()
                int r6 = (int) r12
                r5.mo55406e0(r6)
            L_0x011c:
                boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
                if (r6 == 0) goto L_0x014f
                if (r40 == 0) goto L_0x014f
                ph0.a r6 = ph0.C100792a.f295260a
                com.tencent.mm.storage.f4 r12 = r0.f292665d
                java.lang.String r6 = r6.mo140238j(r1, r12)
                r12 = 1
                long r21 = com.tencent.p014mm.vfs.C86013q1.m106443d(r8, r6, r12)
                r19 = 0
                int r13 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
                if (r13 <= 0) goto L_0x0139
                r13 = 1
                goto L_0x013a
            L_0x0139:
                r13 = 0
            L_0x013a:
                java.lang.Object[] r9 = new java.lang.Object[r7]
                r17 = 0
                r9[r17] = r8
                r9[r12] = r6
                java.lang.Boolean r12 = java.lang.Boolean.valueOf(r13)
                r9[r15] = r12
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r9)
                r9 = 0
                r0.mo139232b(r6, r9)
            L_0x014f:
                if (r39 == 0) goto L_0x0153
                goto L_0x0262
            L_0x0153:
                ph0.a r6 = ph0.C100792a.f295260a
                java.lang.String r9 = r35.mo55264K()
                com.tencent.mm.storage.f4 r11 = r0.f292665d
                long r11 = r11.getMsgId()
                r13 = 0
                java.lang.String r9 = r6.mo140242n(r9, r11, r13)
                com.tencent.mm.sdk.storage.sql.SelectSql r11 = p749xh.C102653l.m135584F2(r9)
                rh0.a$a r12 = rh0.C101376a.f296957i
                rh0.a r13 = r12.mo140861a()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r13 = r13.getDB()
                com.tencent.mm.sdk.storage.IAutoDBItem r4 = r11.singleQuery(r13, r4)
                nh0.a r4 = (nh0.C100114a) r4
                if (r4 != 0) goto L_0x0232
                nh0.a r4 = new nh0.a
                r4.<init>()
                java.lang.String r11 = r35.mo55248C()
                r4.mo142346H2(r11)
                java.lang.String r11 = r35.mo55250D()
                r4.mo142364a1(r11)
                r4.mo142358T2(r9)
                java.lang.String r11 = r35.mo55264K()
                r4.mo142348J2(r11)
                r13 = r8
                long r7 = r35.mo55268M()
                int r8 = (int) r7
                r4.mo142363Y2(r8)
                java.lang.String r7 = r4.mo142384y2()
                int r7 = r7.hashCode()
                r4.mo142357S2(r7)
                r4.setType(r15)
                int r21 = r35.mo55274P()
                long r7 = r35.mo55268M()
                int r8 = (int) r7
                r23 = 0
                r24 = 0
                r25 = 12
                r26 = 0
                r20 = r6
                r22 = r8
                int r6 = ph0.C100792a.m131981h(r20, r21, r22, r23, r24, r25, r26)
                r4.mo142353O2(r6)
                com.tencent.mm.storage.f4 r6 = r0.f292665d
                long r6 = r6.getMsgId()
                r4.mo142359U2(r6)
                com.tencent.mm.storage.f4 r6 = r0.f292665d
                java.lang.String r6 = r6.mo100965E2()
                r4.mo142362X2(r6)
                r6 = 1
                r4.mo142355Q2(r6)
                r7 = r13
                r4.mo142361W2(r7)
                r7 = 0
                r4.mo142365d(r7)
                if (r5 == 0) goto L_0x01ef
                java.lang.String r7 = r5.mo55379D()
                goto L_0x01f0
            L_0x01ef:
                r7 = 0
            L_0x01f0:
                r4.mo142352N2(r7)
                long r7 = r35.mo55278R()
                r4.mo142349K2(r7)
                com.tencent.mm.sdk.storage.executor.InsertExecutor r5 = p749xh.C102653l.m135582D2(r4, r6)
                rh0.a r7 = r12.mo140861a()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = r7.getDB()
                long r7 = r5.execute(r7)
                r5 = 4
                java.lang.Object[] r5 = new java.lang.Object[r5]
                int r11 = r4.mo142383x2()
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r12 = 0
                r5[r12] = r11
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                r5[r6] = r7
                int r4 = r4.mo142378t2()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5[r15] = r4
                r6 = 3
                r5[r6] = r9
                java.lang.String r4 = "send album origin video insert localId[%d] result[%B] fileType[%d], mediaId[%s]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r5)
                goto L_0x0260
            L_0x0232:
                r6 = 3
                int r5 = r4.getStatus()
                if (r5 == r15) goto L_0x0262
                int r5 = r4.getStatus()
                if (r5 == r6) goto L_0x0262
                int r5 = r4.getStatus()
                r6 = 4
                if (r5 == r6) goto L_0x0262
                int r5 = r4.getStatus()
                r6 = -1
                if (r5 == r6) goto L_0x0262
                r5 = 1
                java.lang.Object[] r6 = new java.lang.Object[r5]
                int r4 = r4.getStatus()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 0
                r6[r5] = r4
                java.lang.String r4 = "hasInsertCdn, origin video cdnInfo status:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r6)
            L_0x0260:
                r11 = 1
                goto L_0x0263
            L_0x0262:
                r11 = 0
            L_0x0263:
                r24 = r14
                goto L_0x054a
            L_0x0267:
                r7 = r8
                java.lang.String r12 = "] result["
                java.lang.String r13 = "] mediaId["
                if (r6 == 0) goto L_0x03dc
                java.lang.String r6 = r35.mo55302d0()
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r6 == 0) goto L_0x027e
                boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
                if (r6 == 0) goto L_0x03dc
            L_0x027e:
                boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
                if (r6 == 0) goto L_0x02b4
                if (r40 == 0) goto L_0x02b4
                ph0.a r6 = ph0.C100792a.f295260a
                com.tencent.mm.storage.f4 r9 = r0.f292665d
                java.lang.String r6 = r6.mo140238j(r1, r9)
                r9 = 1
                long r22 = com.tencent.p014mm.vfs.C86013q1.m106443d(r7, r6, r9)
                r19 = 0
                int r17 = (r22 > r19 ? 1 : (r22 == r19 ? 0 : -1))
                r8 = 3
                if (r17 <= 0) goto L_0x029d
                r19 = 1
                goto L_0x029f
            L_0x029d:
                r19 = 0
            L_0x029f:
                java.lang.Object[] r15 = new java.lang.Object[r8]
                r8 = 0
                r15[r8] = r7
                r15[r9] = r6
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r19)
                r9 = 2
                r15[r9] = r8
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r15)
                r8 = 0
                r0.mo139232b(r6, r8)
            L_0x02b4:
                if (r5 != 0) goto L_0x02b7
                goto L_0x02bf
            L_0x02b7:
                long r8 = r35.mo55268M()
                int r6 = (int) r8
                r5.mo55411j0(r6)
            L_0x02bf:
                if (r39 == 0) goto L_0x02c5
                r24 = r14
                goto L_0x03ef
            L_0x02c5:
                ph0.a r6 = ph0.C100792a.f295260a
                java.lang.String r8 = r35.mo55264K()
                java.lang.String r8 = r6.mo140244p(r8)
                com.tencent.mm.storage.f4 r9 = r0.f292665d
                r24 = r14
                long r14 = r9.getMsgId()
                r9 = 0
                java.lang.String r11 = r6.mo140242n(r8, r14, r9)
                com.tencent.mm.sdk.storage.sql.SelectSql r9 = p749xh.C102653l.m135584F2(r11)
                rh0.a$a r14 = rh0.C101376a.f296957i
                rh0.a r15 = r14.mo140861a()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r15 = r15.getDB()
                com.tencent.mm.sdk.storage.IAutoDBItem r4 = r9.singleQuery(r15, r4)
                nh0.a r4 = (nh0.C100114a) r4
                if (r4 != 0) goto L_0x03aa
                nh0.a r4 = new nh0.a
                r4.<init>()
                java.lang.String r9 = r35.mo55296a0()
                r4.mo142346H2(r9)
                java.lang.String r9 = r35.mo55302d0()
                r4.mo142364a1(r9)
                r4.mo142348J2(r8)
                r4.mo142358T2(r11)
                long r8 = r35.mo55268M()
                int r9 = (int) r8
                r4.mo142363Y2(r9)
                java.lang.String r8 = r4.mo142384y2()
                int r8 = r8.hashCode()
                r4.mo142357S2(r8)
                r4.mo142361W2(r7)
                r7 = 2
                r4.setType(r7)
                int r28 = r35.mo55274P()
                long r7 = r35.mo55268M()
                int r8 = (int) r7
                r30 = 0
                r31 = 0
                r32 = 12
                r33 = 0
                r27 = r6
                r29 = r8
                int r6 = ph0.C100792a.m131981h(r27, r28, r29, r30, r31, r32, r33)
                r4.mo142353O2(r6)
                com.tencent.mm.storage.f4 r6 = r0.f292665d
                long r6 = r6.getMsgId()
                r4.mo142359U2(r6)
                com.tencent.mm.storage.f4 r6 = r0.f292665d
                java.lang.String r6 = r6.mo100965E2()
                r4.mo142362X2(r6)
                r6 = 1
                r4.mo142355Q2(r6)
                r4.mo142354P2(r6)
                r7 = 0
                r4.mo142365d(r7)
                if (r5 == 0) goto L_0x0365
                java.lang.String r7 = r5.mo55379D()
                goto L_0x0366
            L_0x0365:
                r7 = 0
            L_0x0366:
                r4.mo142352N2(r7)
                long r7 = r35.mo55278R()
                r4.mo142349K2(r7)
                com.tencent.mm.sdk.storage.executor.InsertExecutor r5 = p749xh.C102653l.m135582D2(r4, r6)
                rh0.a r6 = r14.mo140861a()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r6.getDB()
                long r5 = r5.execute(r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "insert album mid video localId["
                r7.append(r8)
                int r4 = r4.mo142383x2()
                r7.append(r4)
                r7.append(r13)
                r7.append(r11)
                r7.append(r12)
                r7.append(r5)
                r4 = 93
                r7.append(r4)
                java.lang.String r4 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
                goto L_0x03d9
            L_0x03aa:
                int r5 = r4.getStatus()
                r6 = 2
                if (r5 == r6) goto L_0x03ef
                int r5 = r4.getStatus()
                r6 = 3
                if (r5 == r6) goto L_0x03ef
                int r5 = r4.getStatus()
                r6 = 4
                if (r5 == r6) goto L_0x03ef
                int r5 = r4.getStatus()
                r6 = -1
                if (r5 == r6) goto L_0x03ef
                r5 = 1
                java.lang.Object[] r6 = new java.lang.Object[r5]
                int r4 = r4.getStatus()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 0
                r6[r5] = r4
                java.lang.String r4 = "hasInsertCdn, mid video cdnInfo status:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r6)
            L_0x03d9:
                r11 = 1
                goto L_0x054a
            L_0x03dc:
                r24 = r14
                java.lang.String r6 = r35.mo55250D()
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r6 == 0) goto L_0x03f2
                boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
                if (r6 == 0) goto L_0x03ef
                goto L_0x03f2
            L_0x03ef:
                r11 = 0
                goto L_0x054a
            L_0x03f2:
                boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
                if (r6 == 0) goto L_0x0426
                if (r40 == 0) goto L_0x0426
                ph0.a r6 = ph0.C100792a.f295260a
                com.tencent.mm.storage.f4 r8 = r0.f292665d
                java.lang.String r6 = r6.mo140238j(r1, r8)
                r8 = 1
                long r14 = com.tencent.p014mm.vfs.C86013q1.m106443d(r7, r6, r8)
                r19 = 0
                int r17 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
                if (r17 <= 0) goto L_0x040f
                r14 = 1
                goto L_0x0410
            L_0x040f:
                r14 = 0
            L_0x0410:
                r15 = 0
                r0.mo139232b(r6, r15)
                r9 = 3
                java.lang.Object[] r15 = new java.lang.Object[r9]
                r9 = 0
                r15[r9] = r7
                r15[r8] = r6
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r14)
                r8 = 2
                r15[r8] = r6
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r15)
            L_0x0426:
                if (r5 != 0) goto L_0x0429
                goto L_0x0431
            L_0x0429:
                long r8 = r35.mo55268M()
                int r6 = (int) r8
                r5.mo55411j0(r6)
            L_0x0431:
                if (r39 == 0) goto L_0x0434
                goto L_0x03ef
            L_0x0434:
                ph0.a r6 = ph0.C100792a.f295260a
                java.lang.String r8 = r35.mo55264K()
                com.tencent.mm.storage.f4 r9 = r0.f292665d
                long r14 = r9.getMsgId()
                r9 = 0
                java.lang.String r8 = r6.mo140242n(r8, r14, r9)
                com.tencent.mm.sdk.storage.sql.SelectSql r9 = p749xh.C102653l.m135584F2(r8)
                rh0.a$a r11 = rh0.C101376a.f296957i
                rh0.a r14 = r11.mo140861a()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r14 = r14.getDB()
                com.tencent.mm.sdk.storage.IAutoDBItem r4 = r9.singleQuery(r14, r4)
                nh0.a r4 = (nh0.C100114a) r4
                if (r4 != 0) goto L_0x0516
                nh0.a r4 = new nh0.a
                r4.<init>()
                java.lang.String r9 = r35.mo55248C()
                r4.mo142346H2(r9)
                java.lang.String r9 = r35.mo55250D()
                r4.mo142364a1(r9)
                java.lang.String r9 = r35.mo55264K()
                r4.mo142348J2(r9)
                r4.mo142358T2(r8)
                long r14 = r35.mo55268M()
                int r9 = (int) r14
                r4.mo142363Y2(r9)
                java.lang.String r9 = r4.mo142384y2()
                int r9 = r9.hashCode()
                r4.mo142357S2(r9)
                r4.mo142361W2(r7)
                r7 = 2
                r4.setType(r7)
                int r28 = r35.mo55274P()
                long r14 = r35.mo55268M()
                int r7 = (int) r14
                r30 = 0
                r31 = 0
                r32 = 12
                r33 = 0
                r27 = r6
                r29 = r7
                int r6 = ph0.C100792a.m131981h(r27, r28, r29, r30, r31, r32, r33)
                r4.mo142353O2(r6)
                com.tencent.mm.storage.f4 r6 = r0.f292665d
                long r6 = r6.getMsgId()
                r4.mo142359U2(r6)
                com.tencent.mm.storage.f4 r6 = r0.f292665d
                java.lang.String r6 = r6.mo100965E2()
                r4.mo142362X2(r6)
                r6 = 1
                r4.mo142354P2(r6)
                r7 = 0
                r4.mo142365d(r7)
                if (r5 == 0) goto L_0x04cf
                java.lang.String r7 = r5.mo55379D()
                goto L_0x04d0
            L_0x04cf:
                r7 = 0
            L_0x04d0:
                r4.mo142352N2(r7)
                long r14 = r35.mo55278R()
                r4.mo142349K2(r14)
                com.tencent.mm.sdk.storage.executor.InsertExecutor r5 = p749xh.C102653l.m135582D2(r4, r6)
                rh0.a r6 = r11.mo140861a()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r6.getDB()
                long r5 = r5.execute(r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r9 = "insert album thumb video localId["
                r7.append(r9)
                int r4 = r4.mo142383x2()
                r7.append(r4)
                r7.append(r13)
                r7.append(r8)
                r7.append(r12)
                r7.append(r5)
                r4 = 93
                r7.append(r4)
                java.lang.String r4 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
                r5 = 1
                goto L_0x03d9
            L_0x0516:
                int r5 = r4.getStatus()
                r6 = 2
                if (r5 == r6) goto L_0x0547
                int r5 = r4.getStatus()
                r6 = 3
                if (r5 == r6) goto L_0x0547
                int r5 = r4.getStatus()
                r6 = 4
                if (r5 == r6) goto L_0x0547
                int r5 = r4.getStatus()
                r6 = -1
                if (r5 == r6) goto L_0x0547
                r5 = 1
                java.lang.Object[] r6 = new java.lang.Object[r5]
                int r4 = r4.getStatus()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r7 = 0
                r6[r7] = r4
                java.lang.String r4 = "hasInsertCdn, thumb video cdnInfo status:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r6)
                goto L_0x03d9
            L_0x0547:
                r7 = 0
                goto L_0x03ef
            L_0x054a:
                if (r2 == 0) goto L_0x057f
                com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo r4 = new com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo
                r4.<init>()
                ph0.a r12 = ph0.C100792a.f295260a
                int r13 = r35.mo55274P()
                long r5 = r35.mo55268M()
                int r14 = (int) r5
                r15 = 0
                r16 = 0
                r17 = 12
                r18 = 0
                int r5 = ph0.C100792a.m131981h(r12, r13, r14, r15, r16, r17, r18)
                r4.filetype = r5
                long r5 = r35.mo55268M()
                r4.filesize = r5
                java.lang.String r5 = r35.mo55286V()
                r4.filemd5 = r5
                long r5 = r35.mo55344y0()
                int r6 = (int) r5
                r4.thumbsize = r6
                r2.add(r4)
            L_0x057f:
                if (r3 == 0) goto L_0x0584
                r3.add(r1)
            L_0x0584:
                rx3.l r1 = new rx3.l
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r24)
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)
                r1.<init>(r2, r3)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: mh0.C99879i.C99881b.mo139234e(ig.d, mh0.a, java.util.ArrayList, java.util.ArrayList, boolean, boolean):rx3.l");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x00e7  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x012a  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x01ab  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r10 = r22
                java.lang.Class<qo.l> r11 = p663qo.C101213l.class
                com.tencent.mm.storage.f4 r0 = r10.f292665d
                int r0 = r0.getStatus()
                r1 = 0
                java.lang.String r2 = "MicroMsg.AlbumMsgSendService"
                r12 = 0
                r3 = 9
                if (r0 != r3) goto L_0x0034
                mh0.i r0 = r10.f292666e
                r0.f292656d = r12
                r0.mo106377PI(r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ChatDataCopyRunnable cancel, because send album is paused, msg_localId:"
                r0.append(r1)
                com.tencent.mm.storage.f4 r1 = r10.f292665d
                long r3 = r1.getMsgId()
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
                return
            L_0x0034:
                ig.a r13 = new ig.a
                r13.<init>()
                com.tencent.mm.storage.f4 r0 = r10.f292665d
                java.lang.String r0 = r0.getContent()
                java.lang.String r3 = "info.content"
                gy3.C87412m.m108593f(r0, r3)
                r13.mo141099d(r0)
                ig.g r14 = new ig.g
                r14.<init>()
                java.lang.String r0 = r13.f289309p
                r14.mo141099d(r0)
                i40.b$a r0 = i40.C98597b.f289091e
                java.lang.Class<mh0.d> r3 = mh0.C99864d.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                java.lang.String r4 = "getService(AlbumFeatureService::class.java)"
                gy3.C87412m.m108593f(r3, r4)
                i40.e r3 = (i40.C98598e) r3
                java.lang.Class<mh0.e0> r4 = mh0.C99865e0.class
                i40.b r0 = r0.mo85231a(r3, r4)
                mh0.e0 r0 = (mh0.C99865e0) r0
                com.tencent.mm.storage.f4 r3 = r10.f292665d
                long r3 = r3.getMsgId()
                mh0.a r15 = r0.mo139217g3(r3)
                java.util.ArrayList r16 = new java.util.ArrayList
                r16.<init>()
                java.util.ArrayList r17 = new java.util.ArrayList
                r17.<init>()
                mh0.i r0 = r10.f292666e
                mh0.f r0 = r0.f292661i
                com.tencent.mm.storage.f4 r3 = r10.f292665d
                java.lang.String r3 = r3.mo108768t()
                java.lang.String r4 = "info.talker"
                gy3.C87412m.m108593f(r3, r4)
                r0.getClass()
                boolean r0 = eb0.C45628s0.m50751P(r3)
                java.lang.String r4 = "MicroMsg.AlbumMsgCDNService"
                r5 = 1
                if (r0 == 0) goto L_0x00a2
                java.lang.Object[] r0 = new java.lang.Object[r5]
                r0[r12] = r3
                java.lang.String r3 = "cdntra not use cdn user:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r3, r0)
            L_0x00a0:
                r9 = 0
                goto L_0x00d4
            L_0x00a2:
                boolean r0 = fd3.C32025c.m39609a()
                if (r0 != 0) goto L_0x00af
                java.lang.String r0 = "isAllow2UseCdnWithXLab = false"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                goto L_0x00a0
            L_0x00af:
                di3.d r0 = di3.C86312j.m106911c(r11)
                qo.l r0 = (p663qo.C101213l) r0
                boolean r0 = r0.dm0(r5)
                if (r0 != 0) goto L_0x00d3
                java.lang.Object[] r0 = new java.lang.Object[r5]
                di3.d r3 = di3.C86312j.m106911c(r11)
                qo.l r3 = (p663qo.C101213l) r3
                boolean r3 = r3.dm0(r5)
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r0[r12] = r3
                java.lang.String r3 = "cdntra not use cdn flag:%b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r0)
                goto L_0x00a0
            L_0x00d3:
                r9 = 1
            L_0x00d4:
                java.lang.Class<h81.h> r0 = h81.C32735h.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                h81.h r0 = (h81.C32735h) r0
                tf3.w r3 = new tf3.w
                r3.<init>()
                int r0 = r0.mo58782dM(r3)
                if (r0 != r5) goto L_0x00e9
                r8 = 1
                goto L_0x00ea
            L_0x00e9:
                r8 = 0
            L_0x00ea:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "doJob ChatDataCopyRunnable, info id:"
                r0.append(r3)
                com.tencent.mm.storage.f4 r3 = r10.f292665d
                long r3 = r3.getMsgId()
                r0.append(r3)
                java.lang.String r3 = ", item_size: "
                r0.append(r3)
                java.util.List<ig.d> r3 = r14.f289364h
                int r3 = r3.size()
                r0.append(r3)
                java.lang.String r3 = ", enableBatchUpload: "
                r0.append(r3)
                r0.append(r8)
                java.lang.String r3 = ", checkUseCdn: "
                r0.append(r3)
                r0.append(r9)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                com.tencent.mm.storage.f4 r0 = r10.f292665d
                java.lang.String r0 = r0.getContent()
                if (r0 == 0) goto L_0x01ab
                r7 = 0
                r18 = 64
                r19 = 0
                r0 = r22
                r1 = r14
                r2 = r15
                r3 = r17
                r4 = r16
                r5 = r8
                r6 = r9
                r20 = r8
                r8 = r18
                r18 = r9
                r9 = r19
                rx3.l r0 = m130442c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                A r1 = r0.f38555d
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r19 = r1.booleanValue()
                B r0 = r0.f38556e
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r21 = r0.booleanValue()
                if (r20 == 0) goto L_0x019c
                if (r18 == 0) goto L_0x019c
                r8 = 1
                r6 = 1
                di3.d r0 = di3.C86312j.m106911c(r11)     // Catch:{ Exception -> 0x018b }
                r11 = r0
                qo.l r11 = (p663qo.C101213l) r11     // Catch:{ Exception -> 0x018b }
                java.util.List r0 = sx3.C110818d0.m150953y0(r17)     // Catch:{ Exception -> 0x018b }
                com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo[] r1 = new com.tencent.mars.cdn.CdnLogic.CheckHitFileInfo[r12]     // Catch:{ Exception -> 0x018b }
                java.lang.Object[] r0 = r0.toArray(r1)     // Catch:{ Exception -> 0x018b }
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                gy3.C87412m.m108592e(r0, r1)     // Catch:{ Exception -> 0x018b }
                r12 = r0
                com.tencent.mars.cdn.CdnLogic$CheckHitFileInfo[] r12 = (com.tencent.mars.cdn.CdnLogic.CheckHitFileInfo[]) r12     // Catch:{ Exception -> 0x018b }
                mh0.j r9 = new mh0.j     // Catch:{ Exception -> 0x018b }
                r0 = r9
                r1 = r22
                r2 = r14
                r3 = r15
                r4 = r17
                r5 = r16
                r7 = r21
                r10 = r9
                r9 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x018b }
                r11.mo140303db(r12, r10)     // Catch:{ Exception -> 0x018b }
                goto L_0x019c
            L_0x018b:
                r5 = 0
                r6 = 1
                r7 = 0
                r8 = 64
                r9 = 0
                r0 = r22
                r1 = r14
                r2 = r15
                r3 = r17
                r4 = r16
                m130442c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            L_0x019c:
                r0 = r22
                r1 = r19
                r2 = r21
                r3 = r20
                r4 = r13
                r5 = r14
                r6 = r15
                r0.mo139231a(r1, r2, r3, r4, r5, r6)
                goto L_0x01b3
            L_0x01ab:
                r0 = r10
                mh0.i r2 = r0.f292666e
                r2.f292656d = r12
                r2.mo106377PI(r1)
            L_0x01b3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mh0.C99879i.C99881b.run():void");
        }
    }

    /* renamed from: mh0.i$c */
    public static final class C99882c<T extends IAutoDBItem> implements IStorageObserver {

        /* renamed from: d */
        public final /* synthetic */ C99879i f292667d;

        public C99882c(C99879i iVar) {
            this.f292667d = iVar;
        }

        /* JADX WARNING: type inference failed for: r8v5, types: [com.tencent.mm.sdk.storage.IAutoDBItem] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r8) {
            /*
                r7 = this;
                com.tencent.mm.sdk.storage.observer.StorageObserverEvent r8 = (com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent) r8
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r8, r0)
                com.tencent.mm.sdk.storage.observer.StorageEventId r0 = r8.getEventId()
                com.tencent.mm.sdk.storage.observer.StorageEventId$Companion r1 = com.tencent.p014mm.sdk.storage.observer.StorageEventId.Companion
                com.tencent.mm.sdk.storage.observer.StorageEventId r2 = r1.getUPDATE()
                boolean r2 = gy3.C87412m.m108589b(r0, r2)
                java.lang.String r3 = "MicroMsg.AlbumMsgSendService"
                r4 = 0
                if (r2 == 0) goto L_0x0059
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "cdnObserver update event, status: "
                r0.append(r1)
                com.tencent.mm.sdk.storage.IAutoDBItem r1 = r8.getObj()
                boolean r2 = r1 instanceof nh0.C100114a
                if (r2 == 0) goto L_0x0030
                nh0.a r1 = (nh0.C100114a) r1
                goto L_0x0031
            L_0x0030:
                r1 = r4
            L_0x0031:
                if (r1 == 0) goto L_0x003c
                int r1 = r1.getStatus()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x003d
            L_0x003c:
                r1 = r4
            L_0x003d:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
                mh0.i r0 = r7.f292667d
                com.tencent.mm.sdk.storage.IAutoDBItem r8 = r8.getObj()
                boolean r1 = r8 instanceof nh0.C100114a
                if (r1 == 0) goto L_0x0054
                r4 = r8
                nh0.a r4 = (nh0.C100114a) r4
            L_0x0054:
                mh0.C99879i.vx0(r0, r4)
                goto L_0x00c7
            L_0x0059:
                com.tencent.mm.sdk.storage.observer.StorageEventId r1 = r1.getBATCH_EVENT()
                boolean r0 = gy3.C87412m.m108589b(r0, r1)
                if (r0 == 0) goto L_0x00c7
                java.util.HashMap r8 = r8.getObjEventMap()
                if (r8 == 0) goto L_0x00c7
                mh0.i r0 = r7.f292667d
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            L_0x0073:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L_0x00c7
                java.lang.Object r1 = r8.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "cdnObserver batch event, status: "
                r2.append(r5)
                java.lang.Object r5 = r1.getValue()
                com.tencent.mm.sdk.storage.observer.StorageObserverEvent r5 = (com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent) r5
                com.tencent.mm.sdk.storage.IAutoDBItem r5 = r5.getObj()
                boolean r6 = r5 instanceof nh0.C100114a
                if (r6 == 0) goto L_0x009a
                nh0.a r5 = (nh0.C100114a) r5
                goto L_0x009b
            L_0x009a:
                r5 = r4
            L_0x009b:
                if (r5 == 0) goto L_0x00a6
                int r5 = r5.getStatus()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x00a7
            L_0x00a6:
                r5 = r4
            L_0x00a7:
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
                java.lang.Object r1 = r1.getValue()
                com.tencent.mm.sdk.storage.observer.StorageObserverEvent r1 = (com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent) r1
                com.tencent.mm.sdk.storage.IAutoDBItem r1 = r1.getObj()
                boolean r2 = r1 instanceof nh0.C100114a
                if (r2 == 0) goto L_0x00c2
                nh0.a r1 = (nh0.C100114a) r1
                goto L_0x00c3
            L_0x00c2:
                r1 = r4
            L_0x00c3:
                mh0.C99879i.vx0(r0, r1)
                goto L_0x0073
            L_0x00c7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: mh0.C99879i.C99882c.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: mh0.i$d */
    public static final class C99883d extends C87413o implements C32226l<C89132b.C89134c<C64596nz3>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f292668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99883d(C72963f4 f4Var) {
            super(1);
            this.f292668d = f4Var;
        }

        public Object invoke(Object obj) {
            int i;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Class cls = C98201k.class;
            C92836k nP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127194nP(Long.valueOf(this.f292668d.getMsgId()));
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                i = 1;
            } else {
                nP.mo127127D(-1);
                i = 2;
            }
            C64596nz3 nz32 = (C64596nz3) cVar.f256796d;
            long j = 0;
            nP.mo127125B(nz32 != null ? nz32.f184595n : 0);
            if (((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).Dx0(Long.valueOf(this.f292668d.getMsgId()), nP) < 0) {
                Log.m105924i("MicroMsg.AlbumMsgSendService", "doSendContinue, update imgInfo failed[step 2]");
            }
            long msgId = this.f292668d.getMsgId();
            C64596nz3 nz33 = (C64596nz3) cVar.f256796d;
            if (nz33 != null) {
                j = nz33.f184595n;
            }
            String t = this.f292668d.mo108768t();
            C87412m.m108593f(t, "msg.talker");
            ((C99933h) C86312j.m106911c(C99933h.class)).mo84406lr(18, String.valueOf(msgId), C62619a.class, new C98941c(i, j, t));
            StringBuilder sb = new StringBuilder();
            sb.append("doSendContinue, send album msg success, msgId: ");
            sb.append(this.f292668d.getMsgId());
            sb.append(", svrMsgId: ");
            C64596nz3 nz34 = (C64596nz3) cVar.f256796d;
            sb.append(nz34 != null ? Long.valueOf(nz34.f184595n) : null);
            Log.m105924i("MicroMsg.AlbumMsgSendService", sb.toString());
            return C13598b0.f38549a;
        }
    }

    public C99879i() {
        C99882c cVar = new C99882c(this);
        this.f292662j = cVar;
        C98597b.C60245a aVar = C98597b.f289091e;
        C7335d c = C86312j.m106911c(C99864d.class);
        C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
        C102653l.f302539U0.observe(((C99895t) aVar.mo85231a((C98598e) c, C99895t.class)).f289092d, cVar);
        try {
            this.f292660h = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_albummsg_send_waiting_time, 7);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AlbumMsgSendService", e, "AlbumMsgSendService init error.", new Object[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x02c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void vx0(mh0.C99879i r34, nh0.C100114a r35) {
        /*
            r0 = r34
            r34.getClass()
            java.lang.Class<i40.c> r7 = i40.C60247c.class
            java.lang.Class<rh0.a> r8 = rh0.C101376a.class
            if (r35 != 0) goto L_0x0015
            java.lang.String r0 = "MicroMsg.AlbumMsgSendService"
            java.lang.String r1 = "on cdn storage changed, but cdninfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            goto L_0x0ba2
        L_0x0015:
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            long r2 = r35.mo142385z2()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4 r2 = r1.b00(r2)
            long r3 = r2.getMsgId()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0052
            java.lang.String r0 = "MicroMsg.AlbumMsgSendService"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "msg info not exist, id = "
            r1.append(r3)
            long r2 = r2.getMsgId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x0ba2
        L_0x0052:
            java.lang.String r1 = r2.getContent()
            r3 = 1
            r9 = 0
            if (r1 != 0) goto L_0x006d
            java.lang.String r1 = "MicroMsg.AlbumMsgSendService"
            java.lang.String r4 = "album msg content is null, id %d result"
            java.lang.Object[] r10 = new java.lang.Object[r3]
            long r11 = r35.mo142385z2()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10[r9] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r10)
        L_0x006d:
            ig.a r4 = new ig.a
            r4.<init>()
            java.lang.String r1 = r2.getContent()
            if (r1 != 0) goto L_0x007a
            java.lang.String r1 = ""
        L_0x007a:
            r4.mo141099d(r1)
            ig.g r10 = new ig.g
            r10.<init>()
            java.lang.String r1 = r4.f289309p
            r10.mo141099d(r1)
            i40.b$a r1 = i40.C98597b.f289091e
            java.lang.Class<mh0.d> r11 = mh0.C99864d.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            java.lang.String r12 = "getService(AlbumFeatureService::class.java)"
            gy3.C87412m.m108593f(r11, r12)
            i40.e r11 = (i40.C98598e) r11
            java.lang.Class<mh0.e0> r12 = mh0.C99865e0.class
            i40.b r1 = r1.mo85231a(r11, r12)
            mh0.e0 r1 = (mh0.C99865e0) r1
            long r11 = r2.getMsgId()
            mh0.a r11 = r1.mo139217g3(r11)
            int r1 = r35.mo142378t2()
            r13 = 4
            if (r1 != r13) goto L_0x0128
            java.lang.String r1 = r35.mo142374q2()
            if (r1 == 0) goto L_0x0125
            ic3.a r14 = new ic3.a
            r14.<init>()
            r14.mo141099d(r1)
            boolean r1 = r35.mo142381v2()
            if (r1 == 0) goto L_0x00f5
            boolean r1 = r35.mo142379u2()
            if (r1 != 0) goto L_0x00f5
            java.lang.String r1 = r35.mo142372o2()
            java.lang.String r15 = "cdnInfo.dataId"
            gy3.C87412m.m108593f(r1, r15)
            mh0.q r1 = r11.mo139216A(r1)
            if (r1 != 0) goto L_0x00d7
            goto L_0x00dc
        L_0x00d7:
            int r15 = r14.f289277A
            r1.mo55405d0(r15)
        L_0x00dc:
            if (r1 != 0) goto L_0x00df
            goto L_0x00e4
        L_0x00df:
            int r15 = r14.f289278B
            r1.mo55406e0(r15)
        L_0x00e4:
            if (r1 != 0) goto L_0x00e7
            goto L_0x00ec
        L_0x00e7:
            int r15 = r14.f289280D
            r1.mo55410i0(r15)
        L_0x00ec:
            if (r1 != 0) goto L_0x00ef
            goto L_0x011a
        L_0x00ef:
            int r15 = r14.f289281E
            r1.mo55411j0(r15)
            goto L_0x011a
        L_0x00f5:
            boolean r1 = r35.mo142379u2()
            if (r1 == 0) goto L_0x0119
            java.lang.String r1 = r35.mo142372o2()
            java.lang.String r15 = "cdnInfo.dataId"
            gy3.C87412m.m108593f(r1, r15)
            mh0.q r1 = r11.mo139216A(r1)
            if (r1 != 0) goto L_0x010b
            goto L_0x0110
        L_0x010b:
            int r15 = r14.f289280D
            r1.mo55410i0(r15)
        L_0x0110:
            if (r1 != 0) goto L_0x0113
            goto L_0x011a
        L_0x0113:
            int r15 = r14.f289281E
            r1.mo55411j0(r15)
            goto L_0x011a
        L_0x0119:
            r1 = 0
        L_0x011a:
            if (r1 != 0) goto L_0x011e
            goto L_0x0241
        L_0x011e:
            java.lang.String r14 = r14.f289279C
            r1.mo55397V(r14)
            goto L_0x0241
        L_0x0125:
            r1 = 0
            goto L_0x0241
        L_0x0128:
            boolean r1 = r35.mo142370n2()
            if (r1 == 0) goto L_0x0166
            java.lang.String r1 = r35.mo142372o2()
            java.lang.String r14 = "cdnInfo.dataId"
            gy3.C87412m.m108593f(r1, r14)
            mh0.q r1 = r11.mo139216A(r1)
            if (r1 != 0) goto L_0x013e
            goto L_0x0145
        L_0x013e:
            int r14 = r1.mo55390O()
            r1.mo55407f0(r14)
        L_0x0145:
            if (r1 != 0) goto L_0x0148
            goto L_0x014f
        L_0x0148:
            int r14 = r1.mo55381F()
            r1.mo55398W(r14)
        L_0x014f:
            if (r1 != 0) goto L_0x0152
            goto L_0x0159
        L_0x0152:
            int r14 = r35.mo142343A2()
            r1.mo55401Z(r14)
        L_0x0159:
            if (r1 != 0) goto L_0x015d
            goto L_0x0241
        L_0x015d:
            int r14 = r35.mo142345C2()
            r1.mo55404c0(r14)
            goto L_0x0241
        L_0x0166:
            boolean r1 = r35.mo142382w2()
            if (r1 == 0) goto L_0x01be
            java.lang.String r1 = r35.mo142372o2()
            java.lang.String r14 = "cdnInfo.dataId"
            gy3.C87412m.m108593f(r1, r14)
            mh0.n r14 = r11.mo55365D()
            java.util.ArrayList r14 = r14.mo139238A()
            java.util.Iterator r14 = r14.iterator()
        L_0x0181:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x01a3
            java.lang.Object r15 = r14.next()
            r16 = r15
            mh0.q r16 = (mh0.C99893q) r16
            ph0.a r5 = ph0.C100792a.f295260a
            java.lang.String r6 = r16.mo55377B()
            java.lang.String r5 = r5.mo140249u(r6)
            boolean r5 = gy3.C87412m.m108589b(r5, r1)
            if (r5 == 0) goto L_0x01a0
            goto L_0x01a4
        L_0x01a0:
            r5 = 0
            goto L_0x0181
        L_0x01a3:
            r15 = 0
        L_0x01a4:
            r1 = r15
            mh0.q r1 = (mh0.C99893q) r1
            if (r1 != 0) goto L_0x01aa
            goto L_0x01b1
        L_0x01aa:
            int r5 = r35.mo142343A2()
            r1.mo55407f0(r5)
        L_0x01b1:
            if (r1 != 0) goto L_0x01b5
            goto L_0x0241
        L_0x01b5:
            int r5 = r35.mo142345C2()
            r1.mo55408g0(r5)
            goto L_0x0241
        L_0x01be:
            boolean r1 = r35.mo142379u2()
            if (r1 == 0) goto L_0x0220
            java.lang.String r1 = r35.mo142372o2()
            java.lang.String r5 = "cdnInfo.dataId"
            gy3.C87412m.m108593f(r1, r5)
            mh0.n r5 = r11.mo55365D()
            java.util.ArrayList r5 = r5.mo139238A()
            java.util.Iterator r5 = r5.iterator()
        L_0x01d9:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0207
            java.lang.Object r6 = r5.next()
            r14 = r6
            mh0.q r14 = (mh0.C99893q) r14
            java.lang.String r15 = r14.mo55377B()
            boolean r15 = gy3.C87412m.m108589b(r15, r1)
            if (r15 != 0) goto L_0x0203
            ph0.a r15 = ph0.C100792a.f295260a
            java.lang.String r14 = r14.mo55377B()
            java.lang.String r14 = r15.mo140244p(r14)
            boolean r14 = gy3.C87412m.m108589b(r14, r1)
            if (r14 == 0) goto L_0x0201
            goto L_0x0203
        L_0x0201:
            r14 = 0
            goto L_0x0204
        L_0x0203:
            r14 = 1
        L_0x0204:
            if (r14 == 0) goto L_0x01d9
            goto L_0x0208
        L_0x0207:
            r6 = 0
        L_0x0208:
            r1 = r6
            mh0.q r1 = (mh0.C99893q) r1
            if (r1 != 0) goto L_0x020e
            goto L_0x0215
        L_0x020e:
            int r5 = r35.mo142343A2()
            r1.mo55398W(r5)
        L_0x0215:
            if (r1 != 0) goto L_0x0218
            goto L_0x0241
        L_0x0218:
            int r5 = r35.mo142345C2()
            r1.mo55399X(r5)
            goto L_0x0241
        L_0x0220:
            java.lang.String r1 = r35.mo142372o2()
            java.lang.String r5 = "cdnInfo.dataId"
            gy3.C87412m.m108593f(r1, r5)
            mh0.q r1 = r11.mo139216A(r1)
            if (r1 != 0) goto L_0x0230
            goto L_0x0237
        L_0x0230:
            int r5 = r35.mo142343A2()
            r1.mo55401Z(r5)
        L_0x0237:
            if (r1 != 0) goto L_0x023a
            goto L_0x0241
        L_0x023a:
            int r5 = r35.mo142345C2()
            r1.mo55404c0(r5)
        L_0x0241:
            int r5 = r35.getType()
            r6 = 2
            if (r6 == r5) goto L_0x028c
            java.lang.String r1 = "MicroMsg.AlbumMsgSendService"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "on cdn storage changed, but cdnInfo type is not upload, mediaId:"
            r3.append(r5)
            java.lang.String r5 = r35.mo142384y2()
            r3.append(r5)
            java.lang.String r5 = ", msgLocalId:"
            r3.append(r5)
            long r5 = r35.mo142385z2()
            r3.append(r5)
            java.lang.String r5 = ", status"
            r3.append(r5)
            int r5 = r35.getStatus()
            r3.append(r5)
            java.lang.String r5 = ", fileType: "
            r3.append(r5)
            int r5 = r35.mo142378t2()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r3)
            r0.xx0(r2, r4, r11)
            goto L_0x0ba2
        L_0x028c:
            int r5 = r2.getStatus()
            if (r5 != r3) goto L_0x02c7
            int r5 = r11.f292636h
            r14 = 102(0x66, float:1.43E-43)
            if (r5 == r14) goto L_0x02c7
            if (r1 == 0) goto L_0x02c0
            int r5 = r1.mo55392Q()
            if (r5 > 0) goto L_0x02bb
            int r5 = r1.mo55387L()
            if (r5 > 0) goto L_0x02bb
            int r5 = r1.mo55389N()
            if (r5 > 0) goto L_0x02bb
            int r5 = r1.mo55380E()
            if (r5 > 0) goto L_0x02bb
            int r5 = r1.mo55383H()
            if (r5 <= 0) goto L_0x02b9
            goto L_0x02bb
        L_0x02b9:
            r5 = 0
            goto L_0x02bc
        L_0x02bb:
            r5 = 1
        L_0x02bc:
            if (r5 != r3) goto L_0x02c0
            r5 = 1
            goto L_0x02c1
        L_0x02c0:
            r5 = 0
        L_0x02c1:
            if (r5 == 0) goto L_0x02c7
            r5 = 101(0x65, float:1.42E-43)
            r11.f292636h = r5
        L_0x02c7:
            int r5 = r35.getStatus()
            if (r5 == 0) goto L_0x0b58
            int r5 = r35.getStatus()
            if (r3 == r5) goto L_0x0b58
            int r5 = r35.getStatus()
            r14 = -1
            if (r14 != r5) goto L_0x02dc
            goto L_0x0b58
        L_0x02dc:
            long r15 = r35.mo142385z2()
            com.tencent.mm.sdk.storage.sql.SelectSql r5 = p749xh.C102653l.m135585G2(r15)
            byte[] r15 = i40.C60247c.f171776h
            monitor-enter(r15)
            f40.e r16 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0b55 }
            r16.mo121108c()     // Catch:{ all -> 0x0b55 }
            boolean r16 = r7.isAssignableFrom(r8)     // Catch:{ all -> 0x0b55 }
            if (r16 == 0) goto L_0x0b4d
            androidx.lifecycle.k0 r12 = new androidx.lifecycle.k0     // Catch:{ all -> 0x0b55 }
            f40.e r6 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0b55 }
            f40.a r6 = r6.f251755f     // Catch:{ all -> 0x0b55 }
            i40.c$a$a r9 = new i40.c$a$a     // Catch:{ all -> 0x0b55 }
            r9.<init>()     // Catch:{ all -> 0x0b55 }
            r12.<init>((androidx.lifecycle.C0123n0) r6, (androidx.lifecycle.C54209k0.C54210b) r9)     // Catch:{ all -> 0x0b55 }
            androidx.lifecycle.i0 r6 = r12.mo75002a(r8)     // Catch:{ all -> 0x0b55 }
            monitor-exit(r15)
            rh0.a r6 = (rh0.C101376a) r6
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r6.getDB()
            java.lang.Class<nh0.a> r9 = nh0.C100114a.class
            java.util.List r9 = r5.multiQuery(r6, r9)
            boolean r5 = r9.isEmpty()
            if (r5 == 0) goto L_0x033b
            java.lang.String r1 = "MicroMsg.AlbumMsgSendService"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "on cdn storage changed but cdnInfoList is empty, just return. msgLocalId: "
            r3.append(r5)
            long r5 = r35.mo142385z2()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            r0.xx0(r2, r4, r11)
            goto L_0x0ba2
        L_0x033b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r9.iterator()
        L_0x0344:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x036e
            java.lang.Object r12 = r6.next()
            r15 = r12
            nh0.a r15 = (nh0.C100114a) r15
            int r18 = r15.getStatus()
            if (r18 == 0) goto L_0x0366
            int r13 = r15.getStatus()
            if (r3 == r13) goto L_0x0366
            int r13 = r15.getStatus()
            if (r14 != r13) goto L_0x0364
            goto L_0x0366
        L_0x0364:
            r13 = 0
            goto L_0x0367
        L_0x0366:
            r13 = 1
        L_0x0367:
            if (r13 == 0) goto L_0x036c
            r5.add(r12)
        L_0x036c:
            r13 = 4
            goto L_0x0344
        L_0x036e:
            boolean r6 = r5.isEmpty()
            int r12 = r9.size()
            int r13 = r5.size()
            int r12 = r12 - r13
            float r12 = (float) r12
            int r13 = r9.size()
            float r13 = (float) r13
            float r12 = r12 / r13
            r13 = 100
            float r13 = (float) r13
            float r12 = r12 * r13
            int r12 = (int) r12
            int r14 = r11.f292637i
            if (r12 >= r14) goto L_0x038d
            goto L_0x03a0
        L_0x038d:
            int r12 = r9.size()
            int r14 = r5.size()
            int r12 = r12 - r14
            float r12 = (float) r12
            int r14 = r9.size()
            float r14 = (float) r14
            float r12 = r12 / r14
            float r12 = r12 * r13
            int r14 = (int) r12
        L_0x03a0:
            r11.f292638j = r14
            if (r1 != 0) goto L_0x03a5
            goto L_0x03ac
        L_0x03a5:
            int r12 = r1.mo55386K()
            r1.mo55401Z(r12)
        L_0x03ac:
            if (r1 != 0) goto L_0x03af
            goto L_0x03b6
        L_0x03af:
            int r12 = r1.mo55390O()
            r1.mo55407f0(r12)
        L_0x03b6:
            if (r1 != 0) goto L_0x03b9
            goto L_0x03c0
        L_0x03b9:
            int r12 = r1.mo55381F()
            r1.mo55398W(r12)
        L_0x03c0:
            if (r1 != 0) goto L_0x03c3
            goto L_0x03ca
        L_0x03c3:
            int r12 = r1.mo55393R()
            r1.mo55410i0(r12)
        L_0x03ca:
            if (r1 != 0) goto L_0x03cd
            goto L_0x03d4
        L_0x03cd:
            int r12 = r1.mo55388M()
            r1.mo55405d0(r12)
        L_0x03d4:
            if (r6 != 0) goto L_0x041a
            java.lang.String r1 = "MicroMsg.AlbumMsgSendService"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "on cdn storage changed only item finished, mediaId: "
            r3.append(r6)
            java.lang.String r6 = r35.mo142384y2()
            r3.append(r6)
            java.lang.String r6 = ", msgLocalId:"
            r3.append(r6)
            long r6 = r35.mo142385z2()
            r3.append(r6)
            java.lang.String r6 = ", cdnInfoListSize:"
            r3.append(r6)
            int r6 = r9.size()
            r3.append(r6)
            java.lang.String r6 = ", unDoInfoListSize: "
            r3.append(r6)
            int r5 = r5.size()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            r0.xx0(r2, r4, r11)
            goto L_0x0ba2
        L_0x041a:
            java.lang.String r1 = "MicroMsg.AlbumMsgSendService"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "on cdn storage change all finished, msgLocalId:"
            r5.append(r6)
            long r12 = r35.mo142385z2()
            r5.append(r12)
            java.lang.String r6 = ", allCdnInfoListSize:"
            r5.append(r6)
            int r6 = r9.size()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            java.util.Iterator r1 = r9.iterator()
        L_0x0445:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0ad0
            java.lang.Object r5 = r1.next()
            nh0.a r5 = (nh0.C100114a) r5
            java.lang.String r6 = "MicroMsg.AlbumMsgSendService"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "check dataId[%s] isThumb[%B] isMid[%B] isOrin[%B] status["
            r12.append(r13)
            int r13 = r5.getStatus()
            r12.append(r13)
            r13 = 93
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r13 = 4
            java.lang.Object[] r14 = new java.lang.Object[r13]
            java.lang.String r13 = r5.mo142372o2()
            r15 = 0
            r14[r15] = r13
            boolean r13 = r5.mo142382w2()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r14[r3] = r13
            boolean r13 = r5.mo142379u2()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r15 = 2
            r14[r15] = r13
            boolean r13 = r5.mo142381v2()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r15 = 3
            r14[r15] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r12, r14)
            int r6 = r5.mo142378t2()
            r14 = 4
            if (r6 != r14) goto L_0x071f
            java.util.List<ig.d> r6 = r10.f289364h
            java.lang.Class<rz.s> r14 = p682rz.C101488s.class
            java.util.Iterator r6 = r6.iterator()
        L_0x04a9:
            boolean r19 = r6.hasNext()
            if (r19 == 0) goto L_0x070e
            java.lang.Object r19 = r6.next()
            r13 = r19
            ig.d r13 = (p434ig.C98672d) r13
            int r19 = r13.mo55274P()
            r15 = 2
            java.lang.Object[] r12 = new java.lang.Object[r15]
            java.lang.String r15 = r13.mo55264K()
            r17 = 0
            r12[r17] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r19)
            r12[r3] = r15
            java.lang.String r15 = "MicroMsg.AlbumMsgSendService"
            java.lang.String r3 = "replaceVideoCdnInfo dataItem.getDataId:%s dataType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r3, r12)
            java.lang.String r3 = r5.mo142372o2()
            ph0.a r12 = ph0.C100792a.f295260a
            r28 = r1
            java.lang.String r1 = r13.mo55264K()
            r21 = r6
            r6 = 1
            java.lang.String r1 = r12.mo140241m(r1, r6)
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x04f4
            r6 = r21
            r1 = r28
            r3 = 1
            r15 = 3
            goto L_0x04a9
        L_0x04f4:
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r13.mo55248C()
            r17 = 0
            r1[r17] = r3
            java.lang.String r3 = r5.mo142369m2()
            r1[r6] = r3
            java.lang.String r3 = r13.mo55250D()
            r6 = 2
            r1[r6] = r3
            java.lang.String r3 = r5.mo142371o1()
            r6 = 3
            r1[r6] = r3
            long r20 = r13.mo55268M()
            java.lang.Long r3 = java.lang.Long.valueOf(r20)
            r6 = 4
            r1[r6] = r3
            int r3 = r5.mo142345C2()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 5
            r1[r6] = r3
            java.lang.String r3 = "match video, old key[%s] new key[%s], old url[%s] new url[%s], old size[%d] new size[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r3, r1)
            mh0.k r1 = mh0.C99887k.f292691d
            java.lang.String r3 = r5.mo142374q2()
            if (r3 == 0) goto L_0x06e9
            ic3.a r6 = new ic3.a
            r6.<init>()
            r6.mo141099d(r3)
            boolean r3 = r5.mo142381v2()
            java.lang.String r20 = ""
            java.lang.String r0 = "copy thumb video [%s] to [%s] result[%B]"
            r29 = r7
            java.lang.String r7 = "cdnItem.toUser"
            if (r3 == 0) goto L_0x0642
            boolean r3 = r5.mo142379u2()
            if (r3 != 0) goto L_0x0642
            java.lang.String r3 = r6.f76265u
            r13.mo55251D0(r3)
            java.lang.String r3 = r6.f76266v
            r13.mo55249C0(r3)
            int r3 = r6.f76264t
            r30 = r8
            r31 = r9
            long r8 = (long) r3
            r13.mo55269M0(r8)
            java.lang.String r3 = r6.f76263s
            if (r3 != 0) goto L_0x056d
            r3 = r20
        L_0x056d:
            r13.mo55287V0(r3)
            int r3 = r5.mo142378t2()
            r13.mo55283T0(r3)
            java.lang.String r3 = r6.f76250f
            r13.mo55297a1(r3)
            java.lang.String r3 = r6.f76251g
            r13.mo55303d1(r3)
            int r3 = r5.mo142378t2()
            r13.mo55307f1(r3)
            int r3 = r6.f76254j
            long r8 = (long) r3
            r13.mo55301c1(r8)
            java.lang.String r3 = r6.f76260p
            r13.mo55299b1(r3)
            di3.d r3 = di3.C86312j.m106911c(r14)
            rz.s r3 = (p682rz.C101488s) r3
            rz.t r3 = r3.Kj0()
            java.lang.String r8 = r6.f289279C
            hd0.o0 r3 = (hd0.C98410o0) r3
            hd0.n0 r3 = r3.mo137720f(r8)
            if (r3 == 0) goto L_0x05f6
            di3.d r8 = di3.C86312j.m106911c(r14)
            rz.s r8 = (p682rz.C101488s) r8
            rz.t r8 = r8.Kj0()
            java.lang.String r3 = r3.f288546N
            hd0.o0 r8 = (hd0.C98410o0) r8
            java.lang.String r3 = r8.mo137728q(r3)
            java.lang.String r22 = r5.mo142372o2()
            java.lang.String r8 = r5.mo142344B2()
            gy3.C87412m.m108593f(r8, r7)
            long r25 = r5.mo142385z2()
            r27 = 1
            java.lang.String r23 = "mp4"
            r21 = r12
            r24 = r8
            java.lang.String r8 = r21.mo140240l(r22, r23, r24, r25, r27)
            r9 = 1
            long r20 = com.tencent.p014mm.vfs.C86013q1.m106443d(r3, r8, r9)
            r32 = r11
            r9 = 3
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r9 = 0
            r11[r9] = r3
            r3 = 1
            r11[r3] = r8
            java.lang.Long r3 = java.lang.Long.valueOf(r20)
            r9 = 2
            r11[r9] = r3
            java.lang.String r3 = "copy origin video [%s] to [%s] result[%B]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r3, r11)
            r3 = 0
            r1.invoke(r8, r3)
            goto L_0x05f8
        L_0x05f6:
            r32 = r11
        L_0x05f8:
            java.lang.String r3 = r5.mo142372o2()
            java.lang.String r8 = "cdnItem.dataId"
            gy3.C87412m.m108593f(r3, r8)
            java.lang.String r8 = r5.mo142344B2()
            gy3.C87412m.m108593f(r8, r7)
            r11 = r10
            long r9 = r5.mo142385z2()
            java.lang.String r3 = r12.mo140247s(r3, r8, r9)
            di3.d r7 = di3.C86312j.m106911c(r14)
            rz.s r7 = (p682rz.C101488s) r7
            rz.t r7 = r7.Kj0()
            java.lang.String r8 = r6.f289279C
            hd0.o0 r7 = (hd0.C98410o0) r7
            java.lang.String r7 = r7.mo137728q(r8)
            r8 = 1
            long r9 = com.tencent.p014mm.vfs.C86013q1.m106443d(r7, r3, r8)
            r33 = r2
            r14 = 3
            java.lang.Object[] r2 = new java.lang.Object[r14]
            r14 = 0
            r2[r14] = r7
            r2[r8] = r3
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r8 = 2
            r2[r8] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r0, r2)
            r0 = 0
            r1.invoke(r3, r0)
            goto L_0x06ba
        L_0x0642:
            r33 = r2
            r30 = r8
            r31 = r9
            r32 = r11
            r11 = r10
            boolean r2 = r5.mo142379u2()
            if (r2 == 0) goto L_0x06ba
            java.lang.String r2 = r6.f76251g
            r13.mo55251D0(r2)
            java.lang.String r2 = r6.f76250f
            r13.mo55249C0(r2)
            int r2 = r6.f76254j
            long r2 = (long) r2
            r13.mo55269M0(r2)
            java.lang.String r2 = r6.f76260p
            if (r2 != 0) goto L_0x0667
            r2 = r20
        L_0x0667:
            r13.mo55287V0(r2)
            int r2 = r5.mo142378t2()
            r13.mo55283T0(r2)
            java.lang.String r22 = r5.mo142372o2()
            java.lang.String r2 = r5.mo142344B2()
            gy3.C87412m.m108593f(r2, r7)
            long r25 = r5.mo142385z2()
            r27 = 1
            java.lang.String r23 = "mp4"
            r21 = r12
            r24 = r2
            java.lang.String r2 = r21.mo140240l(r22, r23, r24, r25, r27)
            di3.d r3 = di3.C86312j.m106911c(r14)
            rz.s r3 = (p682rz.C101488s) r3
            rz.t r3 = r3.Kj0()
            java.lang.String r7 = r6.f289279C
            hd0.o0 r3 = (hd0.C98410o0) r3
            java.lang.String r3 = r3.mo137728q(r7)
            r7 = 1
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106443d(r3, r2, r7)
            r10 = 3
            java.lang.Object[] r14 = new java.lang.Object[r10]
            r10 = 0
            r14[r10] = r3
            r14[r7] = r2
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r7 = 2
            r14[r7] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r0, r14)
            r0 = 0
            r1.invoke(r2, r0)
        L_0x06ba:
            java.lang.String r0 = r6.f76252h
            if (r0 != 0) goto L_0x06c0
            java.lang.String r0 = r6.f76250f
        L_0x06c0:
            r13.mo55255F0(r0)
            java.lang.String r0 = r6.f76253i
            r13.mo55257G0(r0)
            r0 = 3
            r13.mo55337u1(r0)
            int r0 = r6.f76256l
            long r0 = (long) r0
            r13.mo55345y1(r0)
            java.lang.String r0 = r6.f289282y
            r13.mo55339v1(r0)
            long r0 = r5.mo142373p2()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x06f6
            long r0 = r5.mo142373p2()
            r13.mo55279R0(r0)
            goto L_0x06f6
        L_0x06e9:
            r33 = r2
            r29 = r7
            r30 = r8
            r31 = r9
            r32 = r11
            r2 = 0
            r11 = r10
        L_0x06f6:
            r0 = 1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r0, (int) r0)
            if (r1 != 0) goto L_0x082b
            java.lang.String r0 = r13.toString()
            int r1 = r13.mo55274P()
            java.lang.String r0 = r12.mo140231b(r0, r1)
            r13.mo55265K0(r0)
            goto L_0x082b
        L_0x070e:
            r28 = r1
            r33 = r2
            r29 = r7
            r30 = r8
            r31 = r9
            r32 = r11
            r2 = 0
            r11 = r10
            goto L_0x082b
        L_0x071f:
            r28 = r1
            r33 = r2
            r29 = r7
            r30 = r8
            r31 = r9
            r32 = r11
            r2 = 0
            r11 = r10
            boolean r0 = r5.mo142370n2()
            if (r0 == 0) goto L_0x0830
            java.util.List<ig.d> r0 = r11.f289364h
            java.util.Iterator r0 = r0.iterator()
        L_0x073a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x082b
            java.lang.Object r1 = r0.next()
            ig.d r1 = (p434ig.C98672d) r1
            int r6 = r1.mo55274P()
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r7 = r1.mo55264K()
            r9 = 0
            r8[r9] = r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 1
            r8[r7] = r6
            java.lang.String r6 = "MicroMsg.AlbumMsgSendService"
            java.lang.String r9 = "[checkUseCgi]replaceUseCgiInfo() dataItem.getDataId:%s dataType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r9, r8)
            java.lang.String r8 = r5.mo142372o2()
            ph0.a r9 = ph0.C100792a.f295260a
            java.lang.String r10 = r1.mo55264K()
            java.lang.String r10 = r9.mo140241m(r10, r7)
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0777
            goto L_0x073a
        L_0x0777:
            r8 = 6
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r8 = r1.mo55254F()
            r10 = 0
            r0[r10] = r8
            java.lang.String r8 = r5.mo142369m2()
            r0[r7] = r8
            java.lang.String r7 = r1.mo55256G()
            r8 = 2
            r0[r8] = r7
            java.lang.String r7 = r5.mo142371o1()
            r8 = 3
            r0[r8] = r7
            long r7 = r1.mo55344y0()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 4
            r0[r8] = r7
            int r7 = r5.mo142345C2()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 5
            r0[r8] = r7
            java.lang.String r7 = "[checkUseCgi]match img, old key[%s] new key[%s], old url[%s] new url[%s], old size[%d] new size[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r0)
            java.lang.String r0 = r5.mo142369m2()
            r1.mo55255F0(r0)
            java.lang.String r0 = r5.mo142371o1()
            r1.mo55257G0(r0)
            int r0 = r1.mo55274P()
            long r6 = r1.mo55268M()
            int r7 = (int) r6
            r6 = 1
            r8 = 0
            int r0 = r9.mo140236g(r0, r7, r8, r6)
            r1.mo55337u1(r0)
            boolean r0 = r5.mo142381v2()
            if (r0 == 0) goto L_0x0800
            java.lang.String r0 = r5.mo142369m2()
            r1.mo55297a1(r0)
            java.lang.String r0 = r5.mo142371o1()
            r1.mo55303d1(r0)
            int r22 = r1.mo55274P()
            long r6 = r1.mo55268M()
            int r0 = (int) r6
            r24 = 0
            r25 = 0
            r26 = 8
            r27 = 0
            r21 = r9
            r23 = r0
            int r0 = ph0.C100792a.m131981h(r21, r22, r23, r24, r25, r26, r27)
            r1.mo55307f1(r0)
        L_0x0800:
            java.lang.String r0 = r5.mo142369m2()
            r1.mo55249C0(r0)
            java.lang.String r0 = r5.mo142371o1()
            r1.mo55251D0(r0)
            int r0 = r5.mo142378t2()
            r1.mo55283T0(r0)
            r0 = 1
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r0, (int) r0)
            if (r5 != 0) goto L_0x082b
            java.lang.String r0 = r1.toString()
            int r5 = r1.mo55274P()
            java.lang.String r0 = r9.mo140231b(r0, r5)
            r1.mo55265K0(r0)
        L_0x082b:
            r5 = 1
            r8 = 2
            r10 = 4
            goto L_0x0abe
        L_0x0830:
            boolean r0 = r5.mo142379u2()
            if (r0 == 0) goto L_0x0925
            boolean r0 = r5.mo142381v2()
            if (r0 == 0) goto L_0x0925
            java.util.List<ig.d> r0 = r11.f289364h
            java.util.Iterator r0 = r0.iterator()
        L_0x0842:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x082b
            java.lang.Object r1 = r0.next()
            ig.d r1 = (p434ig.C98672d) r1
            int r6 = r1.mo55274P()
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r7 = r1.mo55264K()
            r9 = 0
            r8[r9] = r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 1
            r8[r7] = r6
            java.lang.String r6 = "MicroMsg.AlbumMsgSendService"
            java.lang.String r9 = "replaceOriMidCdnInfo dataItem.getDataId:%s dataType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r9, r8)
            java.lang.String r8 = r5.mo142372o2()
            ph0.a r9 = ph0.C100792a.f295260a
            java.lang.String r10 = r1.mo55264K()
            java.lang.String r10 = r9.mo140241m(r10, r7)
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0880
            goto L_0x0842
        L_0x0880:
            r8 = 5
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r8 = r1.mo55296a0()
            r10 = 0
            r0[r10] = r8
            java.lang.String r8 = r5.mo142369m2()
            r0[r7] = r8
            java.lang.String r7 = r1.mo55302d0()
            r8 = 2
            r0[r8] = r7
            java.lang.String r7 = r5.mo142371o1()
            r8 = 3
            r0[r8] = r7
            int r7 = r5.mo142345C2()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 4
            r0[r8] = r7
            java.lang.String r7 = "match ori mid, old key[%s] new key[%s], old url[%s] new url[%s], new size[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r0)
            java.lang.String r0 = r5.mo142369m2()
            r1.mo55249C0(r0)
            java.lang.String r0 = r5.mo142371o1()
            r1.mo55251D0(r0)
            int r0 = r5.mo142378t2()
            r1.mo55283T0(r0)
            java.lang.String r0 = r5.mo142369m2()
            r1.mo55297a1(r0)
            java.lang.String r0 = r5.mo142371o1()
            r1.mo55303d1(r0)
            int r21 = r1.mo55274P()
            long r6 = r1.mo55268M()
            int r0 = (int) r6
            r23 = 0
            r24 = 0
            r25 = 8
            r26 = 0
            r20 = r9
            r22 = r0
            int r0 = ph0.C100792a.m131981h(r20, r21, r22, r23, r24, r25, r26)
            r1.mo55307f1(r0)
            java.lang.String r0 = r5.mo142369m2()
            r1.mo55255F0(r0)
            java.lang.String r0 = r5.mo142371o1()
            r1.mo55257G0(r0)
            int r0 = r1.mo55274P()
            long r5 = r1.mo55268M()
            int r6 = (int) r5
            r5 = 1
            r7 = 0
            int r0 = r9.mo140236g(r0, r6, r7, r5)
            r1.mo55337u1(r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r5, (int) r5)
            if (r0 != 0) goto L_0x082b
            java.lang.String r0 = r1.toString()
            int r5 = r1.mo55274P()
            java.lang.String r0 = r9.mo140231b(r0, r5)
            r1.mo55265K0(r0)
            goto L_0x082b
        L_0x0925:
            boolean r0 = r5.mo142379u2()
            if (r0 == 0) goto L_0x09f0
            boolean r0 = r5.mo142381v2()
            if (r0 != 0) goto L_0x09f0
            java.util.List<ig.d> r0 = r11.f289364h
            java.util.Iterator r0 = r0.iterator()
        L_0x0937:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x082b
            java.lang.Object r1 = r0.next()
            ig.d r1 = (p434ig.C98672d) r1
            int r6 = r1.mo55274P()
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r7 = r1.mo55264K()
            r9 = 0
            r8[r9] = r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 1
            r8[r7] = r6
            java.lang.String r6 = "MicroMsg.AlbumMsgSendService"
            java.lang.String r9 = "replaceMidCdnInfo dataItem.getDataId:%s dataType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r9, r8)
            java.lang.String r8 = r5.mo142372o2()
            ph0.a r9 = ph0.C100792a.f295260a
            java.lang.String r10 = r1.mo55264K()
            java.lang.String r10 = r9.mo140241m(r10, r7)
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0975
            goto L_0x0937
        L_0x0975:
            r8 = 5
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r8 = r1.mo55296a0()
            r10 = 0
            r0[r10] = r8
            java.lang.String r8 = r5.mo142369m2()
            r0[r7] = r8
            java.lang.String r7 = r1.mo55302d0()
            r8 = 2
            r0[r8] = r7
            java.lang.String r7 = r5.mo142371o1()
            r8 = 3
            r0[r8] = r7
            int r7 = r5.mo142345C2()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 4
            r0[r8] = r7
            java.lang.String r7 = "match mid, old key[%s] new key[%s], old url[%s] new url[%s], new size[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r0)
            java.lang.String r0 = r5.mo142369m2()
            r1.mo55249C0(r0)
            java.lang.String r0 = r5.mo142371o1()
            r1.mo55251D0(r0)
            int r0 = r5.mo142378t2()
            r1.mo55283T0(r0)
            java.lang.String r0 = r5.mo142369m2()
            r1.mo55255F0(r0)
            java.lang.String r0 = r5.mo142371o1()
            r1.mo55257G0(r0)
            int r0 = r1.mo55274P()
            long r5 = r1.mo55268M()
            int r6 = (int) r5
            r5 = 1
            r7 = 0
            int r0 = r9.mo140236g(r0, r6, r7, r5)
            r1.mo55337u1(r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r5, (int) r5)
            if (r0 != 0) goto L_0x082b
            java.lang.String r0 = r1.toString()
            int r5 = r1.mo55274P()
            java.lang.String r0 = r9.mo140231b(r0, r5)
            r1.mo55265K0(r0)
            goto L_0x082b
        L_0x09f0:
            boolean r0 = r5.mo142381v2()
            if (r0 == 0) goto L_0x082b
            java.util.List<ig.d> r0 = r11.f289364h
            java.util.Iterator r0 = r0.iterator()
        L_0x09fc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x082b
            java.lang.Object r1 = r0.next()
            ig.d r1 = (p434ig.C98672d) r1
            int r6 = r1.mo55274P()
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r7 = r1.mo55264K()
            r9 = 0
            r8[r9] = r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 1
            r8[r7] = r6
            java.lang.String r6 = "MicroMsg.AlbumMsgSendService"
            java.lang.String r9 = "replaceOtherCdnInfo dataItem.getDataId:%s dataType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r9, r8)
            java.lang.String r8 = r5.mo142372o2()
            ph0.a r9 = ph0.C100792a.f295260a
            java.lang.String r10 = r1.mo55264K()
            java.lang.String r10 = r9.mo140241m(r10, r7)
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0a3a
            goto L_0x09fc
        L_0x0a3a:
            r8 = 6
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r8 = r1.mo55248C()
            r10 = 0
            r0[r10] = r8
            java.lang.String r8 = r5.mo142369m2()
            r0[r7] = r8
            java.lang.String r7 = r1.mo55250D()
            r8 = 2
            r0[r8] = r7
            java.lang.String r7 = r5.mo142371o1()
            r10 = 3
            r0[r10] = r7
            long r12 = r1.mo55268M()
            java.lang.Long r7 = java.lang.Long.valueOf(r12)
            r10 = 4
            r0[r10] = r7
            int r7 = r5.mo142345C2()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12 = 5
            r0[r12] = r7
            java.lang.String r7 = "match other, old key[%s] new key[%s], old url[%s] new url[%s], old size[%d] new size[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r0)
            java.lang.String r0 = r5.mo142369m2()
            r1.mo55249C0(r0)
            java.lang.String r0 = r5.mo142371o1()
            r1.mo55251D0(r0)
            int r0 = r5.mo142378t2()
            r1.mo55283T0(r0)
            java.lang.String r0 = r5.mo142369m2()
            r1.mo55255F0(r0)
            java.lang.String r0 = r5.mo142371o1()
            r1.mo55257G0(r0)
            int r0 = r1.mo55274P()
            long r5 = r1.mo55268M()
            int r6 = (int) r5
            r5 = 1
            r7 = 0
            int r0 = r9.mo140236g(r0, r6, r7, r5)
            r1.mo55337u1(r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r5, (int) r5)
            if (r0 != 0) goto L_0x0abe
            java.lang.String r0 = r1.toString()
            int r6 = r1.mo55274P()
            java.lang.String r0 = r9.mo140231b(r0, r6)
            r1.mo55265K0(r0)
        L_0x0abe:
            r0 = r34
            r10 = r11
            r1 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r11 = r32
            r2 = r33
            r3 = 1
            goto L_0x0445
        L_0x0ad0:
            r33 = r2
            r29 = r7
            r30 = r8
            r31 = r9
            r32 = r11
            r11 = r10
            java.lang.String r0 = r11.mo141118z()
            r4.mo55243V(r0)
            r6 = 1
            r1 = r34
            r3 = r4
            r4 = r11
            r5 = r32
            r1.wx0(r2, r3, r4, r5, r6)
            java.util.Iterator r0 = r31.iterator()
        L_0x0af0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0b43
            java.lang.Object r1 = r0.next()
            nh0.a r1 = (nh0.C100114a) r1
            r2 = 0
            com.tencent.mm.sdk.storage.executor.DeleteExecutor r1 = p749xh.C102653l.m135586l2(r1, r2)
            byte[] r2 = i40.C60247c.f171776h
            monitor-enter(r2)
            f40.e r3 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0b40 }
            r3.mo121108c()     // Catch:{ all -> 0x0b40 }
            r3 = r29
            r4 = r30
            boolean r5 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x0b40 }
            if (r5 == 0) goto L_0x0b38
            androidx.lifecycle.k0 r5 = new androidx.lifecycle.k0     // Catch:{ all -> 0x0b40 }
            f40.e r6 = f40.C86709a0.m107523b()     // Catch:{ all -> 0x0b40 }
            f40.a r6 = r6.f251755f     // Catch:{ all -> 0x0b40 }
            i40.c$a$a r7 = new i40.c$a$a     // Catch:{ all -> 0x0b40 }
            r7.<init>()     // Catch:{ all -> 0x0b40 }
            r5.<init>((androidx.lifecycle.C0123n0) r6, (androidx.lifecycle.C54209k0.C54210b) r7)     // Catch:{ all -> 0x0b40 }
            androidx.lifecycle.i0 r5 = r5.mo75002a(r4)     // Catch:{ all -> 0x0b40 }
            monitor-exit(r2)
            rh0.a r5 = (rh0.C101376a) r5
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r5.getDB()
            r1.execute(r2)
            r29 = r3
            r30 = r4
            goto L_0x0af0
        L_0x0b38:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0b40 }
            java.lang.String r1 = "getLiveDB modelClass must extends BaseMvvmDB"
            r0.<init>(r1)     // Catch:{ all -> 0x0b40 }
            throw r0     // Catch:{ all -> 0x0b40 }
        L_0x0b40:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0b43:
            r1 = 0
            r0 = r34
            r0.mo106377PI(r1)
            r1 = 0
            r0.f292656d = r1
            goto L_0x0ba2
        L_0x0b4d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0b55 }
            java.lang.String r1 = "getLiveDB modelClass must extends BaseMvvmDB"
            r0.<init>(r1)     // Catch:{ all -> 0x0b55 }
            throw r0     // Catch:{ all -> 0x0b55 }
        L_0x0b55:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0b58:
            r33 = r2
            r32 = r11
            java.lang.String r1 = "MicroMsg.AlbumMsgSendService"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "on cdn storage changed, but not care status: "
            r2.append(r3)
            int r3 = r35.getStatus()
            r2.append(r3)
            java.lang.String r3 = ", mediaid: "
            r2.append(r3)
            java.lang.String r3 = r35.mo142384y2()
            r2.append(r3)
            java.lang.String r3 = ", msgLocalId: "
            r2.append(r3)
            long r5 = r35.mo142385z2()
            r2.append(r5)
            java.lang.String r3 = ", fileType: "
            r2.append(r3)
            int r3 = r35.mo142378t2()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r2)
            r2 = r32
            r1 = r33
            r0.xx0(r1, r4, r2)
        L_0x0ba2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mh0.C99879i.vx0(mh0.i, nh0.a):void");
    }

    /* renamed from: PI */
    public void mo106377PI(C72963f4 f4Var) {
        C86709a0.m107525e().postToWorker(new C99888l(f4Var, this, false));
    }

    public void ao0(C72963f4 f4Var) {
        mo106377PI(f4Var);
        this.f292656d = false;
    }

    public void run() {
        mo106377PI((C72963f4) null);
    }

    public void stop() {
        Log.m105924i("MicroMsg.AlbumMsgSendService", "stop");
        this.f292659g.clear();
        this.f292658f.clear();
        this.f292656d = false;
        this.f292661i.mo140621c();
        C102653l.f302539U0.removeObserver(this.f292662j);
    }

    public void v90(C72963f4 f4Var) {
        C39622i0 a;
        C39622i0 a2;
        Class<C60247c> cls = C60247c.class;
        Class cls2 = C101376a.class;
        Class cls3 = C99895t.class;
        Class cls4 = C99864d.class;
        C98597b.C60245a aVar = C98597b.f289091e;
        C7335d c = C86312j.m106911c(cls4);
        C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
        C99895t tVar = (C99895t) aVar.mo85231a((C98598e) c, cls3);
        long j = 0;
        SelectSql G2 = C102653l.m135585G2(f4Var != null ? f4Var.getMsgId() : 0);
        byte[] bArr = C60247c.f171776h;
        synchronized (bArr) {
            C86709a0.m107523b().mo121108c();
            if (cls.isAssignableFrom(cls2)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls2);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        List<C100114a> multiQuery = G2.multiQuery(((C101376a) a).getDB(), C100114a.class);
        C7335d c2 = C86312j.m106911c(cls4);
        C87412m.m108593f(c2, "getService(AlbumFeatureService::class.java)");
        C99895t tVar2 = (C99895t) aVar.mo85231a((C98598e) c2, cls3);
        Long valueOf = f4Var != null ? Long.valueOf(f4Var.getMsgId()) : null;
        if (valueOf != null) {
            valueOf.longValue();
            DeleteSql build = C102653l.f302517C.delete().where(C102653l.f302518D.equal((Number) Long.valueOf(valueOf.longValue()))).build();
            synchronized (bArr) {
                C86709a0.m107523b().mo121108c();
                if (cls.isAssignableFrom(cls2)) {
                    a2 = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls2);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            build.run(((C101376a) a2).getDB());
        }
        for (C100114a a3 : multiQuery) {
            this.f292661i.mo139220a(a3);
        }
        C101480j jVar = (C101480j) C86312j.m106911c(C101480j.class);
        if (f4Var != null) {
            j = f4Var.getMsgId();
        }
        jVar.d30(j);
        mo106377PI((C72963f4) null);
        this.f292656d = false;
    }

    public final void wx0(C72963f4 f4Var, C98671a aVar, C98674g gVar, C99862a aVar2, boolean z) {
        Class cls = C98201k.class;
        Class cls2 = C53543s.class;
        Class cls3 = C75700k0.class;
        if (9 == f4Var.getStatus()) {
            Log.m105928w("MicroMsg.AlbumMsgSendService", "doSendContinue cancel, because send album is paused, msg_localId:" + f4Var.getMsgId());
            xx0(f4Var, aVar, aVar2);
            mo106377PI((C72963f4) null);
            this.f292656d = false;
            return;
        }
        if (aVar2 != null) {
            aVar2.mo55374M(100);
        }
        if (aVar2 != null) {
            aVar2.mo55372K(aVar2.mo55368G());
        }
        if (aVar2 != null) {
            aVar2.mo55373L(103);
        }
        xx0(f4Var, aVar, aVar2);
        Log.m105924i("MicroMsg.AlbumMsgSendService", "[album] update msg content, msgId: " + f4Var.getMsgId() + " , afterCdnUpload " + z + ", toUser:" + f4Var.mo108768t());
        f4Var.mo108732L2(aVar.mo141118z());
        f4Var.mo100991d(2);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls3)).mo96095LE()).xy0(f4Var.getMsgId(), f4Var);
        C68070l a0 = ((C96776s) ((C53543s) C86312j.m106911c(cls2)).mo74023HM()).mo135038a0(f4Var.getMsgId());
        if (a0 != null) {
            a0.field_xml = f4Var.getContent();
            ((C96776s) ((C53543s) C86312j.m106911c(cls2)).mo74023HM()).mo135037Lo(a0, new String[]{"msgId"});
        }
        this.f292658f.remove(Long.valueOf(f4Var.getMsgId()));
        C92836k nP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127194nP(Long.valueOf(f4Var.getMsgId()));
        nP.mo127153x(1);
        nP.mo127126C((int) C100792a.f295260a.mo140253y(gVar));
        if (((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).Dx0(Long.valueOf(f4Var.getMsgId()), nP) < 0) {
            Log.m105924i("MicroMsg.AlbumMsgSendService", "doSendContinue, update imgInfo failed[step 1]");
        }
        if (f4Var.getCreateTime() + ((long) (this.f292660h * 24 * 3600 * 1000)) < C31543z5.m39453c()) {
            Log.m105924i("MicroMsg.AlbumMsgSendService", "doSendContinue, out of wait time, " + f4Var.getCreateTime());
            f4Var.mo100991d(5);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls3)).mo96095LE()).xy0(f4Var.getMsgId(), f4Var);
            return;
        }
        C80996q.C1279a.m1369a().Je0(f4Var, aVar, new C99883d(f4Var));
    }

    public final void xx0(C72963f4 f4Var, C98671a aVar, C99862a aVar2) {
        C98597b.C60245a aVar3 = C98597b.f289091e;
        C7335d c = C86312j.m106911c(C99864d.class);
        C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
        ((C99865e0) aVar3.mo85231a((C98598e) c, C99865e0.class)).mo139218j3(aVar2, f4Var, true);
    }
}
