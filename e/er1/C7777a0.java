package er1;

import android.app.Activity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C87412m;
import tf0.C13883o1;

/* renamed from: er1.a0 */
public final class C7777a0 {

    /* renamed from: h */
    public static final C7778a f26271h = new C7778a();

    /* renamed from: a */
    public final Activity f26272a;

    /* renamed from: b */
    public final int f26273b;

    /* renamed from: c */
    public float f26274c = 0.5625f;

    /* renamed from: d */
    public int f26275d;

    /* renamed from: e */
    public boolean f26276e;

    /* renamed from: f */
    public final int f26277f;

    /* renamed from: g */
    public final int f26278g;

    /* renamed from: er1.a0$a */
    public static final class C7778a {
        /* renamed from: a */
        public final String mo8891a() {
            String str = VFSStrategy.m163776d("finder") + XVFSFile.SEPARATOR_CHAR;
            Log.m105924i("CoverResultHelper", "FINDER_DATA_ROOT=" + str);
            String str2 = str + "image/";
            Log.m105924i("CoverResultHelper", "FINDER_IMG_DIR=" + str2);
            return str2 + "cover_edit_for_output";
        }
    }

    public C7777a0(Activity activity, int i) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f26272a = activity;
        this.f26273b = i;
        this.f26275d = activity.getResources().getColor(C0966R.color.a_j);
        this.f26277f = 10012;
        this.f26278g = 10013;
    }

    /* renamed from: a */
    public final void mo8889a(String str, String str2, float f, int i, boolean z) {
        C87412m.m108594g(str, "inputPath");
        C87412m.m108594g(str2, "outputPath");
        this.f26274c = f;
        this.f26275d = i;
        this.f26276e = z;
        ((C13883o1) C86312j.m106911c(C13883o1.class)).Rd0(this, str, str2, this.f26273b, f, i, z);
    }

    /* renamed from: b */
    public final void mo8890b(int i) {
        Class cls = C13883o1.class;
        if (i == this.f26278g) {
            Log.m105924i("CoverResultHelper", "go_crop");
            Activity activity = this.f26272a;
            int i2 = this.f26273b;
            C7778a aVar = f26271h;
            ((C13883o1) C86312j.m106911c(cls)).mo13269T8(activity, i2, aVar.mo8891a(), aVar.mo8891a(), this.f26274c, this.f26275d, this.f26276e);
        } else if (i == this.f26277f) {
            Log.m105924i("CoverResultHelper", "go_edit");
            Activity activity2 = this.f26272a;
            int i3 = this.f26273b;
            C7778a aVar2 = f26271h;
            ((C13883o1) C86312j.m106911c(cls)).mo13284kI(activity2, i3, aVar2.mo8891a(), aVar2.mo8891a(), this.f26274c, this.f26275d);
        }
    }
}
