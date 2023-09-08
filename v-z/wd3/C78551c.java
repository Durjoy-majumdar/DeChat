package wd3;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: wd3.c */
public class C78551c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C78545b f230091d;

    public C78551c(C78545b bVar) {
        this.f230091d = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105920e("MicroMsg.AddContactDialog", "doAddContact fail, contact not biz");
        this.f230091d.mo108515b(-1);
    }
}
