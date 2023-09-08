package rx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.storage.C19623o0;
import gy3.C87412m;
import kg3.C76577a;
import s90.C77630j;

/* renamed from: rx0.t */
public final class C22274t implements C13591j {

    /* renamed from: a */
    public final MMActivity f63136a;

    /* renamed from: b */
    public final C19623o0 f63137b;

    /* renamed from: c */
    public final C77630j f63138c;

    /* renamed from: d */
    public final String f63139d = "TextFakeCover";

    /* renamed from: e */
    public final AppCompatActivity f63140e;

    /* renamed from: f */
    public final int f63141f;

    /* renamed from: g */
    public final int f63142g;

    /* renamed from: h */
    public View f63143h;

    public C22274t(MMActivity mMActivity, C18508z2 z2Var, C19623o0 o0Var, C77630j jVar, int i) {
        C87412m.m108594g(mMActivity, "timelineUI");
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(o0Var, "bizTimelineInfo");
        C87412m.m108594g(jVar, "bizReaderItem");
        this.f63136a = mMActivity;
        this.f63137b = o0Var;
        this.f63138c = jVar;
        AppCompatActivity context = mMActivity.getContext();
        this.f63140e = context;
        this.f63141f = C76577a.m92151b(context, 163);
        this.f63142g = C76577a.m92151b(context, 217);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.crt, (ViewGroup) null, false);
        C87412m.m108593f(inflate, "from(mContext).inflate(R…_cover_text, null, false)");
        this.f63143h = inflate;
    }
}
