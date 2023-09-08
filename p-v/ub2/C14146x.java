package ub2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ub2.x */
public final class C14146x implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMvCommentFooter f39577d;

    public C14146x(MusicMvCommentFooter musicMvCommentFooter) {
        this.f39577d = musicMvCommentFooter;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMvCommentFooter$initEmojiBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("Music.MusicMvCommentFooter", "commentModeIv clicked, curEditMode:" + this.f39577d.f163531g);
        MusicMvCommentFooter musicMvCommentFooter = this.f39577d;
        int i = 201;
        if (musicMvCommentFooter.f163531g == 202) {
            Log.m105924i("Music.MusicMvCommentFooter", "onlyShowVKB");
            musicMvCommentFooter.f163532h = 201;
            Context context = musicMvCommentFooter.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context).showVKB();
        } else {
            Log.m105924i("Music.MusicMvCommentFooter", "onlyShowSmilePanel");
            musicMvCommentFooter.f163532h = 202;
            Context context2 = musicMvCommentFooter.getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context2).hideVKB();
            i = 202;
        }
        musicMvCommentFooter.f163531g = i;
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentFooter$initEmojiBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
