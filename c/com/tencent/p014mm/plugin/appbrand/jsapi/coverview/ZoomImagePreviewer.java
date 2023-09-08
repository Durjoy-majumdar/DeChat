package com.tencent.p014mm.plugin.appbrand.jsapi.coverview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import cl0.C113367c;
import cl0.C113369d;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import zi0.C91755a;
import zi0.C91759b;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer */
public class ZoomImagePreviewer extends MMGestureGallery implements C113369d {

    /* renamed from: Q0 */
    public ArrayList<String> f345342Q0 = new ArrayList<>();

    /* renamed from: R0 */
    public C83780d1 f345343R0;

    /* renamed from: S0 */
    public int f345344S0 = 0;

    /* renamed from: T0 */
    public int f345345T0 = 0;

    /* renamed from: U0 */
    public float f345346U0 = 1.0f;

    /* renamed from: V0 */
    public HashMap<String, SoftReference<MultiTouchImageView>> f345347V0 = new HashMap<>();

    /* renamed from: W0 */
    public HashSet<String> f345348W0 = new HashSet<>();

    /* renamed from: X0 */
    public int f345349X0 = 0;

    /* renamed from: Y0 */
    public C115247c f345350Y0 = new C115247c((C115243a) null);

    /* renamed from: y0 */
    public C115244b f345351y0 = new C115244b((C115243a) null);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer$a */
    public class C115243a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MultiTouchImageView f345352d;

        public C115243a(MultiTouchImageView multiTouchImageView) {
            this.f345352d = multiTouchImageView;
        }

        public void run() {
            if (ZoomImagePreviewer.this.f345346U0 != this.f345352d.getOriginScale()) {
                this.f345352d.setOriginScale(ZoomImagePreviewer.this.f345346U0);
                this.f345352d.mo177313r(ZoomImagePreviewer.this.f345346U0);
                this.f345352d.mo26058c();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer$b */
    public class C115244b extends BaseAdapter {

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer$b$a */
        public class C115245a implements Runnable {
            public C115245a() {
            }

            public void run() {
                ZoomImagePreviewer.this.f345348W0.clear();
            }
        }

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer$b$b */
        public class C115246b {

            /* renamed from: a */
            public MultiTouchImageView f345356a;

            public C115246b(C115244b bVar) {
            }
        }

        public C115244b(C115243a aVar) {
        }

        public int getCount() {
            return ZoomImagePreviewer.this.f345342Q0.size();
        }

        public Object getItem(int i) {
            return ZoomImagePreviewer.this.f345342Q0.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            MultiTouchImageView multiTouchImageView;
            if (view == null) {
                multiTouchImageView = new MultiTouchImageView(ZoomImagePreviewer.this.getContext(), 0, 0);
                multiTouchImageView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
                C115246b bVar = new C115246b(this);
                bVar.f345356a = multiTouchImageView;
                multiTouchImageView.setTag(bVar);
            } else {
                multiTouchImageView = ((C115246b) view.getTag()).f345356a;
                Log.m105924i("MicroMsg.appbrand.ZoomImagePreviewer", "getView from holder");
            }
            multiTouchImageView.setMinZoomLimit(0.5f);
            multiTouchImageView.setMaxZoomDoubleTab(true);
            multiTouchImageView.setOriginScale(ZoomImagePreviewer.this.f345346U0);
            ZoomImagePreviewer zoomImagePreviewer = ZoomImagePreviewer.this;
            ForceGpuUtil.decideLayerType(multiTouchImageView, zoomImagePreviewer.f345344S0, zoomImagePreviewer.f345345T0);
            multiTouchImageView.setEnableHorLongBmpMode(false);
            String str = (String) getItem(i);
            Log.m105925i("MicroMsg.appbrand.ZoomImagePreviewer", "getView url:%s", str);
            ZoomImagePreviewer zoomImagePreviewer2 = ZoomImagePreviewer.this;
            C83780d1 d1Var = zoomImagePreviewer2.f345343R0;
            float f = zoomImagePreviewer2.f345346U0;
            if (str == null) {
                if (zoomImagePreviewer2 != null) {
                    zoomImagePreviewer2.mo175006e(str, "invalid imageView or url");
                }
            } else if (!TextUtils.isEmpty(str)) {
                String nO = ((C91759b) d1Var.mo109668l(C91759b.class)).mo115838nO(d1Var, str);
                ((C91755a) d1Var.mo109668l(C91755a.class)).mo124758Om(nO, new C113367c(zoomImagePreviewer2, str, nO, multiTouchImageView, f));
            }
            multiTouchImageView.setTag(multiTouchImageView);
            ZoomImagePreviewer.this.f345347V0.put(str, new SoftReference(multiTouchImageView));
            return multiTouchImageView;
        }

        public void notifyDataSetChanged() {
            ZoomImagePreviewer.this.f345343R0.mo116275j0(new C115245a());
            super.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer$c */
    public class C115247c extends C82919r2 {
        private static final int CTRL_INDEX = -2;
        public static final String NAME = "onImagePreviewerLoadFail";

        public C115247c(C115243a aVar) {
        }
    }

    public ZoomImagePreviewer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVerticalFadingEdgeEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setAdapter(this.f345351y0);
        setSelection(0);
    }

    /* renamed from: e */
    public void mo175006e(String str, String str2) {
        if (!this.f345348W0.contains(str)) {
            this.f345348W0.add(str);
            C115247c cVar = this.f345350Y0;
            cVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            hashMap.put(TPReportKeys.PlayerStep.PLAYER_REASON, str2);
            hashMap.put("viewId", Integer.valueOf(ZoomImagePreviewer.this.f345349X0));
            cVar.mo115165o(hashMap);
            cVar.mo115161k(ZoomImagePreviewer.this.f345343R0.mo116160O0());
            cVar.mo115158h();
        }
    }

    /* renamed from: f */
    public void mo175007f(ArrayList<String> arrayList) {
        Log.m105924i("MicroMsg.appbrand.ZoomImagePreviewer", "updateDataView");
        if (this.f345343R0 == null || arrayList == null) {
            Log.m105924i("MicroMsg.appbrand.ZoomImagePreviewer", "updateDataView url is empty or component is null");
        } else if (this.f345342Q0.isEmpty() && !arrayList.isEmpty()) {
            this.f345342Q0.addAll(arrayList);
            this.f345351y0.notifyDataSetChanged();
        } else if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!this.f345342Q0.contains(next)) {
                    arrayList2.add(next);
                    Log.m105925i("MicroMsg.appbrand.ZoomImagePreviewer", "new url is added, url:%s", next);
                }
            }
            if (!arrayList2.isEmpty()) {
                Log.m105924i("MicroMsg.appbrand.ZoomImagePreviewer", "add new Data");
                this.f345342Q0.addAll(arrayList2);
                this.f345351y0.notifyDataSetChanged();
            }
            Log.m105924i("MicroMsg.appbrand.ZoomImagePreviewer", "update Data");
            Iterator<String> it4 = this.f345342Q0.iterator();
            while (it4.hasNext()) {
                String next2 = it4.next();
                SoftReference softReference = this.f345347V0.get(next2);
                if (softReference == null || softReference.get() == null) {
                    Log.m105925i("MicroMsg.appbrand.ZoomImagePreviewer", "update Data url with view is recycle or not exist, url:%s", next2);
                } else {
                    MultiTouchImageView multiTouchImageView = (MultiTouchImageView) softReference.get();
                    Log.m105925i("MicroMsg.appbrand.ZoomImagePreviewer", "update Data width:%d, height:%d, scale:%f", Integer.valueOf(this.f345344S0), Integer.valueOf(this.f345345T0), Float.valueOf(this.f345346U0));
                    multiTouchImageView.postDelayed(new C115243a(multiTouchImageView), 100);
                }
            }
        }
    }

    public void setComponent(C83780d1 d1Var) {
        this.f345343R0 = d1Var;
    }

    public void setData(ArrayList<String> arrayList) {
        Log.m105924i("MicroMsg.appbrand.ZoomImagePreviewer", "setData");
        if (this.f345343R0 == null || arrayList == null) {
            Log.m105924i("MicroMsg.appbrand.ZoomImagePreviewer", "url is empty or component is null");
            return;
        }
        this.f345342Q0.clear();
        this.f345342Q0.addAll(arrayList);
        this.f345351y0.notifyDataSetChanged();
    }

    public void setScale(float f) {
        this.f345346U0 = f;
    }

    public void setViewId(int i) {
        this.f345349X0 = i;
    }

    public ZoomImagePreviewer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setVerticalFadingEdgeEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setAdapter(this.f345351y0);
        setSelection(0);
    }
}
