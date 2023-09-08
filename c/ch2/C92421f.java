package ch2;

/* renamed from: ch2.f */
public final class C92421f implements C92419c {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0124 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ch2.C92420d mo126421a(zg2.C103014f r34, te3.C101781gb0 r35) {
        /*
            r33 = this;
            r1 = r34
            r2 = r35
            java.lang.String r0 = "editorData"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "extraConfig"
            gy3.C87412m.m108594g(r2, r0)
            te3.e70 r0 = new te3.e70
            r0.<init>()
            byte[] r3 = r1.field_baseItemData
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x001b
        L_0x0019:
            r0 = r5
            goto L_0x002f
        L_0x001b:
            r0.parseFrom(r3)     // Catch:{ Exception -> 0x001f }
            goto L_0x002f
        L_0x001f:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r6 = 0
            r0[r6] = r3
            java.lang.String r3 = "safeParser"
            java.lang.String r6 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r6, r0)
            goto L_0x0019
        L_0x002f:
            if (r0 == 0) goto L_0x0124
            zg2.m r3 = zg2.C103020m.f303985a
            fh2.c r7 = new fh2.c
            r7.<init>()
            int r6 = r0.f298162h
            if (r6 == 0) goto L_0x0060
            if (r6 != r4) goto L_0x003f
            goto L_0x0060
        L_0x003f:
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r5 = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo
            r5.<init>()
            java.lang.String r4 = r0.f298166o
            r5.f163814f = r4
            int r4 = r0.f298165n
            r5.f163813e = r4
            boolean r4 = r0.f298167p
            r5.f163818j = r4
            boolean r4 = r0.f298168q
            r5.f163819n = r4
            java.lang.String r4 = r0.f298164j
            r5.f163817i = r4
            int r4 = r0.f298150B
            r5.f163828w = r4
            long r8 = r0.f298151C
            r5.f163829x = r8
        L_0x0060:
            r7.f287134j = r5
            int r4 = r0.f298162h
            r7.f287133i = r4
            long r4 = r0.f298159e
            r7.f287130f = r4
            long r4 = r0.f298160f
            r7.f287131g = r4
            java.lang.String r4 = r0.f298158d
            java.lang.String r5 = "storyEditorProtoData.videoPath"
            gy3.C87412m.m108593f(r4, r5)
            r7.f287128d = r4
            java.lang.String r4 = r0.f298163i
            java.lang.String r5 = "storyEditorProtoData.thumbPath"
            gy3.C87412m.m108593f(r4, r5)
            r7.f287129e = r4
            boolean r4 = r0.f298176y
            r7.f287132h = r4
            java.util.ArrayList<java.lang.String> r4 = r7.f287136o
            java.util.LinkedList<java.lang.String> r5 = r0.f298152D
            r4.addAll(r5)
            java.util.ArrayList<java.lang.String> r4 = r7.f287136o
            r4.isEmpty()
            java.util.LinkedList<te3.ea> r4 = r0.f298173v
            java.lang.String r5 = "storyEditorItem.baseItemData"
            gy3.C87412m.m108593f(r4, r5)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r6 = "getContext()"
            gy3.C87412m.m108593f(r5, r6)
            java.util.ArrayList r8 = r3.mo142736d(r4, r5)
            float[] r9 = r3.mo142738f(r0)
            float[] r10 = r3.mo142739g(r0)
            ah2.a r0 = new ah2.a
            java.lang.String r11 = r2.f298299o
            java.lang.String r3 = "extraConfig.outputVideoPath"
            gy3.C87412m.m108593f(r11, r3)
            java.lang.String r12 = r2.f298300p
            java.lang.String r3 = "extraConfig.outputThumbPath"
            gy3.C87412m.m108593f(r12, r3)
            r13 = 0
            boolean r14 = r2.f298301q
            r15 = 0
            r16 = 0
            java.lang.String r2 = r1.field_blurBgPath
            java.lang.String r3 = "editorData.field_blurBgPath"
            gy3.C87412m.m108593f(r2, r3)
            r18 = 832(0x340, float:1.166E-42)
            r19 = 0
            r6 = r0
            r17 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.tencent.mm.plugin.recordvideo.background.VideoMixer r2 = new com.tencent.mm.plugin.recordvideo.background.VideoMixer
            r2.<init>(r0)
            int r0 = r1.field_targetWidth
            int r3 = r1.field_targetHeight
            int r4 = r1.field_videoBitrate
            int r5 = r1.field_audioBitrate
            int r6 = r1.field_audioSampleRate
            int r7 = r1.field_audioChannelCount
            int r8 = r1.field_frameRate
            int r1 = r1.field_videoRotate
            r29 = 0
            r30 = 0
            r31 = 768(0x300, float:1.076E-42)
            r32 = 0
            r20 = r2
            r21 = r0
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r8
            r28 = r1
            com.tencent.p014mm.plugin.recordvideo.background.VideoMixer.m119414j(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "remux video config: "
            r0.append(r1)
            com.tencent.mm.plugin.recordvideo.background.VideoMixer$MixConfig r1 = r2.mo129785f()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.VideoMixerManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r2
        L_0x0124:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.C92421f.mo126421a(zg2.f, te3.gb0):ch2.d");
    }
}
