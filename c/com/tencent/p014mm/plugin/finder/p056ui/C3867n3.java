package com.tencent.p014mm.plugin.finder.p056ui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import er1.C58784w3;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.ui.n3 */
public final class C3867n3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f17413d;

    /* renamed from: e */
    public final /* synthetic */ FinderSettingInteractiveInfoUI f17414e;

    /* renamed from: f */
    public final /* synthetic */ IconPreference f17415f;

    public C3867n3(Bitmap bitmap, FinderSettingInteractiveInfoUI finderSettingInteractiveInfoUI, IconPreference iconPreference) {
        this.f17413d = bitmap;
        this.f17414e = finderSettingInteractiveInfoUI;
        this.f17415f = iconPreference;
    }

    public final void run() {
        Bitmap bitmap = this.f17413d;
        if (bitmap != null) {
            FinderSettingInteractiveInfoUI finderSettingInteractiveInfoUI = this.f17414e;
            IconPreference iconPreference = this.f17415f;
            int dimension = (int) finderSettingInteractiveInfoUI.getContext().getResources().getDimension(C0966R.dimen.f3743cv);
            if (iconPreference != null) {
                C58784w3 w3Var = C58784w3.f168295a;
                AppCompatActivity context = finderSettingInteractiveInfoUI.getContext();
                C87412m.m108593f(context, "context");
                String string = finderSettingInteractiveInfoUI.getContext().getString(C0966R.string.fnn);
                C87412m.m108593f(string, "context.getString(com.te…ring.finder_fav_feed_new)");
                iconPreference.mo69924H(w3Var.mo83960r1(context, string, '#', new BitmapDrawable(bitmap), C0966R.color.a7f, dimension, dimension));
            }
        }
    }
}
