package com.tencent.p014mm.plugin.game.luggage.p801ui.circle;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.AtSomeoneView;
import o90.C100301b;
import uy1.C52645f;

/* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.a */
public class C42015a implements C52645f.C52652e {

    /* renamed from: a */
    public final /* synthetic */ String f113174a;

    /* renamed from: b */
    public final /* synthetic */ AtSomeoneView.C42000e f113175b;

    public C42015a(AtSomeoneView.C42000e eVar, String str) {
        this.f113175b = eVar;
        this.f113174a = str;
    }

    /* renamed from: a */
    public void mo65432a(View view, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ((C100301b) AtSomeoneView.this.f113109F1).put(this.f113174a, bitmap);
        }
    }

    /* renamed from: b */
    public void mo65433b(String str, View view) {
    }
}
