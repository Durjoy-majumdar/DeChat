package ow2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoView;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryVideoViewMgr;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: ow2.x */
public final class C100614x implements C96814a.C96816c {

    /* renamed from: d */
    public final /* synthetic */ StoryVideoViewMgr f294791d;

    public C100614x(StoryVideoViewMgr storyVideoViewMgr) {
        this.f294791d = storyVideoViewMgr;
    }

    public void idkeyStat(long j, long j2, long j3, boolean z) {
        long j4 = j2;
        StoryVideoViewMgr storyVideoViewMgr = this.f294791d;
        StoryVideoView storyVideoView = storyVideoViewMgr.f282150a;
        boolean z2 = false;
        if (storyVideoView != null && !storyVideoView.f282134i1) {
            z2 = true;
        }
        if (z2) {
            C115669n.INSTANCE.idkeyStat(storyVideoViewMgr.f282159j, j2, j3, z);
            if (j4 >= 141 && j4 <= 145) {
                String unused = this.f294791d.getClass();
                Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", "initCreateVideoView test key " + j2 + " value " + j3 + " currVideoItem:" + this.f294791d.f282155f + ' ' + Util.getStack());
            }
        }
    }

    public void kvStat(int i, String str) {
    }
}
