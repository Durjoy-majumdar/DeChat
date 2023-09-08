package ew2;

import te3.pb4;

/* renamed from: ew2.c */
public final class C97767c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ pb4 f286842d;

    public C97767c(pb4 pb4) {
        this.f286842d = pb4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            ew2.b r0 = ew2.C97758b.f286820d
            te3.pb4 r1 = r12.f286842d
            te3.ob4 r0 = r0.mo137093g(r1)
            long r1 = r0.f299014d
            com.tencent.mm.plugin.story.model.StoryCore$h r3 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            kw2.j r3 = r3.mo134191i()
            kw2.i r3 = r3.mo138664Ow(r1)
            if (r3 != 0) goto L_0x0018
            goto L_0x00dd
        L_0x0018:
            te3.hc4 r4 = new te3.hc4
            r4.<init>()
            byte[] r5 = r3.field_attrBuf     // Catch:{ Exception -> 0x0023 }
            r4.parseFrom(r5)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0024
        L_0x0023:
        L_0x0024:
            java.lang.String r5 = r0.f299020j
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r6 = 0
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x0068
            int r5 = r0.f299024q
            if (r5 == 0) goto L_0x0062
            java.util.LinkedList<te3.ob4> r5 = r4.f298343p
            java.lang.String r9 = "storyObj.BubbleList"
            gy3.C87412m.m108593f(r5, r9)
            java.util.Iterator r5 = r5.iterator()
        L_0x003f:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0058
            java.lang.Object r9 = r5.next()
            r10 = r9
            te3.ob4 r10 = (te3.ob4) r10
            int r10 = r10.f299024q
            int r11 = r0.f299024q
            if (r10 != r11) goto L_0x0054
            r10 = 1
            goto L_0x0055
        L_0x0054:
            r10 = 0
        L_0x0055:
            if (r10 == 0) goto L_0x003f
            r6 = r9
        L_0x0058:
            te3.ob4 r6 = (te3.ob4) r6
            if (r6 != 0) goto L_0x00a1
            java.util.LinkedList<te3.ob4> r5 = r4.f298343p
            r5.add(r0)
            goto L_0x00a0
        L_0x0062:
            java.util.LinkedList<te3.ob4> r5 = r4.f298343p
            r5.add(r0)
            goto L_0x00a0
        L_0x0068:
            int r5 = r0.f299024q
            if (r5 == 0) goto L_0x009b
            java.util.LinkedList<te3.ob4> r5 = r4.f298341n
            java.lang.String r9 = "storyObj.CommentList"
            gy3.C87412m.m108593f(r5, r9)
            java.util.Iterator r5 = r5.iterator()
        L_0x0078:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0091
            java.lang.Object r9 = r5.next()
            r10 = r9
            te3.ob4 r10 = (te3.ob4) r10
            int r10 = r10.f299024q
            int r11 = r0.f299024q
            if (r10 != r11) goto L_0x008d
            r10 = 1
            goto L_0x008e
        L_0x008d:
            r10 = 0
        L_0x008e:
            if (r10 == 0) goto L_0x0078
            r6 = r9
        L_0x0091:
            te3.ob4 r6 = (te3.ob4) r6
            if (r6 != 0) goto L_0x00a1
            java.util.LinkedList<te3.ob4> r5 = r4.f298341n
            r5.add(r0)
            goto L_0x00a0
        L_0x009b:
            java.util.LinkedList<te3.ob4> r5 = r4.f298341n
            r5.add(r0)
        L_0x00a0:
            r7 = 1
        L_0x00a1:
            if (r7 == 0) goto L_0x00dd
            java.util.LinkedList<te3.ob4> r0 = r4.f298341n
            int r0 = r0.size()
            r4.f298340j = r0
            java.util.LinkedList<te3.ob4> r0 = r4.f298343p
            int r0 = r0.size()
            r4.f298342o = r0
            byte[] r0 = r4.toByteArray()     // Catch:{ Exception -> 0x00ba }
            r3.field_attrBuf = r0     // Catch:{ Exception -> 0x00ba }
            goto L_0x00bb
        L_0x00ba:
        L_0x00bb:
            com.tencent.mm.plugin.story.model.StoryCore$h r0 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            kw2.j r4 = r0.mo134191i()
            r4.update(r1, r3)
            java.lang.String r1 = r3.field_userName
            if (r1 == 0) goto L_0x00dd
            kw2.f r2 = r0.mo134189g()
            kw2.e r1 = r2.mo138646jo(r1)
            long r2 = eb0.C31543z5.m39451a()
            r1.field_interactTime = r2
            kw2.f r0 = r0.mo134189g()
            r0.mo138641SE(r1)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ew2.C97767c.run():void");
    }
}
