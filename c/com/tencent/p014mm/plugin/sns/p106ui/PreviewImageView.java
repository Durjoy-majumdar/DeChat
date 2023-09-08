package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94958v;
import com.tencent.p014mm.plugin.sns.p106ui.C95738b1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.PreviewImageView */
public class PreviewImageView extends LinearLayout implements C95738b1 {

    /* renamed from: p */
    public static final /* synthetic */ int f277347p = 0;

    /* renamed from: d */
    public final Context f277348d;

    /* renamed from: e */
    public TableLayout f277349e;

    /* renamed from: f */
    public List<String> f277350f;

    /* renamed from: g */
    public final Map<Integer, View> f277351g = new HashMap();

    /* renamed from: h */
    public final Map<Integer, TableRow> f277352h = new HashMap();

    /* renamed from: i */
    public HashMap<String, Bitmap> f277353i = new HashMap<>();

    /* renamed from: j */
    public C95738b1.C95739a f277354j;

    /* renamed from: n */
    public boolean f277355n = true;

    /* renamed from: o */
    public boolean f277356o = false;

    /* renamed from: com.tencent.mm.plugin.sns.ui.PreviewImageView$a */
    public class C95399a extends C94958v<String, Integer, Boolean> {

        /* renamed from: c */
        public ImageView f277357c;

        /* renamed from: d */
        public String f277358d;

        /* renamed from: e */
        public Bitmap f277359e;

        public C95399a(ImageView imageView, String str) {
            this.f277357c = imageView;
            this.f277358d = str;
        }

        /* renamed from: a */
        public Object mo131151a(Object[] objArr) {
            Boolean bool;
            SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.PreviewImageView$ThumbLoader");
            String[] strArr = (String[]) objArr;
            SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.PreviewImageView$ThumbLoader");
            PreviewImageView previewImageView = PreviewImageView.this;
            int i = PreviewImageView.f277347p;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
            boolean z = previewImageView.f277356o;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
            if (z) {
                bool = Boolean.FALSE;
                SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.PreviewImageView$ThumbLoader");
            } else {
                this.f277359e = BitmapUtil.extractThumbNail(this.f277358d, C94866e1.Hx0(), C94866e1.Hx0(), true);
                int orientationInDegree = Exif.fromFile(this.f277358d).getOrientationInDegree();
                Log.m105919d("MicroMsg.MMAsyncTask", "exifPath : %s degree : %d", this.f277358d, Integer.valueOf(orientationInDegree));
                this.f277359e = BitmapUtil.rotate(this.f277359e, (float) orientationInDegree);
                bool = Boolean.TRUE;
                SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.PreviewImageView$ThumbLoader");
            }
            SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.PreviewImageView$ThumbLoader");
            return bool;
        }

        /* renamed from: b */
        public ExecutorService mo131152b() {
            SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.PreviewImageView$ThumbLoader");
            ExecutorService Gx0 = C94866e1.Gx0();
            SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.ui.PreviewImageView$ThumbLoader");
            return Gx0;
        }

        /* renamed from: c */
        public void mo131153c(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.PreviewImageView$ThumbLoader");
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.PreviewImageView$ThumbLoader");
            super.mo131153c((Boolean) obj);
            PreviewImageView previewImageView = PreviewImageView.this;
            int i = PreviewImageView.f277347p;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
            boolean z = previewImageView.f277356o;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
            if (z) {
                SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.PreviewImageView$ThumbLoader");
            } else {
                if (C102236a0.m134740e(this.f277359e)) {
                    PreviewImageView previewImageView2 = PreviewImageView.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
                    HashMap<String, Bitmap> hashMap = previewImageView2.f277353i;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
                    hashMap.put(this.f277358d, this.f277359e);
                    if (this.f277357c.getTag() != null && (this.f277357c.getTag() instanceof String) && this.f277357c.getTag().equals(this.f277358d)) {
                        this.f277357c.setImageBitmap(this.f277359e);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.PreviewImageView$ThumbLoader");
            }
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.PreviewImageView$ThumbLoader");
        }
    }

    public PreviewImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ArrayList();
        this.f277348d = context;
        mo132430b();
    }

    /* renamed from: a */
    public void mo132429a(List<String> list, int i) {
        String str;
        int i2;
        List<String> list2 = list;
        String str2 = "setList";
        SnsMethodCalculate.markStartTimeMs(str2, "com.tencent.mm.plugin.sns.ui.PreviewImageView");
        long currentTimeMillis = System.currentTimeMillis();
        if (list2 == null) {
            SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.PreviewImageView");
            return;
        }
        this.f277350f = list2;
        this.f277349e.removeAllViews();
        int size = list.size() + 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            SnsMethodCalculate.markStartTimeMs("getRow", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
            TableRow tableRow = (TableRow) ((HashMap) this.f277352h).get(Integer.valueOf(i4));
            if (tableRow == null) {
                tableRow = new TableRow(this.f277348d);
                ((HashMap) this.f277352h).put(Integer.valueOf(i4), tableRow);
            }
            SnsMethodCalculate.markEndTimeMs("getRow", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
            tableRow.removeAllViews();
            int i5 = 0;
            while (true) {
                if (i5 >= 4 || i3 >= size) {
                    break;
                } else if (i3 >= i) {
                    i3++;
                    break;
                } else {
                    SnsMethodCalculate.markStartTimeMs("getIV", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
                    View view = (View) ((HashMap) this.f277351g).get(Integer.valueOf(i3));
                    if (view == null) {
                        view = View.inflate(this.f277348d, C0966R.C0971layout.f360012c41, (ViewGroup) null);
                        ((HashMap) this.f277351g).put(Integer.valueOf(i3), view);
                    }
                    SnsMethodCalculate.markEndTimeMs("getIV", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
                    int i6 = size - 1;
                    String str3 = i3 == i6 ? "" : list2.get(i3);
                    ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.fc8);
                    if (i3 != i6) {
                        i2 = size;
                        imageView.setBackgroundDrawable((Drawable) null);
                        imageView.setTag(str3);
                        str = str2;
                        imageView.setContentDescription(getContext().getString(C0966R.string.jd8));
                        Bitmap bitmap = this.f277353i.get(str3);
                        if (!C102236a0.m134740e(bitmap)) {
                            Log.m105918d("MicroMsg.PreviewImageView", "bm is null");
                            new C95399a(imageView, str3).mo131292d("");
                        } else {
                            imageView.setImageBitmap(bitmap);
                        }
                    } else if (!this.f277355n) {
                        str = str2;
                        i2 = size;
                        i5++;
                        i3++;
                        list2 = list;
                        size = i2;
                        str2 = str;
                    } else {
                        imageView.setBackgroundResource(C0966R.C0969drawable.f357354at0);
                        imageView.setContentDescription(getContext().getString(C0966R.string.jak));
                        imageView.setImageDrawable((Drawable) null);
                        str = str2;
                        i2 = size;
                    }
                    if (this.f277354j != null) {
                        if (i3 == i6) {
                            view.setTag(-1);
                            view.setOnClickListener(this.f277354j.f279251a);
                            view.setClickable(true);
                        } else {
                            view.setTag(Integer.valueOf(i3));
                            view.setOnClickListener(this.f277354j.f279251a);
                            view.setClickable(true);
                        }
                    }
                    view.setLayoutParams(new TableRow.LayoutParams(-2, -2));
                    tableRow.addView(view);
                    i5++;
                    i3++;
                    list2 = list;
                    size = i2;
                    str2 = str;
                }
            }
            String str4 = str2;
            int i7 = size;
            if (tableRow.getChildCount() > 0) {
                this.f277349e.addView(tableRow);
            }
            Log.m105918d("MicroMsg.PreviewImageView", "initlist time : " + (System.currentTimeMillis() - currentTimeMillis));
            i4++;
            list2 = list;
            size = i7;
            str2 = str4;
        }
        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.PreviewImageView");
    }

    /* renamed from: b */
    public final void mo132430b() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.PreviewImageView");
        this.f277349e = (TableLayout) LayoutInflater.from(this.f277348d).inflate(C0966R.C0971layout.f360011c40, this, true).findViewById(C0966R.C0970id.br8);
        SnsMethodCalculate.markStartTimeMs("updateScreenSize", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
        if (this.f277348d instanceof Activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) this.f277348d).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            Point point = new Point();
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
            C94866e1.uy0(point);
        }
        SnsMethodCalculate.markEndTimeMs("updateScreenSize", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.PreviewImageView");
    }

    public void clean() {
        SnsMethodCalculate.markStartTimeMs("clean", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
        this.f277356o = true;
        for (Bitmap next : this.f277353i.values()) {
            if (C102236a0.m134740e(next)) {
                next.recycle();
            }
        }
        SnsMethodCalculate.markEndTimeMs("clean", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
    }

    public int getCount() {
        SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
        int size = this.f277351g.size();
        SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
        return size;
    }

    public View getView() {
        SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
        SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
        return this;
    }

    public void setImageClick(C95738b1.C95739a aVar) {
        SnsMethodCalculate.markStartTimeMs("setImageClick", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
        this.f277354j = aVar;
        SnsMethodCalculate.markEndTimeMs("setImageClick", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
    }

    public void setIsShowAddImage(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIsShowAddImage", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
        this.f277355n = z;
        SnsMethodCalculate.markEndTimeMs("setIsShowAddImage", "com.tencent.mm.plugin.sns.ui.PreviewImageView");
    }

    public PreviewImageView(Context context) {
        super(context);
        new ArrayList();
        this.f277348d = context;
        mo132430b();
    }
}
