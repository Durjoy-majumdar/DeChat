package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.tencent.p014mm.plugin.finder.video.FinderLongVideoPlayerSeekBar;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import df1.C58259c;
import gr1.C59667n2;
import j20.C117292a;
import java.util.ArrayList;
import pl1.C62367r0;

/* renamed from: com.tencent.mm.plugin.finder.view.r6 */
public final class C4166r6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLongVideoPlayerSeekBar f18399d;

    /* renamed from: e */
    public final /* synthetic */ FinderThumbPlayerProxy f18400e;

    /* renamed from: f */
    public final /* synthetic */ HorizontalVideoPreviewLayout f18401f;

    /* renamed from: g */
    public final /* synthetic */ FinderVideoLayout f18402g;

    public C4166r6(FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar, FinderThumbPlayerProxy finderThumbPlayerProxy, HorizontalVideoPreviewLayout horizontalVideoPreviewLayout, FinderVideoLayout finderVideoLayout) {
        this.f18399d = finderLongVideoPlayerSeekBar;
        this.f18400e = finderThumbPlayerProxy;
        this.f18401f = horizontalVideoPreviewLayout;
        this.f18402g = finderVideoLayout;
    }

    public final void onClick(View view) {
        FinderVideoLayout.C56521b playInfo;
        C58259c.C58261b videoPlayBehavior;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z = this.f18399d.f283824z;
        this.f18400e.setVideoViewFocused(!z);
        if (z) {
            C59667n2 fullSeekBar = this.f18401f.getFullSeekBar();
            if (fullSeekBar != null) {
                C59667n2.C8415a.m8377a(fullSeekBar, (String) null, false, 3, (Object) null);
            }
            this.f18400e.pause();
        } else {
            this.f18402g.setSelectedToPlay(true);
            C59667n2 fullSeekBar2 = this.f18401f.getFullSeekBar();
            if (fullSeekBar2 != null) {
                fullSeekBar2.mo4259i("HorizontalClick");
            }
            this.f18400e.play();
        }
        this.f18401f.mo4788d(!z);
        this.f18399d.setIsPlay(!z);
        if (!(!z || (playInfo = this.f18402g.getPlayInfo()) == null || (videoPlayBehavior = this.f18402g.getVideoPlayBehavior()) == null)) {
            long expectId = playInfo.f161892a.getExpectId();
            C62367r0 r0Var = playInfo.f161894c;
            videoPlayBehavior.mo83035t(expectId, r0Var.f177253e, r0Var);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachSeekBar$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
