package com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C103853a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.CustomViewPager;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.smiley.C96926b0;
import com.tencent.p014mm.storage.emotion.SmileyPanelConfigInfo;
import da3.C45320g;
import da3.C45321h;
import di3.C86312j;
import java.lang.ref.SoftReference;
import java.util.List;
import p008bq.C39833l0;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyViewPager */
public class WebViewSmileyViewPager extends CustomViewPager {

    /* renamed from: d */
    public int f120043d = 0;

    /* renamed from: e */
    public int f120044e = 0;

    /* renamed from: f */
    public C44304e f120045f;

    /* renamed from: g */
    public C44297a f120046g;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyViewPager$a */
    public interface C44297a {
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyViewPager$b */
    public static class C44298b extends C103853a {

        /* renamed from: d */
        public SparseArray<SoftReference<View>> f120047d = new SparseArray<>();

        /* renamed from: e */
        public C44304e f120048e;

        /* renamed from: f */
        public boolean f120049f = false;

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            int i = 0;
            C45320g gVar = (C45320g) this.f120048e.mo69040a(0);
            if (gVar.mo70876a() * gVar.mo70877b() < 1) {
                return 0;
            }
            gVar.f122773b.getClass();
            List<SmileyPanelConfigInfo> list = ((C96926b0) ((C39833l0) C86312j.m106911c(C39833l0.class)).Vi0()).f283937d;
            if (list != null) {
                i = list.size();
            }
            return (int) Math.ceil(((double) i) / ((double) (gVar.mo70876a() * gVar.mo70877b())));
        }

        public int getItemPosition(Object obj) {
            if (this.f120049f) {
                return -2;
            }
            return super.getItemPosition(obj);
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View view = null;
            View view2 = this.f120047d.get(i) != null ? (View) this.f120047d.get(i).get() : null;
            if (view2 == null) {
                C45320g gVar = (C45320g) this.f120048e.mo69040a(i);
                Context context = gVar.f122772a;
                C44304e eVar = gVar.f122773b;
                if (context != null) {
                    view = View.inflate(context, C0966R.C0971layout.ci8, (ViewGroup) null);
                    if (view instanceof WebViewSmileyGrid) {
                        WebViewSmileyGrid webViewSmileyGrid = (WebViewSmileyGrid) view;
                        webViewSmileyGrid.setPanelManager(eVar);
                        gVar.f122773b.getClass();
                        List<SmileyPanelConfigInfo> list = ((C96926b0) ((C39833l0) C86312j.m106911c(C39833l0.class)).Vi0()).f283937d;
                        webViewSmileyGrid.mo69022b(i, list == null ? 0 : list.size(), gVar.mo70876a() * gVar.mo70877b(), gVar.mo70876a(), gVar.mo70877b(), (gVar.f122773b.f120058d - (C45320g.f122775d * gVar.mo70877b())) / (gVar.mo70877b() + 1));
                    }
                }
                if (view != null) {
                    viewGroup.addView(view, 0);
                    this.f120047d.put(i, new SoftReference(view));
                } else {
                    Log.m105920e("MicroMsg.WebViewSmileyViewPagerAdapter", "contentView == null!");
                }
                return view;
            }
            if (view2.getParent() != null) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            viewGroup.addView(view2, 0);
            return view2;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public void notifyDataSetChanged() {
            this.f120049f = true;
            super.notifyDataSetChanged();
            this.f120049f = false;
        }
    }

    public WebViewSmileyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (C11171e.m11046c(9)) {
            setOverScrollMode(2);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C44304e eVar = this.f120045f;
        if (eVar != null && (((i > 0 && i3 != i) || (i2 > 0 && i4 != i2)) && ((i2 > 0 && i2 != this.f120043d) || (i > 0 && i != this.f120044e)))) {
            eVar.f120058d = i2;
            eVar.f120059e = i;
            C44297a aVar = this.f120046g;
            if (aVar != null) {
                WebViewSmileyPanel webViewSmileyPanel = (WebViewSmileyPanel) aVar;
                if (webViewSmileyPanel.f120040i != null) {
                    webViewSmileyPanel.f120037f.f120060f = KeyBoardUtil.isPortOrientation(webViewSmileyPanel.getContext());
                    C44298b bVar = (C44298b) webViewSmileyPanel.f120040i.getAdapter();
                    if (bVar != null) {
                        bVar.f120047d.clear();
                        bVar.f120048e = webViewSmileyPanel.f120037f;
                        bVar.notifyDataSetChanged();
                    } else {
                        C44298b bVar2 = new C44298b();
                        bVar2.f120048e = webViewSmileyPanel.f120037f;
                        webViewSmileyPanel.f120040i.setAdapter(bVar2);
                    }
                    webViewSmileyPanel.f120040i.post(new C45321h(webViewSmileyPanel));
                }
            }
        }
        if (i2 > 0) {
            this.f120043d = i2;
        }
        if (i > 0) {
            this.f120044e = i;
        }
    }

    public void setOnSizeChangedListener(C44297a aVar) {
        this.f120046g = aVar;
    }

    public void setPanelManager(C44304e eVar) {
        this.f120045f = eVar;
    }
}
