package com.tencent.p014mm.plugin.sns.cover.edit;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import b62.C92177a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mediabasic.data.MediaDurationInfo;
import com.tencent.p014mm.plugin.mediabasic.data.MediaResultInfo;
import com.tencent.p014mm.plugin.mediabasic.data.MediaSingleInfo;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.AutoRegisterPluginLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import lh2.C99423d;
import qh2.C101198e;
import rr2.C101447e;
import rr2.C101451f;
import rx3.C13598b0;
import wg2.C102440a;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/cover/edit/SnsCoverImageEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/AutoRegisterPluginLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout */
public final class SnsCoverImageEditPluginLayout extends AutoRegisterPluginLayout {

    /* renamed from: n */
    public static final /* synthetic */ int f274620n = 0;

    /* renamed from: i */
    public final C101447e f274621i = new C101447e(this);

    /* renamed from: j */
    public String f274622j = "";

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1", mo125469f = "SnsCoverImageEditPluginLayout.kt", mo125470l = {66}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$a */
    public static final class C94801a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f274623d;

        /* renamed from: e */
        public Object f274624e;

        /* renamed from: f */
        public int f274625f;

        /* renamed from: g */
        public int f274626g;

        /* renamed from: h */
        public final /* synthetic */ SnsCoverImageEditPluginLayout f274627h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94801a(SnsCoverImageEditPluginLayout snsCoverImageEditPluginLayout, C15601d<? super C94801a> dVar) {
            super(2, dVar);
            this.f274627h = snsCoverImageEditPluginLayout;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
            C94801a aVar = new C94801a(this.f274627h, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
            Object invokeSuspend = ((C94801a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            CaptureDataManager captureDataManager;
            Context context;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f274626g;
            int i2 = -1;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_COVER_UPLOAD_SOURCE_INT_SYNC, 0) == 1) {
                    Log.m105924i("MicroMsg.SnsCoverImageEditPluginLayout", "debug info,post source image");
                    ArrayList arrayList = new ArrayList();
                    SnsCoverImageEditPluginLayout snsCoverImageEditPluginLayout = this.f274627h;
                    C92177a aVar2 = C92177a.IMAGE;
                    int i3 = SnsCoverImageEditPluginLayout.f274620n;
                    SnsMethodCalculate.markStartTimeMs("access$getPath$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout");
                    String str = snsCoverImageEditPluginLayout.f274622j;
                    SnsMethodCalculate.markEndTimeMs("access$getPath$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout");
                    C87412m.m108591d(str);
                    MediaSingleInfo mediaSingleInfo = r10;
                    MediaSingleInfo mediaSingleInfo2 = new MediaSingleInfo(aVar2, str, (MediaDurationInfo) null, 4, (C8480h) null);
                    arrayList.add(mediaSingleInfo);
                    CaptureDataManager captureDataManager2 = CaptureDataManager.f272890c;
                    Context context2 = this.f274627h.getContext();
                    if (arrayList.size() <= 0) {
                        z = false;
                    }
                    captureDataManager2.mo129795b(context2, -1, new MediaResultInfo(z, arrayList, (Bundle) null));
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
                    return b0Var;
                }
                captureDataManager = CaptureDataManager.f272890c;
                Context context3 = this.f274627h.getContext();
                SnsCoverImageEditPluginLayout snsCoverImageEditPluginLayout2 = this.f274627h;
                SnsMethodCalculate.markStartTimeMs("access$getPreviewPlugin$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout");
                C101447e eVar = snsCoverImageEditPluginLayout2.f274621i;
                SnsMethodCalculate.markEndTimeMs("access$getPreviewPlugin$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout");
                this.f274623d = captureDataManager;
                this.f274624e = context3;
                this.f274625f = -1;
                this.f274626g = 1;
                eVar.getClass();
                SnsMethodCalculate.markStartTimeMs("exportCoverImage", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                obj2 = C53895h.m60469g(C53872d1.f151119c, new C101451f(eVar, (C15601d<? super C101451f>) null), this);
                SnsMethodCalculate.markEndTimeMs("exportCoverImage", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                if (obj2 == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
                    return aVar;
                }
                context = context3;
            } else if (i == 1) {
                i2 = this.f274625f;
                context = (Context) this.f274624e;
                captureDataManager = (CaptureDataManager) this.f274623d;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
                throw illegalStateException;
            }
            captureDataManager.mo129795b(context, i2, (MediaResultInfo) obj2);
            SnsReportHelper.f275506m0.mo131343D().f265984e = 1;
            SnsReportHelper.f275506m0.mo131342C().f265979e = 1;
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$statusChange$1");
            return b0Var2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsCoverImageEditPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f7106yg, this, true);
        C99423d dVar = new C99423d(this, "back-plugin");
        C101198e.C101199b bVar = C101198e.C101199b.BACK_RECORD;
        dVar.mo138862x(C0966R.C0970id.but, bVar);
        new C99423d(this, "back-plugin").mo138862x(C0966R.C0970id.jsh, bVar);
        new C99423d(this, "finish-plugin").mo138862x(C0966R.C0970id.f357805bv1, C101198e.C101199b.EDIT_START_MUX);
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        SnsMethodCalculate.markStartTimeMs("initLogic", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout");
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        super.mo128671k(aVar, recordConfigProvider);
        this.f274622j = recordConfigProvider.f272903D;
        SnsMethodCalculate.markEndTimeMs("initLogic", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r9 != 144) goto L_0x0055;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14585p(qh2.C101198e.C101199b r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.String r10 = "statusChange"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r0)
            java.lang.String r1 = "status"
            gy3.C87412m.m108594g(r9, r1)
            int r9 = r9.ordinal()
            r1 = 29
            if (r9 == r1) goto L_0x003e
            r1 = 62
            if (r9 == r1) goto L_0x001f
            r1 = 144(0x90, float:2.02E-43)
            if (r9 == r1) goto L_0x003e
            goto L_0x0055
        L_0x001f:
            rr2.e r9 = r8.f274621i
            r9.getClass()
            java.lang.String r9 = "isExportIng"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            r3 = 0
            r4 = 0
            com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$a r5 = new com.tencent.mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout$a
            r9 = 0
            r5.<init>(r8, r9)
            r6 = 3
            r7 = 0
            r2 = r8
            a14.C53895h.m60466d(r2, r3, r4, r5, r6, r7)
            goto L_0x0055
        L_0x003e:
            java.lang.String r9 = "finishPageWithCancel"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r0)
            android.content.Context r1 = r8.getContext()
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI"
            gy3.C87412m.m108592e(r1, r2)
            com.tencent.mm.plugin.recordvideo.activity.MMRecordUI r1 = (com.tencent.p014mm.plugin.recordvideo.activity.MMRecordUI) r1
            r1.mo129783I7()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r0)
        L_0x0055:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.cover.edit.SnsCoverImageEditPluginLayout.mo14585p(qh2.e$b, android.os.Bundle):void");
    }
}
