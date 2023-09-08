package gr1;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import gy3.C87412m;
import iy3.C60641c;
import lh2.C109344g0;
import qh2.C101198e;

/* renamed from: gr1.t2 */
public final class C107910t2 implements C109344g0 {

    /* renamed from: d */
    public final C101198e f323101d;

    /* renamed from: e */
    public final ViewGroup f323102e;

    /* renamed from: f */
    public final TextView f323103f;

    /* renamed from: g */
    public final C107911a f323104g = new C107911a(this);

    /* renamed from: gr1.t2$a */
    public static final class C107911a extends CountDownTimer {

        /* renamed from: a */
        public final /* synthetic */ C107910t2 f323105a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107911a(C107910t2 t2Var) {
            super(3000, 1000);
            this.f323105a = t2Var;
        }

        public void onFinish() {
            this.f323105a.f323102e.setVisibility(8);
            C101198e.C62622a.m73576a(this.f323105a.f323101d, C101198e.C101199b.RECORD_FINISH_COUNTDOWN, (Bundle) null, 2, (Object) null);
        }

        public void onTick(long j) {
            this.f323105a.f323103f.setText(String.valueOf(C60641c.m70921b(((float) j) / 1000.0f)));
        }
    }

    public C107910t2(ViewGroup viewGroup, C101198e eVar) {
        C87412m.m108594g(viewGroup, "layout");
        C87412m.m108594g(eVar, "status");
        this.f323101d = eVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f357801bu1);
        C87412m.m108593f(findViewById, "layout.findViewById(R.id.countdown_container)");
        this.f323102e = (ViewGroup) findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.bu6);
        C87412m.m108593f(findViewById2, "layout.findViewById(R.id.countdown_text)");
        this.f323103f = (TextView) findViewById2;
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C107910t2.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
    }

    public void setVisibility(int i) {
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
