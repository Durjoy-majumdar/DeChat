package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.tencent.map.tools.Util;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.internal.C104548ha;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;

/* renamed from: com.tencent.mapsdk.internal.fm */
public final class C113728fm implements BitmapDescriptor.BitmapFormator {

    /* renamed from: a */
    public int f340184a = -1;

    /* renamed from: b */
    public String f340185b = "";

    /* renamed from: c */
    public String f340186c = "";

    /* renamed from: d */
    public String f340187d = "";

    /* renamed from: e */
    public float f340188e = -1.0f;

    /* renamed from: f */
    public String f340189f;

    /* renamed from: g */
    public C113729a f340190g;

    /* renamed from: h */
    public Bitmap[] f340191h;

    /* renamed from: i */
    public final Context f340192i;

    /* renamed from: j */
    private final String f340193j = "marker_default.png";

    /* renamed from: k */
    private final int f340194k;

    /* renamed from: l */
    private Bitmap f340195l;

    /* renamed from: m */
    private String f340196m;

    /* renamed from: n */
    private int f340197n = 1;

    /* renamed from: o */
    private int f340198o;

    /* renamed from: p */
    private int f340199p;

    /* renamed from: q */
    private int f340200q;

    /* renamed from: r */
    private C104560mo f340201r;

    /* renamed from: com.tencent.mapsdk.internal.fm$a */
    public static class C113729a implements Parcelable {
        public static final Parcelable.Creator<C113729a> CREATOR = new Parcelable.Creator<C113729a>() {
            /* renamed from: a */
            private static C113729a m156822a(Parcel parcel) {
                return new C113729a(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C113729a(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C113729a[i];
            }

            /* renamed from: a */
            private static C113729a[] m156823a(int i) {
                return new C113729a[i];
            }
        };

        /* renamed from: a */
        public String f340202a;

        /* renamed from: b */
        public int f340203b;

        /* renamed from: c */
        public int f340204c;

        /* renamed from: d */
        public float f340205d;

        /* renamed from: e */
        public int f340206e;

        /* renamed from: f */
        public Typeface f340207f;

        /* renamed from: g */
        public float f340208g = 1.0f;

        public C113729a(String str, int i, int i2) {
            this.f340202a = str;
            this.f340203b = i;
            this.f340204c = i2;
        }

        /* renamed from: a */
        private float m156815a() {
            return this.f340208g;
        }

        /* renamed from: b */
        private float m156819b() {
            return this.f340205d;
        }

        /* renamed from: c */
        private int m156821c() {
            return this.f340206e;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("FontText{");
            stringBuffer.append("text='");
            stringBuffer.append(this.f340202a);
            stringBuffer.append('\'');
            stringBuffer.append(", textSize=");
            stringBuffer.append(this.f340203b);
            stringBuffer.append(", textColor=");
            stringBuffer.append(this.f340204c);
            stringBuffer.append(", strokeWith=");
            stringBuffer.append(this.f340205d);
            stringBuffer.append(", strokeColor=");
            stringBuffer.append(this.f340206e);
            stringBuffer.append(", typeface=");
            stringBuffer.append(this.f340207f);
            stringBuffer.append(", scale=");
            stringBuffer.append(this.f340208g);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f340202a);
            parcel.writeInt(this.f340203b);
            parcel.writeInt(this.f340204c);
            parcel.writeFloat(this.f340205d);
            parcel.writeInt(this.f340206e);
            parcel.writeFloat(this.f340208g);
        }

        /* renamed from: a */
        private void m156816a(float f) {
            this.f340208g = f;
        }

        /* renamed from: b */
        private void m156820b(float f) {
            this.f340205d = f;
        }

        /* renamed from: a */
        private void m156817a(int i) {
            this.f340206e = i;
        }

        /* renamed from: a */
        private void m156818a(Typeface typeface) {
            this.f340207f = typeface;
        }

        public C113729a(Parcel parcel) {
            this.f340202a = parcel.readString();
            this.f340203b = parcel.readInt();
            this.f340204c = parcel.readInt();
            this.f340205d = parcel.readFloat();
            this.f340206e = parcel.readInt();
            this.f340208g = parcel.readFloat();
        }
    }

    public C113728fm(Context context, int i) {
        this.f340192i = context;
        this.f340194k = i;
    }

    /* renamed from: a */
    private String m156804a() {
        if (this.f340197n <= 1) {
            return "";
        }
        return "@" + this.f340197n + "x";
    }

    /* renamed from: a */
    private static String m156805a(float f) {
        if (f < 30.0f) {
            return "RED.png";
        }
        if (f >= 30.0f && f < 60.0f) {
            return "ORANGE.png";
        }
        if (f >= 60.0f && f < 120.0f) {
            return "YELLOW.png";
        }
        if (f >= 120.0f && f < 180.0f) {
            return "GREEN.png";
        }
        if (f >= 180.0f && f < 210.0f) {
            return "CYAN.png";
        }
        if (f >= 210.0f && f < 240.0f) {
            return "AZURE.png";
        }
        if (f >= 240.0f && f < 270.0f) {
            return "BLUE.png";
        }
        if (f >= 270.0f && f < 300.0f) {
            return "VIOLET.png";
        }
        if (f >= 300.0f && f < 330.0f) {
            return "MAGENTAV.png";
        }
        if (f >= 330.0f) {
            return "ROSE.png";
        }
        return null;
    }

    /* renamed from: b */
    private static String m156810b(Bitmap bitmap) {
        return C104548ha.m139947a(bitmap);
    }

    /* renamed from: c */
    private BitmapDescriptor.BitmapFormator m156811c(String str) {
        this.f340186c = str;
        return this;
    }

    /* renamed from: d */
    private BitmapDescriptor.BitmapFormator m156812d(String str) {
        this.f340187d = str;
        return this;
    }

    /* renamed from: e */
    private BitmapDescriptor.BitmapFormator m156813e(String str) {
        this.f340189f = str;
        return this;
    }

    public final int activeSize() {
        Bitmap[] bitmapArr = this.f340191h;
        return bitmapArr != null ? bitmapArr.length : this.f340195l != null ? 1 : 0;
    }

    public final Bitmap getBitmap(Context context) {
        int i;
        Bitmap bitmap = this.f340195l;
        if (bitmap != null && this.f340196m != null && this.f340194k != 10) {
            return bitmap;
        }
        Bitmap bitmap2 = null;
        if (context == null) {
            return null;
        }
        C104548ha.C104549a aVar = C104548ha.f309920b;
        Bitmap a = aVar != null ? aVar.mo147862a(getBitmapId()) : null;
        if (a == null) {
            switch (this.f340194k) {
                case 1:
                    bitmap2 = C104548ha.m139937a(context, this.f340184a);
                    break;
                case 2:
                    bitmap2 = C104548ha.m139955c(context, this.f340185b);
                    if (bitmap2 == null && (bitmap2 = C104548ha.m139952b(context, this.f340185b)) != null && !this.f340185b.equals(C113736fs.f340252i)) {
                        bitmap2 = C104548ha.m139953b(bitmap2);
                        break;
                    }
                case 3:
                    bitmap2 = C104548ha.m139938a(context, this.f340186c);
                    break;
                case 4:
                    bitmap2 = C104548ha.m139944a(this.f340187d);
                    break;
                case 5:
                    bitmap2 = C104548ha.m139952b(context, "marker_default.png");
                    break;
                case 6:
                    String a2 = m156805a(this.f340188e);
                    if (a2 != null) {
                        bitmap2 = C104548ha.m139952b(context, a2);
                        break;
                    }
                    break;
                case 7:
                    bitmap2 = this.f340195l;
                    break;
                case 8:
                    if (!TextUtils.isEmpty(this.f340189f)) {
                        bitmap2 = m156801a(this.f340189f);
                        break;
                    }
                    break;
                case 9:
                    C113729a aVar2 = this.f340190g;
                    if (aVar2 != null) {
                        if (this.f340201r == null) {
                            this.f340201r = new C104560mo(context);
                        }
                        C104560mo moVar = this.f340201r;
                        moVar.setText(aVar2.f340202a);
                        moVar.setTextSize(0, ((float) aVar2.f340203b) * aVar2.f340208g);
                        moVar.setTextColor(aVar2.f340204c);
                        moVar.setStrokeColor(aVar2.f340206e);
                        moVar.setStrokeWidth(aVar2.f340205d * aVar2.f340208g);
                        moVar.setTypeface(aVar2.f340207f);
                        bitmap2 = C104548ha.m139943a((View) moVar);
                        break;
                    }
                    break;
                case 10:
                    Bitmap[] bitmapArr = this.f340191h;
                    if (bitmapArr != null && bitmapArr.length > (i = this.f340200q) && i >= 0) {
                        bitmap2 = bitmapArr[i];
                        break;
                    }
            }
            C104548ha.C104549a aVar3 = C104548ha.f309920b;
            if (!(aVar3 == null || bitmap2 == null)) {
                aVar3.mo147863a(getBitmapId(), bitmap2);
            }
            a = bitmap2;
        }
        if (a != null) {
            this.f340198o = a.getWidth();
            this.f340199p = a.getHeight();
            this.f340195l = a;
        }
        return a;
    }

    public final String getBitmapId() {
        String str;
        int i;
        Bitmap bitmap;
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(this.f340196m) || this.f340194k == 10) {
            switch (this.f340194k) {
                case 1:
                    this.f340196m = "res_" + this.f340184a;
                    break;
                case 2:
                    this.f340196m = "asset_" + this.f340185b;
                    break;
                case 3:
                    this.f340196m = "file_" + this.f340186c;
                    break;
                case 4:
                    this.f340196m = "path_" + this.f340187d;
                    break;
                case 5:
                    this.f340196m = "asset_marker_default.png";
                    break;
                case 6:
                    String a = m156805a(this.f340188e);
                    if (a != null) {
                        this.f340196m = "asset_".concat(a);
                        break;
                    }
                    break;
                case 7:
                    Bitmap bitmap2 = this.f340195l;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        this.f340196m = "bitmap_" + C104548ha.m139947a(this.f340195l);
                        break;
                    }
                case 8:
                    if (!TextUtils.isEmpty(this.f340189f)) {
                        this.f340196m = "url_" + Util.getMD5String(this.f340189f);
                        break;
                    }
                    break;
                case 9:
                    if (this.f340190g != null) {
                        this.f340196m = "fonttext_" + Util.getMD5String(this.f340190g.toString());
                        break;
                    }
                    break;
                case 10:
                    Bitmap[] bitmapArr = this.f340191h;
                    if (bitmapArr != null && bitmapArr.length > (i = this.f340200q) && i >= 0 && (bitmap = bitmapArr[i]) != null && !bitmap.isRecycled()) {
                        this.f340196m = "bitmaps_" + C104548ha.m139947a(bitmap);
                        break;
                    }
            }
        }
        sb.append(this.f340196m);
        if (this.f340197n <= 1) {
            str = "";
        } else {
            str = "@" + this.f340197n + "x";
        }
        sb.append(str);
        return sb.toString();
    }

    public final int getFormateType() {
        return this.f340194k;
    }

    public final int getHeight() {
        getBitmap(this.f340192i);
        return this.f340199p;
    }

    public final int getWidth() {
        getBitmap(this.f340192i);
        return this.f340198o;
    }

    public final int nextActiveIndex() {
        Bitmap[] bitmapArr = this.f340191h;
        if (bitmapArr == null || bitmapArr.length <= 1) {
            this.f340200q = 0;
        } else {
            int i = this.f340200q + 1;
            this.f340200q = i;
            this.f340200q = i % bitmapArr.length;
        }
        return this.f340200q;
    }

    public final void recycle() {
        C113889km.m157545b(C0949kl.f2248r, "remove on format recycle");
        if (C104548ha.f309920b.mo147864b(getBitmapId())) {
            C113886kg.m157517a(this.f340191h);
            C113886kg.m157517a(this.f340195l);
        }
    }

    public final void setScale(int i) {
        this.f340197n = i;
    }

    /* renamed from: b */
    private String m156809b() {
        int i;
        Bitmap bitmap;
        if (!TextUtils.isEmpty(this.f340196m) && this.f340194k != 10) {
            return this.f340196m;
        }
        switch (this.f340194k) {
            case 1:
                this.f340196m = "res_" + this.f340184a;
                break;
            case 2:
                this.f340196m = "asset_" + this.f340185b;
                break;
            case 3:
                this.f340196m = "file_" + this.f340186c;
                break;
            case 4:
                this.f340196m = "path_" + this.f340187d;
                break;
            case 5:
                this.f340196m = "asset_marker_default.png";
                break;
            case 6:
                String a = m156805a(this.f340188e);
                if (a != null) {
                    this.f340196m = "asset_".concat(a);
                    break;
                }
                break;
            case 7:
                Bitmap bitmap2 = this.f340195l;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    this.f340196m = "bitmap_" + C104548ha.m139947a(this.f340195l);
                    break;
                }
            case 8:
                if (!TextUtils.isEmpty(this.f340189f)) {
                    this.f340196m = "url_" + Util.getMD5String(this.f340189f);
                    break;
                }
                break;
            case 9:
                if (this.f340190g != null) {
                    this.f340196m = "fonttext_" + Util.getMD5String(this.f340190g.toString());
                    break;
                }
                break;
            case 10:
                Bitmap[] bitmapArr = this.f340191h;
                if (bitmapArr != null && bitmapArr.length > (i = this.f340200q) && i >= 0 && (bitmap = bitmapArr[i]) != null && !bitmap.isRecycled()) {
                    this.f340196m = "bitmaps_" + C104548ha.m139947a(bitmap);
                    break;
                }
        }
        return this.f340196m;
    }

    /* renamed from: a */
    private Bitmap m156799a(Context context, int i) {
        int i2;
        switch (i) {
            case 1:
                return C104548ha.m139937a(context, this.f340184a);
            case 2:
                Bitmap c = C104548ha.m139955c(context, this.f340185b);
                if (c != null) {
                    return c;
                }
                Bitmap b = C104548ha.m139952b(context, this.f340185b);
                if (b == null || this.f340185b.equals(C113736fs.f340252i)) {
                    return b;
                }
                return C104548ha.m139953b(b);
            case 3:
                return C104548ha.m139938a(context, this.f340186c);
            case 4:
                return C104548ha.m139944a(this.f340187d);
            case 5:
                return C104548ha.m139952b(context, "marker_default.png");
            case 6:
                String a = m156805a(this.f340188e);
                if (a != null) {
                    return C104548ha.m139952b(context, a);
                }
                break;
            case 7:
                return this.f340195l;
            case 8:
                if (!TextUtils.isEmpty(this.f340189f)) {
                    return m156801a(this.f340189f);
                }
                break;
            case 9:
                C113729a aVar = this.f340190g;
                if (aVar != null) {
                    if (this.f340201r == null) {
                        this.f340201r = new C104560mo(context);
                    }
                    C104560mo moVar = this.f340201r;
                    moVar.setText(aVar.f340202a);
                    moVar.setTextSize(0, ((float) aVar.f340203b) * aVar.f340208g);
                    moVar.setTextColor(aVar.f340204c);
                    moVar.setStrokeColor(aVar.f340206e);
                    moVar.setStrokeWidth(aVar.f340205d * aVar.f340208g);
                    moVar.setTypeface(aVar.f340207f);
                    return C104548ha.m139943a((View) moVar);
                }
                break;
            case 10:
                Bitmap[] bitmapArr = this.f340191h;
                if (bitmapArr != null && bitmapArr.length > (i2 = this.f340200q) && i2 >= 0) {
                    return bitmapArr[i2];
                }
        }
        return null;
    }

    /* renamed from: a */
    private Bitmap m156800a(Context context, C113729a aVar) {
        if (this.f340201r == null) {
            this.f340201r = new C104560mo(context);
        }
        C104560mo moVar = this.f340201r;
        moVar.setText(aVar.f340202a);
        moVar.setTextSize(0, ((float) aVar.f340203b) * aVar.f340208g);
        moVar.setTextColor(aVar.f340204c);
        moVar.setStrokeColor(aVar.f340206e);
        moVar.setStrokeWidth(aVar.f340205d * aVar.f340208g);
        moVar.setTypeface(aVar.f340207f);
        return C104548ha.m139943a((View) moVar);
    }

    /* renamed from: b */
    private BitmapDescriptor.BitmapFormator m156808b(String str) {
        this.f340185b = str;
        return this;
    }

    /* renamed from: b */
    private BitmapDescriptor.BitmapFormator m156807b(float f) {
        this.f340188e = f;
        return this;
    }

    /* renamed from: a */
    private static Bitmap m156801a(String str) {
        NetResponse doGet = NetManager.getInstance().builder().url(str).doGet();
        if (doGet != null && doGet.available()) {
            try {
                byte[] bArr = doGet.data;
                return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            } catch (OutOfMemoryError unused) {
                System.gc();
                try {
                    byte[] bArr2 = doGet.data;
                    return BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
                } catch (OutOfMemoryError unused2) {
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private BitmapDescriptor.BitmapFormator m156802a(int i) {
        this.f340184a = i;
        return this;
    }

    /* renamed from: a */
    public final BitmapDescriptor.BitmapFormator mo172066a(Bitmap bitmap) {
        this.f340195l = bitmap;
        getBitmap(this.f340192i);
        return this;
    }

    /* renamed from: a */
    private BitmapDescriptor.BitmapFormator m156803a(C113729a aVar) {
        this.f340190g = aVar;
        return this;
    }

    /* renamed from: a */
    private void m156806a(Bitmap[] bitmapArr) {
        this.f340191h = bitmapArr;
        getBitmap(this.f340192i);
    }
}
