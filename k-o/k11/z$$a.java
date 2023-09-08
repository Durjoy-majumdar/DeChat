package k11;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanNewUI;

public final /* synthetic */ class z$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C99087z f290543d;

    /* renamed from: e */
    public final /* synthetic */ long f290544e;

    /* renamed from: f */
    public final /* synthetic */ long f290545f;

    public /* synthetic */ z$$a(C99087z zVar, long j, long j2) {
        this.f290543d = zVar;
        this.f290544e = j;
        this.f290545f = j2;
    }

    public final void run() {
        C99087z zVar = this.f290543d;
        long j = this.f290544e;
        long j2 = this.f290545f;
        CleanNewUI cleanNewUI = zVar.f290542a;
        String str = CleanNewUI.f267927I;
        cleanNewUI.mo127442M7(j);
        cleanNewUI.mo127438I7(j2);
        CleanNewUI cleanNewUI2 = zVar.f290542a;
        cleanNewUI2.f267946q.setText(cleanNewUI2.getString(C0966R.string.bdv, new Object[]{0}));
    }
}
