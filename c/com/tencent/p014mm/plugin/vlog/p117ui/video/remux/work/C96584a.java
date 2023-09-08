package com.tencent.p014mm.plugin.vlog.p117ui.video.remux.work;

import androidx.work.ListenableWorker;
import bp3.C104160f;
import bp3.C79758p;
import c33.C92351h;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import g33.C98080a;
import gy3.C87412m;
import h90.C98324b;
import kotlin.Result;
import p749xh.C102651h0;
import rx3.C13604l;
import wx3.C15601d;

/* renamed from: com.tencent.mm.plugin.vlog.ui.video.remux.work.a */
public final class C96584a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RemuxBackgroundWork f282741d;

    /* renamed from: e */
    public final /* synthetic */ String f282742e;

    /* renamed from: f */
    public final /* synthetic */ C15601d<ListenableWorker.C113032a> f282743f;

    /* renamed from: g */
    public final /* synthetic */ int f282744g;

    public C96584a(RemuxBackgroundWork remuxBackgroundWork, String str, C15601d<? super ListenableWorker.C113032a> dVar, int i) {
        this.f282741d = remuxBackgroundWork;
        this.f282742e = str;
        this.f282743f = dVar;
        this.f282744g = i;
    }

    public final void run() {
        String str = this.f282741d.f282735o;
        Log.m105924i(str, "deal result in async thread >> " + this.f282742e + ", " + Thread.currentThread().getName());
        C13604l i = RemuxBackgroundWork.m123918i(this.f282741d, this.f282742e);
        boolean booleanValue = ((Boolean) i.f38555d).booleanValue();
        C102651h0 h0Var = (C102651h0) i.f38556e;
        if (!booleanValue) {
            Log.m105920e(this.f282741d.f282735o, "work result is lose");
            C15601d<ListenableWorker.C113032a> dVar = this.f282743f;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(new ListenableWorker.C113032a.C113033a()));
            C98080a.f287548a.mo137372a(this.f282742e);
            return;
        }
        RemuxBackgroundWork remuxBackgroundWork = this.f282741d;
        C87412m.m108591d(h0Var);
        remuxBackgroundWork.getClass();
        int i2 = h0Var.field_work_type;
        if (i2 == 4002 || i2 == 4004) {
            String str2 = remuxBackgroundWork.f282735o;
            Log.m105924i(str2, "dealFileByLastWorkType >> " + i2);
            C86013q1.m106447h(h0Var.field_output_video_path);
            C86013q1.m106447h(h0Var.field_output_thumb_path);
        }
        C98080a aVar = C98080a.f287548a;
        boolean z = false;
        if (C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Media_SnsBackgroundRemuxError_Int, 0) == 1) {
            z = true;
        }
        Log.m105924i("MicroMsg.RemuxBackgroundManager", "getSnsBackgroundRemuxError >> " + z);
        int i3 = this.f282744g;
        if (i3 != 0 || z) {
            String str3 = this.f282741d.f282735o;
            Log.m105920e(str3, "remux error " + this.f282744g + ", " + z);
            RemuxBackgroundWork remuxBackgroundWork2 = this.f282741d;
            int i4 = this.f282744g;
            String str4 = this.f282742e;
            C87412m.m108591d(str4);
            RemuxBackgroundWork.m123919j(remuxBackgroundWork2, WearableStatusCodes.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED, i4, str4, h0Var);
            C15601d<ListenableWorker.C113032a> dVar2 = this.f282743f;
            Result.Companion companion2 = Result.Companion;
            dVar2.resumeWith(Result.m168114constructorimpl(new ListenableWorker.C113032a.C113033a()));
            return;
        }
        RemuxBackgroundWork remuxBackgroundWork3 = this.f282741d;
        String str5 = this.f282742e;
        C15601d<ListenableWorker.C113032a> dVar3 = this.f282743f;
        C92351h hVar = C92351h.f264261a;
        boolean z2 = h0Var.field_is_save_source_media;
        boolean z3 = h0Var.field_is_sava_to_sys_album_if_media_edited;
        String str6 = h0Var.field_output_video_path;
        String str7 = h0Var.field_source_video_path;
        boolean z4 = h0Var.field_is_change;
        String str8 = h0Var.field_output_thumb_path;
        boolean z5 = h0Var.field_is_capture_video;
        C87412m.m108593f(str8, "field_output_thumb_path");
        C87412m.m108593f(str7, "field_source_video_path");
        C87412m.m108593f(str6, "field_output_video_path");
        C92351h.m116161b(hVar, z2, str8, str7, str6, z3, z5, z4, (C98324b) null, true, 128, (Object) null);
        C87412m.m108591d(str5);
        RemuxBackgroundWork.m123919j(remuxBackgroundWork3, WearableStatusCodes.UNKNOWN_CAPABILITY, i3, str5, h0Var);
        Result.Companion companion3 = Result.Companion;
        dVar3.resumeWith(Result.m168114constructorimpl(new ListenableWorker.C113032a.C113035c()));
    }
}
