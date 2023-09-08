package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.view.View;
import com.tencent.p014mm.plugin.websearch.webview.WebSearchWebView;
import eb0.C31543z5;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.h */
public class C43256h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TopStoryHomeUIComponentImpl f117055d;

    public C43256h(TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl) {
        this.f117055d = topStoryHomeUIComponentImpl;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long c = C31543z5.m39453c();
        TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl = this.f117055d;
        if (c - topStoryHomeUIComponentImpl.f54519t < 300) {
            try {
                WebSearchWebView webSearchWebView = topStoryHomeUIComponentImpl.f54511i;
                if (!(webSearchWebView == null || webSearchWebView.getView() == null)) {
                    this.f117055d.f54511i.getView().scrollTo(this.f117055d.f54511i.getView().getScrollX(), 0);
                }
            } catch (Throwable unused) {
            }
        }
        this.f117055d.f54519t = c;
        C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
