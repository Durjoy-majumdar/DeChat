package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.content.DialogInterface;
import f40.C86709a0;
import java.util.HashSet;
import java.util.Iterator;
import s03.C13609i;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.r */
public class C5652r implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ TopStorySettingVisibilityDetailUI f21614d;

    public C5652r(TopStorySettingVisibilityDetailUI topStorySettingVisibilityDetailUI) {
        this.f21614d = topStorySettingVisibilityDetailUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Iterator it = ((HashSet) this.f21614d.f21607s).iterator();
        while (it.hasNext()) {
            C86709a0.m107529k().f251779b.mo123458d((C13609i) it.next());
        }
    }
}
