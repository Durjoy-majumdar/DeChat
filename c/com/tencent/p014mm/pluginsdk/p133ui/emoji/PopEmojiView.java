package com.tencent.p014mm.pluginsdk.p133ui.emoji;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gif.MMGIFException;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import java.io.IOException;
import qz1.C101325b;
import qz1.C101326c;
import qz1.C22180d;
import qz1.C22187h;
import z51.C39315g;

/* renamed from: com.tencent.mm.pluginsdk.ui.emoji.PopEmojiView */
public class PopEmojiView extends LinearLayout {

    /* renamed from: d */
    public MMEmojiView f283648d;

    /* renamed from: e */
    public ViewGroup f283649e;

    public PopEmojiView(Context context) {
        super(context);
        mo135102a(context);
    }

    /* renamed from: a */
    public final void mo135102a(Context context) {
        ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), C0966R.C0971layout.bnl, (ViewGroup) null);
        this.f283649e = viewGroup;
        MMEmojiView mMEmojiView = (MMEmojiView) viewGroup.findViewById(C0966R.C0970id.f39);
        this.f283648d = mMEmojiView;
        mMEmojiView.setIsMaxSizeLimit(true);
        this.f283648d.setMaxSize(context.getResources().getDimensionPixelSize(C0966R.dimen.a4z) - (context.getResources().getDimensionPixelSize(C0966R.dimen.f3913iq) * 3));
        ProgressBar progressBar = (ProgressBar) this.f283649e.findViewById(C0966R.C0970id.i7j);
        addView(this.f283649e, -1, -1);
    }

    public void setEmojiInfo(EmojiInfo emojiInfo) {
        C101325b bVar;
        MMEmojiView mMEmojiView = this.f283648d;
        if (mMEmojiView != null) {
            Class cls = C39315g.class;
            mMEmojiView.f283644n = emojiInfo;
            String K1 = emojiInfo.mo62640K1();
            if ((emojiInfo.field_reserved4 & 1) != 1) {
                mMEmojiView.mo129234u(K1, true, "");
            } else if (C101326c.m132949d().mo140813a("") != null) {
                mMEmojiView.setImageDrawable(C101326c.m132949d().mo140813a(""));
            } else {
                EmojiInfo emojiInfo2 = mMEmojiView.f283644n;
                byte[] u = ((C39315g) C86312j.m106911c(cls)).getProvider().mo138036u(mMEmojiView.f283644n);
                mMEmojiView.f283644n = emojiInfo2;
                try {
                    if (!Util.isNullOrNil(u)) {
                        if (!Util.isNullOrNil("")) {
                            mMEmojiView.setCacheKey("");
                            bVar = C101326c.m132949d().mo140815c(mMEmojiView.getCacheKey(), u);
                        } else {
                            if (!ImgUtil.isWXGF(u) || !((C39315g) C86312j.m106911c(cls)).getProvider().mo138013Y0()) {
                                Log.m105926v("MicroMsg.emoji.MMEmojiView", "set with gif");
                                bVar = new C22180d(u, false);
                            } else {
                                bVar = new C22187h(u);
                            }
                            if (!bVar.isRunning()) {
                                bVar.mo35281c();
                            }
                        }
                        mMEmojiView.setImageDrawable(bVar);
                        return;
                    }
                } catch (MMGIFException e) {
                    mMEmojiView.mo129224r(e);
                    if (e.getErrorCode() == 103) {
                        Log.m105918d("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray D_GIF_ERR_NOT_GIF_FILE");
                        Bitmap decodeByteArray = BitmapUtil.decodeByteArray(u);
                        if (decodeByteArray != null) {
                            decodeByteArray.setDensity(mMEmojiView.getEmojiDensity());
                            mMEmojiView.setImageBitmap(decodeByteArray);
                            return;
                        }
                        Log.m105929w("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed bitmap is null. bytes %s", u.toString());
                        EmojiInfo emojiInfo3 = mMEmojiView.f283644n;
                        if (emojiInfo3 != null) {
                            emojiInfo3.mo62645S0();
                            Log.m105924i("MicroMsg.emoji.MMEmojiView", "delete file.");
                        }
                        mMEmojiView.mo129221p();
                        return;
                    }
                    Log.m105921e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", e.toString());
                    EmojiInfo emojiInfo4 = mMEmojiView.f283644n;
                    if (emojiInfo4 != null) {
                        emojiInfo4.mo62645S0();
                        Log.m105924i("MicroMsg.emoji.MMEmojiView", "delete file.");
                    }
                } catch (IOException e2) {
                    Log.m105921e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", e2.toString());
                } catch (NullPointerException e3) {
                    Log.m105921e("MicroMsg.emoji.MMEmojiView", "setMMGIFFileByteArray failed. %s", e3.toString());
                }
                EmojiInfo emojiInfo5 = mMEmojiView.f283644n;
                if (emojiInfo5 != null) {
                    emojiInfo5.mo62645S0();
                    Log.m105924i("MicroMsg.emoji.MMEmojiView", "delete file.");
                }
                mMEmojiView.mo129221p();
            }
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        if (this.f283648d != null && bitmap != null && !bitmap.isRecycled()) {
            bitmap.setDensity(this.f283648d.getEmojiDensity());
            this.f283648d.setImageBitmap(bitmap);
        }
    }

    public void setImageResource(int i) {
        MMEmojiView mMEmojiView = this.f283648d;
        if (mMEmojiView != null) {
            mMEmojiView.setImageResource(i);
        }
    }

    public PopEmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo135102a(context);
    }

    public PopEmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo135102a(context);
    }
}
