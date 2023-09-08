package q83;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.SyncTask;

/* renamed from: q83.g */
public class C47778g extends SyncTask<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ View f128298a;

    /* renamed from: b */
    public final /* synthetic */ int f128299b;

    /* renamed from: c */
    public final /* synthetic */ int f128300c;

    /* renamed from: d */
    public final /* synthetic */ float[] f128301d;

    /* renamed from: e */
    public final /* synthetic */ int f128302e;

    /* renamed from: f */
    public final /* synthetic */ C101058l f128303f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47778g(C101058l lVar, long j, Boolean bool, View view, int i, int i2, float[] fArr, int i3) {
        super(j, bool);
        this.f128303f = lVar;
        this.f128298a = view;
        this.f128299b = i;
        this.f128300c = i2;
        this.f128301d = fArr;
        this.f128302e = i3;
    }

    public Object run() {
        return Boolean.valueOf(this.f128303f.mo140513a(this.f128298a, this.f128299b, this.f128300c, this.f128301d, this.f128302e));
    }
}
