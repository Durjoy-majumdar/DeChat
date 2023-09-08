package p547hb;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import br0.C39836d;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40481j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.p014mm.plugin.appbrand.page.C40517r2;
import com.tencent.p014mm.plugin.appbrand.page.C40520s2;
import com.tencent.p014mm.plugin.appbrand.page.C40524u2;
import com.tencent.p014mm.plugin.appbrand.page.C40525w2;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import java.net.URL;
import java.util.Map;

/* renamed from: hb.a */
public class C46016a implements C83797e3 {

    /* renamed from: d */
    public ViewGroup f124099d;

    /* renamed from: e */
    public ViewGroup f124100e;

    /* renamed from: D */
    public boolean mo63301D(Canvas canvas) {
        return false;
    }

    /* renamed from: N */
    public void mo63302N(int i, long j) {
    }

    /* renamed from: P0 */
    public void mo63303P0(URL url, String str, String str2, int i, String str3, ValueCallback<String> valueCallback) {
    }

    /* renamed from: R0 */
    public void mo63304R0(URL url, String str, ValueCallback<String> valueCallback) {
    }

    public void addJavascriptInterface(Object obj, String str) {
    }

    /* renamed from: b */
    public void mo63307b() {
    }

    /* renamed from: c */
    public void mo63308c() {
    }

    /* renamed from: c1 */
    public boolean mo63309c1() {
        return false;
    }

    public void destroy() {
        this.f124099d = null;
        this.f124100e = null;
    }

    /* renamed from: e0 */
    public void mo63310e0(int i, int i2) {
    }

    /* renamed from: e1 */
    public void mo63311e1(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
    }

    /* renamed from: f */
    public void mo63312f(Context context) {
        if (this.f124099d == null) {
            this.f124099d = new FrameLayout(context);
        }
        if (this.f124100e == null) {
            this.f124100e = new FrameLayout(context);
        }
    }

    /* renamed from: g1 */
    public void mo63314g1(String str, String str2) {
    }

    public int getContentHeight() {
        return 0;
    }

    public View getContentView() {
        return this.f124100e;
    }

    public C39836d getFullscreenImpl() {
        return null;
    }

    public int getHeight() {
        return 0;
    }

    public String getUserAgentString() {
        return "MiniGame";
    }

    public int getWebScrollX() {
        return 0;
    }

    public int getWebScrollY() {
        return 0;
    }

    public int getWidth() {
        return 0;
    }

    public View getWrapperView() {
        return this.f124099d;
    }

    /* renamed from: n0 */
    public <T extends C40481j> T mo63321n0(Class<T> cls) {
        return null;
    }

    /* renamed from: p1 */
    public void mo63324p1() {
    }

    public void setAppBrandInfo(Map<String, String> map) {
    }

    public void setBackgroundColor(int i) {
    }

    public void setFullscreenImpl(C39836d dVar) {
    }

    public void setJsExceptionHandler(C83164h hVar) {
    }

    public void setOnScrollChangedListener(C40524u2 u2Var) {
    }

    public void setOnTrimListener(C40520s2 s2Var) {
    }

    public void setVerticalScrollBarEnabled(boolean z) {
    }

    public void setWebViewLayoutListener(C40517r2 r2Var) {
    }

    public void setXWebKeyboardImpl(C40525w2 w2Var) {
    }

    /* renamed from: t0 */
    public boolean mo63333t0() {
        return false;
    }
}
