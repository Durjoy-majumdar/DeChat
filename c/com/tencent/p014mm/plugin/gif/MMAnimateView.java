package com.tencent.p014mm.plugin.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.io.IOException;
import kg3.C76577a;
import p008bq.C92279g0;
import p008bq.C92281h1;
import p206nj.C88955f;
import qz1.C101325b;
import qz1.C22180d;
import qz1.C22187h;

/* renamed from: com.tencent.mm.plugin.gif.MMAnimateView */
public class MMAnimateView extends AppCompatImageView {

    /* renamed from: f */
    public int f271885f;

    /* renamed from: g */
    public int f271886g;

    /* renamed from: h */
    public float f271887h;

    /* renamed from: i */
    public String f271888i;

    /* renamed from: j */
    public boolean f271889j;

    public MMAnimateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public String getCacheKey() {
        return this.f271888i;
    }

    public int getEmojiDensity() {
        return C0947jz.f2205e;
    }

    public float getEmojiDensityScale() {
        if (this.f271887h == 0.0f) {
            float g = C76577a.m92156g(MMApplicationContext.getContext()) / 2.0f;
            this.f271887h = g;
            if (g < 1.0f) {
                this.f271887h = 1.0f;
            } else if (g > 2.0f) {
                this.f271887h = 2.0f;
            }
        }
        return this.f271887h;
    }

    public int getIntrinsicHeight() {
        if (getDrawable() == null) {
            return 0;
        }
        return getDrawable().getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        if (getDrawable() == null) {
            return 0;
        }
        return getDrawable().getIntrinsicWidth();
    }

    /* renamed from: p */
    public void mo129221p() {
        if (C88955f.m111058b()) {
            int i = this.f271885f;
            if (i > 0) {
                super.setImageResource(i);
                return;
            }
            return;
        }
        int i2 = this.f271886g;
        if (i2 > 0) {
            super.setImageResource(i2);
        }
    }

    public void pause() {
        if (getDrawable() != null && (getDrawable() instanceof C101325b)) {
            ((C101325b) getDrawable()).mo35279a();
        }
    }

    /* renamed from: q */
    public boolean mo129223q() {
        if (getDrawable() == null || !(getDrawable() instanceof C101325b)) {
            return false;
        }
        return ((C101325b) getDrawable()).isRunning();
    }

    /* renamed from: r */
    public void mo129224r(MMGIFException mMGIFException) {
        ((C92281h1) C86312j.m106911c(C92281h1.class)).P90(mMGIFException);
    }

    public void resume() {
        if (getDrawable() != null && (getDrawable() instanceof C101325b)) {
            ((C101325b) getDrawable()).mo35282d();
        }
    }

    /* renamed from: s */
    public void mo129226s() {
        if (getDrawable() != null && (getDrawable() instanceof C22180d)) {
            ((C22180d) getDrawable()).mo35280b();
        }
    }

    public void setBackgroundResource(int i) {
        mo129235v(getResources(), i, false, (String) null);
    }

    public void setBoundaryCheckInvalid(boolean z) {
        this.f271889j = z;
    }

    public void setCacheKey(String str) {
        this.f271888i = str;
    }

    public void setDefaultBackgroundResource(int i) {
        this.f271885f = i;
    }

    public void setDefaultImageResource(int i) {
        this.f271885f = i;
    }

    public void setImageFilePath(String str) {
        mo129234u(str, true, (String) null);
    }

    public void setImageResource(int i) {
        mo129235v(getResources(), i, true, (String) null);
    }

    /* renamed from: t */
    public void mo129233t(byte[] bArr, String str) {
        C101325b bVar;
        if (bArr == null) {
            try {
                Log.m105921e("MicroMsg.GIF.MMGIFImageView", "[setMMGIFFileByteArray] bytes is null! src:%s cacheKey:%s", Boolean.TRUE, str);
            } catch (MMGIFException e) {
                mo129224r(e);
                if (e.getErrorCode() == 103) {
                    Bitmap decodeByteArray = BitmapUtil.decodeByteArray(bArr);
                    if (decodeByteArray != null) {
                        decodeByteArray.setDensity(getEmojiDensity());
                        setImageBitmap(decodeByteArray);
                        return;
                    }
                    Log.m105929w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed bitmap is null. bytes %s", bArr.toString());
                    mo129221p();
                    return;
                }
                Log.m105921e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed. %s", e.toString());
                mo129221p();
            } catch (IOException e2) {
                Log.m105921e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed. %s", e2.toString());
                mo129221p();
            }
        } else {
            if (!Util.isNullOrNil(str)) {
                setCacheKey(str);
                bVar = ((C92279g0) C86312j.m106911c(C92279g0.class)).Vl0(getCacheKey(), bArr);
            } else {
                if (ImgUtil.isWXGF(bArr)) {
                    bVar = new C22187h(bArr);
                } else if (ImgUtil.isGif(bArr)) {
                    bVar = new C22180d(bArr, this.f271889j);
                } else {
                    Bitmap decodeByteArray2 = BitmapUtil.decodeByteArray(bArr);
                    if (decodeByteArray2 != null) {
                        decodeByteArray2.setDensity(getEmojiDensity());
                        setImageBitmap(decodeByteArray2);
                        return;
                    }
                    Log.m105929w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileByteArray failed bitmap is null. bytes %s", bArr.toString());
                    mo129221p();
                    return;
                }
                bVar.start();
            }
            setImageDrawable(bVar);
        }
    }

    /* renamed from: u */
    public final void mo129234u(String str, boolean z, String str2) {
        Drawable drawable;
        try {
            if (ImgUtil.isWXGF(str)) {
                C22187h hVar = new C22187h(C86013q1.m106433O(str, 0, -1));
                hVar.start();
                if (z) {
                    setImageDrawable(hVar);
                } else {
                    setBackgroundDrawable(hVar);
                }
            } else if (ImgUtil.isGif(str)) {
                if (!Util.isNullOrNil(str2)) {
                    setCacheKey(str2);
                    drawable = ((C92279g0) C86312j.m106911c(C92279g0.class)).mo126019w(getCacheKey(), str);
                } else {
                    drawable = new C22180d(str, this.f271889j);
                }
                if (z) {
                    setImageDrawable(drawable);
                } else {
                    setBackgroundDrawable(drawable);
                }
            } else {
                try {
                    Bitmap decodeFile = BitmapUtil.decodeFile(str, (BitmapFactory.Options) null);
                    if (decodeFile != null) {
                        decodeFile.setDensity(getEmojiDensity());
                        if (z) {
                            setImageBitmap(decodeFile);
                        } else {
                            setBackgroundDrawable(new BitmapDrawable(decodeFile));
                        }
                    } else {
                        Log.m105929w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failedbitmap is null. show default and delete file. path %s", str);
                        mo129221p();
                    }
                } catch (OutOfMemoryError e) {
                    Log.printErrStackTrace("MicroMsg.GIF.MMGIFImageView", e, "setMMGIFFilePath failed, oom happened. show default. path %s", str);
                    mo129221p();
                }
            }
        } catch (MMGIFException e2) {
            try {
                mo129224r(e2);
                if (e2.getErrorCode() == 103) {
                    try {
                        Bitmap decodeFile2 = BitmapUtil.decodeFile(str, (BitmapFactory.Options) null);
                        if (decodeFile2 != null) {
                            decodeFile2.setDensity(getEmojiDensity());
                            if (z) {
                                setImageBitmap(decodeFile2);
                            } else {
                                setBackgroundDrawable(new BitmapDrawable(decodeFile2));
                            }
                        } else {
                            Log.m105929w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failedbitmap is null. show default and delete file. path %s", str);
                            mo129221p();
                            C86013q1.m106447h(str);
                        }
                    } catch (OutOfMemoryError e3) {
                        Log.printErrStackTrace("MicroMsg.GIF.MMGIFImageView", e3, "setMMGIFFilePath failed, oom happened. show default. path %s", str);
                        mo129221p();
                    }
                }
            } catch (Exception e4) {
                Log.m105921e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed1. %s", Util.stackTraceToString(e4));
            }
        } catch (IOException e5) {
            Log.m105921e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFilePath failed3. %s", Util.stackTraceToString(e5));
            C86013q1.m106447h(str);
            mo129221p();
        } catch (NullPointerException unused) {
            mo129221p();
        }
    }

    /* renamed from: v */
    public final void mo129235v(Resources resources, int i, boolean z, String str) {
        C101325b bVar;
        try {
            boolean z2 = true;
            if (!Util.isNullOrNil(str)) {
                setCacheKey(str);
                bVar = ((C92279g0) C86312j.m106911c(C92279g0.class)).Zc0(str, resources, i);
            } else {
                C22180d dVar = new C22180d(resources, i, this.f271889j);
                if (dVar.f62725f == 0) {
                    z2 = false;
                }
                bVar = dVar;
            }
            if (z2) {
                if (z) {
                    setImageDrawable(bVar);
                    return;
                } else {
                    setBackgroundDrawable(bVar);
                    return;
                }
            }
        } catch (IOException e) {
            Log.m105920e("MicroMsg.GIF.MMGIFImageView", "setMMGIFResource failed. %s" + e.toString());
        }
        if (z) {
            super.setImageResource(i);
        } else {
            super.setBackgroundResource(i);
        }
    }

    /* renamed from: w */
    public void mo129236w() {
        if (getDrawable() != null && (getDrawable() instanceof C101325b)) {
            ((C101325b) getDrawable()).start();
        }
    }

    /* renamed from: x */
    public void mo129237x() {
        if (getDrawable() != null && (getDrawable() instanceof C101325b)) {
            ((C101325b) getDrawable()).stop();
        }
    }

    public MMAnimateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f271885f = C0966R.C0969drawable.emoji_download_icon;
        this.f271886g = C0966R.C0969drawable.f4730l9;
        this.f271887h = 0.0f;
        this.f271889j = false;
    }
}
