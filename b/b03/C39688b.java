package b03;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusCardFeedsActivity;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jq3.C9493c;
import lz2.C46923f;
import mz2.C47151d;
import nj3.C76879j;
import ob0.C11385n;
import pe3.C89349b;
import qo3.C89779i0;
import su0.C13781a;
import uz2.C52673c1;
import yz2.C53673f2;

/* renamed from: b03.b */
public final class C39688b {

    /* renamed from: j */
    public static final C39689a f106469j = new C39689a((C8480h) null);

    /* renamed from: k */
    public static C89779i0 f106470k;

    /* renamed from: l */
    public static boolean f106471l;

    /* renamed from: m */
    public static ArrayList<C52673c1> f106472m = new ArrayList<>();

    /* renamed from: n */
    public static HashMap<Long, C52673c1> f106473n = new HashMap<>();

    /* renamed from: o */
    public static long f106474o = -1;

    /* renamed from: p */
    public static long f106475p = -1;

    /* renamed from: a */
    public final WxRecyclerAdapter<C9493c> f106476a;

    /* renamed from: b */
    public final RefreshLoadMoreLayout f106477b;

    /* renamed from: c */
    public final HashSet<Integer> f106478c = new HashSet<>();

    /* renamed from: d */
    public final HashMap<String, C47151d> f106479d = new HashMap<>();

    /* renamed from: e */
    public String f106480e;

    /* renamed from: f */
    public C89349b f106481f;

    /* renamed from: g */
    public boolean f106482g = true;

    /* renamed from: h */
    public boolean f106483h;

    /* renamed from: i */
    public final C11385n f106484i;

    /* renamed from: b03.b$a */
    public static final class C39689a {
        public C39689a(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo62269a(long j, List<? extends C52673c1> list) {
            C87412m.m108594g(list, "list");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C52673c1) list.get(i)).f147073j == j) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: b */
        public final void mo62270b(long j, Context context) {
            ArrayList arrayList;
            int a;
            C52673c1 c1Var;
            C87412m.m108594g(context, "context");
            int a2 = mo62269a(j, C39688b.f106472m);
            LinkedList linkedList = null;
            boolean z = false;
            if (a2 < 0 || a2 > C39688b.f106472m.size() - 1) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                int max = Math.max(a2 - 15, 0);
                int min = Math.min(a2 + 15, C39688b.f106472m.size() - 1);
                if (max <= min) {
                    while (true) {
                        arrayList.add(Long.valueOf(C39688b.f106472m.get(max).f147073j));
                        if (max == min) {
                            break;
                        }
                        max++;
                    }
                }
            }
            if (!(arrayList == null || arrayList.isEmpty())) {
                LinkedList linkedList2 = new LinkedList();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        linkedList = linkedList2;
                        break;
                    }
                    long longValue = ((Number) it.next()).longValue();
                    if (!C39688b.f106473n.containsKey(Long.valueOf(longValue)) || (c1Var = C39688b.f106473n.get(Long.valueOf(longValue))) == null) {
                        break;
                    }
                    linkedList2.add(c1Var);
                }
            }
            if (linkedList == null || linkedList.isEmpty()) {
                C39688b.f106475p = j;
                ArrayList<C52673c1> arrayList2 = C39688b.f106472m;
                C87412m.m108594g(arrayList2, "list");
                if (!arrayList2.isEmpty() && (a = mo62269a(j, arrayList2)) != -1) {
                    j = arrayList2.get(Math.max(a - 25, 0)).f147073j;
                }
                if (!C39688b.f106471l) {
                    C39688b.f106471l = true;
                    C46923f fVar = new C46923f((C89349b) null, 1L, Long.valueOf(j), 50L, (Integer) null, 16, (C8480h) null);
                    C86709a0.m107524d().mo123460f(fVar);
                    C89779i0 i0Var = C39688b.f106470k;
                    if (i0Var != null) {
                        if (!i0Var.isShowing()) {
                            z = true;
                        }
                        if (!z) {
                            return;
                        }
                    }
                    C39688b.f106470k = C76879j.m92722P(context, context.getString(C0966R.string.f360085a04), 3, context.getString(C0966R.string.f360085a04), false, true, new C0240a(fVar));
                    return;
                }
                return;
            }
            C39622i0 a3 = C39818r.f106831a.mo62443b(context).mo75002a(C53673f2.class);
            C87412m.m108593f(a3, "UICProvider.of(context).…pPageDataUIC::class.java)");
            C53673f2 f2Var = (C53673f2) a3;
            f2Var.f150746d.clear();
            f2Var.f150746d.addAll(linkedList);
            TextStatusCardFeedsActivity.C43198a.m46779a(TextStatusCardFeedsActivity.f116896j, context, C13781a.m13082a(), 1001, "SCENE_HISTORY_FEED", Integer.valueOf(mo62269a(j, linkedList)), (View) null, 32, (Object) null);
        }
    }

    /* renamed from: b03.b$b */
    public static final class C39690b implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C39688b f106485d;

        /* renamed from: e */
        public final /* synthetic */ Context f106486e;

        public C39690b(C39688b bVar, Context context) {
            this.f106485d = bVar;
            this.f106486e = context;
        }

        /* JADX WARNING: Removed duplicated region for block: B:64:0x024b  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0265  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onSceneEnd(int r32, int r33, java.lang.String r34, ob0.C117747y r35) {
            /*
                r31 = this;
                r0 = r31
                r1 = r35
                java.lang.String r2 = "netSceneBase"
                gy3.C87412m.m108594g(r1, r2)
                if (r32 != 0) goto L_0x039b
                if (r33 != 0) goto L_0x039b
                lz2.f r1 = (lz2.C46923f) r1
                uz2.v0 r4 = r1.f126159f
                if (r4 == 0) goto L_0x0398
                b03.b r5 = r0.f106485d
                android.content.Context r6 = r0.f106486e
                java.lang.Integer r1 = r1.f126160g
                java.lang.String r7 = "MicroMsg.TextStatus.HistoryItemLoader"
                if (r1 != 0) goto L_0x001e
                goto L_0x0054
            L_0x001e:
                int r8 = r1.intValue()
                if (r8 != 0) goto L_0x0054
                pe3.b r1 = r4.f147268e
                r5.f106481f = r1
                boolean r1 = r4.f147269f
                r5.f106482g = r1
                java.util.LinkedList<uz2.c1> r1 = r4.f147267d
                if (r1 == 0) goto L_0x0051
                java.util.Iterator r1 = r1.iterator()
            L_0x0034:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0051
                java.lang.Object r2 = r1.next()
                uz2.c1 r2 = (uz2.C52673c1) r2
                if (r2 == 0) goto L_0x0034
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<jq3.c> r4 = r5.f106476a
                java.util.List r4 = r4.getData()
                mz2.a r6 = new mz2.a
                r6.<init>(r2)
                r4.add(r6)
                goto L_0x0034
            L_0x0051:
                r2 = r7
                goto L_0x0370
            L_0x0054:
                if (r1 != 0) goto L_0x0058
                goto L_0x0325
            L_0x0058:
                int r9 = r1.intValue()
                r10 = 2
                if (r9 != r10) goto L_0x0325
                pe3.b r1 = r4.f147268e
                r5.f106481f = r1
                boolean r1 = r4.f147269f
                r5.f106482g = r1
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<jq3.c> r1 = r5.f106476a
                java.util.List r1 = r1.getData()
                java.util.LinkedList<uz2.c1> r6 = r4.f147267d
                java.util.LinkedList r9 = new java.util.LinkedList
                r9.<init>()
                java.util.LinkedList r11 = new java.util.LinkedList
                r11.<init>()
                java.util.LinkedList r12 = new java.util.LinkedList
                r12.<init>()
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                java.lang.String r14 = ""
                java.lang.String r15 = "value"
                java.lang.String r2 = "<set-?>"
                if (r6 == 0) goto L_0x0285
                java.util.Iterator r6 = r6.iterator()
                r16 = -1
                r18 = 0
                r19 = -1
                r20 = -1
                r21 = -1
                r29 = r16
                r17 = r4
                r16 = r14
                r3 = r29
                r14 = r13
                r13 = r12
                r12 = r11
                r11 = 0
            L_0x00a6:
                boolean r22 = r6.hasNext()
                if (r22 == 0) goto L_0x027a
                java.lang.Object r16 = r6.next()
                r10 = r16
                uz2.c1 r10 = (uz2.C52673c1) r10
                rz2.c r8 = mz2.C47149b.m52432a(r10)
                int r8 = r8.field_CreateTime
                r22 = r1
                long r0 = (long) r8
                r8 = 1000(0x3e8, float:1.401E-42)
                r24 = r6
                r23 = r7
                long r6 = (long) r8
                long r0 = r0 * r6
                java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
                java.lang.String r7 = "yyyy-MM-dd HH:mm:ss"
                r6.<init>(r7)
                java.lang.Long r7 = java.lang.Long.valueOf(r0)
                java.lang.String r7 = r6.format(r7)
                java.util.Date r6 = r6.parse(r7)
                java.util.Calendar r7 = java.util.Calendar.getInstance()
                r7.setTime(r6)
                r6 = 1
                int r8 = r7.get(r6)
                r33 = r8
                r6 = 2
                int r8 = r7.get(r6)
                r6 = 5
                int r6 = r7.get(r6)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r16 = r6
                android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r25 = r10
                r10 = 2131837994(0x7f11442a, float:1.9309199E38)
                java.lang.String r6 = r6.getString(r10)
                java.lang.CharSequence r6 = android.text.format.DateFormat.format(r6, r0)
                r7.append(r6)
                android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r10 = 2131837940(0x7f1143f4, float:1.930909E38)
                java.lang.String r6 = r6.getString(r10)
                java.lang.CharSequence r6 = android.text.format.DateFormat.format(r6, r0)
                r7.append(r6)
                java.lang.String r6 = r7.toString()
                r7 = r19
                if (r7 == r8) goto L_0x01fa
                mz2.d r11 = (mz2.C47151d) r11
                if (r11 == 0) goto L_0x018d
                gy3.C87412m.m108594g(r13, r2)
                r11.f126677f = r13
                boolean r19 = r12.isEmpty()
                if (r19 != 0) goto L_0x013e
                mz2.c r10 = new mz2.c
                r10.<init>(r12)
                r14.add(r10)
            L_0x013e:
                java.util.LinkedList r10 = new java.util.LinkedList
                r10.<init>()
                gy3.C87412m.m108594g(r14, r15)
                java.util.ArrayList r12 = r11.mo72237a(r14)
                r11.f126678g = r12
                r9.add(r11)
                java.util.HashMap<java.lang.String, mz2.d> r12 = r5.f106479d
                r26 = r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r27 = r10
                android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r28 = r14
                r14 = 2131837994(0x7f11442a, float:1.9309199E38)
                java.lang.String r10 = r10.getString(r14)
                java.lang.CharSequence r10 = android.text.format.DateFormat.format(r10, r3)
                r8.append(r10)
                android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r14 = 2131837940(0x7f1143f4, float:1.930909E38)
                java.lang.String r10 = r10.getString(r14)
                java.lang.CharSequence r10 = android.text.format.DateFormat.format(r10, r3)
                r8.append(r10)
                java.lang.String r8 = r8.toString()
                java.lang.Object r8 = r12.put(r8, r11)
                mz2.d r8 = (mz2.C47151d) r8
                r12 = r27
                goto L_0x0191
            L_0x018d:
                r26 = r8
                r28 = r14
            L_0x0191:
                int r8 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r8 == 0) goto L_0x0196
                r3 = r0
            L_0x0196:
                r8 = -1
                if (r7 != r8) goto L_0x01c6
                java.lang.String r7 = r5.f106480e
                boolean r7 = gy3.C87412m.m108589b(r6, r7)
                if (r7 == 0) goto L_0x01c6
                java.util.HashMap<java.lang.String, mz2.d> r7 = r5.f106479d
                boolean r7 = r7.containsKey(r6)
                if (r7 == 0) goto L_0x01c6
                java.util.HashMap<java.lang.String, mz2.d> r7 = r5.f106479d
                java.lang.Object r7 = r7.get(r6)
                r10 = r7
                mz2.d r10 = (mz2.C47151d) r10
                if (r10 == 0) goto L_0x01c0
                java.util.List<uz2.c1> r13 = r10.f126677f
                r14 = r25
                r13.add(r14)
                java.util.ArrayList<mz2.c> r10 = r10.f126678g
                r28 = r10
                goto L_0x01c2
            L_0x01c0:
                r14 = r25
            L_0x01c2:
                r11 = r7
                r18 = 1
                goto L_0x01f3
            L_0x01c6:
                r14 = r25
                mz2.d r7 = new mz2.d
                r7.<init>()
                android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r11 = 2131837940(0x7f1143f4, float:1.930909E38)
                java.lang.String r10 = r10.getString(r11)
                java.lang.CharSequence r10 = android.text.format.DateFormat.format(r10, r0)
                java.lang.String r10 = r10.toString()
                r7.f126676e = r10
                java.util.LinkedList r10 = new java.util.LinkedList
                r10.<init>()
                r10.add(r14)
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                r13 = r10
                r28 = r11
                r11 = r7
            L_0x01f3:
                r8 = r33
                r10 = r20
                r19 = r26
                goto L_0x0208
            L_0x01fa:
                r28 = r14
                r14 = r25
                r8 = -1
                r13.add(r14)
                r8 = r33
                r19 = r7
                r10 = r20
            L_0x0208:
                r7 = r28
                if (r8 == r10) goto L_0x0241
                r26 = r3
                java.util.HashSet<java.lang.Integer> r3 = r5.f106478c
                java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
                boolean r3 = r3.contains(r4)
                if (r3 != 0) goto L_0x0243
                r3 = r11
                mz2.d r3 = (mz2.C47151d) r3
                if (r3 != 0) goto L_0x0220
                goto L_0x0235
            L_0x0220:
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r10 = 2131837994(0x7f11442a, float:1.9309199E38)
                java.lang.String r4 = r4.getString(r10)
                java.lang.CharSequence r0 = android.text.format.DateFormat.format(r4, r0)
                java.lang.String r0 = r0.toString()
                r3.f126675d = r0
            L_0x0235:
                java.util.HashSet<java.lang.Integer> r0 = r5.f106478c
                java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                r0.add(r1)
                r20 = r8
                goto L_0x0245
            L_0x0241:
                r26 = r3
            L_0x0243:
                r20 = r10
            L_0x0245:
                r0 = r16
                r3 = r21
                if (r0 == r3) goto L_0x0265
                boolean r1 = r12.isEmpty()
                if (r1 != 0) goto L_0x0259
                mz2.c r1 = new mz2.c
                r1.<init>(r12)
                r7.add(r1)
            L_0x0259:
                java.util.LinkedList r1 = new java.util.LinkedList
                r1.<init>()
                r1.add(r14)
                r21 = r0
                r12 = r1
                goto L_0x026a
            L_0x0265:
                r12.add(r14)
                r21 = r3
            L_0x026a:
                r0 = r31
                r16 = r6
                r14 = r7
                r1 = r22
                r7 = r23
                r6 = r24
                r3 = r26
                r10 = 2
                goto L_0x00a6
            L_0x027a:
                r22 = r1
                r23 = r7
                r28 = r14
                r14 = r16
                r0 = r28
                goto L_0x0291
            L_0x0285:
                r22 = r1
                r17 = r4
                r23 = r7
                r0 = r13
                r18 = 0
                r13 = r12
                r12 = r11
                r11 = 0
            L_0x0291:
                boolean r1 = r12.isEmpty()
                if (r1 != 0) goto L_0x029f
                mz2.c r1 = new mz2.c
                r1.<init>(r12)
                r0.add(r1)
            L_0x029f:
                mz2.d r11 = (mz2.C47151d) r11
                if (r11 == 0) goto L_0x02bc
                gy3.C87412m.m108594g(r13, r2)
                r11.f126677f = r13
                gy3.C87412m.m108594g(r0, r15)
                java.util.ArrayList r0 = r11.mo72237a(r0)
                r11.f126678g = r0
                r9.add(r11)
                java.util.HashMap<java.lang.String, mz2.d> r0 = r5.f106479d
                java.lang.Object r0 = r0.put(r14, r11)
                mz2.d r0 = (mz2.C47151d) r0
            L_0x02bc:
                r5.f106480e = r14
                if (r18 == 0) goto L_0x02c4
                r0 = 0
                r9.remove(r0)
            L_0x02c4:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "processData: size:"
                r0.append(r1)
                int r1 = r9.size()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2 = r23
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                r0 = r22
                r0.addAll(r9)
                r0 = 0
                r5.f106483h = r0
                r0 = r17
                java.util.LinkedList<uz2.c1> r1 = r0.f147267d
                if (r1 == 0) goto L_0x02f5
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x02f3
                goto L_0x02f5
            L_0x02f3:
                r8 = 0
                goto L_0x02f6
            L_0x02f5:
                r8 = 1
            L_0x02f6:
                if (r8 != 0) goto L_0x030b
                long r3 = b03.C39688b.f106474o
                java.util.LinkedList<uz2.c1> r1 = r0.f147267d
                r6 = 0
                java.lang.Object r1 = r1.get(r6)
                uz2.c1 r1 = (uz2.C52673c1) r1
                long r6 = r1.f147073j
                long r3 = java.lang.Math.max(r3, r6)
                b03.C39688b.f106474o = r3
            L_0x030b:
                java.util.LinkedList<uz2.c1> r0 = r0.f147267d
                if (r0 == 0) goto L_0x0370
                java.util.Iterator r0 = r0.iterator()
            L_0x0313:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0370
                java.lang.Object r1 = r0.next()
                uz2.c1 r1 = (uz2.C52673c1) r1
                java.util.ArrayList<uz2.c1> r3 = b03.C39688b.f106472m
                r3.add(r1)
                goto L_0x0313
            L_0x0325:
                r0 = r4
                r2 = r7
                if (r1 != 0) goto L_0x032a
                goto L_0x034a
            L_0x032a:
                int r3 = r1.intValue()
                r4 = 1
                if (r3 != r4) goto L_0x034a
                if (r6 == 0) goto L_0x0370
                java.util.LinkedList<uz2.c1> r0 = r0.f147267d
                b03.C39688b.m42336a(r5, r0)
                b03.b$a r0 = b03.C39688b.f106469j
                long r3 = b03.C39688b.f106475p
                r0.mo62270b(r3, r6)
                qo3.i0 r0 = b03.C39688b.f106470k
                if (r0 == 0) goto L_0x0346
                r0.dismiss()
            L_0x0346:
                r0 = 0
                b03.C39688b.f106471l = r0
                goto L_0x0370
            L_0x034a:
                r3 = 3
                if (r1 != 0) goto L_0x034e
                goto L_0x0370
            L_0x034e:
                int r1 = r1.intValue()
                if (r1 != r3) goto L_0x0370
                if (r6 == 0) goto L_0x0370
                java.util.LinkedList<uz2.c1> r0 = r0.f147267d
                b03.C39688b.m42336a(r5, r0)
                bl3.r r0 = bl3.C39818r.f106831a
                bl3.r$a r0 = r0.mo62443b(r6)
                java.lang.Class<yz2.f2> r1 = yz2.C53673f2.class
                androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
                yz2.f2 r0 = (yz2.C53673f2) r0
                androidx.recyclerview.widget.RecyclerView$e<jq3.o> r0 = r0.f150747e
                if (r0 == 0) goto L_0x0370
                r0.notifyDataSetChanged()
            L_0x0370:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "data size = "
                r0.append(r1)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<jq3.c> r1 = r5.f106476a
                java.util.List r1 = r1.getData()
                int r1 = r1.size()
                r0.append(r1)
                java.lang.String r1 = ", continueFlag: "
                r0.append(r1)
                boolean r1 = r5.f106482g
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            L_0x0398:
                r0 = r31
                goto L_0x03b4
            L_0x039b:
                r0 = r31
                b03.b r1 = r0.f106485d
                r1.getClass()
                qo3.i0 r1 = b03.C39688b.f106470k
                if (r1 == 0) goto L_0x03a9
                r1.dismiss()
            L_0x03a9:
                r1 = 0
                b03.C39688b.f106470k = r1
                android.content.Context r1 = r0.f106486e
                java.lang.String r2 = "网络错误"
                nj3.C76912y0.m92773l(r1, r2)
            L_0x03b4:
                b03.b r1 = r0.f106485d
                com.tencent.mm.view.RefreshLoadMoreLayout r1 = r1.f106477b
                r2 = 0
                r1.mo82440F(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b03.C39688b.C39690b.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    public C39688b(WxRecyclerAdapter<C9493c> wxRecyclerAdapter, RefreshLoadMoreLayout refreshLoadMoreLayout, Context context) {
        C87412m.m108594g(wxRecyclerAdapter, "adapter");
        C87412m.m108594g(refreshLoadMoreLayout, "refreahLayout");
        this.f106476a = wxRecyclerAdapter;
        this.f106477b = refreshLoadMoreLayout;
        C39690b bVar = new C39690b(this, context);
        this.f106484i = bVar;
        C86709a0.m107524d().mo123455a(4245, bVar);
    }

    /* renamed from: a */
    public static final void m42336a(C39688b bVar, List list) {
        bVar.getClass();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C52673c1 c1Var = (C52673c1) it.next();
                f106473n.put(Long.valueOf(c1Var.f147073j), c1Var);
            }
        }
    }

    /* renamed from: b */
    public final void mo62268b() {
        if (this.f106482g && !this.f106483h) {
            this.f106483h = true;
            C86709a0.m107524d().mo123460f(new C46923f(this.f106481f, 2L, 0L, 200L, (Integer) null, 16, (C8480h) null));
        }
    }
}
