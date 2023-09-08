package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.DisplayMetrics;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import junit.framework.Assert;
import kg3.C76577a;
import sd3.C101583a;

/* renamed from: com.tencent.mm.ui.conversation.banner.f */
public class C97210f {

    /* renamed from: a */
    public C101583a f285229a;

    public C97210f(C101583a aVar) {
        this.f285229a = aVar;
    }

    /* renamed from: a */
    public int mo136118a(C97211g gVar) {
        C101583a.C101584a c;
        NinePatchDrawable ninePatchDrawable;
        Assert.assertTrue(gVar != null);
        Assert.assertTrue(gVar.f285231b != null);
        Map<String, String> map = this.f285229a.f297397i;
        Context context = gVar.f285230a.getContext();
        Drawable drawable = null;
        if (map != null && map.size() > 0) {
            String str = map.get(BackwardSupportUtil.BitmapFactory.getDisplaySizeType(context));
            if (str == null) {
                str = map.get(BackwardSupportUtil.BitmapFactory.getDisplayDensityType(context));
            }
            if (Util.nullAsNil(str).length() > 0 && (c = C101583a.m133408c(str)) != C101583a.C101584a.ERROR) {
                String b = C101583a.m133407b(str);
                if (Util.nullAsNil(b).length() > 0) {
                    try {
                        Bitmap decodeStream = c == C101583a.C101584a.ASSET ? BackwardSupportUtil.BitmapFactory.decodeStream(context.getAssets().open(b), C76577a.m92156g(context)) : BackwardSupportUtil.BitmapFactory.decodeFile(b, C76577a.m92156g(context));
                        if (decodeStream == null) {
                            Log.m105920e("MicroMsg.ADListView.Message", "get Bitmap failed type:" + c + " path:" + b);
                        } else {
                            byte[] ninePatchChunk = decodeStream.getNinePatchChunk();
                            if (ninePatchChunk == null || !NinePatch.isNinePatchChunk(ninePatchChunk)) {
                                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                                int i = displayMetrics.widthPixels;
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, i, (decodeStream.getHeight() * i) / decodeStream.getWidth(), true);
                                if (createScaledBitmap != null) {
                                    if (decodeStream != createScaledBitmap) {
                                        Log.m105925i("MicroMsg.ADListView.Message", "recycle bitmap:%s", decodeStream);
                                        decodeStream.recycle();
                                    }
                                    decodeStream = createScaledBitmap;
                                }
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(decodeStream);
                                bitmapDrawable.setTargetDensity(displayMetrics);
                                ninePatchDrawable = bitmapDrawable;
                            } else {
                                ninePatchDrawable = new NinePatchDrawable(decodeStream, ninePatchChunk, new Rect(), (String) null);
                            }
                            drawable = ninePatchDrawable;
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.ADListView.Message", e, "", new Object[0]);
                    }
                }
            }
        }
        if (drawable == null) {
            return -1;
        }
        gVar.f285230a.setBackgroundDrawable(drawable);
        gVar.f285231b.setVisibility(this.f285229a.f297392d ? 0 : 8);
        return 0;
    }
}
