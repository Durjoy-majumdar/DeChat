package pl3;

import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import ql3.C101206a;
import rl3.C101392a;
import rl3.C101393b;
import vl3.C102226d;

/* renamed from: pl3.c */
public final class C100823c {

    /* renamed from: a */
    public static final C100823c f295336a = new C100823c();

    /* renamed from: b */
    public static final boolean f295337b;

    static {
        boolean z = false;
        if (C102226d.f301013a != null) {
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_global_emoji_v2, false);
            Log.m105925i("MicroMsg.SmileyExtension", "enableTextViewEmojiProcess %s", Boolean.valueOf(wf));
            if (!MMApplicationContext.isAppBrandProcess()) {
                z = wf;
            }
        }
        f295337b = z;
    }

    /* renamed from: a */
    public final void mo140272a(View view, int i) {
        boolean z;
        C87412m.m108594g(view, "view");
        if (f295337b) {
            C100821a aVar = C100821a.f295333a;
            Log.m105926v("MicroMsg.EmojiProcessPreChecker", "hadInvalidInputType: view class:" + view.getClass().getCanonicalName() + ", hash:" + view.hashCode());
            if (view instanceof EditText) {
                z = aVar.mo140270a(((EditText) view).getInputType());
            } else if (view instanceof C74974a) {
                z = aVar.mo140270a(((C74974a) view).getInputType());
            } else if (view instanceof TextView) {
                z = aVar.mo140270a(((TextView) view).getInputType());
            } else {
                if (!(view instanceof MMNeat7extView)) {
                    Log.m105924i("MicroMsg.EmojiProcessPreChecker", "hadInvalidInputType: unknown view type");
                }
                z = false;
            }
            if (!z) {
                mo140273b(view, i);
            }
        }
    }

    /* renamed from: b */
    public final void mo140273b(View view, int i) {
        C87412m.m108594g(view, "view");
        if (view instanceof EditText) {
            Log.m105924i("MicroMsg.EmojiProcessTextProvider", "processViewWithoutCheck: EditText type view class name:" + view.getClass().getCanonicalName() + " hash:" + view.hashCode());
            EditText editText = (EditText) view;
            if (C101392a.f296998b == null) {
                synchronized (C101392a.f296997a) {
                    if (C101392a.f296998b == null) {
                        C101392a.f296998b = new C101392a();
                    }
                }
            }
            editText.setEditableFactory(C101392a.f296998b);
            editText.addTextChangedListener(new C101393b(view, i));
        } else if (view instanceof C74974a) {
            Log.m105924i("MicroMsg.EmojiProcessTextProvider", "processViewWithoutCheck: IEditText type view class:" + view.getClass().getCanonicalName() + " hash:" + view.hashCode());
            C74974a aVar = (C74974a) view;
            aVar.addTextChangedListener(new C101393b(aVar.view(), i));
        } else if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setFilters(new InputFilter[]{new C101206a(textView, i)});
        } else if (view instanceof MMNeat7extView) {
            MMNeat7extView mMNeat7extView = (MMNeat7extView) view;
            TextView wrappedTextView = mMNeat7extView.getWrappedTextView();
            TextView wrappedTextView2 = mMNeat7extView.getWrappedTextView();
            C87412m.m108593f(wrappedTextView2, "view.wrappedTextView");
            wrappedTextView.setFilters(new InputFilter[]{new C101206a(wrappedTextView2, i)});
        } else {
            Log.m105924i("MicroMsg.EmojiProcessTextProvider", "processView: unknown view type");
        }
    }
}
