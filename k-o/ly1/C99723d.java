package ly1;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import f40.C86718e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONObject;
import p823sg.C77710q;
import vw1.C102299l;
import vw1.C53025p;
import vw1.C53026q;

/* renamed from: ly1.d */
public class C99723d {

    /* renamed from: n */
    public static final String f292265n;

    /* renamed from: o */
    public static final String f292266o;

    /* renamed from: p */
    public static C99723d f292267p;

    /* renamed from: a */
    public Object f292268a = new Object();

    /* renamed from: b */
    public final HashMap<String, C99726c> f292269b = new HashMap<>();

    /* renamed from: c */
    public C53026q f292270c;

    /* renamed from: d */
    public LinkedList<C102299l> f292271d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C102299l> f292272e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C102299l> f292273f = new LinkedList<>();

    /* renamed from: g */
    public boolean f292274g = false;

    /* renamed from: h */
    public String f292275h = MultiProcessMMKV.getMMKV(m130164b("game_haowan_mmkv_key")).getString("game_remote_ticket", (String) null);

    /* renamed from: i */
    public long f292276i = MultiProcessMMKV.getMMKV(m130164b("game_haowan_mmkv_key")).getLong("game_local_ticket", 0);

    /* renamed from: j */
    public int f292277j;

    /* renamed from: k */
    public boolean f292278k;

    /* renamed from: l */
    public C99727d f292279l = null;

    /* renamed from: m */
    public int f292280m = 0;

    /* renamed from: ly1.d$a */
    public class C99724a implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C53025p f292281a;

        /* renamed from: b */
        public final /* synthetic */ WeakReference f292282b;

        public C99724a(C53025p pVar, WeakReference weakReference) {
            this.f292281a = pVar;
            this.f292282b = weakReference;
        }

        /* JADX WARNING: Removed duplicated region for block: B:76:0x03bc  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x03bf  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo288a(int r31, int r32, java.lang.String r33, ob0.C47350c r34) {
            /*
                r30 = this;
                r0 = r30
                r1 = 2
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r31)
                r4 = 0
                r2[r4] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r32)
                r5 = 1
                r2[r5] = r3
                java.lang.String r3 = "MicroMsg.GameHaowanDataCenter"
                java.lang.String r6 = "errType = %d, errCode = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r2)
                vw1.p r2 = r0.f292281a
                long r6 = r2.f148009d
                r8 = 0
                int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r2 != 0) goto L_0x0032
                ly1.d r2 = ly1.C99723d.this
                java.util.LinkedList<vw1.l> r2 = r2.f292271d
                r2.clear()
                ly1.d r2 = ly1.C99723d.this
                java.util.LinkedList<vw1.l> r2 = r2.f292272e
                r2.clear()
            L_0x0032:
                ly1.d r2 = ly1.C99723d.this
                java.util.LinkedList<vw1.l> r2 = r2.f292271d
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)
                if (r2 != 0) goto L_0x0047
                ly1.d r2 = ly1.C99723d.this
                java.util.LinkedList<vw1.l> r2 = r2.f292271d
                java.lang.Object r2 = r2.getLast()
                vw1.l r2 = (vw1.C102299l) r2
                goto L_0x0048
            L_0x0047:
                r2 = 0
            L_0x0048:
                if (r2 == 0) goto L_0x0050
                long r6 = r2.f301304p
                r10 = 1
                long r6 = r6 - r10
                goto L_0x0054
            L_0x0050:
                long r6 = java.lang.System.currentTimeMillis()
            L_0x0054:
                r12 = r6
                if (r31 != 0) goto L_0x04c6
                if (r32 != 0) goto L_0x04c6
                ly1.d r2 = ly1.C99723d.this
                r6 = r34
                ob0.c$d r6 = r6.f127056b
                pe3.a r6 = r6.f127083a
                vw1.q r6 = (vw1.C53026q) r6
                r2.f292270c = r6
                java.lang.Object[] r2 = new java.lang.Object[r5]
                int r6 = r6.f148020o
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r2[r4] = r6
                java.lang.String r6 = "new_count = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r2)
                ly1.d r2 = ly1.C99723d.this
                vw1.q r3 = r2.f292270c
                r2.getClass()
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                r6 = 1000(0x3e8, double:4.94E-321)
                if (r3 == 0) goto L_0x00f0
                java.util.LinkedList<vw1.e0> r10 = r3.f148017i
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r10)
                if (r10 == 0) goto L_0x008e
                goto L_0x00f0
            L_0x008e:
                r10 = 0
            L_0x008f:
                java.util.LinkedList<vw1.e0> r11 = r3.f148017i
                int r11 = r11.size()
                if (r10 >= r11) goto L_0x00f0
                java.util.LinkedList<vw1.e0> r11 = r3.f148017i
                java.lang.Object r11 = r11.get(r10)
                vw1.e0 r11 = (vw1.C53012e0) r11
                vw1.l r14 = new vw1.l
                r14.<init>()
                r14.f301295d = r4
                vw1.f0 r15 = r11.f147942g
                java.lang.String r1 = r15.f147962d
                r14.f301300i = r1
                java.lang.String r1 = r15.f147963e
                r14.f301299h = r1
                java.lang.String r1 = r15.f147966h
                r14.f301301j = r1
                long r4 = r11.f147940e
                long r4 = r4 * r6
                r14.f301304p = r4
                vw1.j r4 = r11.f147944i
                if (r4 == 0) goto L_0x00c6
                java.lang.String r5 = r4.f147999d
                r14.f301302n = r5
                java.lang.String r4 = r4.f148000e
                r14.f301313y = r4
            L_0x00c6:
                java.util.LinkedList<vw1.c0> r4 = r11.f147943h
                r14.f301303o = r4
                int r4 = r15.f147967i
                long r4 = (long) r4
                r14.f301305q = r4
                java.lang.String r4 = r11.f147939d
                r14.f301312x = r4
                vw1.g0 r4 = r11.f147938C
                r14.f301314z = r4
                vw1.k r4 = r11.f147941f
                if (r4 == 0) goto L_0x00e7
                java.lang.String r5 = r4.f148001d
                r14.f301307s = r5
                java.lang.String r5 = r4.f148002e
                r14.f301308t = r5
                int r4 = r4.f148003f
                r14.f301309u = r4
            L_0x00e7:
                r2.add(r14)
                int r10 = r10 + 1
                r1 = 2
                r4 = 0
                r5 = 1
                goto L_0x008f
            L_0x00f0:
                vw1.p r3 = r0.f292281a
                long r3 = r3.f148009d
                int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r5 != 0) goto L_0x0156
                ly1.d r3 = ly1.C99723d.this
                vw1.q r4 = r3.f292270c
                int r4 = r4.f148020o
                int r5 = r3.mo139080f()
                int r4 = r4 + r5
                r3.f292277j = r4
                ly1.d r3 = ly1.C99723d.this
                vw1.q r4 = r3.f292270c
                int r4 = r4.f148019n
                r3.getClass()
                ly1.r r17 = ly1.C99769r.m130217b()
                java.util.LinkedList r18 = r3.mo139079e()
                long r19 = java.lang.System.currentTimeMillis()
                r21 = 0
                r17.mo139131a(r18, r19, r21)
                r3.getClass()
                ly1.d r3 = ly1.C99723d.this
                vw1.q r4 = r3.f292270c
                java.lang.String r4 = r4.f148018j
                r3.getClass()
                java.lang.String r3 = "game_haowan_mmkv_key"
                java.lang.String r5 = ly1.C99723d.m130164b(r3)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r5)
                java.lang.String r10 = "game_remote_ticket"
                r5.putString(r10, r4)
                r5.apply()
                ly1.d r4 = ly1.C99723d.this
                long r10 = java.lang.System.currentTimeMillis()
                r4.getClass()
                java.lang.String r3 = ly1.C99723d.m130164b(r3)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r3)
                java.lang.String r4 = "game_local_ticket"
                r3.putLong(r4, r10)
                r3.apply()
            L_0x0156:
                ly1.d r3 = ly1.C99723d.this
                vw1.q r3 = r3.f292270c
                boolean r4 = r3.f148015g
                if (r4 == 0) goto L_0x0178
                java.util.LinkedList<vw1.e0> r3 = r3.f148017i
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
                if (r3 != 0) goto L_0x0178
                ly1.d r3 = ly1.C99723d.this
                vw1.q r3 = r3.f292270c
                java.util.LinkedList<vw1.e0> r3 = r3.f148017i
                java.lang.Object r3 = r3.getLast()
                vw1.e0 r3 = (vw1.C53012e0) r3
                long r3 = r3.f147940e
                long r3 = r3 * r6
                r14 = r3
                goto L_0x0179
            L_0x0178:
                r14 = r8
            L_0x0179:
                ly1.d r3 = ly1.C99723d.this
                r3.getClass()
                ly1.r r10 = ly1.C99769r.m130217b()
                java.util.LinkedList r11 = r3.mo139079e()
                r10.getClass()
                java.util.LinkedList r4 = new java.util.LinkedList
                r4.<init>()
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r11)
                r1 = 5
                r6 = 3
                if (r5 == 0) goto L_0x019a
            L_0x0196:
                r24 = r2
                goto L_0x0265
            L_0x019a:
                android.content.ContentResolver r5 = r10.f292413a
                android.net.Uri r20 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
                java.lang.String r21 = "_data"
                java.lang.String r22 = "datetaken"
                java.lang.String r23 = "date_modified"
                java.lang.String r24 = "duration"
                java.lang.String r25 = "description"
                java.lang.String r26 = "mime_type"
                java.lang.String r27 = "title"
                java.lang.String r28 = "_size"
                java.lang.String r29 = "bucket_display_name"
                java.lang.String[] r21 = new java.lang.String[]{r21, r22, r23, r24, r25, r26, r27, r28, r29}
                java.lang.String r22 = r10.mo139132c(r11, r12, r14)
                r23 = 0
                java.lang.String r24 = "datetaken desc"
                r19 = r5
                android.database.Cursor r5 = r19.query(r20, r21, r22, r23, r24)
                if (r5 != 0) goto L_0x01c7
                goto L_0x0196
            L_0x01c7:
                boolean r7 = r5.moveToNext()
                if (r7 == 0) goto L_0x0260
                r7 = 0
                java.lang.String r10 = r5.getString(r7)
                r11 = 1
                java.lang.String r12 = r5.getString(r11)
                long r11 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r12, r8)
                r13 = 2
                java.lang.String r14 = r5.getString(r13)
                long r13 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r14, r8)
                java.lang.String r15 = r5.getString(r6)
                long r6 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r15, r8)
                r15 = 4
                java.lang.String r19 = r5.getString(r15)
                java.lang.String r20 = r5.getString(r1)
                r1 = 6
                java.lang.String r21 = r5.getString(r1)
                r1 = 7
                java.lang.String r15 = r5.getString(r1)
                r24 = r2
                long r1 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r15, r8)
                r15 = 8
                java.lang.String r8 = r5.getString(r15)
                r9 = 9
                java.lang.Object[] r9 = new java.lang.Object[r9]
                r28 = 0
                r9[r28] = r10
                java.lang.Long r29 = java.lang.Long.valueOf(r11)
                r16 = 1
                r9[r16] = r29
                java.lang.Long r13 = java.lang.Long.valueOf(r13)
                r14 = 2
                r9[r14] = r13
                java.lang.Long r13 = java.lang.Long.valueOf(r6)
                r14 = 3
                r9[r14] = r13
                r13 = 4
                r9[r13] = r19
                r13 = 5
                r9[r13] = r20
                r13 = 6
                r9[r13] = r21
                java.lang.Long r13 = java.lang.Long.valueOf(r1)
                r14 = 7
                r9[r14] = r13
                r9[r15] = r8
                java.lang.String r13 = "MicroMsg.GameLocalVideoQuery"
                java.lang.String r14 = "mediaPath = %s, takenDate = %d, modifiedDate = %d, duration = %d, description = %s, mimeType = %s, title = %s, size = %d, bucketName = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r9)
                vw1.l r9 = new vw1.l
                r9.<init>()
                r13 = 1
                r9.f301295d = r13
                r9.f301304p = r11
                r9.f301300i = r10
                r9.f301305q = r6
                r9.f301306r = r1
                r9.f301311w = r8
                r4.add(r9)
                r2 = r24
                r1 = 5
                r6 = 3
                r8 = 0
                goto L_0x01c7
            L_0x0260:
                r24 = r2
                r5.close()
            L_0x0265:
                java.util.Iterator r1 = r4.iterator()
            L_0x0269:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x02b6
                java.lang.Object r2 = r1.next()
                vw1.l r2 = (vw1.C102299l) r2
                long r5 = r2.f301305q
                r7 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 / r7
                r2.f301305q = r5
                java.util.Locale r9 = java.util.Locale.CHINA
                r10 = 2
                java.lang.Object[] r11 = new java.lang.Object[r10]
                r12 = 60
                long r5 = r5 / r12
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r6 = 0
                r11[r6] = r5
                long r14 = r2.f301305q
                long r14 = r14 % r12
                java.lang.Long r6 = java.lang.Long.valueOf(r14)
                r10 = 1
                r11[r10] = r6
                java.lang.String r6 = "%d:%02d"
                java.lang.String r6 = java.lang.String.format(r9, r6, r11)
                r2.f301302n = r6
                java.util.HashMap<java.lang.String, ly1.d$c> r6 = r3.f292269b
                java.lang.String r9 = r2.f301311w
                java.lang.Object r6 = r6.get(r9)
                ly1.d$c r6 = (ly1.C99723d.C99726c) r6
                if (r6 == 0) goto L_0x0269
                java.lang.String r9 = r6.f292284a
                r2.f301307s = r9
                java.lang.String r9 = r6.f292285b
                r2.f301308t = r9
                java.lang.String r6 = r6.f292287d
                r2.f301301j = r6
                goto L_0x0269
            L_0x02b6:
                java.util.LinkedList r1 = new java.util.LinkedList
                r1.<init>()
                r2 = r24
                r1.addAll(r2)
                r1.addAll(r4)
                ly1.d r2 = ly1.C99723d.this
                r2.getClass()
                ly1.f r3 = new ly1.f
                r3.<init>(r2)
                java.util.Collections.sort(r1, r3)
                ly1.d r2 = ly1.C99723d.this
                r2.f292273f = r1
                java.util.LinkedList<vw1.l> r2 = r2.f292272e
                r2.addAll(r1)
                ly1.d r2 = ly1.C99723d.this
                r2.getClass()
                java.util.Iterator r1 = r1.iterator()
            L_0x02e2:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0462
                java.lang.Object r3 = r1.next()
                vw1.l r3 = (vw1.C102299l) r3
                long r6 = r3.f301304p
                java.util.GregorianCalendar r4 = new java.util.GregorianCalendar
                r4.<init>()
                r4.setTimeInMillis(r6)
                java.util.GregorianCalendar r8 = new java.util.GregorianCalendar
                r8.<init>()
                r9 = 1
                int r10 = r8.get(r9)
                r11 = 2
                int r12 = r8.get(r11)
                int r12 = r12 + r9
                r9 = 3
                int r13 = r8.get(r9)
                java.util.GregorianCalendar r9 = new java.util.GregorianCalendar
                int r14 = r8.get(r11)
                r11 = 5
                int r8 = r8.get(r11)
                r9.<init>(r10, r14, r8)
                long r8 = r9.getTimeInMillis()
                long r8 = r8 - r6
                java.lang.String r6 = "6"
                java.lang.String r7 = "7"
                java.lang.String r14 = "_"
                java.lang.String r15 = "8"
                java.lang.String r5 = "9"
                r17 = 0
                int r19 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
                if (r19 > 0) goto L_0x0338
                ly1.d$d r4 = new ly1.d$d
                r4.<init>(r5)
            L_0x0335:
                r8 = 3
                goto L_0x03ad
            L_0x0338:
                r19 = 86400000(0x5265c00, double:4.2687272E-316)
                int r21 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
                if (r21 > 0) goto L_0x0345
                ly1.d$d r4 = new ly1.d$d
                r4.<init>(r15)
                goto L_0x0335
            L_0x0345:
                r8 = 1
                int r9 = r4.get(r8)
                r11 = 2
                int r16 = r4.get(r11)
                int r11 = r16 + 1
                r8 = 3
                if (r9 != r10) goto L_0x0368
                int r4 = r4.get(r8)
                if (r4 != r13) goto L_0x0360
                ly1.d$d r4 = new ly1.d$d
                r4.<init>(r7)
                goto L_0x03ad
            L_0x0360:
                if (r11 != r12) goto L_0x0368
                ly1.d$d r4 = new ly1.d$d
                r4.<init>(r6)
                goto L_0x03ad
            L_0x0368:
                r4 = 10
                if (r11 >= r4) goto L_0x038e
                ly1.d$d r4 = new ly1.d$d
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r9 = java.lang.String.valueOf(r9)
                r10.append(r9)
                java.lang.String r9 = "_0"
                r10.append(r9)
                java.lang.String r9 = java.lang.String.valueOf(r11)
                r10.append(r9)
                java.lang.String r9 = r10.toString()
                r4.<init>(r9)
                goto L_0x03ad
            L_0x038e:
                ly1.d$d r4 = new ly1.d$d
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r9 = java.lang.String.valueOf(r9)
                r10.append(r9)
                r10.append(r14)
                java.lang.String r9 = java.lang.String.valueOf(r11)
                r10.append(r9)
                java.lang.String r9 = r10.toString()
                r4.<init>(r9)
            L_0x03ad:
                ly1.d$d r9 = r2.f292279l
                if (r9 == 0) goto L_0x03bf
                java.lang.String r9 = r9.f292288a
                java.lang.String r10 = r4.f292288a
                boolean r9 = r9.equals(r10)
                if (r9 != 0) goto L_0x03bc
                goto L_0x03bf
            L_0x03bc:
                r13 = 2
                goto L_0x0459
            L_0x03bf:
                vw1.l r9 = new vw1.l
                r9.<init>()
                r10 = 1
                r9.f301296e = r10
                java.lang.String r10 = r4.f292288a
                boolean r5 = r10.equals(r5)
                if (r5 == 0) goto L_0x03db
                android.content.res.Resources r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                r6 = 2131830960(0x7f1128b0, float:1.9294932E38)
                java.lang.String r5 = r5.getString(r6)
                goto L_0x0410
            L_0x03db:
                boolean r5 = r10.equals(r15)
                if (r5 == 0) goto L_0x03ed
                android.content.res.Resources r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                r6 = 2131830963(0x7f1128b3, float:1.9294938E38)
                java.lang.String r5 = r5.getString(r6)
                goto L_0x0410
            L_0x03ed:
                boolean r5 = r10.equals(r7)
                if (r5 == 0) goto L_0x03ff
                android.content.res.Resources r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                r6 = 2131830958(0x7f1128ae, float:1.9294928E38)
                java.lang.String r5 = r5.getString(r6)
                goto L_0x0410
            L_0x03ff:
                boolean r5 = r10.equals(r6)
                if (r5 == 0) goto L_0x0413
                android.content.res.Resources r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                r6 = 2131830957(0x7f1128ad, float:1.9294926E38)
                java.lang.String r5 = r5.getString(r6)
            L_0x0410:
                r10 = 1
                r13 = 2
                goto L_0x044d
            L_0x0413:
                java.lang.String[] r5 = r10.split(r14)
                if (r5 == 0) goto L_0x0449
                int r6 = r5.length
                r7 = 2
                if (r6 >= r7) goto L_0x041e
                goto L_0x0449
            L_0x041e:
                r6 = 0
                r7 = r5[r6]
                r10 = 1
                r5 = r5[r10]
                java.lang.String r11 = "0"
                boolean r12 = r5.startsWith(r11)
                if (r12 == 0) goto L_0x0435
                int r11 = r5.indexOf(r11)
                int r11 = r11 + r10
                java.lang.String r5 = r5.substring(r11)
            L_0x0435:
                android.content.res.Resources r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                r12 = 2131830959(0x7f1128af, float:1.929493E38)
                r13 = 2
                java.lang.Object[] r14 = new java.lang.Object[r13]
                r6 = 0
                r14[r6] = r7
                r14[r10] = r5
                java.lang.String r5 = r11.getString(r12, r14)
                goto L_0x044d
            L_0x0449:
                r10 = 1
                r13 = 2
                java.lang.String r5 = ""
            L_0x044d:
                r9.f301298g = r5
                java.util.LinkedList<vw1.l> r5 = r2.f292271d
                r5.add(r9)
                int r5 = r2.f292280m
                int r5 = r5 + r10
                r2.f292280m = r5
            L_0x0459:
                java.util.LinkedList<vw1.l> r5 = r2.f292271d
                r5.add(r3)
                r2.f292279l = r4
                goto L_0x02e2
            L_0x0462:
                ly1.d r1 = ly1.C99723d.this
                int r2 = r1.f292277j
                if (r2 <= 0) goto L_0x04a9
                java.util.LinkedList<vw1.l> r3 = r1.f292271d
                int r3 = r3.size()
                int r4 = r1.f292280m
                int r3 = r3 - r4
                if (r2 >= r3) goto L_0x04a9
                boolean r2 = r1.f292278k
                if (r2 != 0) goto L_0x04a9
                vw1.l r2 = new vw1.l
                r2.<init>()
                r3 = 1
                r2.f301297f = r3
                r3 = 0
                r4 = 0
            L_0x0481:
                java.util.LinkedList<vw1.l> r5 = r1.f292271d
                int r5 = r5.size()
                if (r3 >= r5) goto L_0x04a0
                java.util.LinkedList<vw1.l> r5 = r1.f292271d
                java.lang.Object r5 = r5.get(r3)
                vw1.l r5 = (vw1.C102299l) r5
                boolean r5 = r5.f301296e
                if (r5 == 0) goto L_0x0496
                goto L_0x049d
            L_0x0496:
                int r4 = r4 + 1
                int r5 = r1.f292277j
                if (r4 < r5) goto L_0x049d
                goto L_0x04a0
            L_0x049d:
                int r3 = r3 + 1
                goto L_0x0481
            L_0x04a0:
                java.util.LinkedList<vw1.l> r4 = r1.f292271d
                r5 = 1
                int r3 = r3 + r5
                r4.add(r3, r2)
                r1.f292278k = r5
            L_0x04a9:
                java.lang.ref.WeakReference r1 = r0.f292282b
                if (r1 == 0) goto L_0x04c6
                java.lang.Object r1 = r1.get()
                if (r1 == 0) goto L_0x04c6
                java.lang.ref.WeakReference r1 = r0.f292282b
                java.lang.Object r1 = r1.get()
                ly1.d$b r1 = (ly1.C99723d.C99725b) r1
                ly1.d r2 = ly1.C99723d.this
                java.util.LinkedList<vw1.l> r3 = r2.f292271d
                vw1.q r2 = r2.f292270c
                boolean r2 = r2.f148015g
                r1.mo129209a(r3, r2)
            L_0x04c6:
                ly1.d r1 = ly1.C99723d.this
                r2 = 0
                r1.f292274g = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ly1.C99723d.C99724a.mo288a(int, int, java.lang.String, ob0.c):void");
        }
    }

    /* renamed from: ly1.d$b */
    public interface C99725b {
        /* renamed from: a */
        void mo129209a(LinkedList<C102299l> linkedList, boolean z);
    }

    /* renamed from: ly1.d$c */
    public static class C99726c {

        /* renamed from: a */
        public String f292284a;

        /* renamed from: b */
        public String f292285b;

        /* renamed from: c */
        public String f292286c;

        /* renamed from: d */
        public String f292287d;
    }

    /* renamed from: ly1.d$d */
    public static class C99727d {

        /* renamed from: a */
        public String f292288a;

        public C99727d(String str) {
            this.f292288a = str;
        }
    }

    static {
        String str = C41872f.m45395e(C41872f.C41873a.PERMANENT) + "haowan/";
        f292265n = str;
        f292266o = str + "haowan_gallery_cache";
    }

    public C99723d() {
        C86009m1 m1Var = new C86009m1(f292265n);
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            m1Var.mo119987x();
        }
    }

    /* renamed from: b */
    public static String m130164b(String str) {
        int h = C86718e.m107549h();
        if (h == 0) {
            return str;
        }
        return str + "_" + new C77710q(h).toString();
    }

    /* renamed from: g */
    public static void m130165g(int i) {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(m130164b("game_haowan_mmkv_key"));
        mmkv.putInt("game_last_choose_gallery", i);
        mmkv.apply();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077 A[SYNTHETIC, Splitter:B:23:0x0077] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139076a() {
        /*
            r5 = this;
            vw1.m r0 = new vw1.m
            r0.<init>()
            java.util.LinkedList<vw1.l> r1 = r5.f292271d
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            r3 = -1
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r1.next()
            vw1.l r2 = (vw1.C102299l) r2
            boolean r2 = r2.f301297f
            if (r2 == 0) goto L_0x000b
            java.util.LinkedList<vw1.l> r1 = r5.f292271d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            int r3 = r1.indexOf(r2)
        L_0x0026:
            if (r3 <= 0) goto L_0x002d
            java.util.LinkedList<vw1.l> r1 = r5.f292271d
            r1.remove(r3)
        L_0x002d:
            java.util.LinkedList<vw1.l> r1 = r5.f292271d
            r0.f189460d = r1
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.String r2 = f292265n
            r1.<init>((java.lang.String) r2)
            boolean r2 = r1.mo119967g()
            if (r2 == 0) goto L_0x0044
            boolean r2 = r1.mo119977o()
            if (r2 != 0) goto L_0x0047
        L_0x0044:
            r1.mo119987x()
        L_0x0047:
            r1 = 0
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x0059 }
            java.lang.String r2 = f292266o     // Catch:{ IOException -> 0x0059 }
            r3 = 0
            java.io.OutputStream r2 = com.tencent.p014mm.vfs.C86013q1.m106429K(r2, r3)     // Catch:{ IOException -> 0x0059 }
            r2.write(r0)     // Catch:{ IOException -> 0x0057 }
            goto L_0x0075
        L_0x0057:
            r0 = move-exception
            goto L_0x005b
        L_0x0059:
            r0 = move-exception
            r2 = r1
        L_0x005b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "cacheData: "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "MicroMsg.GameHaowanDataCenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x0075:
            if (r2 == 0) goto L_0x007a
            r2.close()     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            f292267p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ly1.C99723d.mo139076a():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:1|2|(2:4|(1:6))|7|8|9|(1:11)(2:12|(1:14)(1:15))|16|17|18|20|21|(3:23|(4:26|(1:44)(2:28|(2:30|45)(2:31|46))|42|24)|43)|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066 A[Catch:{ Exception -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00aa A[SYNTHETIC, Splitter:B:38:0x00aa] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.LinkedList<vw1.C102299l> mo139077c() {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = f292266o     // Catch:{ Exception -> 0x008a }
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)     // Catch:{ Exception -> 0x008a }
            java.lang.String r3 = r2.getPath()     // Catch:{ Exception -> 0x008a }
            if (r3 == 0) goto L_0x0028
            r4 = 0
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r4, r4)     // Catch:{ Exception -> 0x008a }
            java.lang.String r4 = r2.getPath()     // Catch:{ Exception -> 0x008a }
            boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x008a }
            if (r4 != 0) goto L_0x0028
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ Exception -> 0x008a }
            android.net.Uri$Builder r2 = r2.path(r3)     // Catch:{ Exception -> 0x008a }
            android.net.Uri r2 = r2.build()     // Catch:{ Exception -> 0x008a }
        L_0x0028:
            java.io.InputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106423E(r1)     // Catch:{ Exception -> 0x008a }
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x005a }
            com.tencent.mm.vfs.f0$h r2 = r3.mo177799l(r2, r0)     // Catch:{ Exception -> 0x005a }
            boolean r3 = r2.mo177810a()     // Catch:{ Exception -> 0x005a }
            r4 = 0
            if (r3 != 0) goto L_0x003b
            goto L_0x0048
        L_0x003b:
            com.tencent.mm.vfs.FileSystem$c r3 = r2.f348991a     // Catch:{ Exception -> 0x005a }
            java.lang.String r2 = r2.f348992b     // Catch:{ Exception -> 0x005a }
            com.tencent.mm.vfs.b0 r2 = r3.mo119945q(r2)     // Catch:{ Exception -> 0x005a }
            if (r2 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            long r4 = r2.f250473c     // Catch:{ Exception -> 0x005a }
        L_0x0048:
            int r2 = (int) r4     // Catch:{ Exception -> 0x005a }
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x005a }
            r1.read(r2)     // Catch:{ Exception -> 0x005a }
            vw1.m r3 = new vw1.m     // Catch:{ Exception -> 0x005a }
            r3.<init>()     // Catch:{ Exception -> 0x005a }
            r3.parseFrom(r2)     // Catch:{ Exception -> 0x005a }
            r1.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x005c
        L_0x005a:
            r2 = move-exception
            goto L_0x008d
        L_0x005c:
            java.util.LinkedList<vw1.l> r2 = r3.f189460d     // Catch:{ Exception -> 0x005a }
            r6.f292271d = r2     // Catch:{ Exception -> 0x005a }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)     // Catch:{ Exception -> 0x005a }
            if (r2 != 0) goto L_0x0087
            java.util.LinkedList<vw1.l> r2 = r6.f292271d     // Catch:{ Exception -> 0x005a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x005a }
        L_0x006c:
            boolean r4 = r2.hasNext()     // Catch:{ Exception -> 0x005a }
            if (r4 == 0) goto L_0x0087
            java.lang.Object r4 = r2.next()     // Catch:{ Exception -> 0x005a }
            vw1.l r4 = (vw1.C102299l) r4     // Catch:{ Exception -> 0x005a }
            boolean r5 = r4.f301296e     // Catch:{ Exception -> 0x005a }
            if (r5 != 0) goto L_0x006c
            boolean r5 = r4.f301297f     // Catch:{ Exception -> 0x005a }
            if (r5 == 0) goto L_0x0081
            goto L_0x006c
        L_0x0081:
            java.util.LinkedList<vw1.l> r5 = r6.f292272e     // Catch:{ Exception -> 0x005a }
            r5.add(r4)     // Catch:{ Exception -> 0x005a }
            goto L_0x006c
        L_0x0087:
            java.util.LinkedList<vw1.l> r0 = r3.f189460d     // Catch:{ Exception -> 0x005a }
            return r0
        L_0x008a:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L_0x008d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "parseGlobalConfig: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "MicroMsg.GameHaowanDataCenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
            if (r1 == 0) goto L_0x00ad
            r1.close()     // Catch:{ IOException -> 0x00ad }
        L_0x00ad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ly1.C99723d.mo139077c():java.util.LinkedList");
    }

    /* renamed from: d */
    public void mo139078d(C99725b bVar) {
        if (this.f292274g) {
            Log.m105924i("MicroMsg.GameHaowanDataCenter", "gettingDataFromNet, return");
            return;
        }
        Log.m105918d("MicroMsg.GameHaowanDataCenter", "getDataFromNet");
        this.f292274g = true;
        C53025p pVar = new C53025p();
        C53026q qVar = this.f292270c;
        long j = qVar != null ? qVar.f148016h : 0;
        pVar.f148009d = j;
        if (j == 0) {
            pVar.f148011f = this.f292275h;
        }
        WeakReference weakReference = new WeakReference(bVar);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127068c = "/cgi-bin/mmgame-bin/getuservideolist";
        bVar2.f127069d = 3549;
        bVar2.f127066a = pVar;
        bVar2.f127067b = new C53026q();
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar2.mo72403a(), new C99724a(pVar, weakReference));
    }

    /* renamed from: e */
    public final LinkedList<String> mo139079e() {
        LinkedList<String> linkedList = new LinkedList<>();
        for (C99726c cVar : this.f292269b.values()) {
            linkedList.add(cVar.f292286c);
        }
        return linkedList;
    }

    /* renamed from: f */
    public final int mo139080f() {
        if (this.f292276i == 0) {
            return 0;
        }
        return C99769r.m130217b().mo139131a(mo139079e(), System.currentTimeMillis(), this.f292276i + 1);
    }

    /* renamed from: h */
    public void mo139081h(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                C99726c cVar = new C99726c();
                cVar.f292284a = optJSONObject.optString("appId");
                cVar.f292285b = optJSONObject.optString("gameName");
                cVar.f292286c = optJSONObject.optString("albumName");
                cVar.f292287d = optJSONObject.optString("defaultTitle");
                this.f292269b.put(cVar.f292286c, cVar);
            }
        }
    }
}
