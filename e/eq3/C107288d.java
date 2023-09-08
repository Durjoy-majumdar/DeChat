package eq3;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import me3.C109623f;
import p248ug.C111167t;

/* renamed from: eq3.d */
public class C107288d extends C107283a {

    /* renamed from: E */
    public Bitmap f321012E;

    /* renamed from: F */
    public Bitmap f321013F;

    public C107288d(Context context, C109623f fVar) {
        super(context, fVar);
    }

    /* renamed from: b */
    public Bitmap mo157763b(C111167t tVar, boolean z) {
        if (tVar == C111167t.CROP_VIDEO) {
            return z ? this.f321013F : this.f321012E;
        }
        return null;
    }

    /* renamed from: g */
    public void mo157769g() {
        super.mo157769g();
        this.f321012E = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.crop_video_unselected));
        this.f321013F = BitmapUtil.transformDrawableToBitmap(getResources().getDrawable(C0966R.raw.crop_video_selected));
    }

    /* renamed from: j */
    public boolean mo157780j(int i) {
        boolean j = super.mo157780j(i);
        if (mo157768f(i).ordinal() != 6) {
            return j;
        }
        return false;
    }
}
