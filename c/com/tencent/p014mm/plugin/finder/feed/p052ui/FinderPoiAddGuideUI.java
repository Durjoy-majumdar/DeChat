package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPoiAddGuideUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiAddGuideUI */
public final class FinderPoiAddGuideUI extends MMFinderUI {

    /* renamed from: o */
    public CheckBox f14645o;

    /* renamed from: p */
    public TextView f14646p;

    /* renamed from: q */
    public Button f14647q;

    /* renamed from: r */
    public LinearLayout f14648r;

    /* renamed from: s */
    public ImageView f14649s;

    /* renamed from: t */
    public boolean f14650t;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiAddGuideUI$a */
    public static final class C3001a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPoiAddGuideUI f14651d;

        public C3001a(FinderPoiAddGuideUI finderPoiAddGuideUI) {
            this.f14651d = finderPoiAddGuideUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderPoiAddGuideUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CheckBox checkBox = this.f14651d.f14645o;
            if (checkBox == null) {
                C87412m.m108603p("checkBox");
                throw null;
            } else if (checkBox != null) {
                checkBox.setChecked(!checkBox.isChecked());
                FinderPoiAddGuideUI finderPoiAddGuideUI = this.f14651d;
                CheckBox checkBox2 = finderPoiAddGuideUI.f14645o;
                if (checkBox2 != null) {
                    finderPoiAddGuideUI.f14650t = checkBox2.isChecked();
                    FinderPoiAddGuideUI finderPoiAddGuideUI2 = this.f14651d;
                    if (finderPoiAddGuideUI2.f14650t) {
                        Button button = finderPoiAddGuideUI2.f14647q;
                        if (button != null) {
                            button.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                            FinderPoiAddGuideUI finderPoiAddGuideUI3 = this.f14651d;
                            Button button2 = finderPoiAddGuideUI3.f14647q;
                            if (button2 != null) {
                                button2.setTextColor(finderPoiAddGuideUI3.getResources().getColor(17170443));
                            } else {
                                C87412m.m108603p("addButton");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("addButton");
                            throw null;
                        }
                    } else {
                        Button button3 = finderPoiAddGuideUI2.f14647q;
                        if (button3 != null) {
                            button3.setBackgroundResource(C0966R.C0969drawable.f4659ja);
                            FinderPoiAddGuideUI finderPoiAddGuideUI4 = this.f14651d;
                            Button button4 = finderPoiAddGuideUI4.f14647q;
                            if (button4 != null) {
                                button4.setTextColor(finderPoiAddGuideUI4.getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
                            } else {
                                C87412m.m108603p("addButton");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("addButton");
                            throw null;
                        }
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderPoiAddGuideUI$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C87412m.m108603p("checkBox");
                throw null;
            } else {
                C87412m.m108603p("checkBox");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiAddGuideUI$b */
    public static final class C3002b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPoiAddGuideUI f14652d;

        public C3002b(FinderPoiAddGuideUI finderPoiAddGuideUI) {
            this.f14652d = finderPoiAddGuideUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderPoiAddGuideUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", "https://weixin.qq.com/cgi-bin/readtemplate?t=poi_claim_portal");
            C88144b.m109791i(this.f14652d.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderPoiAddGuideUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiAddGuideUI$c */
    public static final class C3003c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPoiAddGuideUI f14653d;

        public C3003c(FinderPoiAddGuideUI finderPoiAddGuideUI) {
            this.f14653d = finderPoiAddGuideUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderPoiAddGuideUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f14653d.f14650t) {
                Intent intent = new Intent();
                intent.putExtra("EXTRA_FROM_GUIDE", true);
                ((C58684b) C86312j.m106911c(C58684b.class)).ny0(this.f14653d, intent, 0);
            } else {
                Log.m105924i("Finder.FinderPoiAddGuideUI", "licence is not check");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderPoiAddGuideUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPoiAddGuideUI$d */
    public static final class C3004d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPoiAddGuideUI f14654d;

        public C3004d(FinderPoiAddGuideUI finderPoiAddGuideUI) {
            this.f14654d = finderPoiAddGuideUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14654d.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.amz;
    }

    public void initView() {
        View findViewById = findViewById(C0966R.C0970id.ay_);
        C87412m.m108593f(findViewById, "findViewById(R.id.cb_poi_license_checkbox)");
        this.f14645o = (CheckBox) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.kxh);
        C87412m.m108593f(findViewById2, "findViewById(R.id.tv_poi_license_content)");
        this.f14646p = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.am6);
        C87412m.m108593f(findViewById3, "findViewById(R.id.btn_poi_add)");
        this.f14647q = (Button) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.f358602g14);
        C87412m.m108593f(findViewById4, "findViewById(R.id.ll_check_container)");
        this.f14648r = (LinearLayout) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.fd9);
        C87412m.m108593f(findViewById5, "findViewById(R.id.iv_poi_guide)");
        this.f14649s = (ImageView) findViewById5;
        boolean z = !LocaleUtil.isChineseAppLang();
        if (z) {
            ImageView imageView = this.f14649s;
            if (imageView != null) {
                imageView.setImageDrawable(getResources().getDrawable(C0966R.C0969drawable.c2t));
            } else {
                C87412m.m108603p("poiGuide");
                throw null;
            }
        } else {
            ImageView imageView2 = this.f14649s;
            if (imageView2 != null) {
                imageView2.setImageDrawable(getResources().getDrawable(C0966R.C0969drawable.c2s));
            } else {
                C87412m.m108603p("poiGuide");
                throw null;
            }
        }
        if (C85875k4.m106211z()) {
            if (z) {
                ImageView imageView3 = this.f14649s;
                if (imageView3 != null) {
                    imageView3.setImageDrawable(getResources().getDrawable(C0966R.C0969drawable.c2v));
                } else {
                    C87412m.m108603p("poiGuide");
                    throw null;
                }
            } else {
                ImageView imageView4 = this.f14649s;
                if (imageView4 != null) {
                    imageView4.setImageDrawable(getResources().getDrawable(C0966R.C0969drawable.c2u));
                } else {
                    C87412m.m108603p("poiGuide");
                    throw null;
                }
            }
        }
        LinearLayout linearLayout = this.f14648r;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new C3001a(this));
            TextView textView = this.f14646p;
            if (textView != null) {
                textView.setOnClickListener(new C3002b(this));
                Button button = this.f14647q;
                if (button != null) {
                    button.setOnClickListener(new C3003c(this));
                } else {
                    C87412m.m108603p("addButton");
                    throw null;
                }
            } else {
                C87412m.m108603p("licenseContent");
                throw null;
            }
        } else {
            C87412m.m108603p("checkContainer");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C3004d(this));
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        setMMTitle("");
        hideActionbarLine();
        initView();
    }
}
