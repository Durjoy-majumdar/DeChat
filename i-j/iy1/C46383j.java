package iy1;

import android.text.Spanned;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI;
import gy3.C87412m;
import nj3.C76912y0;

/* renamed from: iy1.j */
public final class C46383j extends C45078p0 {

    /* renamed from: f */
    public final /* synthetic */ PostCommentDialogUI f124978f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46383j(PostCommentDialogUI postCommentDialogUI, int i, C45078p0.C45079a aVar) {
        super(i, aVar);
        this.f124978f = postCommentDialogUI;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        C87412m.m108594g(charSequence, FirebaseAnalytics.C113379b.SOURCE);
        String valueOf = String.valueOf(spanned);
        C45078p0.C45079a aVar = C45078p0.C45079a.MODE_CHINESE_AS_2;
        int e = C45078p0.m49926e(valueOf, aVar) + C45078p0.m49926e(charSequence.toString(), aVar);
        PostCommentDialogUI postCommentDialogUI = this.f124978f;
        if (e > postCommentDialogUI.f113140F) {
            C76912y0.m92767f(postCommentDialogUI.getContext(), this.f124978f.getString(C0966R.string.n_t));
        }
        return charSequence;
    }
}
