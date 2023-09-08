package com.tencent.p014mm.emoji.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.gif.MMGIFException;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import p008bq.C92279g0;
import p008bq.C92293z0;
import qz1.C22180d;
import qz1.C22187h;
import v51.C52762d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u001d\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R.\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/emoji/view/BaseEmojiView;", "Lcom/tencent/mm/plugin/gif/MMAnimateView;", "", "bytes", "Lrx3/b0;", "setMMGIFFileByteArray", "Landroid/graphics/Bitmap;", "bm", "setImageBitmap", "Lcom/tencent/mm/api/IEmojiInfo;", "value", "o", "Lcom/tencent/mm/api/IEmojiInfo;", "getEmojiInfo", "()Lcom/tencent/mm/api/IEmojiInfo;", "setEmojiInfo", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "emojiInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "emojisdk-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.emoji.view.BaseEmojiView */
public class BaseEmojiView extends MMAnimateView {

    /* renamed from: n */
    public final String f266733n;

    /* renamed from: o */
    public IEmojiInfo f266734o;

    public BaseEmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f266733n = "MicroMsg.BaseEmojiView";
    }

    private final void setMMGIFFileByteArray(byte[] bArr) {
        C22187h hVar;
        try {
            if (!Util.isNullOrNil(bArr)) {
                if (!ImgUtil.isWXGF(bArr) || !((C92293z0) C86312j.m106911c(C92293z0.class)).mo126038Y0()) {
                    Log.m105926v(this.f266733n, "set with gif");
                    C22180d dVar = new C22180d(bArr, false);
                    if (dVar.f62725f != 0) {
                        hVar = dVar;
                    } else {
                        Bitmap decodeByteArray = BitmapUtil.decodeByteArray(bArr);
                        if (decodeByteArray != null) {
                            decodeByteArray.setDensity(getEmojiDensity());
                            setImageBitmap(decodeByteArray);
                            return;
                        }
                        hVar = null;
                    }
                } else {
                    hVar = new C22187h(bArr);
                }
                if (hVar != null && !hVar.isRunning()) {
                    hVar.mo35281c();
                }
                setImageDrawable(hVar);
                return;
            }
        } catch (MMGIFException e) {
            mo129224r(e);
            if (e.getErrorCode() == 103) {
                Log.m105918d(this.f266733n, "setMMGIFFileByteArray D_GIF_ERR_NOT_GIF_FILE");
                Bitmap decodeByteArray2 = BitmapUtil.decodeByteArray(bArr);
                if (decodeByteArray2 != null) {
                    decodeByteArray2.setDensity(getEmojiDensity());
                    setImageBitmap(decodeByteArray2);
                    return;
                }
                Log.m105929w(this.f266733n, "setMMGIFFileByteArray failed bitmap is null. bytes %s", String.valueOf(bArr));
                IEmojiInfo emojiInfo = getEmojiInfo();
                if (emojiInfo != null) {
                    emojiInfo.mo62645S0();
                }
                mo129221p();
                return;
            }
            Log.m105921e(this.f266733n, "setMMGIFFileByteArray failed. %s", e.toString());
            IEmojiInfo emojiInfo2 = getEmojiInfo();
            if (emojiInfo2 != null) {
                emojiInfo2.mo62645S0();
            }
        } catch (IOException e2) {
            Log.m105921e(this.f266733n, "setMMGIFFileByteArray failed. %s", e2.toString());
        } catch (NullPointerException e3) {
            Log.m105921e(this.f266733n, "setMMGIFFileByteArray failed. %s", e3.toString());
        }
        mo129221p();
    }

    public IEmojiInfo getEmojiInfo() {
        return this.f266734o;
    }

    public void setEmojiInfo(IEmojiInfo iEmojiInfo) {
        Drawable drawable;
        if (!C87412m.m108589b(this.f266734o, iEmojiInfo)) {
            this.f266734o = iEmojiInfo;
            if (iEmojiInfo == null) {
                return;
            }
            if (iEmojiInfo.getGroup() == 18 || iEmojiInfo.getGroup() == 50 || iEmojiInfo.getGroup() == 49) {
                setImageBitmap(iEmojiInfo.mo62657d1(getContext(), 300));
            } else if (iEmojiInfo.mo62637I0()) {
                InputStream a = C52762d.m59141a(getContext(), iEmojiInfo.getName());
                try {
                    if (!Util.isNullOrNil("")) {
                        setCacheKey("");
                        drawable = ((C92279g0) C86312j.m106911c(C92279g0.class)).mo126015C9(getCacheKey(), a);
                    } else {
                        drawable = new C22180d(a);
                    }
                    setImageDrawable(drawable);
                } catch (MMGIFException e) {
                    mo129224r(e);
                    if (e.getErrorCode() == 103) {
                        Bitmap decodeStream = BitmapUtil.decodeStream(a);
                        if (decodeStream != null) {
                            decodeStream.setDensity(getEmojiDensity());
                            setImageBitmap(decodeStream);
                            return;
                        }
                        Log.m105928w("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failedbitmap is null. bytes %s");
                        mo129221p();
                        return;
                    }
                    Log.m105921e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failed. %s", e.toString());
                    mo129221p();
                } catch (IOException e2) {
                    Log.m105921e("MicroMsg.GIF.MMGIFImageView", "setMMGIFFileInputStream failed. %s", e2.toString());
                    mo129221p();
                }
            } else {
                setMMGIFFileByteArray(((C92293z0) C86312j.m106911c(C92293z0.class)).mo126034A2(getEmojiInfo()));
            }
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            bitmap.setDensity(C0947jz.f2205e);
        }
        super.setImageBitmap(bitmap);
    }

    public BaseEmojiView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
