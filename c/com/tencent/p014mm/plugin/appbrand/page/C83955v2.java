package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.webkit.ValueCallback;
import br0.C39836d;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40481j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import gy3.C87412m;
import java.net.URL;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.appbrand.page.v2 */
public class C83955v2 implements C83797e3 {

    /* renamed from: d */
    public final C83797e3 f245101d;

    public C83955v2(C83797e3 e3Var) {
        C87412m.m108594g(e3Var, "webview");
        this.f245101d = e3Var;
    }

    /* renamed from: D */
    public boolean mo63301D(Canvas canvas) {
        C87412m.m108594g(canvas, "p0");
        return this.f245101d.mo63301D(canvas);
    }

    /* renamed from: N */
    public void mo63302N(int i, long j) {
        this.f245101d.mo63302N(i, j);
    }

    /* renamed from: P0 */
    public void mo63303P0(URL url, String str, String str2, int i, String str3, ValueCallback<String> valueCallback) {
        this.f245101d.mo63303P0(url, str, str2, i, str3, valueCallback);
    }

    /* renamed from: R0 */
    public void mo63304R0(URL url, String str, ValueCallback<String> valueCallback) {
        this.f245101d.mo63304R0(url, str, valueCallback);
    }

    public void addJavascriptInterface(Object obj, String str) {
        this.f245101d.addJavascriptInterface(obj, str);
    }

    /* renamed from: b */
    public void mo63307b() {
        this.f245101d.mo63307b();
    }

    /* renamed from: c */
    public void mo63308c() {
        this.f245101d.mo63308c();
    }

    /* renamed from: c1 */
    public boolean mo63309c1() {
        return this.f245101d.mo63309c1();
    }

    public void destroy() {
        this.f245101d.destroy();
    }

    /* renamed from: e0 */
    public void mo63310e0(int i, int i2) {
        this.f245101d.mo63310e0(i, i2);
    }

    /* renamed from: e1 */
    public void mo63311e1(Runnable runnable) {
        this.f245101d.mo63311e1(runnable);
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        this.f245101d.evaluateJavascript(str, valueCallback);
    }

    /* renamed from: f */
    public void mo63312f(Context context) {
        this.f245101d.mo63312f(context);
    }

    /* renamed from: g1 */
    public void mo63314g1(String str, String str2) {
        this.f245101d.mo63314g1(str, str2);
    }

    public int getContentHeight() {
        return this.f245101d.getContentHeight();
    }

    public View getContentView() {
        return this.f245101d.getContentView();
    }

    public C39836d getFullscreenImpl() {
        return this.f245101d.getFullscreenImpl();
    }

    public int getHeight() {
        return this.f245101d.getHeight();
    }

    public String getUserAgentString() {
        return this.f245101d.getUserAgentString();
    }

    public int getWebScrollX() {
        return this.f245101d.getWebScrollX();
    }

    public int getWebScrollY() {
        return this.f245101d.getWebScrollY();
    }

    public int getWidth() {
        return this.f245101d.getWidth();
    }

    public View getWrapperView() {
        return this.f245101d.getWrapperView();
    }

    /* renamed from: n0 */
    public <T extends C40481j> T mo63321n0(Class<T> cls) {
        return this.f245101d.mo63321n0(cls);
    }

    /* renamed from: p1 */
    public void mo63324p1() {
        this.f245101d.mo63324p1();
    }

    public void setAppBrandInfo(Map<String, String> map) {
        this.f245101d.setAppBrandInfo(map);
    }

    public void setBackgroundColor(int i) {
        this.f245101d.setBackgroundColor(i);
    }

    public void setFullscreenImpl(C39836d dVar) {
        this.f245101d.setFullscreenImpl(dVar);
    }

    public void setJsExceptionHandler(C83164h hVar) {
        this.f245101d.setJsExceptionHandler(hVar);
    }

    public void setOnScrollChangedListener(C40524u2 u2Var) {
        this.f245101d.setOnScrollChangedListener(u2Var);
    }

    public void setOnTrimListener(C40520s2 s2Var) {
        this.f245101d.setOnTrimListener(s2Var);
    }

    public void setVerticalScrollBarEnabled(boolean z) {
        this.f245101d.setVerticalScrollBarEnabled(z);
    }

    public void setWebViewLayoutListener(C40517r2 r2Var) {
        this.f245101d.setWebViewLayoutListener(r2Var);
    }

    public void setXWebKeyboardImpl(C40525w2 w2Var) {
        this.f245101d.setXWebKeyboardImpl(w2Var);
    }

    /* renamed from: t0 */
    public boolean mo63333t0() {
        return this.f245101d.mo63333t0();
    }
}
