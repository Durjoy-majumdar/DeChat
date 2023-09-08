package iy1;

import android.content.Context;
import android.view.KeyEvent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import java.util.HashMap;
import nj3.C76912y0;

/* renamed from: iy1.l */
public final class C46385l implements ChatFooterPanel.C72719a {

    /* renamed from: a */
    public final /* synthetic */ ChatFooterPanel f124980a;

    /* renamed from: b */
    public final /* synthetic */ PostCommentDialogUI f124981b;

    public C46385l(ChatFooterPanel chatFooterPanel, PostCommentDialogUI postCommentDialogUI) {
        this.f124980a = chatFooterPanel;
        this.f124981b = postCommentDialogUI;
    }

    /* renamed from: a */
    public void mo64626a() {
    }

    /* renamed from: b */
    public void mo64627b(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        HashMap hashMap = new HashMap();
        hashMap.put("emoticonID", str);
        Context context = this.f124980a.getContext();
        PostCommentDialogUI postCommentDialogUI = this.f124981b;
        int i = PostCommentDialogUI.f113134G;
        postCommentDialogUI.getClass();
        C40314g.m43484c(context, 90, 9002, 1, 2, 0, C40314g.m43483b(hashMap));
        StringBuilder sb = new StringBuilder();
        MMEditText mMEditText = this.f124981b.f113142e;
        if (mMEditText != null) {
            sb.append(mMEditText.getText());
            sb.append(str);
            int e = C45078p0.m49926e(sb.toString(), C45078p0.C45079a.MODE_CHINESE_AS_2);
            PostCommentDialogUI postCommentDialogUI2 = this.f124981b;
            if (e <= postCommentDialogUI2.f113140F) {
                postCommentDialogUI2.mo65908N7(str);
            } else {
                C76912y0.m92767f(this.f124980a.getContext(), this.f124981b.getString(C0966R.string.n_t));
            }
        } else {
            C87412m.m108603p("gameCommentInputTxt");
            throw null;
        }
    }

    /* renamed from: c */
    public void mo64628c() {
        MMEditText mMEditText = this.f124981b.f113142e;
        if (mMEditText != null) {
            if (!(mMEditText.getInputConnection() == null)) {
                MMEditText mMEditText2 = this.f124981b.f113142e;
                if (mMEditText2 != null) {
                    mMEditText2.getInputConnection().sendKeyEvent(new KeyEvent(0, 67));
                    MMEditText mMEditText3 = this.f124981b.f113142e;
                    if (mMEditText3 != null) {
                        mMEditText3.getInputConnection().sendKeyEvent(new KeyEvent(1, 67));
                    } else {
                        C87412m.m108603p("gameCommentInputTxt");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("gameCommentInputTxt");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("gameCommentInputTxt");
            throw null;
        }
    }

    /* renamed from: d */
    public void mo64629d(boolean z) {
    }
}
