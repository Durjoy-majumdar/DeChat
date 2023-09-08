package be1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import md1.C10779c;
import od1.C11392a;
import te3.C51270sn1;
import zd1.C16144b;

/* renamed from: be1.a */
public final class C0266a extends C11392a<C51270sn1> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0266a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: l3 */
    public C10779c mo310l3() {
        return new C16144b((C51270sn1) this.f33564d, getActivity());
    }

    /* renamed from: m3 */
    public String mo311m3() {
        String str;
        String stringExtra = getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        C51270sn1 sn12 = (C51270sn1) this.f33564d;
        if (!(sn12 == null || (str = sn12.f141617d) == null)) {
            stringExtra = str;
        }
        sb.append(stringExtra);
        return sb.toString();
    }
}
