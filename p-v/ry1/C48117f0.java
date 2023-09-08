package ry1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import p763ym.C53543s;
import p763ym.C79138l;

/* renamed from: ry1.f0 */
public class C48117f0 implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public final /* synthetic */ String f128988d;

    /* renamed from: e */
    public final /* synthetic */ float f128989e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f128990f;

    public C48117f0(String str, float f, ImageView imageView) {
        this.f128988d = str;
        this.f128989e = f;
        this.f128990f = imageView;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        Bitmap ub;
        if (this.f128988d.equals(str) && (ub = ((C79138l) C86312j.m106911c(C79138l.class)).mo74018ub(this.f128988d, 1, this.f128989e)) != null) {
            this.f128990f.setImageBitmap(ub);
            ((C53543s) C86312j.m106911c(C53543s.class)).Gk0().remove(this);
        }
    }
}
