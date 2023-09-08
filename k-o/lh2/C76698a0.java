package lh2;

import android.content.Intent;
import android.widget.TextView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import gy3.C87412m;
import lh2.C109344g0;
import qh2.C101198e;

/* renamed from: lh2.a0 */
public final class C76698a0 implements C109344g0 {

    /* renamed from: d */
    public TextView f224399d;

    public C76698a0(TextView textView, C101198e eVar) {
        C87412m.m108594g(textView, "view");
        C87412m.m108594g(eVar, "status");
        this.f224399d = textView;
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C76698a0.class.getName();
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
