package vf1;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTestNumFormat;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import rx3.C36570n;
import tf0.C13887q1;

/* renamed from: vf1.e5 */
public final class C14757e5 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ FinderTestNumFormat f40731d;

    public C14757e5(FinderTestNumFormat finderTestNumFormat) {
        this.f40731d = finderTestNumFormat;
    }

    public void afterTextChanged(Editable editable) {
        Class cls = C13887q1.class;
        FinderTestNumFormat finderTestNumFormat = this.f40731d;
        int i = FinderTestNumFormat.f14837x;
        long safeParseLong = Util.safeParseLong(Util.nullAsNil(((MMEditText) ((C36570n) finderTestNumFormat.f14839p).getValue()).getText().toString()));
        ((TextView) ((C36570n) this.f40731d.f14840q).getValue()).setText(((C13887q1) C86312j.m106911c(cls)).Gc0(safeParseLong));
        ((TextView) ((C36570n) this.f40731d.f14841r).getValue()).setText(((C13887q1) C86312j.m106911c(cls)).mo13326Qt((int) safeParseLong));
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
