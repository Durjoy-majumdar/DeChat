package sp1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: sp1.h */
public final class C64092h extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ TextView f181724d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveGiftTextView f181725e;

    /* renamed from: f */
    public final /* synthetic */ View f181726f;

    public C64092h(TextView textView, FinderLiveGiftTextView finderLiveGiftTextView, View view) {
        this.f181724d = textView;
        this.f181725e = finderLiveGiftTextView;
        this.f181726f = view;
    }

    public void onAnimationEnd(Animator animator) {
        Log.m105924i("FinderLiveShopHotSellView", "sellDescContainer dismiss anim onAnimationEnd!");
        this.f181724d.setVisibility(8);
        this.f181725e.setVisibility(8);
        this.f181726f.animate().setListener((Animator.AnimatorListener) null);
    }
}
