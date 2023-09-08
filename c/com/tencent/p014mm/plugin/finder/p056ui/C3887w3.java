package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import gr1.C59670o2;
import jq3.C60905o;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.finder.ui.w3 */
public final class C3887w3 implements ITPPlayerListener.IOnSeekCompleteListener {

    /* renamed from: d */
    public final /* synthetic */ FinderShareFeedRelUI f17455d;

    /* renamed from: e */
    public final /* synthetic */ long f17456e;

    /* renamed from: f */
    public final /* synthetic */ boolean f17457f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f17458g;

    public C3887w3(FinderShareFeedRelUI finderShareFeedRelUI, long j, boolean z, C60905o oVar) {
        this.f17455d = finderShareFeedRelUI;
        this.f17456e = j;
        this.f17457f = z;
        this.f17458g = oVar;
    }

    public final void onSeekComplete(ITPPlayer iTPPlayer) {
        C59670o2 videoView;
        FinderVideoLayout finderVideoLayout;
        String str = this.f17455d.f17166s;
        Log.m105924i(str, "checkSeek: onSeekComplete, feedId=" + C61926c.m72691p(this.f17456e) + ", afterSeekPlay=" + this.f17457f);
        if (!this.f17457f && (finderVideoLayout = (FinderVideoLayout) this.f17458g.mo85812D(C0966R.C0970id.d7a)) != null) {
            int i = FinderVideoLayout.f161844x0;
            finderVideoLayout.mo79540B(false);
        }
        FinderVideoLayout finderVideoLayout2 = (FinderVideoLayout) this.f17458g.mo85812D(C0966R.C0970id.d7a);
        if (finderVideoLayout2 != null && (videoView = finderVideoLayout2.getVideoView()) != null) {
            videoView.setMute(false);
        }
    }
}
