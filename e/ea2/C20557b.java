package ea2;

/* renamed from: ea2.b */
public final class C20557b {
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0146, code lost:
        if (r0.mo33599a(5) != false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015b, code lost:
        if (r0.getPlayerState() == 6) goto L_0x015d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m22327a(p1055vh.C90804a r17) {
        /*
            r1 = r17
            vh.a$a r0 = r1.f260748a
            int r0 = r0.f260750a
            r2 = 6
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L_0x001a
            java.lang.String r5 = "MicroMsg.Audio.AudioActionListener"
            java.lang.String r6 = "callback, action:%d"
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r4] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r7)
        L_0x001a:
            vh.a$a r0 = r1.f260748a
            int r0 = r0.f260750a
            r5 = 3
            r6 = 10
            r7 = 5
            r8 = 0
            r9 = 2
            switch(r0) {
                case 0: goto L_0x07f1;
                case 1: goto L_0x07dd;
                case 2: goto L_0x072c;
                case 3: goto L_0x071a;
                case 4: goto L_0x057f;
                case 5: goto L_0x0472;
                case 6: goto L_0x0460;
                case 7: goto L_0x042f;
                case 8: goto L_0x03fe;
                case 9: goto L_0x027b;
                case 10: goto L_0x0267;
                case 11: goto L_0x0255;
                case 12: goto L_0x0248;
                case 13: goto L_0x020c;
                case 14: goto L_0x01b6;
                case 15: goto L_0x0175;
                case 16: goto L_0x0163;
                case 17: goto L_0x00f1;
                case 18: goto L_0x0049;
                case 19: goto L_0x0035;
                case 20: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x0ce9
        L_0x0029:
            vh.a$b r0 = r1.f260749b
            ea2.h r1 = ea2.C20561h.m22332s()
            nb0.a r1 = r1.f57888u
            r0.f260758c = r1
            goto L_0x0ce9
        L_0x0035:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r2 = r1.f260748a
            nb0.a r2 = r2.f260755f
            r0.f57888u = r2
            boolean r2 = r2.f256412b
            r0.f57850B = r2
            vh.a$b r0 = r1.f260749b
            r0.f260756a = r3
            goto L_0x0ce9
        L_0x0049:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r2 = r1.f260748a
            nb0.b r2 = r2.f260754e
            java.lang.String r5 = "MicroMsg.Audio.AudioPlayerMgr"
            if (r2 != 0) goto L_0x0061
            r0.getClass()
            java.lang.String r0 = "setAudioParam param == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r3 = 0
            goto L_0x00eb
        L_0x0061:
            java.util.HashMap<java.lang.String, nb0.b> r4 = r0.f57876i
            java.lang.String r6 = r2.f256416a
            java.lang.Object r4 = r4.get(r6)
            nb0.b r4 = (nb0.C88912b) r4
            if (r4 == 0) goto L_0x00b0
            java.lang.String r6 = r2.f256416a
            r4.f256416a = r6
            java.lang.String r6 = r2.f256417b
            r4.f256417b = r6
            java.lang.String r6 = r2.f256418c
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0081
            java.lang.String r6 = r2.f256418c
            r4.f256418c = r6
        L_0x0081:
            int r6 = r2.f256419d
            r4.f256419d = r6
            int r6 = r2.f256420e
            r4.f256420e = r6
            boolean r6 = r2.f256422g
            r4.f256422g = r6
            boolean r6 = r2.f256423h
            r4.f256423h = r6
            int r6 = r2.f256424i
            r4.f256424i = r6
            java.lang.String r6 = r2.f256426k
            r4.f256426k = r6
            double r6 = r2.f256427l
            r4.f256427l = r6
            java.lang.String r6 = r2.f256429n
            r4.f256429n = r6
            nb0.e r6 = r2.f256440y
            if (r6 == 0) goto L_0x00a7
            r4.f256440y = r6
        L_0x00a7:
            long r6 = r2.f256439x
            r4.f256439x = r6
            double r6 = r2.f256428m
            r4.f256428m = r6
            goto L_0x00b8
        L_0x00b0:
            java.util.HashMap<java.lang.String, nb0.b> r4 = r0.f57876i
            java.lang.String r6 = r2.f256416a
            r4.put(r6, r2)
            r4 = r2
        L_0x00b8:
            java.lang.String r6 = r2.f256416a
            ea2.m r6 = r0.mo32174o(r6)
            if (r6 == 0) goto L_0x00ca
            java.lang.String r7 = "setAudioParam player ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            r6.mo32222y(r4)
            goto L_0x00d0
        L_0x00ca:
            java.lang.String r4 = "setAudioParam player is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r4)
        L_0x00d0:
            boolean r4 = r0.mo32178t()
            if (r4 == 0) goto L_0x00eb
            lh.c r4 = r0.f57849A
            java.lang.String r5 = r2.f256416a
            boolean r4 = r4.mo33568f(r5)
            if (r4 == 0) goto L_0x00e6
            lh.c r0 = r0.f57849A
            r0.mo33581s(r2)
            goto L_0x00eb
        L_0x00e6:
            lh.c r0 = r0.f57849A
            r0.mo33578p(r2)
        L_0x00eb:
            vh.a$b r0 = r1.f260749b
            r0.f260756a = r3
            goto L_0x0ce9
        L_0x00f1:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r6 = r1.f260748a
            java.lang.String r6 = r6.f260751b
            ea2.m r8 = r0.mo32174o(r6)
            if (r8 != 0) goto L_0x0153
            lh.c r2 = r0.f57849A
            boolean r2 = r2.mo33568f(r6)
            if (r2 == 0) goto L_0x014b
            lh.c r0 = r0.f57849A
            lh.d r0 = r0.f60632a
            java.util.HashMap<java.lang.String, lh.g<java.lang.Integer>> r2 = r0.f60654p
            boolean r2 = r2.containsKey(r6)
            if (r2 == 0) goto L_0x0149
            java.util.HashMap<java.lang.String, lh.g<java.lang.Integer>> r0 = r0.f60654p
            java.lang.Object r0 = r0.get(r6)
            lh.g r0 = (p356lh.C21433g) r0
            if (r0 == 0) goto L_0x0149
            java.lang.Integer[] r2 = new java.lang.Integer[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r4] = r5
            boolean r2 = r0.mo33599a(r2)
            if (r2 != 0) goto L_0x015d
            java.lang.Integer[] r2 = new java.lang.Integer[r3]
            r5 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2[r4] = r5
            boolean r2 = r0.mo33599a(r2)
            if (r2 != 0) goto L_0x015d
            java.lang.Integer[] r2 = new java.lang.Integer[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r2[r4] = r5
            boolean r0 = r0.mo33599a(r2)
            if (r0 == 0) goto L_0x0149
            goto L_0x015d
        L_0x0149:
            r3 = 0
            goto L_0x015d
        L_0x014b:
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r2 = "isStoppedAudio, player is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            goto L_0x015d
        L_0x0153:
            com.tencent.qqmusic.mediaplayer.CommonPlayer r0 = r8.f57917h
            if (r0 == 0) goto L_0x0149
            int r0 = r0.getPlayerState()
            if (r0 != r2) goto L_0x0149
        L_0x015d:
            vh.a$b r0 = r1.f260749b
            r0.f260756a = r3
            goto L_0x0ce9
        L_0x0163:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r2 = r1.f260748a
            java.lang.String r2 = r2.f260751b
            nb0.b r0 = r0.mo32173n(r2)
            vh.a$a r1 = r1.f260748a
            r1.f260754e = r0
            goto L_0x0ce9
        L_0x0175:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r1 = r1.f260748a
            r1.getClass()
            java.util.LinkedList<java.lang.String> r1 = r0.f57873f
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0188
            goto L_0x0ce9
        L_0x0188:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r8
            java.lang.String r2 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r4 = "destroyAllAudioPlayersByProcessName with name :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.LinkedList<java.lang.String> r2 = r0.f57873f
            r1.addAll(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x01a1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0ce9
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r0.f57874g
            java.lang.Object r2 = r4.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x01a1
        L_0x01b6:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r2 = r1.f260748a
            java.lang.String r2 = r2.f260751b
            lh.c r5 = r0.f57849A
            boolean r5 = r5.mo33568f(r2)
            if (r5 == 0) goto L_0x01cb
            lh.c r5 = r0.f57849A
            r5.mo33580r(r2)
        L_0x01cb:
            ea2.m r5 = r0.mo32174o(r2)
            java.lang.String r6 = "MicroMsg.Audio.AudioPlayerMgr"
            if (r5 != 0) goto L_0x01db
            java.lang.String r0 = "stopPlayOnBackGround, player is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            r3 = 0
            goto L_0x0206
        L_0x01db:
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r4] = r2
            java.lang.String r8 = "stopPlayOnBackGround, audioId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r7)
            r5.f57921o = r4
            r5.f57920n = r3
            r5.mo32202p()
            long r6 = java.lang.System.currentTimeMillis()
            r5.f57909B = r6
            java.util.HashMap<java.lang.String, nb0.b> r6 = r0.f57876i
            java.lang.Object r6 = r6.get(r2)
            nb0.b r6 = (nb0.C88912b) r6
            if (r6 == 0) goto L_0x0200
            r6.f256419d = r4
            r6.f256422g = r3
        L_0x0200:
            r0.mo32155N(r2, r5)
            r0.mo32181w(r2, r5)
        L_0x0206:
            vh.a$b r0 = r1.f260749b
            r0.f260756a = r3
            goto L_0x0ce9
        L_0x020c:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r2 = r1.f260748a
            java.lang.String r2 = r2.f260751b
            ea2.m r3 = r0.mo32174o(r2)
            if (r3 != 0) goto L_0x023f
            lh.c r3 = r0.f57849A
            boolean r3 = r3.mo33568f(r2)
            if (r3 == 0) goto L_0x022d
            lh.c r0 = r0.f57849A
            lh.d r0 = r0.f60632a
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f60642d
            boolean r0 = r0.get()
            goto L_0x0241
        L_0x022d:
            java.lang.String r3 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r5 = "isPauseOnBackground, player is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r5)
            nb0.d r0 = r0.mo32176q(r2)
            if (r0 == 0) goto L_0x023d
            boolean r0 = r0.f256445d
            goto L_0x0241
        L_0x023d:
            r3 = 0
            goto L_0x0242
        L_0x023f:
            boolean r0 = r3.f57921o
        L_0x0241:
            r3 = r0
        L_0x0242:
            vh.a$b r0 = r1.f260749b
            r0.f260756a = r3
            goto L_0x0ce9
        L_0x0248:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r1 = r1.f260748a
            java.lang.String r1 = r1.f260752c
            r0.mo32183y(r1)
            goto L_0x0ce9
        L_0x0255:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r2 = r1.f260748a
            java.lang.String r2 = r2.f260752c
            r0.mo32175p(r2)
            vh.a$b r0 = r1.f260749b
            r0.getClass()
            goto L_0x0ce9
        L_0x0267:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r2 = r1.f260748a
            java.lang.String r4 = r2.f260752c
            java.lang.String r2 = r2.f260751b
            java.lang.String r0 = r0.mo32167h(r4, r2)
            vh.a$a r1 = r1.f260748a
            r1.f260751b = r0
            goto L_0x0ce9
        L_0x027b:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r1 = r1.f260748a
            java.lang.String r1 = r1.f260752c
            r0.getClass()
            java.lang.String r2 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r5 = "destroyAllAudioPlayers, appId:%s"
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r4] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r6)
            r0.mo32162a()
            r0.mo32164e(r1)
            r0.mo32152K()
            java.util.HashMap<java.lang.String, java.util.LinkedList<java.lang.String>> r2 = r0.f57875h
            java.lang.Object r2 = r2.remove(r1)
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            if (r2 == 0) goto L_0x03f4
            int r5 = r2.size()
            if (r5 != 0) goto L_0x02ac
            goto L_0x03f4
        L_0x02ac:
            java.lang.Object r5 = r0.f57882o
            monitor-enter(r5)
            java.util.Iterator r6 = r2.iterator()     // Catch:{ all -> 0x03f1 }
        L_0x02b3:
            boolean r9 = r6.hasNext()     // Catch:{ all -> 0x03f1 }
            if (r9 == 0) goto L_0x02f3
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x03f1 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x03f1 }
            java.util.HashMap<java.lang.String, ea2.m> r10 = r0.f57869b     // Catch:{ all -> 0x03f1 }
            java.lang.Object r10 = r10.remove(r9)     // Catch:{ all -> 0x03f1 }
            ea2.m r10 = (ea2.C20575m) r10     // Catch:{ all -> 0x03f1 }
            java.util.LinkedList<java.lang.String> r11 = r0.f57870c     // Catch:{ all -> 0x03f1 }
            r11.remove(r9)     // Catch:{ all -> 0x03f1 }
            java.lang.String r11 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r12 = "destroy playing player"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)     // Catch:{ all -> 0x03f1 }
            r0.mo32170k(r9, r10)     // Catch:{ all -> 0x03f1 }
            java.util.HashMap<java.lang.String, nb0.b> r10 = r0.f57876i     // Catch:{ all -> 0x03f1 }
            r10.remove(r9)     // Catch:{ all -> 0x03f1 }
            java.util.HashMap<java.lang.String, nb0.d> r10 = r0.f57877j     // Catch:{ all -> 0x03f1 }
            r10.remove(r9)     // Catch:{ all -> 0x03f1 }
            lh.c r10 = r0.f57849A     // Catch:{ all -> 0x03f1 }
            boolean r10 = r10.mo33568f(r9)     // Catch:{ all -> 0x03f1 }
            if (r10 == 0) goto L_0x02b3
            lh.c r10 = r0.f57849A     // Catch:{ all -> 0x03f1 }
            r10.mo33580r(r9)     // Catch:{ all -> 0x03f1 }
            lh.c r10 = r0.f57849A     // Catch:{ all -> 0x03f1 }
            r10.mo33576n(r9)     // Catch:{ all -> 0x03f1 }
            goto L_0x02b3
        L_0x02f3:
            java.util.Iterator r6 = r2.iterator()     // Catch:{ all -> 0x03f1 }
        L_0x02f7:
            boolean r9 = r6.hasNext()     // Catch:{ all -> 0x03f1 }
            if (r9 == 0) goto L_0x0337
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x03f1 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x03f1 }
            java.util.HashMap<java.lang.String, ea2.m> r10 = r0.f57871d     // Catch:{ all -> 0x03f1 }
            java.lang.Object r10 = r10.remove(r9)     // Catch:{ all -> 0x03f1 }
            ea2.m r10 = (ea2.C20575m) r10     // Catch:{ all -> 0x03f1 }
            java.util.LinkedList<java.lang.String> r11 = r0.f57872e     // Catch:{ all -> 0x03f1 }
            r11.remove(r9)     // Catch:{ all -> 0x03f1 }
            java.lang.String r11 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r12 = "destroy recycled player"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)     // Catch:{ all -> 0x03f1 }
            r0.mo32170k(r9, r10)     // Catch:{ all -> 0x03f1 }
            java.util.HashMap<java.lang.String, nb0.b> r10 = r0.f57876i     // Catch:{ all -> 0x03f1 }
            r10.remove(r9)     // Catch:{ all -> 0x03f1 }
            java.util.HashMap<java.lang.String, nb0.d> r10 = r0.f57877j     // Catch:{ all -> 0x03f1 }
            r10.remove(r9)     // Catch:{ all -> 0x03f1 }
            lh.c r10 = r0.f57849A     // Catch:{ all -> 0x03f1 }
            boolean r10 = r10.mo33568f(r9)     // Catch:{ all -> 0x03f1 }
            if (r10 == 0) goto L_0x02f7
            lh.c r10 = r0.f57849A     // Catch:{ all -> 0x03f1 }
            r10.mo33580r(r9)     // Catch:{ all -> 0x03f1 }
            lh.c r10 = r0.f57849A     // Catch:{ all -> 0x03f1 }
            r10.mo33576n(r9)     // Catch:{ all -> 0x03f1 }
            goto L_0x02f7
        L_0x0337:
            monitor-exit(r5)     // Catch:{ all -> 0x03f1 }
            java.util.LinkedList<java.lang.String> r5 = r0.f57868a
            r5.removeAll(r2)
            java.util.LinkedList<java.lang.String> r2 = r0.f57873f
            r2.remove(r1)
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r0.f57874g
            r2.remove(r1)
            lh.c r1 = r0.f57849A
            ih.a r2 = r1.f60633b
            java.util.HashMap<java.lang.String, ih.b> r5 = r2.f59590b
            r5.clear()
            java.util.LinkedList<java.lang.String> r5 = r2.f59593e
            r5.clear()
            java.util.HashMap<java.lang.String, nb0.b> r2 = r2.f59591c
            r2.clear()
            lh.d r1 = r1.f60632a
            kh.a r2 = r1.f60647i
            r2.getClass()
            java.lang.String r5 = "MicroMsg.Mix.AudioMixController"
            java.lang.String r6 = "clearCache"
            int r9 = p213oh.C11412b.f33577a
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r8)
            java.lang.Object r6 = r2.f60307n
            monitor-enter(r6)
            r5 = 0
        L_0x036e:
            java.util.LinkedList<java.lang.String> r8 = r2.f60302i     // Catch:{ all -> 0x03ee }
            int r8 = r8.size()     // Catch:{ all -> 0x03ee }
            if (r5 >= r8) goto L_0x038a
            java.util.HashMap<java.lang.String, java.util.List<eh.e>> r8 = r2.f60304k     // Catch:{ all -> 0x03ee }
            java.util.LinkedList<java.lang.String> r9 = r2.f60302i     // Catch:{ all -> 0x03ee }
            java.lang.Object r9 = r9.get(r5)     // Catch:{ all -> 0x03ee }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x03ee }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x03ee }
            r8.clear()     // Catch:{ all -> 0x03ee }
            int r5 = r5 + 1
            goto L_0x036e
        L_0x038a:
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r2.f60303j     // Catch:{ all -> 0x03ee }
            r2.clear()     // Catch:{ all -> 0x03ee }
            monitor-exit(r6)     // Catch:{ all -> 0x03ee }
            java.util.HashMap<java.lang.String, nb0.b> r2 = r1.f60651m
            r2.clear()
            java.util.HashMap<java.lang.String, java.lang.Boolean> r2 = r1.f60652n
            r2.clear()
            java.util.HashMap<java.lang.String, java.lang.Boolean> r2 = r1.f60653o
            r2.clear()
            java.lang.Object r2 = r1.f60645g
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, lh.g<java.lang.Integer>> r5 = r1.f60654p     // Catch:{ all -> 0x03eb }
            r5.clear()     // Catch:{ all -> 0x03eb }
            monitor-exit(r2)     // Catch:{ all -> 0x03eb }
            java.util.HashMap<java.lang.String, nb0.d> r2 = r1.f60655q
            r2.clear()
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = r1.f60656r
            r1.clear()
            lh.c r1 = r0.f57849A
            gh.c r2 = r1.f60636e
            java.lang.String r5 = r1.f60637f
            r2.getClass()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r4] = r5
            int r4 = p213oh.C11412b.f33577a
            java.lang.String r4 = "MicroMsg.Mix.AudioPcmDataTrackTaskController"
            java.lang.String r6 = "recycleAllCache appId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r2)
            gh.b r2 = new gh.b
            r2.<init>(r5)
            java.lang.String r4 = "AudioPcmDataTrackRecycleCacheTask"
            gh.d r5 = new gh.d
            r5.<init>(r2, r4, r7)
            p348ih.C21087k.m23341a()
            p348ih.C21087k.m23342b(r5)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = r1.f60634c
            r1.clear()
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f57892y
            r1.clear()
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r0.f57893z
            r0.clear()
            goto L_0x0ce9
        L_0x03eb:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03eb }
            throw r0
        L_0x03ee:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x03ee }
            throw r0
        L_0x03f1:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x03f1 }
            throw r0
        L_0x03f4:
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r1 = "there is no audioIds and players for this appId to stop"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x0ce9
        L_0x03fe:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r2 = r1.f260748a
            java.lang.String r2 = r2.f260751b
            ea2.m r3 = r0.mo32174o(r2)
            if (r3 != 0) goto L_0x0424
            lh.c r3 = r0.f57849A
            boolean r3 = r3.mo33568f(r2)
            if (r3 == 0) goto L_0x041b
            lh.c r0 = r0.f57849A
            boolean r0 = r0.mo33573k(r2)
            goto L_0x0428
        L_0x041b:
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r2 = "isStartPlayAudio, player is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            r3 = 0
            goto L_0x0429
        L_0x0424:
            boolean r0 = r3.mo32211k()
        L_0x0428:
            r3 = r0
        L_0x0429:
            vh.a$b r0 = r1.f260749b
            r0.f260756a = r3
            goto L_0x0ce9
        L_0x042f:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r2 = r1.f260748a
            java.lang.String r2 = r2.f260751b
            ea2.m r3 = r0.mo32174o(r2)
            if (r3 != 0) goto L_0x0455
            lh.c r3 = r0.f57849A
            boolean r3 = r3.mo33568f(r2)
            if (r3 == 0) goto L_0x044c
            lh.c r0 = r0.f57849A
            boolean r0 = r0.mo33570h(r2)
            goto L_0x0459
        L_0x044c:
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r2 = "isPlayingAudio, player is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            r3 = 0
            goto L_0x045a
        L_0x0455:
            boolean r0 = r3.mo32206f()
        L_0x0459:
            r3 = r0
        L_0x045a:
            vh.a$b r0 = r1.f260749b
            r0.f260756a = r3
            goto L_0x0ce9
        L_0x0460:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r2 = r1.f260748a
            java.lang.String r2 = r2.f260751b
            nb0.d r0 = r0.mo32176q(r2)
            vh.a$b r1 = r1.f260749b
            r1.f260757b = r0
            goto L_0x0ce9
        L_0x0472:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r2 = r1.f260748a
            java.lang.String r2 = r2.f260751b
            java.util.LinkedList<java.lang.String> r5 = r0.f57855G
            monitor-enter(r5)
            java.util.LinkedList<java.lang.String> r6 = r0.f57855G     // Catch:{ all -> 0x057c }
            boolean r6 = r6.contains(r2)     // Catch:{ all -> 0x057c }
            monitor-exit(r5)     // Catch:{ all -> 0x057c }
            if (r6 != 0) goto L_0x04aa
            java.util.HashMap<java.lang.String, nb0.b> r5 = r0.f57876i
            java.lang.Object r5 = r5.get(r2)
            nb0.b r5 = (nb0.C88912b) r5
            if (r5 == 0) goto L_0x04a9
            lh.c r6 = r0.f57849A
            java.lang.String r5 = r5.f256418c
            ih.a r6 = r6.f60633b
            java.lang.Object r7 = r6.f59594f
            monitor-enter(r7)
            java.util.List<java.lang.String> r6 = r6.f59592d     // Catch:{ all -> 0x04a6 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x04a6 }
            boolean r5 = r6.contains(r5)     // Catch:{ all -> 0x04a6 }
            monitor-exit(r7)     // Catch:{ all -> 0x04a6 }
            if (r5 == 0) goto L_0x04a9
            r6 = 1
            goto L_0x04aa
        L_0x04a6:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x04a6 }
            throw r0
        L_0x04a9:
            r6 = 0
        L_0x04aa:
            if (r6 != 0) goto L_0x04e6
            lh.c r5 = r0.f57849A
            boolean r5 = r5.mo33568f(r2)
            if (r5 == 0) goto L_0x04e1
            lh.c r5 = r0.f57849A
            boolean r5 = r5.mo33569g(r2)
            if (r5 != 0) goto L_0x04dc
            lh.c r5 = r0.f57849A
            boolean r5 = r5.mo33570h(r2)
            if (r5 != 0) goto L_0x04dc
            lh.c r5 = r0.f57849A
            boolean r5 = r5.mo33571i(r2)
            if (r5 != 0) goto L_0x04dc
            lh.c r5 = r0.f57849A
            boolean r5 = r5.mo33572j(r2)
            if (r5 != 0) goto L_0x04dc
            lh.c r5 = r0.f57849A
            boolean r5 = r5.mo33573k(r2)
            if (r5 == 0) goto L_0x04e1
        L_0x04dc:
            lh.c r5 = r0.f57849A
            r5.mo33580r(r2)
        L_0x04e1:
            lh.c r5 = r0.f57849A
            r5.mo33576n(r2)
        L_0x04e6:
            java.lang.String r5 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r7 = "destroyAudio, audioId:%s"
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r8)
            ea2.m r4 = r0.mo32174o(r2)
            if (r4 == 0) goto L_0x0516
            r0.mo32170k(r2, r4)
            java.lang.Object r4 = r0.f57882o
            monitor-enter(r4)
            java.util.HashMap<java.lang.String, ea2.m> r5 = r0.f57869b     // Catch:{ all -> 0x0513 }
            r5.remove(r2)     // Catch:{ all -> 0x0513 }
            java.util.LinkedList<java.lang.String> r5 = r0.f57870c     // Catch:{ all -> 0x0513 }
            r5.remove(r2)     // Catch:{ all -> 0x0513 }
            java.util.HashMap<java.lang.String, ea2.m> r5 = r0.f57871d     // Catch:{ all -> 0x0513 }
            r5.remove(r2)     // Catch:{ all -> 0x0513 }
            java.util.LinkedList<java.lang.String> r5 = r0.f57872e     // Catch:{ all -> 0x0513 }
            r5.remove(r2)     // Catch:{ all -> 0x0513 }
            monitor-exit(r4)     // Catch:{ all -> 0x0513 }
            goto L_0x051d
        L_0x0513:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0513 }
            throw r0
        L_0x0516:
            java.lang.String r4 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r5 = "destroyAudio, player is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)
        L_0x051d:
            java.util.LinkedList<java.lang.String> r4 = r0.f57868a
            r4.remove(r2)
            java.util.LinkedList<java.lang.String> r4 = r0.f57873f
            java.util.Iterator r4 = r4.iterator()
        L_0x0528:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x055c
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.HashMap<java.lang.String, java.util.LinkedList<java.lang.String>> r7 = r0.f57875h
            java.lang.Object r7 = r7.get(r5)
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            if (r7 == 0) goto L_0x0528
            boolean r8 = r7.contains(r2)
            if (r8 == 0) goto L_0x0528
            r7.remove(r2)
            int r4 = r7.size()
            if (r4 != 0) goto L_0x055c
            java.util.HashMap<java.lang.String, java.util.LinkedList<java.lang.String>> r4 = r0.f57875h
            r4.remove(r5)
            java.util.LinkedList<java.lang.String> r4 = r0.f57873f
            r4.remove(r5)
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r0.f57874g
            r4.remove(r5)
        L_0x055c:
            java.util.HashMap<java.lang.String, nb0.d> r4 = r0.f57877j
            r4.remove(r2)
            if (r6 != 0) goto L_0x0569
            java.util.HashMap<java.lang.String, nb0.b> r0 = r0.f57876i
            r0.remove(r2)
            goto L_0x0576
        L_0x0569:
            java.util.LinkedList<java.lang.String> r4 = r0.f57854F
            boolean r4 = r4.contains(r2)
            if (r4 != 0) goto L_0x0576
            java.util.LinkedList<java.lang.String> r0 = r0.f57854F
            r0.add(r2)
        L_0x0576:
            vh.a$b r0 = r1.f260749b
            r0.f260756a = r3
            goto L_0x0ce9
        L_0x057c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x057c }
            throw r0
        L_0x057f:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r5 = r1.f260748a
            java.lang.String r7 = r5.f260751b
            int r5 = r5.f260753d
            ea2.m r10 = r0.mo32174o(r7)
            java.lang.String r11 = "MicroMsg.Audio.AudioPlayerMgr"
            if (r10 != 0) goto L_0x065f
            java.lang.String r10 = "seekToAudio, player is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r10)
            lh.c r10 = r0.f57849A
            boolean r10 = r10.mo33568f(r7)
            if (r10 == 0) goto L_0x0651
            lh.c r10 = r0.f57849A
            r10.getClass()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r4] = r7
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r11[r3] = r12
            int r12 = p213oh.C11412b.f33577a
            java.lang.String r12 = "MicroMsg.Mix.AudioMixPlayer"
            java.lang.String r13 = "seekTo audioId:%s, position:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r11)
            ih.a r11 = r10.f60633b
            boolean r11 = r11.mo32803e(r7, r5)
            if (r11 != 0) goto L_0x05d0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r2[r4] = r6
            java.lang.String r6 = "seekTo fail audioId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r2)
            goto L_0x0651
        L_0x05d0:
            lh.d r11 = r10.f60632a
            r11.mo33590k(r6, r7)
            lh.d r6 = r10.f60632a
            int r6 = r6.mo33584e(r7)
            long r13 = (long) r6
            lh.d r6 = r10.f60632a
            int r6 = r6.mo33586g(r7)
            boolean r11 = r10.mo33566d(r7)
            if (r11 != 0) goto L_0x05ef
            java.lang.String r6 = "seekTo cache is not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r8)
            goto L_0x060c
        L_0x05ef:
            lh.d r11 = r10.f60632a
            int r11 = r11.mo33583d(r7)
            r15 = 2000(0x7d0, float:2.803E-42)
            if (r11 > r15) goto L_0x060e
            java.lang.String r6 = "seekTo duration is not support seek"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r8)
            ih.a r6 = r10.f60633b
            boolean r6 = r6.mo32801c(r7)
            if (r6 != 0) goto L_0x060c
            ih.a r6 = r10.f60633b
            r6.mo32804f(r7, r5)
        L_0x060c:
            r11 = r10
            goto L_0x064c
        L_0x060e:
            r11 = r10
            long r9 = (long) r5
            long r9 = r9 - r13
            long r9 = java.lang.Math.abs(r9)
            r13 = 2000(0x7d0, double:9.88E-321)
            int r16 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r16 > 0) goto L_0x0622
            java.lang.String r6 = "seekTo time is not support seek"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r8)
            goto L_0x064c
        L_0x0622:
            if (r6 == 0) goto L_0x0630
            if (r6 == r3) goto L_0x0630
            r9 = 2
            if (r6 == r9) goto L_0x0630
            java.lang.String r6 = "seekTo state is not support seek"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r8)
            goto L_0x064c
        L_0x0630:
            ih.a r6 = r11.f60633b
            boolean r6 = r6.mo32801c(r7)
            if (r6 != 0) goto L_0x0645
            lh.d r6 = r11.f60632a
            kh.a r6 = r6.f60647i
            r6.mo33375k(r7, r5, r4)
            ih.a r6 = r11.f60633b
            r6.mo32804f(r7, r5)
            goto L_0x064c
        L_0x0645:
            lh.d r6 = r11.f60632a
            kh.a r6 = r6.f60647i
            r6.mo33375k(r7, r5, r3)
        L_0x064c:
            lh.d r6 = r11.f60632a
            r6.mo33590k(r2, r7)
        L_0x0651:
            java.util.HashMap<java.lang.String, nb0.b> r0 = r0.f57876i
            java.lang.Object r0 = r0.get(r7)
            nb0.b r0 = (nb0.C88912b) r0
            if (r0 == 0) goto L_0x06da
            r0.f256419d = r5
            goto L_0x0714
        L_0x065f:
            if (r5 >= 0) goto L_0x067b
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r0[r4] = r2
            int r2 = r10.getDuration()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r3] = r2
            java.lang.String r2 = "seekToAudio, time pos is invalid time:%d, duration:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r2, r0)
            goto L_0x06da
        L_0x067b:
            r2 = 2
            int r6 = r10.getDuration()
            if (r6 > 0) goto L_0x06b9
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r2[r4] = r6
            int r6 = r10.getDuration()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r3] = r6
            java.lang.String r6 = "seekToAudio, duration is invalid, time:%d, duration:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r6, r2)
            r10.mo32200o()
            java.util.HashMap<java.lang.String, nb0.b> r2 = r0.f57876i
            java.lang.Object r2 = r2.get(r7)
            nb0.b r2 = (nb0.C88912b) r2
            if (r2 == 0) goto L_0x06aa
            r2.f256419d = r5
            goto L_0x06ab
        L_0x06aa:
            r3 = 0
        L_0x06ab:
            if (r3 == 0) goto L_0x0714
            java.util.HashMap<java.lang.String, nb0.b> r0 = r0.f57876i
            java.lang.Object r0 = r0.get(r7)
            nb0.b r0 = (nb0.C88912b) r0
            r10.mo32222y(r0)
            goto L_0x0714
        L_0x06b9:
            if (r5 <= 0) goto L_0x06dc
            int r2 = r10.getDuration()
            if (r5 <= r2) goto L_0x06dc
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r0[r4] = r2
            int r2 = r10.getDuration()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r3] = r2
            java.lang.String r2 = "seekToAudio, time pos is invalid, exceed duration time:%d, duration:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r2, r0)
        L_0x06da:
            r3 = 0
            goto L_0x0714
        L_0x06dc:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r2[r3] = r6
            java.lang.String r6 = "seekToAudio, audioId:%s, time:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r2)
            boolean r2 = r10.mo32206f()
            if (r2 != 0) goto L_0x0710
            boolean r2 = r10.mo32211k()
            if (r2 != 0) goto L_0x0710
            boolean r2 = r10.mo32219v()
            if (r2 == 0) goto L_0x0700
            goto L_0x0710
        L_0x0700:
            r10.mo32200o()
            java.util.HashMap<java.lang.String, nb0.b> r0 = r0.f57876i
            java.lang.Object r0 = r0.get(r7)
            nb0.b r0 = (nb0.C88912b) r0
            if (r0 == 0) goto L_0x06da
            r0.f256419d = r5
            goto L_0x0714
        L_0x0710:
            boolean r3 = r10.mo32203a(r5)
        L_0x0714:
            vh.a$b r0 = r1.f260749b
            r0.f260756a = r3
            goto L_0x0ce9
        L_0x071a:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r2 = r1.f260748a
            java.lang.String r2 = r2.f260751b
            boolean r3 = r0.mo32158Q(r2)
            vh.a$b r0 = r1.f260749b
            r0.f260756a = r3
            goto L_0x0ce9
        L_0x072c:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r2 = r1.f260748a
            java.lang.String r2 = r2.f260751b
            ea2.m r5 = r0.mo32174o(r2)
            java.lang.String r6 = "MicroMsg.Audio.AudioPlayerMgr"
            if (r5 != 0) goto L_0x07c5
            java.lang.String r5 = "pauseAudio, player is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r5)
            lh.c r5 = r0.f57849A
            boolean r5 = r5.mo33568f(r2)
            if (r5 == 0) goto L_0x07c3
            lh.c r0 = r0.f57849A
            r0.getClass()
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r4] = r2
            lh.d r5 = r0.f60632a
            int r5 = r5.mo33586g(r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6[r3] = r5
            int r5 = p213oh.C11412b.f33577a
            java.lang.String r5 = "MicroMsg.Mix.AudioMixPlayer"
            java.lang.String r7 = "pause audioId:%s, audio state:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r6)
            lh.d r5 = r0.f60632a
            kh.a r6 = r5.f60647i
            r6.mo33371g(r2)
            ih.a r6 = r5.f60658t
            boolean r6 = r6.mo32801c(r2)
            if (r6 == 0) goto L_0x0783
            ih.a r6 = r5.f60658t
            boolean r6 = r6.mo32800b(r2)
            if (r6 == 0) goto L_0x0783
            r6 = 2
            r5.mo33590k(r6, r2)
        L_0x0783:
            ih.a r0 = r0.f60633b
            r0.getClass()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r2
            java.lang.String r6 = "MicroMsg.Mix.AudioDecodeMgr"
            java.lang.String r7 = "pauseDecode audioId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r5)
            java.util.HashMap<java.lang.String, ih.b> r0 = r0.f59590b
            java.lang.Object r0 = r0.get(r2)
            ih.b r0 = (p348ih.C21078b) r0
            if (r0 != 0) goto L_0x07a4
            java.lang.String r0 = "task is not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r8)
            goto L_0x07d7
        L_0x07a4:
            boolean r2 = r0.f59597h
            if (r2 == 0) goto L_0x07af
            java.lang.String r0 = "task is execute end!"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r8)
            goto L_0x07d7
        L_0x07af:
            ih.n r0 = r0.f59598i
            if (r0 != 0) goto L_0x07b4
            r4 = 1
        L_0x07b4:
            if (r4 == 0) goto L_0x07bd
            java.lang.String r0 = "task is isDetach!"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r8)
            goto L_0x07d7
        L_0x07bd:
            if (r0 == 0) goto L_0x07d7
            r0.pause()
            goto L_0x07d7
        L_0x07c3:
            r3 = 0
            goto L_0x07d7
        L_0x07c5:
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r4] = r2
            java.lang.String r4 = "pauseAudio, audioId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r7)
            r5.pause()
            r0.mo32155N(r2, r5)
            r0.mo32181w(r2, r5)
        L_0x07d7:
            vh.a$b r0 = r1.f260749b
            r0.f260756a = r3
            goto L_0x0ce9
        L_0x07dd:
            ea2.h r0 = ea2.C20561h.m22332s()
            vh.a$a r2 = r1.f260748a
            java.lang.String r3 = r2.f260751b
            nb0.b r2 = r2.f260754e
            boolean r3 = r0.mo32153L(r3, r2)
            vh.a$b r0 = r1.f260749b
            r0.f260756a = r3
            goto L_0x0ce9
        L_0x07f1:
            ea2.h r2 = ea2.C20561h.m22332s()
            vh.a$a r0 = r1.f260748a
            nb0.b r7 = r0.f260754e
            r2.getClass()
            if (r7 != 0) goto L_0x080f
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r3 = "startAudio, play param is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
            r0 = 605(0x25d, float:8.48E-43)
            java.lang.String r3 = ""
            r2.mo32182x(r0, r3)
            goto L_0x08ff
        L_0x080f:
            java.lang.String r0 = r7.f256416a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0828
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r3 = "startAudio fail, the audioId is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
            r0 = 604(0x25c, float:8.46E-43)
            java.lang.String r3 = r7.f256416a
            r2.mo32182x(r0, r3)
            goto L_0x08ff
        L_0x0828:
            java.util.LinkedList<java.lang.String> r0 = r2.f57868a
            java.lang.String r9 = r7.f256416a
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x0843
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r3 = "startAudio fail, the audioId is not found!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
            r0 = 601(0x259, float:8.42E-43)
            java.lang.String r3 = r7.f256416a
            r2.mo32182x(r0, r3)
            goto L_0x08ff
        L_0x0843:
            boolean r0 = r7.f256422g
            if (r0 == 0) goto L_0x085a
            java.lang.Class<fa2.c> r0 = fa2.C20705c.class
            ua2.a r0 = ua2.C101991b.m134284b(r0)
            fa2.c r0 = (fa2.C20705c) r0
            r2.f57887t = r0
            if (r0 == 0) goto L_0x085a
            java.lang.String r9 = r7.f256416a
            java.lang.String r10 = r7.f256417b
            r0.mo32416f(r9, r10)
        L_0x085a:
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r9 = "startAudio"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r9 = "android.permission.READ_PHONE_STATE"
            int r0 = p385u2.C111105a.m151499a(r0, r9)
            if (r0 == 0) goto L_0x0876
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r9 = "addPhoneStatusWatcher() not have read_phone_state perm"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r9)
            goto L_0x08a4
        L_0x0876:
            com.tencent.mm.sdk.platformtools.PhoneStatusWatcher$PhoneCallListener[] r9 = r2.f57890w
            r0 = r9[r4]
            if (r0 == 0) goto L_0x087d
            goto L_0x08a4
        L_0x087d:
            monitor-enter(r9)
            com.tencent.mm.sdk.platformtools.PhoneStatusWatcher$PhoneCallListener[] r0 = r2.f57890w     // Catch:{ all -> 0x0ce6 }
            r10 = r0[r4]     // Catch:{ all -> 0x0ce6 }
            if (r10 == 0) goto L_0x0886
            monitor-exit(r9)     // Catch:{ all -> 0x0ce6 }
            goto L_0x08a4
        L_0x0886:
            ea2.j r10 = new ea2.j     // Catch:{ all -> 0x0ce6 }
            r10.<init>(r2)     // Catch:{ all -> 0x0ce6 }
            r0[r4] = r10     // Catch:{ all -> 0x0ce6 }
            java.lang.Class<com.tencent.mm.sdk.platformtools.PhoneStatusWatcher> r0 = com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0ce6 }
            com.tencent.mm.sdk.platformtools.PhoneStatusWatcher r0 = (com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher) r0     // Catch:{ all -> 0x0ce6 }
            com.tencent.mm.sdk.platformtools.PhoneStatusWatcher$PhoneCallListener[] r10 = r2.f57890w     // Catch:{ all -> 0x0ce6 }
            r10 = r10[r4]     // Catch:{ all -> 0x0ce6 }
            r0.addPhoneCallListener(r10)     // Catch:{ all -> 0x0ce6 }
            monitor-exit(r9)     // Catch:{ all -> 0x0ce6 }
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r9 = "addPhoneStatusWatcher"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
        L_0x08a4:
            java.lang.String r0 = r7.f256416a
            java.lang.String r0 = r2.mo32172m(r0)
            java.lang.String r9 = r7.f256416a
            nb0.b r9 = r2.mo32173n(r9)
            int r10 = r2.mo32175p(r0)
            if (r10 < r6) goto L_0x092b
            java.lang.String r6 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r11 = "startAudio now created QQAudioPlayer count %d arrive MAX_PLAY_AUDIO_PLAYER_COUNT, but save param!"
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12[r4] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r11, r12)
            java.util.HashMap<java.lang.String, nb0.b> r6 = r2.f57876i
            java.lang.String r10 = r7.f256416a
            r6.put(r10, r7)
            java.lang.String r6 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r10 = "autoPlay:%b"
            java.lang.Object[] r11 = new java.lang.Object[r3]
            boolean r12 = r7.f256422g
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r11[r4] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r11)
            r2.mo32166g(r7)
            boolean r6 = r7.f256422g
            if (r6 == 0) goto L_0x08f1
            java.lang.String r6 = r7.f256416a
            boolean r6 = r2.mo32163d(r6)
            if (r6 == 0) goto L_0x08f1
            r2.mo32148G()
            goto L_0x092b
        L_0x08f1:
            boolean r0 = r7.f256422g
            if (r0 == 0) goto L_0x0902
            r0 = 600(0x258, float:8.41E-43)
            java.lang.String r3 = r7.f256416a
            r2.mo32182x(r0, r3)
            r2.mo32151J()
        L_0x08ff:
            r3 = 0
            goto L_0x0cde
        L_0x0902:
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r4 = "save param, do nothing "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
            java.lang.String r0 = r7.f256416a
            ea2.m r0 = r2.mo32174o(r0)
            if (r0 == 0) goto L_0x0cde
            r0.mo32222y(r7)
            r0.mo32199n()
            java.util.LinkedList<java.lang.String> r0 = r2.f57878k
            java.lang.String r4 = r7.f256416a
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0cde
            java.util.LinkedList<java.lang.String> r0 = r2.f57878k
            java.lang.String r2 = r7.f256416a
            r0.add(r2)
            goto L_0x0cde
        L_0x092b:
            java.lang.String r6 = r7.f256416a
            r2.mo32145D(r6)
            r2.mo32165f()
            r2.mo32164e(r0)
            r2.mo32171l()
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r2.f57874g
            java.lang.String r10 = r7.f256426k
            r6.put(r0, r10)
            java.util.HashMap<java.lang.String, nb0.b> r0 = r2.f57876i
            java.lang.String r6 = r7.f256416a
            r0.put(r6, r7)
            r2.mo32161T(r7)
            java.lang.String r0 = r7.f256416a
            ea2.m r0 = r2.mo32174o(r0)
            boolean r6 = r2.mo32178t()
            if (r6 == 0) goto L_0x0b0a
            boolean r0 = r2.mo32157P(r0)
            java.lang.String r10 = r7.f256418c
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x096c
            lh.c r10 = r2.f57849A
            java.lang.String r11 = r7.f256418c
            boolean r10 = r10.mo33567e(r11)
            if (r10 != 0) goto L_0x0986
        L_0x096c:
            if (r9 == 0) goto L_0x0988
            boolean r10 = r7.mo123301a(r9)
            if (r10 == 0) goto L_0x0988
            java.lang.String r10 = r9.f256418c
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0988
            lh.c r10 = r2.f57849A
            java.lang.String r11 = r9.f256418c
            boolean r10 = r10.mo33567e(r11)
            if (r10 == 0) goto L_0x0988
        L_0x0986:
            r10 = 1
            goto L_0x0989
        L_0x0988:
            r10 = 0
        L_0x0989:
            java.lang.String r11 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r12 = "canUseMixPlayer:%b, localCacheExit:%b, audioId:%s"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            r5[r4] = r13
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r10)
            r5[r3] = r13
            java.lang.String r13 = r7.f256416a
            r14 = 2
            r5[r14] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r5)
            if (r0 == 0) goto L_0x0b11
            if (r10 == 0) goto L_0x0b11
            java.lang.String r5 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r0 = "startAudioByMixPlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.lang.String r0 = r7.f256416a
            r2.mo32169j(r0)
            nb0.e r0 = r7.f256440y
            if (r0 == 0) goto L_0x09ca
            hp0.c r0 = (hp0.C87576c) r0     // Catch:{ Exception -> 0x09c0 }
            r0.close()     // Catch:{ Exception -> 0x09c0 }
            r7.f256440y = r8     // Catch:{ Exception -> 0x09c0 }
            goto L_0x09ca
        L_0x09c0:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r8 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r10 = "closeAudioDataSource"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r10, r6)
        L_0x09ca:
            java.lang.String r0 = r7.f256418c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x09de
            if (r9 == 0) goto L_0x09de
            boolean r0 = r9.mo123301a(r7)
            if (r0 == 0) goto L_0x09de
            java.lang.String r0 = r9.f256418c
            r7.f256418c = r0
        L_0x09de:
            boolean r0 = r7.f256422g
            if (r0 == 0) goto L_0x0aa3
            if (r9 == 0) goto L_0x0a32
            boolean r0 = r9.mo123301a(r7)
            if (r0 != 0) goto L_0x0a32
            r2.mo32150I(r7, r3, r4)
            java.lang.String r0 = "mixPlayer param src change, do stop now and play new"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            lh.c r0 = r2.f57849A
            java.lang.String r4 = r7.f256416a
            boolean r0 = r0.mo33570h(r4)
            if (r0 != 0) goto L_0x0a24
            lh.c r0 = r2.f57849A
            java.lang.String r4 = r7.f256416a
            boolean r0 = r0.mo33573k(r4)
            if (r0 != 0) goto L_0x0a24
            lh.c r0 = r2.f57849A
            java.lang.String r4 = r7.f256416a
            boolean r0 = r0.mo33572j(r4)
            if (r0 != 0) goto L_0x0a24
            lh.c r0 = r2.f57849A
            java.lang.String r4 = r7.f256416a
            boolean r0 = r0.mo33571i(r4)
            if (r0 != 0) goto L_0x0a24
            lh.c r0 = r2.f57849A
            java.lang.String r4 = r7.f256416a
            boolean r0 = r0.mo33569g(r4)
            if (r0 == 0) goto L_0x0a2b
        L_0x0a24:
            lh.c r0 = r2.f57849A
            java.lang.String r4 = r7.f256416a
            r0.mo33580r(r4)
        L_0x0a2b:
            lh.c r0 = r2.f57849A
            r0.mo33575m(r7)
            goto L_0x0cde
        L_0x0a32:
            lh.c r0 = r2.f57849A
            java.lang.String r6 = r7.f256416a
            boolean r0 = r0.mo33570h(r6)
            if (r0 == 0) goto L_0x0a43
            java.lang.String r0 = "mixPlayer is playing, do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0cde
        L_0x0a43:
            lh.c r0 = r2.f57849A
            java.lang.String r6 = r7.f256416a
            boolean r0 = r0.mo33573k(r6)
            if (r0 == 0) goto L_0x0a68
            lh.c r0 = r2.f57849A
            java.lang.String r6 = r7.f256416a
            boolean r0 = r0.mo33569g(r6)
            if (r0 == 0) goto L_0x0a68
            java.lang.String r0 = "mixPlayer is paused, do resume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r2.mo32150I(r7, r3, r4)
            lh.c r0 = r2.f57849A
            java.lang.String r2 = r7.f256416a
            r0.mo33577o(r2)
            goto L_0x0cde
        L_0x0a68:
            lh.c r0 = r2.f57849A
            java.lang.String r6 = r7.f256416a
            boolean r0 = r0.mo33571i(r6)
            if (r0 == 0) goto L_0x0a83
            java.lang.String r0 = "mixPlayer is isPrepared, do resume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r2.mo32150I(r7, r3, r4)
            lh.c r0 = r2.f57849A
            java.lang.String r2 = r7.f256416a
            r0.mo33577o(r2)
            goto L_0x0cde
        L_0x0a83:
            lh.c r0 = r2.f57849A
            java.lang.String r6 = r7.f256416a
            boolean r0 = r0.mo33572j(r6)
            if (r0 == 0) goto L_0x0a94
            java.lang.String r0 = "mixPlayer is isPreparing, do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0cde
        L_0x0a94:
            java.lang.String r0 = "mixPlayer is end or stop, do startPlay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r2.mo32150I(r7, r3, r4)
            lh.c r0 = r2.f57849A
            r0.mo33575m(r7)
            goto L_0x0cde
        L_0x0aa3:
            lh.c r0 = r2.f57849A
            java.lang.String r4 = r7.f256416a
            boolean r0 = r0.mo33568f(r4)
            if (r0 == 0) goto L_0x0ab3
            lh.c r0 = r2.f57849A
            r0.mo33581s(r7)
            goto L_0x0ab8
        L_0x0ab3:
            lh.c r0 = r2.f57849A
            r0.mo33578p(r7)
        L_0x0ab8:
            if (r9 == 0) goto L_0x0afe
            boolean r0 = r9.mo123301a(r7)
            if (r0 != 0) goto L_0x0afe
            java.lang.String r0 = "mixPlayer param src change, do stop now"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            lh.c r0 = r2.f57849A
            java.lang.String r4 = r7.f256416a
            boolean r0 = r0.mo33570h(r4)
            if (r0 != 0) goto L_0x0af7
            lh.c r0 = r2.f57849A
            java.lang.String r4 = r7.f256416a
            boolean r0 = r0.mo33573k(r4)
            if (r0 != 0) goto L_0x0af7
            lh.c r0 = r2.f57849A
            java.lang.String r4 = r7.f256416a
            boolean r0 = r0.mo33572j(r4)
            if (r0 != 0) goto L_0x0af7
            lh.c r0 = r2.f57849A
            java.lang.String r4 = r7.f256416a
            boolean r0 = r0.mo33571i(r4)
            if (r0 != 0) goto L_0x0af7
            lh.c r0 = r2.f57849A
            java.lang.String r4 = r7.f256416a
            boolean r0 = r0.mo33569g(r4)
            if (r0 == 0) goto L_0x0afe
        L_0x0af7:
            lh.c r0 = r2.f57849A
            java.lang.String r4 = r7.f256416a
            r0.mo33580r(r4)
        L_0x0afe:
            lh.c r0 = r2.f57849A
            r2 = 7
            java.lang.String r4 = r7.f256416a
            lh.d r0 = r0.f60632a
            r0.mo33590k(r2, r4)
            goto L_0x0cde
        L_0x0b0a:
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r5 = "not support mix audio"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
        L_0x0b11:
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r5 = "startAudioByQQAudioPlayer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            java.lang.String r0 = r7.f256416a
            ea2.m r0 = r2.mo32174o(r0)
            if (r0 != 0) goto L_0x0b87
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r5 = "startAudio, player is null, create new QQAudioPlayer with audioId:%s"
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.String r9 = r7.f256416a
            r8[r4] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r8)
            ea2.m r0 = r2.mo32168i()
            ea2.e r5 = r2.f57861M
            r0.f57907e = r5
            ea2.a r5 = r2.f57859K
            r0.f57911D = r5
            java.lang.String r5 = r7.f256416a
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r4] = r5
            java.lang.String r4 = "MicroMsg.Audio.QQAudioPlayer"
            java.lang.String r9 = "setAudioId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r8)
            r0.f57915f = r5
            r0.mo32222y(r7)
            boolean r4 = r7.f256422g
            if (r4 == 0) goto L_0x0b65
            r2.mo32150I(r7, r3, r3)
            java.lang.String r4 = r7.f256416a
            r2.mo32180v(r4, r0)
            long r4 = java.lang.System.currentTimeMillis()
            r7.f256425j = r4
            r0.mo32223z(r7)
            goto L_0x0cab
        L_0x0b65:
            java.lang.String r4 = r7.f256416a
            r2.mo32181w(r4, r0)
            r0.mo32199n()
            java.util.LinkedList<java.lang.String> r0 = r2.f57878k
            java.lang.String r4 = r7.f256416a
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0b7e
            java.util.LinkedList<java.lang.String> r0 = r2.f57878k
            java.lang.String r4 = r7.f256416a
            r0.add(r4)
        L_0x0b7e:
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r4 = "new player autoplay false, not to play "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
            goto L_0x0cab
        L_0x0b87:
            java.lang.String r5 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r8 = "startAudio, audioId:%s"
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r11 = r7.f256416a
            r10[r4] = r11
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r10)
            boolean r4 = r7.f256422g
            if (r4 == 0) goto L_0x0c3b
            java.lang.String r4 = r7.f256416a
            r2.mo32180v(r4, r0)
            long r4 = java.lang.System.currentTimeMillis()
            r7.f256425j = r4
            r0.mo32222y(r7)
            if (r9 == 0) goto L_0x0bdf
            boolean r4 = r9.mo123301a(r7)
            if (r4 != 0) goto L_0x0bdf
            java.lang.String r4 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r5 = "param src change, do stop now and play new"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            boolean r4 = r0.mo32206f()
            if (r4 != 0) goto L_0x0bd4
            boolean r4 = r0.mo32211k()
            if (r4 != 0) goto L_0x0bd4
            boolean r4 = r0.mo32221x()
            if (r4 != 0) goto L_0x0bd4
            boolean r4 = r0.mo32220w()
            if (r4 != 0) goto L_0x0bd4
            boolean r4 = r0.mo32219v()
            if (r4 == 0) goto L_0x0bd7
        L_0x0bd4:
            r0.mo32210j()
        L_0x0bd7:
            r2.mo32150I(r7, r3, r3)
            r0.mo32223z(r7)
            goto L_0x0cab
        L_0x0bdf:
            boolean r4 = r0.mo32206f()
            if (r4 == 0) goto L_0x0bee
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r4 = "is playing, do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            goto L_0x0cab
        L_0x0bee:
            boolean r4 = r0.mo32211k()
            if (r4 == 0) goto L_0x0c09
            boolean r4 = r0.mo32219v()
            if (r4 == 0) goto L_0x0c09
            r2.mo32150I(r7, r3, r3)
            java.lang.String r4 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r5 = "is paused, do resume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r0.resume()
            goto L_0x0cab
        L_0x0c09:
            boolean r4 = r0.mo32220w()
            if (r4 == 0) goto L_0x0c1e
            r2.mo32150I(r7, r3, r3)
            java.lang.String r4 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r5 = "is isPrepared, do resume"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r0.resume()
            goto L_0x0cab
        L_0x0c1e:
            boolean r4 = r0.mo32221x()
            if (r4 == 0) goto L_0x0c2d
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r4 = "is isPreparing, do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            goto L_0x0cab
        L_0x0c2d:
            r2.mo32150I(r7, r3, r3)
            java.lang.String r4 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r5 = "is end or stop, do startPlay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r0.mo32223z(r7)
            goto L_0x0cab
        L_0x0c3b:
            java.lang.Object r4 = r2.f57882o
            monitor-enter(r4)
            java.util.LinkedList<java.lang.String> r5 = r2.f57870c     // Catch:{ all -> 0x0ce3 }
            java.lang.String r8 = r7.f256416a     // Catch:{ all -> 0x0ce3 }
            boolean r5 = r5.contains(r8)     // Catch:{ all -> 0x0ce3 }
            monitor-exit(r4)     // Catch:{ all -> 0x0ce3 }
            if (r5 != 0) goto L_0x0c56
            java.lang.String r4 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r5 = "mark player recycle"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            java.lang.String r4 = r7.f256416a
            r2.mo32181w(r4, r0)
            goto L_0x0c5d
        L_0x0c56:
            java.lang.String r4 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r5 = "don't mark player, is playing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
        L_0x0c5d:
            r0.mo32222y(r7)
            if (r9 == 0) goto L_0x0c90
            boolean r4 = r9.mo123301a(r7)
            if (r4 != 0) goto L_0x0c90
            java.lang.String r4 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r5 = "param src change, do stop now"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            boolean r4 = r0.mo32206f()
            if (r4 != 0) goto L_0x0c8d
            boolean r4 = r0.mo32211k()
            if (r4 != 0) goto L_0x0c8d
            boolean r4 = r0.mo32221x()
            if (r4 != 0) goto L_0x0c8d
            boolean r4 = r0.mo32220w()
            if (r4 != 0) goto L_0x0c8d
            boolean r4 = r0.mo32219v()
            if (r4 == 0) goto L_0x0c90
        L_0x0c8d:
            r0.mo32210j()
        L_0x0c90:
            r0.mo32199n()
            java.util.LinkedList<java.lang.String> r0 = r2.f57878k
            java.lang.String r4 = r7.f256416a
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L_0x0ca4
            java.util.LinkedList<java.lang.String> r0 = r2.f57878k
            java.lang.String r4 = r7.f256416a
            r0.add(r4)
        L_0x0ca4:
            java.lang.String r0 = "MicroMsg.Audio.AudioPlayerMgr"
            java.lang.String r4 = "autoplay false, not to play "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
        L_0x0cab:
            if (r6 == 0) goto L_0x0cdb
            android.os.Looper r0 = android.os.Looper.myLooper()
            r2.f57858J = r0
            lh.c r0 = r2.f57849A
            java.lang.String r4 = r7.f256416a
            boolean r0 = r0.mo33568f(r4)
            if (r0 == 0) goto L_0x0cc3
            lh.c r0 = r2.f57849A
            r0.mo33581s(r7)
            goto L_0x0cc8
        L_0x0cc3:
            lh.c r0 = r2.f57849A
            r0.mo33578p(r7)
        L_0x0cc8:
            boolean r0 = r2.mo32179u(r7)
            if (r0 != 0) goto L_0x0cd6
            java.lang.String r0 = r7.f256418c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0cdb
        L_0x0cd6:
            java.lang.String r0 = r7.f256416a
            r2.mo32142A(r0)
        L_0x0cdb:
            r2.mo32166g(r7)
        L_0x0cde:
            vh.a$b r0 = r1.f260749b
            r0.f260756a = r3
            goto L_0x0ce9
        L_0x0ce3:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0ce3 }
            throw r0
        L_0x0ce6:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0ce6 }
            throw r0
        L_0x0ce9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ea2.C20557b.m22327a(vh.a):boolean");
    }
}
