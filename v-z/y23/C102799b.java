package y23;

import ai2.C92011d;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditResultStruct;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BasePluginLayout;
import f23.C97815b;
import gy3.C87412m;
import o40.C61926c;
import qh2.C101198e;

/* renamed from: y23.b */
public final class C102799b extends C112388h<MultiMediaEditResultStruct> {

    /* renamed from: e */
    public BasePluginLayout f303493e;

    /* renamed from: f */
    public C97815b f303494f = new C97815b();

    /* renamed from: g */
    public boolean f303495g;

    /* renamed from: y23.b$a */
    public /* synthetic */ class C102800a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f303496a;

        static {
            int[] iArr = new int[C101198e.C101199b.values().length];
            iArr[61] = 1;
            f303496a = iArr;
            int[] iArr2 = new int[C92011d.values().length];
            iArr2[0] = 1;
            iArr2[5] = 2;
        }
    }

    public C102799b(BasePluginLayout basePluginLayout) {
        C87412m.m108594g(basePluginLayout, "pluginLayout");
        this.f303493e = basePluginLayout;
    }

    /* renamed from: a */
    public void mo14581a(Intent intent) {
        C87412m.m108594g(intent, "intent");
        this.f336503d = new MultiMediaEditResultStruct();
        this.f303494f = new C97815b();
    }

    /* renamed from: d */
    public void mo142541d() {
        C61926c.m72657B("MultiVideoPluginLayout_report", true, new C102801c(this, 0));
    }

    /* renamed from: g */
    public String mo14584g() {
        return "20741";
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C102800a.f303496a[bVar.ordinal()] == 1) {
            C61926c.m72657B("MultiVideoPluginLayout_report", true, new C102801c(this, 1));
        }
    }
}
