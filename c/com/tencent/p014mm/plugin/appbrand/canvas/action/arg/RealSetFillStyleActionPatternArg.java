package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Objects;
import js0.C88020k;
import pi0.C110229d;
import si0.C110791a;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionPatternArg */
public class RealSetFillStyleActionPatternArg extends RealSetFillStyleActionArg {
    public static final Parcelable.Creator<RealSetFillStyleActionPatternArg> CREATOR = new C104746a();

    /* renamed from: e */
    public String f311092e;

    /* renamed from: f */
    public String f311093f;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionPatternArg$a */
    public class C104746a implements Parcelable.Creator<RealSetFillStyleActionPatternArg> {
        public Object createFromParcel(Parcel parcel) {
            return new RealSetFillStyleActionPatternArg(parcel);
        }

        public Object[] newArray(int i) {
            return new RealSetFillStyleActionPatternArg[i];
        }
    }

    public RealSetFillStyleActionPatternArg() {
    }

    /* renamed from: a */
    public boolean mo148409a(C110229d dVar, Canvas canvas) {
        BitmapShader bitmapShader;
        if (Util.isNullOrNil(this.f311092e)) {
            return false;
        }
        C110791a aVar = dVar.f329745b;
        Bitmap Zu0 = dVar.f329750g.Zu0(dVar, this.f311092e);
        if (Zu0 != null && !Zu0.isRecycled()) {
            String str = this.f311093f;
            int d = C88020k.m109553d(Zu0.getWidth());
            int d2 = C88020k.m109553d(Zu0.getHeight());
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -934531685:
                    if (str.equals("repeat")) {
                        c = 0;
                        break;
                    }
                    break;
                case -724648153:
                    if (str.equals("no-repeat")) {
                        c = 1;
                        break;
                    }
                    break;
                case -436782906:
                    if (str.equals("repeat-x")) {
                        c = 2;
                        break;
                    }
                    break;
                case -436782905:
                    if (str.equals("repeat-y")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            BitmapShader bitmapShader2 = null;
            if (c != 0) {
                if (c == 1) {
                    Bitmap createBitmap = Bitmap.createBitmap(d + 1, d2 + 1, Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap).drawBitmap(Zu0, new Rect(0, 0, Zu0.getWidth(), Zu0.getHeight()), new RectF(0.0f, 0.0f, (float) d, (float) d2), (Paint) null);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                } else if (c == 2) {
                    Bitmap createBitmap2 = Bitmap.createBitmap(d, d2 + 1, Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap2).drawBitmap(Zu0, new Rect(0, 0, Zu0.getWidth(), Zu0.getHeight()), new RectF(0.0f, 0.0f, (float) d, (float) d2), (Paint) null);
                    bitmapShader = new BitmapShader(createBitmap2, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
                } else if (c == 3) {
                    Bitmap createBitmap3 = Bitmap.createBitmap(d + 1, d2, Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap3).drawBitmap(Zu0, new Rect(0, 0, Zu0.getWidth(), Zu0.getHeight()), new RectF(0.0f, 0.0f, (float) d, (float) d2), (Paint) null);
                    bitmapShader = new BitmapShader(createBitmap3, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT);
                }
                bitmapShader2 = bitmapShader;
            } else {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(Zu0, d, d2, false);
                Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                bitmapShader2 = new BitmapShader(createScaledBitmap, tileMode2, tileMode2);
            }
            aVar.setShader(bitmapShader2);
        }
        return true;
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311092e = parcel.readString();
        this.f311093f = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealSetFillStyleActionPatternArg) || !super.equals(obj)) {
            return false;
        }
        RealSetFillStyleActionPatternArg realSetFillStyleActionPatternArg = (RealSetFillStyleActionPatternArg) obj;
        return Objects.equals(this.f311092e, realSetFillStyleActionPatternArg.f311092e) && Objects.equals(this.f311093f, realSetFillStyleActionPatternArg.f311093f);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f311092e, this.f311093f});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeString(this.f311092e);
        parcel.writeString(this.f311093f);
    }

    public RealSetFillStyleActionPatternArg(Parcel parcel) {
        super(parcel);
    }
}
