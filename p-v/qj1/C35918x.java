package qj1;

import androidx.lifecycle.C0120a0;
import cl1.C54951d;
import com.tencent.p014mm.C0966R;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: qj1.x */
public final class C35918x<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C63064w f95813d;

    public C35918x(C63064w wVar) {
        this.f95813d = wVar;
    }

    public void onChanged(Object obj) {
        C54951d.C28607f fVar = (C54951d.C28607f) obj;
        long j = fVar.f78499b;
        if (j > 0) {
            long j2 = (j - fVar.f78498a) / ((long) 1000);
            long j3 = (long) 60;
            String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 % j3)}, 1));
            C87412m.m108593f(format2, "format(format, *args)");
            String string = this.f95813d.f178966p.getContext().getResources().getString(C0966R.string.mmi);
            C87412m.m108593f(string, "rootView.context.resourc…der_live_ad_video_ad_tag)");
            this.f95813d.f178968r.setText(string + ' ' + format + XVFSFile.PATH_SEPARATOR_CHAR + format2);
        }
    }
}
