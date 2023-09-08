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

/* renamed from: rx0.v */
public final class C22277v implements C13591j {

    /* renamed from: a */
    public final MMActivity f63157a;

    /* renamed from: b */
    public final C19623o0 f63158b;

    /* renamed from: c */
    public final C77630j f63159c;

    /* renamed from: d */
    public final String f63160d = "VoiceFakeCover";

    /* renamed from: e */
    public final AppCompatActivity f63161e;

    /* renamed from: f */
    public final int f63162f;

    /* renamed from: g */
    public final int f63163g;

    /* renamed from: h */
    public View f63164h;

    public C22277v(MMActivity mMActivity, C18508z2 z2Var, C19623o0 o0Var, C77630j jVar, int i) {
        C87412m.m108594g(mMActivity, "timelineUI");
        C87412m.m108594g(z2Var, "adapter");
        C87412m.m108594g(o0Var, "bizTimelineInfo");
        C87412m.m108594g(jVar, "bizReaderItem");
        this.f63157a = mMActivity;
        this.f63158b = o0Var;
        this.f63159c = jVar;
        AppCompatActivity context = mMActivity.getContext();
        this.f63161e = context;
        this.f63162f = C76577a.m92151b(context, 163);
        this.f63163g = C76577a.m92151b(context, 217);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.crv, (ViewGroup) null, false);
        C87412m.m108593f(inflate, "from(mContext).inflate(R…cover_voice, null, false)");
        this.f63164h = inflate;
    }
}
