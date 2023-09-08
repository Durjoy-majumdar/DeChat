package com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.webview.luggage.C43664o;
import com.tencent.p014mm.plugin.webview.luggage.C43667p;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewInputFooter;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewSmileyPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.smiley.C96926b0;
import com.tencent.p014mm.storage.emotion.SmileyPanelConfigInfo;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import p008bq.C39833l0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid */
public class WebViewSmileyGrid extends GridView {

    /* renamed from: d */
    public C44294b f120024d;

    /* renamed from: e */
    public C44304e f120025e;

    /* renamed from: f */
    public int f120026f;

    /* renamed from: g */
    public int f120027g = 0;

    /* renamed from: h */
    public int f120028h;

    /* renamed from: i */
    public int f120029i = 0;

    /* renamed from: j */
    public int f120030j = 0;

    /* renamed from: n */
    public AdapterView.OnItemClickListener f120031n = new C44293a();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid$a */
    public class C44293a implements AdapterView.OnItemClickListener {
        public C44293a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            WebViewInputFooter.C44282a aVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyGrid$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            WebViewSmileyGrid webViewSmileyGrid = WebViewSmileyGrid.this;
            if (i == WebViewSmileyGrid.this.f120027g - 1) {
                WebViewSmileyPanel.C44296a aVar2 = webViewSmileyGrid.f120025e.f120057c;
                if (aVar2 != null) {
                    WebViewInputFooter webViewInputFooter = ((C44299a) aVar2).f120050a;
                    if (!webViewInputFooter.f119994s || (aVar = webViewInputFooter.f119983e) == null) {
                        MMEditText mMEditText = webViewInputFooter.f119990o;
                        if (mMEditText != null) {
                            mMEditText.mo104263r();
                        }
                    } else {
                        C43667p pVar = (C43667p) aVar;
                        pVar.f118036a.f148259i.mo73815b(new C43664o(pVar, "[DELETE_EMOTION]"));
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyGrid$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            int i2 = webViewSmileyGrid.f120028h;
            int i3 = webViewSmileyGrid.f120027g;
            if (((i3 - 1) * i2) + i >= webViewSmileyGrid.f120026f) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyGrid$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            int i4 = (i2 * (i3 - 1)) + i;
            WebViewSmileyPanel.C44296a aVar3 = webViewSmileyGrid.f120025e.f120057c;
            if (aVar3 != null) {
                C96926b0 b0Var = (C96926b0) ((C39833l0) C86312j.m106911c(C39833l0.class)).Vi0();
                synchronized (b0Var.f283937d) {
                    if (i4 >= 0) {
                        if (i4 < b0Var.f283937d.size()) {
                            SmileyPanelConfigInfo smileyPanelConfigInfo = b0Var.f283937d.get(i4);
                            str = smileyPanelConfigInfo != null ? smileyPanelConfigInfo.field_key : "";
                        }
                    }
                    Log.m105928w("MicroMsg.MergerSmileyManager", "get text key, error index");
                    str = "";
                }
                try {
                    WebViewInputFooter webViewInputFooter2 = ((C44299a) aVar3).f120050a;
                    if (webViewInputFooter2.f119994s) {
                        C43667p pVar2 = (C43667p) webViewInputFooter2.f119983e;
                        pVar2.f118036a.f148259i.mo73815b(new C43664o(pVar2, str));
                    } else {
                        webViewInputFooter2.f119990o.mo98046o(str);
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.WebViewInputFooter", "appendText, exp = %s", e);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyGrid$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid$b */
    public class C44294b extends BaseAdapter {
        public C44294b(C44293a aVar) {
        }

        public int getCount() {
            return WebViewSmileyGrid.this.f120027g;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C44295c cVar;
            Drawable drawable = null;
            if (view == null || view.getTag() == null) {
                view = C85868k2.m106137b(WebViewSmileyGrid.this.getContext()).inflate(C0966R.C0971layout.ci6, (ViewGroup) null);
                WebViewSmileyGrid webViewSmileyGrid = WebViewSmileyGrid.this;
                view.setLayoutParams(new AbsListView.LayoutParams(-1, ((webViewSmileyGrid.f120025e.f120058d - C76577a.m92157h(webViewSmileyGrid.getContext(), C0966R.dimen.f3906ig)) - C76577a.m92157h(WebViewSmileyGrid.this.getContext(), C0966R.dimen.a4l)) / WebViewSmileyGrid.this.f120030j));
                cVar = new C44295c(view);
                view.setTag(cVar);
            } else {
                cVar = (C44295c) view.getTag();
            }
            WebViewSmileyGrid webViewSmileyGrid2 = WebViewSmileyGrid.this;
            int i2 = webViewSmileyGrid2.f120027g - 1;
            if (i == i2) {
                cVar.f120034a.setImageResource(C0966R.C0969drawable.f4887q9);
                cVar.f120034a.setContentDescription(WebViewSmileyGrid.this.getContext().getString(C0966R.string.by6));
            } else {
                int i3 = (i2 * webViewSmileyGrid2.f120028h) + i;
                if (i3 > webViewSmileyGrid2.f120026f - 1) {
                    cVar.f120034a.setImageDrawable((Drawable) null);
                } else {
                    webViewSmileyGrid2.f120025e.getClass();
                    C96926b0 b0Var = (C96926b0) ((C39833l0) C86312j.m106911c(C39833l0.class)).Vi0();
                    SparseArray<SmileyPanelConfigInfo> sparseArray = b0Var.f283938e;
                    if (sparseArray == null) {
                        Log.m105924i("MicroMsg.MergerSmileyManager", "getSmileyDrawable smiley panel map is null.");
                    } else {
                        SmileyPanelConfigInfo smileyPanelConfigInfo = sparseArray.get(i3);
                        if (smileyPanelConfigInfo == null) {
                            Log.m105924i("MicroMsg.MergerSmileyManager", "getSmileyDrawable smiley info is null.");
                        } else {
                            drawable = b0Var.mo135518c(smileyPanelConfigInfo.field_key);
                        }
                    }
                    cVar.f120034a.setImageDrawable(drawable);
                }
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid$c */
    public static final class C44295c {

        /* renamed from: a */
        public ImageView f120034a;

        public C44295c(View view) {
            this.f120034a = (ImageView) view.findViewById(C0966R.C0970id.f6152yr);
        }
    }

    public WebViewSmileyGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private int getRowSpacing() {
        return this.f120029i;
    }

    /* renamed from: b */
    public void mo69022b(int i, int i2, int i3, int i4, int i5, int i6) {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackgroundResource(0);
        setStretchMode(2);
        setOnItemClickListener(this.f120031n);
        this.f120028h = i;
        this.f120026f = i2;
        this.f120027g = i3;
        this.f120029i = i6;
        this.f120030j = i5;
        setNumColumns(i4);
        int rowSpacing = getRowSpacing();
        int b = C76577a.m92151b(getContext(), 6);
        int b2 = C76577a.m92151b(getContext(), 6);
        if (rowSpacing == 0) {
            rowSpacing = C76577a.m92151b(getContext(), 6);
        }
        setPadding(b, rowSpacing, b2, 0);
        C44294b bVar = new C44294b((C44293a) null);
        this.f120024d = bVar;
        setAdapter(bVar);
        this.f120024d.notifyDataSetChanged();
    }

    public void setPanelManager(C44304e eVar) {
        this.f120025e = eVar;
    }
}
