package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.webview.p128ui.tools.fts.FTSSOSHomeWebViewUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.h */
public class C43967h implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ View f119101d;

    /* renamed from: e */
    public final /* synthetic */ FTSSOSHomeWebViewUI f119102e;

    public C43967h(FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI, View view) {
        this.f119102e = fTSSOSHomeWebViewUI;
        this.f119101d = view;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f119102e.mo68477V9();
        FTSSOSHomeWebViewUI.C43942u uVar = this.f119102e.f118997Y3;
        if (uVar != null) {
            uVar.sendMessage(15, (Object) motionEvent);
        }
        boolean onTouchEvent = this.f119101d.onTouchEvent(motionEvent);
        C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
