package j23;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import com.tencent.p014mm.plugin.vlog.model.C106195f0;
import com.tencent.p014mm.plugin.vlog.model.C96541g0;
import com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoPluginLayout;
import fy3.C32227p;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110823p;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$setupMediaData$1", mo125469f = "MultiVideoPluginLayout.kt", mo125470l = {544}, mo125471m = "invokeSuspend")
/* renamed from: j23.h */
public final class C108538h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f324901d;

    /* renamed from: e */
    public Object f324902e;

    /* renamed from: f */
    public int f324903f;

    /* renamed from: g */
    public final /* synthetic */ MultiVideoPluginLayout f324904g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$setupMediaData$1$1$2", mo125469f = "MultiVideoPluginLayout.kt", mo125470l = {544}, mo125471m = "invokeSuspend")
    /* renamed from: j23.h$a */
    public static final class C98901a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f289922d;

        /* renamed from: e */
        public final /* synthetic */ MultiVideoPluginLayout f289923e;

        /* renamed from: f */
        public final /* synthetic */ List<String> f289924f;

        /* renamed from: g */
        public final /* synthetic */ List<Integer> f289925g;

        /* renamed from: h */
        public final /* synthetic */ Integer[] f289926h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98901a(MultiVideoPluginLayout multiVideoPluginLayout, List<String> list, List<Integer> list2, Integer[] numArr, C15601d<? super C98901a> dVar) {
            super(2, dVar);
            this.f289923e = multiVideoPluginLayout;
            this.f289924f = list;
            this.f289925g = list2;
            this.f289926h = numArr;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C98901a(this.f289923e, this.f289924f, this.f289925g, this.f289926h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C98901a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f289922d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C106195f0 f0Var = this.f289923e.f316629G;
                List<String> list = this.f289924f;
                List<Integer> list2 = this.f289925g;
                List a0 = C110823p.m151001a0(this.f289926h);
                this.f289922d = 1;
                f0Var.getClass();
                obj = C53895h.m60469g(C53872d1.f151119c, new C96541g0(f0Var, list, list2, a0, (C15601d<? super C96541g0>) null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108538h(MultiVideoPluginLayout multiVideoPluginLayout, C15601d<? super C108538h> dVar) {
        super(2, dVar);
        this.f324904g = multiVideoPluginLayout;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C108538h(this.f324904g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C108538h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: type inference failed for: r2v43, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0334 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0277  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f324903f
            r4 = 0
            r5 = 1
            r6 = 0
            java.lang.String r7 = "MicroMsg.MultiVideoPluginLayout"
            if (r2 == 0) goto L_0x0024
            if (r2 != r5) goto L_0x001c
            java.lang.Object r1 = r0.f324902e
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r2 = r0.f324901d
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r2 = (com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoPluginLayout) r2
            kotlin.ResultKt.throwOnFailure(r18)
            goto L_0x010f
        L_0x001c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0024:
            kotlin.ResultKt.throwOnFailure(r18)
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r2 = r0.f324904g
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r8 = r2.f316627E
            if (r8 == 0) goto L_0x0215
            android.os.Bundle r14 = r8.f272912M
            if (r14 == 0) goto L_0x0215
            java.lang.Class<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r8 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.class
            java.lang.ClassLoader r8 = r8.getClassLoader()
            r14.setClassLoader(r8)
            java.lang.String r8 = "post_id"
            java.lang.String r8 = r14.getString(r8)
            if (r8 == 0) goto L_0x0050
            r2.f316652X0 = r8
            th2.c r9 = r2.f316656b1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r9 = r9.f332424a
            java.lang.String r10 = "PostId"
            java.lang.String r8 = r9.mo86045b(r10, r8, r5)
            r9.f310214d = r8
        L_0x0050:
            int r8 = r2.f316665n
            java.lang.String r9 = "image_max_height"
            int r8 = r14.getInt(r9, r8)
            r2.f316665n = r8
            int r8 = r2.f316666o
            java.lang.String r9 = "image_max_width"
            int r8 = r14.getInt(r9, r8)
            r2.f316666o = r8
            int r8 = r2.f316667p
            java.lang.String r9 = "image_compress_quality"
            int r8 = r14.getInt(r9, r8)
            r2.f316667p = r8
            java.lang.String r8 = r2.f316669q
            java.lang.String r9 = "output_dir"
            java.lang.String r8 = r14.getString(r9, r8)
            java.lang.String r9 = "extra.getString(Constant…TPUT_DIR, imageOutputDir)"
            gy3.C87412m.m108593f(r8, r9)
            r2.f316669q = r8
            long r8 = r2.f316664j
            java.lang.String r10 = "video_max_duration"
            long r8 = r14.getLong(r10, r8)
            r2.f316664j = r8
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r8 = r2.f316654Z0
            java.util.ArrayList r10 = new java.util.ArrayList
            r9 = 10
            int r11 = sx3.C36907w.m41090l(r8, r9)
            r10.<init>(r11)
            java.util.Iterator r8 = r8.iterator()
        L_0x0099:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x00ab
            java.lang.Object r11 = r8.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r11 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r11
            java.lang.String r11 = r11.f162747d
            r10.add(r11)
            goto L_0x0099
        L_0x00ab:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r8 = r2.f316654Z0
            java.util.ArrayList r11 = new java.util.ArrayList
            int r9 = sx3.C36907w.m41090l(r8, r9)
            r11.<init>(r9)
            java.util.Iterator r8 = r8.iterator()
        L_0x00ba:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00d3
            java.lang.Object r9 = r8.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r9 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r9
            int r9 = r9.getType()
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r9)
            r11.add(r12)
            goto L_0x00ba
        L_0x00d3:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r8 = r2.f316654Z0
            int r8 = r8.size()
            java.lang.Integer[] r12 = new java.lang.Integer[r8]
            r9 = 0
        L_0x00dc:
            if (r9 >= r8) goto L_0x00f3
            h90.b r13 = r2.f316628F
            if (r13 == 0) goto L_0x00e8
            boolean r13 = r13.f288182c
            if (r13 != r5) goto L_0x00e8
            r13 = 1
            goto L_0x00e9
        L_0x00e8:
            r13 = 0
        L_0x00e9:
            java.lang.Integer r15 = new java.lang.Integer
            r15.<init>(r13)
            r12[r9] = r15
            int r9 = r9 + 1
            goto L_0x00dc
        L_0x00f3:
            a14.h0 r15 = a14.C53872d1.f151119c
            j23.h$a r13 = new j23.h$a
            r16 = 0
            r8 = r13
            r9 = r2
            r3 = r13
            r13 = r16
            r8.<init>(r9, r10, r11, r12, r13)
            r0.f324901d = r2
            r0.f324902e = r14
            r0.f324903f = r5
            java.lang.Object r3 = a14.C53895h.m60469g(r15, r3, r0)
            if (r3 != r1) goto L_0x010e
            return r1
        L_0x010e:
            r1 = r14
        L_0x010f:
            com.tencent.mm.plugin.vlog.model.f0 r3 = r2.f316629G
            java.util.LinkedList<com.tencent.mm.plugin.vlog.model.q0> r3 = r3.f316428g
            java.util.Iterator r3 = r3.iterator()
            r8 = 0
        L_0x0118:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0155
            java.lang.Object r9 = r3.next()
            int r10 = r8 + 1
            if (r8 < 0) goto L_0x0151
            com.tencent.mm.plugin.vlog.model.q0 r9 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r9
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem r9 = r9.f316500k
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r11 = r2.f316654Z0
            java.lang.Object r8 = sx3.C110818d0.m150917O(r11, r8)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r8 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r8
            if (r8 == 0) goto L_0x0144
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.util.HashMap<java.lang.String, java.lang.Object> r8 = r8.f162760t
            java.lang.String r12 = "KEY_MEDIA_IS_BEAUTY"
            java.lang.Object r8 = r8.get(r12)
            if (r8 == 0) goto L_0x0141
            r11 = r8
        L_0x0141:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            goto L_0x0145
        L_0x0144:
            r11 = r4
        L_0x0145:
            if (r11 != 0) goto L_0x0149
            r8 = 0
            goto L_0x014d
        L_0x0149:
            boolean r8 = r11.booleanValue()
        L_0x014d:
            r9.isBeauty = r8
            r8 = r10
            goto L_0x0118
        L_0x0151:
            sx3.C64197v.m75542k()
            throw r4
        L_0x0155:
            com.tencent.mm.plugin.vlog.model.f0 r3 = r2.f316629G
            boolean r3 = r3.f316429h
            if (r3 == 0) goto L_0x015d
            r2.f316626D = r6
        L_0x015d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r8 = "setupMediaData: mediaSize:"
            r3.append(r8)
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r8 = r2.f316654Z0
            int r8 = r8.size()
            r3.append(r8)
            java.lang.String r8 = ", imageMaxSize:"
            r3.append(r8)
            int r8 = r2.f316665n
            r3.append(r8)
            java.lang.String r8 = ", "
            r3.append(r8)
            int r8 = r2.f316666o
            r3.append(r8)
            java.lang.String r8 = ", imageOutput:"
            r3.append(r8)
            java.lang.String r8 = r2.f316669q
            r3.append(r8)
            java.lang.String r8 = ", videoMaxDuration:"
            r3.append(r8)
            long r8 = r2.f316664j
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            com.tencent.mm.plugin.vlog.model.f0 r3 = r2.f316629G
            boolean r3 = r3.f316429h
            if (r3 == 0) goto L_0x01ba
            l23.j r3 = r2.getMultiPreviewPlugin()
            boolean r8 = com.tencent.p014mm.plugin.vlog.model.C30517h0.m39113b()
            if (r8 == 0) goto L_0x01b5
            boolean r8 = r2.f316631I
            if (r8 != 0) goto L_0x01b5
            r8 = 1
            goto L_0x01b6
        L_0x01b5:
            r8 = 0
        L_0x01b6:
            r3.mo160458Q(r6, r8, r6)
            goto L_0x01c1
        L_0x01ba:
            l23.j r3 = r2.getMultiPreviewPlugin()
            r3.mo160458Q(r6, r6, r6)
        L_0x01c1:
            q23.a r3 = r2.f316670r
            l23.j r8 = r2.getMultiPreviewPlugin()
            android.graphics.RectF r8 = r8.f326972o
            float r8 = r8.left
            r3.getClass()
            java.lang.String r3 = "KEY_PREVIEW_WIDTH"
            int r3 = r1.getInt(r3)
            java.lang.String r8 = "KEY_PREVIEW_HEIGHT"
            int r1 = r1.getInt(r8)
            android.content.Context r8 = r2.getContext()
            android.graphics.Point r8 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r8)
            if (r3 <= 0) goto L_0x01e6
            if (r1 > 0) goto L_0x01ea
        L_0x01e6:
            int r3 = r8.x
            int r1 = r8.y
        L_0x01ea:
            com.tencent.mm.plugin.vlog.model.f0 r8 = r2.f316629G
            r8.mo152126w(r3, r1)
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r2.f316654Z0
            java.util.Iterator r1 = r1.iterator()
        L_0x01f5:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0215
            java.lang.Object r3 = r1.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r3 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r3
            int r8 = r3.getType()
            r9 = 2
            if (r8 != r9) goto L_0x01f5
            m23.c r8 = r2.f316680z
            java.lang.String r3 = r3.f162747d
            java.lang.String r9 = "it.originalPath"
            gy3.C87412m.m108593f(r3, r9)
            r8.mo160717y(r3)
            goto L_0x01f5
        L_0x0215:
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r1 = r0.f324904g
            l23.j r1 = r1.getMultiPreviewPlugin()
            android.graphics.RectF r1 = r1.f326972o
            android.graphics.Rect r2 = zg2.C103020m.f303988d
            r1.round(r2)
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r2 = r0.f324904g
            com.tencent.mm.plugin.vlog.model.f0 r2 = r2.f316629G
            r2.mo152125v(r1, r5)
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r2 = r0.f324904g
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r2.f316627E
            if (r2 == 0) goto L_0x023a
            android.os.Bundle r2 = r2.f272912M
            if (r2 == 0) goto L_0x023a
            java.lang.String r3 = "KEY_ORIGIN_MUSIC_PATH"
            java.lang.String r2 = r2.getString(r3)
            goto L_0x023b
        L_0x023a:
            r2 = r4
        L_0x023b:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x0277
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r3 = r0.f324904g
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r3.f316627E
            if (r3 == 0) goto L_0x0253
            android.os.Bundle r3 = r3.f272912M
            if (r3 == 0) goto L_0x0253
            java.lang.String r4 = "KEY_ORIGIN_MUSIC_NAME"
            java.lang.String r3 = r3.getString(r4)
            if (r3 != 0) goto L_0x0255
        L_0x0253:
            java.lang.String r3 = ""
        L_0x0255:
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r4 = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo
            r4.<init>()
            r4.f163818j = r5
            r4.f163824s = r5
            r4.f163817i = r2
            r4.f163825t = r3
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r2 = r0.f324904g
            long r8 = r2.f316664j
            int r3 = (int) r8
            r4.f163822q = r3
            j23.a r2 = r2.f316674v
            java.util.List r3 = sx3.C26236u.m33719b(r4)
            r2.mo159387G(r3)
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r2 = r0.f324904g
            r2.f316651W0 = r5
            goto L_0x029b
        L_0x0277:
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r2 = r0.f324904g
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r2.f316627E
            if (r2 == 0) goto L_0x028a
            android.os.Bundle r2 = r2.f272912M
            if (r2 == 0) goto L_0x028a
            java.lang.String r3 = "KEY_SELECT_AUDIO_INFO"
            android.os.Parcelable r2 = r2.getParcelable(r3)
            r4 = r2
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r4 = (com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo) r4
        L_0x028a:
            if (r4 == 0) goto L_0x029b
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r2 = r0.f324904g
            j23.a r2 = r2.f316674v
            java.util.List r3 = sx3.C26236u.m33719b(r4)
            r2.mo159387G(r3)
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r2 = r0.f324904g
            r2.f316651W0 = r5
        L_0x029b:
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r2 = r0.f324904g
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r2.f316627E
            if (r3 == 0) goto L_0x02ac
            android.os.Bundle r3 = r3.f272912M
            if (r3 == 0) goto L_0x02ac
            java.lang.String r4 = "KEY_MEDIA_MUTE"
            boolean r3 = r3.getBoolean(r4)
            goto L_0x02ae
        L_0x02ac:
            boolean r3 = r2.f316630H
        L_0x02ae:
            r2.f316630H = r3
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r2 = r0.f324904g
            com.tencent.mm.plugin.vlog.model.f0 r2 = r2.f316629G
            r2.mo152128z()
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r2 = r0.f324904g
            l23.y0 r2 = r2.f316641R0
            r2.mo160480x(r1)
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r1 = r0.f324904g
            com.tencent.mm.plugin.vlog.model.f0 r2 = r1.f316629G
            boolean r2 = r2.f316429h
            if (r2 == 0) goto L_0x02f6
            r1.f316630H = r5
            l23.j r1 = r1.getMultiPreviewPlugin()
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r2 = r0.f324904g
            com.tencent.mm.plugin.vlog.model.f0 r2 = r2.f316629G
            android.graphics.RectF r2 = r2.f316434p
            r1.mo160456O(r2)
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r1 = r0.f324904g
            r1.setupImageEditPlugins(r5)
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r1 = r0.f324904g
            q23.a r1 = r1.f316670r
            r1.mo161844B(r6)
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r1 = r0.f324904g
            l23.y0 r2 = r1.f316641R0
            com.tencent.mm.plugin.vlog.model.f0 r1 = r1.f316629G
            java.util.LinkedList<java.lang.String> r1 = r1.f316425d
            r2.getClass()
            d23.a r1 = d23.C106976a.f320208a
            java.lang.String r1 = "MicroMsg.VideoPreviewDecorationPlugin"
            java.lang.String r2 = "not enable video enhancement, ignore this request"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x0341
        L_0x02f6:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f316654Z0
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0303
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0303
            goto L_0x0335
        L_0x0303:
            java.util.Iterator r1 = r1.iterator()
        L_0x0307:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0335
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r2 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r2
            int r3 = r2.getType()
            r4 = 2
            if (r3 != r4) goto L_0x0331
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r3 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            java.lang.String r2 = r2.f162747d
            java.lang.String r8 = "it.mOriginalPath"
            gy3.C87412m.m108593f(r2, r8)
            rw.m$a r2 = r3.mo129929a(r2)
            if (r2 == 0) goto L_0x032c
            int r2 = r2.f180534j
            goto L_0x032d
        L_0x032c:
            r2 = 0
        L_0x032d:
            if (r2 <= 0) goto L_0x0331
            r2 = 1
            goto L_0x0332
        L_0x0331:
            r2 = 0
        L_0x0332:
            if (r2 == 0) goto L_0x0307
            r6 = 1
        L_0x0335:
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r1 = r0.f324904g
            boolean r2 = r1.f316630H
            r3 = r6 ^ 1
            r2 = r2 & r3
            r1.f316630H = r2
            r1.mo152196A()
        L_0x0341:
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r1 = r0.f324904g
            l23.y0 r2 = r1.f316641R0
            l23.j r1 = r1.getMultiPreviewPlugin()
            android.graphics.RectF r1 = r1.f326972o
            r2.mo160480x(r1)
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r1 = r0.f324904g
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r1 = r1.f316654Z0
            int r1 = r1.size()
            r2 = 8
            if (r1 > r5) goto L_0x0362
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r1 = r0.f324904g
            l23.n0 r1 = r1.f316677x0
            r1.setVisibility(r2)
            goto L_0x036c
        L_0x0362:
            com.tencent.p014mm.plugin.vlog.model.C30517h0.m39115d()
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r1 = r0.f324904g
            l23.n0 r1 = r1.f316677x0
            r1.setVisibility(r2)
        L_0x036c:
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout r1 = r0.f324904g
            com.tencent.mm.plugin.vlog.model.f0 r1 = r1.f316629G
            boolean r1 = r1.f316429h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "initLogic isAllImage:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j23.C108538h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
