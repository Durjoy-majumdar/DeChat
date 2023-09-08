package p93;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view.BrowserChooseDialogView;
import gy3.C87412m;
import java.util.List;
import m93.C46973j;
import n93.C47210a;

/* renamed from: p93.b */
public final class C47437b extends C11874a {

    /* renamed from: f */
    public List<C46973j> f127252f;

    /* renamed from: g */
    public BrowserChooseDialogView f127253g;

    /* renamed from: h */
    public C47210a f127254h;

    /* renamed from: i */
    public boolean f127255i;

    public C47437b(Context context) {
        super(context);
    }

    /* renamed from: E */
    public View mo11752E() {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        BrowserChooseDialogView browserChooseDialogView = new BrowserChooseDialogView(context, (AttributeSet) null);
        this.f127253g = browserChooseDialogView;
        browserChooseDialogView.f118719j = this;
        BrowserChooseDialogView browserChooseDialogView2 = this.f127253g;
        if (browserChooseDialogView2 != null) {
            browserChooseDialogView2.setBrowserClickListener(this.f127254h);
        }
        BrowserChooseDialogView browserChooseDialogView3 = this.f127253g;
        if (browserChooseDialogView3 != null) {
            browserChooseDialogView3.setBrowserList(this.f127252f);
        }
        BrowserChooseDialogView browserChooseDialogView4 = this.f127253g;
        if (browserChooseDialogView4 != null) {
            browserChooseDialogView4.setShowBrowserSettingEntry(this.f127255i);
        }
        BrowserChooseDialogView browserChooseDialogView5 = this.f127253g;
        C87412m.m108591d(browserChooseDialogView5);
        return browserChooseDialogView5;
    }
}
