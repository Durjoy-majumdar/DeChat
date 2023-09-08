package com.tencent.p014mm.plugin.collect.reward.p037ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import di3.C86312j;
import p140cw.C7138g;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.collect.reward.ui.d */
public class C2188d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f12171d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f12172e;

    /* renamed from: f */
    public final /* synthetic */ QrRewardMainUI f12173f;

    public C2188d(QrRewardMainUI qrRewardMainUI, ViewGroup viewGroup, ImageView imageView) {
        this.f12173f = qrRewardMainUI;
        this.f12171d = viewGroup;
        this.f12172e = imageView;
    }

    public void run() {
        Class cls = C7138g.class;
        Log.m105919d("MicroMsg.QrRewardMainUI", "height: %d, width: %d", Integer.valueOf(this.f12171d.getHeight()), Integer.valueOf(this.f12171d.getWidth()));
        Bitmap createBitmap = Bitmap.createBitmap(this.f12173f.f197712i.getWidth(), this.f12173f.f197712i.getHeight(), Bitmap.Config.ARGB_8888);
        this.f12173f.f197712i.draw(new Canvas(createBitmap));
        this.f12172e.setImageBitmap(createBitmap);
        Bitmap createBitmap2 = Bitmap.createBitmap(this.f12171d.getWidth(), this.f12171d.getHeight(), Bitmap.Config.ARGB_8888);
        this.f12171d.draw(new Canvas(createBitmap2));
        try {
            String str = ((C7138g) C86312j.m106911c(cls)).mo8323lm() + "mm_reward_qrcode_" + System.currentTimeMillis() + ".png";
            BitmapUtil.saveBitmapToImage(createBitmap2, 100, Bitmap.CompressFormat.PNG, str, false);
            C76701a.makeText((Context) this.f12173f.getContext(), (CharSequence) this.f12173f.getString(C0966R.string.bwc, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str)}), 1).show();
            ((C7138g) C86312j.m106911c(cls)).mo8315Wr(str, this.f12173f.getContext());
        } catch (Exception e) {
            Log.m105928w("MicroMsg.QrRewardMainUI", "save fixed amount qrcode failed!" + e.getMessage());
        }
        this.f12173f.f197721u.setVisibility(8);
        Log.m105925i("MicroMsg.QrRewardMainUI", "bitmap recycle %s", createBitmap2.toString());
        createBitmap2.recycle();
    }
}
