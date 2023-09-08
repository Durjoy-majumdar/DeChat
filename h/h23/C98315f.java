package h23;

import ch2.C92419c;

/* renamed from: h23.f */
public final class C98315f implements C92419c {
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r24v2, types: [com.tencent.mm.plugin.vlog.model.a0] */
    /* JADX WARNING: type inference failed for: r24v3, types: [com.tencent.mm.plugin.vlog.model.y0] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ch2.C92420d mo126421a(zg2.C103014f r37, te3.C101781gb0 r38) {
        /*
            r36 = this;
            r1 = r37
            r2 = r38
            java.lang.String r0 = "editorData"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "extraConfig"
            gy3.C87412m.m108594g(r2, r0)
            te3.e70 r0 = new te3.e70
            r0.<init>()
            byte[] r3 = r1.field_baseItemData
            java.lang.String r5 = ""
            java.lang.String r6 = "safeParser"
            r7 = 0
            r8 = 1
            if (r3 != 0) goto L_0x001f
            goto L_0x002d
        L_0x001f:
            r0.parseFrom(r3)     // Catch:{ Exception -> 0x0024 }
            r3 = r0
            goto L_0x002e
        L_0x0024:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r3
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r5, r0)
        L_0x002d:
            r3 = 0
        L_0x002e:
            java.lang.String r9 = "MicroMsg.VLogMixerInstanceManager"
            if (r3 == 0) goto L_0x01e3
            com.tencent.mm.plugin.vlog.model.t0 r15 = new com.tencent.mm.plugin.vlog.model.t0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r0 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 2047(0x7ff, float:2.868E-42)
            r23 = 0
            r10 = r15
            r4 = r15
            r15 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            int r0 = r1.field_audioBitrate
            r4.f282606g = r0
            int r0 = r1.field_videoBitrate
            r4.f282605f = r0
            int r0 = r1.field_targetWidth
            r4.f282603d = r0
            int r0 = r1.field_targetHeight
            r4.f282604e = r0
            int r0 = r1.field_frameRate
            r4.f282607h = r0
            int r0 = r1.field_audioSampleRate
            r4.f282609j = r0
            int r0 = r1.field_audioChannelCount
            r4.f282610k = r0
            int r0 = r1.field_videoRotate
            r4.f282608i = r0
            int r0 = r3.f298162h
            r4.f282601b = r0
            long r0 = r3.f298160f
            int r1 = (int) r0
            r4.f282600a = r1
            java.lang.String r0 = r2.f298299o
            java.lang.String r1 = "extraConfig.outputVideoPath"
            gy3.C87412m.m108593f(r0, r1)
            r4.f282602c = r0
            te3.mp4 r0 = new te3.mp4
            r0.<init>()
            pe3.b r1 = r3.f298153E
            byte[] r1 = r1.mo123703f()
            r0.parseFrom(r1)     // Catch:{ Exception -> 0x0090 }
            goto L_0x009a
        L_0x0090:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r1
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r5, r0)
            r0 = 0
        L_0x009a:
            if (r0 == 0) goto L_0x01e3
            te3.cs4 r1 = r0.f138147d
            r2 = 4
            float[] r2 = new float[r2]
            int r5 = r3.f298169r
            float r5 = (float) r5
            r2[r7] = r5
            int r5 = r3.f298171t
            float r5 = (float) r5
            r2[r8] = r5
            r5 = 2
            int r6 = r3.f298170s
            float r6 = (float) r6
            r2[r5] = r6
            r5 = 3
            int r6 = r3.f298172u
            float r6 = (float) r6
            r2[r5] = r6
            zg2.m r5 = zg2.C103020m.f303985a
            java.util.LinkedList<te3.ea> r3 = r3.f298173v
            java.lang.String r6 = "editorProtoData.baseItemData"
            gy3.C87412m.m108593f(r3, r6)
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r7 = "getContext()"
            gy3.C87412m.m108593f(r6, r7)
            java.util.ArrayList r3 = r5.mo142736d(r3, r6)
            if (r1 == 0) goto L_0x01e3
            com.tencent.mm.plugin.vlog.model.v0 r5 = new com.tencent.mm.plugin.vlog.model.v0
            long r11 = r1.f131932d
            java.util.LinkedList<te3.cv2> r6 = r1.f131936h
            java.lang.String r7 = "script.materials"
            gy3.C87412m.m108593f(r6, r7)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x00e4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x016e
            java.lang.Object r7 = r6.next()
            te3.cv2 r7 = (te3.C49053cv2) r7
            long r14 = r7.f131974e
            r16 = 2
            java.lang.String r8 = "materialResp.path"
            int r10 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r10 != 0) goto L_0x012b
            com.tencent.mm.plugin.vlog.model.y0 r10 = new com.tencent.mm.plugin.vlog.model.y0
            java.lang.String r14 = r7.f131987u
            gy3.C87412m.m108593f(r14, r8)
            r22 = r9
            long r8 = r7.f131981o
            boolean r15 = r7.f131982p
            r37 = r3
            r23 = r4
            double r3 = r7.f131983q
            float r3 = (float) r3
            r16 = r11
            long r11 = r7.f131975f
            r38 = r6
            long r6 = r7.f131976g
            long r34 = r11 + r6
            r28 = 0
            r24 = r10
            r25 = r14
            r26 = r8
            r30 = r15
            r31 = r3
            r32 = r11
            r24.<init>(r25, r26, r28, r30, r31, r32, r34)
            goto L_0x0159
        L_0x012b:
            r37 = r3
            r23 = r4
            r38 = r6
            r22 = r9
            r16 = r11
            r3 = 1
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x0158
            com.tencent.mm.plugin.vlog.model.a0 r10 = new com.tencent.mm.plugin.vlog.model.a0
            java.lang.String r3 = r7.f131987u
            gy3.C87412m.m108593f(r3, r8)
            long r8 = r7.f131975f
            long r6 = r7.f131976g
            long r28 = r8 + r6
            r30 = 0
            r31 = 8
            r32 = 0
            r24 = r10
            r25 = r3
            r26 = r8
            r24.<init>(r25, r26, r28, r30, r31, r32)
            goto L_0x0159
        L_0x0158:
            r10 = 0
        L_0x0159:
            if (r10 == 0) goto L_0x015c
            goto L_0x015d
        L_0x015c:
            r10 = 0
        L_0x015d:
            if (r10 == 0) goto L_0x0162
            r13.add(r10)
        L_0x0162:
            r3 = r37
            r6 = r38
            r11 = r16
            r9 = r22
            r4 = r23
            goto L_0x00e4
        L_0x016e:
            r37 = r3
            r23 = r4
            r22 = r9
            r16 = r11
            te3.q23 r3 = r1.f131933e
            java.lang.String r14 = r3.f184936f
            java.lang.String r3 = "music.music_url"
            gy3.C87412m.m108593f(r14, r3)
            r3 = 0
            r4 = 0
            r18 = 0
            r19 = 0
            r20 = 240(0xf0, float:3.36E-43)
            r21 = 0
            r10 = r5
            r11 = r16
            r15 = r1
            r16 = r3
            r17 = r4
            r10.<init>(r11, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r5.f282617g = r2
            r2 = r37
            r5.f282615e = r2
            h23.q r2 = new h23.q
            r3 = r23
            r2.<init>(r5, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "music url:"
            r3.append(r4)
            te3.q23 r4 = r1.f131933e
            java.lang.String r4 = r4.f184941n
            r3.append(r4)
            java.lang.String r4 = " exist:"
            r3.append(r4)
            te3.q23 r4 = r1.f131933e
            java.lang.String r4 = r4.f184941n
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            te3.q23 r1 = r1.f131933e
            java.lang.String r1 = r1.f184941n
            java.lang.String r3 = "MicroMsg.VLogRemuxer"
            java.lang.String r4 = "setMusicPath path"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r2.f323527j = r1
            int r1 = r0.f138148e
            int r0 = r0.f138149f
            r2.mo158429e(r1, r0)
            return r2
        L_0x01e3:
            r4 = r9
            java.lang.String r0 = "return null mixer"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h23.C98315f.mo126421a(zg2.f, te3.gb0):ch2.d");
    }
}
