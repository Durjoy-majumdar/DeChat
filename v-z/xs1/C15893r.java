package xs1;

import android.content.res.Resources;
import android.os.CountDownTimer;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.UnchangeTextView;
import com.tencent.xweb.file.XVFSFile;
import y50.C15936n0;

/* renamed from: xs1.r */
public final class C15893r extends CountDownTimer {

    /* renamed from: a */
    public final /* synthetic */ C15883o f42773a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15893r(C15883o oVar, long j) {
        super(j, 1000);
        this.f42773a = oVar;
    }

    public void onFinish() {
        UnchangeTextView unchangeTextView = this.f42773a.f42752r;
        if (unchangeTextView != null) {
            unchangeTextView.setVisibility(0);
        }
        TextView textView = this.f42773a.f42759y;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void onTick(long j) {
        C15883o oVar = this.f42773a;
        oVar.f42747D++;
        TextView textView = oVar.f42759y;
        if (textView != null) {
            Resources resources = oVar.f166287d.getContext().getResources();
            C15936n0.C15937a aVar = C15936n0.f42815a;
            C15883o oVar2 = this.f42773a;
            textView.setText(resources.getString(C0966R.string.mrv, new Object[]{C15936n0.C15937a.m14866a(aVar, oVar2.f42748E - oVar2.f42747D, XVFSFile.PATH_SEPARATOR, false, false, false, 24, (Object) null)}));
        }
    }
}
