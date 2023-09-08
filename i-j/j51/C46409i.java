package j51;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadUpdateDescView;
import g51.C45880a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: j51.i */
public class C46409i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ DownloadUpdateDescView f125016d;

    public C46409i(DownloadUpdateDescView downloadUpdateDescView) {
        this.f125016d = downloadUpdateDescView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/downloader_app/ui/DownloadUpdateDescView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f125016d.f110449e.getText().equals(this.f125016d.getResources().getString(C0966R.string.cgi))) {
            this.f125016d.f110448d.setMaxLines(Integer.MAX_VALUE);
            DownloadUpdateDescView downloadUpdateDescView = this.f125016d;
            downloadUpdateDescView.f110448d.setText(downloadUpdateDescView.f110450f.f110340k);
            this.f125016d.f110449e.setText(C0966R.string.hg8);
        } else {
            this.f125016d.f110448d.setMaxLines(2);
            this.f125016d.f110449e.setText(C0966R.string.cgi);
            DownloadUpdateDescView downloadUpdateDescView2 = this.f125016d;
            downloadUpdateDescView2.f110448d.post(new C46410j(downloadUpdateDescView2));
        }
        C45880a.m51163b(10, 1003, 0, 2, this.f125016d.f110450f.f110335f, "", "");
        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/ui/DownloadUpdateDescView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
