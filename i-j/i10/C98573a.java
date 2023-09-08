package i10;

import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import eb0.C75592q0;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import l10.C46829e;
import l10.C46830i;
import l10.C46831j;
import ob0.C11385n;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C101789j00;
import te3.C101802kr2;
import te3.C101804kv2;

/* renamed from: i10.a */
public final class C98573a implements C11385n {

    /* renamed from: d */
    public final String f289016d;

    /* renamed from: e */
    public final boolean f289017e;

    /* renamed from: f */
    public long f289018f;

    /* renamed from: g */
    public C32226l<? super C46829e, C13598b0> f289019g;

    /* renamed from: i10.a$a */
    public enum C98574a {
        Text,
        Image,
        Video,
        Unknown
    }

    public C98573a(String str) {
        C87412m.m108594g(str, "username");
        this.f289016d = str;
        this.f289017e = C87412m.m108589b(str, C75592q0.m90789s());
    }

    /* renamed from: a */
    public final C46830i mo137948a(SnsInfo snsInfo) {
        LinkedList<C101804kv2> linkedList;
        C98574a aVar = C98574a.Video;
        C98574a aVar2 = C98574a.Image;
        boolean z = false;
        if (!C64197v.m75537f(2, 1, 15).contains(Integer.valueOf(snsInfo.getTypeFlag()))) {
            return null;
        }
        int createTime = snsInfo.getCreateTime();
        int typeFlag = snsInfo.getTypeFlag();
        C98574a aVar3 = typeFlag != 1 ? typeFlag != 2 ? typeFlag != 15 ? C98574a.Unknown : aVar : C98574a.Text : aVar2;
        TimeLineObject timeLine = snsInfo.getTimeLine();
        if (timeLine == null) {
            return null;
        }
        String str = timeLine.ContentDesc;
        C101789j00 j002 = timeLine.ContentObj;
        if (j002 == null || (linkedList = j002.f298427h) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!linkedList.isEmpty()) {
            if (aVar3 == aVar2) {
                Iterator<C101804kv2> it = linkedList.iterator();
                while (it.hasNext()) {
                    C101804kv2 next = it.next();
                    if (next.f298690e == 2) {
                        C46831j jVar = new C46831j();
                        jVar.f125970e = next.f298689d;
                        jVar.f125969d = 0;
                        arrayList.add(jVar);
                    }
                }
            } else if (aVar3 == aVar) {
                Iterator<C101804kv2> it4 = linkedList.iterator();
                while (it4.hasNext()) {
                    C101804kv2 next2 = it4.next();
                    int i = next2.f298690e;
                    if (i == 4 || i == 6) {
                        C46831j jVar2 = new C46831j();
                        jVar2.f125970e = next2.f298689d;
                        jVar2.f125969d = 1;
                        arrayList.add(jVar2);
                    }
                }
            }
        }
        C46830i iVar = new C46830i();
        iVar.f125961d = ((long) createTime) * ((long) 1000);
        iVar.f125963f = aVar3.ordinal();
        iVar.f125964g = str;
        iVar.f125965h = new LinkedList<>();
        iVar.f125962e = snsInfo.getSnsId();
        iVar.f125966i = snsInfo.getLocalid();
        String str2 = timeLine.f283893Id;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        iVar.f125968n = str2;
        String str4 = timeLine.Location.f298650g;
        if (str4 == null || str4.length() == 0) {
            z = true;
        }
        C101802kr2 kr22 = timeLine.Location;
        if (z) {
            String str5 = kr22.f298649f;
            if (str5 != null) {
                str3 = str5;
            }
        } else {
            str3 = kr22.f298650g;
        }
        iVar.f125967j = str3;
        iVar.f125965h.addAll(arrayList);
        return iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c8, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c9, code lost:
        cy3.C58003b.m67160a(r14, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cc, code lost:
        throw r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r11, int r12, java.lang.String r13, ob0.C117747y r14) {
        /*
            r10 = this;
            r13 = 212(0xd4, float:2.97E-43)
            if (r14 == 0) goto L_0x000c
            int r14 = r14.getType()
            if (r14 != r13) goto L_0x000c
            r14 = 1
            goto L_0x000d
        L_0x000c:
            r14 = 0
        L_0x000d:
            if (r14 == 0) goto L_0x00cd
            f40.g r14 = f40.C86709a0.m107529k()
            ob0.b0 r14 = r14.f251779b
            r14.mo123470p(r13, r10)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "on snsUserPage sceneEnd, errType:"
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = ", errCode:"
            r13.append(r11)
            r13.append(r12)
            java.lang.String r11 = r13.toString()
            java.lang.String r12 = "MicroMsg.SnsDataSource"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            long r13 = java.lang.System.currentTimeMillis()
            long r0 = r10.f289018f
            long r0 = r13 - r0
            double r0 = (double) r0
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            int r8 = (int) r0
            r11 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r11
            long r13 = r13 / r0
            int r9 = (int) r13
            os2.e0 r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r4 = r10.f289016d
            boolean r6 = r10.f289017e
            r2.getClass()
            java.lang.String r11 = "getCursorByUserName"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)
            r3 = 1
            r5 = 0
            java.lang.String r7 = ""
            android.database.Cursor r14 = r2.mo139801NQ(r3, r4, r5, r6, r7, r8, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
            l10.e r11 = new l10.e
            r11.<init>()
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            r11.f125960e = r13
            r13 = 0
            boolean r0 = r14.moveToFirst()     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x00b9
        L_0x007c:
            com.tencent.mm.plugin.sns.storage.SnsInfo r0 = new com.tencent.mm.plugin.sns.storage.SnsInfo     // Catch:{ all -> 0x00c6 }
            r0.<init>()     // Catch:{ all -> 0x00c6 }
            r0.convertFrom((android.database.Cursor) r14)     // Catch:{ all -> 0x00c6 }
            l10.i r0 = r10.mo137948a(r0)     // Catch:{ all -> 0x00c6 }
            if (r0 == 0) goto L_0x008f
            java.util.LinkedList<l10.i> r1 = r11.f125960e     // Catch:{ all -> 0x00c6 }
            r1.add(r0)     // Catch:{ all -> 0x00c6 }
        L_0x008f:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x007c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c6 }
            r0.<init>()     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = "final dataList size:"
            r0.append(r1)     // Catch:{ all -> 0x00c6 }
            java.util.LinkedList<l10.i> r1 = r11.f125960e     // Catch:{ all -> 0x00c6 }
            int r1 = r1.size()     // Catch:{ all -> 0x00c6 }
            r0.append(r1)     // Catch:{ all -> 0x00c6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ all -> 0x00c6 }
            fy3.l<? super l10.e, rx3.b0> r12 = r10.f289019g     // Catch:{ all -> 0x00c6 }
            if (r12 == 0) goto L_0x00c2
            r12.invoke(r11)     // Catch:{ all -> 0x00c6 }
            rx3.b0 r11 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00c6 }
            goto L_0x00c2
        L_0x00b9:
            fy3.l<? super l10.e, rx3.b0> r12 = r10.f289019g     // Catch:{ all -> 0x00c6 }
            if (r12 == 0) goto L_0x00c2
            r12.invoke(r11)     // Catch:{ all -> 0x00c6 }
            rx3.b0 r11 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00c6 }
        L_0x00c2:
            cy3.C58003b.m67160a(r14, r13)
            goto L_0x00cd
        L_0x00c6:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r12 = move-exception
            cy3.C58003b.m67160a(r14, r11)
            throw r12
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i10.C98573a.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
