package p93;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view.BrowserSettingDialogView;
import gy3.C87412m;
import java.util.List;
import m93.C46973j;
import n93.C47212c;

/* renamed from: p93.e */
public final class C47440e extends C11874a {

    /* renamed from: f */
    public BrowserSettingDialogView f127260f;

    /* renamed from: g */
    public C47212c f127261g;

    /* renamed from: h */
    public List<C46973j> f127262h;

    /* renamed from: i */
    public int f127263i = -1;

    public C47440e(Context context) {
        super(context);
    }

    /* renamed from: E */
    public View mo11752E() {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        BrowserSettingDialogView browserSettingDialogView = new BrowserSettingDialogView(context, (AttributeSet) null);
        this.f127260f = browserSettingDialogView;
        browserSettingDialogView.f118733i = this;
        BrowserSettingDialogView browserSettingDialogView2 = this.f127260f;
        if (browserSettingDialogView2 != null) {
            browserSettingDialogView2.setBrowserList(this.f127262h);
        }
        BrowserSettingDialogView browserSettingDialogView3 = this.f127260f;
        if (browserSettingDialogView3 != null) {
            browserSettingDialogView3.setSelectedBrowser(this.f127263i);
        }
        BrowserSettingDialogView browserSettingDialogView4 = this.f127260f;
        if (browserSettingDialogView4 != null) {
            browserSettingDialogView4.setBrowserSettingDialogClickListener(this.f127261g);
        }
        BrowserSettingDialogView browserSettingDialogView5 = this.f127260f;
        C87412m.m108591d(browserSettingDialogView5);
        return browserSettingDialogView5;
    }
}
