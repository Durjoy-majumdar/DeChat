package j23;

import a14.C0000n0;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import fy3.C32227p;
import h23.C108019a;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiEditAddMusicPlugin$appendFinderMusicInfo$2", mo125469f = "MultiEditAddMusicPlugin.kt", mo125470l = {502, 535}, mo125471m = "invokeSuspend")
/* renamed from: j23.b */
public final class C60732b extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

    /* renamed from: d */
    public Object f172977d;

    /* renamed from: e */
    public Object f172978e;

    /* renamed from: f */
    public Object f172979f;

    /* renamed from: g */
    public Object f172980g;

    /* renamed from: h */
    public Object f172981h;

    /* renamed from: i */
    public int f172982i;

    /* renamed from: j */
    public final /* synthetic */ String f172983j;

    /* renamed from: n */
    public final /* synthetic */ FinderObject f172984n;

    /* renamed from: o */
    public final /* synthetic */ C108531a f172985o;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiEditAddMusicPlugin$appendFinderMusicInfo$2$extractAudioSuccess$1", mo125469f = "MultiEditAddMusicPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: j23.b$a */
    public static final class C60733a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public final /* synthetic */ String f172986d;

        /* renamed from: e */
        public final /* synthetic */ String f172987e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60733a(String str, String str2, C15601d<? super C60733a> dVar) {
            super(2, dVar);
            this.f172986d = str;
            this.f172987e = str2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C60733a(this.f172986d, this.f172987e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C60733a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return Boolean.valueOf(C108019a.f323464a.mo158414a(this.f172986d, this.f172987e));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60732b(String str, FinderObject finderObject, C108531a aVar, C15601d<? super C60732b> dVar) {
        super(2, dVar);
        this.f172983j = str;
        this.f172984n = finderObject;
        this.f172985o = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60732b(this.f172983j, this.f172984n, this.f172985o, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60732b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r8 = r23
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r8.f172982i
            java.lang.String r9 = ""
            r11 = 2
            r12 = 1
            java.lang.String r13 = "MicroMsg.EditAddMusicPlugin"
            r14 = 0
            if (r1 == 0) goto L_0x004b
            if (r1 == r12) goto L_0x0037
            if (r1 != r11) goto L_0x002f
            java.lang.Object r0 = r8.f172981h
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r8.f172980g
            gy3.f0 r1 = (gy3.C8479f0) r1
            java.lang.Object r2 = r8.f172979f
            gy3.f0 r2 = (gy3.C8479f0) r2
            java.lang.Object r3 = r8.f172978e
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r8.f172977d
            java.lang.String r4 = (java.lang.String) r4
            kotlin.ResultKt.throwOnFailure(r24)
            r5 = r2
            r2 = r24
            goto L_0x01a2
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0037:
            java.lang.Object r1 = r8.f172978e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.f172977d
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.throwOnFailure(r24)     // Catch:{ d -> 0x0048 }
            r15 = r2
            r2 = r1
            r1 = r24
            goto L_0x00b6
        L_0x0048:
            r0 = move-exception
            goto L_0x020d
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r24)
            java.lang.String r15 = r8.f172983j
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r8.f172984n
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x005e
            te3.ve1 r1 = r1.feedBgmInfo
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = r1.f185874e
            if (r1 != 0) goto L_0x005f
        L_0x005e:
            r1 = r9
        L_0x005f:
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0067
            r2 = 1
            goto L_0x0068
        L_0x0067:
            r2 = 0
        L_0x0068:
            if (r2 == 0) goto L_0x0077
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r8.f172984n
            long r1 = r1.f164794id
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.getUnsignedLongString(r1)
            java.lang.String r2 = "getUnsignedLongString(finderObj.id)"
            gy3.C87412m.m108593f(r1, r2)
        L_0x0077:
            r7 = r1
            java.lang.Class<ht1.h2> r1 = ht1.C8770h2.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ d -> 0x0048 }
            r16 = r1
            ht1.h2 r16 = (ht1.C8770h2) r16     // Catch:{ d -> 0x0048 }
            r18 = 4
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r8.f172984n     // Catch:{ d -> 0x0048 }
            long r1 = r1.f164794id     // Catch:{ d -> 0x0048 }
            java.lang.Long r3 = new java.lang.Long     // Catch:{ d -> 0x0048 }
            r3.<init>(r1)     // Catch:{ d -> 0x0048 }
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r7
            r19 = r3
            ob0.b r1 = r16.mo9594ii(r17, r18, r19, r20, r21, r22)     // Catch:{ d -> 0x0048 }
            r2 = 0
            r4 = 0
            r6 = 3
            r16 = 0
            r8.f172977d = r15     // Catch:{ d -> 0x0048 }
            r8.f172978e = r7     // Catch:{ d -> 0x0048 }
            r8.f172982i = r12     // Catch:{ d -> 0x0048 }
            r5 = r23
            r17 = r7
            r7 = r16
            java.lang.Object r1 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ d -> 0x0048 }
            if (r1 != r0) goto L_0x00b4
            return r0
        L_0x00b4:
            r2 = r17
        L_0x00b6:
            te3.xp0 r1 = (te3.C52002xp0) r1     // Catch:{ d -> 0x0048 }
            te3.sn1 r1 = r1.f144789h
            if (r1 == 0) goto L_0x00bf
            te3.qn1 r1 = r1.f141629s
            goto L_0x00c0
        L_0x00bf:
            r1 = r14
        L_0x00c0:
            if (r1 == 0) goto L_0x0207
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r8.f172984n
            long r3 = r3.f164794id
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.getUnsignedLongString(r3)
            java.lang.String r3 = r1.f140410g
            if (r3 != 0) goto L_0x00cf
            r3 = r4
        L_0x00cf:
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r1.f140407d
            if (r5 == 0) goto L_0x00d6
            java.lang.String r5 = r5.username
            goto L_0x00d7
        L_0x00d6:
            r5 = r14
        L_0x00d7:
            java.lang.String r6 = eb0.C75592q0.m90778h()
            gy3.C87412m.m108589b(r5, r6)
            gy3.f0 r5 = new gy3.f0
            r5.<init>()
            gy3.f0 r6 = new gy3.f0
            r6.<init>()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r8.f172984n
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = r7.objectDesc
            if (r7 == 0) goto L_0x0102
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r7 = r7.media
            if (r7 == 0) goto L_0x0102
            java.lang.Object r7 = sx3.C110818d0.m150916N(r7)
            com.tencent.mm.protocal.protobuf.FinderMedia r7 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r7
            if (r7 == 0) goto L_0x0102
            int r7 = r7.mediaType
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r7)
            goto L_0x0103
        L_0x0102:
            r10 = r14
        L_0x0103:
            if (r10 != 0) goto L_0x0106
            goto L_0x012e
        L_0x0106:
            int r7 = r10.intValue()
            if (r7 != r11) goto L_0x012e
            te3.td1 r1 = r1.f140408e
            if (r1 == 0) goto L_0x013c
            java.lang.String r7 = r1.f185539i
            r5.f27484d = r7
            te3.td1 r7 = new te3.td1
            r7.<init>()
            r6.f27484d = r7
            r7.f185534d = r3
            java.lang.String r10 = r1.f185539i
            if (r10 != 0) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r9 = r10
        L_0x0123:
            r7.f185539i = r9
            java.lang.String r9 = r1.f185537g
            r7.f185537g = r9
            java.lang.String r1 = r1.f185536f
            r7.f185536f = r1
            goto L_0x013c
        L_0x012e:
            r7 = 4
            if (r10 != 0) goto L_0x0132
            goto L_0x013c
        L_0x0132:
            int r9 = r10.intValue()
            if (r9 != r7) goto L_0x013c
            java.lang.String r1 = r1.f140409f
            r5.f27484d = r1
        L_0x013c:
            T r1 = r5.f27484d
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x014a
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0149
            goto L_0x014a
        L_0x0149:
            r12 = 0
        L_0x014a:
            if (r12 == 0) goto L_0x01b8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            f40.o r7 = f40.C86709a0.m107535s()
            java.lang.String r7 = r7.f251806d
            r1.append(r7)
            java.lang.String r7 = "finder/tmp/"
            r1.append(r7)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "originBgmUrl is null, ready to extract audio from "
            r2.append(r7)
            java.lang.String r7 = r8.f172983j
            r2.append(r7)
            java.lang.String r7 = " to "
            r2.append(r7)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            a14.h0 r2 = a14.C53872d1.f151119c
            j23.b$a r7 = new j23.b$a
            java.lang.String r9 = r8.f172983j
            r7.<init>(r9, r1, r14)
            r8.f172977d = r4
            r8.f172978e = r3
            r8.f172979f = r5
            r8.f172980g = r6
            r8.f172981h = r1
            r8.f172982i = r11
            java.lang.Object r2 = a14.C53895h.m60469g(r2, r7, r8)
            if (r2 != r0) goto L_0x01a0
            return r0
        L_0x01a0:
            r0 = r1
            r1 = r6
        L_0x01a2:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x01b2
            java.lang.String r2 = "extract audio success!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            r15 = r0
            r6 = r1
            goto L_0x01b8
        L_0x01b2:
            java.lang.String r0 = "extract audio fail!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            return r14
        L_0x01b8:
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r0 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r0 = r0.f272892b
            java.lang.String r1 = "ORIGIN_MUSIC_ID"
            r0.putString(r1, r3)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r0 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r0 = r0.f272892b
            java.lang.String r1 = "ORIGIN_MUSIC_PATH"
            r0.putString(r1, r15)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r0 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r0 = r0.f272892b
            T r1 = r6.f27484d
            te3.td1 r1 = (te3.C64726td1) r1
            if (r1 == 0) goto L_0x01d8
            byte[] r14 = r1.toByteArray()
        L_0x01d8:
            java.lang.String r1 = "ORIGIN_MUSIC_INFO"
            r0.putByteArray(r1, r14)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r0 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r0 = r0.f272892b
            j23.a r1 = r8.f172985o
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r1 = r1.f324881p
            if (r1 == 0) goto L_0x01ea
            int r10 = r1.f163821p
            goto L_0x01eb
        L_0x01ea:
            r10 = 0
        L_0x01eb:
            java.lang.String r1 = "SOUND_TRACK_TYPE"
            r0.putInt(r1, r10)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r0 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r0 = r0.f272892b
            T r1 = r5.f27484d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "ORIGIN_BGM_URL"
            r0.putString(r2, r1)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r0 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r0 = r0.f272892b
            java.lang.String r1 = "MUSIC_FEED_ID"
            r0.putString(r1, r4)
            return r15
        L_0x0207:
            java.lang.String r0 = "bgmInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            return r14
        L_0x020d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GetFinderTopic fail:"
            r1.append(r2)
            java.lang.String r0 = r0.getLocalizedMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: j23.C60732b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
