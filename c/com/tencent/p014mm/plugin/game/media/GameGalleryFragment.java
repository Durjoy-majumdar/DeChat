package com.tencent.p014mm.plugin.game.media;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.game.media.GameGalleryFragment */
public class GameGalleryFragment extends HellAndroidXFragment {

    /* renamed from: d */
    public View f162843d;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.m105924i("MicroMsg.GameGalleryFragment", "onCreateView");
        View view = this.f162843d;
        return view != null ? view : layoutInflater.inflate(0, viewGroup);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Log.m105924i("MicroMsg.GameGalleryFragment", "onViewCreated");
    }
}
