package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.C103853a;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMPageControlView;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.scanner.model.C94481y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ke3.C88144b;
import nj3.C76879j;
import p755xs.C102720b;
import pj3.C47511g;
import vl2.C102216y;
import vl2.C78431a0;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI */
public class ProductFurtherInfoUI extends MMPreference {

    /* renamed from: d */
    public C47511g f273201d;

    /* renamed from: e */
    public MMPageControlView f273202e;

    /* renamed from: f */
    public ViewPager f273203f;

    /* renamed from: g */
    public C102216y.C102217a.C102218a f273204g;

    /* renamed from: h */
    public String f273205h;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI$a */
    public class C42917a implements MenuItem.OnMenuItemClickListener {
        public C42917a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ProductFurtherInfoUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI$c */
    public class C42918c implements View.OnTouchListener {
        public C42918c(ProductFurtherInfoUI productFurtherInfoUI) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ProductFurtherInfoUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (!(view == null || view.getParent() == null)) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/scanner/ui/ProductFurtherInfoUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI$e */
    public class C71010e extends C103853a implements C102720b.C78973a {

        /* renamed from: d */
        public Context f205500d;

        /* renamed from: e */
        public List<String> f205501e = new ArrayList();

        /* renamed from: f */
        public Map<String, ImageView> f205502f = new HashMap();

        /* renamed from: g */
        public int f205503g;

        /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI$e$a */
        public class C71011a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ImageView f205504d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f205505e;

            public C71011a(C71010e eVar, ImageView imageView, Bitmap bitmap) {
                this.f205504d = imageView;
                this.f205505e = bitmap;
            }

            public void run() {
                this.f205504d.setImageBitmap(this.f205505e);
                this.f205504d.setBackgroundColor(0);
            }
        }

        public C71010e(ProductFurtherInfoUI productFurtherInfoUI, Context context) {
            this.f205500d = context;
            ((C102720b) C86312j.m106911c(C102720b.class)).Lu0(this);
            this.f205503g = this.f205500d.getResources().getColor(C0966R.color.f3564xu);
        }

        /* renamed from: a */
        public final ImageView mo97657a(String str) {
            if (((HashMap) this.f205502f).containsKey(str)) {
                return (ImageView) ((HashMap) this.f205502f).get(str);
            }
            ImageView imageView = new ImageView(this.f205500d);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            ((HashMap) this.f205502f).put(str, imageView);
            return imageView;
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((ImageView) obj);
            String str = this.f205501e.get(i);
            if (((HashMap) this.f205502f).containsKey(str)) {
                ((HashMap) this.f205502f).remove(str);
            }
        }

        public int getCount() {
            return this.f205501e.size();
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            String str = this.f205501e.get(i);
            ImageView a = mo97657a(str);
            Bitmap N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C78431a0(str));
            if (N6 == null || N6.isRecycled()) {
                a.setImageBitmap((Bitmap) null);
                a.setBackgroundColor(this.f205503g);
            } else {
                a.setImageBitmap(N6);
                a.setBackgroundColor(0);
            }
            try {
                viewGroup.addView(a);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.ProductFurtherInfoUI", "Add view failed: " + e.getMessage());
            }
            return a;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            ImageView a;
            if (bitmap != null && !bitmap.isRecycled() && !Util.isNullOrNil(str) && (a = mo97657a(str)) != null) {
                MMHandlerThread.postToMainThread(new C71011a(this, a, bitmap));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI$b */
    public class C94484b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI$b$a */
        public class C94485a implements C76879j.C76888o {
            public C94485a() {
            }

            /* renamed from: a */
            public void mo5759a(int i, int i2) {
                if (i2 == 0 && !Util.isNullOrNil(ProductFurtherInfoUI.this.f273205h)) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", ProductFurtherInfoUI.this.f273205h);
                    C88144b.m109791i(ProductFurtherInfoUI.this.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
            }
        }

        public C94484b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            linkedList.add(ProductFurtherInfoUI.this.getString(C0966R.string.f361239ie3));
            linkedList2.add(0);
            C76879j.m92733d(ProductFurtherInfoUI.this.getContext(), "", linkedList, linkedList2, "", false, new C94485a());
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI$d */
    public class C94486d implements ViewPager.OnPageChangeListener {
        public C94486d() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            if (ProductFurtherInfoUI.this.f273203f.getParent() != null) {
                ProductFurtherInfoUI.this.f273203f.getParent().requestDisallowInterceptTouchEvent(true);
            }
            ProductFurtherInfoUI.this.f273202e.setPage(i);
        }
    }

    public int getHeaderResourceId() {
        return C0966R.C0971layout.bny;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bnx;
    }

    public int getResourceId() {
        return C0966R.xml.f8927bk;
    }

    public void initView() {
        setMMTitle(getIntent().getStringExtra("key_title"));
        setBackBtn(new C42917a());
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C94484b());
        this.f273201d = getPreferenceScreen();
        ArrayList arrayList = new ArrayList();
        Iterator<C102216y.C102217a.C102218a.C102219a> it = this.f273204g.f300998a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f301000a);
        }
        this.f273203f = (ViewPager) findViewById(C0966R.C0970id.hqu);
        MMPageControlView mMPageControlView = (MMPageControlView) findViewById(C0966R.C0970id.f6k);
        this.f273202e = mMPageControlView;
        mMPageControlView.setIndicatorLayoutRes(C0966R.C0971layout.bm6);
        this.f273202e.setVisibility(0);
        this.f273203f.setOnTouchListener(new C42918c(this));
        this.f273203f.setOnPageChangeListener(new C94486d());
        C71010e eVar = new C71010e(this, this);
        this.f273203f.setAdapter(eVar);
        if (arrayList.size() > 0) {
            eVar.f205501e = arrayList;
            MMPageControlView mMPageControlView2 = this.f273202e;
            mMPageControlView2.f284231e = arrayList.size();
            mMPageControlView2.mo131771a(0);
            eVar.notifyDataSetChanged();
            this.f273203f.setVisibility(0);
        }
        for (int i = 0; i < this.f273204g.f300999b.size(); i++) {
            C102216y.C102217a.C102218a.C102220b bVar = this.f273204g.f300999b.get(i);
            Preference preference = new Preference(this);
            preference.mo26273A(i + "");
            preference.f121271G = C0966R.C0971layout.bh_;
            preference.mo69924H(bVar.f301001a);
            preference.mo7741E(bVar.f301002b);
            this.f273201d.mo72527k(preference);
        }
        this.f273201d.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        C102216y.C102217a.C102218a aVar;
        super.onCreate(bundle);
        C102216y.C102217a b = C94481y.m119505b(getIntent().getStringExtra("key_Product_xml"), getIntent().getIntExtra("key_Product_funcType", 0));
        if (b == null || (aVar = b.f300997b) == null) {
            Log.m105920e("MicroMsg.ProductFurtherInfoUI", "initView(), product or product field detail null -> finish");
            finish();
            return;
        }
        this.f273204g = aVar;
        this.f273205h = b.field_feedbackurl;
        initView();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        return false;
    }
}
