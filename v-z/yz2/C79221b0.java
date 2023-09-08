package yz2;

import com.tencent.p014mm.plugin.thumbplayer.view.MMTPEffectVideoLayout;
import j03.C60695a;
import nc3.C34767b;

/* renamed from: yz2.b0 */
public final class C79221b0 implements C34767b.C21622a {

    /* renamed from: a */
    public final /* synthetic */ C79284y f232593a;

    public C79221b0(C79284y yVar) {
        this.f232593a = yVar;
    }

    /* renamed from: a */
    public void mo17997a(boolean z) {
        C60695a player;
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f232593a.f232742I;
        if (mMTPEffectVideoLayout != null && (player = mMTPEffectVideoLayout.getPlayer()) != null) {
            player.setMute(true);
        }
    }

    public void onResume() {
        C60695a player;
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f232593a.f232742I;
        if (mMTPEffectVideoLayout != null && (player = mMTPEffectVideoLayout.getPlayer()) != null) {
            player.setMute(false);
        }
    }

    public void onStop() {
        C60695a player;
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.f232593a.f232742I;
        if (mMTPEffectVideoLayout != null && (player = mMTPEffectVideoLayout.getPlayer()) != null) {
            player.setMute(true);
        }
    }
}
