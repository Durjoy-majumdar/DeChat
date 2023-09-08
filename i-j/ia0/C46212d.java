package ia0;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.maas.record.FinderTemplateCorePlugin$fetchTopicInfo$1", mo125469f = "FinderTemplateCorePlugin.kt", mo125470l = {215, 220}, mo125471m = "invokeSuspend")
/* renamed from: ia0.d */
public final class C46212d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f124571d;

    /* renamed from: e */
    public int f124572e;

    /* renamed from: f */
    public final /* synthetic */ C108438c f124573f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46212d(C108438c cVar, C15601d<? super C46212d> dVar) {
        super(2, dVar);
        this.f124573f = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C46212d(this.f124573f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C46212d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r14.f124572e
            r2 = 0
            r3 = 2
            r4 = 1
            java.lang.String r5 = ""
            if (r1 == 0) goto L_0x0024
            if (r1 == r4) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            java.lang.Object r0 = r14.f124571d
            te3.pr4 r0 = (te3.pr4) r0
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x009a
        L_0x0018:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0068
        L_0x0024:
            kotlin.ResultKt.throwOnFailure(r15)
            ia0.c r15 = r14.f124573f
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r15 = r15.f324705o
            if (r15 != 0) goto L_0x0030
            rx3.b0 r15 = rx3.C13598b0.f38549a
            return r15
        L_0x0030:
            android.os.Bundle r1 = r15.f272912M
            java.lang.String r6 = "KEY_POST_VIDEO_TEMPLATE"
            boolean r1 = r1.containsKey(r6)
            if (r1 == 0) goto L_0x0176
            te3.pr4 r1 = new te3.pr4
            r1.<init>()
            android.os.Bundle r15 = r15.f272912M
            byte[] r15 = r15.getByteArray(r6)
            if (r15 != 0) goto L_0x0048
            goto L_0x0056
        L_0x0048:
            r1.parseFrom(r15)     // Catch:{ Exception -> 0x004c }
            goto L_0x0056
        L_0x004c:
            r15 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r2] = r15
            java.lang.String r15 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r15, r5, r6)
        L_0x0056:
            qa0.b r15 = qa0.C62586b.f177739a
            java.lang.String r1 = r1.f139919d
            java.lang.String r6 = "template.id"
            gy3.C87412m.m108593f(r1, r6)
            r14.f124572e = r4
            java.lang.Object r15 = r15.mo87644d(r1, r3, r14)
            if (r15 != r0) goto L_0x0068
            return r0
        L_0x0068:
            te3.pr4 r15 = (te3.pr4) r15
            if (r15 == 0) goto L_0x0176
            te3.p90 r1 = r15.f139930r
            if (r1 == 0) goto L_0x0176
            te3.rj1 r1 = new te3.rj1
            r1.<init>()
            te3.p90 r6 = r15.f139930r
            java.lang.String r7 = r6.f139654d
            if (r7 != 0) goto L_0x007c
            r7 = r5
        L_0x007c:
            r1.f140941h = r7
            java.lang.String r6 = r6.f139655e
            if (r6 != 0) goto L_0x0083
            r6 = r5
        L_0x0083:
            r1.f140942i = r6
            ob0.b r7 = r1.mo73354b()
            r8 = 0
            r10 = 0
            r12 = 3
            r13 = 0
            r14.f124571d = r15
            r14.f124572e = r3
            r11 = r14
            java.lang.Object r15 = q40.C89456b.m111831a(r7, r8, r10, r11, r12, r13)
            if (r15 != r0) goto L_0x009a
            return r0
        L_0x009a:
            te3.sj1 r15 = (te3.C51253sj1) r15
            java.util.LinkedList<te3.zj0> r15 = r15.f141556e
            r0 = 0
            java.lang.String r1 = "MicroMsg.FinderTemplateCorePlugin"
            if (r15 == 0) goto L_0x016f
            java.lang.Object r15 = sx3.C110818d0.m150916N(r15)
            te3.zj0 r15 = (te3.C52271zj0) r15
            if (r15 == 0) goto L_0x016f
            int r3 = r15.f146017s
            if (r3 == r4) goto L_0x00b0
            r2 = 1
        L_0x00b0:
            if (r2 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r15 = r0
        L_0x00b4:
            if (r15 == 0) goto L_0x016f
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r15.f146006e
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r2 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r2 = r2.f272892b
            long r6 = r15.f146005d
            java.lang.String r3 = "key_topic_id"
            r2.putLong(r3, r6)
            r3 = 102(0x66, float:1.43E-43)
            java.lang.String r6 = "key_activity_type"
            r2.putInt(r6, r3)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r3 = r0.username
            if (r3 != 0) goto L_0x00d1
        L_0x00d0:
            r3 = r5
        L_0x00d1:
            java.lang.String r6 = "key_user_name"
            r2.putString(r6, r3)
            if (r0 == 0) goto L_0x00dc
            java.lang.String r3 = r0.nickname
            if (r3 != 0) goto L_0x00dd
        L_0x00dc:
            r3 = r5
        L_0x00dd:
            java.lang.String r6 = "key_nick_name"
            r2.putString(r6, r3)
            if (r0 == 0) goto L_0x00e8
            java.lang.String r3 = r0.headUrl
            if (r3 != 0) goto L_0x00e9
        L_0x00e8:
            r3 = r5
        L_0x00e9:
            java.lang.String r6 = "key_avatar_url"
            r2.putString(r6, r3)
            java.lang.String r3 = r15.f146010i
            if (r3 != 0) goto L_0x00f3
            r3 = r5
        L_0x00f3:
            java.lang.String r6 = "key_cover_url"
            r2.putString(r6, r3)
            long r6 = r15.f146022x
            java.lang.String r3 = "key_activity_display_mask"
            r2.putLong(r3, r6)
            java.lang.String r3 = r15.f146007f
            if (r3 != 0) goto L_0x0104
            r3 = r5
        L_0x0104:
            java.lang.String r6 = "key_activity_name"
            r2.putString(r6, r3)
            java.lang.String r3 = r15.f146008g
            if (r3 != 0) goto L_0x010e
            r3 = r5
        L_0x010e:
            java.lang.String r6 = "key_activity_desc"
            r2.putString(r6, r3)
            long r6 = r15.f146018t
            java.lang.String r3 = "key_activity_end_time"
            r2.putLong(r3, r6)
            java.lang.String r3 = "saveActivity"
            r2.putBoolean(r3, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "eventInfo nickname = "
            r2.append(r3)
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r0.nickname
            if (r0 != 0) goto L_0x0130
        L_0x012f:
            r0 = r5
        L_0x0130:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "eventInfo eventname = "
            r0.append(r2)
            java.lang.String r2 = r15.f146007f
            if (r2 != 0) goto L_0x0149
            r2 = r5
        L_0x0149:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "eventInfo description = "
            r0.append(r2)
            java.lang.String r15 = r15.f146008g
            if (r15 != 0) goto L_0x0162
            goto L_0x0163
        L_0x0162:
            r5 = r15
        L_0x0163:
            r0.append(r5)
            java.lang.String r15 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r15)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x016f:
            if (r0 != 0) goto L_0x0176
            java.lang.String r15 = "activity closed or get error"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r15)
        L_0x0176:
            rx3.b0 r15 = rx3.C13598b0.f38549a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.C46212d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
