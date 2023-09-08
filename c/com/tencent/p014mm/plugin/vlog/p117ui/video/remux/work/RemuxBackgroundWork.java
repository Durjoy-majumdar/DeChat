package com.tencent.p014mm.plugin.vlog.p117ui.video.remux.work;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import android.content.ContentValues;
import android.content.Context;
import android.os.Parcel;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import c33.C92351h;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.vfs.C86013q1;
import f33.C97826d;
import fh2.C97882i;
import fy3.C32227p;
import g33.C98080a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.io.IOException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import p749xh.C102651h0;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C64899zy;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/video/remux/work/RemuxBackgroundWork;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork */
public final class RemuxBackgroundWork extends CoroutineWorker {

    /* renamed from: o */
    public final String f282735o = "MicroMsg.RemuxBackgroundWork";

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork$doWork$2", mo125469f = "RemuxBackgroundWork.kt", mo125470l = {40}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork$a */
    public static final class C96582a extends C91594j implements C32227p<C0000n0, C15601d<? super ListenableWorker.C113032a>, Object> {

        /* renamed from: d */
        public Object f282736d;

        /* renamed from: e */
        public int f282737e;

        /* renamed from: f */
        public final /* synthetic */ RemuxBackgroundWork f282738f;

        /* renamed from: com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork$a$a */
        public static final class C96583a extends C87413o implements C32227p<Integer, String, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ RemuxBackgroundWork f282739d;

            /* renamed from: e */
            public final /* synthetic */ C15601d<ListenableWorker.C113032a> f282740e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C96583a(RemuxBackgroundWork remuxBackgroundWork, C15601d<? super ListenableWorker.C113032a> dVar) {
                super(2);
                this.f282739d = remuxBackgroundWork;
                this.f282740e = dVar;
            }

            public Object invoke(Object obj, Object obj2) {
                int intValue = ((Number) obj).intValue();
                String str = (String) obj2;
                C87412m.m108594g(str, "errMsg");
                String str2 = this.f282739d.f282735o;
                Log.m105924i(str2, "export callback " + Thread.currentThread().getName());
                Object obj3 = ((HashMap) this.f282739d.f338327e.f338337b.f338353a).get("KEY_EXPORT_BACKGROUND_WORK_TAG_ID");
                String str3 = obj3 instanceof String ? (String) obj3 : null;
                String str4 = this.f282739d.f282735o;
                Log.m105924i(str4, "export callback >> code: " + intValue + ", errMsg: " + str + ", workTagId: " + str3);
                ((C119157j) C119157j.f356862d).mo183876g(new C96584a(this.f282739d, str3, this.f282740e, intValue), "sns_background_thread");
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96582a(RemuxBackgroundWork remuxBackgroundWork, C15601d<? super C96582a> dVar) {
            super(2, dVar);
            this.f282738f = remuxBackgroundWork;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C96582a(this.f282738f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C96582a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean contains;
            boolean z;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f282737e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f282738f.f282735o;
                Log.m105924i(str, "deWork start: " + Thread.currentThread().getName());
                RemuxBackgroundWork remuxBackgroundWork = this.f282738f;
                this.f282736d = remuxBackgroundWork;
                this.f282737e = 1;
                C66218h hVar = new C66218h(C66447b.m78392b(this));
                C96583a aVar2 = new C96583a(remuxBackgroundWork, hVar);
                Object obj2 = ((HashMap) remuxBackgroundWork.f338327e.f338337b.f338353a).get("KEY_EXPORT_BACKGROUND_WORK_TAG_ID");
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                String str3 = remuxBackgroundWork.f282735o;
                Log.m105924i(str3, "suspend " + Thread.currentThread().getName() + "， workTagId: " + str2);
                C98080a aVar3 = C98080a.f287548a;
                synchronized (aVar3) {
                    Log.m105924i("MicroMsg.RemuxBackgroundManager", "isWorkInRunningList >> " + str2);
                    contains = str2 == null ? false : C98080a.f287549b.contains(str2);
                }
                if (contains) {
                    Log.m105924i(remuxBackgroundWork.f282735o, "work is repeat no to do");
                    Result.Companion companion = Result.Companion;
                    hVar.resumeWith(Result.m168114constructorimpl(new ListenableWorker.C113032a.C113033a()));
                } else {
                    C13604l i2 = RemuxBackgroundWork.m123918i(remuxBackgroundWork, str2);
                    boolean booleanValue = ((Boolean) i2.f38555d).booleanValue();
                    C102651h0 h0Var = (C102651h0) i2.f38556e;
                    if (!booleanValue) {
                        Log.m105920e(remuxBackgroundWork.f282735o, "checkDataBeforeRemux is false");
                        Result.Companion companion2 = Result.Companion;
                        hVar.resumeWith(Result.m168114constructorimpl(new ListenableWorker.C113032a.C113033a()));
                    } else {
                        C87412m.m108591d(str2);
                        C87412m.m108591d(h0Var);
                        int i3 = h0Var.field_work_type;
                        String str4 = remuxBackgroundWork.f282735o;
                        Log.m105924i(str4, "checkWorkIsFinish >> workType: " + i3 + ", workTagId: " + str2);
                        if (i3 == 4007 || i3 == 4008) {
                            Result.Companion companion3 = Result.Companion;
                            hVar.resumeWith(Result.m168114constructorimpl(new ListenableWorker.C113032a.C113033a()));
                        } else {
                            synchronized (aVar3) {
                                Log.m105924i("MicroMsg.RemuxBackgroundManager", "addRunningWorkToList >> " + str2);
                                C98080a.f287549b.add(str2);
                            }
                            int i4 = h0Var.field_work_type;
                            String str5 = h0Var.field_output_video_path;
                            C87412m.m108593f(str5, "dbResult.field_output_video_path");
                            long j = h0Var.field_start_remux_time_stamp;
                            String str6 = remuxBackgroundWork.f282735o;
                            Log.m105924i(str6, "dealIsReStartWork >> workTagId: " + str2 + ", workType: " + i4 + ", startWorkTime: " + j);
                            if (j == 0 || i4 == 4007) {
                                z = false;
                            } else {
                                Log.m105924i(remuxBackgroundWork.f282735o, "is go to restart work");
                                C86013q1.m106447h(str5);
                                z = true;
                            }
                            C97826d dVar = C97826d.f286974a;
                            long j2 = h0Var.field_start_remux_time_stamp;
                            long currentTimeMillis = System.currentTimeMillis();
                            ISQLiteDatabase a = dVar.mo137158a();
                            SingleTable singleTable = C102651h0.f302391Q;
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("is_killed_process_restart", Integer.valueOf(z ? 1 : 2));
                            contentValues.put("start_remux_time_stamp", Long.valueOf(z ? j2 : currentTimeMillis));
                            int run = C102651h0.f302391Q.update(contentValues).where(C102651h0.f302393R.equal(str2)).build().run(a);
                            Log.m105924i("MicroMsg，BackgroundVideoInfoStorageManager", "updateIsKilledProcessRestart >> workTagId: " + str2 + ", isKill: " + z + ", result: " + run + ", startMuxTimeStamp: " + j2 + ", startMuxTimeStampCurrent: " + currentTimeMillis);
                            C64899zy zyVar = new C64899zy();
                            try {
                                zyVar.parseFrom(h0Var.field_composition_info);
                                byte[] bArr = h0Var.field_video_param;
                                C87412m.m108593f(bArr, "dbResult.field_video_param");
                                Log.m105924i(remuxBackgroundWork.f282735o, "getVideoParamFromByte");
                                Parcel obtain = Parcel.obtain();
                                C87412m.m108593f(obtain, "obtain()");
                                obtain.unmarshall(bArr, 0, bArr.length);
                                obtain.setDataPosition(0);
                                VideoTransPara createFromParcel = VideoTransPara.CREATOR.createFromParcel(obtain);
                                obtain.recycle();
                                C87412m.m108593f(createFromParcel, "param");
                                int b = remuxBackgroundWork.f338327e.f338337b.mo165522b("KEY_EXPORT_ABA_FLAG", 0);
                                int b2 = remuxBackgroundWork.f338327e.f338337b.mo165522b("KEY_EXPORT_TARGET_VIDEO_BITRATE", 0);
                                int b3 = remuxBackgroundWork.f338327e.f338337b.mo165522b("KEY_EXPORT_TEC_SCENE", 0);
                                Log.m105924i(remuxBackgroundWork.f282735o, "getEncodeFromDB");
                                C97882i.C97883a aVar4 = new C97882i.C97883a(h0Var.field_encode_target_width, h0Var.field_encode_target_height, h0Var.field_encode_video_bitrate, 0, h0Var.field_encode_frame_rate, h0Var.field_source_video_rotate, 0, 0, false, false, 0, 0, h0Var.field_encode_qp_switch, 4040, (C8480h) null);
                                String str7 = h0Var.field_output_video_path;
                                RecordConfigProvider recordConfigProvider = new RecordConfigProvider();
                                recordConfigProvider.f272926n = createFromParcel;
                                recordConfigProvider.f272901B = str7;
                                recordConfigProvider.f272905F = 2;
                                C92351h.f264261a.mo126331c(zyVar, recordConfigProvider, b3, aVar4, b, b2, aVar2, str2);
                            } catch (IOException unused) {
                                Log.m105920e(remuxBackgroundWork.f282735o, "parse byte error");
                                Result.Companion companion4 = Result.Companion;
                                hVar.resumeWith(Result.m168114constructorimpl(new ListenableWorker.C113032a.C113033a()));
                            }
                        }
                    }
                }
                Object b4 = hVar.mo90314b();
                return b4 == aVar ? aVar : b4;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemuxBackgroundWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(workerParameters, "workerParameters");
    }

    /* renamed from: i */
    public static final C13604l m123918i(RemuxBackgroundWork remuxBackgroundWork, String str) {
        remuxBackgroundWork.getClass();
        if (str == null || str.length() == 0) {
            Log.m105920e(remuxBackgroundWork.f282735o, "before start work, workTagId is 0");
            return new C13604l(Boolean.FALSE, null);
        }
        C102651h0 d = C97826d.f286974a.mo137161d(str);
        if (d != null) {
            return new C13604l(Boolean.TRUE, d);
        }
        String str2 = remuxBackgroundWork.f282735o;
        Log.m105920e(str2, "no find work in db >> " + str);
        return new C13604l(Boolean.FALSE, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0198, code lost:
        if (r2 != 4009) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x00a7, code lost:
        r4 = r4.toString();
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m123919j(com.tencent.p014mm.plugin.vlog.p117ui.video.remux.work.RemuxBackgroundWork r39, int r40, int r41, java.lang.String r42, p749xh.C102651h0 r43) {
        /*
            r0 = r39
            r6 = r40
            r1 = r41
            r7 = r42
            r8 = r43
            r39.getClass()
            int r2 = r8.field_work_type
            java.lang.String r3 = r0.f282735o
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "dealWhenRemuxFinish >> workType: "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = ", remuxResultCode: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ", workTagId: "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r9 = ", lastWorkType: "
            r4.append(r9)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "reportWorkFinish >> "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = ", "
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.FakeVideoTecReporter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct r3 = new com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct
            r3.<init>()
            r11 = 3
            r3.f266021d = r11
            java.lang.String r4 = r8.field_work_id
            java.lang.String r12 = "WorkId"
            r13 = 1
            java.lang.String r4 = r3.mo86045b(r12, r4, r13)
            r3.f266022e = r4
            int r4 = r8.field_work_type
            r3.f266024g = r4
            r3.f266023f = r1
            long r14 = r8.field_confirm_remux_time_stamp
            r3.f266026i = r14
            long r14 = r8.field_confirm_publish_video_time_stamp
            r3.f266027j = r14
            long r14 = r8.field_start_remux_time_stamp
            r3.f266028k = r14
            r3.f266029l = r9
            r3.f266025h = r6
            int r4 = r8.field_is_sns_double_check
            r3.f266032o = r4
            int r4 = r8.field_is_killed_process_restart
            r3.f266034q = r4
            int r4 = r8.field_tec_enter_scene
            r3.f266035r = r4
            r12 = 4007(0xfa7, float:5.615E-42)
            if (r6 != r12) goto L_0x00c1
            java.lang.String r4 = r8.field_output_video_path
            com.tencent.mm.plugin.sight.base.a r4 = com.tencent.p014mm.plugin.sight.base.C94555d.m119567c(r4, r13)
            if (r4 == 0) goto L_0x00b7
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L_0x00b7
            r14 = 0
            java.lang.String r15 = ","
            java.lang.String r11 = ";"
            java.lang.String r4 = z04.C112551y.m153814n(r4, r15, r11, r14)
            goto L_0x00b9
        L_0x00b7:
            java.lang.String r4 = ""
        L_0x00b9:
            java.lang.String r11 = "MixVideoInfo"
            java.lang.String r4 = r3.mo86045b(r11, r4, r13)
            r3.f266033p = r4
        L_0x00c1:
            int r4 = r8.field_encode_target_width
            int r11 = r8.field_encode_target_height
            int r14 = r8.field_encode_video_bitrate
            int r15 = r8.field_encode_qp_switch
            int r12 = r8.field_source_video_rotate
            int r13 = r8.field_encode_frame_rate
            fh2.i$a r32 = new fh2.i$a
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 4040(0xfc8, float:5.661E-42)
            r31 = 0
            r16 = r32
            r17 = r4
            r18 = r11
            r19 = r14
            r21 = r13
            r22 = r12
            r29 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.String r33 = r32.toString()
            r36 = 0
            r37 = 4
            r38 = 0
            java.lang.String r34 = ","
            java.lang.String r35 = ";"
            java.lang.String r4 = z04.C112551y.m153816p(r33, r34, r35, r36, r37, r38)
            java.lang.String r11 = "EncodeConfig"
            r12 = 1
            java.lang.String r4 = r3.mo86045b(r11, r4, r12)
            r3.f266031n = r4
            r3.mo86054n()
            f33.d r3 = f33.C97826d.f286974a
            java.lang.String r4 = "workTagId"
            gy3.C87412m.m108594g(r7, r4)
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r3.mo137158a()
            com.tencent.mm.sdk.storage.sql.SingleTable r4 = p749xh.C102651h0.f302391Q
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r40)
            java.lang.String r12 = "work_type"
            r4.put(r12, r11)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r41)
            java.lang.String r11 = "work_code"
            r4.put(r11, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            java.lang.String r11 = "remux_success_time_stamp"
            r4.put(r11, r1)
            com.tencent.mm.sdk.storage.sql.Column r1 = p749xh.C102651h0.f302393R
            com.tencent.mm.sdk.storage.sql.SingleCondition r1 = r1.equal((java.lang.String) r7)
            com.tencent.mm.sdk.storage.sql.SingleTable r11 = p749xh.C102651h0.f302391Q
            com.tencent.mm.sdk.storage.sql.UpdateSql$Builder r4 = r11.update((android.content.ContentValues) r4)
            com.tencent.mm.sdk.storage.sql.UpdateSql$Builder r1 = r4.where(r1)
            com.tencent.mm.sdk.storage.sql.UpdateSql r1 = r1.build()
            int r1 = r1.run(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "updateWorkResult >> workTagId: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r4 = ", workType: "
            r3.append(r4)
            r3.append(r6)
            r3.append(r5)
            r3.append(r7)
            java.lang.String r4 = ", finishMuxTimeStamp: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r4 = ", result: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "MicroMsg，BackgroundVideoInfoStorageManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            r1 = 4001(0xfa1, float:5.607E-42)
            if (r2 == r1) goto L_0x01ef
            r1 = 4006(0xfa6, float:5.614E-42)
            if (r2 == r1) goto L_0x019b
            r1 = 4009(0xfa9, float:5.618E-42)
            if (r2 == r1) goto L_0x01ef
            goto L_0x020b
        L_0x019b:
            java.lang.String r0 = r0.f282735o
            java.lang.String r1 = "fake video is confirm to publish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.Class<hy.n0> r0 = p166hy.C98566n0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            hy.n0 r0 = (p166hy.C98566n0) r0
            int r1 = r8.field_sns_local_id
            java.lang.String r2 = r8.field_output_video_path
            java.lang.String r3 = r8.field_output_thumb_path
            byte[] r4 = r8.field_sns_ext_info
            java.lang.String r5 = "field_output_video_path"
            gy3.C87412m.m108593f(r2, r5)
            java.lang.String r5 = "field_output_thumb_path"
            gy3.C87412m.m108593f(r3, r5)
            java.lang.String r5 = "field_sns_ext_info"
            gy3.C87412m.m108593f(r4, r5)
            r5 = r40
            r0.Yf0(r1, r2, r3, r4, r5)
            java.lang.Class<hy.t0> r0 = p166hy.C98568t0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r16 = r0
            hy.t0 r16 = (p166hy.C98568t0) r16
            r0 = 4007(0xfa7, float:5.615E-42)
            if (r6 != r0) goto L_0x01d7
            r17 = 3
            goto L_0x01da
        L_0x01d7:
            r11 = 4
            r17 = 4
        L_0x01da:
            java.lang.String r0 = r8.field_post_session_id
            java.lang.String r1 = "dbResult.field_post_session_id"
            gy3.C87412m.m108593f(r0, r1)
            long r1 = r8.field_confirm_publish_video_time_stamp
            long r19 = r9 - r1
            long r1 = r8.field_confirm_remux_time_stamp
            long r21 = r9 - r1
            r18 = r0
            r16.r00(r17, r18, r19, r21)
            goto L_0x020b
        L_0x01ef:
            java.lang.String r0 = r0.f282735o
            java.lang.String r1 = "video is still in publish page"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.autogen.events.VideoBackgroundRemuxResultEventEvent r0 = new com.tencent.mm.autogen.events.VideoBackgroundRemuxResultEventEvent
            r0.<init>()
            com.tencent.mm.autogen.events.VideoBackgroundRemuxResultEventEvent$a r1 = r0.f265253d
            r1.f265254a = r6
            r1.f265255b = r7
            long r2 = r8.field_confirm_remux_time_stamp
            long r9 = r9 - r2
            int r2 = (int) r9
            r1.f265256c = r2
            r0.publish()
        L_0x020b:
            g33.a r0 = g33.C98080a.f287548a
            r0.mo137372a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.video.remux.work.RemuxBackgroundWork.m123919j(com.tencent.mm.plugin.vlog.ui.video.remux.work.RemuxBackgroundWork, int, int, java.lang.String, xh.h0):void");
    }

    /* renamed from: h */
    public Object mo134652h(C15601d<? super ListenableWorker.C113032a> dVar) {
        return C53895h.m60469g(C53872d1.f151119c, new C96582a(this, (C15601d<? super C96582a>) null), dVar);
    }
}
