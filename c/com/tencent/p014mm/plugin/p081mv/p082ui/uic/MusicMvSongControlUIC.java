package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvSongControlUIC */
public final class MusicMvSongControlUIC extends UIComponent {

    /* renamed from: d */
    public final IListener<?> f163370d = new MusicMvSongControlUIC$musicPlayerListener$1(C40008f.f107254d);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvSongControlUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onPause() {
        this.f163370d.dead();
    }

    public void onResume() {
        this.f163370d.alive();
    }
}
