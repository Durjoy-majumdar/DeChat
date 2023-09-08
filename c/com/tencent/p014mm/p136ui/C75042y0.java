package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C57539q;
import f40.C86709a0;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.y0 */
public class C75042y0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LauncherUI f220796d;

    public C75042y0(LauncherUI launcherUI) {
        this.f220796d = launcherUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        LauncherUI launcherUI = this.f220796d;
        ArrayList<LauncherUI> arrayList = LauncherUI.f214332A;
        launcherUI.mo101379S7(true);
        LauncherUI.f214335D = false;
        C86709a0.m107529k().f251779b.mo123460f(new C57539q());
        this.f220796d.mo101380T7();
    }
}
