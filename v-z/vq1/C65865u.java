package vq1;

import hp3.C87581a;
import vq1.C65869y;

/* renamed from: vq1.u */
public final class C65865u<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C52984v f189404a;

    /* renamed from: b */
    public final /* synthetic */ C65869y.C65870a f189405b;

    public C65865u(C52984v vVar, C65869y.C65870a aVar) {
        this.f189404a = vVar;
        this.f189405b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0206  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r12) {
        /*
            r11 = this;
            ob0.b$c r12 = (ob0.C89132b.C89134c) r12
            u60.n r0 = u60.C65234n.Fail
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LikeActionTask callback "
            r1.append(r2)
            int r2 = r12.f256793a
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            int r3 = r12.f256794b
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = r12.f256795c
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Finder.LikeActionTask"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            int r1 = r12.f256793a
            r3 = 4
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x0257
            int r6 = r12.f256794b
            if (r6 != 0) goto L_0x0257
            vq1.v r0 = r11.f189404a
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.f147887c
            int r0 = r0.getLikeCount()
            vq1.v r1 = r11.f189404a
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.f147887c
            int r1 = r1.getLikeFlag()
            vq1.v r6 = r11.f189404a
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.f147887c
            int r6 = r6.getFriendLikeCount()
            vq1.v r7 = r11.f189404a
            boolean r8 = r7.f147890f
            r9 = -1
            if (r8 == 0) goto L_0x0070
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.f147887c
            int r8 = r7.getLikeCount()
            vq1.v r10 = r11.f189404a
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r10.f147887c
            int r10 = r10.getLikeFlag()
            if (r10 == 0) goto L_0x006a
            r10 = 0
            goto L_0x006b
        L_0x006a:
            r10 = 1
        L_0x006b:
            int r8 = r8 + r10
            r7.setLikeCount(r8)
            goto L_0x0087
        L_0x0070:
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.f147887c
            int r8 = r7.getLikeCount()
            vq1.v r10 = r11.f189404a
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r10.f147887c
            int r10 = r10.getLikeFlag()
            if (r10 == 0) goto L_0x0082
            r10 = -1
            goto L_0x0083
        L_0x0082:
            r10 = 0
        L_0x0083:
            int r8 = r8 + r10
            r7.setLikeCount(r8)
        L_0x0087:
            if (r1 != r4) goto L_0x009e
            vq1.v r7 = r11.f189404a
            boolean r8 = r7.f147890f
            if (r8 == 0) goto L_0x0093
            boolean r8 = r7.f147891g
            if (r8 == 0) goto L_0x009e
        L_0x0093:
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.f147887c
            int r8 = r7.getFriendLikeCount()
            int r8 = r8 + r9
            r7.setFriendLikeCount(r8)
            goto L_0x00b4
        L_0x009e:
            if (r1 == r4) goto L_0x00b4
            vq1.v r7 = r11.f189404a
            boolean r8 = r7.f147890f
            if (r8 == 0) goto L_0x00b4
            boolean r8 = r7.f147891g
            if (r8 != 0) goto L_0x00b4
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.f147887c
            int r8 = r7.getFriendLikeCount()
            int r8 = r8 + r4
            r7.setFriendLikeCount(r8)
        L_0x00b4:
            vq1.v r7 = r11.f189404a
            boolean r8 = r7.f147890f
            if (r8 == 0) goto L_0x00ca
            boolean r8 = r7.f147891g
            if (r8 != 0) goto L_0x00ca
            vq1.w r8 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.f147887c
            java.util.LinkedList r7 = r7.getLikeList()
            r8.mo89903a(r7)
            goto L_0x00d5
        L_0x00ca:
            vq1.w r8 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.f147887c
            java.util.LinkedList r7 = r7.getLikeList()
            r8.mo89912k(r7)
        L_0x00d5:
            vq1.v r7 = r11.f189404a
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r7.f147887c
            boolean r9 = r7.f147890f
            r10 = 2
            if (r9 == 0) goto L_0x00e4
            boolean r7 = r7.f147891g
            if (r7 == 0) goto L_0x00e4
            r7 = 2
            goto L_0x00e9
        L_0x00e4:
            if (r9 == 0) goto L_0x00e8
            r7 = 1
            goto L_0x00e9
        L_0x00e8:
            r7 = 0
        L_0x00e9:
            r8.setLikeFlag(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "CgiFinderLikeFeed end likeFlag:"
            r7.append(r8)
            vq1.v r8 = r11.f189404a
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.f147887c
            int r8 = r8.getLikeFlag()
            r7.append(r8)
            java.lang.String r8 = " likeCount "
            r7.append(r8)
            vq1.v r8 = r11.f189404a
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.f147887c
            int r8 = r8.getLikeCount()
            r7.append(r8)
            java.lang.String r8 = " friendLikeCount:"
            r7.append(r8)
            vq1.v r8 = r11.f189404a
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.f147887c
            int r8 = r8.getFriendLikeCount()
            r7.append(r8)
            java.lang.String r8 = ",  "
            r7.append(r8)
            r7.append(r1)
            r7.append(r2)
            r7.append(r0)
            java.lang.String r1 = ", oldFriendLikeCount:"
            r7.append(r1)
            r7.append(r6)
            java.lang.String r1 = r7.toString()
            java.lang.String r2 = "Finder.LikeAction"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            vq1.w r1 = vq1.C65866w.f189407h
            vq1.v r2 = r11.f189404a
            r1.mo89910i(r2)
            vq1.y$a r1 = r11.f189405b
            u60.n r2 = u60.C65234n.OK
            r1.mo14006a(r2, r5)
            com.tencent.mm.autogen.events.FeedUpdateEvent r1 = new com.tencent.mm.autogen.events.FeedUpdateEvent
            r1.<init>()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r1.f9173d
            vq1.v r6 = r11.f189404a
            long r7 = r6.f147888d
            r2.f9174a = r7
            boolean r7 = r6.f147890f
            if (r7 == 0) goto L_0x0164
            boolean r8 = r6.f147891g
            if (r8 == 0) goto L_0x0164
            goto L_0x0169
        L_0x0164:
            if (r7 == 0) goto L_0x0168
            r10 = 1
            goto L_0x0169
        L_0x0168:
            r10 = 0
        L_0x0169:
            r2.f9178e = r10
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.f147887c
            int r6 = r6.getLikeCount()
            r2.f9179f = r6
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r2 = r1.f9173d
            r2.f9177d = r4
            T r12 = r12.f256796d
            te3.rr0 r12 = (te3.C51143rr0) r12
            te3.hi2 r12 = r12.f141086e
            if (r12 == 0) goto L_0x0182
            int r6 = r12.f134665d
            goto L_0x0183
        L_0x0182:
            r6 = 0
        L_0x0183:
            r2.f9185l = r6
            if (r12 == 0) goto L_0x018b
            java.lang.String r12 = r12.f134666e
            if (r12 != 0) goto L_0x018d
        L_0x018b:
            java.lang.String r12 = ""
        L_0x018d:
            r2.f9186m = r12
            r2.f9175b = r3
            r1.publish()
            com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent r12 = new com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent
            r12.<init>()
            com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent$a r1 = r12.f107671d
            vq1.v r2 = r11.f189404a
            long r2 = r2.f147888d
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r1.f107672a = r2
            com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent$a r1 = r12.f107671d
            vq1.g r2 = vq1.C65854g.f189373e
            vq1.v r3 = r11.f189404a
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.f147887c
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            int r3 = r2.mo89892b(r3)
            r1.f107676e = r3
            com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent$a r1 = r12.f107671d
            vq1.v r3 = r11.f189404a
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.f147887c
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            boolean r2 = r2.mo89893c(r3)
            r1.f107675d = r2
            com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent$a r1 = r12.f107671d
            vq1.v r2 = r11.f189404a
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f147887c
            int r2 = r2.getLikeCount()
            r1.f107674c = r2
            com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent$a r1 = r12.f107671d
            vq1.v r2 = r11.f189404a
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f147887c
            int r2 = r2.getLikeFlag()
            if (r2 == 0) goto L_0x01e0
            goto L_0x01e1
        L_0x01e0:
            r4 = 0
        L_0x01e1:
            r1.f107673b = r4
            r12.publish()
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$b r1 = com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert.f12553K
            vq1.v r2 = r11.f189404a
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.f147887c
            java.util.Map r1 = r1.mo2338a(r2)
            if (r1 == 0) goto L_0x01fa
            r12.putAll(r1)
        L_0x01fa:
            dp1.m0 r1 = dp1.C7446m0.f25635a
            vq1.v r2 = r11.f189404a
            te3.hj1 r2 = r2.f147894j
            java.util.Map r1 = r1.mo8592a(r2)
            if (r1 == 0) goto L_0x0209
            r12.putAll(r1)
        L_0x0209:
            vq1.v r1 = r11.f189404a
            boolean r1 = r1.f147890f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "is_action_like"
            r12.put(r2, r1)
            vq1.v r1 = r11.f189404a
            boolean r1 = r1.f147891g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "is_private"
            r12.put(r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r2 = "is_long_video"
            r12.put(r2, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "old_like_count"
            r12.put(r1, r0)
            vq1.v r0 = r11.f189404a
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.f147887c
            int r0 = r0.getFriendLikeCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "cur_like_count"
            r12.put(r1, r0)
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            r1 = 0
            r2 = 24617(0x6029, float:3.4496E-41)
            java.lang.String r3 = "feed_like_real_click"
            r0.mo86153W7(r3, r1, r12, r2)
            goto L_0x027d
        L_0x0257:
            if (r1 != r3) goto L_0x0278
            vq1.w r12 = vq1.C65866w.f189407h
            vq1.v r1 = r11.f189404a
            r12.mo89910i(r1)
            com.tencent.mm.autogen.events.FeedUpdateEvent r12 = new com.tencent.mm.autogen.events.FeedUpdateEvent
            r12.<init>()
            com.tencent.mm.autogen.events.FeedUpdateEvent$a r1 = r12.f9173d
            vq1.v r2 = r11.f189404a
            long r6 = r2.f147888d
            r1.f9174a = r6
            r1.f9175b = r3
            r12.publish()
            vq1.y$a r12 = r11.f189405b
            r12.mo14006a(r0, r5)
            goto L_0x027d
        L_0x0278:
            vq1.y$a r12 = r11.f189405b
            r12.mo14006a(r0, r4)
        L_0x027d:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vq1.C65865u.call(java.lang.Object):java.lang.Object");
    }
}
