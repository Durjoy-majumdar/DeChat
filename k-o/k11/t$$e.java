package k11;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingDetailUI;
import h11.C98311d;
import nj3.C76879j;

public final /* synthetic */ class t$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingDetailUI f290490d;

    /* renamed from: e */
    public final /* synthetic */ long f290491e;

    public /* synthetic */ t$$e(CleanChattingDetailUI cleanChattingDetailUI, long j) {
        this.f290490d = cleanChattingDetailUI;
        this.f290491e = j;
    }

    public final void run() {
        CleanChattingDetailUI cleanChattingDetailUI = this.f290490d;
        long j = this.f290491e;
        cleanChattingDetailUI.f267880h.dismiss();
        Intent intent = new Intent();
        intent.putExtra("key_username", cleanChattingDetailUI.f267881i);
        intent.putExtra("key_delete_image_size", cleanChattingDetailUI.f267882j);
        intent.putExtra("key_delete_video_size", cleanChattingDetailUI.f267883n);
        intent.putExtra("key_delete_file_size", cleanChattingDetailUI.f267884o);
        intent.putExtra("key_delete_misc_size", cleanChattingDetailUI.f267885p);
        intent.putExtra("key_delete_time", cleanChattingDetailUI.f267887r);
        cleanChattingDetailUI.setResult(1000, intent);
        C76879j.m92748s(cleanChattingDetailUI, cleanChattingDetailUI.getString(C0966R.string.beb, new Object[]{C98311d.m127053b(j)}), "");
    }
}
