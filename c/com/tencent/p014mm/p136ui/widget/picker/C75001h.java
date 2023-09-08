package com.tencent.p014mm.p136ui.widget.picker;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.widget.picker.C19877i;

/* renamed from: com.tencent.mm.ui.widget.picker.h */
public class C75001h implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C19877i f220682d;

    public C75001h(C19877i iVar) {
        this.f220682d = iVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C19877i iVar = this.f220682d;
        iVar.f56630d = null;
        C19877i.C19878a aVar = iVar.f56638o;
        if (aVar != null) {
            aVar.onResult(false, 0, 0, 0);
        }
    }
}
