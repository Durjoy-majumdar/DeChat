package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import br0.C39836d;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.appbrand.page.e3 */
public interface C83797e3 extends C83165i, C83896q4 {
    /* renamed from: N */
    void mo63302N(int i, long j);

    /* renamed from: b */
    void mo63307b();

    /* renamed from: c */
    void mo63308c();

    /* renamed from: c1 */
    boolean mo63309c1();

    void destroy();

    /* renamed from: e0 */
    void mo63310e0(int i, int i2);

    /* renamed from: e1 */
    void mo63311e1(Runnable runnable);

    /* renamed from: f */
    void mo63312f(Context context);

    /* renamed from: g1 */
    void mo63314g1(String str, String str2);

    int getContentHeight();

    View getContentView();

    C39836d getFullscreenImpl();

    int getHeight();

    String getUserAgentString();

    int getWebScrollX();

    int getWebScrollY();

    int getWidth();

    View getWrapperView();

    /* renamed from: p1 */
    void mo63324p1();

    void setAppBrandInfo(Map<String, String> map);

    void setBackgroundColor(int i);

    void setFullscreenImpl(C39836d dVar);

    void setOnScrollChangedListener(C40524u2 u2Var);

    void setOnTrimListener(C40520s2 s2Var);

    void setVerticalScrollBarEnabled(boolean z);

    void setWebViewLayoutListener(C40517r2 r2Var);

    void setXWebKeyboardImpl(C40525w2 w2Var);

    /* renamed from: t0 */
    boolean mo63333t0();
}
