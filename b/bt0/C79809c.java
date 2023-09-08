package bt0;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewStub;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandActionBarCustomImageView;

/* renamed from: bt0.c */
public class C79809c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f233916d;

    /* renamed from: e */
    public final /* synthetic */ View.OnClickListener f233917e;

    /* renamed from: f */
    public final /* synthetic */ C79808b f233918f;

    public C79809c(C79808b bVar, Bitmap bitmap, View.OnClickListener onClickListener) {
        this.f233918f = bVar;
        this.f233916d = bitmap;
        this.f233917e = onClickListener;
    }

    public void run() {
        if (this.f233918f.getParent() != null) {
            C79808b bVar = this.f233918f;
            if (bVar.f233885E == null) {
                ViewStub viewStub = (ViewStub) bVar.findViewById(C0966R.C0970id.by5);
                if (viewStub != null) {
                    viewStub.inflate();
                    C79808b bVar2 = this.f233918f;
                    bVar2.f233885E = (AppBrandActionBarCustomImageView) bVar2.findViewById(C0966R.C0970id.by4);
                } else {
                    return;
                }
            }
            this.f233918f.f233885E.setVisibility(0);
            this.f233918f.f233885E.setImageBitmap(this.f233916d);
            this.f233918f.f233885E.setClickable(true);
            this.f233918f.f233885E.setOnClickListener(this.f233917e);
        }
    }
}
