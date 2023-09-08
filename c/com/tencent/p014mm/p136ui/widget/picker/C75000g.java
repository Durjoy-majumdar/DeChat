package com.tencent.p014mm.p136ui.widget.picker;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.widget.picker.C19877i;

/* renamed from: com.tencent.mm.ui.widget.picker.g */
public class C75000g implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C19877i f220681d;

    public C75000g(C19877i iVar) {
        this.f220681d = iVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C19877i.C19878a aVar = this.f220681d.f56638o;
        if (aVar != null) {
            aVar.onResult(false, 0, 0, 0);
        }
        this.f220681d.mo26532b();
    }
}
