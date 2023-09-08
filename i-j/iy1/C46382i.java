package iy1;

import android.text.Layout;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI;
import gy3.C87412m;
import java.util.Map;
import rx3.C13604l;

/* renamed from: iy1.i */
public final class C46382i implements C74974a.C74977c {

    /* renamed from: a */
    public final /* synthetic */ PostCommentDialogUI f124977a;

    public C46382i(PostCommentDialogUI postCommentDialogUI) {
        this.f124977a = postCommentDialogUI;
    }

    /* renamed from: a */
    public void mo71794a(int i, int i2, Layout layout) {
        if (i <= i2) {
            for (Map.Entry next : this.f124977a.f113138D.f113165e.entrySet()) {
                if (i <= ((Number) ((C13604l) next.getValue()).f38555d).intValue() || i > ((Number) ((C13604l) next.getValue()).f38556e).intValue()) {
                    if (i2 > ((Number) ((C13604l) next.getValue()).f38555d).intValue() && i2 <= ((Number) ((C13604l) next.getValue()).f38556e).intValue()) {
                        MMEditText mMEditText = this.f124977a.f113142e;
                        if (mMEditText != null) {
                            mMEditText.setSelection(i, ((Number) ((C13604l) next.getValue()).f38555d).intValue());
                            return;
                        } else {
                            C87412m.m108603p("gameCommentInputTxt");
                            throw null;
                        }
                    }
                } else if (i == i2) {
                    int intValue = ((Number) ((C13604l) next.getValue()).f38556e).intValue();
                    MMEditText mMEditText2 = this.f124977a.f113142e;
                    if (mMEditText2 == null) {
                        C87412m.m108603p("gameCommentInputTxt");
                        throw null;
                    } else if (intValue <= mMEditText2.getText().length()) {
                        MMEditText mMEditText3 = this.f124977a.f113142e;
                        if (mMEditText3 != null) {
                            mMEditText3.setSelection(intValue);
                            return;
                        } else {
                            C87412m.m108603p("gameCommentInputTxt");
                            throw null;
                        }
                    } else {
                        return;
                    }
                } else {
                    MMEditText mMEditText4 = this.f124977a.f113142e;
                    if (mMEditText4 != null) {
                        mMEditText4.setSelection(((Number) ((C13604l) next.getValue()).f38556e).intValue(), i2);
                        return;
                    } else {
                        C87412m.m108603p("gameCommentInputTxt");
                        throw null;
                    }
                }
            }
        }
    }
}
