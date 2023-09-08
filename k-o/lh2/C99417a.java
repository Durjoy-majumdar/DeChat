package lh2;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import gy3.C87412m;
import lh2.C109344g0;
import qh2.C101198e;

/* renamed from: lh2.a */
public abstract class C99417a implements C109344g0 {

    /* renamed from: d */
    public C101198e f291492d;

    /* renamed from: e */
    public String f291493e;

    public C99417a(C101198e eVar, String str) {
        C87412m.m108594g(eVar, "status");
        this.f291492d = eVar;
        this.f291493e = str;
        eVar.mo129834f(this);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return TextUtils.isEmpty(this.f291493e) ? getClass().getName() : this.f291493e;
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

    /* renamed from: w */
    public final <T extends View> T mo138857w(int i) {
        C101198e eVar = this.f291492d;
        C87412m.m108592e(eVar, "null cannot be cast to non-null type android.view.ViewGroup");
        T findViewById = ((ViewGroup) eVar).findViewById(i);
        C87412m.m108593f(findViewById, "status as ViewGroup).findViewById(resId)");
        return findViewById;
    }
}
