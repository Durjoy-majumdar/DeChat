package j61;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import te3.C101800k70;
import te3.C101840sa;
import te3.C51365ta;
import u61.C101964h;

/* renamed from: j61.g */
public class C98908g extends C117747y implements C1311n, C46435b {

    /* renamed from: d */
    public C11385n f289934d;

    /* renamed from: e */
    public final C47350c f289935e;

    /* renamed from: f */
    public ArrayList<String> f289936f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<EmojiInfo> f289937g = new ArrayList<>();

    /* renamed from: h */
    public int f289938h = 0;

    /* renamed from: i */
    public int f289939i = 0;

    /* renamed from: j */
    public int f289940j;

    /* renamed from: n */
    public C72994y1.C72995a f289941n;

    /* renamed from: o */
    public C72994y1.C72995a f289942o;

    /* renamed from: p */
    public LinkedList<String> f289943p = new LinkedList<>();

    public C98908g(LinkedList<String> linkedList, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C101840sa();
        bVar.f127067b = new C51365ta();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmbatchemojidownload";
        bVar.f127069d = 697;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f289935e = bVar.mo72403a();
        this.f289938h = 0;
        this.f289939i = 1;
        this.f289943p = linkedList;
        this.f289940j = i;
        if (i == 1) {
            this.f289941n = C72994y1.C72995a.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN;
            this.f289942o = C72994y1.C72995a.USERINFO_EMOJI_NEXT_CAPTURE_BATCH_DOWNLOAD_TIME_LONG;
            return;
        }
        this.f289941n = C72994y1.C72995a.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN;
        this.f289942o = C72994y1.C72995a.USERINFO_EMOJI_NEXT_CUSTOM_BATCH_DOWNLOAD_TIME_LONG;
    }

    /* renamed from: B0 */
    public C51365ta mo71832B0() {
        C47350c cVar = this.f289935e;
        if (cVar == null) {
            return null;
        }
        return (C51365ta) cVar.f127056b.f127083a;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f289934d = nVar;
        C47350c cVar = this.f289935e;
        C101840sa saVar = (C101840sa) cVar.f127055a.f127080a;
        saVar.f299391d = this.f289938h;
        saVar.f299392e = this.f289939i;
        saVar.f299393f = this.f289943p;
        saVar.f299394g = this.f289940j;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return 697;
    }

    /* renamed from: j1 */
    public final void mo138243j1(C51365ta taVar) {
        Log.m105925i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addEmojiInfoList mCustomType: %d", Integer.valueOf(this.f289940j));
        if (taVar == null) {
            Log.m105924i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addEmojiInfoList response is null.");
            return;
        }
        LinkedList<C101800k70> linkedList = taVar.f142064g;
        if (linkedList == null || linkedList.size() <= 0) {
            Log.m105924i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addemojiInfoList EmojiList is null or size is empty.");
            return;
        }
        Iterator<C101800k70> it = taVar.f142064g.iterator();
        while (it.hasNext()) {
            C101800k70 next = it.next();
            if (Util.isNullOrNil(next.f298586d)) {
                Log.m105929w("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addEmojiInfoList: empty md5 %s", next);
            } else {
                this.f289936f.add(next.f298586d.toLowerCase());
                EmojiInfo emojiInfo = new EmojiInfo();
                C101964h.m134219a(next, emojiInfo);
                if (this.f289940j == 1) {
                    emojiInfo.field_groupId = "capture";
                } else {
                    emojiInfo.field_catalog = 81;
                }
                this.f289937g.add(emojiInfo);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x021a, code lost:
        if (r11 == null) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r11.endTransaction(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x021f, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end preparedDownloadCustomEmojiList user time:%d succes. size:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r7), java.lang.Integer.valueOf(r5.size()));
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0212 A[LOOP:0: B:39:0x013c->B:65:0x0212, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r19, int r20, int r21, java.lang.String r22, com.tencent.p014mm.network.C114799u r23, byte[] r24) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            r2 = r21
            r3 = r22
            java.lang.String r4 = "MicroMsg.emoji.NetSceneBatchEmojiDownLoad"
            java.lang.String r5 = "errType:%d, errCode:%d"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r20)
            r9 = 0
            r7[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r21)
            r10 = 1
            r7[r10] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r7)
            int r4 = r1.f289939i
            if (r4 != 0) goto L_0x03e4
            if (r0 != 0) goto L_0x03aa
            if (r2 == 0) goto L_0x002a
            goto L_0x03aa
        L_0x002a:
            ob0.c r4 = r1.f289935e
            ob0.c$d r5 = r4.f127056b
            pe3.a r5 = r5.f127083a
            te3.ta r5 = (te3.C51365ta) r5
            ob0.c$c r4 = r4.f127055a
            pe3.a r4 = r4.f127080a
            te3.sa r4 = (te3.C101840sa) r4
            int r7 = r5.f142063f
            if (r7 != 0) goto L_0x0060
            java.util.LinkedList<java.lang.String> r7 = r5.f142062e
            if (r7 == 0) goto L_0x0046
            int r7 = r7.size()
            if (r7 > 0) goto L_0x0060
        L_0x0046:
            ob0.n r4 = r1.f289934d
            r4.onSceneEnd(r0, r2, r3, r1)
            java.lang.String r0 = "MicroMsg.emoji.NetSceneBatchEmojiDownLoad"
            java.lang.String r2 = "[cpan] donwload list is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 164(0xa4, double:8.1E-322)
            r6 = 0
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            goto L_0x041c
        L_0x0060:
            int r7 = r5.f142063f
            if (r7 != r10) goto L_0x035e
            ob0.n r4 = r1.f289934d
            r4.onSceneEnd(r0, r2, r3, r1)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r2 = r1.f289942o
            long r3 = java.lang.System.currentTimeMillis()
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 + r7
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.mo119677K(r2, r3)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r2 = r1.f289941n
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.mo119677K(r2, r3)
            r1.mo138243j1(r5)
            java.lang.String r0 = "MicroMsg.emoji.NetSceneBatchEmojiDownLoad"
            java.lang.String r2 = "[cpan] preparedDownloadCustomEmojiList size:%s"
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.util.ArrayList<com.tencent.mm.storage.emotion.EmojiInfo> r5 = r1.f289937g
            if (r5 != 0) goto L_0x00a0
            r5 = 0
            goto L_0x00a4
        L_0x00a0:
            int r5 = r5.size()
        L_0x00a4:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r9] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r4)
            java.util.ArrayList<java.lang.String> r0 = r1.f289936f
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_RECOVER_CUSTOM_EMOJI_BOOLEAN
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_BACKUP_OVERSIZE_BOOLEAN
            if (r0 == 0) goto L_0x0311
            int r5 = r0.size()
            if (r5 > 0) goto L_0x00bd
            goto L_0x0311
        L_0x00bd:
            int r5 = r0.size()
            int r7 = p490dl.C97496s.m125613a()
            if (r5 >= r7) goto L_0x00d2
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            r5.mo119677K(r4, r3)
        L_0x00d2:
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Object r3 = r3.mo119685f(r2, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            com.tencent.mm.storage.w2 r3 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r3 = r3.mo57717d()
            int r4 = r1.f289940j
            java.util.ArrayList<com.tencent.mm.storage.emotion.EmojiInfo> r5 = r1.f289937g
            monitor-enter(r3)
            java.lang.String r7 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r8 = "[cpan] begin preparedDownloadCustomEmojiList %s, %s"
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ all -> 0x030e }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x030e }
            r11[r9] = r12     // Catch:{ all -> 0x030e }
            int r12 = r5.size()     // Catch:{ all -> 0x030e }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x030e }
            r11[r10] = r12     // Catch:{ all -> 0x030e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r11)     // Catch:{ all -> 0x030e }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x030e }
            int r11 = r5.size()     // Catch:{ all -> 0x030e }
            if (r11 > 0) goto L_0x011f
            java.lang.String r4 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r5 = "[cpan] perparedDownloadCustomEmojiList failed. list is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ all -> 0x030e }
            monitor-exit(r3)
            goto L_0x0241
        L_0x011f:
            r13 = -1
            com.tencent.mm.sdk.storage.ISQLiteDatabase r11 = r3.f301704d     // Catch:{ all -> 0x030e }
            boolean r15 = r11 instanceof zh3.C91753f     // Catch:{ all -> 0x030e }
            if (r15 == 0) goto L_0x0136
            zh3.f r11 = (zh3.C91753f) r11     // Catch:{ all -> 0x030e }
            java.lang.Thread r13 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x030e }
            long r13 = r13.getId()     // Catch:{ all -> 0x030e }
            long r13 = r11.beginTransaction(r13)     // Catch:{ all -> 0x030e }
            goto L_0x0137
        L_0x0136:
            r11 = 0
        L_0x0137:
            java.util.Iterator r15 = r5.iterator()     // Catch:{ all -> 0x030e }
            r6 = 1
        L_0x013c:
            boolean r16 = r15.hasNext()     // Catch:{ all -> 0x030e }
            if (r16 == 0) goto L_0x021a
            java.lang.Object r16 = r15.next()     // Catch:{ all -> 0x030e }
            r9 = r16
            com.tencent.mm.storage.emotion.EmojiInfo r9 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r9     // Catch:{ all -> 0x030e }
            java.lang.String r12 = r9.getMd5()     // Catch:{ all -> 0x030e }
            com.tencent.mm.storage.emotion.EmojiInfo r10 = r3.mo142044TO(r12)     // Catch:{ all -> 0x030e }
            if (r10 == 0) goto L_0x0167
            java.lang.String r17 = r10.getMd5()     // Catch:{ all -> 0x030e }
            boolean r17 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)     // Catch:{ all -> 0x030e }
            if (r17 == 0) goto L_0x015f
            goto L_0x0167
        L_0x015f:
            r20 = r15
            r15 = 1
            r10.field_source = r15     // Catch:{ all -> 0x030e }
            r21 = r13
            goto L_0x017b
        L_0x0167:
            r20 = r15
            com.tencent.mm.storage.emotion.EmojiInfo r10 = new com.tencent.mm.storage.emotion.EmojiInfo     // Catch:{ all -> 0x030e }
            r10.<init>()     // Catch:{ all -> 0x030e }
            r10.field_md5 = r12     // Catch:{ all -> 0x030e }
            r12 = 1
            r10.field_source = r12     // Catch:{ all -> 0x030e }
            r21 = r13
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x030e }
            r10.field_lastUseTime = r12     // Catch:{ all -> 0x030e }
        L_0x017b:
            r12 = 81
            r13 = 1
            if (r4 != r13) goto L_0x0191
            int r13 = r10.field_catalog     // Catch:{ all -> 0x030e }
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r14 = com.tencent.p014mm.storage.emotion.EmojiInfo.f284123W1     // Catch:{ all -> 0x030e }
            if (r13 == r12) goto L_0x018a
            r12 = 65
            r10.field_catalog = r12     // Catch:{ all -> 0x030e }
        L_0x018a:
            java.lang.String r12 = "capture"
            r10.field_groupId = r12     // Catch:{ all -> 0x030e }
            r10.field_idx = r6     // Catch:{ all -> 0x030e }
            goto L_0x0197
        L_0x0191:
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r13 = com.tencent.p014mm.storage.emotion.EmojiInfo.f284123W1     // Catch:{ all -> 0x030e }
            r10.field_catalog = r12     // Catch:{ all -> 0x030e }
            r10.field_reserved3 = r6     // Catch:{ all -> 0x030e }
        L_0x0197:
            boolean r12 = r10.mo135616m2()     // Catch:{ all -> 0x030e }
            if (r12 == 0) goto L_0x01b2
            int r12 = r10.field_reserved4     // Catch:{ all -> 0x030e }
            r13 = 1
            r12 = r12 | r13
            r10.field_reserved4 = r12     // Catch:{ all -> 0x030e }
            r12 = 3
            r10.field_state = r12     // Catch:{ all -> 0x030e }
            java.lang.String r12 = r10.mo62640K1()     // Catch:{ all -> 0x030e }
            long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)     // Catch:{ all -> 0x030e }
            int r13 = (int) r12     // Catch:{ all -> 0x030e }
            r10.field_size = r13     // Catch:{ all -> 0x030e }
            goto L_0x01b5
        L_0x01b2:
            r12 = 4
            r10.field_state = r12     // Catch:{ all -> 0x030e }
        L_0x01b5:
            u61.C101964h.m134234p(r9, r10)     // Catch:{ all -> 0x030e }
            java.lang.String r9 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r12 = "preparedDownloadCustomEmojiList: %s, %s, %s"
            r13 = 3
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ all -> 0x030e }
            java.lang.String r13 = r10.getMd5()     // Catch:{ all -> 0x030e }
            r15 = 0
            r14[r15] = r13     // Catch:{ all -> 0x030e }
            int r13 = r10.field_state     // Catch:{ all -> 0x030e }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x030e }
            r15 = 1
            r14[r15] = r13     // Catch:{ all -> 0x030e }
            int r13 = r10.field_size     // Catch:{ all -> 0x030e }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x030e }
            r15 = 2
            r14[r15] = r13     // Catch:{ all -> 0x030e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r12, r14)     // Catch:{ all -> 0x030e }
            int r6 = r6 + 1
            android.content.ContentValues r9 = r10.convertTo()     // Catch:{ all -> 0x030e }
            com.tencent.mm.sdk.storage.ISQLiteDatabase r10 = r3.f301704d     // Catch:{ all -> 0x030e }
            java.lang.String r12 = "EmojiInfo"
            java.lang.String r13 = "md5"
            long r9 = r10.replace(r12, r13, r9)     // Catch:{ all -> 0x030e }
            r12 = 0
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x0212
            if (r11 == 0) goto L_0x01fa
            r13 = r21
            r11.endTransaction(r13)     // Catch:{ all -> 0x030e }
        L_0x01fa:
            java.lang.String r4 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r5 = "[cpan] end preparedDownloadCustomEmojiList user time:%d faild "
            r6 = 1
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x030e }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x030e }
            long r10 = r10 - r7
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x030e }
            r7 = 0
            r9[r7] = r6     // Catch:{ all -> 0x030e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r9)     // Catch:{ all -> 0x030e }
            monitor-exit(r3)
            goto L_0x0241
        L_0x0212:
            r15 = r20
            r13 = r21
            r9 = 0
            r10 = 1
            goto L_0x013c
        L_0x021a:
            if (r11 == 0) goto L_0x021f
            r11.endTransaction(r13)     // Catch:{ all -> 0x030e }
        L_0x021f:
            java.lang.String r4 = "MicroMsg.emoji.EmojiInfoStorage"
            java.lang.String r6 = "[cpan] end preparedDownloadCustomEmojiList user time:%d succes. size:%d"
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x030e }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x030e }
            long r11 = r11 - r7
            java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x030e }
            r8 = 0
            r10[r8] = r7     // Catch:{ all -> 0x030e }
            int r5 = r5.size()     // Catch:{ all -> 0x030e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x030e }
            r7 = 1
            r10[r7] = r5     // Catch:{ all -> 0x030e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r10)     // Catch:{ all -> 0x030e }
            monitor-exit(r3)
        L_0x0241:
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.mo119677K(r2, r4)
            com.tencent.mm.storage.w2 r2 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r2 = r2.mo57717d()
            int r3 = r1.f289940j
            r2.mo142055g(r3, r0)
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r0 = r0.mo57717d()
            r2 = 0
            java.util.List r0 = r0.mo142065uP(r2)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x02bc
            java.lang.String r3 = "MicroMsg.emoji.NetSceneBatchEmojiDownLoad"
            java.lang.String r4 = "try to sync emoji downloadList:%d"
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r6)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r4[r2] = r6
            int r6 = r1.f289940j
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            r6 = 11595(0x2d4b, float:1.6248E-41)
            r0.mo160131h(r6, r4)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r4)
            if (r4 == 0) goto L_0x02d1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            int r2 = r1.f289940j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r5] = r2
            r0.mo160131h(r6, r3)
            goto L_0x02d1
        L_0x02bc:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r2 = r1.f289941n
            r0.mo119677K(r2, r4)
            java.lang.String r0 = "MicroMsg.emoji.NetSceneBatchEmojiDownLoad"
            java.lang.String r2 = "no things need to download."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
        L_0x02d1:
            int r0 = r1.f289940j
            r2 = 1
            if (r0 != r2) goto L_0x02e8
            dl.o r0 = p490dl.C97489o.m125592g()
            r0.mo136770l(r2)
            com.tencent.mm.emoji.sync.a$f r0 = com.tencent.p014mm.emoji.sync.C92668a.f266699q
            r3 = 0
            ll.t r0 = r0.mo126717a(r3)
            r0.mo126702d(r2)
            goto L_0x0300
        L_0x02e8:
            r3 = 0
            dl.o r0 = p490dl.C97489o.m125592g()
            r0.mo136771m(r2)
            dl.o r0 = p490dl.C97489o.m125592g()
            r0.mo136769k(r2)
            com.tencent.mm.emoji.sync.a$f r0 = com.tencent.p014mm.emoji.sync.C92668a.f266699q
            ll.t r0 = r0.mo126718b(r3)
            r0.mo126702d(r2)
        L_0x0300:
            dl.p r0 = p490dl.C97491p.f286143a
            r0.mo136773a(r2)
            com.tencent.mm.autogen.events.RefreshSmileyPanelEvent r0 = new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent
            r0.<init>()
            r0.publish()
            goto L_0x0323
        L_0x030e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0311:
            java.lang.String r0 = "MicroMsg.emoji.NetSceneBatchEmojiDownLoad"
            java.lang.String r2 = "[cpan] perparedDownloadCustomEmojiList failed. list is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r0.mo119677K(r4, r3)
        L_0x0323:
            int r0 = r1.f289940j
            if (r0 != 0) goto L_0x0350
            java.util.ArrayList<java.lang.String> r0 = r1.f289936f
            java.lang.String r2 = "08f223fa83f1ca34e143d1e580252c7c"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x034d
            java.util.ArrayList<java.lang.String> r0 = r1.f289936f
            java.lang.String r2 = "9bd1281af3a31710a45b84d736363691"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x033c
            goto L_0x034d
        L_0x033c:
            dl.p r0 = p490dl.C97491p.f286143a
            r2 = 0
            r0.mo136773a(r2)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.mo136774c()
            java.lang.String r2 = "game_to_custom"
            r3 = 1
            r0.putBoolean(r2, r3)
            goto L_0x0350
        L_0x034d:
            u61.C101964h.m134223e()
        L_0x0350:
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 164(0xa4, double:8.1E-322)
            r7 = 0
            r9 = 1
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)
            goto L_0x041c
        L_0x035e:
            java.lang.String r6 = "MicroMsg.emoji.NetSceneBatchEmojiDownLoad"
            java.lang.String r7 = "[cpan] do next scene. index:%d size:%d"
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            int r9 = r4.f299391d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 0
            r8[r10] = r9
            java.util.LinkedList<java.lang.String> r9 = r5.f142062e
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 1
            r8[r10] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r8)
            ob0.n r6 = r1.f289934d
            r6.onSceneEnd(r0, r2, r3, r1)
            int r0 = r5.f142061d
            r4.f299391d = r0
            r1.f289938h = r0
            r1.mo138243j1(r5)
            com.tencent.mm.network.g r0 = r18.dispatcher()
            ob0.n r2 = r1.f289934d
            int r0 = r1.doScene(r0, r2)
            if (r19 >= 0) goto L_0x041c
            java.lang.String r2 = "MicroMsg.emoji.NetSceneBatchEmojiDownLoad"
            java.lang.String r3 = "[cpan] doScene error.nextNetId:%d"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r4[r5] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r4)
            goto L_0x041c
        L_0x03aa:
            ob0.n r4 = r1.f289934d
            r4.onSceneEnd(r0, r2, r3, r1)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 164(0xa4, double:8.1E-322)
            r8 = 1
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r2 = r1.f289942o
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r3 = r3 + r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.mo119677K(r2, r3)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r2 = r1.f289941n
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.mo119677K(r2, r3)
            return
        L_0x03e4:
            if (r0 != 0) goto L_0x041d
            if (r2 == 0) goto L_0x03e9
            goto L_0x041d
        L_0x03e9:
            ob0.c r4 = r1.f289935e
            ob0.c$d r5 = r4.f127056b
            pe3.a r5 = r5.f127083a
            te3.ta r5 = (te3.C51365ta) r5
            ob0.c$c r4 = r4.f127055a
            pe3.a r4 = r4.f127080a
            te3.sa r4 = (te3.C101840sa) r4
            java.util.LinkedList<te3.k70> r4 = r5.f142064g
            if (r4 == 0) goto L_0x0410
            int r4 = r4.size()
            if (r4 > 0) goto L_0x0402
            goto L_0x0410
        L_0x0402:
            com.tencent.mm.storage.w2 r4 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r4 = r4.mo57717d()
            java.util.LinkedList<te3.k70> r5 = r5.f142064g
            r4.P50(r5)
            goto L_0x0417
        L_0x0410:
            java.lang.String r4 = "MicroMsg.emoji.NetSceneBatchEmojiDownLoad"
            java.lang.String r5 = "Change MD5 to URL failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
        L_0x0417:
            ob0.n r4 = r1.f289934d
            r4.onSceneEnd(r0, r2, r3, r1)
        L_0x041c:
            return
        L_0x041d:
            ob0.n r4 = r1.f289934d
            r4.onSceneEnd(r0, r2, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j61.C98908g.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public int securityLimitCount() {
        return 150;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
