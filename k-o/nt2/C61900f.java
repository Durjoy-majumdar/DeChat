package nt2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ps2.C100880k;

/* renamed from: nt2.f */
public class C61900f implements C100880k.C100881a {

    /* renamed from: a */
    public final /* synthetic */ C100167e f176001a;

    public C61900f(C100167e eVar) {
        this.f176001a = eVar;
    }

    /* renamed from: a */
    public void mo76113a() {
        SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
        SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
    }

    /* renamed from: b */
    public void mo76114b() {
        SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
        SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
    }

    /* renamed from: c */
    public void mo76115c(String str) {
        Bitmap decodeFile;
        SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
        if (!Util.isNullOrNil(str) && (decodeFile = BitmapUtil.decodeFile(str, (BitmapFactory.Options) null)) != null) {
            View view = this.f176001a.f293455y;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem$5", "onDownloaded", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem$5", "onDownloaded", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ImageView imageView = (ImageView) this.f176001a.f293455y.findViewById(C0966R.C0970id.joe);
            imageView.setImageBitmap(decodeFile);
            imageView.setVisibility(0);
        }
        SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
    }
}
