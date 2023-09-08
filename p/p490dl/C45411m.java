package p490dl;

import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import com.tencent.p014mm.storage.emotion.EmojiIPSetInfo;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import z51.C39315g;
import zc3.C103010b;

/* renamed from: dl.m */
public final class C45411m {

    /* renamed from: c */
    public static final C45412a f122928c = new C45412a((C8480h) null);

    /* renamed from: a */
    public EmojiIPSetInfo f122929a;

    /* renamed from: b */
    public final LinkedList<EmojiGroupInfo> f122930b;

    /* renamed from: dl.m$a */
    public static final class C45412a {
        public C45412a(C8480h hVar) {
        }

        /* renamed from: a */
        public final List<C45411m> mo70911a(List<? extends EmojiGroupInfo> list) {
            C87412m.m108594g(list, "emojiGroupInfoList");
            LinkedList<C45411m> linkedList = new LinkedList<>();
            HashMap hashMap = new HashMap();
            C103010b provider = ((C39315g) C86312j.m106911c(C39315g.class)).getProvider();
            for (EmojiGroupInfo emojiGroupInfo : list) {
                String str = emojiGroupInfo.field_ipKey;
                EmojiIPSetInfo p = provider.mo138031p(str);
                if (p == null) {
                    C45411m mVar = new C45411m((EmojiIPSetInfo) null, 1, (C8480h) null);
                    mVar.f122930b.add(emojiGroupInfo);
                    linkedList.add(mVar);
                } else {
                    C45411m mVar2 = (C45411m) hashMap.get(str);
                    if (mVar2 == null) {
                        mVar2 = new C45411m(p);
                        C87412m.m108593f(str, "ipKey");
                        hashMap.put(str, mVar2);
                        linkedList.add(mVar2);
                    }
                    mVar2.f122930b.add(emojiGroupInfo);
                }
            }
            for (C45411m mVar3 : linkedList) {
                if (mVar3.f122930b.size() == 1) {
                    mVar3.f122929a = null;
                }
            }
            return linkedList;
        }
    }

    public C45411m() {
        this((EmojiIPSetInfo) null, 1, (C8480h) null);
    }

    public C45411m(EmojiIPSetInfo emojiIPSetInfo) {
        this.f122929a = emojiIPSetInfo;
        this.f122930b = new LinkedList<>();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r2 = r12.f142080d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m50355a(te3.C51369ta3 r12) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updateGroupIpInfo: ip:"
            r0.append(r1)
            r1 = 0
            if (r12 == 0) goto L_0x0014
            te3.m80 r2 = r12.f142080d
            if (r2 == 0) goto L_0x0014
            java.lang.String r2 = r2.f137902g
            goto L_0x0015
        L_0x0014:
            r2 = r1
        L_0x0015:
            r0.append(r2)
            java.lang.String r2 = ", group:["
            r0.append(r2)
            if (r12 == 0) goto L_0x0030
            java.util.LinkedList<java.lang.String> r3 = r12.f142081e
            if (r3 == 0) goto L_0x0030
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 63
            r11 = 0
            java.lang.String r1 = sx3.C110818d0.m150921S(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0030:
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.EmojiIPSetGroupInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            if (r12 != 0) goto L_0x0044
            goto L_0x00a6
        L_0x0044:
            com.tencent.mm.storage.emotion.EmojiIPSetInfo$b r0 = com.tencent.p014mm.storage.emotion.EmojiIPSetInfo.f82658v
            te3.m80 r1 = r12.f142080d
            java.lang.String r2 = "ipGroupInfo.EmotionSetInfo"
            gy3.C87412m.m108593f(r1, r2)
            com.tencent.mm.storage.emotion.EmojiIPSetInfo r0 = r0.mo57636a(r1)
            java.lang.String r1 = r0.field_key
            r2 = 0
            if (r1 == 0) goto L_0x005f
            int r1 = r1.length()
            if (r1 != 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r1 = 0
            goto L_0x0060
        L_0x005f:
            r1 = 1
        L_0x0060:
            if (r1 == 0) goto L_0x0063
            goto L_0x00a6
        L_0x0063:
            com.tencent.mm.storage.w2 r1 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.d r1 = r1.f82786r
            r1.mo61529Lo(r0)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.LinkedList<java.lang.String> r12 = r12.f142081e
            if (r12 == 0) goto L_0x009b
            java.util.Iterator r12 = r12.iterator()
        L_0x0079:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L_0x009b
            java.lang.Object r3 = r12.next()
            java.lang.String r3 = (java.lang.String) r3
            com.tencent.mm.storage.w2 r4 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.c r4 = r4.mo57715b()
            com.tencent.mm.storage.emotion.EmojiGroupInfo r3 = r4.mo142025bF(r3, r2)
            if (r3 == 0) goto L_0x0079
            java.lang.String r4 = r0.field_key
            r3.field_ipKey = r4
            r1.add(r3)
            goto L_0x0079
        L_0x009b:
            com.tencent.mm.storage.w2 r12 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.c r12 = r12.mo57715b()
            r12.mo142033uP(r1)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p490dl.C45411m.m50355a(te3.ta3):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C45411m(EmojiIPSetInfo emojiIPSetInfo, int i, C8480h hVar) {
        this((i & 1) != 0 ? null : emojiIPSetInfo);
    }
}
