package xv2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.plugin.story.api.AbsStoryGallery;
import com.tencent.p014mm.plugin.story.api.AbsStoryHeaderTipView;
import com.tencent.p014mm.plugin.story.api.AbsStoryMuteView;

/* renamed from: xv2.m */
public interface C79005m {

    /* renamed from: xv2.m$a */
    public enum C79006a {
        SelfTabGallery,
        SelfGallery,
        ProfileGallery,
        SingleGallery,
        MultiUserGallery,
        HistoryGallery,
        FavSelfStoryGallery,
        FavOtherStoryGallery,
        FavSelfStoryGalleryMulti
    }

    /* renamed from: P5 */
    MMFragment mo108964P5(Context context, Bundle bundle);

    /* renamed from: a */
    AbsStoryMuteView mo108965a(Context context);

    /* renamed from: b */
    void mo108966b(ViewGroup viewGroup, View view, int i, int i2);

    /* renamed from: c */
    void mo108967c(View view);

    /* renamed from: d */
    AbsStoryGallery mo108968d(Context context, C79006a aVar, String str);

    /* renamed from: e */
    void mo108969e(View view);

    /* renamed from: f */
    AbsStoryHeaderTipView mo108970f(Context context);
}
