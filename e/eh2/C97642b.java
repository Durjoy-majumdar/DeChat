package eh2;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import p159gw.C98250h;
import p910lj.C76701a;
import pb1.C100714h1;
import qo3.C77407n;
import zt3.C119157j;

/* renamed from: eh2.b */
public class C97642b implements CaptureDataManager.C94403b {

    /* renamed from: d */
    public String f286423d;

    /* renamed from: eh2.b$a */
    public class C97643a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ Context f286424d;

        public C97643a(C97642b bVar, Context context) {
            this.f286424d = context;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(0, this.f286424d.getResources().getString(C0966R.string.i4e));
            e0Var.mo107142f(1, this.f286424d.getResources().getString(C0966R.string.f361137hk2));
            e0Var.mo107142f(2, this.f286424d.getResources().getString(C0966R.string.iam));
        }
    }

    /* renamed from: eh2.b$b */
    public class C97644b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ Context f286425d;

        /* renamed from: e */
        public final /* synthetic */ CaptureDataManager.CaptureVideoNormalModel f286426e;

        /* renamed from: eh2.b$b$a */
        public class C97645a implements Runnable {

            /* renamed from: eh2.b$b$a$a */
            public class C97646a implements Runnable {
                public C97646a() {
                }

                public void run() {
                    String exportImagePath = AndroidMediaUtil.getExportImagePath("jpg");
                    C86013q1.m106442c(C97644b.this.f286426e.f272895f, exportImagePath);
                    C86013q1.m106447h(C97644b.this.f286426e.f272895f);
                    AndroidMediaUtil.refreshMediaScanner(exportImagePath, MMApplicationContext.getContext());
                }
            }

            public C97645a() {
            }

            public void run() {
                Boolean valueOf = Boolean.valueOf(C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true));
                Log.m105925i("MicroMsg.MMRecordUI", "save pic ,imageState : %s", valueOf);
                Boolean bool = (Boolean) C97644b.this.f286426e.mo129798a().mo129811b("KEY_PHOTO_IS_EDITED_BOOLEAN", Boolean.TRUE);
                if (!valueOf.booleanValue() || !bool.booleanValue()) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C97646a());
                }
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) C97644b.this.f286425d.getResources().getString(C0966R.string.cgp, new Object[]{AndroidMediaUtil.getSysCameraDirPath()}), 1).show();
                ((Activity) C97644b.this.f286425d).finish();
            }
        }

        /* renamed from: eh2.b$b$b */
        public class C97647b implements Runnable {
            public C97647b() {
            }

            public void run() {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) C97644b.this.f286425d.getResources().getString(C0966R.string.iak), 1).show();
            }
        }

        public C97644b(Context context, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
            this.f286425d = context;
            this.f286426e = captureVideoNormalModel;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (i == 0) {
                C97642b bVar = C97642b.this;
                Context context = this.f286425d;
                String str = this.f286426e.f272895f;
                bVar.f286423d = str;
                Intent intent = new Intent();
                intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 8);
                intent.putExtra("select_is_ret", true);
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("image_path", str);
                intent.putExtra("Retr_Msg_Type", 0);
                C88144b.m109802t(context, ".ui.transmit.SelectConversationUI", intent, 1);
            } else if (i == 1) {
                C97642b bVar2 = C97642b.this;
                String str2 = this.f286426e.f272895f;
                bVar2.getClass();
                DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                ((C100714h1) C86312j.m106911c(C100714h1.class)).mo135060mH(doFavoriteEvent, 2, str2);
                doFavoriteEvent.f264674d.f264688m = 44;
                doFavoriteEvent.publish();
                Log.m105925i("MicroMsg.MMRecordUI", "[doFavInMM] path:%s", str2);
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) this.f286425d.getResources().getString(C0966R.string.cmh), 1).show();
                ((Activity) this.f286425d).finish();
            } else if (i == 2) {
                ((C98250h) C86312j.m106911c(C98250h.class)).mo137341Iy(this.f286425d, new C97645a(), new C97647b());
            }
        }
    }

    public C97642b(Context context) {
    }

    /* renamed from: U5 */
    public void mo79064U5(boolean z, RecordMediaReportInfo recordMediaReportInfo, Bundle bundle) {
    }

    /* renamed from: i2 */
    public void mo4197i2(Context context, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel, Bundle bundle) {
        LayoutInflater.from(context);
        C77407n nVar = new C77407n(context, 1, false);
        C76874e0 e0Var = new C76874e0(context);
        new C76874e0(context);
        C97643a aVar = new C97643a(this, context);
        C97644b bVar = new C97644b(context, captureVideoNormalModel);
        e0Var.clear();
        C76874e0 e0Var2 = new C76874e0(context);
        aVar.onCreateMMMenu(e0Var2);
        if (e0Var2.mo107176v()) {
            Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            nVar.f225771i = aVar;
            nVar.f225782p = bVar;
            nVar.f225761d = null;
            nVar.f225725D = null;
            nVar.mo107573q();
        }
        C76879j.m92730a(context, (Dialog) null);
    }

    /* renamed from: l1 */
    public boolean mo4198l1(Context context, Bundle bundle, CaptureDataManager.C94402a aVar) {
        return false;
    }
}
