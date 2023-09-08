package c33;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import android.os.Bundle;
import androidx.work.C113041b;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.vlog.p117ui.video.remux.work.RemuxBackgroundWork;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f33.C97825c;
import fh2.C97882i;
import fy3.C32227p;
import g33.C98080a;
import gy3.C8479f0;
import gy3.C87412m;
import h90.C98324b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.ResultKt;
import p1014o4.C100279o;
import p1206p4.C117979k;
import p749xh.C102651h0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.VideoBackgroundRemuxChain$dealBackgroundWork$3", mo125469f = "VideoBackgroundRemuxChain.kt", mo125470l = {220}, mo125471m = "invokeSuspend")
/* renamed from: c33.b */
public final class C92337b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f264204d;

    /* renamed from: e */
    public int f264205e;

    /* renamed from: f */
    public final /* synthetic */ String f264206f;

    /* renamed from: g */
    public final /* synthetic */ RecordConfigProvider f264207g;

    /* renamed from: h */
    public final /* synthetic */ int f264208h;

    /* renamed from: i */
    public final /* synthetic */ int f264209i;

    /* renamed from: j */
    public final /* synthetic */ String f264210j;

    /* renamed from: n */
    public final /* synthetic */ C92338c f264211n;

    /* renamed from: o */
    public final /* synthetic */ C97882i.C97883a f264212o;

    /* renamed from: p */
    public final /* synthetic */ C8479f0<byte[]> f264213p;

    /* renamed from: q */
    public final /* synthetic */ C8479f0<byte[]> f264214q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92337b(String str, RecordConfigProvider recordConfigProvider, int i, int i2, String str2, C92338c cVar, C97882i.C97883a aVar, C8479f0<byte[]> f0Var, C8479f0<byte[]> f0Var2, C15601d<? super C92337b> dVar) {
        super(2, dVar);
        this.f264206f = str;
        this.f264207g = recordConfigProvider;
        this.f264208h = i;
        this.f264209i = i2;
        this.f264210j = str2;
        this.f264211n = cVar;
        this.f264212o = aVar;
        this.f264213p = f0Var;
        this.f264214q = f0Var2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C92337b(this.f264206f, this.f264207g, this.f264208h, this.f264209i, this.f264210j, this.f264211n, this.f264212o, this.f264213p, this.f264214q, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C92337b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i2 = this.f264205e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105924i("MicroMsg.VideoBackgroundRemuxChain", "dealBackgroundWork >> workTagId: " + this.f264206f + ", confirmEditTimeStamp: " + currentTimeMillis);
            Bundle bundle = this.f264207g.f272912M;
            boolean z = false;
            int i3 = bundle != null ? bundle.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 0) : 0;
            C102651h0 h0Var = new C102651h0();
            String str = this.f264206f;
            RecordConfigProvider recordConfigProvider = this.f264207g;
            String str2 = this.f264210j;
            C92338c cVar = this.f264211n;
            C97882i.C97883a aVar2 = this.f264212o;
            int i4 = this.f264208h;
            C8479f0<byte[]> f0Var = this.f264213p;
            C8479f0<byte[]> f0Var2 = this.f264214q;
            h0Var.field_work_id = str;
            h0Var.field_work_type = 4001;
            h0Var.field_work_code = -1;
            h0Var.field_source_video_path = recordConfigProvider.f272900A;
            h0Var.field_output_video_path = recordConfigProvider.f272901B;
            h0Var.field_output_thumb_path = recordConfigProvider.f272902C;
            if (str2 == null) {
                str2 = "";
            }
            h0Var.field_music_path = str2;
            C98324b bVar = cVar.f264216c;
            if (bVar != null) {
                z = bVar.f288182c;
            }
            h0Var.field_is_capture_video = z;
            h0Var.field_is_change = aVar2.f287160j;
            h0Var.field_is_save_source_media = recordConfigProvider.f272937y;
            h0Var.field_is_sava_to_sys_album_if_media_edited = recordConfigProvider.f272938z;
            h0Var.field_aba_target_bitrate = i4;
            h0Var.field_source_video_rotate = aVar2.f287156f;
            h0Var.field_encode_target_height = aVar2.f287152b;
            h0Var.field_encode_target_width = aVar2.f287151a;
            h0Var.field_encode_video_bitrate = aVar2.f287153c;
            h0Var.field_encode_frame_rate = aVar2.f287155e;
            h0Var.field_encode_qp_switch = aVar2.f287163m;
            VideoTransPara videoTransPara = recordConfigProvider.f272926n;
            h0Var.field_video_param_preset_index = videoTransPara.f267177r;
            h0Var.field_video_param_profile_index = videoTransPara.f267176q;
            h0Var.field_composition_info = (byte[]) f0Var.f27484d;
            h0Var.field_video_param = (byte[]) f0Var2.f27484d;
            h0Var.field_confirm_remux_time_stamp = currentTimeMillis;
            h0Var.field_is_killed_process_restart = 2;
            h0Var.field_tec_enter_scene = i3;
            this.f264204d = i3;
            this.f264205e = 1;
            Object g = C53895h.m60469g(C53872d1.f151119c, new C97825c(h0Var, (C15601d<? super C97825c>) null), this);
            if (g != aVar) {
                g = C13598b0.f38549a;
            }
            if (g == aVar) {
                return aVar;
            }
            i = i3;
        } else if (i2 == 1) {
            i = this.f264204d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C98080a aVar3 = C98080a.f287548a;
        String str3 = this.f264206f;
        int i5 = this.f264208h;
        int i6 = this.f264209i;
        C87412m.m108594g(str3, "workTagId");
        Log.m105924i("MicroMsg.RemuxBackgroundManager", "enqueueWork >> workTagId: " + str3);
        C100279o.C100280a aVar4 = new C100279o.C100280a(RemuxBackgroundWork.class);
        HashMap hashMap = new HashMap();
        hashMap.put("KEY_EXPORT_TARGET_VIDEO_BITRATE", Integer.valueOf(i5));
        hashMap.put("KEY_EXPORT_BACKGROUND_WORK_TAG_ID", str3);
        hashMap.put("KEY_EXPORT_ABA_FLAG", Integer.valueOf(i6));
        hashMap.put("KEY_EXPORT_TEC_SCENE", Integer.valueOf(i));
        C113041b bVar2 = new C113041b((Map<String, ?>) hashMap);
        C113041b.m154668c(bVar2);
        aVar4.f293790b.f355545e = bVar2;
        ((HashSet) aVar4.f293791c).add(str3);
        C117979k.m166386b(MMApplicationContext.getContext()).mo182397a((C100279o) aVar4.mo139543a());
        String str4 = this.f264206f;
        C87412m.m108594g(str4, "workTagId");
        Log.m105924i("MicroMsg.FakeVideoTecReporter", "reportWorkEnqueue >> workTagId: " + str4);
        SnsFakeVideoLogStruct snsFakeVideoLogStruct = new SnsFakeVideoLogStruct();
        snsFakeVideoLogStruct.f266021d = 10;
        snsFakeVideoLogStruct.f266022e = snsFakeVideoLogStruct.mo86045b("WorkId", str4, true);
        snsFakeVideoLogStruct.mo86054n();
        return C13598b0.f38549a;
    }
}
