package com.tencent.p014mm.p136ui.tools;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMHorList;
import com.tencent.p014mm.pointers.PIntArray;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

/* renamed from: com.tencent.mm.ui.tools.FilterImageView */
public class FilterImageView extends LinearLayout {

    /* renamed from: r */
    public static C116131c[] f348518r = {new C116131c(new C116130b("原图", "原圖", "Normal"), "icon.png", 0, 0, "MatteOrigin.jpg", 0), new C116131c(new C116130b("LOMO", "LOMO", "LOMO"), "nuowei_mask%02d.jpg", 2, 1, "0004.jpg", 2), new C116131c(new C116130b("麦田", "麥田", "Wheat"), "0062_%02d.jpg", 2, 2, "0062.jpg", 20), new C116131c(new C116130b("玻璃镜", "玻璃鏡", "Glossy"), "habi_mask%02d.jpg", 1, 3, "0005.jpg", 4), new C116131c(new C116130b("拍立得", "拍立得", "Polaroid"), "0063_%02d.jpg", 2, 4, "0063.jpg", 21), new C116131c(new C116130b("湖水", "湖水", "Lake"), "0061_%02d.jpg", 1, 5, "0061.jpg", 19), new C116131c(new C116130b("黄昏", "黃昏", "Twilight"), "0030_mask%01d.jpg", 1, 6, "0030.jpg", 7), new C116131c(new C116130b("黑白", "黑白", "B&W"), "0065_%02d.jpg", 1, 7, "0065.jpg", 22), new C116131c(new C116130b("铜版画", "銅版畫", "Aquatint"), "0032_mask%01d.jpg", 1, 8, "0032.jpg", 9), new C116131c(new C116130b("圆珠笔", "圓珠筆", "Pen"), "0035_mask%01d.jpg", 1, 9, "0035.jpg", 18), new C116131c(new C116130b("海报", "海報", "Poster"), "0036_mask%01d.jpg", 0, 10, "0036.jpg", 17), new C116131c(new C116130b("素描", "素描", "Portrait"), "icon.jpg", 0, 11, "0040.jpg", 12)};

    /* renamed from: d */
    public Activity f348519d;

    /* renamed from: e */
    public int[] f348520e;

    /* renamed from: f */
    public View f348521f;

    /* renamed from: g */
    public ImageView f348522g;

    /* renamed from: h */
    public CropImageView f348523h;

    /* renamed from: i */
    public Bitmap f348524i;

    /* renamed from: j */
    public MMHorList f348525j;

    /* renamed from: n */
    public C116128a f348526n;

    /* renamed from: o */
    public int f348527o = 0;

    /* renamed from: p */
    public Runnable f348528p;

    /* renamed from: q */
    public Runnable f348529q;

    /* renamed from: com.tencent.mm.ui.tools.FilterImageView$a */
    public class C116128a extends BaseAdapter {

        /* renamed from: d */
        public int f348530d = 0;

        /* renamed from: com.tencent.mm.ui.tools.FilterImageView$a$a */
        public class C116129a {

            /* renamed from: a */
            public TextView f348532a;

            /* renamed from: b */
            public ImageView f348533b;

            /* renamed from: c */
            public Bitmap f348534c;

            public C116129a(C116128a aVar) {
            }
        }

        public C116128a() {
        }

        public int getCount() {
            C116131c[] cVarArr = FilterImageView.f348518r;
            return 12;
        }

        public Object getItem(int i) {
            return FilterImageView.f348518r[i];
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C116129a aVar;
            C116131c cVar = FilterImageView.f348518r[i];
            if (view == null || !(view.getTag() instanceof C116129a)) {
                view = View.inflate(FilterImageView.this.f348519d, C0966R.C0971layout.a8a, (ViewGroup) null);
                aVar = new C116129a(this);
                aVar.f348532a = (TextView) view.findViewById(C0966R.C0970id.f358031d34);
                aVar.f348533b = (ImageView) view.findViewById(C0966R.C0970id.f358030d33);
                view.setTag(aVar);
            } else {
                aVar = (C116129a) view.getTag();
                Bitmap bitmap = aVar.f348534c;
                if (bitmap != null) {
                    Log.m105925i("MicroMsg.FilterView", "recycle bitmap:%s", bitmap.toString());
                    aVar.f348534c.recycle();
                }
            }
            TextView textView = aVar.f348532a;
            C116130b bVar = cVar.f348538a;
            bVar.getClass();
            String applicationLanguage = LocaleUtil.getApplicationLanguage();
            textView.setText(applicationLanguage.equals("zh_CN") ? bVar.f348535a : (applicationLanguage.equals("zh_TW") || applicationLanguage.equals("zh_HK")) ? bVar.f348536b : bVar.f348537c);
            try {
                AssetManager assets = FilterImageView.this.f348519d.getAssets();
                InputStream open = assets.open("filter/" + cVar.f348542e);
                aVar.f348534c = BackwardSupportUtil.BitmapFactory.decodeStream(open);
                open.close();
                aVar.f348533b.setImageBitmap(aVar.f348534c);
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.FilterView", e, "", new Object[0]);
            }
            view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            if (i == this.f348530d) {
                view.findViewById(C0966R.C0970id.f358030d33).setBackgroundResource(C0966R.C0969drawable.be7);
            } else {
                view.findViewById(C0966R.C0970id.f358030d33).setBackgroundResource(C0966R.C0969drawable.be8);
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.FilterImageView$b */
    public static class C116130b {

        /* renamed from: a */
        public String f348535a;

        /* renamed from: b */
        public String f348536b;

        /* renamed from: c */
        public String f348537c;

        public C116130b(String str, String str2, String str3) {
            this.f348535a = str;
            this.f348536b = str2;
            this.f348537c = str3;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.FilterImageView$c */
    public static class C116131c {

        /* renamed from: a */
        public C116130b f348538a;

        /* renamed from: b */
        public String f348539b;

        /* renamed from: c */
        public int f348540c;

        /* renamed from: d */
        public int f348541d;

        /* renamed from: e */
        public String f348542e;

        /* renamed from: f */
        public int f348543f;

        public C116131c(C116130b bVar, String str, int i, int i2, String str2, int i3) {
            this.f348538a = bVar;
            this.f348539b = str;
            this.f348540c = i;
            this.f348541d = i2;
            this.f348542e = str2;
            this.f348543f = i3;
        }
    }

    public FilterImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Activity activity = (Activity) context;
        this.f348519d = activity;
        View inflate = View.inflate(activity, C0966R.C0971layout.f7111ym, this);
        this.f348523h = (CropImageView) inflate.findViewById(C0966R.C0970id.bwz);
        this.f348522g = (ImageView) inflate.findViewById(C0966R.C0970id.bx8);
        this.f348521f = inflate.findViewById(C0966R.C0970id.f357816bx3);
        this.f348523h.setOnTouchListener((View.OnTouchListener) null);
        this.f348525j = (MMHorList) inflate.findViewById(C0966R.C0970id.bww);
        C116128a aVar = new C116128a();
        this.f348526n = aVar;
        this.f348525j.setAdapter((ListAdapter) aVar);
        this.f348525j.invalidate();
        this.f348525j.setOnItemClickListener(new C116155k0(this));
    }

    /* renamed from: a */
    public static boolean m163410a(FilterImageView filterImageView, String str, int i, int i2) {
        FilterImageView filterImageView2 = filterImageView;
        int i3 = i;
        if (i2 == 0) {
            Bitmap bitmap = filterImageView2.f348524i;
            bitmap.setPixels(filterImageView2.f348520e, 0, bitmap.getWidth(), 0, 0, filterImageView2.f348524i.getWidth(), filterImageView2.f348524i.getHeight());
            filterImageView2.f348523h.invalidate();
        } else {
            int width = filterImageView2.f348524i.getWidth() * filterImageView2.f348524i.getHeight();
            Log.m105918d("MicroMsg.FilterView", "len:" + width + "  maskCount:" + i3);
            int[] iArr = new int[2];
            iArr[1] = width;
            iArr[0] = i3;
            int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
            int i4 = 0;
            while (i4 < i3) {
                String format = String.format(str, new Object[]{Integer.valueOf(i4)});
                InputStream inputStream = null;
                try {
                    AssetManager assets = filterImageView2.f348519d.getAssets();
                    inputStream = assets.open("filter/" + format);
                    byte[] bArr = new byte[width];
                    inputStream.read(bArr);
                    Bitmap decodeByteArray = BitmapUtil.decodeByteArray(bArr);
                    inputStream.close();
                    inputStream.close();
                    if (decodeByteArray == null) {
                        return false;
                    }
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, filterImageView2.f348524i.getWidth(), filterImageView2.f348524i.getHeight(), true);
                    if (decodeByteArray != createScaledBitmap) {
                        Log.m105925i("MicroMsg.FilterView", "recycle bitmap:%s", decodeByteArray.toString());
                        decodeByteArray.recycle();
                    }
                    if (createScaledBitmap == null) {
                        return false;
                    }
                    createScaledBitmap.getPixels(iArr2[i4], 0, createScaledBitmap.getWidth(), 0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                    Log.m105925i("MicroMsg.FilterView", "recycle bitmap:%s", createScaledBitmap.toString());
                    createScaledBitmap.recycle();
                    i4++;
                } catch (Exception e) {
                    throw e;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
            PIntArray pIntArray = new PIntArray();
            Log.m105920e("MicroMsg.FilterView", "src.len:" + filterImageView2.f348520e.length);
            for (int i5 = 0; i5 < iArr2.length; i5++) {
                Log.m105920e("MicroMsg.FilterView", "mask[" + i5 + "].len:" + iArr2[i5].length);
            }
            Log.m105920e("MicroMsg.FilterView", "before filter");
            ImgFilter.FilterInt(i2, filterImageView2.f348520e, iArr2, i, filterImageView2.f348524i.getWidth(), filterImageView2.f348524i.getHeight(), pIntArray);
            Log.m105920e("MicroMsg.FilterView", "after filter");
            Bitmap bitmap2 = filterImageView2.f348524i;
            bitmap2.setPixels(pIntArray.value, 0, bitmap2.getWidth(), 0, 0, filterImageView2.f348524i.getWidth(), filterImageView2.f348524i.getHeight());
            filterImageView2.f348523h.invalidate();
        }
        return true;
    }

    /* renamed from: b */
    public void mo177454b() {
        CropImageView cropImageView = this.f348523h;
        if (cropImageView != null) {
            cropImageView.setScaleType(ImageView.ScaleType.MATRIX);
            CropImageView cropImageView2 = this.f348523h;
            cropImageView2.setOnTouchListener(cropImageView2.f348490C);
        }
    }

    /* renamed from: c */
    public void mo177455c(String str, int i) {
        int i2 = i % 180;
        Log.m105924i("MicroMsg.FilterView", "filePath before fiterBmp:" + str);
        Bitmap bitmap = this.f348524i;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f348524i = BitmapUtil.rotate(BitmapUtil.extractThumbNail(str, 480, 480, false), (float) i);
        }
        Log.m105918d("MicroMsg.FilterView", "filterBmp w:" + this.f348524i.getWidth() + " h:" + this.f348524i.getHeight());
        int[] iArr = new int[(this.f348524i.getWidth() * this.f348524i.getHeight())];
        this.f348520e = iArr;
        Bitmap bitmap2 = this.f348524i;
        bitmap2.getPixels(iArr, 0, bitmap2.getWidth(), 0, 0, this.f348524i.getWidth(), this.f348524i.getHeight());
        this.f348523h.setImageBitmap(this.f348524i);
    }

    public View getCropAreaView() {
        return this.f348521f;
    }

    public CropImageView getCropImageIV() {
        return this.f348523h;
    }

    public Bitmap getFilterBmp() {
        return this.f348524i;
    }

    public int getFilterId() {
        return this.f348527o;
    }

    public void setCropMaskBackground(int i) {
        ImageView imageView = this.f348522g;
        if (imageView != null) {
            imageView.setBackgroundResource(i);
        }
    }

    public void setCropMaskVisible(int i) {
        ImageView imageView = this.f348522g;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public void setImage(Bitmap bitmap) {
        this.f348524i = bitmap;
    }

    public void setLimitZoomIn(boolean z) {
        CropImageView cropImageView = this.f348523h;
        if (cropImageView != null) {
            cropImageView.setLimitZoomIn(z);
        }
    }

    public void setMatrix(Matrix matrix) {
        CropImageView cropImageView = this.f348523h;
        if (cropImageView != null) {
            cropImageView.setImageMatrix(matrix);
        }
    }

    public void setOnConfirmImp(Runnable runnable) {
        this.f348528p = runnable;
    }

    public void setOnExitImp(Runnable runnable) {
        this.f348529q = runnable;
    }

    public void setVisibility(int i) {
        if (i == 0) {
            this.f348526n.notifyDataSetChanged();
            this.f348525j.invalidate();
        }
        super.setVisibility(i);
    }
}
