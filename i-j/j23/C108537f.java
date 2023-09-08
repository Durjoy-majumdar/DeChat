package j23;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import com.tencent.p014mm.plugin.vlog.model.C106195f0;
import com.tencent.p014mm.plugin.vlog.model.C96541g0;
import com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoFullScreenPluginLayout;
import fy3.C32227p;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110823p;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$setupMediaData$1", mo125469f = "MultiVideoFullScreenPluginLayout.kt", mo125470l = {610}, mo125471m = "invokeSuspend")
/* renamed from: j23.f */
public final class C108537f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f324897d;

    /* renamed from: e */
    public Object f324898e;

    /* renamed from: f */
    public int f324899f;

    /* renamed from: g */
    public final /* synthetic */ MultiVideoFullScreenPluginLayout f324900g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$setupMediaData$1$1$2", mo125469f = "MultiVideoFullScreenPluginLayout.kt", mo125470l = {610}, mo125471m = "invokeSuspend")
    /* renamed from: j23.f$a */
    public static final class C98899a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f289915d;

        /* renamed from: e */
        public final /* synthetic */ MultiVideoFullScreenPluginLayout f289916e;

        /* renamed from: f */
        public final /* synthetic */ List<String> f289917f;

        /* renamed from: g */
        public final /* synthetic */ List<Integer> f289918g;

        /* renamed from: h */
        public final /* synthetic */ Integer[] f289919h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98899a(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, List<String> list, List<Integer> list2, Integer[] numArr, C15601d<? super C98899a> dVar) {
            super(2, dVar);
            this.f289916e = multiVideoFullScreenPluginLayout;
            this.f289917f = list;
            this.f289918g = list2;
            this.f289919h = numArr;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C98899a(this.f289916e, this.f289917f, this.f289918g, this.f289919h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C98899a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f289915d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C106195f0 f0Var = this.f289916e.f316545H;
                List<String> list = this.f289917f;
                List<Integer> list2 = this.f289918g;
                List a0 = C110823p.m151001a0(this.f289919h);
                this.f289915d = 1;
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
    public C108537f(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, C15601d<? super C108537f> dVar) {
        super(2, dVar);
        this.f324900g = multiVideoFullScreenPluginLayout;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C108537f(this.f324900g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C108537f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0367 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0241  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r14.f324899f
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.String r5 = "MicroMsg.MultiVideoFullScreenPluginLayout"
            if (r1 == 0) goto L_0x0022
            if (r1 != r3) goto L_0x001a
            java.lang.Object r0 = r14.f324898e
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.Object r1 = r14.f324897d
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r1 = (com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoFullScreenPluginLayout) r1
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x010b
        L_0x001a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r15)
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r1 = r14.f324900g
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r15 = r1.f316543F
            if (r15 == 0) goto L_0x0213
            android.os.Bundle r15 = r15.f272912M
            if (r15 == 0) goto L_0x0213
            java.lang.Class<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r6 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.class
            java.lang.ClassLoader r6 = r6.getClassLoader()
            r15.setClassLoader(r6)
            java.lang.String r6 = "post_id"
            java.lang.String r6 = r15.getString(r6)
            if (r6 == 0) goto L_0x0050
            r1.f316574e1 = r6
            th2.c r7 = r1.f316580i1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r7 = r7.f332424a
            java.lang.String r8 = "PostId"
            java.lang.String r6 = r7.mo86045b(r8, r6, r3)
            r7.f310214d = r6
            rx3.b0 r6 = rx3.C13598b0.f38549a
        L_0x0050:
            int r6 = r1.f316586n
            java.lang.String r7 = "image_max_height"
            int r6 = r15.getInt(r7, r6)
            r1.f316586n = r6
            int r6 = r1.f316588o
            java.lang.String r7 = "image_max_width"
            int r6 = r15.getInt(r7, r6)
            r1.f316588o = r6
            int r6 = r1.f316589p
            java.lang.String r7 = "image_compress_quality"
            int r6 = r15.getInt(r7, r6)
            r1.f316589p = r6
            java.lang.String r6 = r1.f316591q
            java.lang.String r7 = "output_dir"
            java.lang.String r6 = r15.getString(r7, r6)
            java.lang.String r7 = "extra.getString(Constant…TPUT_DIR, imageOutputDir)"
            gy3.C87412m.m108593f(r6, r7)
            r1.f316591q = r6
            long r6 = r1.f316581j
            java.lang.String r8 = "video_max_duration"
            long r6 = r15.getLong(r8, r6)
            r1.f316581j = r6
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r6 = r1.f316576g1
            java.util.ArrayList r8 = new java.util.ArrayList
            r7 = 10
            int r9 = sx3.C36907w.m41090l(r6, r7)
            r8.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L_0x0099:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00ab
            java.lang.Object r9 = r6.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r9 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r9
            java.lang.String r9 = r9.f162747d
            r8.add(r9)
            goto L_0x0099
        L_0x00ab:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r6 = r1.f316576g1
            java.util.ArrayList r9 = new java.util.ArrayList
            int r7 = sx3.C36907w.m41090l(r6, r7)
            r9.<init>(r7)
            java.util.Iterator r6 = r6.iterator()
        L_0x00ba:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00d3
            java.lang.Object r7 = r6.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r7 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r7
            int r7 = r7.getType()
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r7)
            r9.add(r10)
            goto L_0x00ba
        L_0x00d3:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r6 = r1.f316576g1
            int r6 = r6.size()
            java.lang.Integer[] r10 = new java.lang.Integer[r6]
            r7 = 0
        L_0x00dc:
            if (r7 >= r6) goto L_0x00f3
            h90.b r11 = r1.f316544G
            if (r11 == 0) goto L_0x00e8
            boolean r11 = r11.f288182c
            if (r11 != r3) goto L_0x00e8
            r11 = 1
            goto L_0x00e9
        L_0x00e8:
            r11 = 0
        L_0x00e9:
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            r10[r7] = r12
            int r7 = r7 + 1
            goto L_0x00dc
        L_0x00f3:
            a14.h0 r12 = a14.C53872d1.f151119c
            j23.f$a r13 = new j23.f$a
            r11 = 0
            r6 = r13
            r7 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            r14.f324897d = r1
            r14.f324898e = r15
            r14.f324899f = r3
            java.lang.Object r6 = a14.C53895h.m60469g(r12, r13, r14)
            if (r6 != r0) goto L_0x010a
            return r0
        L_0x010a:
            r0 = r15
        L_0x010b:
            com.tencent.mm.plugin.vlog.model.f0 r15 = r1.f316545H
            java.util.LinkedList<com.tencent.mm.plugin.vlog.model.q0> r15 = r15.f316428g
            java.util.Iterator r15 = r15.iterator()
            r6 = 0
        L_0x0114:
            boolean r7 = r15.hasNext()
            if (r7 == 0) goto L_0x0151
            java.lang.Object r7 = r15.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L_0x014d
            com.tencent.mm.plugin.vlog.model.q0 r7 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r7
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem r7 = r7.f316500k
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r9 = r1.f316576g1
            java.lang.Object r6 = sx3.C110818d0.m150917O(r9, r6)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r6 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r6
            if (r6 == 0) goto L_0x0140
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = r6.f162760t
            java.lang.String r10 = "KEY_MEDIA_IS_BEAUTY"
            java.lang.Object r6 = r6.get(r10)
            if (r6 == 0) goto L_0x013d
            r9 = r6
        L_0x013d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            goto L_0x0141
        L_0x0140:
            r9 = r2
        L_0x0141:
            if (r9 != 0) goto L_0x0145
            r6 = 0
            goto L_0x0149
        L_0x0145:
            boolean r6 = r9.booleanValue()
        L_0x0149:
            r7.isBeauty = r6
            r6 = r8
            goto L_0x0114
        L_0x014d:
            sx3.C64197v.m75542k()
            throw r2
        L_0x0151:
            com.tencent.mm.plugin.vlog.model.f0 r15 = r1.f316545H
            boolean r15 = r15.f316429h
            if (r15 == 0) goto L_0x0159
            r1.f316542E = r4
        L_0x0159:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "setupMediaData: mediaSize:"
            r15.append(r6)
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r6 = r1.f316576g1
            int r6 = r6.size()
            r15.append(r6)
            java.lang.String r6 = ", imageMaxSize:"
            r15.append(r6)
            int r6 = r1.f316586n
            r15.append(r6)
            java.lang.String r6 = ", "
            r15.append(r6)
            int r6 = r1.f316588o
            r15.append(r6)
            java.lang.String r6 = ", imageOutput:"
            r15.append(r6)
            java.lang.String r6 = r1.f316591q
            r15.append(r6)
            java.lang.String r6 = ", videoMaxDuration:"
            r15.append(r6)
            long r6 = r1.f316581j
            r15.append(r6)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r15)
            l23.j r15 = r1.getMultiPreviewPlugin()
            boolean r6 = com.tencent.p014mm.plugin.vlog.model.C30517h0.m39113b()
            if (r6 == 0) goto L_0x01b1
            boolean r6 = r1.f316547J
            if (r6 != 0) goto L_0x01b1
            com.tencent.mm.plugin.vlog.model.f0 r6 = r1.f316545H
            boolean r6 = r6.f316429h
            if (r6 == 0) goto L_0x01b1
            r6 = 1
            goto L_0x01b2
        L_0x01b1:
            r6 = 0
        L_0x01b2:
            r15.mo160458Q(r4, r6, r3)
            q23.a r15 = r1.f316592r
            l23.j r6 = r1.getMultiPreviewPlugin()
            android.graphics.RectF r6 = r6.f326972o
            float r6 = r6.left
            r15.getClass()
            java.lang.String r15 = "KEY_PREVIEW_WIDTH"
            int r15 = r0.getInt(r15)
            java.lang.String r6 = "KEY_PREVIEW_HEIGHT"
            int r0 = r0.getInt(r6)
            android.content.Context r6 = r1.getContext()
            android.graphics.Point r6 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r6)
            if (r15 <= 0) goto L_0x01da
            if (r0 > 0) goto L_0x01de
        L_0x01da:
            int r15 = r6.x
            int r0 = r6.y
        L_0x01de:
            com.tencent.mm.plugin.vlog.model.f0 r6 = r1.f316545H
            r6.mo152126w(r15, r0)
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r15 = r1.f316576g1
            java.util.Iterator r15 = r15.iterator()
        L_0x01e9:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0211
            java.lang.Object r0 = r15.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r0 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r0
            int r6 = r0.getType()
            r7 = 2
            if (r6 != r7) goto L_0x01e9
            m23.c r6 = r1.f316598x
            if (r6 == 0) goto L_0x020b
            java.lang.String r0 = r0.f162747d
            java.lang.String r7 = "it.originalPath"
            gy3.C87412m.m108593f(r0, r7)
            r6.mo160717y(r0)
            goto L_0x01e9
        L_0x020b:
            java.lang.String r15 = "captionPlugin"
            gy3.C87412m.m108603p(r15)
            throw r2
        L_0x0211:
            rx3.b0 r15 = rx3.C13598b0.f38549a
        L_0x0213:
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            l23.j r15 = r15.getMultiPreviewPlugin()
            android.graphics.RectF r15 = r15.f326972o
            android.graphics.Rect r0 = zg2.C103020m.f303988d
            r15.round(r0)
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r0 = r14.f324900g
            com.tencent.mm.plugin.vlog.model.f0 r0 = r0.f316545H
            r0.mo152125v(r15, r4)
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            h90.b r15 = r15.f316544G
            if (r15 == 0) goto L_0x0238
            android.os.Bundle r15 = r15.f288193n
            if (r15 == 0) goto L_0x0238
            java.lang.String r0 = "KEY_ORIGIN_MUSIC_PATH"
            java.lang.String r15 = r15.getString(r0)
            goto L_0x0239
        L_0x0238:
            r15 = r2
        L_0x0239:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            java.lang.String r1 = "addMusicPlugin"
            if (r0 != 0) goto L_0x02be
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r0 = r14.f324900g
            h90.b r0 = r0.f316544G
            if (r0 == 0) goto L_0x0253
            android.os.Bundle r0 = r0.f288193n
            if (r0 == 0) goto L_0x0253
            java.lang.String r6 = "KEY_ORIGIN_MUSIC_NAME"
            java.lang.String r0 = r0.getString(r6)
            if (r0 != 0) goto L_0x0255
        L_0x0253:
            java.lang.String r0 = ""
        L_0x0255:
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r6 = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo
            r6.<init>()
            long r7 = java.lang.System.currentTimeMillis()
            int r8 = (int) r7
            r6.f163813e = r8
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r7 = r14.f324900g
            h90.b r7 = r7.f316544G
            if (r7 == 0) goto L_0x0272
            android.os.Bundle r7 = r7.f288193n
            if (r7 == 0) goto L_0x0272
            java.lang.String r8 = "KEY_BGM_IF_ORIGIN"
            boolean r7 = r7.getBoolean(r8)
            goto L_0x0273
        L_0x0272:
            r7 = 0
        L_0x0273:
            if (r7 == 0) goto L_0x0277
            r7 = 1
            goto L_0x0278
        L_0x0277:
            r7 = 2
        L_0x0278:
            r6.f163821p = r7
            r6.f163818j = r3
            r6.f163824s = r3
            r6.f163817i = r15
            r6.f163825t = r0
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            long r7 = r15.f316581j
            int r0 = (int) r7
            r6.f163822q = r0
            j23.a r15 = r15.f316597w
            if (r15 == 0) goto L_0x02ba
            java.util.List r0 = sx3.C26236u.m33719b(r6)
            r15.mo159387G(r0)
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            r15.f316572c1 = r3
            h90.b r15 = r15.f316544G
            if (r15 == 0) goto L_0x02a7
            android.os.Bundle r15 = r15.f288193n
            if (r15 == 0) goto L_0x02a7
            java.lang.String r0 = "KEY_DISABLE_ADD_MUSIC"
            boolean r15 = r15.getBoolean(r0)
            goto L_0x02a8
        L_0x02a7:
            r15 = 0
        L_0x02a8:
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r0 = r14.f324900g
            j23.a r0 = r0.f316597w
            if (r0 == 0) goto L_0x02b6
            r15 = r15 ^ r3
            boolean r1 = r0.f324885t
            if (r1 == r15) goto L_0x02ea
            r0.f324885t = r15
            goto L_0x02ea
        L_0x02b6:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x02ba:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x02be:
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            h90.b r15 = r15.f316544G
            if (r15 == 0) goto L_0x02d1
            android.os.Bundle r15 = r15.f288193n
            if (r15 == 0) goto L_0x02d1
            java.lang.String r0 = "KEY_SELECT_AUDIO_INFO"
            android.os.Parcelable r15 = r15.getParcelable(r0)
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r15 = (com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo) r15
            goto L_0x02d2
        L_0x02d1:
            r15 = r2
        L_0x02d2:
            if (r15 == 0) goto L_0x02ea
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r0 = r14.f324900g
            j23.a r0 = r0.f316597w
            if (r0 == 0) goto L_0x02e6
            java.util.List r15 = sx3.C26236u.m33719b(r15)
            r0.mo159387G(r15)
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            r15.f316572c1 = r3
            goto L_0x02ea
        L_0x02e6:
            gy3.C87412m.m108603p(r1)
            throw r2
        L_0x02ea:
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            h90.b r0 = r15.f316544G
            if (r0 == 0) goto L_0x02fb
            android.os.Bundle r0 = r0.f288193n
            if (r0 == 0) goto L_0x02fb
            java.lang.String r1 = "KEY_MEDIA_MUTE"
            boolean r0 = r0.getBoolean(r1)
            goto L_0x02fd
        L_0x02fb:
            boolean r0 = r15.f316546I
        L_0x02fd:
            r15.f316546I = r0
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            com.tencent.mm.plugin.vlog.model.f0 r0 = r15.f316545H
            boolean r0 = r0.f316429h
            if (r0 == 0) goto L_0x0329
            r15.f316546I = r3
            l23.j r15 = r15.getMultiPreviewPlugin()
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r0 = r14.f324900g
            l23.j r0 = r0.getMultiPreviewPlugin()
            com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout r0 = r0.f326967g
            android.graphics.RectF r0 = r0.getVisibilityRect()
            r15.mo160456O(r0)
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            r15.setupImageEditPlugins(r3)
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            q23.a r15 = r15.f316592r
            r15.mo161844B(r4)
            goto L_0x0374
        L_0x0329:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r15 = r15.f316576g1
            boolean r0 = r15 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0336
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0336
            goto L_0x0368
        L_0x0336:
            java.util.Iterator r15 = r15.iterator()
        L_0x033a:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0368
            java.lang.Object r0 = r15.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r0 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r0
            int r1 = r0.getType()
            r2 = 2
            if (r1 != r2) goto L_0x0364
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r1 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            java.lang.String r0 = r0.f162747d
            java.lang.String r2 = "it.mOriginalPath"
            gy3.C87412m.m108593f(r0, r2)
            rw.m$a r0 = r1.mo129929a(r0)
            if (r0 == 0) goto L_0x035f
            int r0 = r0.f180534j
            goto L_0x0360
        L_0x035f:
            r0 = 0
        L_0x0360:
            if (r0 <= 0) goto L_0x0364
            r0 = 1
            goto L_0x0365
        L_0x0364:
            r0 = 0
        L_0x0365:
            if (r0 == 0) goto L_0x033a
            r4 = 1
        L_0x0368:
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            boolean r0 = r15.f316546I
            r1 = r4 ^ 1
            r0 = r0 & r1
            r15.f316546I = r0
            r15.mo152174C()
        L_0x0374:
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            android.content.Context r15 = r15.getContext()
            android.graphics.Point r15 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r15)
            int r0 = r15.x
            int r15 = r15.y
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r1 = r14.f324900g
            com.tencent.mm.plugin.vlog.model.f0 r2 = r1.f316545H
            boolean r2 = r2.f316429h
            if (r2 == 0) goto L_0x0395
            android.content.Context r1 = r1.getContext()
            r2 = 224(0xe0, float:3.14E-43)
            int r1 = kg3.C76577a.m92151b(r1, r2)
            goto L_0x039f
        L_0x0395:
            android.content.Context r1 = r1.getContext()
            r2 = 208(0xd0, float:2.91E-43)
            int r1 = kg3.C76577a.m92151b(r1, r2)
        L_0x039f:
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r2 = r14.f324900g
            l23.j r2 = r2.getMultiPreviewPlugin()
            com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout r2 = r2.f326967g
            android.graphics.RectF r2 = r2.getVisibilityRect()
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r4 = r14.f324900g
            l23.j r4 = r4.getMultiPreviewPlugin()
            android.graphics.RectF r4 = r4.f326972o
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r6 = r14.f324900g
            com.tencent.mm.plugin.vlog.ui.widget.PhotoMaskView r6 = r6.f316568Y0
            r6.setVisibleRect((android.graphics.RectF) r4)
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r4 = r14.f324900g
            android.content.Context r4 = r4.getContext()
            int r4 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r4)
            android.graphics.RectF r6 = new android.graphics.RectF
            r7 = 0
            float r8 = r2.top
            float r0 = (float) r0
            int r15 = r15 - r1
            int r15 = r15 - r4
            float r15 = (float) r15
            float r1 = r2.bottom
            float r15 = java.lang.Math.min(r15, r1)
            r6.<init>(r7, r8, r0, r15)
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            l23.y0 r15 = r15.f316558S0
            r15.mo160480x(r6)
            android.graphics.Rect r15 = zg2.C103020m.f303989e
            r6.round(r15)
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r15 = r15.f316576g1
            int r15 = r15.size()
            r0 = 8
            if (r15 > r3) goto L_0x03f6
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            l23.n0 r15 = r15.f316601y0
            r15.setVisibility(r0)
            goto L_0x0400
        L_0x03f6:
            com.tencent.p014mm.plugin.vlog.model.C30517h0.m39115d()
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            l23.n0 r15 = r15.f316601y0
            r15.setVisibility(r0)
        L_0x0400:
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r15 = r14.f324900g
            com.tencent.mm.plugin.vlog.model.f0 r0 = r15.f316545H
            boolean r1 = r0.f316429h
            l23.y0 r15 = r15.f316558S0
            com.tencent.mm.plugin.vlog.model.p0 r0 = r0.f316438t
            sp3.k r0 = r0.mo134611h()
            r15.getClass()
            java.lang.String r2 = "videoComposition"
            gy3.C87412m.m108594g(r0, r2)
            r15.getClass()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "initLogic isAllImage:"
            r15.append(r0)
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r15)
            rx3.b0 r15 = rx3.C13598b0.f38549a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: j23.C108537f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
