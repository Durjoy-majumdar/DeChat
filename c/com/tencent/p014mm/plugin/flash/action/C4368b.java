package com.tencent.p014mm.plugin.flash.action;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.flash.action.b */
public class C4368b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f18992d;

    /* renamed from: e */
    public final /* synthetic */ String f18993e;

    /* renamed from: f */
    public final /* synthetic */ FaceFlashActionPreviewLayout f18994f;

    public C4368b(FaceFlashActionPreviewLayout faceFlashActionPreviewLayout, int i, String str) {
        this.f18994f = faceFlashActionPreviewLayout;
        this.f18992d = i;
        this.f18993e = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "click AlertDialog");
        dialogInterface.dismiss();
        this.f18994f.f18937r.mo5274K7(this.f18992d, this.f18993e);
    }
}
