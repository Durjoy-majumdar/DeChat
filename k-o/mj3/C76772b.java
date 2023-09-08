package mj3;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import gb0.C75896b;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import xd3.C78802b;
import zt3.C119157j;

/* renamed from: mj3.b */
public class C76772b extends C78802b {

    /* renamed from: h */
    public String f224567h = null;

    /* renamed from: i */
    public String f224568i = null;

    /* renamed from: j */
    public boolean f224569j = false;

    /* renamed from: n */
    public C75896b.C75898b f224570n;

    /* renamed from: o */
    public String f224571o = "";

    public C76772b(Context context, C75896b.C75898b bVar) {
        super(context);
        this.f224570n = bVar;
        mo7975g(8);
        mo7975g(8);
        ((C119157j) C119157j.f356862d).mo183884o(new C76768a(this));
    }

    /* renamed from: h */
    public static void m92510h(C76772b bVar, int i) {
        bVar.getClass();
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[3];
        int i2 = 0;
        objArr[0] = bVar.f224571o;
        objArr[1] = Integer.valueOf(i);
        if (bVar.f224570n != C75896b.C75898b.Main) {
            i2 = 1;
        }
        objArr[2] = Integer.valueOf(i2);
        nVar.mo160131h(14439, objArr);
        nVar.idkeyStat(633, (long) i, 1, false);
    }

    /* renamed from: a */
    public void mo7968a() {
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.f6980tz;
    }

    /* renamed from: e */
    public boolean mo7970e() {
        mo7975g(8);
        ((C119157j) C119157j.f356862d).mo183884o(new C76768a(this));
        return super.mo7970e();
    }

    /* renamed from: g */
    public void mo7975g(int i) {
        super.mo7975g(i);
        View findViewById = this.f230569f.findViewById(C0966R.C0970id.gys);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/banner/ChattingMonitoredBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/banner/ChattingMonitoredBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
