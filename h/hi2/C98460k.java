package hi2;

import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import f72.C97842b;
import p159gw.C98250h;
import p232rw.C101475j;
import p248ug.C14183h;

/* renamed from: hi2.k */
public final class C98460k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecordConfigProvider f288790d;

    /* renamed from: e */
    public final /* synthetic */ RecordConfigProvider f288791e;

    /* renamed from: f */
    public final /* synthetic */ boolean f288792f;

    /* renamed from: g */
    public final /* synthetic */ boolean f288793g;

    public C98460k(RecordConfigProvider recordConfigProvider, RecordConfigProvider recordConfigProvider2, boolean z, boolean z2) {
        this.f288790d = recordConfigProvider;
        this.f288791e = recordConfigProvider2;
        this.f288792f = z;
        this.f288793g = z2;
    }

    public final void run() {
        Class cls = C101475j.class;
        RecordConfigProvider recordConfigProvider = this.f288790d;
        if (!recordConfigProvider.f272937y) {
            C98453h.f288774a.mo137810h(recordConfigProvider.f272903D);
        }
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
        Log.m105924i("MicroMsg.MediaFileUtil", "imageState : " + g + ' ');
        if (!g) {
            ((C101475j) C86312j.m106911c(cls)).pt0(this.f288791e.f272904E);
            return;
        }
        boolean z = this.f288792f;
        if ((z && g) || (!z && this.f288791e.f272938z && this.f288793g)) {
            String h = C97842b.m126291h("jpg");
            if (!this.f288792f) {
                h = AndroidMediaUtil.getExportImagePath("jpg");
            }
            Log.m105924i("MicroMsg.MediaFileUtil", "auto save pic src " + this.f288791e.f272904E + " dest " + h + ' ');
            ((C98250h) C86312j.m106911c(C98250h.class)).mo137343Ne(MMApplicationContext.getContext(), this.f288791e.f272904E, h);
            AndroidMediaUtil.refreshMediaScanner(h, MMApplicationContext.getContext());
            C14183h.m13518b(h, C14183h.m13517a(this.f288791e.f272904E));
            ((C101475j) C86312j.m106911c(cls)).P10(this.f288791e.f272904E);
        }
    }
}
