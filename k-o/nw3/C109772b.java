package nw3;

import as3.C103912y0;
import bs3.C104161b;
import bs3.C104162c;
import com.tencent.p014mm.plugin.multi.talk;
import com.tencent.p014mm.plugin.multitalk.model.C105845w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wecall.talkroom.model.VoiceEngineConf;
import ds3.C107065e;
import ds3.C107066f;
import ds3.C107067g;
import f40.C86709a0;
import java.util.concurrent.atomic.AtomicInteger;
import p156gj.C107835h0;

/* renamed from: nw3.b */
public class C109772b {

    /* renamed from: a */
    public talk f328532a;

    public C109772b() {
        talk talk = new talk();
        this.f328532a = talk;
        C104161b.m138995d("simon:TalkRoomContext", "construct engine:", talk);
    }

    /* renamed from: a */
    public int mo161003a() {
        int i;
        try {
            talk talk = this.f328532a;
            if (talk != null) {
                i = talk.close();
                C104161b.m138995d("simon:TalkRoomContext", "Close ret: ", Integer.valueOf(i));
                return i;
            }
        } catch (Throwable th) {
            C104161b.m138997f("simon:TalkRoomContext", "Close ", th);
        }
        i = 0;
        C104161b.m138995d("simon:TalkRoomContext", "Close ret: ", Integer.valueOf(i));
        return i;
    }

    /* renamed from: b */
    public int mo161004b(talk.IMultiTalkListener iMultiTalkListener, C103912y0 y0Var, int i, int i2, int i3, long j, String[] strArr, short[] sArr, int i4, int[] iArr, byte[] bArr, boolean z, String[] strArr2, short[] sArr2, int i5, int i6, int i7, byte[] bArr2, int[] iArr2, int i8, String str) {
        VoiceEngineConf voiceEngineConf;
        C103912y0 y0Var2 = y0Var;
        if (y0Var2 != null) {
            voiceEngineConf = new VoiceEngineConf(y0Var2.f307222b, y0Var2.f307223c, y0Var2.f307224d, y0Var2.f307225e, y0Var2.f307226f, y0Var2.f307227g, y0Var2.f307228h, y0Var2.f307229i, y0Var2.f307230j, y0Var2.f307231k, y0Var2.f307232l, y0Var2.f307233m);
        } else {
            C104161b.m138997f("simon:TalkRoomContext", "voiceConf is null");
            voiceEngineConf = null;
        }
        VoiceEngineConf voiceEngineConf2 = voiceEngineConf;
        int a = C109803i0.m149217a(C104162c.f308396a);
        talk talk = this.f328532a;
        if (talk == null) {
            return -1;
        }
        return talk.Open(iMultiTalkListener, voiceEngineConf2, i, i2, i3, j, strArr, sArr, i4, iArr, bArr, z, a, strArr2, sArr2, i5, i6, i7, bArr2, iArr2, i8, str);
    }

    /* renamed from: c */
    public void mo161005c() {
        C107065e eVar = C109782f.f328551V0;
        if (eVar != null) {
            String Lo = C86709a0.m107535s().mo121144k().mo119656Lo(77825);
            C107835h0.m146105b(Lo);
            Log.m105924i("MicroMsg.MT.MultiTalkEngine", "MTSDK audioAdapter startRecord setMultiTalkAppCmd info: " + Lo);
            C105845w.this.mo150830j();
        }
    }

    /* renamed from: d */
    public int mo161006d() {
        try {
            if (this.f328532a == null) {
                return 0;
            }
            AtomicInteger atomicInteger = new AtomicInteger();
            AtomicInteger atomicInteger2 = new AtomicInteger();
            this.f328532a.getChannelBytes(atomicInteger, atomicInteger2);
            return atomicInteger2.get();
        } catch (Throwable th) {
            C104161b.m138997f("simon:TalkRoomContext", "getTotalWWANBytes: ", th);
            return 0;
        }
    }

    /* renamed from: e */
    public void mo161007e() {
        talk talk = this.f328532a;
        AtomicInteger atomicInteger = new AtomicInteger();
        AtomicInteger atomicInteger2 = new AtomicInteger();
        try {
            talk.getSampleRate(atomicInteger, atomicInteger2);
        } catch (Throwable th) {
            C104161b.m138997f("VoipAdapterUtil", "adapterInitv2engineSampleRate:  ", th);
        }
        int i = atomicInteger.get();
        int i2 = atomicInteger2.get();
        talk.f314039a = i;
        talk.f314040b = i2;
        C104161b.m138997f("VoipAdapterUtil", "adapterInitv2engineSampleRate getSampleRate:", Integer.valueOf(talk.f314039a), Integer.valueOf(talk.f314040b));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fd  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo161008f() {
        /*
            r16 = this;
            r1 = r16
            android.content.Context r0 = bs3.C104162c.f308396a
            java.lang.String r2 = "lib"
            r3 = 0
            java.io.File r0 = r0.getDir(r2, r3)
            java.lang.String r2 = r0.getAbsolutePath()
            ds3.e r0 = nw3.C109782f.f328551V0
            r6 = 1
            if (r0 == 0) goto L_0x00ba
            int r7 = p156gj.C107842p.m146108a()
            java.lang.String r0 = "video/avc"
            int r8 = com.tencent.p014mm.plugin.multitalk.model.C105820n.f314693y
            java.lang.String r8 = "MultiAvcEncoder[HWEnc]"
            int r9 = android.media.MediaCodecList.getCodecCount()     // Catch:{ Exception -> 0x0088 }
            int r9 = r9 - r6
            r10 = 0
        L_0x0024:
            if (r9 < 0) goto L_0x0097
            android.media.MediaCodecInfo r11 = android.media.MediaCodecList.getCodecInfoAt(r9)     // Catch:{ Exception -> 0x0086 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0086 }
            r12.<init>()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r13 = "steve codecInfo : "
            r12.append(r13)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r13 = r11.getName()     // Catch:{ Exception -> 0x0086 }
            r12.append(r13)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0086 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)     // Catch:{ Exception -> 0x0086 }
            java.lang.String[] r12 = r11.getSupportedTypes()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r11 = r11.getName()     // Catch:{ Exception -> 0x0086 }
            r13 = 0
        L_0x004b:
            int r14 = r12.length     // Catch:{ Exception -> 0x0086 }
            if (r13 >= r14) goto L_0x0083
            r14 = r12[r13]     // Catch:{ Exception -> 0x0086 }
            boolean r14 = r14.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x0086 }
            if (r14 == 0) goto L_0x0080
            java.lang.String[] r14 = com.tencent.p014mm.plugin.multitalk.model.C105820n.f314690B     // Catch:{ Exception -> 0x0086 }
            int r15 = r14.length     // Catch:{ Exception -> 0x0086 }
            r4 = 0
        L_0x005a:
            if (r4 >= r15) goto L_0x0080
            r5 = r14[r4]     // Catch:{ Exception -> 0x0086 }
            boolean r5 = r11.startsWith(r5)     // Catch:{ Exception -> 0x0086 }
            if (r5 == 0) goto L_0x007d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007a }
            r5.<init>()     // Catch:{ Exception -> 0x007a }
            java.lang.String r10 = "steve : H.264 HW encoder found:"
            r5.append(r10)     // Catch:{ Exception -> 0x007a }
            r5.append(r11)     // Catch:{ Exception -> 0x007a }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x007a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)     // Catch:{ Exception -> 0x007a }
            r10 = 1
            goto L_0x007d
        L_0x007a:
            r0 = move-exception
            r10 = 1
            goto L_0x008a
        L_0x007d:
            int r4 = r4 + 1
            goto L_0x005a
        L_0x0080:
            int r13 = r13 + 1
            goto L_0x004b
        L_0x0083:
            int r9 = r9 + -1
            goto L_0x0024
        L_0x0086:
            r0 = move-exception
            goto L_0x008a
        L_0x0088:
            r0 = move-exception
            r10 = 0
        L_0x008a:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r5 = r0.getMessage()
            r4[r3] = r5
            java.lang.String r5 = "SupportAvcCodec error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r5, r4)
        L_0x0097:
            if (r10 == 0) goto L_0x009c
            r0 = 10
            goto L_0x009d
        L_0x009c:
            r0 = 2
        L_0x009d:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4[r3] = r5
            java.lang.String r5 = "MicroMsg.MT.MultiTalkEngine"
            java.lang.String r8 = "CodecList[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r4)
            boolean r4 = c92.C104331h.m139314g()
            if (r4 == 0) goto L_0x00b4
            r4 = 1
            goto L_0x00b6
        L_0x00b4:
            r4 = 11
        L_0x00b6:
            r9 = r0
            r12 = r4
            r11 = r7
            goto L_0x00be
        L_0x00ba:
            r9 = 0
            r11 = 0
            r12 = 11
        L_0x00be:
            android.content.Context r0 = bs3.C104162c.f308396a
            int r10 = nw3.C109803i0.m149217a(r0)
            r0 = 8
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r4 = "protocalInit netType:"
            r0[r3] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r0[r6] = r4
            java.lang.String r4 = " cpuFlag:"
            r5 = 2
            r0[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r5 = 3
            r0[r5] = r4
            java.lang.String r4 = " outfmt:"
            r7 = 4
            r0[r7] = r4
            r4 = 5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r0[r4] = r8
            r4 = 6
            java.lang.String r8 = "libPath:"
            r0[r4] = r8
            r4 = 7
            r0[r4] = r2
            java.lang.String r4 = "simon:TalkRoomContext"
            bs3.C104161b.m138995d(r4, r0)
            com.tencent.mm.plugin.multi.talk r8 = r1.f328532a
            if (r8 != 0) goto L_0x00fd
            r0 = -1
            return r0
        L_0x00fd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "/"
            r0.append(r2)
            java.lang.String r13 = r0.toString()
            int r0 = r8.init(r9, r10, r11, r12, r13)
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r7 = "protocalInit"
            r2[r3] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r2[r6] = r7
            java.lang.String r6 = "field_capInfo length: "
            r7 = 2
            r2[r7] = r6
            com.tencent.mm.plugin.multi.talk r6 = r1.f328532a
            byte[] r6 = r6.field_capInfo
            if (r6 != 0) goto L_0x012a
            goto L_0x012b
        L_0x012a:
            int r3 = r6.length
        L_0x012b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r5] = r3
            bs3.C104161b.m138995d(r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nw3.C109772b.mo161008f():int");
    }

    /* renamed from: g */
    public C107066f mo161009g(byte[] bArr, int[] iArr, int i) {
        talk talk;
        C107066f fVar = new C107066f();
        if ((bArr == null && iArr == null) || (talk = this.f328532a) == null) {
            C104161b.m138997f("simon:TalkRoomContext", "steve:receiveScreen null, imgBuffer32:", iArr, ", engine:", this.f328532a);
            return fVar;
        }
        fVar.f320479g = talk.screenDecode(bArr, iArr, i);
        fVar.f320473a = iArr;
        talk talk2 = this.f328532a;
        fVar.f320474b = talk2.field_remoteImgLength_screen;
        fVar.f320475c = talk2.field_remoteImgWidth_screen;
        fVar.f320476d = talk2.field_remoteImgHeight_screen;
        fVar.f320477e = talk2.field_remoteImgChannel_screen & 16383;
        fVar.f320480h = talk2.field_remoteImgOrien_screen;
        fVar.f320478f = C109774c.m149103b().mo161021i(C109770a.m149092a().f328593p, fVar.f320477e);
        return fVar;
    }

    /* renamed from: h */
    public C107066f mo161010h(int[] iArr) {
        talk talk;
        C107066f fVar = new C107066f();
        if (iArr == null || (talk = this.f328532a) == null) {
            C104161b.m138997f("simon:TalkRoomContext", "steve:receiveVideo null, imgBuffer:", iArr, ", engine:", this.f328532a);
            return fVar;
        }
        fVar.f320479g = talk.videoDecode(iArr);
        fVar.f320473a = iArr;
        talk talk2 = this.f328532a;
        fVar.f320474b = talk2.field_remoteImgLength;
        fVar.f320475c = talk2.field_remoteImgWidth;
        fVar.f320476d = talk2.field_remoteImgHeight;
        fVar.f320477e = talk2.field_remoteImgChannel & 16383;
        fVar.f320480h = 0;
        fVar.f320478f = C109774c.m149103b().mo161021i(C109770a.m149092a().f328593p, fVar.f320477e);
        return fVar;
    }

    /* renamed from: i */
    public int mo161011i() {
        int i;
        try {
            talk talk = this.f328532a;
            if (talk != null) {
                i = talk.uninit();
                C104161b.m138995d("simon:TalkRoomContext", "uninitLive ret: ", Integer.valueOf(i));
                return i;
            }
        } catch (Throwable th) {
            C104161b.m138997f("simon:TalkRoomContext", "uninitLive ", th);
        }
        i = 0;
        C104161b.m138995d("simon:TalkRoomContext", "uninitLive ret: ", Integer.valueOf(i));
        return i;
    }

    /* renamed from: j */
    public C107067g mo161012j(byte[] bArr, int i, int i2, int i3, int i4, int[] iArr) {
        talk talk;
        if (bArr == null || (talk = this.f328532a) == null) {
            C104161b.m138997f("simon:TalkRoomContext", "steve:videoTrans null, recordData:", bArr, ", engine:", this.f328532a);
            return null;
        }
        int videoTrans = talk.videoTrans(bArr, i, i2, i3, i4, iArr);
        C107067g gVar = new C107067g();
        gVar.f320481a = iArr;
        talk talk2 = this.f328532a;
        gVar.f320482b = talk2.field_localImgWidth;
        gVar.f320483c = talk2.field_localImgHeight;
        gVar.f320484d = videoTrans;
        return gVar;
    }
}
