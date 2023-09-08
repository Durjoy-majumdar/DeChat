package com.tencent.p014mm.plugin.sns.cover.edit;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewPropertyAnimator;
import b62.C92178b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.mediabasic.data.MediaDurationInfo;
import com.tencent.p014mm.plugin.mediabasic.data.MediaResultInfo;
import com.tencent.p014mm.plugin.mediabasic.data.MediaSingleInfo;
import com.tencent.p014mm.plugin.recordvideo.activity.MMRecordUI;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.AutoRegisterPluginLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import f72.C97842b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j03.C60695a;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import lh2.C99417a;
import lh2.C99423d;
import qh2.C101198e;
import rr2.C101439a;
import rr2.C101452g;
import rr2.C101456i;
import rr2.C101457j;
import rx3.C13598b0;
import wh2.C102446b;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/cover/edit/SnsCoverVideoEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/AutoRegisterPluginLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout */
public final class SnsCoverVideoEditPluginLayout extends AutoRegisterPluginLayout {

    /* renamed from: o */
    public static final /* synthetic */ int f274628o = 0;

    /* renamed from: i */
    public final C99417a f274629i;

    /* renamed from: j */
    public final C101452g f274630j = new C101452g(this);

    /* renamed from: n */
    public final C101457j f274631n;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2", mo125469f = "SnsCoverVideoEditPluginLayout.kt", mo125470l = {80}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$a */
    public static final class C94802a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f274632d;

        /* renamed from: e */
        public int f274633e;

        /* renamed from: f */
        public final /* synthetic */ SnsCoverVideoEditPluginLayout f274634f;

        /* renamed from: com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$a$a */
        public static final class C57347a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public static final C57347a f164320d = new C57347a();

            public C57347a() {
                super(0);
            }

            public Object invoke() {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2$loading$1$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2$loading$1$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2$loading$1$1");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2$loading$1$1");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94802a(SnsCoverVideoEditPluginLayout snsCoverVideoEditPluginLayout, C15601d<? super C94802a> dVar) {
            super(2, dVar);
            this.f274634f = snsCoverVideoEditPluginLayout;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
            C94802a aVar = new C94802a(this.f274634f, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
            Object invokeSuspend = ((C94802a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            C102446b bVar;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f274633e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SnsCoverVideoEditPluginLayout snsCoverVideoEditPluginLayout = this.f274634f;
                int i2 = SnsCoverVideoEditPluginLayout.f274628o;
                SnsMethodCalculate.markStartTimeMs("access$getPreviewPlugin$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
                C101452g gVar = snsCoverVideoEditPluginLayout.f274630j;
                SnsMethodCalculate.markEndTimeMs("access$getPreviewPlugin$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
                gVar.onPause();
                C102446b bVar2 = new C102446b();
                Context context = this.f274634f.getContext();
                C87412m.m108593f(context, "context");
                bVar2.mo142015b(context, false, C0966R.string.i3k, C57347a.f164320d);
                SnsCoverVideoEditPluginLayout snsCoverVideoEditPluginLayout2 = this.f274634f;
                SnsMethodCalculate.markStartTimeMs("access$getExportPlugin$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
                C101457j jVar = snsCoverVideoEditPluginLayout2.f274631n;
                SnsMethodCalculate.markEndTimeMs("access$getExportPlugin$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
                this.f274632d = bVar2;
                this.f274633e = 1;
                Object x = jVar.mo140959x(this);
                if (x == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
                    return aVar;
                }
                bVar = bVar2;
                obj = x;
            } else if (i == 1) {
                bVar = (C102446b) this.f274632d;
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
                throw illegalStateException;
            }
            MediaResultInfo mediaResultInfo = (MediaResultInfo) obj;
            Log.m105924i("MicroMsg.SnsCoverVideoEditPluginLayout", "Export Result:" + mediaResultInfo);
            bVar.mo142014a();
            CaptureDataManager.f272890c.mo129795b(this.f274634f.getContext(), -1, mediaResultInfo);
            SnsReportHelper.f275506m0.mo131343D().f265984e = 2;
            SnsReportHelper.f275506m0.mo131342C().f265979e = 2;
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
            return b0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsCoverVideoEditPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f7107yi, this, true);
        C99423d dVar = new C99423d(this, "close-plugin");
        dVar.mo138862x(C0966R.C0970id.but, C101198e.C101199b.BACK_RECORD);
        this.f274629i = dVar;
        new C101439a(this);
        this.f274631n = new C101457j(this);
        new C99423d(this, "finish-plugin").mo138862x(C0966R.C0970id.f357805bv1, C101198e.C101199b.EDIT_START_MUX);
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        ViewPropertyAnimator duration;
        C101198e.C101199b bVar2 = bVar;
        Bundle bundle2 = bundle;
        SnsMethodCalculate.markStartTimeMs("statusChange", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
        C87412m.m108594g(bVar2, "status");
        Log.m105924i("MicroMsg.SnsCoverVideoEditPluginLayout", "statusChange :" + bVar2);
        int ordinal = bVar.ordinal();
        if (ordinal != 29) {
            if (ordinal == 53) {
                this.f274629i.setVisibility(4);
                C101452g gVar = this.f274630j;
                gVar.getClass();
                SnsMethodCalculate.markStartTimeMs("showCropScaleAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                int width = gVar.mo140954y().getWidth();
                int height = gVar.mo140954y().getHeight();
                int b = C76577a.m92151b(gVar.mo140953x(), 20) + C76577a.m92151b(gVar.mo140953x(), 95) + C76577a.m92151b(gVar.mo140953x(), 12);
                if (C75044y4.m89992d(gVar.mo140953x())) {
                    b += C75044y4.m89991c(gVar.mo140953x());
                }
                int i = height - b;
                if (gVar.mo140954y().getBottom() < C97842b.m126290g(gVar.mo140953x()).y) {
                    i = (int) (((float) (width - (C76577a.m92151b(gVar.mo140953x(), 32) * 2))) / (((float) width) / ((float) height)));
                }
                float f = (float) width;
                float f2 = (float) height;
                float f3 = (float) i;
                float A = ((((float) ((int) ((f / f2) * f3))) / f) * ((float) C76577a.m92145A(gVar.mo140953x()))) / f;
                ViewPropertyAnimator translationY = gVar.mo140954y().animate().scaleX(A).scaleY(((f3 / f2) * ((float) C76577a.m92145A(gVar.mo140953x()))) / f).translationY(-(((float) Math.abs(b)) / 2.0f));
                if (!(translationY == null || (duration = translationY.setDuration(300)) == null)) {
                    duration.setListener(new C101456i(gVar));
                }
                SnsMethodCalculate.markEndTimeMs("showCropScaleAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
            } else if (ordinal != 55) {
                if (ordinal != 62) {
                    if (ordinal != 144) {
                        switch (ordinal) {
                            case 57:
                                this.f274630j.onPause();
                                break;
                            case 58:
                                this.f274630j.onResume();
                                break;
                            case 59:
                            case 60:
                                this.f274629i.setVisibility(0);
                                C101452g gVar2 = this.f274630j;
                                gVar2.getClass();
                                SnsMethodCalculate.markStartTimeMs("showNormalAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                                gVar2.mo140954y().animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(300);
                                SnsMethodCalculate.markEndTimeMs("showNormalAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                                break;
                        }
                    }
                } else {
                    C53895h.m60466d(this, (C66212f) null, (C53934p0) null, new C94802a(this, (C15601d<? super C94802a>) null), 3, (Object) null);
                }
            } else if (bundle2 != null) {
                int i2 = bundle2.getInt("EDIT_CROP_VIDEO_LENGTH_START_TIME_INT");
                int i3 = bundle2.getInt("EDIT_CROP_VIDEO_LENGTH_END_TIME_INT");
                Log.m105924i("MicroMsg.SnsCoverVideoEditPluginLayout", "set crop range:[" + i2 + ' ' + i3 + ']');
                C101452g gVar3 = this.f274630j;
                gVar3.getClass();
                SnsMethodCalculate.markStartTimeMs("setPlayRange", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                C60695a player = gVar3.mo140954y().getPlayer();
                if (player != null) {
                    player.mo85603a((long) i2, (long) i3);
                }
                SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                C60695a player2 = gVar3.mo140954y().getPlayer();
                if (player2 != null) {
                    C60695a.C60696a.m70999b(player2, i2, false, (C32226l) null, 6, (Object) null);
                }
                SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                SnsMethodCalculate.markEndTimeMs("setPlayRange", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                C101457j jVar = this.f274631n;
                long j = (long) i2;
                long j2 = (long) i3;
                jVar.getClass();
                SnsMethodCalculate.markStartTimeMs("setTimeCropRange", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin");
                C92178b bVar3 = jVar.f297126f;
                if (bVar3 == null || jVar.f297127g == null) {
                    SnsMethodCalculate.markEndTimeMs("setTimeCropRange", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin");
                } else {
                    MediaSingleInfo mediaSingleInfo = bVar3.f263829a.get(0);
                    MediaDurationInfo mediaDurationInfo = new MediaDurationInfo(j, j2);
                    mediaSingleInfo.getClass();
                    mediaSingleInfo.f272125f = mediaDurationInfo;
                    SnsMethodCalculate.markEndTimeMs("setTimeCropRange", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin");
                }
            }
            SnsMethodCalculate.markEndTimeMs("statusChange", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
        }
        SnsMethodCalculate.markStartTimeMs("finishPageWithCancel", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
        Context context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
        ((MMRecordUI) context).mo129783I7();
        SnsMethodCalculate.markEndTimeMs("finishPageWithCancel", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
        SnsMethodCalculate.markEndTimeMs("statusChange", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
    }
}
