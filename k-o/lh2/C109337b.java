package lh2;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import gy3.C87412m;
import lh2.C109344g0;

/* renamed from: lh2.b */
public abstract class C109337b implements C109344g0 {
    /* renamed from: a */
    public abstract void mo160526a();

    /* renamed from: b */
    public abstract void mo160527b(RecordConfigProvider recordConfigProvider);

    /* renamed from: c */
    public abstract boolean mo160528c();

    /* renamed from: d */
    public abstract void mo160529d();

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    /* renamed from: f */
    public abstract void mo160530f(boolean z);

    /* renamed from: g */
    public abstract void mo160531g(boolean z);

    /* renamed from: h */
    public abstract void mo160532h(View.OnClickListener onClickListener);

    /* renamed from: i */
    public abstract void mo160533i();

    public String name() {
        return getClass().getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
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

    public abstract void reset();

    public abstract void setVisibility(int i);

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
