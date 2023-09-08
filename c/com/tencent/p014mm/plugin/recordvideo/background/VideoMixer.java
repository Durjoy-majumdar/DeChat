package com.tencent.p014mm.plugin.recordvideo.background;

import ah2.C92000a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.Parcelable;
import ch2.C92420d;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import ei2.C58605a;
import ei2.C97652g;
import f72.C97842b;
import fh2.C97880c;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.io.IOException;
import jh2.C60863m;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;
import zg2.C16194r;

/* renamed from: com.tencent.mm.plugin.recordvideo.background.VideoMixer */
public final class VideoMixer implements C92420d {

    /* renamed from: a */
    public final C92000a f272850a;

    /* renamed from: b */
    public C32229r<? super String, ? super String, ? super Boolean, ? super Integer, C13598b0> f272851b;

    /* renamed from: c */
    public long f272852c = -1;

    /* renamed from: d */
    public C58605a f272853d;

    /* renamed from: e */
    public C97652g f272854e;

    /* renamed from: f */
    public C97880c f272855f;

    /* renamed from: g */
    public int f272856g;

    /* renamed from: h */
    public int f272857h;

    /* renamed from: i */
    public int f272858i;

    /* renamed from: j */
    public int f272859j;

    /* renamed from: k */
    public int f272860k;

    /* renamed from: l */
    public int f272861l;

    /* renamed from: m */
    public int f272862m;

    /* renamed from: n */
    public int f272863n;

    /* renamed from: o */
    public int f272864o;

    /* renamed from: p */
    public int f272865p;

    /* renamed from: q */
    public AdaptiveAdjustBitrate f272866q;

    /* renamed from: r */
    public ABAPrams f272867r;

    /* renamed from: s */
    public int f272868s;

    /* renamed from: t */
    public boolean f272869t;

    /* renamed from: u */
    public final int f272870u;

    /* renamed from: v */
    public final int f272871v;

    /* renamed from: w */
    public final int f272872w;

    /* renamed from: x */
    public final C32226l<Long, Bitmap> f272873x;

    /* renamed from: y */
    public final C32226l<Long, Bitmap> f272874y;

    /* renamed from: z */
    public HandlerThread f272875z;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/background/VideoMixer$MixConfig;", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "a", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.recordvideo.background.VideoMixer$MixConfig */
    public static final class MixConfig implements Parcelable {
        public static final C94395a CREATOR = new C94395a((C8480h) null);

        /* renamed from: d */
        public int f272876d;

        /* renamed from: e */
        public int f272877e;

        /* renamed from: f */
        public int f272878f;

        /* renamed from: g */
        public int f272879g;

        /* renamed from: h */
        public int f272880h;

        /* renamed from: i */
        public int f272881i;

        /* renamed from: j */
        public int f272882j;

        /* renamed from: n */
        public int f272883n;

        /* renamed from: com.tencent.mm.plugin.recordvideo.background.VideoMixer$MixConfig$a */
        public static final class C94395a implements Parcelable.Creator<MixConfig> {
            public C94395a(C8480h hVar) {
            }

            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                MixConfig mixConfig = new MixConfig();
                mixConfig.f272876d = parcel.readInt();
                mixConfig.f272877e = parcel.readInt();
                mixConfig.f272878f = parcel.readInt();
                mixConfig.f272879g = parcel.readInt();
                mixConfig.f272880h = parcel.readInt();
                mixConfig.f272881i = parcel.readInt();
                mixConfig.f272882j = parcel.readInt();
                mixConfig.f272883n = parcel.readInt();
                return mixConfig;
            }

            public Object[] newArray(int i) {
                return new MixConfig[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "[MixConfig]videoWidth=" + this.f272876d + ", videoHeight=" + this.f272877e + ", videoBitrate=" + this.f272878f + ", audioBitrate=" + this.f272879g + ", audioSampleRate=" + this.f272880h + ", audioChannelCount=" + this.f272881i + ", videoFrameRate=" + this.f272882j + ", videoRotate=" + this.f272883n;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "parcel");
            parcel.writeInt(this.f272876d);
            parcel.writeInt(this.f272877e);
            parcel.writeInt(this.f272878f);
            parcel.writeInt(this.f272879g);
            parcel.writeInt(this.f272880h);
            parcel.writeInt(this.f272881i);
            parcel.writeInt(this.f272882j);
            parcel.writeInt(this.f272883n);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.background.VideoMixer$a */
    public static final class C94396a extends C87413o implements C32226l<Long, Bitmap> {

        /* renamed from: d */
        public final /* synthetic */ VideoMixer f272884d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94396a(VideoMixer videoMixer) {
            super(1);
            this.f272884d = videoMixer;
        }

        public Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            Log.m105924i("MicroMsg.Media.VideoMixer", "get bitmap " + longValue);
            while (true) {
                VideoMixer videoMixer = this.f272884d;
                if (longValue / ((long) 1000) <= videoMixer.f272852c) {
                    break;
                }
                C97652g gVar = videoMixer.f272854e;
                if (gVar != null) {
                    C58605a a = gVar.mo126334a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("get frame ");
                    sb.append(a != null ? Long.valueOf(a.f167793b) : null);
                    sb.append(" blendBitmapProvider: ");
                    sb.append(longValue);
                    Log.m105924i("MicroMsg.Media.VideoMixer", sb.toString());
                    if (a == null) {
                        break;
                    }
                    long j = a.f167793b;
                    if (j <= 0) {
                        break;
                    }
                    VideoMixer videoMixer2 = this.f272884d;
                    videoMixer2.f272852c += j;
                    videoMixer2.f272853d = a;
                } else {
                    C87412m.m108603p("frameRetriever");
                    throw null;
                }
            }
            C58605a aVar = this.f272884d.f272853d;
            if (aVar != null) {
                return aVar.f167792a;
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.background.VideoMixer$b */
    public static final class C94397b extends C87413o implements C32226l<Long, Bitmap> {

        /* renamed from: d */
        public final /* synthetic */ VideoMixer f272885d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94397b(VideoMixer videoMixer) {
            super(1);
            this.f272885d = videoMixer;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
            r5 = r5.f286454h;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Number r5 = (java.lang.Number) r5
                r5.longValue()
                com.tencent.mm.plugin.recordvideo.background.VideoMixer r5 = r4.f272885d
                ei2.g r5 = r5.f272854e
                r0 = 0
                if (r5 == 0) goto L_0x0025
                boolean r1 = r5.mo136909b()
                if (r1 == 0) goto L_0x001f
                android.graphics.Bitmap r5 = r5.f286454h
                if (r5 != 0) goto L_0x0017
                goto L_0x001f
            L_0x0017:
                ei2.a r1 = new ei2.a
                r2 = 0
                r1.<init>(r5, r2)
                goto L_0x0020
            L_0x001f:
                r1 = r0
            L_0x0020:
                if (r1 == 0) goto L_0x0024
                android.graphics.Bitmap r0 = r1.f167792a
            L_0x0024:
                return r0
            L_0x0025:
                java.lang.String r5 = "frameRetriever"
                gy3.C87412m.m108603p(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.background.VideoMixer.C94397b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.background.VideoMixer$c */
    public static final class C94398c extends C87413o implements C32229r<String, String, Boolean, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32229r<String, String, Boolean, Integer, C13598b0> f272886d;

        /* renamed from: e */
        public final /* synthetic */ VideoMixer f272887e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94398c(C32229r<? super String, ? super String, ? super Boolean, ? super Integer, C13598b0> rVar, VideoMixer videoMixer) {
            super(4);
            this.f272886d = rVar;
            this.f272887e = videoMixer;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            String str2 = (String) obj2;
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            int intValue = ((Number) obj4).intValue();
            C87412m.m108594g(str, "mixVideo");
            C87412m.m108594g(str2, "mixThumb");
            C32229r<String, String, Boolean, Integer, C13598b0> rVar = this.f272886d;
            if (rVar != null) {
                rVar.mo162I(str, str2, Boolean.valueOf(booleanValue), Integer.valueOf(intValue));
            }
            HandlerThread handlerThread = this.f272887e.f272875z;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            Log.m105924i("MicroMsg.Media.VideoMixer", "[onFinish] quit mixThread=" + this.f272887e.f272875z);
            this.f272887e.f272851b = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.background.VideoMixer$d */
    public static final class C94399d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ VideoMixer f272888d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94399d(VideoMixer videoMixer) {
            super(0);
            this.f272888d = videoMixer;
        }

        public Object invoke() {
            VideoMixer videoMixer = this.f272888d;
            videoMixer.f272875z = C61926c.m72685j("VideoMixer", false, new C94400a(videoMixer));
            return C13598b0.f38549a;
        }
    }

    public VideoMixer(C92000a aVar) {
        C87412m.m108594g(aVar, "videoMixData");
        this.f272850a = aVar;
        this.f272855f = aVar.f263370a;
        this.f272870u = 1;
        this.f272871v = 2;
        this.f272872w = 4;
        Log.m105924i("MicroMsg.Media.VideoMixer", "create VideoMixer, " + aVar);
        this.f272873x = new C94396a(this);
        this.f272874y = new C94397b(this);
    }

    /* renamed from: b */
    public static final String m119411b(VideoMixer videoMixer) {
        Bitmap bitmap;
        int i;
        VideoMixer videoMixer2 = videoMixer;
        Bitmap r = C97842b.m126301r(videoMixer2.f272850a.f263374e, 200000);
        boolean z = true;
        if (r != null) {
            try {
                Log.m105924i("MicroMsg.Media.VideoMixer", "createThumb getParentAbsolutePath: " + C86013q1.m106458s(videoMixer2.f272850a.f263375f) + "  thumb size:" + videoMixer2.f272850a.f263379j);
                C86013q1.m106445f(videoMixer2.f272850a.f263375f);
                int i2 = videoMixer2.f272850a.f263379j;
                if (i2 > 0) {
                    if (Math.min(r.getWidth(), r.getHeight()) > i2) {
                        if (r.getWidth() < r.getHeight()) {
                            i = (int) ((((float) (r.getHeight() * i2)) * 1.0f) / ((float) r.getWidth()));
                        } else {
                            i = i2;
                            i2 = (int) ((((float) (r.getWidth() * i2)) * 1.0f) / ((float) r.getHeight()));
                        }
                        bitmap = Bitmap.createScaledBitmap(r, i2, i, true);
                        C87412m.m108593f(bitmap, "createScaledBitmap(bitma…idth, outputHeight, true)");
                        BitmapUtil.saveBitmapToImage(bitmap, 60, Bitmap.CompressFormat.JPEG, videoMixer2.f272850a.f263375f, true);
                    }
                }
                bitmap = r;
                BitmapUtil.saveBitmapToImage(bitmap, 60, Bitmap.CompressFormat.JPEG, videoMixer2.f272850a.f263375f, true);
            } catch (IOException unused) {
                Log.m105924i("MicroMsg.StoryRemuxIDKeyStat", "markCreateThumbFailed");
                C115669n.INSTANCE.mo175913w(986, 9, 1);
            }
        } else {
            Log.m105924i("MicroMsg.StoryRemuxIDKeyStat", "markCreateThumbFailed");
            C115669n.INSTANCE.mo175913w(986, 9, 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" mixVideoPath : ");
        sb.append(videoMixer2.f272850a.f263374e);
        sb.append(" mixThumbPath:");
        sb.append(videoMixer2.f272850a.f263375f);
        sb.append("   thumb-bitmap is null:");
        if (r != null) {
            z = false;
        }
        sb.append(z);
        Log.m105924i("MicroMsg.Media.VideoMixer", sb.toString());
        if (r == null) {
            return null;
        }
        return videoMixer2.f272850a.f263375f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: bh2.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: r80.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: bh2.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: bh2.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0109 A[Catch:{ Exception -> 0x01f7 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m119412c(com.tencent.p014mm.plugin.recordvideo.background.VideoMixer r38) {
        /*
            r1 = r38
            hi2.o r0 = hi2.C98464o.f288797a
            ah2.a r2 = r1.f272850a
            fh2.c r2 = r2.f263370a
            java.lang.String r2 = r2.f287128d
            hi2.o$a r0 = r0.mo137832a(r2)
            int r2 = r1.f272856g
            int r3 = r1.f272857h
            android.graphics.Point r4 = new android.graphics.Point
            r5 = 1
            int r2 = r2 * 1
            int r3 = r3 * 1
            r4.<init>(r2, r3)
            ah2.a r2 = r1.f272850a
            fh2.c r3 = r2.f263370a
            boolean r3 = r3.f287132h
            if (r3 != 0) goto L_0x004b
            if (r0 == 0) goto L_0x004b
            boolean r3 = r0.f288804g
            if (r3 != 0) goto L_0x004b
            ei2.d r3 = new ei2.d
            float[] r7 = r2.f263372c
            float[] r8 = r2.f263373d
            java.util.List<bi2.a> r9 = r2.f263371b
            int r10 = r4.x
            int r11 = r4.y
            int r12 = r0.f288798a
            int r13 = r0.f288799b
            int r14 = r1.f272863n
            r15 = 1
            java.lang.String r0 = r2.f263380k
            r6 = r3
            r16 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            ei2.g r0 = new ei2.g
            r0.<init>(r3)
            goto L_0x006a
        L_0x004b:
            ei2.d r0 = new ei2.d
            float[] r7 = r2.f263372c
            float[] r8 = r2.f263373d
            java.util.List<bi2.a> r9 = r2.f263371b
            int r10 = r4.x
            int r11 = r4.y
            r12 = 0
            r13 = 0
            int r14 = r1.f272863n
            r15 = 1
            java.lang.String r2 = r2.f263380k
            r6 = r0
            r16 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            ei2.g r2 = new ei2.g
            r2.<init>(r0)
            r0 = r2
        L_0x006a:
            r1.f272854e = r0
            r0.mo136912e()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ah2.a r2 = r1.f272850a
            fh2.c r2 = r2.f263370a
            java.lang.String r2 = r2.f287128d
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            int r3 = r1.f272856g
            r0.append(r3)
            r0.append(r2)
            int r3 = r1.f272857h
            r0.append(r3)
            r0.append(r2)
            int r2 = r1.f272862m
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.Media.VideoMixer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            ah2.a r0 = r1.f272850a
            fh2.c r0 = r0.f263370a
            long r3 = r0.f287130f
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x00af
            r24 = r3
            goto L_0x00b1
        L_0x00af:
            r24 = r6
        L_0x00b1:
            long r3 = r0.f287131g
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x00ba
            r26 = r3
            goto L_0x00bc
        L_0x00ba:
            r26 = r6
        L_0x00bc:
            fh2.c r0 = r1.f272855f     // Catch:{ Exception -> 0x01f7 }
            java.util.ArrayList<java.lang.String> r0 = r0.f287136o     // Catch:{ Exception -> 0x01f7 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x01f7 }
            r4 = 0
            if (r0 <= 0) goto L_0x013d
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x01f7 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x01f7 }
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_story_imagevideo_soft_codec_enable     // Catch:{ Exception -> 0x01f7 }
            long r8 = r0.mo58777He(r8, r6)     // Catch:{ Exception -> 0x01f7 }
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00db
            r0 = 1
            goto L_0x00dc
        L_0x00db:
            r0 = 0
        L_0x00dc:
            if (r0 == 0) goto L_0x0100
            r0 = 28
            boolean r0 = p206nj.C11171e.m11046c(r0)     // Catch:{ Exception -> 0x01f7 }
            if (r0 == 0) goto L_0x0100
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x01f7 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x01f7 }
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_STORY_X264_FAILED_TIMES_LONG_SYNC     // Catch:{ Exception -> 0x01f7 }
            long r6 = r0.mo119673G(r8, r6)     // Catch:{ Exception -> 0x01f7 }
            r8 = 3
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00fc
            r0 = 0
            goto L_0x00fd
        L_0x00fc:
            r0 = 1
        L_0x00fd:
            if (r0 == 0) goto L_0x0100
            goto L_0x0101
        L_0x0100:
            r5 = 0
        L_0x0101:
            bh2.h r0 = new bh2.h     // Catch:{ Exception -> 0x01f7 }
            fh2.c r6 = r1.f272855f     // Catch:{ Exception -> 0x01f7 }
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r7 = r6.f287134j     // Catch:{ Exception -> 0x01f7 }
            if (r7 == 0) goto L_0x010b
            java.lang.String r4 = r7.f163817i     // Catch:{ Exception -> 0x01f7 }
        L_0x010b:
            r10 = r4
            java.util.ArrayList<java.lang.String> r11 = r6.f287136o     // Catch:{ Exception -> 0x01f7 }
            int r12 = r6.f287133i     // Catch:{ Exception -> 0x01f7 }
            ah2.a r4 = r1.f272850a     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r13 = r4.f263374e     // Catch:{ Exception -> 0x01f7 }
            int r14 = r1.f272856g     // Catch:{ Exception -> 0x01f7 }
            int r15 = r1.f272857h     // Catch:{ Exception -> 0x01f7 }
            int r4 = r1.f272858i     // Catch:{ Exception -> 0x01f7 }
            int r6 = r1.f272859j     // Catch:{ Exception -> 0x01f7 }
            int r7 = r1.f272860k     // Catch:{ Exception -> 0x01f7 }
            int r8 = r1.f272862m     // Catch:{ Exception -> 0x01f7 }
            zg2.s r9 = new zg2.s     // Catch:{ Exception -> 0x01f7 }
            r9.<init>(r5, r1)     // Catch:{ Exception -> 0x01f7 }
            r28 = r9
            r9 = r0
            r16 = r4
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r24
            r22 = r26
            r24 = r5
            r25 = r28
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r24, r25)     // Catch:{ Exception -> 0x01f7 }
            goto L_0x01d3
        L_0x013d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f7 }
            r0.<init>()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r8 = "steve: hardcoder qp:"
            r0.append(r8)     // Catch:{ Exception -> 0x01f7 }
            int r8 = r1.f272864o     // Catch:{ Exception -> 0x01f7 }
            r0.append(r8)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r8 = ", "
            r0.append(r8)     // Catch:{ Exception -> 0x01f7 }
            int r8 = r1.f272865p     // Catch:{ Exception -> 0x01f7 }
            r0.append(r8)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01f7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x01f7 }
            fy3.l<java.lang.Long, android.graphics.Bitmap> r0 = r1.f272874y     // Catch:{ Exception -> 0x01f7 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x01f7 }
            com.tencent.mm.plugin.recordvideo.background.VideoMixer$b r0 = (com.tencent.p014mm.plugin.recordvideo.background.VideoMixer.C94397b) r0     // Catch:{ Exception -> 0x01f7 }
            java.lang.Object r0 = r0.invoke(r6)     // Catch:{ Exception -> 0x01f7 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ Exception -> 0x01f7 }
            r80.r r6 = new r80.r     // Catch:{ Exception -> 0x01f7 }
            fh2.c r7 = r1.f272855f     // Catch:{ Exception -> 0x01f7 }
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r8 = r7.f287134j     // Catch:{ Exception -> 0x01f7 }
            if (r8 == 0) goto L_0x0176
            java.lang.String r4 = r8.f163817i     // Catch:{ Exception -> 0x01f7 }
        L_0x0176:
            r10 = r4
            java.lang.String r11 = r7.f287128d     // Catch:{ Exception -> 0x01f7 }
            int r12 = r7.f287133i     // Catch:{ Exception -> 0x01f7 }
            ah2.a r4 = r1.f272850a     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r13 = r4.f263374e     // Catch:{ Exception -> 0x01f7 }
            int r7 = r1.f272856g     // Catch:{ Exception -> 0x01f7 }
            int r8 = r1.f272857h     // Catch:{ Exception -> 0x01f7 }
            int r15 = r1.f272858i     // Catch:{ Exception -> 0x01f7 }
            int r9 = r1.f272859j     // Catch:{ Exception -> 0x01f7 }
            int r14 = r1.f272860k     // Catch:{ Exception -> 0x01f7 }
            int r5 = r1.f272861l     // Catch:{ Exception -> 0x01f7 }
            int r3 = r1.f272862m     // Catch:{ Exception -> 0x01f7 }
            r17 = r14
            boolean r14 = r4.f263377h     // Catch:{ Exception -> 0x01f7 }
            boolean r4 = r4.f263378i     // Catch:{ Exception -> 0x01f7 }
            r18 = r14
            int r14 = r1.f272864o     // Catch:{ Exception -> 0x01f7 }
            r19 = r14
            int r14 = r1.f272865p     // Catch:{ Exception -> 0x01f7 }
            if (r0 == 0) goto L_0x01a0
            r32 = 1
            goto L_0x01a2
        L_0x01a0:
            r32 = 0
        L_0x01a2:
            r33 = 0
            r34 = 0
            zg2.t r0 = new zg2.t     // Catch:{ Exception -> 0x01f7 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01f7 }
            r36 = 6291456(0x600000, float:8.816208E-39)
            r37 = 0
            r16 = 0
            r31 = r14
            r21 = r17
            r28 = r18
            r30 = r19
            r14 = r16
            r20 = r9
            r9 = r6
            r19 = r15
            r15 = r7
            r16 = r8
            r17 = r7
            r18 = r8
            r22 = r5
            r23 = r3
            r29 = r4
            r35 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ Exception -> 0x01f7 }
            r0 = r6
        L_0x01d3:
            fy3.l<java.lang.Long, android.graphics.Bitmap> r3 = r1.f272873x     // Catch:{ Exception -> 0x01f7 }
            r0.mo88286c(r3)     // Catch:{ Exception -> 0x01f7 }
            fy3.l<java.lang.Long, android.graphics.Bitmap> r3 = r1.f272874y     // Catch:{ Exception -> 0x01f7 }
            r0.mo88284a(r3)     // Catch:{ Exception -> 0x01f7 }
            int r0 = r0.mo88285b()     // Catch:{ Exception -> 0x01f7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f7 }
            r3.<init>()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r4 = "remuxer "
            r3.append(r4)     // Catch:{ Exception -> 0x01f7 }
            r3.append(r0)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x01f7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x01f7 }
            goto L_0x0215
        L_0x01f7:
            r0 = move-exception
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "remux error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
            fy3.r<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.Integer, rx3.b0> r0 = r1.f272851b
            if (r0 == 0) goto L_0x0215
            ah2.a r1 = r1.f272850a
            java.lang.String r1 = r1.f263374e
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = ""
            r0.mo162I(r1, r4, r2, r3)
        L_0x0215:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.background.VideoMixer.m119412c(com.tencent.mm.plugin.recordvideo.background.VideoMixer):void");
    }

    /* renamed from: d */
    public static Bitmap m119413d(VideoMixer videoMixer, Bitmap bitmap, Bitmap bitmap2, float f, float f2, int i, Object obj) {
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        if ((i & 8) != 0) {
            f2 = 0.0f;
        }
        videoMixer.getClass();
        new Canvas(bitmap2).drawBitmap(bitmap, f, f2, (Paint) null);
        return bitmap2;
    }

    /* renamed from: j */
    public static /* synthetic */ void m119414j(VideoMixer videoMixer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15, int i16, Object obj) {
        int i17 = i16;
        videoMixer.mo129788i(i, i2, i3, i4, i5, i6, i7, i8, (i17 & 256) != 0 ? 0 : i9, (i17 & 512) != 0 ? 0 : i15);
    }

    /* renamed from: a */
    public void mo126422a(C32229r<? super String, ? super String, ? super Boolean, ? super Integer, C13598b0> rVar) {
        Log.m105924i("MicroMsg.Media.VideoMixer", "Start mixer " + Util.getStack());
        this.f272851b = new C94398c(rVar, this);
        C94399d dVar = new C94399d(this);
        AudioCacheInfo audioCacheInfo = this.f272850a.f263370a.f287134j;
        if (audioCacheInfo == null || audioCacheInfo.f163818j) {
            dVar.invoke();
            return;
        }
        C60863m mVar = C60863m.f173404c;
        AudioCacheInfo audioCacheInfo2 = this.f272850a.f263370a.f287134j;
        C87412m.m108591d(audioCacheInfo2);
        mVar.mo85769c(audioCacheInfo2, new C16194r(dVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0258, code lost:
        if (r1.resolutionAdjust > 0) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        if ((r3 != null && r3.f273431g == 2) != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        if ((r3 != null && r3.f273430f == r0.f272872w) != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        r1 = new java.lang.Object[2];
        r1[0] = java.lang.Integer.valueOf(r0.f272858i);
        r2 = r0.f272866q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b8, code lost:
        if (r2 == null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ba, code lost:
        r8 = java.lang.Integer.valueOf(r2.f273442r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c0, code lost:
        r1[1] = r8;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.Media.VideoMixer", "ABA: No use ABA algorithm: final bitrate: [%d], takePhotosVideoBR: [%d]", r1);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo129784e() {
        /*
            r25 = this;
            r0 = r25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ABA: Input encoding prams :Br: [%d]  height: [%d]  width: [%d] forceResolution:"
            r1.append(r2)
            boolean r2 = r0.f272869t
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r4 = r0.f272858i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            int r4 = r0.f272857h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r3[r6] = r4
            int r4 = r0.f272856g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 2
            r3[r7] = r4
            java.lang.String r4 = "MicroMsg.Media.VideoMixer"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r3)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r3 = r0.f272866q
            r8 = 0
            if (r3 == 0) goto L_0x0046
            int r3 = r3.f273430f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0047
        L_0x0046:
            r3 = r8
        L_0x0047:
            r1[r5] = r3
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r3 = r0.f272866q
            if (r3 == 0) goto L_0x0054
            int r3 = r3.f273431g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0055
        L_0x0054:
            r3 = r8
        L_0x0055:
            r1[r6] = r3
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r3 = r0.f272866q
            if (r3 == 0) goto L_0x0062
            int r3 = r3.f273432h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0063
        L_0x0062:
            r3 = r8
        L_0x0063:
            r1[r7] = r3
            java.lang.String r3 = "Scene: [%d], ABASwitch: [%d], QPSwitch: [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r3 = r0.f272866q
            if (r3 == 0) goto L_0x0076
            int r9 = r3.f273431g
            if (r9 != r6) goto L_0x0076
            r9 = 1
            goto L_0x0077
        L_0x0076:
            r9 = 0
        L_0x0077:
            if (r9 != 0) goto L_0x0084
            if (r3 == 0) goto L_0x0081
            int r9 = r3.f273431g
            if (r9 != r7) goto L_0x0081
            r9 = 1
            goto L_0x0082
        L_0x0081:
            r9 = 0
        L_0x0082:
            if (r9 == 0) goto L_0x00ac
        L_0x0084:
            if (r3 == 0) goto L_0x008e
            int r9 = r3.f273430f
            int r10 = r0.f272871v
            if (r9 != r10) goto L_0x008e
            r9 = 1
            goto L_0x008f
        L_0x008e:
            r9 = 0
        L_0x008f:
            if (r9 != 0) goto L_0x00c9
            if (r3 == 0) goto L_0x009b
            int r9 = r3.f273430f
            int r10 = r0.f272870u
            if (r9 != r10) goto L_0x009b
            r9 = 1
            goto L_0x009c
        L_0x009b:
            r9 = 0
        L_0x009c:
            if (r9 != 0) goto L_0x00c9
            if (r3 == 0) goto L_0x00a8
            int r3 = r3.f273430f
            int r9 = r0.f272872w
            if (r3 != r9) goto L_0x00a8
            r3 = 1
            goto L_0x00a9
        L_0x00a8:
            r3 = 0
        L_0x00a9:
            if (r3 == 0) goto L_0x00ac
            goto L_0x00c9
        L_0x00ac:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r2 = r0.f272858i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r5] = r2
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r2 = r0.f272866q
            if (r2 == 0) goto L_0x00c0
            int r2 = r2.f273442r
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
        L_0x00c0:
            r1[r6] = r8
            java.lang.String r2 = "ABA: No use ABA algorithm: final bitrate: [%d], takePhotosVideoBR: [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
            goto L_0x0266
        L_0x00c9:
            ah2.a r3 = r0.f272850a
            boolean r3 = r3.f263378i
            if (r3 == 0) goto L_0x0121
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "getABAPrams enableHevc, softEncode:"
            r1.append(r3)
            ah2.a r3 = r0.f272850a
            boolean r3 = r3.f263377h
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            ah2.a r1 = r0.f272850a
            boolean r1 = r1.f263377h
            if (r1 == 0) goto L_0x0106
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f272866q
            if (r1 != 0) goto L_0x00f2
            goto L_0x00f4
        L_0x00f2:
            r1.f273437m = r6
        L_0x00f4:
            if (r1 == 0) goto L_0x00fd
            float r1 = r1.f273433i
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x00fe
        L_0x00fd:
            r1 = r8
        L_0x00fe:
            gy3.C87412m.m108591d(r1)
            float r1 = r1.floatValue()
            goto L_0x011e
        L_0x0106:
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f272866q
            if (r1 != 0) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r1.f273437m = r7
        L_0x010d:
            if (r1 == 0) goto L_0x0116
            float r1 = r1.f273434j
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x0117
        L_0x0116:
            r1 = r8
        L_0x0117:
            gy3.C87412m.m108591d(r1)
            float r1 = r1.floatValue()
        L_0x011e:
            r17 = r1
            goto L_0x0123
        L_0x0121:
            r17 = 1065353216(0x3f800000, float:1.0)
        L_0x0123:
            fh2.c r1 = r0.f272855f
            java.lang.String r9 = r1.f287128d
            int r10 = r0.f272857h
            int r11 = r0.f272856g
            int r12 = r0.f272862m
            int r13 = r0.f272858i
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f272866q
            if (r1 == 0) goto L_0x013a
            int r1 = r1.f273429e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x013b
        L_0x013a:
            r1 = r8
        L_0x013b:
            gy3.C87412m.m108591d(r1)
            int r1 = r1.intValue()
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r3 = r0.f272866q
            if (r3 == 0) goto L_0x014d
            int r3 = r3.f273428d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x014e
        L_0x014d:
            r3 = r8
        L_0x014e:
            gy3.C87412m.m108591d(r3)
            int r3 = r3.intValue()
            int r1 = r1 - r3
            int r1 = r1 / 1000
            float r14 = (float) r1
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f272866q
            if (r1 == 0) goto L_0x0164
            int r1 = r1.f273428d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0165
        L_0x0164:
            r1 = r8
        L_0x0165:
            gy3.C87412m.m108591d(r1)
            int r1 = r1.intValue()
            int r1 = r1 / 1000
            float r15 = (float) r1
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f272866q
            if (r1 == 0) goto L_0x017a
            int r1 = r1.f273430f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x017b
        L_0x017a:
            r1 = r8
        L_0x017b:
            gy3.C87412m.m108591d(r1)
            int r16 = r1.intValue()
            r18 = 0
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f272866q
            if (r1 == 0) goto L_0x018f
            int r1 = r1.f273435k
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0190
        L_0x018f:
            r1 = r8
        L_0x0190:
            gy3.C87412m.m108591d(r1)
            int r19 = r1.intValue()
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f272866q
            if (r1 == 0) goto L_0x01a2
            int r1 = r1.f273436l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x01a3
        L_0x01a2:
            r1 = r8
        L_0x01a3:
            gy3.C87412m.m108591d(r1)
            int r20 = r1.intValue()
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f272866q
            if (r1 == 0) goto L_0x01b5
            int r1 = r1.f273437m
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x01b6
        L_0x01b5:
            r1 = r8
        L_0x01b6:
            gy3.C87412m.m108591d(r1)
            int r21 = r1.intValue()
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f272866q
            if (r1 == 0) goto L_0x01c8
            int r1 = r1.f273438n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x01c9
        L_0x01c8:
            r1 = r8
        L_0x01c9:
            gy3.C87412m.m108591d(r1)
            int r22 = r1.intValue()
            com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate r1 = r0.f272866q
            if (r1 == 0) goto L_0x01da
            int r1 = r1.f273439o
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
        L_0x01da:
            gy3.C87412m.m108591d(r8)
            int r23 = r8.intValue()
            r24 = 0
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate.m119557b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0.f272867r = r1
            if (r1 == 0) goto L_0x01f4
            gy3.C87412m.m108591d(r1)
            int r1 = r1.outputKbps
            int r1 = r1 * 1000
            r0.f272858i = r1
        L_0x01f4:
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r0.f272867r
            if (r1 == 0) goto L_0x0215
            gy3.C87412m.m108591d(r1)
            int r1 = r1.resolutionAdjust
            if (r1 <= 0) goto L_0x0215
            boolean r1 = r0.f272869t
            if (r1 != 0) goto L_0x0215
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r0.f272867r
            gy3.C87412m.m108591d(r1)
            int r1 = r1.outputWidth
            r0.f272856g = r1
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r0.f272867r
            gy3.C87412m.m108591d(r1)
            int r1 = r1.outputHeight
            r0.f272857h = r1
        L_0x0215:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            int r2 = r0.f272858i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r5] = r2
            int r2 = r0.f272856g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r6] = r2
            int r2 = r0.f272857h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r7] = r2
            java.lang.String r2 = "ABA: Adaptive Bitrate Methods:videoBitrate [%d]  targetWidth [%d]  targetHeight [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
            com.tencent.mm.modelcdntran.e0 r1 = hd0.C98398h0.xx0()
            com.tencent.mm.plugin.sight.base.ABAPrams r2 = r0.f272867r
            r1.mo126991o(r2)
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r0.f272867r
            if (r1 == 0) goto L_0x0264
            gy3.C87412m.m108591d(r1)
            int r1 = r1.bitrateAdaptiveUP
            if (r1 > 0) goto L_0x025a
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r0.f272867r
            gy3.C87412m.m108591d(r1)
            int r1 = r1.bitrateAdaptiveDown
            if (r1 > 0) goto L_0x025a
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r0.f272867r
            gy3.C87412m.m108591d(r1)
            int r1 = r1.resolutionAdjust
            if (r1 <= 0) goto L_0x0264
        L_0x025a:
            com.tencent.mm.plugin.sight.base.ABAPrams r1 = r0.f272867r
            gy3.C87412m.m108591d(r1)
            int r1 = r1.bitrateAdaptiveUP
            r0.f272868s = r1
            goto L_0x0267
        L_0x0264:
            r0.f272868s = r5
        L_0x0266:
            r5 = 1
        L_0x0267:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.background.VideoMixer.mo129784e():int");
    }

    /* renamed from: f */
    public final MixConfig mo129785f() {
        MixConfig mixConfig = new MixConfig();
        mixConfig.f272876d = this.f272856g;
        mixConfig.f272877e = this.f272857h;
        mixConfig.f272878f = this.f272858i;
        mixConfig.f272879g = this.f272859j;
        mixConfig.f272880h = this.f272860k;
        mixConfig.f272881i = this.f272861l;
        mixConfig.f272882j = this.f272862m;
        mixConfig.f272883n = this.f272863n;
        return mixConfig;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        cy3.C58003b.m67160a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        throw r1;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo129786g(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "path"
            gy3.C87412m.m108594g(r4, r0)
            java.io.InputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106423E(r4)     // Catch:{ IOException -> 0x0055 }
            r0 = 0
            if (r4 == 0) goto L_0x001f
            androidx.exifinterface.media.ExifInterface r1 = new androidx.exifinterface.media.ExifInterface     // Catch:{ all -> 0x0018 }
            r1.<init>((java.io.InputStream) r4)     // Catch:{ all -> 0x0018 }
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0018 }
            cy3.C58003b.m67160a(r4, r0)     // Catch:{ IOException -> 0x0055 }
            goto L_0x0020
        L_0x0018:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001a }
        L_0x001a:
            r1 = move-exception
            cy3.C58003b.m67160a(r4, r0)     // Catch:{ IOException -> 0x0055 }
            throw r1     // Catch:{ IOException -> 0x0055 }
        L_0x001f:
            r1 = r0
        L_0x0020:
            if (r1 == 0) goto L_0x002d
            java.lang.String r4 = "Orientation"
            r0 = 1
            int r4 = r1.getAttributeInt(r4, r0)     // Catch:{ IOException -> 0x0055 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0055 }
        L_0x002d:
            r4 = 6
            if (r0 != 0) goto L_0x0031
            goto L_0x003a
        L_0x0031:
            int r1 = r0.intValue()     // Catch:{ IOException -> 0x0055 }
            if (r1 != r4) goto L_0x003a
            r4 = 90
            goto L_0x0056
        L_0x003a:
            r4 = 3
            if (r0 != 0) goto L_0x003e
            goto L_0x0047
        L_0x003e:
            int r1 = r0.intValue()     // Catch:{ IOException -> 0x0055 }
            if (r1 != r4) goto L_0x0047
            r4 = 180(0xb4, float:2.52E-43)
            goto L_0x0056
        L_0x0047:
            r4 = 8
            if (r0 != 0) goto L_0x004c
            goto L_0x0055
        L_0x004c:
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x0055 }
            if (r0 != r4) goto L_0x0055
            r4 = 270(0x10e, float:3.78E-43)
            goto L_0x0056
        L_0x0055:
            r4 = 0
        L_0x0056:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.background.VideoMixer.mo129786g(java.lang.String):int");
    }

    /* renamed from: h */
    public final void mo129787h(VideoTransPara videoTransPara, int i, int i2) {
        C87412m.m108594g(videoTransPara, "videoParam");
        if (this.f272866q == null) {
            this.f272866q = new AdaptiveAdjustBitrate();
        }
        Log.m105925i("MicroMsg.Media.VideoMixer", "Scene: [%d], ABASwitch: [%d] ceilingVideoBR:[%d]", Integer.valueOf(videoTransPara.f267160G), Integer.valueOf(videoTransPara.f267180u), Integer.valueOf(videoTransPara.f267184y));
        AdaptiveAdjustBitrate adaptiveAdjustBitrate = this.f272866q;
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273425a = this.f272857h;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273426b = this.f272856g;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273427c = this.f272858i;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273428d = i2;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273429e = i;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273430f = videoTransPara.f267160G;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273431g = videoTransPara.f267180u;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273432h = videoTransPara.f267181v;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273433i = videoTransPara.f267182w;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273434j = videoTransPara.f267183x;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273435k = videoTransPara.f267184y;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273436l = videoTransPara.f267185z;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273438n = videoTransPara.f267155B;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273437m = videoTransPara.f267154A;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273439o = videoTransPara.f267156C;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273440p = videoTransPara.f267157D;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273441q = videoTransPara.f267158E;
        }
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.f273442r = videoTransPara.f267159F;
        }
    }

    /* renamed from: i */
    public final void mo129788i(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15) {
        this.f272856g = i;
        this.f272857h = i2;
        this.f272858i = i3;
        this.f272859j = i4;
        this.f272860k = i5;
        this.f272861l = i6;
        this.f272862m = i7;
        this.f272863n = i8;
        this.f272864o = i9;
        this.f272865p = i15;
        if (this.f272866q == null) {
            this.f272866q = new AdaptiveAdjustBitrate();
        }
        AdaptiveAdjustBitrate adaptiveAdjustBitrate = this.f272866q;
        if (adaptiveAdjustBitrate != null) {
            adaptiveAdjustBitrate.mo130038c();
        }
    }
}
