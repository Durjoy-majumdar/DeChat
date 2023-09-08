package ls1;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;

/* renamed from: ls1.i */
public class C10647i extends C61391g {

    /* renamed from: c */
    public boolean f32058c;

    /* renamed from: d */
    public boolean f32059d;

    /* renamed from: e */
    public boolean f32060e;

    /* renamed from: f */
    public boolean f32061f;

    /* renamed from: g */
    public CharSequence f32062g;

    /* renamed from: h */
    public int f32063h;

    /* renamed from: i */
    public TextView f32064i;

    public C10647i(CharSequence charSequence) {
        C87412m.m108594g(charSequence, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f32062g = charSequence;
    }

    /* renamed from: a */
    public int mo3852a() {
        return C0966R.C0971layout.amj;
    }

    /* renamed from: c */
    public void mo3854c(ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.f32064i = (TextView) viewGroup.findViewById(C0966R.C0970id.kcp);
            ImageView imageView = (ImageView) viewGroup.findViewById(C0966R.C0970id.kct);
        }
    }

    /* renamed from: d */
    public void mo3855d(boolean z, ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "tabView");
        mo9047e(z);
        boolean z2 = false;
        if (z) {
            if (!this.f32058c) {
                if (!this.f32059d) {
                    if (z) {
                        this.f32059d = true;
                    } else {
                        this.f32061f = true;
                    }
                    if (mo10906h() == 0 || this.f174600a != 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        return;
                    }
                }
                mo3856f(viewGroup);
                this.f32058c = true;
            }
        } else if (!this.f32060e) {
            if (!this.f32061f) {
                if (z) {
                    this.f32059d = true;
                } else {
                    this.f32061f = true;
                }
                if (mo10906h() == 0 || this.f174600a != 0) {
                    z2 = true;
                }
                if (!z2) {
                    return;
                }
            }
            mo9048g(viewGroup);
            this.f32060e = true;
        }
    }

    /* renamed from: e */
    public void mo9047e(boolean z) {
        TextView textView = this.f32064i;
        if (textView != null) {
            Context context = textView.getContext();
            C87412m.m108593f(context, "this.context");
            textView.setText(mo10907i(context));
            mo3857k(z);
            mo10908j(z);
        }
    }

    /* renamed from: f */
    public void mo3856f(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "tabView");
        Log.m105924i("Finder.FinderTab", "firstValidSelected");
    }

    /* renamed from: g */
    public void mo9048g(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "tabView");
        Log.m105924i("Finder.FinderTab", "firstValidUnSelected");
    }

    /* renamed from: h */
    public int mo10906h() {
        return 0;
    }

    /* renamed from: i */
    public final CharSequence mo10907i(Context context) {
        C87412m.m108594g(context, "context");
        if (!Util.isNullOrNil(this.f32062g)) {
            return this.f32062g;
        }
        if (this.f32063h <= 0) {
            return "";
        }
        String string = context.getResources().getString(this.f32063h);
        C87412m.m108593f(string, "{\n            context.re…String(titleId)\n        }");
        return string;
    }

    /* renamed from: j */
    public final void mo10908j(boolean z) {
        TextView textView = this.f32064i;
        if (textView == null) {
            return;
        }
        if (z) {
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
        } else {
            C85875k4.m106193l0(textView.getPaint());
        }
    }

    /* renamed from: k */
    public void mo3857k(boolean z) {
        TextView textView = this.f32064i;
        if (textView == null) {
            return;
        }
        if (z) {
            textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.a7f));
        } else {
            textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.f3288ma));
        }
    }

    public C10647i(int i) {
        this.f32062g = "";
        this.f32063h = i;
    }

    public C10647i(String str, int i) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f32062g = str;
        this.f32063h = i;
    }
}
