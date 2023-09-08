package com.tencent.p014mm.plugin.p081mv.p082ui.free;

import android.content.Intent;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCreateActionStruct;
import com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper;
import com.tencent.p014mm.plugin.p081mv.p082ui.MusicMvPostUI;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.mv.ui.free.a */
public final class C56957a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C89779i0 f163122d;

    /* renamed from: e */
    public final /* synthetic */ MusicMvFreeMakerPreviewUI f163123e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56957a(C89779i0 i0Var, MusicMvFreeMakerPreviewUI musicMvFreeMakerPreviewUI) {
        super(0);
        this.f163122d = i0Var;
        this.f163123e = musicMvFreeMakerPreviewUI;
    }

    public Object invoke() {
        this.f163122d.dismiss();
        Intent intent = new Intent(this.f163123e, MusicMvPostUI.class);
        intent.putExtra("key_track_data", this.f163123e.f163116e.toByteArray());
        C61926c.m72680e(intent, this.f163123e.getIntent(), "key_mv_from_scene", 0, 4, (Object) null);
        MusicMvFreeMakerPreviewUI musicMvFreeMakerPreviewUI = this.f163123e;
        musicMvFreeMakerPreviewUI.f163117f = true;
        musicMvFreeMakerPreviewUI.startActivityForResult(intent, 7);
        MvCreateActionStruct c = MvCreateReportHelper.f163005a.mo80352c();
        c.f156552k = 7;
        c.f156543G = 0;
        c.mo86054n();
        c.mo86056r();
        return C13598b0.f38549a;
    }
}
