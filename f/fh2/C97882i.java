package fh2;

import ai2.C92007a;
import android.graphics.Point;
import bi2.C92262a;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f72.C97842b;
import gy3.C8480h;
import gy3.C87412m;
import hi2.C98464o;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: fh2.i */
public final class C97882i {

    /* renamed from: a */
    public boolean f287141a;

    /* renamed from: b */
    public AudioCacheInfo f287142b;

    /* renamed from: c */
    public ArrayList<C92262a> f287143c;

    /* renamed from: d */
    public ArrayList<C92007a> f287144d;

    /* renamed from: e */
    public float[] f287145e;

    /* renamed from: f */
    public int f287146f;

    /* renamed from: g */
    public int f287147g;

    /* renamed from: h */
    public ArrayList<String> f287148h;

    /* renamed from: i */
    public String f287149i;

    /* renamed from: j */
    public float[] f287150j;

    /* renamed from: fh2.i$a */
    public static final class C97883a {

        /* renamed from: a */
        public int f287151a;

        /* renamed from: b */
        public int f287152b;

        /* renamed from: c */
        public int f287153c;

        /* renamed from: d */
        public int f287154d;

        /* renamed from: e */
        public int f287155e;

        /* renamed from: f */
        public int f287156f;

        /* renamed from: g */
        public int f287157g;

        /* renamed from: h */
        public int f287158h;

        /* renamed from: i */
        public boolean f287159i;

        /* renamed from: j */
        public boolean f287160j;

        /* renamed from: k */
        public int f287161k;

        /* renamed from: l */
        public int f287162l;

        /* renamed from: m */
        public int f287163m;

        public C97883a() {
            this(0, 0, 0, 0, 0, 0, 0, 0, false, false, 0, 0, 0, 8191, (C8480h) null);
        }

        public C97883a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, int i9, int i15, int i16, int i17, C8480h hVar) {
            int i18 = i17;
            int i19 = 0;
            int i25 = (i18 & 1) != 0 ? 0 : i;
            int i26 = (i18 & 2) != 0 ? 0 : i2;
            int i27 = (i18 & 4) != 0 ? 0 : i3;
            int i28 = (i18 & 8) != 0 ? 0 : i4;
            int i29 = (i18 & 16) != 0 ? 0 : i5;
            int i35 = (i18 & 32) != 0 ? 0 : i6;
            int i36 = (i18 & 64) != 0 ? 0 : i7;
            int i37 = (i18 & 128) != 0 ? 1 : i8;
            boolean z3 = (i18 & 256) != 0 ? false : z;
            boolean z4 = (i18 & 512) != 0 ? false : z2;
            int i38 = (i18 & 1024) != 0 ? 0 : i9;
            int i39 = (i18 & 2048) != 0 ? 0 : i15;
            i19 = (i18 & 4096) == 0 ? i16 : i19;
            this.f287151a = i25;
            this.f287152b = i26;
            this.f287153c = i27;
            this.f287154d = i28;
            this.f287155e = i29;
            this.f287156f = i35;
            this.f287157g = i36;
            this.f287158h = i37;
            this.f287159i = z3;
            this.f287160j = z4;
            this.f287161k = i38;
            this.f287162l = i39;
            this.f287163m = i19;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C97883a)) {
                return false;
            }
            C97883a aVar = (C97883a) obj;
            return this.f287151a == aVar.f287151a && this.f287152b == aVar.f287152b && this.f287153c == aVar.f287153c && this.f287154d == aVar.f287154d && this.f287155e == aVar.f287155e && this.f287156f == aVar.f287156f && this.f287157g == aVar.f287157g && this.f287158h == aVar.f287158h && this.f287159i == aVar.f287159i && this.f287160j == aVar.f287160j && this.f287161k == aVar.f287161k && this.f287162l == aVar.f287162l && this.f287163m == aVar.f287163m;
        }

        public int hashCode() {
            int i = ((((((((((((((this.f287151a * 31) + this.f287152b) * 31) + this.f287153c) * 31) + this.f287154d) * 31) + this.f287155e) * 31) + this.f287156f) * 31) + this.f287157g) * 31) + this.f287158h) * 31;
            boolean z = this.f287159i;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (i + (z ? 1 : 0)) * 31;
            boolean z3 = this.f287160j;
            if (!z3) {
                z2 = z3;
            }
            return ((((((i2 + (z2 ? 1 : 0)) * 31) + this.f287161k) * 31) + this.f287162l) * 31) + this.f287163m;
        }

        public String toString() {
            return "EncodeConfig(targetWidth=" + this.f287151a + ", targetHeight=" + this.f287152b + ", videoBitrate=" + this.f287153c + ", audioBitrate=" + this.f287154d + ", frameRate=" + this.f287155e + ", videoRotate=" + this.f287156f + ", audioSampleRate=" + this.f287157g + ", audioChannelCount=" + this.f287158h + ", needRemux=" + this.f287159i + ", change=" + this.f287160j + ", qpmin=" + this.f287161k + ", qpmax=" + this.f287162l + ')';
        }
    }

    public C97882i(boolean z, AudioCacheInfo audioCacheInfo, ArrayList<C92262a> arrayList, ArrayList<C92007a> arrayList2, float[] fArr, int i, int i2, ArrayList<String> arrayList3, String str, float[] fArr2) {
        C87412m.m108594g(arrayList, "editItems");
        C87412m.m108594g(arrayList2, "editData");
        C87412m.m108594g(fArr, "drawingRect");
        C87412m.m108594g(arrayList3, "fakeImagesList");
        C87412m.m108594g(fArr2, "validRect");
        this.f287141a = z;
        this.f287142b = audioCacheInfo;
        this.f287143c = arrayList;
        this.f287144d = arrayList2;
        this.f287145e = fArr;
        this.f287146f = i;
        this.f287147g = i2;
        this.f287148h = arrayList3;
        this.f287149i = str;
        this.f287150j = fArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00aa, code lost:
        if (r5 != false) goto L_0x00ac;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final fh2.C97882i.C97883a mo137203a(com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider r25, h90.C98324b r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.lang.String r3 = "MicroMsg.RemuxMediaEditConfig"
            if (r1 == 0) goto L_0x021f
            if (r2 != 0) goto L_0x000e
            goto L_0x021f
        L_0x000e:
            java.util.ArrayList<java.lang.String> r4 = r2.f288190k
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x001d
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r4 = 0
            goto L_0x001e
        L_0x001d:
            r4 = 1
        L_0x001e:
            if (r4 != 0) goto L_0x0087
            com.tencent.mm.modelcontrol.VideoTransPara r1 = r1.f272926n
            java.lang.String r2 = "configProvider.videoParam"
            gy3.C87412m.m108593f(r1, r2)
            fh2.i$a r2 = new fh2.i$a
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 8191(0x1fff, float:1.1478E-41)
            r22 = 0
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            fh2.f r3 = fh2.C97881f.f287137a
            r3.mo137202b()
            int r3 = fh2.C97881f.f287139c
            r2.f287151a = r3
            int r3 = fh2.C97881f.f287140d
            r2.f287152b = r3
            r3 = 15
            r2.f287155e = r3
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_story_imagevideo_bitrate_multiple
            r7 = 1073741824(0x40000000, float:2.0)
            float r3 = r3.mo58785xe(r4, r7)
            r4 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x006c
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x006c:
            int r4 = r1.f267173n
            r2.f287154d = r4
            int r4 = r1.f267174o
            r2.f287157g = r4
            int r4 = r1.f267175p
            r2.f287158h = r4
            int r1 = r1.f267169g
            float r1 = (float) r1
            float r1 = r1 * r3
            int r1 = (int) r1
            r2.f287153c = r1
            r2.f287156f = r5
            r2.f287159i = r6
            r2.f287160j = r6
            return r2
        L_0x0087:
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r1.f272926n
            if (r4 != 0) goto L_0x0095
            xb0.h r4 = xb0.C102609h.Fx0()
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r4.Gx0()
            r1.f272926n = r4
        L_0x0095:
            com.tencent.mm.modelcontrol.VideoTransPara r4 = r1.f272926n
            if (r4 == 0) goto L_0x009f
            int r7 = r4.f267180u
            if (r7 != r6) goto L_0x009f
            r7 = 1
            goto L_0x00a0
        L_0x009f:
            r7 = 0
        L_0x00a0:
            r8 = 2
            if (r7 != 0) goto L_0x00ac
            if (r4 == 0) goto L_0x00aa
            int r7 = r4.f267180u
            if (r7 != r8) goto L_0x00aa
            r5 = 1
        L_0x00aa:
            if (r5 == 0) goto L_0x00df
        L_0x00ac:
            r5 = 0
            if (r4 != 0) goto L_0x00b0
            goto L_0x00c0
        L_0x00b0:
            if (r4 == 0) goto L_0x00b9
            int r7 = r4.f267159F
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x00ba
        L_0x00b9:
            r7 = r5
        L_0x00ba:
            int r7 = r7.intValue()
            r4.f267169g = r7
        L_0x00c0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "match aba switch, target videoBitrate:"
            r4.append(r7)
            com.tencent.mm.modelcontrol.VideoTransPara r7 = r1.f272926n
            if (r7 == 0) goto L_0x00d5
            int r5 = r7.f267169g
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x00d5:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
        L_0x00df:
            java.util.ArrayList<bi2.a> r4 = r0.f287143c
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x01e1
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r4 = r0.f287142b
            if (r4 != 0) goto L_0x01e1
            boolean r4 = r0.f287141a
            if (r4 == 0) goto L_0x00f1
            goto L_0x01e1
        L_0x00f1:
            int r4 = r0.f287146f
            int r4 = r4 + -80
            if (r4 >= 0) goto L_0x0199
            int r4 = r0.f287147g
            int r4 = r4 + 80
            int r5 = r2.f288184e
            if (r4 > r5) goto L_0x0101
            goto L_0x0199
        L_0x0101:
            java.lang.String r4 = r2.f288180a
            boolean r4 = hd0.C98403m0.m127702b(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "generateTargetConfig, isH265File:"
            r5.append(r7)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            if (r4 == 0) goto L_0x0147
            java.lang.String r4 = "force remux h265 file"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            fh2.i$a r3 = new fh2.i$a
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 8191(0x1fff, float:1.1478E-41)
            r22 = 0
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.f287159i = r6
            java.lang.String r2 = r2.f288180a
            fh2.i$a r1 = r0.mo137204b(r2, r1, r3)
            return r1
        L_0x0147:
            int r3 = r1.f272919d
            if (r3 != r8) goto L_0x016d
            java.util.ArrayList<bi2.a> r3 = r0.f287143c
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x016d
            fh2.i$a r1 = new fh2.i$a
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 8191(0x1fff, float:1.1478E-41)
            r19 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        L_0x016d:
            java.lang.String r2 = r2.f288180a
            fh2.i$a r15 = new fh2.i$a
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 8191(0x1fff, float:1.1478E-41)
            r19 = 0
            r3 = r15
            r23 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3 = r23
            fh2.i$a r1 = r0.mo137204b(r2, r1, r3)
            return r1
        L_0x0199:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "remux by time reMuxEndTimeMs:"
            r4.append(r5)
            int r5 = r0.f287147g
            r4.append(r5)
            java.lang.String r5 = "  reMuxStartTimeMs:"
            r4.append(r5)
            int r5 = r0.f287146f
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            fh2.i$a r3 = new fh2.i$a
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 8191(0x1fff, float:1.1478E-41)
            r22 = 0
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.f287159i = r6
            r3.f287160j = r6
            java.lang.String r2 = r2.f288180a
            fh2.i$a r1 = r0.mo137204b(r2, r1, r3)
            return r1
        L_0x01e1:
            fh2.i$a r4 = new fh2.i$a
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 8191(0x1fff, float:1.1478E-41)
            r22 = 0
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r4.f287159i = r6
            r4.f287160j = r6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "remux by add editItems "
            r5.append(r6)
            java.util.ArrayList<bi2.a> r6 = r0.f287143c
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            java.lang.String r2 = r2.f288180a
            fh2.i$a r1 = r0.mo137204b(r2, r1, r4)
            return r1
        L_0x021f:
            java.lang.String r1 = "configProvider  is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            fh2.i$a r1 = new fh2.i$a
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 8191(0x1fff, float:1.1478E-41)
            r19 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fh2.C97882i.mo137203a(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, h90.b):fh2.i$a");
    }

    /* renamed from: b */
    public final C97883a mo137204b(String str, RecordConfigProvider recordConfigProvider, C97883a aVar) {
        int i;
        RecordConfigProvider recordConfigProvider2 = recordConfigProvider;
        C97883a aVar2 = aVar;
        if (Util.isNullOrNil(str)) {
            return aVar2;
        }
        C98464o oVar = C98464o.f288797a;
        C87412m.m108591d(str);
        C98464o.C98465a a = oVar.mo137832a(str);
        if (a != null) {
            VideoTransPara videoTransPara = recordConfigProvider2.f272926n;
            aVar2.f287154d = videoTransPara.f267173n;
            aVar2.f287157g = videoTransPara.f267174o;
            aVar2.f287153c = a.f288802e;
            aVar2.f287156f = a.f288801d;
            aVar2.f287158h = videoTransPara.f267175p;
            Log.m105918d("MicroMsg.RemuxMediaEditConfig", "video info : " + a);
            int i2 = a.f288802e - 200000;
            int i3 = recordConfigProvider2.f272926n.f267169g;
            if (i2 > i3) {
                aVar2.f287153c = i3;
                aVar2.f287159i = true;
                Log.m105924i("MicroMsg.RemuxMediaEditConfig", "remux by high videoBitrate " + a.f288802e + "  " + recordConfigProvider2.f272926n.f267169g);
            }
            VideoTransPara videoTransPara2 = recordConfigProvider2.f272926n;
            int i4 = videoTransPara2.f267166d;
            int i5 = videoTransPara2.f267167e;
            Point h = C85875k4.m106184h(MMApplicationContext.getContext());
            Log.m105924i("MicroMsg.RemuxMediaEditConfig", "screenSize:" + h);
            boolean z = h.x >= h.y ? a.f288799b > a.f288798a : a.f288798a > a.f288799b;
            if (z) {
                int i6 = i4;
                i4 = i5;
                i5 = i6;
            }
            int i7 = recordConfigProvider2.f272929q;
            if (i7 == 1) {
                Point h2 = C85875k4.m106184h(MMApplicationContext.getContext());
                int i8 = h2.y;
                int i9 = h2.x;
                VideoTransPara videoTransPara3 = recordConfigProvider2.f272926n;
                videoTransPara3.f267167e = (videoTransPara3.f267166d * i8) / i9;
                int i15 = a.f288798a;
                int i16 = a.f288799b;
                if (i15 - 32 > i4 || i16 - 32 > i5) {
                    aVar2.f287151a = i4;
                    aVar2.f287152b = i5;
                    aVar2.f287159i = true;
                    Log.m105924i("MicroMsg.RemuxMediaEditConfig", "remux by:FIT_SCREEN by high size " + a.f288798a + "  " + aVar2.f287151a);
                } else {
                    aVar2.f287152b = i16;
                    aVar2.f287151a = i15;
                }
            } else if (i7 == 2) {
                int i17 = a.f288798a;
                int i18 = a.f288799b;
                if (!(i17 == i4 && i18 == i5)) {
                    aVar2.f287159i = true;
                    Log.m105924i("MicroMsg.RemuxMediaEditConfig", "remux by:FORCE_WIDTH_AND_HEIGHT by high size ");
                }
                aVar2.f287151a = i4;
                aVar2.f287152b = i5;
            } else if (i7 == 4) {
                int i19 = a.f288798a;
                int i25 = a.f288799b;
                aVar2.f287152b = i25;
                aVar2.f287151a = i19;
                if (z) {
                    if (i25 - 32 > i5) {
                        aVar2.f287152b = i5;
                        aVar2.f287151a = (i5 * i19) / i25;
                        aVar2.f287159i = true;
                        Log.m105924i("MicroMsg.RemuxMediaEditConfig", "remux by:SCALE_SIZE by high size ");
                    }
                } else if (i19 - 32 > i4) {
                    aVar2.f287151a = i4;
                    aVar2.f287152b = (i4 * i25) / i19;
                    aVar2.f287159i = true;
                    Log.m105924i("MicroMsg.RemuxMediaEditConfig", "remux by:SCALE_SIZE by high size ");
                }
            } else if (i7 == 3) {
                aVar2.f287151a = a.f288798a;
                aVar2.f287152b = a.f288799b;
            }
            if (recordConfigProvider2.f272911L) {
                if ((i = a.f288801d) == 90 || i == 270 ? a.f288799b > a.f288798a : a.f288798a > a.f288799b) {
                    VideoTransPara videoTransPara4 = recordConfigProvider2.f272926n;
                    aVar2.f287151a = Math.min(videoTransPara4.f267166d, videoTransPara4.f267167e);
                    VideoTransPara videoTransPara5 = recordConfigProvider2.f272926n;
                    aVar2.f287152b = Math.max(videoTransPara5.f267166d, videoTransPara5.f267167e);
                }
            }
            Log.m105924i("MicroMsg.RemuxMediaEditConfig", "setSize: encodeConfig targetWidth:" + aVar2.f287151a + ", targetHeight:" + aVar2.f287152b);
            int i26 = a.f288803f;
            int i27 = recordConfigProvider2.f272926n.f267168f;
            if (((float) i26) > ((float) i27) * 1.5f && i27 >= 0) {
                i26 = i27;
            }
            aVar2.f287155e = i26;
        }
        VideoTransPara videoTransPara6 = recordConfigProvider2.f272926n;
        int i28 = videoTransPara6.f267169g;
        aVar2.f287153c = i28;
        if (videoTransPara6 != null && videoTransPara6.f267181v == 2) {
            aVar2.f287161k = videoTransPara6.f267157D;
            aVar2.f287162l = videoTransPara6.f267158E;
            aVar2.f287163m = videoTransPara6.f267181v;
            Log.m105925i("MicroMsg.RemuxMediaEditConfig", "ABA: Min/Max QP Methods:videoBitrate [%d]  minQP [%d]  maxQP [%d]", Integer.valueOf(i28), Integer.valueOf(aVar2.f287161k), Integer.valueOf(aVar2.f287162l));
        }
        int i29 = aVar2.f287151a;
        if (i29 % 16 != 0) {
            aVar2.f287151a = C97842b.m126284a(i29);
        }
        int i35 = aVar2.f287152b;
        if (i35 % 16 != 0) {
            aVar2.f287152b = C97842b.m126284a(i35);
        }
        return aVar2;
    }

    public String toString() {
        return "RemuxMediaEditConfig(muteOrigin=" + this.f287141a + ", audioCacheInfo=" + this.f287142b + ", editItems=" + this.f287143c + ", drawingRect=" + Arrays.toString(this.f287145e) + ", reMuxStartTimeMs=" + this.f287146f + ", reMuxEndTimeMs=" + this.f287147g + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C97882i(boolean r15, com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo r16, java.util.ArrayList r17, java.util.ArrayList r18, float[] r19, int r20, int r21, java.util.ArrayList r22, java.lang.String r23, float[] r24, int r25, gy3.C8480h r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = 0
            goto L_0x000a
        L_0x0009:
            r4 = r15
        L_0x000a:
            r1 = r0 & 2
            r3 = 0
            if (r1 == 0) goto L_0x0011
            r5 = r3
            goto L_0x0013
        L_0x0011:
            r5 = r16
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6 = r1
            goto L_0x0020
        L_0x001e:
            r6 = r17
        L_0x0020:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x002b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7 = r1
            goto L_0x002d
        L_0x002b:
            r7 = r18
        L_0x002d:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0039
            r1 = 4
            float[] r1 = new float[r1]
            r1 = {0, 0, 0, 0} // fill-array
            r8 = r1
            goto L_0x003b
        L_0x0039:
            r8 = r19
        L_0x003b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0041
            r9 = 0
            goto L_0x0043
        L_0x0041:
            r9 = r20
        L_0x0043:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0049
            r10 = 0
            goto L_0x004b
        L_0x0049:
            r10 = r21
        L_0x004b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0056
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r11 = r1
            goto L_0x0058
        L_0x0056:
            r11 = r22
        L_0x0058:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x005e
            r12 = r3
            goto L_0x0060
        L_0x005e:
            r12 = r23
        L_0x0060:
            r3 = r14
            r13 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fh2.C97882i.<init>(boolean, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo, java.util.ArrayList, java.util.ArrayList, float[], int, int, java.util.ArrayList, java.lang.String, float[], int, gy3.h):void");
    }
}
