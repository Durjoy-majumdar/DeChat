package p595ll;

import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import p812el.C97670a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C64187h0;
import z04.C119027c;

/* renamed from: ll.o */
public final class C99502o {

    /* renamed from: a */
    public final int f291724a;

    /* renamed from: b */
    public final String f291725b;

    /* renamed from: c */
    public final C32228q<Boolean, List<String>, C89349b, C13598b0> f291726c;

    /* renamed from: d */
    public final LinkedList<String> f291727d = new LinkedList<>();

    /* renamed from: e */
    public final LinkedList<String> f291728e = new LinkedList<>();

    /* renamed from: f */
    public C89349b f291729f;

    /* renamed from: g */
    public Set<String> f291730g = C64187h0.f181908d;

    /* renamed from: ll.o$a */
    public static final class C99503a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C99502o f291731a;

        public C99503a(C99502o oVar) {
            this.f291731a = oVar;
        }

        /* JADX WARNING: type inference failed for: r13v0, types: [com.tencent.mm.sdk.storage.ISQLiteDatabase] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x0216 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x019e  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x01bc  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x01d4  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0236 A[LOOP:1: B:58:0x016a->B:85:0x0236, LOOP_END] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r21) {
            /*
                r20 = this;
                r1 = r20
                r0 = r21
                ob0.b$c r0 = (ob0.C89132b.C89134c) r0
                int r2 = r0.f256793a
                int r3 = r0.f256794b
                T r0 = r0.f256796d
                te3.ta r0 = (te3.C51365ta) r0
                java.lang.String r4 = "MicroMsg.EmojiSyncMd5List"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "requestNext: "
                r5.append(r6)
                r5.append(r2)
                java.lang.String r6 = ", "
                r5.append(r6)
                r5.append(r3)
                java.lang.String r6 = ", "
                r5.append(r6)
                ll.o r6 = r1.f291731a
                java.lang.String r6 = r6.f291725b
                r5.append(r6)
                java.lang.String r6 = "end:"
                r5.append(r6)
                r6 = 0
                if (r0 == 0) goto L_0x0041
                int r7 = r0.f142063f
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                goto L_0x0042
            L_0x0041:
                r7 = r6
            L_0x0042:
                r5.append(r7)
                java.lang.String r7 = ", size:"
                r5.append(r7)
                if (r0 == 0) goto L_0x0059
                java.util.LinkedList<java.lang.String> r7 = r0.f142062e
                if (r7 == 0) goto L_0x0059
                int r7 = r7.size()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                goto L_0x005a
            L_0x0059:
                r7 = r6
            L_0x005a:
                r5.append(r7)
                java.lang.String r7 = ", first:"
                r5.append(r7)
                if (r0 == 0) goto L_0x006f
                java.util.LinkedList<java.lang.String> r7 = r0.f142062e
                if (r7 == 0) goto L_0x006f
                java.lang.Object r7 = sx3.C110818d0.m150916N(r7)
                java.lang.String r7 = (java.lang.String) r7
                goto L_0x0070
            L_0x006f:
                r7 = r6
            L_0x0070:
                r5.append(r7)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
                if (r2 != 0) goto L_0x02bc
                if (r3 != 0) goto L_0x02bc
                ll.o r2 = r1.f291731a
                pe3.b r3 = r0.f142065h
                r2.f291729f = r3
                java.util.LinkedList<java.lang.String> r3 = r0.f142062e
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L_0x00e2
                java.util.LinkedList<java.lang.String> r7 = r2.f291728e
                r7.addAll(r3)
                java.util.LinkedList<java.lang.String> r3 = r2.f291727d
                java.util.LinkedList<java.lang.String> r7 = r0.f142062e
                java.lang.String r8 = "rsp.Md5List"
                gy3.C87412m.m108593f(r7, r8)
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
                r9 = 0
            L_0x00a3:
                boolean r10 = r7.hasNext()
                if (r10 == 0) goto L_0x00df
                java.lang.Object r10 = r7.next()
                int r11 = r9 + 1
                if (r9 < 0) goto L_0x00db
                r12 = r10
                java.lang.String r12 = (java.lang.String) r12
                java.util.LinkedList<java.lang.Boolean> r13 = r0.f142066i
                java.lang.String r14 = "rsp.NeedUpdate"
                gy3.C87412m.m108593f(r13, r14)
                java.lang.Object r9 = sx3.C110818d0.m150917O(r13, r9)
                java.lang.Boolean r13 = java.lang.Boolean.TRUE
                boolean r9 = gy3.C87412m.m108589b(r9, r13)
                if (r9 != 0) goto L_0x00d3
                java.util.Set<java.lang.String> r9 = r2.f291730g
                boolean r9 = r9.contains(r12)
                if (r9 != 0) goto L_0x00d1
                goto L_0x00d3
            L_0x00d1:
                r9 = 0
                goto L_0x00d4
            L_0x00d3:
                r9 = 1
            L_0x00d4:
                if (r9 == 0) goto L_0x00d9
                r8.add(r10)
            L_0x00d9:
                r9 = r11
                goto L_0x00a3
            L_0x00db:
                sx3.C64197v.m75542k()
                throw r6
            L_0x00df:
                r3.addAll(r8)
            L_0x00e2:
                int r0 = r0.f142063f
                if (r0 == r5) goto L_0x00eb
                r2.mo138913a()
                goto L_0x02c7
            L_0x00eb:
                pe3.b r0 = r2.f291729f
                r3 = 2
                if (r0 == 0) goto L_0x010f
                byte[] r0 = r0.f257327a
                byte[] r0 = android.util.Base64.encode(r0, r3)
                java.lang.String r7 = "encode(reqBuff?.bytes, Base64.NO_WRAP)"
                gy3.C87412m.m108593f(r0, r7)
                java.lang.String r7 = new java.lang.String
                java.nio.charset.Charset r8 = z04.C119027c.f356488a
                r7.<init>(r0, r8)
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_LAST_DOWNLOAD_REQ_BUFF_STRING
                r0.mo119677K(r8, r7)
            L_0x010f:
                com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
                wh3.g r7 = r0.mo57717d()
                int r0 = r2.f291724a
                java.util.LinkedList<java.lang.String> r8 = r2.f291728e
                monitor-enter(r7)
                java.lang.String r9 = "MicroMsg.emoji.EmojiInfoStorage"
                java.lang.String r10 = "[cpan] begin preparedDownloadCustomMd5List %s, %s"
                java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ all -> 0x02b9 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02b9 }
                r11[r4] = r12     // Catch:{ all -> 0x02b9 }
                int r12 = r8.size()     // Catch:{ all -> 0x02b9 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x02b9 }
                r11[r5] = r12     // Catch:{ all -> 0x02b9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r11)     // Catch:{ all -> 0x02b9 }
                java.util.LinkedList r9 = new java.util.LinkedList     // Catch:{ all -> 0x02b9 }
                r9.<init>()     // Catch:{ all -> 0x02b9 }
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02b9 }
                int r11 = r8.size()     // Catch:{ all -> 0x02b9 }
                if (r11 > 0) goto L_0x014e
                java.lang.String r0 = "MicroMsg.emoji.EmojiInfoStorage"
                java.lang.String r3 = "[cpan] preparedDownloadCustomMd5List failed. list is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x02b9 }
                monitor-exit(r7)
                goto L_0x0234
            L_0x014e:
                r11 = -1
                com.tencent.mm.sdk.storage.ISQLiteDatabase r13 = r7.f301704d     // Catch:{ all -> 0x02b9 }
                boolean r14 = r13 instanceof zh3.C91753f     // Catch:{ all -> 0x02b9 }
                if (r14 == 0) goto L_0x0165
                r6 = r13
                zh3.f r6 = (zh3.C91753f) r6     // Catch:{ all -> 0x02b9 }
                java.lang.Thread r11 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x02b9 }
                long r11 = r11.getId()     // Catch:{ all -> 0x02b9 }
                long r11 = r6.beginTransaction(r11)     // Catch:{ all -> 0x02b9 }
            L_0x0165:
                java.util.Iterator r13 = r8.iterator()     // Catch:{ all -> 0x02b9 }
                r14 = 1
            L_0x016a:
                boolean r15 = r13.hasNext()     // Catch:{ all -> 0x02b9 }
                if (r15 == 0) goto L_0x023d
                java.lang.Object r15 = r13.next()     // Catch:{ all -> 0x02b9 }
                java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x02b9 }
                com.tencent.mm.storage.emotion.EmojiInfo r3 = r7.mo142044TO(r15)     // Catch:{ all -> 0x02b9 }
                if (r3 == 0) goto L_0x018a
                java.lang.String r16 = r3.getMd5()     // Catch:{ all -> 0x02b9 }
                boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r16)     // Catch:{ all -> 0x02b9 }
                if (r16 == 0) goto L_0x0187
                goto L_0x018a
            L_0x0187:
                r3.field_source = r5     // Catch:{ all -> 0x02b9 }
                goto L_0x0199
            L_0x018a:
                com.tencent.mm.storage.emotion.EmojiInfo r3 = new com.tencent.mm.storage.emotion.EmojiInfo     // Catch:{ all -> 0x02b9 }
                r3.<init>()     // Catch:{ all -> 0x02b9 }
                r3.field_md5 = r15     // Catch:{ all -> 0x02b9 }
                r3.field_source = r5     // Catch:{ all -> 0x02b9 }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02b9 }
                r3.field_lastUseTime = r4     // Catch:{ all -> 0x02b9 }
            L_0x0199:
                r4 = 81
                r5 = 1
                if (r0 != r5) goto L_0x01af
                int r5 = r3.field_catalog     // Catch:{ all -> 0x02b9 }
                com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r17 = com.tencent.p014mm.storage.emotion.EmojiInfo.f284123W1     // Catch:{ all -> 0x02b9 }
                if (r5 == r4) goto L_0x01a8
                r4 = 65
                r3.field_catalog = r4     // Catch:{ all -> 0x02b9 }
            L_0x01a8:
                java.lang.String r4 = "capture"
                r3.field_groupId = r4     // Catch:{ all -> 0x02b9 }
                r3.field_idx = r14     // Catch:{ all -> 0x02b9 }
                goto L_0x01b5
            L_0x01af:
                com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r5 = com.tencent.p014mm.storage.emotion.EmojiInfo.f284123W1     // Catch:{ all -> 0x02b9 }
                r3.field_catalog = r4     // Catch:{ all -> 0x02b9 }
                r3.field_reserved3 = r14     // Catch:{ all -> 0x02b9 }
            L_0x01b5:
                boolean r4 = r3.mo135616m2()     // Catch:{ all -> 0x02b9 }
                r5 = 3
                if (r4 == 0) goto L_0x01d4
                int r4 = r3.field_reserved4     // Catch:{ all -> 0x02b9 }
                r16 = 1
                r4 = r4 | 1
                r3.field_reserved4 = r4     // Catch:{ all -> 0x02b9 }
                r3.field_state = r5     // Catch:{ all -> 0x02b9 }
                java.lang.String r4 = r3.mo62640K1()     // Catch:{ all -> 0x02b9 }
                r17 = r6
                long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)     // Catch:{ all -> 0x02b9 }
                int r4 = (int) r5     // Catch:{ all -> 0x02b9 }
                r3.field_size = r4     // Catch:{ all -> 0x02b9 }
                goto L_0x01d9
            L_0x01d4:
                r17 = r6
                r4 = 4
                r3.field_state = r4     // Catch:{ all -> 0x02b9 }
            L_0x01d9:
                java.lang.String r4 = "MicroMsg.emoji.EmojiInfoStorage"
                java.lang.String r5 = "preparedDownloadCustomMd5List: %s, %s, %s"
                r6 = 3
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x02b9 }
                java.lang.String r18 = r3.getMd5()     // Catch:{ all -> 0x02b9 }
                r15 = 0
                r6[r15] = r18     // Catch:{ all -> 0x02b9 }
                int r15 = r3.field_state     // Catch:{ all -> 0x02b9 }
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x02b9 }
                r16 = 1
                r6[r16] = r15     // Catch:{ all -> 0x02b9 }
                int r15 = r3.field_size     // Catch:{ all -> 0x02b9 }
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x02b9 }
                r19 = 2
                r6[r19] = r15     // Catch:{ all -> 0x02b9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)     // Catch:{ all -> 0x02b9 }
                int r14 = r14 + 1
                android.content.ContentValues r3 = r3.convertTo()     // Catch:{ all -> 0x02b9 }
                com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r7.f301704d     // Catch:{ all -> 0x02b9 }
                java.lang.String r5 = "EmojiInfo"
                java.lang.String r6 = "md5"
                long r3 = r4.replace(r5, r6, r3)     // Catch:{ all -> 0x02b9 }
                r5 = 0
                int r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r15 >= 0) goto L_0x0236
                if (r17 == 0) goto L_0x021d
                r6 = r17
                r6.endTransaction(r11)     // Catch:{ all -> 0x02b9 }
            L_0x021d:
                java.lang.String r0 = "MicroMsg.emoji.EmojiInfoStorage"
                java.lang.String r3 = "[cpan] end preparedDownloadCustomMd5List user time:%d faild "
                r4 = 1
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x02b9 }
                long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02b9 }
                long r11 = r11 - r9
                java.lang.Long r4 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x02b9 }
                r6 = 0
                r5[r6] = r4     // Catch:{ all -> 0x02b9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r5)     // Catch:{ all -> 0x02b9 }
                monitor-exit(r7)
            L_0x0234:
                r4 = 0
                goto L_0x0265
            L_0x0236:
                r6 = r17
                r3 = 2
                r4 = 0
                r5 = 1
                goto L_0x016a
            L_0x023d:
                if (r6 == 0) goto L_0x0242
                r6.endTransaction(r11)     // Catch:{ all -> 0x02b9 }
            L_0x0242:
                java.lang.String r0 = "MicroMsg.emoji.EmojiInfoStorage"
                java.lang.String r3 = "[cpan] end preparedDownloadCustomMd5List user time:%d succes. size:%d"
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x02b9 }
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02b9 }
                long r5 = r5 - r9
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x02b9 }
                r6 = 0
                r4[r6] = r5     // Catch:{ all -> 0x02b9 }
                int r5 = r8.size()     // Catch:{ all -> 0x02b9 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x02b9 }
                r6 = 1
                r4[r6] = r5     // Catch:{ all -> 0x02b9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r4)     // Catch:{ all -> 0x02b9 }
                monitor-exit(r7)
                r4 = 1
            L_0x0265:
                com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
                wh3.g r0 = r0.mo57717d()
                int r3 = r2.f291724a
                java.util.LinkedList<java.lang.String> r5 = r2.f291728e
                r0.mo142055g(r3, r5)
                java.lang.String r0 = "MicroMsg.EmojiSyncMd5List"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "preparedDownloadCustomMd5List: "
                r3.append(r5)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
                fy3.q<java.lang.Boolean, java.util.List<java.lang.String>, pe3.b, rx3.b0> r0 = r2.f291726c
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                java.util.LinkedList<java.lang.String> r4 = r2.f291727d
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x029a:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x02b3
                java.lang.Object r6 = r4.next()
                r7 = r6
                java.lang.String r7 = (java.lang.String) r7
                boolean r7 = u61.C101964h.m134229k(r7)
                r8 = 1
                r7 = r7 ^ r8
                if (r7 == 0) goto L_0x029a
                r5.add(r6)
                goto L_0x029a
            L_0x02b3:
                pe3.b r2 = r2.f291729f
                r0.invoke(r3, r5, r2)
                goto L_0x02c7
            L_0x02b9:
                r0 = move-exception
                monitor-exit(r7)
                throw r0
            L_0x02bc:
                ll.o r0 = r1.f291731a
                fy3.q<java.lang.Boolean, java.util.List<java.lang.String>, pe3.b, rx3.b0> r0 = r0.f291726c
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                sx3.f0 r3 = sx3.C64186f0.f181907d
                r0.invoke(r2, r3, r6)
            L_0x02c7:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p595ll.C99502o.C99503a.call(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C99502o(int r2, java.lang.String r3, fy3.C32228q<? super java.lang.Boolean, ? super java.util.List<java.lang.String>, ? super pe3.C89349b, rx3.C13598b0> r4) {
        /*
            r1 = this;
            java.lang.String r0 = "callback"
            gy3.C87412m.m108594g(r4, r0)
            r1.<init>()
            r1.f291724a = r2
            r1.f291725b = r3
            r1.f291726c = r4
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r1.f291727d = r2
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r1.f291728e = r2
            sx3.h0 r2 = sx3.C64187h0.f181908d
            r1.f291730g = r2
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_LAST_DOWNLOAD_REQ_BUFF_STRING
            r4 = 0
            java.lang.Object r2 = r2.mo119685f(r3, r4)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L_0x0036
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
        L_0x0036:
            if (r4 == 0) goto L_0x0044
            pe3.b r2 = new pe3.b
            r3 = 2
            byte[] r3 = android.util.Base64.decode(r4, r3)
            r2.<init>(r3)
            r1.f291729f = r2
        L_0x0044:
            dl.o r2 = p490dl.C97489o.m125592g()
            java.util.ArrayList r2 = r2.mo136760a()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = sx3.C36907w.m41090l(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x005b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r2.next()
            com.tencent.mm.storage.emotion.EmojiInfo r4 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r4
            java.lang.String r4 = r4.getMd5()
            r3.add(r4)
            goto L_0x005b
        L_0x006f:
            java.util.HashSet r2 = sx3.C110818d0.m150951w0(r3)
            r1.f291730g = r2
            r1.mo138913a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p595ll.C99502o.<init>(int, java.lang.String, fy3.q):void");
    }

    /* renamed from: a */
    public final void mo138913a() {
        C89349b bVar;
        int i = this.f291724a;
        C89349b bVar2 = this.f291729f;
        String str = this.f291725b;
        if (str != null) {
            byte[] bytes = str.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            bVar = new C89349b(bytes, 0, bytes.length);
        } else {
            bVar = null;
        }
        new C97670a(2, i, (List) null, bVar2, bVar, 4, (C8480h) null).mo9225i().mo123420E(new C99503a(this));
    }
}
