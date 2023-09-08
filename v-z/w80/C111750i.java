package w80;

import com.tencent.p014mm.plugin.sight.base.C106139e;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import org.json.JSONObject;
import sx3.C110818d0;
import z04.C112551y;

/* renamed from: w80.i */
public final class C111750i {

    /* renamed from: a */
    public static final C111750i f334661a = new C111750i();

    /* renamed from: w80.i$a */
    public static final class C102362a {

        /* renamed from: a */
        public final int f301461a;

        /* renamed from: b */
        public final int f301462b;

        /* renamed from: c */
        public final int f301463c;

        public C102362a(int i, int i2, int i3) {
            this.f301461a = i;
            this.f301462b = i2;
            this.f301463c = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C102362a)) {
                return false;
            }
            C102362a aVar = (C102362a) obj;
            return this.f301461a == aVar.f301461a && this.f301462b == aVar.f301462b && this.f301463c == aVar.f301463c;
        }

        public int hashCode() {
            return (((this.f301461a * 31) + this.f301462b) * 31) + this.f301463c;
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("colorRange", this.f301461a);
            jSONObject.put("colorStandard", this.f301462b);
            jSONObject.put("colorTransfer", this.f301463c);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "jsonObj.toString()");
            return C112551y.m153814n(jSONObject2, ",", ";", false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090 A[Catch:{ Exception -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092 A[Catch:{ Exception -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0176 A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0155 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final w80.C111750i.C102362a mo163488a(java.lang.String r26) {
        /*
            r25 = this;
            r0 = r26
            java.lang.String r1 = ", colorTransfer:"
            java.lang.String r2 = ", colorStandard:"
            java.lang.String r3 = "color-transfer"
            java.lang.String r4 = "color-standard"
            java.lang.String r5 = "color-range"
            java.lang.Class<h81.h> r6 = h81.C32735h.class
            java.lang.String r7 = "src"
            gy3.C87412m.m108594g(r0, r7)
            di3.d r7 = di3.C86312j.m106911c(r6)
            h81.h r7 = (h81.C32735h) r7
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_video_remux_with_colorspace
            r9 = 1
            int r7 = r7.mo58779Qe(r8, r9)
            r8 = 0
            if (r7 != r9) goto L_0x0025
            r7 = 1
            goto L_0x0026
        L_0x0025:
            r7 = 0
        L_0x0026:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "exportColorSpace:"
            r10.append(r11)
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "MicroMsg.VideoColorSpaceDetector"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            int r10 = android.os.Build.VERSION.SDK_INT
            r12 = 24
            if (r10 < r12) goto L_0x020c
            if (r7 == 0) goto L_0x020c
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r26)     // Catch:{ Exception -> 0x0196 }
            if (r7 != 0) goto L_0x0066
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0196 }
            r6.<init>()     // Catch:{ Exception -> 0x0196 }
            java.lang.String r7 = "src empty :"
            r6.append(r7)     // Catch:{ Exception -> 0x0196 }
            r6.append(r0)     // Catch:{ Exception -> 0x0196 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0196 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ Exception -> 0x0196 }
        L_0x0062:
            r23 = r14
            goto L_0x01b1
        L_0x0066:
            o80.a r7 = new o80.a     // Catch:{ Exception -> 0x0196 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0196 }
            r7.mo161330h()     // Catch:{ Exception -> 0x0196 }
            android.media.MediaFormat r0 = r7.f329158e     // Catch:{ Exception -> 0x0196 }
            if (r0 == 0) goto L_0x00cc
            int r10 = w80.C111749g.m152381a(r0, r5, r8)     // Catch:{ Exception -> 0x007f }
            int r12 = w80.C111749g.m152381a(r0, r4, r8)     // Catch:{ Exception -> 0x0080 }
            int r0 = w80.C111749g.m152381a(r0, r3, r8)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0082
        L_0x007f:
            r10 = 0
        L_0x0080:
            r12 = 0
        L_0x0081:
            r0 = 0
        L_0x0082:
            di3.d r6 = di3.C86312j.m106911c(r6)     // Catch:{ Exception -> 0x0196 }
            h81.h r6 = (h81.C32735h) r6     // Catch:{ Exception -> 0x0196 }
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_video_remux_with_colorspace_decode     // Catch:{ Exception -> 0x0196 }
            int r6 = r6.mo58779Qe(r8, r9)     // Catch:{ Exception -> 0x0196 }
            if (r6 != r9) goto L_0x0092
            r6 = 1
            goto L_0x0093
        L_0x0092:
            r6 = 0
        L_0x0093:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0196 }
            r8.<init>()     // Catch:{ Exception -> 0x0196 }
            java.lang.String r13 = "detect colorSpace, colorRange:"
            r8.append(r13)     // Catch:{ Exception -> 0x0196 }
            r8.append(r10)     // Catch:{ Exception -> 0x0196 }
            r8.append(r2)     // Catch:{ Exception -> 0x0196 }
            r8.append(r12)     // Catch:{ Exception -> 0x0196 }
            r8.append(r1)     // Catch:{ Exception -> 0x0196 }
            r8.append(r0)     // Catch:{ Exception -> 0x0196 }
            java.lang.String r13 = ", doDecode:"
            r8.append(r13)     // Catch:{ Exception -> 0x0196 }
            r8.append(r6)     // Catch:{ Exception -> 0x0196 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0196 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r8)     // Catch:{ Exception -> 0x0196 }
            if (r6 != 0) goto L_0x00cc
            if (r10 != 0) goto L_0x00cc
            if (r12 != 0) goto L_0x00cc
            if (r0 != 0) goto L_0x00cc
            java.lang.String r0 = "colorSpace all zero, fast skip!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)     // Catch:{ Exception -> 0x0196 }
            r7.mo161327e()     // Catch:{ Exception -> 0x0196 }
            goto L_0x0062
        L_0x00cc:
            java.lang.String r0 = r7.mo161326c()     // Catch:{ Exception -> 0x0196 }
            java.lang.String r6 = "video/dolby-vision"
            boolean r6 = z04.C112551y.m153809i(r6, r0, r9)     // Catch:{ Exception -> 0x0196 }
            if (r6 == 0) goto L_0x00e0
            boolean r6 = s62.C101554f.m133321f()     // Catch:{ Exception -> 0x0196 }
            if (r6 != 0) goto L_0x00e0
            java.lang.String r0 = "video/hevc"
        L_0x00e0:
            com.tencent.mm.compatible.deviceinfo.a r0 = com.tencent.p014mm.compatible.deviceinfo.C104619a.m140211c(r0)     // Catch:{ Exception -> 0x0196 }
            android.media.ImageReader r6 = android.media.ImageReader.newInstance(r9, r9, r9, r9)     // Catch:{ Exception -> 0x0196 }
            java.lang.String r8 = "newInstance(1, 1, PixelFormat.RGBA_8888, 1)"
            gy3.C87412m.m108593f(r6, r8)     // Catch:{ Exception -> 0x0196 }
            android.media.MediaFormat r8 = r7.f329158e     // Catch:{ Exception -> 0x0196 }
            android.view.Surface r10 = r6.getSurface()     // Catch:{ Exception -> 0x0196 }
            r12 = 0
            r13 = 0
            r0.mo148202a(r8, r10, r12, r13)     // Catch:{ Exception -> 0x0196 }
            r0.mo148222y()     // Catch:{ Exception -> 0x0196 }
            android.media.MediaCodec$BufferInfo r8 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x0196 }
            r8.<init>()     // Catch:{ Exception -> 0x0196 }
            r10 = 0
            r13 = 0
        L_0x0102:
            r12 = 30
            if (r13 > r12) goto L_0x0184
            if (r10 != 0) goto L_0x0146
            r26 = r10
            r9 = 10000(0x2710, double:4.9407E-320)
            int r9 = r0.mo148204f(r9)     // Catch:{ Exception -> 0x0196 }
            if (r9 < 0) goto L_0x0148
            java.nio.ByteBuffer r10 = r0.mo148207i(r9)     // Catch:{ Exception -> 0x0196 }
            java.lang.String r12 = "buffer"
            gy3.C87412m.m108593f(r10, r12)     // Catch:{ Exception -> 0x0196 }
            r12 = 2
            r23 = r14
            r14 = 0
            r15 = 0
            boolean r10 = o80.C109993a.m149513d(r7, r10, r15, r12, r14)     // Catch:{ Exception -> 0x0194 }
            if (r10 == 0) goto L_0x0186
            long r20 = r7.mo161325b()     // Catch:{ Exception -> 0x0194 }
            int r10 = r7.f329162i     // Catch:{ Exception -> 0x0194 }
            if (r10 >= 0) goto L_0x0130
            r12 = 1
            goto L_0x0131
        L_0x0130:
            r12 = 0
        L_0x0131:
            r18 = 0
            if (r12 == 0) goto L_0x0139
            r14 = 4
            r22 = 4
            goto L_0x013b
        L_0x0139:
            r22 = 0
        L_0x013b:
            r16 = r0
            r17 = r9
            r19 = r10
            r16.mo148213o(r17, r18, r19, r20, r22)     // Catch:{ Exception -> 0x0194 }
            r10 = r12
            goto L_0x014c
        L_0x0146:
            r26 = r10
        L_0x0148:
            r23 = r14
            r10 = r26
        L_0x014c:
            r14 = 100
            int r9 = r0.mo148205g(r8, r14)     // Catch:{ Exception -> 0x0194 }
            r12 = -2
            if (r9 != r12) goto L_0x0176
            android.media.MediaFormat r12 = r0.mo148212n()     // Catch:{ Exception -> 0x0194 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0194 }
            r8.<init>()     // Catch:{ Exception -> 0x0194 }
            java.lang.String r9 = "extract real videoFormat:"
            r8.append(r9)     // Catch:{ Exception -> 0x0194 }
            r8.append(r12)     // Catch:{ Exception -> 0x0194 }
            java.lang.String r9 = ", frameCount:"
            r8.append(r9)     // Catch:{ Exception -> 0x0194 }
            r8.append(r13)     // Catch:{ Exception -> 0x0194 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0194 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r8)     // Catch:{ Exception -> 0x0194 }
            goto L_0x0187
        L_0x0176:
            if (r9 < 0) goto L_0x017d
            r12 = 0
            r0.mo148216r(r9, r12)     // Catch:{ Exception -> 0x0194 }
            goto L_0x0186
        L_0x017d:
            int r13 = r13 + 1
            r14 = r23
            r9 = 1
            goto L_0x0102
        L_0x0184:
            r23 = r14
        L_0x0186:
            r12 = 0
        L_0x0187:
            r7.mo161327e()     // Catch:{ Exception -> 0x0194 }
            r0.mo148223z()     // Catch:{ Exception -> 0x0194 }
            r0.mo148214p()     // Catch:{ Exception -> 0x0194 }
            r6.close()     // Catch:{ Exception -> 0x0194 }
            goto L_0x01b2
        L_0x0194:
            r0 = move-exception
            goto L_0x0199
        L_0x0196:
            r0 = move-exception
            r23 = r14
        L_0x0199:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "extract MediaFormat error:"
            r6.append(r7)
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
        L_0x01b1:
            r12 = 0
        L_0x01b2:
            if (r12 == 0) goto L_0x020c
            r6 = 0
            int r0 = w80.C111749g.m152381a(r12, r5, r6)     // Catch:{ Exception -> 0x01f3 }
            int r4 = w80.C111749g.m152381a(r12, r4, r6)     // Catch:{ Exception -> 0x01f3 }
            int r3 = w80.C111749g.m152381a(r12, r3, r6)     // Catch:{ Exception -> 0x01f3 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f3 }
            r5.<init>()     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r6 = "find colorSpace! colorRange:"
            r5.append(r6)     // Catch:{ Exception -> 0x01f3 }
            r5.append(r0)     // Catch:{ Exception -> 0x01f3 }
            r5.append(r2)     // Catch:{ Exception -> 0x01f3 }
            r5.append(r4)     // Catch:{ Exception -> 0x01f3 }
            r5.append(r1)     // Catch:{ Exception -> 0x01f3 }
            r5.append(r3)     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r1 = ", cost:"
            r5.append(r1)     // Catch:{ Exception -> 0x01f3 }
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r23)     // Catch:{ Exception -> 0x01f3 }
            r5.append(r1)     // Catch:{ Exception -> 0x01f3 }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x01f3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)     // Catch:{ Exception -> 0x01f3 }
            w80.i$a r1 = new w80.i$a     // Catch:{ Exception -> 0x01f3 }
            r1.<init>(r0, r4, r3)     // Catch:{ Exception -> 0x01f3 }
            return r1
        L_0x01f3:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "extract color space info fail:"
            r1.append(r2)
            java.lang.String r0 = r0.getLocalizedMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
        L_0x020c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w80.C111750i.mo163488a(java.lang.String):w80.i$a");
    }

    /* renamed from: b */
    public final void mo163489b(C106139e eVar, C102362a aVar) {
        C87412m.m108594g(eVar, "sightEncode");
        C87412m.m108594g(aVar, "colorSpace");
        if (eVar.f316167a >= 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList.add("color-range");
            arrayList2.add(Integer.valueOf(aVar.f301461a));
            arrayList.add("color-standard");
            arrayList2.add(Integer.valueOf(aVar.f301462b));
            arrayList.add("color-transfer");
            arrayList2.add(Integer.valueOf(aVar.f301463c));
            Log.m105924i("MicroMsg.VideoColorSpaceDetector", "mediaFormatKeys:" + arrayList + ", mediaFormatValues:" + arrayList2);
            int i = aVar.f301461a;
            int i2 = aVar.f301462b;
            int i3 = aVar.f301463c;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            arrayList3.add("color-range");
            arrayList4.add(Integer.valueOf(i));
            arrayList3.add("color-standard");
            arrayList4.add(Integer.valueOf(i2));
            arrayList3.add("color-transfer");
            arrayList4.add(Integer.valueOf(i3));
            int i4 = eVar.f316167a;
            Object[] array = arrayList3.toArray(new String[0]);
            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            SightVideoJNI.setVideoFormatHeader(i4, (String[]) array, C110818d0.m150952x0(arrayList4));
        }
    }
}
