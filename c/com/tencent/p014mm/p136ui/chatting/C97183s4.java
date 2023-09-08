package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wework.api.IWWAPI;
import com.tencent.wework.api.WWAPIFactory;
import com.tencent.wework.api.model.WWMediaLink;
import ic0.C21070h;
import java.io.ByteArrayOutputStream;
import jc0.C21210b;

/* renamed from: com.tencent.mm.ui.chatting.s4 */
public class C97183s4 implements C21070h {

    /* renamed from: a */
    public final /* synthetic */ WWMediaLink f285168a;

    /* renamed from: b */
    public final /* synthetic */ Context f285169b;

    /* renamed from: c */
    public final /* synthetic */ IWWAPI.WWAppType f285170c;

    public C97183s4(WWMediaLink wWMediaLink, Context context, IWWAPI.WWAppType wWAppType) {
        this.f285168a = wWMediaLink;
        this.f285169b = context;
        this.f285170c = wWAppType;
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
    }

    /* renamed from: b */
    public void mo6677b(String str, View view, C21210b bVar) {
        Bitmap bitmap;
        Log.m105924i("MicroMsg.SendToWeWorkHelper", "onImageLoadFinish() called with: url = [" + str + "], view = [" + view + "], imageData = [" + bVar + "]");
        if (bVar.f59985a == 0 && (bitmap = bVar.f59988d) != null && !bitmap.isRecycled()) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bVar.f59988d.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            this.f285168a.f285820e = byteArrayOutputStream.toByteArray();
        }
        Context context = this.f285169b;
        WWAPIFactory.m125312a(context).mo136603a(this.f285168a, this.f285170c);
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        return null;
    }
}
